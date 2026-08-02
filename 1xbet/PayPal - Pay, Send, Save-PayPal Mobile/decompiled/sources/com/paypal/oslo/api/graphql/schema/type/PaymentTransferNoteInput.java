package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferNoteInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "memo", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferMediaContextInput;", io.ktor.http.LinkHeader.Parameters.Media, "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferNoteInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getMemo", "getMedia"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaymentTransferNoteInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput> media;
    private final com.apollographql.apollo.api.Optional<java.lang.String> memo;

    public PaymentTransferNoteInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.memo = optional;
        this.media = optional2;
    }

    public /* synthetic */ PaymentTransferNoteInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getMemo() {
        return this.memo;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput> getMedia() {
        return this.media;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.memo;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput> optional2 = this.media;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferNoteInput(memo=");
        sb.append(optional);
        sb.append(", media=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.memo.hashCode() * 31) + this.media.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput paymentTransferNoteInput = (com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.memo, paymentTransferNoteInput.memo) && kotlin.jvm.internal.Intrinsics.areEqual(this.media, paymentTransferNoteInput.media);
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput copy(com.apollographql.apollo.api.Optional<java.lang.String> memo, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput> media) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(media, "");
        return new com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput(memo, media);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput> component2() {
        return this.media;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.memo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput copy$default(com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput paymentTransferNoteInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = paymentTransferNoteInput.memo;
        }
        if ((i & 2) != 0) {
            optional2 = paymentTransferNoteInput.media;
        }
        return paymentTransferNoteInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentTransferNoteInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
