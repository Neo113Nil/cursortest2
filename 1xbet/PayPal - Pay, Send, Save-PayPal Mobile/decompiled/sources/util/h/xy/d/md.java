package util.h.xy.d;

/* loaded from: classes5.dex */
public final class md implements com.gemalto.mfs.mwsdk.dcm.DigitalizedCard {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static long getHighSpeedVideoSizes = 0;
    private static long getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static final java.lang.String getOutputFormats;
    private static int getOutputMinFrameDuration;
    private final java.lang.String getInputSizeshNQ4ISI;
    private util.h.xy.d.d getOutputStallDuration;

    public static /* synthetic */ void $r8$lambda$5MBj91EoqCNLfexPRVEufuN4ST8(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getInputFormats + 47;
        getHighSpeedVideoFpsRanges = i % 128;
        int i2 = i % 2;
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26205(paymentType));
        if (i2 != 0) {
            throw null;
        }
        int i3 = getHighSpeedVideoFpsRanges + 117;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$GcY1Gae_ywUttThUIrGKHJhgII4(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        getHighSpeedVideoFpsRanges = (getInputFormats + 69) % 128;
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26208(paymentType));
        int i = getHighSpeedVideoFpsRanges + 103;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: $r8$lambda$eKShu1UyXc7TFTTFU6A-MDZdt0Y, reason: not valid java name */
    public static /* synthetic */ void m26203$r8$lambda$eKShu1UyXc7TFTTFU6AMDZdt0Y(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, java.lang.String str, byte[] bArr, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getHighSpeedVideoFpsRanges + 105;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap(str, bArr);
            throw null;
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, bArr);
        if (Camera2StreamConfigurationMap2 != null) {
            int i2 = getHighSpeedVideoFpsRanges + 37;
            getInputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                Camera2StreamConfigurationMap2.isSuccessful();
                throw null;
            }
            if (!Camera2StreamConfigurationMap2.isSuccessful()) {
                util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, Camera2StreamConfigurationMap2);
                return;
            }
        }
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26207(paymentType, str, bArr));
    }

    public static /* synthetic */ void $r8$lambda$pnTAN5WKaoXJFwOWNg7wV9P4rDs(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getHighSpeedVideoFpsRanges + 89;
        getInputFormats = i % 128;
        int i2 = i % 2;
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26210());
        if (i2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: $r8$lambda$pvLw5PppG_W5NZ42lr-YR9TuMjc, reason: not valid java name */
    public static /* synthetic */ void m26204$r8$lambda$pvLw5PppG_W5NZ42lrYR9TuMjc(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getInputFormats + 105;
        getHighSpeedVideoFpsRanges = i % 128;
        int i2 = i % 2;
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26209());
        if (i2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRanges = (getInputFormats + 37) % 128;
    }

    static {
        getHighSpeedVideoSizes();
        getOutputFormats = util.h.xy.d.md.class.getName();
        getHighSpeedVideoFpsRanges = (getInputFormats + 29) % 128;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 53;
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = i3 + 117;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
            aVar.f2623++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 103) % 128;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    public md(java.lang.String str) {
        util.h.xy.u.d.m27510(str);
        this.getInputSizeshNQ4ISI = str;
    }

    private com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> getHighSpeedVideoFpsRangesFor() {
        synchronized (this) {
            if (this.getOutputStallDuration == null) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = util.h.xy.k.ma.m26925().mo26170(this.getInputSizeshNQ4ISI);
                if (mo26170.isSuccessful()) {
                    this.getOutputStallDuration = mo26170.getResult();
                    return new util.h.xy.an.ra(null, true, null);
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\ue235ᙳ\ue278揹誼愉쾢깸㗐孲ꈼ\uf6b7䵮㋩ﮥ\udf07撱\ueab9ጂ➟", 1 - android.text.TextUtils.getCapsMode("", 0, 0), objArr);
                return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), 1011);
            }
            return new util.h.xy.an.ra(null, true, null);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Boolean> isDefault(final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Boolean> abstractAsyncHandler) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", 1 - android.graphics.Color.alpha(0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ꚣ酬툵㰬어曤", (char) (45211 - android.text.TextUtils.indexOf("", "", 0)), android.graphics.Color.alpha(0), "麒䤛鯼ꎰ", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.md$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.md.$r8$lambda$AVaz5Kk6TMtmY8AYxaAfnfFzJKk(util.h.xy.d.md.this, paymentType, abstractAsyncHandler, maVar);
            }
        }).start();
        getHighSpeedVideoFpsRanges = (getInputFormats + 111) % 128;
        return maVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m26211(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        if (util.h.xy.ag.a.m24556().m24560()) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor.isSuccessful()) {
                getHighSpeedVideoFpsRanges = (getInputFormats + 49) % 128;
                return util.h.xy.k.ra.f2243.m26945(this.getInputSizeshNQ4ISI, paymentType);
            }
            return new util.h.xy.an.ra(null, highSpeedVideoFpsRangesFor.isSuccessful(), highSpeedVideoFpsRangesFor.getErrorMessage(), highSpeedVideoFpsRangesFor.getErrorCode());
        }
        int i = getHighSpeedVideoFpsRanges + 105;
        getInputFormats = i % 128;
        return i % 2 == 0 ? util.h.xy.x.a.m27693(java.lang.Boolean.FALSE) : util.h.xy.x.a.m27693(java.lang.Boolean.FALSE);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        int i2 = getHighSpeedVideoFpsRangesFor + 93;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 55) % 128;
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDuration ^ 2457411417541981002L))) ^ ((char) (Camera2StreamConfigurationMap ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> setDefault(final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", android.view.KeyEvent.keyCodeFromString("") + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ꒁ䋩꓅㝉죫⍤奀㣇獞࿂", 1 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.md$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.md.$r8$lambda$eg3BNH3Ryh7tQqI9nZsWSGSbXFA(util.h.xy.d.md.this, paymentType, abstractAsyncHandler, maVar);
            }
        }).start();
        int i = getInputFormats + 105;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return maVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26206(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        getHighSpeedVideoFpsRanges = (getInputFormats + 55) % 128;
        if (util.h.xy.v.c.m27646().m27647()) {
            try {
                util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                if (!highSpeedVideoFpsRangesFor.isSuccessful()) {
                    return highSpeedVideoFpsRangesFor;
                }
                int i = getInputFormats + 77;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26171 = m26925.mo26171(this.getOutputStallDuration.m26180(), paymentType);
                    if (mo26171.isSuccessful()) {
                        return mo26171;
                    }
                    int errorCode = mo26171.getErrorCode();
                    if (errorCode != 1010 && errorCode != 1009) {
                        return mo26171;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("꣔⯟ꢝ幒좶⌄異ᒼ缪曞\ue037䰩߬ཇ릵旜⸀휷儀鵘\uf68aﾸ櫒쫇鴇耴ʦ\ue262ꗳꢆ\uda61ᯨ䱮焏", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
                    return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), 1009);
                }
                m26925.mo26171(this.getOutputStallDuration.m26180(), paymentType).isSuccessful();
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Exception e) {
                return util.h.xy.x.a.m27692(e);
            }
        }
        int i2 = getInputFormats + 91;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return util.h.xy.x.a.m27683((java.lang.Object) null);
        }
        util.h.xy.x.a.m27683((java.lang.Object) null);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncToken<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> getCardDetails(final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> abstractAsyncHandler) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("⩅鳸⁵蓝ⅉ\udf2c龠", (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 418118867 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "펈\uebfc渘觏", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.md$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.md.m26204$r8$lambda$pvLw5PppG_W5NZ42lrYR9TuMjc(util.h.xy.d.md.this, abstractAsyncHandler, maVar);
            }
        }).start();
        getHighSpeedVideoFpsRanges = (getInputFormats + 17) % 128;
        return maVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209() {
        util.h.xy.an.ra raVar;
        util.h.xy.d.e eVar;
        getHighSpeedVideoFpsRanges = (getInputFormats + 5) % 128;
        if (!util.h.xy.ag.a.m24556().m24560()) {
            return util.h.xy.x.a.m27693((java.lang.Object) null);
        }
        try {
            try {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                if (highSpeedVideoFpsRangesFor.isSuccessful()) {
                    java.util.List<java.lang.String> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getOutputStallDuration.m26180());
                    if (this.getOutputStallDuration.m26179() == null || this.getOutputStallDuration.m26179().isEmpty()) {
                        eVar = new util.h.xy.d.e(this.getOutputStallDuration, Camera2StreamConfigurationMap2.get(0), Camera2StreamConfigurationMap2.get(1), Camera2StreamConfigurationMap2.get(2), Camera2StreamConfigurationMap2.get(3));
                        getHighSpeedVideoFpsRanges = (getInputFormats + 83) % 128;
                    } else {
                        java.util.List<java.lang.String> Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(this.getOutputStallDuration.m26179());
                        eVar = new util.h.xy.d.e(this.getOutputStallDuration, Camera2StreamConfigurationMap2.get(0), Camera2StreamConfigurationMap2.get(1), Camera2StreamConfigurationMap2.get(2), Camera2StreamConfigurationMap2.get(3), Camera2StreamConfigurationMap3.get(0), Camera2StreamConfigurationMap3.get(1), Camera2StreamConfigurationMap3.get(2), Camera2StreamConfigurationMap3.get(3));
                    }
                    raVar = new util.h.xy.an.ra(eVar, true, null);
                } else {
                    raVar = new util.h.xy.an.ra(highSpeedVideoFpsRangesFor.getErrorMessage(), highSpeedVideoFpsRangesFor.getErrorCode());
                }
                getHighSpeedVideoFpsRanges = (getInputFormats + 117) % 128;
                return raVar;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                int i = e.getmErrorCode();
                if (i != 1010 && i != 1009) {
                    return new util.h.xy.an.ra(null, false, e.getMessage(), e.getmErrorCode());
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("꣔⯟ꢝ幒좶⌄異ᒼ缪曞\ue037䰩߬ཇ릵旜⸀휷儀鵘\uf68aﾸ櫒쫇鴇耴ʦ\ue262ꗳꢆ\uda61ᯨ䱮焏", 1 - android.view.View.getDefaultSize(0, 0), objArr);
                return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), 1009);
            } catch (util.h.xy.d.g e2) {
                return new util.h.xy.an.ra(null, false, e2.getMessage(), com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED.getIntValue());
            }
        } catch (java.lang.Exception e3) {
            return util.h.xy.x.a.m27692(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r0.size() > 2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, util.h.xy.d.g {
        int i = getInputFormats + 47;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            java.util.List<java.lang.String> mo26159 = util.h.xy.k.ma.m26925().mo26159(str);
            if (mo26159 != null) {
                int i2 = getInputFormats + 97;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 != 0) {
                    if (mo26159.size() <= 4) {
                        return mo26159;
                    }
                }
                util.h.xy.u.mb.m27537(str, mo26159.get(0), mo26159.get(1), mo26159.get(2), mo26159.get(3));
            }
            return mo26159;
        }
        util.h.xy.k.ma.m26925().mo26159(str);
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final java.lang.String getTokenizedCardID() {
        getInputFormats = (getHighSpeedVideoFpsRanges + 99) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\uf51a鋨陧ਕ翤뚚啚挈", (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, "㧸믢閷Ν", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String str = this.getInputSizeshNQ4ISI;
        if (str == null || str.equals("") || this.getInputSizeshNQ4ISI.length() == 0) {
            return null;
        }
        java.lang.String str2 = this.getInputSizeshNQ4ISI;
        getInputFormats = (getHighSpeedVideoFpsRanges + 3) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncToken<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> getCardState(final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> abstractAsyncHandler) {
        int i = getInputFormats + 1;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 35;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 2;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("셈\ue9aa膖㪽긙繿\udb00", (char) android.text.TextUtils.indexOf("", "", 0), (-90804853) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "證陭\ufafa\ud925", "\u0000\u0000\u0000\u0000", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.md$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    util.h.xy.d.md.$r8$lambda$pnTAN5WKaoXJFwOWNg7wV9P4rDs(util.h.xy.d.md.this, abstractAsyncHandler, maVar);
                }
            }).start();
            return maVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m26210() {
        if (!util.h.xy.ag.a.m24556().m24560()) {
            return util.h.xy.x.a.m27693((java.lang.Object) null);
        }
        try {
            util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor.isSuccessful()) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo26148 = m26925.mo26148(this.getOutputStallDuration.m26180());
                if (!mo26148.isSuccessful()) {
                    int errorCode = mo26148.getErrorCode();
                    if (errorCode != 1010) {
                        int i = getInputFormats + 35;
                        getHighSpeedVideoFpsRanges = i % 128;
                        if (i % 2 == 0 ? errorCode != 1009 : errorCode != 26756) {
                            return new util.h.xy.an.ra(null, mo26148.isSuccessful(), mo26148.getErrorMessage(), mo26148.getErrorCode());
                        }
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("꣔⯟ꢝ幒좶⌄異ᒼ缪曞\ue037䰩߬ཇ릵旜⸀휷儀鵘\uf68aﾸ櫒쫇鴇耴ʦ\ue262ꗳꢆ\uda61ᯨ䱮焏", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr);
                    return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), 1009);
                }
                getHighSpeedVideoFpsRanges = (getInputFormats + 109) % 128;
                util.h.xy.d.b result = mo26148.getResult();
                if (result == null) {
                    return null;
                }
                if (this.getOutputStallDuration.m26179() != null && !this.getOutputStallDuration.m26179().isEmpty()) {
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo261482 = m26925.mo26148(this.getOutputStallDuration.m26179());
                    if (mo261482.isSuccessful()) {
                        return util.h.xy.x.a.m27696(new util.h.xy.d.rf(result, mo261482.getResult(), this.getOutputStallDuration));
                    }
                    return new util.h.xy.an.ra(null, mo261482.isSuccessful(), mo261482.getErrorMessage(), mo261482.getErrorCode());
                }
                return util.h.xy.x.a.m27696(new util.h.xy.d.rf(result, null, this.getOutputStallDuration));
            }
            return new util.h.xy.an.ra(null, highSpeedVideoFpsRangesFor.isSuccessful(), highSpeedVideoFpsRangesFor.getErrorMessage(), highSpeedVideoFpsRangesFor.getErrorCode());
        } catch (java.lang.Exception e) {
            return util.h.xy.x.a.m27692(e);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> setAdditionalPaymentData(final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler, final java.lang.String str, final byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("꧂㈬ꦆ䞌쌩⣁飽龜縏缓\uebd7", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.md$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.md.m26203$r8$lambda$eKShu1UyXc7TFTTFU6AMDZdt0Y(util.h.xy.d.md.this, paymentType, str, bArr, abstractAsyncHandler, maVar);
            }
        }).start();
        getInputFormats = (getHighSpeedVideoFpsRanges + 43) % 128;
        return maVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26207(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, java.lang.String str, byte[] bArr) {
        int i = getInputFormats + 39;
        getHighSpeedVideoFpsRanges = i % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult = null;
        if (i % 2 == 0) {
            if (!util.h.xy.v.c.m27646().m27647()) {
                return util.h.xy.x.a.m27683((java.lang.Object) null);
            }
            try {
                util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                if (!highSpeedVideoFpsRangesFor.isSuccessful()) {
                    return highSpeedVideoFpsRangesFor;
                }
                try {
                    asyncResult = m26925.mo26164(this.getOutputStallDuration.m26180(), paymentType, str, bArr);
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    int i2 = e.getmErrorCode();
                    if (i2 == 1010 || i2 == 1009) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("꣔⯟ꢝ幒좶⌄異ᒼ缪曞\ue037䰩߬ཇ릵旜⸀휷儀鵘\uf68aﾸ櫒쫇鴇耴ʦ\ue262ꗳꢆ\uda61ᯨ䱮焏", 1 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                        asyncResult = new util.h.xy.an.ra<>(((java.lang.String) objArr[0]).intern(), 1009);
                    }
                }
                getHighSpeedVideoFpsRanges = (getInputFormats + 71) % 128;
                return asyncResult;
            } catch (java.lang.Exception e2) {
                return util.h.xy.x.a.m27692(e2);
            }
        }
        util.h.xy.v.c.m27646().m27647();
        throw null;
    }

    private static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> Camera2StreamConfigurationMap(java.lang.String str, byte[] bArr) {
        if (str != null) {
            int i = getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                if (!str.trim().isEmpty() && !util.h.xy.ar.b.m25070(bArr)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("吜㥝听䲏⋦줐諸鬢", 1 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
                    if (((java.lang.String) objArr[0]).intern().equalsIgnoreCase(str)) {
                        if (bArr.length > 16) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\uf02b彭\uf06a⫾㯾큈୲檷⟎ቡ፻㈳彚篹䫸ᮓ盟ꎘꉇ\ue359깾謌駌듎엳\uf4d2\uf184鱶ﴎ\udc23⥦旰ᒗֵ§䵣䰯洎砂ᔒ措囋꾎ﺂ鬷븖蜔옶덛\ue7fdﻧ꾺\uead5켾혯睫Ƀ㣽ඊ墆㦵惆敄⁚八䠟峁", 1 - android.graphics.Color.blue(0), objArr2);
                            return new util.h.xy.an.ra(((java.lang.String) objArr2[0]).intern());
                        }
                    } else {
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\u009c抿¬\u176d䌖꣠꩘쯃", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 1, objArr3);
                            if (((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(str)) {
                                if (bArr.length > 2) {
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("ᑂᇵᐋ摅ℿ쪪\u0e75澉쎋峈ধ㜄묃㕀倵ỹ銯\ued31뢟\ue67c䨻억茟뇾↻먾\ueb61饟᥄銟㏶惝\uf0c9䬆ᩱ䡜ꡣ⎖拡ဉ蟝ᡎ딸ﮂ罟\uf08e鷻쌲坦ꤠ\ue440ꪺຫ臲척爿", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
                                    return new util.h.xy.an.ra(((java.lang.String) objArr4[0]).intern());
                                }
                            } else {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("\uee8d拃\ueec4ᝎ亅ꔵ뤁\ud8c9㥭⿅昃耔䇅䙙㾟ꦨ栉鸢휰儾낝뚥\uecb3ڼ\udb50줨蓞⸊\ue3a2\ue1c8屋힑ਠ㠙痊２劙傠ർꝸ紕步\udae8䳺薆莹", 1 - android.text.TextUtils.getOffsetBefore("", 0), objArr5);
                                util.h.xy.an.ra raVar = new util.h.xy.an.ra(((java.lang.String) objArr5[0]).intern());
                                int i2 = getHighSpeedVideoFpsRanges + 9;
                                getInputFormats = i2 % 128;
                                if (i2 % 2 != 0) {
                                    return raVar;
                                }
                                throw new java.lang.ArithmeticException();
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    return null;
                }
            } else {
                throw null;
            }
        }
        return new util.h.xy.an.ra(util.h.xy.i.b.f2234);
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncToken<java.lang.Void> clearAdditionalPaymentDataSet(final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<java.lang.Void> abstractAsyncHandler) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ᗱ緢ᖵࡂ⬈삇\ued14貓숾ヌ΅푥몺", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.md$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.md.$r8$lambda$GcY1Gae_ywUttThUIrGKHJhgII4(util.h.xy.d.md.this, paymentType, abstractAsyncHandler, maVar);
            }
        }).start();
        getInputFormats = (getHighSpeedVideoFpsRanges + 95) % 128;
        return maVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26208(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        if (!util.h.xy.v.c.m27646().m27647()) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27683 = util.h.xy.x.a.m27683((java.lang.Object) null);
            getInputFormats = (getHighSpeedVideoFpsRanges + 31) % 128;
            return m27683;
        }
        try {
            util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor.isSuccessful()) {
                getInputFormats = (getHighSpeedVideoFpsRanges + 73) % 128;
                try {
                    return m26925.mo26156(this.getOutputStallDuration.m26180(), paymentType);
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    int i = e.getmErrorCode();
                    if (i != 1010 && i != 1009) {
                        return null;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("꣔⯟ꢝ幒좶⌄異ᒼ缪曞\ue037䰩߬ཇ릵旜⸀휷儀鵘\uf68aﾸ櫒쫇鴇耴ʦ\ue262ꗳꢆ\uda61ᯨ䱮焏", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                    return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), 1009);
                }
            }
            getInputFormats = (getHighSpeedVideoFpsRanges + 51) % 128;
            return highSpeedVideoFpsRangesFor;
        } catch (java.lang.Exception e2) {
            return util.h.xy.x.a.m27692(e2);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncToken<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> getAdditionalPaymentDataSet(final com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, final com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> abstractAsyncHandler) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("今浉了\u18fa睸鳷읰Ꚋ", 1 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("뛿༃ⶑ燭앟\uf7f4䈔됟\ud9aa", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 96389264 + android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "轿뻈쌅⣭", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        final util.h.xy.an.ma maVar = new util.h.xy.an.ma();
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.d.md$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                util.h.xy.d.md.$r8$lambda$5MBj91EoqCNLfexPRVEufuN4ST8(util.h.xy.d.md.this, paymentType, abstractAsyncHandler, maVar);
            }
        }).start();
        getHighSpeedVideoFpsRanges = (getInputFormats + 43) % 128;
        return maVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> m26205(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        if (!util.h.xy.ag.a.m24556().m24560()) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> m27693 = util.h.xy.x.a.m27693((java.lang.Object) null);
            int i = getInputFormats + 27;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                return m27693;
            }
            throw new java.lang.ArithmeticException();
        }
        try {
            util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor.isSuccessful()) {
                try {
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData> mo26163 = m26925.mo26163(this.getOutputStallDuration.m26180(), paymentType);
                    getHighSpeedVideoFpsRanges = (getInputFormats + 65) % 128;
                    return mo26163;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    int i2 = e.getmErrorCode();
                    if (i2 != 1010 && i2 != 1009) {
                        return null;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("꣔⯟ꢝ幒좶⌄異ᒼ缪曞\ue037䰩߬ཇ릵旜⸀휷儀鵘\uf68aﾸ櫒쫇鴇耴ʦ\ue262ꗳꢆ\uda61ᯨ䱮焏", 1 - android.view.View.MeasureSpec.getMode(0), objArr);
                    return new util.h.xy.an.ra(((java.lang.String) objArr[0]).intern(), 1009);
                }
            }
            return new util.h.xy.an.ra(null, highSpeedVideoFpsRangesFor.isSuccessful(), highSpeedVideoFpsRangesFor.getErrorMessage(), highSpeedVideoFpsRangesFor.getErrorCode());
        } catch (java.lang.Exception e2) {
            return util.h.xy.x.a.m27692(e2);
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI() {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> waitToComplete = getCardDetails(null).waitToComplete();
        if (!waitToComplete.isSuccessful()) {
            getInputFormats = (getHighSpeedVideoFpsRanges + 45) % 128;
            return false;
        }
        java.lang.String scheme = waitToComplete.getResult().getScheme();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("颠ǖᅲ蟻", (char) (14852 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22, "䟯ᖊվ턺", "\u0000\u0000\u0000\u0000", objArr);
            boolean equalsIgnoreCase = scheme.equalsIgnoreCase(((java.lang.String) objArr[0]).intern());
            int i = getInputFormats + 47;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                return equalsIgnoreCase;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final boolean isMultiAids() {
        int i = getHighSpeedVideoFpsRanges + 13;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            if (util.h.xy.ag.a.m24556().m24560()) {
                if (getHighResolutionOutputSizeshNQ4ISI()) {
                    try {
                        java.util.List<util.h.xy.d.a> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                        int i2 = getInputFormats + 71;
                        getHighSpeedVideoFpsRanges = i2 % 128;
                        if (i2 % 2 != 0) {
                            highSpeedVideoFpsRanges.isEmpty();
                            throw null;
                        }
                        if (highSpeedVideoFpsRanges.isEmpty() || highSpeedVideoFpsRanges.size() <= 1) {
                            return false;
                        }
                        getInputFormats = (getHighSpeedVideoFpsRanges + 95) % 128;
                        return true;
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                        return false;
                    }
                }
                int i3 = getInputFormats + 85;
                getHighSpeedVideoFpsRanges = i3 % 128;
                return i3 % 2 != 0;
            }
            int i4 = getInputFormats + 37;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        util.h.xy.ag.a.m24556().m24560();
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final boolean hasAuxiliaryScheme() {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> m26950 = util.h.xy.k.ra.f2243.m26950(this.getInputSizeshNQ4ISI);
        if (!util.h.xy.u.d.m27514(m26950)) {
            return false;
        }
        int i = getHighSpeedVideoFpsRanges + 59;
        getInputFormats = i % 128;
        int i2 = i % 2;
        util.h.xy.d.d result = m26950.getResult();
        if (i2 == 0) {
            result.m26179();
            throw null;
        }
        if (result.m26179() == null) {
            return false;
        }
        getInputFormats = (getHighSpeedVideoFpsRanges + 105) % 128;
        return true;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final java.util.List<com.gemalto.mfs.mwsdk.dcm.Aid> getAllAids() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (!util.h.xy.ag.a.m24556().m24560()) {
            return new java.util.ArrayList();
        }
        if (!getHighResolutionOutputSizeshNQ4ISI()) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("⌟ꜙ⍐튔ᣙ\uf373⻛伋\uf4b3\uea20とួ豆菂槄㹩ꖛ寭腬웦絟獥뫷酶ᛆೢ틐", 1 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return new java.util.ArrayList(getHighSpeedVideoFpsRanges());
    }

    private java.util.List<util.h.xy.d.a> getHighSpeedVideoFpsRanges() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getHighSpeedVideoFpsRanges + 41) % 128;
        try {
            util.h.xy.s.c m27371 = util.h.xy.s.rb.m27289(this.getOutputStallDuration.m26180()).getResult().m27371();
            if (m27371 == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("튗䃇Г갾\u0efd场ࢤ⬜㴛嬝袞\ua87d\u2d78\uab08\ue590נ뇹\ue40c븞\ud832\u1af1خ᠍㜷\uf018孱줙픕㼂覙燱\ue93a迚\ue275挟⡎㛒哠", (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "b퍰ꥶ쏅", "\u0000\u0000\u0000\u0000", objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(2021, ((java.lang.String) objArr[0]).intern());
            }
            java.util.List<util.h.xy.d.a> m27107 = m27371.m27107();
            java.util.Collections.sort(m27107, new util.h.xy.d.a.b());
            int i = getHighSpeedVideoFpsRanges + 105;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                return m27107;
            }
            throw null;
        } catch (org.json.JSONException e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator.FALLBACK_YEAR, e.getMessage());
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.DigitalizedCard
    public final void updateAidList(java.util.List<com.gemalto.mfs.mwsdk.dcm.Aid> list) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (util.h.xy.v.c.m27646().m27647()) {
            if (list == null || list.size() == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("졿ᅠ뵯房렯郀䧓럱ﻗ旽䙙帥\uef11\uf1ef\uf101婯盞칔粔ग핼\u2439\ud9d1ד穬", (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-2070430404) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "㳠鞽Ⲅఄ", "\u0000\u0000\u0000\u0000", objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            if (!getHighResolutionOutputSizeshNQ4ISI()) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("⌟ꜙ⍐튔ᣙ\uf373⻛伋\uf4b3\uea20とួ豆菂槄㹩ꖛ寭腬웦絟獥뫷酶ᛆೢ틐", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2[0]).intern());
            }
            if (hasAuxiliaryScheme()) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ᕷ䳱ᔱ㥷錊碭쯡\uaa3c슎Ǭ뮚\uf2f4먁桥\ue207\udb00鎠뀃ષ⏜䬨颐ㄯ瑝₯", 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr3);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(1019, ((java.lang.String) objArr3[0]).intern());
            }
            try {
                util.h.xy.s.c m27371 = util.h.xy.s.rb.m27289(this.getOutputStallDuration.m26180()).getResult().m27371();
                if (m27371 == null) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("튗䃇Г갾\u0efd场ࢤ⬜㴛嬝袞\ua87d\u2d78\uab08\ue590נ뇹\ue40c븞\ud832\u1af1خ᠍㜷\uf018孱줙픕㼂覙燱\ue93a迚\ue275挟⡎㛒哠", (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.KeyEvent.normalizeMetaState(0), "b퍰ꥶ쏅", "\u0000\u0000\u0000\u0000", objArr4);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(2021, ((java.lang.String) objArr4[0]).intern());
                }
                byte[] m27097 = m27371.m27097();
                byte[] m26193 = util.h.xy.d.mb.m26193(m27097);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i = 0;
                while (i < list.size()) {
                    int i2 = i + 1;
                    arrayList.add(new util.h.xy.d.a(list.get(i).getAid(), list.get(i).getLabel(), i2, list.get(i).getLockStatus()));
                    i = i2;
                }
                java.util.List<byte[]> m26183 = util.h.xy.d.mb.m26183(m27097);
                if (m26183.size() == 0) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("렵\uec57롰駆턓㪧硄ᦂ濋ꄂ崙䄡\u177d죿ꀼ梥㻗႓䢄逩\ue668㠭猢쟮跬䞻ᬅ\uef4c딜漒쏍ᛔ岕뚏\uea4f㹀ѵ\ude60鋠昪⮪\ue5b4䔵趴퍣൫涷땅ﭐ哀ᐝ\udc85ꋌ籇㲐Љ䩀诇\ue72b⮡燩펹辤卥ᥭﬡ똩竼샛", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr5);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(2022, ((java.lang.String) objArr5[0]).intern());
                }
                byte[] m26186 = util.h.xy.d.mb.m26186(arrayList, m26183);
                util.h.xy.ar.b.m25106(m26186);
                util.h.xy.d.mb.m26185(m26193, m26186);
                util.h.xy.ar.b.m25106(m26193);
                util.h.xy.d.mb.m26192(m27097, m26193);
                java.lang.String m25106 = util.h.xy.ar.b.m25106(m27097);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(util.h.xy.k.b.m26921(this.getOutputStallDuration.m26180(), util.h.xy.d.ma.f1142));
                    jSONObject.put(util.h.xy.s.ma.f2342, m25106);
                    jSONObject.put(util.h.xy.s.ma.f2346, util.h.xy.ar.b.m25106(util.h.xy.d.mb.m26190(arrayList)));
                    util.h.xy.t.mb.f2417.m27470(this.getOutputStallDuration.m26180().getBytes(util.h.xy.h.a.f2221), jSONObject.toString().getBytes(util.h.xy.h.a.f2221));
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Boolean> m26211 = m26211(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                    if (m26211.isSuccessful() && m26211.getResult().booleanValue()) {
                        util.h.xy.k.ma.m26925().mo26154(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                        m26206(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                    }
                } catch (org.json.JSONException e) {
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("汻ㄟ\udd0aȄ\u1a8c欏ꡞ緓艄ｇ杴⺃澿羹갦赼魤鿑ꣻ䩓\ue422㝁땧\uef37㙶⸫蹞戀㬖⇅풿콖\ue9fb딃䤽", (char) android.text.TextUtils.getOffsetAfter("", 0), 619824414 + (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "ẻ\uf1c5襤鴫", "\u0000\u0000\u0000\u0000", objArr6);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr6[0]).intern(), e);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            } catch (org.json.JSONException e2) {
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator.FALLBACK_YEAR, e2.getMessage());
            }
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizes = -3822921266722075189L;
        getHighSpeedVideoSizesFor = 2457411417541981002L;
        getOutputMinFrameDuration = 294925130;
        Camera2StreamConfigurationMap = (char) 3220;
    }

    public static /* synthetic */ void $r8$lambda$AVaz5Kk6TMtmY8AYxaAfnfFzJKk(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getHighSpeedVideoFpsRanges + 71;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26211(paymentType));
        } else {
            util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26211(paymentType));
            throw null;
        }
    }

    public static /* synthetic */ void $r8$lambda$eg3BNH3Ryh7tQqI9nZsWSGSbXFA(util.h.xy.d.md mdVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler abstractAsyncHandler, util.h.xy.an.ma maVar) {
        int i = getHighSpeedVideoFpsRanges + 59;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26206(paymentType));
            int i2 = getInputFormats + 73;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        util.h.xy.x.mb.m27699(abstractAsyncHandler, maVar, mdVar.m26206(paymentType));
        throw new java.lang.ArithmeticException();
    }
}
