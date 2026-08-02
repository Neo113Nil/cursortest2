package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/pds/core/FlagSize;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "<init>", "(F)V", "flagSize", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFlagSize-D9Ej5fM$pds_release", "()F", "XSmall", "Small", "Medium", "Large", "XLarge", "Lcom/paypal/pds/core/FlagSize$Large;", "Lcom/paypal/pds/core/FlagSize$Medium;", "Lcom/paypal/pds/core/FlagSize$Small;", "Lcom/paypal/pds/core/FlagSize$XLarge;", "Lcom/paypal/pds/core/FlagSize$XSmall;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class FlagSize {
    public static final int $stable = 0;
    private final float flagSize;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/FlagSize$XSmall;", "Lcom/paypal/pds/core/FlagSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class XSmall extends com.paypal.pds.core.FlagSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.FlagSize.XSmall INSTANCE = new com.paypal.pds.core.FlagSize.XSmall();

        private XSmall() {
            super(com.paypal.pds.core.ConstantsKt.getSize24(), null);
        }
    }

    private FlagSize(float f) {
        this.flagSize = f;
    }

    /* renamed from: getFlagSize-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getFlagSize() {
        return this.flagSize;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/FlagSize$Small;", "Lcom/paypal/pds/core/FlagSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Small extends com.paypal.pds.core.FlagSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.FlagSize.Small INSTANCE = new com.paypal.pds.core.FlagSize.Small();

        private Small() {
            super(com.paypal.pds.core.ConstantsKt.getSize32(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/FlagSize$Medium;", "Lcom/paypal/pds/core/FlagSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Medium extends com.paypal.pds.core.FlagSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.FlagSize.Medium INSTANCE = new com.paypal.pds.core.FlagSize.Medium();

        private Medium() {
            super(com.paypal.pds.core.ConstantsKt.getSize40(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/FlagSize$Large;", "Lcom/paypal/pds/core/FlagSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Large extends com.paypal.pds.core.FlagSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.FlagSize.Large INSTANCE = new com.paypal.pds.core.FlagSize.Large();

        private Large() {
            super(com.paypal.pds.core.ConstantsKt.getSize48(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/core/FlagSize$XLarge;", "Lcom/paypal/pds/core/FlagSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class XLarge extends com.paypal.pds.core.FlagSize {
        public static final int $stable = 0;
        public static final com.paypal.pds.core.FlagSize.XLarge INSTANCE = new com.paypal.pds.core.FlagSize.XLarge();

        private XLarge() {
            super(com.paypal.pds.core.ConstantsKt.getSize64(), null);
        }
    }

    public /* synthetic */ FlagSize(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }
}
