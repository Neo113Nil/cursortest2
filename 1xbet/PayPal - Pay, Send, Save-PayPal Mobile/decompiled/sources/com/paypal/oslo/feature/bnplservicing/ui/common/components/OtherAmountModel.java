package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/OtherAmountModel;", "", "", "label", "inputLabel", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/OtherAmountModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "getInputLabel", "getCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OtherAmountModel {
    public static final int $stable = 0;
    private final java.lang.String currency;
    private final java.lang.String inputLabel;
    private final java.lang.String label;

    public OtherAmountModel(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.inputLabel = str2;
        this.currency = str3;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getInputLabel() {
        return this.inputLabel;
    }

    public /* synthetic */ OtherAmountModel(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "USD" : str3);
    }

    public final java.lang.String getCurrency() {
        return this.currency;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        java.lang.String str2 = this.inputLabel;
        java.lang.String str3 = this.currency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OtherAmountModel(label=");
        sb.append(str);
        sb.append(", inputLabel=");
        sb.append(str2);
        sb.append(", currency=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.label.hashCode() * 31) + this.inputLabel.hashCode()) * 31) + this.currency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel otherAmountModel = (com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, otherAmountModel.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.inputLabel, otherAmountModel.inputLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, otherAmountModel.currency);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel copy(java.lang.String label, java.lang.String inputLabel, java.lang.String currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputLabel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel(label, inputLabel, currency);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInputLabel() {
        return this.inputLabel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel otherAmountModel, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = otherAmountModel.label;
        }
        if ((i & 2) != 0) {
            str2 = otherAmountModel.inputLabel;
        }
        if ((i & 4) != 0) {
            str3 = otherAmountModel.currency;
        }
        return otherAmountModel.copy(str, str2, str3);
    }
}
