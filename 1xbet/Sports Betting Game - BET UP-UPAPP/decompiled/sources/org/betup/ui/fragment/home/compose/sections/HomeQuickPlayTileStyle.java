package org.betup.ui.fragment.home.compose.sections;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeStubSection.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0012\u001a\u00020\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007R\u0013\u0010\u001a\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001b\u0010\u0007R\u0013\u0010\u001c\u001a\u00020\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001d\u0010\u0010R\u0013\u0010\u001e\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001f\u0010\u0007R\u0013\u0010 \u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b!\u0010\u0007R\u0013\u0010\"\u001a\u00020\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b#\u0010\u0010R\u0013\u0010$\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b%\u0010\u0007R\u0013\u0010&\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b'\u0010\u0007R\u000e\u0010(\u001a\u00020)X\u0086T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lorg/betup/ui/fragment/home/compose/sections/HomeQuickPlayTileStyle;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "getCornerRadius-D9Ej5fM", "()F", "F", "contentPadding", "getContentPadding-D9Ej5fM", "iconSize", "getIconSize-D9Ej5fM", "labelFontSize", "Landroidx/compose/ui/unit/TextUnit;", "getLabelFontSize-XSAIIZE", "()J", "J", "labelMinFontSize", "getLabelMinFontSize-XSAIIZE", "labelMaxLines", "", "getLabelMaxLines", "()I", "labelTopPadding", "getLabelTopPadding-D9Ej5fM", "tileHorizontalGap", "getTileHorizontalGap-D9Ej5fM", "valueFontSize", "getValueFontSize-XSAIIZE", "valueTopPadding", "getValueTopPadding-D9Ej5fM", "badgeMinSize", "getBadgeMinSize-D9Ej5fM", "badgeFontSize", "getBadgeFontSize-XSAIIZE", "badgeCornerOffset", "getBadgeCornerOffset-D9Ej5fM", "badgeOverflowPad", "getBadgeOverflowPad-D9Ej5fM", "widthFraction", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeQuickPlayTileStyle {
    public static final int $stable = 0;
    private static final float badgeCornerOffset;
    private static final float badgeOverflowPad;
    private static final float contentPadding;
    private static final float labelTopPadding;
    private static final float tileHorizontalGap;
    public static final float widthFraction = 0.8f;
    public static final HomeQuickPlayTileStyle INSTANCE = new HomeQuickPlayTileStyle();
    private static final float cornerRadius = Dp.m7774constructorimpl(10);
    private static final float iconSize = Dp.m7774constructorimpl(35);
    private static final long labelFontSize = TextUnitKt.getSp(10);
    private static final long labelMinFontSize = TextUnitKt.getSp(7);
    private static final int labelMaxLines = 2;
    private static final long valueFontSize = TextUnitKt.getSp(8);
    private static final float valueTopPadding = Dp.m7774constructorimpl(2);
    private static final float badgeMinSize = Dp.m7774constructorimpl(16);
    private static final long badgeFontSize = TextUnitKt.getSp(9);

    private HomeQuickPlayTileStyle() {
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m13822getCornerRadiusD9Ej5fM() {
        return cornerRadius;
    }

    /* renamed from: getContentPadding-D9Ej5fM, reason: not valid java name */
    public final float m13821getContentPaddingD9Ej5fM() {
        return contentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m13823getIconSizeD9Ej5fM() {
        return iconSize;
    }

    /* renamed from: getLabelFontSize-XSAIIZE, reason: not valid java name */
    public final long m13824getLabelFontSizeXSAIIZE() {
        return labelFontSize;
    }

    /* renamed from: getLabelMinFontSize-XSAIIZE, reason: not valid java name */
    public final long m13825getLabelMinFontSizeXSAIIZE() {
        return labelMinFontSize;
    }

    public final int getLabelMaxLines() {
        return labelMaxLines;
    }

    /* renamed from: getLabelTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m13826getLabelTopPaddingD9Ej5fM() {
        return labelTopPadding;
    }

    /* renamed from: getTileHorizontalGap-D9Ej5fM, reason: not valid java name */
    public final float m13827getTileHorizontalGapD9Ej5fM() {
        return tileHorizontalGap;
    }

    /* renamed from: getValueFontSize-XSAIIZE, reason: not valid java name */
    public final long m13828getValueFontSizeXSAIIZE() {
        return valueFontSize;
    }

    /* renamed from: getValueTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m13829getValueTopPaddingD9Ej5fM() {
        return valueTopPadding;
    }

    /* renamed from: getBadgeMinSize-D9Ej5fM, reason: not valid java name */
    public final float m13819getBadgeMinSizeD9Ej5fM() {
        return badgeMinSize;
    }

    /* renamed from: getBadgeFontSize-XSAIIZE, reason: not valid java name */
    public final long m13818getBadgeFontSizeXSAIIZE() {
        return badgeFontSize;
    }

    /* renamed from: getBadgeCornerOffset-D9Ej5fM, reason: not valid java name */
    public final float m13817getBadgeCornerOffsetD9Ej5fM() {
        return badgeCornerOffset;
    }

    /* renamed from: getBadgeOverflowPad-D9Ej5fM, reason: not valid java name */
    public final float m13820getBadgeOverflowPadD9Ej5fM() {
        return badgeOverflowPad;
    }

    static {
        float f = 8;
        contentPadding = Dp.m7774constructorimpl(f);
        float f2 = 6;
        labelTopPadding = Dp.m7774constructorimpl(f2);
        tileHorizontalGap = Dp.m7774constructorimpl(f);
        badgeCornerOffset = Dp.m7774constructorimpl(f2);
        badgeOverflowPad = Dp.m7774constructorimpl(f);
    }
}
