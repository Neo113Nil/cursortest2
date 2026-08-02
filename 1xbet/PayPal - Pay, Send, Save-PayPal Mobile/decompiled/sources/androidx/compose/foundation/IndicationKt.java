package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/Indication;", "indication", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/Indication;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalIndication", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalIndication", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IndicationKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.Indication> LocalIndication = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.IndicationKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.foundation.Indication highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.foundation.IndicationKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    }, 1, null);

    public static final androidx.compose.ui.Modifier indication(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.interaction.InteractionSource interactionSource, final androidx.compose.foundation.Indication indication) {
        if (indication == null) {
            return modifier;
        }
        if (indication instanceof androidx.compose.foundation.IndicationNodeFactory) {
            return modifier.then(new androidx.compose.foundation.IndicationModifierElement(interactionSource, (androidx.compose.foundation.IndicationNodeFactory) indication));
        }
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indication");
                inspectorInfo.getProperties().set("interactionSource", androidx.compose.foundation.interaction.InteractionSource.this);
                inspectorInfo.getProperties().set("indication", indication);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.IndicationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.Modifier highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.IndicationKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.Indication.this, interactionSource, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoFpsRangesFor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.Indication indication, androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-353972293);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
        }
        androidx.compose.foundation.IndicationInstance rememberUpdatedInstance = indication.rememberUpdatedInstance(interactionSource, composer, 0);
        boolean changed = composer.changed(rememberUpdatedInstance);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.IndicationModifier(rememberUpdatedInstance);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.IndicationModifier indicationModifier = (androidx.compose.foundation.IndicationModifier) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return indicationModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.Indication getHighSpeedVideoSizes() {
        return androidx.compose.foundation.DefaultDebugIndication.INSTANCE;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.Indication> getLocalIndication() {
        return LocalIndication;
    }
}
