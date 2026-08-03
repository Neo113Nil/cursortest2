package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public enum zzfv {
    DOUBLE(com.google.android.gms.internal.play_billing.zzfw.DOUBLE, 1),
    FLOAT(com.google.android.gms.internal.play_billing.zzfw.FLOAT, 5),
    INT64(com.google.android.gms.internal.play_billing.zzfw.LONG, 0),
    UINT64(com.google.android.gms.internal.play_billing.zzfw.LONG, 0),
    INT32(com.google.android.gms.internal.play_billing.zzfw.INT, 0),
    FIXED64(com.google.android.gms.internal.play_billing.zzfw.LONG, 1),
    FIXED32(com.google.android.gms.internal.play_billing.zzfw.INT, 5),
    BOOL(com.google.android.gms.internal.play_billing.zzfw.BOOLEAN, 0),
    STRING(com.google.android.gms.internal.play_billing.zzfw.STRING, 2),
    GROUP(com.google.android.gms.internal.play_billing.zzfw.MESSAGE, 3),
    MESSAGE(com.google.android.gms.internal.play_billing.zzfw.MESSAGE, 2),
    BYTES(com.google.android.gms.internal.play_billing.zzfw.BYTE_STRING, 2),
    UINT32(com.google.android.gms.internal.play_billing.zzfw.INT, 0),
    ENUM(com.google.android.gms.internal.play_billing.zzfw.ENUM, 0),
    SFIXED32(com.google.android.gms.internal.play_billing.zzfw.INT, 5),
    SFIXED64(com.google.android.gms.internal.play_billing.zzfw.LONG, 1),
    SINT32(com.google.android.gms.internal.play_billing.zzfw.INT, 0),
    SINT64(com.google.android.gms.internal.play_billing.zzfw.LONG, 0);

    private final com.google.android.gms.internal.play_billing.zzfw zzt;

    zzfv(com.google.android.gms.internal.play_billing.zzfw zzfwVar, int i) {
        this.zzt = zzfwVar;
    }

    public final com.google.android.gms.internal.play_billing.zzfw zza() {
        return this.zzt;
    }
}
