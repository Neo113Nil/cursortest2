package androidx.compose.runtime.snapshots;

/* compiled from: SnapshotStateMap.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001LB\u0005¢\u0006\u0002\u0010\u0005J.\u0010&\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020'0)H\u0080\b¢\u0006\u0002\b+J.\u0010,\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020'0)H\u0080\b¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020'2\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u0015\u00103\u001a\u00020'2\u0006\u00104\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00102J\u0018\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00106J\b\u00107\u001a\u00020'H\u0016J4\u00108\u001a\u0002H9\"\u0004\b\u0002\u001092\u001e\u0010:\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002H90)H\u0082\b¢\u0006\u0002\u0010;J\u0010\u0010<\u001a\u00020/2\u0006\u00104\u001a\u00020\u0011H\u0016J\u001f\u0010=\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010>J\u001e\u0010?\u001a\u00020/2\u0014\u0010@\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010A\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00106J.\u0010B\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00020'0)H\u0080\b¢\u0006\u0002\bCJ\u0017\u0010D\u001a\u00020'2\u0006\u00104\u001a\u00028\u0001H\u0000¢\u0006\u0004\bE\u00102J\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007J5\u0010G\u001a\u00020/2*\u0010:\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010H\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010H0)H\u0082\bJ9\u0010I\u001a\u0002H9\"\u0004\b\u0002\u001092#\u0010:\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u0002H90)¢\u0006\u0002\bJH\u0082\b¢\u0006\u0002\u0010;J9\u0010K\u001a\u0002H9\"\u0004\b\u0002\u001092#\u0010:\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u0002H90)¢\u0006\u0002\bJH\u0082\b¢\u0006\u0002\u0010;R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078AX\u0080\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateObject;", "", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/Map;", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "getKeys", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "all", "", "predicate", "Lkotlin/Function1;", "", "all$runtime_release", "any", "any$runtime_release", "clear", "", "containsKey", com.ironsource.X3.i.W, "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "mutate", "R", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "prependStateRecord", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "remove", "removeIf", "removeIf$runtime_release", "removeValue", "removeValue$runtime_release", "toMap", "update", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements androidx.compose.runtime.snapshots.StateObject, java.util.Map<K, V>, kotlin.jvm.internal.markers.KMutableMap {
    public static final int $stable = 0;
    private androidx.compose.runtime.snapshots.StateRecord firstStateRecord = new androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord(androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.persistentHashMapOf());
    private final java.util.Set<java.util.Map.Entry<K, V>> entries = new androidx.compose.runtime.snapshots.SnapshotMapEntrySet(this);
    private final java.util.Set<K> keys = new androidx.compose.runtime.snapshots.SnapshotMapKeySet(this);
    private final java.util.Collection<V> values = new androidx.compose.runtime.snapshots.SnapshotMapValueSet(this);

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord stateRecord, androidx.compose.runtime.snapshots.StateRecord stateRecord2, androidx.compose.runtime.snapshots.StateRecord stateRecord3) {
        return androidx.compose.runtime.snapshots.StateObject.CC.$default$mergeRecords(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) value;
    }

    public final java.util.Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object key) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object value) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(value);
    }

    @Override // java.util.Map
    public V get(java.lang.Object key) {
        return (V) getReadable$runtime_release().getMap$runtime_release().get(key);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    public java.util.Set<K> getKeys() {
        return this.keys;
    }

    public java.util.Collection<V> getValues() {
        return this.values;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification();
    }

    public final boolean removeValue$runtime_release(V value) {
        java.lang.Object obj;
        java.util.Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map.Entry) obj).getValue(), value)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K, V> getReadable$runtime_release() {
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord, this);
    }

    public final boolean any$runtime_release(kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> predicate) {
        java.util.Iterator<E> it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (predicate.invoke((java.util.Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean all$runtime_release(kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, java.lang.Boolean> predicate) {
        java.util.Iterator<E> it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((java.util.Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    private final <R> R withCurrent(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K, V>, ? extends R> block) {
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return block.invoke(androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K, V>, ? extends R> block) {
        androidx.compose.runtime.snapshots.Snapshot current;
        R invoke;
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord;
        androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            try {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                invoke = block.invoke(androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord, this, current));
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    private final <R> R mutate(kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, ? extends R> block) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        R invoke;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification = stateMapStateRecord.getModification();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            invoke = block.invoke(builder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, map$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateMapStateRecord3.getModification() == modification) {
                                stateMapStateRecord3.setMap$runtime_release(build);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                        } finally {
                        }
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th2) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return invoke;
    }

    /* compiled from: SnapshotStateMap.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\b\u0000\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateRecord;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StateMapStateRecord<K, V> extends androidx.compose.runtime.snapshots.StateRecord {
        public static final int $stable = 8;
        private androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, ? extends V> map;
        private int modification;

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        public final void setMap$runtime_release(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public StateMapStateRecord(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        /* renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) value;
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public androidx.compose.runtime.snapshots.StateRecord create() {
            return new androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord(this.map);
        }
    }

    @Override // java.util.Map
    public void clear() {
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj;
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime_release();
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> persistentHashMapOf = androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                synchronized (obj) {
                    stateMapStateRecord3.setMap$runtime_release(persistentHashMapOf);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        V put;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            put = builder.put(key, value);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, map$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> from) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(from);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, map$runtime_release)) {
                return;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
    }

    @Override // java.util.Map
    public V remove(java.lang.Object key) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        V remove;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            remove = builder.remove(key);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, map$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return remove;
    }

    public final boolean removeIf$runtime_release(kotlin.jvm.functions.Function1<? super java.util.Map.Entry<K, V>, java.lang.Boolean> predicate) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        boolean z2 = false;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification = stateMapStateRecord.getModification();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = builder;
            for (java.util.Map.Entry<K, V> entry : entrySet()) {
                if (predicate.invoke(entry).booleanValue()) {
                    builder2.remove(entry.getKey());
                    z2 = true;
                }
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, map$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateMapStateRecord3.getModification() == modification) {
                                stateMapStateRecord3.setMap$runtime_release(build);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                        } finally {
                        }
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th2) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return z2;
    }

    public final java.util.Map<K, V> getDebuggerDisplayValue() {
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord)).getMap$runtime_release();
    }

    private final void update(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, ? extends V>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, ? extends V>> block) {
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj;
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, ? extends V> invoke = block.invoke(stateMapStateRecord.getMap$runtime_release());
        if (invoke != stateMapStateRecord.getMap$runtime_release()) {
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                    synchronized (obj) {
                        try {
                            stateMapStateRecord3.setMap$runtime_release(invoke);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                        } catch (java.lang.Throwable th) {
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                            throw th;
                        }
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th2) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        }
    }
}
