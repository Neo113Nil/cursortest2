package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B/\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010 \u001a\u00020\u000bH\u0016J*\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020\u000bH\u0004J\u001f\u0010+\u001a\u00020\u000b*\u00020,2\u0006\u0010-\u001a\u00020.H\u0084@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u00020\u000b*\u000202H¤@¢\u0006\u0002\u00103R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u000245\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onClick", "Lkotlin/Function0;", "", "interactionData", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;)V", "delayPressInteraction", "getEnabled", "()Z", "setEnabled", "(Z)V", "getInteractionData", "()Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "onCancelPointerInput", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "resetPointerInputHandler", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;", "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/ClickablePointerInputNode;", "Landroidx/compose/foundation/CombinedClickablePointerInputNode;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class AbstractClickablePointerInputNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.PointerInputModifierNode {
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> delayPressInteraction;
    private boolean enabled;
    private final androidx.compose.foundation.AbstractClickableNode.InteractionData interactionData;
    private androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode pointerInputNode;

    public /* synthetic */ AbstractClickablePointerInputNode(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.AbstractClickableNode.InteractionData interactionData, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, mutableInteractionSource, function0, interactionData);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ java.lang.Object getCurrent(androidx.compose.ui.modifier.ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMap;
        modifierLocalMap = androidx.compose.ui.modifier.EmptyMap.INSTANCE;
        return modifierLocalMap;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return androidx.compose.ui.node.PointerInputModifierNode.CC.$default$interceptOutOfBoundsChildEvents(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    protected abstract java.lang.Object pointerInput(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
        androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return androidx.compose.ui.node.PointerInputModifierNode.CC.$default$sharePointerInputWithSiblings(this);
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final void setEnabled(boolean z) {
        this.enabled = z;
    }

    protected final androidx.compose.foundation.interaction.MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    protected final void setInteractionSource(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    protected final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    protected final void setOnClick(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onClick = function0;
    }

    protected final androidx.compose.foundation.AbstractClickableNode.InteractionData getInteractionData() {
        return this.interactionData;
    }

    private AbstractClickablePointerInputNode(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.AbstractClickableNode.InteractionData interactionData) {
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.onClick = function0;
        this.interactionData = interactionData;
        this.delayPressInteraction = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.AbstractClickablePointerInputNode$delayPressInteraction$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((java.lang.Boolean) androidx.compose.foundation.AbstractClickablePointerInputNode.this.getCurrent(androidx.compose.foundation.gestures.ScrollableKt.getModifierLocalScrollableContainer())).booleanValue() || androidx.compose.foundation.Clickable_androidKt.isComposeRootInScrollableContainer(androidx.compose.foundation.AbstractClickablePointerInputNode.this));
            }
        };
        this.pointerInputNode = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1(this, null)));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo181onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo181onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r8 = androidx.compose.foundation.ClickableKt.m253handlePressInteractionEPk0efs(r8, r9, r3, r7.interactionData, r7.delayPressInteraction, r11);
     */
    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final java.lang.Object m186handlePressInteractiond4ec7I(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m253handlePressInteractionEPk0efs;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || m253handlePressInteractionEPk0efs != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? kotlin.Unit.INSTANCE : m253handlePressInteractionEPk0efs;
    }

    protected final void resetPointerInputHandler() {
        this.pointerInputNode.resetPointerInputHandler();
    }
}
