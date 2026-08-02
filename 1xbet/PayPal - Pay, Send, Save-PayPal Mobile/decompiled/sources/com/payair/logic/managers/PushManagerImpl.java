package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/payair/logic/managers/PushManagerImpl;", "Lcom/payair/logic/managers/PushManager;", "Lcom/payair/logic/remote/repositories/PushRemoteRepository;", "pushRepository", "Lcom/payair/logic/implementation/FirebaseInterface;", "firebaseInterface", "<init>", "(Lcom/payair/logic/remote/repositories/PushRemoteRepository;Lcom/payair/logic/implementation/FirebaseInterface;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/payair/model/PushTokenType;", "type", "Lcom/payair/model/Response;", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateCSDKPushToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateMdesPushToken"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushManagerImpl implements com.payair.logic.managers.PushManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.repositories.PushRemoteRepository f4447a;
    public final com.payair.logic.implementation.FirebaseInterface b;

    public PushManagerImpl(com.payair.logic.remote.repositories.PushRemoteRepository pushRemoteRepository, com.payair.logic.implementation.FirebaseInterface firebaseInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushRemoteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInterface, "");
        this.f4447a = pushRemoteRepository;
        this.b = firebaseInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.logic.managers.PushManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateCSDKPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.payair.csdk.b2 b2Var;
        int i;
        java.lang.String str;
        if (continuation instanceof com.payair.csdk.b2) {
            b2Var = (com.payair.csdk.b2) continuation;
            int i2 = b2Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2Var.c = i2 - 2147483648;
                java.lang.Object obj = b2Var.f4233a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = b2Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.implementation.FirebaseInterface firebaseInterface = this.b;
                    b2Var.c = 1;
                    obj = firebaseInterface.generateCSDKPushToken(b2Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null || str.length() == 0) {
                    throw new com.payair.logic.managers.FirebaseTokenGenerationException("Null or empty Payair firebase token");
                }
                return str;
            }
        }
        b2Var = new com.payair.csdk.b2(this, continuation);
        java.lang.Object obj2 = b2Var.f4233a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = b2Var.c;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        throw new com.payair.logic.managers.FirebaseTokenGenerationException("Null or empty Payair firebase token");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.logic.managers.PushManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateMdesPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.payair.csdk.c2 c2Var;
        int i;
        java.lang.String str;
        if (continuation instanceof com.payair.csdk.c2) {
            c2Var = (com.payair.csdk.c2) continuation;
            int i2 = c2Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2Var.c = i2 - 2147483648;
                java.lang.Object obj = c2Var.f4238a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.implementation.FirebaseInterface firebaseInterface = this.b;
                    c2Var.c = 1;
                    obj = firebaseInterface.generateMdesPushToken(c2Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null || str.length() == 0) {
                    throw new com.payair.logic.managers.FirebaseTokenGenerationException("Null or empty MDES firebase token");
                }
                return str;
            }
        }
        c2Var = new com.payair.csdk.c2(this, continuation);
        java.lang.Object obj2 = c2Var.f4238a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2Var.c;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        throw new com.payair.logic.managers.FirebaseTokenGenerationException("Null or empty MDES firebase token");
    }

    @Override // com.payair.logic.managers.PushManager
    public final java.lang.Object updateFirebaseToken(java.lang.String str, com.payair.model.PushTokenType pushTokenType, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        if (!kotlin.text.StringsKt.isBlank(str) || pushTokenType == com.payair.model.PushTokenType.MDES) {
            return this.f4447a.updateFirebaseToken(str, pushTokenType, continuation);
        }
        com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "Cannot register empty token!", null, null, 6, null);
        return new com.payair.model.Response.Error(107, null, 2, null);
    }
}
