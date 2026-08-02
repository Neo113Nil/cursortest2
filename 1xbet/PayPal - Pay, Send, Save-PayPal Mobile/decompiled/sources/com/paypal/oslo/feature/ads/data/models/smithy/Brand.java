package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand;", "", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand$Builder;", "p0", "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand$Builder;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "copy", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand;", "name", "Ljava/lang/String;", "getName", "urlX1", "getUrlX1", "urlX2", "getUrlX2", "urlX3", "getUrlX3", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Brand {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.Brand.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Brand.Companion(null);
    private final java.lang.String name;
    private final java.lang.String urlX1;
    private final java.lang.String urlX2;
    private final java.lang.String urlX3;

    private Brand(com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder) {
        java.lang.String name2 = builder.getName();
        if (name2 == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for name".toString());
        }
        this.name = name2;
        this.urlX1 = builder.getUrlX1();
        this.urlX2 = builder.getUrlX2();
        this.urlX3 = builder.getUrlX3();
    }

    public final java.lang.String getName() {
        return this.name;
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

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Brand invoke(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder();
            block.invoke(builder);
            return builder.build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Brand(");
        java.lang.String str = this.name;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("name=");
        sb2.append(str);
        sb2.append(",");
        sb.append(sb2.toString());
        java.lang.String str2 = this.urlX1;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("urlX1=");
        sb3.append(str2);
        sb3.append(",");
        sb.append(sb3.toString());
        java.lang.String str3 = this.urlX2;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("urlX2=");
        sb4.append(str3);
        sb4.append(",");
        sb.append(sb4.toString());
        sb.append("urlX3=".concat(java.lang.String.valueOf(this.urlX3)));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.urlX1;
        int hashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.urlX2;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.urlX3;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        com.paypal.oslo.feature.ads.data.models.smithy.Brand brand = (com.paypal.oslo.feature.ads.data.models.smithy.Brand) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, brand.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlX1, brand.urlX1) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlX2, brand.urlX2) && kotlin.jvm.internal.Intrinsics.areEqual(this.urlX3, brand.urlX3);
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.Brand copy$default(com.paypal.oslo.feature.ads.data.models.smithy.Brand brand, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder, kotlin.Unit>() { // from class: com.paypal.oslo.feature.ads.data.models.smithy.Brand$copy$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder(brand);
        function1.invoke(builder);
        return builder.build();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.Brand copy(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder = new com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder(this);
        block.invoke(builder);
        return builder.build();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand$Builder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand;", "x", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand;)V", "build", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand;", "correctErrors$ads_prodRelease", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/Brand$Builder;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "urlX1", "getUrlX1", "setUrlX1", "urlX2", "getUrlX2", "setUrlX2", "urlX3", "getUrlX3", "setUrlX3"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private java.lang.String name;
        private java.lang.String urlX1;
        private java.lang.String urlX2;
        private java.lang.String urlX3;

        public final java.lang.String getName() {
            return this.name;
        }

        public final void setName(java.lang.String str) {
            this.name = str;
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
        public Builder(com.paypal.oslo.feature.ads.data.models.smithy.Brand brand) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            this.name = brand.getName();
            this.urlX1 = brand.getUrlX1();
            this.urlX2 = brand.getUrlX2();
            this.urlX3 = brand.getUrlX3();
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Brand build() {
            return new com.paypal.oslo.feature.ads.data.models.smithy.Brand(this, null);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder correctErrors$ads_prodRelease() {
            if (this.name == null) {
                this.name = "";
            }
            return this;
        }
    }

    public /* synthetic */ Brand(com.paypal.oslo.feature.ads.data.models.smithy.Brand.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
