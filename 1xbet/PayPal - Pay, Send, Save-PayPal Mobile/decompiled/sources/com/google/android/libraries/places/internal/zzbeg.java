package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbeg implements java.util.Iterator {
    private final java.util.Iterator zza;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
        return entry.getValue() instanceof com.google.android.libraries.places.internal.zzbeh ? new com.google.android.libraries.places.internal.zzbef(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    public zzbeg(java.util.Iterator it) {
        this.zza = it;
    }
}
