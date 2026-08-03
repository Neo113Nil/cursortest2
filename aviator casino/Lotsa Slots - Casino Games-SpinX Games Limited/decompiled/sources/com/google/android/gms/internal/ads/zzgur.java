package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgur implements java.util.Iterator {
    java.util.Map.Entry zza;
    final /* synthetic */ java.util.Iterator zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgus zzc;

    zzgur(com.google.android.gms.internal.ads.zzgus zzgusVar, java.util.Iterator it) {
        this.zzb = it;
        java.util.Objects.requireNonNull(zzgusVar);
        this.zzc = zzgusVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.zzgtj.zzj(this.zza != null, "no calls to next() since the last call to remove()");
        java.util.Collection collection = (java.util.Collection) this.zza.getValue();
        this.zzb.remove();
        int size = collection.size();
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zzc.zza;
        zzgvcVar.zzq(zzgvcVar.zzp() - size);
        collection.clear();
        this.zza = null;
    }
}
