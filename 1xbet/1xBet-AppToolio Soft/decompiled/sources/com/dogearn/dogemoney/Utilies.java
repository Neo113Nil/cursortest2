package com.dogearn.dogemoney;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.support.design.widget.Snackbar;
import android.view.View;

/* loaded from: classes.dex */
public class Utilies {
    public static void showToast(String str, View view) {
        Snackbar.make(view, "" + str + "\n\n", 0).show();
    }

    public static boolean checkInternet(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) ? false : true;
    }

    public static void showAlertDialogue(String str, String str2, Context context) {
        AlertDialog create = new AlertDialog.Builder(context).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setCanceledOnTouchOutside(false);
        create.setButton(-1, "Ok", new DialogInterface.OnClickListener() { // from class: com.dogearn.dogemoney.Utilies.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    public static String getDeviceID(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String fixMobileNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                return "+880" + str.substring(i, str.length());
            }
        }
        return "";
    }
}
