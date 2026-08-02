package com.paypal.oslo.feature.businessinventory.ui.common;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/Locale;", "getLocale", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetLocaleKt {
    public static final java.util.Locale getLocale(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-666106088, i, -1, "com.paypal.oslo.feature.businessinventory.ui.common.getLocale (GetLocale.kt:28)");
        }
        java.util.Locale locale = androidx.core.os.ConfigurationCompat.getLocales((android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null && (locale = androidx.core.os.LocaleListCompat.getDefault().get(0)) == null) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return locale;
    }
}
