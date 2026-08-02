package com.payair.logic.remote.remoteServices;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/payair/logic/remote/remoteServices/AssetsServiceImpl;", "Lcom/payair/logic/remote/remoteServices/AssetsService;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDKInterface", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;)V", "", "assetId", "network", "Lcom/payair/logic/remote/model/MediaContentsDto;", "getAssetAsync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetsServiceImpl implements com.payair.logic.remote.remoteServices.AssetsService {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4465a;

    public AssetsServiceImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        this.f4465a = hceSDKInterface;
    }

    @Override // com.payair.logic.remote.remoteServices.AssetsService
    public final java.lang.Object getAssetAsync(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.MediaContentsDto> continuation) {
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.MediaContentsDto.class, this.f4465a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.GET_ASSET_V2, java.util.Arrays.copyOf(new java.lang.Object[]{str, str2}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return builder.endpoint(format).sendRequest();
    }
}
