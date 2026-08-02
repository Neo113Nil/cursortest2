package util.h.xy.ar;

/* loaded from: classes5.dex */
public class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    static {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 73) << 1) - (i ^ 73)) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25056(byte[] bArr, byte[]... bArr2) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 65) << 1) - (i ^ 65)) % 128;
        java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25065 = m25065(bArr, java.lang.Boolean.TRUE, bArr2);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 27) % 128;
        return m25065;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4 A[LOOP:1: B:8:0x0036->B:16:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[SYNTHETIC] */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25065(byte[] bArr, java.lang.Boolean bool, byte[]... bArr2) {
        int i;
        byte[] bArr3;
        if (bool.booleanValue()) {
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i2 | 87) << 1) - (i2 ^ 87)) % 128;
            util.h.xy.ar.b.m25074(bArr);
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = ((i3 | 3) << 1) - (i3 ^ 3);
            Camera2StreamConfigurationMap = i4 % 128;
            int i5 = i4 % 2;
        }
        java.util.HashMap hashMap = new java.util.HashMap(bArr2.length);
        int length = bArr.length;
        for (byte[] bArr4 : bArr2) {
            util.h.xy.ar.b.m25074(bArr4);
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    int i7 = getHighSpeedVideoFpsRangesFor;
                    int i8 = ((i7 | 9) << 1) - (i7 ^ 9);
                    Camera2StreamConfigurationMap = i8 % 128;
                    if (i8 % 2 == 0 ? bArr[i6] != 15 : bArr[i6] != 110) {
                        if ((bArr[i6] & com.google.common.base.Ascii.SI) == 15) {
                            Camera2StreamConfigurationMap = (i7 + 65) % 128;
                            i = 2;
                            bArr3 = new byte[i];
                            java.lang.System.arraycopy(bArr, i6, bArr3, 0, i);
                            int i9 = (i6 - (~i)) - 1;
                            int i10 = (((i9 | 63) << 1) - (i9 ^ 63)) - 62;
                            int m25084 = util.h.xy.ar.b.m25084(new byte[]{0, 0, 0, bArr[i9]});
                            if (!java.util.Arrays.equals(bArr4, bArr3)) {
                                byte[] bArr5 = new byte[m25084];
                                java.lang.System.arraycopy(bArr, i10, bArr5, 0, m25084);
                                hashMap.put(java.nio.ByteBuffer.wrap(bArr4), new util.h.xy.ar.mb(bArr4, bArr5));
                                break;
                            }
                            i6 = (i10 - (~m25084)) - 1;
                        }
                    }
                    Camera2StreamConfigurationMap = ((i7 & 31) + (i7 | 31)) % 128;
                    i = 1;
                    bArr3 = new byte[i];
                    java.lang.System.arraycopy(bArr, i6, bArr3, 0, i);
                    int i92 = (i6 - (~i)) - 1;
                    int i102 = (((i92 | 63) << 1) - (i92 ^ 63)) - 62;
                    int m250842 = util.h.xy.ar.b.m25084(new byte[]{0, 0, 0, bArr[i92]});
                    if (!java.util.Arrays.equals(bArr4, bArr3)) {
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ar.mb[] m25063(byte[] bArr, byte[]... bArr2) {
        int i = Camera2StreamConfigurationMap + 97;
        getHighSpeedVideoFpsRangesFor = i % 128;
        return m25058(bArr, java.lang.Boolean.valueOf(i % 2 != 0), bArr2);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ar.mb[] m25058(byte[] bArr, java.lang.Boolean bool, byte[]... bArr2) {
        int i = getHighSpeedVideoFpsRangesFor + 35;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25065 = m25065(bArr, bool, bArr2);
            m25065.size();
            util.h.xy.ar.mb[] mbVarArr = new util.h.xy.ar.mb[m25065.size()];
            m25065.values().toArray(mbVarArr);
            int i2 = getHighSpeedVideoFpsRangesFor + 31;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                return mbVarArr;
            }
            throw null;
        }
        java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m250652 = m25065(bArr, bool, bArr2);
        m250652.size();
        m250652.values().toArray(new util.h.xy.ar.mb[m250652.size()]);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ar.mb m25057(byte[] bArr, byte b) {
        int length;
        int i;
        int i2;
        int i3;
        int i4 = Camera2StreamConfigurationMap;
        int i5 = (i4 ^ 101) + ((i4 & 101) << 1);
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            length = bArr.length;
            int length2 = bArr.length;
            i = 1;
        } else {
            length = bArr.length;
            int length3 = bArr.length;
            i = 0;
        }
        while (true) {
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i6 = i * 603;
            int i7 = ((i6 | 302) << 1) - (i6 ^ 302);
            int i8 = ~currentTimeMillis;
            int i9 = -(-(((~((i8 ^ (-2)) | (i8 & (-2)))) | i) * (-602)));
            int i10 = (i7 & i9) + (i7 | i9);
            int i11 = ~i;
            int i12 = ~((i11 ^ (-2)) | (i11 & (-2)));
            int i13 = ~((currentTimeMillis ^ (-2)) | (currentTimeMillis & (-2)));
            int i14 = (i13 ^ i12) | (i13 & i12);
            int i15 = (i8 & 1) | (i8 ^ 1);
            int i16 = ~((i15 ^ i) | (i15 & i));
            int i17 = -(-(((i14 ^ i16) | (i16 & i14)) * (-301)));
            if ((((i10 | i17) << 1) - (i17 ^ i10)) + ((~(i8 | i)) * 301) >= length) {
                int i18 = getHighSpeedVideoFpsRangesFor + 43;
                Camera2StreamConfigurationMap = i18 % 128;
                if (i18 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i19 = Camera2StreamConfigurationMap + 37;
            getHighSpeedVideoFpsRangesFor = i19 % 128;
            if (i19 % 2 == 0) {
                char c = bArr[i];
                i2 = i + 71;
                i3 = bArr[i + 66];
                if (b == c) {
                    break;
                }
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i20 = i3 * (-183);
                int i21 = -(-(i2 * (-183)));
                int i22 = ~i3;
                int i23 = ~currentTimeMillis2;
                int i24 = (i22 ^ i23) | (i22 & i23);
                int i25 = ~((i24 & i2) | (i24 ^ i2));
                int i26 = ~i2;
                int i27 = ~((i26 ^ i23) | (i26 & i23) | i3);
                int i28 = ~((i22 ^ i26) | (i22 & i26));
                int i29 = ~i24;
                int i30 = (i28 ^ i29) | (i29 & i28);
                int i31 = ~(i23 | i26);
                i = ((i3 | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((((i20 | i21) << 1) - (i20 ^ i21)) - (~(-(-(((i25 ^ i27) | (i25 & i27)) * (-184)))))) - 1) + (((i31 ^ i30) | (i30 & i31)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            } else {
                char c2 = bArr[i];
                i2 = i + 2;
                i3 = bArr[i + 1];
                if (b == c2) {
                    break;
                }
                int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                int i202 = i3 * (-183);
                int i212 = -(-(i2 * (-183)));
                int i222 = ~i3;
                int i232 = ~currentTimeMillis22;
                int i242 = (i222 ^ i232) | (i222 & i232);
                int i252 = ~((i242 & i2) | (i242 ^ i2));
                int i262 = ~i2;
                int i272 = ~((i262 ^ i232) | (i262 & i232) | i3);
                int i282 = ~((i222 ^ i262) | (i222 & i262));
                int i292 = ~i242;
                int i302 = (i282 ^ i292) | (i292 & i282);
                int i312 = ~(i232 | i262);
                i = ((i3 | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((((i202 | i212) << 1) - (i202 ^ i212)) - (~(-(-(((i252 ^ i272) | (i252 & i272)) * (-184)))))) - 1) + (((i312 ^ i302) | (i302 & i312)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            }
        }
        byte[] bArr2 = new byte[i3];
        java.lang.System.arraycopy(bArr, i2, bArr2, 0, i3);
        util.h.xy.ar.mb mbVar = new util.h.xy.ar.mb(b, bArr2);
        int i32 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i32 ^ 19) + ((i32 & 19) << 1)) % 128;
        return mbVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.ar.mb m25053(byte[] bArr, byte[] bArr2) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 11) << 1) - (i ^ 11)) % 128;
        util.h.xy.ar.b.m25074(bArr2);
        util.h.xy.ar.b.m25074(bArr);
        int length = bArr.length;
        int length2 = bArr2.length;
        int length3 = bArr.length;
        int length4 = bArr2.length;
        byte[] bArr3 = new byte[length2];
        int i2 = 0;
        while (((i2 | 1) << 1) - (i2 ^ 1) < length) {
            int i3 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i3 | 55) << 1) - (i3 ^ 55)) % 128;
            int i4 = 0;
            while (i4 < length2) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 107) % 128;
                int i5 = (i2 & (-124)) + (i2 | (-124));
                bArr3[i4] = bArr[i2];
                int i6 = (i4 & 30) + (i4 | 30);
                i4 = ((i6 | (-29)) << 1) - (i6 ^ (-29));
                i2 = (i5 | 125) + (i5 & 125);
            }
            int i7 = (i2 ^ 1) + ((i2 & 1) << 1);
            int i8 = bArr[i2];
            if (java.util.Arrays.equals(bArr2, bArr3)) {
                byte[] bArr4 = new byte[i8];
                java.lang.System.arraycopy(bArr, i7, bArr4, 0, i8);
                return new util.h.xy.ar.mb(bArr2, bArr4);
            }
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i9 = i8 * 592;
            int i10 = i7 * (-590);
            int i11 = ~i8;
            int i12 = -(-((~((i11 ^ i7) | (i11 & i7))) * (-1182)));
            int i13 = ~i7;
            int i14 = (i11 & i13) | (i11 ^ i13);
            int i15 = ~currentTimeMillis;
            int i16 = (i11 & currentTimeMillis) | (currentTimeMillis ^ i11);
            i2 = ((((((i9 ^ i10) + ((i9 & i10) << 1)) - (~i12)) - 1) + (((~((i8 & i7) | (i8 ^ i7))) | (~((i14 & i15) | (i14 ^ i15)))) * (-591))) - (~(-(-(((i16 & i13) | (i16 ^ i13)) * 591))))) - 1;
            int i17 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i17 | 25) << 1) - (i17 ^ 25)) % 128;
        }
        util.h.xy.ar.mb mbVar = new util.h.xy.ar.mb(new byte[0], new byte[0]);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        return mbVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ar.mb m25061(byte[] bArr, byte[] bArr2, int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i2 & 93) + (i2 | 93)) % 128;
        if (i >= bArr.length) {
            util.h.xy.ar.mb mbVar = new util.h.xy.ar.mb(new byte[0], new byte[0]);
            int i3 = getHighSpeedVideoFpsRangesFor + 89;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                return mbVar;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ar.b.m25074(bArr2);
        util.h.xy.ar.b.m25074(bArr);
        int length = bArr.length;
        int length2 = bArr2.length;
        int length3 = bArr.length;
        int length4 = bArr2.length;
        byte[] bArr3 = new byte[length2];
        int i4 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i4 & 47) + (i4 | 47)) % 128;
        int i5 = i;
        while (true) {
            int i6 = i5 * (-495);
            int i7 = ((i6 | (-495)) << 1) - (i6 ^ (-495));
            int i8 = ~((~i5) | (-2));
            int i9 = -(-(((~((i ^ (-2)) | (i & (-2)))) | i8) * 992));
            int i10 = (i7 & i9) + (i7 | i9);
            int i11 = ~(i | (-2));
            int i12 = (i8 ^ i11) | (i8 & i11);
            int i13 = ~i;
            int i14 = (i13 ^ 1) | (i13 & 1);
            int i15 = ~((i14 ^ i5) | (i14 & i5));
            int i16 = -(-(((i12 ^ i15) | (i12 & i15)) * (-496)));
            if ((((i10 ^ i16) + ((i16 & i10) << 1)) - (~(((i5 ^ i) | (i5 & i)) * 496))) - 1 >= length) {
                util.h.xy.ar.mb mbVar2 = new util.h.xy.ar.mb(new byte[0], new byte[0]);
                int i17 = Camera2StreamConfigurationMap + 67;
                getHighSpeedVideoFpsRangesFor = i17 % 128;
                if (i17 % 2 != 0) {
                    return mbVar2;
                }
                throw null;
            }
            int i18 = Camera2StreamConfigurationMap;
            int i19 = i18 + 117;
            getHighSpeedVideoFpsRangesFor = i19 % 128;
            int i20 = i19 % 2 == 0 ? 1 : 0;
            getHighSpeedVideoFpsRangesFor = ((i18 ^ 115) + ((i18 & 115) << 1)) % 128;
            while (i20 < length2) {
                int i21 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = ((i21 ^ 53) + ((i21 & 53) << 1)) % 128;
                int i22 = (i5 ^ (-77)) + ((i5 & (-77)) << 1);
                bArr3[i20] = bArr[i5];
                int i23 = (i20 ^ (-83)) + ((i20 & (-83)) << 1);
                i20 = (i23 ^ 84) + ((i23 & 84) << 1);
                i5 = ((i22 | 78) << 1) - (i22 ^ 78);
            }
            int i24 = (i5 & (-113)) + (i5 | (-113));
            int i25 = (i24 ^ 114) + ((i24 & 114) << 1);
            int i26 = bArr[i5];
            if (java.util.Arrays.equals(bArr2, bArr3)) {
                byte[] bArr4 = new byte[i26];
                java.lang.System.arraycopy(bArr, i25, bArr4, 0, i26);
                return new util.h.xy.ar.mb(bArr2, bArr4);
            }
            i5 = (i25 - (~(-(-i26)))) - 1;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ar.mb[] m25062(byte[] bArr, int i, byte b) {
        byte[] bArr2;
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i2 + 67) % 128;
        if (i < bArr.length) {
            int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                bArr2 = new byte[i];
                java.lang.System.arraycopy(bArr, 1, bArr2, 0, i);
            } else {
                bArr2 = new byte[i];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
            }
            bArr = bArr2;
        } else {
            getHighSpeedVideoFpsRangesFor = ((i2 ^ 33) + ((i2 & 33) << 1)) % 128;
        }
        return m25067(bArr, b);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.ar.mb[] m25067(byte[] bArr, byte b) {
        int i;
        int i2;
        util.h.xy.ar.b.m25074(bArr);
        int length = bArr.length;
        int length2 = bArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i5 = i4 * (-751);
            int i6 = ~i4;
            int i7 = (((i5 | (-751)) << 1) - (i5 ^ (-751))) + (((~((i6 ^ (-2)) | (i6 & (-2)))) | (~((currentTimeMillis ^ (-2)) | (currentTimeMillis & (-2))))) * 1504);
            int i8 = (i4 & (-2)) | (i4 ^ (-2));
            int i9 = (~((currentTimeMillis ^ i8) | (currentTimeMillis & i8))) * (-1504);
            int i10 = ((i7 | i9) << 1) - (i9 ^ i7);
            int i11 = ~i8;
            int i12 = ~((i6 & 1) | (i6 ^ 1));
            int i13 = ((i11 ^ i12) | (i11 & i12)) * 752;
            if ((i10 ^ i13) + ((i13 & i10) << 1) >= length) {
                break;
            }
            int i14 = getHighSpeedVideoFpsRangesFor;
            int i15 = ((i14 | 57) << 1) - (i14 ^ 57);
            Camera2StreamConfigurationMap = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = ((i4 | 126) << 1) - (i4 ^ 126);
                int i17 = ((i16 | (-9)) << 1) - (i16 ^ (-9));
                char c = bArr[i4];
                int i18 = ((i17 | 73) << 1) - (i17 ^ 73);
                i = (i18 & 21) + (i18 | 21);
                i2 = bArr[i17];
                if (b != c) {
                    i4 = ((i | i2) << 1) - (i2 ^ i);
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 107) % 128;
                }
                byte[] bArr2 = new byte[i2];
                java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
                arrayList.add(new util.h.xy.ar.mb(b, bArr2));
                i4 = ((i | i2) << 1) - (i2 ^ i);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 107) % 128;
            } else {
                int i19 = (i4 ^ 1) + ((i4 & 1) << 1);
                char c2 = bArr[i4];
                i = (i19 & 1) + (i19 | 1);
                i2 = bArr[i19];
                if (b != c2) {
                    i4 = ((i | i2) << 1) - (i2 ^ i);
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 107) % 128;
                }
                byte[] bArr22 = new byte[i2];
                java.lang.System.arraycopy(bArr, i, bArr22, 0, i2);
                arrayList.add(new util.h.xy.ar.mb(b, bArr22));
                i4 = ((i | i2) << 1) - (i2 ^ i);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 107) % 128;
            }
        }
        util.h.xy.ar.mb[] mbVarArr = new util.h.xy.ar.mb[arrayList.size()];
        while (i3 < arrayList.size()) {
            int i20 = Camera2StreamConfigurationMap;
            int i21 = (i20 ^ 43) + ((i20 & 43) << 1);
            getHighSpeedVideoFpsRangesFor = i21 % 128;
            if (i21 % 2 == 0) {
                util.h.xy.ar.mb mbVar = (util.h.xy.ar.mb) arrayList.get(i3);
                mbVarArr[i3] = mbVar;
                util.h.xy.ar.b.m25074(mbVar.m25110());
                i3 += 5;
            } else {
                util.h.xy.ar.mb mbVar2 = (util.h.xy.ar.mb) arrayList.get(i3);
                mbVarArr[i3] = mbVar2;
                util.h.xy.ar.b.m25074(mbVar2.m25110());
                int i22 = (i3 ^ (-11)) + ((i3 & (-11)) << 1);
                i3 = ((i22 | 12) << 1) - (i22 ^ 12);
            }
        }
        arrayList.clear();
        return mbVarArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25055(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 49) << 1) - (i ^ 49);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.ar.b.m25074(bArr2);
            util.h.xy.ar.b.m25074(bArr3);
            throw null;
        }
        util.h.xy.ar.b.m25074(bArr2);
        util.h.xy.ar.b.m25074(bArr3);
        if (bArr != null) {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = (i3 ^ 59) + ((i3 & 59) << 1);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (bArr2 != null && bArr3 != null) {
                if (bArr.length != 0) {
                    int i5 = i3 + 89;
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 == 0) {
                        int length = bArr2.length;
                        throw null;
                    }
                    if (bArr2.length != 0 && bArr3.length != 0) {
                        int m25060 = m25060(bArr, bArr2);
                        int i6 = bArr[bArr2.length + m25060];
                        int length2 = bArr2.length;
                        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                        int i7 = ((length2 * 141) - (~(-(-(m25060 * (-139)))))) - 1;
                        int i8 = ~length2;
                        int i9 = ~((i8 ^ m25060) | (i8 & m25060));
                        int i10 = ~((i8 ^ currentTimeMillis) | (i8 & currentTimeMillis));
                        int i11 = ((i9 ^ i10) | (i9 & i10)) * (-280);
                        int i12 = ((i7 | i11) << 1) - (i7 ^ i11);
                        int i13 = ~m25060;
                        int i14 = ~((i13 ^ currentTimeMillis) | (i13 & currentTimeMillis));
                        int i15 = -(-(((i14 ^ i10) | (i14 & i10)) * 140));
                        int i16 = (i12 & i15) + (i15 | i12);
                        int i17 = ~(i8 | i13 | currentTimeMillis);
                        int i18 = ~currentTimeMillis;
                        int i19 = (i8 ^ i18) | (i8 & i18);
                        int i20 = ~((m25060 ^ i19) | (m25060 & i19));
                        int i21 = (i20 ^ i17) | (i20 & i17);
                        int i22 = (i18 ^ i13) | (i18 & i13);
                        int i23 = ~((length2 ^ i22) | (length2 & i22));
                        int i24 = ((i23 ^ i21) | (i23 & i21)) * 140;
                        int i25 = (i16 & i24) + (i24 | i16);
                        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                        int i26 = i25 * (-756);
                        int i27 = ~currentTimeMillis2;
                        int i28 = ~i25;
                        int i29 = i28 | 1;
                        int i30 = ((((i26 & 758) + (i26 | 758)) + ((i27 | 1) * (-757))) - (~((~((i29 & currentTimeMillis2) | (i29 ^ currentTimeMillis2))) * 1514))) - 1;
                        int i31 = ~(i28 | (-2));
                        int i32 = ~((i27 ^ i28) | (i27 & i28));
                        int i33 = (i31 ^ i32) | (i32 & i31);
                        int i34 = (i25 ^ 1) | (i25 & 1);
                        int i35 = ~((currentTimeMillis2 ^ i34) | (currentTimeMillis2 & i34));
                        int i36 = ((i35 ^ i33) | (i35 & i33)) * 757;
                        int i37 = (i30 ^ i36) + ((i36 & i30) << 1);
                        int length3 = bArr3.length;
                        int length4 = bArr.length;
                        int length5 = bArr3.length;
                        int i38 = -i6;
                        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                        int i39 = ~length5;
                        int i40 = (~currentTimeMillis3) | i39;
                        int i41 = ~i38;
                        int i42 = (i38 * (-129)) + (length5 * 131) + ((~((i40 ^ i38) | (i40 & i38))) * 130);
                        int i43 = (i38 ^ i39) | (i39 & i38);
                        int i44 = i42 + ((~i43) * (-260)) + (((~(i43 | currentTimeMillis3)) | (~((length5 ^ i41) | (i41 & length5)))) * 130);
                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                        int i45 = ((i44 * 165) - (~(-(-(length4 * (-163)))))) - 1;
                        int i46 = ~currentTimeMillis4;
                        int i47 = ~((i46 ^ length4) | (i46 & length4));
                        int i48 = -(-(((i47 ^ i44) | (i47 & i44)) * (-328)));
                        int i49 = ((i45 | i48) << 1) - (i45 ^ i48);
                        int i50 = -(-(((i44 ^ currentTimeMillis4) | (i44 & currentTimeMillis4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                        int i52 = ~i44;
                        int i53 = ~length4;
                        int i54 = ~((i52 ^ i53) | (i52 & i53));
                        int i55 = ~((currentTimeMillis4 ^ i53) | (currentTimeMillis4 & i53));
                        int i56 = (i55 ^ i54) | (i55 & i54);
                        int i57 = i46 | i44;
                        int i58 = ~((length4 ^ i57) | (length4 & i57));
                        int i59 = ((i56 ^ i58) | (i56 & i58)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                        int i60 = (i51 & i59) + (i59 | i51);
                        int i61 = -(-bArr3.length);
                        int i62 = -(((i37 | i61) << 1) - (i61 ^ i37));
                        byte[] bArr4 = new byte[i60];
                        java.lang.System.arraycopy(bArr, 0, bArr4, 0, i37);
                        java.lang.System.arraycopy(bArr3, 0, bArr4, i37, length3);
                        int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                        int i63 = i37 * (-195);
                        int i64 = ~i37;
                        int i65 = ~i64;
                        int i66 = ~(i65 | i64);
                        int i67 = ~((currentTimeMillis5 ^ i37) | (currentTimeMillis5 & i37));
                        int i68 = (i63 ^ 391) + ((i63 & 391) << 1) + (((i66 & i67) | (i66 ^ i67)) * (-196));
                        int i69 = ((i37 ^ (-1)) | i37) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
                        bArr4[(i68 ^ i69) + ((i69 & i68) << 1) + (((i67 ^ i65) | (i67 & i65)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)] = (byte) bArr3.length;
                        int i70 = bArr[i37 - 1];
                        int length6 = bArr3.length;
                        int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                        int i71 = length6 * 530;
                        int i72 = (i71 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) + ((i71 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) << 1) + (i37 * 530);
                        int i73 = ~currentTimeMillis6;
                        int i74 = ~((i73 ^ length6) | (i73 & length6));
                        int i75 = ~((i37 & length6) | (length6 ^ i37));
                        int i76 = ((i74 ^ i75) | (i75 & i74)) * 529;
                        int i77 = ~((length6 ^ currentTimeMillis6) | (length6 & currentTimeMillis6));
                        java.lang.System.arraycopy(bArr, i70 + i37, bArr4, (i72 & i76) + (i76 | i72) + (((i77 ^ i64) | (i77 & i64)) * 529), (i60 ^ i62) + ((i62 & i60) << 1));
                        int i78 = Camera2StreamConfigurationMap;
                        int i79 = (i78 ^ 107) + ((i78 & 107) << 1);
                        getHighSpeedVideoFpsRangesFor = i79 % 128;
                        if (i79 % 2 != 0) {
                            return bArr4;
                        }
                        throw null;
                    }
                }
                int i80 = getHighSpeedVideoFpsRangesFor + 55;
                Camera2StreamConfigurationMap = i80 % 128;
                if (i80 % 2 == 0) {
                    return bArr;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        int i81 = Camera2StreamConfigurationMap;
        int i82 = ((i81 | 1) << 1) - (i81 ^ 1);
        getHighSpeedVideoFpsRangesFor = i82 % 128;
        if (i82 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25066(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 29) % 128;
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ar.b.m25074(bArr2);
        if (bArr != null) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (((i | 101) << 1) - (i ^ 101)) % 128;
            Camera2StreamConfigurationMap = i2;
            if (bArr2 != null) {
                int i3 = i2 + 95;
                int i4 = i3 % 128;
                getHighSpeedVideoFpsRangesFor = i4;
                if (i3 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (bArr3 == null) {
                    return bArr;
                }
                if (bArr.length != 0) {
                    int i5 = i4 + 85;
                    Camera2StreamConfigurationMap = i5 % 128;
                    if (i5 % 2 != 0) {
                        int length = bArr2.length;
                        throw new java.lang.ArithmeticException();
                    }
                    if (bArr2.length != 0 && bArr3.length != 0) {
                        int m25060 = m25060(bArr, bArr2);
                        if (bArr[bArr2.length + m25060] != bArr3.length) {
                            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f819);
                        }
                        int length2 = bArr2.length;
                        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                        int i6 = length2 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                        int i7 = m25060 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                        int i8 = (length2 ^ m25060) | (length2 & m25060);
                        int i9 = ~currentTimeMillis;
                        int i10 = ~length2;
                        int i11 = (i10 & i9) | (i10 ^ i9);
                        int i12 = ~i11;
                        int i13 = (i6 & i7) + (i6 | i7) + (((i8 & i9) | (i8 ^ i9)) * (-369)) + (((i12 & m25060) | (m25060 ^ i12)) * (-369));
                        int i14 = ~m25060;
                        int i15 = ~((i14 ^ length2) | (i14 & length2));
                        int i16 = ~((length2 ^ currentTimeMillis) | (length2 & currentTimeMillis));
                        int i17 = -(-(((i16 ^ i15) | (i16 & i15) | (~((m25060 ^ i11) | (m25060 & i11)))) * 369));
                        int i18 = (i13 & i17) + (i17 | i13);
                        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                        int i19 = ~i18;
                        int i20 = (((-168) - (~(-(-(i18 * (-167)))))) - (~(((~((i19 & (-2)) | (i19 ^ (-2)))) | (~((i19 & currentTimeMillis2) | (i19 ^ currentTimeMillis2)))) * 336))) - 1;
                        int i21 = ~((i18 ^ 1) | (i18 & 1));
                        int i22 = ~(currentTimeMillis2 | 1);
                        int i23 = ((i21 ^ i22) | (i21 & i22)) * (-168);
                        int i24 = (i20 ^ i23) + ((i23 & i20) << 1);
                        int i25 = -(-(((~((~currentTimeMillis2) | 1)) | i19) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                        java.lang.System.arraycopy(bArr3, 0, bArr, (i24 & i25) + (i25 | i24), bArr3.length);
                        return bArr;
                    }
                }
                Camera2StreamConfigurationMap = (i4 + 91) % 128;
            }
        }
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.ar.mb[] m25059(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3;
        byte b;
        java.util.Arrays.toString(bArr2);
        util.h.xy.ar.b.m25074(bArr);
        int length = bArr.length;
        int length2 = bArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i4 = getHighSpeedVideoFpsRangesFor + 101;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 3;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 = (i - (~(-(-i2)))) - 1) {
            int i8 = Camera2StreamConfigurationMap + 17;
            getHighSpeedVideoFpsRangesFor = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = (i7 & 14) + (i7 | 14);
                int i10 = ((i9 | 86) << 1) - (i9 ^ 86);
                byte b2 = bArr[i7];
                int i11 = ((i10 | 50) << 1) - (i10 ^ 50);
                i = (i11 ^ 37) + ((i11 & 37) << 1);
                i2 = bArr[i10];
                i3 = 1;
                b = b2;
            } else {
                int i12 = i7 + 1;
                byte b3 = bArr[i7];
                i = ((i12 | 1) << 1) - (i12 ^ 1);
                i2 = bArr[i12];
                i3 = 0;
                b = b3;
            }
            while (true) {
                if (i3 < bArr2.length) {
                    int i13 = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    Camera2StreamConfigurationMap = i13 % 128;
                    if (i13 % 2 == 0) {
                        if (bArr2[i3] == b) {
                            byte[] bArr3 = new byte[i2];
                            java.lang.System.arraycopy(bArr, i, bArr3, 0, i2);
                            arrayList.add(new util.h.xy.ar.mb(bArr2[i3], bArr3));
                            int i14 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRangesFor = ((i14 & 31) + (i14 | 31)) % 128;
                            break;
                        }
                        i3++;
                    } else {
                        byte b4 = bArr2[i3];
                        throw new java.lang.ArithmeticException();
                    }
                }
            }
        }
        util.h.xy.ar.mb[] mbVarArr = new util.h.xy.ar.mb[arrayList.size()];
        while (i6 < arrayList.size()) {
            int i15 = getHighSpeedVideoFpsRangesFor;
            int i16 = ((i15 | 119) << 1) - (i15 ^ 119);
            Camera2StreamConfigurationMap = i16 % 128;
            if (i16 % 2 != 0) {
                util.h.xy.ar.mb mbVar = (util.h.xy.ar.mb) arrayList.get(i6);
                mbVarArr[i6] = mbVar;
                util.h.xy.ar.b.m25074(mbVar.m25110());
                i6 += 77;
            } else {
                util.h.xy.ar.mb mbVar2 = (util.h.xy.ar.mb) arrayList.get(i6);
                mbVarArr[i6] = mbVar2;
                util.h.xy.ar.b.m25074(mbVar2.m25110());
                i6++;
            }
        }
        arrayList.clear();
        return mbVarArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25054(byte[] bArr, byte[] bArr2, java.lang.Boolean bool) {
        byte[] bArr3;
        int i;
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i3 & 77) + (i3 | 77)) % 128;
        int i4 = 0;
        while (i4 < bArr.length) {
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i5 = ~currentTimeMillis;
            int i6 = ((-766025161) - (~((~((currentTimeMillis & 708337948) | (currentTimeMillis ^ 708337948))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) + ((((-29753345) ^ i5) | (i5 & (-29753345))) * (-216));
            int i7 = ~((i5 & 708337948) | (i5 ^ 708337948));
            int i8 = ((i7 ^ 199098652) | (i7 & 199098652)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i9 = ~((currentTimeMillis2 ^ (-1868881837)) | (currentTimeMillis2 & (-1868881837)));
            int i10 = ~currentTimeMillis2;
            int i11 = ((((i9 ^ 1851823788) | (i9 & 1851823788)) * 345) - 22481480) + (((~(((-1868881837) ^ i10) | (i10 & (-1868881837)))) | (-2147483645)) * 345);
            int i12 = -(-((~((currentTimeMillis2 ^ (-1851823789)) | (currentTimeMillis2 & (-1851823789)))) * 345));
            if ((i6 ^ i8) + ((i8 & i6) << 1) <= ((i11 | i12) << 1) - (i12 ^ i11) ? (bArr[i4] & 31) == 31 : (bArr[i4] & 'H') == 62) {
                bArr3 = new byte[2];
                java.lang.System.arraycopy(bArr, i4, bArr3, 0, 2);
                int i13 = (i4 ^ 4) + ((i4 & 4) << 1);
                i = (i13 & (-2)) + (i13 | (-2));
            } else {
                bArr3 = new byte[1];
                java.lang.System.arraycopy(bArr, i4, bArr3, 0, 1);
                i = (i4 ^ 1) + ((i4 & 1) << 1);
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 119) % 128;
            }
            int i14 = bArr[i];
            if ((i14 & 128) == 0) {
                i2 = (i ^ 1) + ((i & 1) << 1);
            } else {
                int parseInt = java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(new byte[]{(byte) (i14 & 127)}), 16);
                int i15 = (i - (~(-(-parseInt)))) - 1;
                byte[] bArr4 = new byte[parseInt];
                java.lang.System.arraycopy(bArr, i15, bArr4, 0, parseInt);
                int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                int i16 = (parseInt * (-751)) + (i15 * (-751));
                int i17 = ~parseInt;
                int i18 = ~i15;
                int i19 = ~((i17 & i18) | (i17 ^ i18));
                int i20 = ~((i17 ^ currentTimeMillis3) | (i17 & currentTimeMillis3));
                int i21 = -(-(((i19 ^ i20) | (i20 & i19)) * 1504));
                int i22 = (i16 ^ i21) + ((i21 & i16) << 1);
                int i23 = (i15 & i17) | (i17 ^ i15);
                int i24 = (~((i23 & currentTimeMillis3) | (currentTimeMillis3 ^ i23))) * (-1504);
                int i25 = ((i22 | i24) << 1) - (i24 ^ i22);
                int i26 = ~i23;
                int i27 = ~((i18 ^ parseInt) | (parseInt & i18));
                int i28 = -(-(((i26 ^ i27) | (i26 & i27)) * 752));
                i14 = java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(bArr4), 16);
                i2 = (i28 | i25) + (i28 & i25);
            }
            byte[] bArr5 = new byte[i14];
            java.lang.System.arraycopy(bArr, i2, bArr5, 0, i14);
            int i29 = ((i2 | i14) << 1) - (i14 ^ i2);
            if (java.util.Arrays.equals(bArr3, bArr2)) {
                int i30 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = ((i30 ^ 109) + ((i30 & 109) << 1)) % 128;
                util.h.xy.al.rb.m25016(bArr3);
                if (bool.booleanValue()) {
                    util.h.xy.al.rb.m25016(bArr5);
                }
                return bArr5;
            }
            if ((bArr3[0] & 32) == 32) {
                int i31 = getHighSpeedVideoFpsRangesFor + 115;
                Camera2StreamConfigurationMap = i31 % 128;
                if (i31 % 2 == 0) {
                    util.h.xy.al.rb.m25016(bArr3);
                    byte[] m25054 = m25054(bArr5, bArr2, bool);
                    if (m25054 != null && m25054.length > 0) {
                        return m25054;
                    }
                } else {
                    util.h.xy.al.rb.m25016(bArr3);
                    m25054(bArr5, bArr2, bool);
                    throw null;
                }
            }
            i4 = i29;
        }
        byte[] bArr6 = new byte[0];
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 69) % 128;
        return bArr6;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25052(byte[] bArr, byte[] bArr2) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 3) << 1) - (i ^ 3)) % 128;
        byte[] m25054 = m25054(bArr, bArr2, java.lang.Boolean.TRUE);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        return m25054;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.util.List<byte[]> m25064(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i4 ^ 37) + ((i4 & 37) << 1)) % 128;
            if ((bArr[i3] & 31) == 31) {
                bArr3 = new byte[2];
                java.lang.System.arraycopy(bArr, i3, bArr3, 0, 2);
                i = i3 + 2;
                int i5 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i5 ^ 85) + ((i5 & 85) << 1)) % 128;
            } else {
                bArr3 = new byte[1];
                java.lang.System.arraycopy(bArr, i3, bArr3, 0, 1);
                int i6 = (i3 & 29) + (i3 | 29);
                i = (i6 & (-28)) + (i6 | (-28));
            }
            int i7 = bArr[i];
            if ((i7 & 128) == 0) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 19) % 128;
                int i8 = i - 123;
                i2 = (i8 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + (i8 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            } else {
                int parseInt = java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(new byte[]{(byte) (i7 & 127)}), 16);
                int i9 = i + parseInt;
                byte[] bArr4 = new byte[parseInt];
                java.lang.System.arraycopy(bArr, i9, bArr4, 0, parseInt);
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i10 = parseInt * 628;
                int i11 = i9 * 628;
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                int i13 = (i9 ^ currentTimeMillis) | (i9 & currentTimeMillis);
                int i14 = ~parseInt;
                int i15 = -(-(((i13 ^ i14) | (i13 & i14)) * (-627)));
                int i16 = (i12 ^ i15) + ((i15 & i12) << 1);
                int i17 = ~i9;
                int i18 = ~((i17 ^ currentTimeMillis) | (i17 & currentTimeMillis));
                int i19 = ((i18 ^ parseInt) | (i18 & parseInt)) * (-627);
                int i20 = ((i16 | i19) << 1) - (i19 ^ i16);
                int i21 = ~(i9 | (~currentTimeMillis));
                int i22 = ~((parseInt ^ currentTimeMillis) | (parseInt & currentTimeMillis));
                int i23 = -(-(((i21 ^ i22) | (i21 & i22)) * 627));
                i7 = java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(bArr4), 16);
                i2 = ((i20 | i23) << 1) - (i23 ^ i20);
            }
            byte[] bArr5 = new byte[i7];
            java.lang.System.arraycopy(bArr, i2, bArr5, 0, i7);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i24 = i7 * (-300);
            int i25 = -(-(i2 * 302));
            int i26 = (i24 & i25) + (i24 | i25);
            int i27 = (i7 ^ i2) | (i7 & i2);
            int i28 = (~((i27 ^ currentTimeMillis2) | (i27 & currentTimeMillis2))) * (-301);
            int i29 = ((i26 | i28) << 1) - (i28 ^ i26);
            int i30 = ~i2;
            int i31 = ~(i30 | currentTimeMillis2);
            int i32 = ~currentTimeMillis2;
            int i33 = ~((i32 ^ i7) | (i32 & i7));
            int i34 = ((i31 ^ i33) | (i31 & i33)) * (-301);
            if (java.util.Arrays.equals(bArr3, bArr2)) {
                util.h.xy.al.rb.m25016(bArr3);
                util.h.xy.al.rb.m25016(bArr5);
                arrayList.add(bArr5);
                int i35 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i35 ^ 11) + ((i35 & 11) << 1)) % 128;
            } else if ((bArr3[0] & 32) == 32) {
                int i36 = getHighSpeedVideoFpsRangesFor;
                int i37 = ((i36 | 39) << 1) - (i36 ^ 39);
                Camera2StreamConfigurationMap = i37 % 128;
                if (i37 % 2 != 0) {
                    util.h.xy.al.rb.m25016(bArr3);
                    m25064(bArr5, bArr2).iterator();
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.al.rb.m25016(bArr3);
                java.util.Iterator<byte[]> it = m25064(bArr5, bArr2).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                continue;
            }
            int i38 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i38 & 31) + (i38 | 31)) % 128;
            i3 = ((((i29 | i34) << 1) - (i34 ^ i29)) - (~(((~((~i7) | currentTimeMillis2)) | i30) * 301))) - 1;
        }
        int i39 = getHighSpeedVideoFpsRangesFor + 83;
        Camera2StreamConfigurationMap = i39 % 128;
        if (i39 % 2 == 0) {
            return arrayList;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m25060(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i;
        int i2;
        int i3 = Camera2StreamConfigurationMap;
        int i4 = ((i3 & 15) + (i3 | 15)) % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        if (bArr != 0) {
            int i5 = (i4 & 103) + (i4 | 103);
            int i6 = i5 % 128;
            Camera2StreamConfigurationMap = i6;
            java.lang.Throwable th = null;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (bArr2 != null) {
                if (bArr.length != 0) {
                    getHighSpeedVideoFpsRangesFor = (i6 + 83) % 128;
                    if (bArr2.length != 0) {
                        int i7 = ((i6 | 45) << 1) - (i6 ^ 45);
                        getHighSpeedVideoFpsRangesFor = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = 0;
                        while (i9 < bArr.length) {
                            int i10 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRangesFor = (((i10 | 105) << 1) - (i10 ^ 105)) % 128;
                            int i11 = bArr[i9] & 31;
                            if (i11 == 31) {
                                bArr3 = new byte[2];
                                java.lang.System.arraycopy(bArr, i9, bArr3, 0, 2);
                                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 79) % 128;
                            } else {
                                bArr3 = new byte[1];
                                java.lang.System.arraycopy(bArr, i9, bArr3, 0, 1);
                                int i12 = getHighSpeedVideoFpsRangesFor;
                                Camera2StreamConfigurationMap = ((i12 & 25) + (i12 | 25)) % 128;
                            }
                            if (java.util.Arrays.equals(bArr3, bArr2)) {
                                int i13 = Camera2StreamConfigurationMap;
                                int i14 = (i13 ^ 17) + ((i13 & 17) << 1);
                                getHighSpeedVideoFpsRangesFor = i14 % 128;
                                if (i14 % 2 != 0) {
                                    return i9;
                                }
                                throw th;
                            }
                            if (i11 == 31) {
                                i = ((i9 | 2) << 1) - (i9 ^ 2);
                            } else {
                                i = (i9 ^ 1) + ((i9 & 1) << 1);
                                int i15 = Camera2StreamConfigurationMap;
                                int i16 = ((i15 | 45) << 1) - (i15 ^ 45);
                                getHighSpeedVideoFpsRangesFor = i16 % 128;
                                int i17 = i16 % 2;
                            }
                            int i18 = bArr[i];
                            if ((i18 & 128) == 0) {
                                int i19 = Camera2StreamConfigurationMap + 91;
                                getHighSpeedVideoFpsRangesFor = i19 % 128;
                                if (i19 % 2 == 0) {
                                    int i20 = i + 86;
                                    i2 = (i20 & (-18)) + (i20 | (-18));
                                } else {
                                    i2 = ((i & 121) + (i | 121)) - 120;
                                }
                            } else {
                                int parseInt = java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(new byte[]{(byte) (i18 & 127)}), 16);
                                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                                int i21 = parseInt * (-183);
                                int i22 = i * 185;
                                int i23 = ~parseInt;
                                int i24 = ~i;
                                int i25 = (parseInt ^ i24) | (parseInt & i24);
                                int i26 = ~currentTimeMillis;
                                int i27 = ((((i21 & i22) + (i21 | i22)) - (~(-(-(((i ^ i23) | (i & i23)) * (-368)))))) - 1) + (((i25 ^ i26) | (i25 & i26)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                                int i28 = ~((i24 & i23) | (i23 ^ i24));
                                int i29 = ~((i26 ^ parseInt) | (i26 & parseInt));
                                int i30 = (i28 ^ i29) | (i28 & i29);
                                int i31 = ~((i ^ parseInt) | (i & parseInt));
                                int i32 = -(-(((i30 ^ i31) | (i30 & i31)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                int i33 = ((i27 | i32) << 1) - (i32 ^ i27);
                                byte[] bArr4 = new byte[parseInt];
                                java.lang.System.arraycopy(bArr, i33, bArr4, 0, parseInt);
                                i2 = (parseInt | i33) + (parseInt & i33);
                                i18 = java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(bArr4), 16);
                            }
                            byte[] bArr5 = new byte[i18];
                            java.lang.System.arraycopy(bArr, i2, bArr5, 0, i18);
                            if ((bArr3[0] & 32) == 32) {
                                int i34 = getHighSpeedVideoFpsRangesFor + 65;
                                Camera2StreamConfigurationMap = i34 % 128;
                                if (i34 % 2 != 0) {
                                    m25060(bArr5, bArr2);
                                    throw new java.lang.ArithmeticException();
                                }
                                int m25060 = m25060(bArr5, bArr2);
                                if (m25060 != -1) {
                                    int i35 = getHighSpeedVideoFpsRangesFor;
                                    int i36 = ((i35 ^ 45) + ((i35 & 45) << 1)) % 128;
                                    Camera2StreamConfigurationMap = i36;
                                    int i37 = -(-i2);
                                    int i38 = ((i36 | 125) << 1) - (i36 ^ 125);
                                    getHighSpeedVideoFpsRangesFor = i38 % 128;
                                    if (i38 % 2 != 0) {
                                        return ((m25060 | i37) << 1) - (i37 ^ m25060);
                                    }
                                    throw null;
                                }
                            }
                            i9 = i18 + i2;
                            th = null;
                        }
                        int i39 = Camera2StreamConfigurationMap + 65;
                        getHighSpeedVideoFpsRangesFor = i39 % 128;
                        if (i39 % 2 != 0) {
                            return -1;
                        }
                        throw null;
                    }
                }
                int i40 = (i6 ^ 47) + ((i6 & 47) << 1);
                getHighSpeedVideoFpsRangesFor = i40 % 128;
                if (i40 % 2 != 0) {
                    return -1;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        return -1;
    }
}
