package com.paypal.oslo.feature.ads.data.models.smithy;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b2\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "", "<init>", "()V", "", "getValue", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion", "CollectionsDefault", "Default", com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoTestTag.FOOTER, "Header", "Hero", "Side", "SdkUnknown", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$CollectionsDefault;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Default;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Footer;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Header;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Hero;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Side;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Placement {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.ads.data.models.smithy.Placement.Companion INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Placement.Companion(null);
    private static final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.Placement> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.ads.data.models.smithy.Placement[]{com.paypal.oslo.feature.ads.data.models.smithy.Placement.CollectionsDefault.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.Placement.Default.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.Placement.Footer.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.Placement.Header.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.Placement.Hero.INSTANCE, com.paypal.oslo.feature.ads.data.models.smithy.Placement.Side.INSTANCE});

    public abstract java.lang.String getValue();

    private Placement() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$CollectionsDefault;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CollectionsDefault extends com.paypal.oslo.feature.ads.data.models.smithy.Placement {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.Placement.CollectionsDefault INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Placement.CollectionsDefault();
        private static final java.lang.String value = "CollectionsDefault";

        private CollectionsDefault() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.Placement
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "CollectionsDefault";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Default;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Default extends com.paypal.oslo.feature.ads.data.models.smithy.Placement {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.Placement.Default INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Placement.Default();
        private static final java.lang.String value = "Default";

        private Default() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.Placement
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Default";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Footer;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Footer extends com.paypal.oslo.feature.ads.data.models.smithy.Placement {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.Placement.Footer INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Placement.Footer();
        private static final java.lang.String value = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoTestTag.FOOTER;

        private Footer() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.Placement
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoTestTag.FOOTER;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Header;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Header extends com.paypal.oslo.feature.ads.data.models.smithy.Placement {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.Placement.Header INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Placement.Header();
        private static final java.lang.String value = "Header";

        private Header() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.Placement
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Header";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Hero;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Hero extends com.paypal.oslo.feature.ads.data.models.smithy.Placement {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.Placement.Hero INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Placement.Hero();
        private static final java.lang.String value = "Hero";

        private Hero() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.Placement
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Hero";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Side;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Side extends com.paypal.oslo.feature.ads.data.models.smithy.Placement {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.ads.data.models.smithy.Placement.Side INSTANCE = new com.paypal.oslo.feature.ads.data.models.smithy.Placement.Side();
        private static final java.lang.String value = "Side";

        private Side() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.Placement
        public final java.lang.String getValue() {
            return value;
        }

        public final java.lang.String toString() {
            return "Side";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$SdkUnknown;", "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$SdkUnknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SdkUnknown extends com.paypal.oslo.feature.ads.data.models.smithy.Placement {
        public static final int $stable = 0;
        private final java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkUnknown(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        @Override // com.paypal.oslo.feature.ads.data.models.smithy.Placement
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
            return (other instanceof com.paypal.oslo.feature.ads.data.models.smithy.Placement.SdkUnknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.ads.data.models.smithy.Placement.SdkUnknown) other).value);
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Placement.SdkUnknown copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.ads.data.models.smithy.Placement.SdkUnknown(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.Placement.SdkUnknown copy$default(com.paypal.oslo.feature.ads.data.models.smithy.Placement.SdkUnknown sdkUnknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sdkUnknown.value;
            }
            return sdkUnknown.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/models/smithy/Placement;", "", "values", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.ads.data.models.smithy.Placement fromValue(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            switch (value.hashCode()) {
                case -2137403731:
                    if (value.equals("Header")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.Placement.Header.INSTANCE;
                    }
                    break;
                case -1085510111:
                    if (value.equals("Default")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.Placement.Default.INSTANCE;
                    }
                    break;
                case 2245658:
                    if (value.equals("Hero")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.Placement.Hero.INSTANCE;
                    }
                    break;
                case 2576759:
                    if (value.equals("Side")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.Placement.Side.INSTANCE;
                    }
                    break;
                case 1880851212:
                    if (value.equals("CollectionsDefault")) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.Placement.CollectionsDefault.INSTANCE;
                    }
                    break;
                case 2109972923:
                    if (value.equals(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoTestTag.FOOTER)) {
                        return com.paypal.oslo.feature.ads.data.models.smithy.Placement.Footer.INSTANCE;
                    }
                    break;
            }
            return new com.paypal.oslo.feature.ads.data.models.smithy.Placement.SdkUnknown(value);
        }

        public final java.util.List<com.paypal.oslo.feature.ads.data.models.smithy.Placement> values() {
            return com.paypal.oslo.feature.ads.data.models.smithy.Placement.getHighSpeedVideoFpsRangesFor;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Placement(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
