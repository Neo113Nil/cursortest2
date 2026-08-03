package com.google.android.libraries.play.games.inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzb implements com.google.android.libraries.play.hpe.InputMappingManager.MappingProvider {
    private final com.google.android.libraries.play.games.inputmapping.InputMappingProvider zza;

    zzb(com.google.android.libraries.play.games.inputmapping.InputMappingProvider inputMappingProvider) {
        if (inputMappingProvider == null) {
            throw new java.lang.NullPointerException("InputMappingProvider cannot be null.");
        }
        this.zza = inputMappingProvider;
    }

    @Override // com.google.android.libraries.play.hpe.InputMappingManager.MappingProvider
    public final byte[] getInputMap() {
        com.google.android.gms.internal.play_games_inputmapping.zzl proto = this.zza.onProvideInputMap().toProto();
        try {
            byte[] bArr = new byte[proto.zzl()];
            com.google.android.gms.internal.play_games_inputmapping.zzep zzt = com.google.android.gms.internal.play_games_inputmapping.zzep.zzt(bArr);
            proto.zzk(zzt);
            zzt.zzC();
            return bArr;
        } catch (java.io.IOException e) {
            java.lang.String name = proto.getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }
}
