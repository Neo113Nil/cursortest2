package com.zettle.sdk.feature.taptopay.core.retrieve;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "", "", "referenceId", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult;", "", com.sun.jna.Callback.METHOD_NAME, "retrieveCardPaymentInfo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RetrieveTransaction {
    void retrieveCardPaymentInfo(java.lang.String referenceId, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit> callback);
}
