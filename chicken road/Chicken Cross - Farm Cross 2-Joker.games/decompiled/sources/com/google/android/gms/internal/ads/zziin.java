package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public enum zziin {
    DOUBLE(zziio.DOUBLE, 1),
    FLOAT(zziio.FLOAT, 5),
    INT64(zziio.LONG, 0),
    UINT64(zziio.LONG, 0),
    INT32(zziio.INT, 0),
    FIXED64(zziio.LONG, 1),
    FIXED32(zziio.INT, 5),
    BOOL(zziio.BOOLEAN, 0),
    STRING(zziio.STRING, 2),
    GROUP(zziio.MESSAGE, 3),
    MESSAGE(zziio.MESSAGE, 2),
    BYTES(zziio.BYTE_STRING, 2),
    UINT32(zziio.INT, 0),
    ENUM(zziio.ENUM, 0),
    SFIXED32(zziio.INT, 5),
    SFIXED64(zziio.LONG, 1),
    SINT32(zziio.INT, 0),
    SINT64(zziio.LONG, 0);

    private final zziio zzs;
    private final int zzt;

    zziin(zziio zziioVar, int i) {
        this.zzs = zziioVar;
        this.zzt = i;
    }

    public final zziio zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
