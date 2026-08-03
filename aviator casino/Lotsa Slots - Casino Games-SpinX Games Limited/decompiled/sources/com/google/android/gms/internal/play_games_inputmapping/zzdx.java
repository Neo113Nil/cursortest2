package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzdx<MessageType extends com.google.android.gms.internal.play_games_inputmapping.zzdy<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_games_inputmapping.zzdx<MessageType, BuilderType>> implements com.google.android.gms.internal.play_games_inputmapping.zzgd {
    @Override // 
    public abstract com.google.android.gms.internal.play_games_inputmapping.zzdx zzd();

    protected abstract com.google.android.gms.internal.play_games_inputmapping.zzdx zze(com.google.android.gms.internal.play_games_inputmapping.zzdy zzdyVar);

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgd
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzgd zzf(com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar) {
        if (zzm().getClass().isInstance(zzgeVar)) {
            return zze((com.google.android.gms.internal.play_games_inputmapping.zzdy) zzgeVar);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
