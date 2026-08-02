package com.paypal.oslo.downloads.api;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/api/DownloadStorageProvider;", "", "", "getDefaultStorageDirectory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category", "getStorageDirectory", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DownloadStorageProvider {
    java.lang.Object getDefaultStorageDirectory(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object getStorageDirectory(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}
