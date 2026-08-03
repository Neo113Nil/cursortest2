package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
class zzei extends com.google.android.gms.internal.play_games_inputmapping.zzeh {
    protected final byte[] zza;

    zzei(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) || zzc() != ((com.google.android.gms.internal.play_games_inputmapping.zzek) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzei)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzei zzeiVar = (com.google.android.gms.internal.play_games_inputmapping.zzei) obj;
        int zzl = zzl();
        int zzl2 = zzeiVar.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzeiVar.zzc()) {
            int zzc2 = zzc();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 18 + java.lang.String.valueOf(zzc2).length());
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (zzc > zzeiVar.zzc()) {
            int zzc3 = zzeiVar.zzc();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 27 + java.lang.String.valueOf(zzc3).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (!(zzeiVar instanceof com.google.android.gms.internal.play_games_inputmapping.zzei)) {
            return zzeiVar.zze(0, zzc).equals(zze(0, zzc));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzeiVar.zza;
        zzeiVar.zzd();
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

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public final com.google.android.gms.internal.play_games_inputmapping.zzek zze(int i, int i2) {
        zzm(0, i2, zzc());
        return i2 == 0 ? com.google.android.gms.internal.play_games_inputmapping.zzek.zzb : new com.google.android.gms.internal.play_games_inputmapping.zzef(this.zza, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    final void zzf(com.google.android.gms.internal.play_games_inputmapping.zzeb zzebVar) throws java.io.IOException {
        ((com.google.android.gms.internal.play_games_inputmapping.zzen) zzebVar).zzp(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    protected final java.lang.String zzg(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zza, 0, zzc(), charset);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public final boolean zzh() {
        return com.google.android.gms.internal.play_games_inputmapping.zzhr.zzb(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    protected final int zzi(int i, int i2, int i3) {
        return com.google.android.gms.internal.play_games_inputmapping.zzfi.zzh(i, this.zza, 0, i3);
    }
}
