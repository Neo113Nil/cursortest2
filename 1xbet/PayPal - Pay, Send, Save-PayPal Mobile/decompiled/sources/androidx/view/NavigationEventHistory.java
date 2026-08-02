package androidx.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tB1\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013"}, d2 = {"Landroidx/navigationevent/NavigationEventHistory;", "", "", "Landroidx/navigationevent/NavigationEventInfo;", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "()V", "currentInfo", "backInfo", "forwardInfo", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "mergedHistory", "Ljava/util/List;", "getMergedHistory", "()Ljava/util/List;", "currentIndex", com.visa.cbp.getEncExpo.warmup, "getCurrentIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationEventHistory {
    private final int currentIndex;
    private final java.util.List<androidx.view.NavigationEventInfo> mergedHistory;

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationEventHistory(java.util.List<? extends androidx.view.NavigationEventInfo> list, int i) {
        this.mergedHistory = list;
        this.currentIndex = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        java.util.List<? extends androidx.view.NavigationEventInfo> list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '");
        sb.append(i);
        sb.append("', bounds = '");
        sb.append(kotlin.collections.CollectionsKt.getIndices(list2));
        sb.append("'.");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final java.util.List<androidx.view.NavigationEventInfo> getMergedHistory() {
        return this.mergedHistory;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public NavigationEventHistory() {
        this((java.util.List<? extends androidx.view.NavigationEventInfo>) kotlin.collections.CollectionsKt.emptyList(), -1);
    }

    public /* synthetic */ NavigationEventHistory(androidx.view.NavigationEventInfo navigationEventInfo, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationEventInfo, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationEventHistory(androidx.view.NavigationEventInfo navigationEventInfo, java.util.List<? extends androidx.view.NavigationEventInfo> list, java.util.List<? extends androidx.view.NavigationEventInfo> list2) {
        this((java.util.List<? extends androidx.view.NavigationEventInfo>) kotlin.collections.CollectionsKt.build(r0), list.size());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationEventInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.util.List list3 = createListBuilder;
        kotlin.collections.CollectionsKt.addAll(list3, list);
        list3.add(navigationEventInfo);
        kotlin.collections.CollectionsKt.addAll(list3, list2);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.view.NavigationEventHistory navigationEventHistory = (androidx.view.NavigationEventHistory) other;
        return this.currentIndex == navigationEventHistory.currentIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.mergedHistory, navigationEventHistory.mergedHistory);
    }

    public final int hashCode() {
        return (this.currentIndex * 31) + this.mergedHistory.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.currentIndex);
        sb.append(", mergedHistory=");
        sb.append(this.mergedHistory);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHistory(androidx.view.NavigationEventInfo navigationEventInfo, java.util.List<? extends androidx.view.NavigationEventInfo> list) {
        this(navigationEventInfo, list, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationEventInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHistory(androidx.view.NavigationEventInfo navigationEventInfo) {
        this(navigationEventInfo, null, null, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationEventInfo, "");
    }
}
