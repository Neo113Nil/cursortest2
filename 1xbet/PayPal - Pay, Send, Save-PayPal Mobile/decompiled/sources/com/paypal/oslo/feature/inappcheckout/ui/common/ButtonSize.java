package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u001f !B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\u0082\u0001\u0003\"#$"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;", "", "Lcom/paypal/pds/core/Typography;", "p0", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "p1", "Landroidx/compose/ui/unit/Dp;", "p2", "Landroidx/compose/foundation/layout/PaddingValues;", "p3", "p4", "<init>", "(Lcom/paypal/pds/core/Typography;Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;FLandroidx/compose/foundation/layout/PaddingValues;F)V", "typography", "Lcom/paypal/pds/core/Typography;", "getTypography", "()Lcom/paypal/pds/core/Typography;", "loaderSize", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "getLoaderSize", "()Lcom/paypal/oslo/feature/inappcheckout/ui/common/LoaderSize;", "minSize", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMinSize-D9Ej5fM", "()F", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "cornerRadius", "getCornerRadius-D9Ej5fM", "Large", "Medium", "Small", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize$Large;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize$Medium;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize$Small;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ButtonSize {
    public static final int $stable = 0;
    private final androidx.compose.foundation.layout.PaddingValues contentPadding;
    private final float cornerRadius;
    private final com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize loaderSize;
    private final float minSize;
    private final com.paypal.pds.core.Typography typography;

    private ButtonSize(com.paypal.pds.core.Typography typography, com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize loaderSize, float f, androidx.compose.foundation.layout.PaddingValues paddingValues, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaderSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "");
        this.typography = typography;
        this.loaderSize = loaderSize;
        this.minSize = f;
        this.contentPadding = paddingValues;
        this.cornerRadius = f2;
    }

    public final com.paypal.pds.core.Typography getTypography() {
        return this.typography;
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize getLoaderSize() {
        return this.loaderSize;
    }

    /* renamed from: getMinSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinSize() {
        return this.minSize;
    }

    public final androidx.compose.foundation.layout.PaddingValues getContentPadding() {
        return this.contentPadding;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize$Large;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Large extends com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Large INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Large();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Large() {
            super(r0, com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Medium.INSTANCE, r4, androidx.compose.foundation.layout.PaddingKt.m1700PaddingValuesYgX7TsA(com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing8()), com.paypal.pds.core.ConstantsKt.getSize24(), null);
            com.paypal.pds.core.Typography.LabelLarge labelLarge = com.paypal.pds.core.Typography.LabelLarge.INSTANCE;
            float size48 = com.paypal.pds.core.ConstantsKt.getSize48();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize$Medium;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Medium extends com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Medium INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Medium();

        private Medium() {
            super(com.paypal.pds.core.Typography.LabelMedium.INSTANCE, com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Small.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize40(), androidx.compose.foundation.layout.PaddingKt.m1700PaddingValuesYgX7TsA(com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), com.paypal.pds.core.ConstantsKt.getSize20(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize$Small;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Small extends com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Small INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Small();

        private Small() {
            super(com.paypal.pds.core.Typography.LabelSmall.INSTANCE, com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.XSmall.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32(), androidx.compose.foundation.layout.PaddingKt.m1700PaddingValuesYgX7TsA(com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing8()), com.paypal.pds.core.ConstantsKt.getSize16(), null);
        }
    }

    public /* synthetic */ ButtonSize(com.paypal.pds.core.Typography typography, com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize loaderSize, float f, androidx.compose.foundation.layout.PaddingValues paddingValues, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typography, loaderSize, f, paddingValues, f2);
    }
}
