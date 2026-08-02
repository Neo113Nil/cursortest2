package util.h.xy.ak;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˊ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static final /* synthetic */ util.h.xy.ak.ra[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static char[] getOutputFormats;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.ak.ra f87;
    private final java.util.concurrent.locks.Lock getOutputMinFrameDuration = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.da.ra f88;

    private ra(java.lang.String str) {
    }

    public static util.h.xy.ak.ra valueOf(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 121;
        getInputFormats = i % 128;
        util.h.xy.ak.ra raVar = (util.h.xy.ak.ra) java.lang.Enum.valueOf(util.h.xy.ak.ra.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
        return raVar;
    }

    public static util.h.xy.ak.ra[] values() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 17;
        getInputFormats = i % 128;
        util.h.xy.ak.ra[] raVarArr = Camera2StreamConfigurationMap;
        if (i % 2 == 0) {
            return (util.h.xy.ak.ra[]) raVarArr.clone();
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (89 - android.view.View.getDefaultSize(0, 0)), "!\u0003%(\u0013\f\u000f\u000b", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '(', objArr);
        util.h.xy.ak.ra raVar = new util.h.xy.ak.ra(((java.lang.String) objArr[0]).intern());
        f87 = raVar;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputFormats = (i + 105) % 128;
        getInputFormats = (i + 63) % 128;
        Camera2StreamConfigurationMap = new util.h.xy.ak.ra[]{raVar};
        getHighSpeedVideoSizesFor = util.h.xy.ak.ra.class.getName();
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 31) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24998(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 95) % 128;
            try {
                util.h.xy.da.mc.m26263(context);
                getHighSpeedVideoFpsRangesFor();
                util.h.xy.db.a m27719 = util.h.xy.z.ra.m27719();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (71 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), "\u0007\u001c'\r\u001d!\u000e\u001f㗰", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 10, objArr);
                util.h.xy.da.mb.a mo26090 = util.h.xy.da.mb.m26261(((java.lang.String) objArr[0]).intern().getBytes()).mo26090(util.h.xy.da.a.f1152);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (76 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "\u0012+.0\u0012/\u0015\u001a)\u0016./\r\u0003\u000f\u001a\u001a\u0011\u001d0\f\u0010-,\"\u0005\u0012/\u0012+/\u001d\u0015\u0014\f\u001f\r\u0003\u0012/", android.view.View.combineMeasuredStates(0, 0) + 40, objArr2);
                util.h.xy.da.mb mo26094 = mo26090.mo26095(((java.lang.String) objArr2[0]).intern(), m27719).mo26094();
                if (!this.f88.mo26080()) {
                    getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                    this.f88.mo26073(mo26094);
                }
                if (util.h.xy.ak.a.f74.m24961()) {
                    util.h.xy.ak.d.m24966(util.h.xy.ak.a.f74.m24959(context), this.f88);
                    util.h.xy.ak.a.f74.m24960();
                }
            } catch (util.h.xy.da.b e) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 110), "㘸㘸\f\u0016㘹", 5 - android.graphics.Color.blue(0), objArr3);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr3[0]).intern(), util.h.xy.al.rc.m25022(e));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 116), "\u0011.㙫㙫/\u001f\b$\u00180-\u000b\u0005\u0014\b\u0001\u001d/\u00160\t&0\b\r\u0018,.\u001d\u0005\u0014\u000e\f\u00100\u001a,.㙨", 39 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr4);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr4[0]).intern(), e);
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24999() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 111) % 128;
        try {
            getHighSpeedVideoFpsRangesFor();
        } catch (java.lang.Exception unused) {
        }
        try {
            if (this.f88.mo26080()) {
                getHighResolutionOutputSizeshNQ4ISI = (getInputFormats + 125) % 128;
                this.f88.mo26074();
                int i = getInputFormats + 77;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                int i2 = i % 2;
            }
        } catch (java.lang.Exception unused2) {
        }
        util.h.xy.ak.d.m24967(this.f88);
    }

    private void getHighSpeedVideoFpsRangesFor() throws util.h.xy.da.b {
        getInputFormats = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        if (this.f88 == null) {
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (115 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), "\b\u001f\u0018%㙲㙲,\u0019\u0016\u001e", 9 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
            this.f88 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
            int i = getHighResolutionOutputSizeshNQ4ISI + 43;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 / 5;
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoFpsRanges + 89;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = getHighSpeedVideoSizes + 3;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr2[i4] = (char) (cArr[i4] % 4042185467053315654L);
                    i4--;
                } else {
                    cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
                    i4++;
                }
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRangesFor);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 73) % 128;
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 27) % 128;
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 47) % 128;
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i6 = mcVar.f2639;
                        int i7 = mcVar.f2640;
                        int i8 = mcVar.f2637;
                        int i9 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i6 * c) + i7];
                        cArr3[mcVar.f2638 + 1] = cArr[(i8 * c) + i9];
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 61) % 128;
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i10 = mcVar.f2639;
                        int i11 = mcVar.f2640;
                        int i12 = mcVar.f2637;
                        int i13 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i10 * c) + i11];
                        cArr3[mcVar.f2638 + 1] = cArr[(i12 * c) + i13];
                    } else {
                        int i14 = mcVar.f2639;
                        int i15 = mcVar.f2635;
                        int i16 = mcVar.f2637;
                        int i17 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i14 * c) + i15];
                        cArr3[mcVar.f2638 + 1] = cArr[(i16 * c) + i17];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = new char[]{41859, 41980, 41856, 41866, 41878, 41874, 41915, 41867, 41881, 41919, 41917, 41962, 41885, 41894, 41873, 41868, 41869, 41965, 41887, 41913, 41892, 41956, 41970, 41912, 41880, 41893, 41860, 41896, 41966, 41903, 41870, 41877, 41957, 41906, 41898, 41857, 41871, 41904, 41914, 41864, 41865, 41963, 41967, 41909, 41882, 41907, 41902, 41900, 41905};
        getHighSpeedVideoFpsRangesFor = (char) 38465;
    }
}
