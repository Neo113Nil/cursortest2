package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$storeCrashes$2", f = "CrashStorage.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0528g0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6416a;
    public final /* synthetic */ com.plaid.internal.C0537h0 b;
    public final /* synthetic */ com.plaid.internal.core.crashreporting.internal.models.Crash[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0528g0(com.plaid.internal.C0537h0 c0537h0, com.plaid.internal.core.crashreporting.internal.models.Crash[] crashArr, kotlin.coroutines.Continuation<? super com.plaid.internal.C0528g0> continuation) {
        super(2, continuation);
        this.b = c0537h0;
        this.c = crashArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0528g0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0528g0(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6416a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0551i5 c0551i5 = this.b.f6424a;
            java.lang.String a2 = com.plaid.internal.C0537h0.a();
            java.lang.String json = this.b.c.toJson(kotlin.collections.ArraysKt.asList(this.c));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
            this.f6416a = 1;
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0542h5(c0551i5, a2, json, null), this);
            if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                withContext = kotlin.Unit.INSTANCE;
            }
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
