package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzz extends com.google.android.gms.internal.play_games_inputmapping.zzar {
    zzz(java.lang.String str, java.lang.Class cls, boolean z) {
        super("tags", cls, false);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzar
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzaq zzaqVar) {
        for (java.util.Map.Entry entry : ((com.google.android.gms.internal.play_games_inputmapping.zzdf) obj).zzb().entrySet()) {
            if (((java.util.Set) entry.getValue()).isEmpty()) {
                zzaqVar.zza((java.lang.String) entry.getKey(), null);
            } else {
                java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    zzaqVar.zza((java.lang.String) entry.getKey(), it.next());
                }
            }
        }
    }
}
