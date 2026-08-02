package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcar extends com.google.android.libraries.places.internal.zzcaw {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcat zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcar(com.google.android.libraries.places.internal.zzcat zzcatVar, com.google.android.libraries.places.internal.zzccy zzccyVar) {
        super(zzccyVar);
        java.util.Objects.requireNonNull(zzcatVar);
        this.zza = zzcatVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcaw, com.google.android.libraries.places.internal.zzccy
    public final void zza(com.google.android.libraries.places.internal.zzcdk zzcdkVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzcat zzcatVar = this.zza;
        zzcatVar.zzl(zzcatVar.zzk() + 1);
        super.zza(zzcdkVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcaw, com.google.android.libraries.places.internal.zzccy
    public final void zzb(int i, com.google.android.libraries.places.internal.zzccv zzccvVar) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzcat zzcatVar = this.zza;
        zzcatVar.zzl(zzcatVar.zzk() + 1);
        super.zzb(i, zzccvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcaw, com.google.android.libraries.places.internal.zzccy
    public final void zzc(boolean z, int i, int i2) throws java.io.IOException {
        if (z) {
            com.google.android.libraries.places.internal.zzcat zzcatVar = this.zza;
            zzcatVar.zzl(zzcatVar.zzk() + 1);
        }
        super.zzc(z, i, i2);
    }
}
