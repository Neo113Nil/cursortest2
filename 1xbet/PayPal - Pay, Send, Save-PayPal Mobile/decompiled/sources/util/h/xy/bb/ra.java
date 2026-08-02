package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class ra implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt {
    private static int Camera2StreamConfigurationMap = 61;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "ra";
    private java.lang.String getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private byte[] getOutputFormats;

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return getHighSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    static {
        int i = 61 % 2;
    }

    public ra() {
        this.getOutputFormats = new byte[0];
        this.getHighSpeedVideoSizes = new byte[0];
        this.getHighSpeedVideoSizesFor = new byte[0];
    }

    public ra(byte[] bArr) throws org.json.JSONException {
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(util.h.xy.al.ra.f745);
        m25335(jSONObject2.getString(util.h.xy.al.ra.f746));
        m25337(jSONObject2.getString(util.h.xy.al.ra.f777).getBytes());
        m25334(jSONObject2.getString(util.h.xy.al.ra.f792).getBytes());
        m25333(jSONObject2.getString(util.h.xy.al.ra.f827).getBytes());
        m25336(jSONObject.getString(util.h.xy.al.ra.f823));
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt
    public final java.lang.String getProductName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f562);
        sb.append(util.h.xy.al.ra.f740);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputFormats;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 81) + (i | 81)) % 128;
        return str2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25335(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 19) << 1) - (i ^ 19);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInputFormats = str;
        } else {
            this.getInputFormats = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getBitmap(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType cardArtType, final com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAbstractAsyncHandler<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap> mGAbstractAsyncHandler) {
        byte[] bArr;
        byte[] bArr2;
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f562);
        sb.append(util.h.xy.al.ra.f277);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 101) + ((i & 101) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (cardArtType != null) {
            Camera2StreamConfigurationMap = ((i2 & 41) + (i2 | 41)) % 128;
            if (m25332() != null) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 83) % 128;
                byte[] bArr3 = null;
                try {
                    java.lang.String m25150 = util.h.xy.au.g.m25127().m25150(cardArtType, m25332());
                    if (android.text.TextUtils.isEmpty(m25150)) {
                        util.h.xy.bb.ra.ma maVar = new util.h.xy.bb.ra.ma();
                        maVar.getHighResolutionOutputSizeshNQ4ISI(true);
                        util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f561);
                        mGAbstractAsyncHandler.onComplete(maVar);
                        bArr2 = null;
                    } else {
                        byte[] m25206 = ((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25206();
                        try {
                            bArr3 = util.h.xy.bh.mb.m25469();
                            java.lang.String str2 = new java.lang.String(m25206, java.nio.charset.StandardCharsets.UTF_8);
                            java.lang.String str3 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(str2);
                            sb2.append(util.h.xy.al.ra.f320);
                            sb2.append(util.h.xy.al.ra.f779);
                            sb2.append(util.h.xy.al.ra.f320);
                            sb2.append(1);
                            sb2.append(util.h.xy.al.ra.f320);
                            sb2.append(1);
                            sb2.append(util.h.xy.al.ra.f320);
                            sb2.append(util.h.xy.al.ra.f793);
                            sb2.append(util.h.xy.al.ra.f320);
                            sb2.append(str3);
                            sb2.append(util.h.xy.al.ra.f320);
                            sb2.append(util.h.xy.al.ra.f850);
                            sb2.append(util.h.xy.al.ra.f320);
                            sb2.append(m25150);
                            util.h.xy.az.b bVar = new util.h.xy.az.b(sb2.toString(), util.h.xy.az.b.EnumC0259b.f913);
                            int i3 = Camera2StreamConfigurationMap;
                            getHighResolutionOutputSizeshNQ4ISI = ((i3 & 125) + (i3 | 125)) % 128;
                            util.h.xy.az.a.m25254().m25255(new util.h.xy.az.d(bVar, new util.h.xy.az.d.b() { // from class: util.h.xy.bb.ra.2
                                private static int getInputFormats = 1;
                                private static int getOutputFormats;
                                util.h.xy.bb.ra.ma Camera2StreamConfigurationMap;
                                java.lang.String getHighResolutionOutputSizeshNQ4ISI = "";
                                boolean getHighSpeedVideoSizes = false;

                                {
                                    this.Camera2StreamConfigurationMap = util.h.xy.bb.ra.this.new ma();
                                }

                                @Override // util.h.xy.az.d.b
                                /* renamed from: ᐝ */
                                public final void mo25270(util.h.xy.az.ra raVar) {
                                    try {
                                        util.h.xy.bb.ra.getHighSpeedVideoSizes();
                                        new java.lang.String(raVar.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                                        java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(raVar);
                                        if (util.h.xy.az.ra.m25277(m25142)) {
                                            getOutputFormats = (getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                            util.h.xy.bb.ra.getHighSpeedVideoSizes();
                                            java.util.List<util.h.xy.au.mg> m25156 = util.h.xy.au.g.m25127().m25156(raVar.m25280());
                                            if (m25156.isEmpty()) {
                                                this.getHighSpeedVideoSizes = true;
                                                this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.al.ra.f717;
                                                util.h.xy.bb.ra.getHighSpeedVideoSizes();
                                                int i4 = getOutputFormats;
                                                getInputFormats = (((i4 | 33) << 1) - (i4 ^ 33)) % 128;
                                            } else {
                                                util.h.xy.bb.mb mbVar = new util.h.xy.bb.mb();
                                                util.h.xy.au.mg mgVar = m25156.get(0);
                                                java.lang.String m25196 = mgVar.m25196();
                                                if (!android.text.TextUtils.isEmpty(m25196)) {
                                                    int i5 = getInputFormats + 15;
                                                    getOutputFormats = i5 % 128;
                                                    if (i5 % 2 != 0) {
                                                        ((util.h.xy.bb.b) mbVar.getSize()).m25300(java.lang.Integer.parseInt(m25196));
                                                        throw new java.lang.ArithmeticException();
                                                    }
                                                    ((util.h.xy.bb.b) mbVar.getSize()).m25300(java.lang.Integer.parseInt(m25196));
                                                }
                                                java.lang.String m25189 = mgVar.m25189();
                                                if (!android.text.TextUtils.isEmpty(m25189)) {
                                                    getInputFormats = (getOutputFormats + 99) % 128;
                                                    ((util.h.xy.bb.b) mbVar.getSize()).m25299(java.lang.Integer.parseInt(m25189));
                                                    int i6 = getInputFormats;
                                                    getOutputFormats = (((i6 | 89) << 1) - (i6 ^ 89)) % 128;
                                                }
                                                util.h.xy.bb.mb mbVar2 = mbVar;
                                                mbVar.m25311(mgVar.m25195());
                                                util.h.xy.bb.mb mbVar3 = mbVar;
                                                mbVar.m25310(mgVar.m25192());
                                                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(true);
                                                util.h.xy.bb.ra.ma maVar2 = this.Camera2StreamConfigurationMap;
                                                int i7 = util.h.xy.bb.ra.ma.getHighResolutionOutputSizeshNQ4ISI;
                                                util.h.xy.bb.ra.ma.getHighSpeedVideoSizes = (((i7 | 39) << 1) - (i7 ^ 39)) % 128;
                                                maVar2.getHighSpeedVideoFpsRanges = mbVar;
                                                int i8 = i7 + 3;
                                                util.h.xy.bb.ra.ma.getHighSpeedVideoSizes = i8 % 128;
                                                if (i8 % 2 != 0) {
                                                    throw new java.lang.ArithmeticException();
                                                }
                                                util.h.xy.bb.ra.getHighSpeedVideoSizes();
                                            }
                                            getOutputFormats = (getInputFormats + 25) % 128;
                                        } else {
                                            this.getHighSpeedVideoSizes = true;
                                            this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.au.g.m25127().m25134(raVar);
                                            util.h.xy.bb.ra.getHighSpeedVideoSizes();
                                        }
                                        if (this.getHighSpeedVideoSizes) {
                                            util.h.xy.au.mb mbVar4 = new util.h.xy.au.mb(m25142, this.getHighResolutionOutputSizeshNQ4ISI);
                                            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(false);
                                            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(mbVar4);
                                            getInputFormats = (getOutputFormats + 17) % 128;
                                        }
                                        int i9 = getInputFormats;
                                        getOutputFormats = ((i9 & 119) + (i9 | 119)) % 128;
                                    } catch (org.json.JSONException e) {
                                        util.h.xy.au.mb mbVar5 = new util.h.xy.au.mb(util.h.xy.al.ra.f731, e.getMessage());
                                        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(false);
                                        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(mbVar5);
                                    }
                                    util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f561);
                                    mGAbstractAsyncHandler.onComplete(this.Camera2StreamConfigurationMap);
                                    int i10 = getOutputFormats;
                                    getInputFormats = (((i10 | 95) << 1) - (i10 ^ 95)) % 128;
                                }

                                @Override // util.h.xy.az.d.b
                                /* renamed from: ᐝ */
                                public final void mo25269(util.h.xy.az.ma maVar2) {
                                    util.h.xy.au.mb m25478;
                                    int i4 = getInputFormats;
                                    int i5 = ((i4 | 45) << 1) - (i4 ^ 45);
                                    getOutputFormats = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        m25478 = util.h.xy.bh.mb.m25478(maVar2);
                                        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(true);
                                    } else {
                                        m25478 = util.h.xy.bh.mb.m25478(maVar2);
                                        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(false);
                                    }
                                    this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(m25478);
                                    util.h.xy.bb.ra.getHighSpeedVideoSizes();
                                    util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f561);
                                    mGAbstractAsyncHandler.onComplete(this.Camera2StreamConfigurationMap);
                                }
                            }));
                            int i4 = getHighResolutionOutputSizeshNQ4ISI;
                            Camera2StreamConfigurationMap = ((i4 ^ 13) + ((i4 & 13) << 1)) % 128;
                            bArr2 = bArr3;
                            bArr3 = m25206;
                        } catch (java.lang.Exception e) {
                            e = e;
                            bArr = bArr3;
                            bArr3 = m25206;
                            try {
                                e.getMessage();
                                util.h.xy.au.mb mbVar = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, util.h.xy.al.ra.f400);
                                util.h.xy.bb.ra.ma maVar2 = new util.h.xy.bb.ra.ma();
                                maVar2.getHighResolutionOutputSizeshNQ4ISI(false);
                                maVar2.getHighSpeedVideoFpsRanges(mbVar);
                                util.h.xy.am.ma.m25027(util.h.xy.al.ra.f860, util.h.xy.al.ra.f561);
                                mGAbstractAsyncHandler.onComplete(maVar2);
                                if (bArr3 != null) {
                                    java.util.Arrays.fill(bArr3, (byte) 0);
                                }
                                if (bArr != null) {
                                    java.util.Arrays.fill(bArr, (byte) 0);
                                }
                                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (bArr3 != null) {
                                    java.util.Arrays.fill(bArr3, (byte) 0);
                                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 3) % 128;
                                }
                                if (bArr != null) {
                                    int i5 = getHighResolutionOutputSizeshNQ4ISI;
                                    Camera2StreamConfigurationMap = (((i5 | 89) << 1) - (i5 ^ 89)) % 128;
                                    java.util.Arrays.fill(bArr, (byte) 0);
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            bArr = bArr3;
                            bArr3 = m25206;
                            if (bArr3 != null) {
                            }
                            if (bArr != null) {
                            }
                            throw th;
                        }
                    }
                    if (bArr3 != null) {
                        java.util.Arrays.fill(bArr3, (byte) 0);
                    }
                    if (bArr2 != null) {
                        java.util.Arrays.fill(bArr2, (byte) 0);
                        int i6 = Camera2StreamConfigurationMap;
                        getHighResolutionOutputSizeshNQ4ISI = ((i6 & 5) + (i6 | 5)) % 128;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    bArr = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr = null;
                }
            }
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt
    public final byte[] getPANLastDigits() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f562);
        sb.append(util.h.xy.al.ra.f834);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getOutputFormats;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i | 111) << 1) - (i ^ 111)) % 128;
        return copyOf;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25337(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 109) % 128;
        this.getOutputFormats = java.util.Arrays.copyOf(bArr, bArr.length);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 67) << 1) - (i ^ 67);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt
    public final byte[] getTokenLastDigits() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f562);
        sb.append(util.h.xy.al.ra.f275);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighSpeedVideoSizes;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 71) + (i | 71);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return copyOf;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25334(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 33) << 1) - (i ^ 33)) % 128;
        this.getHighSpeedVideoSizes = java.util.Arrays.copyOf(bArr, bArr.length);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArt
    public final byte[] getTokenExpiryDate() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f562);
        sb.append(util.h.xy.al.ra.f294);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 77) + ((i & 77) << 1)) % 128;
        return copyOf;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25333(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 13) + (i | 13)) % 128;
        this.getHighSpeedVideoSizesFor = java.util.Arrays.copyOf(bArr, bArr.length);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m25332() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f562);
        sb.append(util.h.xy.al.ra.f287);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 87) + (i | 87);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25336(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 27) + ((i & 27) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = str;
        } else {
            this.getHighSpeedVideoFpsRanges = str;
            throw new java.lang.ArithmeticException();
        }
    }

    final class ma implements com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap> {
        static int getHighResolutionOutputSizeshNQ4ISI = 1;
        static int getHighSpeedVideoSizes;
        private com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError Camera2StreamConfigurationMap;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap getHighSpeedVideoFpsRanges;
        private boolean getOutputFormats;

        ma() {
        }

        @Override // com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult
        public final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap getResult() {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 77) % 128;
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f590);
            sb.append(util.h.xy.al.ra.f696);
            util.h.xy.am.ma.m25027(str, sb.toString());
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap cardBitmap = this.getHighSpeedVideoFpsRanges;
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i ^ 17) + ((i & 17) << 1);
            int i3 = i2 % 128;
            getHighSpeedVideoSizes = i3;
            if (i2 % 2 == 0) {
                getHighResolutionOutputSizeshNQ4ISI = (i3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                return cardBitmap;
            }
            throw null;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            int i = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
            getHighSpeedVideoSizes = i;
            this.getOutputFormats = z;
            int i2 = (i & 53) + (i | 53);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public final void getHighSpeedVideoFpsRanges(com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 11;
            int i2 = i % 128;
            getHighSpeedVideoSizes = i2;
            if (i % 2 == 0) {
                this.Camera2StreamConfigurationMap = mobileGatewayError;
                int i3 = (i2 & 9) + (i2 | 9);
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.Camera2StreamConfigurationMap = mobileGatewayError;
            throw null;
        }

        @Override // com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult
        public final boolean isSuccessful() {
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f590);
            sb.append(util.h.xy.al.ra.f292);
            util.h.xy.am.ma.m25027(str, sb.toString());
            boolean z = this.getOutputFormats;
            int i = getHighSpeedVideoSizes + 111;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return z;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult
        public final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError getErrorCode() {
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f590);
            sb.append(util.h.xy.al.ra.f528);
            util.h.xy.am.ma.m25027(str, sb.toString());
            com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError = this.Camera2StreamConfigurationMap;
            int i = getHighSpeedVideoSizes + 125;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return mobileGatewayError;
            }
            throw null;
        }
    }
}
