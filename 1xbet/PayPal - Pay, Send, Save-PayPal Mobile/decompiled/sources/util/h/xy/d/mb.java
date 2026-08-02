package util.h.xy.d;

/* loaded from: classes5.dex */
public class mb {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 90;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        return util.h.xy.ar.b.m25076(r1);
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m26188(byte[] bArr, java.util.List<byte[]> list) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 39) % 128;
        java.lang.String m25106 = util.h.xy.ar.b.m25106(bArr);
        int i = 0;
        java.lang.String str = m25106;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = ((i2 | 55) << 1) - (i2 ^ 55);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                str = util.h.xy.ar.b.m25106(list.get(i));
                if (str.startsWith(m25106)) {
                    int i4 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoFpsRanges = ((i4 ^ 121) + ((i4 & 121) << 1)) % 128;
                    break;
                }
                i = ((i | 1) << 1) - (i ^ 1);
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 21) % 128;
            } else {
                util.h.xy.ar.b.m25106(list.get(i));
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26190(java.util.List<util.h.xy.d.a> list) {
        int i = 0;
        if (list != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 103) % 128;
            if (list.size() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i2 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i2 ^ 103) + ((i2 & 103) << 1)) % 128;
                for (util.h.xy.d.a aVar : list) {
                    int i3 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoFpsRanges = ((i3 & 101) + (i3 | 101)) % 128;
                    byte[] m25107 = util.h.xy.ar.mb.m25107(new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION}, util.h.xy.ar.b.m25076(aVar.getAid()));
                    int i4 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoFpsRangesFor = ((i4 & 21) + (i4 | 21)) % 128;
                    for (byte b : m25107) {
                        arrayList.add(java.lang.Byte.valueOf(b));
                    }
                    byte[] m251072 = util.h.xy.ar.mb.m25107(new byte[]{5}, new byte[]{(byte) aVar.getLockStatus().ordinal()});
                    int length = m251072.length;
                    int i5 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoFpsRanges = (((i5 | 85) << 1) - (i5 ^ 85)) % 128;
                    int i6 = 0;
                    while (i6 < length) {
                        arrayList.add(java.lang.Byte.valueOf(m251072[i6]));
                        int i7 = (i6 ^ (-38)) + ((i6 & (-38)) << 1);
                        i6 = (i7 & 39) + (i7 | 39);
                        int i8 = getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRangesFor = ((i8 & 87) + (i8 | 87)) % 128;
                    }
                }
                byte[] bArr = new byte[arrayList.size()];
                int i9 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (((i9 | 7) << 1) - (i9 ^ 7)) % 128;
                while (i < arrayList.size()) {
                    int i10 = getHighSpeedVideoFpsRangesFor;
                    int i11 = (i10 ^ 77) + ((i10 & 77) << 1);
                    getHighSpeedVideoFpsRanges = i11 % 128;
                    if (i11 % 2 == 0) {
                        bArr[i] = ((java.lang.Byte) arrayList.get(i)).byteValue();
                        int i12 = (i & 66) + (i | 66);
                        i = ((i12 | (-34)) << 1) - (i12 ^ (-34));
                    } else {
                        bArr[i] = ((java.lang.Byte) arrayList.get(i)).byteValue();
                        i++;
                    }
                }
                int i13 = getHighSpeedVideoFpsRanges + 87;
                getHighSpeedVideoFpsRangesFor = i13 % 128;
                if (i13 % 2 == 0) {
                    return bArr;
                }
                throw null;
            }
        }
        byte[] bArr2 = new byte[0];
        int i14 = getHighSpeedVideoFpsRanges;
        int i15 = (i14 ^ 63) + ((i14 & 63) << 1);
        getHighSpeedVideoFpsRangesFor = i15 % 128;
        if (i15 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae A[SYNTHETIC] */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m26187(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] next;
        java.lang.String m25106;
        java.lang.String m25074;
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 49) + (i | 49)) % 128;
        java.util.ArrayList<util.h.xy.d.a> arrayList = new java.util.ArrayList();
        java.util.List<byte[]> m26183 = m26183(bArr);
        if (m26183.size() == 0) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(2022, util.h.xy.al.ra.f271);
        }
        int i2 = 0;
        byte[][] bArr2 = {new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION}, new byte[]{80}, new byte[]{-121}};
        java.util.Iterator<byte[]> it = m26183.iterator();
        while (it.hasNext()) {
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = ((i3 | 121) << 1) - (i3 ^ 121);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                next = it.next();
                m25106 = util.h.xy.ar.b.m25106(util.h.xy.ar.a.m25052(next, bArr2[1]));
                if (m25106.isEmpty()) {
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(2022, util.h.xy.al.ra.f330);
                }
                java.lang.String m25072 = util.h.xy.ar.b.m25072(util.h.xy.ar.a.m25052(next, bArr2[1]));
                m25074 = util.h.xy.ar.b.m25074(util.h.xy.ar.a.m25052(next, bArr2[2]));
                if (!m25074.isEmpty()) {
                    int i5 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoFpsRangesFor = ((i5 & 13) + (i5 | 13)) % 128;
                    m25074 = util.h.xy.al.ra.f393;
                    int i6 = getHighSpeedVideoFpsRangesFor;
                    int i7 = (i6 & 115) + (i6 | 115);
                    getHighSpeedVideoFpsRanges = i7 % 128;
                    int i8 = i7 % 2;
                }
                arrayList.add(new util.h.xy.d.a(m25106, m25072, java.lang.Integer.parseInt(m25074), com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED));
            } else {
                next = it.next();
                m25106 = util.h.xy.ar.b.m25106(util.h.xy.ar.a.m25052(next, bArr2[0]));
                if (m25106.isEmpty()) {
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(2022, util.h.xy.al.ra.f330);
                }
                java.lang.String m250722 = util.h.xy.ar.b.m25072(util.h.xy.ar.a.m25052(next, bArr2[1]));
                m25074 = util.h.xy.ar.b.m25074(util.h.xy.ar.a.m25052(next, bArr2[2]));
                if (!m25074.isEmpty()) {
                }
                arrayList.add(new util.h.xy.d.a(m25106, m250722, java.lang.Integer.parseInt(m25074), com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED));
            }
        }
        int i9 = getHighSpeedVideoFpsRanges + 69;
        getHighSpeedVideoFpsRangesFor = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
        if (arrayList.size() == 0) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            return new byte[0];
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (util.h.xy.d.a aVar : arrayList) {
            byte[] m25107 = util.h.xy.ar.mb.m25107(new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION}, util.h.xy.ar.b.m25076(aVar.getAid()));
            int length = m25107.length;
            int i10 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i10 | 77) << 1) - (i10 ^ 77)) % 128;
            int i11 = 0;
            while (i11 < length) {
                int i12 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = ((i12 ^ 87) + ((i12 & 87) << 1)) % 128;
                arrayList2.add(java.lang.Byte.valueOf(m25107[i11]));
                i11 = (i11 ^ 1) + ((i11 & 1) << 1);
                int i13 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i13 ^ 33) + ((i13 & 33) << 1)) % 128;
            }
            byte[] m251072 = util.h.xy.ar.mb.m25107(new byte[]{5}, new byte[]{(byte) aVar.getLockStatus().ordinal()});
            int length2 = m251072.length;
            int i14 = 0;
            while (i14 < length2) {
                int i15 = getHighSpeedVideoFpsRanges + 69;
                getHighSpeedVideoFpsRangesFor = i15 % 128;
                if (i15 % 2 != 0) {
                    arrayList2.add(java.lang.Byte.valueOf(m251072[i14]));
                    i14 = (i14 ^ 109) + ((i14 & 109) << 1);
                } else {
                    arrayList2.add(java.lang.Byte.valueOf(m251072[i14]));
                    int i16 = (i14 ^ (-69)) + ((i14 & (-69)) << 1);
                    i14 = (i16 ^ 70) + ((i16 & 70) << 1);
                }
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 107) % 128;
            }
            int i17 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i17 | 119) << 1) - (i17 ^ 119)) % 128;
        }
        byte[] bArr3 = new byte[arrayList2.size()];
        int i18 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i18 | 89) << 1) - (i18 ^ 89)) % 128;
        while (i2 < arrayList2.size()) {
            int i19 = getHighSpeedVideoFpsRangesFor + 101;
            getHighSpeedVideoFpsRanges = i19 % 128;
            if (i19 % 2 == 0) {
                bArr3[i2] = ((java.lang.Byte) arrayList2.get(i2)).byteValue();
                i2 += 99;
            } else {
                bArr3[i2] = ((java.lang.Byte) arrayList2.get(i2)).byteValue();
                i2 = ((i2 | 1) << 1) - (i2 ^ 1);
            }
        }
        return bArr3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m26186(java.util.List<util.h.xy.d.a> list, java.util.List<byte[]> list2) {
        byte[] m25107;
        int length;
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = 0;
        if (list != null) {
            getHighSpeedVideoFpsRangesFor = (((i2 | 9) << 1) - (i2 ^ 9)) % 128;
            if (list.size() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (util.h.xy.d.a aVar : list) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    byte[] m251072 = util.h.xy.ar.mb.m25107(new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION}, util.h.xy.ar.b.m25076(aVar.getAid()));
                    int length2 = m251072.length;
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 1) % 128;
                    int i5 = 0;
                    while (i5 < length2) {
                        int i6 = getHighSpeedVideoFpsRanges;
                        int i7 = (i6 ^ 41) + ((i6 & 41) << 1);
                        getHighSpeedVideoFpsRangesFor = i7 % 128;
                        if (i7 % 2 != 0) {
                            arrayList2.add(java.lang.Byte.valueOf(m251072[i5]));
                            i5 = ((i5 | 98) << 1) - (i5 ^ 98);
                        } else {
                            arrayList2.add(java.lang.Byte.valueOf(m251072[i5]));
                            i5++;
                        }
                    }
                    if (aVar.getLabel() != null) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
                        if (!aVar.getLabel().isEmpty()) {
                            int i8 = getHighSpeedVideoFpsRanges;
                            int i9 = ((i8 | 57) << 1) - (i8 ^ 57);
                            getHighSpeedVideoFpsRangesFor = i9 % 128;
                            if (i9 % 2 != 0) {
                                m25107 = util.h.xy.ar.mb.m25107(new byte[]{80}, util.h.xy.ar.b.m25069(aVar.getLabel()));
                                length = m25107.length;
                                i = 1;
                            } else {
                                m25107 = util.h.xy.ar.mb.m25107(new byte[]{80}, util.h.xy.ar.b.m25069(aVar.getLabel()));
                                length = m25107.length;
                                i = 0;
                            }
                            while (i < length) {
                                int i10 = getHighSpeedVideoFpsRanges;
                                getHighSpeedVideoFpsRangesFor = ((i10 ^ 45) + ((i10 & 45) << 1)) % 128;
                                arrayList2.add(java.lang.Byte.valueOf(m25107[i]));
                                i = ((i & 101) + (i | 101)) - 100;
                                int i11 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoFpsRanges = ((i11 & 109) + (i11 | 109)) % 128;
                            }
                        }
                    }
                    byte[] m251073 = util.h.xy.ar.mb.m25107(new byte[]{-121}, new byte[]{(byte) aVar.m26129()});
                    int length3 = m251073.length;
                    int i12 = 0;
                    while (i12 < length3) {
                        int i13 = getHighSpeedVideoFpsRangesFor;
                        int i14 = ((i13 | 45) << 1) - (i13 ^ 45);
                        getHighSpeedVideoFpsRanges = i14 % 128;
                        if (i14 % 2 == 0) {
                            arrayList2.add(java.lang.Byte.valueOf(m251073[i12]));
                            int i15 = (i12 & (-10)) + (i12 | (-10));
                            i12 = (i15 ^ 72) + ((i15 & 72) << 1);
                        } else {
                            arrayList2.add(java.lang.Byte.valueOf(m251073[i12]));
                            i12 = (i12 ^ 1) + ((i12 & 1) << 1);
                        }
                        int i16 = getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRangesFor = ((i16 ^ 21) + ((i16 & 21) << 1)) % 128;
                    }
                    byte[] m26188 = m26188(m251072, list2);
                    if (m26188.length > arrayList2.size()) {
                        int i17 = getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRangesFor = ((i17 & 13) + (i17 | 13)) % 128;
                        int size = arrayList2.size();
                        while (size < m26188.length) {
                            int i18 = getHighSpeedVideoFpsRanges;
                            getHighSpeedVideoFpsRangesFor = ((i18 & 81) + (i18 | 81)) % 128;
                            arrayList2.add(java.lang.Byte.valueOf(m26188[size]));
                            int i19 = size + 95;
                            size = (i19 ^ (-94)) + ((i19 & (-94)) << 1);
                        }
                    }
                    byte[] bArr = new byte[arrayList2.size()];
                    for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                        bArr[i20] = ((java.lang.Byte) arrayList2.get(i20)).byteValue();
                    }
                    byte[] m251074 = util.h.xy.ar.mb.m25107(new byte[]{97}, bArr);
                    int length4 = m251074.length;
                    int i21 = 0;
                    while (i21 < length4) {
                        arrayList.add(java.lang.Byte.valueOf(m251074[i21]));
                        i21++;
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 121) % 128;
                    }
                    int i22 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoFpsRangesFor = ((i22 & 57) + (i22 | 57)) % 128;
                }
                byte[] bArr2 = new byte[arrayList.size()];
                while (i4 < arrayList.size()) {
                    int i23 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoFpsRangesFor = ((i23 ^ 31) + ((i23 & 31) << 1)) % 128;
                    bArr2[i4] = ((java.lang.Byte) arrayList.get(i4)).byteValue();
                    int i24 = (i4 & 40) + (i4 | 40);
                    i4 = ((i24 | (-39)) << 1) - (i24 ^ (-39));
                }
                util.h.xy.ar.b.m25106(bArr2);
                return bArr2;
            }
        }
        return new byte[0];
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26189(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i2 & 63) + (i2 | 63)) % 128;
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            getHighSpeedVideoFpsRanges = i4;
            if ((bArr[i3] & com.google.common.base.Ascii.US) == 31) {
                getHighSpeedVideoFpsRangesFor = ((i4 & 119) + (i4 | 119)) % 128;
                bArr4 = new byte[2];
                java.lang.System.arraycopy(bArr, i3, bArr4, 0, 2);
                i = i3 + 2;
                int i5 = getHighSpeedVideoFpsRanges + 29;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                int i6 = i5 % 2;
            } else {
                bArr4 = new byte[1];
                java.lang.System.arraycopy(bArr, i3, bArr4, 0, 1);
                int i7 = ((i3 | 45) << 1) - (i3 ^ 45);
                i = (i7 & (-44)) + (i7 | (-44));
                int i8 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (((i8 | 25) << 1) - (i8 ^ 25)) % 128;
            }
            byte b = bArr[i];
            if ((b & 128) == 0) {
                int i9 = getHighSpeedVideoFpsRangesFor + 43;
                getHighSpeedVideoFpsRanges = i9 % 128;
                i3 = i9 % 2 == 0 ? (i & 73) + (i | 73) + 12 : (i & 1) + (i | 1);
            } else {
                int parseInt = java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(new byte[]{(byte) (b & Byte.MAX_VALUE)}), 16);
                int i10 = (i ^ parseInt) + ((i & parseInt) << 1);
                byte[] bArr5 = new byte[parseInt];
                java.lang.System.arraycopy(bArr, i10, bArr5, 0, parseInt);
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i11 = parseInt * 980;
                int i12 = -(-(i10 * (-978)));
                int i13 = ~currentTimeMillis;
                int i14 = ~i10;
                int i15 = (i11 & i12) + (i11 | i12) + ((~(i14 | i13)) * 979) + (((parseInt ^ currentTimeMillis) | (parseInt & currentTimeMillis)) * (-979));
                int i16 = ~(i14 | currentTimeMillis);
                int i17 = ~((parseInt ^ i13) | (parseInt & i13));
                int i18 = ((i17 ^ i16) | (i17 & i16)) * 979;
                java.lang.Integer.parseInt(util.h.xy.al.rb.m25016(bArr5), 16);
                i3 = ((i15 | i18) << 1) - (i18 ^ i15);
            }
            if (java.util.Arrays.equals(bArr4, bArr2)) {
                int i19 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = ((i19 & 35) + (i19 | 35)) % 128;
                java.lang.System.arraycopy(bArr3, 0, bArr, i3, bArr3.length);
                return;
            }
            int i20 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i20 ^ 25) + ((i20 & 25) << 1)) % 128;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26192(byte[] bArr, byte[] bArr2) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 57) % 128;
        m26189(bArr, new byte[]{-91}, bArr2);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 49) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26185(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            m26189(bArr, new byte[]{com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.FF}, bArr2);
        } else {
            m26189(bArr, new byte[]{com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.FF}, bArr2);
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.util.List<byte[]> m26183(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor + 87;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            java.util.List<byte[]> m25064 = util.h.xy.ar.a.m25064(m26191(bArr), new byte[]{97});
            if (m25064.size() == 0) {
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f855);
            }
            int i2 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (((i2 | 45) << 1) - (i2 ^ 45)) % 128;
            return m25064;
        }
        util.h.xy.ar.a.m25064(m26191(bArr), new byte[]{97}).size();
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26191(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 61) % 128;
        byte[] m25052 = util.h.xy.ar.a.m25052(m26193(bArr), new byte[]{com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.FF});
        if (m25052.length == 0) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f847);
        }
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 61) + (i | 61);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return m25052;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26193(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 37) << 1) - (i ^ 37);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.ar.b.m25106(bArr);
            byte[] m25052 = util.h.xy.ar.a.m25052(bArr, new byte[]{111});
            if (m25052.length == 0) {
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f856);
            }
            byte[] m250522 = util.h.xy.ar.a.m25052(m25052, new byte[]{-91});
            if (m250522.length != 0) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = ((i3 & 19) + (i3 | 19)) % 128;
                return m250522;
            }
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f334);
        }
        util.h.xy.ar.b.m25106(bArr);
        int length = util.h.xy.ar.a.m25052(bArr, new byte[]{111}).length;
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.util.Map<java.lang.String, com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus> m26184(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (bArr != null) {
            int i = getHighSpeedVideoFpsRanges + 3;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length != 0) {
                com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus2 = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED;
                int length2 = bArr.length;
                int i2 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i2 | 71) << 1) - (i2 ^ 71)) % 128;
                int i3 = 0;
                do {
                    util.h.xy.ar.mb m25061 = util.h.xy.ar.a.m25061(bArr, new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION}, i3);
                    byte b = util.h.xy.ar.a.m25061(bArr, new byte[]{5}, i3).m25110()[0];
                    if (b == 1) {
                        int i4 = getHighSpeedVideoFpsRangesFor;
                        getHighSpeedVideoFpsRanges = ((i4 & 69) + (i4 | 69)) % 128;
                        lockStatus = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED;
                    } else {
                        if (b != 0) {
                            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f327);
                        }
                        int i5 = getHighSpeedVideoFpsRanges;
                        int i6 = (i5 & 1) + (i5 | 1);
                        getHighSpeedVideoFpsRangesFor = i6 % 128;
                        if (i6 % 2 != 0) {
                            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus3 = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED;
                            throw new java.lang.ArithmeticException();
                        }
                        lockStatus = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED;
                    }
                    hashMap.put(util.h.xy.ar.b.m25106(m25061.m25110()), lockStatus);
                    int length3 = m25061.m25108().length;
                    int i7 = (length3 & 3) + (length3 | 3);
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i8 = i7 * (-755);
                    int i9 = i3 * (-755);
                    int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
                    int i11 = ~i7;
                    int i12 = ~i3;
                    int i13 = ~((i11 ^ i12) | (i12 & i11));
                    int i14 = -(-(i13 * 1512));
                    int i15 = (i10 ^ i14) + ((i14 & i10) << 1);
                    int i16 = (i3 ^ i7) | (i3 & i7);
                    int i17 = -(-(((~(i16 | currentTimeMillis)) | i13) * (-756)));
                    int i18 = (i15 ^ i17) + ((i17 & i15) << 1);
                    int i19 = ~currentTimeMillis;
                    int i20 = ((i16 ^ i19) | (i16 & i19)) * 756;
                    i3 = (i20 & i18) + (i20 | i18);
                } while (i3 < length2);
                return hashMap;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
        return hashMap;
    }
}
