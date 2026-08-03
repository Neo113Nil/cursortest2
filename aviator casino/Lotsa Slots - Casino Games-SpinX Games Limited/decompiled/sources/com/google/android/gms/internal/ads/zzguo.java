package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzguo implements java.util.Iterator {
    final java.util.Iterator zza;
    java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgup zzc;

    zzguo(com.google.android.gms.internal.ads.zzgup zzgupVar) {
        java.util.Objects.requireNonNull(zzgupVar);
        this.zzc = zzgupVar;
        this.zza = zzgupVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
        this.zzb = (java.util.Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.zzgtj.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        com.google.android.gms.internal.ads.zzgvc zzgvcVar = this.zzc.zzb;
        zzgvcVar.zzq(zzgvcVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }
}
