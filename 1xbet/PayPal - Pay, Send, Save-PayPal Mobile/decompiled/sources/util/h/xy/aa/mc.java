package util.h.xy.aa;

/* loaded from: classes18.dex */
public abstract class mc implements com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static char getOutputStallDurationlomOqCM;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected util.h.xy.aa.c f67;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected android.app.Activity f68;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected java.lang.Class f69;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener f70 = null;

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = (getInputSizeshNQ4ISI + 105) % 128;
        getHighSpeedVideoSizesFor = i;
        java.lang.String str = getOutputMinFrameDuration;
        int i2 = i + 3;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap();
        getOutputMinFrameDuration = "mc";
        int i = getHighSpeedVideoSizesFor + 85;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    protected mc(util.h.xy.aa.c cVar) {
        this.f67 = cVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener m24523() {
        int i = getInputSizeshNQ4ISI;
        getHighSpeedVideoSizesFor = (i + 13) % 128;
        com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener deviceCVMVerifyListener = this.f70;
        getHighSpeedVideoSizesFor = (i + 7) % 128;
        return deviceCVMVerifyListener;
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void setDeviceCVMVerifyListener(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener deviceCVMVerifyListener) {
        int pressedStateDuration;
        int red;
        int i;
        int i2 = getHighSpeedVideoSizesFor + 119;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            pressedStateDuration = 4 >> (android.view.ViewConfiguration.getPressedStateDuration() % 74);
            red = android.graphics.Color.red(1) + 5;
            i = 24064;
        } else {
            pressedStateDuration = 4 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            red = 2 - android.graphics.Color.red(0);
            i = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
        }
        int i3 = pressedStateDuration;
        int i4 = red;
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 35) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\ufffe\u0005\ufffb", i3, i4, i - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ꯀ\uee47鿱뒽䔡㉨ࣃ♺룰\uee55鑣딜₁▒", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 13, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            this.f70 = deviceCVMVerifyListener;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void setKeyguardActivity(android.app.Activity activity) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 121) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\ufffe\u0005\ufffb", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, android.text.TextUtils.indexOf("", "", 0, 0) + 2, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 269, true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ꯀ\uee47鿱뒽䔡㉨\ue608״記惥", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 9, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (activity == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("蹆芋ᅥ\uea69\uee45\udab2沁⿆\uf19e鹸\udc77✶\u0098皁銅뤌忤僼쒀\ue577㴓ｼ쯋\ue57f횫쁛熻⌭ᠩປ껞猍ᬦ䅇剬쑌", 36 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        this.f68 = activity;
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 35) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void setKeyguardActivity(android.app.Activity activity, java.lang.Class cls) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0002\ufffe\u0005\ufffb", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - ',', android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 269, true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0010￨\r\u0005\ufffb￬\ufffe�\u0010\u0007", 10 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 6, android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, false, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (activity == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("蹆芋ᅥ\uea69\uee45\udab2沁⿆\uf19e鹸\udc77✶\u0098皁銅뤌忤僼쒀\ue577㴓ｼ쯋\ue57f횫쁛熻⌭ᠩປ껞猍ᬦ䅇剬쑌", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (cls != null) {
            if (cls.getSuperclass().getName().equalsIgnoreCase(com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMKeyguardActivity.class.getName())) {
                this.f68 = activity;
                this.f69 = cls;
                return;
            }
            return;
        }
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("蹆芋ᅥ\uea69\uee45\udab2沁⿆\u0098皁銅뤌忤僼쒀\ue577⸙獴碜쉒Წ剆싗삺幡ᰒ\udc77✶귓酂염㖷꿇윾뼞ꁣ", 36 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifier
    public void confirmCredential(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        android.content.Intent intent;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\ufffe\u0005\ufffb", 4 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), android.widget.ExpandableListView.getPackedPositionChild(0L) + 3, android.view.View.MeasureSpec.getMode(0) + 269, true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("��￨\u0010\u0007\u0010�\ufffe", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, 8 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 261 - android.text.TextUtils.indexOf("", "", 0, 0), true, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 85) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{0, 16, 0, 8}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000", objArr3);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(true, new int[]{16, 12, 26, 10}, null, objArr4);
                java.lang.String str = (java.lang.String) cls.getField((java.lang.String) objArr4[0]).get(null);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u1759祮ገﻤㆿ᷐㵅\uebcc", android.graphics.Color.argb(0, 0, 0, 0) + 7, objArr5);
                if (!str.equalsIgnoreCase(((java.lang.String) objArr5[0]).intern())) {
                    return;
                }
            }
            util.h.xy.aa.ma maVar = util.h.xy.aa.ma.getHighResolutionOutputSizeshNQ4ISI;
            synchronized (maVar.Camera2StreamConfigurationMap) {
                for (util.h.xy.aa.ma.C0254ma c0254ma : maVar.Camera2StreamConfigurationMap.values()) {
                    synchronized (c0254ma.getHighSpeedVideoFpsRanges) {
                        java.util.Iterator<androidx.view.Observer<? super util.h.xy.aa.ma.b>> it = c0254ma.getHighSpeedVideoFpsRanges.iterator();
                        while (it.hasNext()) {
                            c0254ma.removeObserver(it.next());
                        }
                    }
                }
                maVar.Camera2StreamConfigurationMap.clear();
            }
            final int highSpeedVideoFpsRangesFor = maVar.getHighSpeedVideoFpsRangesFor();
            maVar.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor).observeForever(new androidx.view.Observer<util.h.xy.aa.ma.b>() { // from class: util.h.xy.aa.mc.4
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoFpsRangesFor;

                @Override // androidx.view.Observer
                public final /* synthetic */ void onChanged(util.h.xy.aa.ma.b bVar) {
                    int i = getHighSpeedVideoFpsRanges + 67;
                    int i2 = i % 128;
                    getHighSpeedVideoFpsRangesFor = i2;
                    util.h.xy.aa.ma.b bVar2 = bVar;
                    int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
                    getHighSpeedVideoFpsRanges = i3 % 128;
                    if (i3 % 2 == 0) {
                        util.h.xy.aa.mc.getHighSpeedVideoFpsRangesFor();
                        throw null;
                    }
                    util.h.xy.aa.mc.getHighSpeedVideoFpsRangesFor();
                    if (bVar2 != null) {
                        int i4 = util.h.xy.aa.mc.AnonymousClass3.getHighSpeedVideoSizes[bVar2.ordinal()];
                        if (i4 == 1) {
                            util.h.xy.aa.mc.getHighSpeedVideoFpsRangesFor();
                            if (util.h.xy.aa.mc.this.f67 != null) {
                                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 63) % 128;
                                util.h.xy.aa.mc.this.f67.mo24518(false, -1L);
                                int i5 = getHighSpeedVideoFpsRanges;
                                getHighSpeedVideoFpsRangesFor = (((i5 | 113) << 1) - (i5 ^ 113)) % 128;
                            } else {
                                util.h.xy.aa.mc.getHighSpeedVideoFpsRangesFor();
                            }
                        } else if (i4 == 2) {
                            util.h.xy.aa.mc.getHighSpeedVideoFpsRangesFor();
                            if (util.h.xy.aa.mc.this.f67 != null) {
                                int i6 = getHighSpeedVideoFpsRangesFor;
                                getHighSpeedVideoFpsRanges = (((i6 | 125) << 1) - (i6 ^ 125)) % 128;
                                util.h.xy.aa.mc.this.f67.mo24517();
                                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 79) % 128;
                            } else {
                                util.h.xy.aa.mc.getHighSpeedVideoFpsRangesFor();
                                int i7 = getHighSpeedVideoFpsRanges;
                                getHighSpeedVideoFpsRangesFor = ((i7 & 31) + (i7 | 31)) % 128;
                            }
                        }
                    }
                    int i8 = getHighSpeedVideoFpsRanges;
                    int i9 = (i8 ^ 25) + ((i8 & 25) << 1);
                    getHighSpeedVideoFpsRangesFor = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    if (i % 2 != 0) {
                        throw null;
                    }
                    getHighSpeedVideoFpsRangesFor = (i8 + 1) % 128;
                }
            });
            if (this.f69 != null) {
                intent = new android.content.Intent(this.f68, (java.lang.Class<?>) this.f69);
            } else {
                intent = new android.content.Intent(this.f68, (java.lang.Class<?>) com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMKeyguardActivity.class);
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 43) % 128;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㺣忾텡齠ꚙ꼞\uea23ⴁ샬᭼쉧ꗞ", android.graphics.Color.rgb(0, 0, 0) + 16777227, objArr6);
            intent.putExtra(((java.lang.String) objArr6[0]).intern(), charSequence);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㺣忾텡齠ꚙ꼞鼷⾅햎መ묩뷁瀹\ua7d4豩릅ര뮏", 16 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr7);
            intent.putExtra(((java.lang.String) objArr7[0]).intern(), charSequence2);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0006\u0004\ufff3\u0011\ufffb\ufff6\ufff7\n", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 8, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6, 269 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), false, objArr8);
            intent.putExtra(((java.lang.String) objArr8[0]).intern(), highSpeedVideoFpsRangesFor);
            this.f68.startActivity(intent);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: util.h.xy.aa.mc$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.aa.ma.b.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[util.h.xy.aa.ma.b.Camera2StreamConfigurationMap.ordinal()] = 1;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 1) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[util.h.xy.aa.ma.b.getHighSpeedVideoFpsRangesFor.ordinal()] = 2;
                int i = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i ^ 15) + ((i & 15) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 79) % 128;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 69;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 61) % 128;
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getOutputStallDurationlomOqCM ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoSizes + 87;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 75) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-4839292868003314026L))));
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
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 37) % 128;
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getInputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bArr2[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        getInputFormats = new char[]{42346, 42284, 42253, 42341, 42246, 42290, 42295, 42293, 42303, 42298, 42292, 42294, 42285, 42289, 42299, 42260, 42289, 42290, 42291, 42240, 42246, 42301, 42290, 42293, 42246, 42298, 42289, 42242};
    }

    static void Camera2StreamConfigurationMap() {
        getHighResolutionOutputSizeshNQ4ISI = -1231763927;
        getHighSpeedVideoFpsRanges = (char) 1219;
        Camera2StreamConfigurationMap = (char) 20225;
        getOutputStallDurationlomOqCM = (char) 53987;
        getOutputFormats = (char) 11822;
    }
}
