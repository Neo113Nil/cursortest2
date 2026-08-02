package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ@\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UploadThirdPartyLoyaltyCardCustomImageInput;", "", "", "id", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/ThirdPartyLoyaltyCardImageType;", "imageType", "requestId", "imageData", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Ljava/lang/Object;", "component4", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/UploadThirdPartyLoyaltyCardCustomImageInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/apollographql/apollo/api/Optional;", "getImageType", "Ljava/lang/Object;", "getRequestId", "getImageData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UploadThirdPartyLoyaltyCardCustomImageInput {
    private final java.lang.String id;
    private final java.lang.String imageData;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> imageType;
    private final java.lang.Object requestId;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadThirdPartyLoyaltyCardCustomImageInput(java.lang.String str, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> optional, java.lang.Object obj, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.imageType = optional;
        this.requestId = obj;
        this.imageData = str2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ UploadThirdPartyLoyaltyCardCustomImageInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, java.lang.Object obj, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, obj, str2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> getImageType() {
        return this.imageType;
    }

    public final java.lang.Object getRequestId() {
        return this.requestId;
    }

    public final java.lang.String getImageData() {
        return this.imageData;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> optional = this.imageType;
        java.lang.Object obj = this.requestId;
        java.lang.String str2 = this.imageData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadThirdPartyLoyaltyCardCustomImageInput(id=");
        sb.append(str);
        sb.append(", imageType=");
        sb.append(optional);
        sb.append(", requestId=");
        sb.append(obj);
        sb.append(", imageData=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.imageType.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.imageData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UploadThirdPartyLoyaltyCardCustomImageInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UploadThirdPartyLoyaltyCardCustomImageInput uploadThirdPartyLoyaltyCardCustomImageInput = (com.paypal.oslo.api.graphql.schema.type.UploadThirdPartyLoyaltyCardCustomImageInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, uploadThirdPartyLoyaltyCardCustomImageInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageType, uploadThirdPartyLoyaltyCardCustomImageInput.imageType) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, uploadThirdPartyLoyaltyCardCustomImageInput.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageData, uploadThirdPartyLoyaltyCardCustomImageInput.imageData);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UploadThirdPartyLoyaltyCardCustomImageInput copy(java.lang.String id, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> imageType, java.lang.Object requestId, java.lang.String imageData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageData, "");
        return new com.paypal.oslo.api.graphql.schema.type.UploadThirdPartyLoyaltyCardCustomImageInput(id, imageType, requestId, imageData);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getImageData() {
        return this.imageData;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getRequestId() {
        return this.requestId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> component2() {
        return this.imageType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UploadThirdPartyLoyaltyCardCustomImageInput copy$default(com.paypal.oslo.api.graphql.schema.type.UploadThirdPartyLoyaltyCardCustomImageInput uploadThirdPartyLoyaltyCardCustomImageInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = uploadThirdPartyLoyaltyCardCustomImageInput.id;
        }
        if ((i & 2) != 0) {
            optional = uploadThirdPartyLoyaltyCardCustomImageInput.imageType;
        }
        if ((i & 4) != 0) {
            obj = uploadThirdPartyLoyaltyCardCustomImageInput.requestId;
        }
        if ((i & 8) != 0) {
            str2 = uploadThirdPartyLoyaltyCardCustomImageInput.imageData;
        }
        return uploadThirdPartyLoyaltyCardCustomImageInput.copy(str, optional, obj, str2);
    }
}
