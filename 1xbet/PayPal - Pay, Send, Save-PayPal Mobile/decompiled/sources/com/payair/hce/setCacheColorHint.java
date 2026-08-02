package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0018J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0019J\u0017\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u001b"}, d2 = {"Lcom/payair/hce/setCacheColorHint;", "", "<init>", "()V", "", "p0", "Lcom/payair/hce/communication/JsonResponse;", "writeReplace", "(Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/hce/setFastScrollAlwaysVisible;", "Landroid/content/Context;", "p1", "Lcom/visa/cbp/sdk/facade/data/TokenKey;", "p2", "", "DigitizedCardProfile", "(Lcom/payair/hce/setFastScrollAlwaysVisible;Landroid/content/Context;Lcom/visa/cbp/sdk/facade/data/TokenKey;)Z", "Lcom/visa/cbp/sdk/facade/data/TokenData;", "values", "(Landroid/content/Context;Lcom/visa/cbp/sdk/facade/data/TokenData;)Lcom/payair/hce/communication/JsonResponse;", "(Landroid/content/Context;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "", "valueOf", "(Landroid/content/Context;)V", "(Landroid/content/Context;Lcom/visa/cbp/sdk/facade/data/TokenKey;)V", "(Landroid/content/Context;Lcom/visa/cbp/sdk/facade/data/TokenKey;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "(Ljava/lang/String;)V", "(Landroid/content/Context;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setCacheColorHint {
    private static int AlternateContactlessPaymentDataJson = 1;
    public static final com.payair.hce.setCacheColorHint INSTANCE = new com.payair.hce.setCacheColorHint();
    private static int values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        switch ((i * (-949)) + (i2 * (-949)) + (((~((~i2) | i4)) | (~((~i) | i3))) * 1900) + (((~(i4 | i)) | (~(i2 | i3))) * (-950)) + (((~(i | i3)) | (~(i2 | i4))) * 950)) {
            case 1:
                return valueOf(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 6:
                return getProfileVersion(objArr);
            case 7:
                java.lang.String str = (java.lang.String) objArr[0];
                com.payair.hce.communication.JsonResponse jsonResponse = new com.payair.hce.communication.JsonResponse();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Replenishment for ntr: ");
                sb.append(str);
                sb.append(" failed");
                jsonResponse.setErrors(kotlin.collections.CollectionsKt.listOf(new com.payair.hce.ErrorModel("9091", "REPLENISHMENT_ERROR", sb.toString())));
                jsonResponse.setSuccessful(false);
                int i5 = AlternateContactlessPaymentDataJson & 51;
                values = ((i5 - (~((r4 ^ 51) | i5))) - 1) % 128;
                return jsonResponse;
            case 8:
                return RecordsJson(objArr);
            default:
                return values(objArr);
        }
    }

    private setCacheColorHint() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.communication.JsonResponse jsonResponse;
        android.content.Context context = (android.content.Context) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = values;
        int i2 = (((i | 10) << 1) - (i ^ 10)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
            throw new java.lang.ArithmeticException();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
        com.visa.cbp.sdk.facade.data.TokenData tokenData = (com.visa.cbp.sdk.facade.data.TokenData) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, str}, -550736711, 550736720, (int) java.lang.System.currentTimeMillis());
        if (tokenData != null) {
            com.payair.hce.setCacheColorHint setcachecolorhint = INSTANCE;
            jsonResponse = (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcachecolorhint, context, tokenData}, -982784148, 982784148, java.lang.System.identityHashCode(setcachecolorhint));
        }
        jsonResponse = new com.payair.hce.communication.JsonResponse();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Token with ntr ");
        sb.append(str);
        sb.append(" not found");
        jsonResponse.setErrors(kotlin.collections.CollectionsKt.listOf(new com.payair.hce.ErrorModel("9091", "REPLENISHMENT_ERROR", sb.toString())));
        jsonResponse.setSuccessful(false);
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, 1180313016, -1180313008, (int) java.lang.System.currentTimeMillis());
        int i3 = values;
        int i4 = i3 & 75;
        AlternateContactlessPaymentDataJson = ((((i3 ^ 75) | i4) << 1) - ((i3 | 75) & (~i4))) % 128;
        int i5 = AlternateContactlessPaymentDataJson;
        int i6 = i5 & 13;
        int i7 = i6 + ((i5 ^ 13) | i6);
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return jsonResponse;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[1];
        com.visa.cbp.sdk.facade.data.TokenData tokenData = (com.visa.cbp.sdk.facade.data.TokenData) objArr[2];
        int i = AlternateContactlessPaymentDataJson;
        values = (((i | 69) << 1) - (i ^ 69)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenData, "");
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = tokenData.getTokenKey();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey, "");
        java.lang.String vProvisionedTokenID = tokenData.getVProvisionedTokenID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(vProvisionedTokenID, "");
        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{context, tokenKey, vProvisionedTokenID}, -1839922607, 1839922613, (int) java.lang.System.currentTimeMillis());
        int i2 = AlternateContactlessPaymentDataJson + 91;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return jsonResponse;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        java.lang.String str;
        com.payair.hce.HCEEventListener hCEEventListener;
        android.content.Context context = (android.content.Context) objArr[0];
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        int i = values;
        AlternateContactlessPaymentDataJson = ((i & 105) + (i | 105)) % 128;
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.visa.cbp.external.aam.ReplenishRequest replenishRequest = (com.visa.cbp.external.aam.ReplenishRequest) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, tokenKey}, 887036038, -887036014, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
        if (((java.lang.Boolean) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, tokenKey}, -680684942, 680684969, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i2 = values;
            int i3 = (i2 & (-58)) | ((~i2) & 57);
            int i4 = (i2 & 57) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            AlternateContactlessPaymentDataJson = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (replenishRequest != null) {
                com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
                java.lang.String jWTToken = com.payair.hce.HCEManager.getJWTToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jWTToken, "");
                com.payair.hce.setFastScrollAlwaysVisible DigitizedCardProfile = com.payair.hce.setHorizontalScrollbarOverlay.DigitizedCardProfile(replenishRequest, str2, jWTToken);
                if (DigitizedCardProfile.isSuccessful()) {
                    int i6 = AlternateContactlessPaymentDataJson;
                    int i7 = (i6 & 115) + (i6 | 115);
                    values = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    if (!((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile, context, tokenKey}, -2045851945, 2045851946, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                        com.payair.hce.communication.JsonResponse jsonResponse = (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{str2}, -1191297753, 1191297760, (int) java.lang.System.currentTimeMillis());
                        AlternateContactlessPaymentDataJson(new java.lang.Object[]{str2}, 1180313016, -1180313008, (int) java.lang.System.currentTimeMillis());
                        int i8 = values;
                        int i9 = (i8 & 41) + (i8 | 41);
                        AlternateContactlessPaymentDataJson = i9 % 128;
                        if (i9 % 2 != 0) {
                            return jsonResponse;
                        }
                        throw null;
                    }
                    com.payair.hce.setNetworkAvailable setnetworkavailable3 = com.payair.hce.setNetworkAvailable.values;
                    com.visa.cbp.external.aam.ReplenishAckRequest replenishAckRequest = (com.visa.cbp.external.aam.ReplenishAckRequest) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, tokenKey}, 1487873669, -1487873651, (int) java.lang.System.currentTimeMillis());
                    if (replenishAckRequest == null) {
                        int i10 = values;
                        int i11 = i10 & 19;
                        int i12 = i10 | 19;
                        AlternateContactlessPaymentDataJson = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                        com.payair.hce.communication.JsonResponse jsonResponse2 = (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{str2}, -1191297753, 1191297760, (int) java.lang.System.currentTimeMillis());
                        AlternateContactlessPaymentDataJson(new java.lang.Object[]{str2}, 1180313016, -1180313008, (int) java.lang.System.currentTimeMillis());
                        int i13 = AlternateContactlessPaymentDataJson;
                        int i14 = (((i13 | 55) << 1) - (~(-((i13 & (-56)) | ((~i13) & 55))))) - 1;
                        values = i14 % 128;
                        if (i14 % 2 == 0) {
                            return jsonResponse2;
                        }
                        throw null;
                    }
                    com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay2 = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
                    java.lang.String jWTToken2 = com.payair.hce.HCEManager.getJWTToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jWTToken2, "");
                    com.payair.hce.communication.JsonResponse DigitizedCardProfile2 = com.payair.hce.setHorizontalScrollbarOverlay.DigitizedCardProfile(replenishAckRequest, str2, jWTToken2);
                    if (DigitizedCardProfile2.isSuccessful()) {
                        int i15 = AlternateContactlessPaymentDataJson;
                        int i16 = i15 & 21;
                        int i17 = ((i15 ^ 21) | i16) << 1;
                        int i18 = -((i15 | 21) & (~i16));
                        values = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                        com.payair.hce.HCEEventListener hCEEventListener2 = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                        if (hCEEventListener2 != null) {
                            int i19 = AlternateContactlessPaymentDataJson;
                            int i20 = i19 & 19;
                            int i21 = i19 | 19;
                            values = ((i20 ^ i21) + ((i21 & i20) << 1)) % 128;
                            byte[] bytes = str2.getBytes(kotlin.text.Charsets.UTF_8);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                            hCEEventListener2.onReplenishCompleted(bytes, 0);
                            int i22 = AlternateContactlessPaymentDataJson;
                            int i23 = (i22 & (-60)) | ((~i22) & 59);
                            int i24 = -(-((i22 & 59) << 1));
                            values = ((i23 ^ i24) + ((i24 & i23) << 1)) % 128;
                        }
                    } else {
                        AlternateContactlessPaymentDataJson(new java.lang.Object[]{str2}, 1180313016, -1180313008, (int) java.lang.System.currentTimeMillis());
                        int i25 = AlternateContactlessPaymentDataJson;
                        values = (((i25 ^ 120) + ((i25 & 120) << 1)) - 1) % 128;
                    }
                    int i26 = values;
                    int i27 = ((i26 ^ 43) | (i26 & 43)) << 1;
                    int i28 = -((i26 & (-44)) | ((~i26) & 43));
                    AlternateContactlessPaymentDataJson = ((i27 ^ i28) + ((i28 & i27) << 1)) % 128;
                    return DigitizedCardProfile2;
                }
                com.payair.hce.communication.JsonResponse jsonResponse3 = (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{str2}, -1191297753, 1191297760, (int) java.lang.System.currentTimeMillis());
                java.util.List<com.payair.hce.ErrorModel> errors = DigitizedCardProfile.getErrors();
                if (errors != null) {
                    int i29 = values;
                    int i30 = i29 & 65;
                    int i31 = (((i29 ^ 65) | i30) << 1) - ((i29 | 65) & (~i30));
                    AlternateContactlessPaymentDataJson = i31 % 128;
                    if (i31 % 2 == 0) {
                        errors.isEmpty();
                        throw null;
                    }
                    if (!errors.isEmpty()) {
                        int i32 = values;
                        int i33 = i32 & 37;
                        int i34 = ((((i32 ^ 37) | i33) << 1) - ((i32 | 37) & (~i33))) % 128;
                        AlternateContactlessPaymentDataJson = i34;
                        int i35 = i34 & 1;
                        int i36 = i34 | 1;
                        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                        values = i37 % 128;
                        if (i37 % 2 != 0) {
                            str = DigitizedCardProfile.getErrors().get(0).getDescription();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        } else {
                            str = DigitizedCardProfile.getErrors().get(0).getDescription();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        }
                        hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                        if (hCEEventListener == null) {
                            int i38 = values;
                            int i39 = i38 ^ 59;
                            int i40 = (i38 & 59) << 1;
                            AlternateContactlessPaymentDataJson = ((i39 ^ i40) + ((i40 & i39) << 1)) % 128;
                            byte[] bytes2 = str2.getBytes(kotlin.text.Charsets.UTF_8);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
                            byte[] bytes3 = java.lang.String.valueOf(DigitizedCardProfile.getStatusCode()).getBytes(kotlin.text.Charsets.UTF_8);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "");
                            byte[] bytes4 = str.getBytes(kotlin.text.Charsets.UTF_8);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes4, "");
                            int i41 = values;
                            int i42 = i41 & 121;
                            AlternateContactlessPaymentDataJson = ((i42 - (~((i41 ^ 121) | i42))) - 1) % 128;
                            int i43 = ((((i41 ^ 19) | (i41 & 19)) << 1) - (~(-((i41 & (-20)) | ((~i41) & 19))))) - 1;
                            AlternateContactlessPaymentDataJson = i43 % 128;
                            try {
                                if (i43 % 2 == 0) {
                                    hCEEventListener.onReplenishFailed(bytes2, bytes3, bytes4, (java.lang.Exception) java.lang.Exception.class.getDeclaredConstructor(null).newInstance(null));
                                    throw null;
                                }
                                hCEEventListener.onReplenishFailed(bytes2, bytes3, bytes4, (java.lang.Exception) java.lang.Exception.class.getDeclaredConstructor(null).newInstance(null));
                                int i44 = values;
                                AlternateContactlessPaymentDataJson = ((i44 ^ 35) + ((i44 & 35) << 1)) % 128;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } else {
                            int i45 = AlternateContactlessPaymentDataJson;
                            int i46 = i45 ^ 85;
                            int i47 = (i45 & 85) << 1;
                            values = ((i46 ^ i47) + ((i47 & i46) << 1)) % 128;
                        }
                        values = (AlternateContactlessPaymentDataJson + 61) % 128;
                        return jsonResponse3;
                    }
                }
                int i48 = AlternateContactlessPaymentDataJson;
                int i49 = i48 & 59;
                int i50 = i48 | 59;
                int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
                values = i51 % 128;
                if (i51 % 2 != 0) {
                    int i52 = 5 / 4;
                }
                values = (i48 + 55) % 128;
                str = "Unknown Error";
                hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
                if (hCEEventListener == null) {
                }
                values = (AlternateContactlessPaymentDataJson + 61) % 128;
                return jsonResponse3;
            }
        }
        com.payair.hce.communication.JsonResponse jsonResponse4 = new com.payair.hce.communication.JsonResponse();
        jsonResponse4.setSuccessful(false);
        jsonResponse4.setStatusCode(9944);
        jsonResponse4.setStatusCodeFromServer(9944);
        values = (AlternateContactlessPaymentDataJson + 87) % 128;
        return jsonResponse4;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.util.List list;
        android.content.Context context = (android.content.Context) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i | 111;
        int i3 = i2 << 1;
        int i4 = -((~(i & 111)) & i2);
        values = ((i3 & i4) + (i4 | i3)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
            list = (java.util.List) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context}, -1281232990, 1281233025, (int) java.lang.System.currentTimeMillis());
            int i5 = values;
            int i6 = i5 ^ 37;
            int i7 = ((i5 & 37) | i6) << 1;
            int i8 = -i6;
            AlternateContactlessPaymentDataJson = ((i7 & i8) + (i7 | i8)) % 128;
        } catch (com.payair.hce.setTextAlignment unused) {
            com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context}, 1729473102, -1729473077, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
            list = (java.util.List) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context}, -1281232990, 1281233025, (int) java.lang.System.currentTimeMillis());
        }
        java.util.Iterator it = list.iterator();
        AlternateContactlessPaymentDataJson = (values + 107) % 128;
        while (it.hasNext()) {
            int i9 = AlternateContactlessPaymentDataJson;
            int i10 = i9 & 25;
            int i11 = (i9 | 25) & (~i10);
            int i12 = i10 << 1;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            values = i13 % 128;
            if (i13 % 2 != 0) {
                com.visa.cbp.sdk.facade.data.TokenData tokenData = (com.visa.cbp.sdk.facade.data.TokenData) it.next();
                com.payair.hce.setNetworkAvailable setnetworkavailable3 = com.payair.hce.setNetworkAvailable.values;
                com.visa.cbp.sdk.facade.data.TokenKey tokenKey = tokenData.getTokenKey();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey, "");
                throw new java.lang.ArithmeticException();
            }
            com.visa.cbp.sdk.facade.data.TokenData tokenData2 = (com.visa.cbp.sdk.facade.data.TokenData) it.next();
            com.payair.hce.setNetworkAvailable setnetworkavailable4 = com.payair.hce.setNetworkAvailable.values;
            com.visa.cbp.sdk.facade.data.TokenKey tokenKey2 = tokenData2.getTokenKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey2, "");
            if (((java.lang.Boolean) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, tokenKey2}, 118812071, -118812066, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i14 = AlternateContactlessPaymentDataJson & 69;
                int i15 = ((((r7 | 69) & (~i14)) - (~(-(-(i14 << 1))))) - 1) % 128;
                values = i15;
                int i16 = i15 & 23;
                int i17 = ((i15 | 23) & (~i16)) + (i16 << 1);
                AlternateContactlessPaymentDataJson = i17 % 128;
                if (i17 % 2 != 0) {
                    return java.lang.Boolean.TRUE;
                }
                throw null;
            }
            int i18 = AlternateContactlessPaymentDataJson;
            int i19 = i18 & 119;
            values = (i19 + ((i18 ^ 119) | i19)) % 128;
        }
        int i20 = values;
        int i21 = i20 & 97;
        int i22 = -(-((i20 ^ 97) | i21));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        AlternateContactlessPaymentDataJson = i23 % 128;
        if (i23 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setFastScrollAlwaysVisible setfastscrollalwaysvisible = (com.payair.hce.setFastScrollAlwaysVisible) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) objArr[2];
        byte[] decode = android.util.Base64.decode((java.lang.String) com.payair.hce.setFastScrollAlwaysVisible.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setfastscrollalwaysvisible}, 977178782, -977178780, java.lang.System.identityHashCode(setfastscrollalwaysvisible)), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
        java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCharset, "");
        com.visa.cbp.external.aam.ReplenishResponse replenishResponse = (com.visa.cbp.external.aam.ReplenishResponse) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(new java.lang.String(decode, defaultCharset), com.visa.cbp.external.aam.ReplenishResponse.class);
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.visa.cbp.external.common.TokenInfo tokenInfo = replenishResponse.getTokenInfo();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenInfo, "");
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, tokenKey, tokenInfo}, -1016310832, 1016310865, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i = values;
        int i2 = i & 7;
        int i3 = ((i ^ 7) | i2) << 1;
        int i4 = -((i | 7) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Boolean.valueOf(booleanValue);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = values;
        int i2 = (i & (-2)) | ((~i) & 1);
        int i3 = (i & 1) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        com.payair.hce.HCEEventListener hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
        if (hCEEventListener == null) {
            int i5 = AlternateContactlessPaymentDataJson;
            int i6 = i5 & 99;
            int i7 = ((i5 ^ 99) | i6) << 1;
            int i8 = -((i5 | 99) & (~i6));
            int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
            values = i9 % 128;
            if (i9 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i10 = values;
        AlternateContactlessPaymentDataJson = ((i10 ^ 93) + ((i10 & 93) << 1)) % 128;
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bytes2 = "9091".getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Replenishment for ntr: ");
        sb.append(str);
        sb.append(" failed");
        byte[] bytes3 = sb.toString().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "");
        int i11 = values;
        int i12 = (i11 ^ 119) + ((i11 & 119) << 1);
        AlternateContactlessPaymentDataJson = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 4 / 4;
        }
        try {
            hCEEventListener.onReplenishFailed(bytes, bytes2, bytes3, (java.lang.Exception) java.lang.Exception.class.getDeclaredConstructor(null).newInstance(null));
            int i14 = AlternateContactlessPaymentDataJson + 73;
            values = i14 % 128;
            if (i14 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.String str;
        android.content.Context context = (android.content.Context) objArr[0];
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) objArr[1];
        values = (AlternateContactlessPaymentDataJson + 97) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenKey, "");
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.visa.cbp.sdk.facade.data.TokenData tokenData = (com.visa.cbp.sdk.facade.data.TokenData) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, tokenKey}, -1064275860, 1064275881, (int) java.lang.System.currentTimeMillis());
        if (tokenData != null) {
            int i = values;
            int i2 = i & 63;
            int i3 = ((i | 63) & (~i2)) + (i2 << 1);
            AlternateContactlessPaymentDataJson = i3 % 128;
            if (i3 % 2 == 0) {
                tokenData.getVProvisionedTokenID();
                throw null;
            }
            str = tokenData.getVProvisionedTokenID();
            int i4 = values;
            int i5 = i4 & 95;
            int i6 = (i4 | 95) & (~i5);
            int i7 = i5 << 1;
            AlternateContactlessPaymentDataJson = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
        } else {
            int i8 = AlternateContactlessPaymentDataJson;
            int i9 = i8 ^ 47;
            values = ((((i8 & 47) | i9) << 1) - i9) % 128;
            str = null;
        }
        if (str != null) {
            int i10 = AlternateContactlessPaymentDataJson + 77;
            values = i10 % 128;
            if (i10 % 2 != 0) {
                com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
                java.lang.String jWTToken = com.payair.hce.HCEManager.getJWTToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jWTToken, "");
                ((com.payair.hce.setMultiChoiceModeListener) com.payair.hce.setHorizontalScrollbarOverlay.values(new java.lang.Object[]{str, jWTToken}, 535291166, -535291166, (int) java.lang.System.currentTimeMillis())).isSuccessful();
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay2 = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
            java.lang.String jWTToken2 = com.payair.hce.HCEManager.getJWTToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jWTToken2, "");
            com.payair.hce.setMultiChoiceModeListener setmultichoicemodelistener = (com.payair.hce.setMultiChoiceModeListener) com.payair.hce.setHorizontalScrollbarOverlay.values(new java.lang.Object[]{str, jWTToken2}, 535291166, -535291166, (int) java.lang.System.currentTimeMillis());
            if (setmultichoicemodelistener.isSuccessful()) {
                com.visa.cbp.external.common.ReplenishODAResponse valueOf = com.payair.hce.setItemChecked.valueOf(setmultichoicemodelistener);
                com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
                com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context, tokenKey, valueOf}, -633995140, 633995170, (int) java.lang.System.currentTimeMillis());
                int i11 = AlternateContactlessPaymentDataJson;
                values = (((i11 | 79) << 1) - (i11 ^ 79)) % 128;
            }
        }
        int i12 = values;
        int i13 = i12 & 5;
        AlternateContactlessPaymentDataJson = ((((i12 ^ 5) | i13) << 1) - ((i12 | 5) & (~i13))) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i ^ 65) + ((i & 65) << 1);
        values = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
                ((java.util.List) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context}, -1281232990, 1281233025, (int) java.lang.System.currentTimeMillis())).iterator();
                throw new java.lang.ArithmeticException();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
            java.util.Iterator it = ((java.util.List) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context}, -1281232990, 1281233025, (int) java.lang.System.currentTimeMillis())).iterator();
            while (it.hasNext()) {
                int i3 = (-2) - (~(values + 2));
                AlternateContactlessPaymentDataJson = i3 % 128;
                if (i3 % 2 == 0) {
                    com.visa.cbp.sdk.facade.data.TokenData tokenData = (com.visa.cbp.sdk.facade.data.TokenData) it.next();
                    com.visa.cbp.sdk.facade.data.TokenKey tokenKey = tokenData.getTokenKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey, "");
                    java.lang.String vProvisionedTokenID = tokenData.getVProvisionedTokenID();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(vProvisionedTokenID, "");
                    throw new java.lang.ArithmeticException();
                }
                com.visa.cbp.sdk.facade.data.TokenData tokenData2 = (com.visa.cbp.sdk.facade.data.TokenData) it.next();
                com.visa.cbp.sdk.facade.data.TokenKey tokenKey2 = tokenData2.getTokenKey();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey2, "");
                java.lang.String vProvisionedTokenID2 = tokenData2.getVProvisionedTokenID();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(vProvisionedTokenID2, "");
            }
            int i4 = AlternateContactlessPaymentDataJson;
            int i5 = i4 & 45;
            int i6 = -(-((i4 ^ 45) | i5));
            values = ((i5 & i6) + (i6 | i5)) % 128;
            return null;
        } catch (com.payair.hce.setTextAlignment unused) {
            return null;
        }
    }

    static {
        int i = values;
        AlternateContactlessPaymentDataJson = ((i ^ 25) + ((i & 25) << 1)) % 128;
    }

    public static void DigitizedCardProfile(android.content.Context p0, com.visa.cbp.sdk.facade.data.TokenKey p1) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0, p1}, -2021733763, 2021733765, (int) java.lang.System.currentTimeMillis());
    }

    private static com.payair.hce.communication.JsonResponse writeReplace(java.lang.String p0) {
        return (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0}, -1191297753, 1191297760, (int) java.lang.System.currentTimeMillis());
    }

    private static void values(java.lang.String p0) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0}, 1180313016, -1180313008, (int) java.lang.System.currentTimeMillis());
    }

    private static boolean DigitizedCardProfile(com.payair.hce.setFastScrollAlwaysVisible p0, android.content.Context p1, com.visa.cbp.sdk.facade.data.TokenKey p2) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0, p1, p2}, -2045851945, 2045851946, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean values(android.content.Context p0) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0}, 1404943770, -1404943766, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    private static com.payair.hce.communication.JsonResponse writeReplace(android.content.Context p0, com.visa.cbp.sdk.facade.data.TokenKey p1, java.lang.String p2) {
        return (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0, p1, p2}, -1839922607, 1839922613, (int) java.lang.System.currentTimeMillis());
    }

    public final com.payair.hce.communication.JsonResponse values(android.content.Context p0, com.visa.cbp.sdk.facade.data.TokenData p1) {
        return (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, p0, p1}, -982784148, 982784148, java.lang.System.identityHashCode(this));
    }

    @kotlin.jvm.JvmStatic
    public static final void valueOf(android.content.Context p0) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0}, 765800420, -765800417, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final com.payair.hce.communication.JsonResponse values(android.content.Context p0, java.lang.String p1) {
        return (com.payair.hce.communication.JsonResponse) AlternateContactlessPaymentDataJson(new java.lang.Object[]{p0, p1}, 1839762790, -1839762785, (int) java.lang.System.currentTimeMillis());
    }
}
