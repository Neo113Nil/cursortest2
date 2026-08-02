package t1;

import A5.u;
import F.G;
import F.H;
import G.h;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q5.AbstractActivityC1559c;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16275a;

    /* renamed from: b, reason: collision with root package name */
    public C1604a f16276b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC1559c f16277c;

    /* renamed from: d, reason: collision with root package name */
    public int f16278d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f16279e;

    public c(Context context) {
        this.f16275a = context;
    }

    public final int a(int i7) {
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i8 = 0;
        Context context = this.f16275a;
        if (i7 == 17) {
            if (Build.VERSION.SDK_INT < 33) {
                return G.a(new H(context).f2425a) ? 1 : 0;
            }
            if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                return 1;
            }
            return p6.c.b(this.f16277c, "android.permission.POST_NOTIFICATIONS");
        }
        if (i7 == 21) {
            ArrayList e7 = p6.c.e(21, context);
            if (e7 != null && !e7.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i7 == 30 || i7 == 28 || i7 == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList e8 = p6.c.e(21, context);
            if (e8 != null && !e8.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i7 == 37 || i7 == 0) && !b()) {
            return 0;
        }
        ArrayList e9 = p6.c.e(i7, context);
        if (e9 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i7);
            return 1;
        }
        if (e9.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + e9 + i7);
            return (i7 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            Iterator it = e9.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i7 == 16) {
                    String packageName = context.getPackageName();
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        hashSet.add(Integer.valueOf(i8));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i7 == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        hashSet.add(2);
                    }
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                } else if (i7 == 23) {
                    hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                } else if (i7 == 24) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                        hashSet.add(Integer.valueOf(canRequestPackageInstalls ? 1 : 0));
                    }
                } else if (i7 == 27) {
                    hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                } else if (i7 == 34) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                        hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i7 == 9 || i7 == 32) {
                    int checkSelfPermission = h.checkSelfPermission(context, str);
                    if ((Build.VERSION.SDK_INT >= 34 ? h.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : checkSelfPermission) == 0 && checkSelfPermission == -1) {
                        hashSet.add(3);
                    } else if (checkSelfPermission == 0) {
                        hashSet.add(1);
                    } else {
                        hashSet.add(Integer.valueOf(p6.c.b(this.f16277c, str)));
                    }
                } else if (h.checkSelfPermission(context, str) != 0) {
                    hashSet.add(Integer.valueOf(p6.c.b(this.f16277c, str)));
                }
                i8 = 0;
            }
            if (!hashSet.isEmpty()) {
                return p6.c.l(hashSet).intValue();
            }
        }
        return 1;
    }

    public final boolean b() {
        ArrayList e7 = p6.c.e(37, this.f16275a);
        boolean z4 = e7 != null && e7.contains("android.permission.WRITE_CALENDAR");
        boolean z7 = e7 != null && e7.contains("android.permission.READ_CALENDAR");
        if (z4 && z7) {
            return true;
        }
        if (!z4) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z7) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void c(int i7, String str) {
        if (this.f16277c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f16277c.getPackageName()));
        }
        this.f16277c.startActivityForResult(intent, i7);
        this.f16278d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // A5.u
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        boolean z4;
        int i9;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i10;
        AbstractActivityC1559c abstractActivityC1559c = this.f16277c;
        boolean z7 = false;
        z7 = false;
        if (abstractActivityC1559c == null) {
            return false;
        }
        if (this.f16279e == null) {
            this.f16278d = 0;
            return false;
        }
        if (i7 == 209) {
            Context context = this.f16275a;
            String packageName = context.getPackageName();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z7 = true;
            }
            i9 = 16;
            i10 = z7;
        } else if (i7 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            isExternalStorageManager = Environment.isExternalStorageManager();
            i9 = 22;
            i10 = isExternalStorageManager;
        } else if (i7 == 211) {
            i9 = 23;
            i10 = Settings.canDrawOverlays(abstractActivityC1559c);
        } else if (i7 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            canRequestPackageInstalls = abstractActivityC1559c.getPackageManager().canRequestPackageInstalls();
            i9 = 24;
            i10 = canRequestPackageInstalls;
        } else if (i7 == 213) {
            i9 = 27;
            i10 = ((NotificationManager) abstractActivityC1559c.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i7 != 214) {
                return false;
            }
            AlarmManager alarmManager = (AlarmManager) abstractActivityC1559c.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 31) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                z4 = canScheduleExactAlarms;
            } else {
                z4 = true;
            }
            i9 = 34;
            i10 = z4;
        }
        this.f16279e.put(Integer.valueOf(i9), Integer.valueOf(i10));
        int i11 = this.f16278d - 1;
        this.f16278d = i11;
        C1604a c1604a = this.f16276b;
        if (c1604a != null && i11 == 0) {
            c1604a.f16271a.success(this.f16279e);
        }
        return true;
    }
}
