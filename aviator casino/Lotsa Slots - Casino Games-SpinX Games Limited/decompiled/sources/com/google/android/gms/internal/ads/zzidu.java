package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public enum zzidu {
    DOUBLE(0, 1, com.google.android.gms.internal.ads.zziev.DOUBLE),
    FLOAT(1, 1, com.google.android.gms.internal.ads.zziev.FLOAT),
    INT64(2, 1, com.google.android.gms.internal.ads.zziev.LONG),
    UINT64(3, 1, com.google.android.gms.internal.ads.zziev.LONG),
    INT32(4, 1, com.google.android.gms.internal.ads.zziev.INT),
    FIXED64(5, 1, com.google.android.gms.internal.ads.zziev.LONG),
    FIXED32(6, 1, com.google.android.gms.internal.ads.zziev.INT),
    BOOL(7, 1, com.google.android.gms.internal.ads.zziev.BOOLEAN),
    STRING(8, 1, com.google.android.gms.internal.ads.zziev.STRING),
    MESSAGE(9, 1, com.google.android.gms.internal.ads.zziev.MESSAGE),
    BYTES(10, 1, com.google.android.gms.internal.ads.zziev.BYTE_STRING),
    UINT32(11, 1, com.google.android.gms.internal.ads.zziev.INT),
    ENUM(12, 1, com.google.android.gms.internal.ads.zziev.ENUM),
    SFIXED32(13, 1, com.google.android.gms.internal.ads.zziev.INT),
    SFIXED64(14, 1, com.google.android.gms.internal.ads.zziev.LONG),
    SINT32(15, 1, com.google.android.gms.internal.ads.zziev.INT),
    SINT64(16, 1, com.google.android.gms.internal.ads.zziev.LONG),
    GROUP(17, 1, com.google.android.gms.internal.ads.zziev.MESSAGE),
    DOUBLE_LIST(18, 2, com.google.android.gms.internal.ads.zziev.DOUBLE),
    FLOAT_LIST(19, 2, com.google.android.gms.internal.ads.zziev.FLOAT),
    INT64_LIST(20, 2, com.google.android.gms.internal.ads.zziev.LONG),
    UINT64_LIST(21, 2, com.google.android.gms.internal.ads.zziev.LONG),
    INT32_LIST(22, 2, com.google.android.gms.internal.ads.zziev.INT),
    FIXED64_LIST(23, 2, com.google.android.gms.internal.ads.zziev.LONG),
    FIXED32_LIST(24, 2, com.google.android.gms.internal.ads.zziev.INT),
    BOOL_LIST(25, 2, com.google.android.gms.internal.ads.zziev.BOOLEAN),
    STRING_LIST(26, 2, com.google.android.gms.internal.ads.zziev.STRING),
    MESSAGE_LIST(27, 2, com.google.android.gms.internal.ads.zziev.MESSAGE),
    BYTES_LIST(28, 2, com.google.android.gms.internal.ads.zziev.BYTE_STRING),
    UINT32_LIST(29, 2, com.google.android.gms.internal.ads.zziev.INT),
    ENUM_LIST(30, 2, com.google.android.gms.internal.ads.zziev.ENUM),
    SFIXED32_LIST(31, 2, com.google.android.gms.internal.ads.zziev.INT),
    SFIXED64_LIST(32, 2, com.google.android.gms.internal.ads.zziev.LONG),
    SINT32_LIST(33, 2, com.google.android.gms.internal.ads.zziev.INT),
    SINT64_LIST(34, 2, com.google.android.gms.internal.ads.zziev.LONG),
    DOUBLE_LIST_PACKED(35, 3, com.google.android.gms.internal.ads.zziev.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, com.google.android.gms.internal.ads.zziev.FLOAT),
    INT64_LIST_PACKED(37, 3, com.google.android.gms.internal.ads.zziev.LONG),
    UINT64_LIST_PACKED(38, 3, com.google.android.gms.internal.ads.zziev.LONG),
    INT32_LIST_PACKED(39, 3, com.google.android.gms.internal.ads.zziev.INT),
    FIXED64_LIST_PACKED(40, 3, com.google.android.gms.internal.ads.zziev.LONG),
    FIXED32_LIST_PACKED(41, 3, com.google.android.gms.internal.ads.zziev.INT),
    BOOL_LIST_PACKED(42, 3, com.google.android.gms.internal.ads.zziev.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, com.google.android.gms.internal.ads.zziev.INT),
    ENUM_LIST_PACKED(44, 3, com.google.android.gms.internal.ads.zziev.ENUM),
    SFIXED32_LIST_PACKED(45, 3, com.google.android.gms.internal.ads.zziev.INT),
    SFIXED64_LIST_PACKED(46, 3, com.google.android.gms.internal.ads.zziev.LONG),
    SINT32_LIST_PACKED(47, 3, com.google.android.gms.internal.ads.zziev.INT),
    SINT64_LIST_PACKED(48, 3, com.google.android.gms.internal.ads.zziev.LONG),
    GROUP_LIST(49, 2, com.google.android.gms.internal.ads.zziev.MESSAGE),
    MAP(50, 4, com.google.android.gms.internal.ads.zziev.VOID);

    private static final com.google.android.gms.internal.ads.zzidu[] zzaa;
    private final int zzZ;

    static {
        com.google.android.gms.internal.ads.zzidu[] values = values();
        zzaa = new com.google.android.gms.internal.ads.zzidu[values.length];
        for (com.google.android.gms.internal.ads.zzidu zziduVar : values) {
            zzaa[zziduVar.zzZ] = zziduVar;
        }
    }

    zzidu(int i, int i2, com.google.android.gms.internal.ads.zziev zzievVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzievVar.zza();
        } else if (i3 == 3) {
            zzievVar.zza();
        }
        if (i2 == 1) {
            com.google.android.gms.internal.ads.zziev zzievVar2 = com.google.android.gms.internal.ads.zziev.VOID;
            zzievVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
