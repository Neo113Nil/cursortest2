package androidx.camera.camera2.pipe.core;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX WARN: Incorrect field signature: TT; */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1", f = "AutoCloseables.kt", i = {0}, l = {103, 107}, m = "invokeSuspend", n = {"it"}, s = {"L$2"}, v = 1)
/* loaded from: classes6.dex */
public final class AutoCloseables$useEachIndexedAsync$deferred$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.AutoCloseable getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function4<kotlinx.coroutines.CoroutineScope, java.lang.Integer, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable;
        kotlin.jvm.functions.Function4 function4;
        int i;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.AutoCloseable autoCloseable3;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputMinFrameDuration;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                autoCloseable2 = (java.lang.AutoCloseable) this.getOutputFormats;
                function4 = (kotlin.jvm.functions.Function4) this.getInputFormats;
                java.lang.AutoCloseable autoCloseable4 = (java.lang.AutoCloseable) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    autoCloseable = autoCloseable4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    autoCloseable3 = autoCloseable4;
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                autoCloseable3 = (java.lang.AutoCloseable) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                    return obj;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, th);
                throw th4;
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        autoCloseable = this.getHighSpeedVideoFpsRanges;
        function4 = this.getHighSpeedVideoFpsRangesFor;
        i = this.getHighSpeedVideoSizes;
        try {
            this.Camera2StreamConfigurationMap = autoCloseable;
            this.getInputFormats = function4;
            this.getOutputFormats = autoCloseable;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            autoCloseable2 = autoCloseable;
        } catch (java.lang.Throwable th5) {
            autoCloseable3 = autoCloseable;
            th = th5;
        }
        androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1$1$1 autoCloseables$useEachIndexedAsync$deferred$1$1$1 = new androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1$1$1(function4, i, autoCloseable2, null);
        this.Camera2StreamConfigurationMap = autoCloseable;
        this.getInputFormats = null;
        this.getOutputFormats = null;
        this.getOutputMinFrameDuration = 2;
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(autoCloseables$useEachIndexedAsync$deferred$1$1$1, this);
        if (coroutineScope != coroutine_suspended) {
            autoCloseable3 = autoCloseable;
            obj = coroutineScope;
            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
            return obj;
        }
        return coroutine_suspended;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function4<kotlinx.coroutines.CoroutineScope, java.lang.Integer, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function4 = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoSizes;
        try {
            java.lang.AutoCloseable autoCloseable2 = autoCloseable;
            kotlinx.coroutines.YieldKt.yield(null);
            java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1$1$1(function4, i, autoCloseable, null), null);
            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
            return coroutineScope;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Lkotlin/jvm/functions/Function4<-Lkotlinx/coroutines/CoroutineScope;-Ljava/lang/Integer;-TT;-Lkotlin/coroutines/Continuation<-TR;>;+Ljava/lang/Object;>;ILkotlin/coroutines/Continuation<-Landroidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1;>;)V */
    public AutoCloseables$useEachIndexedAsync$deferred$1(java.lang.AutoCloseable autoCloseable, kotlin.jvm.functions.Function4 function4, int i, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = autoCloseable;
        this.getHighSpeedVideoFpsRangesFor = function4;
        this.getHighSpeedVideoSizes = i;
    }
}
