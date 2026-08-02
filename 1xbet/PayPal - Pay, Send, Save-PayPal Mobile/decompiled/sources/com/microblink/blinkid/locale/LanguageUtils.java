package com.microblink.blinkid.locale;

/* loaded from: classes10.dex */
public class LanguageUtils {
    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.String getHighSpeedVideoSizes;

    public static void setLanguageAndCountry(java.lang.String str, java.lang.String str2, android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("Microblink.prefs", 0);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        getHighResolutionOutputSizeshNQ4ISI = str;
        getHighSpeedVideoSizes = str2;
        if (str == null) {
            java.lang.String string = sharedPreferences.getString("PREFS_LANGUAGE", null);
            getHighResolutionOutputSizeshNQ4ISI = string;
            if (string == null) {
                java.lang.String language = java.util.Locale.getDefault().getLanguage();
                getHighResolutionOutputSizeshNQ4ISI = language;
                edit.putString("PREFS_LANGUAGE", language);
            }
        } else {
            edit.putString("PREFS_LANGUAGE", str);
        }
        java.lang.String str3 = getHighSpeedVideoSizes;
        if (str3 == null) {
            java.lang.String string2 = sharedPreferences.getString("PREFS_COUNTRY", null);
            getHighSpeedVideoSizes = string2;
            if (string2 == null) {
                java.lang.String country = java.util.Locale.getDefault().getCountry();
                getHighSpeedVideoSizes = country;
                edit.putString("PREFS_COUNTRY", country);
            }
        } else {
            edit.putString("PREFS_COUNTRY", str3);
        }
        edit.commit();
        setLanguageConfiguration(context.getResources());
    }

    public static void setLanguageConfiguration(android.content.res.Resources resources) {
        android.content.res.Configuration configuration = resources.getConfiguration();
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
        if (str != null && !str.equals("")) {
            java.lang.String str2 = getHighSpeedVideoSizes;
            if (str2 == null || str2.equals("")) {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.locale.LanguageUtils.class, "Setting language to '{}'", getHighResolutionOutputSizeshNQ4ISI);
                configuration.setLocale(new java.util.Locale(getHighResolutionOutputSizeshNQ4ISI));
            } else {
                com.microblink.blinkid.util.Log.i(com.microblink.blinkid.locale.LanguageUtils.class, "Setting language to '{}', country to '{}'", getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoSizes);
                configuration.setLocale(new java.util.Locale(getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoSizes));
            }
        }
        resources.updateConfiguration(configuration, null);
    }
}
