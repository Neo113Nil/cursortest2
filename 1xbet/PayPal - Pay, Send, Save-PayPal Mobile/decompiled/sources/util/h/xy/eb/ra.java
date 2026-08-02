package util.h.xy.eb;

/* loaded from: classes18.dex */
public final class ra extends util.h.xy.dh.mh implements util.h.xy.eb.c {
    private static int Camera2StreamConfigurationMap = 294925130;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor = 252311541277805232L;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 13130;
    private static int getOutputFormats;
    private util.h.xy.dh.i getInputFormats;
    private util.h.xy.eu.mb getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 89;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
        char[] charArray2 = str2.toCharArray();
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 115;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i4 = (rcVar.f2652 + 2) % 4;
            int i5 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i4]) % 65535);
            cArr2[i5] = (char) (((cArr[i5] * 32718) + cArr2[i4]) / 65535);
            cArr[i5] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i5] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)) ^ ((int) (Camera2StreamConfigurationMap ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
        }
        java.lang.String str4 = new java.lang.String(cArr3);
        int i6 = getHighResolutionOutputSizeshNQ4ISI + 57;
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(3);
        if (this.getInputFormats.m26325(f1993)) {
            dVar.m26290(new util.h.xy.eb.ma(this.getInputSizeshNQ4ISI.m26720()).mo26279());
            dVar.m26290(new util.h.xy.eb.ma(this.getInputSizeshNQ4ISI.m26717()).mo26279());
        } else if (this.getInputFormats.m26325(f2005)) {
            dVar.m26290(new util.h.xy.eb.ma(this.getInputSizeshNQ4ISI.m26720()).mo26279());
            dVar.m26290(new util.h.xy.eb.ma(this.getInputSizeshNQ4ISI.m26717()).mo26279());
            getOutputFormats = (getHighSpeedVideoFpsRanges + 43) % 128;
        }
        if (this.getOutputMinFrameDuration != null) {
            dVar.m26290(new util.h.xy.dh.rw(this.getOutputMinFrameDuration));
        }
        return new util.h.xy.dh.aa(dVar);
    }

    public ra(util.h.xy.eu.mb mbVar, byte[] bArr) {
        util.h.xy.dh.i iVar;
        this.getInputFormats = null;
        this.getInputSizeshNQ4ISI = mbVar;
        this.getOutputMinFrameDuration = util.h.xy.fb.a.m26821(bArr);
        getOutputFormats = (getHighSpeedVideoFpsRanges + 41) % 128;
        if (util.h.xy.eu.b.m26713(this.getInputSizeshNQ4ISI)) {
            int i = getHighSpeedVideoFpsRanges + 55;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                this.getInputFormats = f1993;
                throw null;
            }
            iVar = f1993;
        } else {
            if (!util.h.xy.eu.b.m26715(this.getInputSizeshNQ4ISI)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("렢끑㵃\ue0f7ꓢ毕켼≖㦚\ue185㾛Τ人\ued8c펟ᑧ沄䲣狶뫒ᜥ꯴꺈皌䯹崚ࡩ勠౩\ueb7c켊ᅹ咘袕ڑ徭\ue3dfﲳ\ueddb", (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51650), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1930195600, "遆\u0c72셳揉", "秺鼌Ẩ↚", objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            iVar = f2005;
        }
        this.getInputFormats = iVar;
        getOutputFormats = (getHighSpeedVideoFpsRanges + 41) % 128;
    }
}
