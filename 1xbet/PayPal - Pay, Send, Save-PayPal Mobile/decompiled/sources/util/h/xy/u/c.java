package util.h.xy.u;

/* loaded from: classes5.dex */
public class c {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    static {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 85) + (i | 85)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m27503(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = util.h.xy.k.ra.f2243.m26950(str);
        boolean booleanValue = util.h.xy.k.ra.f2243.m26940(str).booleanValue();
        boolean z = false;
        if (!util.h.xy.u.d.m27514(m26950)) {
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i & 61) + (i | 61)) % 128;
            return false;
        }
        if (m27504(str, booleanValue)) {
            int i2 = getHighSpeedVideoFpsRangesFor + 91;
            getHighSpeedVideoFpsRanges = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    util.h.xy.k.ra.f2243.m26968(str);
                    throw new java.lang.ArithmeticException();
                }
                if (util.h.xy.k.ra.f2243.m26968(str)) {
                    int i3 = getHighSpeedVideoFpsRanges;
                    int i4 = (i3 & 37) + (i3 | 37);
                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                    if (i4 % 2 == 0) {
                        java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR.getCode(), util.h.xy.f.b.f2201.m26779(str));
                        throw new java.lang.NullPointerException();
                    }
                    byte[] m26779 = util.h.xy.f.b.f2201.m26779(str);
                    if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR.getCode(), m26779)) {
                        if (booleanValue) {
                            z = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2198);
                            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                        } else {
                            z = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2185);
                        }
                    } else if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode(), m26779)) {
                        int i5 = getHighSpeedVideoFpsRangesFor;
                        getHighSpeedVideoFpsRanges = ((i5 ^ 81) + ((i5 & 81) << 1)) % 128;
                        z = booleanValue ? util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186) : util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192);
                    } else if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode(), m26779)) {
                        int i6 = getHighSpeedVideoFpsRangesFor;
                        int i7 = ((i6 & 75) + (i6 | 75)) % 128;
                        getHighSpeedVideoFpsRanges = i7;
                        if (booleanValue) {
                            int i8 = i7 + 117;
                            getHighSpeedVideoFpsRangesFor = i8 % 128;
                            if (i8 % 2 == 0) {
                                boolean m26784 = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2199);
                                try {
                                    throw null;
                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                    z = m26784;
                                    e = e;
                                    e.getMessage();
                                    return z;
                                }
                            }
                            z = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2199);
                        } else {
                            z = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2190);
                        }
                    } else if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode(), m26779)) {
                        if (booleanValue) {
                            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186)) {
                                int i9 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoFpsRanges = ((i9 ^ 49) + ((i9 & 49) << 1)) % 128;
                                if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2198)) {
                                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 103) % 128;
                                    z = true;
                                }
                            }
                        } else if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192)) {
                            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 75) % 128;
                            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2185)) {
                                int i10 = getHighSpeedVideoFpsRanges;
                                getHighSpeedVideoFpsRangesFor = (((i10 | 97) << 1) - (i10 ^ 97)) % 128;
                                z = true;
                            }
                        }
                    } else if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode(), m26779)) {
                        if (booleanValue) {
                            int i11 = getHighSpeedVideoFpsRangesFor;
                            int i12 = (i11 & 21) + (i11 | 21);
                            getHighSpeedVideoFpsRanges = i12 % 128;
                            if (i12 % 2 != 0) {
                                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186);
                                throw new java.lang.NullPointerException();
                            }
                            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186) && util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2199)) {
                                z = true;
                            }
                        } else {
                            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192)) {
                                int i13 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoFpsRanges = ((i13 ^ 29) + ((i13 & 29) << 1)) % 128;
                                if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2190)) {
                                    z = true;
                                }
                            }
                            int i14 = getHighSpeedVideoFpsRangesFor;
                            getHighSpeedVideoFpsRanges = ((i14 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i14 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                        }
                    } else if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode(), m26779)) {
                        int i15 = getHighSpeedVideoFpsRangesFor;
                        int i16 = i15 + 53;
                        getHighSpeedVideoFpsRanges = i16 % 128;
                        if (i16 % 2 != 0) {
                            throw null;
                        }
                        if (booleanValue) {
                            int i17 = (i15 ^ 121) + ((i15 & 121) << 1);
                            getHighSpeedVideoFpsRanges = i17 % 128;
                            if (i17 % 2 != 0) {
                                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186);
                                throw new java.lang.ArithmeticException();
                            }
                            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186) && util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2199)) {
                                int i18 = getHighSpeedVideoFpsRangesFor;
                                int i19 = (i18 ^ 19) + ((i18 & 19) << 1);
                                getHighSpeedVideoFpsRanges = i19 % 128;
                                if (i19 % 2 != 0) {
                                    util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2198);
                                    throw new java.lang.ArithmeticException();
                                }
                                if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2198)) {
                                    int i20 = getHighSpeedVideoFpsRanges;
                                    getHighSpeedVideoFpsRangesFor = ((i20 ^ 97) + ((i20 & 97) << 1)) % 128;
                                    z = true;
                                }
                            }
                        } else {
                            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192) && util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2190)) {
                                int i21 = getHighSpeedVideoFpsRangesFor + 99;
                                getHighSpeedVideoFpsRanges = i21 % 128;
                                if (i21 % 2 != 0) {
                                    util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2185);
                                    throw new java.lang.NullPointerException();
                                }
                                if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2185)) {
                                    z = true;
                                    int i22 = getHighSpeedVideoFpsRanges;
                                    getHighSpeedVideoFpsRangesFor = (((i22 | 51) << 1) - (i22 ^ 51)) % 128;
                                }
                            }
                            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 27) % 128;
                            int i222 = getHighSpeedVideoFpsRanges;
                            getHighSpeedVideoFpsRangesFor = (((i222 | 51) << 1) - (i222 ^ 51)) % 128;
                        }
                    }
                }
                int i23 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = ((i23 ^ 29) + ((i23 & 29) << 1)) % 128;
                return z;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                e = e2;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27498() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            if (m27495()) {
                z = false;
                int i3 = (getHighSpeedVideoFpsRangesFor + 39) % 128;
                getHighSpeedVideoFpsRanges = i3;
                if (z) {
                    getHighSpeedVideoFpsRangesFor = (i3 + 117) % 128;
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            if (m27495()) {
                z = true;
                int i32 = (getHighSpeedVideoFpsRangesFor + 39) % 128;
                getHighSpeedVideoFpsRanges = i32;
                if (z) {
                }
            }
            z2 = false;
        }
        if (m27499()) {
            int i4 = getHighSpeedVideoFpsRanges + 79;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (z2) {
                z3 = true;
                if (m27505()) {
                    int i5 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoFpsRanges = (((i5 | 81) << 1) - (i5 ^ 81)) % 128;
                    if (z3) {
                        z4 = true;
                        boolean z6 = !m27494() && z4;
                        if (m27501()) {
                            int i6 = getHighSpeedVideoFpsRanges;
                            getHighSpeedVideoFpsRangesFor = ((i6 & 39) + (i6 | 39)) % 128;
                            if (z6) {
                                z5 = true;
                                boolean z7 = !m27490() && z5;
                                if (m27493() || !z7) {
                                    return false;
                                }
                                int i7 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoFpsRanges = ((i7 & 31) + (i7 | 31)) % 128;
                                return true;
                            }
                        }
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                        z5 = false;
                        if (m27490()) {
                        }
                        if (m27493()) {
                        }
                        return false;
                    }
                }
                z4 = false;
                if (m27494()) {
                }
                if (m27501()) {
                }
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                z5 = false;
                if (m27490()) {
                }
                if (m27493()) {
                }
                return false;
            }
        }
        int i8 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i8 ^ 81) + ((i8 & 81) << 1)) % 128;
        z3 = false;
        if (m27505()) {
        }
        z4 = false;
        if (m27494()) {
        }
        if (m27501()) {
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 23) % 128;
        z5 = false;
        if (m27490()) {
        }
        if (m27493()) {
        }
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m27495() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges;
        boolean z = true;
        int i2 = ((i | 27) << 1) - (i ^ 27);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            m27502();
            throw new java.lang.ArithmeticException();
        }
        if (m27502() && m27496()) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 39) % 128;
        } else {
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i3 & 25) + (i3 | 25)) % 128;
            z = false;
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 33;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m27496() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 67) % 128;
        if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2186)) {
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i ^ 7) + ((i & 7) << 1)) % 128;
            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2199) && util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2198)) {
                int i2 = (getHighSpeedVideoFpsRangesFor + 15) % 128;
                getHighSpeedVideoFpsRanges = i2;
                getHighSpeedVideoFpsRangesFor = (((i2 | 87) << 1) - (i2 ^ 87)) % 128;
                z = true;
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = ((i3 ^ 113) + ((i3 & 113) << 1)) % 128;
                return z;
            }
        }
        z = false;
        int i32 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i32 ^ 113) + ((i32 & 113) << 1)) % 128;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27502() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        int i;
        int i2 = getHighSpeedVideoFpsRanges + 47;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192);
            throw null;
        }
        if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2192) && util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2185)) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i3 | 5) << 1) - (i3 ^ 5)) % 128;
            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2190)) {
                int i4 = getHighSpeedVideoFpsRangesFor;
                int i5 = ((i4 ^ 9) + ((i4 & 9) << 1)) % 128;
                getHighSpeedVideoFpsRanges = i5;
                getHighSpeedVideoFpsRangesFor = (i5 + 77) % 128;
                z = true;
                int i6 = getHighSpeedVideoFpsRanges;
                i = (i6 ^ 79) + ((i6 & 79) << 1);
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0) {
                    return z;
                }
                throw null;
            }
        }
        z = false;
        int i62 = getHighSpeedVideoFpsRanges;
        i = (i62 ^ 79) + ((i62 & 79) << 1);
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m27499() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        util.h.xy.g.c.m26868();
        if (m27492()) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 61) % 128;
            if (m27491()) {
                int i = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (i + 107) % 128;
                z = true;
                getHighSpeedVideoFpsRanges = (((i | 87) << 1) - (i ^ 87)) % 128;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 27) % 128;
                return z;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
        z = false;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 27) % 128;
        return z;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m27491() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 71) + (i | 71);
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        util.h.xy.f.b bVar = util.h.xy.f.b.f2201;
        if (i3 != 0) {
            bVar.m26784(util.h.xy.f.a.f2184);
            throw new java.lang.ArithmeticException();
        }
        boolean z = false;
        if (bVar.m26784(util.h.xy.f.a.f2184) && util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2194)) {
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = (i4 & 93) + (i4 | 93);
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 == 0) {
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2191);
                throw null;
            }
            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2191)) {
                int i6 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i6 & 25) + (i6 | 25)) % 128;
                z = true;
            }
        }
        int i7 = getHighSpeedVideoFpsRanges;
        int i8 = (i7 & 91) + (i7 | 91);
        getHighSpeedVideoFpsRangesFor = i8 % 128;
        if (i8 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m27492() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 37) + ((i & 37) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        util.h.xy.f.b bVar = util.h.xy.f.b.f2201;
        if (i3 == 0) {
            bVar.m26784(util.h.xy.f.a.f2189);
            throw null;
        }
        if (!bVar.m26784(util.h.xy.f.a.f2189) || !util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2200)) {
            return false;
        }
        int i4 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i4 ^ 11) + ((i4 & 11) << 1)) % 128;
        if (!util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2187)) {
            return false;
        }
        int i5 = getHighSpeedVideoFpsRangesFor;
        int i6 = (((i5 | 67) << 1) - (i5 ^ 67)) % 128;
        getHighSpeedVideoFpsRanges = i6;
        getHighSpeedVideoFpsRangesFor = (i6 + 35) % 128;
        return true;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public static boolean m27505() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor + 77;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2193);
            throw new java.lang.ArithmeticException();
        }
        boolean m26784 = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2193);
        int i2 = getHighSpeedVideoFpsRanges + 57;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return m26784;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static boolean m27501() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i | 17) << 1) - (i ^ 17)) % 128;
        if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2197)) {
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i2 = (currentTimeMillis ^ (-1091696545)) | (currentTimeMillis & (-1091696545));
            int i3 = ~i2;
            int i4 = ((i3 ^ (-332306021)) | (i3 & (-332306021))) * (-465);
            int i5 = (i4 ^ 1002637825) + ((i4 & 1002637825) << 1);
            int i6 = ~((currentTimeMillis ^ (-332306021)) | (currentTimeMillis & (-332306021)));
            int i7 = ((i6 ^ (-1091696545)) | (i6 & (-1091696545))) * 930;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i8 = ~currentTimeMillis2;
            int i9 = (i8 ^ 311973964) | (i8 & 311973964);
            int i10 = -(-(((~i9) | (-467369294) | (~(currentTimeMillis2 | (-268976193)))) * (-252)));
            int i11 = ((i10 & (-1611814483)) + (i10 | (-1611814483))) - 937476100;
            int i12 = ~((i9 ^ (-424371522)) | (i9 & (-424371522)));
            int i13 = ~((currentTimeMillis2 ^ (-268976193)) | (currentTimeMillis2 & (-268976193)));
            int i14 = -(-(((i13 ^ i12) | (i13 & i12)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
            if ((i5 ^ i7) + ((i7 & i5) << 1) + (((i2 ^ (-332306021)) | (i2 & (-332306021))) * 465) > ((i11 | i14) << 1) - (i14 ^ i11)) {
                util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2196);
                throw null;
            }
            if (util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2196)) {
                int i15 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (i15 + 95) % 128;
                getHighSpeedVideoFpsRanges = (i15 + 43) % 128;
                z = true;
                int i16 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i16 | 95) << 1) - (i16 ^ 95)) % 128;
                return z;
            }
        }
        int i17 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i17 & 91) + (i17 | 91)) % 128;
        z = false;
        int i162 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i162 | 95) << 1) - (i162 ^ 95)) % 128;
        return z;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m27490() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        boolean m26784 = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2195);
        int i = getHighSpeedVideoFpsRangesFor + 59;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return m26784;
        }
        throw null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static boolean m27494() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor + 59;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2188);
            throw new java.lang.ArithmeticException();
        }
        boolean m26784 = util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2188);
        int i2 = getHighSpeedVideoFpsRanges + 51;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return m26784;
        }
        throw null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m27493() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 15) + ((i & 15) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        util.h.xy.f.b bVar = util.h.xy.f.b.f2201;
        if (i2 % 2 == 0) {
            return bVar.m26748();
        }
        bVar.m26748();
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m27497(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 97;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            boolean m26763 = util.h.xy.f.b.f2201.m26763(util.h.xy.f.a.f2182, str.getBytes(util.h.xy.h.a.f2221));
            int i2 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i2 ^ 33) + ((i2 & 33) << 1)) % 128;
            return m26763;
        }
        util.h.xy.f.b.f2201.m26763(util.h.xy.f.a.f2182, str.getBytes(util.h.xy.h.a.f2221));
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m27504(java.lang.String str, boolean z) {
        byte[] m26779 = util.h.xy.f.b.f2201.m26779(str);
        util.h.xy.ar.b.m25074(m26779);
        if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode(), m26779)) {
            if (z) {
                return util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2186);
            }
            boolean m26755 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2192);
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i ^ 51) + ((i & 51) << 1)) % 128;
            return m26755;
        }
        if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR.getCode(), m26779)) {
            if (!z) {
                return util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2185);
            }
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = ((i2 | 27) << 1) - (i2 ^ 27);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2198);
                throw new java.lang.ArithmeticException();
            }
            boolean m267552 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2198);
            int i4 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i4 ^ 17) + ((i4 & 17) << 1)) % 128;
            return m267552;
        }
        if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode(), m26779)) {
            if (z) {
                return util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2199);
            }
            boolean m267553 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2190);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 79) % 128;
            return m267553;
        }
        if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode(), m26779)) {
            if (z) {
                if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2186)) {
                    int i5 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoFpsRangesFor = ((i5 & 119) + (i5 | 119)) % 128;
                    if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2198)) {
                        return true;
                    }
                }
                return false;
            }
            if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2192)) {
                int i6 = getHighSpeedVideoFpsRanges;
                int i7 = (i6 & 3) + (i6 | 3);
                getHighSpeedVideoFpsRangesFor = i7 % 128;
                if (i7 % 2 == 0) {
                    util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2185);
                    throw null;
                }
                if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2185)) {
                    return true;
                }
            }
            return false;
        }
        if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode(), m26779)) {
            if (z) {
                boolean z2 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2186) && util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2199);
                int i8 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i8 & 39) + (i8 | 39)) % 128;
                return z2;
            }
            if (!util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2192) || !util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2190)) {
                return false;
            }
            int i9 = getHighSpeedVideoFpsRanges + 99;
            getHighSpeedVideoFpsRangesFor = i9 % 128;
            return i9 % 2 != 0;
        }
        if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode(), m26779)) {
            if (z) {
                if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2186)) {
                    int i10 = getHighSpeedVideoFpsRanges;
                    int i11 = ((i10 | 35) << 1) - (i10 ^ 35);
                    getHighSpeedVideoFpsRangesFor = i11 % 128;
                    if (i11 % 2 == 0) {
                        util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2199);
                        throw null;
                    }
                    if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2199) && util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2198)) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 29) % 128;
                        return true;
                    }
                }
                return false;
            }
            if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2192) && util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2190)) {
                int i12 = getHighSpeedVideoFpsRanges;
                int i13 = (i12 & 79) + (i12 | 79);
                getHighSpeedVideoFpsRangesFor = i13 % 128;
                if (i13 % 2 == 0) {
                    util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2185);
                    throw null;
                }
                if (util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2185)) {
                    int i14 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoFpsRanges = (((i14 | 75) << 1) - (i14 ^ 75)) % 128;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m27500(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z) {
        boolean z2;
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i2 & 95) + (i2 | 95)) % 128;
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = (i3 & 107) + (i3 | 107);
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (!z) {
                z2 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2200);
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
                return z2;
            }
            z2 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2194);
            int i5 = getHighSpeedVideoFpsRangesFor;
            i = ((i5 | 43) << 1) - (i5 ^ 43);
            getHighSpeedVideoFpsRanges = i % 128;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
            return z2;
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            int i6 = getHighSpeedVideoFpsRangesFor;
            int i7 = ((i6 | 41) << 1) - (i6 ^ 41);
            getHighSpeedVideoFpsRanges = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            if (z) {
                z2 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2184);
                int i8 = getHighSpeedVideoFpsRangesFor;
                i = (i8 & 125) + (i8 | 125);
                getHighSpeedVideoFpsRanges = i % 128;
            } else {
                z2 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2189);
            }
        } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            int i9 = getHighSpeedVideoFpsRangesFor;
            int i10 = i9 + 17;
            getHighSpeedVideoFpsRanges = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (z) {
                int i11 = (i9 ^ 77) + ((i9 & 77) << 1);
                getHighSpeedVideoFpsRanges = i11 % 128;
                if (i11 % 2 != 0) {
                    util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2191);
                    throw new java.lang.ArithmeticException();
                }
                z2 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2191);
            } else {
                z2 = util.h.xy.f.b.f2201.m26755(util.h.xy.f.a.f2187);
            }
        } else {
            z2 = false;
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
        return z2;
    }
}
