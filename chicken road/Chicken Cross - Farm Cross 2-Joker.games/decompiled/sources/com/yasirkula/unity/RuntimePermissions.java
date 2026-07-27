package com.yasirkula.unity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes7.dex */
public class RuntimePermissions {
    public static void OpenSettings(Context context) {
        Uri fromParts = Uri.fromParts("package", context.getPackageName(), null);
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        context.startActivity(intent);
    }

    public static String CheckPermission(String[] strArr, Context context) {
        String str = "";
        for (String str2 : strArr) {
            str = str + (context.checkSelfPermission(str2) == 0 ? '1' : '0');
        }
        return str;
    }

    public static void RequestPermission(String[] strArr, Context context, RuntimePermissionsReceiver runtimePermissionsReceiver, String str) {
        String CheckPermission = CheckPermission(strArr, context);
        for (int i = 0; i < strArr.length; i++) {
            if (CheckPermission.charAt(i) == '0' && str.charAt(i) != '0') {
                Bundle bundle = new Bundle();
                bundle.putStringArray(RuntimePermissionsFragment.PERMISSIONS, strArr);
                RuntimePermissionsFragment runtimePermissionsFragment = new RuntimePermissionsFragment(runtimePermissionsReceiver);
                runtimePermissionsFragment.setArguments(bundle);
                ((Activity) context).getFragmentManager().beginTransaction().add(0, runtimePermissionsFragment).commit();
                return;
            }
        }
        runtimePermissionsReceiver.OnPermissionResult(CheckPermission);
    }
}
