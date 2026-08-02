package util.h.xy.au;

/* loaded from: classes5.dex */
public class rh {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static boolean getHighSpeedVideoSizes = false;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static char[] getOutputFormats = null;
    private static boolean getOutputMinFrameDuration = false;

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String intern;
        getInputSizeshNQ4ISI = (getInputFormats + 85) % 128;
        if (i == 400) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦴ饨ᡬ鬫ᩘ鵨ᱽ齺ṫ酲ၴ", 33023 - android.text.TextUtils.indexOf("", ""), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
        } else if (i == 401) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008a\u008f\u0096\u0082\u0089\u008d\u0095\u0084\u0090\u0085\u0087\u0084\u008d\u0094", objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
        } else if (i == 500) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦿꚫ柤␊\ue548ꉧ报⏿\ue04eꅮ湭⺵\uefe4간济⨫\uea83ꯧ栒⥐\uf678", 48947 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            getInputSizeshNQ4ISI = (getInputFormats + 57) % 128;
        } else if (i == 503) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦥ봾僞\uf787謫\u2ef4얝饭㳋펍睕૯ꆋ䕖ᣬ뾴卄\uf6e7趹", android.text.TextUtils.indexOf("", "", 0, 0) + 42157, objArr4);
            intern = ((java.lang.String) objArr4[0]).intern();
        } else {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.argb(0, 0, 0, 0) + 127, "\u0089\u008d\u0089\u0089\u008f\u0087\u0086\u0085\u008c\u0089\u008f\u0084\u008c\u008b", objArr5);
            intern = ((java.lang.String) objArr5[0]).intern();
            int i2 = getInputFormats + 31;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        getInputSizeshNQ4ISI = (getInputFormats + 19) % 128;
        return intern;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.rh rhVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener transactionHistoryListener, final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        getInputFormats = (getInputSizeshNQ4ISI + 77) % 128;
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.rh.4
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static int getInputFormats = 1;
            private static int getInputSizeshNQ4ISI;
            private static char[] getOutputMinFrameDuration = {41883, 41868, 41877, 41894, 41867, 41892, 41895, 41872, 41875, 41887, 41873, 41970, 41864, 41881, 41880, 41876};
            private static char getOutputFormats = 38466;

            @Override // java.lang.Runnable
            public final void run() {
                getInputFormats = (getInputSizeshNQ4ISI + 3) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((byte) (92 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0005\u0003\u0001\n", 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((byte) (113 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\b\u0002\u0006\b\u0003\n\u0004\u0000\u0003\u000f\t\f", '<' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                transactionHistoryListener.onError(str, mobileGatewayError);
                int i = getInputFormats + 1;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            private static void Camera2StreamConfigurationMap(byte b, java.lang.String str2, int i, java.lang.Object[] objArr) {
                int i2;
                char[] charArray = str2.toCharArray();
                util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                char[] cArr = getOutputMinFrameDuration;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 35) % 128;
                        cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                    }
                    cArr = cArr2;
                }
                char c = (char) (4042185467053315654L ^ getOutputFormats);
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr3[i2] = (char) (charArray[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    mcVar.f2638 = 0;
                    getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 7) % 128;
                    while (mcVar.f2638 < i2) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 103) % 128;
                        mcVar.f2641 = charArray[mcVar.f2638];
                        mcVar.f2636 = charArray[mcVar.f2638 + 1];
                        if (mcVar.f2641 == mcVar.f2636) {
                            cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                            cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                        } else {
                            mcVar.f2639 = mcVar.f2641 / c;
                            mcVar.f2640 = mcVar.f2641 % c;
                            mcVar.f2637 = mcVar.f2636 / c;
                            mcVar.f2635 = mcVar.f2636 % c;
                            if (mcVar.f2640 == mcVar.f2635) {
                                mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                int i4 = mcVar.f2639;
                                int i5 = mcVar.f2640;
                                int i6 = mcVar.f2637;
                                int i7 = mcVar.f2635;
                                cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                                cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                            } else if (mcVar.f2639 == mcVar.f2637) {
                                mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                int i8 = mcVar.f2639;
                                int i9 = mcVar.f2640;
                                int i10 = mcVar.f2637;
                                int i11 = mcVar.f2635;
                                cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                                cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                            } else {
                                int i12 = mcVar.f2639;
                                int i13 = mcVar.f2635;
                                int i14 = mcVar.f2637;
                                int i15 = mcVar.f2640;
                                cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                                cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                                getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 103) % 128;
                            }
                        }
                        mcVar.f2638 += 2;
                    }
                }
                for (int i16 = 0; i16 < i; i16++) {
                    cArr3[i16] = (char) (cArr3[i16] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr3);
            }
        });
        int i = getInputSizeshNQ4ISI;
        getInputFormats = (i + 103) % 128;
        int i2 = i + 67;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static /* synthetic */ org.json.JSONArray getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 73;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return getHighResolutionOutputSizeshNQ4ISI(str);
        }
        getHighResolutionOutputSizeshNQ4ISI(str);
        throw null;
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, org.json.JSONArray jSONArray) throws org.json.JSONException, util.h.xy.az.ma {
        getInputSizeshNQ4ISI = (getInputFormats + 93) % 128;
        util.h.xy.az.b highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, str2, str3, str4, str5, str6, jSONArray);
        int i = getInputSizeshNQ4ISI + 25;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i = (getInputSizeshNQ4ISI + 53) % 128;
        getInputFormats = i;
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 77;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(org.json.JSONArray jSONArray) throws org.json.JSONException {
        getInputFormats = (getInputSizeshNQ4ISI + 47) % 128;
        java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(jSONArray);
        int i = getInputSizeshNQ4ISI + 81;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor = "rh";
        int i = getInputFormats + 121;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25227(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener transactionHistoryListener) {
        int i = getInputSizeshNQ4ISI + 13;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRangesFor(str, str2, str3, str4, transactionHistoryListener);
        } else {
            getHighSpeedVideoFpsRangesFor(str, str2, str3, str4, transactionHistoryListener);
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 23) % 128;
            jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (Camera2StreamConfigurationMap ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 27;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = getHighResolutionOutputSizeshNQ4ISI + 55;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr2[i4] = (char) (cArr[i4] * (-3299939579226817547L));
                    throw new java.lang.ArithmeticException();
                }
                cArr2[i4] = (char) (cArr[i4] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i6 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (!getHighSpeedVideoSizes) {
            if (!getOutputMinFrameDuration) {
                throw null;
            }
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            int i7 = getHighSpeedVideoFpsRanges + 17;
            getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
            if (i7 % 2 == 0) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) >>> mdVar.f2643] - i] << i6);
                i2 = mdVar.f2643 >> 1;
            } else {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i6);
                i2 = mdVar.f2643 + 1;
            }
            mdVar.f2643 = i2;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private void getHighSpeedVideoFpsRangesFor(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener transactionHistoryListener) {
        int i = getInputSizeshNQ4ISI + 67;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ᦷ\uefa0\uf5ff\ufb0c셑회\udc9cꋪ꠵빎螊趑鏩餦潾瓍竈䀜嘸尹▰⯊ㅘݛൻ\u12b7\u18f8\uee41\uf455ﶅ쏠째\udf3bꕓꪈ낰", android.graphics.Color.red(0) + 63029, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0093\u0084\u0092\u0091\u008f\u0087\u0089\u008d\u0087\u0086\u0086\u0090\u008c\u0087\u008f\u008e\u0087\u0084\u008d\u008c\u0087\u008c\u0085\u0088\u0087\u008a\u008b\u0087\u008a\u0089\u0085\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
            if (transactionHistoryListener == null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ᦢꑉ戍\u20ff\ueeb1겖歛⤙\uf7f7떬玚㸙ﰂ뫶碳ځ앉茙䇥\u0fe1춞衎嘛ᓩ튫邝彁ᴛ\udbba馬➑\ue24bꁶ滵ⲣ\uea85꤂眵㗽\uf3ed놐籖㨸\uf8f5", 48588 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.rh.2
                private static int getHighSpeedVideoSizesFor = 1;
                private static int getInputSizeshNQ4ISI = 0;
                private static int getOutputFormats = 1;
                private static int getOutputMinFrameDuration = 0;
                private static long getOutputMinFrameDurationlomOqCM = 7469386914860732307L;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    byte[] bArr;
                    byte[] bArr2;
                    byte[] bArr3;
                    byte[] bArr4;
                    byte[] bArr5;
                    byte[] bArr6;
                    java.lang.String str5;
                    java.lang.String str6 = "";
                    byte[] bArr7 = null;
                    byte[] bArr8 = null;
                    byte[] bArr9 = null;
                    byte[] bArr10 = null;
                    bArr7 = null;
                    byte[] bArr11 = null;
                    byte[] bArr12 = null;
                    byte[] bArr13 = null;
                    try {
                        try {
                            byte[] m25123 = ((util.h.xy.au.e) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f872)).m25123();
                            try {
                                bArr6 = util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes();
                                try {
                                    bArr2 = util.h.xy.bh.mb.m25469();
                                    try {
                                        java.lang.String str7 = str4;
                                        util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(util.h.xy.au.rh.getHighSpeedVideoFpsRanges(new java.lang.String(m25123, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr6, java.nio.charset.StandardCharsets.UTF_8), str2, str3, str, str7 != null ? util.h.xy.au.rh.getHighSpeedVideoFpsRanges(str7) : null));
                                        int m25281 = m25276.m25281();
                                        util.h.xy.au.rh.getHighSpeedVideoFpsRangesFor();
                                        new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                                        java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25276);
                                        if (m25281 == 200) {
                                            getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 91) % 128;
                                            if (util.h.xy.az.ra.m25277(m25142)) {
                                                util.h.xy.au.rh.getHighSpeedVideoFpsRangesFor();
                                                java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord> arrayList = new java.util.ArrayList<>();
                                                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8));
                                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("뱼ᅅ\ue617믛ࢇ\ude52댑Å햙ꭐ砐췯ꊙ灘씕髋澜㵔", 44351 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr4);
                                                if (jSONObject.has(((java.lang.String) objArr4[0]).intern())) {
                                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes("뱼ᅅ\ue617믛ࢇ\ude52댑Å햙ꭐ砐췯ꊙ灘씕髋澜㵔", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44350, objArr5);
                                                    if (!jSONObject.isNull(((java.lang.String) objArr5[0]).intern())) {
                                                        int i2 = getHighSpeedVideoSizesFor + 59;
                                                        getOutputMinFrameDuration = i2 % 128;
                                                        if (i2 % 2 != 0) {
                                                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                            getHighSpeedVideoSizes("뱼ᅅ\ue617믛ࢇ\ude52댑Å햙ꭐ砐췯ꊙ灘씕髋澜㵔", 44351 >>> (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)), objArr6);
                                                            str5 = (java.lang.String) objArr6[0];
                                                        } else {
                                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                            getHighSpeedVideoSizes("뱼ᅅ\ue617믛ࢇ\ude52댑Å햙ꭐ砐췯ꊙ灘씕髋澜㵔", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44351, objArr7);
                                                            str5 = (java.lang.String) objArr7[0];
                                                        }
                                                        arrayList = util.h.xy.au.rh.getHighSpeedVideoFpsRangesFor(jSONObject.getJSONArray(str5.intern()));
                                                    }
                                                }
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("뱤뽔먁뗋낿걘꼊\uaacfꖴꅄ鰇鿲骧陥鄿賶辨", 828 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr8);
                                                if (jSONObject.has(((java.lang.String) objArr8[0]).intern())) {
                                                    getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 51) % 128;
                                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes("뱤뽔먁뗋낿걘꼊\uaacfꖴꅄ鰇鿲骧陥鄿賶辨", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 829, objArr9);
                                                    str6 = jSONObject.getString(((java.lang.String) objArr9[0]).intern());
                                                }
                                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("뱄䰩岣洘", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 61553, objArr10);
                                                java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("뱅篴㌩\ueb74ꊭ媁ር쩁膘릵焉⥒", android.graphics.Color.green(0) + 51131, objArr11);
                                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr11[0]).intern());
                                                transactionHistoryListener.onSuccess(arrayList, str2, str6);
                                                util.h.xy.bh.mb.m25483(m25123, bArr6, bArr2);
                                            }
                                        }
                                        java.lang.String m25134 = util.h.xy.au.g.m25127().m25134(m25276);
                                        if (m25281 == 200) {
                                            getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 97) % 128;
                                        } else {
                                            m25134 = util.h.xy.au.rh.getHighResolutionOutputSizeshNQ4ISI(m25281);
                                        }
                                        util.h.xy.au.rh.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.rh.this, transactionHistoryListener, str2, new util.h.xy.au.mb(m25142, m25281, m25134));
                                        util.h.xy.bh.mb.m25483(m25123, bArr6, bArr2);
                                    } catch (org.json.JSONException e) {
                                        e = e;
                                        bArr8 = bArr6;
                                        bArr5 = bArr8;
                                        bArr11 = m25123;
                                        util.h.xy.au.rh.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.rh.this, transactionHistoryListener, str2, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, e.getMessage()));
                                        util.h.xy.bh.mb.m25483(bArr11, bArr5, bArr2);
                                    } catch (util.h.xy.az.ma e2) {
                                        e = e2;
                                        bArr9 = bArr6;
                                        bArr4 = bArr9;
                                        bArr12 = m25123;
                                        util.h.xy.au.rh.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.rh.this, transactionHistoryListener, str2, util.h.xy.bh.mb.m25478(e));
                                        util.h.xy.bh.mb.m25483(bArr12, bArr4, bArr2);
                                    } catch (java.lang.Exception e3) {
                                        e = e3;
                                        bArr10 = bArr6;
                                        bArr3 = bArr10;
                                        bArr13 = m25123;
                                        util.h.xy.au.rh.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.rh.this, transactionHistoryListener, str2, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e.getMessage()));
                                        util.h.xy.bh.mb.m25483(bArr13, bArr3, bArr2);
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        bArr7 = m25123;
                                        bArr = bArr6;
                                        util.h.xy.bh.mb.m25483(bArr7, bArr, bArr2);
                                        throw th;
                                    }
                                } catch (org.json.JSONException e4) {
                                    e = e4;
                                    bArr2 = null;
                                } catch (util.h.xy.az.ma e5) {
                                    e = e5;
                                    bArr2 = null;
                                } catch (java.lang.Exception e6) {
                                    e = e6;
                                    bArr2 = null;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    bArr2 = null;
                                }
                            } catch (org.json.JSONException e7) {
                                e = e7;
                                bArr2 = null;
                            } catch (util.h.xy.az.ma e8) {
                                e = e8;
                                bArr2 = null;
                            } catch (java.lang.Exception e9) {
                                e = e9;
                                bArr2 = null;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                bArr6 = null;
                                bArr2 = null;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            bArr = "뱼ᅅ\ue617믛ࢇ\ude52댑Å햙ꭐ砐췯ꊙ灘씕髋澜㵔";
                        }
                    } catch (org.json.JSONException e10) {
                        e = e10;
                        bArr5 = null;
                        bArr2 = null;
                    } catch (util.h.xy.az.ma e11) {
                        e = e11;
                        bArr4 = null;
                        bArr2 = null;
                    } catch (java.lang.Exception e12) {
                        e = e12;
                        bArr3 = null;
                        bArr2 = null;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        bArr = 0;
                        bArr2 = null;
                    }
                }

                private static void getHighSpeedVideoSizes(java.lang.String str5, int i2, java.lang.Object[] objArr4) {
                    getOutputFormats = (getInputSizeshNQ4ISI + 7) % 128;
                    char[] charArray = str5.toCharArray();
                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                    dVar.f2628 = i2;
                    int length = charArray.length;
                    long[] jArr = new long[length];
                    dVar.f2629 = 0;
                    while (dVar.f2629 < charArray.length) {
                        getInputSizeshNQ4ISI = (getOutputFormats + 101) % 128;
                        jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputMinFrameDurationlomOqCM ^ (-7508379876853140581L));
                        dVar.f2629++;
                    }
                    char[] cArr = new char[length];
                    while (true) {
                        dVar.f2629 = 0;
                        while (dVar.f2629 < charArray.length) {
                            int i3 = getInputSizeshNQ4ISI + 75;
                            getOutputFormats = i3 % 128;
                            if (i3 % 2 == 0) {
                                break;
                            }
                            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                            dVar.f2629++;
                        }
                        objArr4[0] = new java.lang.String(cArr);
                        return;
                        cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                        int i4 = dVar.f2629;
                    }
                }
            }).start();
            int i2 = getInputFormats + 103;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        android.text.TextUtils.isEmpty(str);
        throw null;
    }

    private static org.json.JSONArray getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.Object obj;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ᦷ佄둠ᴊ䈦ꬼო秵꺗", 22247 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        if (!str.equals(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦦ鿑ᕕ諤c맭㼑", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34422, objArr2);
            jSONArray.put(((java.lang.String) objArr2[0]).intern());
            getInputFormats = (getInputSizeshNQ4ISI + 15) % 128;
            return jSONArray;
        }
        int i = getInputFormats + 11;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦷ佄둠ᴊ䈦ꬼო秵꺗", 31240 >> android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr3);
            obj = objArr3[0];
        } else {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦷ佄둠ᴊ䈦ꬼო秵꺗", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 22247, objArr4);
            obj = objArr4[0];
        }
        jSONArray.put(((java.lang.String) obj).intern());
        return jSONArray;
    }

    private static util.h.xy.az.b getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, org.json.JSONArray jSONArray) throws org.json.JSONException, util.h.xy.az.ma {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ᦂꌹ泇㙴\uf302벺", 47777 - android.view.View.MeasureSpec.getSize(0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(0);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ᦁܘ⒄䈷掯腉꺁챯\uedfcઞ⠖䦺眦铐뉖폤", 7823 - android.view.View.MeasureSpec.getMode(0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str2);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ᦁ䣦뭸\uedc9屗躷\uf123", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20849, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str3);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u0098\u008c\u008d\u0082\u0084\u0088\u0085\u0098\u008c\u0085\u0089\u0097\u0084\u008f\u0083", objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        util.h.xy.az.b bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f912);
        org.json.JSONObject m25147 = util.h.xy.au.g.m25127().m25147(str4, str5, jSONArray);
        getInputSizeshNQ4ISI = (getInputFormats + 13) % 128;
        try {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(128 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), "\u008c\u008d\u0082\u0084\u0085\u0096\u0082\u0089\u008d\u0095\u0084\u0090\u0099", objArr5);
            java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0087\u0089\u008f\u0089\u0085\u008f\u009a", objArr6);
            sb2.append(((java.lang.String) objArr6[0]).intern());
            sb2.append(str6.trim());
            bVar.m25264(intern, sb2.toString(), "");
            bVar.m25258(m25147);
            return bVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionRecord> Camera2StreamConfigurationMap(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray.length() == 0) {
            getInputFormats = (getInputSizeshNQ4ISI + 5) % 128;
            return arrayList;
        }
        int i = getInputFormats + 109;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 3;
        }
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i3);
            util.h.xy.be.ra raVar = new util.h.xy.be.ra();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u008f\u008a\u008d\u009b\u0093\u0088\u008c\u008f\u0089\u0089\u0090\u0088", objArr);
            raVar.m25376(jSONObject.getString(((java.lang.String) objArr[0]).intern()));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u008a\u008b\u008a\u0089\u0085\u009b\u0086\u0085\u0084\u0082\u0083\u0082\u008a", objArr2);
            raVar.m25388(jSONObject.getString(((java.lang.String) objArr2[0]).intern()));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u008f\u0084\u0085\u0081\u008c\u008d\u0082\u0084\u0088\u0085\u0098\u008c\u0085\u0089\u0084", objArr3);
            raVar.m25380(jSONObject.getString(((java.lang.String) objArr3[0]).intern()));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦂﵗ퀱럡諉憈䕧塇㼇ዲ\ue9a6첳ꁫ蜱騙", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 58580, objArr4);
            raVar.m25386(jSONObject.getString(((java.lang.String) objArr4[0]).intern()));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0098\u0090\u0084\u0085\u0084\u009c\u008c\u008d\u0082\u0084\u0088\u0085\u0098\u008c\u0085\u0089\u0084", objArr5);
            raVar.m25385(jSONObject.getString(((java.lang.String) objArr5[0]).intern()));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦗ駾ᥓ颬᠌须", 32868 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr6);
            if (jSONObject.has(((java.lang.String) objArr6[0]).intern())) {
                int i4 = getInputFormats + 25;
                getInputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ᦗ駾ᥓ颬᠌须", 32869 - (android.widget.ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), objArr7);
                    obj3 = objArr7[0];
                } else {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ᦗ駾ᥓ颬᠌须", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32869, objArr8);
                    obj3 = objArr8[0];
                }
                raVar.m25382(jSONObject.getDouble(((java.lang.String) obj3).intern()));
            }
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0093\u0085\u0086\u0092\u0098\u0082\u0081\u0084\u008c\u0090\u008d\u0091\u0085", objArr9);
            if (jSONObject.has(((java.lang.String) objArr9[0]).intern())) {
                try {
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 127, "\u0093\u0085\u0086\u0092\u0098\u0082\u0081\u0084\u008c\u0090\u008d\u0091\u0085", objArr10);
                    raVar.m25377(jSONObject.getString(((java.lang.String) objArr10[0]).intern()));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦛ䚠\ua7e2Ќ敒쉨⊪菧\ue020䅜깥ຢ", 24419 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr11);
            if (jSONObject.has(((java.lang.String) objArr11[0]).intern())) {
                int i5 = getInputFormats + 59;
                getInputSizeshNQ4ISI = i5 % 128;
                if (i5 % 2 == 0) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ᦛ䚠\ua7e2Ќ敒쉨⊪菧\ue020䅜깥ຢ", 6305 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >>> 48), objArr12);
                    obj2 = objArr12[0];
                } else {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ᦛ䚠\ua7e2Ќ敒쉨⊪菧\ue020䅜깥ຢ", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24371, objArr13);
                    obj2 = objArr13[0];
                }
                raVar.m25387(jSONObject.getString(((java.lang.String) obj2).intern()));
            }
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦂ\u20c9欍뉿ﲱܖ乛袙폷ᨬ⒚濰똎", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14669, objArr14);
            if (jSONObject.has(((java.lang.String) objArr14[0]).intern())) {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ᦂ\u20c9欍뉿ﲱܖ乛袙폷ᨬ⒚濰똎", 14670 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr15);
                raVar.m25383(jSONObject.getString(((java.lang.String) objArr15[0]).intern()));
            }
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦛ\udb6c鱺全ቢ희衢䵻๚썸葰祦", android.graphics.Color.argb(0, 0, 0, 0) + 49919, objArr16);
            if (jSONObject.has(((java.lang.String) objArr16[0]).intern())) {
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ᦛ\udb6c鱺全ቢ희衢䵻๚썸葰祦", android.widget.ExpandableListView.getPackedPositionType(0L) + 49919, objArr17);
                raVar.m25389(jSONObject.getString(((java.lang.String) objArr17[0]).intern()));
            }
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u008f\u008a\u008d\u009b\u0086\u0085\u0084\u0098\u008d\u009d\u0084\u008c\u0085\u0095\u0088\u0089\u008f\u0091", objArr18);
            if (jSONObject.has(((java.lang.String) objArr18[0]).intern())) {
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.view.KeyEvent.keyCodeFromString("") + 127, "\u008f\u008a\u008d\u009b\u0086\u0085\u0084\u0098\u008d\u009d\u0084\u008c\u0085\u0095\u0088\u0089\u008f\u0091", objArr19);
                raVar.m25378(jSONObject.getString(((java.lang.String) objArr19[0]).intern()));
            }
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᦂ쮞붞澼冫ϙ\uf5d9ꟁ觗篧", 53772 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr20);
            if (jSONObject.has(((java.lang.String) objArr20[0]).intern())) {
                int i6 = getInputFormats + 83;
                getInputSizeshNQ4ISI = i6 % 128;
                if (i6 % 2 == 0) {
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ᦂ쮞붞澼冫ϙ\uf5d9ꟁ觗篧", 53773 << android.graphics.Color.green(1), objArr21);
                    obj = objArr21[0];
                } else {
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("ᦂ쮞붞澼冫ϙ\uf5d9ꟁ觗篧", android.graphics.Color.green(0) + 53773, objArr22);
                    obj = objArr22[0];
                }
                raVar.m25379(jSONObject.getString(((java.lang.String) obj).intern()));
            }
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u008a\u008b\u0084\u008c\u0085\u0095\u0088\u0089\u008f\u0091", objArr23);
            if (jSONObject.has(((java.lang.String) objArr23[0]).intern())) {
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u008a\u008b\u0084\u008c\u0085\u0095\u0088\u0089\u008f\u0091", objArr24);
                raVar.m25384(jSONObject.getString(((java.lang.String) objArr24[0]).intern()));
            }
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0093\u0089\u0085\u0082\u0086\u0082\u009e\u0090\u0099\u0098\u0082", objArr25);
            if (jSONObject.has(((java.lang.String) objArr25[0]).intern())) {
                getInputFormats = (getInputSizeshNQ4ISI + 87) % 128;
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 128, "\u0093\u0089\u0085\u0082\u0086\u0082\u009e\u0090\u0099\u0098\u0082", objArr26);
                raVar.m25381(jSONObject.getBoolean(((java.lang.String) objArr26[0]).intern()));
                getInputSizeshNQ4ISI = (getInputFormats + 81) % 128;
            }
            arrayList.add(raVar);
        }
        return arrayList;
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = 3423115604173466221L;
        getOutputFormats = new char[]{64342, 64317, 64307, 64294, 64309, 64318, 64394, 64311, 64292, 64310, 64349, 64312, 64315, 64308, 64305, 64289, 64313, 64314, 64301, 64344, 64306, 64300, 64326, 64295, 64341, 64340, 64343, 64327, 64346, 64290};
        getHighSpeedVideoSizesFor = -1074857046;
        getOutputMinFrameDuration = true;
        getHighSpeedVideoSizes = true;
    }
}
