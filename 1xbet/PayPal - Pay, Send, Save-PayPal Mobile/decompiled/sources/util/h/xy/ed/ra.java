package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class ra extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = -1231763965;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private java.util.Hashtable getInputSizeshNQ4ISI = new java.util.Hashtable();
    private java.util.Vector getOutputMinFrameDuration = new java.util.Vector();

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(this.getOutputMinFrameDuration.size());
        java.util.Enumeration elements = this.getOutputMinFrameDuration.elements();
        while (elements.hasMoreElements()) {
            int i = getHighSpeedVideoFpsRangesFor + 17;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                dVar.m26290((util.h.xy.ed.ma) this.getInputSizeshNQ4ISI.get((util.h.xy.dh.i) elements.nextElement()));
                throw null;
            }
            dVar.m26290((util.h.xy.ed.ma) this.getInputSizeshNQ4ISI.get((util.h.xy.dh.i) elements.nextElement()));
        }
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i2 = getHighSpeedVideoFpsRangesFor + 81;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return aaVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.ed.ma m26517(util.h.xy.dh.i iVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 63;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ed.ma maVar = (util.h.xy.ed.ma) this.getInputSizeshNQ4ISI.get(iVar);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 45) % 128;
        return maVar;
    }

    public ra(util.h.xy.ed.ma[] maVarArr) {
        for (int i = 0; i != maVarArr.length; i++) {
            util.h.xy.ed.ma maVar = maVarArr[i];
            this.getOutputMinFrameDuration.addElement(maVar.m26507());
            this.getInputSizeshNQ4ISI.put(maVar.m26507(), maVar);
        }
    }

    private ra(util.h.xy.dh.l lVar) {
        java.util.Enumeration mo26285 = lVar.mo26285();
        while (mo26285.hasMoreElements()) {
            util.h.xy.ed.ma m26506 = util.h.xy.ed.ma.m26506(mo26285.nextElement());
            if (this.getInputSizeshNQ4ISI.containsKey(m26506.m26507())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                int resolveSizeAndState = 26 - android.view.View.resolveSizeAndState(0, 0, 0);
                int mode = 1 - android.view.View.MeasureSpec.getMode(0);
                int maxKeyCode = (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
                char[] charArray = "\uffbf\u0011\u0004\u000f\u0004\u0000\u0013\u0004\u0003\uffbf\u0004\u0017\u0013\u0004\r\u0012\b\u000e\r\uffbf\u0005\u000e\u0014\r\u0003\uffd9".toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[resolveSizeAndState];
                raVar.f2649 = 0;
                while (raVar.f2649 < resolveSizeAndState) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 33) % 128;
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + maxKeyCode);
                    int i = raVar.f2649;
                    cArr[i] = (char) (cArr[i] - ((int) (getHighSpeedVideoFpsRanges ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (mode > 0) {
                    raVar.f2648 = mode;
                    char[] cArr2 = new char[resolveSizeAndState];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, resolveSizeAndState);
                    java.lang.System.arraycopy(cArr2, 0, cArr, resolveSizeAndState - raVar.f2648, raVar.f2648);
                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, resolveSizeAndState - raVar.f2648);
                }
                objArr[0] = new java.lang.String(cArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(m26506.m26507());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getInputSizeshNQ4ISI.put(m26506.m26507(), m26506);
            this.getOutputMinFrameDuration.addElement(m26506.m26507());
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.ed.ra m26516(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 125) % 128;
        if (!(obj instanceof util.h.xy.ed.ra)) {
            if (obj != null) {
                return new util.h.xy.ed.ra(util.h.xy.dh.l.m26303(obj));
            }
            getHighResolutionOutputSizeshNQ4ISI = (i + 29) % 128;
            return null;
        }
        int i2 = i + 57;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        util.h.xy.ed.ra raVar = (util.h.xy.ed.ra) obj;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw null;
    }
}
