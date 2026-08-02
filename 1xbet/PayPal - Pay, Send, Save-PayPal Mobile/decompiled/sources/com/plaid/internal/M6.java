package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogSender$sendEvents$2", f = "RemoteLogSender.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class M6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5845a;
    public final /* synthetic */ com.plaid.internal.N6 b;
    public final /* synthetic */ java.util.ArrayList c;
    public final /* synthetic */ java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6(com.plaid.internal.N6 n6, java.util.ArrayList arrayList, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = n6;
        this.c = arrayList;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.M6(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.internal.M6) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.plaid.internal.i8 i8Var;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5845a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest a2 = com.plaid.internal.N6.a(this.b, this.c, this.d);
                i8Var = this.b.f5864a;
                this.f5845a = 1;
                obj = i8Var.a(a2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.plaid.internal.AbstractC0550i4 abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj;
            if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.c) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                int size = this.c.size();
                java.lang.String str = this.d;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Successfully sent ");
                sb.append(size);
                sb.append(" remote log events for session: ");
                sb.append(str);
                com.plaid.internal.C0452a6.a.a(sb.toString(), true);
            } else {
                com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to send remote log events: ");
                sb2.append(abstractC0550i4);
                com.plaid.internal.C0452a6.a.b(aVar2, sb2.toString());
            }
        } catch (java.io.IOException e) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "IOException while sending remote log events", new java.lang.Object[]{e});
        } catch (java.lang.RuntimeException e2) {
            if (e2 instanceof java.util.concurrent.CancellationException) {
                throw e2;
            }
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "RuntimeException while sending remote log events", new java.lang.Object[]{e2});
        }
        return kotlin.Unit.INSTANCE;
    }
}
