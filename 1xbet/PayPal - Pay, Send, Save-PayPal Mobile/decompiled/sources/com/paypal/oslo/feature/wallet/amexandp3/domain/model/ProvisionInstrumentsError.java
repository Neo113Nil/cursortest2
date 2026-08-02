package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError;", "", "Business", "Network", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProvisionInstrumentsError {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError;", "InstrumentCountLimitReached", "ValidationError", "NoDataAvailable", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business$InstrumentCountLimitReached;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business$NoDataAvailable;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Business extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business$InstrumentCountLimitReached;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InstrumentCountLimitReached implements com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.InstrumentCountLimitReached INSTANCE = new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.InstrumentCountLimitReached();

            public final int hashCode() {
                return 1199261990;
            }

            private InstrumentCountLimitReached() {
            }

            public final java.lang.String toString() {
                return "InstrumentCountLimitReached";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.InstrumentCountLimitReached)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business$ValidationError;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ValidationError implements com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.ValidationError INSTANCE = new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.ValidationError();

            public final int hashCode() {
                return 647021078;
            }

            private ValidationError() {
            }

            public final java.lang.String toString() {
                return "ValidationError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.ValidationError)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business$NoDataAvailable;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoDataAvailable implements com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.NoDataAvailable INSTANCE = new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.NoDataAvailable();

            public final int hashCode() {
                return 1340523269;
            }

            private NoDataAvailable() {
            }

            public final java.lang.String toString() {
                return "NoDataAvailable";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.NoDataAvailable)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError$Network;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network implements com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Network INSTANCE = new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Network();

        public final int hashCode() {
            return 1201021497;
        }

        private Network() {
        }

        public final java.lang.String toString() {
            return "Network";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Network)) {
                return false;
            }
            return true;
        }
    }
}
