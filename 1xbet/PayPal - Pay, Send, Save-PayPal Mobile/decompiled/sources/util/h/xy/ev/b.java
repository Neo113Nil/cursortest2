package util.h.xy.ev;

/* loaded from: classes18.dex */
public abstract class b extends util.h.xy.ew.a {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static char[] getHighSpeedVideoFpsRangesFor = {42342, 42287, 42293, 42303, 42293, 42292, 42270, 42262, 42287, 42261, 42270, 42295, 42292, 42294, 42283, 42280, 42286, 42262, 42271, 42295, 42290, 42287, 42288, 42295, 42287, 42281, 42263, 42267, 42292, 42285};
    private static int getHighSpeedVideoSizes;
    private java.security.SecureRandom getHighSpeedVideoSizesFor;
    private util.h.xy.ep.mb getOutputMinFrameDuration;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected abstract util.h.xy.ef.ma mo26722(util.h.xy.dh.i iVar);

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        int length;
        char[] cArr2;
        int i;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr3 = getHighSpeedVideoFpsRangesFor;
        if (cArr3 != null) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI + 19;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 39) % 128;
                cArr2[i] = (char) (cArr3[i] ^ (-8125198844289309347L));
                i++;
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i3];
        java.lang.System.arraycopy(cArr3, i2, cArr4, 0, i3);
        if (bytes != null) {
            int i7 = getHighResolutionOutputSizeshNQ4ISI + 85;
            getHighSpeedVideoSizes = i7 % 128;
            if (i7 % 2 != 0) {
                cArr = new char[i3];
                maVar.f2631 = 1;
            } else {
                cArr = new char[i3];
                maVar.f2631 = 0;
            }
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bytes[maVar.f2631] == 1) {
                    cArr[maVar.f2631] = (char) (((cArr4[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr[maVar.f2631] = (char) ((cArr4[maVar.f2631] * 2) - c);
                }
                c = cArr[maVar.f2631];
                maVar.f2631++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 117) % 128;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i8 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr4, i8, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr4, 0, i8);
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr4[maVar.f2631] = (char) (cArr4[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    @Override // util.h.xy.ew.rb
    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] mo26721(util.h.xy.ew.rc rcVar) throws util.h.xy.ew.c {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 117) % 128;
        util.h.xy.ef.ma mo26722 = mo26722(m26723().m26494());
        util.h.xy.ef.mb mbVar = this.getOutputMinFrameDuration;
        if (this.getHighSpeedVideoSizesFor != null) {
            util.h.xy.ep.me meVar = new util.h.xy.ep.me(mbVar, this.getHighSpeedVideoSizesFor);
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 33) % 128;
            mbVar = meVar;
        }
        try {
            byte[] highResolutionOutputSizeshNQ4ISI = util.h.xy.ev.a.getHighResolutionOutputSizeshNQ4ISI(rcVar);
            mo26722.mo26543(true, mbVar);
            byte[] mo26545 = mo26722.mo26545(highResolutionOutputSizeshNQ4ISI, 0, highResolutionOutputSizeshNQ4ISI.length);
            int i = getHighSpeedVideoFpsRanges + 45;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                return mo26545;
            }
            throw null;
        } catch (util.h.xy.ef.md e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{0, 30, 1, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000", objArr);
            throw new util.h.xy.ew.c(((java.lang.String) objArr[0]).intern(), e);
        }
    }

    public b(util.h.xy.ed.a aVar, util.h.xy.ep.mb mbVar) {
        super(aVar);
        this.getOutputMinFrameDuration = mbVar;
    }
}
