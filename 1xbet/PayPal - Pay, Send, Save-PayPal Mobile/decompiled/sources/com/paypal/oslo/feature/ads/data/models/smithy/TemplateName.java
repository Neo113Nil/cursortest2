package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b2\u00020\u0001:\u0006\t\n\u000b\f\r\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "", "<init>", "()V", "", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion", "NativeImageOnlyCard", "NativeImageTextCard", "PayPalShopCard", "StaticBannerCard", "SdkUnknown", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$NativeImageOnlyCard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$NativeImageTextCard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$PayPalShopCard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$StaticBannerCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TemplateName {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.Companion(null);
    private static final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.TemplateName> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName[]{com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageOnlyCard.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageTextCard.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.PayPalShopCard.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.StaticBannerCard.INSTANCE});

    public abstract java.lang.String getValue();

    private TemplateName() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$NativeImageOnlyCard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NativeImageOnlyCard extends com.paypal.oslo.feature.ads.data.models.smithy.TemplateName {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageOnlyCard INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageOnlyCard();
        private static final java.lang.String value = "NativeImageOnlyCard";

        private NativeImageOnlyCard() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TemplateName
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "NativeImageOnlyCard";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$NativeImageTextCard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NativeImageTextCard extends com.paypal.oslo.feature.ads.data.models.smithy.TemplateName {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageTextCard INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageTextCard();
        private static final java.lang.String value = "NativeImageTextCard";

        private NativeImageTextCard() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TemplateName
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "NativeImageTextCard";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$PayPalShopCard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PayPalShopCard extends com.paypal.oslo.feature.ads.data.models.smithy.TemplateName {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.PayPalShopCard INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.PayPalShopCard();
        private static final java.lang.String value = "PayPalShopCard";

        private PayPalShopCard() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TemplateName
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PayPalShopCard";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$StaticBannerCard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StaticBannerCard extends com.paypal.oslo.feature.ads.data.models.smithy.TemplateName {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.StaticBannerCard INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.StaticBannerCard();
        private static final java.lang.String value = "StaticBannerCard";

        private StaticBannerCard() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TemplateName
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "StaticBannerCard";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$SdkUnknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SdkUnknown extends com.paypal.oslo.feature.ads.data.models.smithy.TemplateName {
        public static final int $stable = 0;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkUnknown(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TemplateName
        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String value = getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkUnknown(");
            sb.append(value);
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
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.SdkUnknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.SdkUnknown) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.SdkUnknown copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.SdkUnknown(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.SdkUnknown copy$default(com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.SdkUnknown sdkUnknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sdkUnknown.value;
            }
            return sdkUnknown.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/TemplateName;", "", "values", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.TemplateName fromValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            switch (value.hashCode()) {
                case -1001152416:
                    if (value.equals("NativeImageOnlyCard")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageOnlyCard.INSTANCE;
                    }
                    break;
                case 64298337:
                    if (value.equals("NativeImageTextCard")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.NativeImageTextCard.INSTANCE;
                    }
                    break;
                case 726922041:
                    if (value.equals("PayPalShopCard")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.PayPalShopCard.INSTANCE;
                    }
                    break;
                case 2008626570:
                    if (value.equals("StaticBannerCard")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.StaticBannerCard.INSTANCE;
                    }
                    break;
            }
            return new com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.SdkUnknown(value);
        }

        public final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.TemplateName> values() {
            return com.paypal.oslo.feature.ads.data.models.smithy.TemplateName.getHighSpeedVideoFpsRangesFor;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TemplateName(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
