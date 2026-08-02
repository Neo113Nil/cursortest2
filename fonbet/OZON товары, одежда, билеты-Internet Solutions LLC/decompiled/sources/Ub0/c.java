package Ub0;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.Configuration;
import androidx.core.os.i;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f27527a;

    public c(@NotNull b provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f27527a = provider;
    }

    @NotNull
    public static String c() {
        Locale build;
        i d11 = i.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getDefault(...)");
        ArrayList arrayList = new ArrayList();
        int g10 = d11.g();
        for (int i11 = 0; i11 < g10; i11++) {
            Locale c11 = d11.c(i11);
            if (c11 != null && (build = new Locale.Builder().setLanguage(c11.getLanguage()).setScript(c11.getScript()).build()) != null) {
                String languageTag = build.toLanguageTag();
                Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
                arrayList.add(languageTag);
            }
        }
        return C7714v.V(arrayList, "|", null, null, null, 62);
    }

    @NotNull
    public final Context a(@NotNull Context baseContext) {
        d localeProvider$lambda$1;
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        localeProvider$lambda$1 = Limb2PluginProvidersModule.getLocaleProvider$lambda$1((InterfaceC4008j) ((BY.b) this.f27527a).f3307a);
        Locale d11 = localeProvider$lambda$1.d();
        Configuration configuration = new Configuration(baseContext.getResources().getConfiguration());
        configuration.setLocale(d11);
        Context createConfigurationContext = baseContext.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    @NotNull
    public final String b() {
        d localeProvider$lambda$1;
        localeProvider$lambda$1 = Limb2PluginProvidersModule.getLocaleProvider$lambda$1((InterfaceC4008j) ((BY.b) this.f27527a).f3307a);
        return localeProvider$lambda$1.b();
    }
}
