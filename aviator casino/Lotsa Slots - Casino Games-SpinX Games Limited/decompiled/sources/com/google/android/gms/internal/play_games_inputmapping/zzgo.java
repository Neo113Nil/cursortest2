package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgo implements com.google.android.gms.internal.play_games_inputmapping.zzgb {
    private final com.google.android.gms.internal.play_games_inputmapping.zzge zza;
    private final java.lang.String zzb;
    private final java.lang.Object[] zzc;
    private final int zzd;

    zzgo(com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zza = zzgeVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgb
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgb
    public final com.google.android.gms.internal.play_games_inputmapping.zzge zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgb
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    final java.lang.String zzd() {
        return this.zzb;
    }

    final java.lang.Object[] zze() {
        return this.zzc;
    }
}
