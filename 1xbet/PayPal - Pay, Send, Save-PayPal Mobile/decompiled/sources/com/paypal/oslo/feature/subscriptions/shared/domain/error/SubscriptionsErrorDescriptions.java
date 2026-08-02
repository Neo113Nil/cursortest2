package com.paypal.oslo.feature.subscriptions.shared.domain.error;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions;", "", "<init>", "()V", "Network", "SubscriptionsHub", "SubscriptionDetails", "BusinessesHub", "LinkAgreements", "DisableAgreement", "UpdateFi", "BulkFi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsErrorDescriptions {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions();

    private SubscriptionsErrorDescriptions() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$Network;", "", "<init>", "()V", "", "NO_INTERNET_CODE", "Ljava/lang/String;", "NO_INTERNET_DESCRIPTION", "UNKNOWN_CODE", "UNKNOWN_DESCRIPTION", "HTTP_ERROR_FALLBACK_PREFIX", "GRAPHQL_ERROR_CODE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Network {
        public static final int $stable = 0;
        public static final java.lang.String GRAPHQL_ERROR_CODE = "GRAPHQL_ERROR";
        public static final java.lang.String HTTP_ERROR_FALLBACK_PREFIX = "HTTP error";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network();
        public static final java.lang.String NO_INTERNET_CODE = "NO_INTERNET";
        public static final java.lang.String NO_INTERNET_DESCRIPTION = "No internet connection available";
        public static final java.lang.String UNKNOWN_CODE = "UNKNOWN";
        public static final java.lang.String UNKNOWN_DESCRIPTION = "Unknown network error occurred";

        private Network() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$SubscriptionsHub;", "", "<init>", "()V", "", "DATA_NOT_FOUND", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SubscriptionsHub {
        public static final int $stable = 0;
        public static final java.lang.String DATA_NOT_FOUND = "Consumer agreements list data not found in GraphQL response";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.SubscriptionsHub INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.SubscriptionsHub();

        private SubscriptionsHub() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$SubscriptionDetails;", "", "<init>", "()V", "", "DATA_NOT_FOUND", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SubscriptionDetails {
        public static final int $stable = 0;
        public static final java.lang.String DATA_NOT_FOUND = "Consumer agreement details data not found in GraphQL response";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.SubscriptionDetails INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.SubscriptionDetails();

        private SubscriptionDetails() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$BusinessesHub;", "", "<init>", "()V", "", "DATA_NOT_FOUND", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BusinessesHub {
        public static final int $stable = 0;
        public static final java.lang.String DATA_NOT_FOUND = "Linked businesses data not found in GraphQL response";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.BusinessesHub INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.BusinessesHub();

        private BusinessesHub() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$LinkAgreements;", "", "<init>", "()V", "", "DATA_NOT_FOUND", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LinkAgreements {
        public static final int $stable = 0;
        public static final java.lang.String DATA_NOT_FOUND = "Available merchants data not found in GraphQL response";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.LinkAgreements INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.LinkAgreements();

        private LinkAgreements() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$DisableAgreement;", "", "<init>", "()V", "", "DATA_NOT_FOUND", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisableAgreement {
        public static final int $stable = 0;
        public static final java.lang.String DATA_NOT_FOUND = "Disable consumer agreement data not found in GraphQL response";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.DisableAgreement INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.DisableAgreement();

        private DisableAgreement() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$UpdateFi;", "", "<init>", "()V", "", "FUNDING_INSTRUMENTS_NOT_FOUND", "Ljava/lang/String;", "UPDATE_FI_NO_RESULTS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdateFi {
        public static final int $stable = 0;
        public static final java.lang.String FUNDING_INSTRUMENTS_NOT_FOUND = "Funding instruments data not found in GraphQL response";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.UpdateFi INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.UpdateFi();
        public static final java.lang.String UPDATE_FI_NO_RESULTS = "Update preferred funding instrument returned no results";

        private UpdateFi() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsErrorDescriptions$BulkFi;", "", "<init>", "()V", "", "DATA_NOT_FOUND", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BulkFi {
        public static final int $stable = 0;
        public static final java.lang.String DATA_NOT_FOUND = "Consumer agreements by funding instrument data not found";
        public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.BulkFi INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.BulkFi();

        private BulkFi() {
        }
    }
}
