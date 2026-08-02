package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/payair/logic/implementation/FirebaseInterfaceImpl;", "Lcom/payair/logic/implementation/FirebaseInterface;", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lcom/payair/logic/managers/CoroutineDispatcherProvider;)V", "", "generateCSDKPushToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateMdesPushToken"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FirebaseInterfaceImpl implements com.payair.logic.implementation.FirebaseInterface {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.managers.CoroutineDispatcherProvider f4439a;

    public FirebaseInterfaceImpl(com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        this.f4439a = coroutineDispatcherProvider;
    }

    @Override // com.payair.logic.implementation.FirebaseInterface
    public final java.lang.Object generateCSDKPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.f4439a.getIODispatcher(), new com.payair.csdk.o0(null), continuation);
    }

    @Override // com.payair.logic.implementation.FirebaseInterface
    public final java.lang.Object generateMdesPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.f4439a.getIODispatcher(), new com.payair.csdk.o0(null), continuation);
    }
}
