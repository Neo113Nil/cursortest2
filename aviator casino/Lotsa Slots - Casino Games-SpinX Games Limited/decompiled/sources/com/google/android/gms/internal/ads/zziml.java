package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziml extends java.util.AbstractList {
    private static final com.google.android.gms.internal.ads.zzimm zzc = com.google.android.gms.internal.ads.zzimm.zzb(com.google.android.gms.internal.ads.zziml.class);
    final java.util.List zza;
    final java.util.Iterator zzb;

    public zziml(java.util.List list, java.util.Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        java.util.List list = this.zza;
        if (list.size() > i) {
            return list.get(i);
        }
        java.util.Iterator it = this.zzb;
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        list.add(it.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzimk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        com.google.android.gms.internal.ads.zzimm zzimmVar = zzc;
        zzimmVar.zza("potentially expensive size() call");
        zzimmVar.zza("blowup running");
        while (true) {
            java.util.Iterator it = this.zzb;
            if (!it.hasNext()) {
                return this.zza.size();
            }
            this.zza.add(it.next());
        }
    }
}
