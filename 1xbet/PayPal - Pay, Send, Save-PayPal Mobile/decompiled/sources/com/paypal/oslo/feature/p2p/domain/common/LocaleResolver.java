package com.paypal.oslo.feature.p2p.domain.common;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/common/LocaleResolver;", "", "<init>", "()V", "Landroidx/core/os/LocaleListCompat;", "configurationLocales", "Lkotlin/Function0;", "systemDefaultLocales", "Ljava/util/Locale;", "jvmDefaultLocale", "resolve", "(Landroidx/core/os/LocaleListCompat;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/util/Locale;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocaleResolver {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.domain.common.LocaleResolver INSTANCE = new com.paypal.oslo.feature.p2p.domain.common.LocaleResolver();

    private LocaleResolver() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.Locale resolve$default(com.paypal.oslo.feature.p2p.domain.common.LocaleResolver localeResolver, androidx.core.os.LocaleListCompat localeListCompat, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.domain.common.LocaleResolver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.p2p.domain.common.LocaleResolver.$r8$lambda$cYWjPtPJeDoYfwVbDVGMAlZvwLU();
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.domain.common.LocaleResolver$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.p2p.domain.common.LocaleResolver.$r8$lambda$AX2GqiSay8xc7mvWZDvX7WOTwfU();
                }
            };
        }
        return localeResolver.resolve(localeListCompat, function0, function02);
    }

    public final java.util.Locale resolve(androidx.core.os.LocaleListCompat configurationLocales, kotlin.jvm.functions.Function0<androidx.core.os.LocaleListCompat> systemDefaultLocales, kotlin.jvm.functions.Function0<java.util.Locale> jvmDefaultLocale) {
        java.util.Locale locale;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemDefaultLocales, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmDefaultLocale, "");
        if (configurationLocales != null && (locale = configurationLocales.get(0)) != null) {
            return locale;
        }
        java.util.Locale locale2 = systemDefaultLocales.invoke().get(0);
        return locale2 == null ? jvmDefaultLocale.invoke() : locale2;
    }

    public static /* synthetic */ java.util.Locale $r8$lambda$AX2GqiSay8xc7mvWZDvX7WOTwfU() {
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        return locale;
    }

    public static /* synthetic */ androidx.core.os.LocaleListCompat $r8$lambda$cYWjPtPJeDoYfwVbDVGMAlZvwLU() {
        androidx.core.os.LocaleListCompat localeListCompat = androidx.core.os.LocaleListCompat.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localeListCompat, "");
        return localeListCompat;
    }
}
