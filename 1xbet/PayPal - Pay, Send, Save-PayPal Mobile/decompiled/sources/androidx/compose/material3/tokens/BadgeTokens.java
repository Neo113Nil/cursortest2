package androidx.compose.material3.tokens;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b"}, d2 = {"Landroidx/compose/material3/tokens/BadgeTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Color", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "LargeColor", "getLargeColor", "LargeLabelTextColor", "getLargeLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LargeLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLargeLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "LargeShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getLargeShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/ui/unit/Dp;", "LargeSize", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLargeSize-D9Ej5fM", "()F", "Shape", "getShape", "Size", "getSize-D9Ej5fM"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BadgeTokens {
    public static final int $stable = 0;
    public static final androidx.compose.material3.tokens.BadgeTokens INSTANCE = new androidx.compose.material3.tokens.BadgeTokens();
    private static final androidx.compose.material3.tokens.ColorSchemeKeyTokens Color = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Error;
    private static final androidx.compose.material3.tokens.ColorSchemeKeyTokens LargeColor = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Error;
    private static final androidx.compose.material3.tokens.ColorSchemeKeyTokens LargeLabelTextColor = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnError;
    private static final androidx.compose.material3.tokens.TypographyKeyTokens LargeLabelTextFont = androidx.compose.material3.tokens.TypographyKeyTokens.LabelSmall;
    private static final androidx.compose.material3.tokens.ShapeKeyTokens LargeShape = androidx.compose.material3.tokens.ShapeKeyTokens.CornerFull;
    private static final float LargeSize = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final androidx.compose.material3.tokens.ShapeKeyTokens Shape = androidx.compose.material3.tokens.ShapeKeyTokens.CornerFull;
    private static final float Size = androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f);

    private BadgeTokens() {
    }

    public final androidx.compose.material3.tokens.ColorSchemeKeyTokens getColor() {
        return Color;
    }

    public final androidx.compose.material3.tokens.ColorSchemeKeyTokens getLargeColor() {
        return LargeColor;
    }

    public final androidx.compose.material3.tokens.ColorSchemeKeyTokens getLargeLabelTextColor() {
        return LargeLabelTextColor;
    }

    public final androidx.compose.material3.tokens.TypographyKeyTokens getLargeLabelTextFont() {
        return LargeLabelTextFont;
    }

    public final androidx.compose.material3.tokens.ShapeKeyTokens getLargeShape() {
        return LargeShape;
    }

    /* renamed from: getLargeSize-D9Ej5fM, reason: not valid java name */
    public final float m4430getLargeSizeD9Ej5fM() {
        return LargeSize;
    }

    public final androidx.compose.material3.tokens.ShapeKeyTokens getShape() {
        return Shape;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m4431getSizeD9Ej5fM() {
        return Size;
    }
}
