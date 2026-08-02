package androidx.coordinatorlayout.widget;

/* loaded from: classes7.dex */
public final class DirectedAcyclicGraph<T> {
    private final androidx.core.util.Pools.Pool<java.util.ArrayList<T>> getHighSpeedVideoFpsRangesFor = new androidx.core.util.Pools.SimplePool(10);
    final androidx.collection.SimpleArrayMap<T, java.util.ArrayList<T>> getHighSpeedVideoFpsRanges = new androidx.collection.SimpleArrayMap<>();
    private final java.util.ArrayList<T> getHighSpeedVideoSizes = new java.util.ArrayList<>();
    private final java.util.HashSet<T> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet<>();

    public final void addNode(T t) {
        if (this.getHighSpeedVideoFpsRanges.containsKey(t)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.put(t, null);
    }

    public final boolean contains(T t) {
        return this.getHighSpeedVideoFpsRanges.containsKey(t);
    }

    public final void addEdge(T t, T t2) {
        if (!this.getHighSpeedVideoFpsRanges.containsKey(t) || !this.getHighSpeedVideoFpsRanges.containsKey(t2)) {
            throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        java.util.ArrayList<T> arrayList = this.getHighSpeedVideoFpsRanges.get(t);
        if (arrayList == null) {
            arrayList = this.getHighSpeedVideoFpsRangesFor.acquire();
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
            }
            this.getHighSpeedVideoFpsRanges.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public final java.util.List<T> getOutgoingEdges(T t) {
        int camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap();
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < camera2StreamConfigurationMap; i++) {
            java.util.ArrayList<T> valueAt = this.getHighSpeedVideoFpsRanges.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(this.getHighSpeedVideoFpsRanges.keyAt(i));
            }
        }
        return arrayList;
    }

    public final boolean hasOutgoingEdges(T t) {
        int camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap();
        for (int i = 0; i < camera2StreamConfigurationMap; i++) {
            java.util.ArrayList<T> valueAt = this.getHighSpeedVideoFpsRanges.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void clear() {
        int camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap();
        for (int i = 0; i < camera2StreamConfigurationMap; i++) {
            java.util.ArrayList<T> valueAt = this.getHighSpeedVideoFpsRanges.valueAt(i);
            if (valueAt != null) {
                valueAt.clear();
                this.getHighSpeedVideoFpsRangesFor.release(valueAt);
            }
        }
        this.getHighSpeedVideoFpsRanges.clear();
    }

    public final java.util.ArrayList<T> getSortedList() {
        this.getHighSpeedVideoSizes.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        int camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap();
        for (int i = 0; i < camera2StreamConfigurationMap; i++) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.keyAt(i), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return this.getHighSpeedVideoSizes;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(T t, java.util.ArrayList<T> arrayList, java.util.HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        java.util.ArrayList<T> arrayList2 = this.getHighSpeedVideoFpsRanges.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                getHighResolutionOutputSizeshNQ4ISI(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    public final java.util.List<T> getIncomingEdges(T t) {
        java.util.ArrayList<T> arrayList = this.getHighSpeedVideoFpsRanges.get(t);
        if (arrayList == null) {
            return null;
        }
        return new java.util.ArrayList(arrayList);
    }
}
