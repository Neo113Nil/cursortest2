package com.payair.hce;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class setScrollBarStyle {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int getAid;
    private static java.lang.String valueOf;
    private static com.payair.hce.setSystemUiVisibility values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 107;
        int i5 = i * 4;
        int i6 = (s * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            i4 = i6;
            int i9 = 0;
            i6++;
            i4 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i6++;
            i4 += i8;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        getAid = 1;
        DigitizedCardProfile();
        android.view.View.MeasureSpec.getSize(0);
        valueOf = null;
        values = new com.payair.hce.setSystemUiVisibility(com.payair.hce.setSaveFromParentEnabled.getAlternateContactlessPaymentData());
        int i = getAid + 121;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:23|24|25|(7:(3:27|28|(17:32|(2:34|35)(1:92)|36|(13:38|39|(3:41|(2:43|44)|46)|47|48|49|(1:51)|52|53|(4:55|(2:57|58)(1:61)|59|60)|62|(1:64)(1:85)|65)|91|39|(0)|47|48|49|(0)|52|53|(0)|62|(0)(0)|65))|52|53|(0)|62|(0)(0)|65)|(1:97)(1:96)|91|39|(0)|47|48|49|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a9, code lost:
    
        if (r20.intValue() == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d8, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0197 A[Catch: IOException -> 0x02be, TRY_LEAVE, TryCatch #3 {IOException -> 0x02be, blocks: (B:8:0x007c, B:13:0x008f, B:14:0x0097, B:16:0x009d, B:24:0x00ab, B:28:0x00e9, B:30:0x00ef, B:32:0x00f5, B:35:0x0107, B:36:0x0136, B:38:0x0142, B:39:0x0191, B:41:0x0197, B:44:0x01a5, B:46:0x01ab, B:47:0x01bc, B:49:0x01c8, B:58:0x01ee, B:59:0x01f7, B:61:0x01f3, B:92:0x011e, B:94:0x0154, B:96:0x015a, B:97:0x0174, B:98:0x0224), top: B:7:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201 A[Catch: IOException -> 0x02bf, TryCatch #1 {IOException -> 0x02bf, blocks: (B:53:0x01dc, B:62:0x01fb, B:64:0x0201, B:65:0x020b, B:66:0x022c, B:68:0x0241, B:72:0x0252, B:73:0x025a, B:75:0x0260, B:77:0x02ae, B:79:0x02b5, B:80:0x02ba), top: B:52:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.payair.hce.communication.JsonResponse AlternateContactlessPaymentDataJson(java.lang.String str, com.payair.hce.communication.JsonRequest jsonRequest, com.payair.hce.communication.JsonResponse jsonResponse, java.lang.Integer num, java.lang.String str2, java.lang.String str3) {
        com.payair.hce.communication.JsonResponse jsonResponse2;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        java.lang.String str4;
        java.lang.String str5;
        if (((java.lang.String) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 162450370, -162450360, (int) java.lang.System.currentTimeMillis())) == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{0, 17, 0, 4}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b("᧤䬌밂\ue16a刢蜿\ue86d崠踠\uf334②褫鶴⼭週씯㘦鬴찰ㄠ戾휸", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21247, objArr2);
            arrayList.add(new com.payair.hce.ErrorModel("9092", intern, ((java.lang.String) objArr2[0]).intern()));
            com.payair.hce.communication.JsonResponse jsonResponse3 = new com.payair.hce.communication.JsonResponse();
            jsonResponse3.setErrors(arrayList);
            jsonResponse3.setStatusCode(400);
            jsonResponse3.setStatusCodeFromServer(400);
            jsonResponse3.setSuccessful(false);
            return jsonResponse3;
        }
        java.lang.String DigitizedCardProfile2 = DigitizedCardProfile(jsonRequest, str, str2);
        try {
            java.net.URL valueOf2 = valueOf(jsonRequest, str, str2);
            javax.net.ssl.HttpsURLConnection httpsURLConnection = null;
            if (valueOf2 != null) {
                int i = DigitizedCardProfile + 113;
                getAid = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                httpsURLConnection = (javax.net.ssl.HttpsURLConnection) valueOf2.openConnection();
            }
            if (httpsURLConnection != null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{17, 12, 48, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", false, objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(new int[]{29, 16, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true, objArr4);
                httpsURLConnection.setRequestProperty(intern2, ((java.lang.String) objArr4[0]).intern());
                try {
                    if (num != null) {
                        getAid = (DigitizedCardProfile + 69) % 128;
                        if (num.intValue() == 2 || num.intValue() == 1) {
                            if (num.intValue() == 2) {
                                getAid = (DigitizedCardProfile + 43) % 128;
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                a(new int[]{45, 4, 67, 2}, "\u0000\u0001\u0000\u0001", false, objArr5);
                                httpsURLConnection.setRequestMethod(((java.lang.String) objArr5[0]).intern());
                            } else {
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a(new int[]{49, 3, 0, 1}, "\u0000\u0000\u0001", true, objArr6);
                                httpsURLConnection.setRequestMethod(((java.lang.String) objArr6[0]).intern());
                            }
                            httpsURLConnection.setDoOutput(true);
                            android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            if (jsonRequest.getjSONObject() != null) {
                                str5 = new com.payair.hce.IccPrivateKeyCrtComponentsJson().values(jsonRequest.getjSONObject());
                                str4 = str3;
                                httpsURLConnection = AlternateContactlessPaymentDataJson(jsonRequest, httpsURLConnection, str5, DigitizedCardProfile2, str4);
                                if (num != null) {
                                    if (num.intValue() != 2) {
                                        DigitizedCardProfile = (getAid + 27) % 128;
                                    }
                                    java.io.OutputStream outputStream = httpsURLConnection.getOutputStream();
                                    outputStream.write(str5.getBytes());
                                    outputStream.flush();
                                    outputStream.close();
                                }
                                long responseCode = httpsURLConnection.getResponseCode();
                                java.lang.String values2 = values(httpsURLConnection, responseCode);
                                android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                jsonResponse2 = (com.payair.hce.communication.JsonResponse) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(values2, jsonResponse.getClass());
                                if (jsonResponse2 == null) {
                                    jsonResponse2 = jsonResponse;
                                }
                                if (!jsonResponse2.isDataValid()) {
                                    int i2 = getAid + 15;
                                    DigitizedCardProfile = i2 % 128;
                                    jsonResponse.setStatusCode(i2 % 2 != 0 ? 658 : java.lang.Integer.valueOf(org.threeten.bp.chrono.HijrahDate.MAX_VALUE_OF_ERA));
                                    jsonResponse2 = jsonResponse;
                                }
                                jsonResponse2.setStatusCodeFromServer(java.lang.Integer.valueOf(jsonResponse2.getStatusCode() != null ? jsonResponse2.getStatusCode().intValue() : 0));
                                jsonResponse2.setStatusCode(java.lang.Integer.valueOf((int) responseCode));
                                jsonResponse2.getStatusCode();
                                android.graphics.Color.argb(0, 0, 0, 0);
                                jsonResponse2.getStatusCodeFromServer();
                            }
                            str4 = str3;
                            str5 = "";
                            httpsURLConnection = AlternateContactlessPaymentDataJson(jsonRequest, httpsURLConnection, str5, DigitizedCardProfile2, str4);
                            if (num != null) {
                            }
                            long responseCode2 = httpsURLConnection.getResponseCode();
                            java.lang.String values22 = values(httpsURLConnection, responseCode2);
                            android.widget.ExpandableListView.getPackedPositionGroup(0L);
                            jsonResponse2 = (com.payair.hce.communication.JsonResponse) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(values22, jsonResponse.getClass());
                            if (jsonResponse2 == null) {
                            }
                            if (!jsonResponse2.isDataValid()) {
                            }
                            jsonResponse2.setStatusCodeFromServer(java.lang.Integer.valueOf(jsonResponse2.getStatusCode() != null ? jsonResponse2.getStatusCode().intValue() : 0));
                            jsonResponse2.setStatusCode(java.lang.Integer.valueOf((int) responseCode2));
                            jsonResponse2.getStatusCode();
                            android.graphics.Color.argb(0, 0, 0, 0);
                            jsonResponse2.getStatusCodeFromServer();
                        }
                    }
                    if (!jsonResponse2.isDataValid()) {
                    }
                    jsonResponse2.setStatusCodeFromServer(java.lang.Integer.valueOf(jsonResponse2.getStatusCode() != null ? jsonResponse2.getStatusCode().intValue() : 0));
                    jsonResponse2.setStatusCode(java.lang.Integer.valueOf((int) responseCode2));
                    jsonResponse2.getStatusCode();
                    android.graphics.Color.argb(0, 0, 0, 0);
                    jsonResponse2.getStatusCodeFromServer();
                } catch (java.io.IOException unused) {
                    jsonResponse2.setStatusCode(108);
                    return jsonResponse2;
                }
                if (num == null || num.intValue() != 3) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b("᧰괯灙", 46301 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr7);
                    httpsURLConnection.setRequestMethod(((java.lang.String) objArr7[0]).intern());
                } else {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(new int[]{61, 6, 15, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001", true, objArr8);
                    httpsURLConnection.setRequestMethod(((java.lang.String) objArr8[0]).intern());
                }
                str4 = str3;
                str5 = "";
                httpsURLConnection = AlternateContactlessPaymentDataJson(jsonRequest, httpsURLConnection, str5, DigitizedCardProfile2, str4);
                if (num != null) {
                }
                long responseCode22 = httpsURLConnection.getResponseCode();
                java.lang.String values222 = values(httpsURLConnection, responseCode22);
                android.widget.ExpandableListView.getPackedPositionGroup(0L);
                jsonResponse2 = (com.payair.hce.communication.JsonResponse) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(values222, jsonResponse.getClass());
                if (jsonResponse2 == null) {
                }
            } else {
                jsonResponse.setStatusCode(java.lang.Integer.valueOf(org.threeten.bp.chrono.HijrahDate.MAX_VALUE_OF_ERA));
                jsonResponse2 = jsonResponse;
            }
            jsonResponse2.checkForSuccess();
            android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
            jsonResponse2.getStatusCode();
            android.os.Process.getThreadPriority(0);
            jsonResponse2.getStatusMessage();
            android.widget.ExpandableListView.getPackedPositionForGroup(0);
            if (httpsURLConnection != null && (headerFields = httpsURLConnection.getHeaderFields()) != null) {
                int i3 = getAid + 97;
                DigitizedCardProfile = i3 % 128;
                if (i3 % 2 != 0) {
                    headerFields.entrySet().iterator();
                    throw new java.lang.NullPointerException();
                }
                for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerFields.entrySet()) {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b("᧿Οⵌ圴烦驄萊ꆌ쮔\uf567Ọ㣘≰", android.text.TextUtils.indexOf("", "") + 6733, objArr9);
                    ((java.lang.String) objArr9[0]).intern();
                    entry.getKey();
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(new int[]{106, 10, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", true, objArr10);
                    ((java.lang.String) objArr10[0]).intern();
                    entry.getValue();
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b("᧪", android.text.TextUtils.getOffsetBefore("", 0) + 11369, objArr11);
                    ((java.lang.String) objArr11[0]).intern();
                }
            }
            return jsonResponse2;
        } catch (java.io.IOException unused2) {
            jsonResponse2 = jsonResponse;
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $11 + 73;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            int i3 = $11 + 97;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1890 - android.text.TextUtils.getCapsMode("", 0, 0), (char) ((-16773616) - android.graphics.Color.rgb(0, 0, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, (short) 0, 6, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() + writeReplace + 4761752123935132024L;
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63, android.text.TextUtils.getTrimmedLength("") + 1443, (char) (29681 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, (short) 0, 5, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 31, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1891, (char) (3600 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c(0, (short) 0, 6, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (writeReplace ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 64, android.graphics.Color.argb(0, 0, 0, 0) + 1443, (char) (29683 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    c(0, (short) 0, 5, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj5 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 64, 1443 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (29682 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                c(0, (short) 0, 5, objArr11);
                obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static java.lang.String DigitizedCardProfile(com.payair.hce.communication.JsonRequest jsonRequest, java.lang.String str, java.lang.String str2) {
        int i = DigitizedCardProfile + 17;
        getAid = i % 128;
        if (i % 2 == 0) {
            values(str);
            throw null;
        }
        java.lang.String substring = values(str).substring(((java.lang.String) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 896454030, -896454018, (int) java.lang.System.currentTimeMillis())).length());
        if (str2 != null) {
            int i2 = DigitizedCardProfile + 53;
            getAid = i2 % 128;
            if (i2 % 2 != 0) {
                if (!str2.isEmpty()) {
                    return str2.substring(((java.lang.String) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 896454030, -896454018, (int) java.lang.System.currentTimeMillis())).length());
                }
            } else {
                throw null;
            }
        }
        if (((java.lang.String) com.payair.hce.communication.JsonRequest.values(new java.lang.Object[]{jsonRequest}, -2120511387, 2120511388, java.lang.System.identityHashCode(jsonRequest))) == null) {
            DigitizedCardProfile = (getAid + 57) % 128;
            return substring;
        }
        java.lang.String str3 = (java.lang.String) com.payair.hce.communication.JsonRequest.values(new java.lang.Object[]{jsonRequest}, -2120511387, 2120511388, java.lang.System.identityHashCode(jsonRequest));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(str3);
        return sb.toString();
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        short s = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AlternateContactlessPaymentDataJson;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[s] = java.lang.Integer.valueOf(cArr[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.getDefaultSize(s, s), android.text.TextUtils.getOffsetBefore("", s) + 2807, (char) android.view.View.resolveSizeAndState(s, s, s));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(s, s, 2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[s], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    s = 0;
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i4);
        if (bArr2 != null) {
            char[] cArr4 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    $11 = ($10 + 13) % 128;
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.MotionEvent.axisFromString(""), 2884 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, (short) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getTrimmedLength(""), 2880 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c(0, (short) 0, (byte) $$a.length, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 260 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i10);
            $10 = ($11 + 49) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr3[(i4 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            $10 = ($11 + 117) % 128;
            int i11 = 0;
            while (true) {
                getaccounttype.writeReplace = i11;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i11 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static java.net.URL valueOf(com.payair.hce.communication.JsonRequest jsonRequest, java.lang.String str, java.lang.String str2) {
        int i = DigitizedCardProfile + 73;
        getAid = i % 128;
        java.net.URL url = null;
        if (i % 2 != 0) {
            java.lang.String values2 = values(str);
            if (((java.lang.String) com.payair.hce.communication.JsonRequest.values(new java.lang.Object[]{jsonRequest}, -2120511387, 2120511388, java.lang.System.identityHashCode(jsonRequest))) != null) {
                java.lang.String str3 = (java.lang.String) com.payair.hce.communication.JsonRequest.values(new java.lang.Object[]{jsonRequest}, -2120511387, 2120511388, java.lang.System.identityHashCode(jsonRequest));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(values2);
                sb.append(str3);
                url = new java.net.URL(sb.toString());
            } else {
                url = new java.net.URL(values2);
            }
            if (str2 != null) {
                java.net.URL url2 = new java.net.URL(str2);
                DigitizedCardProfile = (getAid + 49) % 128;
                url = url2;
            }
            android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            android.text.TextUtils.indexOf("", "");
            return url;
        }
        values(str);
        throw new java.lang.ArithmeticException();
    }

    private static java.lang.String values(java.lang.String str) {
        java.lang.String str2;
        if (str == null) {
            str2 = (java.lang.String) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 162450370, -162450360, (int) java.lang.System.currentTimeMillis());
        } else {
            DigitizedCardProfile = (getAid + 89) % 128;
            str2 = java.lang.String.format((java.lang.String) com.payair.hce.setScrollBarSize.DigitizedCardProfile(new java.lang.Object[0], 162450370, -162450360, (int) java.lang.System.currentTimeMillis()), str);
        }
        getAid = (DigitizedCardProfile + 119) % 128;
        return str2;
    }

    private static java.lang.String values(javax.net.ssl.HttpsURLConnection httpsURLConnection, long j) throws java.io.IOException {
        java.io.InputStreamReader inputStreamReader;
        getAid = (DigitizedCardProfile + 71) % 128;
        if (j < 400) {
            inputStreamReader = new java.io.InputStreamReader(httpsURLConnection.getInputStream());
        } else {
            inputStreamReader = new java.io.InputStreamReader(httpsURLConnection.getErrorStream());
            getAid = (DigitizedCardProfile + 65) % 128;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(readLine);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{137, 1, 0, 0}, "\u0000", true, objArr);
                sb2.append(((java.lang.String) objArr[0]).intern());
                sb.append(sb2.toString());
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    private static javax.net.ssl.HttpsURLConnection AlternateContactlessPaymentDataJson(com.payair.hce.communication.JsonRequest jsonRequest, javax.net.ssl.HttpsURLConnection httpsURLConnection, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1486464230, -1486464227, (int) java.lang.System.currentTimeMillis())).booleanValue() || ((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1581916780, 1581916826, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            if (valueOf == null) {
                int i = DigitizedCardProfile + 119;
                getAid = i % 128;
                if (i % 2 != 0) {
                    valueOf = (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1354005599, 1354005623, (int) java.lang.System.currentTimeMillis());
                } else {
                    valueOf = (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1354005599, 1354005623, (int) java.lang.System.currentTimeMillis());
                    throw new java.lang.ArithmeticException();
                }
            }
            if (str3 != null && !str3.equals("")) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{138, 13, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{151, 7, 9, 2}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(str3);
                httpsURLConnection.setRequestProperty(intern, sb.toString());
                android.view.ViewConfiguration.getTouchSlop();
            } else if (valueOf != null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{138, 13, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(new int[]{151, 7, 9, 2}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, objArr4);
                sb2.append(((java.lang.String) objArr4[0]).intern());
                sb2.append(valueOf);
                httpsURLConnection.setRequestProperty(intern2, sb2.toString());
                android.view.ViewConfiguration.getMaximumFlingVelocity();
            }
        }
        if (!((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1486464230, -1486464227, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 661461888, -661461849, (int) java.lang.System.currentTimeMillis());
            java.lang.String jSONObject = ((org.json.JSONObject) com.payair.hce.setTextDirection.DigitizedCardProfile(new java.lang.Object[]{settextdirection}, 913703272, -913703259, java.lang.System.identityHashCode(settextdirection))).toString();
            if (!((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1581916780, 1581916826, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(currentTimeMillis);
                sb3.append(jSONObject);
                sb3.append(str);
                sb3.append(str2);
                java.lang.String obj = sb3.toString();
                android.graphics.PointF.length(0.0f, 0.0f);
                java.lang.String valueOf2 = valueOf(obj);
                if (((java.lang.Boolean) com.payair.hce.communication.JsonRequest.values(new java.lang.Object[]{jsonRequest}, -590464632, 590464634, java.lang.System.identityHashCode(jsonRequest))).booleanValue()) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b("᧖㮡崅绶達눪힌\ue978\u0aceⲸ一掙蕽", 8802 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
                    java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b("᧧㼙吨洪艛\udb5d\uf00d", android.view.MotionEvent.axisFromString("") + 9968, objArr6);
                    sb4.append(((java.lang.String) objArr6[0]).intern());
                    sb4.append(valueOf2);
                    httpsURLConnection.setRequestProperty(intern3, sb4.toString());
                    getAid = (DigitizedCardProfile + 105) % 128;
                }
            }
            if (((java.lang.String) com.payair.hce.communication.JsonRequest.values(new java.lang.Object[]{jsonRequest}, -930130167, 930130167, java.lang.System.identityHashCode(jsonRequest))) != null) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 11, 179, 0}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr7);
                httpsURLConnection.setRequestProperty(((java.lang.String) objArr7[0]).intern(), (java.lang.String) com.payair.hce.communication.JsonRequest.values(new java.lang.Object[]{jsonRequest}, -930130167, 930130167, java.lang.System.identityHashCode(jsonRequest)));
                DigitizedCardProfile = (getAid + 81) % 128;
            }
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            b("᧯\uf411신텆꿋멉袻朼疠", 60811 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
            httpsURLConnection.setRequestProperty(((java.lang.String) objArr8[0]).intern(), jSONObject);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 19, 66, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", false, objArr9);
            java.lang.String intern4 = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            a(new int[]{239, 3, 11, 0}, "\u0000\u0001\u0000", true, objArr10);
            httpsURLConnection.setRequestProperty(intern4, ((java.lang.String) objArr10[0]).intern());
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            b("᧯ዡ༕㮏㐖ₕ崆䦾䈮纩欩", 2939 - android.view.View.resolveSizeAndState(0, 0, 0), objArr11);
            httpsURLConnection.setRequestProperty(((java.lang.String) objArr11[0]).intern(), java.lang.String.valueOf(currentTimeMillis));
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            b("᧐柬\ue584掼\ue17b漓\ued22櫛", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32298, objArr12);
            str2.contains(((java.lang.String) objArr12[0]).intern());
        }
        try {
            com.payair.hce.setSystemUiVisibility setsystemuivisibility = values;
            java.lang.String str4 = (java.lang.String) com.payair.hce.setSystemUiVisibility.valueOf(new java.lang.Object[]{setsystemuivisibility}, -1915384022, 1915384023, java.lang.System.identityHashCode(setsystemuivisibility));
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            b("᧯䇏\ua955ᄋ碦ꁍࠍ环\udb32̜檠퉂㨘斯쵞㔂鳊쑖Ⰼ鞬ｒ", 22614 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr13);
            httpsURLConnection.setRequestProperty(((java.lang.String) objArr13[0]).intern(), str4);
            return httpsURLConnection;
        } catch (java.lang.Exception unused) {
            android.view.KeyEvent.getMaxKeyCode();
            return httpsURLConnection;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String valueOf(java.lang.String str) {
        java.lang.String str2;
        int i;
        java.lang.String str3;
        byte[] bArr;
        try {
            str3 = (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 2065530148, -2065530080, (int) java.lang.System.currentTimeMillis());
        } catch (java.io.UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str3 != null) {
            DigitizedCardProfile = (getAid + 57) % 128;
            if (!str3.isEmpty()) {
                java.lang.String lowerCase = str3.toLowerCase();
                android.media.AudioTrack.getMaxVolume();
                java.lang.Object[] objArr = new java.lang.Object[1];
                b("᧢ꗾ懋ⷍ\ue9fb", 48157 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
                bArr = lowerCase.getBytes(((java.lang.String) objArr[0]).intern());
                com.payair.hce.internalEndTransaction internalendtransaction = new com.payair.hce.internalEndTransaction(new com.payair.hce.isMainThreadroom_runtime_release());
                internalendtransaction.DigitizedCardProfile(new com.payair.hce.getErrorDialog(bArr, bArr.length));
                internalendtransaction.AlternateContactlessPaymentDataJson(str.getBytes(), str.getBytes().length);
                byte[] bArr2 = new byte[((java.lang.Integer) com.payair.hce.internalEndTransaction.writeReplace(new java.lang.Object[]{internalendtransaction}, -1727069471, 1727069471, java.lang.System.identityHashCode(internalendtransaction))).intValue()];
                internalendtransaction.valueOf(bArr2);
                java.lang.String str4 = (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr2}, 935379601, -935379550, (int) java.lang.System.currentTimeMillis());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -798371973, 798372037, (int) java.lang.System.currentTimeMillis())).longValue());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{337, 1, 0, 0}, "\u0000", true, objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(str4);
                java.lang.String obj = sb.toString();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b("᧢ꗾ懋ⷍ\ue9fb", android.text.TextUtils.getOffsetAfter("", 0) + 48157, objArr3);
                str2 = android.util.Base64.encodeToString(obj.getBytes(((java.lang.String) objArr3[0]).intern()), 2);
                DigitizedCardProfile = (getAid + 107) % 128;
                i = DigitizedCardProfile + 125;
                getAid = i % 128;
                if (i % 2 == 0) {
                    return str2;
                }
                throw null;
            }
        }
        android.graphics.Color.blue(0);
        bArr = (byte[]) com.payair.hce.setTag.values(new java.lang.Object[0], 1324974229, -1324974229, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.internalEndTransaction internalendtransaction2 = new com.payair.hce.internalEndTransaction(new com.payair.hce.isMainThreadroom_runtime_release());
        internalendtransaction2.DigitizedCardProfile(new com.payair.hce.getErrorDialog(bArr, bArr.length));
        internalendtransaction2.AlternateContactlessPaymentDataJson(str.getBytes(), str.getBytes().length);
        byte[] bArr22 = new byte[((java.lang.Integer) com.payair.hce.internalEndTransaction.writeReplace(new java.lang.Object[]{internalendtransaction2}, -1727069471, 1727069471, java.lang.System.identityHashCode(internalendtransaction2))).intValue()];
        internalendtransaction2.valueOf(bArr22);
        java.lang.String str42 = (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bArr22}, 935379601, -935379550, (int) java.lang.System.currentTimeMillis());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -798371973, 798372037, (int) java.lang.System.currentTimeMillis())).longValue());
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        a(new int[]{337, 1, 0, 0}, "\u0000", true, objArr22);
        sb2.append(((java.lang.String) objArr22[0]).intern());
        sb2.append(str42);
        java.lang.String obj2 = sb2.toString();
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        b("᧢ꗾ懋ⷍ\ue9fb", android.text.TextUtils.getOffsetAfter("", 0) + 48157, objArr32);
        str2 = android.util.Base64.encodeToString(obj2.getBytes(((java.lang.String) objArr32[0]).intern()), 2);
        DigitizedCardProfile = (getAid + 107) % 128;
        i = DigitizedCardProfile + 125;
        getAid = i % 128;
        if (i % 2 == 0) {
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = DigitizedCardProfile + 47;
        getAid = i % 128;
        if (i % 2 != 0) {
            valueOf = str;
            return null;
        }
        valueOf = str;
        throw null;
    }

    static java.lang.String writeReplace() {
        int i = DigitizedCardProfile + 35;
        getAid = i % 128;
        java.lang.String str = valueOf;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static void DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson = new char[]{16873, 16786, 16809, 16789, 16789, 16810, 16801, 16831, 16804, 16808, 16811, 16800, 16800, 16805, 16789, 16784, 16831, 16887, 16711, 16720, 16751, 16722, 16727, 16751, 16718, 16830, 16728, 16746, 16724, 16733, 16616, 16615, 16616, 16586, 16584, 16616, 16618, 16616, 16620, 16596, 16592, 16620, 16616, 16614, 16622, 16773, 16728, 16731, 16732, 16870, 16796, 16794, 16862, 16867, 16798, 16804, 16805, 16808, 16807, 16807, 16786, 16868, 16789, 16789, 16793, 16793, 16797, 16888, 16830, 16772, 16887, 16789, 16805, 16829, 16803, 16802, 16829, 16772, 16775, 16802, 16807, 16831, 16772, 16773, 16830, 16800, 16800, 16778, 16775, 16805, 16802, 16826, 16871, 16813, 16804, 16804, 16826, 16826, 16775, 16783, 16807, 16807, 16810, 16769, 16867, 16878, 16867, 16883, 16780, 16803, 16830, 16808, 16789, 16783, 16872, 16880, 16876, 16789, 16828, 16830, 16830, 16775, 16775, 16802, 16807, 16807, 16808, 16805, 16804, 16781, 16775, 16805, 16805, 16829, 16803, 16802, 16829, 16843, 16724, 16634, 16636, 16634, 16638, 16637, 16633, 16637, 16632, 16639, 16634, 16628, 16623, 16883, 16796, 16884, 16786, 16802, 16828, 16826, 16862, 16867, 16794, 16804, 16804, 16805, 16802, 16830, 16806, 16782, 16780, 16808, 16800, 16772, 16775, 16800, 16778, 16775, 16800, 16806, 16784, 16892, 16796, 16894, 16867, 16867, 16772, 16829, 16802, 16803, 16829, 16805, 16805, 16775, 16777, 16831, 16772, 16781, 16811, 16805, 16775, 16775, 16805, 16810, 16805, 16830, 16777, 16781, 16804, 16805, 16808, 16715, 16699, 16703, 16589, 16688, 16697, 16688, 16700, 16700, 16688, 16694, 16771, 16714, 16714, 16734, 16715, 16706, 16704, 16707, 16728, 16735, 16710, 16712, 16705, 16705, 16707, 16730, 16734, 16704, 16734, 16848, 16884, 16884, 16778, 16712, 16717, 16809, 16785, 16819, 16708, 16713, 16717, 16824, 16824, 16806, 16786, 16819, 16710, 16715, 16712, 16871, 16796, 16773, 16771, 16783, 16882, 16777, 16773, 16770, 16778, 16779, 16884, 16780, 16882, 16777, 16831, 16772, 16782, 16804, 16804, 16812, 16780, 16777, 16800, 16802, 16800, 16828, 16805, 16803, 16773, 16781, 16804, 16805, 16800, 16826, 16802, 16802, 16775, 16864, 16864, 16894, 16772, 16772, 16780, 16886, 16883, 16768, 16770, 16867, 16883, 16780, 16810, 16807, 16830, 16829, 16826, 16802, 16789, 16887, 16892, 16777, 16891, 16872, 16867, 16867, 16867, 16867, 16872, 16777, 16800, 16802, 16800, 16805, 16810, 16807, 16800, 16800, 16791, 16851, 16809, 16661, 16691, 16599, 16623, 16620, 16598, 16603, 16598, 16600, 16578, 16703, 16685, 16693, 16596, 16598, 16689, 16583, 16596, 16602, 16703, 16699, 16599, 16700, 16699, 16594, 16596, 16594, 16622, 16598, 16604, 16597, 16578};
        writeReplace = -8733411746914275521L;
    }

    static void DigitizedCardProfile(java.lang.String str) {
        values(new java.lang.Object[]{str}, 1204300104, -1204300104, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -107, com.google.common.base.Ascii.SUB, -98};
        $$b = 31;
    }
}
