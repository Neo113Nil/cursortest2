package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public enum zzifc {
    DOUBLE(0, 1, zzigg.DOUBLE),
    FLOAT(1, 1, zzigg.FLOAT),
    INT64(2, 1, zzigg.LONG),
    UINT64(3, 1, zzigg.LONG),
    INT32(4, 1, zzigg.INT),
    FIXED64(5, 1, zzigg.LONG),
    FIXED32(6, 1, zzigg.INT),
    BOOL(7, 1, zzigg.BOOLEAN),
    STRING(8, 1, zzigg.STRING),
    MESSAGE(9, 1, zzigg.MESSAGE),
    BYTES(10, 1, zzigg.BYTE_STRING),
    UINT32(11, 1, zzigg.INT),
    ENUM(12, 1, zzigg.ENUM),
    SFIXED32(13, 1, zzigg.INT),
    SFIXED64(14, 1, zzigg.LONG),
    SINT32(15, 1, zzigg.INT),
    SINT64(16, 1, zzigg.LONG),
    GROUP(17, 1, zzigg.MESSAGE),
    DOUBLE_LIST(18, 2, zzigg.DOUBLE),
    FLOAT_LIST(19, 2, zzigg.FLOAT),
    INT64_LIST(20, 2, zzigg.LONG),
    UINT64_LIST(21, 2, zzigg.LONG),
    INT32_LIST(22, 2, zzigg.INT),
    FIXED64_LIST(23, 2, zzigg.LONG),
    FIXED32_LIST(24, 2, zzigg.INT),
    BOOL_LIST(25, 2, zzigg.BOOLEAN),
    STRING_LIST(26, 2, zzigg.STRING),
    MESSAGE_LIST(27, 2, zzigg.MESSAGE),
    BYTES_LIST(28, 2, zzigg.BYTE_STRING),
    UINT32_LIST(29, 2, zzigg.INT),
    ENUM_LIST(30, 2, zzigg.ENUM),
    SFIXED32_LIST(31, 2, zzigg.INT),
    SFIXED64_LIST(32, 2, zzigg.LONG),
    SINT32_LIST(33, 2, zzigg.INT),
    SINT64_LIST(34, 2, zzigg.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzigg.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzigg.FLOAT),
    INT64_LIST_PACKED(37, 3, zzigg.LONG),
    UINT64_LIST_PACKED(38, 3, zzigg.LONG),
    INT32_LIST_PACKED(39, 3, zzigg.INT),
    FIXED64_LIST_PACKED(40, 3, zzigg.LONG),
    FIXED32_LIST_PACKED(41, 3, zzigg.INT),
    BOOL_LIST_PACKED(42, 3, zzigg.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzigg.INT),
    ENUM_LIST_PACKED(44, 3, zzigg.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzigg.INT),
    SFIXED64_LIST_PACKED(46, 3, zzigg.LONG),
    SINT32_LIST_PACKED(47, 3, zzigg.INT),
    SINT64_LIST_PACKED(48, 3, zzigg.LONG),
    GROUP_LIST(49, 2, zzigg.MESSAGE),
    MAP(50, 4, zzigg.VOID);

    private static final zzifc[] zzaa;
    private final int zzZ;

    static {
        zzifc[] values = values();
        zzaa = new zzifc[values.length];
        for (zzifc zzifcVar : values) {
            zzaa[zzifcVar.zzZ] = zzifcVar;
        }
    }

    zzifc(int i, int i2, zzigg zziggVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zziggVar.zza();
        } else if (i3 == 3) {
            zziggVar.zza();
        }
        if (i2 == 1) {
            zzigg zziggVar2 = zzigg.VOID;
            zziggVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
