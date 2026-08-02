package com.plaid.link;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.link.Plaid$submitInternal$1", f = "Plaid.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class Plaid$submitInternal$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.plaid.link.SubmissionData $submissionData;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r7 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.plaid.internal.InterfaceC0449a3 interfaceC0449a3;
        kotlin.Unit unit;
        com.plaid.internal.C0570k6 c0570k6;
        java.lang.Object withContext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            interfaceC0449a3 = com.plaid.link.Plaid.tokenComponent;
            unit = null;
            if (interfaceC0449a3 != null && (c0570k6 = ((com.plaid.internal.C0600o0) interfaceC0449a3).q.get()) != null) {
                com.plaid.link.SubmissionData submissionData = this.$submissionData;
                this.L$0 = coroutineScope;
                this.label = 1;
                com.plaid.internal.N5 n5 = c0570k6.c;
                com.plaid.internal.P5 p5 = n5.b;
                if (p5 != null) {
                    if (p5.f.get()) {
                        n5.b = null;
                    }
                    if (p5 != null) {
                        c0570k6.g = submissionData;
                    } else {
                        withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.plaid.internal.C0561j6(p5, submissionData, null), this);
                    }
                    withContext = kotlin.Unit.INSTANCE;
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                p5 = null;
                if (p5 != null) {
                }
                withContext = kotlin.Unit.INSTANCE;
                if (withContext == coroutine_suspended) {
                }
            }
            if (unit == null) {
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "Token component is null, submit is has no effect");
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        unit = kotlin.Unit.INSTANCE;
        if (unit == null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.link.Plaid$submitInternal$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.plaid.link.Plaid$submitInternal$1 plaid$submitInternal$1 = new com.plaid.link.Plaid$submitInternal$1(this.$submissionData, continuation);
        plaid$submitInternal$1.L$0 = obj;
        return plaid$submitInternal$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$submitInternal$1(com.plaid.link.SubmissionData submissionData, kotlin.coroutines.Continuation<? super com.plaid.link.Plaid$submitInternal$1> continuation) {
        super(2, continuation);
        this.$submissionData = submissionData;
    }
}
