package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public enum zzlw {
    DOUBLE(0, 1, com.google.android.gms.internal.measurement.zzmr.DOUBLE),
    FLOAT(1, 1, com.google.android.gms.internal.measurement.zzmr.FLOAT),
    INT64(2, 1, com.google.android.gms.internal.measurement.zzmr.LONG),
    UINT64(3, 1, com.google.android.gms.internal.measurement.zzmr.LONG),
    INT32(4, 1, com.google.android.gms.internal.measurement.zzmr.INT),
    FIXED64(5, 1, com.google.android.gms.internal.measurement.zzmr.LONG),
    FIXED32(6, 1, com.google.android.gms.internal.measurement.zzmr.INT),
    BOOL(7, 1, com.google.android.gms.internal.measurement.zzmr.BOOLEAN),
    STRING(8, 1, com.google.android.gms.internal.measurement.zzmr.STRING),
    MESSAGE(9, 1, com.google.android.gms.internal.measurement.zzmr.MESSAGE),
    BYTES(10, 1, com.google.android.gms.internal.measurement.zzmr.BYTE_STRING),
    UINT32(11, 1, com.google.android.gms.internal.measurement.zzmr.INT),
    ENUM(12, 1, com.google.android.gms.internal.measurement.zzmr.ENUM),
    SFIXED32(13, 1, com.google.android.gms.internal.measurement.zzmr.INT),
    SFIXED64(14, 1, com.google.android.gms.internal.measurement.zzmr.LONG),
    SINT32(15, 1, com.google.android.gms.internal.measurement.zzmr.INT),
    SINT64(16, 1, com.google.android.gms.internal.measurement.zzmr.LONG),
    GROUP(17, 1, com.google.android.gms.internal.measurement.zzmr.MESSAGE),
    DOUBLE_LIST(18, 2, com.google.android.gms.internal.measurement.zzmr.DOUBLE),
    FLOAT_LIST(19, 2, com.google.android.gms.internal.measurement.zzmr.FLOAT),
    INT64_LIST(20, 2, com.google.android.gms.internal.measurement.zzmr.LONG),
    UINT64_LIST(21, 2, com.google.android.gms.internal.measurement.zzmr.LONG),
    INT32_LIST(22, 2, com.google.android.gms.internal.measurement.zzmr.INT),
    FIXED64_LIST(23, 2, com.google.android.gms.internal.measurement.zzmr.LONG),
    FIXED32_LIST(24, 2, com.google.android.gms.internal.measurement.zzmr.INT),
    BOOL_LIST(25, 2, com.google.android.gms.internal.measurement.zzmr.BOOLEAN),
    STRING_LIST(26, 2, com.google.android.gms.internal.measurement.zzmr.STRING),
    MESSAGE_LIST(27, 2, com.google.android.gms.internal.measurement.zzmr.MESSAGE),
    BYTES_LIST(28, 2, com.google.android.gms.internal.measurement.zzmr.BYTE_STRING),
    UINT32_LIST(29, 2, com.google.android.gms.internal.measurement.zzmr.INT),
    ENUM_LIST(30, 2, com.google.android.gms.internal.measurement.zzmr.ENUM),
    SFIXED32_LIST(31, 2, com.google.android.gms.internal.measurement.zzmr.INT),
    SFIXED64_LIST(32, 2, com.google.android.gms.internal.measurement.zzmr.LONG),
    SINT32_LIST(33, 2, com.google.android.gms.internal.measurement.zzmr.INT),
    SINT64_LIST(34, 2, com.google.android.gms.internal.measurement.zzmr.LONG),
    DOUBLE_LIST_PACKED(35, 3, com.google.android.gms.internal.measurement.zzmr.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, com.google.android.gms.internal.measurement.zzmr.FLOAT),
    INT64_LIST_PACKED(37, 3, com.google.android.gms.internal.measurement.zzmr.LONG),
    UINT64_LIST_PACKED(38, 3, com.google.android.gms.internal.measurement.zzmr.LONG),
    INT32_LIST_PACKED(39, 3, com.google.android.gms.internal.measurement.zzmr.INT),
    FIXED64_LIST_PACKED(40, 3, com.google.android.gms.internal.measurement.zzmr.LONG),
    FIXED32_LIST_PACKED(41, 3, com.google.android.gms.internal.measurement.zzmr.INT),
    BOOL_LIST_PACKED(42, 3, com.google.android.gms.internal.measurement.zzmr.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, com.google.android.gms.internal.measurement.zzmr.INT),
    ENUM_LIST_PACKED(44, 3, com.google.android.gms.internal.measurement.zzmr.ENUM),
    SFIXED32_LIST_PACKED(45, 3, com.google.android.gms.internal.measurement.zzmr.INT),
    SFIXED64_LIST_PACKED(46, 3, com.google.android.gms.internal.measurement.zzmr.LONG),
    SINT32_LIST_PACKED(47, 3, com.google.android.gms.internal.measurement.zzmr.INT),
    SINT64_LIST_PACKED(48, 3, com.google.android.gms.internal.measurement.zzmr.LONG),
    GROUP_LIST(49, 2, com.google.android.gms.internal.measurement.zzmr.MESSAGE),
    MAP(50, 4, com.google.android.gms.internal.measurement.zzmr.VOID);

    private static final com.google.android.gms.internal.measurement.zzlw[] zzaa;
    private final int zzZ;

    static {
        com.google.android.gms.internal.measurement.zzlw[] values = values();
        zzaa = new com.google.android.gms.internal.measurement.zzlw[values.length];
        for (com.google.android.gms.internal.measurement.zzlw zzlwVar : values) {
            zzaa[zzlwVar.zzZ] = zzlwVar;
        }
    }

    zzlw(int i, int i2, com.google.android.gms.internal.measurement.zzmr zzmrVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzmrVar.zza();
        } else if (i3 == 3) {
            zzmrVar.zza();
        }
        if (i2 == 1) {
            com.google.android.gms.internal.measurement.zzmr zzmrVar2 = com.google.android.gms.internal.measurement.zzmr.VOID;
            zzmrVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
