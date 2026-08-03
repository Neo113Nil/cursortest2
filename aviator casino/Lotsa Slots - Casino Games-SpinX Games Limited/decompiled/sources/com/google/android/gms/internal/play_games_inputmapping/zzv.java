package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzv extends com.google.android.gms.internal.play_games_inputmapping.zzp {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzu zza = new com.google.android.gms.internal.play_games_inputmapping.zzu(null);

    zzv(com.google.android.gms.internal.play_games_inputmapping.zzbc zzbcVar) {
        super(zzbcVar);
    }

    @javax.annotation.Nonnull
    @java.lang.Deprecated
    public static com.google.android.gms.internal.play_games_inputmapping.zzv zzg(java.lang.String str) {
        com.google.android.gms.internal.play_games_inputmapping.zzds.zzb(!str.isEmpty(), "injected class name is empty");
        return new com.google.android.gms.internal.play_games_inputmapping.zzv(com.google.android.gms.internal.play_games_inputmapping.zzcb.zzd(str.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, '.')));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzp
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_games_inputmapping.zzs zza(java.util.logging.Level level) {
        boolean zze = zze(level);
        com.google.android.gms.internal.play_games_inputmapping.zzcb.zzh(zzd(), level, zze);
        return !zze ? zza : new com.google.android.gms.internal.play_games_inputmapping.zzt(this, level, false);
    }
}
