package com.paypal.oslo.feature.activity.ui.detail.model.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "formatArgs", "", "resolveString", "(Ljava/lang/Integer;[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StringResourceExtensionsKt {
    public static final java.lang.String resolveString(java.lang.Integer num, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        composer.startReplaceGroup(464007343);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(464007343, i, -1, "com.paypal.oslo.feature.activity.ui.detail.model.extensions.resolveString (StringResourceExtensions.kt:25)");
        }
        if (num != null) {
            composer.startReplaceGroup(2038079991);
            if (objArr.length == 0) {
                composer.startReplaceGroup(2038119175);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(num.intValue(), composer, i & 14);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2038169178);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(num.intValue(), java.util.Arrays.copyOf(objArr, objArr.length), composer, i & 14);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return stringResource;
        }
        composer.startReplaceGroup(2038229907);
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return "";
    }
}
