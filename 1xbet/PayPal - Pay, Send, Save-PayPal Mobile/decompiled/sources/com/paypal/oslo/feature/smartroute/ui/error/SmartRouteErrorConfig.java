package com.paypal.oslo.feature.smartroute.ui.error;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\u0082\u0001\u0004\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig;", "", "Lcom/paypal/pds/core/Icon;", "p0", "", "p1", "p2", "p3", "<init>", "(Lcom/paypal/pds/core/Icon;III)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "title", com.visa.cbp.getEncExpo.warmup, "getTitle", "()I", "subtitle", "getSubtitle", "buttonText", "getButtonText", "NoNetwork", "Retry", "Fatal", "FeatureUnavailable", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$Fatal;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$FeatureUnavailable;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$NoNetwork;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$Retry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SmartRouteErrorConfig {
    public static final int $stable = 0;
    private final int buttonText;
    private final com.paypal.pds.core.Icon icon;
    private final int subtitle;
    private final int title;

    private SmartRouteErrorConfig(com.paypal.pds.core.Icon icon, int i, int i2, int i3) {
        this.icon = icon;
        this.title = i;
        this.subtitle = i2;
        this.buttonText = i3;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final int getButtonText() {
        return this.buttonText;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$NoNetwork;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoNetwork extends com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.NoNetwork INSTANCE = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.NoNetwork();

        public final int hashCode() {
            return 1019369414;
        }

        private NoNetwork() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_error_screen_no_network_title, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_error_screen_no_network_subtitle, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_generic_error_button_try_again, null);
        }

        public final java.lang.String toString() {
            return "NoNetwork";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.NoNetwork)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$Retry;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retry extends com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Retry INSTANCE = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Retry();

        public final int hashCode() {
            return -1952082495;
        }

        private Retry() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_error_screen_title, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_generic_error_message_try_again, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_generic_error_button_try_again, null);
        }

        public final java.lang.String toString() {
            return "Retry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Retry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$Fatal;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fatal extends com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Fatal INSTANCE = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Fatal();

        public final int hashCode() {
            return -1963284451;
        }

        private Fatal() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_error_screen_title, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_error_screen_fatal_subtitle, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_generic_error_button_ok, null);
        }

        public final java.lang.String toString() {
            return "Fatal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.Fatal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig$FeatureUnavailable;", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FeatureUnavailable extends com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.FeatureUnavailable INSTANCE = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.FeatureUnavailable();

        public final int hashCode() {
            return 1506659585;
        }

        private FeatureUnavailable() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_error_screen_title, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_error_screen_fatal_subtitle, com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_generic_error_button_ok, null);
        }

        public final java.lang.String toString() {
            return "FeatureUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorConfig.FeatureUnavailable)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SmartRouteErrorConfig(com.paypal.pds.core.Icon icon, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, i, i2, i3);
    }
}
