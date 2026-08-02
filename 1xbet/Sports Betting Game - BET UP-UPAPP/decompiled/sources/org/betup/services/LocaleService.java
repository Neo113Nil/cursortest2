package org.betup.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import androidx.preference.PreferenceManager;
import java.util.Locale;

/* loaded from: classes2.dex */
public class LocaleService {
    private static final String SELECTED_LANGUAGE = "Language.Helper.Selected.Language";

    public static Context onAttach(Context context) {
        return setLanguage(context, getPersistedData(context, Locale.getDefault().getLanguage()));
    }

    public static Context onAttach(Context context, String defaultLanguage) {
        return setLanguage(context, getPersistedData(context, defaultLanguage));
    }

    public static String getLanguage(Context context) {
        return getPersistedData(context, Locale.getDefault().getLanguage());
    }

    public static Context setLanguage(Context context, String language) {
        persist(context, language);
        return updateResources(context, language);
    }

    public static String getPersistedData(Context context, String defaultLanguage) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(SELECTED_LANGUAGE, defaultLanguage);
    }

    private static void persist(Context context, String language) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString(SELECTED_LANGUAGE, language);
        edit.apply();
    }

    private static Context updateResources(Context context, String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        return context.createConfigurationContext(configuration);
    }

    private static Context updateResourcesLegacy(Context context, String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }
}
