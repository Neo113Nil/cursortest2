package util.h.xy.dh;

/* loaded from: classes5.dex */
final class ba extends util.h.xy.dh.be {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final byte[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static long getHighSpeedVideoSizesFor;
    private static int getOutputMinFrameDuration;
    private int getInputSizeshNQ4ISI;
    private final int getOutputFormats;

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 75;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 5) % 128;
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizesFor ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRangesFor = new byte[0];
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 9) % 128;
    }

    final byte[] getHighSpeedVideoSizes() throws java.io.IOException {
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 1) % 128;
        if (this.getInputSizeshNQ4ISI == 0) {
            return getHighSpeedVideoFpsRangesFor;
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        int i = this.getInputSizeshNQ4ISI;
        if (i >= Camera2StreamConfigurationMap2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("黽ꏎ\ue492⥑樗곕\uf190㉂眂릉瀞㽟䀘苈잍ࡂ䵎辜탐ᕜ嘇飁\uddd4Ṙ⌐料Ꚛ\ueb54Ⰿ滓뎘\uf44c㥞篭벥셭ȥ䓱覬쨧༠処銽흥ᠮ媷鿬", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 15679, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(this.getInputSizeshNQ4ISI);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("麾ᯫ鐵ᅟ", 34123 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(Camera2StreamConfigurationMap2);
            throw new java.io.IOException(sb.toString());
        }
        byte[] bArr = new byte[i];
        int m26744 = i - util.h.xy.ez.ma.m26744(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 0, i);
        this.getInputSizeshNQ4ISI = m26744;
        if (m26744 == 0) {
            getHighSpeedVideoSizes(true);
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return bArr;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes("黚띺춚\ue25d㡶仞朶붞폢\ue85f㻴", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10656, objArr3);
        sb2.append(((java.lang.String) objArr3[0]).intern());
        sb2.append(this.getOutputFormats);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoSizes("麾쪮㙂揩쾇㬦擐퀧㰒榻핝㻥檉혬Ϙ潪\udb0aӱ灒\uddea\u09d2", 21599 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        sb2.append(((java.lang.String) objArr4[0]).intern());
        sb2.append(this.getInputSizeshNQ4ISI);
        throw new java.io.EOFException(sb2.toString());
    }

    final void getHighSpeedVideoFpsRanges(byte[] bArr) throws java.io.IOException {
        int i = this.getInputSizeshNQ4ISI;
        if (i != bArr.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("黼⃬\ue2f6ꓭ曧⣏\uea94곃滃ハ\uf2bf뒧皢㣥朗벘纚É슒葲䙵ࡥ쩰谟乐ၞ퉚鐃嘾ᠴ\uda38鰦", 48647 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (i == 0) {
            return;
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        int i2 = this.getInputSizeshNQ4ISI;
        if (i2 >= Camera2StreamConfigurationMap2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("黽ꏎ\ue492⥑樗곕\uf190㉂眂릉瀞㽟䀘苈잍ࡂ䵎辜탐ᕜ嘇飁\uddd4Ṙ⌐料Ꚛ\ueb54Ⰿ滓뎘\uf44c㥞篭벥셭ȥ䓱覬쨧༠処銽흥ᠮ媷鿬", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 15679, objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.getInputSizeshNQ4ISI);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("麾ᯫ鐵ᅟ", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 34123, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(Camera2StreamConfigurationMap2);
            throw new java.io.IOException(sb.toString());
        }
        int m26744 = i2 - util.h.xy.ez.ma.m26744(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 0, bArr.length);
        this.getInputSizeshNQ4ISI = m26744;
        if (m26744 == 0) {
            getHighSpeedVideoSizes(true);
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes("黚띺춚\ue25d㡶仞朶붞폢\ue85f㻴", 10658 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr4);
            sb2.append(((java.lang.String) objArr4[0]).intern());
            sb2.append(this.getOutputFormats);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes("麾쪮㙂揩쾇㬦擐퀧㰒榻핝㻥檉혬Ϙ潪\udb0aӱ灒\uddea\u09d2", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21598, objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(this.getInputSizeshNQ4ISI);
            throw new java.io.EOFException(sb2.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = getHighSpeedVideoSizes + 71;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.getInputSizeshNQ4ISI;
        if (i4 == 0) {
            return -1;
        }
        int read = this.getHighResolutionOutputSizeshNQ4ISI.read(bArr, i, java.lang.Math.min(i2, i4));
        if (read >= 0) {
            int i5 = this.getInputSizeshNQ4ISI - read;
            this.getInputSizeshNQ4ISI = i5;
            if (i5 == 0) {
                getHighSpeedVideoSizes(true);
                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 113) % 128;
            }
            return read;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("黚띺춚\ue25d㡶仞朶붞폢\ue85f㻴", android.text.TextUtils.getCapsMode("", 0, 0) + 10657, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.getOutputFormats);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("麾쪮㙂揩쾇㬦擐퀧㰒榻핝㻥檉혬Ϙ潪\udb0aӱ灒\uddea\u09d2", 21599 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.getInputSizeshNQ4ISI);
        throw new java.io.EOFException(sb.toString());
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.getInputSizeshNQ4ISI == 0) {
            int i = getOutputMinFrameDuration + 103;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                return -1;
            }
            throw null;
        }
        int read = this.getHighResolutionOutputSizeshNQ4ISI.read();
        if (read >= 0) {
            int i2 = this.getInputSizeshNQ4ISI - 1;
            this.getInputSizeshNQ4ISI = i2;
            if (i2 == 0) {
                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 13) % 128;
                getHighSpeedVideoSizes(true);
            }
            return read;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("黚띺춚\ue25d㡶仞朶붞폢\ue85f㻴", 10658 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.getOutputFormats);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("麾쪮㙂揩쾇㬦擐퀧㰒榻핝㻥檉혬Ϙ潪\udb0aӱ灒\uddea\u09d2", 21599 - android.text.TextUtils.getTrimmedLength(""), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.getInputSizeshNQ4ISI);
        throw new java.io.EOFException(sb.toString());
    }

    final int getHighSpeedVideoFpsRangesFor() {
        int i = (getOutputMinFrameDuration + 43) % 128;
        getHighSpeedVideoSizes = i;
        int i2 = this.getInputSizeshNQ4ISI;
        getOutputMinFrameDuration = (i + 13) % 128;
        return i2;
    }

    ba(java.io.InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("黰ᛸ軿۶뻦㛸껺⛮\udea6囩컥䛑ﻝ盍\ueedc曀Ẏ雃\u0ec7蛓㺂뛀⺰ꚷ庹횢亵욫", 34819 - android.graphics.Color.green(0), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            getHighSpeedVideoSizes(true);
        }
        this.getOutputFormats = i;
        this.getInputSizeshNQ4ISI = i;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = -3661502865059828475L;
    }
}
