package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public enum zzcj {
    DOUBLE(0, 1, com.google.android.gms.internal.play_billing.zzdd.DOUBLE),
    FLOAT(1, 1, com.google.android.gms.internal.play_billing.zzdd.FLOAT),
    INT64(2, 1, com.google.android.gms.internal.play_billing.zzdd.LONG),
    UINT64(3, 1, com.google.android.gms.internal.play_billing.zzdd.LONG),
    INT32(4, 1, com.google.android.gms.internal.play_billing.zzdd.INT),
    FIXED64(5, 1, com.google.android.gms.internal.play_billing.zzdd.LONG),
    FIXED32(6, 1, com.google.android.gms.internal.play_billing.zzdd.INT),
    BOOL(7, 1, com.google.android.gms.internal.play_billing.zzdd.BOOLEAN),
    STRING(8, 1, com.google.android.gms.internal.play_billing.zzdd.STRING),
    MESSAGE(9, 1, com.google.android.gms.internal.play_billing.zzdd.MESSAGE),
    BYTES(10, 1, com.google.android.gms.internal.play_billing.zzdd.BYTE_STRING),
    UINT32(11, 1, com.google.android.gms.internal.play_billing.zzdd.INT),
    ENUM(12, 1, com.google.android.gms.internal.play_billing.zzdd.ENUM),
    SFIXED32(13, 1, com.google.android.gms.internal.play_billing.zzdd.INT),
    SFIXED64(14, 1, com.google.android.gms.internal.play_billing.zzdd.LONG),
    SINT32(15, 1, com.google.android.gms.internal.play_billing.zzdd.INT),
    SINT64(16, 1, com.google.android.gms.internal.play_billing.zzdd.LONG),
    GROUP(17, 1, com.google.android.gms.internal.play_billing.zzdd.MESSAGE),
    DOUBLE_LIST(18, 2, com.google.android.gms.internal.play_billing.zzdd.DOUBLE),
    FLOAT_LIST(19, 2, com.google.android.gms.internal.play_billing.zzdd.FLOAT),
    INT64_LIST(20, 2, com.google.android.gms.internal.play_billing.zzdd.LONG),
    UINT64_LIST(21, 2, com.google.android.gms.internal.play_billing.zzdd.LONG),
    INT32_LIST(22, 2, com.google.android.gms.internal.play_billing.zzdd.INT),
    FIXED64_LIST(23, 2, com.google.android.gms.internal.play_billing.zzdd.LONG),
    FIXED32_LIST(24, 2, com.google.android.gms.internal.play_billing.zzdd.INT),
    BOOL_LIST(25, 2, com.google.android.gms.internal.play_billing.zzdd.BOOLEAN),
    STRING_LIST(26, 2, com.google.android.gms.internal.play_billing.zzdd.STRING),
    MESSAGE_LIST(27, 2, com.google.android.gms.internal.play_billing.zzdd.MESSAGE),
    BYTES_LIST(28, 2, com.google.android.gms.internal.play_billing.zzdd.BYTE_STRING),
    UINT32_LIST(29, 2, com.google.android.gms.internal.play_billing.zzdd.INT),
    ENUM_LIST(30, 2, com.google.android.gms.internal.play_billing.zzdd.ENUM),
    SFIXED32_LIST(31, 2, com.google.android.gms.internal.play_billing.zzdd.INT),
    SFIXED64_LIST(32, 2, com.google.android.gms.internal.play_billing.zzdd.LONG),
    SINT32_LIST(33, 2, com.google.android.gms.internal.play_billing.zzdd.INT),
    SINT64_LIST(34, 2, com.google.android.gms.internal.play_billing.zzdd.LONG),
    DOUBLE_LIST_PACKED(35, 3, com.google.android.gms.internal.play_billing.zzdd.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, com.google.android.gms.internal.play_billing.zzdd.FLOAT),
    INT64_LIST_PACKED(37, 3, com.google.android.gms.internal.play_billing.zzdd.LONG),
    UINT64_LIST_PACKED(38, 3, com.google.android.gms.internal.play_billing.zzdd.LONG),
    INT32_LIST_PACKED(39, 3, com.google.android.gms.internal.play_billing.zzdd.INT),
    FIXED64_LIST_PACKED(40, 3, com.google.android.gms.internal.play_billing.zzdd.LONG),
    FIXED32_LIST_PACKED(41, 3, com.google.android.gms.internal.play_billing.zzdd.INT),
    BOOL_LIST_PACKED(42, 3, com.google.android.gms.internal.play_billing.zzdd.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, com.google.android.gms.internal.play_billing.zzdd.INT),
    ENUM_LIST_PACKED(44, 3, com.google.android.gms.internal.play_billing.zzdd.ENUM),
    SFIXED32_LIST_PACKED(45, 3, com.google.android.gms.internal.play_billing.zzdd.INT),
    SFIXED64_LIST_PACKED(46, 3, com.google.android.gms.internal.play_billing.zzdd.LONG),
    SINT32_LIST_PACKED(47, 3, com.google.android.gms.internal.play_billing.zzdd.INT),
    SINT64_LIST_PACKED(48, 3, com.google.android.gms.internal.play_billing.zzdd.LONG),
    GROUP_LIST(49, 2, com.google.android.gms.internal.play_billing.zzdd.MESSAGE),
    MAP(50, 4, com.google.android.gms.internal.play_billing.zzdd.VOID);

    private static final com.google.android.gms.internal.play_billing.zzcj[] zzZ;
    private final com.google.android.gms.internal.play_billing.zzdd zzab;
    private final int zzac;
    private final java.lang.Class zzad;

    static {
        com.google.android.gms.internal.play_billing.zzcj[] values = values();
        zzZ = new com.google.android.gms.internal.play_billing.zzcj[values.length];
        for (com.google.android.gms.internal.play_billing.zzcj zzcjVar : values) {
            zzZ[zzcjVar.zzac] = zzcjVar;
        }
    }

    zzcj(int i, int i2, com.google.android.gms.internal.play_billing.zzdd zzddVar) {
        this.zzac = i;
        this.zzab = zzddVar;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzad = zzddVar.zza();
        } else if (i3 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzddVar.zza();
        }
        if (i2 == 1) {
            com.google.android.gms.internal.play_billing.zzdd zzddVar2 = com.google.android.gms.internal.play_billing.zzdd.VOID;
            zzddVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
