package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzed implements java.util.Comparator {
    zzed() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar = (com.google.android.gms.internal.play_games_inputmapping.zzek) obj;
        com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzek) obj2;
        com.google.android.gms.internal.play_games_inputmapping.zzec zzecVar = new com.google.android.gms.internal.play_games_inputmapping.zzec(zzekVar);
        com.google.android.gms.internal.play_games_inputmapping.zzec zzecVar2 = new com.google.android.gms.internal.play_games_inputmapping.zzec(zzekVar2);
        while (zzecVar.hasNext() && zzecVar2.hasNext()) {
            int compareTo = java.lang.Integer.valueOf(zzecVar.zza() & 255).compareTo(java.lang.Integer.valueOf(zzecVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return java.lang.Integer.valueOf(zzekVar.zzc()).compareTo(java.lang.Integer.valueOf(zzekVar2.zzc()));
    }
}
