package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTranscriptMode implements com.payair.hce.visa.tokenization.VisaTokenization {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int getProfileVersion;
    private static long valueOf;
    private static char[] values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 39 - (s * 2);
        int i5 = b + 1;
        byte[] bArr = $$a;
        int i6 = 718 - i;
        char[] cArr = new char[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 = (i6 + (-i7)) - 2;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i4];
            i6 = (i6 + (-i7)) - 2;
            i2 = i3;
            i4++;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i4++;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = 3 - (b * 4);
        int i3 = s2 * 3;
        int i4 = 119 - (s * 2);
        byte[] bArr2 = new byte[1 - i3];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i4 += i2;
            i2 = i5;
            i = i6;
            int i7 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            i5 = i7;
            i2 = bArr[i7];
            i6 = i8;
            i4 += i2;
            i2 = i5;
            i = i6;
            int i72 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == 0 - i3) {
            }
        } else {
            i = 0;
            int i722 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == 0 - i3) {
            }
        }
    }

    @Override // com.payair.hce.visa.tokenization.VisaTokenization
    public final void startTokenize(java.lang.String str) {
        int i = getProfileVersion + 99;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.payair.hce.setLayoutMode setlayoutmode = com.payair.hce.setLayoutMode.INSTANCE;
            com.payair.hce.setLayoutMode.values(new java.lang.Object[]{str}, 82619533, -82619533, (int) java.lang.System.currentTimeMillis());
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.payair.hce.setLayoutMode setlayoutmode2 = com.payair.hce.setLayoutMode.INSTANCE;
        com.payair.hce.setLayoutMode.values(new java.lang.Object[]{str}, 82619533, -82619533, (int) java.lang.System.currentTimeMillis());
        int i2 = DigitizedCardProfile + 111;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.visa.tokenization.VisaTokenization
    public final com.payair.hce.communication.JsonResponse completeTokenize(long j, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType protectionType = com.payair.hce.visa.dao.RequestCompleteTokenizeDto.ProtectionType.TEE;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.payair.hce.visa.dao.RequestCompleteTokenizeDto.PresentationType.NFC_HCE);
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform platform = com.payair.hce.visa.dao.RequestCompleteTokenizeDto.Platform.ANDROID;
        com.payair.hce.setAnimationCacheEnabled setanimationcacheenabled = com.payair.hce.setAnimationCacheEnabled.INSTANCE;
        com.payair.hce.setWebViewRenderProcessClient writeReplace2 = com.payair.hce.setAnimationCacheEnabled.writeReplace();
        if (writeReplace2 == null) {
            writeReplace2 = new com.payair.hce.setWebViewRenderProcessClient(null, null, null);
        }
        com.payair.hce.visa.dao.RequestCompleteTokenizeDto requestCompleteTokenizeDto = new com.payair.hce.visa.dao.RequestCompleteTokenizeDto(j, protectionType, listOf, platform, writeReplace2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\n\u0001\u000b\u0006\u0003\u000f\b\u0006\r\t\u0005\b\u000f\u0002\u000e\t\u0007\u000e\u0000\u0004\u000f\f\u0002\u0007\u0005\b\u0006\u0005", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 81), objArr);
        java.lang.String format = java.lang.String.format(((java.lang.String) objArr[0]).intern(), java.util.Arrays.copyOf(new java.lang.Object[]{com.payair.hce.HCERegistration.getPaymentAppInstanceId(), str}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        com.payair.hce.communication.JsonRequest jsonRequest = new com.payair.hce.communication.JsonRequest(format, requestCompleteTokenizeDto);
        com.payair.hce.setLayoutAnimation setlayoutanimation = com.payair.hce.setLayoutAnimation.INSTANCE;
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) com.payair.hce.setLayoutAnimation.valueOf(new java.lang.Object[]{jsonRequest, new com.payair.hce.visa.dao.ResponseCompleteTokenizeDto(null, null, null, null, null, null, 63, null), 1}, -158232939, 158232939, (int) java.lang.System.currentTimeMillis());
        if (jsonResponse.isSuccessful() && (jsonResponse instanceof com.payair.hce.visa.dao.ResponseCompleteTokenizeDto)) {
            com.payair.hce.setLayoutMode setlayoutmode = com.payair.hce.setLayoutMode.INSTANCE;
            com.payair.hce.setLayoutMode.values(new java.lang.Object[0], -1111619702, 1111619703, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.visa.dao.ResponseCompleteTokenizeDto responseCompleteTokenizeDto = (com.payair.hce.visa.dao.ResponseCompleteTokenizeDto) jsonResponse;
            byte[] decode = android.util.Base64.decode(responseCompleteTokenizeDto.getVisaProvisioningResponse(), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCharset, "");
            com.visa.cbp.external.enp.ProvisionResponse provisionResponse = (com.visa.cbp.external.enp.ProvisionResponse) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(new java.lang.String(decode, defaultCharset), com.visa.cbp.external.enp.ProvisionResponse.class);
            android.content.Context context = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(provisionResponse, "");
            writeReplace(context, provisionResponse, str2, responseCompleteTokenizeDto.getNetworkTokenReference());
        }
        return jsonResponse;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11;
        int i3 = i2 + 11;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            int i4 = i2 + 1;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $10 = ($11 + 27) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i5 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 40, 1920 - android.os.Process.getGidForName(""), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e((short) 1, (byte) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, android.text.TextUtils.getOffsetAfter("", 0) + 429, (char) (android.os.Process.getGidForName("") + 31611));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e((short) 0, (byte) 0, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0172, code lost:
    
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void writeReplace(android.content.Context context, com.visa.cbp.external.enp.ProvisionResponse provisionResponse, java.lang.String str, java.lang.String str2) {
        byte[] bytes;
        com.payair.hce.HCEEventListener hCEEventListener;
        java.lang.String str3 = "Unknown Error";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        try {
            com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
            com.payair.hce.setFindListener setfindlistener = (com.payair.hce.setFindListener) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -727777032, 727777033, (int) java.lang.System.currentTimeMillis());
            com.visa.cbp.sdk.facade.data.TokenKey tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) com.payair.hce.setFindListener.values(new java.lang.Object[]{setfindlistener, context, provisionResponse, str}, 255558423, -255558421, java.lang.System.identityHashCode(setfindlistener));
            com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
            com.payair.hce.setFindListener setfindlistener2 = (com.payair.hce.setFindListener) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -727777032, 727777033, (int) java.lang.System.currentTimeMillis());
            com.visa.cbp.external.enp.ProvisionAckRequest provisionAckRequest = (com.visa.cbp.external.enp.ProvisionAckRequest) com.payair.hce.setFindListener.values(new java.lang.Object[]{setfindlistener2, context, tokenKey}, -548111714, 548111715, java.lang.System.identityHashCode(setfindlistener2));
            java.lang.String api = provisionAckRequest.getApi();
            com.payair.hce.setSelectedChildViewEnabled setselectedchildviewenabled = com.payair.hce.setSelectedChildViewEnabled.SUCCESS;
            java.lang.String failureReason = provisionAckRequest.getFailureReason();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(api, "");
            com.payair.hce.setScrollingCacheEnabled setscrollingcacheenabled = new com.payair.hce.setScrollingCacheEnabled(api, str2, setselectedchildviewenabled, failureReason, null, null, 48, null);
            com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
            com.payair.hce.communication.JsonResponse DigitizedCardProfile2 = com.payair.hce.setHorizontalScrollbarOverlay.DigitizedCardProfile(setscrollingcacheenabled, str2);
            if (DigitizedCardProfile2.isSuccessful()) {
                getProfileVersion = (DigitizedCardProfile + 103) % 128;
                com.payair.hce.HCEEventListener hCEEventListener2 = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                if (hCEEventListener2 != null) {
                    byte[] bytes2 = str2.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    hCEEventListener2.onCardProvisionCompleted(bytes2);
                    int i = getProfileVersion + 55;
                    DigitizedCardProfile = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                return;
            }
            java.util.List<com.payair.hce.ErrorModel> errors = DigitizedCardProfile2.getErrors();
            if (errors != null) {
                DigitizedCardProfile = (getProfileVersion + 23) % 128;
                if (!errors.isEmpty()) {
                    str3 = DigitizedCardProfile2.getErrors().get(0).getDescription();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
                    hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                    if (hCEEventListener == null) {
                        DigitizedCardProfile = (getProfileVersion + 91) % 128;
                        byte[] bytes3 = java.lang.String.valueOf(DigitizedCardProfile2.getStatusCode()).getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "");
                        byte[] bytes4 = str3.getBytes(kotlin.text.Charsets.UTF_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes4, "");
                        try {
                            hCEEventListener.onCardProvisionFailure(bytes3, bytes4, (java.lang.Exception) java.lang.Exception.class.getDeclaredConstructor(null).newInstance(null));
                            return;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    return;
                }
            }
            getProfileVersion = (DigitizedCardProfile + 35) % 128;
            hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
            if (hCEEventListener == null) {
            }
        } catch (java.lang.Exception e) {
            com.payair.hce.HCEEventListener hCEEventListener3 = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
            if (hCEEventListener3 == null) {
                int i2 = getProfileVersion + 109;
                DigitizedCardProfile = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
            byte[] bytes5 = "9093".getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes5, "");
            java.lang.String message = e.getMessage();
            if (message != null) {
                DigitizedCardProfile = (getProfileVersion + 7) % 128;
                bytes = message.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            }
            bytes = "Unknown Error".getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            hCEEventListener3.onCardProvisionFailure(bytes5, bytes, e);
        }
    }

    private static void d(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i;
        java.lang.String str2 = str;
        int i2 = $11;
        $10 = (i2 + 1) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            int i3 = i2 + 87;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 63) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = writeReplace;
        if (cArr2 != null) {
            int i8 = $10 + 95;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2807, (char) android.view.View.combineMeasuredStates(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e((short) 5, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr[i] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i++;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 44, 2837 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        e((short) 6, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    $11 = ($10 + 47) % 128;
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2880, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte length2 = (byte) $$d.length;
                        byte b = (byte) (length2 - 4);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        e(length2, b, b, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777182) - android.graphics.Color.rgb(0, 0, 0), 260 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.MeasureSpec.getMode(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i11 = $11 + 55;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                char[] cArr5 = new char[i5];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 1, i5);
                java.lang.System.arraycopy(cArr5, 0, cArr3, i5 >> i7, i7);
                java.lang.System.arraycopy(cArr5, i7, cArr3, 1, i5 << i7);
            } else {
                char[] cArr6 = new char[i5];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i12 = i5 - i7;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i12, i7);
                java.lang.System.arraycopy(cArr6, i7, cArr3, 0, i12);
            }
        }
        if (z) {
            int i13 = $10 + 45;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr7 = new char[i5];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i5) {
                $10 = ($11 + 41) % 128;
                cArr7[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i5) {
                $10 = ($11 + 69) % 128;
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        if (str != null) {
            $11 = ($10 + 45) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = values;
        int i3 = 6;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                $10 = ($11 + 53) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), ((android.os.Process.getThreadPriority(0) + 20) >> i3) + 2508, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 6803));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e((short) 27, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 6;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c2 = '\b';
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.indexOf("", "", 0) + 2508, (char) (6801 - android.view.MotionEvent.axisFromString("")));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e((short) 27, (byte) 0, (short) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[c2] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3595 - android.os.Process.getGidForName(""), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $11 = ($10 + 29) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2665 - android.text.TextUtils.indexOf("", "", 0), (char) (18889 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            e((short) 23, (byte) 0, (short) 0, objArr8);
                            c = '\b';
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = '\b';
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i5 * charValue) + i6];
                    } else {
                        c = '\b';
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i7 = digitizedCardJson12.DigitizedCardProfile;
                            int i8 = digitizedCardJson12.RecordsJson;
                            int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr5[digitizedCardJson12.values] = cArr3[(i7 * charValue) + i8];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i9 * charValue) + i10];
                        } else {
                            int i11 = digitizedCardJson12.DigitizedCardProfile;
                            int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i14 = digitizedCardJson12.RecordsJson;
                            cArr5[digitizedCardJson12.values] = cArr3[(i11 * charValue) + i12];
                            cArr5[digitizedCardJson12.values + 1] = cArr3[(i13 * charValue) + i14];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                c2 = c;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            cArr5[i15] = (char) (cArr5[i15] ^ 13722);
            i15++;
            $11 = ($10 + 37) % 128;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void values() {
        valueOf = 7962109367951681767L;
        writeReplace = new char[]{16734, 16612, 16612, 16620, 16623, 16615, 16610, 16608, 16604, 16583, 16616, 16610, 16638, 16613, 16615, 16617, 16585, 16605, 16637, 16614, 16618, 16580, 16579, 16608, 16615, 16583, 16582, 16612, 16612, 16620, 16583, 16582, 16612, 16612, 16620, 16583, 16881, 16818, 16794, 16794, 16822, 16818, 16719, 16790, 16792, 16824, 16830, 16827, 16826, 16828, 16826, 16820, 16890, 16803, 16776, 16707, 16714, 16717, 16707, 16873, 16717, 16764, 16762, 16764, 16822, 16702, 16699, 16690, 16692, 16889, 16802, 16802, 16802, 16829, 16753, 16761, 16761, 16759, 16685, 16687, 16660, 16684, 16687, 16758, 16752, 16678, 16655, 16759, 16661, 16657, 16687, 16658, 16644, 16767, 16649, 16676, 16685, 16661, 16686, 16681, 16782, 16819, 16817, 16718, 16821, 16719, 16806, 16812, 16719, 16716, 16714, 16710, 16714, 16813, 16808, 16713, 16716, 16809, 16806, 16788, 16644, 16687, 16657, 16687, 16684, 16659, 16685, 16799, 16757, 16643, 16645, 16666, 16651, 16754, 16644, 16642, 16647, 16642, 16668, 16653, 16653, 16670, 16640, 16668};
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        DigitizedCardProfile = 0;
        getProfileVersion = 1;
        values();
        values = new char[]{12331, 12332, 12334, 12325, 12345, 12399, 12324, 12348, 12352, 12389, 12335, 12329, 12336, 12321, 12350, 12323};
        AlternateContactlessPaymentDataJson = (char) 1492;
        DigitizedCardProfile = (getProfileVersion + 1) % 128;
    }

    static void init$1() {
        $$d = new byte[]{117, -82, -100, com.visa.cbp.getEncExpo.onUnminimized};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{94, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.CAN, 122, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5};
        $$b = 89;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v424 ?? I:??[int, boolean]), method size: 9807
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object[] valueOf(android.content.Context r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 9807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.setTranscriptMode.valueOf(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
