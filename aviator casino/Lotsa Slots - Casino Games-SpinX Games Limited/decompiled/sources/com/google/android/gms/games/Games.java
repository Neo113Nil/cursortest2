package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class Games {
    static final com.google.android.gms.common.api.Api.ClientKey zza;
    public static final com.google.android.gms.common.api.Scope zzb;
    public static final com.google.android.gms.common.api.Scope zzc;
    public static final com.google.android.gms.common.api.Scope zzd;

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api zze;
    public static final com.google.android.gms.common.api.Scope zzf;
    public static final com.google.android.gms.common.api.Api zzg;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzg zzh;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzd zzi;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzf zzj;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzh zzk;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzi zzl;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzj zzm;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzk zzn;

    @java.lang.Deprecated
    public static final com.google.android.gms.internal.games_v2.zzl zzo;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzp;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzq;

    /* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
    @java.lang.Deprecated
    public interface GetServerAuthCodeResult extends com.google.android.gms.common.api.Result {
        java.lang.String getCode();
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        com.google.android.gms.games.zzg zzgVar = new com.google.android.gms.games.zzg();
        zzp = zzgVar;
        com.google.android.gms.games.zzh zzhVar = new com.google.android.gms.games.zzh();
        zzq = zzhVar;
        zzb = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES);
        zzc = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES_LITE);
        zzd = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.DRIVE_APPFOLDER);
        zze = new com.google.android.gms.common.api.Api("Games.API", zzgVar, clientKey);
        zzf = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.FirstPartyScopes.GAMES_1P);
        zzg = new com.google.android.gms.common.api.Api("Games.API_1P", zzhVar, clientKey);
        zzh = new com.google.android.gms.internal.games_v2.zzg();
        zzi = new com.google.android.gms.internal.games_v2.zzd();
        zzj = new com.google.android.gms.internal.games_v2.zzf();
        zzk = new com.google.android.gms.internal.games_v2.zzh();
        zzl = new com.google.android.gms.internal.games_v2.zzi();
        zzm = new com.google.android.gms.internal.games_v2.zzj();
        zzn = new com.google.android.gms.internal.games_v2.zzk();
        zzo = new com.google.android.gms.internal.games_v2.zzl();
    }
}
