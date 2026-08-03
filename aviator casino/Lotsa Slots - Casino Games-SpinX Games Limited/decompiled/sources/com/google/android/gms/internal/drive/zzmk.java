package com.google.android.gms.internal.drive;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes4.dex */
final class zzmk<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzvj;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;

    private zzmk(com.google.android.gms.internal.drive.zzmi zzmiVar) {
        java.util.List list;
        this.zzvk = zzmiVar;
        list = zzmiVar.zzve;
        this.pos = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzvk.zzve;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzew().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzew() {
        java.util.Map map;
        if (this.zzvj == null) {
            map = this.zzvk.zzvh;
            this.zzvj = map.entrySet().iterator();
        }
        return this.zzvj;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.List list;
        if (zzew().hasNext()) {
            return zzew().next();
        }
        list = this.zzvk.zzve;
        int i = this.pos - 1;
        this.pos = i;
        return (java.util.Map.Entry) list.get(i);
    }

    /* synthetic */ zzmk(com.google.android.gms.internal.drive.zzmi zzmiVar, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(zzmiVar);
    }
}
