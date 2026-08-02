package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\bM\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u001a\u0010\u0016\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001c\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u001b\"\u001a\u0010\u001e\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u001b\"\u0014\u0010!\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010'\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b'\u0010\"\"\u0014\u0010(\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b(\u0010\"\"\u0014\u0010)\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b)\u0010\"\"\u0014\u0010*\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b*\u0010\"\"\u0014\u0010+\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b+\u0010\"\"\u0014\u0010,\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b,\u0010\"\"\u0014\u0010-\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b-\u0010\"\"\u0014\u0010.\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b.\u0010\"\"\u0014\u0010/\u001a\u00020 8\u0006X\u0087T¢\u0006\u0006\n\u0004\b/\u0010\"\"\u001a\u00100\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u001b\"\u001a\u00102\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0002\u001a\u0004\b3\u0010\u001b\"\u001a\u00104\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u001b\"\u001a\u00106\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u001b\"\u001a\u00108\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\u001b\"\u001a\u0010:\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0002\u001a\u0004\b;\u0010\u001b\"\u001a\u0010<\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u001b\"\u001a\u0010>\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0002\u001a\u0004\b?\u0010\u001b\"\u001a\u0010@\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0002\u001a\u0004\bA\u0010\u001b\"\u001a\u0010B\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u001b\"\u001a\u0010D\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0002\u001a\u0004\bE\u0010\u001b\"\u001a\u0010F\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0002\u001a\u0004\bG\u0010\u001b\"\u001a\u0010H\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u001b\"\u001a\u0010J\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u0002\u001a\u0004\bK\u0010\u001b\"\u001a\u0010L\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010\u0002\u001a\u0004\bM\u0010\u001b\"\u001a\u0010N\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u001b\"\u001a\u0010P\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u0002\u001a\u0004\bQ\u0010\u001b\"\u001a\u0010R\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u0002\u001a\u0004\bS\u0010\u001b\"\u001a\u0010T\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u001b\"\u001a\u0010V\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010\u0002\u001a\u0004\bW\u0010\u001b\"\u001a\u0010X\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010\u0002\u001a\u0004\bY\u0010\u001b\"\u001a\u0010Z\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u001b\"\u001a\u0010\\\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010\u0002\u001a\u0004\b]\u0010\u001b\"\u001a\u0010^\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010\u0002\u001a\u0004\b_\u0010\u001b\"\u001a\u0010`\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u001b\"\u001a\u0010b\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010\u0002\u001a\u0004\bc\u0010\u001b\"\u001a\u0010d\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010\u0002\u001a\u0004\be\u0010\u001b\"\u001a\u0010f\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u001b\"\u001a\u0010h\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010\u0002\u001a\u0004\bi\u0010\u001b\"\u001a\u0010j\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010\u0002\u001a\u0004\bk\u0010\u001b\"\u001a\u0010l\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010\u0002\u001a\u0004\bm\u0010\u001b"}, d2 = {"", "AspectRatioLandscape16X9", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "AspectRatioLandscape3X2", "AspectRatioLandscape4X3", "AspectRatioPortrait2X3", "AspectRatioPortrait3X4", "AspectRatioPortrait9X16", "AspectRatioSquare", "Landroidx/compose/ui/graphics/Shape;", "RoundedCornerShape12", "Landroidx/compose/ui/graphics/Shape;", "getRoundedCornerShape12", "()Landroidx/compose/ui/graphics/Shape;", "RoundedCornerShape24", "getRoundedCornerShape24", "RoundedCornerShape32", "getRoundedCornerShape32", "RoundedCornerShape4", "getRoundedCornerShape4", "RoundedCornerShape8", "getRoundedCornerShape8", "RoundedCornerShapeFull", "getRoundedCornerShapeFull", "Landroidx/compose/ui/unit/Dp;", "BorderSize1", "getBorderSize1", "()F", "BorderSize2", "getBorderSize2", "BorderSize3", "getBorderSize3", "", "MotionDuration0", "J", "MotionDuration100", "MotionDuration1000", "MotionDuration1200", "MotionDuration150", "MotionDuration1500", "MotionDuration25", "MotionDuration300", "MotionDuration3000", "MotionDuration400", "MotionDuration50", "MotionDuration5000", "MotionDuration600", "MotionDuration7000", "Size0", "getSize0", "Size16", "getSize16", "Size2", "getSize2", "Size20", "getSize20", "Size24", "getSize24", "Size28", "getSize28", "Size32", "getSize32", "Size4", "getSize4", "Size40", "getSize40", "Size48", "getSize48", "Size56", "getSize56", "Size64", "getSize64", "Size8", "getSize8", "Size80", "getSize80", "Spacing0", "getSpacing0", "Spacing12", "getSpacing12", "Spacing128", "getSpacing128", "Spacing16", "getSpacing16", "Spacing2", "getSpacing2", "Spacing20", "getSpacing20", "Spacing24", "getSpacing24", "Spacing28", "getSpacing28", "Spacing32", "getSpacing32", "Spacing36", "getSpacing36", "Spacing4", "getSpacing4", "Spacing40", "getSpacing40", "Spacing48", "getSpacing48", "Spacing56", "getSpacing56", "Spacing64", "getSpacing64", "Spacing8", "getSpacing8", "Spacing96", "getSpacing96"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstantsKt {
    public static final float AspectRatioLandscape16X9 = 1.7777778f;
    public static final float AspectRatioLandscape3X2 = 1.5f;
    public static final float AspectRatioLandscape4X3 = 1.3333334f;
    public static final float AspectRatioPortrait2X3 = 0.6666667f;
    public static final float AspectRatioPortrait3X4 = 0.75f;
    public static final float AspectRatioPortrait9X16 = 0.5625f;
    public static final float AspectRatioSquare = 1.0f;
    public static final long MotionDuration0 = 0;
    public static final long MotionDuration100 = 100;
    public static final long MotionDuration1000 = 1000;
    public static final long MotionDuration1200 = 1200;
    public static final long MotionDuration150 = 150;
    public static final long MotionDuration1500 = 1500;
    public static final long MotionDuration25 = 25;
    public static final long MotionDuration300 = 300;
    public static final long MotionDuration3000 = 3000;
    public static final long MotionDuration400 = 400;
    public static final long MotionDuration50 = 50;
    public static final long MotionDuration5000 = 5000;
    public static final long MotionDuration600 = 600;
    public static final long MotionDuration7000 = 7000;
    private static final androidx.compose.ui.graphics.Shape RoundedCornerShape12 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f));
    private static final androidx.compose.ui.graphics.Shape RoundedCornerShape24 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f));
    private static final androidx.compose.ui.graphics.Shape RoundedCornerShape32 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f));
    private static final androidx.compose.ui.graphics.Shape RoundedCornerShape4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f));
    private static final androidx.compose.ui.graphics.Shape RoundedCornerShape8 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f));
    private static final androidx.compose.ui.graphics.Shape RoundedCornerShapeFull = androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape();
    private static final float BorderSize1 = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f);
    private static final float BorderSize2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float BorderSize3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(3.0f);
    private static final float Size0 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
    private static final float Size16 = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final float Size2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float Size20 = androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f);
    private static final float Size24 = androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f);
    private static final float Size28 = androidx.compose.ui.unit.Dp.m8601constructorimpl(28.0f);
    private static final float Size32 = androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f);
    private static final float Size4 = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);
    private static final float Size40 = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);
    private static final float Size48 = androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f);
    private static final float Size56 = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final float Size64 = androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f);
    private static final float Size8 = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);
    private static final float Size80 = androidx.compose.ui.unit.Dp.m8601constructorimpl(80.0f);
    private static final float Spacing0 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
    private static final float Spacing12 = androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f);
    private static final float Spacing128 = androidx.compose.ui.unit.Dp.m8601constructorimpl(128.0f);
    private static final float Spacing16 = androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f);
    private static final float Spacing2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f);
    private static final float Spacing20 = androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f);
    private static final float Spacing24 = androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f);
    private static final float Spacing28 = androidx.compose.ui.unit.Dp.m8601constructorimpl(28.0f);
    private static final float Spacing32 = androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f);
    private static final float Spacing36 = androidx.compose.ui.unit.Dp.m8601constructorimpl(36.0f);
    private static final float Spacing4 = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);
    private static final float Spacing40 = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);
    private static final float Spacing48 = androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f);
    private static final float Spacing56 = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final float Spacing64 = androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f);
    private static final float Spacing8 = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);
    private static final float Spacing96 = androidx.compose.ui.unit.Dp.m8601constructorimpl(96.0f);

    public static final androidx.compose.ui.graphics.Shape getRoundedCornerShape12() {
        return RoundedCornerShape12;
    }

    public static final androidx.compose.ui.graphics.Shape getRoundedCornerShape24() {
        return RoundedCornerShape24;
    }

    public static final androidx.compose.ui.graphics.Shape getRoundedCornerShape32() {
        return RoundedCornerShape32;
    }

    public static final androidx.compose.ui.graphics.Shape getRoundedCornerShape4() {
        return RoundedCornerShape4;
    }

    public static final androidx.compose.ui.graphics.Shape getRoundedCornerShape8() {
        return RoundedCornerShape8;
    }

    public static final androidx.compose.ui.graphics.Shape getRoundedCornerShapeFull() {
        return RoundedCornerShapeFull;
    }

    public static final float getBorderSize1() {
        return BorderSize1;
    }

    public static final float getBorderSize2() {
        return BorderSize2;
    }

    public static final float getBorderSize3() {
        return BorderSize3;
    }

    public static final float getSize0() {
        return Size0;
    }

    public static final float getSize16() {
        return Size16;
    }

    public static final float getSize2() {
        return Size2;
    }

    public static final float getSize20() {
        return Size20;
    }

    public static final float getSize24() {
        return Size24;
    }

    public static final float getSize28() {
        return Size28;
    }

    public static final float getSize32() {
        return Size32;
    }

    public static final float getSize4() {
        return Size4;
    }

    public static final float getSize40() {
        return Size40;
    }

    public static final float getSize48() {
        return Size48;
    }

    public static final float getSize56() {
        return Size56;
    }

    public static final float getSize64() {
        return Size64;
    }

    public static final float getSize8() {
        return Size8;
    }

    public static final float getSize80() {
        return Size80;
    }

    public static final float getSpacing0() {
        return Spacing0;
    }

    public static final float getSpacing12() {
        return Spacing12;
    }

    public static final float getSpacing128() {
        return Spacing128;
    }

    public static final float getSpacing16() {
        return Spacing16;
    }

    public static final float getSpacing2() {
        return Spacing2;
    }

    public static final float getSpacing20() {
        return Spacing20;
    }

    public static final float getSpacing24() {
        return Spacing24;
    }

    public static final float getSpacing28() {
        return Spacing28;
    }

    public static final float getSpacing32() {
        return Spacing32;
    }

    public static final float getSpacing36() {
        return Spacing36;
    }

    public static final float getSpacing4() {
        return Spacing4;
    }

    public static final float getSpacing40() {
        return Spacing40;
    }

    public static final float getSpacing48() {
        return Spacing48;
    }

    public static final float getSpacing56() {
        return Spacing56;
    }

    public static final float getSpacing64() {
        return Spacing64;
    }

    public static final float getSpacing8() {
        return Spacing8;
    }

    public static final float getSpacing96() {
        return Spacing96;
    }
}
