package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public enum zzho {
    DOUBLE(com.google.android.gms.internal.auth.zzhp.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.auth.zzhp.FLOAT, 5),
    INT64(com.google.android.gms.internal.auth.zzhp.LONG, 0),
    UINT64(com.google.android.gms.internal.auth.zzhp.LONG, 0),
    INT32(com.google.android.gms.internal.auth.zzhp.INT, 0),
    FIXED64(com.google.android.gms.internal.auth.zzhp.LONG, 1),
    FIXED32(com.google.android.gms.internal.auth.zzhp.INT, 5),
    BOOL(com.google.android.gms.internal.auth.zzhp.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.auth.zzhp.STRING, 2),
    GROUP(com.google.android.gms.internal.auth.zzhp.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.auth.zzhp.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.auth.zzhp.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.auth.zzhp.INT, 0),
    ENUM(com.google.android.gms.internal.auth.zzhp.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.auth.zzhp.INT, 5),
    SFIXED64(com.google.android.gms.internal.auth.zzhp.LONG, 1),
    SINT32(com.google.android.gms.internal.auth.zzhp.INT, 0),
    SINT64(com.google.android.gms.internal.auth.zzhp.LONG, 0);

    private final com.google.android.gms.internal.auth.zzhp zzt;

    zzho(com.google.android.gms.internal.auth.zzhp zzhpVar, int i) {
        this.zzt = zzhpVar;
    }

    public final com.google.android.gms.internal.auth.zzhp zza() {
        return this.zzt;
    }
}
