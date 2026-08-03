package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public enum zzihg {
    DOUBLE(com.google.android.gms.internal.ads.zzihh.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.ads.zzihh.FLOAT, 5),
    INT64(com.google.android.gms.internal.ads.zzihh.LONG, 0),
    UINT64(com.google.android.gms.internal.ads.zzihh.LONG, 0),
    INT32(com.google.android.gms.internal.ads.zzihh.INT, 0),
    FIXED64(com.google.android.gms.internal.ads.zzihh.LONG, 1),
    FIXED32(com.google.android.gms.internal.ads.zzihh.INT, 5),
    BOOL(com.google.android.gms.internal.ads.zzihh.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.ads.zzihh.STRING, 2),
    GROUP(com.google.android.gms.internal.ads.zzihh.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.ads.zzihh.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.ads.zzihh.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.ads.zzihh.INT, 0),
    ENUM(com.google.android.gms.internal.ads.zzihh.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.ads.zzihh.INT, 5),
    SFIXED64(com.google.android.gms.internal.ads.zzihh.LONG, 1),
    SINT32(com.google.android.gms.internal.ads.zzihh.INT, 0),
    SINT64(com.google.android.gms.internal.ads.zzihh.LONG, 0);

    private final com.google.android.gms.internal.ads.zzihh zzs;
    private final int zzt;

    zzihg(com.google.android.gms.internal.ads.zzihh zzihhVar, int i) {
        this.zzs = zzihhVar;
        this.zzt = i;
    }

    public final com.google.android.gms.internal.ads.zzihh zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
