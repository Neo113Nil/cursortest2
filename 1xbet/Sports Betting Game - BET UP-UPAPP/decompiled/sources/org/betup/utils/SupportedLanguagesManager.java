package org.betup.utils;

import android.content.Context;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.lang.Character;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.betup.services.LocaleService;

/* loaded from: classes4.dex */
public final class SupportedLanguagesManager {
    private static final String defaultLanguage = "en";
    private static final List<String> langs9groups = Arrays.asList("en", "ru", "ro", "es", "it", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "de", "fr", "tr", "hi", "ar");
    private static final List<String> langs4groups = Arrays.asList("en", "ru", "ro", "es");
    private static final List<String> langs2groups = Arrays.asList("en", "ru");
    private static final List<String> lang1group = Arrays.asList("en");

    public enum LangTypeGroup {
        BIG_9,
        DEFAULT_4,
        SMALL_2,
        SINGLE
    }

    private SupportedLanguagesManager() {
    }

    public static String getSupportedLanguage(LangTypeGroup typeGroup) {
        List<String> group = getGroup(typeGroup);
        String language = Locale.getDefault().getLanguage();
        try {
            if (language.equals("uk") && group.contains("ru")) {
                return "ru";
            }
            return group.contains(language) ? language : "en";
        } catch (Exception e) {
            e.printStackTrace();
            return "en";
        }
    }

    public static String getSupportedLanguage(Context context, LangTypeGroup typeGroup) {
        if (context == null) {
            return getSupportedLanguage(typeGroup);
        }
        List<String> group = getGroup(typeGroup);
        String language = LocaleService.getLanguage(context);
        try {
            if (language.equals("uk") && group.contains("ru")) {
                return "ru";
            }
            return group.contains(language) ? language : "en";
        } catch (Exception e) {
            e.printStackTrace();
            return "en";
        }
    }

    public static String getLanguageByString(String text) {
        if (text != null && text.length() != 0) {
            for (int i = 0; i < text.length(); i++) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(text.charAt(i));
                if (of != null && of.equals(Character.UnicodeBlock.CYRILLIC)) {
                    return "ru";
                }
            }
        }
        return "en";
    }

    /* renamed from: org.betup.utils.SupportedLanguagesManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$utils$SupportedLanguagesManager$LangTypeGroup;

        static {
            int[] iArr = new int[LangTypeGroup.values().length];
            $SwitchMap$org$betup$utils$SupportedLanguagesManager$LangTypeGroup = iArr;
            try {
                iArr[LangTypeGroup.BIG_9.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$utils$SupportedLanguagesManager$LangTypeGroup[LangTypeGroup.DEFAULT_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$utils$SupportedLanguagesManager$LangTypeGroup[LangTypeGroup.SINGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$utils$SupportedLanguagesManager$LangTypeGroup[LangTypeGroup.SMALL_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static List<String> getGroup(LangTypeGroup group) {
        int i = AnonymousClass1.$SwitchMap$org$betup$utils$SupportedLanguagesManager$LangTypeGroup[group.ordinal()];
        if (i == 1) {
            return langs9groups;
        }
        if (i == 2) {
            return langs4groups;
        }
        if (i == 3) {
            return lang1group;
        }
        return langs2groups;
    }

    public static String getDefaultLanguage() {
        return "en";
    }
}
