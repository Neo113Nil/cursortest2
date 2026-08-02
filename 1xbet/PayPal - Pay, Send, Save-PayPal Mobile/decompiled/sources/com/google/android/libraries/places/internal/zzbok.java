package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbok implements com.google.android.libraries.places.internal.zzcab {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbok.class.getName());

    protected abstract com.google.android.libraries.places.internal.zzbsq zzh();

    protected abstract com.google.android.libraries.places.internal.zzboj zzp();

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzr() {
        zzp().zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzs(int i) {
        com.google.android.libraries.places.internal.zzboj zzp = zzp();
        zzp.zzy(new com.google.android.libraries.places.internal.zzboi(zzp, com.google.android.libraries.places.internal.zzcew.zzb(), i));
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzt(java.io.InputStream inputStream) {
        com.google.common.base.Preconditions.checkNotNull(inputStream, "message");
        try {
            if (!zzh().zzc()) {
                zzh().zza(inputStream);
            }
        } finally {
            com.google.android.libraries.places.internal.zzbsz.zzh(inputStream);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzu() {
        if (zzh().zzc()) {
            return;
        }
        zzh().zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public final void zzv(com.google.android.libraries.places.internal.zzbjj zzbjjVar) {
        zzh().zze((com.google.android.libraries.places.internal.zzbjj) com.google.common.base.Preconditions.checkNotNull(zzbjjVar, "compressor"));
    }

    protected final void zzw(int i) {
        zzp().zzw(i);
    }

    @Override // com.google.android.libraries.places.internal.zzcab
    public boolean zzm() {
        throw null;
    }
}
