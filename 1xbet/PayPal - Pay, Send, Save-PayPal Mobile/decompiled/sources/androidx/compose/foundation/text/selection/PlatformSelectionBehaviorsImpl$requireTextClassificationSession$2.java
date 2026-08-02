package androidx.compose.foundation.text.selection;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", i = {0, 1}, l = {369, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 282}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<android.view.textclassifier.TextClassifier, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        kotlinx.coroutines.sync.Mutex mutex2;
        android.view.textclassifier.TextClassifier textClassifier;
        kotlinx.coroutines.sync.Mutex mutex3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                platformSelectionBehaviorsImpl = this.getHighSpeedVideoFpsRanges;
                this.getHighResolutionOutputSizeshNQ4ISI = mutex;
                this.getHighSpeedVideoFpsRangesFor = platformSelectionBehaviorsImpl;
                this.Camera2StreamConfigurationMap = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    mutex2 = mutex;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    textClassifier = (android.view.textclassifier.TextClassifier) obj;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.Camera2StreamConfigurationMap = 3;
                    java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(200L, new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2.AnonymousClass1(textClassifier, this.getHighSpeedVideoSizes, null), this);
                    return withTimeoutOrNull != coroutine_suspended ? coroutine_suspended : withTimeoutOrNull;
                } catch (java.lang.Throwable th) {
                    th = th;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            platformSelectionBehaviorsImpl = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl) this.getHighSpeedVideoFpsRangesFor;
            mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            textClassifier = platformSelectionBehaviorsImpl.getInputSizeshNQ4ISI;
            if (textClassifier == null || textClassifier.isDestroyed()) {
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(platformSelectionBehaviorsImpl, null);
                this.getHighResolutionOutputSizeshNQ4ISI = mutex2;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.Camera2StreamConfigurationMap = 2;
                obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(300L, platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1, this);
                if (obj != coroutine_suspended) {
                    mutex3 = mutex2;
                    textClassifier = (android.view.textclassifier.TextClassifier) obj;
                    mutex2 = mutex3;
                }
            }
            mutex2.unlock(null);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = 3;
            java.lang.Object withTimeoutOrNull2 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(200L, new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2.AnonymousClass1(textClassifier, this.getHighSpeedVideoSizes, null), this);
            if (withTimeoutOrNull2 != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex2.unlock(null);
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function2<android.view.textclassifier.TextClassifier, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.view.textclassifier.TextClassifier getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.textclassifier.TextClassifier textClassifier = this.getHighSpeedVideoSizes;
            if (textClassifier == null) {
                return null;
            }
            kotlin.jvm.functions.Function2<android.view.textclassifier.TextClassifier, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object invoke = function2.invoke(textClassifier, this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
            return ((androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2.AnonymousClass1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(android.view.textclassifier.TextClassifier textClassifier, kotlin.jvm.functions.Function2<? super android.view.textclassifier.TextClassifier, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = textClassifier;
            this.getHighSpeedVideoFpsRangesFor = function2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, kotlin.jvm.functions.Function2<? super android.view.textclassifier.TextClassifier, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = platformSelectionBehaviorsImpl;
        this.getHighSpeedVideoSizes = function2;
    }
}
