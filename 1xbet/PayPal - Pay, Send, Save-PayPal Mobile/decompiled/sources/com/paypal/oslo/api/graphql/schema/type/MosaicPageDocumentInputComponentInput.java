package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageDocumentInputComponentInput;", "", "", "componentId", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageDocumentInput;", "document", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageDocumentInput;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageDocumentInput;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageDocumentInput;)Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageDocumentInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageDocumentInput;", "getDocument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MosaicPageDocumentInputComponentInput {
    private final java.lang.String componentId;
    private final com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInput document;

    public MosaicPageDocumentInputComponentInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInput mosaicPageDocumentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageDocumentInput, "");
        this.componentId = str;
        this.document = mosaicPageDocumentInput;
    }

    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInput getDocument() {
        return this.document;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.componentId;
        com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInput mosaicPageDocumentInput = this.document;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicPageDocumentInputComponentInput(componentId=");
        sb.append(str);
        sb.append(", document=");
        sb.append(mosaicPageDocumentInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.componentId.hashCode() * 31) + this.document.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInputComponentInput mosaicPageDocumentInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInputComponentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.componentId, mosaicPageDocumentInputComponentInput.componentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.document, mosaicPageDocumentInputComponentInput.document);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInputComponentInput copy(java.lang.String componentId, com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInput document) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(document, "");
        return new com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInputComponentInput(componentId, document);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInput getDocument() {
        return this.document;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInputComponentInput mosaicPageDocumentInputComponentInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MosaicPageDocumentInput mosaicPageDocumentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mosaicPageDocumentInputComponentInput.componentId;
        }
        if ((i & 2) != 0) {
            mosaicPageDocumentInput = mosaicPageDocumentInputComponentInput.document;
        }
        return mosaicPageDocumentInputComponentInput.copy(str, mosaicPageDocumentInput);
    }
}
