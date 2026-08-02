package com.paypal.oslo.feature.bnplservicing.domain.model.application.input;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/input/ApplicationEligibilityInput;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifiers", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowContext;", "flowContext", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowContext;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowContext;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowContext;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/input/ApplicationEligibilityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCreditProductIdentifiers", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowContext;", "getFlowContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApplicationEligibilityInput {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> creditProductIdentifiers;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext flowContext;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplicationEligibilityInput(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext flowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        this.creditProductIdentifiers = list;
        this.flowContext = flowContext;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> getCreditProductIdentifiers() {
        return this.creditProductIdentifiers;
    }

    public /* synthetic */ ApplicationEligibilityInput(java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext flowContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext(null, null, null, null, 15, null) : flowContext);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list = this.creditProductIdentifiers;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext flowContext = this.flowContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationEligibilityInput(creditProductIdentifiers=");
        sb.append(list);
        sb.append(", flowContext=");
        sb.append(flowContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.creditProductIdentifiers.hashCode() * 31) + this.flowContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput applicationEligibilityInput = (com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifiers, applicationEligibilityInput.creditProductIdentifiers) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContext, applicationEligibilityInput.flowContext);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput copy(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> creditProductIdentifiers, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext flowContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifiers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput(creditProductIdentifiers, flowContext);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext getFlowContext() {
        return this.flowContext;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> component1() {
        return this.creditProductIdentifiers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput applicationEligibilityInput, java.util.List list, com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext flowContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = applicationEligibilityInput.creditProductIdentifiers;
        }
        if ((i & 2) != 0) {
            flowContext = applicationEligibilityInput.flowContext;
        }
        return applicationEligibilityInput.copy(list, flowContext);
    }
}
