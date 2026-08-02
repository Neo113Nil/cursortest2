package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCDao;", "", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCData;", "tnCData", "", "storeTermsAndConditions", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/TnCData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getTermsAndConditions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTermsAndConditions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface TnCDao {
    java.lang.Object deleteTermsAndConditions(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getTermsAndConditions(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData> continuation);

    java.lang.Object storeTermsAndConditions(com.paypal.oslo.feature.taptopay.data.db.card.paypal.TnCData tnCData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
