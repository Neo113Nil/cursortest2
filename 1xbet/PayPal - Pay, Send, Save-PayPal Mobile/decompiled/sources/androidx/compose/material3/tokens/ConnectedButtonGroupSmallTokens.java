package androidx.compose.material3.tokens;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087D¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/material3/tokens/ConnectedButtonGroupSmallTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "BetweenSpace", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBetweenSpace-D9Ej5fM", "()F", "ContainerHeight", "getContainerHeight-D9Ej5fM", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/foundation/shape/CornerSize;", "InnerCornerCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "getInnerCornerCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "PressedInnerCornerCornerSize", "getPressedInnerCornerCornerSize", "", "SelectedInnerCornerCornerSizePercent", "getSelectedInnerCornerCornerSizePercent"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectedButtonGroupSmallTokens {
    public static final int $stable = 0;
    public static final androidx.compose.material3.tokens.ConnectedButtonGroupSmallTokens INSTANCE = new androidx.compose.material3.tokens.ConnectedButtonGroupSmallTokens();
    private static final float BetweenSpace = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float ContainerHeight = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);
    private static final androidx.compose.material3.tokens.ShapeKeyTokens ContainerShape = androidx.compose.material3.tokens.ShapeKeyTokens.CornerFull;
    private static final androidx.compose.foundation.shape.CornerSize InnerCornerCornerSize = androidx.compose.material3.tokens.ShapeTokens.INSTANCE.getCornerValueSmall();
    private static final androidx.compose.foundation.shape.CornerSize PressedInnerCornerCornerSize = androidx.compose.material3.tokens.ShapeTokens.INSTANCE.getCornerValueExtraSmall();
    private static final float SelectedInnerCornerCornerSizePercent = 50.0f;

    private ConnectedButtonGroupSmallTokens() {
    }

    /* renamed from: getBetweenSpace-D9Ej5fM, reason: not valid java name */
    public final float m4599getBetweenSpaceD9Ej5fM() {
        return BetweenSpace;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4600getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final androidx.compose.material3.tokens.ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final androidx.compose.foundation.shape.CornerSize getInnerCornerCornerSize() {
        return InnerCornerCornerSize;
    }

    public final androidx.compose.foundation.shape.CornerSize getPressedInnerCornerCornerSize() {
        return PressedInnerCornerCornerSize;
    }

    public final float getSelectedInnerCornerCornerSizePercent() {
        return SelectedInnerCornerCornerSizePercent;
    }
}
