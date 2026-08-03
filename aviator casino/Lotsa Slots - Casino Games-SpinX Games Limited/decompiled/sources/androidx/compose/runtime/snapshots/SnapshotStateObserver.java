package androidx.compose.runtime.snapshots;

/* compiled from: SnapshotStateObserver.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00017B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0016\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002J\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0001J)\u0010!\u001a\u00020\u00052!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0003J\b\u0010#\u001a\u00020\u0015H\u0002J&\u0010$\u001a\u00020\u0011\"\b\b\u0000\u0010%*\u00020\u00012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001d\u0010'\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001e\u0010)\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010+\u001a\u00020\rH\u0007J?\u0010,\u001a\u00020\u0005\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010 \u001a\u0002H%2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002J\u001d\u00100\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\bJ\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0005H\u0002J\u0006\u00104\u001a\u00020\u0005J\u0006\u00105\u001a\u00020\u0005J\u0016\u00106\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMapThreadId", "", "isPaused", "", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "readObserver", "sendingNotifications", "addChanges", "set", "clear", "scope", "clearIf", "predicate", "drainChanges", "ensureMap", "T", "onChanged", "forEachScopeMap", "block", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "removeChanges", "removeScopeMapIf", "report", "", "sendNotifications", "start", "stop", "withNoObservations", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private androidx.compose.runtime.snapshots.ObserverHandle applyUnsubscribe;
    private androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap currentMap;
    private boolean isPaused;
    private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onChangedExecutor;
    private boolean sendingNotifications;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> pendingChanges = new java.util.concurrent.atomic.AtomicReference<>(null);
    private final kotlin.jvm.functions.Function2<java.util.Set<? extends java.lang.Object>, androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit> applyObserver = new kotlin.jvm.functions.Function2<java.util.Set<? extends java.lang.Object>, androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.Set<? extends java.lang.Object> set, androidx.compose.runtime.snapshots.Snapshot snapshot) {
            invoke2(set, snapshot);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.util.Set<? extends java.lang.Object> set, androidx.compose.runtime.snapshots.Snapshot snapshot) {
            boolean drainChanges;
            androidx.compose.runtime.snapshots.SnapshotStateObserver.this.addChanges(set);
            drainChanges = androidx.compose.runtime.snapshots.SnapshotStateObserver.this.drainChanges();
            if (drainChanges) {
                androidx.compose.runtime.snapshots.SnapshotStateObserver.this.sendNotifications();
            }
        }
    };
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
            invoke2(obj);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.lang.Object obj) {
            boolean z;
            androidx.compose.runtime.collection.MutableVector mutableVector;
            androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap observedScopeMap;
            z = androidx.compose.runtime.snapshots.SnapshotStateObserver.this.isPaused;
            if (z) {
                return;
            }
            mutableVector = androidx.compose.runtime.snapshots.SnapshotStateObserver.this.observedScopeMaps;
            androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver = androidx.compose.runtime.snapshots.SnapshotStateObserver.this;
            synchronized (mutableVector) {
                observedScopeMap = snapshotStateObserver.currentMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    };
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> observedScopeMaps = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            java.util.Set<? extends java.lang.Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        if (!content[i].recordInvalidation(removeChanges) && !z2) {
                            z2 = false;
                            i++;
                        }
                        z2 = true;
                        i++;
                    } while (i < size);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.runtime.collection.MutableVector mutableVector;
                boolean z;
                boolean drainChanges;
                androidx.compose.runtime.collection.MutableVector mutableVector2;
                do {
                    mutableVector = androidx.compose.runtime.snapshots.SnapshotStateObserver.this.observedScopeMaps;
                    androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver = androidx.compose.runtime.snapshots.SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        z = snapshotStateObserver.sendingNotifications;
                        if (!z) {
                            snapshotStateObserver.sendingNotifications = true;
                            try {
                                mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                int size = mutableVector2.getSize();
                                if (size > 0) {
                                    java.lang.Object[] content = mutableVector2.getContent();
                                    int i = 0;
                                    do {
                                        ((androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                                        i++;
                                    } while (i < size);
                                }
                                snapshotStateObserver.sendingNotifications = false;
                            } finally {
                            }
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    drainChanges = androidx.compose.runtime.snapshots.SnapshotStateObserver.this.drainChanges();
                } while (drainChanges);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(java.util.Set<? extends java.lang.Object> set) {
        java.lang.Object obj;
        java.util.List plus;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                plus = set;
            } else if (obj instanceof java.util.Set) {
                plus = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.util.Set[]{obj, set});
            } else {
                if (!(obj instanceof java.util.List)) {
                    report();
                    throw new kotlin.KotlinNothingValueException();
                }
                plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) obj, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(set));
            }
        } while (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.pendingChanges, obj, plus));
    }

    private final java.util.Set<java.lang.Object> removeChanges() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.Set<java.lang.Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof java.util.Set) {
                set = (java.util.Set) obj;
            } else if (obj instanceof java.util.List) {
                java.util.List list = (java.util.List) obj;
                java.util.Set<java.lang.Object> set2 = (java.util.Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new kotlin.KotlinNothingValueException();
            }
        } while (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.pendingChanges, obj, obj2));
        return set;
    }

    private final java.lang.Void report() {
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpected notification");
        throw new kotlin.KotlinNothingValueException();
    }

    private final void forEachScopeMap(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap, kotlin.Unit> block) {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        block.invoke(content[i]);
                        i++;
                    } while (i < size);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
    }

    private final void removeScopeMapIf(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap, java.lang.Boolean> block) {
        synchronized (this.observedScopeMaps) {
            try {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (block.invoke(mutableVector.getContent()[i2]).booleanValue()) {
                        i++;
                    } else if (i > 0) {
                        mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                    }
                }
                int i3 = size - i;
                kotlin.collections.ArraysKt.fill(mutableVector.getContent(), (java.lang.Object) null, i3, size);
                mutableVector.setSize(i3);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
    }

    public final <T> void observeReads(T scope, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onValueChangedForScope, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap ensureMap;
        synchronized (this.observedScopeMaps) {
            ensureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.currentMap;
        long j = this.currentMapThreadId;
        if (j != -1 && j != androidx.compose.runtime.ActualJvm_jvmKt.currentThreadId()) {
            throw new java.lang.IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + androidx.compose.runtime.ActualJvm_jvmKt.currentThreadId() + ", name=" + androidx.compose.runtime.ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = java.lang.Thread.currentThread().getId();
            ensureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
            this.currentMapThreadId = j;
        }
    }

    @kotlin.Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @kotlin.ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void start() {
        this.applyUnsubscribe = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        androidx.compose.runtime.snapshots.ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void notifyChanges(java.util.Set<? extends java.lang.Object> changes, androidx.compose.runtime.snapshots.Snapshot snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    private final <T> androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap ensureMap(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onChanged) {
        androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap observedScopeMap;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap[] content = mutableVector.getContent();
            int i = 0;
            do {
                observedScopeMap = content[i];
                if (observedScopeMap.getOnChanged() == onChanged) {
                    break;
                }
                i++;
            } while (i < size);
        }
        observedScopeMap = null;
        androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap observedScopeMap3 = new androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotStateObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001f\u001a\u00020\u0004J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001H\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0004J0\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)J\u0014\u0010*\u001a\u00020$2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001J.\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0002J\u0018\u00100\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002J)\u00101\u001a\u00020\u00042!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020$0\u0003J\u0012\u00105\u001a\u00020\u00042\n\u00106\u001a\u0006\u0012\u0002\b\u00030\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R6\u0010\u0017\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "dependencyToDerivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "deriveStateScopeCount", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "invalidated", "Landroidx/collection/MutableScatterSet;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "valueToScopes", "clear", "clearObsoleteStateReads", "scope", "clearScopeObservations", "hasScopeObservations", "", "notifyInvalidatedScopes", "observe", "readObserver", "block", "Lkotlin/Function0;", "recordInvalidation", "changes", "", "recordRead", "value", "recordedValues", "removeObservation", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", "name", "rereadDerivedState", "derivedState", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ObservedScopeMap {
        private java.lang.Object currentScope;
        private androidx.collection.MutableObjectIntMap<java.lang.Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> onChanged;
        private int currentToken = -1;
        private final androidx.compose.runtime.collection.ScopeMap<java.lang.Object> valueToScopes = new androidx.compose.runtime.collection.ScopeMap<>();
        private final androidx.collection.MutableScatterMap<java.lang.Object, androidx.collection.MutableObjectIntMap<java.lang.Object>> scopeToValues = new androidx.collection.MutableScatterMap<>(0, 1, null);
        private final androidx.collection.MutableScatterSet<java.lang.Object> invalidated = new androidx.collection.MutableScatterSet<>(0, 1, null);
        private final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedState<?>> statesToReread = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.runtime.DerivedState[16], 0);
        private final androidx.compose.runtime.DerivedStateObserver derivedStateObserver = new androidx.compose.runtime.DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(androidx.compose.runtime.DerivedState<?> derivedState) {
                int i;
                androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap observedScopeMap = androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.this;
                i = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i + 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(androidx.compose.runtime.DerivedState<?> derivedState) {
                int i;
                androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap observedScopeMap = androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.this;
                i = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i - 1;
            }
        };
        private final androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> dependencyToDerivedStates = new androidx.compose.runtime.collection.ScopeMap<>();
        private final java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> recordedDerivedStateValues = new java.util.HashMap<>();

        public ObservedScopeMap(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1) {
            this.onChanged = function1;
        }

        public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getOnChanged() {
            return this.onChanged;
        }

        public final androidx.compose.runtime.DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final void recordRead(java.lang.Object value) {
            java.lang.Object obj = this.currentScope;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            int i = this.currentToken;
            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj, mutableObjectIntMap);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            recordRead(value, i, obj, mutableObjectIntMap);
        }

        private final void recordRead(java.lang.Object value, int currentToken, java.lang.Object currentScope, androidx.collection.MutableObjectIntMap<java.lang.Object> recordedValues) {
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = recordedValues.put(value, currentToken, -1);
            if ((value instanceof androidx.compose.runtime.DerivedState) && put != currentToken) {
                androidx.compose.runtime.DerivedState.Record currentRecord = ((androidx.compose.runtime.DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies = currentRecord.getDependencies();
                androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> scopeMap = this.dependencyToDerivedStates;
                scopeMap.removeScope(value);
                java.lang.Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j & 255) < 128) {
                                    androidx.compose.runtime.snapshots.StateObject stateObject = (androidx.compose.runtime.snapshots.StateObject) objArr[(i << 3) + i3];
                                    if (stateObject instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                                        androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                                        ((androidx.compose.runtime.snapshots.StateObjectImpl) stateObject).m1747recordReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(2));
                                    }
                                    scopeMap.add(stateObject, value);
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
            }
            if (put == -1) {
                if (value instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                    androidx.compose.runtime.snapshots.ReaderKind.Companion companion2 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                    ((androidx.compose.runtime.snapshots.StateObjectImpl) value).m1747recordReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(2));
                }
                this.valueToScopes.add(value, currentScope);
            }
        }

        public final void observe(java.lang.Object scope, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
            java.lang.Object obj = this.currentScope;
            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getId();
            }
            androidx.compose.runtime.DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                androidx.compose.runtime.snapshots.Snapshot.INSTANCE.observe(readObserver, null, block);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                java.lang.Object obj2 = this.currentScope;
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i;
            } catch (java.lang.Throwable th) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        private final void clearObsoleteStateReads(java.lang.Object scope) {
            int i = this.currentToken;
            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = this.currentScopeReads;
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
                            java.lang.Object obj = mutableObjectIntMap.keys[i5];
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

        public final void clearScopeObservations(java.lang.Object scope) {
            androidx.collection.MutableObjectIntMap<java.lang.Object> remove = this.scopeToValues.remove(scope);
            if (remove == null) {
                return;
            }
            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = remove;
            java.lang.Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
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
                            java.lang.Object obj = objArr[i4];
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

        public final void removeScopeIf(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> predicate) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.collection.MutableObjectIntMap<java.lang.Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j3 = jArr3[i4];
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            java.lang.Object obj = mutableScatterMap.keys[i7];
                            androidx.collection.MutableObjectIntMap mutableObjectIntMap = (androidx.collection.MutableObjectIntMap) mutableScatterMap.values[i7];
                            java.lang.Boolean invoke = predicate.invoke(obj);
                            if (invoke.booleanValue()) {
                                androidx.collection.MutableObjectIntMap mutableObjectIntMap2 = mutableObjectIntMap;
                                java.lang.Object[] objArr = mutableObjectIntMap2.keys;
                                int[] iArr = mutableObjectIntMap2.values;
                                long[] jArr4 = mutableObjectIntMap2.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i3 = i5;
                                    int i8 = 0;
                                    while (true) {
                                        long j5 = jArr4[i8];
                                        i2 = i4;
                                        j = j3;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j5 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    java.lang.Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    removeObservation(obj, obj2);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i9 != 8) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        i4 = i2;
                                        j3 = j;
                                    }
                                } else {
                                    i2 = i4;
                                    j = j3;
                                    i3 = i5;
                                    j2 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i4;
                                j = j3;
                                i3 = i5;
                                j2 = j4;
                            }
                            if (invoke.booleanValue()) {
                                mutableScatterMap.removeValueAt(i7);
                            }
                        } else {
                            jArr2 = jArr3;
                            i2 = i4;
                            j = j3;
                            i3 = i5;
                            j2 = j4;
                        }
                        j3 = j >> 8;
                        i6++;
                        j4 = j2;
                        jArr3 = jArr2;
                        i5 = i3;
                        i4 = i2;
                    }
                    jArr = jArr3;
                    int i13 = i4;
                    if (i5 != 8) {
                        return;
                    } else {
                        i = i13;
                    }
                } else {
                    jArr = jArr3;
                    i = i4;
                }
                if (i == length) {
                    return;
                }
                i4 = i + 1;
                jArr3 = jArr;
            }
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        private final void removeObservation(java.lang.Object scope, java.lang.Object value) {
            this.valueToScopes.remove(value, scope);
            if (!(value instanceof androidx.compose.runtime.DerivedState) || this.valueToScopes.contains(value)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x02d6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x027d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean recordInvalidation(java.util.Set<? extends java.lang.Object> changes) {
            boolean z;
            java.util.Iterator it;
            java.lang.Object obj;
            java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> hashMap;
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> scopeMap;
            java.lang.String str;
            int i;
            char c;
            java.lang.Object obj2;
            char c2;
            java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> hashMap2;
            long[] jArr;
            java.lang.Object[] objArr;
            java.util.Iterator it2;
            java.lang.Object obj3;
            java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> hashMap3;
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> scopeMap2;
            long[] jArr2;
            java.lang.Object[] objArr2;
            int i2;
            java.lang.String str2;
            long[] jArr3;
            long[] jArr4;
            char c3;
            int i3;
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> scopeMap3;
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object> scopeMap4;
            java.lang.Object[] objArr3;
            java.lang.String str3;
            int i4;
            java.lang.Object obj4;
            java.lang.Object obj5;
            int i5;
            char c4;
            java.lang.Object obj6;
            char c5;
            long[] jArr5;
            java.lang.Object[] objArr4;
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object> scopeMap5;
            java.lang.Object[] objArr5;
            java.lang.String str4;
            long[] jArr6;
            int i6;
            java.lang.Object obj7;
            java.lang.Object[] objArr6;
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object> scopeMap6;
            char c6;
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> scopeMap7 = this.dependencyToDerivedStates;
            java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> hashMap4 = this.recordedDerivedStateValues;
            androidx.compose.runtime.collection.ScopeMap<java.lang.Object> scopeMap8 = this.valueToScopes;
            androidx.collection.MutableScatterSet<java.lang.Object> mutableScatterSet = this.invalidated;
            java.lang.String str5 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            char c7 = 7;
            int i7 = 2;
            int i8 = 0;
            if (changes instanceof androidx.compose.runtime.collection.IdentityArraySet) {
                androidx.compose.runtime.collection.IdentityArraySet identityArraySet = (androidx.compose.runtime.collection.IdentityArraySet) changes;
                java.lang.Object[] values = identityArraySet.getValues();
                int size = identityArraySet.size();
                int i9 = 0;
                z = false;
                while (i9 < size) {
                    java.lang.Object obj8 = values[i9];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (obj8 instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                        androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                        if (!((androidx.compose.runtime.snapshots.StateObjectImpl) obj8).m1746isReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(i7))) {
                            i3 = size;
                            scopeMap3 = scopeMap7;
                            scopeMap4 = scopeMap8;
                            objArr3 = values;
                            str3 = str5;
                            i4 = i9;
                            i9 = i4 + 1;
                            scopeMap7 = scopeMap3;
                            size = i3;
                            values = objArr3;
                            str5 = str3;
                            scopeMap8 = scopeMap4;
                            c7 = 7;
                            i7 = 2;
                        }
                    }
                    if (scopeMap7.contains(obj8) && (obj6 = scopeMap7.getMap().get(obj8)) != null) {
                        if (obj6 instanceof androidx.collection.MutableScatterSet) {
                            androidx.collection.MutableScatterSet mutableScatterSet2 = (androidx.collection.MutableScatterSet) obj6;
                            java.lang.Object[] objArr7 = mutableScatterSet2.elements;
                            long[] jArr7 = mutableScatterSet2.metadata;
                            int length = jArr7.length - i7;
                            if (length >= 0) {
                                int i10 = length;
                                int i11 = 0;
                                while (true) {
                                    long j = jArr7[i11];
                                    i3 = size;
                                    scopeMap3 = scopeMap7;
                                    if ((((~j) << c7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - i10)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j & 255) < 128) {
                                                androidx.compose.runtime.DerivedState<?> derivedState = (androidx.compose.runtime.DerivedState) objArr7[(i11 << 3) + i13];
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(derivedState, str5);
                                                objArr5 = values;
                                                java.lang.Object obj9 = hashMap4.get(derivedState);
                                                androidx.compose.runtime.SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                if (policy == null) {
                                                    policy = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
                                                }
                                                jArr6 = jArr7;
                                                objArr6 = objArr7;
                                                if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj9)) {
                                                    scopeMap5 = scopeMap8;
                                                    str4 = str5;
                                                    i6 = i9;
                                                    obj7 = obj8;
                                                    this.statesToReread.add(derivedState);
                                                } else {
                                                    java.lang.Object obj10 = scopeMap8.getMap().get(derivedState);
                                                    if (obj10 != null) {
                                                        if (obj10 instanceof androidx.collection.MutableScatterSet) {
                                                            androidx.collection.MutableScatterSet mutableScatterSet3 = (androidx.collection.MutableScatterSet) obj10;
                                                            java.lang.Object[] objArr8 = mutableScatterSet3.elements;
                                                            long[] jArr8 = mutableScatterSet3.metadata;
                                                            int length2 = jArr8.length - 2;
                                                            if (length2 >= 0) {
                                                                i6 = i9;
                                                                obj7 = obj8;
                                                                int i14 = 0;
                                                                while (true) {
                                                                    long j2 = jArr8[i14];
                                                                    long[] jArr9 = jArr8;
                                                                    str4 = str5;
                                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                                        int i16 = 0;
                                                                        while (i16 < i15) {
                                                                            if ((j2 & 255) < 128) {
                                                                                scopeMap6 = scopeMap8;
                                                                                mutableScatterSet.add(objArr8[(i14 << 3) + i16]);
                                                                                c6 = '\b';
                                                                                z = true;
                                                                            } else {
                                                                                scopeMap6 = scopeMap8;
                                                                                c6 = '\b';
                                                                            }
                                                                            j2 >>= c6;
                                                                            i16++;
                                                                            scopeMap8 = scopeMap6;
                                                                        }
                                                                        scopeMap5 = scopeMap8;
                                                                        if (i15 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        scopeMap5 = scopeMap8;
                                                                    }
                                                                    if (i14 != length2) {
                                                                        i14++;
                                                                        str5 = str4;
                                                                        jArr8 = jArr9;
                                                                        scopeMap8 = scopeMap5;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            scopeMap5 = scopeMap8;
                                                            str4 = str5;
                                                            i6 = i9;
                                                            obj7 = obj8;
                                                            mutableScatterSet.add(obj10);
                                                            z = true;
                                                        }
                                                    }
                                                    scopeMap5 = scopeMap8;
                                                    str4 = str5;
                                                    i6 = i9;
                                                    obj7 = obj8;
                                                }
                                            } else {
                                                scopeMap5 = scopeMap8;
                                                objArr5 = values;
                                                str4 = str5;
                                                jArr6 = jArr7;
                                                i6 = i9;
                                                obj7 = obj8;
                                                objArr6 = objArr7;
                                            }
                                            j >>= 8;
                                            i13++;
                                            values = objArr5;
                                            i9 = i6;
                                            jArr7 = jArr6;
                                            objArr7 = objArr6;
                                            obj8 = obj7;
                                            str5 = str4;
                                            scopeMap8 = scopeMap5;
                                        }
                                        scopeMap4 = scopeMap8;
                                        objArr3 = values;
                                        str3 = str5;
                                        jArr5 = jArr7;
                                        i4 = i9;
                                        obj4 = obj8;
                                        objArr4 = objArr7;
                                        if (i12 != 8) {
                                            break;
                                        }
                                    } else {
                                        scopeMap4 = scopeMap8;
                                        objArr3 = values;
                                        str3 = str5;
                                        jArr5 = jArr7;
                                        i4 = i9;
                                        obj4 = obj8;
                                        objArr4 = objArr7;
                                    }
                                    int i17 = i10;
                                    if (i11 == i17) {
                                        break;
                                    }
                                    i11++;
                                    i10 = i17;
                                    scopeMap7 = scopeMap3;
                                    size = i3;
                                    values = objArr3;
                                    i9 = i4;
                                    jArr7 = jArr5;
                                    objArr7 = objArr4;
                                    obj8 = obj4;
                                    str5 = str3;
                                    scopeMap8 = scopeMap4;
                                    c7 = 7;
                                }
                            }
                        } else {
                            i3 = size;
                            scopeMap3 = scopeMap7;
                            scopeMap4 = scopeMap8;
                            objArr3 = values;
                            str3 = str5;
                            i4 = i9;
                            obj4 = obj8;
                            androidx.compose.runtime.DerivedState<?> derivedState2 = (androidx.compose.runtime.DerivedState) obj6;
                            java.lang.Object obj11 = hashMap4.get(derivedState2);
                            androidx.compose.runtime.SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                            if (policy2 == null) {
                                policy2 = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
                            }
                            if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj11)) {
                                this.statesToReread.add(derivedState2);
                            } else {
                                java.lang.Object obj12 = scopeMap4.getMap().get(derivedState2);
                                if (obj12 != null) {
                                    if (obj12 instanceof androidx.collection.MutableScatterSet) {
                                        androidx.collection.MutableScatterSet mutableScatterSet4 = (androidx.collection.MutableScatterSet) obj12;
                                        java.lang.Object[] objArr9 = mutableScatterSet4.elements;
                                        long[] jArr10 = mutableScatterSet4.metadata;
                                        int length3 = jArr10.length - 2;
                                        if (length3 >= 0) {
                                            int i18 = 0;
                                            while (true) {
                                                long j3 = jArr10[i18];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                    for (int i20 = 0; i20 < i19; i20++) {
                                                        if ((j3 & 255) < 128) {
                                                            mutableScatterSet.add(objArr9[(i18 << 3) + i20]);
                                                            c5 = '\b';
                                                            z = true;
                                                        } else {
                                                            c5 = '\b';
                                                        }
                                                        j3 >>= c5;
                                                    }
                                                    if (i19 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i18 == length3) {
                                                    break;
                                                }
                                                i18++;
                                            }
                                        }
                                    } else {
                                        mutableScatterSet.add(obj12);
                                        z = true;
                                    }
                                }
                            }
                        }
                        obj5 = scopeMap4.getMap().get(obj4);
                        if (obj5 != null) {
                            if (obj5 instanceof androidx.collection.MutableScatterSet) {
                                androidx.collection.MutableScatterSet mutableScatterSet5 = (androidx.collection.MutableScatterSet) obj5;
                                java.lang.Object[] objArr10 = mutableScatterSet5.elements;
                                long[] jArr11 = mutableScatterSet5.metadata;
                                int length4 = jArr11.length - 2;
                                if (length4 >= 0) {
                                    while (true) {
                                        long j4 = jArr11[i5];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i21 = 8 - ((~(i5 - length4)) >>> 31);
                                            for (int i22 = 0; i22 < i21; i22++) {
                                                if ((j4 & 255) < 128) {
                                                    mutableScatterSet.add(objArr10[(i5 << 3) + i22]);
                                                    c4 = '\b';
                                                    z = true;
                                                } else {
                                                    c4 = '\b';
                                                }
                                                j4 >>= c4;
                                            }
                                            if (i21 != 8) {
                                                break;
                                            }
                                        }
                                        i5 = i5 != length4 ? i5 + 1 : 0;
                                    }
                                }
                            } else {
                                mutableScatterSet.add(obj5);
                                z = true;
                            }
                        }
                        i9 = i4 + 1;
                        scopeMap7 = scopeMap3;
                        size = i3;
                        values = objArr3;
                        str5 = str3;
                        scopeMap8 = scopeMap4;
                        c7 = 7;
                        i7 = 2;
                    }
                    i3 = size;
                    scopeMap3 = scopeMap7;
                    scopeMap4 = scopeMap8;
                    objArr3 = values;
                    str3 = str5;
                    i4 = i9;
                    obj4 = obj8;
                    obj5 = scopeMap4.getMap().get(obj4);
                    if (obj5 != null) {
                    }
                    i9 = i4 + 1;
                    scopeMap7 = scopeMap3;
                    size = i3;
                    values = objArr3;
                    str5 = str3;
                    scopeMap8 = scopeMap4;
                    c7 = 7;
                    i7 = 2;
                }
            } else {
                androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> scopeMap9 = scopeMap7;
                java.lang.String str6 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
                java.util.Iterator it3 = changes.iterator();
                z = false;
                while (it3.hasNext()) {
                    java.lang.Object next = it3.next();
                    if (next instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                        androidx.compose.runtime.snapshots.ReaderKind.Companion companion2 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                        if (!((androidx.compose.runtime.snapshots.StateObjectImpl) next).m1746isReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(2))) {
                            it = it3;
                            hashMap = hashMap4;
                            scopeMap = scopeMap9;
                            str = str6;
                            hashMap4 = hashMap;
                            str6 = str;
                            scopeMap9 = scopeMap;
                            it3 = it;
                        }
                    }
                    androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> scopeMap10 = scopeMap9;
                    if (!scopeMap10.contains(next) || (obj2 = scopeMap10.getMap().get(next)) == null) {
                        it = it3;
                        obj = next;
                        hashMap = hashMap4;
                        scopeMap = scopeMap10;
                        str = str6;
                    } else if (obj2 instanceof androidx.collection.MutableScatterSet) {
                        androidx.collection.MutableScatterSet mutableScatterSet6 = (androidx.collection.MutableScatterSet) obj2;
                        java.lang.Object[] objArr11 = mutableScatterSet6.elements;
                        long[] jArr12 = mutableScatterSet6.metadata;
                        int length5 = jArr12.length - 2;
                        if (length5 >= 0) {
                            int i23 = 0;
                            while (true) {
                                long j5 = jArr12[i23];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i24 = 8 - ((~(i23 - length5)) >>> 31);
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        if ((j5 & 255) < 128) {
                                            androidx.compose.runtime.DerivedState<?> derivedState3 = (androidx.compose.runtime.DerivedState) objArr11[(i23 << 3) + i25];
                                            str2 = str6;
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(derivedState3, str2);
                                            it2 = it3;
                                            java.lang.Object obj13 = hashMap4.get(derivedState3);
                                            androidx.compose.runtime.SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                            if (policy3 == null) {
                                                policy3 = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
                                            }
                                            scopeMap2 = scopeMap10;
                                            jArr2 = jArr12;
                                            if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj13)) {
                                                obj3 = next;
                                                hashMap3 = hashMap4;
                                                objArr2 = objArr11;
                                                i2 = length5;
                                                this.statesToReread.add(derivedState3);
                                            } else {
                                                java.lang.Object obj14 = scopeMap8.getMap().get(derivedState3);
                                                if (obj14 != null) {
                                                    if (obj14 instanceof androidx.collection.MutableScatterSet) {
                                                        androidx.collection.MutableScatterSet mutableScatterSet7 = (androidx.collection.MutableScatterSet) obj14;
                                                        java.lang.Object[] objArr12 = mutableScatterSet7.elements;
                                                        long[] jArr13 = mutableScatterSet7.metadata;
                                                        int length6 = jArr13.length - 2;
                                                        if (length6 >= 0) {
                                                            obj3 = next;
                                                            hashMap3 = hashMap4;
                                                            int i26 = 0;
                                                            while (true) {
                                                                long j6 = jArr13[i26];
                                                                objArr2 = objArr11;
                                                                i2 = length5;
                                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i27 = 8 - ((~(i26 - length6)) >>> 31);
                                                                    int i28 = 0;
                                                                    while (i28 < i27) {
                                                                        if ((j6 & 255) < 128) {
                                                                            jArr4 = jArr13;
                                                                            mutableScatterSet.add(objArr12[(i26 << 3) + i28]);
                                                                            c3 = '\b';
                                                                            z = true;
                                                                        } else {
                                                                            jArr4 = jArr13;
                                                                            c3 = '\b';
                                                                        }
                                                                        j6 >>= c3;
                                                                        i28++;
                                                                        jArr13 = jArr4;
                                                                    }
                                                                    jArr3 = jArr13;
                                                                    if (i27 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr3 = jArr13;
                                                                }
                                                                if (i26 != length6) {
                                                                    i26++;
                                                                    objArr11 = objArr2;
                                                                    length5 = i2;
                                                                    jArr13 = jArr3;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        obj3 = next;
                                                        hashMap3 = hashMap4;
                                                        objArr2 = objArr11;
                                                        i2 = length5;
                                                        mutableScatterSet.add(obj14);
                                                        z = true;
                                                    }
                                                }
                                                obj3 = next;
                                                hashMap3 = hashMap4;
                                                objArr2 = objArr11;
                                                i2 = length5;
                                            }
                                        } else {
                                            it2 = it3;
                                            obj3 = next;
                                            hashMap3 = hashMap4;
                                            scopeMap2 = scopeMap10;
                                            jArr2 = jArr12;
                                            objArr2 = objArr11;
                                            i2 = length5;
                                            str2 = str6;
                                        }
                                        j5 >>= 8;
                                        i25++;
                                        it3 = it2;
                                        str6 = str2;
                                        hashMap4 = hashMap3;
                                        scopeMap10 = scopeMap2;
                                        jArr12 = jArr2;
                                        next = obj3;
                                        objArr11 = objArr2;
                                        length5 = i2;
                                    }
                                    it = it3;
                                    obj = next;
                                    hashMap2 = hashMap4;
                                    scopeMap = scopeMap10;
                                    jArr = jArr12;
                                    objArr = objArr11;
                                    int i29 = length5;
                                    str = str6;
                                    if (i24 != 8) {
                                        break;
                                    }
                                    length5 = i29;
                                } else {
                                    it = it3;
                                    obj = next;
                                    hashMap2 = hashMap4;
                                    scopeMap = scopeMap10;
                                    jArr = jArr12;
                                    objArr = objArr11;
                                    str = str6;
                                }
                                if (i23 == length5) {
                                    break;
                                }
                                i23++;
                                it3 = it;
                                str6 = str;
                                hashMap4 = hashMap2;
                                scopeMap10 = scopeMap;
                                jArr12 = jArr;
                                next = obj;
                                objArr11 = objArr;
                            }
                        } else {
                            it = it3;
                            obj = next;
                            hashMap2 = hashMap4;
                            scopeMap = scopeMap10;
                            str = str6;
                        }
                        hashMap = hashMap2;
                    } else {
                        it = it3;
                        obj = next;
                        scopeMap = scopeMap10;
                        str = str6;
                        androidx.compose.runtime.DerivedState<?> derivedState4 = (androidx.compose.runtime.DerivedState) obj2;
                        hashMap = hashMap4;
                        java.lang.Object obj15 = hashMap.get(derivedState4);
                        androidx.compose.runtime.SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                        if (policy4 == null) {
                            policy4 = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj15)) {
                            this.statesToReread.add(derivedState4);
                        } else {
                            java.lang.Object obj16 = scopeMap8.getMap().get(derivedState4);
                            if (obj16 != null) {
                                if (obj16 instanceof androidx.collection.MutableScatterSet) {
                                    androidx.collection.MutableScatterSet mutableScatterSet8 = (androidx.collection.MutableScatterSet) obj16;
                                    java.lang.Object[] objArr13 = mutableScatterSet8.elements;
                                    long[] jArr14 = mutableScatterSet8.metadata;
                                    int length7 = jArr14.length - 2;
                                    if (length7 >= 0) {
                                        int i30 = 0;
                                        while (true) {
                                            long j7 = jArr14[i30];
                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                for (int i32 = 0; i32 < i31; i32++) {
                                                    if ((j7 & 255) < 128) {
                                                        mutableScatterSet.add(objArr13[(i30 << 3) + i32]);
                                                        c2 = '\b';
                                                        z = true;
                                                    } else {
                                                        c2 = '\b';
                                                    }
                                                    j7 >>= c2;
                                                }
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                        }
                                    }
                                } else {
                                    mutableScatterSet.add(obj16);
                                    z = true;
                                }
                            }
                        }
                    }
                    java.lang.Object obj17 = scopeMap8.getMap().get(obj);
                    if (obj17 != null) {
                        if (obj17 instanceof androidx.collection.MutableScatterSet) {
                            androidx.collection.MutableScatterSet mutableScatterSet9 = (androidx.collection.MutableScatterSet) obj17;
                            java.lang.Object[] objArr14 = mutableScatterSet9.elements;
                            long[] jArr15 = mutableScatterSet9.metadata;
                            int length8 = jArr15.length - 2;
                            if (length8 >= 0) {
                                while (true) {
                                    long j8 = jArr15[i];
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i33 = 8 - ((~(i - length8)) >>> 31);
                                        for (int i34 = 0; i34 < i33; i34++) {
                                            if ((j8 & 255) < 128) {
                                                mutableScatterSet.add(objArr14[(i << 3) + i34]);
                                                c = '\b';
                                                z = true;
                                            } else {
                                                c = '\b';
                                            }
                                            j8 >>= c;
                                        }
                                        if (i33 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length8 ? i + 1 : 0;
                                }
                            }
                        } else {
                            mutableScatterSet.add(obj17);
                            z = true;
                        }
                        hashMap4 = hashMap;
                        str6 = str;
                        scopeMap9 = scopeMap;
                        it3 = it;
                    }
                    hashMap4 = hashMap;
                    str6 = str;
                    scopeMap9 = scopeMap;
                    it3 = it;
                }
            }
            if (this.statesToReread.isNotEmpty()) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedState<?>> mutableVector = this.statesToReread;
                int size2 = mutableVector.getSize();
                if (size2 > 0) {
                    androidx.compose.runtime.DerivedState<?>[] content = mutableVector.getContent();
                    while (true) {
                        rereadDerivedState(content[i8]);
                        int i35 = i8 + 1;
                        if (i35 >= size2) {
                            break;
                        }
                        i8 = i35;
                    }
                }
                this.statesToReread.clear();
            }
            return z;
        }

        public final void rereadDerivedState(androidx.compose.runtime.DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap;
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.collection.MutableObjectIntMap<java.lang.Object>> mutableScatterMap = this.scopeToValues;
            int id = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getId();
            java.lang.Object obj = this.valueToScopes.getMap().get(derivedState);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof androidx.collection.MutableScatterSet)) {
                androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                recordRead(derivedState, id, obj, mutableObjectIntMap2);
                return;
            }
            androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj;
            java.lang.Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j & 255) < 128) {
                            java.lang.Object obj2 = objArr[(i << 3) + i3];
                            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, id, obj2, mutableObjectIntMap);
                        } else {
                            jArr2 = jArr3;
                        }
                        j >>= 8;
                        i3++;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i2 != 8) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i == length) {
                    return;
                }
                i++;
                jArr3 = jArr;
            }
        }

        public final void notifyInvalidatedScopes() {
            androidx.collection.MutableScatterSet<java.lang.Object> mutableScatterSet = this.invalidated;
            androidx.collection.MutableScatterSet<java.lang.Object> mutableScatterSet2 = mutableScatterSet;
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1 = this.onChanged;
            java.lang.Object[] objArr = mutableScatterSet2.elements;
            long[] jArr = mutableScatterSet2.metadata;
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
    }

    public final void clear(java.lang.Object scope) {
        synchronized (this.observedScopeMaps) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                mutableVector.getContent()[i2].clearScopeObservations(scope);
                if (!r5.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                }
            }
            int i3 = size - i;
            kotlin.collections.ArraysKt.fill(mutableVector.getContent(), (java.lang.Object) null, i3, size);
            mutableVector.setSize(i3);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void clearIf(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> predicate) {
        synchronized (this.observedScopeMaps) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                mutableVector.getContent()[i2].removeScopeIf(predicate);
                if (!r5.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                }
            }
            int i3 = size - i;
            kotlin.collections.ArraysKt.fill(mutableVector.getContent(), (java.lang.Object) null, i3, size);
            mutableVector.setSize(i3);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].clear();
                    i++;
                } while (i < size);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
