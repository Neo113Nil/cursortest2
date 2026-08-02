package com.plaid.internal;

/* renamed from: com.plaid.internal.t7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0651t7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.InterfaceC0669v7 f6583a;
    public final com.plaid.internal.InterfaceC0535g7 b;

    public C0651t7(com.plaid.internal.InterfaceC0669v7 interfaceC0669v7, com.plaid.internal.InterfaceC0535g7 interfaceC0535g7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0669v7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0535g7, "");
        this.f6583a = interfaceC0669v7;
        this.b = interfaceC0535g7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.C0660u7 c0660u7, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0633r7 c0633r7;
        int i;
        com.plaid.internal.C0651t7 c0651t7;
        com.plaid.internal.InterfaceC0624q6 interfaceC0624q6;
        if (continuationImpl instanceof com.plaid.internal.C0633r7) {
            c0633r7 = (com.plaid.internal.C0633r7) continuationImpl;
            int i2 = c0633r7.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0633r7.e = i2 - 2147483648;
                java.lang.Object obj = c0633r7.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0633r7.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Twilio redirect uri: ".concat(java.lang.String.valueOf(c0660u7.a())), true);
                    com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "TwilioSNA - start processUrl");
                    kotlinx.coroutines.CoroutineDispatcher io2 = kotlinx.coroutines.Dispatchers.getIO();
                    com.plaid.internal.C0642s7 c0642s7 = new com.plaid.internal.C0642s7(this, c0660u7, null);
                    c0633r7.f6559a = this;
                    c0633r7.b = c0660u7;
                    c0633r7.e = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(io2, c0642s7, c0633r7);
                    if (obj != coroutine_suspended) {
                        c0651t7 = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.AbstractC0550i4 abstractC0550i4 = (com.plaid.internal.AbstractC0550i4) obj;
                    if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.c) {
                        com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                        com.plaid.internal.C0452a6.a.a("/twilio/finish response Success: ".concat(java.lang.String.valueOf(((com.plaid.internal.AbstractC0550i4.c) abstractC0550i4).b())), true);
                    } else if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.b) {
                        com.plaid.internal.AbstractC0550i4.b bVar = (com.plaid.internal.AbstractC0550i4.b) abstractC0550i4;
                        com.plaid.internal.F6.a.a(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Exception", bVar.b().toString())), "TwilioSNA - /twilio/finish failure NetworkError");
                        com.plaid.internal.Y6.a.a("/twilio/finish response NetworkError: ".concat(java.lang.String.valueOf(bVar.b())));
                    } else if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.a) {
                        com.plaid.internal.AbstractC0550i4.a aVar3 = (com.plaid.internal.AbstractC0550i4.a) abstractC0550i4;
                        com.plaid.internal.F6.a.a(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Exception", java.lang.String.valueOf(aVar3.b()))), "TwilioSNA - /twilio/finish failure HttpError");
                        com.plaid.internal.Y6.a.a("/twilio/finish response HttpError: ".concat(java.lang.String.valueOf(aVar3.b())));
                    } else if (abstractC0550i4 instanceof com.plaid.internal.AbstractC0550i4.d) {
                        com.plaid.internal.AbstractC0550i4.d dVar = (com.plaid.internal.AbstractC0550i4.d) abstractC0550i4;
                        com.plaid.internal.F6.a.a(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Exception", java.lang.String.valueOf(dVar.b()))), "TwilioSNA - /twilio/finish failure UnknownError");
                        com.plaid.internal.Y6.a.a("/twilio/finish response UnknownError: ".concat(java.lang.String.valueOf(dVar.b())));
                    }
                    return kotlin.Unit.INSTANCE;
                }
                c0660u7 = c0633r7.b;
                c0651t7 = c0633r7.f6559a;
                kotlin.ResultKt.throwOnFailure(obj);
                interfaceC0624q6 = (com.plaid.internal.InterfaceC0624q6) obj;
                if (!(interfaceC0624q6 instanceof com.plaid.internal.InterfaceC0624q6.a)) {
                    com.plaid.internal.F6.a.a();
                    com.plaid.internal.Y6.a.a("Error processing Twilio redirect uri: ".concat(java.lang.String.valueOf(((com.plaid.internal.InterfaceC0624q6.a) interfaceC0624q6).a())));
                    return kotlin.Unit.INSTANCE;
                }
                if (interfaceC0624q6 instanceof com.plaid.internal.InterfaceC0624q6.b) {
                    com.plaid.internal.C0452a6.a aVar4 = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("processUrl success: ".concat(java.lang.String.valueOf(((com.plaid.internal.InterfaceC0624q6.b) interfaceC0624q6).a())), true);
                    com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "TwilioSNA - processUrl success, sending twilioFinishRequest");
                    com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest build = com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest.newBuilder().a(c0660u7.b()).build();
                    com.plaid.internal.C0452a6.a.a("sending twilioFinishRequest: ".concat(java.lang.String.valueOf(build)), true);
                    com.plaid.internal.InterfaceC0535g7 interfaceC0535g7 = c0651t7.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                    c0633r7.f6559a = null;
                    c0633r7.b = null;
                    c0633r7.e = 2;
                    obj = interfaceC0535g7.a(build, c0633r7);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c0633r7 = new com.plaid.internal.C0633r7(this, continuationImpl);
        java.lang.Object obj2 = c0633r7.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0633r7.e;
        if (i != 0) {
        }
        interfaceC0624q6 = (com.plaid.internal.InterfaceC0624q6) obj2;
        if (!(interfaceC0624q6 instanceof com.plaid.internal.InterfaceC0624q6.a)) {
        }
    }
}
