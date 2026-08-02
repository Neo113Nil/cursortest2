package com.plaid.internal;

/* loaded from: classes16.dex */
public final class H6 implements com.plaid.internal.G6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.N6 f5801a;
    public final kotlinx.coroutines.CoroutineScope b;
    public final java.util.concurrent.ConcurrentLinkedQueue<com.plaid.internal.I6> c;
    public volatile com.plaid.internal.L6 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;

    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5802a;

        static {
            int[] iArr = new int[com.plaid.internal.L6.values().length];
            try {
                iArr[com.plaid.internal.L6.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.L6.ERRORS_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.L6.ALL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f5802a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogControllerImpl$maybeFlushEvents$1", f = "RemoteLogControllerImpl.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5803a;
        public final /* synthetic */ com.plaid.internal.L6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.plaid.internal.L6 l6, kotlin.coroutines.Continuation<? super com.plaid.internal.H6.b> continuation) {
            super(2, continuation);
            this.c = l6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.plaid.internal.H6.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.plaid.internal.H6.this.new b(this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.concurrent.ConcurrentLinkedQueue<com.plaid.internal.I6> concurrentLinkedQueue;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5803a;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.H6 h6 = com.plaid.internal.H6.this;
                    com.plaid.internal.L6 l6 = this.c;
                    this.f5803a = 1;
                    if (h6.a(l6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!concurrentLinkedQueue.isEmpty()) {
                    com.plaid.internal.H6.this.a();
                }
                return kotlin.Unit.INSTANCE;
            } finally {
                com.plaid.internal.H6.this.e.set(false);
                if (!com.plaid.internal.H6.this.c.isEmpty()) {
                    com.plaid.internal.H6.this.a();
                }
            }
        }
    }

    public H6(com.plaid.internal.N6 n6) {
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(CoroutineScope, "");
        this.f5801a = n6;
        this.b = CoroutineScope;
        this.c = new java.util.concurrent.ConcurrentLinkedQueue<>();
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.plaid.internal.G6
    public final void a(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.plaid.internal.J6 j6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j6, "");
        a(new com.plaid.internal.I6(str, map, j6));
    }

    @Override // com.plaid.internal.G6
    public final void clear() {
        this.c.clear();
        this.d = null;
        this.e.set(false);
        com.plaid.internal.N6 n6 = this.f5801a;
        n6.e = null;
        n6.f = null;
        n6.g = null;
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("RemoteLogSender: session data cleared", true);
        com.plaid.internal.C0452a6.a.a("Remote log controller cleared", true);
    }

    public final void a(com.plaid.internal.I6 i6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i6, "");
        this.c.offer(i6);
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        java.lang.String a2 = i6.a();
        int size = this.c.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Remote log event queued: ");
        sb.append(a2);
        sb.append(", queue size: ");
        sb.append(size);
        com.plaid.internal.C0452a6.a.a(sb.toString(), true);
        a();
    }

    public final void a(com.plaid.internal.L6 l6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l6, "");
        if (this.d != l6) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.L6 l62 = this.d;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Log level threshold is being changed from ");
            sb.append(l62);
            sb.append(" to ");
            sb.append(l6);
            com.plaid.internal.C0452a6.a.e(aVar, sb.toString());
        }
        this.d = l6;
        com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Remote log level threshold set: ".concat(java.lang.String.valueOf(l6)), true);
        a();
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        this.f5801a.a(str, str2);
    }

    public final void a() {
        com.plaid.internal.L6 l6 = this.d;
        if (this.f5801a.e == null || l6 == null || this.c.isEmpty() || !this.e.compareAndSet(false, true)) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.plaid.internal.H6.b(l6, null), 3, null);
    }

    public final java.lang.Object a(com.plaid.internal.L6 l6, com.plaid.internal.H6.b bVar) {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.c.isEmpty()) {
            com.plaid.internal.I6 poll = this.c.poll();
            if (poll != null && (i = com.plaid.internal.H6.a.f5802a[l6.ordinal()]) != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else if (poll.d == com.plaid.internal.J6.ERROR) {
                }
                arrayList.add(poll);
            }
        }
        if (!arrayList.isEmpty()) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            int size = arrayList.size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Flushing ");
            sb.append(size);
            sb.append(" remote log events");
            com.plaid.internal.C0452a6.a.a(sb.toString(), true);
            java.lang.Object a2 = this.f5801a.a(arrayList, bVar);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }
}
