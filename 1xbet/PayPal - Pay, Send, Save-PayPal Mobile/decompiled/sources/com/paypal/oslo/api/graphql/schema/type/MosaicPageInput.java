package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageQualifiedIntentInput;", "qualifiedIntent", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageQualifiedIntentInput;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageQualifiedIntentInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageQualifiedIntentInput;)Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageQualifiedIntentInput;", "getQualifiedIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MosaicPageInput {
    private final com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput qualifiedIntent;

    public MosaicPageInput(com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput mosaicPageQualifiedIntentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageQualifiedIntentInput, "");
        this.qualifiedIntent = mosaicPageQualifiedIntentInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput getQualifiedIntent() {
        return this.qualifiedIntent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput mosaicPageQualifiedIntentInput = this.qualifiedIntent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicPageInput(qualifiedIntent=");
        sb.append(mosaicPageQualifiedIntentInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.qualifiedIntent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.MosaicPageInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifiedIntent, ((com.paypal.oslo.api.graphql.schema.type.MosaicPageInput) other).qualifiedIntent);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageInput copy(com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput qualifiedIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifiedIntent, "");
        return new com.paypal.oslo.api.graphql.schema.type.MosaicPageInput(qualifiedIntent);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput getQualifiedIntent() {
        return this.qualifiedIntent;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MosaicPageInput copy$default(com.paypal.oslo.api.graphql.schema.type.MosaicPageInput mosaicPageInput, com.paypal.oslo.api.graphql.schema.type.MosaicPageQualifiedIntentInput mosaicPageQualifiedIntentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mosaicPageQualifiedIntentInput = mosaicPageInput.qualifiedIntent;
        }
        return mosaicPageInput.copy(mosaicPageQualifiedIntentInput);
    }
}
