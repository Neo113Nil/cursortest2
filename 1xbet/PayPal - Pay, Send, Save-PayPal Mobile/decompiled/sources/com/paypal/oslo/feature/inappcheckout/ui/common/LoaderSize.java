package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0004\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "p1", "<init>", "(FF)V", io.ktor.http.ContentDisposition.Parameters.Size, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSize-D9Ej5fM", "()F", "borderWidth", "getBorderWidth-D9Ej5fM", "Large", "Medium", "Small", "XSmall", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$Large;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$Medium;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$Small;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$XSmall;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class LoaderSize {
    public static final int $stable = 0;
    private final float borderWidth;
    private final float size;

    private LoaderSize(float f, float f2) {
        this.size = f;
        this.borderWidth = f2;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$Large;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Large extends com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Large INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Large();

        private Large() {
            super(com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize4(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$Medium;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Medium extends com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Medium INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Medium();

        private Medium() {
            super(com.paypal.pds.core.ConstantsKt.getSize24(), com.paypal.pds.core.ConstantsKt.getSize2(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$Small;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Small extends com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Small INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Small();

        private Small() {
            super(com.paypal.pds.core.ConstantsKt.getSize20(), com.paypal.pds.core.ConstantsKt.getSize2(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize$XSmall;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class XSmall extends com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.XSmall INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.XSmall();

        private XSmall() {
            super(com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize2(), null);
        }
    }

    public /* synthetic */ LoaderSize(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
