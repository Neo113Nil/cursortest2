package com.datatheorem.android.trustkit.utils;

/* loaded from: classes8.dex */
public class VendorIdentifier {
    public static java.lang.String getOrCreate(android.content.Context context) {
        android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context);
        java.lang.String string = defaultSharedPreferences.getString("TRUSTKIT_VENDOR_ID", "");
        if (!string.equals("")) {
            return string;
        }
        com.datatheorem.android.trustkit.utils.TrustKitLog.i("Generating new vendor identifier...");
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putString("TRUSTKIT_VENDOR_ID", obj);
        edit.apply();
        return obj;
    }
}
