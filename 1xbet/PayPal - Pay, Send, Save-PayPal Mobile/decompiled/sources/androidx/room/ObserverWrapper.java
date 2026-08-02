package androidx.room;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/room/ObserverWrapper;", "", "Landroidx/room/InvalidationTracker$Observer;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "notifyByTableIds$room_runtime", "(Ljava/util/Set;)V", "invalidatedTablesNames", "notifyByTableNames$room_runtime", "Landroidx/room/InvalidationTracker$Observer;", "getObserver$room_runtime", "()Landroidx/room/InvalidationTracker$Observer;", "[I", "getTableIds$room_runtime", "()[I", "getHighSpeedVideoSizes", "[Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObserverWrapper {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String[] getHighSpeedVideoSizes;
    private final androidx.room.InvalidationTracker.Observer observer;
    private final int[] tableIds;

    public ObserverWrapper(androidx.room.InvalidationTracker.Observer observer, int[] iArr, java.lang.String[] strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        this.observer = observer;
        this.tableIds = iArr;
        this.getHighSpeedVideoSizes = strArr;
        if (iArr.length != strArr.length) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.getHighSpeedVideoFpsRangesFor = strArr.length == 0 ? kotlin.collections.SetsKt.emptySet() : kotlin.collections.SetsKt.setOf(strArr[0]);
    }

    /* renamed from: getObserver$room_runtime, reason: from getter */
    public final androidx.room.InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    /* renamed from: getTableIds$room_runtime, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime(java.util.Set<java.lang.Integer> invalidatedTablesIds) {
        java.util.Set<java.lang.String> emptySet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidatedTablesIds, "");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i = 0;
            if (length == 1) {
                emptySet = invalidatedTablesIds.contains(java.lang.Integer.valueOf(iArr[0])) ? this.getHighSpeedVideoFpsRangesFor : kotlin.collections.SetsKt.emptySet();
            } else {
                java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i2 = 0;
                while (i < length2) {
                    if (invalidatedTablesIds.contains(java.lang.Integer.valueOf(iArr2[i]))) {
                        createSetBuilder.add(this.getHighSpeedVideoSizes[i2]);
                    }
                    i++;
                    i2++;
                }
                emptySet = kotlin.collections.SetsKt.build(createSetBuilder);
            }
        } else {
            emptySet = kotlin.collections.SetsKt.emptySet();
        }
        if (emptySet.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(emptySet);
    }

    public final void notifyByTableNames$room_runtime(java.util.Set<java.lang.String> invalidatedTablesNames) {
        java.util.Set<java.lang.String> emptySet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidatedTablesNames, "");
        int length = this.getHighSpeedVideoSizes.length;
        if (length == 0) {
            emptySet = kotlin.collections.SetsKt.emptySet();
        } else if (length == 1) {
            java.util.Set<java.lang.String> set = invalidatedTablesNames;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.StringsKt.equals((java.lang.String) it.next(), this.getHighSpeedVideoSizes[0], true)) {
                        emptySet = this.getHighSpeedVideoFpsRangesFor;
                        break;
                    }
                }
            }
            emptySet = kotlin.collections.SetsKt.emptySet();
        } else {
            java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
            for (java.lang.String str : invalidatedTablesNames) {
                java.lang.String[] strArr = this.getHighSpeedVideoSizes;
                int length2 = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length2) {
                        java.lang.String str2 = strArr[i];
                        if (kotlin.text.StringsKt.equals(str2, str, true)) {
                            createSetBuilder.add(str2);
                            break;
                        }
                        i++;
                    }
                }
            }
            emptySet = kotlin.collections.SetsKt.build(createSetBuilder);
        }
        if (emptySet.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(emptySet);
    }
}
