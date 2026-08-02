package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class mi extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = -1231763791;
    private static int getHighSpeedVideoSizes;

    abstract void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException;

    abstract boolean getHighResolutionOutputSizeshNQ4ISI();

    abstract int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException;

    abstract boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar);

    @Override // util.h.xy.dh.mh
    public abstract int hashCode();

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr2 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 23) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr2[i4] = (char) (cArr2[i4] - ((int) (getHighSpeedVideoFpsRangesFor ^ (-4839292868003314026L))));
            raVar.f2649++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 73) % 128;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
        }
        if (z) {
            int i5 = Camera2StreamConfigurationMap + 77;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                cArr = new char[i];
                raVar.f2649 = 1;
            } else {
                cArr = new char[i];
                raVar.f2649 = 0;
            }
            while (raVar.f2649 < i) {
                cArr[raVar.f2649] = cArr2[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr2 = cArr;
        }
        java.lang.String str2 = new java.lang.String(cArr2);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 69) % 128;
        objArr[0] = str2;
    }

    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 17;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return this;
        }
        throw null;
    }

    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        getHighSpeedVideoFpsRanges = i;
        getHighResolutionOutputSizeshNQ4ISI = (i + 115) % 128;
        return this;
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i + 59) % 128;
        getHighSpeedVideoFpsRanges = (i + 21) % 128;
        return this;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m26325(util.h.xy.dh.mi miVar) {
        int i = (getHighSpeedVideoFpsRanges + 1) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        if (this != miVar) {
            int i2 = i + 35;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                getHighSpeedVideoFpsRanges(miVar);
                throw null;
            }
            if (!getHighSpeedVideoFpsRanges(miVar)) {
                return false;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 53) % 128;
        return true;
    }

    @Override // util.h.xy.dh.mh
    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if ((obj instanceof util.h.xy.dh.c) && getHighSpeedVideoFpsRanges(((util.h.xy.dh.c) obj).mo26279())) {
                r0 = true;
            }
            int i = getHighSpeedVideoFpsRanges + 11;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return r0;
            }
            throw null;
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 63;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        r0 = i2 % 2 == 0;
        int i4 = i3 + 11;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            return r0;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.dh.mi m26324(byte[] bArr) throws java.io.IOException {
        util.h.xy.dh.mf mfVar = new util.h.xy.dh.mf(bArr);
        try {
            util.h.xy.dh.mi m26317 = mfVar.m26317();
            if (mfVar.available() == 0) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 119;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    return m26317;
                }
                throw null;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u0015\u0006\u0005\uffc1\u0002\u0015\u0002\u0005\uffc1\u0002\u0013\u0015\u0019￦\u000e\u0002\u0006\u0013\u0015\u0014\uffc1\u000f\n\uffc1\u0005\u0006\u0015\u0004\u0006", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 28, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, true, objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.ClassCastException unused) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u0002\u0000\r\r\u000e\u0013\uffbf\u0011\u0004\u0002\u000e\u0006\r\b\u0012\u0004\uffbf\u000e\u0001\t\u0004\u0002\u0013\uffbf\b\r\uffbf\u0012\u0013\u0011\u0004\u0000\f", 33 - android.view.View.combineMeasuredStates(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, 136 - android.view.View.combineMeasuredStates(0, 0), false, objArr2);
            throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
        }
    }

    @Override // util.h.xy.dh.mh
    /* renamed from: ᐝ */
    public void mo26323(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 119;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.dh.rj.m26338(outputStream, str).getHighSpeedVideoFpsRangesFor(this, i % 2 != 0);
    }

    @Override // util.h.xy.dh.mh
    /* renamed from: ˊ */
    public void mo26321(java.io.OutputStream outputStream) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
        util.h.xy.dh.rj.m26339(outputStream).getHighSpeedVideoFpsRangesFor(this, true);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
    }

    mi() {
    }
}
