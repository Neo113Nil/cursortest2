package util.h.xy.cm;

/* loaded from: classes5.dex */
public final class mb {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25968(byte[] bArr, byte[] bArr2) throws util.h.xy.cm.ma {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i ^ 119) + ((i & 119) << 1)) % 128;
        if (!util.h.xy.cv.ra.m26070(bArr)) {
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (((i2 | 45) << 1) - (i2 ^ 45)) % 128;
            if (!util.h.xy.cv.ra.m26070(bArr2)) {
                util.h.xy.ek.ra raVar = new util.h.xy.ek.ra(new util.h.xy.eh.mc());
                byte[] bArr3 = new byte[raVar.mo26547()];
                raVar.mo26546(new util.h.xy.ep.mc(bArr));
                raVar.mo26550(bArr2, 0, bArr2.length);
                raVar.mo26548(bArr3, 0);
                int i3 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 115) + ((i3 & 115) << 1)) % 128;
                return bArr3;
            }
        }
        throw new util.h.xy.cm.ma(util.h.xy.al.ra.f308);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m25967(byte[] bArr) throws util.h.xy.cm.ma {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i & 119) + (i | 119)) % 128;
        if (util.h.xy.cv.ra.m26070(bArr)) {
            throw new util.h.xy.cm.ma(util.h.xy.al.ra.f338);
        }
        util.h.xy.eh.mc mcVar = new util.h.xy.eh.mc();
        mcVar.mo26562(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[mcVar.mo26565()];
        mcVar.mo26563(bArr2, 0);
        int i2 = getHighSpeedVideoFpsRangesFor + 9;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m25966(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.cm.ma {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 17) % 128;
        if (!util.h.xy.cv.ra.m26070(bArr)) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 79;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                if (!util.h.xy.cv.ra.m26070(bArr2) && !util.h.xy.cv.ra.m26070(bArr3)) {
                    util.h.xy.ek.ra raVar = new util.h.xy.ek.ra(new util.h.xy.eh.mc());
                    byte[] bArr4 = new byte[raVar.mo26547()];
                    raVar.mo26546(new util.h.xy.ep.mc(bArr));
                    raVar.mo26550(bArr2, 0, bArr2.length);
                    raVar.mo26548(bArr4, 0);
                    if (java.util.Arrays.equals(bArr4, bArr3)) {
                        return true;
                    }
                    int i2 = getHighSpeedVideoFpsRangesFor;
                    getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 15) + ((i2 & 15) << 1)) % 128;
                    int i3 = (i2 & 105) + (i2 | 105);
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    if (i3 % 2 == 0) {
                        return false;
                    }
                    throw new java.lang.ArithmeticException();
                }
            } else {
                util.h.xy.cv.ra.m26070(bArr2);
                throw new java.lang.ArithmeticException();
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f279);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25965(byte[] bArr, byte[] bArr2, int i) {
        util.h.xy.el.a aVar = new util.h.xy.el.a(new util.h.xy.eh.mc());
        aVar.m26568(bArr, bArr2, 100);
        byte[] m26663 = ((util.h.xy.ep.mc) aVar.m26610(128)).m26663();
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i2 | 107) << 1) - (i2 ^ 107)) % 128;
        return m26663;
    }

    private mb() {
    }
}
