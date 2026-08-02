package io.flutter.plugin.localization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.browseractions.a;
import androidx.core.app.i;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class LocalizationPlugin {

    @NonNull
    private final Context context;

    @NonNull
    private final LocalizationChannel localizationChannel;

    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    @VisibleForTesting
    final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    public LocalizationPlugin(@NonNull Context context, @NonNull LocalizationChannel localizationChannel) {
        LocalizationChannel.LocalizationMessageHandler localizationMessageHandler = new LocalizationChannel.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
            public String getStringResource(@NonNull String str, @Nullable String str2) {
                Context context2 = LocalizationPlugin.this.context;
                if (str2 != null) {
                    Locale localeFromString = LocalizationPlugin.localeFromString(str2);
                    Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeFromString);
                    context2 = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = context2.getResources().getIdentifier(str, "string", LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return context2.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = localizationMessageHandler;
        this.context = context;
        this.localizationChannel = localizationChannel;
        localizationChannel.setLocalizationMessageHandler(localizationMessageHandler);
    }

    @NonNull
    public static Locale localeFromString(@NonNull String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            builder.setRegion(split[i]);
        }
        return builder.build();
    }

    @Nullable
    public Locale resolveNativeLocale(@Nullable List<Locale> list) {
        Locale lookup;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                Locale locale = locales.get(i);
                for (Locale locale2 : list) {
                    if (locale.equals(locale2)) {
                        return locale2;
                    }
                }
                for (Locale locale3 : list) {
                    if (locale.getLanguage().equals(locale3.toLanguageTag())) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale.getLanguage().equals(locale4.getLanguage())) {
                        return locale4;
                    }
                }
            }
            return list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales2 = this.context.getResources().getConfiguration().getLocales();
        int size = locales2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Locale locale5 = locales2.get(i2);
            String language = locale5.getLanguage();
            if (!locale5.getScript().isEmpty()) {
                StringBuilder d = a.d(language, "-");
                d.append(locale5.getScript());
                language = d.toString();
            }
            if (!locale5.getCountry().isEmpty()) {
                StringBuilder d2 = a.d(language, "-");
                d2.append(locale5.getCountry());
                language = d2.toString();
            }
            arrayList.add(i.c(language));
            io.flutter.embedding.android.a.c();
            arrayList.add(i.c(locale5.getLanguage()));
            io.flutter.embedding.android.a.c();
            arrayList.add(i.c(locale5.getLanguage() + "-*"));
        }
        lookup = Locale.lookup(arrayList, list);
        return lookup != null ? lookup : list.get(0);
    }

    public void sendLocalesToFlutter(@NonNull Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        this.localizationChannel.sendLocales(arrayList);
    }
}
