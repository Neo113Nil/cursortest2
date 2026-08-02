package com.plaid.internal;

/* renamed from: com.plaid.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0626r0 implements com.plaid.internal.L4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.InterfaceC0688y<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> f6551a;
    public final com.plaid.internal.C4 b;

    public C0626r0(com.plaid.internal.workflow.persistence.database.WorkflowDatabase workflowDatabase) {
        com.plaid.internal.C0450a4 c0450a4 = new com.plaid.internal.C0450a4();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0450a4, "");
        this.f6551a = c0450a4;
        this.b = workflowDatabase.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.plaid.internal.InterfaceC0695y6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.r8 r8Var, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0618q0 c0618q0;
        int i;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering;
        com.plaid.internal.C0626r0 c0626r0;
        byte[] bArr;
        if (continuationImpl instanceof com.plaid.internal.C0618q0) {
            c0618q0 = (com.plaid.internal.C0618q0) continuationImpl;
            int i2 = c0618q0.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0618q0.e = i2 - 2147483648;
                java.lang.Object obj = c0618q0.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0618q0.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) this.f6551a.a((java.lang.String) r8Var.d.getValue());
                    if (pane$PaneRendering != null) {
                        c0626r0 = this;
                        if (pane$PaneRendering != null) {
                            c0626r0.f6551a.a((java.lang.String) r8Var.d.getValue(), pane$PaneRendering);
                        }
                        return pane$PaneRendering;
                    }
                    com.plaid.internal.C4 c4 = this.b;
                    java.lang.String str = r8Var.f6560a;
                    java.lang.String str2 = r8Var.b;
                    c0618q0.f6541a = this;
                    c0618q0.b = r8Var;
                    c0618q0.e = 1;
                    obj = c4.a(str, str2, c0618q0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c0626r0 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r8Var = c0618q0.b;
                    c0626r0 = c0618q0.f6541a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.plaid.internal.I4 i4 = (com.plaid.internal.I4) obj;
                pane$PaneRendering = (i4 != null || (bArr = i4.c) == null) ? null : com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.parseFrom(bArr);
                if (pane$PaneRendering != null) {
                }
                return pane$PaneRendering;
            }
        }
        c0618q0 = new com.plaid.internal.C0618q0(this, continuationImpl);
        java.lang.Object obj2 = c0618q0.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0618q0.e;
        if (i != 0) {
        }
        com.plaid.internal.I4 i42 = (com.plaid.internal.I4) obj2;
        if (i42 != null) {
        }
        if (pane$PaneRendering != null) {
        }
        return pane$PaneRendering;
    }

    @Override // com.plaid.internal.L4
    public final java.lang.Object a(com.plaid.internal.r8 r8Var, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering, com.plaid.internal.S2 s2) {
        this.f6551a.a((java.lang.String) r8Var.d.getValue(), pane$PaneRendering);
        com.plaid.internal.C4 c4 = this.b;
        java.lang.String str = r8Var.f6560a;
        java.lang.String str2 = r8Var.b;
        byte[] byteArray = pane$PaneRendering.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
        java.lang.Object a2 = c4.a(str, str2, byteArray, s2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
