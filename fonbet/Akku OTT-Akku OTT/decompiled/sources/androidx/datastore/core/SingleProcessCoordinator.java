package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.J;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "", "filePath", "<init>", "(Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "tryLock", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "Ljava/lang/String;", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "Landroidx/datastore/core/AtomicInt;", "version", "Landroidx/datastore/core/AtomicInt;", "Lkotlinx/coroutines/flow/e;", "", "updateNotifications", "Lkotlinx/coroutines/flow/e;", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/e;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSingleProcessCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,56:1\n116#2,11:57\n32#3,8:68\n*S KotlinDebug\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n*L\n40#1:57,11\n47#1:68,8\n*E\n"})
/* loaded from: classes.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final kotlinx.coroutines.sync.a mutex;
    private final InterfaceC1060e<Unit> updateNotifications;
    private final AtomicInt version;

    public SingleProcessCoordinator(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = kotlinx.coroutines.sync.d.a();
        this.version = new AtomicInt(0);
        this.updateNotifications = new J(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public InterfaceC1060e<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.incrementAndGet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        if (r9.d(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object lock(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        SingleProcessCoordinator$lock$1 singleProcessCoordinator$lock$1;
        Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        kotlinx.coroutines.sync.a aVar2;
        Object invoke;
        try {
            if (continuation instanceof SingleProcessCoordinator$lock$1) {
                singleProcessCoordinator$lock$1 = (SingleProcessCoordinator$lock$1) continuation;
                int i2 = singleProcessCoordinator$lock$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessCoordinator$lock$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = singleProcessCoordinator$lock$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessCoordinator$lock$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = this.mutex;
                        singleProcessCoordinator$lock$1.L$0 = function1;
                        singleProcessCoordinator$lock$1.L$1 = aVar;
                        singleProcessCoordinator$lock$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (kotlinx.coroutines.sync.a) singleProcessCoordinator$lock$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                aVar2.c(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2.c(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) singleProcessCoordinator$lock$1.L$1;
                        Function1<? super Continuation<? super T>, ? extends Object> function12 = (Function1) singleProcessCoordinator$lock$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                        function1 = function12;
                    }
                    singleProcessCoordinator$lock$1.L$0 = aVar;
                    singleProcessCoordinator$lock$1.L$1 = null;
                    singleProcessCoordinator$lock$1.label = 2;
                    invoke = function1.invoke(singleProcessCoordinator$lock$1);
                    if (invoke != coroutine_suspended) {
                        kotlinx.coroutines.sync.a aVar4 = aVar;
                        obj = invoke;
                        aVar2 = aVar4;
                        aVar2.c(null);
                        return obj;
                    }
                    return coroutine_suspended;
                }
            }
            singleProcessCoordinator$lock$1.L$0 = aVar;
            singleProcessCoordinator$lock$1.L$1 = null;
            singleProcessCoordinator$lock$1.label = 2;
            invoke = function1.invoke(singleProcessCoordinator$lock$1);
            if (invoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar5 = aVar;
            th = th3;
            aVar2 = aVar5;
            aVar2.c(null);
            throw th;
        }
        singleProcessCoordinator$lock$1 = new SingleProcessCoordinator$lock$1(this, continuation);
        Object obj2 = singleProcessCoordinator$lock$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessCoordinator$lock$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object tryLock(Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        SingleProcessCoordinator$tryLock$1 singleProcessCoordinator$tryLock$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        boolean z;
        if (continuation instanceof SingleProcessCoordinator$tryLock$1) {
            singleProcessCoordinator$tryLock$1 = (SingleProcessCoordinator$tryLock$1) continuation;
            int i2 = singleProcessCoordinator$tryLock$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessCoordinator$tryLock$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessCoordinator$tryLock$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessCoordinator$tryLock$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.sync.a aVar2 = this.mutex;
                    boolean a = aVar2.a(null);
                    try {
                        Boolean boxBoolean = Boxing.boxBoolean(a);
                        singleProcessCoordinator$tryLock$1.L$0 = aVar2;
                        singleProcessCoordinator$tryLock$1.Z$0 = a;
                        singleProcessCoordinator$tryLock$1.label = 1;
                        Object invoke = function2.invoke(boxBoolean, singleProcessCoordinator$tryLock$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = aVar2;
                        obj = invoke;
                        z = a;
                    } catch (Throwable th2) {
                        aVar = aVar2;
                        th = th2;
                        z = a;
                        if (z) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = singleProcessCoordinator$tryLock$1.Z$0;
                    aVar = (kotlinx.coroutines.sync.a) singleProcessCoordinator$tryLock$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                            aVar.c(null);
                        }
                        throw th;
                    }
                }
                if (z) {
                    aVar.c(null);
                }
                return obj;
            }
        }
        singleProcessCoordinator$tryLock$1 = new SingleProcessCoordinator$tryLock$1(this, continuation);
        Object obj2 = singleProcessCoordinator$tryLock$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessCoordinator$tryLock$1.label;
        if (i != 0) {
        }
        if (z) {
        }
        return obj2;
    }
}
