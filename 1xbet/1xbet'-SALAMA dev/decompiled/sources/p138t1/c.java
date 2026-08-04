package p138t1;

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

/* JADX INFO: loaded from: classes.dex */
public final class c implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f16282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p121q5.c f16283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f16285e;

    public c(Context context) {
        this.f16281a = context;
    }

    public final int a(int i7) {
        int i8 = 0;
        Context context = this.f16281a;
        if (i7 == 17) {
            if (Build.VERSION.SDK_INT < 33) {
                return G.a(new H(context).f2425a) ? 1 : 0;
            }
            if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                return 1;
            }
            return p115p6.c.b(this.f16283c, "android.permission.POST_NOTIFICATIONS");
        }
        if (i7 == 21) {
            ArrayList arrayListE = p115p6.c.e(21, context);
            if (arrayListE != null && !arrayListE.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i7 == 30 || i7 == 28 || i7 == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList arrayListE2 = p115p6.c.e(21, context);
            if (arrayListE2 != null && !arrayListE2.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        if ((i7 == 37 || i7 == 0) && !b()) {
            return 0;
        }
        ArrayList<String> arrayListE3 = p115p6.c.e(i7, context);
        if (arrayListE3 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i7);
            return 1;
        }
        if (arrayListE3.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + arrayListE3 + i7);
            return (i7 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            for (String str : arrayListE3) {
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
                    hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                } else if (i7 == 23) {
                    hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                } else if (i7 == 24) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        hashSet.add(Integer.valueOf(context.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                    }
                } else if (i7 == 27) {
                    hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                } else if (i7 == 34) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        hashSet.add(Integer.valueOf(((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i7 == 9 || i7 == 32) {
                    int iCheckSelfPermission = h.checkSelfPermission(context, str);
                    if ((Build.VERSION.SDK_INT >= 34 ? h.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : iCheckSelfPermission) == 0 && iCheckSelfPermission == -1) {
                        hashSet.add(3);
                    } else if (iCheckSelfPermission == 0) {
                        hashSet.add(1);
                    } else {
                        hashSet.add(Integer.valueOf(p115p6.c.b(this.f16283c, str)));
                    }
                } else if (h.checkSelfPermission(context, str) != 0) {
                    hashSet.add(Integer.valueOf(p115p6.c.b(this.f16283c, str)));
                }
                i8 = 0;
            }
            if (!hashSet.isEmpty()) {
                return p115p6.c.l(hashSet).intValue();
            }
        }
        return 1;
    }

    public final boolean b() {
        ArrayList arrayListE = p115p6.c.e(37, this.f16281a);
        boolean z4 = arrayListE != null && arrayListE.contains("android.permission.WRITE_CALENDAR");
        boolean z7 = arrayListE != null && arrayListE.contains("android.permission.READ_CALENDAR");
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
        if (this.f16283c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f16283c.getPackageName()));
        }
        this.f16283c.startActivityForResult(intent, i7);
        this.f16284d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // A5.u
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        int i9;
        int iCanScheduleExactAlarms;
        p121q5.c cVar = this.f16283c;
        boolean z4 = false;
        z4 = false;
        if (cVar == null) {
            return false;
        }
        if (this.f16285e == null) {
            this.f16284d = 0;
            return false;
        }
        if (i7 == 209) {
            Context context = this.f16281a;
            String packageName = context.getPackageName();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z4 = true;
            }
            i9 = 16;
            iCanScheduleExactAlarms = z4;
        } else if (i7 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            i9 = 22;
            iCanScheduleExactAlarms = Environment.isExternalStorageManager();
        } else if (i7 == 211) {
            i9 = 23;
            iCanScheduleExactAlarms = Settings.canDrawOverlays(cVar);
        } else if (i7 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            i9 = 24;
            iCanScheduleExactAlarms = cVar.getPackageManager().canRequestPackageInstalls();
        } else if (i7 == 213) {
            i9 = 27;
            iCanScheduleExactAlarms = ((NotificationManager) cVar.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i7 != 214) {
                return false;
            }
            i9 = 34;
            iCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? ((AlarmManager) cVar.getSystemService("alarm")).canScheduleExactAlarms() : true;
        }
        this.f16285e.put(Integer.valueOf(i9), Integer.valueOf(iCanScheduleExactAlarms));
        int i10 = this.f16284d - 1;
        this.f16284d = i10;
        a aVar = this.f16282b;
        if (aVar != null && i10 == 0) {
            aVar.f16277a.success(this.f16285e);
        }
        return true;
    }
}
