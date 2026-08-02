package com.paypal.oslo.feature.p2p.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/Locale;", "getLocale", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LocaleUtilsKt {
    public static final java.util.Locale getLocale(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-415629519, i, -1, "com.paypal.oslo.feature.p2p.ui.common.util.getLocale (LocaleUtils.kt:34)");
        }
        androidx.core.os.LocaleListCompat locales = androidx.core.os.ConfigurationCompat.getLocales((android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locales, "");
        java.util.Locale resolve$default = com.paypal.oslo.feature.p2p.domain.common.LocaleResolver.resolve$default(com.paypal.oslo.feature.p2p.domain.common.LocaleResolver.INSTANCE, locales, null, null, 6, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return resolve$default;
    }
}
