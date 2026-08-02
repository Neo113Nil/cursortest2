package util.h.xy.dw;

/* loaded from: classes5.dex */
public final class a {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.dw.mb Camera2StreamConfigurationMap;
    private java.util.Vector getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dw.b m26427() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (((i | 27) << 1) - (i ^ 27)) % 128;
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        util.h.xy.dw.ra[] raVarArr = new util.h.xy.dw.ra[size];
        int i2 = 0;
        while (i2 != size) {
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 29) + ((i3 & 29) << 1)) % 128;
            raVarArr[i2] = (util.h.xy.dw.ra) this.getHighResolutionOutputSizeshNQ4ISI.elementAt(i2);
            i2++;
            int i4 = getHighSpeedVideoSizes + 51;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            int i5 = i4 % 2;
        }
        return new util.h.xy.dw.b(this.Camera2StreamConfigurationMap, raVarArr);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dw.a m26425(util.h.xy.dw.ma[] maVarArr) {
        this.getHighResolutionOutputSizeshNQ4ISI.addElement(new util.h.xy.dw.ra(maVarArr));
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i ^ 97) + ((i & 97) << 1)) % 128;
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dw.a m26424(util.h.xy.dh.i[] iVarArr, util.h.xy.dh.c[] cVarArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        util.h.xy.dw.ma[] maVarArr = new util.h.xy.dw.ma[iVarArr.length];
        int i = 0;
        while (i != iVarArr.length) {
            maVarArr[i] = new util.h.xy.dw.ma(iVarArr[i], cVarArr[i]);
            i = ((i | 1) << 1) - (i ^ 1);
            int i2 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i2 ^ 71) + ((i2 & 71) << 1)) % 128;
        }
        return m26425(maVarArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.dw.a m26429(util.h.xy.dh.i[] iVarArr, java.lang.String[] strArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 95) % 128;
        int length = strArr.length;
        util.h.xy.dh.c[] cVarArr = new util.h.xy.dh.c[length];
        int i = 0;
        while (i != length) {
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (((i2 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
            cVarArr[i] = this.Camera2StreamConfigurationMap.mo26438(iVarArr[i], strArr[i]);
            i++;
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i3 | 41) << 1) - (i3 ^ 41)) % 128;
        }
        util.h.xy.dw.a m26424 = m26424(iVarArr, cVarArr);
        int i4 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i4 & 105) + (i4 | 105)) % 128;
        return m26424;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.dw.a m26428(util.h.xy.dh.i iVar, util.h.xy.dh.c cVar) {
        this.getHighResolutionOutputSizeshNQ4ISI.addElement(new util.h.xy.dw.ra(iVar, cVar));
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 75) << 1) - (i ^ 75);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dw.a m26426(util.h.xy.dh.i iVar, java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 25) << 1) - (i ^ 25);
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = i2 % 2;
        m26428(iVar, this.Camera2StreamConfigurationMap.mo26438(iVar, str));
        if (i3 == 0) {
            throw null;
        }
        int i4 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i4 ^ 55) + ((i4 & 55) << 1)) % 128;
        return this;
    }

    public a(util.h.xy.dw.mb mbVar) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();
        this.Camera2StreamConfigurationMap = mbVar;
    }

    public a() {
        this(util.h.xy.dz.mb.f1856);
    }
}
