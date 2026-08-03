package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public enum zzqg {
    DOUBLE(0, 1, com.google.android.gms.internal.consent_sdk.zzqv.DOUBLE),
    FLOAT(1, 1, com.google.android.gms.internal.consent_sdk.zzqv.FLOAT),
    INT64(2, 1, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    UINT64(3, 1, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    INT32(4, 1, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    FIXED64(5, 1, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    FIXED32(6, 1, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    BOOL(7, 1, com.google.android.gms.internal.consent_sdk.zzqv.BOOLEAN),
    STRING(8, 1, com.google.android.gms.internal.consent_sdk.zzqv.STRING),
    MESSAGE(9, 1, com.google.android.gms.internal.consent_sdk.zzqv.MESSAGE),
    BYTES(10, 1, com.google.android.gms.internal.consent_sdk.zzqv.BYTE_STRING),
    UINT32(11, 1, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    ENUM(12, 1, com.google.android.gms.internal.consent_sdk.zzqv.ENUM),
    SFIXED32(13, 1, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    SFIXED64(14, 1, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    SINT32(15, 1, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    SINT64(16, 1, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    GROUP(17, 1, com.google.android.gms.internal.consent_sdk.zzqv.MESSAGE),
    DOUBLE_LIST(18, 2, com.google.android.gms.internal.consent_sdk.zzqv.DOUBLE),
    FLOAT_LIST(19, 2, com.google.android.gms.internal.consent_sdk.zzqv.FLOAT),
    INT64_LIST(20, 2, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    UINT64_LIST(21, 2, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    INT32_LIST(22, 2, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    FIXED64_LIST(23, 2, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    FIXED32_LIST(24, 2, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    BOOL_LIST(25, 2, com.google.android.gms.internal.consent_sdk.zzqv.BOOLEAN),
    STRING_LIST(26, 2, com.google.android.gms.internal.consent_sdk.zzqv.STRING),
    MESSAGE_LIST(27, 2, com.google.android.gms.internal.consent_sdk.zzqv.MESSAGE),
    BYTES_LIST(28, 2, com.google.android.gms.internal.consent_sdk.zzqv.BYTE_STRING),
    UINT32_LIST(29, 2, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    ENUM_LIST(30, 2, com.google.android.gms.internal.consent_sdk.zzqv.ENUM),
    SFIXED32_LIST(31, 2, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    SFIXED64_LIST(32, 2, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    SINT32_LIST(33, 2, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    SINT64_LIST(34, 2, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    DOUBLE_LIST_PACKED(35, 3, com.google.android.gms.internal.consent_sdk.zzqv.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, com.google.android.gms.internal.consent_sdk.zzqv.FLOAT),
    INT64_LIST_PACKED(37, 3, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    UINT64_LIST_PACKED(38, 3, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    INT32_LIST_PACKED(39, 3, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    FIXED64_LIST_PACKED(40, 3, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    FIXED32_LIST_PACKED(41, 3, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    BOOL_LIST_PACKED(42, 3, com.google.android.gms.internal.consent_sdk.zzqv.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    ENUM_LIST_PACKED(44, 3, com.google.android.gms.internal.consent_sdk.zzqv.ENUM),
    SFIXED32_LIST_PACKED(45, 3, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    SFIXED64_LIST_PACKED(46, 3, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    SINT32_LIST_PACKED(47, 3, com.google.android.gms.internal.consent_sdk.zzqv.INT),
    SINT64_LIST_PACKED(48, 3, com.google.android.gms.internal.consent_sdk.zzqv.LONG),
    GROUP_LIST(49, 2, com.google.android.gms.internal.consent_sdk.zzqv.MESSAGE),
    MAP(50, 4, com.google.android.gms.internal.consent_sdk.zzqv.VOID);

    private static final com.google.android.gms.internal.consent_sdk.zzqg[] zzZ;
    private final int zzab;

    static {
        com.google.android.gms.internal.consent_sdk.zzqg[] values = values();
        zzZ = new com.google.android.gms.internal.consent_sdk.zzqg[values.length];
        for (com.google.android.gms.internal.consent_sdk.zzqg zzqgVar : values) {
            zzZ[zzqgVar.zzab] = zzqgVar;
        }
    }

    zzqg(int i, int i2, com.google.android.gms.internal.consent_sdk.zzqv zzqvVar) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzqvVar.zza();
        } else if (i3 == 3) {
            zzqvVar.zza();
        }
        if (i2 == 1) {
            com.google.android.gms.internal.consent_sdk.zzqv zzqvVar2 = com.google.android.gms.internal.consent_sdk.zzqv.VOID;
            zzqvVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}
