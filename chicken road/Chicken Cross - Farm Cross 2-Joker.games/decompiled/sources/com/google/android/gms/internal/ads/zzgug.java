package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgug {
    private final String zza;
    private final zzguf zzb;
    private zzguf zzc;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzguf zzgufVar = this.zzb.zzb;
        String str = "";
        while (zzgufVar != null) {
            Object obj = zzgufVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzgufVar = zzgufVar.zzb;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzgug zza(Object obj) {
        zzguf zzgufVar = new zzguf();
        this.zzc.zzb = zzgufVar;
        this.zzc = zzgufVar;
        zzgufVar.zza = obj;
        return this;
    }

    /* synthetic */ zzgug(String str, byte[] bArr) {
        zzguf zzgufVar = new zzguf();
        this.zzb = zzgufVar;
        this.zzc = zzgufVar;
        str.getClass();
        this.zza = str;
    }
}
