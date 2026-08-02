package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J9\u0010\u0007\u001a\u00028\u00002'\u0010\u0006\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements androidx.content.core.InitializerApi<T> {
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoFpsRangesFor;

    DataStoreImpl$InitDataStore$doRun$initData$1$api$1(kotlinx.coroutines.sync.Mutex mutex, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.jvm.internal.Ref.ObjectRef<T> objectRef, androidx.content.core.DataStoreImpl<T> dataStoreImpl) {
        this.getHighSpeedVideoFpsRanges = mutex;
        this.getHighSpeedVideoFpsRangesFor = booleanRef;
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
        this.Camera2StreamConfigurationMap = dataStoreImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:28:0x0053, B:29:0x00b0, B:31:0x00b8), top: B:27:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099 A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #0 {all -> 0x00e6, blocks: (B:41:0x0095, B:43:0x0099, B:46:0x00da, B:47:0x00e5), top: B:40:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #0 {all -> 0x00e6, blocks: (B:41:0x0095, B:43:0x0099, B:46:0x00da, B:47:0x00e5), top: B:40:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.content.core.InitializerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateData(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef<T> objectRef;
        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function22;
        androidx.content.core.DataStoreImpl dataStoreImpl;
        kotlinx.coroutines.sync.Mutex mutex2;
        androidx.content.core.DataStoreImpl dataStoreImpl2;
        kotlinx.coroutines.sync.Mutex mutex3;
        T t;
        kotlin.jvm.internal.Ref.ObjectRef<T> objectRef2;
        try {
            if (continuation instanceof androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuation;
                if ((dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = this.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.internal.Ref.ObjectRef<T> objectRef3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.content.core.DataStoreImpl dataStoreImpl3 = this.Camera2StreamConfigurationMap;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoSizes = function2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRangesFor = booleanRef2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRanges = objectRef3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Camera2StreamConfigurationMap = dataStoreImpl3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputFormats = 1;
                        if (mutex.lock(null, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                            booleanRef = booleanRef2;
                            objectRef = objectRef3;
                            function22 = function2;
                            dataStoreImpl = dataStoreImpl3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t = (T) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRangesFor;
                            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighResolutionOutputSizeshNQ4ISI;
                            mutex3 = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoSizes;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                objectRef2.element = t;
                                objectRef = objectRef2;
                                T t2 = objectRef.element;
                                mutex3.unlock(null);
                                return t2;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                mutex = mutex3;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        androidx.content.core.DataStoreImpl dataStoreImpl4 = (androidx.content.core.DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRangesFor;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighResolutionOutputSizeshNQ4ISI;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            dataStoreImpl2 = dataStoreImpl4;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, objectRef.element)) {
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoSizes = mutex2;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighResolutionOutputSizeshNQ4ISI = objectRef;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRangesFor = obj;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputFormats = 3;
                                if (dataStoreImpl2.writeData$datastore_core(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                                    t = (T) obj;
                                    objectRef2 = objectRef;
                                    mutex3 = mutex2;
                                    objectRef2.element = t;
                                    objectRef = objectRef2;
                                    T t22 = objectRef.element;
                                    mutex3.unlock(null);
                                    return t22;
                                }
                                return coroutine_suspended;
                            }
                            mutex3 = mutex2;
                            T t222 = objectRef.element;
                            mutex3.unlock(null);
                            return t222;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            mutex = mutex2;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    androidx.content.core.DataStoreImpl dataStoreImpl5 = (androidx.content.core.DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Camera2StreamConfigurationMap;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRanges;
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRangesFor;
                    kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighResolutionOutputSizeshNQ4ISI;
                    function22 = (kotlin.jvm.functions.Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex4;
                    dataStoreImpl = dataStoreImpl5;
                    if (!booleanRef.element) {
                        throw new java.lang.IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.".toString());
                    }
                    T t3 = objectRef.element;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoSizes = mutex;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighResolutionOutputSizeshNQ4ISI = objectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRangesFor = dataStoreImpl;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getHighSpeedVideoFpsRanges = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.Camera2StreamConfigurationMap = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputFormats = 2;
                    java.lang.Object invoke = function22.invoke(t3, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
                    if (invoke != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = invoke;
                        dataStoreImpl2 = dataStoreImpl;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, objectRef.element)) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (!booleanRef.element) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
        java.lang.Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.getOutputFormats;
        if (i != 0) {
        }
    }
}
