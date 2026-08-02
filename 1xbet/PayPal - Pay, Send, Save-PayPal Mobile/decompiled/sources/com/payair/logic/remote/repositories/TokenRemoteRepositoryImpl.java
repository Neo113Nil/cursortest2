package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/payair/logic/remote/repositories/TokenRemoteRepositoryImpl;", "Lcom/payair/logic/remote/repositories/TokenRemoteRepository;", "Lcom/payair/logic/remote/remoteServices/TokenService;", "tokenService", "Lcom/payair/logic/storage/StorageService;", "storageService", "<init>", "(Lcom/payair/logic/remote/remoteServices/TokenService;Lcom/payair/logic/storage/StorageService;)V", "", "paymentAppInstanceId", "networkTokenReference", "Lcom/payair/model/Response;", "getTokenDetailsAsync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardReference", "getTokenList", "getTokensCardReference", "getAuthenticationMethods"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenRemoteRepositoryImpl implements com.payair.logic.remote.repositories.TokenRemoteRepository {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.remoteServices.TokenService f4471a;
    public final com.payair.logic.storage.StorageService b;

    public TokenRemoteRepositoryImpl(com.payair.logic.remote.remoteServices.TokenService tokenService, com.payair.logic.storage.StorageService storageService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        this.f4471a = tokenService;
        this.b = storageService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.TokenRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAuthenticationMethods(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.o3 o3Var;
        int i;
        com.payair.hce.communication.JsonResponse jsonResponse;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.o3) {
            o3Var = (com.payair.csdk.o3) continuation;
            int i2 = o3Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o3Var.c = i2 - 2147483648;
                java.lang.Object obj = o3Var.f4295a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = o3Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.remoteServices.TokenService tokenService = this.f4471a;
                    o3Var.c = 1;
                    obj = tokenService.getAuthenticationMethods(str, str2, o3Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                jsonResponse = (com.payair.hce.communication.JsonResponse) obj;
                if (jsonResponse.isSuccessful()) {
                    java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
                        statusCode = jsonResponse.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
                        statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) ? jsonResponse.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
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
                        error = new com.payair.model.Response.Success((com.payair.logic.remote.model.ResponseGetAuthenticationMethodsDto) jsonResponse);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                }
                return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.p3.f4300a);
            }
        }
        o3Var = new com.payair.csdk.o3(this, continuation);
        java.lang.Object obj2 = o3Var.f4295a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = o3Var.c;
        if (i != 0) {
        }
        jsonResponse = (com.payair.hce.communication.JsonResponse) obj2;
        if (jsonResponse.isSuccessful()) {
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.p3.f4300a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.TokenRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTokenDetailsAsync(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.q3 q3Var;
        int i;
        com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl tokenRemoteRepositoryImpl;
        com.payair.hce.communication.JsonResponse jsonResponse;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.q3) {
            q3Var = (com.payair.csdk.q3) continuation;
            int i2 = q3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3Var.d = i2 - 2147483648;
                java.lang.Object obj = q3Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = q3Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.remoteServices.TokenService tokenService = this.f4471a;
                    q3Var.f4304a = this;
                    q3Var.d = 1;
                    obj = tokenService.getTokenDetailsAsync(str, str2, q3Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tokenRemoteRepositoryImpl = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tokenRemoteRepositoryImpl = q3Var.f4304a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                jsonResponse = (com.payair.hce.communication.JsonResponse) obj;
                if (jsonResponse.isSuccessful()) {
                    java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
                        statusCode = jsonResponse.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
                        statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) ? jsonResponse.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
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
                        error = new com.payair.model.Response.Success((com.payair.logic.remote.model.TokenDetailsDto) jsonResponse);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                }
                return com.payair.model.ResponseKt.mapIfSuccess(error, new com.payair.csdk.r3(tokenRemoteRepositoryImpl));
            }
        }
        q3Var = new com.payair.csdk.q3(this, continuation);
        java.lang.Object obj2 = q3Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = q3Var.d;
        if (i != 0) {
        }
        jsonResponse = (com.payair.hce.communication.JsonResponse) obj2;
        if (jsonResponse.isSuccessful()) {
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, new com.payair.csdk.r3(tokenRemoteRepositoryImpl));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.TokenRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTokenList(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.s3 s3Var;
        int i;
        com.payair.hce.communication.JsonResponse jsonResponse;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.s3) {
            s3Var = (com.payair.csdk.s3) continuation;
            int i2 = s3Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s3Var.c = i2 - 2147483648;
                java.lang.Object obj = s3Var.f4313a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s3Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.remoteServices.TokenService tokenService = this.f4471a;
                    s3Var.c = 1;
                    obj = tokenService.getTokenList(str, str2, s3Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                jsonResponse = (com.payair.hce.communication.JsonResponse) obj;
                if (jsonResponse.isSuccessful()) {
                    java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
                        statusCode = jsonResponse.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
                        statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) ? jsonResponse.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
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
                        error = new com.payair.model.Response.Success((com.payair.logic.remote.model.TokensListDto) jsonResponse);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                }
                return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.t3.f4318a);
            }
        }
        s3Var = new com.payair.csdk.s3(this, continuation);
        java.lang.Object obj2 = s3Var.f4313a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s3Var.c;
        if (i != 0) {
        }
        jsonResponse = (com.payair.hce.communication.JsonResponse) obj2;
        if (jsonResponse.isSuccessful()) {
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.t3.f4318a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.TokenRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTokensCardReference(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.u3 u3Var;
        int i;
        com.payair.hce.communication.JsonResponse jsonResponse;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.u3) {
            u3Var = (com.payair.csdk.u3) continuation;
            int i2 = u3Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u3Var.c = i2 - 2147483648;
                java.lang.Object obj = u3Var.f4323a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = u3Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.remoteServices.TokenService tokenService = this.f4471a;
                    u3Var.c = 1;
                    obj = tokenService.getTokensCardReference(str, str2, u3Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                jsonResponse = (com.payair.hce.communication.JsonResponse) obj;
                if (jsonResponse.isSuccessful()) {
                    java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
                        statusCode = jsonResponse.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
                        statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) ? jsonResponse.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
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
                        error = new com.payair.model.Response.Success((com.payair.logic.remote.model.TokensCardReferenceDto) jsonResponse);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                }
                return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.v3.f4327a);
            }
        }
        u3Var = new com.payair.csdk.u3(this, continuation);
        java.lang.Object obj2 = u3Var.f4323a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = u3Var.c;
        if (i != 0) {
        }
        jsonResponse = (com.payair.hce.communication.JsonResponse) obj2;
        if (jsonResponse.isSuccessful()) {
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.v3.f4327a);
    }
}
