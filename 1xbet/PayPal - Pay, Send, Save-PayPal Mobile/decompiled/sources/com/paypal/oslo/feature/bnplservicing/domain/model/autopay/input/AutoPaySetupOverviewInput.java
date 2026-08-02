package com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/AutoPaySetupOverviewInput;", "", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;", "flowSpecifier", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/AutoPaySetupOverviewInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;", "getFlowSpecifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoPaySetupOverviewInput {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier;

    public AutoPaySetupOverviewInput(java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        this.creditAccountId = str;
        this.creditProductIdentifier = creditProductIdentifier;
        this.flowSpecifier = flowSpecifier;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier = this.flowSpecifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoPaySetupOverviewInput(creditAccountId=");
        sb.append(str);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", flowSpecifier=");
        sb.append(flowSpecifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditAccountId.hashCode() * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.flowSpecifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput autoPaySetupOverviewInput = (com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, autoPaySetupOverviewInput.creditAccountId) && this.creditProductIdentifier == autoPaySetupOverviewInput.creditProductIdentifier && this.flowSpecifier == autoPaySetupOverviewInput.flowSpecifier;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput copy(java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput(creditAccountId, creditProductIdentifier, flowSpecifier);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput autoPaySetupOverviewInput, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoPaySetupOverviewInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            creditProductIdentifier = autoPaySetupOverviewInput.creditProductIdentifier;
        }
        if ((i & 4) != 0) {
            flowSpecifier = autoPaySetupOverviewInput.flowSpecifier;
        }
        return autoPaySetupOverviewInput.copy(str, creditProductIdentifier, flowSpecifier);
    }
}
