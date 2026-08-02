package org.betup.model.local;

import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Locale;
import org.betup.R;

/* loaded from: classes2.dex */
public enum Language {
    RUSSIAN("Русский", "ru", R.drawable.russia),
    SPANISH("Español", "es", R.drawable.spain),
    ROMANIAN("Română", "ro", R.drawable.romania),
    ENGLISH("English", "en", R.drawable.united_kingdom),
    GERMAN("Deutsch", "de", R.drawable.germany),
    PORTUGEESE("Português", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, R.drawable.portugal),
    HINDI("हिन्दी", "hi", R.drawable.hindi),
    FRENCH("Français", "fr", R.drawable.france),
    TURKISH("Türkçe", "tr", R.drawable.turkey),
    ITALIAN("Italiano", "it", R.drawable.italy),
    ARABIC("العربية", "ar", R.drawable.flag_for_flag_saudi_arabia_svgrepo_com);

    private String code;
    private int iconRes;
    private String name;

    Language(String name, String code, int iconRes) {
        this.name = name;
        this.code = code;
        this.iconRes = iconRes;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public int getIconRes() {
        return this.iconRes;
    }

    public static Language getCurrent() {
        String language = Locale.getDefault().getLanguage();
        for (Language language2 : values()) {
            if (language2.getCode().equals(language)) {
                return language2;
            }
        }
        return ENGLISH;
    }
}
