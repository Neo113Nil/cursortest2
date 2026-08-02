package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrs implements com.google.android.libraries.places.internal.zzbpn {
    private final com.google.android.libraries.places.internal.zzbpn zza;
    private volatile boolean zzb;
    private java.util.List zzc = new java.util.ArrayList();

    public zzbrs(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        this.zza = zzbpnVar;
    }

    private final void zzg(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.zzb) {
                runnable.run();
            } else {
                this.zzc.add(runnable);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpn
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzg(new com.google.android.libraries.places.internal.zzbrq(this, zzbmgVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzb(com.google.android.libraries.places.internal.zzcac zzcacVar) {
        if (this.zzb) {
            this.zza.zzb(zzcacVar);
        } else {
            zzg(new com.google.android.libraries.places.internal.zzbro(this, zzcacVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpn
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzg(new com.google.android.libraries.places.internal.zzbrr(this, zzbnpVar, zzbpmVar, zzbmgVar));
    }

    @Override // com.google.android.libraries.places.internal.zzcad
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new com.google.android.libraries.places.internal.zzbrp(this));
        }
    }

    public final void zze() {
        java.util.List list;
        java.util.List arrayList = new java.util.ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzc.isEmpty()) {
                    this.zzc = null;
                    this.zzb = true;
                    return;
                } else {
                    list = this.zzc;
                    this.zzc = arrayList;
                }
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpn zzf() {
        return this.zza;
    }
}
