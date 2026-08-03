package androidx.compose.runtime.snapshots;

/* compiled from: SnapshotStateList.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001QB\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u001d\u0010\u001c\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\b\u0010&\u001a\u00020 H\u0016J3\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\u001d2\u001e\u0010)\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*H\u0082\bJ\u0016\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0016\u0010-\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010.\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0017H\u0096\u0002¢\u0006\u0002\u0010/J\u0015\u00100\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u001dH\u0016J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0096\u0002J\u0015\u00105\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u0010!\u001a\u00020\u0017H\u0016J.\u00108\u001a\u0002H9\"\u0004\b\u0001\u001092\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u0002H90*H\u0082\b¢\u0006\u0002\u0010:J\"\u0010;\u001a\u00020\u001d2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u001d0*H\u0002J\u0010\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020\rH\u0016J\u0015\u0010>\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0016\u0010?\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0015\u0010@\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010/J\u0016\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0017J\u0016\u0010D\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J+\u0010E\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010F\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u0017H\u0000¢\u0006\u0002\bHJ\u001e\u0010I\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010JJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0017H\u0016J\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ3\u0010M\u001a\u00020 2\b\b\u0002\u0010(\u001a\u00020\u001d2\u001e\u0010)\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*H\u0082\bJ3\u0010N\u001a\u0002H9\"\u0004\b\u0001\u001092\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u0002H90*¢\u0006\u0002\bOH\u0082\b¢\u0006\u0002\u0010:J3\u0010P\u001a\u0002H9\"\u0004\b\u0001\u001092\u001d\u0010)\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u0002H90*¢\u0006\u0002\bOH\u0082\b¢\u0006\u0002\u0010:R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8AX\u0080\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006R"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "size", "", "getSize", "()I", "structure", "getStructure$runtime_release", "add", "", "element", "(Ljava/lang/Object;)Z", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "conditionalUpdate", "structural", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "mutate", "R", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mutateBoolean", "prependStateRecord", "value", "remove", "removeAll", "removeAt", "removeRange", "fromIndex", "toIndex", "retainAll", "retainAllInRange", "start", "end", "retainAllInRange$runtime_release", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "toList", "update", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements androidx.compose.runtime.snapshots.StateObject, java.util.List<T>, java.util.RandomAccess, kotlin.jvm.internal.markers.KMutableList {
    public static final int $stable = 0;
    private androidx.compose.runtime.snapshots.StateRecord firstStateRecord = new androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord(androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.persistentListOf());

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord stateRecord, androidx.compose.runtime.snapshots.StateRecord stateRecord2, androidx.compose.runtime.snapshots.StateRecord stateRecord3) {
        return androidx.compose.runtime.snapshots.StateObject.CC.$default$mergeRecords(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) value;
    }

    public final java.util.List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T> getReadable$runtime_release() {
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.readable((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord, this);
    }

    /* compiled from: SnapshotStateList.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "structuralChange", "getStructuralChange$runtime_release", "setStructuralChange$runtime_release", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StateListStateRecord<T> extends androidx.compose.runtime.snapshots.StateRecord {
        public static final int $stable = 8;
        private androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        public final void setList$runtime_release(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public StateListStateRecord(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        /* renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }

        /* renamed from: getStructuralChange$runtime_release, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void setStructuralChange$runtime_release(int i) {
            this.structuralChange = i;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(androidx.compose.runtime.snapshots.StateRecord value) {
            java.lang.Object obj;
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.list = ((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) value).list;
                this.modification = ((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) value).modification;
                this.structuralChange = ((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) value).structuralChange;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public androidx.compose.runtime.snapshots.StateRecord create() {
            return new androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord(this.list);
        }
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object element) {
        return getReadable$runtime_release().getList$runtime_release().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int index) {
        return (T) getReadable$runtime_release().getList$runtime_release().get(index);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object element) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object element) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(element);
    }

    @Override // java.util.List
    public java.util.ListIterator<T> listIterator() {
        return new androidx.compose.runtime.snapshots.StateListIterator(this, 0);
    }

    @Override // java.util.List
    public java.util.ListIterator<T> listIterator(int index) {
        return new androidx.compose.runtime.snapshots.StateListIterator(this, index);
    }

    @Override // java.util.List
    public java.util.List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > size()) {
            throw new java.lang.IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
        }
        return new androidx.compose.runtime.snapshots.SubList(this, fromIndex, toIndex);
    }

    @Override // java.util.List
    public boolean addAll(final int index, final java.util.Collection<? extends T> elements) {
        return mutateBoolean(new kotlin.jvm.functions.Function1<java.util.List<T>, java.lang.Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$addAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.util.List<T> list) {
                return java.lang.Boolean.valueOf(list.addAll(index, elements));
            }
        });
    }

    public T removeAt(int index) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        T t = get(index);
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> removeAt = list$runtime_release.removeAt(index);
            if (kotlin.jvm.internal.Intrinsics.areEqual(removeAt, list$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(removeAt);
                        z = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final java.util.Collection<? extends java.lang.Object> elements) {
        return mutateBoolean(new kotlin.jvm.functions.Function1<java.util.List<T>, java.lang.Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList$retainAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.util.List<T> list) {
                return java.lang.Boolean.valueOf(list.retainAll(elements));
            }
        });
    }

    @Override // java.util.List
    public T set(int index, T element) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        T t = get(index);
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> persistentList = list$runtime_release.set(index, (int) element);
            if (kotlin.jvm.internal.Intrinsics.areEqual(persistentList, list$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return t;
    }

    public final int retainAllInRange$runtime_release(java.util.Collection<? extends T> elements, int start, int end) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        int size = size();
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(start, end).retainAll(elements);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, list$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return size - size();
    }

    private final <R> R writable(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T>, ? extends R> block) {
        androidx.compose.runtime.snapshots.Snapshot current;
        R invoke;
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord;
        androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            try {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                invoke = block.invoke(androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord, this, current));
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

    private final <R> R withCurrent(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T>, ? extends R> block) {
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return block.invoke(androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord));
    }

    private final <R> R mutate(kotlin.jvm.functions.Function1<? super java.util.List<T>, ? extends R> block) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        R invoke;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = block.invoke(builder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, list$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateListStateRecord3.getModification() == modification) {
                                stateListStateRecord3.setList$runtime_release(build);
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                                stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
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

    private final boolean conditionalUpdate(boolean structural, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T>> block) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> invoke = block.invoke(list$runtime_release);
            z = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual(invoke, list$runtime_release)) {
                return false;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateListStateRecord3.getModification() == modification) {
                                stateListStateRecord3.setList$runtime_release(invoke);
                                if (structural) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                                z = true;
                            }
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                        } catch (java.lang.Throwable th2) {
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                            throw th2;
                        }
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th3) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    static /* synthetic */ boolean conditionalUpdate$default(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        java.lang.Object obj2;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        boolean z2;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj3;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    androidx.compose.runtime.snapshots.StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> persistentList = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList) function1.invoke(list$runtime_release);
            z2 = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual(persistentList, list$runtime_release)) {
                return false;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current);
                    obj3 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                    synchronized (obj3) {
                        try {
                            if (stateListStateRecord3.getModification() == modification) {
                                stateListStateRecord3.setList$runtime_release(persistentList);
                                if (z) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                                z2 = true;
                            }
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                        } catch (java.lang.Throwable th2) {
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                            throw th2;
                        }
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th3) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!z2);
        return true;
    }

    public final int getStructure$runtime_release() {
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord)).getStructuralChange();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> add = list$runtime_release.add((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T>) element);
            z = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual(add, list$runtime_release)) {
                return false;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(add);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        z = true;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public void add(int index, T element) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> add = list$runtime_release.add(index, (int) element);
            if (kotlin.jvm.internal.Intrinsics.areEqual(add, list$runtime_release)) {
                return;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(add);
                        z = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> elements) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> addAll = list$runtime_release.addAll(elements);
            z = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual(addAll, list$runtime_release)) {
                return false;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(addAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        z = true;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj;
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord;
        androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord, this, current);
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                stateListStateRecord2.setList$runtime_release(androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange() + 1);
            }
        }
        androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object element) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> remove = list$runtime_release.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T>) element);
            z = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual(remove, list$runtime_release)) {
                return false;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(remove);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        z = true;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> elements) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> removeAll = list$runtime_release.removeAll((java.util.Collection<? extends T>) elements);
            z = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual(removeAll, list$runtime_release)) {
                return false;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(removeAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        z = true;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    public final void removeRange(int fromIndex, int toIndex) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(fromIndex, toIndex).clear();
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, list$runtime_release)) {
                return;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
    }

    public final java.util.List<T> getDebuggerDisplayValue() {
        androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
        kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    private final boolean mutateBoolean(kotlin.jvm.functions.Function1<? super java.util.List<T>, java.lang.Boolean> block) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        java.lang.Boolean invoke;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = block.invoke(builder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> build = builder.build();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build, list$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
        return invoke.booleanValue();
    }

    private final void update(boolean structural, kotlin.jvm.functions.Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T>> block) {
        java.lang.Object obj;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        boolean z;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    androidx.compose.runtime.snapshots.StateRecord firstStateRecord = getFirstStateRecord();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> invoke = block.invoke(list$runtime_release);
            if (kotlin.jvm.internal.Intrinsics.areEqual(invoke, list$runtime_release)) {
                return;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateListStateRecord3.getModification() == modification) {
                                stateListStateRecord3.setList$runtime_release(invoke);
                                if (structural) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                        } catch (java.lang.Throwable th2) {
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                            throw th2;
                        }
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th3) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, this);
        } while (!z);
    }

    static /* synthetic */ void update$default(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        java.lang.Object obj2;
        int modification;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<T> list$runtime_release;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj3;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            obj2 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    androidx.compose.runtime.snapshots.StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord);
                    modification = stateListStateRecord.getModification();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends T> persistentList = (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList) function1.invoke(list$runtime_release);
            if (kotlin.jvm.internal.Intrinsics.areEqual(persistentList, list$runtime_release)) {
                return;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                try {
                    current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                    androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord stateListStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current);
                    obj3 = androidx.compose.runtime.snapshots.SnapshotStateListKt.sync;
                    synchronized (obj3) {
                        try {
                            if (stateListStateRecord3.getModification() == modification) {
                                stateListStateRecord3.setList$runtime_release(persistentList);
                                if (z) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                        } catch (java.lang.Throwable th2) {
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                            throw th2;
                        }
                    }
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                } catch (java.lang.Throwable th3) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!z2);
    }
}
