package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
class zzlf extends com.google.android.gms.internal.measurement.zzle {
    protected final byte[] zza;

    zzlf(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzlg) || zzc() != ((com.google.android.gms.internal.measurement.zzlg) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzlf)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.measurement.zzlf zzlfVar = (com.google.android.gms.internal.measurement.zzlf) obj;
        int zzi = zzi();
        int zzi2 = zzlfVar.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzlfVar.zzc()) {
            int zzc2 = zzc();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 18 + java.lang.String.valueOf(zzc2).length());
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (zzc > zzlfVar.zzc()) {
            int zzc3 = zzlfVar.zzc();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 27 + java.lang.String.valueOf(zzc3).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (!(zzlfVar instanceof com.google.android.gms.internal.measurement.zzlf)) {
            return zzlfVar.zze(0, zzc).equals(zze(0, zzc));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlfVar.zza;
        zzlfVar.zzd();
        int i = 0;
        int i2 = 0;
        while (i < zzc) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final com.google.android.gms.internal.measurement.zzlg zze(int i, int i2) {
        int zzj = zzj(0, i2, zzc());
        return zzj == 0 ? com.google.android.gms.internal.measurement.zzlg.zzb : new com.google.android.gms.internal.measurement.zzlb(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    final void zzf(com.google.android.gms.internal.measurement.zzky zzkyVar) throws java.io.IOException {
        ((com.google.android.gms.internal.measurement.zzlj) zzkyVar).zzv(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    protected final int zzg(int i, int i2, int i3) {
        return com.google.android.gms.internal.measurement.zzmo.zzc(i, this.zza, 0, i3);
    }
}
