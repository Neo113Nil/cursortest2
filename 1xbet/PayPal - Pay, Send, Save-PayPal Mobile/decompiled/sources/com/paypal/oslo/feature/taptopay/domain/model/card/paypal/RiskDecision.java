package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;", "", "", "id", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/DecisionCode;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_DECISION_CODE, "decisionMessage", "contextId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/DecisionCode;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/DecisionCode;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/DecisionCode;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/RiskDecision;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/DecisionCode;", "getDecisionCode", "getDecisionMessage", "getContextId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RiskDecision {
    public static final int $stable = 0;
    private final java.lang.String contextId;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode;
    private final java.lang.String decisionMessage;
    private final java.lang.String id;

    public RiskDecision(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode, java.lang.String str2, java.lang.String str3) {
        this.id = str;
        this.decisionCode = decisionCode;
        this.decisionMessage = str2;
        this.contextId = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode getDecisionCode() {
        return this.decisionCode;
    }

    public final java.lang.String getDecisionMessage() {
        return this.decisionMessage;
    }

    public final java.lang.String getContextId() {
        return this.contextId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode = this.decisionCode;
        java.lang.String str2 = this.decisionMessage;
        java.lang.String str3 = this.contextId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RiskDecision(id=");
        sb.append(str);
        sb.append(", decisionCode=");
        sb.append(decisionCode);
        sb.append(", decisionMessage=");
        sb.append(str2);
        sb.append(", contextId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode = this.decisionCode;
        int hashCode2 = decisionCode == null ? 0 : decisionCode.hashCode();
        java.lang.String str2 = this.decisionMessage;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.contextId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, riskDecision.id) && this.decisionCode == riskDecision.decisionCode && kotlin.jvm.internal.Intrinsics.areEqual(this.decisionMessage, riskDecision.decisionMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.contextId, riskDecision.contextId);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision copy(java.lang.String id, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode, java.lang.String decisionMessage, java.lang.String contextId) {
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision(id, decisionCode, decisionMessage, contextId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getContextId() {
        return this.contextId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDecisionMessage() {
        return this.decisionMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode getDecisionCode() {
        return this.decisionCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.RiskDecision riskDecision, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = riskDecision.id;
        }
        if ((i & 2) != 0) {
            decisionCode = riskDecision.decisionCode;
        }
        if ((i & 4) != 0) {
            str2 = riskDecision.decisionMessage;
        }
        if ((i & 8) != 0) {
            str3 = riskDecision.contextId;
        }
        return riskDecision.copy(str, decisionCode, str2, str3);
    }
}
