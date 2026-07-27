package com.onesignal.core.internal.language.impl;

import java.util.Locale;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LanguageProviderDevice {
    private static final String CHINESE = "zh";
    public static final Companion Companion = new Companion(null);
    private static final String HEBREW_CORRECTED = "he";
    private static final String HEBREW_INCORRECT = "iw";
    private static final String INDONESIAN_CORRECTED = "id";
    private static final String INDONESIAN_INCORRECT = "in";
    private static final String YIDDISH_CORRECTED = "yi";
    private static final String YIDDISH_INCORRECT = "ji";

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public final String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        if (language != null) {
            int hashCode = language.hashCode();
            if (hashCode != 3365) {
                if (hashCode != 3374) {
                    if (hashCode != 3391) {
                        if (hashCode == 3886 && language.equals(CHINESE)) {
                            return language + '-' + Locale.getDefault().getCountry();
                        }
                    } else if (language.equals(YIDDISH_INCORRECT)) {
                        return YIDDISH_CORRECTED;
                    }
                } else if (language.equals(HEBREW_INCORRECT)) {
                    return HEBREW_CORRECTED;
                }
            } else if (language.equals(INDONESIAN_INCORRECT)) {
                return "id";
            }
        }
        i.b(language);
        return language;
    }
}
