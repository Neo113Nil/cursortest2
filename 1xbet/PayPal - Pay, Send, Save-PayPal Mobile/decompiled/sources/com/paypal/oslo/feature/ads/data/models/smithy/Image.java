package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image$Builder;", "p0", "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/Image$Builder;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "copy", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "altText", "Ljava/lang/String;", "getAltText", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/oslo/feature/ads/data/models/smithy/Size;", "getSize", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Size;", "urlX1", "getUrlX1", "urlX2", "getUrlX2", "urlX3", "getUrlX3", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Image {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.Image.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Image.Companion(null);
    private final java.lang.String altText;
    private final com.paypal.oslo.feature.ads.data.models.smithy.Size size;
    private final java.lang.String urlX1;
    private final java.lang.String urlX2;
    private final java.lang.String urlX3;

    private Image(com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder) {
        this.altText = builder.getAltText();
        this.size = builder.getSize();
        this.urlX1 = builder.getUrlX1();
        this.urlX2 = builder.getUrlX2();
        this.urlX3 = builder.getUrlX3();
    }

    public final java.lang.String getAltText() {
        return this.altText;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.Size getSize() {
        return this.size;
    }

    public final java.lang.String getUrlX1() {
        return this.urlX1;
    }

    public final java.lang.String getUrlX2() {
        return this.urlX2;
    }

    public final java.lang.String getUrlX3() {
        return this.urlX3;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Image$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Image invoke(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder();
            block.invoke(builder);
            return builder.build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Image(");
        java.lang.String str = this.altText;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("altText=");
        sb2.append(str);
        sb2.append(",");
        sb.append(sb2.toString());
        com.paypal.oslo.feature.ads.data.models.smithy.Size size = this.size;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("size=");
        sb3.append(size);
        sb3.append(",");
        sb.append(sb3.toString());
        java.lang.String str2 = this.urlX1;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("urlX1=");
        sb4.append(str2);
        sb4.append(",");
        sb.append(sb4.toString());
        java.lang.String str3 = this.urlX2;
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("urlX2=");
        sb5.append(str3);
        sb5.append(",");
        sb.append(sb5.toString());
        sb.append("urlX3=".concat(java.lang.String.valueOf(this.urlX3)));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.altText;
        int hashCode = str != null ? str.hashCode() : 0;
        com.paypal.oslo.feature.ads.data.models.smithy.Size size = this.size;
        int hashCode2 = size != null ? size.hashCode() : 0;
        java.lang.String str2 = this.urlX1;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.urlX2;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.urlX3;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        com.paypal.oslo.feature.ads.data.models.smithy.Image image = (com.paypal.oslo.feature.ads.data.models.smithy.Image) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.altText, image.altText) && kotlin.jvm.internal.Intrinsics.areEqual(this.size, image.size) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlX1, image.urlX1) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlX2, image.urlX2) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlX3, image.urlX3);
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.Image copy$default(com.paypal.oslo.feature.ads.data.models.smithy.Image image, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder, kotlin.Unit>() { // from class: com.paypal.oslo.feature.ads.data.models.smithy.Image$copy$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder(image);
        function1.invoke(builder);
        return builder.build();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.Image copy(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder(this);
        block.invoke(builder);
        return builder.build();
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u00020\u000b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u000e\u001a\u0004\u0018\u00010\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R$\u0010\"\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Image$Builder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "x", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;)V", "build", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Image;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Size$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", io.ktor.http.ContentDisposition.Parameters.Size, "(Lkotlin/jvm/functions/Function1;)V", "correctErrors$ads_prodRelease", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Image$Builder;", "", "altText", "Ljava/lang/String;", "getAltText", "()Ljava/lang/String;", "setAltText", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Size;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Size;", "getSize", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Size;", "setSize", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/Size;)V", "urlX1", "getUrlX1", "setUrlX1", "urlX2", "getUrlX2", "setUrlX2", "urlX3", "getUrlX3", "setUrlX3"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private java.lang.String altText;
        private com.paypal.oslo.feature.ads.data.models.smithy.Size size;
        private java.lang.String urlX1;
        private java.lang.String urlX2;
        private java.lang.String urlX3;

        public final com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder correctErrors$ads_prodRelease() {
            return this;
        }

        public final java.lang.String getAltText() {
            return this.altText;
        }

        public final void setAltText(java.lang.String str) {
            this.altText = str;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Size getSize() {
            return this.size;
        }

        public final void setSize(com.paypal.oslo.feature.ads.data.models.smithy.Size size) {
            this.size = size;
        }

        public final java.lang.String getUrlX1() {
            return this.urlX1;
        }

        public final void setUrlX1(java.lang.String str) {
            this.urlX1 = str;
        }

        public final java.lang.String getUrlX2() {
            return this.urlX2;
        }

        public final void setUrlX2(java.lang.String str) {
            this.urlX2 = str;
        }

        public final java.lang.String getUrlX3() {
            return this.urlX3;
        }

        public final void setUrlX3(java.lang.String str) {
            this.urlX3 = str;
        }

        public Builder() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.paypal.oslo.feature.ads.data.models.smithy.Image image) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
            this.altText = image.getAltText();
            this.size = image.getSize();
            this.urlX1 = image.getUrlX1();
            this.urlX2 = image.getUrlX2();
            this.urlX3 = image.getUrlX3();
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Image build() {
            return new com.paypal.oslo.feature.ads.data.models.smithy.Image(this, null);
        }

        public final void size(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.Size.Builder, kotlin.Unit> block) {
            com.paypal.oslo.feature.ads.data.models.smithy.Size.Companion companion;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            companion = com.paypal.oslo.feature.ads.data.models.smithy.ImageKt.Camera2StreamConfigurationMap;
            this.size = companion.invoke(block);
        }
    }

    public /* synthetic */ Image(com.paypal.oslo.feature.ads.data.models.smithy.Image.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
