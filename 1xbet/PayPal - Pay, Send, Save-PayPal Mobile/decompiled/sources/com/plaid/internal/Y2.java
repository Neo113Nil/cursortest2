package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.i8 f5979a;
    public final com.plaid.internal.L4 b;
    public final com.plaid.internal.C0683x3 c;
    public final com.plaid.internal.F3 d;
    public final com.plaid.internal.n8 e;
    public final com.plaid.internal.y8 f;
    public final com.plaid.internal.H6 g;

    @javax.inject.Inject
    public Y2(com.plaid.internal.i8 i8Var, com.plaid.internal.L4 l4, com.plaid.internal.C0683x3 c0683x3, com.plaid.internal.F3 f3, com.plaid.internal.n8 n8Var, com.plaid.internal.y8 y8Var, com.plaid.internal.H6 h6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0683x3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h6, "");
        this.f5979a = i8Var;
        this.b = l4;
        this.c = c0683x3;
        this.d = f3;
        this.e = n8Var;
        this.f = y8Var;
        this.g = h6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.N2 n2, boolean z, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.X2 x2;
        int i;
        com.plaid.internal.Y2 y2;
        com.plaid.internal.Y2 y22;
        com.plaid.internal.Y2 y23;
        java.lang.Object a2;
        java.lang.Object a3;
        if (continuationImpl instanceof com.plaid.internal.X2) {
            x2 = (com.plaid.internal.X2) continuationImpl;
            int i2 = x2.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x2.f = i2 - 2147483648;
                com.plaid.internal.X2 x22 = x2;
                java.lang.Object obj = x22.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x22.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (n2 instanceof com.plaid.internal.N2.a) {
                        com.plaid.internal.y8 y8Var = this.f;
                        x22.f5971a = this;
                        x22.b = n2;
                        x22.f = 1;
                        if (y8Var.a(x22) != coroutine_suspended) {
                            y23 = this;
                            y23.c.b();
                            com.plaid.internal.N2.a aVar = (com.plaid.internal.N2.a) n2;
                            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a4 = y23.e.a(aVar);
                            y23.g.a(aVar.i().a(), aVar.i().b());
                            java.lang.String h = n2.h();
                            java.lang.String g = n2.g();
                            x22.f5971a = null;
                            x22.b = null;
                            x22.f = 2;
                            a2 = y23.a(a4, h, g, "", x22);
                            if (a2 == coroutine_suspended) {
                            }
                        }
                    } else if (n2 instanceof com.plaid.internal.N2.b) {
                        com.plaid.internal.y8 y8Var2 = this.f;
                        x22.f5971a = this;
                        x22.b = n2;
                        x22.c = z;
                        x22.f = 3;
                        if (y8Var2.a(x22) != coroutine_suspended) {
                            y22 = this;
                            y22.c.b();
                            com.plaid.internal.N2.b bVar = (com.plaid.internal.N2.b) n2;
                            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a5 = y22.e.a(bVar, z);
                            y22.g.a(n2.g(), bVar.i().getToken());
                            java.lang.String h2 = n2.h();
                            java.lang.String g2 = n2.g();
                            java.lang.String a6 = bVar.a();
                            x22.f5971a = null;
                            x22.b = null;
                            x22.f = 4;
                            a3 = y22.a(a5, h2, g2, a6, x22);
                            if (a3 == coroutine_suspended) {
                            }
                        }
                    } else {
                        if (!(n2 instanceof com.plaid.internal.N2.l)) {
                            return !(n2 instanceof com.plaid.internal.N2.i) ? n2 instanceof com.plaid.internal.N2.j ? this.d.a() : n2 instanceof com.plaid.internal.N2.k ? n2 : a(com.plaid.internal.O2.a(n2), n2.h(), new java.lang.Throwable("Should not call workflow.start with state: ".concat(java.lang.String.valueOf(n2))), "", kotlin.collections.CollectionsKt.emptyList()) : n2;
                        }
                        com.plaid.internal.L4 l4 = this.b;
                        com.plaid.internal.r8 f = n2.f();
                        x22.f5971a = this;
                        x22.b = n2;
                        x22.f = 5;
                        obj = l4.a(f, x22);
                        if (obj != coroutine_suspended) {
                            y2 = this;
                            if (((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj) == null) {
                            }
                        }
                    }
                } else if (i == 1) {
                    n2 = x22.b;
                    com.plaid.internal.Y2 y24 = x22.f5971a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    y23 = y24;
                    y23.c.b();
                    com.plaid.internal.N2.a aVar2 = (com.plaid.internal.N2.a) n2;
                    com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a42 = y23.e.a(aVar2);
                    y23.g.a(aVar2.i().a(), aVar2.i().b());
                    java.lang.String h3 = n2.h();
                    java.lang.String g3 = n2.g();
                    x22.f5971a = null;
                    x22.b = null;
                    x22.f = 2;
                    a2 = y23.a(a42, h3, g3, "", x22);
                    if (a2 == coroutine_suspended) {
                        return a2;
                    }
                } else {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n2 = x22.b;
                        com.plaid.internal.Y2 y25 = x22.f5971a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        y2 = y25;
                        if (((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj) == null) {
                            return n2;
                        }
                        com.plaid.internal.N2.l lVar = (com.plaid.internal.N2.l) n2;
                        return y2.a(lVar.c(), n2.h(), new java.lang.Throwable("Current pane is null"), lVar.b(), kotlin.collections.CollectionsKt.emptyList());
                    }
                    z = x22.c;
                    n2 = x22.b;
                    y22 = x22.f5971a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    y22.c.b();
                    com.plaid.internal.N2.b bVar2 = (com.plaid.internal.N2.b) n2;
                    com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a52 = y22.e.a(bVar2, z);
                    y22.g.a(n2.g(), bVar2.i().getToken());
                    java.lang.String h22 = n2.h();
                    java.lang.String g22 = n2.g();
                    java.lang.String a62 = bVar2.a();
                    x22.f5971a = null;
                    x22.b = null;
                    x22.f = 4;
                    a3 = y22.a(a52, h22, g22, a62, x22);
                    if (a3 == coroutine_suspended) {
                        return a3;
                    }
                }
                return coroutine_suspended;
            }
        }
        x2 = new com.plaid.internal.X2(this, continuationImpl);
        com.plaid.internal.X2 x222 = x2;
        java.lang.Object obj2 = x222.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x222.f;
        if (i != 0) {
        }
        return coroutine_suspended2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011c, code lost:
    
        if (r2 == r4) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.plaid.internal.N2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x011c -> B:18:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.plaid.internal.N2 n2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.V2 v2;
        int i;
        com.plaid.internal.r8 e;
        java.lang.Object a2;
        com.plaid.internal.Y2 y2;
        com.plaid.internal.N2 n22;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering;
        java.util.List mutableList;
        com.plaid.internal.r8 r8Var;
        com.plaid.internal.Y2 y22;
        com.plaid.internal.N2 n23;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation navigation;
        ?? r1 = n2;
        if (continuationImpl instanceof com.plaid.internal.V2) {
            v2 = (com.plaid.internal.V2) continuationImpl;
            int i2 = v2.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2.h = i2 - 2147483648;
                java.lang.Object obj = v2.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = v2.h;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (r1 instanceof com.plaid.internal.N2.i) {
                        return a((com.plaid.internal.N2.i) r1);
                    }
                    if (!(r1 instanceof com.plaid.internal.N2.f)) {
                        java.lang.String c = r1 instanceof com.plaid.internal.N2.h ? ((com.plaid.internal.N2.h) r1).c() : null;
                        return new com.plaid.internal.N2.e(n2.h(), new com.plaid.link.result.LinkExit(null, new com.plaid.link.result.LinkExitMetadata(com.plaid.link.result.LinkExitMetadataStatus.REQUIRES_CREDENTIALS.INSTANCE, null, n2.g(), c, com.plaid.internal.L2.a(n2.g(), c != null ? c : ""))));
                    }
                    e = ((com.plaid.internal.N2.f) r1).e();
                    com.plaid.internal.L4 l4 = this.b;
                    v2.f5950a = this;
                    v2.b = r1;
                    v2.c = e;
                    v2.h = 1;
                    a2 = l4.a(e, v2);
                    if (a2 != coroutine_suspended) {
                        y2 = this;
                        n22 = r1;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    com.plaid.internal.r8 r8Var2 = v2.e;
                    mutableList = v2.d;
                    r8Var = v2.c;
                    com.plaid.internal.N2 n24 = v2.b;
                    com.plaid.internal.Y2 y23 = v2.f5950a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.N2.h hVar = n24;
                    com.plaid.internal.Y2 y24 = y23;
                    java.util.List list = mutableList;
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering2 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj;
                    if (pane$PaneRendering2 != null) {
                        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation navigation2 = pane$PaneRendering2.getNavigation();
                        com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 backStackBehavior = navigation2 != null ? navigation2.getBackStackBehavior() : null;
                        if (backStackBehavior == null) {
                            backStackBehavior = com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.BACK_STACK_BEHAVIOR_UNKNOWN;
                        }
                        if (backStackBehavior == com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.BACK_STACK_BEHAVIOR_PERSISTENT) {
                            y24.c.a(r8Var, r8Var2);
                            return new com.plaid.internal.N2.l(hVar.g(), hVar.h(), hVar.b(), hVar instanceof com.plaid.internal.N2.g ? ((com.plaid.internal.N2.g) hVar).a() : "", r8Var2, kotlin.collections.CollectionsKt.emptyList(), list, hVar instanceof com.plaid.internal.N2.h ? hVar.c() : "");
                        }
                    } else {
                        com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "Could not find pane for workflowId: ".concat(java.lang.String.valueOf(r8Var2)));
                    }
                    mutableList = list;
                    n23 = hVar;
                    y22 = y24;
                    if (mutableList.isEmpty()) {
                        y22.c.a(r8Var, (com.plaid.internal.r8) null);
                        v2.f5950a = null;
                        v2.b = null;
                        v2.c = null;
                        v2.d = null;
                        v2.e = null;
                        v2.h = 4;
                        java.lang.Object a3 = y22.a(n23, v2);
                        if (a3 != coroutine_suspended) {
                            return a3;
                        }
                    } else {
                        r8Var2 = (com.plaid.internal.r8) mutableList.remove(mutableList.size() - 1);
                        com.plaid.internal.L4 l42 = y22.b;
                        v2.f5950a = y22;
                        v2.b = n23;
                        v2.c = r8Var;
                        v2.d = mutableList;
                        v2.e = r8Var2;
                        v2.h = 3;
                        obj = l42.a(r8Var2, v2);
                        hVar = n23;
                        y24 = y22;
                    }
                }
                com.plaid.internal.r8 r8Var3 = v2.c;
                com.plaid.internal.N2 n25 = v2.b;
                com.plaid.internal.Y2 y25 = v2.f5950a;
                kotlin.ResultKt.throwOnFailure(obj);
                e = r8Var3;
                n22 = n25;
                a2 = obj;
                y2 = y25;
                pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) a2;
                if (pane$PaneRendering != null || (navigation = pane$PaneRendering.getNavigation()) == null || navigation.getBackVisible()) {
                    mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) ((com.plaid.internal.N2.f) n22).d());
                    r8Var = e;
                    y22 = y2;
                    n23 = n22;
                    if (mutableList.isEmpty()) {
                    }
                }
                y2.c.a(e, (com.plaid.internal.r8) null);
                v2.f5950a = null;
                v2.b = null;
                v2.c = null;
                v2.h = 2;
                java.lang.Object a4 = y2.a(n22, v2);
                return a4 != coroutine_suspended ? a4 : coroutine_suspended;
            }
        }
        v2 = new com.plaid.internal.V2(this, continuationImpl);
        java.lang.Object obj2 = v2.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = v2.h;
        if (i != 0) {
        }
        pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) a2;
        if (pane$PaneRendering != null) {
        }
        mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) ((com.plaid.internal.N2.f) n22).d());
        r8Var = e;
        y22 = y2;
        n23 = n22;
        if (mutableList.isEmpty()) {
        }
    }

    public static com.plaid.internal.N2.e a(com.plaid.internal.N2.i iVar) {
        java.lang.String str = iVar.f;
        java.lang.String str2 = iVar.e;
        java.lang.String a2 = com.plaid.internal.L2.a(str, str2, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        com.plaid.link.result.LinkError linkError = new com.plaid.link.result.LinkError(com.plaid.link.result.LinkErrorCode.INSTANCE.convert(str), str2, str2, a2);
        com.plaid.link.result.LinkExitMetadataStatus fromString = com.plaid.link.result.LinkExitMetadataStatus.INSTANCE.fromString(iVar.f);
        java.lang.String str3 = iVar.b;
        java.lang.String str4 = iVar.h;
        com.plaid.link.result.LinkExitMetadata linkExitMetadata = new com.plaid.link.result.LinkExitMetadata(fromString, null, str3, str4, com.plaid.internal.L2.a(str3, str4));
        java.lang.String str5 = iVar.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkExitMetadata, "");
        return new com.plaid.internal.N2.e(str5, new com.plaid.link.result.LinkExit(linkError, linkExitMetadata));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.P2 p2;
        int i;
        java.lang.String str4;
        com.plaid.internal.Y2 y2;
        java.lang.String str5;
        java.lang.String str6;
        com.plaid.internal.AbstractC0550i4 abstractC0550i4;
        com.plaid.internal.L6 l6;
        java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppearList;
        if (continuationImpl instanceof com.plaid.internal.P2) {
            p2 = (com.plaid.internal.P2) continuationImpl;
            int i2 = p2.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p2.g = i2 - 2147483648;
                com.plaid.internal.P2 p22 = p2;
                java.lang.Object obj = p22.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = p22.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
                    com.plaid.internal.Q2 q2 = new com.plaid.internal.Q2(this, workflow$LinkWorkflowStartRequest, null);
                    p22.f5877a = this;
                    str4 = str;
                    p22.b = str4;
                    p22.c = str2;
                    p22.d = str3;
                    p22.g = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(io2, q2, p22);
                    if (obj != coroutine_suspended) {
                        y2 = this;
                        str5 = str2;
                        str6 = str3;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                java.lang.String str7 = p22.d;
                java.lang.String str8 = p22.c;
                java.lang.String str9 = p22.b;
                com.plaid.internal.Y2 y22 = p22.f5877a;
                kotlin.ResultKt.throwOnFailure(obj);
                str6 = str7;
                str5 = str8;
                str4 = str9;
                y2 = y22;
                abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj;
                if (!abstractC0550i4.a()) {
                    return y2.a(str4, abstractC0550i4, "", kotlin.collections.CollectionsKt.emptyList());
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(abstractC0550i4, "");
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) ((com.plaid.internal.AbstractC0550i4.c) abstractC0550i4).f6440a;
                com.plaid.internal.H6 h6 = y2.g;
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c mobileSdkLogLevel = workflow$LinkWorkflowStartResponse.getMobileSdkLogLevel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mobileSdkLogLevel, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileSdkLogLevel, "");
                int i3 = com.plaid.internal.C0470c4.f6007a[mobileSdkLogLevel.ordinal()];
                if (i3 == 1) {
                    l6 = com.plaid.internal.L6.ALL;
                } else if (i3 == 2) {
                    l6 = com.plaid.internal.L6.ERRORS_ONLY;
                } else if (i3 == 3) {
                    l6 = com.plaid.internal.L6.NONE;
                } else if (i3 != 4) {
                    if (i3 != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    l6 = com.plaid.internal.L6.NONE;
                } else {
                    l6 = com.plaid.internal.L6.NONE;
                }
                h6.a(l6);
                if (workflow$LinkWorkflowStartResponse.hasWebviewFallback()) {
                    java.lang.String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "");
                    if (url.length() > 0) {
                        java.lang.String workflowSessionId = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workflowSessionId, "");
                        java.lang.String requestId = workflow$LinkWorkflowStartResponse.getRequestId();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestId, "");
                        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback webviewFallback = workflow$LinkWorkflowStartResponse.getWebviewFallback();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewFallback, "");
                        p22.f5877a = null;
                        p22.b = null;
                        p22.c = null;
                        p22.d = null;
                        p22.g = 2;
                        com.plaid.internal.N2 a2 = y2.a(str5, workflowSessionId, requestId, str6, webviewFallback);
                        return a2 != coroutine_suspended ? a2 : coroutine_suspended;
                    }
                }
                com.plaid.internal.C0683x3 c0683x3 = y2.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                java.lang.Long l = c0683x3.d;
                if (l != null) {
                    com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a a3 = com.plaid.internal.C0683x3.a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.ClientOpenDelay.newBuilder().a(java.lang.String.valueOf(l.longValue())));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "");
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0674w3(c0683x3, a3, str4, null), 3, null);
                } else {
                    com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "markOpenStart was not called before tracking open delay");
                }
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events = workflow$LinkWorkflowStartResponse.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent : onAppearList) {
                        kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> linkEventListenerInternal$link_sdk_release = com.plaid.link.Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(com.plaid.internal.S6.a(common$SDKEvent), com.plaid.internal.I2.d.f5810a);
                        }
                    }
                }
                java.lang.String workflowSessionId2 = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workflowSessionId2, "");
                java.lang.String continuationToken = workflow$LinkWorkflowStartResponse.getContinuationToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(continuationToken, "");
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering nextPane = workflow$LinkWorkflowStartResponse.getNextPane();
                java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowStartResponse.getAdditionalPanesList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(additionalPanesList, "");
                java.lang.String requestId2 = workflow$LinkWorkflowStartResponse.getRequestId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestId2, "");
                p22.f5877a = null;
                p22.b = null;
                p22.c = null;
                p22.d = null;
                p22.g = 3;
                java.lang.Object a4 = y2.a(str5, workflowSessionId2, continuationToken, str6, nextPane, additionalPanesList, kotlin.collections.CollectionsKt.emptyList(), requestId2, p22);
                if (a4 != coroutine_suspended) {
                    return a4;
                }
            }
        }
        p2 = new com.plaid.internal.P2(this, continuationImpl);
        com.plaid.internal.P2 p222 = p2;
        java.lang.Object obj2 = p222.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = p222.g;
        if (i != 0) {
        }
        abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj2;
        if (!abstractC0550i4.a()) {
        }
    }

    public final com.plaid.internal.N2 a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback) {
        com.plaid.internal.A a2;
        com.plaid.internal.EnumC0508d7 enumC0508d7;
        java.lang.String url = common$WebviewFallback.getUrl();
        kotlin.jvm.internal.Intrinsics.checkNotNull(url);
        if (url.length() == 0) {
            return a(str3, str2, new java.lang.Throwable("Webview fallback URL was null"), "", kotlin.collections.CollectionsKt.emptyList());
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS) {
            java.lang.String webviewFallbackId = common$WebviewFallback.getWebviewFallbackId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewFallbackId, "");
            java.lang.String id = common$WebviewFallback.getChannelFromWebview().getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
            java.lang.String secret = common$WebviewFallback.getChannelFromWebview().getSecret();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(secret, "");
            return new com.plaid.internal.N2.k(str, str2, str3, str4, url, webviewFallbackId, new com.plaid.internal.A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id, secret), common$WebviewFallback.getShouldEagerStart(), com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL, 128);
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_IN_PROCESS) {
            if (common$WebviewFallback.hasChannelFromWebview()) {
                java.lang.String id2 = common$WebviewFallback.getChannelFromWebview().getId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "");
                java.lang.String secret2 = common$WebviewFallback.getChannelFromWebview().getSecret();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(secret2, "");
                a2 = new com.plaid.internal.A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id2, secret2);
            } else {
                a2 = null;
            }
            java.lang.String webviewFallbackId2 = common$WebviewFallback.getWebviewFallbackId();
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Z webviewFallbackBackground = common$WebviewFallback.getWebviewFallbackBackground();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webviewFallbackBackground, "");
            boolean a3 = com.plaid.internal.K7.a(webviewFallbackBackground);
            boolean shouldEagerStart = common$WebviewFallback.getShouldEagerStart();
            com.plaid.internal.core.protos.link.workflow.primitives.f androidSmsVerificationApiType = common$WebviewFallback.getAndroidSmsVerificationApiType();
            if (androidSmsVerificationApiType == null || (enumC0508d7 = com.plaid.internal.C0509e.a(androidSmsVerificationApiType)) == null) {
                enumC0508d7 = com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(webviewFallbackId2);
            return new com.plaid.internal.N2.k(str, str2, str3, str4, url, webviewFallbackId2, a2, a3, false, shouldEagerStart, enumC0508d7);
        }
        java.lang.Throwable th = new java.lang.Throwable("Unsupported webview fallback mode: ".concat(java.lang.String.valueOf(common$WebviewFallback.getMode())));
        com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, th);
        return a(str3, str2, th, "", kotlin.collections.CollectionsKt.emptyList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.N2 n2, java.util.List list, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.T2 t2;
        int i;
        java.util.List<com.plaid.internal.r8> list2;
        java.lang.String str;
        java.lang.Object a2;
        java.util.List<com.plaid.internal.r8> list3;
        com.plaid.internal.Y2 y2;
        com.plaid.internal.N2 n22;
        com.plaid.internal.AbstractC0550i4 abstractC0550i4;
        if (continuationImpl instanceof com.plaid.internal.T2) {
            t2 = (com.plaid.internal.T2) continuationImpl;
            int i2 = t2.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t2.g = i2 - 2147483648;
                com.plaid.internal.T2 t22 = t2;
                java.lang.Object obj = t22.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = t22.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (n2 instanceof com.plaid.internal.N2.i) {
                        return a((com.plaid.internal.N2.i) n2);
                    }
                    boolean z = n2 instanceof com.plaid.internal.N2.l;
                    if (z) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.plaid.internal.N2.l lVar = (com.plaid.internal.N2.l) n2;
                        arrayList.addAll(lVar.h);
                        arrayList.add(lVar.f);
                        list2 = arrayList;
                    } else {
                        list2 = kotlin.collections.CollectionsKt.emptyList();
                    }
                    str = z ? ((com.plaid.internal.N2.l) n2).d : "";
                    com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.a newBuilder = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.newBuilder();
                    newBuilder.b(n2.h());
                    newBuilder.a(str);
                    if (!list.isEmpty()) {
                        newBuilder.a(list);
                    }
                    com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest build = newBuilder.build();
                    com.plaid.internal.Z0 z0 = com.plaid.internal.Z0.f5984a;
                    com.plaid.internal.U2 u2 = new com.plaid.internal.U2(this, build, null);
                    t22.f5924a = this;
                    t22.b = n2;
                    t22.c = list2;
                    t22.d = str;
                    t22.g = 1;
                    a2 = z0.a(u2, t22);
                    if (a2 != coroutine_suspended) {
                        list3 = list2;
                        y2 = this;
                        n22 = n2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                java.lang.String str2 = t22.d;
                java.util.List<com.plaid.internal.r8> list4 = t22.c;
                com.plaid.internal.N2 n23 = t22.b;
                com.plaid.internal.Y2 y22 = t22.f5924a;
                kotlin.ResultKt.throwOnFailure(obj);
                list3 = list4;
                a2 = obj;
                str = str2;
                n22 = n23;
                y2 = y22;
                abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) a2;
                if (!abstractC0550i4.a()) {
                    return y2.a(n22.h(), abstractC0550i4, str, list3);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(abstractC0550i4, "");
                com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) ((com.plaid.internal.AbstractC0550i4.c) abstractC0550i4).f6440a;
                java.lang.String g = n22.g();
                java.lang.String workflowSessionId = workflow$LinkWorkflowNextResponse.getWorkflowSessionId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workflowSessionId, "");
                java.lang.String continuationToken = workflow$LinkWorkflowNextResponse.getContinuationToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(continuationToken, "");
                java.lang.String a3 = n22 instanceof com.plaid.internal.N2.g ? ((com.plaid.internal.N2.g) n22).a() : "";
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering nextPane = workflow$LinkWorkflowNextResponse.getNextPane();
                java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowNextResponse.getAdditionalPanesList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(additionalPanesList, "");
                java.lang.String requestId = workflow$LinkWorkflowNextResponse.getRequestId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestId, "");
                t22.f5924a = null;
                t22.b = null;
                t22.c = null;
                t22.d = null;
                t22.g = 2;
                java.lang.Object a4 = y2.a(g, workflowSessionId, continuationToken, a3, nextPane, additionalPanesList, list3, requestId, t22);
                return a4 == coroutine_suspended ? coroutine_suspended : a4;
            }
        }
        t2 = new com.plaid.internal.T2(this, continuationImpl);
        com.plaid.internal.T2 t222 = t2;
        java.lang.Object obj2 = t222.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = t222.g;
        if (i != 0) {
        }
        abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) a2;
        if (!abstractC0550i4.a()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.N2 n2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.R2 r2;
        int i;
        com.plaid.internal.Y2 y2;
        java.util.List<com.plaid.internal.r8> list;
        java.lang.String str;
        com.plaid.internal.N2 n22;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering;
        if (continuationImpl instanceof com.plaid.internal.R2) {
            r2 = (com.plaid.internal.R2) continuationImpl;
            int i2 = r2.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r2.g = i2 - 2147483648;
                java.lang.Object obj = r2.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = r2.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.r8 f = n2.f();
                    boolean z = n2 instanceof com.plaid.internal.N2.f;
                    java.lang.String b = z ? ((com.plaid.internal.N2.f) n2).b() : "";
                    java.util.List<com.plaid.internal.r8> d = z ? ((com.plaid.internal.N2.f) n2).d() : kotlin.collections.CollectionsKt.emptyList();
                    com.plaid.internal.L4 l4 = this.b;
                    r2.f5904a = this;
                    r2.b = n2;
                    r2.c = b;
                    r2.d = d;
                    r2.g = 1;
                    obj = l4.a(f, r2);
                    if (obj != coroutine_suspended) {
                        y2 = this;
                        list = d;
                        str = b;
                        n22 = n2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                java.util.List<com.plaid.internal.r8> list2 = r2.d;
                java.lang.String str2 = r2.c;
                com.plaid.internal.N2 n23 = r2.b;
                com.plaid.internal.Y2 y22 = r2.f5904a;
                kotlin.ResultKt.throwOnFailure(obj);
                list = list2;
                str = str2;
                n22 = n23;
                y2 = y22;
                pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj;
                if (pane$PaneRendering != null) {
                    return y2.a(com.plaid.internal.O2.a(n22), n22.h(), new java.lang.Throwable("Current pane is null"), str, list);
                }
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a a2 = com.plaid.internal.K4.a(pane$PaneRendering);
                if (a2 == null) {
                    return y2.a(com.plaid.internal.O2.a(n22), n22.h(), new java.lang.Throwable("Current pane could not be converted to an exit action: ".concat(java.lang.String.valueOf(pane$PaneRendering.getRenderingPropertyKey()))), str, list);
                }
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(a2.build());
                r2.f5904a = null;
                r2.b = null;
                r2.c = null;
                r2.d = null;
                r2.g = 2;
                java.lang.Object a3 = y2.a(n22, listOf, r2);
                return a3 == coroutine_suspended ? coroutine_suspended : a3;
            }
        }
        r2 = new com.plaid.internal.R2(this, continuationImpl);
        java.lang.Object obj2 = r2.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r2.g;
        if (i != 0) {
        }
        pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj2;
        if (pane$PaneRendering != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.N2 n2, com.plaid.internal.D6 d6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.W2 w2;
        int i;
        com.plaid.internal.Y2 y2;
        com.plaid.internal.N2 n22 = n2;
        if (continuationImpl instanceof com.plaid.internal.W2) {
            w2 = (com.plaid.internal.W2) continuationImpl;
            int i2 = w2.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w2.e = i2 - 2147483648;
                com.plaid.internal.W2 w22 = w2;
                java.lang.Object obj = w22.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = w22.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (d6 instanceof com.plaid.internal.D6.d) {
                        return a(com.plaid.internal.O2.a(n2), n2.h(), ((com.plaid.internal.D6.d) d6).a(), "", kotlin.collections.CollectionsKt.emptyList());
                    }
                    if (n22 instanceof com.plaid.internal.N2.k) {
                        if (!(d6 instanceof com.plaid.internal.D6.b) && !(d6 instanceof com.plaid.internal.D6.c)) {
                            com.plaid.internal.n8 n8Var = this.e;
                            com.plaid.internal.N2.k kVar = (com.plaid.internal.N2.k) n22;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(d6, "");
                            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest a2 = n8Var.a(kVar, (com.plaid.internal.D6.a) d6);
                            java.lang.String h = n2.h();
                            java.lang.String g = n2.g();
                            java.lang.String a3 = kVar.a();
                            w22.e = 1;
                            java.lang.Object a4 = a(a2, h, g, a3, w22);
                            if (a4 != coroutine_suspended) {
                                return a4;
                            }
                        } else {
                            return new com.plaid.internal.N2.d(n2.g(), n2.h(), ((com.plaid.internal.N2.k) n22).c(), d6 instanceof com.plaid.internal.D6.c);
                        }
                    } else {
                        com.plaid.internal.r8 e = n22 instanceof com.plaid.internal.N2.l ? ((com.plaid.internal.N2.l) n22).e() : null;
                        if (e == null) {
                            return a(com.plaid.internal.O2.a(n2), n2.h(), new java.lang.IllegalStateException("Link does not have a current pane"), "", kotlin.collections.CollectionsKt.emptyList());
                        }
                        com.plaid.internal.L4 l4 = this.b;
                        w22.f5961a = this;
                        w22.b = n22;
                        w22.e = 2;
                        obj = l4.a(e, w22);
                        if (obj != coroutine_suspended) {
                            y2 = this;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n22 = w22.b;
                com.plaid.internal.Y2 y22 = w22.f5961a;
                kotlin.ResultKt.throwOnFailure(obj);
                y2 = y22;
                return ((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj) != null ? y2.a(com.plaid.internal.O2.a(n22), n22.h(), new java.lang.IllegalStateException("OAuth pane not found: ".concat(java.lang.String.valueOf(n22))), "", kotlin.collections.CollectionsKt.emptyList()) : n22;
            }
        }
        w2 = new com.plaid.internal.W2(this, continuationImpl);
        com.plaid.internal.W2 w222 = w2;
        java.lang.Object obj2 = w222.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w222.e;
        if (i != 0) {
        }
        if (((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) obj2) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121 A[LOOP:1: B:22:0x011b->B:24:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering, java.util.List list, java.util.List list2, java.lang.String str5, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.S2 s2;
        int i;
        java.lang.String str6;
        java.lang.String str7;
        java.util.List list3;
        java.util.List list4;
        java.lang.String str8;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering2;
        com.plaid.internal.Y2 y2;
        java.lang.String str9;
        java.lang.String str10;
        com.plaid.internal.Y2 y22;
        java.lang.String str11;
        java.util.Iterator it;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering3;
        java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> list5;
        if (continuationImpl instanceof com.plaid.internal.S2) {
            s2 = (com.plaid.internal.S2) continuationImpl;
            int i2 = s2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s2.m = i2 - 2147483648;
                java.lang.Object obj = s2.k;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s2.m;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (pane$PaneRendering == null) {
                        return a(str5, str2, new java.lang.Throwable("Next pane was null in start request"), str3, (java.util.List<com.plaid.internal.r8>) list2);
                    }
                    com.plaid.internal.L4 l4 = this.b;
                    com.plaid.internal.r8.c cVar = com.plaid.internal.r8.CREATOR;
                    com.plaid.internal.r8 a2 = com.plaid.internal.r8.c.a(pane$PaneRendering, str2);
                    s2.f5917a = this;
                    str6 = str;
                    s2.b = str6;
                    s2.c = str2;
                    str7 = str3;
                    s2.d = str7;
                    s2.e = str4;
                    s2.f = pane$PaneRendering;
                    list3 = list;
                    s2.g = list3;
                    list4 = list2;
                    s2.h = list4;
                    str8 = str5;
                    s2.i = str8;
                    s2.m = 1;
                    if (l4.a(a2, pane$PaneRendering, s2) != coroutine_suspended) {
                        pane$PaneRendering2 = pane$PaneRendering;
                        y2 = this;
                        str9 = str4;
                        str10 = str2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = s2.j;
                    java.lang.String str12 = s2.i;
                    java.util.List list6 = s2.h;
                    list5 = s2.g;
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering4 = s2.f;
                    java.lang.String str13 = s2.e;
                    java.lang.String str14 = s2.d;
                    java.lang.String str15 = s2.c;
                    java.lang.String str16 = s2.b;
                    com.plaid.internal.Y2 y23 = s2.f5917a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str11 = str13;
                    str7 = str14;
                    str10 = str15;
                    str8 = str12;
                    pane$PaneRendering3 = pane$PaneRendering4;
                    str6 = str16;
                    list4 = list6;
                    y22 = y23;
                    while (it.hasNext()) {
                        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering5 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) it.next();
                        com.plaid.internal.L4 l42 = y22.b;
                        com.plaid.internal.r8.c cVar2 = com.plaid.internal.r8.CREATOR;
                        com.plaid.internal.r8 a3 = com.plaid.internal.r8.c.a(pane$PaneRendering5, str10);
                        s2.f5917a = y22;
                        s2.b = str6;
                        s2.c = str10;
                        s2.d = str7;
                        s2.e = str11;
                        s2.f = pane$PaneRendering3;
                        s2.g = list5;
                        s2.h = list4;
                        s2.i = str8;
                        s2.j = it;
                        java.util.Iterator it2 = it;
                        s2.m = 2;
                        if (l42.a(a3, pane$PaneRendering5, s2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = it2;
                    }
                    com.plaid.internal.r8.c cVar3 = com.plaid.internal.r8.CREATOR;
                    com.plaid.internal.r8 a4 = com.plaid.internal.r8.c.a(pane$PaneRendering3, str10);
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                    for (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering6 : list5) {
                        com.plaid.internal.r8.c cVar4 = com.plaid.internal.r8.CREATOR;
                        arrayList.add(com.plaid.internal.r8.c.a(pane$PaneRendering6, str10));
                    }
                    return new com.plaid.internal.N2.l(str6, str10, str7, str11, a4, arrayList, list4, str8);
                }
                java.lang.String str17 = s2.i;
                java.util.List list7 = s2.h;
                java.util.List list8 = s2.g;
                pane$PaneRendering2 = s2.f;
                java.lang.String str18 = s2.e;
                str7 = s2.d;
                str10 = s2.c;
                java.lang.String str19 = s2.b;
                com.plaid.internal.Y2 y24 = s2.f5917a;
                kotlin.ResultKt.throwOnFailure(obj);
                str8 = str17;
                str9 = str18;
                str6 = str19;
                y2 = y24;
                list4 = list7;
                list3 = list8;
                y22 = y2;
                str11 = str9;
                it = list3.iterator();
                pane$PaneRendering3 = pane$PaneRendering2;
                list5 = list3;
                while (it.hasNext()) {
                }
                com.plaid.internal.r8.c cVar32 = com.plaid.internal.r8.CREATOR;
                com.plaid.internal.r8 a42 = com.plaid.internal.r8.c.a(pane$PaneRendering3, str10);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                while (r3.hasNext()) {
                }
                return new com.plaid.internal.N2.l(str6, str10, str7, str11, a42, arrayList2, list4, str8);
            }
        }
        s2 = new com.plaid.internal.S2(this, continuationImpl);
        java.lang.Object obj2 = s2.k;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s2.m;
        if (i != 0) {
        }
        y22 = y2;
        str11 = str9;
        it = list3.iterator();
        pane$PaneRendering3 = pane$PaneRendering2;
        list5 = list3;
        while (it.hasNext()) {
        }
        com.plaid.internal.r8.c cVar322 = com.plaid.internal.r8.CREATOR;
        com.plaid.internal.r8 a422 = com.plaid.internal.r8.c.a(pane$PaneRendering3, str10);
        java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
        while (r3.hasNext()) {
        }
        return new com.plaid.internal.N2.l(str6, str10, str7, str11, a422, arrayList22, list4, str8);
    }

    public final <T> com.plaid.internal.N2.i a(java.lang.String str, com.plaid.internal.AbstractC0550i4<? extends T, ? extends java.lang.Object> abstractC0550i4, java.lang.String str2, java.util.List<com.plaid.internal.r8> list) {
        java.lang.String str3;
        com.plaid.internal.H3 h3;
        com.plaid.internal.H3 h32;
        java.lang.String str4;
        com.plaid.internal.H3 h33;
        com.plaid.internal.F3 f3 = this.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0550i4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (!(abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.c)) {
            if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.b) {
                h33 = com.plaid.internal.H3.NETWORK_ERROR;
            } else {
                if (!(abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.d)) {
                    if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.a) {
                        com.plaid.internal.AbstractC0550i4.a aVar = (com.plaid.internal.AbstractC0550i4.a) abstractC0550i4;
                        U u = aVar.f6438a;
                        if (!(u instanceof com.google.gson.internal.LinkedTreeMap)) {
                            str3 = "";
                        } else {
                            str3 = java.lang.String.valueOf(((java.util.Map) u).get("request_id"));
                        }
                        if (aVar.b == 440) {
                            h3 = com.plaid.internal.H3.SESSION_EXPIRED;
                        } else {
                            h3 = com.plaid.internal.H3.HTTP_ERROR;
                        }
                        h32 = h3;
                        str4 = str3;
                        com.plaid.internal.r8.c cVar = com.plaid.internal.r8.CREATOR;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return new com.plaid.internal.N2.i(str, new com.plaid.internal.r8(str, "error_pane_id", "local_error_pane"), str2, f3.a(h32), com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), list, str4, h32);
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                h33 = com.plaid.internal.H3.UNKNOWN_ERROR;
            }
            h32 = h33;
            str4 = "";
            com.plaid.internal.r8.c cVar2 = com.plaid.internal.r8.CREATOR;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return new com.plaid.internal.N2.i(str, new com.plaid.internal.r8(str, "error_pane_id", "local_error_pane"), str2, f3.a(h32), com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), list, str4, h32);
        }
        throw new com.plaid.internal.B2("Can't convert success response to local error");
    }

    public final com.plaid.internal.N2.i a(java.lang.String str, java.lang.String str2, java.lang.Throwable th, java.lang.String str3, java.util.List<com.plaid.internal.r8> list) {
        com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, th);
        com.plaid.internal.F3 f3 = this.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.plaid.internal.r8.c cVar = com.plaid.internal.r8.CREATOR;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.plaid.internal.r8 r8Var = new com.plaid.internal.r8(str2, "error_pane_id", "local_error_pane");
        com.plaid.internal.H3 h3 = com.plaid.internal.H3.UNKNOWN_ERROR;
        return new com.plaid.internal.N2.i(str2, r8Var, str3, f3.a(h3), com.plaid.link.result.LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), list, str, h3);
    }
}
