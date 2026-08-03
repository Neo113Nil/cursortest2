package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzdk extends com.google.android.gms.internal.play_games_inputmapping.zzdi {
    private static final java.util.Map zza;
    private final com.google.android.gms.internal.play_games_inputmapping.zzaw zzb;
    private final java.lang.String zzc;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.internal.play_games_inputmapping.zzaw.class);
        for (com.google.android.gms.internal.play_games_inputmapping.zzaw zzawVar : com.google.android.gms.internal.play_games_inputmapping.zzaw.values()) {
            com.google.android.gms.internal.play_games_inputmapping.zzdk[] zzdkVarArr = new com.google.android.gms.internal.play_games_inputmapping.zzdk[10];
            for (int i = 0; i < 10; i++) {
                zzdkVarArr[i] = new com.google.android.gms.internal.play_games_inputmapping.zzdk(i, zzawVar, com.google.android.gms.internal.play_games_inputmapping.zzax.zza());
            }
            enumMap.put((java.util.EnumMap) zzawVar, (com.google.android.gms.internal.play_games_inputmapping.zzaw) zzdkVarArr);
        }
        zza = java.util.Collections.unmodifiableMap(enumMap);
    }

    private zzdk(int i, com.google.android.gms.internal.play_games_inputmapping.zzaw zzawVar, com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar) {
        super(zzaxVar, i);
        java.lang.String sb;
        com.google.android.gms.internal.play_games_inputmapping.zzds.zza(zzawVar, "format char");
        this.zzb = zzawVar;
        if (zzaxVar.zze()) {
            sb = zzawVar.zze();
        } else {
            int zzb = zzawVar.zzb();
            zzb = zzaxVar.zzk() ? zzb & 65503 : zzb;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("%");
            zzaxVar.zzl(sb2);
            sb2.append((char) zzb);
            sb = sb2.toString();
        }
        this.zzc = sb;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzdk zza(int i, com.google.android.gms.internal.play_games_inputmapping.zzaw zzawVar, com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar) {
        return (i >= 10 || !zzaxVar.zze()) ? new com.google.android.gms.internal.play_games_inputmapping.zzdk(i, zzawVar, zzaxVar) : ((com.google.android.gms.internal.play_games_inputmapping.zzdk[]) zza.get(zzawVar))[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdi
    protected final void zzb(com.google.android.gms.internal.play_games_inputmapping.zzdj zzdjVar, java.lang.Object obj) {
        zzdjVar.zzc(obj, this.zzb, zzd());
    }
}
