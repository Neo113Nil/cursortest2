package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class rk extends util.h.xy.dh.mi implements util.h.xy.fb.ra<util.h.xy.dh.c> {
    private static int Camera2StreamConfigurationMap = 1;
    static final util.h.xy.dh.p getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static short[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static byte[] getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final boolean f1211;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final util.h.xy.dh.c[] f1212;

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getOutputMinFrameDuration;
            if (bArr != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 73) % 128;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = getHighSpeedVideoFpsRanges + 63;
                    getHighSpeedVideoFpsRangesFor = i7 % 128;
                    if (i7 % 2 != 0) {
                        bArr2[i6] = (byte) (bArr[i6] + 2689713159175858216L);
                        throw new java.lang.ArithmeticException();
                    }
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                i4 = (byte) (((byte) (getOutputMinFrameDuration[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getInputFormats[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 11) % 128;
            meVar.f2647 = ((i + i4) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i8 = 0; i8 < length2; i8++) {
                    bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i9 = getHighSpeedVideoFpsRanges + 29;
                getHighSpeedVideoFpsRangesFor = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 / 4;
                }
                z = true;
            } else {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 41) % 128;
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getInputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.p(util.h.xy.dh.rk.class) { // from class: util.h.xy.dh.rk.2
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
                util.h.xy.dh.rk highSpeedVideoSizes = lVar.getHighSpeedVideoSizes();
                int i = Camera2StreamConfigurationMap + 89;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    return highSpeedVideoSizes;
                }
                throw null;
            }
        };
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 35) % 128;
    }

    private static void Camera2StreamConfigurationMap(util.h.xy.dh.c[] cVarArr) {
        int i;
        int length = cVarArr.length;
        if (length < 2) {
            return;
        }
        util.h.xy.dh.c cVar = cVarArr[0];
        util.h.xy.dh.c cVar2 = cVarArr[1];
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(cVar);
        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(cVar2);
        if (getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor)) {
            cVar2 = cVar;
            cVar = cVar2;
        } else {
            highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            int i3 = getInputSizeshNQ4ISI + 25;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRangesFor(cVarArr[i2]));
                throw null;
            }
            util.h.xy.dh.c cVar3 = cVarArr[i2];
            byte[] highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(cVar3);
            if (getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor3)) {
                cVarArr[i2 - 2] = cVar;
                cVar = cVar2;
                highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor;
                cVar2 = cVar3;
                highSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor3;
            } else if (getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor3)) {
                int i4 = Camera2StreamConfigurationMap + 13;
                getInputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    cVarArr[i2 << 2] = cVar;
                } else {
                    cVarArr[i2 - 2] = cVar;
                }
                cVar = cVar3;
                highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor3;
            } else {
                int i5 = i2 - 1;
                while (true) {
                    i = i5 - 1;
                    if (i <= 0) {
                        break;
                    }
                    util.h.xy.dh.c cVar4 = cVarArr[i5 - 2];
                    if (getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(cVar4), highSpeedVideoFpsRangesFor3)) {
                        break;
                    }
                    cVarArr[i] = cVar4;
                    i5 = i;
                }
                cVarArr[i] = cVar3;
            }
        }
        cVarArr[length - 2] = cVar;
        cVarArr[length - 1] = cVar2;
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 55) % 128;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2) {
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 105) % 128;
        boolean z = false;
        int i = bArr[0] & (-33);
        int i2 = bArr2[0] & (-33);
        if (i != i2) {
            return i < i2;
        }
        int min = java.lang.Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                if ((b & 255) < (b2 & 255)) {
                    getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 19) % 128;
                    z = true;
                }
                getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
                return z;
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.dh.c cVar) {
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 37) % 128;
        try {
            util.h.xy.dh.mi mo26279 = cVar.mo26279();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 640682472, (short) android.text.TextUtils.indexOf("", ""), (byte) android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 53, android.view.KeyEvent.normalizeMetaState(0) - 847195324, objArr);
            byte[] m26322 = mo26279.m26322(((java.lang.String) objArr[0]).intern());
            int i = getInputSizeshNQ4ISI + 51;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                return m26322;
            }
            throw null;
        } catch (java.io.IOException unused) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 640682469, (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (-16777270) - android.graphics.Color.rgb(0, 0, 0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 847195293, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<util.h.xy.dh.c> iterator() {
        util.h.xy.fb.a.ra raVar = new util.h.xy.fb.a.ra(m26343());
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 113) % 128;
        return raVar;
    }

    public java.lang.String toString() {
        int m26342;
        int i = getInputSizeshNQ4ISI + 59;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0 ? (m26342 = m26342()) == 0 : 1 == (m26342 = m26342())) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 640682476, (short) android.text.TextUtils.getCapsMode("", 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) - 54, (-847195301) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            return ((java.lang.String) objArr[0]).intern();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[");
        int i2 = 0;
        while (true) {
            stringBuffer.append(this.f1212[i2]);
            i2++;
            if (i2 >= m26342) {
                int i3 = Camera2StreamConfigurationMap + 117;
                int i4 = i3 % 128;
                getInputSizeshNQ4ISI = i4;
                int i5 = i3 % 2;
                Camera2StreamConfigurationMap = (i4 + 65) % 128;
                stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return stringBuffer.toString();
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.getOffsetBefore("", 0) - 640682474, (short) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-54) - android.view.View.resolveSizeAndState(0, 0, 0), (-847195348) - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr2);
            stringBuffer.append(((java.lang.String) objArr2[0]).intern());
        }
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap;
        getInputSizeshNQ4ISI = (i + 83) % 128;
        int i2 = i + 23;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return true;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        if (!(miVar instanceof util.h.xy.dh.rk)) {
            int i = Camera2StreamConfigurationMap;
            getInputSizeshNQ4ISI = (i + 41) % 128;
            getInputSizeshNQ4ISI = (i + 37) % 128;
            return false;
        }
        util.h.xy.dh.rk rkVar = (util.h.xy.dh.rk) miVar;
        int m26342 = m26342();
        if (rkVar.m26342() != m26342) {
            return false;
        }
        util.h.xy.dh.ae aeVar = (util.h.xy.dh.ae) Camera2StreamConfigurationMap();
        util.h.xy.dh.ae aeVar2 = (util.h.xy.dh.ae) rkVar.Camera2StreamConfigurationMap();
        for (int i2 = 0; i2 < m26342; i2++) {
            util.h.xy.dh.mi mo26279 = aeVar.f1212[i2].mo26279();
            util.h.xy.dh.mi mo262792 = aeVar2.f1212[i2].mo26279();
            if (mo26279 != mo262792 && !mo26279.getHighSpeedVideoFpsRanges(mo262792)) {
                return false;
            }
        }
        return true;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.av avVar = new util.h.xy.dh.av(this.f1211, this.f1212);
        int i = getInputSizeshNQ4ISI + 23;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return avVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.c[] cVarArr;
        int i = (Camera2StreamConfigurationMap + 1) % 128;
        getInputSizeshNQ4ISI = i;
        if (this.f1211) {
            int i2 = i + 15;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cVarArr = this.f1212;
        } else {
            cVarArr = (util.h.xy.dh.c[]) this.f1212.clone();
            Camera2StreamConfigurationMap(cVarArr);
            Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 23) % 128;
        }
        return new util.h.xy.dh.ae(cVarArr, (byte) 0);
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 11) % 128;
        int length = this.f1212.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 69) % 128;
            i += this.f1212[length].mo26279().hashCode();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public util.h.xy.dh.c[] m26343() {
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 5) % 128;
        util.h.xy.dh.c[] highSpeedVideoFpsRangesFor = util.h.xy.dh.d.getHighSpeedVideoFpsRangesFor(this.f1212);
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 71) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m26342() {
        int i = getInputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i + 105) % 128;
        int length = this.f1212.length;
        int i2 = i + 113;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return length;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.dh.c m26345(int i) {
        int i2 = getInputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i2 + 81) % 128;
        util.h.xy.dh.c cVar = this.f1212[i];
        int i3 = i2 + 121;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return cVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.util.Enumeration m26344() {
        java.util.Enumeration enumeration = new java.util.Enumeration() { // from class: util.h.xy.dh.rk.5
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes;
            private int getHighSpeedVideoFpsRanges = 0;

            @Override // java.util.Enumeration
            public final java.lang.Object nextElement() {
                int i = Camera2StreamConfigurationMap + 107;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 != 0) {
                    int length = util.h.xy.dh.rk.this.f1212.length;
                    throw null;
                }
                if (this.getHighSpeedVideoFpsRanges >= util.h.xy.dh.rk.this.f1212.length) {
                    throw new java.util.NoSuchElementException();
                }
                util.h.xy.dh.c[] cVarArr = util.h.xy.dh.rk.this.f1212;
                int i2 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i2 + 1;
                util.h.xy.dh.c cVar = cVarArr[i2];
                int i3 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = (((i3 | 125) << 1) - (i3 ^ 125)) % 128;
                return cVar;
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                boolean z;
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 75) % 128;
                if (this.getHighSpeedVideoFpsRanges < util.h.xy.dh.rk.this.f1212.length) {
                    int i = Camera2StreamConfigurationMap;
                    z = true;
                    getHighSpeedVideoSizes = (((i | 13) << 1) - (i ^ 13)) % 128;
                } else {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 107) % 128;
                    z = false;
                }
                int i2 = getHighSpeedVideoSizes + 49;
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 != 0) {
                    return z;
                }
                throw null;
            }
        };
        Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 3) % 128;
        return enumeration;
    }

    rk(boolean z, util.h.xy.dh.c[] cVarArr) {
        this.f1212 = cVarArr;
        this.f1211 = z || cVarArr.length < 2;
    }

    protected rk(util.h.xy.dh.c[] cVarArr, boolean z) {
        boolean z2 = true;
        if (util.h.xy.fb.a.m26816(cVarArr)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.KeyEvent.getDeadChar(0, 0) - 640682518, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-54) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (-847195354) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dh.c[] highSpeedVideoFpsRangesFor = util.h.xy.dh.d.getHighSpeedVideoFpsRangesFor(cVarArr);
        if (z && highSpeedVideoFpsRangesFor.length >= 2) {
            Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
        }
        this.f1212 = highSpeedVideoFpsRangesFor;
        if (!z && highSpeedVideoFpsRangesFor.length >= 2) {
            z2 = false;
        }
        this.f1211 = z2;
    }

    protected rk(util.h.xy.dh.d dVar, boolean z) {
        util.h.xy.dh.c[] highSpeedVideoFpsRangesFor;
        boolean z2 = true;
        if (dVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 640682547, (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-54) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 847195353, objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        if (!z || dVar.m26288() < 2) {
            highSpeedVideoFpsRangesFor = dVar.getHighSpeedVideoFpsRangesFor();
        } else {
            int i = dVar.getHighSpeedVideoSizes;
            if (i == 0) {
                int i2 = (util.h.xy.dh.d.getHighSpeedVideoFpsRangesFor + 79) % 128;
                util.h.xy.dh.d.Camera2StreamConfigurationMap = i2;
                highSpeedVideoFpsRangesFor = util.h.xy.dh.d.getHighSpeedVideoFpsRanges;
                util.h.xy.dh.d.getHighSpeedVideoFpsRangesFor = (i2 + 3) % 128;
            } else {
                util.h.xy.dh.c[] cVarArr = new util.h.xy.dh.c[i];
                java.lang.System.arraycopy(dVar.getHighResolutionOutputSizeshNQ4ISI, 0, cVarArr, 0, i);
                highSpeedVideoFpsRangesFor = cVarArr;
            }
            Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
        }
        this.f1212 = highSpeedVideoFpsRangesFor;
        if (!z && highSpeedVideoFpsRangesFor.length >= 2) {
            z2 = false;
        }
        this.f1211 = z2;
    }

    protected rk(util.h.xy.dh.c cVar) {
        if (cVar != null) {
            this.f1212 = new util.h.xy.dh.c[]{cVar};
            this.f1211 = true;
            return;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) - 640682572, (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (-54) - (android.view.ViewConfiguration.getTapTimeout() >> 16), (-847195353) - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    protected rk() {
        this.f1212 = util.h.xy.dh.d.getHighSpeedVideoFpsRanges;
        this.f1211 = true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.dh.rk m26340(util.h.xy.dh.mm mmVar, boolean z) {
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 9) % 128;
        util.h.xy.dh.rk rkVar = (util.h.xy.dh.rk) getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(mmVar, z);
        getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 1) % 128;
        return rkVar;
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = -1047454392;
        getOutputFormats = -408872979;
        getHighSpeedVideoSizes = -706856232;
        getOutputMinFrameDuration = new byte[]{40, 62, 5, -38, 46, 41, 35, com.visa.cbp.getEncExpo.kernelVersion, -102, 107, 38, 37, -44, -98, 116, -41, 42, -117, 116, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -37, 38, -39, -35, 39, -44, -101, 105, 35, -116, 100, 39, 33, -37, -48, 35, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 62, 13, -38, 45, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -39, -35, -3, 13, -41, 38, -97, 106, -35, -111, 116, -55, 38, 35, -48, 43, -105, 106, 47, -48, -39, -37, 37, 33, 59, -40, 47, -33, -106, 99, -37, -102, 116, -35, -39, -40, -43, 38, -101, 33, 107, -34, -47, 32, -48, 33, -33, -26, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -40, 47, -33, -106, 99, -37, -102, 116, -35, -39, -40, -43, 38, -101, 33, 109, -37, 35, -55, 38, -41, 58, -34, -47, 32, -48, 33, -33, -26, 45, -40, 47, -33, -106, 106, -35, -48, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -34, 39, -44, -101, 118, -37, -105, 44, com.google.common.base.Ascii.CAN, -40, 47, -33, -106, 99, -37, -102, 116, -35, -39, -40, -43, 38, -101, 33, 108, 39, -34, -47, 32, -48, 33, -33, -26, com.google.common.base.Ascii.NAK, -38, com.google.common.base.Ascii.NAK, 44, com.google.common.base.Ascii.SYN, -43, -39, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, 42, -21, 105, 35, -116, 100, 39, -39, -40, -37, com.visa.cbp.getEncExpo.registerForActivityResult, 116, -55, 38, 35, -48, 43, -105, 99, -39, 45, -44, 45, -47, -99, 116, -35, -39, -40, -43, 38};
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dh.rk m26341(java.lang.Object obj) {
        if (obj == null || (obj instanceof util.h.xy.dh.rk)) {
            return (util.h.xy.dh.rk) obj;
        }
        if (obj instanceof util.h.xy.dh.c) {
            util.h.xy.dh.mi mo26279 = ((util.h.xy.dh.c) obj).mo26279();
            if (mo26279 instanceof util.h.xy.dh.rk) {
                return (util.h.xy.dh.rk) mo26279;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (util.h.xy.dh.rk) getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges((byte[]) obj);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes((-640682640) - android.view.View.combineMeasuredStates(0, 0), (short) android.view.View.getDefaultSize(0, 0), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 53, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 847195290, objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(e.getMessage());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(62917 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf("", "", 0, 0) - 54, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 847195276, objArr2);
        sb2.append(((java.lang.String) objArr2[0]).intern());
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }
}
