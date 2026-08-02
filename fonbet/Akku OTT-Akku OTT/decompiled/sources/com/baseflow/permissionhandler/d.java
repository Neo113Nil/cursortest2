package com.baseflow.permissionhandler;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    @NonNull
    public final Context a;

    @Nullable
    public androidx.window.embedding.d b;

    @Nullable
    public Activity c;
    public int d;
    public HashMap e;

    public d(@NonNull Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (androidx.core.app.NotificationManagerCompat.from(r6).areNotificationsEnabled() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i) {
        int i2;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i3 = 1;
        Context context = this.a;
        if (i == 17) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    return g.b(this.c, "android.permission.POST_NOTIFICATIONS");
                }
            }
            return 1;
        }
        if (i == 21) {
            ArrayList c = g.c(context, 21);
            return (c == null || c.isEmpty()) ? 0 : 1;
        }
        if ((i == 30 || i == 28 || i == 29) && Build.VERSION.SDK_INT < 31) {
            ArrayList c2 = g.c(context, 21);
            return (c2 == null || c2.isEmpty()) ? 0 : 1;
        }
        if ((i != 37 && i != 0) || b()) {
            ArrayList c3 = g.c(context, i);
            if (c3 != null) {
                if (c3.size() == 0) {
                    c3.toString();
                    if (i == 22 && Build.VERSION.SDK_INT < 30) {
                        return 2;
                    }
                } else if (context.getApplicationInfo().targetSdkVersion >= 23) {
                    HashSet hashSet = new HashSet();
                    Iterator it = c3.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (i == 16) {
                            String packageName = context.getPackageName();
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                                hashSet.add(0);
                            } else {
                                hashSet.add(1);
                            }
                        } else if (i == 22) {
                            if (Build.VERSION.SDK_INT < 30) {
                                hashSet.add(2);
                            }
                            isExternalStorageManager = Environment.isExternalStorageManager();
                            hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                        } else if (i == 23) {
                            hashSet.add(Integer.valueOf(Settings.canDrawOverlays(context) ? 1 : 0));
                        } else if (i == 24) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                                hashSet.add(Integer.valueOf(canRequestPackageInstalls ? 1 : 0));
                            }
                        } else if (i == 27) {
                            hashSet.add(Integer.valueOf(((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                        } else if (i == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                canScheduleExactAlarms = ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).canScheduleExactAlarms();
                                hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                            } else {
                                hashSet.add(1);
                            }
                        } else if (i == 9 || i == 32) {
                            int checkSelfPermission = ContextCompat.checkSelfPermission(context, str);
                            i2 = i3;
                            if ((Build.VERSION.SDK_INT >= 34 ? ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : checkSelfPermission) == 0 && checkSelfPermission == -1) {
                                hashSet.add(3);
                            } else if (checkSelfPermission == 0) {
                                hashSet.add(1);
                            } else {
                                hashSet.add(Integer.valueOf(g.b(this.c, str)));
                            }
                            i3 = i2;
                        } else if (ContextCompat.checkSelfPermission(context, str) != 0) {
                            hashSet.add(Integer.valueOf(g.b(this.c, str)));
                        }
                        i2 = i3;
                        i3 = i2;
                    }
                    return !hashSet.isEmpty() ? g.e(hashSet).intValue() : i3;
                }
            }
            return 1;
        }
        return 0;
    }

    public final boolean b() {
        ArrayList c = g.c(this.a, 37);
        return (c != null && c.contains("android.permission.WRITE_CALENDAR")) && (c != null && c.contains("android.permission.READ_CALENDAR"));
    }

    public final void c(int i, String str) {
        if (this.c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.c.getPackageName()));
        }
        this.c.startActivityForResult(intent, i);
        this.d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i4;
        Activity activity = this.c;
        boolean z2 = false;
        z2 = false;
        if (activity != null) {
            if (this.e == null) {
                this.d = 0;
                return false;
            }
            if (i == 209) {
                Context context = this.a;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    z2 = true;
                }
                i3 = 16;
                i4 = z2;
            } else if (i == 210) {
                if (Build.VERSION.SDK_INT >= 30) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    i3 = 22;
                    i4 = isExternalStorageManager;
                }
            } else if (i == 211) {
                i3 = 23;
                i4 = Settings.canDrawOverlays(activity);
            } else if (i == 212) {
                if (Build.VERSION.SDK_INT >= 26) {
                    canRequestPackageInstalls = activity.getPackageManager().canRequestPackageInstalls();
                    i3 = 24;
                    i4 = canRequestPackageInstalls;
                }
            } else if (i == 213) {
                i3 = 27;
                i4 = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
            } else if (i == 214) {
                AlarmManager alarmManager = (AlarmManager) activity.getSystemService(NotificationCompat.CATEGORY_ALARM);
                if (Build.VERSION.SDK_INT >= 31) {
                    canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                    z = canScheduleExactAlarms;
                } else {
                    z = true;
                }
                i3 = 34;
                i4 = z;
            }
            this.e.put(Integer.valueOf(i3), Integer.valueOf(i4));
            int i5 = this.d - 1;
            this.d = i5;
            androidx.window.embedding.d dVar = this.b;
            if (dVar != null && i5 == 0) {
                ((MethodChannel.Result) dVar.b).success(this.e);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int i2;
        int i3 = 8;
        if (i != 24) {
            this.d = 0;
            return false;
        }
        if (this.e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            this.d = 0;
            return false;
        }
        List asList = Arrays.asList(strArr);
        int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
        if (indexOf >= 0) {
            int f = g.f(this.c, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
            this.e.put(36, Integer.valueOf(f));
            int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
            if (indexOf2 >= 0) {
                int f2 = g.f(this.c, "android.permission.READ_CALENDAR", iArr[indexOf2]);
                Integer valueOf = Integer.valueOf(f);
                Integer valueOf2 = Integer.valueOf(f2);
                HashSet hashSet = new HashSet();
                hashSet.add(valueOf);
                hashSet.add(valueOf2);
                Integer e = g.e(hashSet);
                this.e.put(37, e);
                this.e.put(0, e);
            }
        }
        int i4 = 0;
        while (i4 < strArr.length) {
            String str = strArr[i4];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                int i5 = -1;
                switch (str.hashCode()) {
                    case -2062386608:
                        if (str.equals("android.permission.READ_SMS")) {
                            i5 = 0;
                            break;
                        }
                        break;
                    case -1928411001:
                        if (str.equals("android.permission.READ_CALENDAR")) {
                            i5 = 1;
                            break;
                        }
                        break;
                    case -1925850455:
                        if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                            i5 = 2;
                            break;
                        }
                        break;
                    case -1921431796:
                        if (str.equals("android.permission.READ_CALL_LOG")) {
                            i5 = 3;
                            break;
                        }
                        break;
                    case -1888586689:
                        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                            i5 = 4;
                            break;
                        }
                        break;
                    case -1813079487:
                        if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                            i5 = 5;
                            break;
                        }
                        break;
                    case -1783097621:
                        if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                            i5 = 6;
                            break;
                        }
                        break;
                    case -1561629405:
                        if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                            i5 = 7;
                            break;
                        }
                        break;
                    case -1479758289:
                        if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                            i5 = i3;
                            break;
                        }
                        break;
                    case -1238066820:
                        if (str.equals("android.permission.BODY_SENSORS")) {
                            i5 = 9;
                            break;
                        }
                        break;
                    case -1164582768:
                        if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                            i5 = 10;
                            break;
                        }
                        break;
                    case -909527021:
                        if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                            i5 = 11;
                            break;
                        }
                        break;
                    case -895679497:
                        if (str.equals("android.permission.RECEIVE_MMS")) {
                            i5 = 12;
                            break;
                        }
                        break;
                    case -895673731:
                        if (str.equals("android.permission.RECEIVE_SMS")) {
                            i5 = 13;
                            break;
                        }
                        break;
                    case -798669607:
                        if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                            i5 = 14;
                            break;
                        }
                        break;
                    case -406040016:
                        if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                            i5 = 15;
                            break;
                        }
                        break;
                    case -63024214:
                        if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                            i5 = 16;
                            break;
                        }
                        break;
                    case -5573545:
                        if (str.equals("android.permission.READ_PHONE_STATE")) {
                            i5 = 17;
                            break;
                        }
                        break;
                    case 52602690:
                        if (str.equals("android.permission.SEND_SMS")) {
                            i5 = 18;
                            break;
                        }
                        break;
                    case 112197485:
                        if (str.equals("android.permission.CALL_PHONE")) {
                            i5 = 19;
                            break;
                        }
                        break;
                    case 175802396:
                        if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                            i5 = 20;
                            break;
                        }
                        break;
                    case 214526995:
                        if (str.equals("android.permission.WRITE_CONTACTS")) {
                            i5 = 21;
                            break;
                        }
                        break;
                    case 361658321:
                        if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                            i5 = 22;
                            break;
                        }
                        break;
                    case 463403621:
                        if (str.equals("android.permission.CAMERA")) {
                            i5 = 23;
                            break;
                        }
                        break;
                    case 603653886:
                        if (str.equals("android.permission.WRITE_CALENDAR")) {
                            i5 = 24;
                            break;
                        }
                        break;
                    case 610633091:
                        if (str.equals("android.permission.WRITE_CALL_LOG")) {
                            i5 = 25;
                            break;
                        }
                        break;
                    case 691260818:
                        if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                            i5 = 26;
                            break;
                        }
                        break;
                    case 710297143:
                        if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                            i5 = 27;
                            break;
                        }
                        break;
                    case 784519842:
                        if (str.equals("android.permission.USE_SIP")) {
                            i5 = 28;
                            break;
                        }
                        break;
                    case 970694249:
                        if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                            i5 = 29;
                            break;
                        }
                        break;
                    case 1166454870:
                        if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                            i5 = 30;
                            break;
                        }
                        break;
                    case 1271781903:
                        if (str.equals("android.permission.GET_ACCOUNTS")) {
                            i5 = 31;
                            break;
                        }
                        break;
                    case 1365911975:
                        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            i5 = 32;
                            break;
                        }
                        break;
                    case 1777263169:
                        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                            i5 = 33;
                            break;
                        }
                        break;
                    case 1780337063:
                        if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                            i5 = 34;
                            break;
                        }
                        break;
                    case 1831139720:
                        if (str.equals("android.permission.RECORD_AUDIO")) {
                            i5 = 35;
                            break;
                        }
                        break;
                    case 1977429404:
                        if (str.equals("android.permission.READ_CONTACTS")) {
                            i5 = 36;
                            break;
                        }
                        break;
                    case 2024715147:
                        if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                            i5 = 37;
                            break;
                        }
                        break;
                    case 2062356686:
                        if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                            i5 = 38;
                            break;
                        }
                        break;
                    case 2114579147:
                        if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                            i5 = 39;
                            break;
                        }
                        break;
                    case 2133799037:
                        if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                            i5 = 40;
                            break;
                        }
                        break;
                }
                switch (i5) {
                    case 0:
                    case 8:
                    case 12:
                    case 13:
                    case 18:
                        i2 = 13;
                        break;
                    case 1:
                    case 24:
                        i2 = 0;
                        break;
                    case 2:
                        i2 = 17;
                        break;
                    case 3:
                    case 10:
                    case 17:
                    case 19:
                    case 25:
                    case 28:
                    case 40:
                        i2 = i3;
                        break;
                    case 4:
                    case 16:
                        i2 = 3;
                        break;
                    case 5:
                        i2 = 22;
                        break;
                    case 6:
                        i2 = 27;
                        break;
                    case 7:
                        i2 = 23;
                        break;
                    case 9:
                        i2 = 12;
                        break;
                    case 11:
                        i2 = 31;
                        break;
                    case 14:
                        i2 = 30;
                        break;
                    case 15:
                    case 32:
                        i2 = 15;
                        break;
                    case 20:
                        i2 = 9;
                        break;
                    case 21:
                    case 31:
                    case 36:
                        i2 = 2;
                        break;
                    case 22:
                        i2 = 35;
                        break;
                    case 23:
                        i2 = 1;
                        break;
                    case 26:
                        i2 = 33;
                        break;
                    case 27:
                        i2 = 32;
                        break;
                    case 29:
                        i2 = 34;
                        break;
                    case 30:
                        i2 = 29;
                        break;
                    case 33:
                        i2 = 24;
                        break;
                    case 34:
                        i2 = 19;
                        break;
                    case 35:
                        i2 = 7;
                        break;
                    case 37:
                        i2 = 4;
                        break;
                    case 38:
                        i2 = 28;
                        break;
                    case 39:
                        i2 = 18;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                if (i2 != 20) {
                    int i6 = iArr[i4];
                    if (i2 == i3) {
                        Integer num = (Integer) this.e.get(8);
                        Integer valueOf3 = Integer.valueOf(g.f(this.c, str, i6));
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(num);
                        hashSet2.add(valueOf3);
                        this.e.put(8, g.e(hashSet2));
                    } else if (i2 == 7) {
                        if (!this.e.containsKey(7)) {
                            this.e.put(7, Integer.valueOf(g.f(this.c, str, i6)));
                        }
                        if (!this.e.containsKey(14)) {
                            this.e.put(14, Integer.valueOf(g.f(this.c, str, i6)));
                        }
                    } else if (i2 == 4) {
                        int f3 = g.f(this.c, str, i6);
                        if (!this.e.containsKey(4)) {
                            this.e.put(4, Integer.valueOf(f3));
                        }
                    } else if (i2 == 3) {
                        int f4 = g.f(this.c, str, i6);
                        if (Build.VERSION.SDK_INT < 29 && !this.e.containsKey(4)) {
                            this.e.put(4, Integer.valueOf(f4));
                        }
                        if (!this.e.containsKey(5)) {
                            this.e.put(5, Integer.valueOf(f4));
                        }
                        this.e.put(Integer.valueOf(i2), Integer.valueOf(f4));
                    } else if (i2 == 9 || i2 == 32) {
                        this.e.put(Integer.valueOf(i2), Integer.valueOf(a(i2)));
                    } else if (!this.e.containsKey(Integer.valueOf(i2))) {
                        this.e.put(Integer.valueOf(i2), Integer.valueOf(g.f(this.c, str, i6)));
                    }
                }
            }
            i4++;
            i3 = 8;
        }
        int length = this.d - iArr.length;
        this.d = length;
        androidx.window.embedding.d dVar = this.b;
        if (dVar != null && length == 0) {
            ((MethodChannel.Result) dVar.b).success(this.e);
        }
        return true;
    }
}
