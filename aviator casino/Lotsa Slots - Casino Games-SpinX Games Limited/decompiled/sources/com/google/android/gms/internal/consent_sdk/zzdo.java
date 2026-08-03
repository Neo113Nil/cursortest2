package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzdo {
    private final com.google.android.gms.internal.consent_sdk.zzdk zza;

    private zzdo(com.google.android.gms.internal.consent_sdk.zzdk zzdkVar) {
        int i = com.google.android.gms.internal.consent_sdk.zzdg.zzb;
        this.zza = zzdkVar;
    }

    public static com.google.android.gms.internal.consent_sdk.zzdo zza(char c) {
        return new com.google.android.gms.internal.consent_sdk.zzdo(new com.google.android.gms.internal.consent_sdk.zzdk(new com.google.android.gms.internal.consent_sdk.zzde(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)));
    }

    static /* bridge */ /* synthetic */ java.util.Iterator zzc(com.google.android.gms.internal.consent_sdk.zzdo zzdoVar, java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.consent_sdk.zzdl(zzdoVar, charSequence, zzdoVar.zza.zza);
    }

    public final java.lang.Iterable zzb(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.consent_sdk.zzdm(this, charSequence);
    }
}
