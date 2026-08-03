package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class v implements com.moloco.sdk.internal.services.u {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7319a;
    public final java.lang.String b;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.ConnectivityServiceImpl", f = "ConnectivityService.kt", i = {}, l = {40}, m = "waitForNetwork", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7320a;
        public int c;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.v.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7320a = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.v.this.a(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.ConnectivityServiceImpl$waitForNetwork$hasConnectivity$1", f = "ConnectivityService.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7321a;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.v.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.moloco.sdk.internal.services.v.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.v.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7321a;
            if (i != 0 && i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            while (!com.moloco.sdk.internal.services.v.this.a()) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.v.this.b, "waiting because of no network connection", null, false, 12, null);
                this.f7321a = 1;
                if (kotlinx.coroutines.DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
    }

    public v(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7319a = context;
        this.b = "ConnectivityServiceImpl";
    }

    @Override // com.moloco.sdk.internal.services.u
    public boolean b() {
        try {
            return androidx.core.net.ConnectivityManagerCompat.isActiveNetworkMetered(a(this.f7319a));
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "isNetworkMetered", e.toString(), e, false, 8, null);
            return false;
        }
    }

    public final android.content.Context c() {
        return this.f7319a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.internal.services.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.moloco.sdk.internal.services.v.a aVar;
        int i;
        if (continuation instanceof com.moloco.sdk.internal.services.v.a) {
            aVar = (com.moloco.sdk.internal.services.v.a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.f7320a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.services.v.b bVar = new com.moloco.sdk.internal.services.v.b(null);
                    aVar.c = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(j, bVar, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        aVar = new com.moloco.sdk.internal.services.v.a(continuation);
        java.lang.Object obj2 = aVar.f7320a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        if (i != 0) {
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    @Override // com.moloco.sdk.internal.services.u
    public boolean a() {
        android.net.NetworkCapabilities networkCapabilities;
        java.lang.Object systemService = this.f7319a.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public final android.net.ConnectivityManager a(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (android.net.ConnectivityManager) systemService;
    }
}
