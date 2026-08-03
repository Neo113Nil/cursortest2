package androidx.compose.foundation;

/* compiled from: AndroidExternalSurface.android.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes.dex */
final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ android.view.Surface $surface;
    final /* synthetic */ int $width;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.BaseAndroidExternalSurfaceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(androidx.compose.foundation.BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, android.view.Surface surface, int i, int i2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = baseAndroidExternalSurfaceState;
        this.$surface = surface;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this.this$0, this.$surface, this.$width, this.$height, continuation);
        baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1.L$0 = obj;
        return baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.Job job;
        kotlin.jvm.functions.Function5 function5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            job = this.this$0.job;
            if (job != null) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (kotlinx.coroutines.JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(this.this$0, coroutineScope);
        function5 = this.this$0.onSurface;
        if (function5 != null) {
            android.view.Surface surface = this.$surface;
            java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$width);
            java.lang.Integer boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.$height);
            this.L$0 = null;
            this.label = 2;
            if (function5.invoke(baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1, surface, boxInt, boxInt2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
