package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zztf extends com.google.android.libraries.places.internal.zztv {
    zztf(java.lang.String str, java.lang.Class cls, boolean z) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.libraries.places.internal.zztv
    public final void zza(java.util.Iterator it, com.google.android.libraries.places.internal.zztu zztuVar) {
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!it.hasNext()) {
                zztuVar.zza(zzd(), next);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(next);
            do {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                sb.append(it.next());
            } while (it.hasNext());
            java.lang.String zzd = zzd();
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            zztuVar.zza(zzd, sb.toString());
        }
    }
}
