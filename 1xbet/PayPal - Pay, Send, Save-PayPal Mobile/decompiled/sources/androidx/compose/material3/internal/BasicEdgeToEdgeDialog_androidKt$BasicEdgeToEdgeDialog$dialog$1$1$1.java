package androidx.compose.material3.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function3<androidx.compose.material3.internal.PredictiveBackState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.Modifier getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        boolean booleanValue;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-635938462, intValue, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog.<anonymous>.<anonymous>.<anonymous> (BasicEdgeToEdgeDialog.android.kt:115)");
            }
            androidx.compose.material3.internal.PredictiveBackState rememberPredictiveBackState = androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt.rememberPredictiveBackState(composer2, 0);
            booleanValue = ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
            androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler(rememberPredictiveBackState, booleanValue, androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.access$BasicEdgeToEdgeDialog$lambda$3(this.getHighResolutionOutputSizeshNQ4ISI), composer2, 0, 0);
            androidx.compose.ui.Modifier modifier = this.getHighSpeedVideoSizes;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.runtime.State<kotlin.jvm.functions.Function3<androidx.compose.material3.internal.PredictiveBackState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> state = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, semantics$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.access$BasicEdgeToEdgeDialog$lambda$2(state).invoke(rememberPredictiveBackState, composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state2, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function3<? super androidx.compose.material3.internal.PredictiveBackState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> state3) {
        this.getHighSpeedVideoSizes = modifier;
        this.Camera2StreamConfigurationMap = state;
        this.getHighResolutionOutputSizeshNQ4ISI = state2;
        this.getHighSpeedVideoFpsRangesFor = state3;
    }
}
