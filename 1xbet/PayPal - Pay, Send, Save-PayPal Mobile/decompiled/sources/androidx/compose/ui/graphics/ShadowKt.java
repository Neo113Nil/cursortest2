package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/Shadow;F)Landroidx/compose/ui/graphics/Shadow;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShadowKt {
    public static final androidx.compose.ui.graphics.Shadow lerp(androidx.compose.ui.graphics.Shadow shadow, androidx.compose.ui.graphics.Shadow shadow2, float f) {
        return new androidx.compose.ui.graphics.Shadow(androidx.compose.ui.graphics.ColorKt.m6046lerpjxsXWHM(shadow.getColor(), shadow2.getColor(), f), androidx.compose.ui.geometry.OffsetKt.m5775lerpWko1d7g(shadow.getOffset(), shadow2.getOffset(), f), androidx.compose.ui.util.MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), null);
    }
}
