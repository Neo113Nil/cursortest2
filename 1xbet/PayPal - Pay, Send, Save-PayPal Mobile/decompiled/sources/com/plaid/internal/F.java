package com.plaid.internal;

/* loaded from: classes16.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.i8 f5782a;
    public final java.util.HashSet<java.lang.String> b;
    public boolean c;

    public F(com.plaid.internal.i8 i8Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        this.f5782a = i8Var;
        this.b = new java.util.HashSet<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (r13 != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bb -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.plaid.internal.F f, com.plaid.internal.A a2, com.plaid.internal.G g, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.E e;
        int i;
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        com.plaid.internal.F f2;
        com.plaid.internal.A a3;
        long j;
        if (continuationImpl instanceof com.plaid.internal.E) {
            e = (com.plaid.internal.E) continuationImpl;
            int i2 = e.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e.h = i2 - 2147483648;
                java.lang.Object obj = e.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = e.h;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("channel_id", a2.f5744a));
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Polling started", "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapOf, "");
                    com.plaid.internal.F6.a.a("Polling started", mapOf, com.plaid.internal.J6.INFO);
                    str = null;
                    boolean z2 = f.c;
                    j = a2.c;
                    e.f5774a = f;
                    e.b = a2;
                    e.c = g;
                    e.d = str;
                    e.e = z2;
                    e.h = 1;
                    if (kotlinx.coroutines.DelayKt.delay(j, e) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = e.e;
                    str2 = e.d;
                    g = e.c;
                    a3 = e.b;
                    f2 = e.f5774a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str3 = str2;
                    boolean z3 = z;
                    f = f2;
                    com.plaid.internal.E e2 = e;
                    java.lang.Object obj2 = obj;
                    com.plaid.internal.G g2 = g;
                    java.lang.String str4 = str3;
                    com.plaid.internal.AbstractC0550i4 abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj2;
                    if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.b) {
                        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                        com.plaid.internal.C0452a6.b.a(((com.plaid.internal.AbstractC0550i4.b) abstractC0550i4).f6439a, true);
                    } else if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.a) {
                        if (com.plaid.internal.C0636s1.a((com.plaid.internal.AbstractC0550i4.a) abstractC0550i4)) {
                            com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "Closing channel due to invalid channel response.");
                            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "Polling stopped, channel closed.");
                            return kotlin.Unit.INSTANCE;
                        }
                    } else if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.d) {
                        com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                        com.plaid.internal.C0452a6.b.a(((com.plaid.internal.AbstractC0550i4.d) abstractC0550i4).f6441a, true);
                    } else if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.c) {
                        com.plaid.internal.AbstractC0550i4.c cVar = (com.plaid.internal.AbstractC0550i4.c) abstractC0550i4;
                        str4 = ((com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) cVar.f6440a).getFetchId();
                        com.plaid.link.result.LinkResult a4 = f.a((com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse) cVar.f6440a, g2);
                        if (a4 != null) {
                            g2.a(a4);
                            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "Polling stopped, link result received.");
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    if (z3) {
                        g2.a();
                        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "Polling stopped, no results from channel.");
                        return kotlin.Unit.INSTANCE;
                    }
                    a2 = a3;
                    e = e2;
                    str = str4;
                    g = g2;
                    boolean z22 = f.c;
                    j = a2.c;
                    e.f5774a = f;
                    e.b = a2;
                    e.c = g;
                    e.d = str;
                    e.e = z22;
                    e.h = 1;
                    if (kotlinx.coroutines.DelayKt.delay(j, e) != coroutine_suspended) {
                        f2 = f;
                        z = z22;
                        a3 = a2;
                        str2 = str;
                        com.plaid.internal.i8 i8Var = f2.f5782a;
                        com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.a newBuilder = com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.newBuilder();
                        newBuilder.a(a3.f5744a);
                        newBuilder.b(a3.b);
                        if (str2 != null) {
                            newBuilder.c(str2);
                        }
                        com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest build = newBuilder.build();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                        e.f5774a = f2;
                        e.b = a3;
                        e.c = g;
                        e.d = str2;
                        e.e = z;
                        e.h = 2;
                        obj = i8Var.a(build, e);
                    }
                    return coroutine_suspended;
                }
                z = e.e;
                str2 = e.d;
                g = e.c;
                a3 = e.b;
                f2 = e.f5774a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.i8 i8Var2 = f2.f5782a;
                com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.a newBuilder2 = com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest.newBuilder();
                newBuilder2.a(a3.f5744a);
                newBuilder2.b(a3.b);
                if (str2 != null) {
                }
                com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest build2 = newBuilder2.build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "");
                e.f5774a = f2;
                e.b = a3;
                e.c = g;
                e.d = str2;
                e.e = z;
                e.h = 2;
                obj = i8Var2.a(build2, e);
            }
        }
        e = new com.plaid.internal.E(f, continuationImpl);
        java.lang.Object obj3 = e.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e.h;
        if (i != 0) {
        }
    }

    public final com.plaid.link.result.LinkResult a(com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse, com.plaid.internal.G g) {
        com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult result;
        com.plaid.link.result.LinkResult a2;
        kotlin.Unit unit;
        com.plaid.internal.core.protos.link.channel.Channel$Message.SDKEvent event;
        com.plaid.link.result.LinkResult linkResult = null;
        for (com.plaid.internal.core.protos.link.channel.Channel$Message channel$Message : channel$LinkChannelFetchResponse.getMessagesList()) {
            if (!this.b.contains(channel$Message.getMessageId())) {
                this.b.add(channel$Message.getMessageId());
                if (channel$Message.hasEvent() && (event = channel$Message.getEvent()) != null) {
                    com.plaid.link.event.LinkEvent a3 = com.plaid.internal.S6.a(event);
                    if (a3.getEventName().toString().length() != 0) {
                        g.a(a3, com.plaid.internal.I2.d.f5810a);
                    }
                }
                if (channel$Message.hasInternalEvent() && channel$Message.getInternalEvent().hasRequestSilentNetworkAuth()) {
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth = channel$Message.getInternalEvent().getRequestSilentNetworkAuth();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(requestSilentNetworkAuth);
                    com.plaid.internal.AbstractC0544h7 a4 = com.plaid.internal.Q6.a(requestSilentNetworkAuth);
                    if (a4 != null) {
                        com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "Polling received SNA request");
                        g.a(a4);
                        unit = kotlin.Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        com.plaid.internal.Y6.a.a("Invalid SNA request: ".concat(java.lang.String.valueOf(requestSilentNetworkAuth)));
                    }
                }
                if (channel$Message.hasPreCompletionResult()) {
                    com.plaid.internal.core.protos.link.channel.Channel$Message.SDKResult preCompletionResult = channel$Message.getPreCompletionResult();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(preCompletionResult, "");
                    g.a(preCompletionResult);
                }
                if (channel$Message.hasResult() && (result = channel$Message.getResult()) != null && (a2 = com.plaid.internal.T6.a(result)) != null) {
                    linkResult = a2;
                }
            }
        }
        return linkResult;
    }
}
