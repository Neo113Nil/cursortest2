package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class w implements com.moloco.sdk.internal.services.bidtoken.v {
    public static final com.moloco.sdk.internal.services.bidtoken.w.a e = new com.moloco.sdk.internal.services.bidtoken.w.a(null);
    public static final int f = 8;
    public static final java.lang.String g = "ServerBidTokenCache";
    public static final long h = 15;
    public static final long i = 2;
    public final com.moloco.sdk.internal.bidtoken.b b;
    public final com.moloco.sdk.internal.services.J c;
    public com.moloco.sdk.internal.services.bidtoken.k d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenCacheImpl", f = "ServerBidTokenCache.kt", i = {0}, l = {62}, m = "tokenStatus", n = {"this"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7253a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.w.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.bidtoken.w.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenCacheImpl", f = "ServerBidTokenCache.kt", i = {0, 0, 1, 1, 1}, l = {95, 98}, m = "updateCache", n = {"this", "bidTokenComponents", "this", "bidTokenComponents", "newToken"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7254a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.w.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.bidtoken.w.this.a(null, this);
        }
    }

    public w(com.moloco.sdk.internal.bidtoken.b bidTokenParser, com.moloco.sdk.internal.services.J timeProviderService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenParser, "bidTokenParser");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.b = bidTokenParser;
        this.c = timeProviderService;
        this.d = new com.moloco.sdk.internal.services.bidtoken.k("", "", com.moloco.sdk.internal.services.bidtoken.e.a());
    }

    public static /* synthetic */ void d() {
    }

    public final void a(com.moloco.sdk.internal.services.bidtoken.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.d = kVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.v
    public void b() {
        this.d = new com.moloco.sdk.internal.services.bidtoken.k("", "", com.moloco.sdk.internal.services.bidtoken.e.a());
    }

    public final com.moloco.sdk.internal.services.bidtoken.k c() {
        return this.d;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.v
    public com.moloco.sdk.internal.services.bidtoken.k a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.moloco.sdk.internal.services.bidtoken.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.B> continuation) {
        com.moloco.sdk.internal.services.bidtoken.w.b bVar;
        int i2;
        com.moloco.sdk.internal.services.bidtoken.w wVar;
        com.moloco.sdk.internal.v vVar;
        if (continuation instanceof com.moloco.sdk.internal.services.bidtoken.w.b) {
            bVar = (com.moloco.sdk.internal.services.bidtoken.w.b) continuation;
            int i3 = bVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.d = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bVar.d;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (a().d().length() == 0) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "[Thread: " + java.lang.Thread.currentThread().getName() + "] cached bidToken is empty, needs refresh", null, false, 12, null);
                        return com.moloco.sdk.internal.services.bidtoken.B.f7215a;
                    }
                    com.moloco.sdk.internal.bidtoken.b bVar2 = this.b;
                    java.lang.String d = a().d();
                    bVar.f7253a = this;
                    bVar.d = 1;
                    obj = bVar2.a(d, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wVar = this;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = (com.moloco.sdk.internal.services.bidtoken.w) bVar.f7253a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "[Thread: " + java.lang.Thread.currentThread().getName() + "] Failed to parse cached token for expiration, needs refresh", null, false, 12, null);
                    return com.moloco.sdk.internal.services.bidtoken.B.f7215a;
                }
                if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.internal.bidtoken.a aVar = (com.moloco.sdk.internal.bidtoken.a) ((com.moloco.sdk.internal.v.b) vVar).a();
                    long a2 = wVar.c.a();
                    if (com.moloco.sdk.internal.services.bidtoken.x.a(aVar, a2)) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "[Thread: " + java.lang.Thread.currentThread().getName() + "] Bid token expired, needs refresh", null, false, 12, null);
                        return com.moloco.sdk.internal.services.bidtoken.B.f7215a;
                    }
                    if (com.moloco.sdk.internal.services.bidtoken.x.b(aVar, a2)) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "[Thread: " + java.lang.Thread.currentThread().getName() + "] Bid token is near expiry. It will expire soon", null, false, 12, null);
                        return com.moloco.sdk.internal.services.bidtoken.B.b;
                    }
                    com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, g, "[Thread: " + java.lang.Thread.currentThread().getName() + "] Bid token has not expired", null, false, 12, null);
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, g, "[Thread: " + java.lang.Thread.currentThread().getName() + "] Bid token doesn't need refresh", null, false, 12, null);
                    return com.moloco.sdk.internal.services.bidtoken.B.c;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        bVar = new com.moloco.sdk.internal.services.bidtoken.w.b(continuation);
        java.lang.Object obj2 = bVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bVar.d;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.moloco.sdk.internal.services.bidtoken.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.moloco.sdk.internal.services.bidtoken.k kVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.services.bidtoken.w.c cVar;
        int i2;
        com.moloco.sdk.internal.services.bidtoken.w wVar;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.internal.services.bidtoken.k kVar2;
        com.moloco.sdk.internal.bidtoken.a aVar;
        com.moloco.sdk.internal.services.bidtoken.w wVar2;
        com.moloco.sdk.internal.v vVar2;
        if (continuation instanceof com.moloco.sdk.internal.services.bidtoken.w.c) {
            cVar = (com.moloco.sdk.internal.services.bidtoken.w.c) continuation;
            int i3 = cVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    a("[Thread: " + java.lang.Thread.currentThread().getName() + "] Acquired lock, checking for new token expiry");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.d.d(), "")) {
                        this.d = kVar;
                        a("[Thread: " + java.lang.Thread.currentThread().getName() + "] Updated cache with new bidToken as existing token was empty");
                        return kotlin.Unit.INSTANCE;
                    }
                    com.moloco.sdk.internal.bidtoken.b bVar = this.b;
                    java.lang.String d = kVar.d();
                    cVar.f7254a = this;
                    cVar.b = kVar;
                    cVar.f = 1;
                    obj = bVar.a(d, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (com.moloco.sdk.internal.bidtoken.a) cVar.c;
                        kVar2 = (com.moloco.sdk.internal.services.bidtoken.k) cVar.b;
                        wVar2 = (com.moloco.sdk.internal.services.bidtoken.w) cVar.f7254a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        vVar2 = (com.moloco.sdk.internal.v) obj;
                        if (!(vVar2 instanceof com.moloco.sdk.internal.v.b)) {
                            if (aVar.a() > ((com.moloco.sdk.internal.bidtoken.a) ((com.moloco.sdk.internal.v.b) vVar2).a()).a()) {
                                wVar2.d = kVar2;
                                wVar2.a("[Thread: " + java.lang.Thread.currentThread().getName() + "] Updated cache with new bidToken");
                            } else {
                                wVar2.a("[Thread: " + java.lang.Thread.currentThread().getName() + "] New token's expiration is not greater than the existing token's expiration. Cache not updated.");
                            }
                        } else {
                            wVar2.d = kVar2;
                            wVar2.a("[Thread: " + java.lang.Thread.currentThread().getName() + "] Current token parsing failed. Updated cache with new bidToken");
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kVar = (com.moloco.sdk.internal.services.bidtoken.k) cVar.b;
                    wVar = (com.moloco.sdk.internal.services.bidtoken.w) cVar.f7254a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                    com.moloco.sdk.internal.bidtoken.a aVar2 = (com.moloco.sdk.internal.bidtoken.a) ((com.moloco.sdk.internal.v.b) vVar).a();
                    com.moloco.sdk.internal.bidtoken.b bVar2 = wVar.b;
                    java.lang.String d2 = wVar.d.d();
                    cVar.f7254a = wVar;
                    cVar.b = kVar;
                    cVar.c = aVar2;
                    cVar.f = 2;
                    java.lang.Object a2 = bVar2.a(d2, cVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kVar2 = kVar;
                    aVar = aVar2;
                    obj = a2;
                    wVar2 = wVar;
                    vVar2 = (com.moloco.sdk.internal.v) obj;
                    if (!(vVar2 instanceof com.moloco.sdk.internal.v.b)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                wVar.a("[Thread: " + java.lang.Thread.currentThread().getName() + "] New token parsing failed. Cache not updated.");
                return kotlin.Unit.INSTANCE;
            }
        }
        cVar = new com.moloco.sdk.internal.services.bidtoken.w.c(continuation);
        java.lang.Object obj2 = cVar.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar.f;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
        }
    }

    public final void a(java.lang.String str) {
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "[Thread: " + java.lang.Thread.currentThread().getName() + "][sbt] " + str, false, 4, null);
    }
}
