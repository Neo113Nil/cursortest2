package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class w implements util.h.xy.dh.md {
    private static int Camera2StreamConfigurationMap = 1;
    private static int[] getHighResolutionOutputSizeshNQ4ISI = {1558357694, 1556197489, 1182502257, -1796004307, -2034951264, -457053329, -1491270061, 1685970346, -920246246, -985909729, 653729325, 1456760848, 1645218328, 1499172773, 1666095721, 124601974, 247797136, -1808419242};
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.rm getOutputMinFrameDuration;

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        int length2 = iArr.length;
        char[] cArr2 = new char[24];
        int[] iArr3 = getHighResolutionOutputSizeshNQ4ISI;
        if (iArr3 != null) {
            int i2 = Camera2StreamConfigurationMap + 69;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i3 = 0;
            while (i3 < length) {
                int i4 = getHighSpeedVideoFpsRangesFor + 7;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 == 0) {
                    iArr2[i3] = (int) (iArr3[i3] & (-5569649899877129369L));
                } else {
                    iArr2[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
                    i3++;
                }
            }
            iArr3 = iArr2;
        }
        int length3 = iArr3.length;
        int[] iArr4 = new int[length3];
        int[] iArr5 = getHighResolutionOutputSizeshNQ4ISI;
        if (iArr5 != null) {
            int length4 = iArr5.length;
            int[] iArr6 = new int[length4];
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 93) % 128;
            for (int i5 = 0; i5 < length4; i5++) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 105) % 128;
                iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i6 = 0; i6 < 16; i6++) {
                cVar.f2627 ^= iArr4[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static util.h.xy.dh.an getHighSpeedVideoFpsRanges(util.h.xy.dh.rm rmVar) throws java.io.IOException {
        try {
            util.h.xy.dh.an anVar = new util.h.xy.dh.an(rmVar.getHighSpeedVideoFpsRangesFor());
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 47) % 128;
            return anVar;
        } catch (java.lang.IllegalArgumentException e) {
            throw new util.h.xy.dh.re(e.getMessage(), e);
        }
    }

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        try {
            return mo26278();
        } catch (java.io.IOException e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{-567862755, 1233285772, -1571920527, -154356051, 1254672296, -1239988684, 1557809322, 830224856, 1258588783, 715202581, -1959191860, -619390962}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 24, objArr);
            throw new util.h.xy.dh.ri(((java.lang.String) objArr[0]).intern(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-567862755, 1233285772, -1571920527, -154356051, 1254672296, -1239988684, 1557809322, 830224856, 1258588783, 715202581, -1959191860, -619390962}, 24 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr2);
                throw new util.h.xy.dh.ri(((java.lang.String) objArr2[0]).intern(), e2);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 31) % 128;
        util.h.xy.dh.an highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration);
        int i = getHighSpeedVideoFpsRanges + 65;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    public w(util.h.xy.dh.rm rmVar) {
        this.getOutputMinFrameDuration = rmVar;
    }
}
