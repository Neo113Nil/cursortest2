package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzdi {
    private final int zza;
    private final com.google.android.gms.internal.play_games_inputmapping.zzax zzb;

    protected zzdi(com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar, int i) {
        if (zzaxVar == null) {
            throw new java.lang.IllegalArgumentException("format options cannot be null");
        }
        if (i >= 0) {
            this.zza = i;
            this.zzb = zzaxVar;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    protected abstract void zzb(com.google.android.gms.internal.play_games_inputmapping.zzdj zzdjVar, java.lang.Object obj);

    public final int zzc() {
        return this.zza;
    }

    protected final com.google.android.gms.internal.play_games_inputmapping.zzax zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.internal.play_games_inputmapping.zzdj zzdjVar, java.lang.Object[] objArr) {
        int i = this.zza;
        if (i >= objArr.length) {
            zzdjVar.zze();
            return;
        }
        java.lang.Object obj = objArr[i];
        if (obj != null) {
            zzb(zzdjVar, obj);
        } else {
            zzdjVar.zzf();
        }
    }
}
