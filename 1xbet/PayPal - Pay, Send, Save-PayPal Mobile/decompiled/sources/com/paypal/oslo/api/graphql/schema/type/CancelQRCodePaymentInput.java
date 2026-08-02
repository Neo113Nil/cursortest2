package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJF\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CancelQRCodePaymentInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "sessionId", "qrCodeReferenceId", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodePaymentCancellationReason;", "reason", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CancelQRCodePaymentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getSessionId", "getQrCodeReferenceId", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CancelQRCodePaymentInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> qrCodeReferenceId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodePaymentCancellationReason> reason;
    private final com.apollographql.apollo.api.Optional<java.lang.String> sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelQRCodePaymentInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.QRCodePaymentCancellationReason> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.sessionId = optional;
        this.qrCodeReferenceId = optional2;
        this.reason = optional3;
    }

    public /* synthetic */ CancelQRCodePaymentInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSessionId() {
        return this.sessionId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getQrCodeReferenceId() {
        return this.qrCodeReferenceId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodePaymentCancellationReason> getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.sessionId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.qrCodeReferenceId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodePaymentCancellationReason> optional3 = this.reason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelQRCodePaymentInput(sessionId=");
        sb.append(optional);
        sb.append(", qrCodeReferenceId=");
        sb.append(optional2);
        sb.append(", reason=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.sessionId.hashCode() * 31) + this.qrCodeReferenceId.hashCode()) * 31) + this.reason.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CancelQRCodePaymentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CancelQRCodePaymentInput cancelQRCodePaymentInput = (com.paypal.oslo.api.graphql.schema.type.CancelQRCodePaymentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, cancelQRCodePaymentInput.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeReferenceId, cancelQRCodePaymentInput.qrCodeReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, cancelQRCodePaymentInput.reason);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CancelQRCodePaymentInput copy(com.apollographql.apollo.api.Optional<java.lang.String> sessionId, com.apollographql.apollo.api.Optional<java.lang.String> qrCodeReferenceId, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.QRCodePaymentCancellationReason> reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new com.paypal.oslo.api.graphql.schema.type.CancelQRCodePaymentInput(sessionId, qrCodeReferenceId, reason);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.QRCodePaymentCancellationReason> component3() {
        return this.reason;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.qrCodeReferenceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CancelQRCodePaymentInput copy$default(com.paypal.oslo.api.graphql.schema.type.CancelQRCodePaymentInput cancelQRCodePaymentInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = cancelQRCodePaymentInput.sessionId;
        }
        if ((i & 2) != 0) {
            optional2 = cancelQRCodePaymentInput.qrCodeReferenceId;
        }
        if ((i & 4) != 0) {
            optional3 = cancelQRCodePaymentInput.reason;
        }
        return cancelQRCodePaymentInput.copy(optional, optional2, optional3);
    }

    public CancelQRCodePaymentInput() {
        this(null, null, null, 7, null);
    }
}
