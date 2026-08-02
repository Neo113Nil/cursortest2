package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionUiItem;", "", "Lcom/paypal/pds/components/ListItem;", "p0", "", "p1", "Lkotlin/Function0;", "", "p2", "<init>", "(Lcom/paypal/pds/components/ListItem;ZLkotlin/jvm/functions/Function0;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/pds/components/ListItem;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class FundingOptionUiItem {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final boolean getHighSpeedVideoFpsRangesFor;
    final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.pds.components.ListItem Camera2StreamConfigurationMap;

    public FundingOptionUiItem(com.paypal.pds.components.ListItem listItem, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = listItem;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = function0;
    }

    public /* synthetic */ FundingOptionUiItem(com.paypal.pds.components.ListItem listItem, boolean z, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(listItem, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionUiItem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0);
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.ListItem listItem = this.Camera2StreamConfigurationMap;
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOptionUiItem(Camera2StreamConfigurationMap=");
        sb.append(listItem);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(z);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.Camera2StreamConfigurationMap.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionUiItem)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionUiItem fundingOptionUiItem = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionUiItem) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, fundingOptionUiItem.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRangesFor == fundingOptionUiItem.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, fundingOptionUiItem.getHighSpeedVideoFpsRanges);
    }
}
