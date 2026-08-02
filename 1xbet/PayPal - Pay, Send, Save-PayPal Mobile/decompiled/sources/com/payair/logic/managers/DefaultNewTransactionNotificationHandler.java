package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/payair/logic/managers/DefaultNewTransactionNotificationHandler;", "Lcom/payair/logic/managers/NewTransactionNotificationHandler;", "Lcom/payair/logic/managers/TransactionHistoryManager;", "transactionHistoryManager", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lcom/payair/logic/managers/TransactionHistoryManager;Lcom/payair/logic/managers/CoroutineDispatcherProvider;)V", "", com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "", "handleNewTransaction", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultNewTransactionNotificationHandler implements com.payair.logic.managers.NewTransactionNotificationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.managers.TransactionHistoryManager f4443a;
    public final com.payair.logic.managers.CoroutineDispatcherProvider b;

    public DefaultNewTransactionNotificationHandler(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        this.f4443a = transactionHistoryManager;
        this.b = coroutineDispatcherProvider;
    }

    @Override // com.payair.logic.managers.NewTransactionNotificationHandler
    public final void handleNewTransaction(java.lang.String tokenUniqueReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenUniqueReference, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b.getIOScope(), null, null, new com.payair.csdk.l0(this, tokenUniqueReference, null), 3, null);
    }
}
