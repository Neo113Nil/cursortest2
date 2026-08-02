package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$logMessage$1", f = "PlaidCrashReporter.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0451a5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5995a;
    public final /* synthetic */ com.plaid.internal.C0471c5 b;
    public final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0451a5(com.plaid.internal.C0471c5 c0471c5, java.lang.String str, kotlin.coroutines.Continuation<? super com.plaid.internal.C0451a5> continuation) {
        super(2, continuation);
        this.b = c0471c5;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0451a5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0451a5(this.b, this.c, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List subList;
        com.plaid.internal.core.crashreporting.internal.models.Crash a2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5995a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.internal.C0471c5 c0471c5 = this.b;
            com.plaid.internal.X6 x6 = c0471c5.f6008a;
            com.plaid.internal.C0456b0 c0456b0 = c0471c5.b;
            java.lang.String str = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.util.UUID randomUUID = java.util.UUID.randomUUID();
            c0456b0.f = randomUUID;
            kotlin.jvm.internal.Intrinsics.checkNotNull(randomUUID);
            java.lang.String obj2 = randomUUID.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(obj2, "-", "", false, 4, (java.lang.Object) null);
            java.lang.String format = ((java.text.SimpleDateFormat) c0456b0.g.getValue()).format(new java.util.Date());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel crashLogLevel = com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.WARNING;
            java.lang.String release = c0456b0.b.getRelease();
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "com.plaid.internal.core.networking.models.NetworkException", false, 2, (java.lang.Object) null)) {
                try {
                    subList = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE}, false, 0, 6, (java.lang.Object) null).subList(0, 1);
                } catch (java.lang.Throwable unused) {
                }
                java.lang.String a3 = c0456b0.c.a();
                com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface debugMetaInterface = new com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface();
                debugMetaInterface.getDebugImages().add(new com.plaid.internal.core.crashreporting.internal.models.DebugImage("5641b9b3-9d23-51b6-bf80-f3d7843a9b55", null, 2, null));
                a2 = c0456b0.a(new com.plaid.internal.core.crashreporting.internal.models.Crash(replace$default, str, format, crashLogLevel, null, null, null, null, null, null, null, release, null, a3, null, subList, null, null, debugMetaInterface, 219120, null));
                this.f5995a = 1;
                if (x6.a(a2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            subList = null;
            java.lang.String a32 = c0456b0.c.a();
            com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface debugMetaInterface2 = new com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface();
            debugMetaInterface2.getDebugImages().add(new com.plaid.internal.core.crashreporting.internal.models.DebugImage("5641b9b3-9d23-51b6-bf80-f3d7843a9b55", null, 2, null));
            a2 = c0456b0.a(new com.plaid.internal.core.crashreporting.internal.models.Crash(replace$default, str, format, crashLogLevel, null, null, null, null, null, null, null, release, null, a32, null, subList, null, null, debugMetaInterface2, 219120, null));
            this.f5995a = 1;
            if (x6.a(a2, this) == coroutine_suspended) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
