package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TooltipKt$TooltipBox$wrappedContent$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.layout.LayoutCoordinates> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-23901870, intValue, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:316)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            final androidx.compose.runtime.MutableState<androidx.compose.ui.layout.LayoutCoordinates> mutableState = this.getHighSpeedVideoSizes;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.layout.LayoutCoordinates) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (kotlin.jvm.functions.Function1) rememberedValue);
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, onGloballyPositioned);
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
            function2.invoke(composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    TooltipKt$TooltipBox$wrappedContent$1(androidx.compose.runtime.MutableState<androidx.compose.ui.layout.LayoutCoordinates> mutableState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
