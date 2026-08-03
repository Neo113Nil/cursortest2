package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzdy<MessageType extends com.google.android.gms.internal.play_games_inputmapping.zzdy<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_games_inputmapping.zzdx<MessageType, BuilderType>> implements com.google.android.gms.internal.play_games_inputmapping.zzge {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final com.google.android.gms.internal.play_games_inputmapping.zzek zzg() {
        try {
            int zzl = zzl();
            com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar = com.google.android.gms.internal.play_games_inputmapping.zzek.zzb;
            byte[] bArr = new byte[zzl];
            com.google.android.gms.internal.play_games_inputmapping.zzep zzt = com.google.android.gms.internal.play_games_inputmapping.zzep.zzt(bArr);
            zzk(zzt);
            zzt.zzC();
            return new com.google.android.gms.internal.play_games_inputmapping.zzei(bArr);
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    int zzh() {
        throw null;
    }

    void zzi(int i) {
        throw null;
    }
}
