package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\"#$%BK\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0001\u0004&'()"}, d2 = {"Lcom/paypal/pds/components/BadgeSize;", "", "Lcom/paypal/pds/core/Typography;", "p0", "Landroidx/compose/ui/unit/Dp;", "p1", "p2", "p3", "p4", "p5", "Landroidx/compose/ui/graphics/Shape;", "p6", "<init>", "(Lcom/paypal/pds/core/Typography;FFFFFLandroidx/compose/ui/graphics/Shape;)V", "typography", "Lcom/paypal/pds/core/Typography;", "getTypography$pds_release", "()Lcom/paypal/pds/core/Typography;", "minSize", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMinSize-D9Ej5fM$pds_release", "()F", "horizontalPadding", "getHorizontalPadding-D9Ej5fM$pds_release", "verticalPadding", "getVerticalPadding-D9Ej5fM$pds_release", "iconSize", "getIconSize-D9Ej5fM$pds_release", "iconSpacing", "getIconSpacing-D9Ej5fM$pds_release", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape$pds_release", "()Landroidx/compose/ui/graphics/Shape;", "Medium", "Small", "BadgeIcon", "BadgePip", "Lcom/paypal/pds/components/BadgeSize$BadgeIcon;", "Lcom/paypal/pds/components/BadgeSize$BadgePip;", "Lcom/paypal/pds/components/BadgeSize$Medium;", "Lcom/paypal/pds/components/BadgeSize$Small;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class BadgeSize {
    public static final int $stable = 0;
    private final float horizontalPadding;
    private final float iconSize;
    private final float iconSpacing;
    private final float minSize;
    private final androidx.compose.ui.graphics.Shape shape;
    private final com.paypal.pds.core.Typography typography;
    private final float verticalPadding;

    private BadgeSize(com.paypal.pds.core.Typography typography, float f, float f2, float f3, float f4, float f5, androidx.compose.ui.graphics.Shape shape) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shape, "");
        this.typography = typography;
        this.minSize = f;
        this.horizontalPadding = f2;
        this.verticalPadding = f3;
        this.iconSize = f4;
        this.iconSpacing = f5;
        this.shape = shape;
    }

    /* renamed from: getTypography$pds_release, reason: from getter */
    public final com.paypal.pds.core.Typography getTypography() {
        return this.typography;
    }

    /* renamed from: getMinSize-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getMinSize() {
        return this.minSize;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: getVerticalPadding-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getVerticalPadding() {
        return this.verticalPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getIconSpacing() {
        return this.iconSpacing;
    }

    /* renamed from: getShape$pds_release, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeSize$Medium;", "Lcom/paypal/pds/components/BadgeSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Medium extends com.paypal.pds.components.BadgeSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeSize.Medium INSTANCE = new com.paypal.pds.components.BadgeSize.Medium();

        private Medium() {
            super(com.paypal.pds.core.Typography.LabelSmall.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, null, 112, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeSize$Small;", "Lcom/paypal/pds/components/BadgeSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Small extends com.paypal.pds.components.BadgeSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeSize.Small INSTANCE = new com.paypal.pds.components.BadgeSize.Small();

        private Small() {
            super(com.paypal.pds.core.Typography.LabelSmall.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize20(), com.paypal.pds.core.ConstantsKt.getSpacing4(), com.paypal.pds.core.ConstantsKt.getSpacing2(), 0.0f, 0.0f, null, 112, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeSize$BadgeIcon;", "Lcom/paypal/pds/components/BadgeSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BadgeIcon extends com.paypal.pds.components.BadgeSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeSize.BadgeIcon INSTANCE = new com.paypal.pds.components.BadgeSize.BadgeIcon();

        private BadgeIcon() {
            super(com.paypal.pds.core.Typography.LabelSmall.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize20(), 0.0f, 0.0f, 0.0f, 0.0f, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/BadgeSize$BadgePip;", "Lcom/paypal/pds/components/BadgeSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BadgePip extends com.paypal.pds.components.BadgeSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.BadgeSize.BadgePip INSTANCE = new com.paypal.pds.components.BadgeSize.BadgePip();

        private BadgePip() {
            super(com.paypal.pds.core.Typography.LabelSmall.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize8(), 0.0f, 0.0f, 0.0f, 0.0f, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
    }

    public /* synthetic */ BadgeSize(com.paypal.pds.core.Typography typography, float f, float f2, float f3, float f4, float f5, androidx.compose.ui.graphics.Shape shape, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typography, f, (i & 4) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2, (i & 8) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3, (i & 16) != 0 ? com.paypal.pds.core.ConstantsKt.getSize16() : f4, (i & 32) != 0 ? com.paypal.pds.core.ConstantsKt.getSpacing4() : f5, (i & 64) != 0 ? com.paypal.pds.core.ConstantsKt.getRoundedCornerShape4() : shape, null);
    }

    public /* synthetic */ BadgeSize(com.paypal.pds.core.Typography typography, float f, float f2, float f3, float f4, float f5, androidx.compose.ui.graphics.Shape shape, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typography, f, f2, f3, f4, f5, shape);
    }
}
