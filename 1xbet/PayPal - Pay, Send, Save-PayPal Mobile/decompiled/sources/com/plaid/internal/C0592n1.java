package com.plaid.internal;

/* renamed from: com.plaid.internal.n1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0592n1<T> implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0574l1 f6503a;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$doOnStart$2", f = "HeadlessOAuthViewModel.kt", i = {0}, l = {68, 69, 70}, m = "emit", n = {"this"}, s = {"L$0"})
    /* renamed from: com.plaid.internal.n1$a */
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public com.plaid.internal.C0592n1 f6504a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ com.plaid.internal.C0592n1<T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.plaid.internal.C0592n1<? super T> c0592n1, kotlin.coroutines.Continuation<? super com.plaid.internal.C0592n1.a> continuation) {
            super(continuation);
            this.c = c0592n1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.emit(null, this);
        }
    }

    public C0592n1(com.plaid.internal.C0574l1 c0574l1) {
        this.f6503a = c0574l1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (com.plaid.internal.C0574l1.a(r8, r9, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (com.plaid.internal.C0574l1.b(r8, r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.plaid.internal.C0592n1.a aVar;
        int i;
        com.plaid.internal.C0592n1<T> c0592n1;
        com.plaid.internal.C0574l1.b bVar;
        if (continuation instanceof com.plaid.internal.C0592n1.a) {
            aVar = (com.plaid.internal.C0592n1.a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - 2147483648;
                java.lang.Object obj = aVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0574l1 c0574l1 = this.f6503a;
                    aVar.f6504a = this;
                    aVar.d = 1;
                    obj = com.plaid.internal.C0574l1.a(c0574l1, pane$PaneRendering, aVar);
                    if (obj != coroutine_suspended) {
                        c0592n1 = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                c0592n1 = aVar.f6504a;
                kotlin.ResultKt.throwOnFailure(obj);
                bVar = (com.plaid.internal.C0574l1.b) obj;
                if (!(bVar instanceof com.plaid.internal.C0574l1.b.C0196b)) {
                    com.plaid.internal.C0574l1 c0574l12 = c0592n1.f6503a;
                    java.lang.String str = ((com.plaid.internal.C0574l1.b.C0196b) bVar).f6470a;
                    aVar.f6504a = null;
                    aVar.d = 2;
                } else {
                    if (!(bVar instanceof com.plaid.internal.C0574l1.b.a)) {
                        if (bVar instanceof com.plaid.internal.C0574l1.b.c) {
                            com.plaid.internal.C0574l1 c0574l13 = c0592n1.f6503a;
                            java.lang.String str2 = ((com.plaid.internal.C0574l1.b.c) bVar).f6471a;
                            int i3 = com.plaid.internal.C0574l1.k;
                            com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                            com.plaid.internal.C0452a6.a.a("Submit redirect URI", true);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b a2 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.SubmitAction.newBuilder().b(str2));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
                            com.plaid.internal.C0574l1.a(c0574l13, a2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    com.plaid.internal.C0574l1 c0574l14 = c0592n1.f6503a;
                    java.lang.String str3 = ((com.plaid.internal.C0574l1.b.a) bVar).f6469a;
                    aVar.f6504a = null;
                    aVar.d = 3;
                }
                return coroutine_suspended;
            }
        }
        aVar = new com.plaid.internal.C0592n1.a(this, continuation);
        java.lang.Object obj2 = aVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        bVar = (com.plaid.internal.C0574l1.b) obj2;
        if (!(bVar instanceof com.plaid.internal.C0574l1.b.C0196b)) {
        }
        return coroutine_suspended2;
    }
}
