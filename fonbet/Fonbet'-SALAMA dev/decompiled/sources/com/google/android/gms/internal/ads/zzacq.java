package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzacq implements zzaeb {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ int zzf(zzl zzlVar, int i7, boolean z4) {
        return zzadz.zza(this, zzlVar, i7, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzg(zzl zzlVar, int i7, boolean z4, int i8) {
        int zza = zzlVar.zza(this.zza, 0, Math.min(4096, i7));
        if (zza != -1) {
            return zza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzm(zzz zzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzr(zzed zzedVar, int i7) {
        zzadz.zzb(this, zzedVar, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzs(zzed zzedVar, int i7, int i8) {
        zzedVar.zzM(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzt(long j, int i7, int i8, int i9, zzaea zzaeaVar) {
    }
}
