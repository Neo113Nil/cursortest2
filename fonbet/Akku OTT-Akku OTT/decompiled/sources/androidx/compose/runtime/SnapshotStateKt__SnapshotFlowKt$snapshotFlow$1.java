package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.flow.InterfaceC1061f;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {143, 147, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 3 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 4 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n149#2,5:181\n149#2,5:186\n60#3:191\n60#3:213\n51#4,2:192\n54#4:222\n55#4:226\n256#5,2:194\n231#5,3:196\n200#5,7:199\n211#5,3:207\n214#5,2:211\n217#5,6:214\n234#5:220\n258#5:221\n1399#6:206\n1270#6:210\n1755#7,3:223\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n138#1:181,5\n162#1:186,5\n114#1:191\n127#1:213\n127#1:192,2\n127#1:222\n127#1:226\n127#1:194,2\n127#1:196,3\n127#1:199,7\n127#1:207,3\n127#1:211,2\n127#1:214,6\n127#1:220\n127#1:221\n127#1:206\n127#1:210\n127#1:223,3\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends SuspendLambda implements Function2<InterfaceC1061f<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(Function0<? extends T> function0, Continuation<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableScatterSet mutableScatterSet, Object obj) {
        if (obj instanceof StateObjectImpl) {
            ((StateObjectImpl) obj).m241recordReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(4));
        }
        mutableScatterSet.add(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(kotlinx.coroutines.channels.g gVar, Set set, Snapshot snapshot) {
        if (set instanceof ScatterSetWrapper) {
            ScatterSet<T> set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
            Object[] objArr = set$runtime.elements;
            long[] jArr = set$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).m240isReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(4))) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                for (T t : set2) {
                    if ((t instanceof StateObjectImpl) && !((StateObjectImpl) t).m240isReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(4))) {
                    }
                    gVar.c(set);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e2 A[Catch: all -> 0x0056, TryCatch #4 {all -> 0x0056, blocks: (B:12:0x00de, B:14:0x00e2, B:18:0x00ec, B:21:0x00f6, B:25:0x00fc, B:31:0x0112, B:33:0x011b, B:43:0x0137, B:44:0x013a, B:60:0x0051, B:27:0x0107, B:30:0x010f, B:38:0x0133, B:39:0x0136, B:29:0x010b), top: B:59:0x0051, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #4 {all -> 0x0056, blocks: (B:12:0x00de, B:14:0x00e2, B:18:0x00ec, B:21:0x00f6, B:25:0x00fc, B:31:0x0112, B:33:0x011b, B:43:0x0137, B:44:0x013a, B:60:0x0051, B:27:0x0107, B:30:0x010f, B:38:0x0133, B:39:0x0136, B:29:0x010b), top: B:59:0x0051, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlinx.coroutines.channels.g] */
    /* JADX WARN: Type inference failed for: r8v8, types: [kotlinx.coroutines.channels.g] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlinx.coroutines.channels.v] */
    /* JADX WARN: Type inference failed for: r9v10, types: [kotlinx.coroutines.channels.g] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ObserverHandle observerHandle;
        ?? r11;
        final MutableScatterSet mutableScatterSet;
        Function1<Object, Unit> function1;
        final kotlinx.coroutines.channels.b a;
        Object invoke;
        ObserverHandle observerHandle2;
        ?? r12;
        MutableScatterSet mutableScatterSet2;
        Function1<Object, Unit> function12;
        ?? r9;
        Object obj2;
        int i;
        Set set;
        Object e;
        boolean intersects$SnapshotStateKt__SnapshotFlowKt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    invoke = this.L$5;
                    observerHandle = (ObserverHandle) this.L$4;
                    ?? r8 = (kotlinx.coroutines.channels.g) this.L$3;
                    function1 = (Function1) this.L$2;
                    mutableScatterSet = (MutableScatterSet) this.L$1;
                    a = r8;
                    r11 = (InterfaceC1061f) this.L$0;
                } else if (i2 == 2) {
                    i = this.I$0;
                    obj2 = this.L$5;
                    observerHandle2 = (ObserverHandle) this.L$4;
                    r9 = (kotlinx.coroutines.channels.g) this.L$3;
                    function12 = (Function1) this.L$2;
                    mutableScatterSet2 = (MutableScatterSet) this.L$1;
                    InterfaceC1061f interfaceC1061f = (InterfaceC1061f) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r12 = interfaceC1061f;
                        set = (Set) obj;
                        do {
                            if (i == 0) {
                                intersects$SnapshotStateKt__SnapshotFlowKt = SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(mutableScatterSet2, set);
                                if (!intersects$SnapshotStateKt__SnapshotFlowKt) {
                                    i = 0;
                                    e = r9.e();
                                    if (e instanceof k.c) {
                                        e = null;
                                    }
                                    set = (Set) e;
                                }
                            }
                            i = 1;
                            e = r9.e();
                            if (e instanceof k.c) {
                            }
                            set = (Set) e;
                        } while (set != null);
                        if (i != 0) {
                            mutableScatterSet2.clear();
                            Snapshot takeSnapshot = Snapshot.INSTANCE.takeSnapshot(function12);
                            Function0<T> function0 = this.$block;
                            try {
                                try {
                                    invoke = function0.invoke();
                                    takeSnapshot.dispose();
                                    if (!Intrinsics.areEqual(invoke, obj2)) {
                                        this.L$0 = r12;
                                        this.L$1 = mutableScatterSet2;
                                        this.L$2 = function12;
                                        this.L$3 = r9;
                                        this.L$4 = observerHandle2;
                                        this.L$5 = invoke;
                                        this.label = 3;
                                        if (r12.emit(invoke, this) != coroutine_suspended) {
                                            observerHandle = observerHandle2;
                                            a = r9;
                                            function1 = function12;
                                            mutableScatterSet = mutableScatterSet2;
                                            r11 = r12;
                                        }
                                        return coroutine_suspended;
                                    }
                                } finally {
                                }
                                Snapshot makeCurrent = takeSnapshot.makeCurrent();
                            } finally {
                            }
                        }
                        invoke = obj2;
                        observerHandle = observerHandle2;
                        a = r9;
                        function1 = function12;
                        mutableScatterSet = mutableScatterSet2;
                        r11 = r12;
                    } catch (Throwable th) {
                        th = th;
                        observerHandle = observerHandle2;
                        observerHandle.dispose();
                        throw th;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    invoke = this.L$5;
                    observerHandle = (ObserverHandle) this.L$4;
                    ?? r82 = (kotlinx.coroutines.channels.g) this.L$3;
                    function1 = (Function1) this.L$2;
                    mutableScatterSet = (MutableScatterSet) this.L$1;
                    a = r82;
                    r11 = (InterfaceC1061f) this.L$0;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                r11 = (InterfaceC1061f) this.L$0;
                mutableScatterSet = new MutableScatterSet(0, 1, null);
                function1 = new Function1() { // from class: androidx.compose.runtime.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend$lambda$0(MutableScatterSet.this, obj3);
                        return invokeSuspend$lambda$0;
                    }
                };
                a = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
                Snapshot.Companion companion = Snapshot.INSTANCE;
                observerHandle = companion.registerApplyObserver(new Function2() { // from class: androidx.compose.runtime.L
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Unit invokeSuspend$lambda$2;
                        invokeSuspend$lambda$2 = SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend$lambda$2(kotlinx.coroutines.channels.b.this, (Set) obj3, (Snapshot) obj4);
                        return invokeSuspend$lambda$2;
                    }
                });
                Snapshot takeSnapshot2 = companion.takeSnapshot(function1);
                Function0<T> function02 = this.$block;
                try {
                    Snapshot makeCurrent2 = takeSnapshot2.makeCurrent();
                    try {
                        invoke = function02.invoke();
                        takeSnapshot2.dispose();
                        this.L$0 = r11;
                        this.L$1 = mutableScatterSet;
                        this.L$2 = function1;
                        this.L$3 = a;
                        this.L$4 = observerHandle;
                        this.L$5 = invoke;
                        this.label = 1;
                        if (r11.emit(invoke, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } finally {
                    }
                } finally {
                }
            }
            this.L$0 = r11;
            this.L$1 = mutableScatterSet;
            this.L$2 = function1;
            this.L$3 = a;
            this.L$4 = observerHandle;
            this.L$5 = invoke;
            this.I$0 = 0;
            this.label = 2;
            obj = a.d(this);
            if (obj != coroutine_suspended) {
                r12 = r11;
                mutableScatterSet2 = mutableScatterSet;
                function12 = function1;
                r9 = a;
                observerHandle2 = observerHandle;
                obj2 = invoke;
                i = 0;
                set = (Set) obj;
                do {
                    if (i == 0) {
                    }
                    i = 1;
                    e = r9.e();
                    if (e instanceof k.c) {
                    }
                    set = (Set) e;
                } while (set != null);
                if (i != 0) {
                }
                invoke = obj2;
                observerHandle = observerHandle2;
                a = r9;
                function1 = function12;
                mutableScatterSet = mutableScatterSet2;
                r11 = r12;
                this.L$0 = r11;
                this.L$1 = mutableScatterSet;
                this.L$2 = function1;
                this.L$3 = a;
                this.L$4 = observerHandle;
                this.L$5 = invoke;
                this.I$0 = 0;
                this.label = 2;
                obj = a.d(this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            observerHandle.dispose();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1061f<? super T> interfaceC1061f, Continuation<? super Unit> continuation) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(interfaceC1061f, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
