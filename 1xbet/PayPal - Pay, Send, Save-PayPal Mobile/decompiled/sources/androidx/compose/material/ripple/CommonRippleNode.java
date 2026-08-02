package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0015*\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "", "targetRadius", "", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "onDetach", "()V", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/material/ripple/RippleAnimation;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableScatterMap;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonRippleNode extends androidx.compose.material.ripple.RippleNode {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation> getHighResolutionOutputSizeshNQ4ISI;

    private CommonRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> function0) {
        super(interactionSource, z, f, colorProducer, function0, null);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.MutableScatterMap<>(0, 1, null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM */
    public final void mo2850addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press interaction, long size, float targetRadius) {
        androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation> mutableScatterMap = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            ((androidx.compose.material.ripple.RippleAnimation) objArr2[i4]).finish();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        androidx.compose.material.ripple.RippleAnimation rippleAnimation = new androidx.compose.material.ripple.RippleAnimation(getBounded() ? androidx.compose.ui.geometry.Offset.m5741boximpl(interaction.getPressPosition()) : null, targetRadius, getBounded(), null);
        this.getHighResolutionOutputSizeshNQ4ISI.set(interaction, rippleAnimation);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.material.ripple.CommonRippleNode$addRipple$2(rippleAnimation, this, interaction, null), 3, null);
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void removeRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction) {
        androidx.compose.material.ripple.RippleAnimation rippleAnimation = this.getHighResolutionOutputSizeshNQ4ISI.get(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void drawRipples(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        float pressedAlpha = getRippleAlpha().invoke().getPressedAlpha();
        if (pressedAlpha == 0.0f) {
            return;
        }
        androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction.Press, androidx.compose.material.ripple.RippleAnimation> mutableScatterMap = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object[] objArr = mutableScatterMap.keys;
        java.lang.Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                long j2 = j;
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        float f3 = pressedAlpha;
                        i = i7;
                        i2 = i6;
                        f2 = pressedAlpha;
                        i3 = i5;
                        ((androidx.compose.material.ripple.RippleAnimation) objArr2[i8]).m2853draw4WTKRHQ(drawScope, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(m2863getRippleColor0d7_KjU(), f3, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        f2 = pressedAlpha;
                        i = i7;
                        i2 = i6;
                        i3 = i5;
                    }
                    j2 >>= i3;
                    i7 = i + 1;
                    i5 = i3;
                    pressedAlpha = f2;
                    i6 = i2;
                }
                f = pressedAlpha;
                if (i6 != i5) {
                    return;
                }
            } else {
                f = pressedAlpha;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            pressedAlpha = f;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    public /* synthetic */ CommonRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z, f, colorProducer, function0);
    }
}
