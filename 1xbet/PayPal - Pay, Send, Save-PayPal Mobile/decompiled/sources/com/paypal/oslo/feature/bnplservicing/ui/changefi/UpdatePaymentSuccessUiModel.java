package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessContent;", "content", "", "imageRes", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessContent;I)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessContent;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessContent;I)Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/UpdatePaymentSuccessContent;", "getContent", com.visa.cbp.getEncExpo.warmup, "getImageRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdatePaymentSuccessUiModel {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent content;
    private final int imageRes;

    public UpdatePaymentSuccessUiModel(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent updatePaymentSuccessContent, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentSuccessContent, "");
        this.content = updatePaymentSuccessContent;
        this.imageRes = i;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent getContent() {
        return this.content;
    }

    public final int getImageRes() {
        return this.imageRes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent updatePaymentSuccessContent = this.content;
        int i = this.imageRes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentSuccessUiModel(content=");
        sb.append(updatePaymentSuccessContent);
        sb.append(", imageRes=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.content.hashCode() * 31) + java.lang.Integer.hashCode(this.imageRes);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel = (com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, updatePaymentSuccessUiModel.content) && this.imageRes == updatePaymentSuccessUiModel.imageRes;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent content, int imageRes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel(content, imageRes);
    }

    /* renamed from: component2, reason: from getter */
    public final int getImageRes() {
        return this.imageRes;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent getContent() {
        return this.content;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel updatePaymentSuccessUiModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessContent updatePaymentSuccessContent, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            updatePaymentSuccessContent = updatePaymentSuccessUiModel.content;
        }
        if ((i2 & 2) != 0) {
            i = updatePaymentSuccessUiModel.imageRes;
        }
        return updatePaymentSuccessUiModel.copy(updatePaymentSuccessContent, i);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    }
}
