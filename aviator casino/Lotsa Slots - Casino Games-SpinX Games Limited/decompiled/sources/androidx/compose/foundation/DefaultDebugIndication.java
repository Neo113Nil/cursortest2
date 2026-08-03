package androidx.compose.foundation;

/* compiled from: Indication.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/Indication;", "()V", "rememberUpdatedInstance", "Landroidx/compose/foundation/IndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/IndicationInstance;", "DefaultDebugIndicationInstance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultDebugIndication implements androidx.compose.foundation.Indication {
    public static final androidx.compose.foundation.DefaultDebugIndication INSTANCE = new androidx.compose.foundation.DefaultDebugIndication();

    private DefaultDebugIndication() {
    }

    /* compiled from: Indication.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "isPressed", "Landroidx/compose/runtime/State;", "", "isHovered", "isFocused", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "drawIndication", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class DefaultDebugIndicationInstance implements androidx.compose.foundation.IndicationInstance {
        private final androidx.compose.runtime.State<java.lang.Boolean> isFocused;
        private final androidx.compose.runtime.State<java.lang.Boolean> isHovered;
        private final androidx.compose.runtime.State<java.lang.Boolean> isPressed;

        public DefaultDebugIndicationInstance(androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<java.lang.Boolean> state2, androidx.compose.runtime.State<java.lang.Boolean> state3) {
            this.isPressed = state;
            this.isHovered = state2;
            this.isFocused = state3;
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public void drawIndication(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            if (this.isPressed.getValue().booleanValue()) {
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(contentDrawScope, androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo2592getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered.getValue().booleanValue() || this.isFocused.getValue().booleanValue()) {
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(contentDrawScope, androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo2592getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    @Override // androidx.compose.foundation.Indication
    public androidx.compose.foundation.IndicationInstance rememberUpdatedInstance(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1683566979);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberUpdatedInstance)167@6771L25,168@6839L25,169@6907L25,170@6948L115:Indication.kt#71ulvw");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1683566979, i, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i2 = i & 14;
        androidx.compose.runtime.State<java.lang.Boolean> collectIsPressedAsState = androidx.compose.foundation.interaction.PressInteractionKt.collectIsPressedAsState(interactionSource, composer, i2);
        androidx.compose.runtime.State<java.lang.Boolean> collectIsHoveredAsState = androidx.compose.foundation.interaction.HoverInteractionKt.collectIsHoveredAsState(interactionSource, composer, i2);
        androidx.compose.runtime.State<java.lang.Boolean> collectIsFocusedAsState = androidx.compose.foundation.interaction.FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, i2);
        composer.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(interactionSource);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance(collectIsPressedAsState, collectIsHoveredAsState, collectIsFocusedAsState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = (androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDebugIndicationInstance;
    }
}
