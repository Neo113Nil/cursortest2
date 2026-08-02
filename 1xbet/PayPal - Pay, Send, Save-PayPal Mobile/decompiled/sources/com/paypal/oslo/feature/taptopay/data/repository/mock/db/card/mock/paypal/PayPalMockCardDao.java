package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\r\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0012\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardDao;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockDeviceWallet;", "payPalMockDeviceWallet", "", "notifyCardAdded", "(Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockDeviceWallet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/paypal/PayPalMockCardIdGroup;", "getCardGroupByDigitizedCardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardGroupByPayPalCardId", "getCardGroupByDeviceWalletServiceCardId", "", "getCardIdGroups", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceWalletServiceCardId", "notifyCardDeleted"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PayPalMockCardDao {
    java.lang.Object getCardGroupByDeviceWalletServiceCardId(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup> continuation);

    java.lang.Object getCardGroupByDigitizedCardId(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup> continuation);

    java.lang.Object getCardGroupByPayPalCardId(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup> continuation);

    java.lang.Object getCardIdGroups(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockCardIdGroup>> continuation);

    java.lang.Object notifyCardAdded(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.paypal.PayPalMockDeviceWallet payPalMockDeviceWallet, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object notifyCardDeleted(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
