package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvl extends com.google.android.libraries.places.internal.zzbit {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;
    private final java.util.concurrent.atomic.AtomicReference zzb;
    private final java.lang.String zzc;
    private final com.google.android.libraries.places.internal.zzbit zzd;

    /* synthetic */ zzbvl(com.google.android.libraries.places.internal.zzbvr zzbvrVar, java.lang.String str, byte[] bArr) {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar;
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
        zzbkqVar = com.google.android.libraries.places.internal.zzbvr.zzh;
        this.zzb = new java.util.concurrent.atomic.AtomicReference(zzbkqVar);
        this.zzd = new com.google.android.libraries.places.internal.zzbvc(this);
        this.zzc = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zzbix zze(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar = (com.google.android.libraries.places.internal.zzbkq) this.zzb.get();
        if (zzbkqVar == null) {
            return this.zzd.zza(zzbmlVar, zzbisVar);
        }
        if (!(zzbkqVar instanceof com.google.android.libraries.places.internal.zzbwa)) {
            return new com.google.android.libraries.places.internal.zzbut(zzbkqVar, this.zzd, this.zza.zzx(), zzbmlVar, zzbisVar);
        }
        com.google.android.libraries.places.internal.zzbvz zze = ((com.google.android.libraries.places.internal.zzbwa) zzbkqVar).zzb.zze(zzbmlVar);
        if (zze != null) {
            zzbisVar = zzbisVar.zzh(com.google.android.libraries.places.internal.zzbvz.zza, zze);
        }
        return this.zzd.zza(zzbmlVar, zzbisVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final com.google.android.libraries.places.internal.zzbix zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar;
        com.google.android.libraries.places.internal.zzbkq zzbkqVar2;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        java.lang.Object obj = atomicReference.get();
        zzbkqVar = com.google.android.libraries.places.internal.zzbvr.zzh;
        if (obj != zzbkqVar) {
            return zze(zzbmlVar, zzbisVar);
        }
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        com.google.android.libraries.places.internal.zzbvf zzbvfVar = new com.google.android.libraries.places.internal.zzbvf(this);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = zzbvrVar.zze;
        zzbnxVar.zzb(zzbvfVar);
        zzbnxVar.zza();
        java.lang.Object obj2 = atomicReference.get();
        zzbkqVar2 = com.google.android.libraries.places.internal.zzbvr.zzh;
        if (obj2 != zzbkqVar2) {
            return zze(zzbmlVar, zzbisVar);
        }
        if (zzbvrVar.zzN().get()) {
            return new com.google.android.libraries.places.internal.zzbvg(this);
        }
        com.google.android.libraries.places.internal.zzbvk zzbvkVar = new com.google.android.libraries.places.internal.zzbvk(this, com.google.android.libraries.places.internal.zzbjs.zza(), zzbmlVar, zzbisVar);
        zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbvh(this, zzbvkVar));
        zzbnxVar.zza();
        return zzbvkVar;
    }

    final void zzc(@javax.annotation.Nullable com.google.android.libraries.places.internal.zzbkq zzbkqVar) {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar2;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        com.google.android.libraries.places.internal.zzbkq zzbkqVar3 = (com.google.android.libraries.places.internal.zzbkq) atomicReference.get();
        atomicReference.set(zzbkqVar);
        zzbkqVar2 = com.google.android.libraries.places.internal.zzbvr.zzh;
        if (zzbkqVar3 == zzbkqVar2) {
            com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
            if (zzbvrVar.zzI() != null) {
                java.util.Iterator it = zzbvrVar.zzI().iterator();
                while (it.hasNext()) {
                    ((com.google.android.libraries.places.internal.zzbvk) it.next()).zzl();
                }
            }
        }
    }

    final void zzd() {
        com.google.android.libraries.places.internal.zzbkq zzbkqVar;
        java.lang.Object obj = this.zzb.get();
        zzbkqVar = com.google.android.libraries.places.internal.zzbvr.zzh;
        if (obj == zzbkqVar) {
            zzc(null);
        }
    }

    final /* synthetic */ java.lang.String zzg() {
        return this.zzc;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zzf() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final java.lang.String zzb() {
        return this.zzc;
    }
}
