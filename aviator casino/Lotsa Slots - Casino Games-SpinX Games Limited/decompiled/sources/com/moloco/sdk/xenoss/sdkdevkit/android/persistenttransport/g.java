package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f {
    public static final int d = 8;
    public final io.ktor.client.HttpClient b;
    public final kotlinx.coroutines.CoroutineScope c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.NonPersistentHttpRequestImpl$send$1", f = "NonPersistentHttpRequest.kt", i = {0, 1}, l = {46, 50}, m = "invokeSuspend", n = {"runAttemptCount", "runAttemptCount"}, s = {"I$0", "I$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8000a;
        public int b;
        public final /* synthetic */ java.lang.String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.a> continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this.new a(this.d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:6:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int i;
            boolean z;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                i = 0;
                if (i < 5) {
                }
            } else if (i2 == 1) {
                i = this.f8000a;
                kotlin.ResultKt.throwOnFailure(obj);
                z = ((java.lang.Boolean) obj).booleanValue();
                if (z) {
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f8000a;
                kotlin.ResultKt.throwOnFailure(obj);
                i++;
                if (i < 5) {
                    boolean a2 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this.a(com.moloco.sdk.internal.android_context.b.a(null, 1, null));
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.f8002a, "Network available: " + a2 + " for non persistent request", null, false, 12, null);
                    if (a2) {
                        io.ktor.client.HttpClient httpClient = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this.b;
                        java.lang.String str = this.d;
                        this.f8000a = i;
                        this.b = 1;
                        obj = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(httpClient, str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = ((java.lang.Boolean) obj).booleanValue();
                        if (z) {
                            return kotlin.Unit.INSTANCE;
                        }
                        this.f8000a = i;
                        this.b = 2;
                        if (kotlinx.coroutines.DelayKt.delay(10000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i++;
                        if (i < 5) {
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        z = false;
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.NonPersistentHttpRequestImpl$sendPost$1", f = "NonPersistentHttpRequest.kt", i = {0, 1}, l = {61, 65}, m = "invokeSuspend", n = {"runAttemptCount", "runAttemptCount"}, s = {"I$0", "I$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8001a;
        public int b;
        public final /* synthetic */ java.lang.String d;
        public final /* synthetic */ byte[] e;
        public final /* synthetic */ io.ktor.http.ContentType f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, byte[] bArr, io.ktor.http.ContentType contentType, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.b> continuation) {
            super(2, continuation);
            this.d = str;
            this.e = bArr;
            this.f = contentType;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this.new b(this.d, this.e, this.f, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008a -> B:6:0x008d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int i;
            boolean z;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                i = 0;
                if (i < 5) {
                }
            } else if (i2 == 1) {
                i = this.f8001a;
                kotlin.ResultKt.throwOnFailure(obj);
                z = ((java.lang.Boolean) obj).booleanValue();
                if (z) {
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f8001a;
                kotlin.ResultKt.throwOnFailure(obj);
                i++;
                if (i < 5) {
                    boolean a2 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this.a(com.moloco.sdk.internal.android_context.b.a(null, 1, null));
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.f8002a, "Network available: " + a2 + " for non persistent request", null, false, 12, null);
                    if (a2) {
                        io.ktor.client.HttpClient httpClient = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.this.b;
                        java.lang.String str = this.d;
                        byte[] bArr = this.e;
                        io.ktor.http.ContentType contentType = this.f;
                        this.f8001a = i;
                        this.b = 1;
                        obj = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e.a(httpClient, str, bArr, contentType, null, this, 8, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = ((java.lang.Boolean) obj).booleanValue();
                        if (z) {
                            return kotlin.Unit.INSTANCE;
                        }
                        this.f8001a = i;
                        this.b = 2;
                        if (kotlinx.coroutines.DelayKt.delay(10000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i++;
                        if (i < 5) {
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        z = false;
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    public g(io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.b = httpClient;
        this.c = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getDefault());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.a(url, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d
    public void a(java.lang.String url, byte[] body, io.ktor.http.ContentType contentType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g.b(url, body, contentType, null), 3, null);
    }

    public final boolean a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
    }
}
