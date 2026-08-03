package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhdt {
    static final com.google.android.gms.internal.ads.zzhst zza(com.google.android.gms.internal.ads.zzheh zzhehVar) {
        try {
            return ((com.google.android.gms.internal.ads.zzhnn) com.google.android.gms.internal.ads.zzhmr.zza().zzk(null, com.google.android.gms.internal.ads.zzhnn.class)).zzc();
        } catch (java.security.GeneralSecurityException e) {
            throw new com.google.android.gms.internal.ads.zzhny("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL), e);
        }
    }

    public static final com.google.android.gms.internal.ads.zzheh zzb(com.google.android.gms.internal.ads.zzheh zzhehVar) throws java.security.GeneralSecurityException {
        return zzhehVar != null ? zzhehVar : com.google.android.gms.internal.ads.zzhen.zzb(zza(null).zzaN());
    }
}
