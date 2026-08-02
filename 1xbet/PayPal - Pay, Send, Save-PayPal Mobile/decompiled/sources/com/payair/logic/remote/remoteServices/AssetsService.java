package com.payair.logic.remote.remoteServices;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/remoteServices/AssetsService;", "", "", "assetId", "network", "Lcom/payair/logic/remote/model/MediaContentsDto;", "getAssetAsync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AssetsService {
    java.lang.Object getAssetAsync(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.MediaContentsDto> continuation);
}
