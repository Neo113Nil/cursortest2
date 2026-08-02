package util.h.xy.dw;

/* loaded from: classes5.dex */
public final class b extends util.h.xy.dh.mh implements util.h.xy.dh.mc {
    private static util.h.xy.dw.mb getHighSpeedVideoFpsRanges = util.h.xy.dz.mb.f1856;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.dh.aa Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private util.h.xy.dw.mb getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private util.h.xy.dw.ra[] getOutputMinFrameDuration;

    static {
        int i = getHighSpeedVideoSizes + 31;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final java.lang.String toString() {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i | 75) << 1) - (i ^ 75)) % 128;
        java.lang.String mo26437 = this.getHighSpeedVideoSizesFor.mo26437(this);
        int i2 = getHighSpeedVideoFpsRangesFor + 7;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return mo26437;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mh
    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i + 69) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (obj == this) {
            getHighSpeedVideoFpsRangesFor = (i + 31) % 128;
            return true;
        }
        if (!(obj instanceof util.h.xy.dw.b)) {
            int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (!(obj instanceof util.h.xy.dh.l)) {
                int i4 = i2 + 35;
                getHighSpeedVideoSizes = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        if (mo26279().m26325(((util.h.xy.dh.c) obj).mo26279())) {
            int i5 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (i5 + 29) % 128;
            getHighSpeedVideoSizes = (i5 + 81) % 128;
            return true;
        }
        try {
            boolean mo26439 = this.getHighSpeedVideoSizesFor.mo26439(this, new util.h.xy.dw.b(util.h.xy.dh.l.m26303(((util.h.xy.dh.c) obj).mo26279())));
            int i6 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i6 ^ 7) + ((i6 & 7) << 1)) % 128;
            return mo26439;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // util.h.xy.dh.mh
    public final int hashCode() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 61) + (i | 61);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.getInputFormats) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        this.getInputFormats = true;
        int mo26435 = this.getHighSpeedVideoSizesFor.mo26435(this);
        this.getHighResolutionOutputSizeshNQ4ISI = mo26435;
        int i3 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i3 & 81) + (i3 | 81)) % 128;
        return mo26435;
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighSpeedVideoSizes;
        int i2 = (((i | 93) << 1) - (i ^ 93)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        util.h.xy.dh.aa aaVar = this.Camera2StreamConfigurationMap;
        int i3 = i2 + 37;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dw.ra[] m26431() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 53) << 1) - (i ^ 53);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        util.h.xy.dw.ra[] raVarArr = (util.h.xy.dw.ra[]) this.getOutputMinFrameDuration.clone();
        if (i3 == 0) {
            return raVarArr;
        }
        throw null;
    }

    public b(util.h.xy.dw.mb mbVar, java.lang.String str) {
        this(mbVar.mo26440(str));
        this.getHighSpeedVideoSizesFor = mbVar;
    }

    public b(java.lang.String str) {
        this(getHighSpeedVideoFpsRanges, str);
    }

    public b(util.h.xy.dw.mb mbVar, util.h.xy.dw.ra[] raVarArr) {
        this.getHighSpeedVideoSizesFor = mbVar;
        this.getOutputMinFrameDuration = (util.h.xy.dw.ra[]) raVarArr.clone();
        this.Camera2StreamConfigurationMap = new util.h.xy.dh.aa(this.getOutputMinFrameDuration);
    }

    public b(util.h.xy.dw.ra[] raVarArr) {
        this(getHighSpeedVideoFpsRanges, raVarArr);
    }

    private b(util.h.xy.dw.mb mbVar, util.h.xy.dh.l lVar) {
        this.getHighSpeedVideoSizesFor = mbVar;
        this.getOutputMinFrameDuration = new util.h.xy.dw.ra[lVar.mo26286()];
        java.util.Enumeration mo26285 = lVar.mo26285();
        boolean z = true;
        int i = 0;
        while (mo26285.hasMoreElements()) {
            java.lang.Object nextElement = mo26285.nextElement();
            util.h.xy.dw.ra m26441 = util.h.xy.dw.ra.m26441(nextElement);
            z &= m26441 == nextElement;
            this.getOutputMinFrameDuration[i] = m26441;
            i = ((i | 1) << 1) - (i ^ 1);
        }
        this.Camera2StreamConfigurationMap = z ? util.h.xy.dh.aa.m26277(lVar) : new util.h.xy.dh.aa(this.getOutputMinFrameDuration);
    }

    private b(util.h.xy.dh.l lVar) {
        this(getHighSpeedVideoFpsRanges, lVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.dw.b m26430(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 47) + ((i & 47) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (obj instanceof util.h.xy.dw.b) {
            getHighSpeedVideoSizes = (((i2 | 61) << 1) - (i2 ^ 61)) % 128;
            return (util.h.xy.dw.b) obj;
        }
        if (obj == null) {
            getHighSpeedVideoFpsRangesFor = ((i ^ 101) + ((i & 101) << 1)) % 128;
            return null;
        }
        util.h.xy.dw.b bVar = new util.h.xy.dw.b(util.h.xy.dh.l.m26303(obj));
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 73) % 128;
        return bVar;
    }
}
