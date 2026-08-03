package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzae extends com.google.android.gms.internal.play_games_inputmapping.zzaf {
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final int zzd;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private final java.lang.String zze;
    private int zzf = 0;

    /* synthetic */ zzae(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, com.google.android.gms.internal.play_games_inputmapping.zzad zzadVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i;
        this.zze = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzae) {
            com.google.android.gms.internal.play_games_inputmapping.zzae zzaeVar = (com.google.android.gms.internal.play_games_inputmapping.zzae) obj;
            if (this.zzb.equals(zzaeVar.zzb) && this.zzc.equals(zzaeVar.zzc) && this.zzd == zzaeVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((this.zzb.hashCode() + 4867) * 31) + this.zzc.hashCode()) * 31) + this.zzd;
        this.zzf = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    public final java.lang.String zza() {
        return this.zzb.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, '.');
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    public final java.lang.String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    public final int zzc() {
        return (char) this.zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final java.lang.String zzd() {
        return this.zze;
    }
}
