package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzef extends com.google.android.gms.internal.play_games_inputmapping.zzei {
    private final int zzc;

    zzef(byte[] bArr, int i, int i2) {
        super(bArr);
        zzm(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei, com.google.android.gms.internal.play_games_inputmapping.zzek
    final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei, com.google.android.gms.internal.play_games_inputmapping.zzek
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei
    protected final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei, com.google.android.gms.internal.play_games_inputmapping.zzek
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 18 + java.lang.String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
    }
}
