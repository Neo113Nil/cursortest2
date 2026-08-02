package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/K;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "", "<anonymous>", "(Lkotlinx/coroutines/K;Landroidx/compose/runtime/MonotonicFrameClock;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {587, 598}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1894:1\n33#2:1895\n33#2:1976\n33#2:1990\n33#2:2006\n33#2:2115\n34#3,5:1896\n34#3,5:1977\n34#3,5:1999\n34#3,5:2007\n34#3,5:2051\n34#3,5:2056\n231#4,3:1901\n200#4,7:1904\n211#4,3:1912\n214#4,9:1916\n234#4:1925\n231#4,3:1926\n200#4,7:1929\n211#4,3:1937\n214#4,9:1941\n234#4:1950\n231#4,3:1951\n200#4,7:1954\n211#4,3:1962\n214#4,9:1966\n234#4:1975\n231#4,3:2063\n200#4,7:2066\n211#4,3:2074\n214#4,9:2078\n234#4:2087\n231#4,3:2088\n200#4,7:2091\n211#4,3:2099\n214#4,9:2103\n234#4:2112\n1399#5:1911\n1270#5:1915\n1399#5:1936\n1270#5:1940\n1399#5:1961\n1270#5:1965\n1399#5:2073\n1270#5:2077\n1399#5:2098\n1270#5:2102\n45#6,5:1982\n45#6,3:1987\n49#6:2004\n424#7,8:1991\n519#7:2005\n742#7,15:2012\n813#8,21:2027\n835#8:2062\n836#8,2:2113\n149#9,3:2048\n153#9:2061\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n549#1:1895\n580#1:1976\n616#1:1990\n647#1:2006\n746#1:2115\n553#1:1896,5\n581#1:1977,5\n626#1:1999,5\n648#1:2007,5\n701#1:2051,5\n704#1:2056,5\n559#1:1901,3\n559#1:1904,7\n559#1:1912,3\n559#1:1916,9\n559#1:1925\n565#1:1926,3\n565#1:1929,7\n565#1:1937,3\n565#1:1941,9\n565#1:1950\n570#1:1951,3\n570#1:1954,7\n570#1:1962,3\n570#1:1966,9\n570#1:1975\n719#1:2063,3\n719#1:2066,7\n719#1:2074,3\n719#1:2078,9\n719#1:2087\n733#1:2088,3\n733#1:2091,7\n733#1:2099,3\n733#1:2103,9\n733#1:2112\n559#1:1911\n559#1:1915\n565#1:1936\n565#1:1940\n570#1:1961\n570#1:1965\n719#1:2073\n719#1:2077\n733#1:2098\n733#1:2102\n602#1:1982,5\n612#1:1987,3\n612#1:2004\n617#1:1991,8\n645#1:2005\n661#1:2012,15\n691#1:2027,21\n691#1:2062\n691#1:2113,2\n691#1:2048,3\n691#1:2061\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<kotlinx.coroutines.K, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    private static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, MutableScatterSet<ControlledComposition> mutableScatterSet, MutableScatterSet<ControlledComposition> mutableScatterSet2, MutableScatterSet<Object> mutableScatterSet3, MutableScatterSet<ControlledComposition> mutableScatterSet4) {
        char c;
        long j;
        long j2;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    ControlledComposition controlledComposition = list3.get(i);
                    controlledComposition.abandonChanges();
                    recomposer.recordFailedCompositionLocked(controlledComposition);
                }
                list3.clear();
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i2 << 3) + i4];
                                    controlledComposition2.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                mutableScatterSet.clear();
                Object[] objArr2 = mutableScatterSet2.elements;
                long[] jArr2 = mutableScatterSet2.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((ControlledComposition) objArr2[(i5 << 3) + i7]).changesApplied();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                mutableScatterSet2.clear();
                mutableScatterSet3.clear();
                Object[] objArr3 = mutableScatterSet4.elements;
                long[] jArr3 = mutableScatterSet4.metadata;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i8 << 3) + i10];
                                    controlledComposition3.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                mutableScatterSet4.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((MovableContentStateReference) list2.get(i));
                }
                list3 = recomposer.movableContentAwaitingInsert;
                list3.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0342 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit invokeSuspend$lambda$22(Recomposer recomposer, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, List list, List list2, MutableScatterSet mutableScatterSet3, List list3, MutableScatterSet mutableScatterSet4, Set set, long j) {
        boolean hasBroadcastFrameClockAwaiters;
        boolean z;
        List performInsertValues;
        ControlledComposition performRecompose;
        char c;
        long j2;
        long j3;
        BroadcastFrameClock broadcastFrameClock;
        Recomposer recomposer2 = recomposer;
        List list4 = list;
        List list5 = list3;
        MutableScatterSet mutableScatterSet5 = mutableScatterSet4;
        hasBroadcastFrameClockAwaiters = recomposer2.getHasBroadcastFrameClockAwaiters();
        if (hasBroadcastFrameClockAwaiters) {
            Trace trace = Trace.INSTANCE;
            Object beginSection = trace.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock = recomposer2.broadcastFrameClock;
                broadcastFrameClock.sendFrame(j);
                Snapshot.INSTANCE.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                trace.endSection(beginSection);
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
        Object beginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer2.recordComposerModifications();
            synchronized (recomposer2.stateLock) {
                try {
                    MutableVector mutableVector = recomposer2.compositionInvalidations;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    z = 0;
                    for (int i = 0; i < size; i++) {
                        list4.add((ControlledComposition) objArr[i]);
                    }
                    recomposer2.compositionInvalidations.clear();
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                }
            }
            mutableScatterSet.clear();
            mutableScatterSet2.clear();
        } catch (Throwable th) {
            throw th;
        }
        while (true) {
            if (list4.isEmpty() && list2.isEmpty()) {
                break;
            }
            List list6 = list4;
            List list7 = list5;
            try {
                int size2 = list6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ControlledComposition controlledComposition = (ControlledComposition) list6.get(i2);
                    performRecompose = recomposer2.performRecompose(controlledComposition, mutableScatterSet);
                    if (performRecompose != null) {
                        list7.add(performRecompose);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    mutableScatterSet2.add(controlledComposition);
                }
                list6.clear();
                if (!mutableScatterSet.isNotEmpty() && recomposer2.compositionInvalidations.getSize() == 0) {
                    if (list6.isEmpty()) {
                        recomposer2 = recomposer;
                        list4 = list;
                        list5 = list3;
                        mutableScatterSet5 = mutableScatterSet4;
                        z = 0;
                    } else {
                        try {
                            invokeSuspend$fillToInsert(list2, recomposer2);
                            while (!list2.isEmpty()) {
                                performInsertValues = recomposer2.performInsertValues(list2, mutableScatterSet);
                                mutableScatterSet3.plusAssign((Iterable) performInsertValues);
                                invokeSuspend$fillToInsert(list2, recomposer2);
                            }
                            list4 = list6;
                            list5 = list7;
                            z = 0;
                            mutableScatterSet5 = mutableScatterSet4;
                        } catch (Throwable th2) {
                            Recomposer.processCompositionError$default(recomposer2, th2, null, true, 2, null);
                            invokeSuspend$clearRecompositionState(recomposer, list6, list2, list7, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                            return Unit.INSTANCE;
                        }
                    }
                }
                synchronized (recomposer2.stateLock) {
                    try {
                        List knownCompositionsLocked = recomposer2.knownCompositionsLocked();
                        int size3 = knownCompositionsLocked.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositionsLocked.get(i3);
                            if (!mutableScatterSet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set)) {
                                list6.add(controlledComposition2);
                            }
                        }
                        MutableVector mutableVector2 = recomposer2.compositionInvalidations;
                        int size4 = mutableVector2.getSize();
                        int i4 = 0;
                        for (int i5 = 0; i5 < size4; i5++) {
                            ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector2.content[i5];
                            if (!mutableScatterSet2.contains(controlledComposition3) && !list6.contains(controlledComposition3)) {
                                list6.add(controlledComposition3);
                                i4++;
                            } else if (i4 > 0) {
                                Object[] objArr2 = mutableVector2.content;
                                objArr2[i5 - i4] = objArr2[i5];
                            }
                        }
                        int i6 = size4 - i4;
                        ArraysKt.fill(mutableVector2.content, (Object) null, i6, size4);
                        mutableVector2.setSize(i6);
                        Unit unit4 = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (list6.isEmpty()) {
                }
            } catch (Throwable th3) {
                try {
                    Recomposer.processCompositionError$default(recomposer, th3, null, true, 2, null);
                    invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                    return Unit.INSTANCE;
                } finally {
                    list.clear();
                }
            }
            throw th;
        }
        Snapshot current = Snapshot.INSTANCE.getCurrent();
        Snapshot transparentObserverMutableSnapshot = current instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false) : new TransparentObserverSnapshot(current, null, true, z);
        try {
            Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
            try {
                if (!list5.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                    try {
                        int size5 = list5.size();
                        for (int i7 = z; i7 < size5; i7++) {
                            mutableScatterSet5.add((ControlledComposition) list5.get(i7));
                        }
                        int size6 = list5.size();
                        for (int i8 = z; i8 < size6; i8++) {
                            ((ControlledComposition) list5.get(i8)).applyChanges();
                        }
                        list5.clear();
                    } catch (Throwable th4) {
                        try {
                            Recomposer.processCompositionError$default(recomposer2, th4, null, false, 6, null);
                            invokeSuspend$clearRecompositionState(recomposer, list4, list2, list5, mutableScatterSet3, mutableScatterSet5, mutableScatterSet, mutableScatterSet2);
                            Unit unit5 = Unit.INSTANCE;
                            transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                            return unit5;
                        } finally {
                            list3.clear();
                        }
                    }
                }
                if (mutableScatterSet3.isNotEmpty()) {
                    try {
                        mutableScatterSet5.plusAssign((ScatterSet) mutableScatterSet3);
                        Object[] objArr3 = mutableScatterSet3.elements;
                        long[] jArr = mutableScatterSet3.metadata;
                        c = 7;
                        int length = jArr.length - 2;
                        j2 = 128;
                        int i9 = z;
                        if (length >= 0) {
                            while (true) {
                                long j4 = jArr[i9];
                                j3 = 255;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((j4 & 255) < 128) {
                                            ((ControlledComposition) objArr3[(i9 << 3) + i11]).applyLateChanges();
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i10 != 8) {
                                        break;
                                    }
                                }
                                if (i9 == length) {
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            j3 = 255;
                        }
                    } catch (Throwable th5) {
                        try {
                            Recomposer.processCompositionError$default(recomposer, th5, null, false, 6, null);
                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet5, mutableScatterSet, mutableScatterSet2);
                            Unit unit6 = Unit.INSTANCE;
                            transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                            return unit6;
                        } finally {
                            mutableScatterSet3.clear();
                        }
                    }
                } else {
                    c = 7;
                    j2 = 128;
                    j3 = 255;
                }
                if (mutableScatterSet5.isNotEmpty()) {
                    try {
                        Object[] objArr4 = mutableScatterSet5.elements;
                        long[] jArr2 = mutableScatterSet5.metadata;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j5 = jArr2[i12];
                                if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j5 & j3) < j2) {
                                            ((ControlledComposition) objArr4[(i12 << 3) + i14]).changesApplied();
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i13 != 8) {
                                        break;
                                    }
                                }
                                if (i12 == length2) {
                                    break;
                                }
                                i12++;
                            }
                        }
                        mutableScatterSet5.clear();
                    } catch (Throwable th6) {
                        try {
                            Recomposer.processCompositionError$default(recomposer, th6, null, false, 6, null);
                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet5, mutableScatterSet, mutableScatterSet2);
                            Unit unit7 = Unit.INSTANCE;
                            transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                            return unit7;
                        } finally {
                            mutableScatterSet4.clear();
                        }
                    }
                }
                Unit unit8 = Unit.INSTANCE;
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                transparentObserverMutableSnapshot.dispose();
                synchronized (recomposer.stateLock) {
                    recomposer.deriveStateLocked();
                }
                Snapshot.INSTANCE.notifyObjectsInitialized();
                mutableScatterSet2.clear();
                mutableScatterSet.clear();
                recomposer.compositionsRemoved = null;
                Trace.INSTANCE.endSection(beginSection2);
                return Unit.INSTANCE;
            } catch (Throwable th7) {
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                throw th7;
            }
        } finally {
            transparentObserverMutableSnapshot.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0101 -> B:6:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x010f -> B:7:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        MutableScatterSet mutableScatterSetOf;
        MutableScatterSet mutableScatterSetOf2;
        List list;
        Set set;
        final List list2;
        MutableScatterSet mutableScatterSet;
        List list3;
        MutableScatterSet mutableScatterSet2;
        final List list4;
        final MutableScatterSet mutableScatterSet3;
        final List list5;
        final MutableScatterSet mutableScatterSet4;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            mutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            MutableScatterSet mutableScatterSetOf3 = ScatterSetKt.mutableScatterSetOf();
            MutableScatterSet mutableScatterSet5 = new MutableScatterSet(0, 1, null);
            Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet5);
            mutableScatterSetOf2 = ScatterSetKt.mutableScatterSetOf();
            list = arrayList;
            set = wrapIntoSet;
            list2 = arrayList2;
            mutableScatterSet = mutableScatterSet5;
            list3 = arrayList3;
            mutableScatterSet2 = mutableScatterSetOf3;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            MutableScatterSet mutableScatterSet6 = (MutableScatterSet) this.L$8;
            set = (Set) this.L$7;
            mutableScatterSet = (MutableScatterSet) this.L$6;
            mutableScatterSet2 = (MutableScatterSet) this.L$5;
            MutableScatterSet mutableScatterSet7 = (MutableScatterSet) this.L$4;
            List list6 = (List) this.L$3;
            list2 = (List) this.L$2;
            List list7 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableScatterSet4 = mutableScatterSet6;
            monotonicFrameClock = monotonicFrameClock2;
            list4 = list6;
            list5 = list7;
            mutableScatterSet3 = mutableScatterSet7;
            final Set set2 = set;
            final MutableScatterSet mutableScatterSet8 = mutableScatterSet2;
            final MutableScatterSet mutableScatterSet9 = mutableScatterSet;
            recordComposerModifications = this.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableScatterSet mutableScatterSet10 = (MutableScatterSet) this.L$8;
            set = (Set) this.L$7;
            mutableScatterSet = (MutableScatterSet) this.L$6;
            mutableScatterSet2 = (MutableScatterSet) this.L$5;
            mutableScatterSetOf = (MutableScatterSet) this.L$4;
            list3 = (List) this.L$3;
            list2 = (List) this.L$2;
            list = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableScatterSetOf2 = mutableScatterSet10;
            monotonicFrameClock = monotonicFrameClock3;
            this.this$0.discardUnusedMovableContentState();
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                Recomposer recomposer = this.this$0;
                this.L$0 = monotonicFrameClock;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = list3;
                this.L$4 = mutableScatterSetOf;
                this.L$5 = mutableScatterSet2;
                this.L$6 = mutableScatterSet;
                this.L$7 = set;
                this.L$8 = mutableScatterSetOf2;
                this.label = 1;
                awaitWorkAvailable = recomposer.awaitWorkAvailable(this);
                if (awaitWorkAvailable != coroutine_suspended) {
                    List list8 = list;
                    mutableScatterSet3 = mutableScatterSetOf;
                    mutableScatterSet4 = mutableScatterSetOf2;
                    list4 = list3;
                    list5 = list8;
                    final Set set22 = set;
                    final MutableScatterSet mutableScatterSet82 = mutableScatterSet2;
                    final MutableScatterSet mutableScatterSet92 = mutableScatterSet;
                    recordComposerModifications = this.this$0.recordComposerModifications();
                    if (recordComposerModifications) {
                        List list9 = list4;
                        mutableScatterSetOf2 = mutableScatterSet4;
                        mutableScatterSetOf = mutableScatterSet3;
                        list = list5;
                        list3 = list9;
                        mutableScatterSet = mutableScatterSet92;
                        mutableScatterSet2 = mutableScatterSet82;
                        set = set22;
                        shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                        if (!shouldKeepRecomposing) {
                        }
                    } else {
                        final Recomposer recomposer2 = this.this$0;
                        Function1 function1 = new Function1() { // from class: androidx.compose.runtime.E
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit invokeSuspend$lambda$22;
                                invokeSuspend$lambda$22 = Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$lambda$22(Recomposer.this, mutableScatterSet92, mutableScatterSet4, list5, list2, mutableScatterSet3, list4, mutableScatterSet82, set22, ((Long) obj2).longValue());
                                return invokeSuspend$lambda$22;
                            }
                        };
                        this.L$0 = monotonicFrameClock;
                        this.L$1 = list5;
                        this.L$2 = list2;
                        this.L$3 = list4;
                        this.L$4 = mutableScatterSet3;
                        this.L$5 = mutableScatterSet82;
                        this.L$6 = mutableScatterSet92;
                        this.L$7 = set22;
                        this.L$8 = mutableScatterSet4;
                        this.label = 2;
                        if (monotonicFrameClock.withFrameNanos(function1, this) != coroutine_suspended) {
                            List list10 = list4;
                            mutableScatterSetOf2 = mutableScatterSet4;
                            mutableScatterSetOf = mutableScatterSet3;
                            list = list5;
                            list3 = list10;
                            mutableScatterSet = mutableScatterSet92;
                            mutableScatterSet2 = mutableScatterSet82;
                            set = set22;
                            this.this$0.discardUnusedMovableContentState();
                            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                            if (!shouldKeepRecomposing) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(kotlinx.coroutines.K k, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }
}
