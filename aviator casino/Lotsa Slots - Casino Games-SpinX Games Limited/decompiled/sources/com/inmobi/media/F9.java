package com.inmobi.media;

/* loaded from: classes5.dex */
public final class F9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f4701a;
    public final /* synthetic */ android.content.Context b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ com.inmobi.sdk.SdkInitializationListener d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F9(android.content.Context context, java.lang.String str, com.inmobi.sdk.SdkInitializationListener sdkInitializationListener, long j, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.b = context;
        this.c = str;
        this.d = sdkInitializationListener;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.F9(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return ((com.inmobi.media.F9) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object runBlocking$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4701a;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.inmobi.media.C2678pl.a(this.b);
                android.content.Context context = com.inmobi.media.Xi.f5051a;
                if (context != null) {
                    java.io.File file = new java.io.File(context.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || file.isDirectory()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
                    }
                }
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2651ol(null), 1, null);
                java.lang.String primaryAccountId = this.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryAccountId, "primaryAccountId");
                android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                if (context2 != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                    com.inmobi.media.Ka.a(context2, "coppa_store").a("im_accid", primaryAccountId, false);
                }
                android.content.Context context3 = this.b;
                this.f4701a = 1;
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2625nl(context3, null), 1, null);
                if (runBlocking$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.inmobi.media.Xi.i = 2;
            com.inmobi.sdk.InMobiSdk inMobiSdk = com.inmobi.sdk.InMobiSdk.INSTANCE;
            com.inmobi.sdk.InMobiSdk.access$provideCallback(inMobiSdk, this.d, null);
            com.inmobi.media.Xg.f5049a.getClass();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.e, null, null, new com.inmobi.media.Tg(null), 3, null);
            java.util.Map access$prepareTelemetryPayload = com.inmobi.sdk.InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.e);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("SdkInitialized", access$prepareTelemetryPayload, com.inmobi.media.EnumC2728rk.f5431a);
            com.inmobi.unifiedId.InMobiUnifiedIdService.push(com.inmobi.media.C2373e7.b);
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.inmobi.sdk.InMobiSdk.access$getTAG$p(), "access$getTAG$p(...)");
            e.getMessage();
            com.inmobi.media.Xi.c = null;
            com.inmobi.media.Xi.f5051a = null;
            com.inmobi.media.Xi.i = 3;
            com.inmobi.sdk.InMobiSdk.access$provideCallback(com.inmobi.sdk.InMobiSdk.INSTANCE, this.d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return kotlin.Unit.INSTANCE;
    }
}
