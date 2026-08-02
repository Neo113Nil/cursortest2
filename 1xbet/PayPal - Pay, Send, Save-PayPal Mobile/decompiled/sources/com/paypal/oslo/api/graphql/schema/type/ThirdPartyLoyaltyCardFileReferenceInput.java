package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ThirdPartyLoyaltyCardFileReferenceInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MediaFileInput;", "mediaFile", "Lcom/apollographql/apollo/api/Optional;", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/oslo/api/graphql/schema/type/ThirdPartyLoyaltyCardImageType;", "imageType", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MediaFileInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MediaFileInput;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MediaFileInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ThirdPartyLoyaltyCardFileReferenceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MediaFileInput;", "getMediaFile", "Lcom/apollographql/apollo/api/Optional;", "getSize", "getImageType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ThirdPartyLoyaltyCardFileReferenceInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> imageType;
    private final com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFile;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> size;

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyLoyaltyCardFileReferenceInput(com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFileInput, com.apollographql.apollo.api.Optional<java.lang.Integer> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaFileInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.mediaFile = mediaFileInput;
        this.size = optional;
        this.imageType = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MediaFileInput getMediaFile() {
        return this.mediaFile;
    }

    public /* synthetic */ ThirdPartyLoyaltyCardFileReferenceInput(com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFileInput, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaFileInput, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getSize() {
        return this.size;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> getImageType() {
        return this.imageType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFileInput = this.mediaFile;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional = this.size;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> optional2 = this.imageType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThirdPartyLoyaltyCardFileReferenceInput(mediaFile=");
        sb.append(mediaFileInput);
        sb.append(", size=");
        sb.append(optional);
        sb.append(", imageType=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.mediaFile.hashCode() * 31) + this.size.hashCode()) * 31) + this.imageType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardFileReferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardFileReferenceInput thirdPartyLoyaltyCardFileReferenceInput = (com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardFileReferenceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mediaFile, thirdPartyLoyaltyCardFileReferenceInput.mediaFile) && kotlin.jvm.internal.Intrinsics.areEqual(this.size, thirdPartyLoyaltyCardFileReferenceInput.size) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageType, thirdPartyLoyaltyCardFileReferenceInput.imageType);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardFileReferenceInput copy(com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFile, com.apollographql.apollo.api.Optional<java.lang.Integer> size, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> imageType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaFile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageType, "");
        return new com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardFileReferenceInput(mediaFile, size, imageType);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardImageType> component3() {
        return this.imageType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component2() {
        return this.size;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MediaFileInput getMediaFile() {
        return this.mediaFile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardFileReferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardFileReferenceInput thirdPartyLoyaltyCardFileReferenceInput, com.paypal.oslo.api.graphql.schema.type.MediaFileInput mediaFileInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mediaFileInput = thirdPartyLoyaltyCardFileReferenceInput.mediaFile;
        }
        if ((i & 2) != 0) {
            optional = thirdPartyLoyaltyCardFileReferenceInput.size;
        }
        if ((i & 4) != 0) {
            optional2 = thirdPartyLoyaltyCardFileReferenceInput.imageType;
        }
        return thirdPartyLoyaltyCardFileReferenceInput.copy(mediaFileInput, optional, optional2);
    }
}
