package com.paypal.oslo.feature.bnplservicing.ui.plandetails.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/PlanSimpleHeaderUiModel;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/PlansHeaderUiModel;", "", "merchantName", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;", "paymentProgressBarModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSimpleHeaderAlertModel;", "alertModel", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSimpleHeaderAlertModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSimpleHeaderAlertModel;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSimpleHeaderAlertModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/PlanSimpleHeaderUiModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantName", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;", "getPaymentProgressBarModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanSimpleHeaderAlertModel;", "getAlertModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlanSimpleHeaderUiModel implements com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlansHeaderUiModel {
    public static final int $stable = com.paypal.pds.components.ContextualAlertStyle.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel alertModel;
    private final java.lang.String merchantName;
    private final com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel;

    public PlanSimpleHeaderUiModel(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.merchantName = str;
        this.paymentProgressBarModel = paymentProgressBarModel;
        this.alertModel = planSimpleHeaderAlertModel;
    }

    public /* synthetic */ PlanSimpleHeaderUiModel(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : paymentProgressBarModel, (i & 4) != 0 ? null : planSimpleHeaderAlertModel);
    }

    @Override // com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlansHeaderUiModel
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel getPaymentProgressBarModel() {
        return this.paymentProgressBarModel;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel getAlertModel() {
        return this.alertModel;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.merchantName;
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel = this.paymentProgressBarModel;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel = this.alertModel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanSimpleHeaderUiModel(merchantName=");
        sb.append(str);
        sb.append(", paymentProgressBarModel=");
        sb.append(paymentProgressBarModel);
        sb.append(", alertModel=");
        sb.append(planSimpleHeaderAlertModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.merchantName.hashCode();
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel = this.paymentProgressBarModel;
        int hashCode2 = paymentProgressBarModel == null ? 0 : paymentProgressBarModel.hashCode();
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel = this.alertModel;
        return (((hashCode * 31) + hashCode2) * 31) + (planSimpleHeaderAlertModel != null ? planSimpleHeaderAlertModel.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSimpleHeaderUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSimpleHeaderUiModel planSimpleHeaderUiModel = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSimpleHeaderUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, planSimpleHeaderUiModel.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentProgressBarModel, planSimpleHeaderUiModel.paymentProgressBarModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.alertModel, planSimpleHeaderUiModel.alertModel);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSimpleHeaderUiModel copy(java.lang.String merchantName, com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel alertModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSimpleHeaderUiModel(merchantName, paymentProgressBarModel, alertModel);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel getAlertModel() {
        return this.alertModel;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel getPaymentProgressBarModel() {
        return this.paymentProgressBarModel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSimpleHeaderUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSimpleHeaderUiModel planSimpleHeaderUiModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel paymentProgressBarModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel planSimpleHeaderAlertModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = planSimpleHeaderUiModel.merchantName;
        }
        if ((i & 2) != 0) {
            paymentProgressBarModel = planSimpleHeaderUiModel.paymentProgressBarModel;
        }
        if ((i & 4) != 0) {
            planSimpleHeaderAlertModel = planSimpleHeaderUiModel.alertModel;
        }
        return planSimpleHeaderUiModel.copy(str, paymentProgressBarModel, planSimpleHeaderAlertModel);
    }
}
