package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzces extends com.google.android.libraries.places.internal.zzceo {
    private final java.util.concurrent.atomic.AtomicInteger zzi;
    private com.google.android.libraries.places.internal.zzbln zzj;

    public zzces(com.google.android.libraries.places.internal.zzblg zzblgVar) {
        super(zzblgVar);
        this.zzi = new java.util.concurrent.atomic.AtomicInteger(new java.util.Random().nextInt());
        this.zzj = new com.google.android.libraries.places.internal.zzblf(com.google.android.libraries.places.internal.zzbli.zzd());
    }

    private final void zzl(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbln zzblnVar) {
        if (zzbjnVar == this.zzh && zzblnVar.equals(this.zzj)) {
            return;
        }
        zzg().zzb(zzbjnVar, zzblnVar);
        this.zzh = zzbjnVar;
        this.zzj = zzblnVar;
    }

    private final com.google.android.libraries.places.internal.zzbln zzm(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.google.android.libraries.places.internal.zzcem) it.next()).zze());
        }
        return new com.google.android.libraries.places.internal.zzcer(arrayList, this.zzi);
    }

    @Override // com.google.android.libraries.places.internal.zzceo
    protected final void zze() {
        java.util.List zzi = zzi();
        if (!zzi.isEmpty()) {
            zzl(com.google.android.libraries.places.internal.zzbjn.READY, zzm(zzi));
            return;
        }
        java.util.Iterator it = zzh().iterator();
        while (it.hasNext()) {
            com.google.android.libraries.places.internal.zzbjn zzf = ((com.google.android.libraries.places.internal.zzcem) it.next()).zzf();
            com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.CONNECTING;
            if (zzf == zzbjnVar || zzf == com.google.android.libraries.places.internal.zzbjn.IDLE) {
                zzl(zzbjnVar, new com.google.android.libraries.places.internal.zzblf(com.google.android.libraries.places.internal.zzbli.zzd()));
                return;
            }
        }
        zzl(com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE, zzm(zzh()));
    }

    @Override // com.google.android.libraries.places.internal.zzceo
    protected final com.google.android.libraries.places.internal.zzcem zzf(java.lang.Object obj) {
        return new com.google.android.libraries.places.internal.zzceq(this, obj, this.zzg);
    }
}
