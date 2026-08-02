package com.paypal.oslo.feature.checkcapture.ingo;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;", "buildIngoTheme", "(Landroidx/compose/runtime/Composer;I)Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;", "", "p0", "Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;", "getHighSpeedVideoFpsRanges", "(ZLandroidx/compose/runtime/Composer;)Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;", "Landroidx/compose/ui/graphics/Color;", "", "getHighSpeedVideoSizes", "(JJ)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IngoThemeBuilderKt {
    public static final com.ingo.sdk.kotlin.ux.IngoSdkTheme buildIngoTheme(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1758840321, i, -1, "com.paypal.oslo.feature.checkcapture.ingo.buildIngoTheme (IngoThemeBuilder.kt:32)");
        }
        com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme = new com.ingo.sdk.kotlin.ux.IngoSdkTheme(getHighSpeedVideoFpsRanges(false, composer), getHighSpeedVideoFpsRanges(true, composer));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return ingoSdkTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final com.ingo.sdk.kotlin.ux.IngoSdkColorTheme getHighSpeedVideoFpsRanges(boolean z, androidx.compose.runtime.Composer composer) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1347566713, 6, -1, "com.paypal.oslo.feature.checkcapture.ingo.buildTheme (IngoThemeBuilder.kt:41)");
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.paypal.pds.core.ThemeKt.Theme(z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1008561796, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.checkcapture.ingo.IngoThemeBuilderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.checkcapture.ingo.IngoThemeBuilderKt.$r8$lambda$8j2id95q2QAzVlKrxZkEBjq7yr8(kotlin.jvm.internal.Ref.ObjectRef.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        T t = objectRef.element;
        if (t == 0) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme ingoSdkColorTheme = (com.ingo.sdk.kotlin.ux.IngoSdkColorTheme) t;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return ingoSdkColorTheme;
    }

    private static final java.lang.String getHighSpeedVideoSizes(long j, long j2) {
        long j3;
        if (androidx.compose.ui.graphics.Color.m5998getAlphaimpl(j) < 1.0f) {
            float m5998getAlphaimpl = androidx.compose.ui.graphics.Color.m5998getAlphaimpl(j);
            float f = 1.0f - m5998getAlphaimpl;
            j3 = androidx.compose.ui.graphics.ColorKt.Color$default((androidx.compose.ui.graphics.Color.m6002getRedimpl(j) * m5998getAlphaimpl) + (androidx.compose.ui.graphics.Color.m6002getRedimpl(j2) * f), (androidx.compose.ui.graphics.Color.m6001getGreenimpl(j) * m5998getAlphaimpl) + (androidx.compose.ui.graphics.Color.m6001getGreenimpl(j2) * f), (androidx.compose.ui.graphics.Color.m5999getBlueimpl(j) * m5998getAlphaimpl) + (androidx.compose.ui.graphics.Color.m5999getBlueimpl(j2) * f), 1.0f, null, 16, null);
        } else {
            j3 = j;
        }
        java.lang.String format = java.lang.String.format("#%02X%02X%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.Math.round(androidx.compose.ui.graphics.Color.m6002getRedimpl(j3) * 255.0f)), java.lang.Integer.valueOf(java.lang.Math.round(androidx.compose.ui.graphics.Color.m6001getGreenimpl(j3) * 255.0f)), java.lang.Integer.valueOf(java.lang.Math.round(androidx.compose.ui.graphics.Color.m5999getBlueimpl(j3) * 255.0f))}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ingo.sdk.kotlin.ux.IngoSdkColorTheme] */
    public static /* synthetic */ kotlin.Unit $r8$lambda$8j2id95q2QAzVlKrxZkEBjq7yr8(kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1008561796, i, -1, "com.paypal.oslo.feature.checkcapture.ingo.buildTheme.<anonymous> (IngoThemeBuilder.kt:44)");
            }
            long value = com.paypal.pds.core.Color.BackgroundBase.INSTANCE.getValue(composer, 6);
            objectRef.element = new com.ingo.sdk.kotlin.ux.IngoSdkColorTheme(getHighSpeedVideoSizes(com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(composer, 6), androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU()), getHighSpeedVideoSizes(com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(composer, 6), androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU()), getHighSpeedVideoSizes(com.paypal.pds.core.Color.ContentMuted.INSTANCE.getValue(composer, 6), value), getHighSpeedVideoSizes(value, androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU()), getHighSpeedVideoSizes(value, androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU()), getHighSpeedVideoSizes(com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE.getValue(composer, 6), androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU()), getHighSpeedVideoSizes(com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(composer, 6), androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU()), getHighSpeedVideoSizes(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE.getValue(composer, 6), androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU()));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
