package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ValidateAlertInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "action", "", "documentId", "source", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ValidateAlertInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "getAction", "Ljava/lang/String;", "getDocumentId", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ValidateAlertInput {
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction action;
    private final java.lang.String documentId;
    private final java.lang.String source;

    public ValidateAlertInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationCommunicationAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.action = authenticationCommunicationAction;
        this.documentId = str;
        this.source = str2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction getAction() {
        return this.action;
    }

    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction = this.action;
        java.lang.String str = this.documentId;
        java.lang.String str2 = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateAlertInput(action=");
        sb.append(authenticationCommunicationAction);
        sb.append(", documentId=");
        sb.append(str);
        sb.append(", source=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.action.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.source.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput validateAlertInput = (com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput) other;
        return this.action == validateAlertInput.action && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, validateAlertInput.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, validateAlertInput.source);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput copy(com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction action, java.lang.String documentId, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput(action, documentId, source);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction getAction() {
        return this.action;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput copy$default(com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput validateAlertInput, com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationCommunicationAction = validateAlertInput.action;
        }
        if ((i & 2) != 0) {
            str = validateAlertInput.documentId;
        }
        if ((i & 4) != 0) {
            str2 = validateAlertInput.source;
        }
        return validateAlertInput.copy(authenticationCommunicationAction, str, str2);
    }
}
