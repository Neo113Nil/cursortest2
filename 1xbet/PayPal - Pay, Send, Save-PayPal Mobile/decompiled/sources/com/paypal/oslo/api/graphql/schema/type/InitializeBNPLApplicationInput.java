package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationInput;", "", "applicationSessionId", "", "Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationProductInput;", "product", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getApplicationSessionId", "Ljava/util/List;", "getProduct"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InitializeBNPLApplicationInput {
    private final java.lang.Object applicationSessionId;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationProductInput> product;

    public InitializeBNPLApplicationInput(java.lang.Object obj, java.util.List<com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationProductInput> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.applicationSessionId = obj;
        this.product = list;
    }

    public final java.lang.Object getApplicationSessionId() {
        return this.applicationSessionId;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationProductInput> getProduct() {
        return this.product;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.applicationSessionId;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationProductInput> list = this.product;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeBNPLApplicationInput(applicationSessionId=");
        sb.append(obj);
        sb.append(", product=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.applicationSessionId.hashCode() * 31) + this.product.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput initializeBNPLApplicationInput = (com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.applicationSessionId, initializeBNPLApplicationInput.applicationSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, initializeBNPLApplicationInput.product);
    }

    public final com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput copy(java.lang.Object applicationSessionId, java.util.List<com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationProductInput> product) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        return new com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput(applicationSessionId, product);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationProductInput> component2() {
        return this.product;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getApplicationSessionId() {
        return this.applicationSessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput copy$default(com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput initializeBNPLApplicationInput, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = initializeBNPLApplicationInput.applicationSessionId;
        }
        if ((i & 2) != 0) {
            list = initializeBNPLApplicationInput.product;
        }
        return initializeBNPLApplicationInput.copy(obj, list);
    }
}
