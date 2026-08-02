package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0014\b\u0017\u0018\u0000 l2\u00020\u0001:\u0001lBI\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J8\u0010\u0013\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\u001e\u0010\u001d\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0001H\u0010¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0001H\u0010¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020\nH\u0010¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\nH\u0010¢\u0006\u0002\b&J\r\u0010'\u001a\u00020\nH\u0010¢\u0006\u0002\b(J\b\u0010)\u001a\u00020\nH\u0002J\b\u0010*\u001a\u00020\nH\u0002J\b\u0010+\u001a\u00020\nH\u0002JG\u0010,\u001a\u00020\u00152\n\u0010-\u001a\u00060\u0003j\u0002`\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000203\u0018\u0001022\u0006\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b5\u00106J$\u00107\u001a\u0002H8\"\u0004\b\u0000\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u0002H80:H\u0080\b¢\u0006\u0004\b;\u0010<J\r\u00107\u001a\u00020\nH\u0000¢\u0006\u0002\b;J\u001b\u0010=\u001a\u00020\n2\n\u0010>\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020BH\u0000¢\u0006\u0002\bCJ\u0015\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020FH\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020\nH\u0002J\u0015\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u0006H\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u000200H\u0010¢\u0006\u0002\bNR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010O\u001a\u00020BX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010X\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010YX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020FX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u000e\u0010J\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010h\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0018\"\u0004\bj\u0010k¨\u0006m"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getReadObserver$runtime", "()Lkotlin/jvm/functions/Function1;", "getWriteObserver$runtime", "hasPendingChanges", "", "takeNestedMutableSnapshot", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "readOnly", "getReadOnly", "()Z", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "dispose", "takeNestedSnapshot", "nestedActivated", "snapshot", "nestedActivated$runtime", "nestedDeactivated", "nestedDeactivated$runtime", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime", "closeLocked", "closeLocked$runtime", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime", "validateNotApplied", "validateNotAppliedOrPinned", "abandon", "innerApplyLocked", "nextId", "modified", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApplyLocked$runtime", "(JLandroidx/collection/MutableScatterSet;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "advance", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "advance$runtime", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recordPrevious", "id", "recordPrevious$runtime", "(J)V", "recordPreviousPinnedSnapshot", "", "recordPreviousPinnedSnapshot$runtime", "recordPreviousPinnedSnapshots", "handles", "", "recordPreviousPinnedSnapshots$runtime", "releasePreviouslyPinnedSnapshotsLocked", "recordPreviousList", "snapshots", "recordPreviousList$runtime", "recordModified", "state", "recordModified$runtime", "writeCount", "getWriteCount$runtime", "()I", "setWriteCount$runtime", "(I)V", "getModified$runtime", "()Landroidx/collection/MutableScatterSet;", "setModified$runtime", "(Landroidx/collection/MutableScatterSet;)V", "merged", "", "getMerged$runtime", "()Ljava/util/List;", "setMerged$runtime", "(Ljava/util/List;)V", "previousIds", "getPreviousIds$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "previousPinnedSnapshots", "getPreviousPinnedSnapshots$runtime", "()[I", "setPreviousPinnedSnapshots$runtime", "([I)V", "applied", "getApplied$runtime", "setApplied$runtime", "(Z)V", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 11 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2486:1\n1102#1,2:2499\n1108#1,3:2505\n1111#1:2510\n1112#1,5:2513\n1102#1,2:2601\n1108#1,3:2608\n1111#1:2613\n1112#1,5:2616\n1102#1,9:2701\n1111#1:2712\n1112#1,5:2715\n166#2,12:2487\n178#2,2:2518\n166#2,12:2589\n178#2,2:2621\n1893#3:2501\n1893#3:2508\n1893#3:2520\n1893#3:2532\n1893#3:2603\n1893#3:2611\n1893#3:2689\n1893#3:2697\n1893#3:2710\n1893#3:2720\n1893#3:2722\n33#4:2502\n33#4:2509\n33#4:2521\n33#4:2533\n33#4:2604\n33#4:2612\n33#4:2690\n33#4:2698\n33#4:2711\n33#4:2721\n33#4:2723\n36#5:2503\n36#5:2504\n36#5:2512\n36#5:2606\n36#5:2607\n36#5:2615\n36#5:2699\n36#5:2700\n36#5:2714\n1#6:2511\n1#6:2605\n1#6:2614\n1#6:2678\n1#6:2713\n1#6:2724\n34#7,5:2522\n34#7,5:2527\n34#7,5:2584\n34#7,3:2686\n38#7:2691\n34#7,5:2692\n231#8,3:2534\n200#8,7:2537\n211#8,3:2545\n214#8,9:2549\n234#8:2558\n231#8,3:2559\n200#8,7:2562\n211#8,3:2570\n214#8,9:2574\n234#8:2583\n231#8,3:2636\n200#8,7:2639\n211#8,3:2647\n214#8,9:2651\n234#8:2660\n231#8,3:2661\n200#8,7:2664\n211#8,3:2672\n214#8,2:2676\n217#8,6:2679\n234#8:2685\n1399#9:2544\n1270#9:2548\n1399#9:2569\n1270#9:2573\n1399#9:2646\n1270#9:2650\n1399#9:2671\n1270#9:2675\n34#10,4:2623\n49#10,4:2627\n49#10,4:2632\n206#11:2631\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n772#1:2499,2\n772#1:2505,3\n772#1:2510\n772#1:2513,5\n924#1:2601,2\n924#1:2608,3\n924#1:2613\n924#1:2616,5\n1119#1:2701,9\n1119#1:2712\n1119#1:2715,5\n769#1:2487,12\n769#1:2518,2\n918#1:2589,12\n918#1:2621,2\n773#1:2501\n772#1:2508\n831#1:2520\n887#1:2532\n925#1:2603\n924#1:2611\n1085#1:2689\n1110#1:2697\n1119#1:2710\n1122#1:2720\n1143#1:2722\n773#1:2502\n772#1:2509\n831#1:2521\n887#1:2533\n925#1:2604\n924#1:2612\n1085#1:2690\n1110#1:2698\n1119#1:2711\n1122#1:2721\n1143#1:2723\n775#1:2503\n781#1:2504\n772#1:2512\n926#1:2606\n930#1:2607\n924#1:2615\n1111#1:2699\n1114#1:2700\n1119#1:2714\n772#1:2511\n924#1:2614\n1119#1:2713\n873#1:2522,5\n879#1:2527,5\n892#1:2584,5\n1082#1:2686,3\n1082#1:2691\n1093#1:2692,5\n890#1:2534,3\n890#1:2537,7\n890#1:2545,3\n890#1:2549,9\n890#1:2558\n891#1:2559,3\n891#1:2562,7\n891#1:2570,3\n891#1:2574,9\n891#1:2583\n990#1:2636,3\n990#1:2639,7\n990#1:2647,3\n990#1:2651,9\n990#1:2660\n1025#1:2661,3\n1025#1:2664,7\n1025#1:2672,3\n1025#1:2676,2\n1025#1:2679,6\n1025#1:2685\n890#1:2544\n890#1:2548\n891#1:2569\n891#1:2573\n990#1:2646\n990#1:2650\n1025#1:2671\n1025#1:2675\n944#1:2623,4\n968#1:2627,4\n972#1:2632,4\n972#1:2631\n*E\n"})
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private MutableScatterSet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1<Object, Unit> writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "<init>", "()V", "EmptyIntArray", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(j, snapshotIdSet, (DefaultConstructorMarker) null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    private final void abandon() {
        long j;
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        if (modified$runtime != null) {
            validateNotApplied();
            setModified$runtime(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = modified$runtime.elements;
            long[] jArr = modified$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j2 = jArr[i];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j2) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i << 3) + i3]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == snapshotId || CollectionsKt.contains(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId()))) {
                                        j = SnapshotKt.INVALID_SNAPSHOT;
                                        firstStateRecord.setSnapshotId$runtime(j);
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        closeAndReleasePinning$runtime();
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    public final <T> T advance$runtime(Function0<? extends T> block) {
        long j;
        long j2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime(getSnapshotId());
        T invoke = block.invoke();
        if (getApplied() || getDisposed()) {
            return invoke;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            try {
                j = SnapshotKt.nextSnapshotId;
                j2 = SnapshotKt.nextSnapshotId;
                j3 = 1;
                SnapshotKt.nextSnapshotId = j2 + j3;
                setSnapshotId$runtime(j);
                snapshotIdSet = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + j3, getSnapshotId()));
        return invoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5 A[LOOP:1: B:32:0x00d3->B:33:0x00d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141 A[Catch: all -> 0x012d, TryCatch #1 {all -> 0x012d, blocks: (B:38:0x00e9, B:40:0x00f9, B:43:0x0105, B:45:0x0111, B:47:0x011b, B:49:0x0121, B:51:0x0130, B:57:0x0141, B:60:0x014b, B:62:0x0155, B:64:0x015f, B:66:0x0165, B:68:0x016f, B:74:0x0177, B:76:0x017a, B:78:0x017e, B:80:0x0185, B:82:0x0191, B:88:0x0138), top: B:37:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e A[Catch: all -> 0x012d, TryCatch #1 {all -> 0x012d, blocks: (B:38:0x00e9, B:40:0x00f9, B:43:0x0105, B:45:0x0111, B:47:0x011b, B:49:0x0121, B:51:0x0130, B:57:0x0141, B:60:0x014b, B:62:0x0155, B:64:0x015f, B:66:0x0165, B:68:0x016f, B:74:0x0177, B:76:0x017a, B:78:0x017e, B:80:0x0185, B:82:0x0191, B:88:0x0138), top: B:37:0x00e9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnapshotApplyResult apply() {
        Map<StateRecord, ? extends StateRecord> map;
        GlobalSnapshot globalSnapshot;
        Function1 function1;
        List list;
        MutableScatterSet<StateObject> mutableScatterSet;
        List list2;
        long j;
        long j2;
        List<? extends StateObject> list3;
        int size;
        int i;
        GlobalSnapshot globalSnapshot2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        Function1 function12;
        GlobalSnapshot globalSnapshot3;
        SnapshotIdSet snapshotIdSet2;
        Map<StateRecord, ? extends StateRecord> optimisticMerges;
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        if (modified$runtime != null) {
            globalSnapshot3 = SnapshotKt.globalSnapshot;
            long snapshotId = globalSnapshot3.getSnapshotId();
            snapshotIdSet2 = SnapshotKt.openSnapshots;
            optimisticMerges = SnapshotKt.optimisticMerges(snapshotId, this, snapshotIdSet2.clear(globalSnapshot3.getSnapshotId()));
            map = optimisticMerges;
        } else {
            map = null;
        }
        List emptyList = CollectionsKt.emptyList();
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
                if (modified$runtime != null && modified$runtime.get_size() != 0) {
                    globalSnapshot2 = SnapshotKt.globalSnapshot;
                    j3 = SnapshotKt.nextSnapshotId;
                    snapshotIdSet = SnapshotKt.openSnapshots;
                    SnapshotApplyResult innerApplyLocked$runtime = innerApplyLocked$runtime(j3, modified$runtime, map, snapshotIdSet.clear(globalSnapshot2.getSnapshotId()));
                    if (!Intrinsics.areEqual(innerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                        return innerApplyLocked$runtime;
                    }
                    closeLocked$runtime();
                    mutableScatterSet = globalSnapshot2.getModified$runtime();
                    function12 = SnapshotKt.emptyLambda;
                    SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot2, function12);
                    setModified$runtime(null);
                    globalSnapshot2.setModified$runtime(null);
                    list = SnapshotKt.applyObservers;
                    Unit unit = Unit.INSTANCE;
                    this.applied = true;
                    if (mutableScatterSet != null) {
                        Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
                        if (!wrapIntoSet.isEmpty()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Function2) list.get(i2)).invoke(wrapIntoSet, this);
                            }
                        }
                    }
                    if (modified$runtime != null && modified$runtime.isNotEmpty()) {
                        Set wrapIntoSet2 = ScatterSetWrapperKt.wrapIntoSet(modified$runtime);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((Function2) list.get(i)).invoke(wrapIntoSet2, this);
                        }
                    }
                    SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            releasePinnedSnapshotsForCloseLocked$runtime();
                            SnapshotKt.checkAndOverwriteUnusedRecordsLocked();
                            if (mutableScatterSet != null) {
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (modified$runtime != null) {
                                        Object[] objArr2 = modified$runtime.elements;
                                        long[] jArr2 = modified$runtime.metadata;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    list3 = this.merged;
                                    if (list3 != null) {
                                        int size3 = list3.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            SnapshotKt.processForUnusedRecordsLocked(list3.get(i9));
                                        }
                                    }
                                    this.merged = null;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (modified$runtime != null) {
                            }
                            list3 = this.merged;
                            if (list3 != null) {
                            }
                            this.merged = null;
                            Unit unit22 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return SnapshotApplyResult.Success.INSTANCE;
                }
                closeLocked$runtime();
                globalSnapshot = SnapshotKt.globalSnapshot;
                MutableScatterSet<StateObject> modified$runtime2 = globalSnapshot.getModified$runtime();
                function1 = SnapshotKt.emptyLambda;
                SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot, function1);
                if (modified$runtime2 == null || !modified$runtime2.isNotEmpty()) {
                    list = emptyList;
                    mutableScatterSet = null;
                } else {
                    list2 = SnapshotKt.applyObservers;
                    list = list2;
                    mutableScatterSet = modified$runtime2;
                }
                Unit unit3 = Unit.INSTANCE;
                this.applied = true;
                if (mutableScatterSet != null) {
                }
                if (modified$runtime != null) {
                    Set wrapIntoSet22 = ScatterSetWrapperKt.wrapIntoSet(modified$runtime);
                    size = list.size();
                    while (i < size) {
                    }
                }
                SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime);
                synchronized (SnapshotKt.getLock()) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo225nestedDeactivated$runtime(this);
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    /* renamed from: getApplied$runtime, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public final List<StateObject> getMerged$runtime() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime() {
        return this.modified;
    }

    /* renamed from: getPreviousIds$runtime, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    /* renamed from: getPreviousPinnedSnapshots$runtime, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteCount$runtime, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        return modified$runtime != null && modified$runtime.isNotEmpty();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime(long nextId, MutableScatterSet<StateObject> modified, Map<StateRecord, ? extends StateRecord> optimisticMerges, SnapshotIdSet invalidSnapshots) {
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        StateRecord readable;
        StateRecord readable2;
        StateRecord readable3;
        StateRecord mergeRecords;
        SnapshotIdSet or = getInvalid().set(getSnapshotId()).or(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends StateObject> list = null;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                List<? extends StateObject> list2 = list;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j2 & 255) < 128) {
                            i = i4;
                            StateObject stateObject = (StateObject) objArr3[(i3 << 3) + i6];
                            objArr2 = objArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList2 = arrayList;
                            readable = SnapshotKt.readable(firstStateRecord, nextId, invalidSnapshots);
                            if (readable == null) {
                                j = j2;
                            } else {
                                j = j2;
                                readable2 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), or);
                                if (readable2 != null && readable2.getSnapshotId() != SnapshotId_jvmKt.toSnapshotId(1) && !Intrinsics.areEqual(readable, readable2)) {
                                    i2 = i6;
                                    snapshotIdSet2 = or;
                                    readable3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid());
                                    if (readable3 == null) {
                                        SnapshotKt.readError();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (mergeRecords = optimisticMerges.get(readable)) == null) {
                                        mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                    }
                                    if (mergeRecords == null) {
                                        return new SnapshotApplyResult.Failure(this);
                                    }
                                    if (!Intrinsics.areEqual(mergeRecords, readable3)) {
                                        if (Intrinsics.areEqual(mergeRecords, readable)) {
                                            ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList3.add(TuplesKt.to(stateObject, readable.create(getSnapshotId())));
                                            if (list2 == null) {
                                                list2 = new ArrayList<>();
                                            }
                                            List<? extends StateObject> list3 = list2;
                                            list3.add(stateObject);
                                            arrayList = arrayList3;
                                            list2 = list3;
                                        } else {
                                            arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList.add(!Intrinsics.areEqual(mergeRecords, readable2) ? TuplesKt.to(stateObject, mergeRecords) : TuplesKt.to(stateObject, readable2.create(getSnapshotId())));
                                        }
                                    }
                                    arrayList = arrayList2;
                                }
                            }
                            snapshotIdSet2 = or;
                            i2 = i6;
                            arrayList = arrayList2;
                        } else {
                            snapshotIdSet2 = or;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j = j2;
                            i2 = i6;
                        }
                        j2 = j >> i;
                        i6 = i2 + 1;
                        objArr3 = objArr2;
                        i4 = i;
                        jArr3 = jArr2;
                        or = snapshotIdSet2;
                    }
                    snapshotIdSet = or;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList4 = arrayList;
                    if (i5 != i4) {
                        list = list2;
                        arrayList = arrayList4;
                        break;
                    }
                    arrayList = arrayList4;
                } else {
                    snapshotIdSet = or;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                list = list2;
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr3 = objArr;
                jArr3 = jArr;
                or = snapshotIdSet;
            }
        }
        if (arrayList != null) {
            advance$runtime();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Pair pair = (Pair) arrayList.get(i7);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord = (StateRecord) pair.component2();
                stateRecord.setSnapshotId$runtime(nextId);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord.setNext$runtime(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                modified.remove(list.get(i8));
            }
            List<? extends StateObject> list4 = this.merged;
            if (list4 != null) {
                list = CollectionsKt.plus((Collection) list4, (Iterable) list);
            }
            this.merged = list;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime */
    public void mo224nestedActivated$runtime(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime */
    public void mo225nestedDeactivated$runtime(Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo226recordModified$runtime(StateObject state) {
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        if (modified$runtime == null) {
            modified$runtime = ScatterSetKt.mutableScatterSetOf();
            setModified$runtime(modified$runtime);
        }
        modified$runtime.add(state);
    }

    public final void recordPrevious$runtime(long id2) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(id2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime(SnapshotIdSet snapshots) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime(int id2) {
        if (id2 >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, id2);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = ArraysKt.plus(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime();
    }

    public final void setApplied$runtime(boolean z) {
        this.applied = z;
    }

    public final void setMerged$runtime(List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified$runtime(MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final void setPreviousIds$runtime(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i) {
        this.writeCount = i;
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        long j;
        long j2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        Function1 mergedWriteObserver;
        long j4;
        long j5;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        PersistentList persistentList = SnapshotObserverKt.observers;
        Function1<Object, Unit> function1 = readObserver;
        Function1<Object, Unit> function12 = writeObserver;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, false, function1, function12);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            Function1<Object, Unit> readObserver2 = first.getReadObserver();
            function12 = first.getWriteObserver();
            map = mergeObservers.getSecond();
            function1 = readObserver2;
        } else {
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            j3 = 1;
            SnapshotKt.nextSnapshotId = j2 + j3;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime(invalid.set(j));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid, getSnapshotId() + j3, j);
            Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null);
            mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime());
            nestedMutableSnapshot = new NestedMutableSnapshot(j, addRange, mergedReadObserver$default, mergedWriteObserver, this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j4 = SnapshotKt.nextSnapshotId;
                j5 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j5 + j3;
                setSnapshotId$runtime(j4);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + j3, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedMutableSnapshot, map);
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> readObserver) {
        Map<SnapshotObserver, SnapshotInstanceObservers> map;
        long j;
        long j2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        long j4;
        long j5;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        PersistentList persistentList = SnapshotObserverKt.observers;
        Function1<Object, Unit> function1 = readObserver;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, true, function1, null);
            SnapshotInstanceObservers first = mergeObservers.getFirst();
            Function1<Object, Unit> readObserver2 = first.getReadObserver();
            first.getWriteObserver();
            map = mergeObservers.getSecond();
            function1 = readObserver2;
        } else {
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            j3 = 1;
            SnapshotKt.nextSnapshotId = j2 + j3;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(j);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j, SnapshotKt.addRange(getInvalid(), snapshotId + j3, j), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                j4 = SnapshotKt.nextSnapshotId;
                j5 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = j5 + j3;
                setSnapshotId$runtime(j4);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId2 + j3, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    public final void advance$runtime() {
        long j;
        long j2;
        long j3;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime(getSnapshotId());
        Unit unit = Unit.INSTANCE;
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            j = SnapshotKt.nextSnapshotId;
            j2 = SnapshotKt.nextSnapshotId;
            j3 = 1;
            SnapshotKt.nextSnapshotId = j2 + j3;
            setSnapshotId$runtime(j);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid(), snapshotId + j3, getSnapshotId()));
    }
}
