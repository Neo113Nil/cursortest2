package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqt extends com.google.android.libraries.places.internal.zzbiw {
    private final com.google.android.libraries.places.internal.zzbiw zza;
    private volatile boolean zzb;
    private java.util.List zzc = new java.util.ArrayList();

    public zzbqt(com.google.android.libraries.places.internal.zzbiw zzbiwVar) {
        this.zza = zzbiwVar;
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

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zza(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (this.zzb) {
            this.zza.zza(zzbmgVar);
        } else {
            zzg(new com.google.android.libraries.places.internal.zzbqp(this, zzbmgVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzb(java.lang.Object obj) {
        if (this.zzb) {
            this.zza.zzb(obj);
        } else {
            zzg(new com.google.android.libraries.places.internal.zzbqq(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        zzg(new com.google.android.libraries.places.internal.zzbqr(this, zzbnpVar, zzbmgVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbiw
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new com.google.android.libraries.places.internal.zzbqs(this));
        }
    }

    final void zze() {
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

    final /* synthetic */ com.google.android.libraries.places.internal.zzbiw zzf() {
        return this.zza;
    }
}
