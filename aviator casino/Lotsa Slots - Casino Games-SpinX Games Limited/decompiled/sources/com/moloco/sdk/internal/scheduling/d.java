package com.moloco.sdk.internal.scheduling;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.CoroutineScope f7190a = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMainImmediate());

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.scheduling.RunOnMainDispatcherKt$runOnMainDispatcher$1", f = "RunOnMainDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7191a;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.scheduling.d.a> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.scheduling.d.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.scheduling.d.a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7191a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.b.invoke();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlinx.coroutines.Job a(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(f7190a, null, null, new com.moloco.sdk.internal.scheduling.d.a(block, null), 3, null);
        return launch$default;
    }
}
