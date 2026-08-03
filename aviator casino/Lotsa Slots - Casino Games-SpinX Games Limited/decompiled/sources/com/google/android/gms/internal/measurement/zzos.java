package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public enum zzos {
    DOUBLE(com.google.android.gms.internal.measurement.zzot.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.measurement.zzot.FLOAT, 5),
    INT64(com.google.android.gms.internal.measurement.zzot.LONG, 0),
    UINT64(com.google.android.gms.internal.measurement.zzot.LONG, 0),
    INT32(com.google.android.gms.internal.measurement.zzot.INT, 0),
    FIXED64(com.google.android.gms.internal.measurement.zzot.LONG, 1),
    FIXED32(com.google.android.gms.internal.measurement.zzot.INT, 5),
    BOOL(com.google.android.gms.internal.measurement.zzot.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.measurement.zzot.STRING, 2),
    GROUP(com.google.android.gms.internal.measurement.zzot.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.measurement.zzot.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.measurement.zzot.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.measurement.zzot.INT, 0),
    ENUM(com.google.android.gms.internal.measurement.zzot.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.measurement.zzot.INT, 5),
    SFIXED64(com.google.android.gms.internal.measurement.zzot.LONG, 1),
    SINT32(com.google.android.gms.internal.measurement.zzot.INT, 0),
    SINT64(com.google.android.gms.internal.measurement.zzot.LONG, 0);

    private final com.google.android.gms.internal.measurement.zzot zzs;
    private final int zzt;

    zzos(com.google.android.gms.internal.measurement.zzot zzotVar, int i) {
        this.zzs = zzotVar;
        this.zzt = i;
    }

    public final com.google.android.gms.internal.measurement.zzot zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
