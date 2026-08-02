package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.InterfaceC1115v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitComplete", "runIfNeeded", "Lkotlinx/coroutines/sync/a;", "runMutex", "Lkotlinx/coroutines/sync/a;", "Lkotlinx/coroutines/v;", "didRun", "Lkotlinx/coroutines/v;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,560:1\n116#2,11:561\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n515#1:561,11\n*E\n"})
/* loaded from: classes.dex */
public abstract class RunOnce {
    private final kotlinx.coroutines.sync.a runMutex = kotlinx.coroutines.sync.d.a();
    private final InterfaceC1115v<Unit> didRun = C1119x.a();

    public final Object awaitComplete(Continuation<? super Unit> continuation) {
        Object await = this.didRun.await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    public abstract Object doRun(Continuation<? super Unit> continuation);

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005c, code lost:
    
        if (r8.d(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:25:0x005f, B:27:0x0067, B:30:0x0072), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x006d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:25:0x005f, B:27:0x0067, B:30:0x0072), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runIfNeeded(Continuation<? super Unit> continuation) {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        Throwable th;
        try {
            if (continuation instanceof RunOnce$runIfNeeded$1) {
                runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) continuation;
                int i2 = runOnce$runIfNeeded$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    runOnce$runIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = runOnce$runIfNeeded$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = runOnce$runIfNeeded$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.didRun.isCompleted()) {
                            return Unit.INSTANCE;
                        }
                        aVar = this.runMutex;
                        runOnce$runIfNeeded$1.L$0 = aVar;
                        runOnce$runIfNeeded$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (kotlinx.coroutines.sync.a) runOnce$runIfNeeded$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                InterfaceC1115v<Unit> interfaceC1115v = this.didRun;
                                Unit unit = Unit.INSTANCE;
                                interfaceC1115v.t(unit);
                                aVar2.c(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2.c(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) runOnce$runIfNeeded$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                    }
                    if (!this.didRun.isCompleted()) {
                        Unit unit2 = Unit.INSTANCE;
                        aVar.c(null);
                        return unit2;
                    }
                    runOnce$runIfNeeded$1.L$0 = aVar;
                    runOnce$runIfNeeded$1.label = 2;
                    if (doRun(runOnce$runIfNeeded$1) != coroutine_suspended) {
                        aVar2 = aVar;
                        InterfaceC1115v<Unit> interfaceC1115v2 = this.didRun;
                        Unit unit3 = Unit.INSTANCE;
                        interfaceC1115v2.t(unit3);
                        aVar2.c(null);
                        return unit3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!this.didRun.isCompleted()) {
            }
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.c(null);
            throw th;
        }
        runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, continuation);
        Object obj2 = runOnce$runIfNeeded$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runOnce$runIfNeeded$1.label;
        if (i != 0) {
        }
    }
}
