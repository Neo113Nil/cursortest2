package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public enum zzsz {
    DOUBLE(com.google.android.gms.internal.consent_sdk.zzta.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.consent_sdk.zzta.FLOAT, 5),
    INT64(com.google.android.gms.internal.consent_sdk.zzta.LONG, 0),
    UINT64(com.google.android.gms.internal.consent_sdk.zzta.LONG, 0),
    INT32(com.google.android.gms.internal.consent_sdk.zzta.INT, 0),
    FIXED64(com.google.android.gms.internal.consent_sdk.zzta.LONG, 1),
    FIXED32(com.google.android.gms.internal.consent_sdk.zzta.INT, 5),
    BOOL(com.google.android.gms.internal.consent_sdk.zzta.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.consent_sdk.zzta.STRING, 2),
    GROUP(com.google.android.gms.internal.consent_sdk.zzta.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.consent_sdk.zzta.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.consent_sdk.zzta.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.consent_sdk.zzta.INT, 0),
    ENUM(com.google.android.gms.internal.consent_sdk.zzta.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.consent_sdk.zzta.INT, 5),
    SFIXED64(com.google.android.gms.internal.consent_sdk.zzta.LONG, 1),
    SINT32(com.google.android.gms.internal.consent_sdk.zzta.INT, 0),
    SINT64(com.google.android.gms.internal.consent_sdk.zzta.LONG, 0);

    private final com.google.android.gms.internal.consent_sdk.zzta zzt;
    private final int zzu;

    zzsz(com.google.android.gms.internal.consent_sdk.zzta zztaVar, int i) {
        this.zzt = zztaVar;
        this.zzu = i;
    }

    public final int zza() {
        return this.zzu;
    }

    public final com.google.android.gms.internal.consent_sdk.zzta zzb() {
        return this.zzt;
    }
}
