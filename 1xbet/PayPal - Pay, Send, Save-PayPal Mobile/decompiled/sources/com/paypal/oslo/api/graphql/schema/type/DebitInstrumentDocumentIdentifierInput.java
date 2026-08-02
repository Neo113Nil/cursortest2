package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDocumentIdentifierInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;", "subType", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDocumentIdentifierInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;", "getSubType", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DebitInstrumentDocumentIdentifierInput {
    private final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType subType;
    private final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType type;
    private final java.lang.String value;

    public DebitInstrumentDocumentIdentifierInput(com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType identityDocumentSubType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityDocumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityDocumentSubType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = identityDocumentType;
        this.subType = identityDocumentSubType;
        this.value = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType getType() {
        return this.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType getSubType() {
        return this.subType;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType = this.type;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType identityDocumentSubType = this.subType;
        java.lang.String str = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentDocumentIdentifierInput(type=");
        sb.append(identityDocumentType);
        sb.append(", subType=");
        sb.append(identityDocumentSubType);
        sb.append(", value=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.subType.hashCode()) * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDocumentIdentifierInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDocumentIdentifierInput debitInstrumentDocumentIdentifierInput = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDocumentIdentifierInput) other;
        return this.type == debitInstrumentDocumentIdentifierInput.type && this.subType == debitInstrumentDocumentIdentifierInput.subType && kotlin.jvm.internal.Intrinsics.areEqual(this.value, debitInstrumentDocumentIdentifierInput.value);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDocumentIdentifierInput copy(com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType type, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType subType, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDocumentIdentifierInput(type, subType, value);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType getSubType() {
        return this.subType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDocumentIdentifierInput copy$default(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDocumentIdentifierInput debitInstrumentDocumentIdentifierInput, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType identityDocumentSubType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            identityDocumentType = debitInstrumentDocumentIdentifierInput.type;
        }
        if ((i & 2) != 0) {
            identityDocumentSubType = debitInstrumentDocumentIdentifierInput.subType;
        }
        if ((i & 4) != 0) {
            str = debitInstrumentDocumentIdentifierInput.value;
        }
        return debitInstrumentDocumentIdentifierInput.copy(identityDocumentType, identityDocumentSubType, str);
    }
}
