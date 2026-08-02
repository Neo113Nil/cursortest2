package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzuo {
    public static /* synthetic */ boolean zza(int i, com.google.android.libraries.places.internal.zztm zztmVar, java.lang.StringBuilder sb) {
        if (i - 1 != 0 || zztmVar == com.google.android.libraries.places.internal.zztm.zza) {
            return false;
        }
        sb.append(zztmVar.zza());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(zztmVar.zzb());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(zztmVar.zzc());
        return true;
    }
}
