package com.google.android.gms.internal.drive;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes4.dex */
final class zzmq<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzvj;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;
    private boolean zzvo;

    private zzmq(com.google.android.gms.internal.drive.zzmi zzmiVar) {
        this.zzvk = zzmiVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.List list;
        java.util.Map map;
        int i = this.pos + 1;
        list = this.zzvk.zzve;
        if (i >= list.size()) {
            map = this.zzvk.zzvf;
            if (map.isEmpty() || !zzew().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.List list;
        if (!this.zzvo) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzvo = false;
        this.zzvk.zzeu();
        int i = this.pos;
        list = this.zzvk.zzve;
        if (i < list.size()) {
            com.google.android.gms.internal.drive.zzmi zzmiVar = this.zzvk;
            int i2 = this.pos;
            this.pos = i2 - 1;
            zzmiVar.zzax(i2);
            return;
        }
        zzew().remove();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzew() {
        java.util.Map map;
        if (this.zzvj == null) {
            map = this.zzvk.zzvf;
            this.zzvj = map.entrySet().iterator();
        }
        return this.zzvj;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.List list;
        java.util.List list2;
        this.zzvo = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzvk.zzve;
        if (i >= list.size()) {
            return zzew().next();
        }
        list2 = this.zzvk.zzve;
        return (java.util.Map.Entry) list2.get(this.pos);
    }

    /* synthetic */ zzmq(com.google.android.gms.internal.drive.zzmi zzmiVar, com.google.android.gms.internal.drive.zzmj zzmjVar) {
        this(zzmiVar);
    }
}
