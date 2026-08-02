package com.baseflow.permissionhandler;

import android.app.Activity;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b implements MethodChannel.MethodCallHandler {
    public final Context a;
    public final d b;

    public b(Context context, a aVar, d dVar, j jVar) {
        this.a = context;
        this.b = dVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
        int i;
        boolean isLocationEnabled;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        int i2 = 1;
        String str = methodCall.method;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c = 4;
                    break;
                }
                break;
        }
        Context context = this.a;
        d dVar = this.b;
        switch (c) {
            case 0:
                int parseInt = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                if (context == null) {
                    result.error("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                    break;
                } else if (parseInt != 3 && parseInt != 4 && parseInt != 5) {
                    if (parseInt == 21) {
                        result.success(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                        break;
                    } else if (parseInt == 8) {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager.hasSystemFeature("android.hardware.telephony")) {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager != null && telephonyManager.getPhoneType() != 0) {
                                Intent intent = new Intent("android.intent.action.CALL");
                                intent.setData(Uri.parse("tel:123123"));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    of = PackageManager.ResolveInfoFlags.of(0L);
                                    queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                                } else {
                                    queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                                }
                                if (queryIntentActivities.isEmpty()) {
                                    result.success(2);
                                    break;
                                } else if (telephonyManager.getSimState() != 5) {
                                    result.success(0);
                                    break;
                                } else {
                                    result.success(1);
                                    break;
                                }
                            } else {
                                result.success(2);
                                break;
                            }
                        } else {
                            result.success(2);
                            break;
                        }
                    } else if (parseInt == 16) {
                        result.success(1);
                        break;
                    } else {
                        result.success(2);
                        break;
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 28) {
                        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                        if (locationManager != null) {
                            isLocationEnabled = locationManager.isLocationEnabled();
                            i = isLocationEnabled;
                        }
                        i = 0;
                    } else {
                        try {
                            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                                i = 1;
                            }
                        } catch (Settings.SettingNotFoundException e) {
                            e.printStackTrace();
                        }
                        i = 0;
                    }
                    result.success(Integer.valueOf(i));
                    break;
                }
                break;
            case 1:
                int parseInt2 = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                Activity activity = dVar.c;
                if (activity == null) {
                    result.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                } else {
                    ArrayList c2 = g.c(activity, parseInt2);
                    if (c2 == null) {
                        result.success(Boolean.FALSE);
                        break;
                    } else if (c2.isEmpty()) {
                        result.success(Boolean.FALSE);
                        break;
                    } else {
                        result.success(Boolean.valueOf(ActivityCompat.shouldShowRequestPermissionRationale(dVar.c, (String) c2.get(0))));
                        break;
                    }
                }
            case 2:
                int parseInt3 = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                result.success(Integer.valueOf(dVar.a(parseInt3)));
                break;
            case 3:
                Objects.requireNonNull(result);
                if (context == null) {
                    result.error("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                    break;
                } else {
                    try {
                        Intent intent2 = new Intent();
                        intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent2.addCategory("android.intent.category.DEFAULT");
                        intent2.setData(Uri.parse("package:" + context.getPackageName()));
                        intent2.addFlags(268435456);
                        intent2.addFlags(1073741824);
                        intent2.addFlags(8388608);
                        context.startActivity(intent2);
                        result.success(Boolean.TRUE);
                        break;
                    } catch (Exception unused) {
                        result.success(Boolean.FALSE);
                        return;
                    }
                }
            case 4:
                List<Integer> list = (List) methodCall.arguments();
                Objects.requireNonNull(result);
                androidx.window.embedding.d dVar2 = new androidx.window.embedding.d(result, 1);
                if (dVar.d > 0) {
                    result.error("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                    break;
                } else if (dVar.c == null) {
                    result.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                } else {
                    dVar.b = dVar2;
                    dVar.e = new HashMap();
                    dVar.d = 0;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        if (dVar.a(num.intValue()) != i2) {
                            ArrayList c3 = g.c(dVar.c, num.intValue());
                            if (c3 != null && !c3.isEmpty()) {
                                int i3 = Build.VERSION.SDK_INT;
                                if (num.intValue() == 16) {
                                    dVar.c(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                } else if (i3 >= 30 && num.intValue() == 22) {
                                    dVar.c(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                } else if (num.intValue() == 23) {
                                    dVar.c(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                } else if (i3 >= 26 && num.intValue() == 24) {
                                    dVar.c(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                } else if (num.intValue() == 27) {
                                    dVar.c(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                } else if (i3 >= 31 && num.intValue() == 34) {
                                    dVar.c(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                } else if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(c3);
                                    dVar.d = c3.size() + dVar.d;
                                } else if (dVar.b()) {
                                    arrayList.add("android.permission.WRITE_CALENDAR");
                                    arrayList.add("android.permission.READ_CALENDAR");
                                    dVar.d += 2;
                                } else {
                                    dVar.e.put(num, 0);
                                }
                            } else if (!dVar.e.containsKey(num)) {
                                dVar.e.put(num, 0);
                                if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                    dVar.e.put(num, 0);
                                } else {
                                    dVar.e.put(num, 2);
                                }
                            }
                            i2 = 1;
                        } else if (!dVar.e.containsKey(num)) {
                            dVar.e.put(num, 1);
                        }
                    }
                    if (arrayList.size() > 0) {
                        ActivityCompat.requestPermissions(dVar.c, (String[]) arrayList.toArray(new String[0]), 24);
                    }
                    androidx.window.embedding.d dVar3 = dVar.b;
                    if (dVar3 != null && dVar.d == 0) {
                        ((MethodChannel.Result) dVar3.b).success(dVar.e);
                        break;
                    }
                }
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
