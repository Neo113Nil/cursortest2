package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgs extends com.google.android.gms.internal.play_games_inputmapping.zzgz {
    zzgs(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgz
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                java.util.Map.Entry zzd = zzd(i);
                if (((com.google.android.gms.internal.play_games_inputmapping.zzev) zzd.getKey()).zzc()) {
                    zzd.setValue(java.util.Collections.unmodifiableList((java.util.List) zzd.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zze()) {
                if (((com.google.android.gms.internal.play_games_inputmapping.zzev) entry.getKey()).zzc()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
