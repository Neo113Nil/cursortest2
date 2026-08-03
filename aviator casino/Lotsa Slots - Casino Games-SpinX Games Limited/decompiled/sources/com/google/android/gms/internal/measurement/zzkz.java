package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkz extends com.google.android.gms.internal.measurement.zzla {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzlg zza;
    private int zzb;
    private final int zzc;

    zzkz(com.google.android.gms.internal.measurement.zzlg zzlgVar) {
        java.util.Objects.requireNonNull(zzlgVar);
        this.zza = zzlgVar;
        this.zzb = 0;
        this.zzc = zzlgVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
