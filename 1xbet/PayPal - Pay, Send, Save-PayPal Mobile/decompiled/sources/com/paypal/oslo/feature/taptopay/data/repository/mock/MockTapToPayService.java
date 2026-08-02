package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR3\u0010 \u001a\r\u0012\t\u0012\u00070\u001e¢\u0006\u0002\b\u001f0\u001d8\u0001@\u0001X\u0080.¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010\u0003\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTapToPayService;", "Landroid/nfc/cardemulation/HostApduService;", "<init>", "()V", "", "commandApdu", "Landroid/os/Bundle;", "extras", "processCommandApdu", "([BLandroid/os/Bundle;)[B", "", "reason", "", "onDeactivated", "(I)V", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "getCardRepository", "()Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "setCardRepository", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;)V", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;", "transactionRepository", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;", "getTransactionRepository$taptopay_prodRelease", "()Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;", "setTransactionRepository$taptopay_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OrphanedCardLifecycleDependency;", "Lkotlin/jvm/JvmSuppressWildcards;", "orphanedCardLifecycleDependencies", "Ljava/util/Set;", "getOrphanedCardLifecycleDependencies$taptopay_prodRelease", "()Ljava/util/Set;", "setOrphanedCardLifecycleDependencies$taptopay_prodRelease", "(Ljava/util/Set;)V", "getOrphanedCardLifecycleDependencies$taptopay_prodRelease$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes15.dex */
public final class MockTapToPayService extends com.paypal.oslo.feature.taptopay.data.repository.mock.Hilt_MockTapToPayService {
    public static final int $stable = 8;

    @javax.inject.Inject
    public com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository;

    @javax.inject.Inject
    public java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency> orphanedCardLifecycleDependencies;

    @javax.inject.Inject
    public com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository transactionRepository;

    public static /* synthetic */ void getOrphanedCardLifecycleDependencies$taptopay_prodRelease$annotations() {
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final void onDeactivated(int reason) {
    }

    public final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository getCardRepository() {
        com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository = this.cardRepository;
        if (cardRepository != null) {
            return cardRepository;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setCardRepository(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.cardRepository = cardRepository;
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository getTransactionRepository$taptopay_prodRelease() {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository mockTransactionRepository = this.transactionRepository;
        if (mockTransactionRepository != null) {
            return mockTransactionRepository;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setTransactionRepository$taptopay_prodRelease(com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository mockTransactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockTransactionRepository, "");
        this.transactionRepository = mockTransactionRepository;
    }

    public final java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency> getOrphanedCardLifecycleDependencies$taptopay_prodRelease() {
        java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency> set = this.orphanedCardLifecycleDependencies;
        if (set != null) {
            return set;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setOrphanedCardLifecycleDependencies$taptopay_prodRelease(java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.orphanedCardLifecycleDependencies = set;
    }

    @Override // android.nfc.cardemulation.HostApduService
    public final byte[] processCommandApdu(byte[] commandApdu, android.os.Bundle extras) {
        android.widget.Toast.makeText(this, "Tap Payment Triggered", 0).show();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO()), null, null, new com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService$processCommandApdu$1(this, null), 3, null);
        return new byte[]{0};
    }

    public static final /* synthetic */ void access$notifyMockTransaction(com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService mockTapToPayService, java.lang.String str) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository transactionRepository$taptopay_prodRelease = mockTapToPayService.getTransactionRepository$taptopay_prodRelease();
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        if (str == null) {
            str = "xyz";
        }
        transactionRepository$taptopay_prodRelease.notify$taptopay_prodRelease(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction(obj, str, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.APPROVED, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE, 1.99d, "USD", "$1.99", new java.util.Date(), "Acme Hardware", "95131", "5251")));
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.Hilt_MockTapToPayService, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.mock.Hilt_MockTapToPayService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
