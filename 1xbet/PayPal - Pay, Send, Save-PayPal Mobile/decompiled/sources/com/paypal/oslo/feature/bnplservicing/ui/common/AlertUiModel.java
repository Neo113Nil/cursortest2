package com.paypal.oslo.feature.bnplservicing.ui.common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/AlertUiModel;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$AlertContext;", "context", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$ActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$AlertContext;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$ActionType;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$AlertContext;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$ActionType;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$AlertContext;Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$ActionType;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/AlertUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$AlertContext;", "getContext", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay$ActionType;", "getActionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AlertUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext context;

    public AlertUiModel(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType) {
        this.context = alertContext;
        this.actionType = actionType;
    }

    public /* synthetic */ AlertUiModel(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : alertContext, (i & 2) != 0 ? null : actionType);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext getContext() {
        return this.context;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType getActionType() {
        return this.actionType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext = this.context;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType = this.actionType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AlertUiModel(context=");
        sb.append(alertContext);
        sb.append(", actionType=");
        sb.append(actionType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext = this.context;
        int hashCode = alertContext == null ? 0 : alertContext.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType = this.actionType;
        return (hashCode * 31) + (actionType != null ? actionType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.AlertUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.common.AlertUiModel alertUiModel = (com.paypal.oslo.feature.bnplservicing.ui.common.AlertUiModel) other;
        return this.context == alertUiModel.context && this.actionType == alertUiModel.actionType;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.AlertUiModel copy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext context, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType) {
        return new com.paypal.oslo.feature.bnplservicing.ui.common.AlertUiModel(context, actionType);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext getContext() {
        return this.context;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.AlertUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.AlertUiModel alertUiModel, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            alertContext = alertUiModel.context;
        }
        if ((i & 2) != 0) {
            actionType = alertUiModel.actionType;
        }
        return alertUiModel.copy(alertContext, actionType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertUiModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
