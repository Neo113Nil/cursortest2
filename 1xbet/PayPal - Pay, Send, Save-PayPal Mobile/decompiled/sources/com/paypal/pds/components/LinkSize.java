package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/pds/components/LinkSize;", "", "Lcom/paypal/pds/core/Typography;", "p0", "<init>", "(Lcom/paypal/pds/core/Typography;)V", "linkTypography", "Lcom/paypal/pds/core/Typography;", "getLinkTypography$pds_release", "()Lcom/paypal/pds/core/Typography;", "Small", "Medium", "Large", "Lcom/paypal/pds/components/LinkSize$Large;", "Lcom/paypal/pds/components/LinkSize$Medium;", "Lcom/paypal/pds/components/LinkSize$Small;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkSize {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Typography linkTypography;

    private LinkSize(com.paypal.pds.core.Typography typography) {
        this.linkTypography = typography;
    }

    /* renamed from: getLinkTypography$pds_release, reason: from getter */
    public final com.paypal.pds.core.Typography getLinkTypography() {
        return this.linkTypography;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/LinkSize$Small;", "Lcom/paypal/pds/components/LinkSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Small extends com.paypal.pds.components.LinkSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.LinkSize.Small INSTANCE = new com.paypal.pds.components.LinkSize.Small();

        private Small() {
            super(com.paypal.pds.core.Typography.LinkSmall.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/LinkSize$Medium;", "Lcom/paypal/pds/components/LinkSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Medium extends com.paypal.pds.components.LinkSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.LinkSize.Medium INSTANCE = new com.paypal.pds.components.LinkSize.Medium();

        private Medium() {
            super(com.paypal.pds.core.Typography.LinkMedium.INSTANCE, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/LinkSize$Large;", "Lcom/paypal/pds/components/LinkSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Large extends com.paypal.pds.components.LinkSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.LinkSize.Large INSTANCE = new com.paypal.pds.components.LinkSize.Large();

        private Large() {
            super(com.paypal.pds.core.Typography.LinkLarge.INSTANCE, null);
        }
    }

    public /* synthetic */ LinkSize(com.paypal.pds.core.Typography typography, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typography);
    }
}
