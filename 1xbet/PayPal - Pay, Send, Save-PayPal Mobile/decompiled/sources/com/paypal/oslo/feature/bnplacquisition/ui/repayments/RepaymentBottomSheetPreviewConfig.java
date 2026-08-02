package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentBottomSheetPreviewConfig;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "p0", "", "p1", "", "p2", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "p3", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "p4", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class RepaymentBottomSheetPreviewConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.paypal.oslo.core.commonui.utils.RefText Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    private RepaymentBottomSheetPreviewConfig(java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> list, java.lang.String str, boolean z, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = refText;
        this.getHighResolutionOutputSizeshNQ4ISI = fullscreenErrorUiModel;
    }

    public /* synthetic */ RepaymentBottomSheetPreviewConfig(java.util.List list, java.lang.String str, boolean z, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : refText, (i & 16) != 0 ? null : fullscreenErrorUiModel);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> list = this.getHighSpeedVideoSizes;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RepaymentBottomSheetPreviewConfig(getHighSpeedVideoSizes=");
        sb.append(list);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(z);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(refText);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(fullscreenErrorUiModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> list = this.getHighSpeedVideoSizes;
        int hashCode = list == null ? 0 : list.hashCode();
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
        com.paypal.oslo.core.commonui.utils.RefText refText = this.Camera2StreamConfigurationMap;
        int hashCode4 = refText == null ? 0 : refText.hashCode();
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (fullscreenErrorUiModel != null ? fullscreenErrorUiModel.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig repaymentBottomSheetPreviewConfig = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentBottomSheetPreviewConfig) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, repaymentBottomSheetPreviewConfig.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, repaymentBottomSheetPreviewConfig.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoFpsRangesFor == repaymentBottomSheetPreviewConfig.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, repaymentBottomSheetPreviewConfig.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, repaymentBottomSheetPreviewConfig.getHighResolutionOutputSizeshNQ4ISI);
    }
}
