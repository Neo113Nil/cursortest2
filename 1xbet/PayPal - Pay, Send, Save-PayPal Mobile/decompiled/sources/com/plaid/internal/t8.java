package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$next$1", f = "WorkflowViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class t8 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6584a;
    public final /* synthetic */ java.util.List b;
    public final /* synthetic */ com.plaid.internal.C0574l1 c;
    public final /* synthetic */ com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a d;
    public final /* synthetic */ java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(java.util.List list, com.plaid.internal.C0574l1 c0574l1, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a aVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = c0574l1;
        this.d = aVar;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.t8(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.internal.t8) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> linkEventListenerInternal$link_sdk_release;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6584a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> list = this.b;
            if (list != null) {
                for (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent : list) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(common$SDKEvent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) && (linkEventListenerInternal$link_sdk_release = com.plaid.link.Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release()) != null) {
                        linkEventListenerInternal$link_sdk_release.invoke(com.plaid.internal.S6.a(common$SDKEvent), com.plaid.internal.I2.d.f5810a);
                    }
                }
            }
            com.plaid.internal.InterfaceC0655u2 interfaceC0655u2 = this.c.c;
            if (interfaceC0655u2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                interfaceC0655u2 = null;
            }
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput build = this.d.b(this.c.f6593a.b).a(this.e).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] pane$PaneOutputArr = {build};
            this.f6584a = 1;
            if (interfaceC0655u2.a(pane$PaneOutputArr, this) == coroutine_suspended) {
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
