package util.h.xy.aq;

/* loaded from: classes5.dex */
public final class mb {
    private final util.h.xy.aq.c getHighSpeedVideoFpsRanges;
    private static final util.h.xy.aq.c getHighSpeedVideoSizes = new util.h.xy.aq.c() { // from class: util.h.xy.aq.mb.3
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;

        @Override // util.h.xy.aq.c
        /* renamed from: ˊ */
        public final boolean mo25041() {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 47) % 128;
            return false;
        }
    };
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 69) % 128;

    public mb() {
        this(getHighSpeedVideoSizes);
    }

    public mb(util.h.xy.aq.c cVar) {
        this.getHighSpeedVideoFpsRanges = cVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.aq.a m25046(byte[] bArr, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i2 == 0) {
            util.h.xy.aq.a aVar = new util.h.xy.aq.a(arrayList);
            int i3 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i3 ^ 113) + ((i3 & 113) << 1)) % 128;
            return aVar;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 59) % 128;
        int i4 = i;
        int i5 = 0;
        while (i5 < 100) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 27) % 128;
            int i6 = -i4;
            int i7 = i6 * (-716);
            int i8 = -(-(i2 * 1435));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            int i10 = ~i6;
            int i11 = i9 + ((i10 | i2) * (-1434));
            int i12 = ~i;
            int i13 = ~(i12 | i2);
            int i14 = ~((i6 ^ i2) | (i6 & i2));
            int i15 = (i13 ^ i14) | (i13 & i14);
            int i16 = ~i2;
            int i17 = ~(i10 | i16 | i);
            int i18 = ((i15 ^ i17) | (i15 & i17)) * 717;
            int i19 = (i11 ^ i18) + ((i11 & i18) << 1);
            int i20 = (i10 & i16) | (i10 ^ i16);
            int i21 = ~((i20 ^ i12) | (i12 & i20));
            int i22 = ~(i6 | i2);
            int i23 = (i22 ^ i21) | (i22 & i21);
            int i24 = ~((i2 ^ i) | (i2 & i));
            int i25 = ((i23 ^ i24) | (i23 & i24)) * 717;
            util.h.xy.aq.mb.ma highSpeedVideoSizes = getHighSpeedVideoSizes(0, bArr, i4, ((i19 | i25) << 1) - (i25 ^ i19));
            arrayList.add(util.h.xy.aq.mb.ma.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes));
            if (util.h.xy.aq.mb.ma.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes) >= i + i2) {
                break;
            }
            i4 = util.h.xy.aq.mb.ma.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
            int i26 = ((i5 | 12) << 1) - (i5 ^ 12);
            i5 = (i26 ^ (-11)) + ((i26 & (-11)) << 1);
        }
        util.h.xy.aq.a aVar2 = new util.h.xy.aq.a(arrayList);
        int i27 = Camera2StreamConfigurationMap + 107;
        getHighSpeedVideoFpsRangesFor = i27 % 128;
        if (i27 % 2 != 0) {
            return aVar2;
        }
        throw new java.lang.ArithmeticException();
    }

    private util.h.xy.aq.mb.ma getHighSpeedVideoSizes(int i, byte[] bArr, int i2, int i3) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 89) % 128;
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i);
        int i4 = ~i2;
        int i5 = ~i;
        int i6 = ~((i4 ^ i5) | (i4 & i5));
        int i7 = ~((i4 ^ i3) | (i4 & i3));
        int i8 = i6 | i7;
        int i9 = ~(i5 | i3);
        int i10 = (i8 ^ i9) | (i8 & i9);
        int i11 = ~i3;
        int i12 = (i11 & i2) | (i11 ^ i2);
        int i13 = ~((i12 ^ i) | (i12 & i));
        int i14 = (i3 * (-589)) + (i2 * 591) + (((i10 ^ i13) | (i10 & i13)) * 590);
        int i15 = (i6 ^ i7) | (i6 & i7);
        int i16 = ~((i5 ^ i3) | (i5 & i3));
        int i17 = -(-(((i15 ^ i16) | (i15 & i16)) * (-1180)));
        int i18 = (i14 ^ i17) + ((i17 & i14) << 1);
        int i19 = ~((i11 & i5) | (i11 ^ i5));
        int i20 = ~(i5 | i2);
        int i21 = -(-(((i19 ^ i20) | (i19 & i20)) * 590));
        if (((i18 | i21) << 1) - (i21 ^ i18) > bArr.length) {
            throw new java.lang.IllegalStateException(util.h.xy.al.ra.f822);
        }
        if (this.getHighSpeedVideoFpsRanges.mo25041()) {
            int i22 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i22 & 27) + (i22 | 27)) % 128;
            new java.lang.Object[]{Camera2StreamConfigurationMap2, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), util.h.xy.aq.ma.m25042(bArr, i2, i3)};
        }
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i2);
        util.h.xy.aq.b highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2, bArr, i2, highSpeedVideoFpsRanges);
        if (this.getHighSpeedVideoFpsRanges.mo25041()) {
            new java.lang.Object[]{Camera2StreamConfigurationMap2, highSpeedVideoFpsRanges2, java.lang.Integer.valueOf(highSpeedVideoFpsRanges), util.h.xy.aq.ma.m25042(bArr, i2, highSpeedVideoFpsRanges)};
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 23) % 128;
        }
        int i23 = ~highSpeedVideoFpsRanges;
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, (i2 - i23) - 1);
        int i24 = (highSpeedVideoFpsRanges ^ i2) | (highSpeedVideoFpsRanges & i2);
        int i25 = ~((i23 ^ i2) | (i23 & i2));
        int i26 = ~((i4 & highSpeedVideoFpsRanges) | (i4 ^ highSpeedVideoFpsRanges) | i);
        int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(bArr, ((((highSpeedVideoFpsRanges * 367) + (i2 * 367)) - (~(-(-(i24 * (-366)))))) - 1) + (((~((i4 & i) | (i4 ^ i))) | highSpeedVideoFpsRanges) * (-366)) + (((i25 ^ i26) | (i26 & i25)) * 366));
        if (this.getHighSpeedVideoFpsRanges.mo25041()) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 15) % 128;
            new java.lang.Object[]{Camera2StreamConfigurationMap2, java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(Camera2StreamConfigurationMap3), util.h.xy.aq.ma.m25042(bArr, i2 + highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI)};
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 75) % 128;
        }
        if (!highSpeedVideoFpsRanges2.m25040()) {
            byte[] bArr2 = new byte[Camera2StreamConfigurationMap3];
            int i27 = -(-highSpeedVideoFpsRanges);
            int i28 = (i2 & i27) + (i27 | i2);
            int i29 = -(-highResolutionOutputSizeshNQ4ISI);
            java.lang.System.arraycopy(bArr, ((i28 | i29) << 1) - (i29 ^ i28), bArr2, 0, Camera2StreamConfigurationMap3);
            int i30 = (((highSpeedVideoFpsRanges * (-55)) - (~(-(-(i2 * (-55)))))) - 1) + (((~((highSpeedVideoFpsRanges ^ i) | (highSpeedVideoFpsRanges & i))) | i2) * 56) + ((~i24) * (-56));
            int i31 = -(-(((~((i5 ^ i2) | (i5 & i2))) | highSpeedVideoFpsRanges) * 56));
            int i32 = (i30 & i31) + (i30 | i31);
            int i33 = (i32 ^ highResolutionOutputSizeshNQ4ISI) + ((i32 & highResolutionOutputSizeshNQ4ISI) << 1);
            int i34 = ~Camera2StreamConfigurationMap3;
            int i35 = (i34 & i5) | (i34 ^ i5);
            int i36 = (Camera2StreamConfigurationMap3 ^ i33) | (Camera2StreamConfigurationMap3 & i33);
            int i37 = (Camera2StreamConfigurationMap3 * 303) + (i33 * (-301)) + (((~((i35 ^ i33) | (i35 & i33))) | (~((i36 ^ i) | (i36 & i)))) * (-302));
            int i38 = (i34 ^ i33) | (i34 & i33);
            int i39 = (~((i38 ^ i) | (i38 & i))) * (-604);
            int i40 = ~i33;
            int i41 = ~((Camera2StreamConfigurationMap3 ^ i40) | (i40 & Camera2StreamConfigurationMap3));
            int i42 = ~(i33 | i);
            int i43 = (((i37 ^ i39) + ((i39 & i37) << 1)) - (~(((i41 ^ i42) | (i42 & i41)) * 302))) - 1;
            if (this.getHighSpeedVideoFpsRanges.mo25041()) {
                int i44 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i44 ^ 81) + ((i44 & 81) << 1)) % 128;
                new java.lang.Object[]{Camera2StreamConfigurationMap2, util.h.xy.aq.ma.m25043(bArr2)};
                new java.lang.Object[]{Camera2StreamConfigurationMap2, java.lang.Integer.valueOf(i43)};
            }
            return new util.h.xy.aq.mb.ma(new util.h.xy.aq.ra(highSpeedVideoFpsRanges2, bArr2), i43);
        }
        java.util.ArrayList<util.h.xy.aq.ra> arrayList = new java.util.ArrayList<>();
        getHighSpeedVideoFpsRangesFor(i, bArr, i2, Camera2StreamConfigurationMap2, highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI, Camera2StreamConfigurationMap3, arrayList);
        int i45 = i2 + highSpeedVideoFpsRanges;
        int i46 = ~i45;
        int i47 = (i46 ^ highResolutionOutputSizeshNQ4ISI) | (i46 & highResolutionOutputSizeshNQ4ISI);
        int i48 = (((highResolutionOutputSizeshNQ4ISI * 624) + (i45 * (-622))) - (~(-(-((~((i47 & i) | (i47 ^ i))) * 623))))) - 1;
        int i49 = ~highResolutionOutputSizeshNQ4ISI;
        int i50 = ~((i45 ^ i49) | (i49 & i45));
        int i51 = -(-(((i50 ^ i5) | (i50 & i5)) * (-623)));
        int i52 = ((i48 | i51) << 1) - (i51 ^ i48);
        int i53 = ~i47;
        int i54 = ~(i46 | i);
        int i55 = (i53 ^ i54) | (i54 & i53);
        int i56 = ~(highResolutionOutputSizeshNQ4ISI | i);
        int i57 = ((i55 ^ i56) | (i55 & i56)) * 623;
        int i58 = ((i52 | i57) << 1) - (i57 ^ i52);
        int i59 = Camera2StreamConfigurationMap3 * (-1939);
        int i60 = -(-(i58 * 971));
        int i61 = (i59 & i60) + (i60 | i59);
        int i62 = ~i58;
        int i63 = ~(i62 | Camera2StreamConfigurationMap3);
        int i64 = ~((i5 ^ i58) | (i5 & i58));
        int i65 = -(-(((i63 ^ i64) | (i63 & i64)) * (-970)));
        int i66 = ~Camera2StreamConfigurationMap3;
        int i67 = (i61 & i65) + (i61 | i65) + ((~((i58 & i66) | (i66 ^ i58))) * 1940);
        int i68 = ~((i66 ^ i62) | (i62 & i66));
        int i69 = ((i68 ^ i64) | (i68 & i64)) * 970;
        int i70 = ((i67 | i69) << 1) - (i69 ^ i67);
        if (this.getHighSpeedVideoFpsRanges.mo25041()) {
            new java.lang.Object[]{Camera2StreamConfigurationMap2, java.lang.Integer.valueOf(i70)};
        }
        return new util.h.xy.aq.mb.ma(new util.h.xy.aq.ra(highSpeedVideoFpsRanges2, arrayList), i70);
    }

    private void getHighSpeedVideoFpsRangesFor(int i, byte[] bArr, int i2, java.lang.String str, int i3, int i4, int i5, java.util.ArrayList<util.h.xy.aq.ra> arrayList) {
        int i6 = i2;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        int i7 = i3 * 85;
        int i8 = -(-(i6 * 85));
        int i9 = ~i3;
        int i10 = ~i6;
        int i11 = ~i;
        int i12 = (~((i9 ^ i11) | (i9 & i11))) | (~((i9 & i10) | (i9 ^ i10)));
        int i13 = ~((i10 ^ i11) | (i10 & i11));
        int i14 = (i3 ^ i6) | (i3 & i6);
        int i15 = ~(i10 | i);
        int i16 = (i15 ^ i3) | (i15 & i3);
        int i17 = ~((i11 ^ i6) | (i11 & i6));
        int i18 = ((((((i7 ^ i8) + ((i7 & i8) << 1)) - (~((((i12 & i13) | (i12 ^ i13)) | (~((i14 & i) | (i14 ^ i)))) * (-84)))) - 1) + (((i16 & i17) | (i16 ^ i17)) * (-84))) - (~(((~(i3 | i6)) | i17) * 84))) - 1;
        int i19 = -(-i4);
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        int i21 = i5;
        while (true) {
            int i22 = ~i5;
            int i23 = (((i5 * (-109)) + (i6 * 111)) - (~(((~((i6 ^ i) | (i6 & i))) | i22) * (-220)))) - 1;
            int i24 = ((~((i5 ^ i6) | (i5 & i6))) | (~(i6 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            int i26 = ~((i22 & i6) | (i22 ^ i6));
            int i27 = ~((i10 ^ i5) | (i10 & i5));
            int i28 = -(-(((i26 ^ i27) | (i26 & i27)) * 110));
            if (i20 >= (i25 & i28) + (i28 | i25)) {
                return;
            }
            int i29 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i29 | 93) << 1) - (i29 ^ 93)) % 128;
            int i30 = i * (-301);
            int i31 = (i30 ^ 303) + ((i30 & 303) << 1);
            int i32 = i11 | (-2);
            int i33 = ~((i32 ^ i) | (i32 & i));
            int i34 = i | 1;
            int i35 = ~((i34 & i) | (i34 ^ i));
            int i36 = -(-(((i33 & i35) | (i33 ^ i35)) * (-302)));
            int i37 = (i31 ^ i36) + ((i36 & i31) << 1);
            int i38 = (~((i & (-2)) | (i ^ (-2)) | i)) * (-604);
            int i39 = ~(i11 | 1);
            util.h.xy.aq.mb.ma highSpeedVideoSizes = getHighSpeedVideoSizes(((((i37 | i38) << 1) - (i38 ^ i37)) - (~(-(-(((i39 ^ i11) | (i39 & i11)) * 302))))) - 1, bArr, i20, i21);
            arrayList.add(util.h.xy.aq.mb.ma.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes));
            i20 = util.h.xy.aq.mb.ma.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
            int i40 = -i20;
            int i41 = i40 * 398;
            int i42 = -(-(i5 * (-396)));
            int i43 = ~i40;
            int i44 = ~((i43 ^ i11) | (i43 & i11));
            int i45 = ~((i43 ^ i5) | (i43 & i5));
            int i46 = (i44 ^ i45) | (i44 & i45);
            int i47 = ~((i11 ^ i5) | (i11 & i5));
            int i48 = ((((i41 & i42) + (i41 | i42)) + (((i46 & i47) | (i46 ^ i47)) * (-397))) - (~(i45 * (-397)))) - 1;
            int i49 = (i & i45) | (i ^ i45);
            int i50 = ~((i22 ^ i40) | (i22 & i40));
            int i51 = ((i49 ^ i50) | (i49 & i50)) * 397;
            if (this.getHighSpeedVideoFpsRanges.mo25041()) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 95) % 128;
                new java.lang.Object[]{str, java.lang.Integer.valueOf(i), util.h.xy.aq.mb.ma.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes).m25050(), java.lang.Integer.valueOf(util.h.xy.aq.mb.ma.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes)), java.lang.Integer.valueOf(i20), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5)};
            }
            int i52 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i52 & 9) + (i52 | 9)) % 128;
            i21 = ((i48 | i51) << 1) - (i48 ^ i51);
            i6 = i2;
        }
    }

    private java.lang.String Camera2StreamConfigurationMap(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i2 ^ 91) + ((i2 & 91) << 1)) % 128;
        if (!this.getHighSpeedVideoFpsRanges.mo25041()) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 117) % 128;
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i3 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i3 | 97) << 1) - (i3 ^ 97)) % 128;
        int i4 = 0;
        while (i4 < i * 4) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 23) % 128;
            sb.append(' ');
            i4 = ((i4 ^ 23) + ((i4 & 23) << 1)) - 22;
            int i5 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i5 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        }
        return sb.toString();
    }

    static final class ma {
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoSizes = 1;
        private final util.h.xy.aq.ra getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRangesFor;

        static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(util.h.xy.aq.mb.ma maVar) {
            int i = getHighSpeedVideoSizes + 59;
            getHighSpeedVideoFpsRanges = i % 128;
            int i2 = maVar.getHighSpeedVideoFpsRangesFor;
            if (i % 2 == 0) {
                return i2;
            }
            throw null;
        }

        static /* synthetic */ util.h.xy.aq.ra getHighSpeedVideoFpsRangesFor(util.h.xy.aq.mb.ma maVar) {
            int i = getHighSpeedVideoSizes;
            int i2 = ((i & 37) + (i | 37)) % 128;
            getHighSpeedVideoFpsRanges = i2;
            util.h.xy.aq.ra raVar = maVar.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = (i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                return raVar;
            }
            throw null;
        }

        public ma(util.h.xy.aq.ra raVar, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = raVar;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f486);
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(util.h.xy.al.ra.f479);
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            java.lang.String obj = sb.toString();
            int i = getHighSpeedVideoFpsRanges + 53;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                return obj;
            }
            throw null;
        }
    }

    private util.h.xy.aq.b getHighSpeedVideoFpsRanges(java.lang.String str, byte[] bArr, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = (i3 & 59) + (i3 | 59);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            if (this.getHighSpeedVideoFpsRanges.mo25041()) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 69) % 128;
                new java.lang.Object[]{str, util.h.xy.aq.ma.m25042(bArr, i, i2)};
            }
            util.h.xy.aq.b bVar = new util.h.xy.aq.b(bArr, i, i2);
            int i5 = getHighSpeedVideoFpsRangesFor + 21;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                return bVar;
            }
            throw new java.lang.ArithmeticException();
        }
        this.getHighSpeedVideoFpsRanges.mo25041();
        throw null;
    }

    private static int getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (((i2 | 21) << 1) - (i2 ^ 21)) % 128;
        Camera2StreamConfigurationMap = i3;
        if ((bArr[i] & com.google.common.base.Ascii.US) != 31) {
            return 1;
        }
        getHighSpeedVideoFpsRangesFor = (((i3 | 45) << 1) - (i3 ^ 45)) % 128;
        int i4 = i * (-590);
        int i5 = (i ^ (-2)) | (i & (-2));
        int i6 = (i4 & 592) + (i4 | 592) + ((~i5) * (-1182));
        int i7 = ~i;
        int i8 = (i7 & (-2)) | (i7 ^ (-2));
        int i9 = ~((i8 ^ i7) | (i8 & i7));
        int i10 = ~(i | 1);
        int i11 = -(-(((i9 ^ i10) | (i9 & i10)) * (-591)));
        int i12 = ((((i6 | i11) << 1) - (i6 ^ i11)) - (~(-(-(((i7 ^ i5) | (i7 & i5)) * 591))))) - 1;
        int i13 = 2;
        while (true) {
            if (i12 >= (i & 10) + (i | 10)) {
                break;
            }
            int i14 = getHighSpeedVideoFpsRangesFor;
            int i15 = (i14 + 89) % 128;
            Camera2StreamConfigurationMap = i15;
            if ((bArr[i12] & 128) != 128) {
                getHighSpeedVideoFpsRangesFor = ((i15 ^ 111) + ((i15 & 111) << 1)) % 128;
                break;
            }
            i13 = (i13 ^ 1) + ((i13 & 1) << 1);
            i12++;
            Camera2StreamConfigurationMap = (((i14 | 55) << 1) - (i14 ^ 55)) % 128;
        }
        int i16 = getHighSpeedVideoFpsRangesFor + 11;
        Camera2StreamConfigurationMap = i16 % 128;
        if (i16 % 2 == 0) {
            return i13;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r0 + 99;
        util.h.xy.aq.mb.Camera2StreamConfigurationMap = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r1 = r2 & 53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1 > 5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x015d, code lost:
    
        throw new java.lang.IllegalStateException(java.lang.String.format(util.h.xy.al.ra.f780, java.lang.Integer.valueOf(r15), java.lang.Integer.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r2 = r15 * (-344);
        r4 = (r2 & (-344)) + (r2 | (-344));
        r2 = ~r15;
        r5 = (r2 ^ (-2)) | (r2 & (-2));
        r6 = ~r5;
        r7 = ~((r15 ^ (-2)) | (r15 & (-2)));
        r7 = ((r7 ^ r6) | (r6 & r7)) * 345;
        r8 = ((r4 | r7) << 1) - (r4 ^ r7);
        r4 = ~(r2 | (-2));
        r7 = ~((r2 ^ 1) | (r2 & 1));
        r4 = -(-(((r4 ^ r7) | (r4 & r7)) * 345));
        r9 = (r8 & r4) + (r4 | r8);
        r4 = -(-((~((r5 & r15) | (r5 ^ r15))) * 345));
        r5 = (r9 & r4) + (r4 | r9);
        r0 = r0 + 103;
        util.h.xy.aq.mb.Camera2StreamConfigurationMap = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if ((r0 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        r3 = 5 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r3 = (r15 * (-97)) + 50;
        r4 = ~(r2 | r2);
        r4 = ((r4 ^ r7) | (r4 & r7)) * 98;
        r8 = r6 | r2;
        r9 = ~((r15 ^ 1) | (r15 & 1));
        r10 = ((r3 & r4) + (r3 | r4)) + (((r8 & r9) | (r8 ^ r9)) * (-49));
        r3 = ~((r2 ^ r15) | (r2 & r15));
        r3 = ((r3 ^ r9) | (r3 & r9)) * 49;
        r4 = (r10 & r3) + (r3 | r10);
        r3 = -(-(r4 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE));
        r8 = ~r4;
        r9 = (~((r8 ^ r15) | (r8 & r15))) | (~((r2 ^ r1) | (r2 & r1)));
        r10 = ~((r2 ^ r4) | (r2 & r4));
        r11 = ~r1;
        r8 = (r8 ^ r11) | (r8 & r11);
        r8 = ~((r8 ^ r15) | (r8 & r15));
        r12 = (r11 & r2) | (r11 ^ r2);
        r12 = ~((r12 ^ r4) | (r12 & r4));
        r13 = (((((r1 * (-515)) - (~r3)) - 1) + (((r9 & r10) | (r9 ^ r10)) * (-516))) - (~(((r8 & r12) | (r8 ^ r12)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) - 1;
        r3 = ~((r4 & r11) | (r4 ^ r11));
        r3 = ((r3 ^ r10) | (r3 & r10)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0107, code lost:
    
        if (r5 >= ((r13 & r3) + (r3 | r13))) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0109, code lost:
    
        r3 = util.h.xy.aq.mb.getHighSpeedVideoFpsRangesFor;
        r4 = ((r3 | 109) << 1) - (r3 ^ 109);
        util.h.xy.aq.mb.Camera2StreamConfigurationMap = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0118, code lost:
    
        if ((r4 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0130, code lost:
    
        r0 = r0 * 256;
        r3 = r14[r5] & 255;
        r0 = (r0 | r3) + (r0 & r3);
        r5 = r5 - 44;
        r5 = (r5 & 45) + (r5 | 45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011a, code lost:
    
        r0 = r0 * 23647;
        r3 = r14[r5] & 2399;
        r0 = ((r0 & r3) << 1) + (r0 ^ r3);
        r5 = ((r5 | 21) << 1) - (r5 ^ 21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0144, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0030, code lost:
    
        r1 = r2 & 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r1 > 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x001e, code lost:
    
        if ((r1 & 128) == 128) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if ((r1 & 8224) == 20692) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int Camera2StreamConfigurationMap(byte[] bArr, int i) {
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = i3 + 125;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = bArr[i];
            i2 = i5 & 12962;
        } else {
            int i6 = bArr[i];
            i2 = i6 & 255;
        }
        int i7 = getHighSpeedVideoFpsRangesFor;
        int i8 = ((i7 | 13) << 1) - (i7 ^ 13);
        Camera2StreamConfigurationMap = i8 % 128;
        if (i8 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r9 & 128) == 128) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if ((r9 & 1) == 8723) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r0 = (r0 + 45) % 128;
        util.h.xy.aq.mb.getHighSpeedVideoFpsRangesFor = r0;
        r9 = r1 & 127;
        r4 = r9 * (-711);
        r5 = ~(r9 | (-2));
        r6 = ~r10;
        r7 = ~((r6 & r9) | (r6 ^ r9));
        r8 = ((r4 ^ 713) + ((r4 & 713) << 1)) + (((r5 & r7) | (r5 ^ r7)) * (-712));
        r4 = ~(((r6 & (-2)) | (r6 ^ (-2))) | r9);
        r9 = (r9 ^ 1) | (r1 & 1);
        r9 = ~((r9 ^ r10) | (r10 & r9));
        r9 = -(-(((r9 ^ r4) | (r9 & r4)) * (-712)));
        util.h.xy.aq.mb.Camera2StreamConfigurationMap = (r0 + 97) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        return ((r8 ^ r9) + ((r9 & r8) << 1)) + ((r7 | (-2)) * 712);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = ((i3 | 45) << 1) - (i3 ^ 45);
        int i5 = i4 % 128;
        Camera2StreamConfigurationMap = i5;
        if (i4 % 2 != 0) {
            int i6 = bArr[i];
            i2 = i6 & 6215;
        } else {
            int i7 = bArr[i];
            i2 = i7 & 255;
        }
    }
}
