package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocUploadInputComponentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;", "documentCategory", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentType;", "documentType", "", "referenceId", "Lcom/apollographql/apollo/api/Optional;", "submitId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentType;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentType;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentType;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocUploadInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentCategory;", "getDocumentCategory", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDocumentType;", "getDocumentType", "Ljava/lang/String;", "getReferenceId", "Lcom/apollographql/apollo/api/Optional;", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardDocUploadInputComponentInput {
    private final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory documentCategory;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType documentType;
    private final java.lang.String referenceId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;

    public OnboardDocUploadInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType onboardDocumentType, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardDocumentCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardDocumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.documentCategory = onboardDocumentCategory;
        this.documentType = onboardDocumentType;
        this.referenceId = str;
        this.submitId = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory getDocumentCategory() {
        return this.documentCategory;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType getDocumentType() {
        return this.documentType;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public /* synthetic */ OnboardDocUploadInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType onboardDocumentType, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onboardDocumentCategory, onboardDocumentType, str, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory = this.documentCategory;
        com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType onboardDocumentType = this.documentType;
        java.lang.String str = this.referenceId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardDocUploadInputComponentInput(documentCategory=");
        sb.append(onboardDocumentCategory);
        sb.append(", documentType=");
        sb.append(onboardDocumentType);
        sb.append(", referenceId=");
        sb.append(str);
        sb.append(", submitId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.documentCategory.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.referenceId.hashCode()) * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput onboardDocUploadInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput) other;
        return this.documentCategory == onboardDocUploadInputComponentInput.documentCategory && this.documentType == onboardDocUploadInputComponentInput.documentType && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, onboardDocUploadInputComponentInput.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardDocUploadInputComponentInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput copy(com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory documentCategory, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType documentType, java.lang.String referenceId, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput(documentCategory, documentType, referenceId, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.submitId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory getDocumentCategory() {
        return this.documentCategory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardDocUploadInputComponentInput onboardDocUploadInputComponentInput, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentCategory onboardDocumentCategory, com.paypal.oslo.api.graphql.schema.type.OnboardDocumentType onboardDocumentType, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onboardDocumentCategory = onboardDocUploadInputComponentInput.documentCategory;
        }
        if ((i & 2) != 0) {
            onboardDocumentType = onboardDocUploadInputComponentInput.documentType;
        }
        if ((i & 4) != 0) {
            str = onboardDocUploadInputComponentInput.referenceId;
        }
        if ((i & 8) != 0) {
            optional = onboardDocUploadInputComponentInput.submitId;
        }
        return onboardDocUploadInputComponentInput.copy(onboardDocumentCategory, onboardDocumentType, str, optional);
    }
}
