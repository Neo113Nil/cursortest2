package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockTncDao;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockTncData;", "mockTncData", "", "storeTnC", "(Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/MockTncData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deviceWalletServiceCardId", "getTnC", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTnc"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MockTncDao {
    java.lang.Object deleteTnc(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getTnC(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncData> continuation);

    java.lang.Object storeTnC(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.MockTncData mockTncData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
