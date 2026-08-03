package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzbw extends com.google.android.gms.internal.play_games_inputmapping.zzby {
    private final com.google.android.gms.internal.play_games_inputmapping.zzbg zza;
    private final com.google.android.gms.internal.play_games_inputmapping.zzbg zzb;
    private final int[] zzc;
    private final int zzd;

    /* synthetic */ zzbw(com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar, com.google.android.gms.internal.play_games_inputmapping.zzbg zzbgVar2, com.google.android.gms.internal.play_games_inputmapping.zzbs zzbsVar) {
        super(null);
        this.zza = zzbgVar;
        this.zzb = zzbgVar2;
        int zza = zzbgVar2.zza();
        com.google.android.gms.internal.play_games_inputmapping.zzds.zzb(zza <= 28, "metadata size too large");
        int[] iArr = new int[zza];
        this.zzc = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            com.google.android.gms.internal.play_games_inputmapping.zzar zzi = zzi(i);
            long zzi2 = zzi.zzi() | j;
            if (zzi2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (zzi.equals(zzi(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = zzi.zzf() ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = zzi2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = zzi2;
        }
        this.zzd = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.internal.play_games_inputmapping.zzar zzi(int i) {
        return (i >= 0 ? this.zzb : this.zza).zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object zzj(int i) {
        return (i >= 0 ? this.zzb : this.zza).zzc(i);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final void zza(com.google.android.gms.internal.play_games_inputmapping.zzbo zzboVar, java.lang.Object obj) {
        for (int i = 0; i < this.zzd; i++) {
            int i2 = this.zzc[i];
            com.google.android.gms.internal.play_games_inputmapping.zzar zzi = zzi(i2 & 31);
            if (zzi.zzf()) {
                zzboVar.zzb(zzi, new com.google.android.gms.internal.play_games_inputmapping.zzbv(this, zzi, i2, null), obj);
            } else {
                zzboVar.zza(zzi, zzi.zze(zzj(i2)), obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final java.util.Set zzc() {
        return new com.google.android.gms.internal.play_games_inputmapping.zzbu(this);
    }
}
