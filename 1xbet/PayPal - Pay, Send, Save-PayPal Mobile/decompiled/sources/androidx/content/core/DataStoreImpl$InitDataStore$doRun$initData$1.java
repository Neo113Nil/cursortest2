package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {456, 478, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, 486}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.content.core.Data<T>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T>.InitDataStore getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        java.util.List list;
        java.util.Iterator<T> it;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        java.lang.Object obj2;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputFormats;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.sync.Mutex Mutex$default = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
            kotlin.jvm.internal.Ref.BooleanRef booleanRef3 = new kotlin.jvm.internal.Ref.BooleanRef();
            kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
            this.getHighSpeedVideoFpsRangesFor = Mutex$default;
            this.Camera2StreamConfigurationMap = booleanRef3;
            this.getHighSpeedVideoSizes = objectRef4;
            this.getHighResolutionOutputSizeshNQ4ISI = objectRef4;
            this.getInputFormats = 1;
            java.lang.Object highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(true, this);
            if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                mutex = Mutex$default;
                booleanRef = booleanRef3;
                objectRef = objectRef4;
                obj = highSpeedVideoFpsRangesFor;
                objectRef2 = objectRef;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.getHighSpeedVideoFpsRanges;
                    obj2 = this.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return new androidx.content.core.Data(obj2, i, ((java.lang.Number) obj).intValue());
                }
                mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoSizes;
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
                booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                try {
                    booleanRef2.element = true;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex2.unlock(null);
                    obj2 = objectRef3.element;
                    T t = objectRef3.element;
                    int hashCode = t != null ? t.hashCode() : 0;
                    this.getHighSpeedVideoFpsRangesFor = obj2;
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = hashCode;
                    this.getInputFormats = 4;
                    obj = this.getOutputMinFrameDuration.getHighSpeedVideoSizes().getVersion(this);
                    if (obj != coroutine_suspended) {
                        i = hashCode;
                        return new androidx.content.core.Data(obj2, i, ((java.lang.Number) obj).intValue());
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th) {
                    mutex2.unlock(null);
                    throw th;
                }
            }
            it = (java.util.Iterator) this.getHighSpeedVideoSizesFor;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.getHighResolutionOutputSizeshNQ4ISI;
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.Camera2StreamConfigurationMap;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) it.next();
                this.getHighSpeedVideoFpsRangesFor = mutex;
                this.Camera2StreamConfigurationMap = booleanRef;
                this.getHighSpeedVideoSizes = objectRef2;
                this.getHighResolutionOutputSizeshNQ4ISI = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.getHighSpeedVideoSizesFor = it;
                this.getInputFormats = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                    break;
                }
            }
            booleanRef2 = booleanRef;
            mutex2 = mutex;
            ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.getInputSizeshNQ4ISI).getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = booleanRef2;
            this.Camera2StreamConfigurationMap = objectRef2;
            this.getHighSpeedVideoSizes = mutex2;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getInputFormats = 3;
            if (mutex2.lock(null, this) != coroutine_suspended) {
                objectRef3 = objectRef2;
                booleanRef2.element = true;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                mutex2.unlock(null);
                obj2 = objectRef3.element;
                T t2 = objectRef3.element;
                if (t2 != null) {
                }
                this.getHighSpeedVideoFpsRangesFor = obj2;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = hashCode;
                this.getInputFormats = 4;
                obj = this.getOutputMinFrameDuration.getHighSpeedVideoSizes().getVersion(this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef4 = (kotlin.jvm.internal.Ref.BooleanRef) this.Camera2StreamConfigurationMap;
        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        mutex = mutex3;
        booleanRef = booleanRef4;
        objectRef2 = objectRef5;
        objectRef.element = (T) ((androidx.content.core.Data) obj).getValue();
        dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = new androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1(mutex, booleanRef, objectRef2, this.getOutputMinFrameDuration);
        list = ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.getInputSizeshNQ4ISI).getHighSpeedVideoFpsRanges;
        if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
            }
        }
        booleanRef2 = booleanRef;
        mutex2 = mutex;
        ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.getInputSizeshNQ4ISI).getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = booleanRef2;
        this.Camera2StreamConfigurationMap = objectRef2;
        this.getHighSpeedVideoSizes = mutex2;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputFormats = 3;
        if (mutex2.lock(null, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return ((androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1(this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, androidx.content.core.DataStoreImpl<T>.InitDataStore initDataStore, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$InitDataStore$doRun$initData$1> continuation) {
        super(1, continuation);
        this.getOutputMinFrameDuration = dataStoreImpl;
        this.getInputSizeshNQ4ISI = initDataStore;
    }
}
