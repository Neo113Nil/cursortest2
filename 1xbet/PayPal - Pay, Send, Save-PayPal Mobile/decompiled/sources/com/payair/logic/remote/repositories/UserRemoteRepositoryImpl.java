package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/payair/logic/remote/repositories/UserRemoteRepositoryImpl;", "Lcom/payair/logic/remote/repositories/UserRemoteRepository;", "Lcom/payair/logic/remote/remoteServices/AssetsService;", "assetsService", "<init>", "(Lcom/payair/logic/remote/remoteServices/AssetsService;)V", "", "assetId", "network", "Lcom/payair/model/Response;", "getAssetAsync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserRemoteRepositoryImpl implements com.payair.logic.remote.repositories.UserRemoteRepository {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.remoteServices.AssetsService f4473a;

    public UserRemoteRepositoryImpl(com.payair.logic.remote.remoteServices.AssetsService assetsService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetsService, "");
        this.f4473a = assetsService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    @Override // com.payair.logic.remote.repositories.UserRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAssetAsync(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.a4 a4Var;
        int i;
        com.payair.logic.remote.model.MediaContentsDto mediaContentsDto;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.a4) {
            a4Var = (com.payair.csdk.a4) continuation;
            int i2 = a4Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a4Var.c = i2 - 2147483648;
                java.lang.Object obj = a4Var.f4229a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = a4Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.remoteServices.AssetsService assetsService = this.f4473a;
                    a4Var.c = 1;
                    obj = assetsService.getAssetAsync(str, str2, a4Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                mediaContentsDto = (com.payair.logic.remote.model.MediaContentsDto) obj;
                if (mediaContentsDto.isSuccessful()) {
                    java.lang.Integer statusCode2 = mediaContentsDto.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && mediaContentsDto.getStatusCode() != null) {
                        statusCode = mediaContentsDto.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = mediaContentsDto.getStatusCodeFromServer();
                        statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && mediaContentsDto.getStatusCodeFromServer() != null) ? mediaContentsDto.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = mediaContentsDto.getErrors();
                    if (errors != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                        emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                        for (com.payair.hce.ErrorModel errorModel : errors) {
                            com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                        }
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    error = new com.payair.model.Response.Error(i3, emptyList);
                } else {
                    try {
                        error = new com.payair.model.Response.Success(mediaContentsDto);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                }
                return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.b4.f4235a);
            }
        }
        a4Var = new com.payair.csdk.a4(this, continuation);
        java.lang.Object obj2 = a4Var.f4229a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = a4Var.c;
        if (i != 0) {
        }
        mediaContentsDto = (com.payair.logic.remote.model.MediaContentsDto) obj2;
        if (mediaContentsDto.isSuccessful()) {
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.b4.f4235a);
    }
}
