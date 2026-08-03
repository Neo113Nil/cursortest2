package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzfr extends com.google.android.gms.internal.play_games_inputmapping.zzfs {
    private zzfr() {
        super(null);
    }

    /* synthetic */ zzfr(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    final void zza(java.lang.Object obj, long j) {
        ((com.google.android.gms.internal.play_games_inputmapping.zzfh) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    final void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.play_games_inputmapping.zzfh zzfhVar = (com.google.android.gms.internal.play_games_inputmapping.zzfh) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
        com.google.android.gms.internal.play_games_inputmapping.zzfh zzfhVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzfh) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j);
        int size = zzfhVar.size();
        int size2 = zzfhVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzfhVar.zza()) {
                zzfhVar = zzfhVar.zzh(size2 + size);
            }
            zzfhVar.addAll(zzfhVar2);
        }
        if (size > 0) {
            zzfhVar2 = zzfhVar;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, zzfhVar2);
    }
}
