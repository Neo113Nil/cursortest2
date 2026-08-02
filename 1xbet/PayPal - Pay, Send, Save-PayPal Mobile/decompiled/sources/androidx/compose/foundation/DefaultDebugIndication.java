package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "<init>", "()V", "Landroidx/compose/foundation/interaction/InteractionSource;", "p0", "Landroidx/compose/ui/node/DelegatableNode;", "create", "(Landroidx/compose/foundation/interaction/InteractionSource;)Landroidx/compose/ui/node/DelegatableNode;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "DefaultDebugIndicationInstance"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultDebugIndication implements androidx.compose.foundation.IndicationNodeFactory {
    public static final androidx.compose.foundation.DefaultDebugIndication INSTANCE = new androidx.compose.foundation.DefaultDebugIndication();

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final boolean equals(java.lang.Object p0) {
        return p0 == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        return -1;
    }

    private DefaultDebugIndication() {
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final androidx.compose.ui.node.DelegatableNode create(androidx.compose.foundation.interaction.InteractionSource p0) {
        return new androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance(p0);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\r\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/DefaultDebugIndication$DefaultDebugIndicationInstance;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "p0", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "", "onAttach", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/interaction/InteractionSource;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DefaultDebugIndicationInstance extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;

        public DefaultDebugIndicationInstance(androidx.compose.foundation.interaction.InteractionSource interactionSource) {
            this.getHighSpeedVideoFpsRangesFor = interactionSource;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onAttach() {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3, null);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            if (this.Camera2StreamConfigurationMap) {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo6531getSizeNHjbRc(), 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
            } else if (this.getHighSpeedVideoFpsRanges || this.getHighSpeedVideoSizes) {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo6531getSizeNHjbRc(), 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
            }
        }
    }
}
