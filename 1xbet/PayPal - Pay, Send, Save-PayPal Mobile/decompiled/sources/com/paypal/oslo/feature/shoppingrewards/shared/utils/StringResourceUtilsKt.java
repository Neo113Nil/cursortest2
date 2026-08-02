package com.paypal.oslo.feature.shoppingrewards.shared.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "singularStringResourceId", "otherStringResourceId", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "", "formatArgs", "", "resolveSingularOrOtherStringResource", "(III[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StringResourceUtilsKt {
    public static final java.lang.String resolveSingularOrOtherStringResource(int i, int i2, int i3, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1770263783, i4, -1, "com.paypal.oslo.feature.shoppingrewards.shared.utils.resolveSingularOrOtherStringResource (StringResourceUtils.kt:26)");
        }
        composer.startReplaceGroup(-416436894);
        if (i3 != 1) {
            i = i2;
        }
        java.lang.String string = ((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
        composer.endReplaceGroup();
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return string;
    }
}
