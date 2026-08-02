package androidx.compose.material3.tokens;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/material3/tokens/BottomAppBarTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Landroidx/compose/ui/unit/Dp;", "ContainerElevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getContainerElevation-D9Ej5fM", "()F", "ContainerHeight", "getContainerHeight-D9Ej5fM", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomAppBarTokens {
    public static final int $stable = 0;
    public static final androidx.compose.material3.tokens.BottomAppBarTokens INSTANCE = new androidx.compose.material3.tokens.BottomAppBarTokens();
    private static final androidx.compose.material3.tokens.ColorSchemeKeyTokens ContainerColor = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainer;
    private static final float ContainerElevation = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4655getLevel2D9Ej5fM();
    private static final float ContainerHeight = androidx.compose.ui.unit.Dp.m8601constructorimpl(80.0f);
    private static final androidx.compose.material3.tokens.ShapeKeyTokens ContainerShape = androidx.compose.material3.tokens.ShapeKeyTokens.CornerNone;

    private BottomAppBarTokens() {
    }

    public final androidx.compose.material3.tokens.ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m4442getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4443getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final androidx.compose.material3.tokens.ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }
}
