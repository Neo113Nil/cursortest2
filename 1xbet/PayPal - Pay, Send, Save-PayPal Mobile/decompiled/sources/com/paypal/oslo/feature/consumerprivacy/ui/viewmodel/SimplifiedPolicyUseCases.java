package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/SimplifiedPolicyUseCases;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindByIdentifiersUseCase;", "updateAllowFindByIdentifiers", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowPaymentRequestsUseCase;", "updateAllowPaymentRequests", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePaymentRequestsFromUseCase;", "updatePaymentRequestsFrom", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindViaPayPalMeUseCase;", "updateAllowFindViaPayPalMe", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowVenmoDiscoveryUseCase;", "updateAllowVenmoDiscovery", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindByIdentifiersUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowPaymentRequestsUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePaymentRequestsFromUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindViaPayPalMeUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowVenmoDiscoveryUseCase;)V", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindByIdentifiersUseCase;", "getUpdateAllowFindByIdentifiers", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindByIdentifiersUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowPaymentRequestsUseCase;", "getUpdateAllowPaymentRequests", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowPaymentRequestsUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePaymentRequestsFromUseCase;", "getUpdatePaymentRequestsFrom", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePaymentRequestsFromUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindViaPayPalMeUseCase;", "getUpdateAllowFindViaPayPalMe", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindViaPayPalMeUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowVenmoDiscoveryUseCase;", "getUpdateAllowVenmoDiscovery", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowVenmoDiscoveryUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SimplifiedPolicyUseCases {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindByIdentifiersUseCase updateAllowFindByIdentifiers;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase updateAllowFindViaPayPalMe;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowPaymentRequestsUseCase updateAllowPaymentRequests;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowVenmoDiscoveryUseCase updateAllowVenmoDiscovery;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePaymentRequestsFromUseCase updatePaymentRequestsFrom;

    @javax.inject.Inject
    public SimplifiedPolicyUseCases(com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindByIdentifiersUseCase updateAllowFindByIdentifiersUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowPaymentRequestsUseCase updateAllowPaymentRequestsUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePaymentRequestsFromUseCase updatePaymentRequestsFromUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase updateAllowFindViaPayPalMeUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowVenmoDiscoveryUseCase updateAllowVenmoDiscoveryUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowFindByIdentifiersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowPaymentRequestsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentRequestsFromUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowFindViaPayPalMeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAllowVenmoDiscoveryUseCase, "");
        this.updateAllowFindByIdentifiers = updateAllowFindByIdentifiersUseCase;
        this.updateAllowPaymentRequests = updateAllowPaymentRequestsUseCase;
        this.updatePaymentRequestsFrom = updatePaymentRequestsFromUseCase;
        this.updateAllowFindViaPayPalMe = updateAllowFindViaPayPalMeUseCase;
        this.updateAllowVenmoDiscovery = updateAllowVenmoDiscoveryUseCase;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindByIdentifiersUseCase getUpdateAllowFindByIdentifiers() {
        return this.updateAllowFindByIdentifiers;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowPaymentRequestsUseCase getUpdateAllowPaymentRequests() {
        return this.updateAllowPaymentRequests;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePaymentRequestsFromUseCase getUpdatePaymentRequestsFrom() {
        return this.updatePaymentRequestsFrom;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase getUpdateAllowFindViaPayPalMe() {
        return this.updateAllowFindViaPayPalMe;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowVenmoDiscoveryUseCase getUpdateAllowVenmoDiscovery() {
        return this.updateAllowVenmoDiscovery;
    }
}
