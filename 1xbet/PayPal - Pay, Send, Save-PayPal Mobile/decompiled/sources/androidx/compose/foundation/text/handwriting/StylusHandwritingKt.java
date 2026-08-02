package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\u00020\t8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "showHoverIcon", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "stylusHandwriting", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "HandwritingBoundsVerticalOffset", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsHorizontalOffset", "getHandwritingBoundsHorizontalOffset", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "HandwritingBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "getHandwritingBoundsExpansion", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StylusHandwritingKt {
    private static final androidx.compose.ui.node.DpTouchBoundsExpansion HandwritingBoundsExpansion;
    private static final float HandwritingBoundsHorizontalOffset;
    private static final float HandwritingBoundsVerticalOffset;

    public static final androidx.compose.ui.Modifier stylusHandwriting(androidx.compose.ui.Modifier modifier, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (!z || !androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return modifier;
        }
        if (z2) {
            modifier = androidx.compose.ui.input.pointer.PointerIconKt.stylusHoverIcon(modifier, androidx.compose.foundation.text.TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
        }
        return modifier.then(new androidx.compose.foundation.text.handwriting.StylusHandwritingElement(function0));
    }

    public static final float getHandwritingBoundsVerticalOffset() {
        return HandwritingBoundsVerticalOffset;
    }

    public static final float getHandwritingBoundsHorizontalOffset() {
        return HandwritingBoundsHorizontalOffset;
    }

    public static final androidx.compose.ui.node.DpTouchBoundsExpansion getHandwritingBoundsExpansion() {
        return HandwritingBoundsExpansion;
    }

    static {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);
        HandwritingBoundsVerticalOffset = m8601constructorimpl;
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);
        HandwritingBoundsHorizontalOffset = m8601constructorimpl2;
        HandwritingBoundsExpansion = androidx.compose.ui.node.TouchBoundsExpansionKt.m7707DpTouchBoundsExpansiona9UjIt4(m8601constructorimpl2, m8601constructorimpl, m8601constructorimpl2, m8601constructorimpl);
    }
}
