package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1", f = "LinkActivityViewModel.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* renamed from: com.plaid.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0566k2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6459a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.plaid.internal.C0557j2 c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1$1", f = "LinkActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.k2$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.plaid.link.event.LinkEvent f6460a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.plaid.link.event.LinkEvent linkEvent, kotlin.coroutines.Continuation<? super com.plaid.internal.C0566k2.a> continuation) {
            super(2, continuation);
            this.f6460a = linkEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.C0566k2.a(this.f6460a, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.plaid.internal.C0566k2.a(this.f6460a, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("delivering ".concat(java.lang.String.valueOf(this.f6460a)), true);
            com.plaid.link.Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(this.f6460a);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0566k2(com.plaid.internal.C0557j2 c0557j2, kotlin.coroutines.Continuation<? super com.plaid.internal.C0566k2> continuation) {
        super(2, continuation);
        this.c = c0557j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.plaid.internal.C0566k2 c0566k2 = new com.plaid.internal.C0566k2(this.c, continuation);
        c0566k2.b = obj;
        return c0566k2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.plaid.internal.C0566k2 c0566k2 = new com.plaid.internal.C0566k2(this.c, continuation);
        c0566k2.b = coroutineScope;
        return c0566k2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6459a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.util.concurrent.CancellationException unused) {
                com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "Link event consumer has ended. This is normal at the end of the activity lifecycle.If it occurs at any other time, it may result in loss of link events delivered.");
                return kotlin.Unit.INSTANCE;
            }
        }
        while (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            com.plaid.internal.A2 a2 = this.c.e;
            if (a2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                a2 = null;
            }
            com.plaid.internal.DelayedC0689y0 poll = a2.f5748a.poll(200L, java.util.concurrent.TimeUnit.MILLISECONDS);
            com.plaid.link.event.LinkEvent linkEvent = poll != null ? poll.f6625a : null;
            if (linkEvent != null) {
                kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                com.plaid.internal.C0566k2.a aVar = new com.plaid.internal.C0566k2.a(linkEvent, null);
                this.b = coroutineScope;
                this.f6459a = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
