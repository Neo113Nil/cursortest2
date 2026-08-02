package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001*B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\f\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010#\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\u001a\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "Lkotlin/Function0;", "p0", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "Landroidx/compose/runtime/snapshots/StateRecord;", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getHighResolutionOutputSizeshNQ4ISI", "getValue", "()Ljava/lang/Object;", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "getHighSpeedVideoSizesFor", "ResultRecord"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DerivedSnapshotState<T> extends androidx.compose.runtime.snapshots.StateObjectImpl implements androidx.compose.runtime.DerivedState<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.SnapshotMutationPolicy<T> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> Camera2StreamConfigurationMap = new androidx.compose.runtime.DerivedSnapshotState.ResultRecord<>(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId());

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(kotlin.jvm.functions.Function0<? extends T> function0, androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoFpsRangesFor = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.DerivedState
    public final androidx.compose.runtime.SnapshotMutationPolicy<T> getPolicy() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000 9*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00019B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00172\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u00060\u0004j\u0002`\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010\u001f\u001a\u00020\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u0014\u00108\u001a\u00028\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00101"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "isValid", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)Z", "", "readableHash", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I", "validSnapshotId", "J", "getValidSnapshotId", "()J", "setValidSnapshotId", "validSnapshotWriteCount", com.visa.cbp.getEncExpo.warmup, "getValidSnapshotWriteCount", "()I", "setValidSnapshotWriteCount", "(I)V", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "dependencies", "Landroidx/collection/ObjectIntMap;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "resultHash", "getResultHash", "setResultHash", "getCurrentValue", "currentValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResultRecord<T> extends androidx.compose.runtime.snapshots.StateRecord implements androidx.compose.runtime.DerivedState.Record<T> {
        private androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies;
        private java.lang.Object result;
        private int resultHash;
        private long validSnapshotId;
        private int validSnapshotWriteCount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Companion INSTANCE = new androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Companion(null);
        public static final int $stable = 8;
        private static final java.lang.Object Unset = new java.lang.Object();

        public ResultRecord(long j) {
            super(j);
            this.dependencies = androidx.collection.ObjectIntMapKt.emptyObjectIntMap();
            this.result = Unset;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "getUnset", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.Object getUnset() {
                return androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Unset;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final long getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final void setValidSnapshotId(long j) {
            this.validSnapshotId = j;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.validSnapshotWriteCount = i;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public final androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> getDependencies() {
            return this.dependencies;
        }

        public final void setDependencies(androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> objectIntMap) {
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
        public final void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            androidx.compose.runtime.DerivedSnapshotState.ResultRecord resultRecord = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) value;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create() {
            return create(androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final androidx.compose.runtime.snapshots.StateRecord create(long snapshotId) {
            return new androidx.compose.runtime.DerivedSnapshotState.ResultRecord(snapshotId);
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public final T getCurrentValue() {
            return (T) this.result;
        }

        public final boolean isValid(androidx.compose.runtime.DerivedState<?> derivedState, androidx.compose.runtime.snapshots.Snapshot snapshot) {
            boolean z;
            boolean z2;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                z = false;
                if (this.validSnapshotId == snapshot.getSnapshotId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.result != Unset && (!z2 || this.resultHash == readableHash(derivedState, snapshot))) {
                z = true;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                this.validSnapshotId = snapshot.getSnapshotId();
                this.validSnapshotWriteCount = snapshot.getWriteCount();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return true;
        }

        public final int readableHash(androidx.compose.runtime.DerivedState<?> derivedState, androidx.compose.runtime.snapshots.Snapshot snapshot) {
            androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies;
            int i;
            int i2;
            androidx.compose.runtime.snapshots.StateRecord current;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            char c = 7;
            if (!dependencies.isNotEmpty()) {
                return 7;
            }
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
            androidx.compose.runtime.DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i3 = 0; i3 < size; i3++) {
                derivedStateObserverArr[i3].start(derivedState);
            }
            try {
                java.lang.Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    i2 = 7;
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    androidx.compose.runtime.snapshots.StateObject stateObject = (androidx.compose.runtime.snapshots.StateObject) objArr[i8];
                                    if (iArr[i8] == 1) {
                                        if (stateObject instanceof androidx.compose.runtime.DerivedSnapshotState) {
                                            current = ((androidx.compose.runtime.DerivedSnapshotState) stateObject).Camera2StreamConfigurationMap(snapshot);
                                        } else {
                                            current = androidx.compose.runtime.snapshots.SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                        }
                                        i2 = (((i2 * 31) + androidx.compose.runtime.internal.System_jvmKt.identityHashCode(current)) * 31) + java.lang.Long.hashCode(current.getSnapshotId());
                                    }
                                }
                                j >>= 8;
                                i7++;
                                i5 = 8;
                            }
                            if (i6 != i5) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            i = i2;
                            break;
                        }
                        i4++;
                        c = 7;
                    }
                } else {
                    i = 7;
                }
                i2 = i;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return i2;
            } finally {
                androidx.compose.runtime.DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                for (int i9 = 0; i9 < size2; i9++) {
                    derivedStateObserverArr2[i9].done(derivedState);
                }
            }
        }
    }

    public final androidx.compose.runtime.snapshots.StateRecord Camera2StreamConfigurationMap(androidx.compose.runtime.snapshots.Snapshot p0) {
        return getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.Camera2StreamConfigurationMap, p0), p0, false, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> p0, androidx.compose.runtime.snapshots.Snapshot p1, boolean p2, kotlin.jvm.functions.Function0<? extends T> p3) {
        androidx.compose.runtime.internal.SnapshotThreadLocal snapshotThreadLocal;
        androidx.compose.runtime.internal.SnapshotThreadLocal snapshotThreadLocal2;
        androidx.compose.runtime.SnapshotMutationPolicy<T> policy;
        androidx.compose.runtime.internal.SnapshotThreadLocal snapshotThreadLocal3;
        androidx.compose.runtime.internal.SnapshotThreadLocal snapshotThreadLocal4;
        int i;
        androidx.compose.runtime.internal.SnapshotThreadLocal snapshotThreadLocal5;
        androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T> resultRecord = p0;
        androidx.compose.runtime.DerivedSnapshotState<T> derivedSnapshotState = this;
        if (!resultRecord.isValid(derivedSnapshotState, p1)) {
            final androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
            snapshotThreadLocal = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.internal.IntRef intRef = (androidx.compose.runtime.internal.IntRef) snapshotThreadLocal.get();
            if (intRef == null) {
                intRef = new androidx.compose.runtime.internal.IntRef(0);
                snapshotThreadLocal3 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.getHighSpeedVideoFpsRanges;
                snapshotThreadLocal3.set(intRef);
            }
            final int element = intRef.getElement();
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
            androidx.compose.runtime.DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers.content;
            int size = derivedStateObservers.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                derivedStateObserverArr[i2].start(derivedSnapshotState);
            }
            try {
                intRef.setElement(element + 1);
                java.lang.Object observe = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.observe(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.DerivedSnapshotState$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.DerivedSnapshotState.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.DerivedSnapshotState.this, intRef, mutableObjectIntMap, element, obj);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }, null, p3);
                intRef.setElement(element);
                androidx.compose.runtime.DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers.content;
                int size2 = derivedStateObservers.getSize();
                for (int i3 = 0; i3 < size2; i3++) {
                    derivedStateObserverArr2[i3].done(derivedSnapshotState);
                }
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    androidx.compose.runtime.snapshots.Snapshot current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    if (p0.getResult() != androidx.compose.runtime.DerivedSnapshotState.ResultRecord.INSTANCE.getUnset() && (policy = getPolicy()) != 0 && policy.equivalent(observe, p0.getResult())) {
                        resultRecord.setDependencies(mutableObjectIntMap);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                    } else {
                        resultRecord = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.newWritableRecord(this.Camera2StreamConfigurationMap, this, current);
                        resultRecord.setDependencies(mutableObjectIntMap);
                        resultRecord.setResultHash(resultRecord.readableHash(this, current));
                        resultRecord.setResult(observe);
                    }
                }
                snapshotThreadLocal2 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.getHighSpeedVideoFpsRanges;
                androidx.compose.runtime.internal.IntRef intRef2 = (androidx.compose.runtime.internal.IntRef) snapshotThreadLocal2.get();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return resultRecord;
                }
                androidx.compose.runtime.snapshots.Snapshot.INSTANCE.notifyObjectsInitialized();
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    androidx.compose.runtime.snapshots.Snapshot current2 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    resultRecord.setValidSnapshotId(current2.getSnapshotId());
                    resultRecord.setValidSnapshotWriteCount(current2.getWriteCount());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return resultRecord;
            } catch (java.lang.Throwable th) {
                androidx.compose.runtime.DerivedStateObserver[] derivedStateObserverArr3 = derivedStateObservers.content;
                int size3 = derivedStateObservers.getSize();
                for (int i4 = 0; i4 < size3; i4++) {
                    derivedStateObserverArr3[i4].done(derivedSnapshotState);
                }
                throw th;
            }
        }
        if (p2) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.DerivedStateObserver> derivedStateObservers2 = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers();
            androidx.compose.runtime.DerivedStateObserver[] derivedStateObserverArr4 = derivedStateObservers2.content;
            int size4 = derivedStateObservers2.getSize();
            for (int i5 = 0; i5 < size4; i5++) {
                derivedStateObserverArr4[i5].start(derivedSnapshotState);
            }
            try {
                androidx.collection.ObjectIntMap<androidx.compose.runtime.snapshots.StateObject> dependencies = p0.getDependencies();
                snapshotThreadLocal4 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.getHighSpeedVideoFpsRanges;
                androidx.compose.runtime.internal.IntRef intRef3 = (androidx.compose.runtime.internal.IntRef) snapshotThreadLocal4.get();
                if (intRef3 == null) {
                    intRef3 = new androidx.compose.runtime.internal.IntRef(0);
                    snapshotThreadLocal5 = androidx.compose.runtime.SnapshotStateKt__DerivedStateKt.getHighSpeedVideoFpsRanges;
                    snapshotThreadLocal5.set(intRef3);
                }
                int element2 = intRef3.getElement();
                java.lang.Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    androidx.compose.runtime.snapshots.StateObject stateObject = (androidx.compose.runtime.snapshots.StateObject) objArr[i10];
                                    intRef3.setElement(element2 + iArr[i10]);
                                    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = p1.getReadObserver();
                                    if (readObserver != null) {
                                        readObserver.invoke(stateObject);
                                    }
                                    i = 8;
                                } else {
                                    i = i7;
                                }
                                j >>= i;
                                i9++;
                                i7 = i;
                            }
                            if (i8 != i7) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        jArr = jArr2;
                    }
                }
                intRef3.setElement(element2);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
                androidx.compose.runtime.DerivedStateObserver[] derivedStateObserverArr5 = derivedStateObservers2.content;
                int size5 = derivedStateObservers2.getSize();
                for (int i11 = 0; i11 < size5; i11++) {
                    derivedStateObserverArr5[i11].done(derivedSnapshotState);
                }
            }
        }
        return resultRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.DerivedSnapshotState derivedSnapshotState, androidx.compose.runtime.internal.IntRef intRef, androidx.collection.MutableObjectIntMap mutableObjectIntMap, int i, java.lang.Object obj) {
        if (obj == derivedSnapshotState) {
            throw new java.lang.IllegalStateException("A derived state calculation cannot read itself".toString());
        }
        if (obj instanceof androidx.compose.runtime.snapshots.StateObject) {
            mutableObjectIntMap.set(obj, java.lang.Math.min(intRef.getElement() - i, mutableObjectIntMap.getOrDefault(obj, Integer.MAX_VALUE)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
        this.Camera2StreamConfigurationMap = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) p0;
    }

    @Override // androidx.compose.runtime.State
    public final T getValue() {
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        androidx.compose.runtime.snapshots.Snapshot current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
        return (T) getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.Camera2StreamConfigurationMap, current), current, true, this.getHighSpeedVideoFpsRanges).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    public final androidx.compose.runtime.DerivedState.Record<T> getCurrentRecord() {
        androidx.compose.runtime.snapshots.Snapshot current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
        return getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.Camera2StreamConfigurationMap, current), current, false, this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DerivedState(value=");
        sb.append(Camera2StreamConfigurationMap());
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    private final java.lang.String Camera2StreamConfigurationMap() {
        androidx.compose.runtime.DerivedSnapshotState.ResultRecord resultRecord = (androidx.compose.runtime.DerivedSnapshotState.ResultRecord) androidx.compose.runtime.snapshots.SnapshotKt.current(this.Camera2StreamConfigurationMap);
        if (resultRecord.isValid(this, androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent())) {
            return java.lang.String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }
}
