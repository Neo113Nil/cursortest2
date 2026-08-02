package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class rh extends util.h.xy.dh.mi implements util.h.xy.dh.mj {
    static final byte[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;
    byte[] getHighSpeedVideoFpsRanges;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 105) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
        while (raVar.f2649 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 15) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.rh.class) { // from class: util.h.xy.dh.rh.3
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = (((i | 19) << 1) - (i ^ 19)) % 128;
                util.h.xy.dh.rh outputFormats = lVar.getOutputFormats();
                int i2 = Camera2StreamConfigurationMap + 13;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    return outputFormats;
                }
                throw null;
            }

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = Camera2StreamConfigurationMap;
                int i2 = ((i | 63) << 1) - (i ^ 63);
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i3 = ((i | 69) << 1) - (i ^ 69);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    return mzVar;
                }
                throw new java.lang.ArithmeticException();
            }
        };
        Camera2StreamConfigurationMap = new byte[0];
        getOutputFormats = (getHighSpeedVideoSizesFor + 41) % 128;
    }

    static util.h.xy.dh.rh getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(bArr);
        int i = getHighSpeedVideoSizesFor + 9;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return mzVar;
        }
        throw null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0000", 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 78 - android.graphics.ImageFormat.getBitsPerPixel(0), false, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.fb.rd.m26855(util.h.xy.fa.d.m26800(this.getHighSpeedVideoFpsRanges)));
        java.lang.String obj = sb.toString();
        getHighSpeedVideoSizesFor = (getOutputFormats + 87) % 128;
        return obj;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(this.getHighSpeedVideoFpsRanges);
        getHighSpeedVideoSizesFor = (getOutputFormats + 109) % 128;
        return mzVar;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(this.getHighSpeedVideoFpsRanges);
        int i = getHighSpeedVideoSizesFor + 29;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return mzVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public util.h.xy.dh.mi mo26278() {
        getHighSpeedVideoSizesFor = (getOutputFormats + 17) % 128;
        util.h.xy.dh.mi mo26279 = mo26279();
        int i = getHighSpeedVideoSizesFor + 55;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return mo26279;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getHighSpeedVideoSizesFor + 31;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (!(miVar instanceof util.h.xy.dh.rh)) {
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.getHighSpeedVideoFpsRanges, ((util.h.xy.dh.rh) miVar).getHighSpeedVideoFpsRanges);
        int i2 = getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return m26820;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = getOutputFormats + 91;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.fb.a.m26817(m26337());
            throw null;
        }
        int m26817 = util.h.xy.fb.a.m26817(m26337());
        getOutputFormats = (getHighSpeedVideoSizesFor + 73) % 128;
        return m26817;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] m26337() {
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 105;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        getOutputFormats = (i + 67) % 128;
        return bArr;
    }

    @Override // util.h.xy.dh.mj
    /* renamed from: ˋ */
    public java.io.InputStream mo26280() {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(this.getHighSpeedVideoFpsRanges);
        int i = getHighSpeedVideoSizesFor + 85;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return byteArrayInputStream;
        }
        throw null;
    }

    public rh(byte[] bArr) {
        if (bArr != null) {
            this.getHighSpeedVideoFpsRanges = bArr;
            return;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ￄ\u0012\u0019\u0010\u0010ￋ\u0017\u0018\u0016\r\u0012\u000bￋￄ\u0007\u0005\u0012\u0012\u0013\u0018ￄ\u0006\t", android.view.KeyEvent.normalizeMetaState(0) + 23, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 5, 137 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dh.rh m26335(java.lang.Object obj) {
        int i = getOutputFormats;
        getHighSpeedVideoSizesFor = (i + 45) % 128;
        if (obj != null) {
            int i2 = (i + 111) % 128;
            getHighSpeedVideoSizesFor = i2;
            if (!(obj instanceof util.h.xy.dh.rh)) {
                if (obj instanceof util.h.xy.dh.c) {
                    int i3 = i2 + 81;
                    getOutputFormats = i3 % 128;
                    util.h.xy.dh.mi mo26279 = ((util.h.xy.dh.c) obj).mo26279();
                    if (i3 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (mo26279 instanceof util.h.xy.dh.rh) {
                        int i4 = getOutputFormats;
                        getHighSpeedVideoSizesFor = (i4 + 3) % 128;
                        util.h.xy.dh.rh rhVar = (util.h.xy.dh.rh) mo26279;
                        int i5 = i4 + 33;
                        getHighSpeedVideoSizesFor = i5 % 128;
                        if (i5 % 2 != 0) {
                            return rhVar;
                        }
                        throw null;
                    }
                } else if (obj instanceof byte[]) {
                    getOutputFormats = (i2 + 15) % 128;
                    try {
                        return (util.h.xy.dh.rh) getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges((byte[]) obj);
                    } catch (java.io.IOException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("�￼\uffc9�￮�￬\ufff8\uffc9\u001d\f\u001e\u001b\u001d\u001c\u0017\u0018\f\uffc9\u0018\u001d\uffc9\r\u000e\u0015\u0012\n\u000f\uffc9￣\u0006\u0004\u000e\u001d\"\u000b\uffc9\u0016\u0018\u001b\u000f\uffc9\ufff0\ufff7\ufff2\ufffb", android.graphics.Color.red(0) + 46, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 28, 131 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), true, objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(e.getMessage());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u0016\u0017\u0004\u0011\u0006\b\uffddￃ\f\u000f\u000f\b\n\u0004\u000fￃ\u0012\u0005\r\b\u0006\u0017ￃ\f\u0011ￃ\n\b\u0017￬\u0011", 31 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), '8' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 137 - android.graphics.Color.argb(0, 0, 0, 0), false, objArr2);
                sb2.append(((java.lang.String) objArr2[0]).intern());
                sb2.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        return (util.h.xy.dh.rh) obj;
    }

    static void getHighSpeedVideoSizes() {
        getOutputMinFrameDuration = -1231763782;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dh.rh m26336(util.h.xy.dh.mm mmVar, boolean z) {
        getHighSpeedVideoSizesFor = (getOutputFormats + 49) % 128;
        util.h.xy.dh.rh rhVar = (util.h.xy.dh.rh) getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(mmVar, z);
        int i = getOutputFormats + 41;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return rhVar;
        }
        throw null;
    }
}
