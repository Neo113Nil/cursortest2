package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzguq implements java.util.Iterator {
    final java.util.Iterator zza;
    java.util.Collection zzb;
    java.util.Iterator zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvc zzd;

    zzguq(com.google.android.gms.internal.ads.zzgvc zzgvcVar) {
        java.util.Objects.requireNonNull(zzgvcVar);
        this.zzd = zzgvcVar;
        this.zza = zzgvcVar.zzo().entrySet().iterator();
        this.zzb = null;
        this.zzc = com.google.android.gms.internal.ads.zzgxd.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.zzc.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
            entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzc.remove();
        if (((java.util.Collection) java.util.Objects.requireNonNull(this.zzb)).isEmpty()) {
            this.zza.remove();
        }
        this.zzd.zzq(r0.zzp() - 1);
    }
}
