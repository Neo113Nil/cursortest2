package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
import kotlin.jvm.internal.TypeIntrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001<B0\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010\u0017\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0002J\u0010\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001d\u0010#\u001a\u00020\u00052\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001d\u0010%\u001a\u00020\u00052\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u0003H\u0082\bJ?\u0010,\u001a\u00020\u0005\"\b\b\u0000\u0010-*\u00020\u00012\u0006\u0010.\u001a\u0002H-2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u00100J\u0016\u00101\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u000e\u00102\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0001J)\u00103\u001a\u00020\u00052!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00100\u0003J\u0006\u00105\u001a\u00020\u0005J\u0006\u00106\u001a\u00020\u0005J\u001e\u00107\u001a\u00020\u00052\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u00109\u001a\u00020\u0014H\u0007J\u0006\u00102\u001a\u00020\u0005J&\u0010:\u001a\u00020\u001f\"\b\b\u0000\u0010-*\u00020\u00012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020\u00050\u0003H\u0002R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00060\u0001j\u0002`!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "drainChanges", "sendNotifications", "addChanges", "set", "removeChanges", "report", "", "readObserver", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "observedScopeMapsLock", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "forEachScopeMap", "block", "removeScopeMapIf", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "currentMapThreadId", "", "observeReads", ExifInterface.GPS_DIRECTION_TRUE, "scope", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withNoObservations", "clear", "clearIf", "predicate", "start", "stop", "notifyChanges", "changes", "snapshot", "ensureMap", "onChanged", "ObservedScopeMap", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,601:1\n183#1:611\n184#1:621\n187#1:652\n188#1:669\n187#1:670\n188#1:687\n183#1:688\n184#1:698\n1107#2:602\n1085#2,2:603\n25#3,5:605\n33#3:610\n33#3:612\n33#3:622\n33#3:631\n33#3:647\n33#3:653\n33#3:671\n33#3:689\n33#3:708\n33#3:717\n424#4,8:613\n424#4,8:623\n742#4,15:632\n742#4,15:654\n742#4,15:672\n424#4,8:690\n348#4,7:699\n643#4,2:706\n424#4,8:709\n34#5,4:648\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n71#1:611\n71#1:621\n282#1:652\n282#1:669\n293#1:670\n293#1:687\n320#1:688\n320#1:698\n174#1:602\n174#1:603,2\n175#1:605,5\n65#1:610\n71#1:612\n183#1:622\n187#1:631\n226#1:647\n282#1:653\n293#1:671\n320#1:689\n85#1:708\n165#1:717\n71#1:613,8\n183#1:623,8\n187#1:632,15\n282#1:654,15\n293#1:672,15\n320#1:690,8\n331#1:699,7\n334#1:706,2\n89#1:709,8\n233#1:648,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2() { // from class: androidx.compose.runtime.snapshots.k
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit applyObserver$lambda$0;
            applyObserver$lambda$0 = SnapshotStateObserver.applyObserver$lambda$0(SnapshotStateObserver.this, (Set) obj, (Snapshot) obj2);
            return applyObserver$lambda$0;
        }
    };
    private final Function1<Object, Unit> readObserver = new l(this, 0);
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addChanges(Set<? extends Object> set) {
        Set<? extends Object> plus;
        while (true) {
            Object obj = this.pendingChanges.get();
            if (obj == null) {
                plus = set;
            } else if (obj instanceof Set) {
                plus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                plus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, plus)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyObserver$lambda$0(SnapshotStateObserver snapshotStateObserver, Set set, Snapshot snapshot) {
        snapshotStateObserver.addChanges(set);
        if (snapshotStateObserver.drainChanges()) {
            snapshotStateObserver.sendNotifications();
        }
        return Unit.INSTANCE;
    }

    private final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i = 0; i < size; i++) {
                        if (!observedScopeMapArr[i].recordInvalidation(removeChanges) && !z2) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = observedScopeMapArr[i];
            if (observedScopeMap.getOnChanged() == onChanged) {
                break;
            }
            i++;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> block) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    block.invoke(observedScopeMapArr[i]);
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readObserver$lambda$7(SnapshotStateObserver snapshotStateObserver, Object obj) {
        if (!snapshotStateObserver.isPaused) {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    private final Set<Object> removeChanges() {
        Set<Object> set;
        while (true) {
            Object obj = this.pendingChanges.get();
            Object obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, obj2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return set;
        }
    }

    private final void removeScopeMapIf(Function1<? super ObservedScopeMap, Boolean> block) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (block.invoke(mutableVector.content[i2]).booleanValue()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i2 - i] = observedScopeMapArr[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    private final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0() { // from class: androidx.compose.runtime.snapshots.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit sendNotifications$lambda$5;
                sendNotifications$lambda$5 = SnapshotStateObserver.sendNotifications$lambda$5(SnapshotStateObserver.this);
                return sendNotifications$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendNotifications$lambda$5(SnapshotStateObserver snapshotStateObserver) {
        do {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                try {
                    if (!snapshotStateObserver.sendingNotifications) {
                        snapshotStateObserver.sendingNotifications = true;
                        try {
                            MutableVector<ObservedScopeMap> mutableVector = snapshotStateObserver.observedScopeMaps;
                            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                            int size = mutableVector.getSize();
                            for (int i = 0; i < size; i++) {
                                observedScopeMapArr[i].notifyInvalidatedScopes();
                            }
                            snapshotStateObserver.sendingNotifications = false;
                        } finally {
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (snapshotStateObserver.drainChanges());
        return Unit.INSTANCE;
    }

    public final void clear(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i2];
                    observedScopeMap.clearScopeObservations(scope);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i2 - i] = observedScopeMapArr[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i2];
                    observedScopeMap.removeScopeIf(predicate);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i2 - i] = observedScopeMapArr[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void notifyChanges(Set<? extends Object> changes, Snapshot snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        ObservedScopeMap ensureMap;
        synchronized (this.observedScopeMapsLock) {
            ensureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j = this.currentMapThreadId;
        if (j != -1) {
            if (!(j == Thread_jvmKt.currentThreadId())) {
                StringBuilder b = m.b(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
                b.append(Thread_jvmKt.currentThreadId());
                b.append(", name=");
                b.append(Thread_jvmKt.currentThreadName());
                b.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                PreconditionsKt.throwIllegalArgumentException(b.toString());
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = Thread_jvmKt.currentThreadId();
            ensureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
            this.currentMapThreadId = j;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(Function0<Unit> block) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0001J.\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002J0\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0001H\u0002J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0001J)\u0010+\u001a\u00020\u00042!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020/0\u0003J\u0006\u00100\u001a\u00020/J\u0018\u00101\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0002J\u0006\u00102\u001a\u00020\u0004J\u0014\u00103\u001a\u00020/2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000105J\u0012\u00106\u001a\u00020\u00042\n\u00107\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0006\u00108\u001a\u00020\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R6\u0010\u001e\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001fj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0001` X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "valueToScopes", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "invalidated", "Landroidx/collection/MutableScatterSet;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedState;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "deriveStateScopeCount", "dependencyToDerivedStates", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordRead", "value", "recordedValues", "observe", "scope", "readObserver", "block", "Lkotlin/Function0;", "clearObsoleteStateReads", "clearScopeObservations", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", "name", "", "hasScopeObservations", "removeObservation", "clear", "recordInvalidation", "changes", "", "rereadDerivedState", "derivedState", "notifyInvalidatedScopes", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 15 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n1107#2:602\n1085#2,2:603\n403#3,3:605\n367#3,6:608\n377#3,3:615\n380#3,2:619\n383#3,6:622\n406#3:628\n367#3,6:640\n377#3,3:647\n380#3,2:651\n383#3,6:657\n395#3,4:664\n367#3,6:668\n377#3,3:675\n380#3,9:679\n399#3:688\n395#3,4:704\n367#3,6:708\n377#3,3:715\n380#3,9:719\n399#3:728\n1399#4:614\n1270#4:618\n1399#4:646\n1270#4:650\n1399#4:674\n1270#4:678\n1399#4:696\n1270#4:700\n1399#4:714\n1270#4:718\n1399#4:752\n1270#4:756\n1399#4:776\n1270#4:780\n1399#4:799\n1270#4:803\n1399#4:842\n1270#4:846\n1399#4:878\n1270#4:882\n1399#4:916\n1270#4:920\n1399#4:939\n1270#4:943\n1399#4:982\n1270#4:986\n1399#4:1018\n1270#4:1022\n1399#4:1064\n1270#4:1068\n1399#4:1093\n1270#4:1097\n57#5:621\n57#5:629\n57#5:759\n390#6,6:630\n396#6,2:637\n44#7:636\n519#7:1039\n424#7,8:1040\n775#8:639\n777#8,4:653\n781#8:663\n842#9:689\n844#9:703\n845#9,3:729\n848#9:738\n329#10,6:690\n339#10,3:697\n342#10,2:701\n345#10,6:732\n41#11,3:739\n46#11:904\n48#11:1038\n231#12,3:742\n200#12,7:745\n211#12,3:753\n214#12,2:757\n231#12,3:766\n200#12,7:769\n211#12,3:777\n214#12,2:781\n231#12,3:789\n200#12,7:792\n211#12,3:800\n214#12,9:804\n234#12:813\n217#12,6:818\n234#12:824\n231#12,3:832\n200#12,7:835\n211#12,3:843\n214#12,9:847\n234#12:856\n231#12,3:868\n200#12,7:871\n211#12,3:879\n214#12,9:883\n234#12:892\n217#12,6:897\n234#12:903\n231#12,3:906\n200#12,7:909\n211#12,3:917\n214#12,2:921\n231#12,3:929\n200#12,7:932\n211#12,3:940\n214#12,9:944\n234#12:953\n217#12,6:958\n234#12:964\n231#12,3:972\n200#12,7:975\n211#12,3:983\n214#12,9:987\n234#12:996\n231#12,3:1008\n200#12,7:1011\n211#12,3:1019\n214#12,9:1023\n234#12:1032\n231#12,3:1054\n200#12,7:1057\n211#12,3:1065\n214#12,2:1069\n217#12,6:1072\n234#12:1078\n231#12,3:1083\n200#12,7:1086\n211#12,3:1094\n214#12,9:1098\n234#12:1107\n67#13,6:760\n67#13,6:783\n75#13,4:814\n75#13:825\n67#13,6:826\n75#13,4:857\n78#13:861\n67#13,6:862\n75#13,4:893\n67#13,6:923\n75#13,4:954\n75#13:965\n67#13,6:966\n75#13,4:997\n78#13:1001\n67#13,6:1002\n75#13,4:1033\n67#13,6:1048\n75#13,4:1079\n1863#14:905\n1864#14:1037\n1#15:1071\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n369#1:602\n369#1:603,2\n435#1:605,3\n435#1:608,6\n435#1:615,3\n435#1:619,2\n435#1:622,6\n435#1:628\n476#1:640,6\n476#1:647,3\n476#1:651,2\n476#1:657,6\n488#1:664,4\n488#1:668,6\n488#1:675,3\n488#1:679,9\n488#1:688\n496#1:704,4\n496#1:708,6\n496#1:715,3\n496#1:719,9\n496#1:728\n435#1:614\n435#1:618\n476#1:646\n476#1:650\n488#1:674\n488#1:678\n493#1:696\n493#1:700\n496#1:714\n496#1:718\n533#1:752\n533#1:756\n540#1:776\n540#1:780\n552#1:799\n552#1:803\n552#1:842\n552#1:846\n563#1:878\n563#1:882\n540#1:916\n540#1:920\n552#1:939\n552#1:943\n552#1:982\n552#1:986\n563#1:1018\n563#1:1022\n581#1:1064\n581#1:1068\n596#1:1093\n596#1:1097\n437#1:621\n445#1:629\n534#1:759\n463#1:630,6\n463#1:637,2\n463#1:636\n569#1:1039\n570#1:1040,8\n476#1:639\n476#1:653,4\n476#1:663\n493#1:689\n493#1:703\n493#1:729,3\n493#1:738\n493#1:690,6\n493#1:697,3\n493#1:701,2\n493#1:732,6\n533#1:739,3\n533#1:904\n533#1:1038\n533#1:742,3\n533#1:745,7\n533#1:753,3\n533#1:757,2\n540#1:766,3\n540#1:769,7\n540#1:777,3\n540#1:781,2\n552#1:789,3\n552#1:792,7\n552#1:800,3\n552#1:804,9\n552#1:813\n540#1:818,6\n540#1:824\n552#1:832,3\n552#1:835,7\n552#1:843,3\n552#1:847,9\n552#1:856\n563#1:868,3\n563#1:871,7\n563#1:879,3\n563#1:883,9\n563#1:892\n533#1:897,6\n533#1:903\n540#1:906,3\n540#1:909,7\n540#1:917,3\n540#1:921,2\n552#1:929,3\n552#1:932,7\n552#1:940,3\n552#1:944,9\n552#1:953\n540#1:958,6\n540#1:964\n552#1:972,3\n552#1:975,7\n552#1:983,3\n552#1:987,9\n552#1:996\n563#1:1008,3\n563#1:1011,7\n563#1:1019,3\n563#1:1023,9\n563#1:1032\n581#1:1054,3\n581#1:1057,7\n581#1:1065,3\n581#1:1069,2\n581#1:1072,6\n581#1:1078\n596#1:1083,3\n596#1:1086,7\n596#1:1094,3\n596#1:1098,9\n596#1:1107\n540#1:760,6\n552#1:783,6\n552#1:814,4\n540#1:825\n552#1:826,6\n552#1:857,4\n540#1:861\n563#1:862,6\n563#1:893,4\n552#1:923,6\n552#1:954,4\n540#1:965\n552#1:966,6\n552#1:997,4\n540#1:1001\n563#1:1002,6\n563#1:1033,4\n581#1:1048,6\n581#1:1079,4\n533#1:905\n533#1:1037\n*E\n"})
    public static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final MutableScatterSet<Object> invalidated;
        private final Function1<Object, Unit> onChanged;
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;
        private final MutableScatterMap<Object, Object> valueToScopes = ScopeMap.m208constructorimpl$default(null, 1, null);
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i - 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                int i;
                i = SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount;
                SnapshotStateObserver.ObservedScopeMap.this.deriveStateScopeCount = i + 1;
            }
        };
        private final MutableScatterMap<Object, Object> dependencyToDerivedStates = ScopeMap.m208constructorimpl$default(null, 1, null);
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(Function1<Object, Unit> function1) {
            this.onChanged = function1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            int i2 = 0;
            this.scopeToValues = new MutableScatterMap<>(i2, i, defaultConstructorMarker);
            this.invalidated = new MutableScatterSet<>(i2, i, defaultConstructorMarker);
        }

        private final void clearObsoleteStateReads(Object scope) {
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = mutableObjectIntMap.keys[i5];
                            boolean z = mutableObjectIntMap.values[i5] != i;
                            if (z) {
                                removeObservation(scope, obj);
                            }
                            if (z) {
                                mutableObjectIntMap.removeValueAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        private final void removeObservation(Object scope, Object value) {
            ScopeMap.m215removeimpl(this.valueToScopes, value, scope);
            if (!(value instanceof DerivedState) || ScopeMap.m209containsimpl(this.valueToScopes, value)) {
                return;
            }
            ScopeMap.m217removeScopeimpl(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            ScopeMap.m206clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m206clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(Object scope) {
            MutableObjectIntMap<Object> remove = this.scopeToValues.remove(scope);
            if (remove == null) {
                return;
            }
            Object[] objArr = remove.keys;
            int[] iArr = remove.values;
            long[] jArr = remove.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            removeObservation(scope, obj);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        public final void notifyInvalidatedScopes() {
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            Function1<Object, Unit> function1 = this.onChanged;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                function1.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
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
            mutableScatterSet.clear();
        }

        public final void observe(Object scope, Function1<Object, Unit> readObserver, Function0<Unit> block) {
            Object obj = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.INSTANCE.observe(readObserver, null, block);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.checkNotNull(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i;
            } catch (Throwable th) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:237:0x04e6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean recordInvalidation(Set<? extends Object> changes) {
            boolean z;
            Iterator it;
            MutableScatterMap<Object, Object> mutableScatterMap;
            Object obj;
            int i;
            Object obj2;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            MutableScatterMap<Object, Object> mutableScatterMap2;
            long[] jArr2;
            Object[] objArr2;
            long j;
            long[] jArr3;
            Object[] objArr3;
            String str;
            int i2;
            long[] jArr4;
            Object[] objArr4;
            String str2;
            int i3;
            int i4;
            long j2;
            int i5;
            int i6;
            Object obj3;
            Object obj4;
            String str3;
            Object obj5;
            int i7;
            long j3;
            int i8;
            int i9;
            MutableScatterMap<Object, Object> mutableScatterMap3 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> hashMap = this.recordedDerivedStateValues;
            MutableScatterMap<Object, Object> mutableScatterMap4 = this.valueToScopes;
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i10 = 8;
            if (changes instanceof ScatterSetWrapper) {
                ScatterSet set$runtime = ((ScatterSetWrapper) changes).getSet$runtime();
                Object[] objArr5 = set$runtime.elements;
                long[] jArr5 = set$runtime.metadata;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    z = false;
                    while (true) {
                        long j4 = jArr5[i11];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j4 & 255) < 128) {
                                    int i14 = i10;
                                    Object obj6 = objArr5[(i11 << 3) + i13];
                                    jArr4 = jArr5;
                                    if (obj6 instanceof StateObjectImpl) {
                                        objArr4 = objArr5;
                                        if (!((StateObjectImpl) obj6).m240isReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(2))) {
                                            str2 = str4;
                                            i3 = length;
                                            i4 = i11;
                                            j2 = j4;
                                            i5 = i12;
                                            i6 = 8;
                                        }
                                    } else {
                                        objArr4 = objArr5;
                                    }
                                    if (ScopeMap.m209containsimpl(mutableScatterMap3, obj6)) {
                                        Object obj7 = mutableScatterMap3.get(obj6);
                                        if (obj7 != null) {
                                            if (obj7 instanceof MutableScatterSet) {
                                                MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj7;
                                                Object[] objArr6 = mutableScatterSet2.elements;
                                                long[] jArr6 = mutableScatterSet2.metadata;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    j2 = j4;
                                                    int i15 = 0;
                                                    boolean z2 = z;
                                                    while (true) {
                                                        long j5 = jArr6[i15];
                                                        i3 = length;
                                                        i4 = i11;
                                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                            int i17 = 0;
                                                            while (i17 < i16) {
                                                                if ((j5 & 255) < 128) {
                                                                    i7 = i17;
                                                                    DerivedState<?> derivedState = (DerivedState) objArr6[(i15 << 3) + i17];
                                                                    Intrinsics.checkNotNull(derivedState, str4);
                                                                    j3 = j5;
                                                                    Object obj8 = hashMap.get(derivedState);
                                                                    SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                                    if (policy == null) {
                                                                        policy = SnapshotStateKt.structuralEqualityPolicy();
                                                                    }
                                                                    boolean z3 = z2;
                                                                    if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj8)) {
                                                                        str3 = str4;
                                                                        obj5 = obj6;
                                                                        i8 = i12;
                                                                        this.statesToReread.add(derivedState);
                                                                        z2 = z3;
                                                                    } else {
                                                                        Object obj9 = mutableScatterMap4.get(derivedState);
                                                                        if (obj9 != null) {
                                                                            if (obj9 instanceof MutableScatterSet) {
                                                                                MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj9;
                                                                                Object[] objArr7 = mutableScatterSet3.elements;
                                                                                long[] jArr7 = mutableScatterSet3.metadata;
                                                                                int length3 = jArr7.length - 2;
                                                                                if (length3 >= 0) {
                                                                                    i8 = i12;
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        long j6 = jArr7[i18];
                                                                                        str3 = str4;
                                                                                        obj5 = obj6;
                                                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                                                            int i20 = 0;
                                                                                            while (i20 < i19) {
                                                                                                if ((j6 & 255) < 128) {
                                                                                                    i9 = i20;
                                                                                                    mutableScatterSet.add(objArr7[(i18 << 3) + i20]);
                                                                                                    z3 = true;
                                                                                                } else {
                                                                                                    i9 = i20;
                                                                                                }
                                                                                                j6 >>= i14;
                                                                                                i20 = i9 + 1;
                                                                                            }
                                                                                            if (i19 != i14) {
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (i18 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i18++;
                                                                                        str4 = str3;
                                                                                        obj6 = obj5;
                                                                                        i14 = 8;
                                                                                    }
                                                                                    z2 = z3;
                                                                                    Unit unit = Unit.INSTANCE;
                                                                                }
                                                                            } else {
                                                                                str3 = str4;
                                                                                obj5 = obj6;
                                                                                i8 = i12;
                                                                                mutableScatterSet.add(obj9);
                                                                                z2 = true;
                                                                                Unit unit2 = Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                        str3 = str4;
                                                                        obj5 = obj6;
                                                                        i8 = i12;
                                                                        z2 = z3;
                                                                        Unit unit22 = Unit.INSTANCE;
                                                                    }
                                                                } else {
                                                                    str3 = str4;
                                                                    obj5 = obj6;
                                                                    i7 = i17;
                                                                    j3 = j5;
                                                                    i8 = i12;
                                                                }
                                                                j5 = j3 >> 8;
                                                                i17 = i7 + 1;
                                                                i14 = 8;
                                                                i12 = i8;
                                                                str4 = str3;
                                                                obj6 = obj5;
                                                            }
                                                            str2 = str4;
                                                            obj4 = obj6;
                                                            boolean z4 = z2;
                                                            i5 = i12;
                                                            if (i16 != i14) {
                                                                z = z4;
                                                                break;
                                                            }
                                                            z2 = z4;
                                                        } else {
                                                            str2 = str4;
                                                            obj4 = obj6;
                                                            i5 = i12;
                                                        }
                                                        if (i15 == length2) {
                                                            z = z2;
                                                            break;
                                                        }
                                                        i15++;
                                                        length = i3;
                                                        i11 = i4;
                                                        i12 = i5;
                                                        str4 = str2;
                                                        obj6 = obj4;
                                                        i14 = 8;
                                                    }
                                                }
                                            } else {
                                                str2 = str4;
                                                obj4 = obj6;
                                                i3 = length;
                                                i4 = i11;
                                                j2 = j4;
                                                i5 = i12;
                                                DerivedState<?> derivedState2 = (DerivedState) obj7;
                                                Object obj10 = hashMap.get(derivedState2);
                                                SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                                                if (policy2 == null) {
                                                    policy2 = SnapshotStateKt.structuralEqualityPolicy();
                                                }
                                                if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj10)) {
                                                    this.statesToReread.add(derivedState2);
                                                } else {
                                                    Object obj11 = mutableScatterMap4.get(derivedState2);
                                                    if (obj11 != null) {
                                                        if (obj11 instanceof MutableScatterSet) {
                                                            MutableScatterSet mutableScatterSet4 = (MutableScatterSet) obj11;
                                                            Object[] objArr8 = mutableScatterSet4.elements;
                                                            long[] jArr8 = mutableScatterSet4.metadata;
                                                            int length4 = jArr8.length - 2;
                                                            if (length4 >= 0) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    long j7 = jArr8[i21];
                                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j7 & 255) < 128) {
                                                                                mutableScatterSet.add(objArr8[(i21 << 3) + i23]);
                                                                                z = true;
                                                                            }
                                                                            j7 >>= 8;
                                                                        }
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i21 == length4) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                }
                                                            }
                                                        } else {
                                                            mutableScatterSet.add(obj11);
                                                            z = true;
                                                        }
                                                    }
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                            }
                                            obj3 = obj4;
                                        }
                                        str2 = str4;
                                        obj4 = obj6;
                                        i3 = length;
                                        i4 = i11;
                                        j2 = j4;
                                        i5 = i12;
                                        obj3 = obj4;
                                    } else {
                                        str2 = str4;
                                        i3 = length;
                                        i4 = i11;
                                        j2 = j4;
                                        i5 = i12;
                                        obj3 = obj6;
                                    }
                                    Object obj12 = mutableScatterMap4.get(obj3);
                                    if (obj12 != null) {
                                        if (obj12 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj12;
                                            Object[] objArr9 = mutableScatterSet5.elements;
                                            long[] jArr9 = mutableScatterSet5.metadata;
                                            int length5 = jArr9.length - 2;
                                            if (length5 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    long j8 = jArr9[i24];
                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                        for (int i26 = 0; i26 < i25; i26++) {
                                                            if ((j8 & 255) < 128) {
                                                                mutableScatterSet.add(objArr9[(i24 << 3) + i26]);
                                                                z = true;
                                                            }
                                                            j8 >>= 8;
                                                        }
                                                        if (i25 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i24 == length5) {
                                                        break;
                                                    }
                                                    i24++;
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj12);
                                            z = true;
                                        }
                                    }
                                    i6 = 8;
                                } else {
                                    jArr4 = jArr5;
                                    objArr4 = objArr5;
                                    str2 = str4;
                                    i3 = length;
                                    i4 = i11;
                                    j2 = j4;
                                    i5 = i12;
                                    i6 = i10;
                                }
                                j4 = j2 >> i6;
                                i13++;
                                objArr5 = objArr4;
                                i10 = i6;
                                jArr5 = jArr4;
                                length = i3;
                                i11 = i4;
                                i12 = i5;
                                str4 = str2;
                            }
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            int i27 = length;
                            int i28 = i11;
                            if (i12 != i10) {
                                break;
                            }
                            length = i27;
                            i2 = i28;
                        } else {
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            i2 = i11;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i11 = i2 + 1;
                        objArr5 = objArr3;
                        jArr5 = jArr3;
                        str4 = str;
                        i10 = 8;
                    }
                } else {
                    z = false;
                }
            } else {
                Iterator it3 = changes.iterator();
                z = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).m240isReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(2))) {
                        if (ScopeMap.m209containsimpl(mutableScatterMap3, next) && (obj2 = mutableScatterMap3.get(next)) != null) {
                            if (obj2 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj2;
                                Object[] objArr10 = mutableScatterSet6.elements;
                                long[] jArr10 = mutableScatterSet6.metadata;
                                int length6 = jArr10.length - 2;
                                if (length6 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j9 = jArr10[i29];
                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length6)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j9 & 255) < 128) {
                                                    it2 = it3;
                                                    DerivedState<?> derivedState3 = (DerivedState) objArr10[(i29 << 3) + i31];
                                                    mutableScatterMap2 = mutableScatterMap3;
                                                    Intrinsics.checkNotNull(derivedState3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                    Object obj13 = hashMap.get(derivedState3);
                                                    SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                                    if (policy3 == null) {
                                                        policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                                    }
                                                    jArr2 = jArr10;
                                                    objArr2 = objArr10;
                                                    if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj13)) {
                                                        j = j9;
                                                        this.statesToReread.add(derivedState3);
                                                    } else {
                                                        Object obj14 = mutableScatterMap4.get(derivedState3);
                                                        if (obj14 != null) {
                                                            if (obj14 instanceof MutableScatterSet) {
                                                                MutableScatterSet mutableScatterSet7 = (MutableScatterSet) obj14;
                                                                Object[] objArr11 = mutableScatterSet7.elements;
                                                                long[] jArr11 = mutableScatterSet7.metadata;
                                                                int length7 = jArr11.length - 2;
                                                                if (length7 >= 0) {
                                                                    j = j9;
                                                                    int i32 = 0;
                                                                    boolean z5 = z;
                                                                    while (true) {
                                                                        long j10 = jArr11[i32];
                                                                        long[] jArr12 = jArr11;
                                                                        Object[] objArr12 = objArr11;
                                                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i33 = 8 - ((~(i32 - length7)) >>> 31);
                                                                            for (int i34 = 0; i34 < i33; i34++) {
                                                                                if ((j10 & 255) < 128) {
                                                                                    mutableScatterSet.add(objArr12[(i32 << 3) + i34]);
                                                                                    z5 = true;
                                                                                }
                                                                                j10 >>= 8;
                                                                            }
                                                                            if (i33 != 8) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (i32 == length7) {
                                                                            break;
                                                                        }
                                                                        i32++;
                                                                        objArr11 = objArr12;
                                                                        jArr11 = jArr12;
                                                                    }
                                                                    z = z5;
                                                                }
                                                            } else {
                                                                j = j9;
                                                                mutableScatterSet.add(obj14);
                                                                z = true;
                                                            }
                                                            Unit unit4 = Unit.INSTANCE;
                                                        }
                                                        j = j9;
                                                        Unit unit42 = Unit.INSTANCE;
                                                    }
                                                } else {
                                                    it2 = it3;
                                                    mutableScatterMap2 = mutableScatterMap3;
                                                    jArr2 = jArr10;
                                                    objArr2 = objArr10;
                                                    j = j9;
                                                }
                                                j9 = j >> 8;
                                                i31++;
                                                it3 = it2;
                                                mutableScatterMap3 = mutableScatterMap2;
                                                jArr10 = jArr2;
                                                objArr10 = objArr2;
                                            }
                                            it = it3;
                                            mutableScatterMap = mutableScatterMap3;
                                            jArr = jArr10;
                                            objArr = objArr10;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            mutableScatterMap = mutableScatterMap3;
                                            jArr = jArr10;
                                            objArr = objArr10;
                                        }
                                        if (i29 == length6) {
                                            break;
                                        }
                                        i29++;
                                        it3 = it;
                                        mutableScatterMap3 = mutableScatterMap;
                                        jArr10 = jArr;
                                        objArr10 = objArr;
                                    }
                                }
                            } else {
                                it = it3;
                                mutableScatterMap = mutableScatterMap3;
                                DerivedState<?> derivedState4 = (DerivedState) obj2;
                                Object obj15 = hashMap.get(derivedState4);
                                SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                                if (policy4 == null) {
                                    policy4 = SnapshotStateKt.structuralEqualityPolicy();
                                }
                                if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj15)) {
                                    this.statesToReread.add(derivedState4);
                                } else {
                                    Object obj16 = mutableScatterMap4.get(derivedState4);
                                    if (obj16 != null) {
                                        if (obj16 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet8 = (MutableScatterSet) obj16;
                                            Object[] objArr13 = mutableScatterSet8.elements;
                                            long[] jArr13 = mutableScatterSet8.metadata;
                                            int length8 = jArr13.length - 2;
                                            if (length8 >= 0) {
                                                int i35 = 0;
                                                while (true) {
                                                    long j11 = jArr13[i35];
                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i36 = 8 - ((~(i35 - length8)) >>> 31);
                                                        for (int i37 = 0; i37 < i36; i37++) {
                                                            if ((j11 & 255) < 128) {
                                                                mutableScatterSet.add(objArr13[(i35 << 3) + i37]);
                                                                z = true;
                                                            }
                                                            j11 >>= 8;
                                                        }
                                                        if (i36 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i35 == length8) {
                                                        break;
                                                    }
                                                    i35++;
                                                }
                                            }
                                        } else {
                                            mutableScatterSet.add(obj16);
                                            z = true;
                                        }
                                    }
                                    Unit unit5 = Unit.INSTANCE;
                                }
                            }
                            obj = mutableScatterMap4.get(next);
                            if (obj != null) {
                                if (obj instanceof MutableScatterSet) {
                                    MutableScatterSet mutableScatterSet9 = (MutableScatterSet) obj;
                                    Object[] objArr14 = mutableScatterSet9.elements;
                                    long[] jArr14 = mutableScatterSet9.metadata;
                                    int length9 = jArr14.length - 2;
                                    if (length9 >= 0) {
                                        while (true) {
                                            long j12 = jArr14[i];
                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i38 = 8 - ((~(i - length9)) >>> 31);
                                                for (int i39 = 0; i39 < i38; i39++) {
                                                    if ((j12 & 255) < 128) {
                                                        mutableScatterSet.add(objArr14[(i << 3) + i39]);
                                                        z = true;
                                                    }
                                                    j12 >>= 8;
                                                }
                                                if (i38 != 8) {
                                                    break;
                                                }
                                            }
                                            i = i != length9 ? i + 1 : 0;
                                        }
                                    }
                                } else {
                                    mutableScatterSet.add(obj);
                                    z = true;
                                }
                                it3 = it;
                                mutableScatterMap3 = mutableScatterMap;
                            }
                        }
                        it = it3;
                        mutableScatterMap = mutableScatterMap3;
                        obj = mutableScatterMap4.get(next);
                        if (obj != null) {
                        }
                    } else {
                        it = it3;
                        mutableScatterMap = mutableScatterMap3;
                    }
                    it3 = it;
                    mutableScatterMap3 = mutableScatterMap;
                }
            }
            if (this.statesToReread.getSize() != 0) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                DerivedState<?>[] derivedStateArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i40 = 0; i40 < size; i40++) {
                    rereadDerivedState(derivedStateArr[i40]);
                }
                this.statesToReread.clear();
            }
            return z;
        }

        public final void recordRead(Object value) {
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj, mutableObjectIntMap);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(value, i, obj, mutableObjectIntMap);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void removeScopeIf(Function1<Object, Boolean> predicate) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            long j3;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = mutableScatterMap.keys[i6];
                            j2 = j5;
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i6];
                            Boolean invoke = predicate.invoke(obj);
                            if (invoke.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.keys;
                                int[] iArr = mutableObjectIntMap.values;
                                long[] jArr4 = mutableObjectIntMap.metadata;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    removeObservation(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                    if (invoke.booleanValue()) {
                                        mutableScatterMap.removeValueAt(i6);
                                    }
                                    i = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j = j4;
                            if (invoke.booleanValue()) {
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int hashCode = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            Object obj = this.valueToScopes.get(derivedState);
            if (obj == null) {
                return;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i2 = 1;
            int i3 = 0;
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(i3, i2, defaultConstructorMarker);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                    Unit unit = Unit.INSTANCE;
                }
                recordRead(derivedState, hashCode, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j = jArr3[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            i = i5;
                            Object obj2 = objArr[(i4 << 3) + i7];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap<>(i3, i2, defaultConstructorMarker);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, hashCode, obj2, mutableObjectIntMap);
                        } else {
                            jArr2 = jArr3;
                            i = i5;
                        }
                        j >>= i;
                        i7++;
                        i5 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i6 != i5) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i4 == length) {
                    return;
                }
                i4++;
                jArr3 = jArr;
            }
        }

        private final void recordRead(Object value, int currentToken, Object currentScope, MutableObjectIntMap<Object> recordedValues) {
            int i;
            int i2;
            int i3;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = recordedValues.put(value, currentToken, -1);
            int i4 = 2;
            if (!(value instanceof DerivedState) || put == currentToken) {
                i = 2;
                i2 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                MutableScatterMap<Object, Object> mutableScatterMap = this.dependencyToDerivedStates;
                ScopeMap.m217removeScopeimpl(mutableScatterMap, value);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    i3 = i4;
                                    StateObject stateObject = (StateObject) objArr[(i5 << 3) + i7];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m241recordReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(i3));
                                    }
                                    ScopeMap.m202addimpl(mutableScatterMap, stateObject, value);
                                } else {
                                    i3 = i4;
                                }
                                j >>= 8;
                                i7++;
                                i4 = i3;
                            }
                            i = i4;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            i = i4;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        i4 = i;
                    }
                } else {
                    i = 2;
                }
                i2 = -1;
            }
            if (put == i2) {
                if (value instanceof StateObjectImpl) {
                    ((StateObjectImpl) value).m241recordReadInh_f27i8$runtime(ReaderKind.m228constructorimpl(i));
                }
                ScopeMap.m202addimpl(this.valueToScopes, value, currentScope);
            }
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    observedScopeMapArr[i].clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
