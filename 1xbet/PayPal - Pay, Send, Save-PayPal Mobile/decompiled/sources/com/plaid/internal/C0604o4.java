package com.plaid.internal;

/* renamed from: com.plaid.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0604o4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.i8 f6518a;
    public final com.plaid.internal.C0683x3 b;
    public final com.plaid.internal.C0613p4 c;
    public final com.plaid.internal.r8 d;
    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest e;

    public C0604o4(com.plaid.internal.i8 i8Var, com.plaid.internal.C0683x3 c0683x3, com.plaid.internal.C0613p4 c0613p4, java.lang.String str, com.plaid.internal.r8 r8Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0683x3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0613p4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8Var, "");
        this.f6518a = i8Var;
        this.b = c0683x3;
        this.c = c0613p4;
        this.d = r8Var;
        this.e = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.newBuilder().a(r8Var.f6560a).a(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.newBuilder().a(str).build()).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r8, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        if (r14 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010c, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cb -> B:11:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0595n4 c0595n4;
        int i;
        long currentTimeMillis;
        com.plaid.internal.C0604o4 c0604o4;
        boolean z;
        boolean z2;
        if (continuationImpl instanceof com.plaid.internal.C0595n4) {
            c0595n4 = (com.plaid.internal.C0595n4) continuationImpl;
            int i2 = c0595n4.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0595n4.e = i2 - 2147483648;
                java.lang.Object obj = c0595n4.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0595n4.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.c.c()) {
                        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                        com.plaid.internal.C0452a6.a.a("Not polling for oAuth result", true);
                        return kotlin.Unit.INSTANCE;
                    }
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                    long b = this.c.b();
                    long a2 = this.c.a();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Polling for oAuth result - duration: ");
                    sb.append(b);
                    sb.append(" interval: ");
                    sb.append(a2);
                    com.plaid.internal.C0452a6.a.a(sb.toString(), true);
                    this.b.b(this.d);
                    c0604o4 = this;
                    z = false;
                    z2 = false;
                    if (!z) {
                    }
                } else if (i == 1) {
                    currentTimeMillis = c0595n4.b;
                    c0604o4 = c0595n4.f6507a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0452a6.a aVar3 = com.plaid.internal.C0452a6.f5996a;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("OAuth polling attempt - ");
                    sb2.append(currentTimeMillis2 - currentTimeMillis);
                    com.plaid.internal.C0452a6.a.a(sb2.toString(), true);
                    com.plaid.internal.i8 i8Var = c0604o4.f6518a;
                    com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest = c0604o4.e;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workflow$LinkWorkflowPollRequest, "");
                    c0595n4.f6507a = c0604o4;
                    c0595n4.b = currentTimeMillis;
                    c0595n4.e = 2;
                    obj = i8Var.a(workflow$LinkWorkflowPollRequest, c0595n4);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    currentTimeMillis = c0595n4.b;
                    c0604o4 = c0595n4.f6507a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.AbstractC0550i4 abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj;
                    if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.c) {
                        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse = (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse) ((com.plaid.internal.AbstractC0550i4.c) abstractC0550i4).b();
                        if (workflow$LinkWorkflowPollResponse.hasOauthRedirectComplete() && workflow$LinkWorkflowPollResponse.getOauthRedirectComplete().getIsComplete()) {
                            z2 = true;
                            if (z2) {
                                com.plaid.internal.C0452a6.a aVar4 = com.plaid.internal.C0452a6.f5996a;
                                com.plaid.internal.C0452a6.a.a("OAuth polling detected OAuth session completion", true);
                            } else if (java.lang.System.currentTimeMillis() - currentTimeMillis <= c0604o4.c.b()) {
                                z = false;
                                if (!z) {
                                    c0604o4.b.a(c0604o4.d);
                                    com.plaid.internal.C0452a6.a aVar5 = com.plaid.internal.C0452a6.f5996a;
                                    com.plaid.internal.C0452a6.a.a("Stopped polling, session was completed: ".concat(java.lang.String.valueOf(z2)), true);
                                    return kotlin.Unit.INSTANCE;
                                }
                                long a3 = c0604o4.c.a();
                                c0595n4.f6507a = c0604o4;
                                c0595n4.b = currentTimeMillis;
                                c0595n4.e = 1;
                            }
                            z = true;
                            if (!z) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
        }
        c0595n4 = new com.plaid.internal.C0595n4(this, continuationImpl);
        java.lang.Object obj2 = c0595n4.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0595n4.e;
        if (i != 0) {
        }
    }
}
