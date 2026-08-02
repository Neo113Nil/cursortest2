package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "", "Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse$Builder;", "p0", "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse$Builder;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "copy", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "image", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "getImage", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "rawClickUrl", "Ljava/lang/String;", "getRawClickUrl", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "templateName", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "getTemplateName", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ImageAdResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Companion(null);
    private final com.paypal.oslo.feature.ads.data.models.smithy.Image image;
    private final java.lang.String rawClickUrl;
    private final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName;

    private ImageAdResponse(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder) {
        this.image = builder.getImage();
        this.rawClickUrl = builder.getRawClickUrl();
        this.templateName = builder.getTemplateName();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.Image getImage() {
        return this.image;
    }

    public final java.lang.String getRawClickUrl() {
        return this.rawClickUrl;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName getTemplateName() {
        return this.templateName;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse invoke(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder();
            block.invoke(builder);
            return builder.build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageAdResponse(");
        com.paypal.oslo.feature.ads.data.models.smithy.Image image = this.image;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("image=");
        sb2.append(image);
        sb2.append(",");
        sb.append(sb2.toString());
        java.lang.String str = this.rawClickUrl;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("rawClickUrl=");
        sb3.append(str);
        sb3.append(",");
        sb.append(sb3.toString());
        sb.append("templateName=".concat(java.lang.String.valueOf(this.templateName)));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.ads.data.models.smithy.Image image = this.image;
        int hashCode = image != null ? image.hashCode() : 0;
        java.lang.String str = this.rawClickUrl;
        int hashCode2 = str != null ? str.hashCode() : 0;
        com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName = this.templateName;
        return (((hashCode * 31) + hashCode2) * 31) + (templateName != null ? templateName.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse imageAdResponse = (com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, imageAdResponse.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawClickUrl, imageAdResponse.rawClickUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.templateName, imageAdResponse.templateName);
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse copy$default(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse imageAdResponse, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder, kotlin.Unit>() { // from class: com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse$copy$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder(imageAdResponse);
        function1.invoke(builder);
        return builder.build();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse copy(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder(this);
        block.invoke(builder);
        return builder.build();
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u00020\u000b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u000e\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse$Builder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "x", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;)V", "build", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "image", "(Lkotlin/jvm/functions/Function1;)V", "correctErrors$ads_prodRelease", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse$Builder;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "getImage", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "setImage", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;)V", "", "rawClickUrl", "Ljava/lang/String;", "getRawClickUrl", "()Ljava/lang/String;", "setRawClickUrl", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "templateName", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "getTemplateName", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "setTemplateName", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private com.paypal.oslo.feature.ads.data.models.smithy.Image image;
        private java.lang.String rawClickUrl;
        private com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName;

        public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder correctErrors$ads_prodRelease() {
            return this;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Image getImage() {
            return this.image;
        }

        public final void setImage(com.paypal.oslo.feature.ads.data.models.smithy.Image image) {
            this.image = image;
        }

        public final java.lang.String getRawClickUrl() {
            return this.rawClickUrl;
        }

        public final void setRawClickUrl(java.lang.String str) {
            this.rawClickUrl = str;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName getTemplateName() {
            return this.templateName;
        }

        public final void setTemplateName(com.paypal.oslo.feature.ads.data.models.smithy.TemplateName templateName) {
            this.templateName = templateName;
        }

        public Builder() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse imageAdResponse) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageAdResponse, "");
            this.image = imageAdResponse.getImage();
            this.rawClickUrl = imageAdResponse.getRawClickUrl();
            this.templateName = imageAdResponse.getTemplateName();
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse build() {
            return new com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse(this, null);
        }

        public final void image(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder, kotlin.Unit> block) {
            com.paypal.oslo.feature.ads.data.models.smithy.Image.Companion companion;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            companion = com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponseKt.getHighSpeedVideoFpsRanges;
            this.image = companion.invoke(block);
        }
    }

    public /* synthetic */ ImageAdResponse(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
