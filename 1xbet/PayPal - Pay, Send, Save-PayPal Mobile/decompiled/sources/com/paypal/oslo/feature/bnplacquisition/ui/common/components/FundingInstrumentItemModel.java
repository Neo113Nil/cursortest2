package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/FundingInstrumentItemModel;", "", "", "name", "last4Digits", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/FundingInstrumentItemModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getLast4Digits", "getImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FundingInstrumentItemModel {
    public static final int $stable = 0;
    private final java.lang.String imageUrl;
    private final java.lang.String last4Digits;
    private final java.lang.String name;

    public FundingInstrumentItemModel(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.last4Digits = str2;
        this.imageUrl = str3;
    }

    public /* synthetic */ FundingInstrumentItemModel(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getLast4Digits() {
        return this.last4Digits;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.last4Digits;
        java.lang.String str3 = this.imageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentItemModel(name=");
        sb.append(str);
        sb.append(", last4Digits=");
        sb.append(str2);
        sb.append(", imageUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.last4Digits.hashCode();
        java.lang.String str = this.imageUrl;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel fundingInstrumentItemModel = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrumentItemModel.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.last4Digits, fundingInstrumentItemModel.last4Digits) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, fundingInstrumentItemModel.imageUrl);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel copy(java.lang.String name2, java.lang.String last4Digits, java.lang.String imageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(last4Digits, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel(name2, last4Digits, imageUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLast4Digits() {
        return this.last4Digits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel fundingInstrumentItemModel, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingInstrumentItemModel.name;
        }
        if ((i & 2) != 0) {
            str2 = fundingInstrumentItemModel.last4Digits;
        }
        if ((i & 4) != 0) {
            str3 = fundingInstrumentItemModel.imageUrl;
        }
        return fundingInstrumentItemModel.copy(str, str2, str3);
    }
}
