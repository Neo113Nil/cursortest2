package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferMediaContextInput;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "provider", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/apollographql/apollo/api/Optional;", "referenceUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferMediaContextInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "getProvider", "Ljava/lang/Object;", "getContentType", "Lcom/apollographql/apollo/api/Optional;", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentTransferMediaContextInput {
    private final java.lang.Object contentType;
    private final java.lang.String id;
    private final com.paypal.oslo.api.graphql.schema.type.MediaProvider provider;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> referenceUrl;

    public PaymentTransferMediaContextInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.id = str;
        this.provider = mediaProvider;
        this.contentType = obj;
        this.referenceUrl = optional;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MediaProvider getProvider() {
        return this.provider;
    }

    public final java.lang.Object getContentType() {
        return this.contentType;
    }

    public /* synthetic */ PaymentTransferMediaContextInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, mediaProvider, obj, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getReferenceUrl() {
        return this.referenceUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider = this.provider;
        java.lang.Object obj = this.contentType;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.referenceUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferMediaContextInput(id=");
        sb.append(str);
        sb.append(", provider=");
        sb.append(mediaProvider);
        sb.append(", contentType=");
        sb.append(obj);
        sb.append(", referenceUrl=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.provider.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.referenceUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput paymentTransferMediaContextInput = (com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentTransferMediaContextInput.id) && this.provider == paymentTransferMediaContextInput.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, paymentTransferMediaContextInput.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, paymentTransferMediaContextInput.referenceUrl);
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.MediaProvider provider, java.lang.Object contentType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> referenceUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
        return new com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput(id, provider, contentType, referenceUrl);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component4() {
        return this.referenceUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MediaProvider getProvider() {
        return this.provider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput paymentTransferMediaContextInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = paymentTransferMediaContextInput.id;
        }
        if ((i & 2) != 0) {
            mediaProvider = paymentTransferMediaContextInput.provider;
        }
        if ((i & 4) != 0) {
            obj = paymentTransferMediaContextInput.contentType;
        }
        if ((i & 8) != 0) {
            optional = paymentTransferMediaContextInput.referenceUrl;
        }
        return paymentTransferMediaContextInput.copy(str, mediaProvider, obj, optional);
    }
}
