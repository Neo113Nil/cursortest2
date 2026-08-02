package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005%&'()BI\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010!\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012\u0082\u0001\u0005*+,-."}, d2 = {"Lcom/paypal/pds/components/AvatarSize;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "Lcom/paypal/pds/components/IconSize;", "p1", "Lcom/paypal/pds/core/Typography;", "p2", "", "p3", "p4", "p5", "p6", "<init>", "(FLcom/paypal/pds/components/IconSize;Lcom/paypal/pds/core/Typography;ZZFF)V", io.ktor.http.ContentDisposition.Parameters.Size, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSize-D9Ej5fM$pds_release", "()F", "iconSize", "Lcom/paypal/pds/components/IconSize;", "getIconSize$pds_release", "()Lcom/paypal/pds/components/IconSize;", "typography", "Lcom/paypal/pds/core/Typography;", "getTypography$pds_release", "()Lcom/paypal/pds/core/Typography;", "supportsIconBadge", "Z", "getSupportsIconBadge$pds_release", "()Z", "supportsPipBadge", "getSupportsPipBadge$pds_release", "badgePipPadding", "getBadgePipPadding-D9Ej5fM$pds_release", "overlapOffset", "getOverlapOffset-D9Ej5fM$pds_release", "XSmall", "Small", "Medium", "Large", "XLarge", "Lcom/paypal/pds/components/AvatarSize$Large;", "Lcom/paypal/pds/components/AvatarSize$Medium;", "Lcom/paypal/pds/components/AvatarSize$Small;", "Lcom/paypal/pds/components/AvatarSize$XLarge;", "Lcom/paypal/pds/components/AvatarSize$XSmall;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AvatarSize {
    public static final int $stable = 0;
    private final float badgePipPadding;
    private final com.paypal.pds.components.IconSize iconSize;
    private final float overlapOffset;
    private final float size;
    private final boolean supportsIconBadge;
    private final boolean supportsPipBadge;
    private final com.paypal.pds.core.Typography typography;

    private AvatarSize(float f, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Typography typography, boolean z, boolean z2, float f2, float f3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
        this.size = f;
        this.iconSize = iconSize;
        this.typography = typography;
        this.supportsIconBadge = z;
        this.supportsPipBadge = z2;
        this.badgePipPadding = f2;
        this.overlapOffset = f3;
    }

    /* renamed from: getSize-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: getIconSize$pds_release, reason: from getter */
    public final com.paypal.pds.components.IconSize getIconSize() {
        return this.iconSize;
    }

    /* renamed from: getTypography$pds_release, reason: from getter */
    public final com.paypal.pds.core.Typography getTypography() {
        return this.typography;
    }

    /* renamed from: getSupportsIconBadge$pds_release, reason: from getter */
    public final boolean getSupportsIconBadge() {
        return this.supportsIconBadge;
    }

    /* renamed from: getSupportsPipBadge$pds_release, reason: from getter */
    public final boolean getSupportsPipBadge() {
        return this.supportsPipBadge;
    }

    public /* synthetic */ AvatarSize(float f, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Typography typography, boolean z, boolean z2, float f2, float f3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, iconSize, typography, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? com.paypal.pds.core.ConstantsKt.getSize0() : f2, (i & 64) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(-com.paypal.pds.core.ConstantsKt.getSize8()) : f3, null);
    }

    /* renamed from: getBadgePipPadding-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getBadgePipPadding() {
        return this.badgePipPadding;
    }

    /* renamed from: getOverlapOffset-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getOverlapOffset() {
        return this.overlapOffset;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/AvatarSize$XSmall;", "Lcom/paypal/pds/components/AvatarSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class XSmall extends com.paypal.pds.components.AvatarSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarSize.XSmall INSTANCE = new com.paypal.pds.components.AvatarSize.XSmall();

        private XSmall() {
            super(com.paypal.pds.core.ConstantsKt.getSize24(), com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, false, false, 0.0f, 0.0f, 104, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/AvatarSize$Small;", "Lcom/paypal/pds/components/AvatarSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Small extends com.paypal.pds.components.AvatarSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarSize.Small INSTANCE = new com.paypal.pds.components.AvatarSize.Small();

        private Small() {
            super(com.paypal.pds.core.ConstantsKt.getSize32(), com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, false, false, 0.0f, 0.0f, 120, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/AvatarSize$Medium;", "Lcom/paypal/pds/components/AvatarSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Medium extends com.paypal.pds.components.AvatarSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarSize.Medium INSTANCE = new com.paypal.pds.components.AvatarSize.Medium();

        private Medium() {
            super(com.paypal.pds.core.ConstantsKt.getSize40(), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, false, false, 0.0f, 0.0f, 120, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/AvatarSize$Large;", "Lcom/paypal/pds/components/AvatarSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Large extends com.paypal.pds.components.AvatarSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarSize.Large INSTANCE = new com.paypal.pds.components.AvatarSize.Large();

        private Large() {
            super(com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, true, false, 0.0f, 0.0f, 112, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/AvatarSize$XLarge;", "Lcom/paypal/pds/components/AvatarSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class XLarge extends com.paypal.pds.components.AvatarSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.AvatarSize.XLarge INSTANCE = new com.paypal.pds.components.AvatarSize.XLarge();

        private XLarge() {
            super(com.paypal.pds.core.ConstantsKt.getSize64(), com.paypal.pds.components.IconSize.IconSize28.INSTANCE, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, true, false, com.paypal.pds.core.ConstantsKt.getSize2(), 0.0f, 80, null);
        }
    }

    public /* synthetic */ AvatarSize(float f, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Typography typography, boolean z, boolean z2, float f2, float f3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, iconSize, typography, z, z2, f2, f3);
    }
}
