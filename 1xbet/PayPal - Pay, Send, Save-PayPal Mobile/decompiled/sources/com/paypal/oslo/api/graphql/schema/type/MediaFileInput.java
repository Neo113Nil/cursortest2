package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MediaFileInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "id", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/MediaFileInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getId", "getContentType", "Ljava/lang/Object;", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MediaFileInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> contentType;
    private final com.apollographql.apollo.api.Optional<java.lang.String> id;
    private final java.lang.Object referenceUrl;

    public MediaFileInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.id = optional;
        this.contentType = optional2;
        this.referenceUrl = obj;
    }

    public /* synthetic */ MediaFileInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, obj);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getId() {
        return this.id;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getContentType() {
        return this.contentType;
    }

    public final java.lang.Object getReferenceUrl() {
        return this.referenceUrl;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.id;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.contentType;
        java.lang.Object obj = this.referenceUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaFileInput(id=");
        sb.append(optional);
        sb.append(", contentType=");
        sb.append(optional2);
        sb.append(", referenceUrl=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.contentType.hashCode()) * 31) + this.referenceUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MediaFileInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFileInput = (com.paypal.oslo.api.graphql.schema.type.MediaFileInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, mediaFileInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, mediaFileInput.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, mediaFileInput.referenceUrl);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MediaFileInput copy(com.apollographql.apollo.api.Optional<java.lang.String> id, com.apollographql.apollo.api.Optional<? extends java.lang.Object> contentType, java.lang.Object referenceUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
        return new com.paypal.oslo.api.graphql.schema.type.MediaFileInput(id, contentType, referenceUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getReferenceUrl() {
        return this.referenceUrl;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.contentType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MediaFileInput copy$default(com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFileInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            optional = mediaFileInput.id;
        }
        if ((i & 2) != 0) {
            optional2 = mediaFileInput.contentType;
        }
        if ((i & 4) != 0) {
            obj = mediaFileInput.referenceUrl;
        }
        return mediaFileInput.copy(optional, optional2, obj);
    }
}
