package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class CopyOnWriteMultiset<E> implements java.lang.Iterable<E> {
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private final java.util.Map<E, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    private java.util.Set<E> Camera2StreamConfigurationMap = java.util.Collections.emptySet();
    private java.util.List<E> getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();

    public final void add(E e) {
        synchronized (this.getHighSpeedVideoSizes) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
            arrayList.add(e);
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(arrayList);
            java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI.get(e);
            if (num == null) {
                java.util.HashSet hashSet = new java.util.HashSet(this.Camera2StreamConfigurationMap);
                hashSet.add(e);
                this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableSet(hashSet);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.put(e, java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public final void remove(E e) {
        synchronized (this.getHighSpeedVideoSizes) {
            java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI.get(e);
            if (num == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
            arrayList.remove(e);
            this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI.remove(e);
                java.util.HashSet hashSet = new java.util.HashSet(this.Camera2StreamConfigurationMap);
                hashSet.remove(e);
                this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableSet(hashSet);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.put(e, java.lang.Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public final java.util.Set<E> elementSet() {
        java.util.Set<E> set;
        synchronized (this.getHighSpeedVideoSizes) {
            set = this.Camera2StreamConfigurationMap;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        java.util.Iterator<E> it;
        synchronized (this.getHighSpeedVideoSizes) {
            it = this.getHighSpeedVideoFpsRangesFor.iterator();
        }
        return it;
    }

    public final int count(E e) {
        int intValue;
        synchronized (this.getHighSpeedVideoSizes) {
            intValue = this.getHighResolutionOutputSizeshNQ4ISI.containsKey(e) ? this.getHighResolutionOutputSizeshNQ4ISI.get(e).intValue() : 0;
        }
        return intValue;
    }
}
