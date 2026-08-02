package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b2\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "", "<init>", "()V", "", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion", com.adjust.sdk.Constants.LOGTAG, "Adobe", "AppsFlyer", "Dcm", "Ias", "Kochava", "LiveRamp", "SdkUnknown", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Adjust;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Adobe;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$AppsFlyer;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Dcm;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Ias;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Kochava;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$LiveRamp;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$SdkUnknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TrackerVendor {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Companion(null);
    private static final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor[]{com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adjust.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adobe.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.AppsFlyer.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Dcm.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Ias.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Kochava.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.LiveRamp.INSTANCE});

    public abstract java.lang.String getValue();

    private TrackerVendor() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Adjust;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Adjust extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adjust INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adjust();
        private static final java.lang.String value = com.adjust.sdk.Constants.LOGTAG;

        private Adjust() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return com.adjust.sdk.Constants.LOGTAG;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Adobe;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Adobe extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adobe INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adobe();
        private static final java.lang.String value = "Adobe";

        private Adobe() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Adobe";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$AppsFlyer;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AppsFlyer extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.AppsFlyer INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.AppsFlyer();
        private static final java.lang.String value = "AppsFlyer";

        private AppsFlyer() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "AppsFlyer";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Dcm;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Dcm extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Dcm INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Dcm();
        private static final java.lang.String value = "DCM";

        private Dcm() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Dcm";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Ias;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Ias extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Ias INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Ias();
        private static final java.lang.String value = "IAS";

        private Ias() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Ias";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Kochava;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Kochava extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Kochava INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Kochava();
        private static final java.lang.String value = "Kochava";

        private Kochava() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Kochava";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$LiveRamp;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LiveRamp extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.LiveRamp INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.LiveRamp();
        private static final java.lang.String value = "LiveRamp";

        private LiveRamp() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "LiveRamp";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$SdkUnknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SdkUnknown extends com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor {
        public static final int $stable = 0;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkUnknown(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor
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
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.SdkUnknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.SdkUnknown) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.SdkUnknown copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.SdkUnknown(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.SdkUnknown copy$default(com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.SdkUnknown sdkUnknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sdkUnknown.value;
            }
            return sdkUnknown.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/TrackerVendor;", "", "values", "()Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor fromValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            switch (value.hashCode()) {
                case 67502:
                    if (value.equals("DCM")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Dcm.INSTANCE;
                    }
                    break;
                case 72251:
                    if (value.equals("IAS")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Ias.INSTANCE;
                    }
                    break;
                case 63117775:
                    if (value.equals("Adobe")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adobe.INSTANCE;
                    }
                    break;
                case 82339054:
                    if (value.equals("AppsFlyer")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.AppsFlyer.INSTANCE;
                    }
                    break;
                case 1115758915:
                    if (value.equals("Kochava")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Kochava.INSTANCE;
                    }
                    break;
                case 1482260286:
                    if (value.equals("LiveRamp")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.LiveRamp.INSTANCE;
                    }
                    break;
                case 1956520879:
                    if (value.equals(com.adjust.sdk.Constants.LOGTAG)) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.Adjust.INSTANCE;
                    }
                    break;
            }
            return new com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.SdkUnknown(value);
        }

        public final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor> values() {
            return com.paypal.oslo.feature.ads.data.models.smithy.TrackerVendor.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TrackerVendor(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
