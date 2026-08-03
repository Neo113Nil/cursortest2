package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzy extends com.google.android.gms.internal.play_games_inputmapping.zzar {
    zzy(java.lang.String str, java.lang.Class cls, boolean z) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzar
    public final void zza(java.util.Iterator it, com.google.android.gms.internal.play_games_inputmapping.zzaq zzaqVar) {
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!it.hasNext()) {
                zzaqVar.zza(zzd(), next);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.ironsource.X3.j.d);
            sb.append(next);
            do {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                sb.append(it.next());
            } while (it.hasNext());
            java.lang.String zzd = zzd();
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            zzaqVar.zza(zzd, sb.toString());
        }
    }
}
