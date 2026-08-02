package com.paypal.oslo.feature.directdeposit.ui.error.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\u0082\u0001\u0004\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig;", "", "Lcom/paypal/pds/core/Icon;", "p0", "", "p1", "p2", "p3", "<init>", "(Lcom/paypal/pds/core/Icon;ILjava/lang/Integer;I)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "title", com.visa.cbp.getEncExpo.warmup, "getTitle", "()I", "subtitle", "Ljava/lang/Integer;", "getSubtitle", "()Ljava/lang/Integer;", "buttonText", "getButtonText", "Retry", "NoNetwork", "Fatal", "FeatureUnavailable", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$Fatal;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$FeatureUnavailable;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$NoNetwork;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$Retry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DirectDepositErrorConfig {
    public static final int $stable = 0;
    private final int buttonText;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.Integer subtitle;
    private final int title;

    private DirectDepositErrorConfig(com.paypal.pds.core.Icon icon, int i, java.lang.Integer num, int i2) {
        this.icon = icon;
        this.title = i;
        this.subtitle = num;
        this.buttonText = i2;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final int getTitle() {
        return this.title;
    }

    public final java.lang.Integer getSubtitle() {
        return this.subtitle;
    }

    public final int getButtonText() {
        return this.buttonText;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$Retry;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retry extends com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Retry INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Retry();

        public final int hashCode() {
            return 361317354;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Retry() {
            super(r2, r3, java.lang.Integer.valueOf(r0), com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_genericerror_buttontryagain, null);
            com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
            int i = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_genericerror_heading;
            int i2 = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_genericerror_messagetryagain;
        }

        public final java.lang.String toString() {
            return "Retry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Retry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$NoNetwork;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoNetwork extends com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.NoNetwork INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.NoNetwork();

        public final int hashCode() {
            return -1285502609;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NoNetwork() {
            super(r2, r3, java.lang.Integer.valueOf(r0), com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_interneterror_buttontryagain, null);
            com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
            int i = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_interneterror_heading;
            int i2 = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_interneterror_messagetryagain;
        }

        public final java.lang.String toString() {
            return "NoNetwork";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.NoNetwork)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$Fatal;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fatal extends com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Fatal INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Fatal();

        public final int hashCode() {
            return 350115398;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Fatal() {
            super(r2, r3, java.lang.Integer.valueOf(r0), com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_genericerror_buttonok, null);
            com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
            int i = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_genericerror_heading;
            int i2 = com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_genericerror_messagetrymaxout;
        }

        public final java.lang.String toString() {
            return "Fatal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.Fatal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig$FeatureUnavailable;", "Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorConfig;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FeatureUnavailable extends com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.FeatureUnavailable INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.FeatureUnavailable();

        public final int hashCode() {
            return 609888632;
        }

        private FeatureUnavailable() {
            super(com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_featureunavailableerror_heading, null, com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_featureunavailableerror_buttonok, null);
        }

        public final java.lang.String toString() {
            return "FeatureUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorConfig.FeatureUnavailable)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DirectDepositErrorConfig(com.paypal.pds.core.Icon icon, int i, java.lang.Integer num, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, i, num, i2);
    }
}
