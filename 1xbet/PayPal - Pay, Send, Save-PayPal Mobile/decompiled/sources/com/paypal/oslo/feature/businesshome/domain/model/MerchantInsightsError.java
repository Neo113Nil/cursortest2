package com.paypal.oslo.feature.businesshome.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "", "NetworkError", "ServerError", "UnexpectedResponseError", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError$NetworkError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError$ServerError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError$UnexpectedResponseError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MerchantInsightsError {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError$NetworkError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError implements com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.NetworkError INSTANCE = new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.NetworkError();

        public final int hashCode() {
            return -772859852;
        }

        private NetworkError() {
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError$ServerError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError implements com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.ServerError INSTANCE = new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.ServerError();

        public final int hashCode() {
            return 1826226571;
        }

        private ServerError() {
        }

        public final java.lang.String toString() {
            return "ServerError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.ServerError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError$UnexpectedResponseError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedResponseError implements com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.UnexpectedResponseError INSTANCE = new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.UnexpectedResponseError();

        public final int hashCode() {
            return -1649606276;
        }

        private UnexpectedResponseError() {
        }

        public final java.lang.String toString() {
            return "UnexpectedResponseError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.UnexpectedResponseError)) {
                return false;
            }
            return true;
        }
    }
}
