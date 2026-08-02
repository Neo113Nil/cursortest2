package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$OvalGuideViewKt {
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1270138795, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt.$r8$lambda$1fFI8_WQSetnPkFY81WCj9d_IoE((androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });
    private static kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2072206525, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt.m20628$r8$lambda$a_OoqWoviQIuk_e8dtz3FX70ks((androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$1fFI8_WQSetnPkFY81WCj9d_IoE(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1270138795, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt.lambda$1270138795.<anonymous> (OvalGuideView.kt:184)");
        }
        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        com.paypal.pds.core.Typography.HeadingSmall headingSmall = com.paypal.pds.core.Typography.HeadingSmall.INSTANCE;
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Position your face in the frame", androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, null, null, null, false, 0, 0, null, headingSmall, composer, 438, 6, 1016);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$a_OoqWoviQIuk_e8dtz3-FX70ks, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20628$r8$lambda$a_OoqWoviQIuk_e8dtz3FX70ks(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2072206525, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt.lambda$2072206525.<anonymous> (OvalGuideView.kt:217)");
        }
        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopCenter(), false);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        com.paypal.pds.core.Typography.HeadingSmall headingSmall = com.paypal.pds.core.Typography.HeadingSmall.INSTANCE;
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Now blink", androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, null, null, null, false, 0, 0, null, headingSmall, composer, 438, 6, 1016);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2072206525$verification_capture_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1270138795$verification_capture_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
