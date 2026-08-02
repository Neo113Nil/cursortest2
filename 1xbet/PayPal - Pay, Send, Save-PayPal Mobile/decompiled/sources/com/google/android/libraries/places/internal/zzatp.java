package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzatp extends com.google.android.libraries.places.internal.zzbkc {
    private final java.util.concurrent.atomic.AtomicReference zza;

    public zzatp(com.google.android.libraries.places.internal.zzbix zzbixVar) {
        super(zzbixVar);
        this.zza = new java.util.concurrent.atomic.AtomicReference(com.google.android.libraries.places.internal.zzato.zzb(1));
    }

    @Override // com.google.android.libraries.places.internal.zzbkd, com.google.android.libraries.places.internal.zzbix
    public final void zza(com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.libraries.places.internal.zzato zzatoVar;
        do {
            atomicReference = this.zza;
            zzatoVar = (com.google.android.libraries.places.internal.zzato) atomicReference.get();
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzatoVar, zzatoVar.zzd() == 1 ? com.google.android.libraries.places.internal.zzato.zzb(2) : zzatoVar));
        if (zzatoVar.zzd() == 1) {
            zzf().zza(zzbiwVar, zzbmgVar);
        } else if (zzatoVar.zzd() == 4) {
            zzbiwVar.zzc(zzatoVar.zza(), new com.google.android.libraries.places.internal.zzbmg());
        } else {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Already started");
            zzf().zze("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkd, com.google.android.libraries.places.internal.zzbix
    public final void zzb(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(obj, "Message must be non-null");
        int zzd = ((com.google.android.libraries.places.internal.zzato) this.zza.get()).zzd();
        if (zzd == 2) {
            zzf().zzb(obj);
        } else if (zzd != 5) {
            throw new java.lang.IllegalStateException("Call was either not started or already half-closed.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbnd, com.google.android.libraries.places.internal.zzbix
    public final void zzc(int i) {
        com.google.android.libraries.places.internal.zzato zzatoVar = (com.google.android.libraries.places.internal.zzato) this.zza.get();
        if (zzatoVar.zzd() == 1 || zzatoVar.zzd() == 4) {
            throw new java.lang.IllegalStateException("Not started");
        }
        com.google.common.base.Preconditions.checkArgument(true, "Number requested must be non-negative");
        zzf().zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbnd, com.google.android.libraries.places.internal.zzbix
    public final void zzd() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.libraries.places.internal.zzato zzatoVar;
        do {
            atomicReference = this.zza;
            zzatoVar = (com.google.android.libraries.places.internal.zzato) atomicReference.get();
            if (zzatoVar.zzd() != 2) {
                throw new java.lang.IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzatoVar, com.google.android.libraries.places.internal.zzato.zzb(3)));
        zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbnd, com.google.android.libraries.places.internal.zzbix
    public final void zze(@javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.libraries.places.internal.zzato zzatoVar;
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzb;
        if (str != null) {
            zzbnpVar = zzbnpVar.zze(str);
        }
        if (th != null) {
            zzbnpVar = zzbnpVar.zzd(th);
        }
        do {
            atomicReference = this.zza;
            zzatoVar = (com.google.android.libraries.places.internal.zzato) atomicReference.get();
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzatoVar, zzatoVar.zzd() == 4 ? zzatoVar : zzatoVar.zzd() == 1 ? com.google.android.libraries.places.internal.zzato.zzc(4, zzbnpVar) : com.google.android.libraries.places.internal.zzato.zzc(5, zzbnpVar)));
        zzf().zze(str, th);
    }
}
