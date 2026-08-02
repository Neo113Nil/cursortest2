package com.paypal.oslo.feature.bnplservicing.ui.plandetails.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/PlanDetailHeaderUiModel;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/PlansHeaderUiModel;", "", "merchantName", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "paymentButtonText", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderContentModel;", "contentModel", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderContentModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderContentModel;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderContentModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/PlanDetailHeaderUiModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantName", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getPaymentButtonText", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderContentModel;", "getContentModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlanDetailHeaderUiModel implements com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlansHeaderUiModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderContentModel contentModel;
    private final java.lang.String merchantName;
    private final com.paypal.oslo.core.commonui.utils.RefText paymentButtonText;

    public PlanDetailHeaderUiModel(java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderContentModel planDetailHeaderContentModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetailHeaderContentModel, "");
        this.merchantName = str;
        this.paymentButtonText = refText;
        this.contentModel = planDetailHeaderContentModel;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlansHeaderUiModel
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPaymentButtonText() {
        return this.paymentButtonText;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderContentModel getContentModel() {
        return this.contentModel;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.merchantName;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.paymentButtonText;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderContentModel planDetailHeaderContentModel = this.contentModel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanDetailHeaderUiModel(merchantName=");
        sb.append(str);
        sb.append(", paymentButtonText=");
        sb.append(refText);
        sb.append(", contentModel=");
        sb.append(planDetailHeaderContentModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.merchantName.hashCode() * 31) + this.paymentButtonText.hashCode()) * 31) + this.contentModel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanDetailHeaderUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanDetailHeaderUiModel planDetailHeaderUiModel = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanDetailHeaderUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, planDetailHeaderUiModel.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentButtonText, planDetailHeaderUiModel.paymentButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentModel, planDetailHeaderUiModel.contentModel);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanDetailHeaderUiModel copy(java.lang.String merchantName, com.paypal.oslo.core.commonui.utils.RefText paymentButtonText, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderContentModel contentModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentButtonText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentModel, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanDetailHeaderUiModel(merchantName, paymentButtonText, contentModel);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderContentModel getContentModel() {
        return this.contentModel;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getPaymentButtonText() {
        return this.paymentButtonText;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanDetailHeaderUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanDetailHeaderUiModel planDetailHeaderUiModel, java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderContentModel planDetailHeaderContentModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = planDetailHeaderUiModel.merchantName;
        }
        if ((i & 2) != 0) {
            refText = planDetailHeaderUiModel.paymentButtonText;
        }
        if ((i & 4) != 0) {
            planDetailHeaderContentModel = planDetailHeaderUiModel.contentModel;
        }
        return planDetailHeaderUiModel.copy(str, refText, planDetailHeaderContentModel);
    }
}
