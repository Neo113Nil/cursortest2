package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b2\u00020\u0001:\r\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\f\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f "}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "", "<init>", "()V", "", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion", "OsloDisplayAd", "PaypalMobileMediumRectangle", "PaypalNativeImageOnlyLeaderboard", "PaypalNativeImageOnlyMediumRectangle", "PaypalNativeImageOnlyMobile", "PaypalNativeTextAndImage", "PaypalShop16x9", "PaypalShop1x1", "PaypalShop4x5", "PaypalShop6x5", "VenmoFeedImage", "SdkUnknown", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$OsloDisplayAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalMobileMediumRectangle;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeImageOnlyLeaderboard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeImageOnlyMediumRectangle;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeImageOnlyMobile;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeTextAndImage;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop16x9;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop1x1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop4x5;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop6x5;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$VenmoFeedImage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class AdFormat {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.Companion(null);
    private static final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.AdFormat> getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat[]{com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.OsloDisplayAd.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalMobileMediumRectangle.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyLeaderboard.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMediumRectangle.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMobile.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeTextAndImage.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop16x9.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop1x1.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop4x5.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop6x5.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.VenmoFeedImage.INSTANCE});

    public abstract java.lang.String getValue();

    private AdFormat() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$OsloDisplayAd;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OsloDisplayAd extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.OsloDisplayAd INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.OsloDisplayAd();
        private static final java.lang.String value = "OsloDisplayAd";

        private OsloDisplayAd() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "OsloDisplayAd";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalMobileMediumRectangle;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalMobileMediumRectangle extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalMobileMediumRectangle INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalMobileMediumRectangle();
        private static final java.lang.String value = "PaypalMobileMediumRectangle";

        private PaypalMobileMediumRectangle() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalMobileMediumRectangle";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeImageOnlyLeaderboard;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalNativeImageOnlyLeaderboard extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyLeaderboard INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyLeaderboard();
        private static final java.lang.String value = "PaypalNativeImageOnlyLeaderboard";

        private PaypalNativeImageOnlyLeaderboard() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalNativeImageOnlyLeaderboard";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeImageOnlyMediumRectangle;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalNativeImageOnlyMediumRectangle extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMediumRectangle INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMediumRectangle();
        private static final java.lang.String value = "PaypalNativeImageOnlyMediumRectangle";

        private PaypalNativeImageOnlyMediumRectangle() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalNativeImageOnlyMediumRectangle";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeImageOnlyMobile;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalNativeImageOnlyMobile extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMobile INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMobile();
        private static final java.lang.String value = "PaypalNativeImageOnlyMobile";

        private PaypalNativeImageOnlyMobile() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalNativeImageOnlyMobile";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalNativeTextAndImage;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalNativeTextAndImage extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeTextAndImage INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeTextAndImage();
        private static final java.lang.String value = "PaypalNativeTextAndImage";

        private PaypalNativeTextAndImage() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalNativeTextAndImage";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop16x9;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalShop16x9 extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop16x9 INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop16x9();
        private static final java.lang.String value = "PaypalShop16x9";

        private PaypalShop16x9() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalShop16x9";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop1x1;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalShop1x1 extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop1x1 INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop1x1();
        private static final java.lang.String value = "PaypalShop1x1";

        private PaypalShop1x1() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalShop1x1";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop4x5;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalShop4x5 extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop4x5 INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop4x5();
        private static final java.lang.String value = "PaypalShop4x5";

        private PaypalShop4x5() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalShop4x5";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$PaypalShop6x5;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaypalShop6x5 extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop6x5 INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop6x5();
        private static final java.lang.String value = "PaypalShop6x5";

        private PaypalShop6x5() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "PaypalShop6x5";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$VenmoFeedImage;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VenmoFeedImage extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.VenmoFeedImage INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.VenmoFeedImage();
        private static final java.lang.String value = "VenmoFeedImage";

        private VenmoFeedImage() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "VenmoFeedImage";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$SdkUnknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SdkUnknown extends com.paypal.oslo.feature.ads.data.models.smithy.AdFormat {
        public static final int $stable = 0;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkUnknown(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.AdFormat
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
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.SdkUnknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.SdkUnknown) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.SdkUnknown copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.SdkUnknown(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.SdkUnknown copy$default(com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.SdkUnknown sdkUnknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sdkUnknown.value;
            }
            return sdkUnknown.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/AdFormat;", "", "values", "()Ljava/util/List;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.AdFormat fromValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            switch (value.hashCode()) {
                case -1831485087:
                    if (value.equals("PaypalShop1x1")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop1x1.INSTANCE;
                    }
                    break;
                case -1831482200:
                    if (value.equals("PaypalShop4x5")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop4x5.INSTANCE;
                    }
                    break;
                case -1831480278:
                    if (value.equals("PaypalShop6x5")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop6x5.INSTANCE;
                    }
                    break;
                case -1375778308:
                    if (value.equals("VenmoFeedImage")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.VenmoFeedImage.INSTANCE;
                    }
                    break;
                case -941524017:
                    if (value.equals("PaypalShop16x9")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalShop16x9.INSTANCE;
                    }
                    break;
                case -571137539:
                    if (value.equals("PaypalNativeImageOnlyMediumRectangle")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMediumRectangle.INSTANCE;
                    }
                    break;
                case -111559621:
                    if (value.equals("PaypalNativeTextAndImage")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeTextAndImage.INSTANCE;
                    }
                    break;
                case 276242213:
                    if (value.equals("PaypalMobileMediumRectangle")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalMobileMediumRectangle.INSTANCE;
                    }
                    break;
                case 564425088:
                    if (value.equals("PaypalNativeImageOnlyLeaderboard")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyLeaderboard.INSTANCE;
                    }
                    break;
                case 1159860415:
                    if (value.equals("PaypalNativeImageOnlyMobile")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.PaypalNativeImageOnlyMobile.INSTANCE;
                    }
                    break;
                case 1371789758:
                    if (value.equals("OsloDisplayAd")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.OsloDisplayAd.INSTANCE;
                    }
                    break;
            }
            return new com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.SdkUnknown(value);
        }

        public final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.AdFormat> values() {
            return com.paypal.oslo.feature.ads.data.models.smithy.AdFormat.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AdFormat(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
