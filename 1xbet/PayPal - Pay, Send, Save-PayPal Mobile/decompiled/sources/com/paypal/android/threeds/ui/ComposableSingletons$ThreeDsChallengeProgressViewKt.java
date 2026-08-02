package com.paypal.android.threeds.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$ThreeDsChallengeProgressViewKt {
    public static final com.paypal.android.threeds.ui.ComposableSingletons$ThreeDsChallengeProgressViewKt INSTANCE = new com.paypal.android.threeds.ui.ComposableSingletons$ThreeDsChallengeProgressViewKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1057723977, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.ComposableSingletons$ThreeDsChallengeProgressViewKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.android.threeds.ui.ComposableSingletons$ThreeDsChallengeProgressViewKt.$r8$lambda$ysaiwSVMdHr9XuTQY0qSI14jZm0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$ysaiwSVMdHr9XuTQY0qSI14jZm0(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1057723977, i, -1, "com.paypal.android.threeds.ui.ComposableSingletons$ThreeDsChallengeProgressViewKt.lambda$-1057723977.<anonymous> (ThreeDsChallengeProgressView.kt:31)");
            }
            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(hashCode))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(hashCode));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.material.ProgressIndicatorKt.m2701CircularProgressIndicatorLxG7B9w(null, androidx.compose.ui.graphics.Color.INSTANCE.m6028getLightGray0d7_KjU(), 0.0f, 0L, 0, composer, 48, 29);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1057723977$three_ds_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m10990getLambda$1057723977$three_ds_release() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
