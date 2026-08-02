package com.plaid.internal;

/* renamed from: com.plaid.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0683x3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.i8 f6622a;
    public final com.plaid.internal.A3 b;
    public final kotlinx.coroutines.CoroutineDispatcher c;
    public java.lang.Long d;

    @javax.inject.Inject
    public C0683x3(com.plaid.internal.i8 i8Var, com.plaid.internal.A3 a3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a3, "");
        this.f6622a = i8Var;
        this.b = a3;
        this.c = kotlinx.coroutines.Dispatchers.getIO().limitedParallelism(1);
    }

    public final void a(com.plaid.internal.r8 r8Var, com.plaid.internal.r8 r8Var2) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
        java.lang.String str2 = r8Var.f6560a;
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a a2 = a();
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass.ClientEvent.Back.a newBuilder = com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.Back.newBuilder();
        newBuilder.a(r8Var.c);
        if (r8Var2 == null || (str = r8Var2.c) == null) {
            str = "";
        }
        newBuilder.b(str);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a a3 = a2.a(newBuilder);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0674w3(this, a3, str2, null), 3, null);
    }

    public final void b(com.plaid.internal.r8 r8Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
        java.lang.String str = r8Var.f6560a;
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a a2 = a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass.ClientEvent.OAuthLink.PollingStarted.getDefaultInstance()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0674w3(this, a2, str, null), 3, null);
    }

    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent build = a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.WebviewFallbackOpen.getDefaultInstance()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0665v3(this, str, build, null), 3, null);
    }

    public final void b() {
        this.d = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    }

    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent build = a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.WebviewFallbackEmitPreCompletionResult.getDefaultInstance()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0665v3(this, str, build, null), 3, null);
    }

    public final void a(com.plaid.internal.r8 r8Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
        java.lang.String str = r8Var.f6560a;
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a a2 = a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass.ClientEvent.OAuthLink.PollingComplete.getDefaultInstance()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0674w3(this, a2, str, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        r9 = r2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005a, code lost:
    
        if (r10 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[LOOP:1: B:42:0x009d->B:44:0x00a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.plaid.internal.C0683x3 c0683x3, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0656u3 c0656u3;
        int i;
        com.plaid.internal.C0683x3 c0683x32;
        java.util.Iterator it;
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
        com.plaid.internal.C0683x3 c0683x33;
        java.util.Iterator it2;
        if (continuationImpl instanceof com.plaid.internal.C0656u3) {
            c0656u3 = (com.plaid.internal.C0656u3) continuationImpl;
            int i2 = c0656u3.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0656u3.f = i2 - 2147483648;
                java.lang.Object obj = c0656u3.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0656u3.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.A3 a3 = c0683x3.b;
                    c0656u3.f6588a = c0683x3;
                    c0656u3.f = 1;
                    obj = a3.a(c0656u3);
                } else if (i == 1) {
                    c0683x3 = c0656u3.f6588a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    workflow$LinkWorkflowEventRequest = c0656u3.c;
                    it2 = c0656u3.b;
                    c0683x33 = c0656u3.f6588a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((com.plaid.internal.AbstractC0550i4) obj) instanceof com.plaid.internal.AbstractC0550i4.c) {
                    }
                    it = it2;
                    c0683x32 = c0683x33;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c0656u3.b;
                    c0683x32 = c0656u3.f6588a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (it.hasNext()) {
                        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest2 = (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) it.next();
                        com.plaid.internal.i8 i8Var = c0683x32.f6622a;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(workflow$LinkWorkflowEventRequest2);
                        c0656u3.f6588a = c0683x32;
                        c0656u3.b = it;
                        c0656u3.c = workflow$LinkWorkflowEventRequest2;
                        c0656u3.f = 2;
                        java.lang.Object a2 = i8Var.a(workflow$LinkWorkflowEventRequest2, c0656u3);
                        if (a2 != coroutine_suspended) {
                            com.plaid.internal.C0683x3 c0683x34 = c0683x32;
                            it2 = it;
                            workflow$LinkWorkflowEventRequest = workflow$LinkWorkflowEventRequest2;
                            obj = a2;
                            c0683x33 = c0683x34;
                            if (((com.plaid.internal.AbstractC0550i4) obj) instanceof com.plaid.internal.AbstractC0550i4.c) {
                                com.plaid.internal.A3 a32 = c0683x33.b;
                                java.util.List<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent> eventsList = workflow$LinkWorkflowEventRequest.getEventsList();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eventsList, "");
                                c0656u3.f6588a = c0683x33;
                                c0656u3.b = it2;
                                c0656u3.c = null;
                                c0656u3.f = 3;
                                if (a32.a(eventsList, c0656u3) != coroutine_suspended) {
                                }
                            }
                            it = it2;
                            c0683x32 = c0683x33;
                            if (it.hasNext()) {
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                    java.lang.String workflowSessionId = ((com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent) obj2).getWorkflowSessionId();
                    java.lang.Object obj3 = linkedHashMap.get(workflowSessionId);
                    if (obj3 == null) {
                        obj3 = new java.util.ArrayList();
                        linkedHashMap.put(workflowSessionId, obj3);
                    }
                    ((java.util.List) obj3).add(obj2);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a newBuilder = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.newBuilder();
                    newBuilder.b((java.lang.String) entry.getKey());
                    newBuilder.a((java.lang.Iterable<? extends com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent>) entry.getValue());
                    arrayList.add(newBuilder.build());
                }
                c0683x32 = c0683x3;
                it = arrayList.iterator();
                if (it.hasNext()) {
                }
            }
        }
        c0656u3 = new com.plaid.internal.C0656u3(c0683x3, continuationImpl);
        java.lang.Object obj4 = c0656u3.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0656u3.f;
        if (i != 0) {
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        while (r10.hasNext()) {
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap2.size());
        while (r2.hasNext()) {
        }
        c0683x32 = c0683x3;
        it = arrayList2.iterator();
        if (it.hasNext()) {
        }
    }

    public static com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.a a() {
        return com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.newBuilder().a(com.google.protobuf.Timestamp.newBuilder().setSeconds(java.lang.System.currentTimeMillis() / 1000));
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent build = a().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.newBuilder().a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass.ClientEvent.WebviewFallbackCancel.b.LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN).build()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0665v3(this, str, build, null), 3, null);
    }
}
