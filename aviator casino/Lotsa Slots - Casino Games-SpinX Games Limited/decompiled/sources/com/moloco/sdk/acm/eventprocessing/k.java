package com.moloco.sdk.acm.eventprocessing;

/* loaded from: classes5.dex */
public final class k implements com.moloco.sdk.acm.eventprocessing.j {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.http.e f6899a;
    public final com.moloco.sdk.acm.db.d b;
    public final com.moloco.sdk.acm.eventprocessing.f c;
    public final kotlin.jvm.functions.Function1<io.ktor.http.HeadersBuilder, kotlin.Unit> d;
    public final java.lang.String e;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestAndPurgeDBImpl", f = "RequestAndPurgeDB.kt", i = {0, 1}, l = {38, 48}, m = "invoke-IoAF18A", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6900a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.k.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            java.lang.Object a2 = com.moloco.sdk.acm.eventprocessing.k.this.a(this);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Result.m10797boximpl(a2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(com.moloco.sdk.acm.http.e metricsRequest, com.moloco.sdk.acm.db.d metricsDAO, com.moloco.sdk.acm.eventprocessing.f dataAgeChecker, kotlin.jvm.functions.Function1<? super io.ktor.http.HeadersBuilder, kotlin.Unit> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRequest, "metricsRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsDAO, "metricsDAO");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataAgeChecker, "dataAgeChecker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        this.f6899a = metricsRequest;
        this.b = metricsDAO;
        this.c = dataAgeChecker;
        this.d = headers;
        this.e = "RequestAndPurgeDB";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.eventprocessing.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation) {
        com.moloco.sdk.acm.eventprocessing.k.a aVar;
        java.lang.Object coroutine_suspended;
        int i;
        com.moloco.sdk.acm.eventprocessing.k kVar;
        com.moloco.sdk.acm.http.d a2;
        java.lang.Object a3;
        com.moloco.sdk.acm.eventprocessing.k kVar2;
        java.lang.Throwable m10801exceptionOrNullimpl;
        if (continuation instanceof com.moloco.sdk.acm.eventprocessing.k.a) {
            aVar = (com.moloco.sdk.acm.eventprocessing.k.a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.b;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.acm.db.d dVar = this.b;
                    aVar.f6900a = this;
                    aVar.d = 1;
                    obj = dVar.a(aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar2 = (com.moloco.sdk.acm.eventprocessing.k) aVar.f6900a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        a3 = ((kotlin.Result) obj).getValue();
                        if (kotlin.Result.m10805isSuccessimpl(a3)) {
                            com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.f6920a, kVar2.e, "Request Success", false, 4, null);
                        }
                        m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a3);
                        if (m10801exceptionOrNullimpl != null) {
                            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, kVar2.e, "Request failure: " + m10801exceptionOrNullimpl.getMessage(), null, false, 12, null);
                        }
                        return a3;
                    }
                    kVar = (com.moloco.sdk.acm.eventprocessing.k) aVar.f6900a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List<com.moloco.sdk.acm.db.b> list = (java.util.List) obj;
                com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.f6920a, kVar.e, list.size() + " events processed.", false, 4, null);
                a2 = new com.moloco.sdk.acm.eventprocessing.b(kVar.c).a(list);
                if (!a2.a().isEmpty() && a2.b().isEmpty()) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl("No metrics to process");
                }
                com.moloco.sdk.acm.http.e eVar = kVar.f6899a;
                kotlin.jvm.functions.Function1<io.ktor.http.HeadersBuilder, kotlin.Unit> function1 = kVar.d;
                aVar.f6900a = kVar;
                aVar.d = 2;
                a3 = eVar.a(a2, function1, aVar);
                if (a3 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                kVar2 = kVar;
                if (kotlin.Result.m10805isSuccessimpl(a3)) {
                }
                m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a3);
                if (m10801exceptionOrNullimpl != null) {
                }
                return a3;
            }
        }
        aVar = new com.moloco.sdk.acm.eventprocessing.k.a(continuation);
        java.lang.Object obj2 = aVar.b;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        java.util.List<com.moloco.sdk.acm.db.b> list2 = (java.util.List) obj2;
        com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.f6920a, kVar.e, list2.size() + " events processed.", false, 4, null);
        a2 = new com.moloco.sdk.acm.eventprocessing.b(kVar.c).a(list2);
        if (!a2.a().isEmpty()) {
        }
        com.moloco.sdk.acm.http.e eVar2 = kVar.f6899a;
        kotlin.jvm.functions.Function1<io.ktor.http.HeadersBuilder, kotlin.Unit> function12 = kVar.d;
        aVar.f6900a = kVar;
        aVar.d = 2;
        a3 = eVar2.a(a2, function12, aVar);
        if (a3 != coroutine_suspended) {
        }
    }
}
