package com.payair.csdk;

/* loaded from: classes10.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4325a;
    public final /* synthetic */ com.payair.logic.notifications.FirebaseNotificationHandlerImpl b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ java.lang.String f;
    public final /* synthetic */ java.util.Map g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = firebaseNotificationHandlerImpl;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.payair.csdk.v0(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.payair.csdk.v0) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider;
        com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4325a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineDispatcherProvider = this.b.h;
            kotlinx.coroutines.CoroutineDispatcher iODispatcher = coroutineDispatcherProvider.getIODispatcher();
            com.payair.csdk.u0 u0Var = new com.payair.csdk.u0(this.d, this.b, this.e, this.c, this.f, this.g, null);
            this.f4325a = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(iODispatcher, u0Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Set set = (java.util.Set) obj;
        set.add(new com.payair.model.NetworkTokenReference(this.c, false));
        coroutineDispatcherProvider2 = this.b.h;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineDispatcherProvider2.getIOScope(), null, null, new com.payair.csdk.t0(this.b, set, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
