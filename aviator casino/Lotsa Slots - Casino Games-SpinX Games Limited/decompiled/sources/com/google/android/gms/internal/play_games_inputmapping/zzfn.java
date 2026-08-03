package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public class zzfn {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzer zzb = com.google.android.gms.internal.play_games_inputmapping.zzer.zza();
    protected volatile com.google.android.gms.internal.play_games_inputmapping.zzge zza;
    private volatile com.google.android.gms.internal.play_games_inputmapping.zzek zzc;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfn)) {
            return false;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzfn zzfnVar = (com.google.android.gms.internal.play_games_inputmapping.zzfn) obj;
        com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar = this.zza;
        com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar2 = zzfnVar.zza;
        if (zzgeVar == null && zzgeVar2 == null) {
            return zzb().equals(zzfnVar.zzb());
        }
        if (zzgeVar != null && zzgeVar2 != null) {
            return zzgeVar.equals(zzgeVar2);
        }
        if (zzgeVar != null) {
            zzfnVar.zzc(zzgeVar.zzm());
            return zzgeVar.equals(zzfnVar.zza);
        }
        zzc(zzgeVar2.zzm());
        return this.zza.equals(zzgeVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((com.google.android.gms.internal.play_games_inputmapping.zzei) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzek zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = com.google.android.gms.internal.play_games_inputmapping.zzek.zzb;
            } else {
                this.zzc = this.zza.zzg();
            }
            return this.zzc;
        }
    }

    protected final void zzc(com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgeVar;
                    this.zzc = com.google.android.gms.internal.play_games_inputmapping.zzek.zzb;
                } catch (com.google.android.gms.internal.play_games_inputmapping.zzfk unused) {
                    this.zza = zzgeVar;
                    this.zzc = com.google.android.gms.internal.play_games_inputmapping.zzek.zzb;
                }
            }
        }
    }
}
