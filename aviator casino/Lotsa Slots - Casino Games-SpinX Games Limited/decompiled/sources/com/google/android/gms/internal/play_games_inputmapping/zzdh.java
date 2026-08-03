package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzdh extends com.google.android.gms.internal.play_games_inputmapping.zzdi {
    private final com.google.android.gms.internal.play_games_inputmapping.zzdg zza;
    private final java.lang.String zzb;

    private zzdh(com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar, int i, com.google.android.gms.internal.play_games_inputmapping.zzdg zzdgVar) {
        super(zzaxVar, i);
        this.zza = zzdgVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        zzaxVar.zzl(sb);
        sb.append(true != zzaxVar.zzk() ? 't' : 'T');
        sb.append(zzdgVar.zzb());
        this.zzb = sb.toString();
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdi zza(com.google.android.gms.internal.play_games_inputmapping.zzdg zzdgVar, com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar, int i) {
        return new com.google.android.gms.internal.play_games_inputmapping.zzdh(zzaxVar, i, zzdgVar);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdi
    protected final void zzb(com.google.android.gms.internal.play_games_inputmapping.zzdj zzdjVar, java.lang.Object obj) {
        zzdjVar.zzd(obj, this.zza, zzd());
    }
}
