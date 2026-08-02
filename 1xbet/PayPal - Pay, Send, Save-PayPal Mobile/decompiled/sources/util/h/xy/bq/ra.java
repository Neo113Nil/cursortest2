package util.h.xy.bq;

/* loaded from: classes18.dex */
public class ra {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static final java.lang.String getHighSpeedVideoSizes = "util.h.xy.bq.ra";
    private util.h.xy.aa.mc getHighResolutionOutputSizeshNQ4ISI = null;
    util.h.xy.bw.mb Camera2StreamConfigurationMap = new util.h.xy.bw.ma();

    static /* synthetic */ util.h.xy.aa.mc Camera2StreamConfigurationMap(util.h.xy.bq.ra raVar) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 57) << 1) - (i ^ 57);
        getHighSpeedVideoFpsRanges = i2 % 128;
        util.h.xy.aa.mc mcVar = raVar.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 % 2 == 0) {
            return mcVar;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 93) + ((i & 93) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (i + 121) % 128;
        return str;
    }

    static {
        int i = getHighSpeedVideoFpsRanges + 1;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier m25571(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 43) % 128;
        getHighSpeedVideoFpsRanges = ((i ^ 93) + ((i & 93) << 1)) % 128;
        util.h.xy.aa.mc mcVar = null;
        if (com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS != cHVerificationMethod) {
            int i2 = getHighSpeedVideoFpsRanges + 61;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod2 = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD;
                throw new java.lang.ArithmeticException();
            }
            if (com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD != cHVerificationMethod) {
                int i3 = getHighSpeedVideoFpsRanges;
                int i4 = ((i3 | 35) << 1) - (i3 ^ 35);
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 49) % 128;
                return mcVar;
            }
        }
        util.h.xy.aa.c cVar = new util.h.xy.aa.c() { // from class: util.h.xy.bq.ra.4
            private static int Camera2StreamConfigurationMap = 1;
            private static char getHighSpeedVideoFpsRanges = 32616;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static long getHighSpeedVideoSizesFor = 2457411417541981002L;
            private static int getInputFormats = 0;
            private static int getInputSizeshNQ4ISI = 294925130;

            @Override // util.h.xy.aa.c
            /* renamed from: ˏ */
            public final void mo24518(boolean z, long j) {
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 25) % 128;
                util.h.xy.bq.ra.getHighSpeedVideoFpsRanges();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("鷿ග戃漝", (char) (7035 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 16777216 + android.graphics.Color.rgb(0, 0, 0), "篡剼簨樛", "\u0000\u0000\u0000\u0000", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0be2ޱꕞ㱝ዟ삑ꉮ\ueffc뮃楡\ue9f0", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (-846659601) - android.view.KeyEvent.getDeadChar(0, 0), "\uef09裿\u0fcd銭", "\u0000\u0000\u0000\u0000", objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523().onVerifySuccess();
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 7) % 128;
            }

            @Override // util.h.xy.aa.c
            /* renamed from: ˋ */
            public final void mo24517() {
                getHighSpeedVideoFpsRangesFor = (getInputFormats + 101) % 128;
                util.h.xy.bq.ra.getHighSpeedVideoFpsRanges();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("鷿ග戃漝", (char) (7036 - android.text.TextUtils.indexOf("", "", 0)), android.view.View.MeasureSpec.getMode(0), "篡剼簨樛", "\u0000\u0000\u0000\u0000", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("瞟♍硝낒풩䬄ူ䆆\udc19㥦ἶ", (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 1389710898, "캩⪱䆭圂", "\u0000\u0000\u0000\u0000", objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523().onVerifyFailed();
                getHighSpeedVideoFpsRangesFor = (getInputFormats + 49) % 128;
            }

            private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i5, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
                char[] charArray = str3.toCharArray();
                char[] charArray2 = str2.toCharArray();
                int i6 = (Camera2StreamConfigurationMap + 13) % 128;
                getHighSpeedVideoSizes = i6;
                char[] cArr = charArray2;
                Camera2StreamConfigurationMap = (i6 + 25) % 128;
                char[] charArray3 = str.toCharArray();
                util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int length2 = charArray.length;
                char[] cArr3 = new char[length2];
                java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
                java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
                cArr2[0] = (char) (cArr2[0] ^ c);
                cArr3[2] = (char) (cArr3[2] + ((char) i5));
                int length3 = charArray3.length;
                char[] cArr4 = new char[length3];
                rcVar.f2652 = 0;
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 19) % 128;
                while (rcVar.f2652 < length3) {
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 91) % 128;
                    int i7 = (rcVar.f2652 + 2) % 4;
                    int i8 = (rcVar.f2652 + 3) % 4;
                    rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i7]) % 65535);
                    cArr3[i8] = (char) (((cArr2[i8] * 32718) + cArr3[i7]) / 65535);
                    cArr2[i8] = rcVar.f2653;
                    cArr4[rcVar.f2652] = (char) ((((cArr2[i8] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRanges ^ 2457411417541981002L)));
                    rcVar.f2652++;
                }
                objArr[0] = new java.lang.String(cArr4);
            }
        };
        if (com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS == cHVerificationMethod) {
            int i5 = getHighSpeedVideoFpsRangesFor + 73;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(cHVerificationMethod, cVar);
                throw null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(cHVerificationMethod, cVar);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.aa.rc) this.Camera2StreamConfigurationMap.mo25784(cHVerificationMethod, cVar);
        }
        mcVar = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 49) % 128;
        return mcVar;
    }

    private util.h.xy.aa.mc getHighSpeedVideoFpsRangesFor(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod, util.h.xy.aa.c cVar) {
        util.h.xy.aa.a aVar = (util.h.xy.aa.a) this.Camera2StreamConfigurationMap.mo25784(cHVerificationMethod, new util.h.xy.aa.mb.ra() { // from class: util.h.xy.bq.ra.1
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizes = 1;
            private static int getHighSpeedVideoSizesFor = 1;
            private static int getOutputFormats;
            private static char[] getHighSpeedVideoFpsRanges = {40013, 40863, 39892, 38696, 37915, 38864, 37776, 40731, 39715, 34586, 33501, 36529, 35329, 46627, 45586, 48595, 47538, 60986, 60913, 59825, 58682, 57602, 64827, 63740, 62608, 61472, 52226, 51251, 51186, 50078, 40005, 40846, 39886, 38725, 37757, 36676, 35459, 34543, 33375, 48765, 47692, 46477, 45562, 61359, 60516, 59428, 58543, 57495, 64686, 63849, 62725, 61877, 52631, 51622, 50791, 49669};
            private static long getHighResolutionOutputSizeshNQ4ISI = 2007809608335663055L;

            private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighResolutionOutputSizeshNQ4ISI))) ^ c;
                    rbVar.f2651++;
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 37) % 128;
                }
                char[] cArr = new char[i];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i) {
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    rbVar.f2651++;
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 9) % 128;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ˊ */
            public final void mo24519(int i, java.lang.CharSequence charSequence) {
                util.h.xy.bq.ra.getHighSpeedVideoFpsRanges();
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523();
                util.h.xy.v.mc mcVar = new util.h.xy.v.mc(java.lang.Integer.valueOf(i), charSequence.toString());
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, android.view.View.combineMeasuredStates(0, 0), (char) android.graphics.Color.green(0), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int mode = android.view.View.MeasureSpec.getMode(0);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(mode + 13, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2142), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523().onVerifyError(mcVar);
                int i2 = getHighSpeedVideoSizesFor + 83;
                getOutputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ˎ */
            public final void mo24521(int i, java.lang.CharSequence charSequence) {
                getOutputFormats = (getHighSpeedVideoSizesFor + 57) % 128;
                util.h.xy.bq.ra.getHighSpeedVideoFpsRanges();
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523();
                float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(4 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, (char) android.view.View.MeasureSpec.getSize(0), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(indexOf + 14, android.view.MotionEvent.axisFromString("") + 18, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 29311), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523().onVerifyHelp(i, charSequence);
                int i2 = getHighSpeedVideoSizesFor + 73;
                getOutputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ᐝ */
            public final void mo24522(boolean z, long j) {
                getHighSpeedVideoSizesFor = (getOutputFormats + 93) % 128;
                util.h.xy.bq.ra.getHighSpeedVideoFpsRanges();
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, android.text.TextUtils.getTrimmedLength(""), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((fadingEdgeLength >> 16) + 13, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 30, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523().onVerifySuccess();
                getHighSpeedVideoSizesFor = (getOutputFormats + 83) % 128;
            }

            @Override // util.h.xy.aa.mb.ra
            /* renamed from: ˋ */
            public final void mo24520() {
                getOutputFormats = (getHighSpeedVideoSizesFor + 15) % 128;
                util.h.xy.bq.ra.getHighSpeedVideoFpsRanges();
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523();
                float minVolume = android.media.AudioTrack.getMinVolume();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(4 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int mode = android.view.View.MeasureSpec.getMode(0);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(mode + 13, 42 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 29674), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.bq.ra.Camera2StreamConfigurationMap(util.h.xy.bq.ra.this).m24523().onVerifyFailed();
                getHighSpeedVideoSizesFor = (getOutputFormats + 53) % 128;
            }
        }, cVar);
        int i = getHighSpeedVideoFpsRanges + 57;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return aVar;
        }
        throw null;
    }
}
