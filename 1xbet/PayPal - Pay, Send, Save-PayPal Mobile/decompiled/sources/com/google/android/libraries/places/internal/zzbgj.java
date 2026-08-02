package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbgj {
    DOUBLE(com.google.android.libraries.places.internal.zzbgk.DOUBLE, 1),
    FLOAT(com.google.android.libraries.places.internal.zzbgk.FLOAT, 5),
    INT64(com.google.android.libraries.places.internal.zzbgk.LONG, 0),
    UINT64(com.google.android.libraries.places.internal.zzbgk.LONG, 0),
    INT32(com.google.android.libraries.places.internal.zzbgk.INT, 0),
    FIXED64(com.google.android.libraries.places.internal.zzbgk.LONG, 1),
    FIXED32(com.google.android.libraries.places.internal.zzbgk.INT, 5),
    BOOL(com.google.android.libraries.places.internal.zzbgk.BOOLEAN, 0),
    STRING(com.google.android.libraries.places.internal.zzbgk.STRING, 2),
    GROUP(com.google.android.libraries.places.internal.zzbgk.MESSAGE, 3),
    MESSAGE(com.google.android.libraries.places.internal.zzbgk.MESSAGE, 2),
    BYTES(com.google.android.libraries.places.internal.zzbgk.BYTE_STRING, 2),
    UINT32(com.google.android.libraries.places.internal.zzbgk.INT, 0),
    ENUM(com.google.android.libraries.places.internal.zzbgk.ENUM, 0),
    SFIXED32(com.google.android.libraries.places.internal.zzbgk.INT, 5),
    SFIXED64(com.google.android.libraries.places.internal.zzbgk.LONG, 1),
    SINT32(com.google.android.libraries.places.internal.zzbgk.INT, 0),
    SINT64(com.google.android.libraries.places.internal.zzbgk.LONG, 0);

    private final com.google.android.libraries.places.internal.zzbgk zzs;

    zzbgj(com.google.android.libraries.places.internal.zzbgk zzbgkVar, int i) {
        this.zzs = zzbgkVar;
    }

    public final com.google.android.libraries.places.internal.zzbgk zza() {
        return this.zzs;
    }
}
