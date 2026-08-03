package androidx.compose.runtime;

/* compiled from: DerivedState.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001'B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ:\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020#H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011¨\u0006("}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "currentRecord", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "()Ljava/lang/Object;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "value", "getValue", "current", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readable", "forceDependencyReads", "", "displayValue", "", "prependStateRecord", "", "toString", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DerivedSnapshotState<T> extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.DerivedState<T> {
    private final kotlin.jvm.functions.Function0<T> calculation;
    private androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> first = new androidx.compose.runtime.DerivedSnapshotState.ResultRecord<>();
    private final androidx.compose.runtime.SnapshotMutationPolicy<T> policy;

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.DerivedState
    public androidx.compose.runtime.SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = function0;
        this.policy = snapshotMutationPolicy;
    }

    /* compiled from: DerivedState.kt */
    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001+B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J\u001a\u0010$\u001a\u00020%2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010(\u001a\u00020)J\u001a\u0010*\u001a\u00020\u00152\n\u0010&\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010(\u001a\u00020)R\u0014\u0010\u0005\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019¨\u0006,"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "()V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "dependencies", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "result", "", "getResult", "setResult", "(Ljava/lang/Object;)V", "resultHash", "", "getResultHash", "()I", "setResultHash", "(I)V", "validSnapshotId", "getValidSnapshotId", "setValidSnapshotId", "validSnapshotWriteCount", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "assign", "", "value", "create", "isValid", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readableHash", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ResultRecord<T> extends androidx.compose.runtime.snapshots.StateRecord implements androidx.compose.runtime.DerivedState.Record<T> {
        private androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies = androidx.collection.ObjectIntMapKt.emptyObjectIntMap();
        private java.lang.Object result = Unset;
        private int resultHash;
        private int validSnapshotId;
        private int validSnapshotWriteCount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Companion INSTANCE = new androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Companion(null);
        public static final int $stable = 8;
        private static final java.lang.Object Unset = new java.lang.Object();

        /* compiled from: DerivedState.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final java.lang.Object getUnset() {
                return androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Unset;
            }
        }

        public final int getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final void setValidSnapshotId(int i) {
            this.validSnapshotId = i;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.validSnapshotWriteCount = i;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> getDependencies() {
            return this.dependencies;
        }

        public void setDependencies(androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final java.lang.Object getResult() {
            return this.result;
        }

        public final void setResult(java.lang.Object obj) {
            this.result = obj;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            androidx.compose.runtime.DerivedSnapshotState.ResultRecord resultRecord = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) value;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public androidx.compose.runtime.snapshots.StateRecord create() {
            return new androidx.compose.runtime.DerivedSnapshotState.ResultRecord();
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        public final boolean isValid(androidx.compose.runtime.DerivedState<?> derivedState, androidx.compose.runtime.snapshots.Snapshot snapshot) {
            boolean z;
            boolean z2;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                z = false;
                if (this.validSnapshotId == snapshot.getId()) {
                    z2 = this.validSnapshotWriteCount != snapshot.getWriteCount();
                }
            }
            if (this.result != Unset && (!z2 || this.resultHash == readableHash(derivedState, snapshot))) {
                z = true;
            }
            if (z && z2) {
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    this.validSnapshotId = snapshot.getId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
            return z;
        }

        public final int readableHash(androidx.compose.runtime.DerivedState<?> derivedState, androidx.compose.runtime.snapshots.Snapshot snapshot) {
            androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies;
            int i;
            androidx.compose.runtime.snapshots.StateRecord current;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            char c = 7;
            if (!dependencies.isNotEmpty()) {
                return 7;
            }
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
            int size = derivedStateObservers.getSize();
            if (size > 0) {
                androidx.compose.runtime.DerivedStateObserver[] content = derivedStateObservers.getContent();
                int i2 = 0;
                do {
                    content[i2].start(derivedState);
                    i2++;
                } while (i2 < size);
            }
            try {
                java.lang.Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    int i4 = 7;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    androidx.compose.runtime.snapshots.StateObject stateObject = (androidx.compose.runtime.snapshots.StateObject) objArr[i7];
                                    if (iArr[i7] == 1) {
                                        if (stateObject instanceof androidx.compose.runtime.DerivedSnapshotState) {
                                            current = ((androidx.compose.runtime.DerivedSnapshotState) stateObject).current(snapshot);
                                        } else {
                                            current = androidx.compose.runtime.snapshots.SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                        }
                                        i4 = (((i4 * 31) + androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(current)) * 31) + current.getSnapshotId();
                                    }
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        c = 7;
                    }
                    i = i4;
                } else {
                    i = 7;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                int size2 = derivedStateObservers.getSize();
                if (size2 <= 0) {
                    return i;
                }
                androidx.compose.runtime.DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                int i8 = 0;
                do {
                    content2[i8].done(derivedState);
                    i8++;
                } while (i8 < size2);
                return i;
            } catch (java.lang.Throwable th) {
                int size3 = derivedStateObservers.getSize();
                if (size3 > 0) {
                    androidx.compose.runtime.DerivedStateObserver[] content3 = derivedStateObservers.getContent();
                    int i9 = 0;
                    do {
                        content3[i9].done(derivedState);
                        i9++;
                    } while (i9 < size3);
                }
                throw th;
            }
        }
    }

    public final androidx.compose.runtime.snapshots.StateRecord current(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        return currentRecord((androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> currentRecord(androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> readable, androidx.compose.runtime.snapshots.Snapshot snapshot, boolean forceDependencyReads, kotlin.jvm.functions.Function0<? extends T> calculation) {
        androidx.compose.runtime.SnapshotMutationPolicy<T> policy;
        androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> resultRecord = readable;
        androidx.compose.runtime.DerivedSnapshotState<T> derivedSnapshotState = this;
        if (!resultRecord.isValid(derivedSnapshotState, snapshot)) {
            int i = 0;
            final androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
            final androidx.compose.runtime.internal.IntRef intRef = (androidx.compose.runtime.internal.IntRef) androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef == null) {
                intRef = new androidx.compose.runtime.internal.IntRef(0);
                androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef);
            }
            final int element = intRef.getElement();
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
            int size = derivedStateObservers.getSize();
            if (size > 0) {
                androidx.compose.runtime.DerivedStateObserver[] content = derivedStateObservers.getContent();
                int i2 = 0;
                do {
                    content[i2].start(derivedSnapshotState);
                    i2++;
                } while (i2 < size);
            }
            try {
                intRef.setElement(element + 1);
                java.lang.Object observe = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.observe(new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$1$result$1
                    final /* synthetic */ androidx.compose.runtime.DerivedSnapshotState<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                        invoke2(obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(java.lang.Object obj) {
                        if (obj == this.this$0) {
                            throw new java.lang.IllegalStateException("A derived state calculation cannot read itself".toString());
                        }
                        if (obj instanceof androidx.compose.runtime.snapshots.StateObject) {
                            int element2 = intRef.getElement();
                            androidx.collection.MutableObjectIntMap<androidx.compose.runtime.snapshots.StateObject> mutableObjectIntMap2 = mutableObjectIntMap;
                            mutableObjectIntMap2.set(obj, java.lang.Math.min(element2 - element, mutableObjectIntMap2.getOrDefault(obj, Integer.MAX_VALUE)));
                        }
                    }
                }, null, calculation);
                intRef.setElement(element);
                int size2 = derivedStateObservers.getSize();
                if (size2 > 0) {
                    androidx.compose.runtime.DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                    do {
                        content2[i].done(derivedSnapshotState);
                        i++;
                    } while (i < size2);
                }
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    androidx.compose.runtime.snapshots.Snapshot current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    if (readable.getResult() != androidx.compose.runtime.DerivedSnapshotState.ResultRecord.INSTANCE.getUnset() && (policy = getPolicy()) != 0 && policy.equivalent(observe, readable.getResult())) {
                        resultRecord.setDependencies(mutableObjectIntMap);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                        resultRecord.setValidSnapshotId(snapshot.getId());
                        resultRecord.setValidSnapshotWriteCount(snapshot.getWriteCount());
                    } else {
                        resultRecord = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.newWritableRecord(this.first, this, current);
                        resultRecord.setDependencies(mutableObjectIntMap);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                        resultRecord.setValidSnapshotId(snapshot.getId());
                        resultRecord.setValidSnapshotWriteCount(snapshot.getWriteCount());
                        resultRecord.setResult(observe);
                    }
                }
                androidx.compose.runtime.internal.IntRef intRef2 = (androidx.compose.runtime.internal.IntRef) androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef2 != null && intRef2.getElement() == 0) {
                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.notifyObjectsInitialized();
                }
                return resultRecord;
            } catch (java.lang.Throwable th) {
                int size3 = derivedStateObservers.getSize();
                if (size3 > 0) {
                    androidx.compose.runtime.DerivedStateObserver[] content3 = derivedStateObservers.getContent();
                    do {
                        content3[i].done(derivedSnapshotState);
                        i++;
                    } while (i < size3);
                }
                throw th;
            }
        }
        if (forceDependencyReads) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers2 = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
            int size4 = derivedStateObservers2.getSize();
            if (size4 > 0) {
                androidx.compose.runtime.DerivedStateObserver[] content4 = derivedStateObservers2.getContent();
                int i3 = 0;
                do {
                    content4[i3].start(derivedSnapshotState);
                    i3++;
                } while (i3 < size4);
            }
            try {
                androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies = readable.getDependencies();
                androidx.compose.runtime.internal.IntRef intRef3 = (androidx.compose.runtime.internal.IntRef) androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef3 == null) {
                    intRef3 = new androidx.compose.runtime.internal.IntRef(0);
                    androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef3);
                }
                int element2 = intRef3.getElement();
                java.lang.Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    androidx.compose.runtime.snapshots.StateObject stateObject = (androidx.compose.runtime.snapshots.StateObject) objArr[i7];
                                    intRef3.setElement(element2 + iArr[i7]);
                                    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
                                    if (readObserver$runtime_release != null) {
                                        readObserver$runtime_release.invoke(stateObject);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        jArr = jArr2;
                    }
                }
                intRef3.setElement(element2);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                int size5 = derivedStateObservers2.getSize();
                if (size5 > 0) {
                    androidx.compose.runtime.DerivedStateObserver[] content5 = derivedStateObservers2.getContent();
                    int i8 = 0;
                    do {
                        content5[i8].done(derivedSnapshotState);
                        i8++;
                    } while (i8 < size5);
                }
            } catch (java.lang.Throwable th2) {
                int size6 = derivedStateObservers2.getSize();
                if (size6 > 0) {
                    androidx.compose.runtime.DerivedStateObserver[] content6 = derivedStateObservers2.getContent();
                    int i9 = 0;
                    do {
                        content6[i9].done(derivedSnapshotState);
                        i9++;
                    } while (i9 < size6);
                }
                throw th2;
            }
        }
        return resultRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) value;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver$runtime_release = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return (T) currentRecord((androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.first), androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent(), true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    public androidx.compose.runtime.DerivedState.Record<T> getCurrentRecord() {
        return currentRecord((androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.first), androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent(), false, this.calculation);
    }

    public java.lang.String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    public final T getDebuggerDisplayValue() {
        androidx.compose.runtime.DerivedSnapshotState.ResultRecord resultRecord = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    private final java.lang.String displayValue() {
        androidx.compose.runtime.DerivedSnapshotState.ResultRecord resultRecord = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent())) {
            return java.lang.String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }
}
