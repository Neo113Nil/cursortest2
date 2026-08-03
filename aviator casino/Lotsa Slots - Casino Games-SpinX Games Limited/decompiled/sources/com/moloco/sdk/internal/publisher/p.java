package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class p {
    public static final com.moloco.sdk.internal.publisher.p.a c = new com.moloco.sdk.internal.publisher.p.a(null);
    public static final int d = 0;
    public static final java.lang.String e = "BidLoader";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.b f7166a;
    public final com.moloco.sdk.internal.publisher.q b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", i = {0, 0}, l = {34, 47}, m = "parse", n = {"this", "adUnitId"}, s = {"L$0", "L$1"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7167a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.p.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.p.this.a(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", i = {0, 0}, l = {73}, m = "parseBidResponse", n = {"this", "adUnitId"}, s = {"L$0", "L$1"})
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7168a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.p.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.p.this.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", i = {0}, l = {59}, m = "processBidResponse$moloco_sdk_release", n = {"bidResponseJson"}, s = {"L$0"})
    public static final class d extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7169a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.p.d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.p.this.a(null, this);
        }
    }

    public p(com.moloco.sdk.internal.ortb.b bidResponseParser, com.moloco.sdk.internal.publisher.q bidProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponseParser, "bidResponseParser");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidProcessor, "bidProcessor");
        this.f7166a = bidResponseParser;
        this.b = bidProcessor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.ortb.model.C3415e, com.moloco.sdk.internal.s>> continuation) {
        com.moloco.sdk.internal.publisher.p.c cVar;
        int i;
        com.moloco.sdk.internal.publisher.p pVar;
        java.lang.String str3;
        com.moloco.sdk.internal.v vVar;
        java.lang.String str4;
        java.util.Map emptyMap;
        if (continuation instanceof com.moloco.sdk.internal.publisher.p.c) {
            cVar = (com.moloco.sdk.internal.publisher.p.c) continuation;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.ortb.b bVar = this.f7166a;
                    cVar.f7168a = this;
                    cVar.b = str2;
                    cVar.e = 1;
                    obj = bVar.a(str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pVar = this;
                    str3 = str2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (java.lang.String) cVar.b;
                    pVar = (com.moloco.sdk.internal.publisher.p) cVar.f7168a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (vVar instanceof com.moloco.sdk.internal.v.a) {
                    if (vVar instanceof com.moloco.sdk.internal.v.b) {
                        return new com.moloco.sdk.internal.v.b(((com.moloco.sdk.internal.ortb.model.g) ((com.moloco.sdk.internal.v.b) vVar).a()).b().get(0).b().get(0));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) vVar;
                com.moloco.sdk.internal.o a2 = pVar.a((com.moloco.sdk.internal.ortb.a) aVar.a());
                java.lang.Object a3 = aVar.a();
                com.moloco.sdk.internal.ortb.a.C0184a c0184a = a3 instanceof com.moloco.sdk.internal.ortb.a.C0184a ? (com.moloco.sdk.internal.ortb.a.C0184a) a3 : null;
                java.lang.Exception b2 = c0184a != null ? c0184a.b() : null;
                java.lang.Object a4 = aVar.a();
                com.moloco.sdk.internal.ortb.a.b bVar2 = a4 instanceof com.moloco.sdk.internal.ortb.a.b ? (com.moloco.sdk.internal.ortb.a.b) a4 : null;
                java.util.List<java.lang.String> b3 = bVar2 != null ? bVar2.b() : null;
                if (b3 != null) {
                    java.util.List<java.lang.String> list = b3.isEmpty() ^ true ? b3 : null;
                    if (list != null) {
                        str4 = kotlin.collections.CollectionsKt.joinToString$default(list, ",", " missingFields=", null, 0, null, null, 60, null);
                    }
                }
                str4 = "";
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "parseBidResponse failed to parse BID json string. subType=" + a2 + str4, b2, false, 8, null);
                com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                if (b3 != null) {
                    java.util.List<java.lang.String> list2 = true ^ b3.isEmpty() ? b3 : null;
                    if (list2 != null) {
                        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null);
                        if (joinToString$default != null) {
                            emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("missing_fields", joinToString$default));
                        }
                    }
                }
                emptyMap = kotlin.collections.MapsKt.emptyMap();
                return new com.moloco.sdk.internal.v.a(com.moloco.sdk.internal.t.a(str3, errorType, a2, emptyMap));
            }
        }
        cVar = new com.moloco.sdk.internal.publisher.p.c(continuation);
        java.lang.Object obj2 = cVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.e;
        if (i != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (vVar instanceof com.moloco.sdk.internal.v.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.internal.ortb.model.C3415e, com.moloco.sdk.internal.s>> continuation) {
        com.moloco.sdk.internal.publisher.p.b bVar;
        int i;
        com.moloco.sdk.internal.publisher.p pVar;
        java.lang.String str3;
        if (continuation instanceof com.moloco.sdk.internal.publisher.p.b) {
            bVar = (com.moloco.sdk.internal.publisher.p.b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "parse() called with bidResponseJson: " + str2, false, 4, null);
                    bVar.f7167a = this;
                    bVar.b = str;
                    bVar.e = 1;
                    obj = a(str2, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pVar = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) bVar.b;
                    pVar = (com.moloco.sdk.internal.publisher.p) bVar.f7167a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str4 = str;
                str3 = (java.lang.String) obj;
                if (str3 != null) {
                    return new com.moloco.sdk.internal.v.a(com.moloco.sdk.internal.t.a(str4, com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.o.b, null, 8, null));
                }
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Processed the bidResponse, proceeding with parsing it.", null, false, 12, null);
                bVar.f7167a = null;
                bVar.b = null;
                bVar.e = 2;
                obj = pVar.b(str3, str4, bVar);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        bVar = new com.moloco.sdk.internal.publisher.p.b(continuation);
        java.lang.Object obj2 = bVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        java.lang.String str42 = str;
        str3 = (java.lang.String) obj2;
        if (str3 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.moloco.sdk.internal.publisher.p.d dVar;
        int i;
        java.lang.String str2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.p.d) {
            dVar = (com.moloco.sdk.internal.publisher.p.d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = dVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.publisher.q qVar = this.b;
                    dVar.f7169a = str;
                    dVar.d = 1;
                    obj = qVar.a(str, dVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) dVar.f7169a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str2 = (java.lang.String) obj;
                if (str2 != null) {
                    return str;
                }
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Found no pre-preprocessor for the current mediation. Returning the original bid response.", null, false, 12, null);
                return str2;
            }
        }
        dVar = new com.moloco.sdk.internal.publisher.p.d(continuation);
        java.lang.Object obj2 = dVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.d;
        if (i != 0) {
        }
        str2 = (java.lang.String) obj2;
        if (str2 != null) {
        }
    }

    public final com.moloco.sdk.internal.o a(com.moloco.sdk.internal.ortb.a aVar) {
        if (aVar instanceof com.moloco.sdk.internal.ortb.a.C0184a) {
            return com.moloco.sdk.internal.o.c;
        }
        if (aVar instanceof com.moloco.sdk.internal.ortb.a.b) {
            return com.moloco.sdk.internal.o.d;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
