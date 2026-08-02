package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class mg extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    private static int Camera2StreamConfigurationMap = 0;
    static final util.h.xy.dh.p getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int getInputSizeshNQ4ISI;
    private static long getOutputFormats;
    final byte[] getHighSpeedVideoFpsRangesFor;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 45) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 85) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputFormats ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    static {
        getHighSpeedVideoSizes();
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.p(util.h.xy.dh.mg.class) { // from class: util.h.xy.dh.mg.5
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = getHighSpeedVideoSizes;
                int i2 = (i & 99) + (i | 99);
                Camera2StreamConfigurationMap = i2 % 128;
                byte[] m26337 = mzVar.m26337();
                if (i2 % 2 != 0) {
                    util.h.xy.dh.mg.getHighSpeedVideoFpsRanges(m26337);
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.dh.mg highSpeedVideoFpsRanges = util.h.xy.dh.mg.getHighSpeedVideoFpsRanges(m26337);
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 113) % 128;
                return highSpeedVideoFpsRanges;
            }
        };
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 71) % 128;
    }

    static util.h.xy.dh.mg getHighSpeedVideoFpsRanges(byte[] bArr) {
        util.h.xy.dh.y yVar = new util.h.xy.dh.y(bArr);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 119) % 128;
        return yVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m26320(java.lang.String str) {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 111) % 128;
        for (int length = str.length() - 1; length >= 0; length--) {
            int i = getInputSizeshNQ4ISI + 79;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                if (str.charAt(length) > '3') {
                    return false;
                }
            } else if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 19) % 128;
        int m26817 = util.h.xy.fb.a.m26817(this.getHighSpeedVideoFpsRangesFor);
        int i = getHighSpeedVideoSizes + 63;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return m26817;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighSpeedVideoSizes;
        getInputSizeshNQ4ISI = (i + 97) % 128;
        if (!(miVar instanceof util.h.xy.dh.mg)) {
            getInputSizeshNQ4ISI = (i + 9) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getHighSpeedVideoFpsRangesFor, ((util.h.xy.dh.mg) miVar).getHighSpeedVideoFpsRangesFor);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 113) % 128;
        return m26820;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 67) % 128;
        rjVar.getHighSpeedVideoSizes(z, 22, this.getHighSpeedVideoFpsRangesFor);
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 63) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getInputSizeshNQ4ISI + 39;
        getHighSpeedVideoSizes = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (i % 2 != 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizes;
        getInputSizeshNQ4ISI = (i + 111) % 128;
        int i2 = i + 5;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String toString() {
        int i = getHighSpeedVideoSizes + 111;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            mo26276();
            throw null;
        }
        java.lang.String mo26276 = mo26276();
        int i2 = getInputSizeshNQ4ISI + 11;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return mo26276;
        }
        throw null;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ */
    public final java.lang.String mo26276() {
        int i = getHighSpeedVideoSizes + 81;
        getInputSizeshNQ4ISI = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (i % 2 == 0) {
            return util.h.xy.fb.rd.m26855(bArr);
        }
        util.h.xy.fb.rd.m26855(bArr);
        throw new java.lang.ArithmeticException();
    }

    mg(byte[] bArr, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    mg(java.lang.String str, boolean z) {
        if (str == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("峃峤쒲\ue817໐걒㣿ဟ礼햧奈ᾍ봓\ue6b2쨒Ⳝ蹅\uf7b6\udb0f㶚齁\uf884걣䋬\ue86e覅봧", android.text.TextUtils.indexOf("", ""), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        if (!z || m26320(str)) {
            this.getHighSpeedVideoFpsRangesFor = util.h.xy.fb.rd.m26856(str);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("忄忣ゲ\ue8ee\ue2e2꽕쳿ღᘪ↧淋\uf3bf블ኲ쫥샮赘θ\udbeb퇦鱗ು곓껜\ueb70綌뷕뿙喝滑軉賈쥭律鿃鷋\ud870佤邨樣", android.text.TextUtils.getOffsetBefore("", 0), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = 2911224276924105750L;
    }
}
