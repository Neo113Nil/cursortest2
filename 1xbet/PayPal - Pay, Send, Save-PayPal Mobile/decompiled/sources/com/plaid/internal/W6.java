package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2", f = "SentryCrashApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class W6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5965a;
    public final /* synthetic */ java.util.List<com.plaid.internal.core.crashreporting.internal.models.Crash> b;
    public final /* synthetic */ java.util.ArrayList c;
    public final /* synthetic */ com.plaid.internal.X6 d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2$1$1", f = "SentryCrashApi.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.util.ArrayList f5966a;
        public int b;
        public final /* synthetic */ java.util.ArrayList c;
        public final /* synthetic */ com.plaid.internal.X6 d;
        public final /* synthetic */ com.plaid.internal.core.crashreporting.internal.models.Crash e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.util.ArrayList arrayList, com.plaid.internal.X6 x6, com.plaid.internal.core.crashreporting.internal.models.Crash crash, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.c = arrayList;
            this.d = x6;
            this.e = crash;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.W6.a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.plaid.internal.W6.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.ArrayList arrayList;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList2 = this.c;
                java.lang.Object value = this.d.b.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
                com.plaid.internal.Z6 z6 = (com.plaid.internal.Z6) value;
                java.lang.String a2 = this.d.a();
                com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions = this.d.c;
                if (crashApiOptions == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    crashApiOptions = null;
                }
                java.lang.String apiKey = crashApiOptions.getApiKey();
                com.plaid.internal.core.crashreporting.internal.models.Crash crash = this.e;
                this.f5966a = arrayList2;
                this.b = 1;
                java.lang.Object a3 = z6.a(a2, apiKey, crash, this);
                if (a3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList = arrayList2;
                obj = a3;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f5966a;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrayList.add(obj);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(java.util.List list, java.util.ArrayList arrayList, com.plaid.internal.X6 x6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = arrayList;
        this.d = x6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.plaid.internal.W6 w6 = new com.plaid.internal.W6(this.b, this.c, this.d, continuation);
        w6.f5965a = obj;
        return w6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.internal.W6) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.f5965a;
        java.util.List<com.plaid.internal.core.crashreporting.internal.models.Crash> list = this.b;
        java.util.ArrayList arrayList = this.c;
        com.plaid.internal.X6 x6 = this.d;
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.plaid.internal.W6.a(arrayList, x6, (com.plaid.internal.core.crashreporting.internal.models.Crash) it.next(), null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
