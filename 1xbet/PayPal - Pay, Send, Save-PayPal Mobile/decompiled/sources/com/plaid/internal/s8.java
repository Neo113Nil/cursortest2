package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$getPane$2", f = "WorkflowViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class s8 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6570a;
    public final /* synthetic */ com.plaid.internal.u8 b;
    public final /* synthetic */ com.plaid.internal.r8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(com.plaid.internal.u8 u8Var, com.plaid.internal.r8 r8Var, kotlin.coroutines.Continuation<? super com.plaid.internal.s8> continuation) {
        super(2, continuation);
        this.b = u8Var;
        this.c = r8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.s8(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> continuation) {
        return new com.plaid.internal.s8(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6570a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.InterfaceC0695y6 b = this.b.b();
            com.plaid.internal.r8 r8Var = this.c;
            this.f6570a = 1;
            obj = b.a(r8Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj;
        if (pane$PaneRendering != null) {
            return pane$PaneRendering;
        }
        com.plaid.internal.r8 r8Var2 = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No pane rendering found for ");
        sb.append(r8Var2);
        sb.append(".first: ");
        sb.append(r8Var2);
        sb.append(".second");
        throw new com.plaid.internal.F2(sb.toString());
    }
}
