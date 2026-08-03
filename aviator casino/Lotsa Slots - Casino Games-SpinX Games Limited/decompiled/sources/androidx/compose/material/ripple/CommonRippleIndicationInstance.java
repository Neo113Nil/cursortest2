package androidx.compose.material.ripple;

/* compiled from: CommonRipple.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\f\u0010\u001b\u001a\u00020\u0013*\u00020\u001cH\u0016J!\u0010\u001d\u001a\u00020\u0013*\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "bounded", "", com.helpshift.proactive.InAppViewConstants.RADIUS, "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "ripples", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/material/ripple/RippleAnimation;", "addRipple", "", "interaction", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onAbandoned", "onForgotten", "onRemembered", "removeRipple", "drawIndication", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonRippleIndicationInstance extends androidx.compose.material.ripple.RippleIndicationInstance implements androidx.compose.runtime.RememberObserver {
    private final boolean bounded;
    private final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> color;
    private final float radius;
    private final androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> rippleAlpha;
    private final androidx.compose.runtime.snapshots.SnapshotStateMap<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation> ripples;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z, float f, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state, state2);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    private CommonRippleIndicationInstance(boolean z, float f, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> state2) {
        super(z, state2);
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long m2123unboximpl = this.color.getValue().m2123unboximpl();
        contentDrawScope.drawContent();
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        m1600drawStateLayerH2RKhps(contentDrawScope2, this.radius, m2123unboximpl);
        m1593drawRipples4WTKRHQ(contentDrawScope2, m2123unboximpl);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        java.util.Iterator<java.util.Map.Entry<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        androidx.compose.material.ripple.RippleAnimation rippleAnimation = new androidx.compose.material.ripple.RippleAnimation(this.bounded ? androidx.compose.ui.geometry.Offset.m1860boximpl(interaction.getPressPosition()) : null, this.radius, this.bounded, null);
        this.ripples.put(interaction, rippleAnimation);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, interaction, null), 3, null);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "interaction");
        androidx.compose.material.ripple.RippleAnimation rippleAnimation = this.ripples.get(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    /* renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m1593drawRipples4WTKRHQ(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j) {
        java.util.Iterator<java.util.Map.Entry<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            androidx.compose.material.ripple.RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                value.m1594draw4WTKRHQ(drawScope, androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(j, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }
}
