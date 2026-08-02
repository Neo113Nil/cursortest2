package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "autopayOnModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "autopayOffModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayUpdatedModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "getAutopayOnModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "getAutopayOffModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutopayUpdatedModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel;
    private final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel;

    public AutopayUpdatedModel(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel) {
        this.autopayOnModel = autopayOnModel;
        this.autopayOffModel = autopayOffModel;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel getAutopayOnModel() {
        return this.autopayOnModel;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel getAutopayOffModel() {
        return this.autopayOffModel;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel = this.autopayOnModel;
        com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel = this.autopayOffModel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayUpdatedModel(autopayOnModel=");
        sb.append(autopayOnModel);
        sb.append(", autopayOffModel=");
        sb.append(autopayOffModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel = this.autopayOnModel;
        int hashCode = autopayOnModel == null ? 0 : autopayOnModel.hashCode();
        com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel = this.autopayOffModel;
        return (hashCode * 31) + (autopayOffModel != null ? autopayOffModel.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel autopayUpdatedModel = (com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOnModel, autopayUpdatedModel.autopayOnModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOffModel, autopayUpdatedModel.autopayOffModel);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel copy(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel) {
        return new com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel(autopayOnModel, autopayOffModel);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel getAutopayOffModel() {
        return this.autopayOffModel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel getAutopayOnModel() {
        return this.autopayOnModel;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel autopayUpdatedModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            autopayOnModel = autopayUpdatedModel.autopayOnModel;
        }
        if ((i & 2) != 0) {
            autopayOffModel = autopayUpdatedModel.autopayOffModel;
        }
        return autopayUpdatedModel.copy(autopayOnModel, autopayOffModel);
    }
}
