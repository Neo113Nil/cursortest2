package com.google.android.gms.common.data;

/* loaded from: classes8.dex */
public final class DataBufferObserverSet implements com.google.android.gms.common.data.DataBufferObserver, com.google.android.gms.common.data.DataBufferObserver.Observable {
    private final java.util.HashSet zaa = new java.util.HashSet();

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public final void addObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zaa.add(dataBufferObserver);
    }

    public final void clear() {
        this.zaa.clear();
    }

    public final boolean hasObservers() {
        return !this.zaa.isEmpty();
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataChanged() {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataChanged();
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeChanged(int i, int i2) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeChanged(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeInserted(int i, int i2) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeInserted(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeMoved(int i, int i2, int i3) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeMoved(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public final void onDataRangeRemoved(int i, int i2) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeRemoved(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public final void removeObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zaa.remove(dataBufferObserver);
    }
}
