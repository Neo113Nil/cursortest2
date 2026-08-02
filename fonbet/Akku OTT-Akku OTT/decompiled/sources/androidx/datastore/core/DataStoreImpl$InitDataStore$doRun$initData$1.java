package androidx.datastore.core;

import androidx.datastore.core.DataStoreImpl;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", ExifInterface.GPS_DIRECTION_TRUE}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {456, 478, 568, 486}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", "api", "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, v = 1)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,560:1\n1863#2,2:561\n116#3,11:563\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n*L\n478#1:561,2\n481#1:563,11\n*E\n"})
/* loaded from: classes.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends SuspendLambda implements Function1<Continuation<? super Data<T>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, Continuation<? super DataStoreImpl$InitDataStore$doRun$initData$1> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a a;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        List list;
        Ref.BooleanRef booleanRef2;
        kotlinx.coroutines.sync.a aVar;
        Iterator<T> it;
        kotlinx.coroutines.sync.a aVar2;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Ref.ObjectRef objectRef4;
        Object obj2;
        Object version;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            a = kotlinx.coroutines.sync.d.a();
            booleanRef = new Ref.BooleanRef();
            objectRef = new Ref.ObjectRef();
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = a;
            this.L$1 = booleanRef;
            this.L$2 = objectRef;
            this.L$3 = objectRef;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
            if (obj != coroutine_suspended) {
                objectRef2 = objectRef;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    obj2 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return new Data(obj2, i, ((Number) obj).intValue());
                }
                aVar = (kotlinx.coroutines.sync.a) this.L$2;
                objectRef4 = (Ref.ObjectRef) this.L$1;
                booleanRef2 = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                try {
                    booleanRef2.element = true;
                    Unit unit = Unit.INSTANCE;
                    aVar.c(null);
                    obj2 = objectRef4.element;
                    int hashCode = obj2 == null ? obj2.hashCode() : 0;
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = hashCode;
                    this.label = 4;
                    version = coordinator.getVersion(this);
                    if (version != coroutine_suspended) {
                        i = hashCode;
                        obj = version;
                        return new Data(obj2, i, ((Number) obj).intValue());
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    aVar.c(null);
                    throw th;
                }
            }
            it = (Iterator) this.L$4;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
            objectRef3 = (Ref.ObjectRef) this.L$2;
            booleanRef3 = (Ref.BooleanRef) this.L$1;
            aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
            ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.L$0 = aVar2;
                this.L$1 = booleanRef3;
                this.L$2 = objectRef3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                    break;
                }
            }
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            aVar = aVar2;
            ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = aVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (aVar.d(this) != coroutine_suspended) {
                objectRef4 = objectRef2;
                booleanRef2.element = true;
                Unit unit2 = Unit.INSTANCE;
                aVar.c(null);
                obj2 = objectRef4.element;
                if (obj2 == null) {
                }
                InterProcessCoordinator coordinator2 = this.this$0.getCoordinator();
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = hashCode;
                this.label = 4;
                version = coordinator2.getVersion(this);
                if (version != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        objectRef = (Ref.ObjectRef) this.L$3;
        objectRef2 = (Ref.ObjectRef) this.L$2;
        booleanRef = (Ref.BooleanRef) this.L$1;
        a = (kotlinx.coroutines.sync.a) this.L$0;
        ResultKt.throwOnFailure(obj);
        objectRef.element = (T) ((Data) obj).getValue();
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$12 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(a, booleanRef, objectRef2, this.this$0);
        list = ((DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list == null) {
            booleanRef2 = booleanRef;
            aVar = a;
            ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = aVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (aVar.d(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        it = list.iterator();
        aVar2 = a;
        booleanRef3 = booleanRef;
        objectRef3 = objectRef2;
        dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$12;
        while (it.hasNext()) {
        }
        objectRef2 = objectRef3;
        booleanRef2 = booleanRef3;
        aVar = aVar2;
        ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
        this.L$0 = booleanRef2;
        this.L$1 = objectRef2;
        this.L$2 = aVar;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (aVar.d(this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Data<T>> continuation) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
