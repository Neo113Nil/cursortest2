package com.payair.hce;

/* loaded from: classes10.dex */
public final class setFriction implements com.payair.hce.visa.reperso.VisaReperso {
    private static int values = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~i2;
        int i7 = ~(i3 | i | i6);
        int i8 = (i * 714) + (i2 * (-712)) + (((~(i2 | i4)) | (~(i4 | i5)) | i7) * (-713)) + (i7 * 1426) + ((~(i6 | i5)) * 713);
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr) : values(objArr) : writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setFriction setfriction = (com.payair.hce.setFriction) objArr[0];
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[1];
        int i = values;
        int i2 = (((i ^ 19) | (i & 19)) << 1) - ((i & (-20)) | ((~i) & 19));
        writeReplace = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object DigitizedCardProfile2 = DigitizedCardProfile(new java.lang.Object[]{setfriction, null, null, null, continuation}, -399156088, 399156089, java.lang.System.identityHashCode(setfriction));
        if (i3 == 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0154, code lost:
    
        if (r6 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setFriction.DigitizedCardProfile digitizedCardProfile;
        int i;
        int i2;
        com.payair.hce.setDataDirectorySuffix setdatadirectorysuffix;
        com.payair.hce.setFriction setfriction = (com.payair.hce.setFriction) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[3];
        int i3 = values;
        int i4 = i3 | 27;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 27)) & i4);
        int i7 = (i5 & i6) + (i6 | i5);
        writeReplace = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        if (continuation instanceof com.payair.hce.setFriction.DigitizedCardProfile) {
            digitizedCardProfile = (com.payair.hce.setFriction.DigitizedCardProfile) continuation;
            if ((digitizedCardProfile.DigitizedCardProfile & Integer.MIN_VALUE) != 0) {
                values = (writeReplace + 81) % 128;
                int i8 = digitizedCardProfile.DigitizedCardProfile;
                int identityHashCode = java.lang.System.identityHashCode(setfriction);
                int i9 = -(-(i8 * (-520)));
                int i10 = ~identityHashCode;
                int i11 = (i10 | identityHashCode) & i10;
                int i12 = ~i8;
                int i13 = (i12 & i11) | ((~i11) & i8);
                int i14 = i11 & i8;
                int i15 = ~((i14 ^ i13) | (i14 & i13));
                int i16 = ((~i15) & Integer.MIN_VALUE) | (i15 & Integer.MAX_VALUE);
                int i17 = i15 & Integer.MIN_VALUE;
                int i18 = ((i9 << 1) - i9) + (((i17 & i16) | (i17 ^ i16)) * (-1042));
                int i19 = i8 & identityHashCode;
                int i20 = -(-((i19 | ((~i19) & (i8 | identityHashCode))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                int i21 = ~(i12 | Integer.MAX_VALUE);
                int i22 = (i10 & Integer.MAX_VALUE) | (identityHashCode & Integer.MIN_VALUE);
                int i23 = identityHashCode & Integer.MAX_VALUE;
                int i24 = (i23 ^ i22) | (i23 & i22);
                int i25 = ~i24;
                int i26 = (i24 | i25) & i25;
                int i27 = i21 ^ i26;
                int i28 = i26 & i21;
                int i29 = (i28 ^ i27) | (i28 & i27);
                int i30 = Integer.MIN_VALUE | i10;
                int i31 = i30 ^ i8;
                int i32 = i8 & i30;
                int i33 = ~((i32 ^ i31) | (i32 & i31));
                digitizedCardProfile.DigitizedCardProfile = (((i18 ^ i20) + ((i20 & i18) << 1)) - (~(((i33 ^ i29) | (i33 & i29)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) - 1;
                int i34 = writeReplace;
                i = ((i34 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i34 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                values = i % 128;
                java.lang.Object obj = digitizedCardProfile.writeReplace;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = digitizedCardProfile.DigitizedCardProfile;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
                    java.lang.String jWTToken = com.payair.hce.HCEManager.getJWTToken();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jWTToken, "");
                    com.payair.hce.setDataDirectorySuffix DigitizedCardProfile2 = com.payair.hce.setHorizontalScrollbarOverlay.DigitizedCardProfile(str, jWTToken);
                    if (!DigitizedCardProfile2.isSuccessful()) {
                        setdatadirectorysuffix = DigitizedCardProfile2;
                        int i35 = values;
                        int i36 = i35 & 49;
                        writeReplace = ((((i35 ^ 49) | i36) << 1) - ((i35 | 49) & (~i36))) % 128;
                        int i37 = writeReplace;
                        values = ((i37 ^ 105) + ((i37 & 105) << 1)) % 128;
                        return setdatadirectorysuffix;
                    }
                    int i38 = values;
                    int i39 = (-2) - (~(((i38 | 52) << 1) - (i38 ^ 52)));
                    writeReplace = i39 % 128;
                    if (i39 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    java.lang.String str2 = (java.lang.String) com.payair.hce.setDataDirectorySuffix.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2}, -1069824039, 1069824040, java.lang.System.identityHashCode(DigitizedCardProfile2));
                    if (str2 != null) {
                        digitizedCardProfile.DigitizedCardProfile = 1;
                        obj = DigitizedCardProfile(new java.lang.Object[]{setfriction, context, str, str2, digitizedCardProfile}, 599245184, -599245184, java.lang.System.identityHashCode(setfriction));
                        if (obj == coroutine_suspended) {
                            int i40 = (writeReplace + 37) % 128;
                            values = i40;
                            writeReplace = (i40 + 117) % 128;
                            return coroutine_suspended;
                        }
                    }
                    com.payair.hce.communication.JsonResponse jsonResponse = new com.payair.hce.communication.JsonResponse();
                    jsonResponse.setErrors(kotlin.collections.CollectionsKt.listOf(new com.payair.hce.ErrorModel("9092", "REPERSO_ERROR", "Returned vNotificationId is null")));
                    jsonResponse.setSuccessful(false);
                    int i41 = (-2) - (~(writeReplace + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE));
                    values = i41 % 128;
                    if (i41 % 2 != 0) {
                        return jsonResponse;
                    }
                    throw new java.lang.ArithmeticException();
                }
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                writeReplace = (values + 37) % 128;
                setdatadirectorysuffix = (com.payair.hce.communication.JsonResponse) obj;
            }
        }
        digitizedCardProfile = setfriction.new DigitizedCardProfile(continuation);
        int i42 = writeReplace;
        i = ((i42 & (-66)) | ((~i42) & 65)) + ((i42 & 65) << 1);
        values = i % 128;
        java.lang.Object obj2 = digitizedCardProfile.writeReplace;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = digitizedCardProfile.DigitizedCardProfile;
        if (i2 != 0) {
        }
        setdatadirectorysuffix = (com.payair.hce.communication.JsonResponse) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setFriction.values valuesVar;
        int i;
        com.payair.hce.setAdapter values2;
        android.content.Context context;
        java.lang.String str;
        com.visa.cbp.sdk.facade.data.TokenData tokenData;
        com.payair.hce.setFriction setfriction = (com.payair.hce.setFriction) objArr[0];
        android.content.Context context2 = (android.content.Context) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        java.lang.String str3 = (java.lang.String) objArr[3];
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[4];
        int i2 = writeReplace;
        int i3 = i2 & 107;
        int i4 = (((i2 | 107) & (~i3)) + (i3 << 1)) % 128;
        values = i4;
        if (continuation instanceof com.payair.hce.setFriction.values) {
            int i5 = i4 & 121;
            int i6 = -(-((i4 ^ 121) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            writeReplace = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = ((com.payair.hce.setFriction.values) continuation).getProfileVersion;
                throw null;
            }
            valuesVar = (com.payair.hce.setFriction.values) continuation;
            if ((valuesVar.getProfileVersion & Integer.MIN_VALUE) != 0) {
                int i9 = valuesVar.getProfileVersion;
                int identityHashCode = java.lang.System.identityHashCode(setfriction);
                int i10 = Integer.MAX_VALUE - (~(-(-(i9 * (-575)))));
                int i11 = ~i9;
                int i12 = ((~i11) & Integer.MAX_VALUE) | (i11 & Integer.MIN_VALUE);
                int i13 = i11 & Integer.MAX_VALUE;
                int i14 = ~(i12 | i13);
                int i15 = i11 & (i11 | i9);
                int i16 = i15 & identityHashCode;
                int i17 = (~i16) & (i15 | identityHashCode);
                int i18 = ~((i17 ^ i16) | (i16 & i17));
                int i19 = i14 ^ i18;
                int i20 = i14 & i18;
                int i21 = ((i20 ^ i19) | (i20 & i19)) * 576;
                int i22 = i10 ^ i21;
                int i23 = (i21 & i10) << 1;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                int i25 = i9 & Integer.MAX_VALUE;
                int i26 = (i9 | Integer.MAX_VALUE) & (~i25);
                int i27 = ~((i25 ^ i26) | (i25 & i26));
                int i28 = ~identityHashCode;
                int i29 = i28 & (i28 | identityHashCode);
                int i30 = i11 & i29;
                int i31 = (i29 | i11) & (~i30);
                int i32 = (i31 ^ i30) | (i31 & i30);
                int i33 = (i32 & Integer.MAX_VALUE) | ((~i32) & Integer.MIN_VALUE);
                int i34 = i32 & Integer.MIN_VALUE;
                int i35 = (i34 ^ i33) | (i34 & i33);
                int i36 = ~i35;
                int i37 = (i35 | i36) & i36;
                int i38 = i27 & i37;
                int i39 = -(-((((i27 | i37) & (~i38)) | i38) * 576));
                int i40 = i24 & i39;
                int i41 = -(-((i39 ^ i24) | i40));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                int i43 = -(-((~((i12 & i13) | (i12 ^ i13))) * 576));
                int i44 = (i42 | i43) << 1;
                int i45 = -(((~i43) & i42) | ((~i42) & i43));
                valuesVar.getProfileVersion = (i44 ^ i45) + ((i45 & i44) << 1);
                int i46 = writeReplace;
                int i47 = i46 & 101;
                values = ((i47 - (~((i46 ^ 101) | i47))) - 1) % 128;
                java.lang.Object obj = valuesVar.DigitizedCardProfile;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = valuesVar.getProfileVersion;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{context2}, -1119129463, 1119129477, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                        com.payair.hce.communication.JsonResponse jsonResponse = new com.payair.hce.communication.JsonResponse();
                        jsonResponse.setErrors(kotlin.collections.CollectionsKt.listOf(new com.payair.hce.ErrorModel("9092", "REPERSO_ERROR", "Reinitialization of SDK failed")));
                        jsonResponse.setSuccessful(false);
                        int i48 = values;
                        int i49 = ((i48 ^ 93) | (i48 & 93)) << 1;
                        int i50 = -((i48 & (-94)) | ((~i48) & 93));
                        writeReplace = ((i49 ^ i50) + ((i50 & i49) << 1)) % 128;
                        return jsonResponse;
                    }
                    valuesVar.AlternateContactlessPaymentDataJson = setfriction;
                    valuesVar.writeReplace = context2;
                    valuesVar.values = str2;
                    valuesVar.valueOf = str3;
                    valuesVar.getProfileVersion = 1;
                    if (com.payair.hce.visa.Initializer.initialize(context2, valuesVar) == coroutine_suspended) {
                        int i51 = writeReplace;
                        int i52 = (((i51 & (-120)) | ((~i51) & 119)) + ((i51 & 119) << 1)) % 128;
                        values = i52;
                        int i53 = (-2) - (~(i52 + 50));
                        writeReplace = i53 % 128;
                        if (i53 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tokenData = (com.visa.cbp.sdk.facade.data.TokenData) valuesVar.values;
                        str = (java.lang.String) valuesVar.writeReplace;
                        context = (android.content.Context) valuesVar.AlternateContactlessPaymentDataJson;
                        kotlin.ResultKt.throwOnFailure(obj);
                        int i54 = values;
                        writeReplace = ((i54 ^ 25) + ((i54 & 25) << 1)) % 128;
                        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
                        com.payair.hce.setFindListener setfindlistener = (com.payair.hce.setFindListener) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -727777032, 727777033, (int) java.lang.System.currentTimeMillis());
                        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = tokenData.getTokenKey();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey, "");
                        com.visa.cbp.external.enp.ProvisionAckRequest provisionAckRequest = (com.visa.cbp.external.enp.ProvisionAckRequest) com.payair.hce.setFindListener.values(new java.lang.Object[]{setfindlistener, context, tokenKey}, -548111714, 548111715, java.lang.System.identityHashCode(setfindlistener));
                        java.lang.String api = provisionAckRequest.getApi();
                        com.payair.hce.setSelectedChildViewEnabled setselectedchildviewenabled = com.payair.hce.setSelectedChildViewEnabled.SUCCESS;
                        java.lang.String failureReason = provisionAckRequest.getFailureReason();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(api, "");
                        com.payair.hce.setScrollingCacheEnabled setscrollingcacheenabled = new com.payair.hce.setScrollingCacheEnabled(api, str, setselectedchildviewenabled, failureReason, null, null, 48, null);
                        com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
                        com.payair.hce.communication.JsonResponse jsonResponse2 = (com.payair.hce.communication.JsonResponse) com.payair.hce.setHorizontalScrollbarOverlay.values(new java.lang.Object[]{setscrollingcacheenabled, str}, 1910867883, -1910867882, (int) java.lang.System.currentTimeMillis());
                        writeReplace = (values + 81) % 128;
                        return jsonResponse2;
                    }
                    str3 = (java.lang.String) valuesVar.valueOf;
                    str2 = (java.lang.String) valuesVar.values;
                    context2 = (android.content.Context) valuesVar.writeReplace;
                    setfriction = (com.payair.hce.setFriction) valuesVar.AlternateContactlessPaymentDataJson;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i55 = writeReplace;
                    int i56 = ((i55 ^ 75) | (i55 & 75)) << 1;
                    int i57 = -((i55 & (-76)) | ((~i55) & 75));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    values = i58 % 128;
                    int i59 = i58 % 2;
                }
                com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay2 = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
                java.lang.String jWTToken = com.payair.hce.HCEManager.getJWTToken();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jWTToken, "");
                values2 = com.payair.hce.setHorizontalScrollbarOverlay.values(str3, str2, jWTToken);
                if (values2.isSuccessful()) {
                    com.payair.hce.setAdapter setadapter = values2;
                    int i60 = writeReplace;
                    int i61 = i60 & 117;
                    int i62 = ((i60 ^ 117) | i61) << 1;
                    int i63 = -((i60 | 117) & (~i61));
                    int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                    values = i64 % 128;
                    if (i64 % 2 != 0) {
                        return setadapter;
                    }
                    throw null;
                }
                int i65 = values;
                int i66 = i65 & 1;
                int i67 = i66 + ((i65 ^ 1) | i66);
                writeReplace = i67 % 128;
                if (i67 % 2 != 0) {
                    com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
                    throw new java.lang.ArithmeticException();
                }
                com.payair.hce.setNetworkAvailable setnetworkavailable3 = com.payair.hce.setNetworkAvailable.values;
                com.visa.cbp.sdk.facade.data.TokenData tokenData2 = (com.visa.cbp.sdk.facade.data.TokenData) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{context2, str2}, -550736711, 550736720, (int) java.lang.System.currentTimeMillis());
                if (tokenData2 == null) {
                    new com.payair.hce.setAdapter(null, null, null, null, 15, null).setSuccessful(false);
                    values2.setStatusCode(kotlin.coroutines.jvm.internal.Boxing.boxInt(9944));
                    values2.setStatusCodeFromServer(kotlin.coroutines.jvm.internal.Boxing.boxInt(9944));
                    values2.setErrors(kotlin.collections.CollectionsKt.listOf(new com.payair.hce.ErrorModel("9944", "9944", "Token not in a state to be reperso'ed")));
                    int i68 = writeReplace;
                    int i69 = (i68 & (-98)) | ((~i68) & 97);
                    int i70 = -(-((i68 & 97) << 1));
                    values = (((i69 | i70) << 1) - (i70 ^ i69)) % 128;
                    return values2;
                }
                int i71 = values;
                int i72 = i71 & 85;
                writeReplace = (i72 + ((i71 ^ 85) | i72)) % 128;
                com.visa.cbp.sdk.facade.data.TokenKey tokenKey2 = tokenData2.getTokenKey();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey2, "");
                valuesVar.AlternateContactlessPaymentDataJson = context2;
                valuesVar.writeReplace = str2;
                valuesVar.values = tokenData2;
                valuesVar.valueOf = null;
                valuesVar.getProfileVersion = 2;
                if (DigitizedCardProfile(new java.lang.Object[]{setfriction, context2, values2, tokenKey2, valuesVar}, -399156088, 399156089, java.lang.System.identityHashCode(setfriction)) == coroutine_suspended) {
                    int i73 = values;
                    int i74 = ((i73 | 97) << 1) - (i73 ^ 97);
                    int i75 = i74 % 128;
                    writeReplace = i75;
                    if (i74 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    int i76 = i75 & 107;
                    values = (i76 + ((i75 ^ 107) | i76)) % 128;
                    return coroutine_suspended;
                }
                context = context2;
                str = str2;
                tokenData = tokenData2;
                com.payair.hce.setNetworkAvailable setnetworkavailable4 = com.payair.hce.setNetworkAvailable.values;
                com.payair.hce.setFindListener setfindlistener2 = (com.payair.hce.setFindListener) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -727777032, 727777033, (int) java.lang.System.currentTimeMillis());
                com.visa.cbp.sdk.facade.data.TokenKey tokenKey3 = tokenData.getTokenKey();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenKey3, "");
                com.visa.cbp.external.enp.ProvisionAckRequest provisionAckRequest2 = (com.visa.cbp.external.enp.ProvisionAckRequest) com.payair.hce.setFindListener.values(new java.lang.Object[]{setfindlistener2, context, tokenKey3}, -548111714, 548111715, java.lang.System.identityHashCode(setfindlistener2));
                java.lang.String api2 = provisionAckRequest2.getApi();
                com.payair.hce.setSelectedChildViewEnabled setselectedchildviewenabled2 = com.payair.hce.setSelectedChildViewEnabled.SUCCESS;
                java.lang.String failureReason2 = provisionAckRequest2.getFailureReason();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(api2, "");
                com.payair.hce.setScrollingCacheEnabled setscrollingcacheenabled2 = new com.payair.hce.setScrollingCacheEnabled(api2, str, setselectedchildviewenabled2, failureReason2, null, null, 48, null);
                com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay3 = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
                com.payair.hce.communication.JsonResponse jsonResponse22 = (com.payair.hce.communication.JsonResponse) com.payair.hce.setHorizontalScrollbarOverlay.values(new java.lang.Object[]{setscrollingcacheenabled2, str}, 1910867883, -1910867882, (int) java.lang.System.currentTimeMillis());
                writeReplace = (values + 81) % 128;
                return jsonResponse22;
            }
        }
        valuesVar = setfriction.new values(continuation);
        java.lang.Object obj2 = valuesVar.DigitizedCardProfile;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = valuesVar.getProfileVersion;
        if (i != 0) {
        }
        com.payair.hce.setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay22 = com.payair.hce.setHorizontalScrollbarOverlay.INSTANCE;
        java.lang.String jWTToken2 = com.payair.hce.HCEManager.getJWTToken();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jWTToken2, "");
        values2 = com.payair.hce.setHorizontalScrollbarOverlay.values(str3, str2, jWTToken2);
        if (values2.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setFriction.writeReplace writereplace;
        int i;
        com.visa.cbp.external.enp.RepersoTokenResponse repersoTokenResponse;
        int i2;
        int i3;
        com.payair.hce.setFriction setfriction = (com.payair.hce.setFriction) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        com.payair.hce.setAdapter setadapter = (com.payair.hce.setAdapter) objArr[2];
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) objArr[3];
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) objArr[4];
        if (continuation instanceof com.payair.hce.setFriction.writeReplace) {
            int i4 = values + 63;
            writeReplace = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = ((com.payair.hce.setFriction.writeReplace) continuation).DigitizedCardProfile;
                throw new java.lang.ArithmeticException();
            }
            writereplace = (com.payair.hce.setFriction.writeReplace) continuation;
            if ((writereplace.DigitizedCardProfile & Integer.MIN_VALUE) != 0) {
                int i6 = values;
                int i7 = i6 & 73;
                int i8 = -(-(i6 | 73));
                writeReplace = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                int i9 = writereplace.DigitizedCardProfile;
                int identityHashCode = java.lang.System.identityHashCode(setfriction);
                int i10 = i9 * (-575);
                int i11 = i10 & Integer.MIN_VALUE;
                int i12 = i10 | Integer.MIN_VALUE;
                int i13 = ~i9;
                int i14 = i13 ^ Integer.MAX_VALUE;
                int i15 = i13 & Integer.MAX_VALUE;
                int i16 = ~((i14 & i15) | (i14 ^ i15));
                int i17 = i13 & (i13 | i9);
                int i18 = (~i17) & identityHashCode;
                int i19 = ~identityHashCode;
                int i20 = i18 | (i19 & i17);
                int i21 = identityHashCode & i17;
                int i22 = ~((i21 ^ i20) | (i20 & i21));
                int i23 = i16 & i22;
                int i24 = (i16 | i22) & (~i23);
                int i25 = i9 ^ Integer.MAX_VALUE;
                int i26 = i9 & Integer.MAX_VALUE;
                int i27 = ~((i25 ^ i26) | (i25 & i26));
                int i28 = (i19 & i13) | (i13 ^ i19);
                int i29 = i28 & Integer.MIN_VALUE;
                int i30 = (i28 | Integer.MIN_VALUE) & (~i29);
                int i31 = ~((i30 ^ i29) | (i30 & i29));
                int i32 = (((((i11 | i12) << 1) - (i12 ^ i11)) + (((i24 ^ i23) | (i24 & i23)) * 576)) - (~(((i31 & i27) | (i27 ^ i31)) * 576))) - 1;
                int i33 = (~(i14 | i15)) * 576;
                int i34 = i32 & i33;
                int i35 = -(-((i33 ^ i32) | i34));
                writereplace.DigitizedCardProfile = (i34 & i35) + (i35 | i34);
                int i36 = writeReplace;
                int i37 = i36 ^ 93;
                int i38 = (((i36 & 93) | i37) << 1) - i37;
                values = i38 % 128;
                if (i38 % 2 == 0) {
                    int i39 = 4 / 2;
                }
                java.lang.Object obj = writereplace.values;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = writereplace.DigitizedCardProfile;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byte[] decode = android.util.Base64.decode((java.lang.String) com.payair.hce.setAdapter.writeReplace(new java.lang.Object[]{setadapter}, -1283691499, 1283691503, java.lang.System.identityHashCode(setadapter)), 0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
                    java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCharset, "");
                    com.visa.cbp.external.enp.RepersoTokenResponse repersoTokenResponse2 = (com.visa.cbp.external.enp.RepersoTokenResponse) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(new java.lang.String(decode, defaultCharset), com.visa.cbp.external.enp.RepersoTokenResponse.class);
                    try {
                        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
                        com.payair.hce.setFindListener setfindlistener = (com.payair.hce.setFindListener) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -727777032, 727777033, (int) java.lang.System.currentTimeMillis());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(repersoTokenResponse2, "");
                        com.payair.hce.setFindListener.values(new java.lang.Object[]{setfindlistener, context, tokenKey, repersoTokenResponse2}, -546461485, 546461485, java.lang.System.identityHashCode(setfindlistener));
                        int i40 = values;
                        int i41 = i40 & 87;
                        int i42 = ((i40 ^ 87) | i41) << 1;
                        int i43 = -((i40 | 87) & (~i41));
                        i2 = i42 & i43;
                        i3 = i43 | i42;
                    } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
                        writereplace.writeReplace = context;
                        writereplace.AlternateContactlessPaymentDataJson = tokenKey;
                        writereplace.valueOf = repersoTokenResponse2;
                        writereplace.DigitizedCardProfile = 1;
                        if (kotlinx.coroutines.DelayKt.delay(5000L, writereplace) == coroutine_suspended) {
                            int i44 = values;
                            int i45 = i44 & 35;
                            int i46 = -(-((i44 ^ 35) | i45));
                            writeReplace = ((i45 & i46) + (i46 | i45)) % 128;
                            return coroutine_suspended;
                        }
                        repersoTokenResponse = repersoTokenResponse2;
                    }
                    writeReplace = (i2 + i3) % 128;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    int i47 = values;
                    int i48 = i47 ^ 79;
                    int i49 = ((i47 & 79) | i48) << 1;
                    int i50 = -i48;
                    writeReplace = (((i49 | i50) << 1) - (i49 ^ i50)) % 128;
                    return unit;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                repersoTokenResponse = (com.visa.cbp.external.enp.RepersoTokenResponse) writereplace.valueOf;
                tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) writereplace.AlternateContactlessPaymentDataJson;
                context = (android.content.Context) writereplace.writeReplace;
                kotlin.ResultKt.throwOnFailure(obj);
                int i51 = writeReplace;
                int i52 = ((i51 ^ 75) | (i51 & 75)) << 1;
                int i53 = -((i51 & (-76)) | ((~i51) & 75));
                int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                values = i54 % 128;
                int i55 = i54 % 2;
                com.payair.hce.setNetworkAvailable setnetworkavailable2 = com.payair.hce.setNetworkAvailable.values;
                com.payair.hce.setFindListener setfindlistener2 = (com.payair.hce.setFindListener) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -727777032, 727777033, (int) java.lang.System.currentTimeMillis());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(repersoTokenResponse, "");
                com.payair.hce.setFindListener.values(new java.lang.Object[]{setfindlistener2, context, tokenKey, repersoTokenResponse}, -546461485, 546461485, java.lang.System.identityHashCode(setfindlistener2));
                int i56 = values;
                int i57 = ((i56 ^ 33) | (i56 & 33)) << 1;
                int i58 = -((i56 & (-34)) | ((~i56) & 33));
                int i59 = i57 ^ i58;
                i3 = (i58 & i57) << 1;
                i2 = i59;
                writeReplace = (i2 + i3) % 128;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                int i472 = values;
                int i482 = i472 ^ 79;
                int i492 = ((i472 & 79) | i482) << 1;
                int i502 = -i482;
                writeReplace = (((i492 | i502) << 1) - (i492 ^ i502)) % 128;
                return unit2;
            }
        }
        writereplace = setfriction.new writeReplace(continuation);
        writeReplace = ((-2) - (~(values + 38))) % 128;
        java.lang.Object obj2 = writereplace.values;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writereplace.DigitizedCardProfile;
        if (i != 0) {
        }
        com.payair.hce.setNetworkAvailable setnetworkavailable22 = com.payair.hce.setNetworkAvailable.values;
        com.payair.hce.setFindListener setfindlistener22 = (com.payair.hce.setFindListener) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], -727777032, 727777033, (int) java.lang.System.currentTimeMillis());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(repersoTokenResponse, "");
        com.payair.hce.setFindListener.values(new java.lang.Object[]{setfindlistener22, context, tokenKey, repersoTokenResponse}, -546461485, 546461485, java.lang.System.identityHashCode(setfindlistener22));
        int i562 = values;
        int i572 = ((i562 ^ 33) | (i562 & 33)) << 1;
        int i582 = -((i562 & (-34)) | ((~i562) & 33));
        int i592 = i572 ^ i582;
        i3 = (i582 & i572) << 1;
        i2 = i592;
        writeReplace = (i2 + i3) % 128;
        kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
        int i4722 = values;
        int i4822 = i4722 ^ 79;
        int i4922 = ((i4722 & 79) | i4822) << 1;
        int i5022 = -i4822;
        writeReplace = (((i4922 | i5022) << 1) - (i4922 ^ i5022)) % 128;
        return unit22;
    }

    static final class DigitizedCardProfile extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int values = 1;
        int DigitizedCardProfile;
        /* synthetic */ java.lang.Object writeReplace;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            com.payair.hce.setFriction.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setFriction.DigitizedCardProfile) objArr[0];
            java.lang.Object obj = objArr[1];
            int i4 = values;
            int i5 = (i4 ^ 44) + ((i4 & 44) << 1);
            AlternateContactlessPaymentDataJson = ((~i5) + (i5 << 1)) % 128;
            digitizedCardProfile.writeReplace = obj;
            int i6 = digitizedCardProfile.DigitizedCardProfile;
            int i7 = (Integer.MAX_VALUE & i6) | ((~i6) & Integer.MIN_VALUE);
            int i8 = i6 & Integer.MIN_VALUE;
            digitizedCardProfile.DigitizedCardProfile = (i8 ^ i7) | (i8 & i7);
            com.payair.hce.setFriction setfriction = com.payair.hce.setFriction.this;
            java.lang.Object DigitizedCardProfile = com.payair.hce.setFriction.DigitizedCardProfile(new java.lang.Object[]{setfriction, null, null, digitizedCardProfile}, -1365558317, 1365558320, java.lang.System.identityHashCode(setfriction));
            int i9 = AlternateContactlessPaymentDataJson;
            values = ((((i9 | 96) << 1) - (i9 ^ 96)) - 1) % 128;
            return DigitizedCardProfile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            return values(new java.lang.Object[]{this, obj}, 483257100, -483257100, java.lang.System.identityHashCode(this));
        }

        DigitizedCardProfile(kotlin.coroutines.Continuation<? super com.payair.hce.setFriction.DigitizedCardProfile> continuation) {
            super(continuation);
        }
    }

    static final class values extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        private static int RecordsJson = 0;
        private static int getAid = 1;
        java.lang.Object AlternateContactlessPaymentDataJson;
        /* synthetic */ java.lang.Object DigitizedCardProfile;
        int getProfileVersion;
        java.lang.Object valueOf;
        java.lang.Object values;
        java.lang.Object writeReplace;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            return DigitizedCardProfile(objArr);
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.setFriction.values valuesVar = (com.payair.hce.setFriction.values) objArr[0];
            java.lang.Object obj = objArr[1];
            int i = RecordsJson;
            int i2 = i & 121;
            int i3 = ((i ^ 121) | i2) << 1;
            int i4 = -((i | 121) & (~i2));
            int i5 = (i3 & i4) + (i3 | i4);
            getAid = i5 % 128;
            valuesVar.DigitizedCardProfile = obj;
            int i6 = valuesVar.getProfileVersion;
            if (i5 % 2 == 0) {
                int i7 = i6 & Integer.MIN_VALUE;
                int i8 = (i6 | Integer.MIN_VALUE) & (~i7);
                valuesVar.getProfileVersion = (i8 ^ i7) | (i8 & i7);
                com.payair.hce.setFriction setfriction = com.payair.hce.setFriction.this;
                com.payair.hce.setFriction.DigitizedCardProfile(new java.lang.Object[]{setfriction, null, null, null, valuesVar}, 599245184, -599245184, java.lang.System.identityHashCode(setfriction));
                throw null;
            }
            int i9 = i6 ^ Integer.MIN_VALUE;
            int i10 = i6 & Integer.MIN_VALUE;
            valuesVar.getProfileVersion = (i10 ^ i9) | (i10 & i9);
            com.payair.hce.setFriction setfriction2 = com.payair.hce.setFriction.this;
            java.lang.Object DigitizedCardProfile = com.payair.hce.setFriction.DigitizedCardProfile(new java.lang.Object[]{setfriction2, null, null, null, valuesVar}, 599245184, -599245184, java.lang.System.identityHashCode(setfriction2));
            RecordsJson = (getAid + 101) % 128;
            return DigitizedCardProfile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            return values(new java.lang.Object[]{this, obj}, 330521955, -330521955, java.lang.System.identityHashCode(this));
        }

        values(kotlin.coroutines.Continuation<? super com.payair.hce.setFriction.values> continuation) {
            super(continuation);
        }
    }

    static final class writeReplace extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        private static int IccPrivateKeyCrtComponentsJson = 1;
        private static int SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object AlternateContactlessPaymentDataJson;
        int DigitizedCardProfile;
        java.lang.Object valueOf;
        /* synthetic */ java.lang.Object values;
        java.lang.Object writeReplace;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            return AlternateContactlessPaymentDataJson(objArr);
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.setFriction.writeReplace writereplace = (com.payair.hce.setFriction.writeReplace) objArr[0];
            java.lang.Object obj = objArr[1];
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) - (~(i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE))) - 1;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            writereplace.values = obj;
            int i3 = writereplace.DigitizedCardProfile;
            if (i2 % 2 == 0) {
                int i4 = i3 & Integer.MIN_VALUE;
                int i5 = (i3 | Integer.MIN_VALUE) & (~i4);
                writereplace.DigitizedCardProfile = (i5 ^ i4) | (i5 & i4);
                com.payair.hce.setFriction.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.setFriction.this, writereplace}, -1702313878, 1702313880, (int) java.lang.System.currentTimeMillis());
                throw null;
            }
            int i6 = i3 & Integer.MIN_VALUE;
            int i7 = (i3 | Integer.MIN_VALUE) & (~i6);
            writereplace.DigitizedCardProfile = (i7 ^ i6) | (i7 & i6);
            java.lang.Object DigitizedCardProfile = com.payair.hce.setFriction.DigitizedCardProfile(new java.lang.Object[]{com.payair.hce.setFriction.this, writereplace}, -1702313878, 1702313880, (int) java.lang.System.currentTimeMillis());
            int i8 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i9 = (i8 & 71) + (i8 | 71);
            IccPrivateKeyCrtComponentsJson = i9 % 128;
            if (i9 % 2 != 0) {
                return DigitizedCardProfile;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            return values(new java.lang.Object[]{this, obj}, 1629158707, -1629158707, java.lang.System.identityHashCode(this));
        }

        writeReplace(kotlin.coroutines.Continuation<? super com.payair.hce.setFriction.writeReplace> continuation) {
            super(continuation);
        }
    }

    private final java.lang.Object valueOf(android.content.Context context, com.payair.hce.setAdapter setadapter, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return DigitizedCardProfile(new java.lang.Object[]{this, context, setadapter, tokenKey, continuation}, -399156088, 399156089, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.visa.reperso.VisaReperso
    public final java.lang.Object reperso(android.content.Context context, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.hce.communication.JsonResponse> continuation) throws com.payair.hce.setVerticalScrollbarOverlay {
        return DigitizedCardProfile(new java.lang.Object[]{this, context, str, str2, continuation}, 599245184, -599245184, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.visa.reperso.VisaReperso
    public final java.lang.Object reperso(android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.hce.communication.JsonResponse> continuation) throws com.payair.hce.setVerticalScrollbarOverlay {
        return DigitizedCardProfile(new java.lang.Object[]{this, context, str, continuation}, -1365558317, 1365558320, java.lang.System.identityHashCode(this));
    }
}
