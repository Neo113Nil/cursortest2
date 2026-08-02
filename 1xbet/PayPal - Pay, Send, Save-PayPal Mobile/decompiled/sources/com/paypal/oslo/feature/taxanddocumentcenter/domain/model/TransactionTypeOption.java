package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeOption;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "type", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "label", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "getType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "getLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TransactionTypeOption {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource label;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain type;

    public TransactionTypeOption(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTypeDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textResource, "");
        this.type = transactionTypeDomain;
        this.label = textResource;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getLabel() {
        return this.label;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain = this.type;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource = this.label;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionTypeOption(type=");
        sb.append(transactionTypeDomain);
        sb.append(", label=");
        sb.append(textResource);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.label.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption transactionTypeOption = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption) other;
        return this.type == transactionTypeOption.type && kotlin.jvm.internal.Intrinsics.areEqual(this.label, transactionTypeOption.label);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain type, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption(type, label);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeOption transactionTypeOption, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transactionTypeDomain = transactionTypeOption.type;
        }
        if ((i & 2) != 0) {
            textResource = transactionTypeOption.label;
        }
        return transactionTypeOption.copy(transactionTypeDomain, textResource);
    }
}
