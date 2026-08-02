package util.h.xy.by;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static final /* synthetic */ util.h.xy.by.mb[] getHighSpeedVideoSizesFor;
    private static char[] getOutputFormats;
    private static char getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.by.mb f1069;
    private util.h.xy.da.ra getInputSizeshNQ4ISI;

    private mb(java.lang.String str) {
    }

    public static util.h.xy.by.mb valueOf(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 79;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.by.mb mbVar = (util.h.xy.by.mb) java.lang.Enum.valueOf(util.h.xy.by.mb.class, str);
        if (i % 2 == 0) {
            return mbVar;
        }
        throw null;
    }

    public static util.h.xy.by.mb[] values() {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        util.h.xy.by.mb[] mbVarArr = (util.h.xy.by.mb[]) getHighSpeedVideoSizesFor.clone();
        int i = Camera2StreamConfigurationMap + 93;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return mbVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.by.mb[] mbVarArr;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.getOffsetBefore("", 0) + 58), "\u0018\u0013\n\u0004\u0012\u0018\u001d#", 8 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        util.h.xy.by.mb mbVar = new util.h.xy.by.mb(((java.lang.String) objArr[0]).intern());
        f1069 = mbVar;
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            mbVarArr = new util.h.xy.by.mb[0];
            mbVarArr[1] = mbVar;
        } else {
            mbVarArr = new util.h.xy.by.mb[]{mbVar};
        }
        getHighSpeedVideoSizesFor = mbVarArr;
        getHighSpeedVideoFpsRanges = util.h.xy.by.mb.class.getName();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.da.ra m25819(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.db.a m27720;
        int i;
        int i2 = Camera2StreamConfigurationMap + 13;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                util.h.xy.da.mc.m26263(context);
                Camera2StreamConfigurationMap();
                m27720 = util.h.xy.z.ra.m27720();
                i = 96;
            } else {
                util.h.xy.da.mc.m26263(context);
                Camera2StreamConfigurationMap();
                m27720 = util.h.xy.z.ra.m27720();
                i = 45;
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 125) % 128;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((byte) (i + (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), "\u001b\u0015", 2 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
                util.h.xy.da.mb.a mo26090 = util.h.xy.da.mb.m26261(((java.lang.String) objArr[0]).intern().getBytes()).mo26090(util.h.xy.da.a.f1152);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((byte) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\u0001\u0015 \u0002\u0007\u0015\u001c\u0010\n\u001c\u0019\u0014\f\u0001\u0006\u001b\u000f\b\f\"\u0003\u000b\f#\u0012\u0002\u0007\u0015\u0001\u0015 \u0012\u0015\u001c\u000e\u0013\f\u0001\u0007\u0015", android.view.MotionEvent.axisFromString("") + 41, objArr2);
                this.getInputSizeshNQ4ISI.mo26073(mo26090.mo26095(((java.lang.String) objArr2[0]).intern(), m27720).mo26094());
                util.h.xy.da.ra raVar = this.getInputSizeshNQ4ISI;
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 111) % 128;
                return raVar;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (util.h.xy.da.b e) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (13 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0002\u0003\t\u001e\u0001\u0015\u001c\u000e\"\u0018 \u0018\u0012 \u0012\u0002\"\u001b\u0014\u001c\u0019\u0013\u0003\u0006\"\u001f\u0012 \u0013\u0010\u0000 \u0007\u0011\u0012\" \u001a\u0003\u000f\u000b\u0001\b!\u0012\" \u001a", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 48, objArr3);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(505, ((java.lang.String) objArr3[0]).intern(), e);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m25820() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 57) % 128;
        try {
            Camera2StreamConfigurationMap();
            boolean mo26079 = this.getInputSizeshNQ4ISI.mo26079();
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 29) % 128;
            return mo26079;
        } catch (util.h.xy.da.b unused) {
            return false;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25821() {
        int i = Camera2StreamConfigurationMap + 43;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap();
            util.h.xy.ak.d.m24967(this.getInputSizeshNQ4ISI);
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 51;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 4;
            }
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
            return;
        }
        Camera2StreamConfigurationMap();
        util.h.xy.ak.d.m24967(this.getInputSizeshNQ4ISI);
        throw null;
    }

    private void Camera2StreamConfigurationMap() throws util.h.xy.da.b {
        util.h.xy.da.ma maVar;
        java.lang.Object obj;
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 97;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.getInputSizeshNQ4ISI == null) {
                int i3 = i + 41;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    maVar = util.h.xy.da.ma.f1156;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (40 << android.view.Gravity.getAbsoluteGravity(1, 0)), "\u000b  \u0007\u0018\"", 91 - (android.view.ViewConfiguration.getScrollBarFadeDuration() * 36), objArr);
                    obj = objArr[0];
                } else {
                    maVar = util.h.xy.da.ma.f1156;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (101 - android.view.Gravity.getAbsoluteGravity(0, 0)), "\u000b  \u0007\u0018\"", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, objArr2);
                    obj = objArr2[0];
                }
                this.getInputSizeshNQ4ISI = util.h.xy.da.d.m26260(maVar, ((java.lang.String) obj).intern());
                return;
            }
            return;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoSizes + 93;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputMinFrameDuration);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 113) % 128;
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i5 = mcVar.f2639;
                        int i6 = mcVar.f2640;
                        int i7 = mcVar.f2637;
                        int i8 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i5 * c) + i6];
                        cArr3[mcVar.f2638 + 1] = cArr[(i7 * c) + i8];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 57) % 128;
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i9 = mcVar.f2639;
                        int i10 = mcVar.f2640;
                        int i11 = mcVar.f2637;
                        int i12 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                        cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                    } else {
                        int i13 = mcVar.f2639;
                        int i14 = mcVar.f2635;
                        int i15 = mcVar.f2637;
                        int i16 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                        cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 25) % 128;
                    }
                }
                mcVar.f2638 += 2;
                int i17 = getHighSpeedVideoFpsRangesFor + 87;
                getHighSpeedVideoSizes = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr3[i19] = (char) (cArr3[i19] ^ 13722);
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i20 = getHighSpeedVideoSizes + 37;
        getHighSpeedVideoFpsRangesFor = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputFormats = new char[]{41915, 41875, 41904, 41868, 41871, 41919, 41912, 41892, 41910, 41913, 41893, 41894, 41885, 41917, 41880, 41966, 41898, 41882, 41874, 41902, 41906, 41859, 41896, 41887, 41970, 41877, 41907, 41873, 41903, 41881, 41909, 41914, 41900, 41980, 41864, 41908};
        getOutputMinFrameDuration = (char) 38464;
    }
}
