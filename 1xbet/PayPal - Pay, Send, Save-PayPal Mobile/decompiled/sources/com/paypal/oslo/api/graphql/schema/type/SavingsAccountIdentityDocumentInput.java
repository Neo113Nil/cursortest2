package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountIdentityDocumentInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;", "subType", "", "idNumber", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;Ljava/lang/String;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountIdentityDocumentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/IdentityDocumentSubType;", "getSubType", "Ljava/lang/String;", "getIdNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SavingsAccountIdentityDocumentInput {
    private final java.lang.String idNumber;
    private final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType subType;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> type;

    /* JADX WARN: Multi-variable type inference failed */
    public SavingsAccountIdentityDocumentInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> optional, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType identityDocumentSubType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityDocumentSubType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = optional;
        this.subType = identityDocumentSubType;
        this.idNumber = str;
    }

    public /* synthetic */ SavingsAccountIdentityDocumentInput(com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType identityDocumentSubType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, identityDocumentSubType, str);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> getType() {
        return this.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType getSubType() {
        return this.subType;
    }

    public final java.lang.String getIdNumber() {
        return this.idNumber;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> optional = this.type;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType identityDocumentSubType = this.subType;
        java.lang.String str = this.idNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountIdentityDocumentInput(type=");
        sb.append(optional);
        sb.append(", subType=");
        sb.append(identityDocumentSubType);
        sb.append(", idNumber=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.subType.hashCode()) * 31) + this.idNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SavingsAccountIdentityDocumentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountIdentityDocumentInput savingsAccountIdentityDocumentInput = (com.paypal.oslo.api.graphql.schema.type.SavingsAccountIdentityDocumentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, savingsAccountIdentityDocumentInput.type) && this.subType == savingsAccountIdentityDocumentInput.subType && kotlin.jvm.internal.Intrinsics.areEqual(this.idNumber, savingsAccountIdentityDocumentInput.idNumber);
    }

    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountIdentityDocumentInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> type, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType subType, java.lang.String idNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idNumber, "");
        return new com.paypal.oslo.api.graphql.schema.type.SavingsAccountIdentityDocumentInput(type, subType, idNumber);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIdNumber() {
        return this.idNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType getSubType() {
        return this.subType;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> component1() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SavingsAccountIdentityDocumentInput copy$default(com.paypal.oslo.api.graphql.schema.type.SavingsAccountIdentityDocumentInput savingsAccountIdentityDocumentInput, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.IdentityDocumentSubType identityDocumentSubType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = savingsAccountIdentityDocumentInput.type;
        }
        if ((i & 2) != 0) {
            identityDocumentSubType = savingsAccountIdentityDocumentInput.subType;
        }
        if ((i & 4) != 0) {
            str = savingsAccountIdentityDocumentInput.idNumber;
        }
        return savingsAccountIdentityDocumentInput.copy(optional, identityDocumentSubType, str);
    }
}
