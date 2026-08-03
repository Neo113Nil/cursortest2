package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {437, com.facebook.internal.FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 546, 468}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", "api", "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>>, java.lang.Object> {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, androidx.datastore.core.DataStoreImpl<T>.InitDataStore initDataStore, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex Mutex$default;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.util.List list;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.Iterator<T> it;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        java.lang.Object obj2;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            Mutex$default = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            this.L$0 = Mutex$default;
            this.L$1 = booleanRef;
            this.L$2 = objectRef;
            this.L$3 = objectRef;
            this.label = 1;
            obj = this.this$0.readDataOrHandleCorruption(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef2 = objectRef;
        } else if (i2 == 1) {
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$3;
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
            Mutex$default = (kotlinx.coroutines.sync.Mutex) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    obj2 = this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return new androidx.datastore.core.Data(obj2, i, ((java.lang.Number) obj).intValue());
                }
                mutex = (kotlinx.coroutines.sync.Mutex) this.L$2;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                try {
                    booleanRef2.element = true;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    obj2 = objectRef4.element;
                    T t = objectRef4.element;
                    int hashCode = t != null ? t.hashCode() : 0;
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = hashCode;
                    this.label = 4;
                    obj = this.this$0.getCoordinator().getVersion(this);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = hashCode;
                    return new androidx.datastore.core.Data(obj2, i, ((java.lang.Number) obj).intValue());
                } catch (java.lang.Throwable th) {
                    mutex.unlock(null);
                    throw th;
                }
            }
            it = (java.util.Iterator) this.L$4;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
            booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) this.L$1;
            mutex2 = (kotlinx.coroutines.sync.Mutex) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) it.next();
                this.L$0 = mutex2;
                this.L$1 = booleanRef3;
                this.L$2 = objectRef3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            mutex = mutex2;
            ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = mutex;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef4 = objectRef2;
            booleanRef2.element = true;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            obj2 = objectRef4.element;
            T t2 = objectRef4.element;
            if (t2 != null) {
            }
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = hashCode;
            this.label = 4;
            obj = this.this$0.getCoordinator().getVersion(this);
            if (obj != coroutine_suspended) {
            }
        }
        objectRef.element = (T) ((androidx.datastore.core.Data) obj).getValue();
        androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$12 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1(Mutex$default, booleanRef, objectRef2, this.this$0);
        list = ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list == null) {
            booleanRef2 = booleanRef;
            mutex = Mutex$default;
            ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = mutex;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (mutex.lock(null, this) == coroutine_suspended) {
            }
        } else {
            it = list.iterator();
            mutex2 = Mutex$default;
            booleanRef3 = booleanRef;
            objectRef3 = objectRef2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$12;
            while (it.hasNext()) {
            }
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            mutex = mutex2;
            ((androidx.datastore.core.DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = mutex;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (mutex.lock(null, this) == coroutine_suspended) {
            }
        }
    }
}
