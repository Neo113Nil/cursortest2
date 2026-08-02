package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0012\u0082\u0001\u0005\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "asImageAd", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "asImageAdOrNull", "Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeImageAdResponse;", "asNativeImageAd", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeImageAdResponse;", "asNativeImageAdOrNull", "Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeTextAndImageAdResponse;", "asNativeTextAndImageAd", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeTextAndImageAdResponse;", "asNativeTextAndImageAdOrNull", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalShopResponse;", "asPaypalShopAd", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalShopResponse;", "asPaypalShopAdOrNull", "ImageAd", "NativeImageAd", "NativeTextAndImageAd", "PaypalShopAd", "SdkUnknown", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$ImageAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$NativeImageAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$NativeTextAndImageAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$PaypalShopAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$SdkUnknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class AdResponse {
    public static final int $stable = 0;

    private AdResponse() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$ImageAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;)Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$ImageAd;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/ImageAdResponse;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ImageAd extends com.paypal.oslo.feature.ads.data.models.smithy.AdResponse {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageAd(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse imageAdResponse) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageAdResponse, "");
            this.value = imageAdResponse;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse imageAdResponse = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageAd(value=");
            sb.append(imageAdResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd copy(com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd copy$default(com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd imageAd, com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse imageAdResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                imageAdResponse = imageAd.value;
            }
            return imageAd.copy(imageAdResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$NativeImageAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeImageAdResponse;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeImageAdResponse;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeImageAdResponse;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeImageAdResponse;)Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$NativeImageAd;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeImageAdResponse;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NativeImageAd extends com.paypal.oslo.feature.ads.data.models.smithy.AdResponse {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeImageAd(com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse nativeImageAdResponse) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeImageAdResponse, "");
            this.value = nativeImageAdResponse;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse nativeImageAdResponse = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeImageAd(value=");
            sb.append(nativeImageAdResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd copy(com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd copy$default(com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd nativeImageAd, com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse nativeImageAdResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                nativeImageAdResponse = nativeImageAd.value;
            }
            return nativeImageAd.copy(nativeImageAdResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$NativeTextAndImageAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeTextAndImageAdResponse;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeTextAndImageAdResponse;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeTextAndImageAdResponse;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeTextAndImageAdResponse;)Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$NativeTextAndImageAd;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/NativeTextAndImageAdResponse;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NativeTextAndImageAd extends com.paypal.oslo.feature.ads.data.models.smithy.AdResponse {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeTextAndImageAd(com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse nativeTextAndImageAdResponse) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeTextAndImageAdResponse, "");
            this.value = nativeTextAndImageAdResponse;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse nativeTextAndImageAdResponse = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeTextAndImageAd(value=");
            sb.append(nativeTextAndImageAdResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd copy(com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd copy$default(com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd nativeTextAndImageAd, com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse nativeTextAndImageAdResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                nativeTextAndImageAdResponse = nativeTextAndImageAd.value;
            }
            return nativeTextAndImageAd.copy(nativeTextAndImageAdResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$PaypalShopAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalShopResponse;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalShopResponse;)V", "component1", "()Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalShopResponse;", "copy", "(Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalShopResponse;)Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$PaypalShopAd;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/PayPalShopResponse;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaypalShopAd extends com.paypal.oslo.feature.ads.data.models.smithy.AdResponse {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaypalShopAd(com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse payPalShopResponse) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalShopResponse, "");
            this.value = payPalShopResponse;
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse payPalShopResponse = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaypalShopAd(value=");
            sb.append(payPalShopResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd copy(com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd copy$default(com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd paypalShopAd, com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse payPalShopResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payPalShopResponse = paypalShopAd.value;
            }
            return paypalShopAd.copy(payPalShopResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdResponse;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SdkUnknown extends com.paypal.oslo.feature.ads.data.models.smithy.AdResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.SdkUnknown INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.SdkUnknown();

        private SdkUnknown() {
            super(null);
        }
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse asImageAd() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.ImageAdResponse asImageAdOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd imageAd = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd ? (com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.ImageAd) this : null;
        if (imageAd != null) {
            return imageAd.getValue();
        }
        return null;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse asNativeImageAd() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.NativeImageAdResponse asNativeImageAdOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd nativeImageAd = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd ? (com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeImageAd) this : null;
        if (nativeImageAd != null) {
            return nativeImageAd.getValue();
        }
        return null;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse asNativeTextAndImageAd() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.NativeTextAndImageAdResponse asNativeTextAndImageAdOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd nativeTextAndImageAd = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd ? (com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.NativeTextAndImageAd) this : null;
        if (nativeTextAndImageAd != null) {
            return nativeTextAndImageAd.getValue();
        }
        return null;
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse asPaypalShopAd() {
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return ((com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd) this).getValue();
    }

    public final com.paypal.oslo.feature.ads.data.models.smithy.PayPalShopResponse asPaypalShopAdOrNull() {
        com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd paypalShopAd = this instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd ? (com.paypal.oslo.feature.ads.data.models.smithy.AdResponse.PaypalShopAd) this : null;
        if (paypalShopAd != null) {
            return paypalShopAd.getValue();
        }
        return null;
    }

    public /* synthetic */ AdResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
