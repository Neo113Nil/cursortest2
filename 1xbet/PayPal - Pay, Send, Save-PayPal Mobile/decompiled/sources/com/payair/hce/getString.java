package com.payair.hce;

/* loaded from: classes4.dex */
public class getString {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (s * 2);
        int i5 = (b * 3) + 115;
        byte[] bArr = $$a;
        int i6 = (i * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i6;
            i5 = (-i5) + i9;
            i4 = i7;
            i2 = i8;
            int i10 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = bArr[i10];
            i9 = i5;
            i5 = i11;
            i8 = i3;
            i7 = i10;
            i5 = (-i5) + i9;
            i4 = i7;
            i2 = i8;
            int i102 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            if (i3 == i6) {
            }
        }
    }

    static /* synthetic */ boolean AlternateContactlessPaymentDataJson(byte[] bArr) {
        java.lang.String writeReplace2;
        java.lang.Object obj;
        int i = DigitizedCardProfile + 81;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            writeReplace2 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr).writeReplace();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "\ufffe\u0001\u0002\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\u000f\ufffe\u0004", 18 % (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 121 - (android.widget.ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), 80 - android.graphics.Color.red(0), objArr);
            obj = objArr[0];
        } else {
            writeReplace2 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr).writeReplace();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(true, "\ufffe\u0001\u0002\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\u000f\ufffe\u0004", 125 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 12 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 14 - android.graphics.Color.red(0), objArr2);
            obj = objArr2[0];
        }
        return writeReplace2.equalsIgnoreCase(((java.lang.String) obj).intern());
    }

    static /* synthetic */ boolean writeReplace(com.payair.hce.JsonResponse jsonResponse) {
        int i = AlternateContactlessPaymentDataJson + 35;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0 ? jsonResponse.getCdol1RelatedDataLength() >= 45 : jsonResponse.getCdol1RelatedDataLength() >= 45) {
            if (jsonResponse.getIssuerApplicationData() != null) {
                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 65) % 128;
                if (jsonResponse.getIssuerApplicationData().length == 18 && jsonResponse.getIccPrivateKeyCrtComponents() != null) {
                    int i2 = AlternateContactlessPaymentDataJson + 105;
                    DigitizedCardProfile = i2 % 128;
                    if (i2 % 2 == 0) {
                        return true;
                    }
                    throw new java.lang.ArithmeticException();
                }
            }
        }
        int i3 = DigitizedCardProfile + 77;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        AlternateContactlessPaymentDataJson = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "\u000eￛ7ￛ\u0006\uffff", 143 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 1 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 6, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getString.class.getName());
        com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        int i = AlternateContactlessPaymentDataJson + 19;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: com.payair.hce.getString$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] DigitizedCardProfile;
        private static int valueOf = 0;
        static final /* synthetic */ int[] values;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[com.payair.hce.gotDeleteData.values().length];
            DigitizedCardProfile = iArr;
            try {
                iArr[com.payair.hce.gotDeleteData.valueOf.ordinal()] = 1;
                int i = writeReplace;
                int i2 = i & 5;
                int i3 = (i | 5) & (~i2);
                int i4 = -(-(i2 << 1));
                int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                valueOf = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.gotDeleteData.DigitizedCardProfile.ordinal()] = 2;
                int i7 = writeReplace;
                int i8 = i7 & 43;
                int i9 = -(-((i7 ^ 43) | i8));
                int i10 = (i8 & i9) + (i9 | i8);
                valueOf = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 / 3;
                }
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                DigitizedCardProfile[com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson.ordinal()] = 3;
                int i12 = valueOf;
                int i13 = ((i12 ^ 1) | (i12 & 1)) << 1;
                int i14 = -((i12 & (-2)) | ((~i12) & 1));
                writeReplace = ((i13 & i14) + (i14 | i13)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.payair.hce.setSendAuthenticationHeader.values().length];
            values = iArr2;
            try {
                iArr2[com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                values[com.payair.hce.setSendAuthenticationHeader.writeReplace.ordinal()] = 2;
                int i15 = valueOf + 52;
                writeReplace = ((~i15) + (i15 << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                values[com.payair.hce.setSendAuthenticationHeader.values.ordinal()] = 3;
                int i16 = writeReplace;
                valueOf = (((i16 & 18) + (i16 | 18)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public static com.payair.hce.stopTransaction DigitizedCardProfile(com.payair.hce.JsonResponse jsonResponse, boolean z) {
        int i = AlternateContactlessPaymentDataJson + 63;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (jsonResponse == null) {
            return null;
        }
        com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.writeReplace;
        int i2 = com.payair.hce.getString.AnonymousClass2.values[jsonResponse.getUmdGeneration().ordinal()];
        if (i2 == 1) {
            getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.AlternateContactlessPaymentDataJson;
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 23) % 128;
        } else if (i2 == 2) {
            getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.values;
        } else if (i2 == 3) {
            getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.writeReplace;
        }
        com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries2 = getnumberoftransactionlogentries;
        com.payair.hce.suspendCardForToken suspendcardfortoken = com.payair.hce.suspendCardForToken.DigitizedCardProfile;
        int i3 = com.payair.hce.getString.AnonymousClass2.DigitizedCardProfile[jsonResponse.getCvmModel().ordinal()];
        if (i3 == 1) {
            suspendcardfortoken = com.payair.hce.suspendCardForToken.DigitizedCardProfile;
        } else if (i3 == 2) {
            suspendcardfortoken = com.payair.hce.suspendCardForToken.writeReplace;
        } else if (i3 == 3) {
            suspendcardfortoken = com.payair.hce.suspendCardForToken.valueOf;
        }
        return new com.payair.hce.getString.AnonymousClass3(jsonResponse, jsonResponse.isTransitSupported(), z, getnumberoftransactionlogentries2, suspendcardfortoken);
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2072, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 53, 3543 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i5 = $10 + 89;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i7 = $10 + 95;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(digitizedCardJson11.DigitizedCardProfile + i3) - 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 53, 3543 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 54, 3542 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            $10 = ($11 + 107) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public static com.payair.hce.stopTransaction valueOf(com.payair.hce.JsonResponse jsonResponse, com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries, com.payair.hce.suspendCardForToken suspendcardfortoken, boolean z, boolean z2) {
        com.payair.hce.getString.AnonymousClass3 anonymousClass3 = new com.payair.hce.getString.AnonymousClass3(jsonResponse, z, z2, getnumberoftransactionlogentries, suspendcardfortoken);
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 85) % 128;
        return anonymousClass3;
    }

    /* renamed from: com.payair.hce.getString$3, reason: invalid class name */
    static final class AnonymousClass3 implements com.payair.hce.stopTransaction {
        private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
        private static int getAid;
        final /* synthetic */ com.payair.hce.JsonResponse AlternateContactlessPaymentDataJson;
        private /* synthetic */ com.payair.hce.getNumberOfTransactionLogEntries DigitizedCardProfile;
        private /* synthetic */ com.payair.hce.suspendCardForToken valueOf;
        private /* synthetic */ boolean values;
        private /* synthetic */ boolean writeReplace;

        public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = i | i3;
            switch ((i * (-1335)) + (i2 * (-667)) + (((~i5) | i4) * (-668)) + ((i | (~(i3 | i4))) * 1336) + ((i5 | i4) * 668)) {
                case 1:
                    int i6 = SdkCoreAlternateContactlessPaymentDataImpl;
                    getAid = (((i6 ^ 56) + ((i6 & 56) << 1)) - 1) % 128;
                    int i7 = i6 & 87;
                    int i8 = ((i6 ^ 87) | i7) << 1;
                    int i9 = -((i6 | 87) & (~i7));
                    getAid = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
                    return null;
                case 2:
                    return values(objArr);
                case 3:
                    return AlternateContactlessPaymentDataJson(objArr);
                case 4:
                    return DigitizedCardProfile(objArr);
                case 5:
                    return writeReplace(objArr);
                case 6:
                    return IccPrivateKeyCrtComponentsJson(objArr);
                case 7:
                    return getProfileVersion(objArr);
                case 8:
                    return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
                case 9:
                    com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
                    int i10 = getAid;
                    int i11 = (((i10 ^ 50) + ((i10 & 50) << 1)) - 1) % 128;
                    SdkCoreAlternateContactlessPaymentDataImpl = i11;
                    com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = anonymousClass3.DigitizedCardProfile;
                    int i12 = i11 ^ 85;
                    getAid = (((((i11 & 85) | i12) << 1) - (~(-i12))) - 1) % 128;
                    return getnumberoftransactionlogentries;
                case 10:
                    return getAid(objArr);
                case 11:
                    return RecordsJson(objArr);
                case 12:
                    return getCiacDecline(objArr);
                case 13:
                    return getCvrMaskAnd(objArr);
                case 14:
                    return getPaymentFci(objArr);
                case 15:
                    return getGpoResponse(objArr);
                case 16:
                    return SdkCoreBusinessLogicModuleImpl(objArr);
                case 17:
                    return getDualTapResetTimeout(objArr);
                case 18:
                    com.payair.hce.getString.AnonymousClass3 anonymousClass32 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i13 = SdkCoreAlternateContactlessPaymentDataImpl;
                    getAid = ((i13 & 67) + (i13 | 67)) % 128;
                    for (final com.payair.hce.setNetworkError setnetworkerror : anonymousClass32.AlternateContactlessPaymentDataJson.getRecords()) {
                        arrayList.add(new com.payair.hce.updateUnlockKeys() { // from class: com.payair.hce.getString.3.4
                            private static int valueOf = 0;
                            private static int values = 1;

                            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2, int i14, int i15, int i16) {
                                int i17 = ~i16;
                                int i18 = (~i14) | i17;
                                int i19 = (i14 * com.knotapi.knot.utilities.Constants.ID_KROGER) + (i15 * com.knotapi.knot.utilities.Constants.ID_KROGER) + ((i17 | i14 | i15) * (-369)) + (((~i18) | i15) * (-369)) + (((~(i14 | (~i15))) | (~(i16 | i14)) | (~(i15 | i18))) * 369);
                                if (i19 == 1) {
                                    com.payair.hce.getString.AnonymousClass3.AnonymousClass4 anonymousClass4 = (com.payair.hce.getString.AnonymousClass3.AnonymousClass4) objArr2[0];
                                    int i20 = values;
                                    valueOf = (((i20 | 97) << 1) - (i20 ^ 97)) % 128;
                                    byte[] recordValue = setnetworkerror.getRecordValue();
                                    int i21 = valueOf;
                                    int i22 = i21 & 33;
                                    values = (i22 + ((i21 ^ 33) | i22)) % 128;
                                    return recordValue;
                                }
                                if (i19 == 2) {
                                    com.payair.hce.getString.AnonymousClass3.AnonymousClass4 anonymousClass42 = (com.payair.hce.getString.AnonymousClass3.AnonymousClass4) objArr2[0];
                                    int i23 = valueOf;
                                    values = ((((i23 | 58) << 1) - (i23 ^ 58)) - 1) % 128;
                                    byte recordNumber = setnetworkerror.getRecordNumber();
                                    int i24 = values;
                                    valueOf = (((i24 ^ 120) + ((i24 & 120) << 1)) - 1) % 128;
                                    return java.lang.Byte.valueOf(recordNumber);
                                }
                                com.payair.hce.getString.AnonymousClass3.AnonymousClass4 anonymousClass43 = (com.payair.hce.getString.AnonymousClass3.AnonymousClass4) objArr2[0];
                                int i25 = values + 41;
                                valueOf = i25 % 128;
                                com.payair.hce.setNetworkError setnetworkerror2 = setnetworkerror;
                                int parseInt = i25 % 2 != 0 ? ((byte) java.lang.Integer.parseInt(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setnetworkerror2.getSfi()).writeReplace(), 58)) % 5 : ((byte) java.lang.Integer.parseInt(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setnetworkerror2.getSfi()).writeReplace(), 16)) >> 3;
                                int i26 = valueOf;
                                int i27 = ((i26 ^ 125) | (i26 & 125)) << 1;
                                int i28 = -((i26 & (-126)) | ((~i26) & 125));
                                values = ((i27 ^ i28) + ((i28 & i27) << 1)) % 128;
                                return java.lang.Byte.valueOf((byte) parseInt);
                            }

                            @Override // com.payair.hce.updateUnlockKeys
                            public final byte[] values() {
                                return (byte[]) values(new java.lang.Object[]{this}, -345076796, 345076797, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.updateUnlockKeys
                            public final byte writeReplace() {
                                return ((java.lang.Byte) values(new java.lang.Object[]{this}, 1038341528, -1038341528, java.lang.System.identityHashCode(this))).byteValue();
                            }

                            @Override // com.payair.hce.updateUnlockKeys
                            public final byte valueOf() {
                                return ((java.lang.Byte) values(new java.lang.Object[]{this}, 1563433074, -1563433072, java.lang.System.identityHashCode(this))).byteValue();
                            }
                        });
                        int i14 = getAid;
                        int i15 = i14 & 107;
                        int i16 = ((((i14 ^ 107) | i15) << 1) - (~(-((i14 | 107) & (~i15))))) - 1;
                        SdkCoreAlternateContactlessPaymentDataImpl = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 47) % 128;
                    return arrayList;
                case 19:
                    com.payair.hce.getString.AnonymousClass3 anonymousClass33 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
                    int i18 = getAid;
                    int i19 = i18 ^ 125;
                    int i20 = -(-((i18 & 125) << 1));
                    SdkCoreAlternateContactlessPaymentDataImpl = ((i19 & i20) + (i20 | i19)) % 128;
                    byte[] aid = anonymousClass33.AlternateContactlessPaymentDataJson.getAid();
                    int i21 = SdkCoreAlternateContactlessPaymentDataImpl;
                    int i22 = i21 & 29;
                    int i23 = (i21 ^ 29) | i22;
                    getAid = ((i22 & i23) + (i23 | i22)) % 128;
                    return aid;
                case 20:
                    return getApplicationLifeCycleData(objArr);
                default:
                    return valueOf(objArr);
            }
        }

        AnonymousClass3(com.payair.hce.JsonResponse jsonResponse, boolean z, boolean z2, com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries, com.payair.hce.suspendCardForToken suspendcardfortoken) {
            this.AlternateContactlessPaymentDataJson = jsonResponse;
            this.values = z;
            this.writeReplace = z2;
            this.DigitizedCardProfile = getnumberoftransactionlogentries;
            this.valueOf = suspendcardfortoken;
        }

        private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = i & 1;
            int i3 = -(-((i ^ 1) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            getAid = i4 % 128;
            com.payair.hce.JsonResponse jsonResponse = anonymousClass3.AlternateContactlessPaymentDataJson;
            if (i4 % 2 == 0) {
                return jsonResponse.getPpseFci();
            }
            jsonResponse.getPpseFci();
            throw null;
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = i & 17;
            int i3 = -(-((i ^ 17) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            getAid = i4 % 128;
            byte[] gpoResponse = anonymousClass3.AlternateContactlessPaymentDataJson.getGpoResponse();
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i5 = (-2) - (~(getAid + 56));
            SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
            if (i5 % 2 != 0) {
                return gpoResponse;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = getAid;
            SdkCoreAlternateContactlessPaymentDataImpl = (((i ^ 126) + ((i & 126) << 1)) - 1) % 128;
            byte[] paymentFci = anonymousClass3.AlternateContactlessPaymentDataJson.getPaymentFci();
            int i2 = getAid;
            int i3 = (i2 ^ 25) + ((i2 & 25) << 1);
            SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
            if (i3 % 2 != 0) {
                return paymentFci;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = SdkCoreAlternateContactlessPaymentDataImpl & 47;
            getAid = ((i - (~(-(-((r0 ^ 47) | i))))) - 1) % 128;
            byte[] cvrMaskAnd = anonymousClass3.AlternateContactlessPaymentDataJson.getCvrMaskAnd();
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 35;
            getAid = i2 % 128;
            if (i2 % 2 == 0) {
                return cvrMaskAnd;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 63) % 128;
            byte[] ciacDecline = anonymousClass3.AlternateContactlessPaymentDataJson.getCiacDecline();
            int i = getAid;
            int i2 = ((i & (-116)) | ((~i) & 115)) + ((i & 115) << 1);
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 != 0) {
                return ciacDecline;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = getAid + 77;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            com.payair.hce.JsonResponse jsonResponse = anonymousClass3.AlternateContactlessPaymentDataJson;
            if (i % 2 != 0) {
                return jsonResponse.getCiacDeclineOnPpms();
            }
            jsonResponse.getCiacDeclineOnPpms();
            throw null;
        }

        private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
            com.payair.hce.handleMDESPushPayload handlemdespushpayload = new com.payair.hce.handleMDESPushPayload() { // from class: com.payair.hce.getString.3.3
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static int $10;
                private static int $11;
                private static byte[] AlternateContactlessPaymentDataJson;
                private static int DigitizedCardProfile;
                private static long IccPrivateKeyCrtComponentsJson;
                private static short[] RecordsJson;
                private static int SdkCoreAlternateContactlessPaymentDataImpl;
                private static int getAid;
                private static int valueOf;
                private static int writeReplace;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void a(byte b, int i, short s, java.lang.Object[] objArr2) {
                    int i2;
                    int i3;
                    int i4 = 113 - b;
                    int i5 = (i * 3) + 1;
                    byte[] bArr = $$d;
                    int i6 = 3 - (s * 2);
                    byte[] bArr2 = new byte[i5];
                    if (bArr == null) {
                        int i7 = i5;
                        int i8 = i6;
                        i3 = 0;
                        int i9 = i6 + i7;
                        i2 = i3;
                        i6 = i8;
                        i4 = i9;
                        i3 = i2 + 1;
                        bArr2[i2] = (byte) i4;
                        if (i3 == i5) {
                            objArr2[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        int i10 = i6 + 1;
                        i7 = bArr[i10];
                        i6 = i4;
                        i8 = i10;
                        int i92 = i6 + i7;
                        i2 = i3;
                        i6 = i8;
                        i4 = i92;
                        i3 = i2 + 1;
                        bArr2[i2] = (byte) i4;
                        if (i3 == i5) {
                        }
                    } else {
                        i2 = 0;
                        i3 = i2 + 1;
                        bArr2[i2] = (byte) i4;
                        if (i3 == i5) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void d(int i, short s, short s2, java.lang.Object[] objArr2) {
                    int i2;
                    int i3;
                    int i4 = 35 - i;
                    int i5 = 718 - s;
                    byte[] bArr = $$a;
                    int i6 = (s2 * 2) + 4;
                    char[] cArr = new char[i4];
                    if (bArr == null) {
                        i5 = i4;
                        int i7 = i6;
                        i2 = 0;
                        int i8 = i6;
                        i5 = (i5 + i7) - 2;
                        i3 = i8 + 1;
                        cArr[i2] = (char) i5;
                        i2++;
                        if (i2 == i4) {
                            objArr2[0] = new java.lang.String(cArr);
                            return;
                        }
                        i7 = bArr[i3];
                        i8 = i3;
                        i5 = (i5 + i7) - 2;
                        i3 = i8 + 1;
                        cArr[i2] = (char) i5;
                        i2++;
                        if (i2 == i4) {
                        }
                    } else {
                        i2 = 0;
                        i3 = i6;
                        cArr[i2] = (char) i5;
                        i2++;
                        if (i2 == i4) {
                        }
                    }
                }

                public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i, int i2, int i3) {
                    return valueOf(objArr2);
                }

                private static void c(java.lang.String str, int i, java.lang.Object[] objArr2) {
                    char[] cArr;
                    if (str != null) {
                        $11 = ($10 + 93) % 128;
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
                        $10 = ($11 + 73) % 128;
                        int i2 = getdsrpdata.valueOf;
                        try {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                            if (obj == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1890, (char) (android.view.View.combineMeasuredStates(0, 0) + 3600));
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                a((byte) 0, 0, (short) 0, objArr4);
                                obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                            }
                            jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).longValue() ^ (IccPrivateKeyCrtComponentsJson ^ (-4761752123935132024L));
                            java.lang.Object[] objArr5 = {getdsrpdata, getdsrpdata};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                            if (obj2 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1443, (char) (android.graphics.Color.red(0) + 29682));
                                byte b = (byte) ($$e & 1);
                                byte b2 = (byte) (b - 1);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a(b, b2, b2, objArr6);
                                obj2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                            }
                            ((java.lang.reflect.Method) obj2).invoke(null, objArr5);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr3 = new char[length];
                    getdsrpdata.valueOf = 0;
                    while (getdsrpdata.valueOf < cArr2.length) {
                        cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                        java.lang.Object[] objArr7 = {getdsrpdata, getdsrpdata};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1443, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 29683));
                            byte b3 = (byte) ($$e & 1);
                            byte b4 = (byte) (b3 - 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            a(b3, b4, b4, objArr8);
                            obj3 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr7);
                    }
                    java.lang.String str2 = new java.lang.String(cArr3);
                    int i3 = $11 + 35;
                    $10 = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    objArr2[0] = str2;
                }

                @Override // com.payair.hce.handleMDESPushPayload
                public final byte[] AlternateContactlessPaymentDataJson() {
                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 23) % 128;
                    byte[] paymentFci = com.payair.hce.getString.AnonymousClass3.this.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getPaymentFci();
                    int i = SdkCoreAlternateContactlessPaymentDataImpl + 63;
                    getAid = i % 128;
                    if (i % 2 == 0) {
                        return paymentFci;
                    }
                    throw new java.lang.ArithmeticException();
                }

                @Override // com.payair.hce.handleMDESPushPayload
                public final byte[] valueOf() {
                    int i = getAid + 3;
                    SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                    if (i % 2 != 0) {
                        byte[] bArr = com.payair.hce.getString.AnonymousClass3.this.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getgpoResponse();
                        int i2 = getAid + 67;
                        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                        if (i2 % 2 != 0) {
                            return bArr;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                    com.payair.hce.getString.AnonymousClass3.this.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getgpoResponse();
                    throw null;
                }

                @Override // com.payair.hce.handleMDESPushPayload
                public final byte[] writeReplace() {
                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 9) % 128;
                    byte[] cvrMaskAnd = com.payair.hce.getString.AnonymousClass3.this.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getCvrMaskAnd();
                    int i = getAid + 105;
                    SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                    if (i % 2 != 0) {
                        return cvrMaskAnd;
                    }
                    throw null;
                }

                @Override // com.payair.hce.handleMDESPushPayload
                public final byte[] values() {
                    int i = getAid + 51;
                    SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                    if (i % 2 != 0) {
                        byte[] ciacDecline = com.payair.hce.getString.AnonymousClass3.this.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getCiacDecline();
                        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 101) % 128;
                        return ciacDecline;
                    }
                    com.payair.hce.getString.AnonymousClass3.this.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getCiacDecline();
                    throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:42:0x01bb, code lost:
                
                    if (r11 != false) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x01d0, code lost:
                
                    r4 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x01ce, code lost:
                
                    r4 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x01cc, code lost:
                
                    if (r11 != false) goto L46;
                 */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x01a1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr2) {
                    boolean z;
                    int i4;
                    int i5;
                    int length;
                    byte[] bArr;
                    com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    try {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf)};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 27, 29 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                        if (intValue == -1) {
                            int i6 = $11 + 79;
                            $10 = i6 % 128;
                            if (i6 % 2 == 0) {
                                z = true;
                                if (z) {
                                    byte[] bArr2 = AlternateContactlessPaymentDataJson;
                                    if (bArr2 != null) {
                                        int i7 = $11 + 111;
                                        $10 = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            length = bArr2.length;
                                            bArr = new byte[length];
                                        } else {
                                            length = bArr2.length;
                                            bArr = new byte[length];
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            $10 = ($11 + 17) % 128;
                                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr2[i8])};
                                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                            if (obj2 == null) {
                                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 31, 5088 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("e", java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                            }
                                            bArr[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).byteValue();
                                        }
                                        bArr2 = bArr;
                                    }
                                    if (bArr2 != null) {
                                        $10 = ($11 + 5) % 128;
                                        byte[] bArr3 = AlternateContactlessPaymentDataJson;
                                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                                        if (obj3 == null) {
                                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 27, 29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.MeasureSpec.getSize(0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                                        }
                                        intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                                    } else {
                                        intValue = (short) (((short) (RecordsJson[i2 + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                                    }
                                }
                                if (intValue > 0) {
                                    int i9 = $11 + 41;
                                    $10 = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        i4 = ((i2 / intValue) % 2) * ((int) (DigitizedCardProfile - 4897270311952305750L));
                                    } else {
                                        i4 = ((i2 + intValue) - 2) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)));
                                    }
                                    gettrack2constructiondata.writeReplace = i4 + i5;
                                    java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(writeReplace), sb};
                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                    if (obj4 == null) {
                                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2364, (char) (android.os.Process.myTid() >> 22));
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        a((byte) ($$e & 9), 0, (short) 0, objArr7);
                                        obj4 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                                    }
                                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                    byte[] bArr4 = AlternateContactlessPaymentDataJson;
                                    if (bArr4 != null) {
                                        int length2 = bArr4.length;
                                        byte[] bArr5 = new byte[length2];
                                        for (int i10 = 0; i10 < length2; i10++) {
                                            bArr5[i10] = (byte) (bArr4[i10] ^ (-4897270311952305750L));
                                        }
                                        bArr4 = bArr5;
                                    }
                                    boolean z2 = bArr4 != null;
                                    gettrack2constructiondata.DigitizedCardProfile = 1;
                                    while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                        if (z2) {
                                            $10 = ($11 + 29) % 128;
                                            byte[] bArr6 = AlternateContactlessPaymentDataJson;
                                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                            gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r5] ^ (-4897270311952305750L))) + s)) ^ b));
                                        } else {
                                            short[] sArr = RecordsJson;
                                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                            gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r5] ^ (-4897270311952305750L))) + s)) ^ b));
                                        }
                                        sb.append(gettrack2constructiondata.values);
                                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                        gettrack2constructiondata.DigitizedCardProfile++;
                                        $11 = ($10 + 93) % 128;
                                    }
                                }
                                objArr2[0] = sb.toString();
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        if (intValue > 0) {
                        }
                        objArr2[0] = sb.toString();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                @Override // com.payair.hce.handleMDESPushPayload
                public final byte[] DigitizedCardProfile() {
                    int i = (getAid + 3) % 128;
                    SdkCoreAlternateContactlessPaymentDataImpl = i;
                    byte[] bArr = new byte[0];
                    getAid = (i + 11) % 128;
                    return bArr;
                }

                @Override // com.payair.hce.handleMDESPushPayload
                public final byte[] getAid() {
                    int i = SdkCoreAlternateContactlessPaymentDataImpl + 111;
                    getAid = i % 128;
                    com.payair.hce.JsonRequest alternateContactlessPaymentData = com.payair.hce.getString.AnonymousClass3.this.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData();
                    if (i % 2 == 0) {
                        return alternateContactlessPaymentData.getAid();
                    }
                    alternateContactlessPaymentData.getAid();
                    throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:377:0x1660, code lost:
                
                    r2 = new java.lang.Object[]{new int[1], new int[1], null, r1, new int[1]};
                    r1 = (java.lang.String) java.lang.Class.forName(r1).getField(r40).get(r39);
                    ((int[]) r2[0])[0] = r34 == true ? 1 : 0;
                    ((int[]) r2[1])[0] = (r34 == true ? 1 : 0) ^ 20;
                    r1 = (int) java.lang.System.currentTimeMillis();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:378:0x169d, code lost:
                
                    r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r41), 16, java.lang.Integer.valueOf((((((~((-283851283) | r4)) | 746284662) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1034474288) + (((~((~r1) | (-276830209))) | (~(1023114870 | r1))) * (-519))) + (((~(r1 | 746284662)) | 283851282) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                    r9 = r38;
                    r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r9);
                    r1 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:379:0x16e1, code lost:
                
                    if (r1 != null) goto L247;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:380:0x16e3, code lost:
                
                    r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 50, android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                    r3 = com.payair.hce.getString.AnonymousClass3.C01013.$$a[41];
                    r7 = new java.lang.Object[1];
                    d(r3, (short) (r3 | 653), r3, r7);
                    r1 = r1.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r9, r1);
                    r1 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:382:0x1737, code lost:
                
                    r4 = 0;
                    ((int[]) r2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
                    r34 = r34;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:120:0x195e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:121:0x195f  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x1f03 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:166:0x1f04  */
                /* JADX WARN: Removed duplicated region for block: B:538:0x182a A[Catch: Exception -> 0x1838, all -> 0x1859, IOException -> 0x1869, TryCatch #12 {, blocks: (B:302:0x1182, B:304:0x119c, B:307:0x11a9, B:322:0x1227, B:327:0x1288, B:339:0x12e1, B:359:0x14d0, B:361:0x14d3, B:363:0x1568, B:365:0x1588, B:367:0x15a7, B:369:0x15c6, B:371:0x1610, B:373:0x1657, B:396:0x1838, B:397:0x1858, B:433:0x17ba, B:434:0x17bd, B:497:0x17cd, B:499:0x17d9, B:500:0x17da, B:506:0x17f2, B:508:0x17f8, B:509:0x17f9, B:521:0x1802, B:523:0x1808, B:524:0x1809, B:536:0x1824, B:538:0x182a, B:539:0x182b), top: B:301:0x1182 }] */
                /* JADX WARN: Removed duplicated region for block: B:539:0x182b A[Catch: Exception -> 0x1838, all -> 0x1859, IOException -> 0x1869, TRY_LEAVE, TryCatch #12 {, blocks: (B:302:0x1182, B:304:0x119c, B:307:0x11a9, B:322:0x1227, B:327:0x1288, B:339:0x12e1, B:359:0x14d0, B:361:0x14d3, B:363:0x1568, B:365:0x1588, B:367:0x15a7, B:369:0x15c6, B:371:0x1610, B:373:0x1657, B:396:0x1838, B:397:0x1858, B:433:0x17ba, B:434:0x17bd, B:497:0x17cd, B:499:0x17d9, B:500:0x17da, B:506:0x17f2, B:508:0x17f8, B:509:0x17f9, B:521:0x1802, B:523:0x1808, B:524:0x1809, B:536:0x1824, B:538:0x182a, B:539:0x182b), top: B:301:0x1182 }] */
                /* JADX WARN: Type inference failed for: r15v14, types: [int] */
                /* JADX WARN: Type inference failed for: r15v15 */
                /* JADX WARN: Type inference failed for: r15v16 */
                /* JADX WARN: Type inference failed for: r15v17 */
                /* JADX WARN: Type inference failed for: r15v18 */
                /* JADX WARN: Type inference failed for: r15v19 */
                /* JADX WARN: Type inference failed for: r15v30 */
                /* JADX WARN: Type inference failed for: r15v48 */
                /* JADX WARN: Type inference failed for: r15v70 */
                /* JADX WARN: Type inference failed for: r1v494, types: [java.lang.reflect.Field] */
                /* JADX WARN: Type inference failed for: r34v61, types: [long] */
                /* JADX WARN: Type inference failed for: r35v26, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r37v1, types: [byte] */
                /* JADX WARN: Type inference failed for: r37v12 */
                /* JADX WARN: Type inference failed for: r37v25 */
                /* JADX WARN: Type inference failed for: r37v28 */
                /* JADX WARN: Type inference failed for: r37v29 */
                /* JADX WARN: Type inference failed for: r40v0 */
                /* JADX WARN: Type inference failed for: r40v1 */
                /* JADX WARN: Type inference failed for: r40v11 */
                /* JADX WARN: Type inference failed for: r40v12 */
                /* JADX WARN: Type inference failed for: r40v13 */
                /* JADX WARN: Type inference failed for: r40v14 */
                /* JADX WARN: Type inference failed for: r40v15 */
                /* JADX WARN: Type inference failed for: r40v16 */
                /* JADX WARN: Type inference failed for: r40v17 */
                /* JADX WARN: Type inference failed for: r40v18 */
                /* JADX WARN: Type inference failed for: r40v2 */
                /* JADX WARN: Type inference failed for: r40v3 */
                /* JADX WARN: Type inference failed for: r40v4 */
                /* JADX WARN: Type inference failed for: r40v5 */
                /* JADX WARN: Type inference failed for: r40v8 */
                /* JADX WARN: Type inference failed for: r9v142 */
                /* JADX WARN: Type inference failed for: r9v143 */
                /* JADX WARN: Type inference failed for: r9v144 */
                /* JADX WARN: Type inference failed for: r9v145 */
                /* JADX WARN: Type inference failed for: r9v146 */
                /* JADX WARN: Type inference failed for: r9v147 */
                /* JADX WARN: Type inference failed for: r9v163 */
                /* JADX WARN: Type inference failed for: r9v203 */
                /* JADX WARN: Type inference failed for: r9v246 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                    android.content.Context context;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    java.lang.Integer num;
                    java.lang.Object[] objArr3;
                    char c;
                    int i5;
                    int i6;
                    java.lang.Integer num2;
                    int i7;
                    java.lang.Object[] objArr4;
                    char c2;
                    java.lang.Object[] objArr5;
                    int i8;
                    java.lang.Object[] objArr6;
                    int i9;
                    java.lang.Object[] objArr7;
                    char c3;
                    java.lang.String intern;
                    java.lang.Runtime runtime;
                    java.lang.Process exec;
                    java.lang.Throwable th;
                    java.lang.Throwable cause;
                    java.lang.Object obj;
                    java.lang.Throwable th2;
                    java.lang.Throwable th3;
                    java.lang.InterruptedException interruptedException;
                    int i10;
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.Object obj2;
                    java.lang.Object[] objArr8;
                    int i11;
                    java.lang.Object[] objArr9;
                    int i12;
                    java.lang.Object[] objArr10;
                    int i13;
                    android.content.Context context2 = (android.content.Context) objArr2[0];
                    int intValue = ((java.lang.Number) objArr2[1]).intValue();
                    int intValue2 = ((java.lang.Number) objArr2[2]).intValue();
                    int intValue3 = ((java.lang.Number) objArr2[3]).intValue();
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b((-1167744066) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (-2005961566) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 12 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) android.graphics.Color.argb(0, 0, 0, 0), (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr11);
                    java.lang.String intern2 = ((java.lang.String) objArr11[0]).intern();
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    c("縅磱珷櫓旡岽垵", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1777, objArr12);
                    java.lang.String intern3 = ((java.lang.String) objArr12[0]).intern();
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    c("縋\ufb09琅\uf11b橫\ue720怶\udd30噎팞䱯쥪䉿뽱㡾떂", 34057 - android.text.TextUtils.indexOf("", "", 0), objArr13);
                    java.lang.String intern4 = ((java.lang.String) objArr13[0]).intern();
                    int i14 = -1347122530;
                    try {
                        if (context2 == null) {
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            b((-1167744117) - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.rgb(0, 0, 0) - 1989184468, (-9) - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (android.view.ViewConfiguration.getTapTimeout() >> 16), (short) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr14);
                            java.lang.Object[] objArr15 = {((java.lang.String) objArr14[0]).intern()};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                            java.lang.Object obj4 = obj3;
                            if (obj3 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 36, 3161 - (android.os.Process.myTid() >> 22), (char) (android.view.View.MeasureSpec.getMode(0) + 33099));
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                d(34, (short) 618, $$a[41], objArr16);
                                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method);
                                obj4 = method;
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr15)).longValue();
                            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                            long j = ~longValue;
                            long j2 = currentTimeMillis;
                            long j3 = ((503 * longValue) - 407561620749L) + (((~(longValue | 813496249)) | (~(j | j2))) * (-502)) + ((~((~j2) | j | 813496249)) * (-502)) + ((j | (~((-813496250) | j2))) * 502) + 93974489;
                            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                            int i15 = ~currentTimeMillis3;
                            if (((((int) j3) & ((((~(894865058 | i15)) | (~(542361351 | currentTimeMillis3)) | (~((-542361352) | i15))) * 959) + 2118685804 + (((~(currentTimeMillis3 | 894865058)) | (~(i15 | 542361351)) | (~((-542361352) | currentTimeMillis3))) * 959))) | (((int) (j3 >> 32)) & (((((~(1219042473 | currentTimeMillis2)) | 1638698411) * (-964)) - 2036343442) + (((~((~currentTimeMillis2) | 1219042473)) | 553943298) * (-964))))) != 0) {
                                objArr8 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue ^ 50}, null, null, new int[1]};
                                int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf((((((~(116362986 | r4)) | (-922722303)) | (~((-107413643) | currentTimeMillis4))) * 717) - 976190616) + (((~(currentTimeMillis4 | 116362986)) | (~((~currentTimeMillis4) | (-107413643))) | (-922722303)) * 717))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj6 = obj5;
                                if (obj5 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, (android.os.Process.myTid() >> 22) + 2713, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                    byte b = $$a[41];
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    d(b, (short) (b | 653), b, objArr18);
                                    java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                                    obj6 = method2;
                                }
                                i11 = 0;
                                ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr17)).intValue();
                            } else {
                                objArr8 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue}, null, null, new int[1]};
                                int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                int i16 = ~currentTimeMillis5;
                                java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(intValue3), 0, java.lang.Integer.valueOf(((~(currentTimeMillis5 | 316079908)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 966638216 + (((-671678529) | i16) * (-216)) + (((~(i16 | 316079908)) | 714056036) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj8 = obj7;
                                if (obj7 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                    byte b2 = $$a[41];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    d(b2, (short) (b2 | 653), b2, objArr20);
                                    java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                                    obj8 = method3;
                                }
                                i11 = 0;
                                ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr19)).intValue();
                            }
                            if (((int[]) objArr8[1])[i11] != intValue) {
                                return objArr8;
                            }
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            c("繎퓻⯊纩햱⢉罺툑⥟簠팓☍糣폑⚀綵킁❹穠텏", 43753 - android.text.TextUtils.getCapsMode("", i11, i11), objArr21);
                            java.lang.Object[] objArr22 = {((java.lang.String) objArr21[i11]).intern()};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                            java.lang.Object obj10 = obj9;
                            if (obj9 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35, android.view.KeyEvent.keyCodeFromString("") + 3161, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 33099));
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                d(34, (short) 618, $$a[41], objArr23);
                                java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method4);
                                obj10 = method4;
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr22)).longValue();
                            long currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                            long j4 = ~longValue2;
                            long j5 = ((-661) * longValue2) + 170481786577L + (((~currentTimeMillis6) | (~(j4 | 257914956))) * 1324) + (((~((-257914957) | currentTimeMillis6)) | (~(currentTimeMillis6 | longValue2))) * (-1324)) + (((~(257914956 | longValue2)) | (~((-257914957) | j4))) * 662) + 1165385695;
                            int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                            int i17 = ~((-575213889) | currentTimeMillis7);
                            int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                            int i18 = ~currentTimeMillis8;
                            if (((((int) j5) & ((((~((-1680207586) | i18)) | (~((-1177533301) | currentTimeMillis8)) | (~(1177533300 | i18))) * 959) + 1631350900 + (((~(currentTimeMillis8 | (-1680207586))) | (~(i18 | (-1177533301))) | (~(1177533300 | currentTimeMillis8))) * 959))) | (((int) (j5 >> 32)) & (((134235140 | i17) * (-476)) + 1984739866 + (i17 * 952) + ((~((~currentTimeMillis7) | (-575213889))) * 476)))) != 0) {
                                objArr9 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue ^ 60}, null, null, new int[1]};
                                int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                                int i19 = ~currentTimeMillis9;
                                java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf(((801322218 | i19) * (-757)) + 627367492 + ((~((-2116373) | currentTimeMillis9)) * 1514) + (((~(currentTimeMillis9 | 803438590)) | (~(i19 | (-228813727))) | 226697354) * 757))};
                                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj12 = obj11;
                                if (obj11 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, 2713 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    byte b3 = $$a[41];
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    d(b3, (short) (b3 | 653), b3, objArr25);
                                    java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                                    obj12 = method5;
                                }
                                i12 = 0;
                                ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr24)).intValue();
                            } else {
                                objArr9 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue}, null, null, new int[1]};
                                int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                int i20 = ~currentTimeMillis10;
                                java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(intValue3), 0, java.lang.Integer.valueOf(((341998683 | currentTimeMillis10) * (-50)) + 903076228 + (((~(currentTimeMillis10 | (-9226))) | (~((-688128037) | i20))) * 50) + (((~(341998683 | i20)) | (~(i20 | (-688137262))) | 688128036) * 50))};
                                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj14 = obj13;
                                if (obj13 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    byte b4 = $$a[41];
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    d(b4, (short) (b4 | 653), b4, objArr27);
                                    java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                                    obj14 = method6;
                                }
                                i12 = 0;
                                ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr26)).intValue();
                            }
                            if (((int[]) objArr9[1])[i12] != intValue) {
                                return objArr9;
                            }
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            b((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 1167744116, (android.view.ViewConfiguration.getTapTimeout() >> 16) - 2005961673, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, (byte) android.text.TextUtils.getOffsetAfter("", i12), (short) ((android.os.Process.getThreadPriority(i12) + 20) >> 6), objArr28);
                            java.lang.Object[] objArr29 = {((java.lang.String) objArr28[0]).intern()};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                            java.lang.Object obj16 = obj15;
                            if (obj15 == null) {
                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 3161 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33099));
                                byte[] bArr = $$a;
                                byte b5 = bArr[49];
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                d(b5, (short) (b5 | 580), (byte) (-bArr[16]), objArr30);
                                java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr30[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method7);
                                obj16 = method7;
                            }
                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr29)).longValue();
                            int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                            long j6 = ~longValue3;
                            long j7 = currentTimeMillis11;
                            long j8 = ~j7;
                            long j9 = j8 | (-348682406);
                            long j10 = (((-885) * longValue3) - 618213905838L) + (((~(j7 | j6)) | (~(j6 | 348682405)) | (~(j9 | longValue3))) * 886) + (((~(longValue3 | j8)) | (-348682406)) * (-1772)) + ((~j9) * 886) + 1344117309;
                            int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                            int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                            if (((((int) j10) & (((((~((-1457570655) | r5)) | 1382072918) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-1382072919) | currentTimeMillis13)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(currentTimeMillis13 | (-75497737))) | (~((~currentTimeMillis13) | (-1400170232))) | 18097313) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) (j10 >> 32)) & ((((((~(726057770 | currentTimeMillis12)) | (-2135877419)) * 1504) - 1320242614) + ((~(currentTimeMillis12 | (-1409819649))) * (-1504))) - 1813397504))) != 0) {
                                objArr10 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue ^ 80}, null, null, new int[1]};
                                int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf(((((~((-236653513) | r3)) | 235602112) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 234010808) + ((~((-235602113) | currentTimeMillis14)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(currentTimeMillis14 | (-1051401))) | (~((~currentTimeMillis14) | (-793482433))) | 557880320) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj18 = obj17;
                                if (obj17 == null) {
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.getOffsetBefore("", 0) + 2713, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                    byte b6 = $$a[41];
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    d(b6, (short) (b6 | 653), b6, objArr32);
                                    java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                                    obj18 = method8;
                                }
                                i13 = 0;
                                ((int[]) objArr10[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr31)).intValue();
                            } else {
                                objArr10 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue}, null, null, new int[1]};
                                int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                java.lang.Object[] objArr33 = {java.lang.Integer.valueOf(intValue3), 0, java.lang.Integer.valueOf((((~currentTimeMillis15) | 510312714) * 1324) + 1979941080 + (((~(currentTimeMillis15 | 510314814)) | (~(519821130 | currentTimeMillis15))) * (-1324)) + 2000994296)};
                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj20 = obj19;
                                if (obj19 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", ""), 2713 - android.text.TextUtils.getTrimmedLength(""), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                    byte b7 = $$a[41];
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    d(b7, (short) (b7 | 653), b7, objArr34);
                                    java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr34[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method9);
                                    obj20 = method9;
                                }
                                int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr33)).intValue();
                                i13 = 0;
                                ((int[]) objArr10[4])[0] = intValue4;
                            }
                            if (((int[]) objArr10[1])[i13] != intValue) {
                                return objArr10;
                            }
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            b((-1167744116) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i13) - 2005961637, 20 - (android.os.Process.myPid() >> 22), (byte) android.text.TextUtils.indexOf("", "", i13, i13), (short) android.widget.ExpandableListView.getPackedPositionType(0L), objArr35);
                            java.lang.Object[] objArr36 = {((java.lang.String) objArr35[0]).intern()};
                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                            java.lang.Object obj22 = obj21;
                            if (obj21 == null) {
                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.Process.myPid() >> 22), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3161, (char) (33099 - android.view.View.MeasureSpec.getMode(0)));
                                byte[] bArr2 = $$a;
                                byte b8 = bArr2[49];
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                d(b8, (short) (b8 | 580), (byte) (-bArr2[16]), objArr37);
                                java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr37[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method10);
                                obj22 = method10;
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr36)).longValue();
                            long currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                            long j11 = ~currentTimeMillis16;
                            long j12 = ~longValue4;
                            long j13 = (((-756) * longValue4) - 837429736818L) + ((j11 | (-1104788571)) * (-757)) + ((~(j12 | (-1104788571) | currentTimeMillis16)) * 1514) + (((~(longValue4 | (-1104788571) | currentTimeMillis16)) | (~(j11 | j12)) | (~(1104788570 | j12))) * 757) + 2100223474;
                            int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                            int i21 = ~currentTimeMillis17;
                            int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                            if (((((int) j13) & (((~((~currentTimeMillis18) | 2130165727)) * 433) + 1390854570 + (((~((-648527774) | currentTimeMillis18)) | 2085754183) * (-433)) + (((~(currentTimeMillis18 | 2085754183)) | 1481637954) * 433))) | (((int) (j13 >> 32)) & (((((~((-1624686266) | i21)) | (-1233054620)) * (-1042)) - 681116232) + (((-1624686266) | currentTimeMillis17) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(currentTimeMillis17 | 1233054619)) | (-1778319292) | (~(i21 | (-1079421594)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) == 0) {
                                java.lang.Object[] objArr38 = {new int[]{intValue}, new int[]{intValue}, null, null, new int[1]};
                                int i22 = ~((int) java.lang.System.currentTimeMillis());
                                java.lang.Object[] objArr39 = {java.lang.Integer.valueOf(intValue3), 0, java.lang.Integer.valueOf((((~((-924693272) | i22)) | (-105442674)) * (-983)) + 611949354 + (((~(i22 | (-105442674))) | 4213856) * 983))};
                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj24 = obj23;
                                if (obj23 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                    byte b9 = $$a[41];
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    d(b9, (short) (b9 | 653), b9, objArr40);
                                    java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method11);
                                    obj24 = method11;
                                }
                                ((int[]) objArr38[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr39)).intValue();
                                return objArr38;
                            }
                            java.lang.Object[] objArr41 = {new int[]{intValue}, new int[]{intValue ^ 90}, null, null, new int[1]};
                            int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                            int i23 = ~currentTimeMillis19;
                            java.lang.Object[] objArr42 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf((((~((-807537066) | i23)) | (-222598880) | (~(807537065 | currentTimeMillis19))) * (-564)) + 222791056 + ((~(currentTimeMillis19 | (-222598743))) * 1128) + (((~((-222598880) | i23)) | (-1030135808)) * 564))};
                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj26 = obj25;
                            if (obj25 == null) {
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                byte b10 = $$a[41];
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                d(b10, (short) (b10 | 653), b10, objArr43);
                                java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr43[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method12);
                                obj26 = method12;
                            }
                            ((int[]) objArr41[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr42)).intValue();
                            return objArr41;
                        }
                        try {
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            c("縀闎ꦇ뵐턊\ue4cd\uf883ఈ\u200a㟇䮅彞猈蛂骛글숲\ud9df\ued9dņᔐ⣌㲃", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 60354, objArr44);
                            java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1167744059, (-2005961598) - android.widget.ExpandableListView.getPackedPositionChild(0L), (-8) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr45);
                            java.lang.String str3 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr45[0]).intern(), null).invoke(context2, null);
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            c("縀闎ꦇ뵐턊\ue4cd\uf883ఈ\u200a㟇䮅彞猈蛂骛글숲\ud9df\ued9dņᔐ⣌㲃", android.graphics.Color.rgb(0, 0, 0) + 16837569, objArr46);
                            java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr46[0]).intern());
                            long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                            float complexToFloat = android.util.TypedValue.complexToFloat(0);
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            int i24 = (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) - 1167744061;
                            int i25 = (-2005961584) - (scrollDefaultDelay >> 16);
                            ?? maxKeyCode = (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                            b(i24, i25, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) - 4, maxKeyCode, (short) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr47);
                            java.lang.Object invoke = cls14.getMethod(((java.lang.String) objArr47[0]).intern(), null).invoke(context2, null);
                            int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str3);
                            if (indexOf > 0) {
                                java.lang.String str4 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                int i26 = 16;
                                if (str4.length() >= 16) {
                                    int i27 = 0;
                                    i24 = i24;
                                    i25 = i25;
                                    while (i27 <= str4.length() - i26) {
                                        java.lang.Object[] objArr48 = {str4.substring(i27, i27 + 16), 931995};
                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                        if (obj27 == null) {
                                            str2 = str4;
                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 28, 2593 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                            context = context2;
                                            i2 = intValue2;
                                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                                            d(34, r14[41], (byte) (-$$a[52]), objArr49);
                                            java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr49[0], java.lang.String.class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                            obj2 = method13;
                                        } else {
                                            context = context2;
                                            str2 = str4;
                                            i2 = intValue2;
                                            obj2 = obj27;
                                        }
                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr48)).longValue();
                                        long j14 = ~(((int) java.lang.System.currentTimeMillis()) | longValue5);
                                        long j15 = (111 * longValue5) + 15378798119L + ((j14 | 141089890) * (-220)) + (((~(longValue5 | (-141089891))) | j14) * 220) + (((~(141089890 | longValue5)) | (~((~longValue5) | (-141089891)))) * 110) + 1398190415;
                                        int currentTimeMillis20 = (int) java.lang.System.currentTimeMillis();
                                        int i28 = ~(1284087938 | currentTimeMillis20);
                                        int currentTimeMillis21 = (int) java.lang.System.currentTimeMillis();
                                        int i29 = ~currentTimeMillis21;
                                        ?? r35 = invoke;
                                        java.lang.String str5 = intern4;
                                        i24 = 1149829250;
                                        if (((((int) j15) & (((((~((-1579492402) | currentTimeMillis21)) | (-1278248485)) * (-318)) - 130941317) + (((~((-1278248485) | currentTimeMillis21)) | (~(1580574261 | i29))) * 318) + (((~(1580574261 | currentTimeMillis21)) | (~((-1081861) | i29))) * 318))) | ((((i28 | 18879784) * (-814)) + 2064513766 + (((~((~currentTimeMillis20) | (-153138473))) | 1149829250 | i28) * 407) + (((~(currentTimeMillis20 | (-1284087939))) | 1149829250 | (~(153138472 | currentTimeMillis20))) * 407)) & ((int) (j15 >> 32)))) == -725904754) {
                                            objArr3 = new java.lang.Object[]{new int[1], new int[1], null, r1, new int[1]};
                                            java.lang.String str6 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(r35);
                                            ((int[]) objArr3[0])[0] = intValue;
                                            ((int[]) objArr3[1])[0] = intValue ^ 20;
                                            int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                                            java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf(((((~((-218241127) | currentTimeMillis22)) | 805569536) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 797897494) + ((~((~currentTimeMillis22) | (-218241127))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            java.lang.Object obj29 = obj28;
                                            if (obj28 == null) {
                                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                                                byte b11 = $$a[41];
                                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                d(b11, (short) (b11 | 653), b11, objArr51);
                                                java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method14);
                                                obj29 = method14;
                                            }
                                            int intValue5 = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr50)).intValue();
                                            c = 0;
                                            ((int[]) objArr3[4])[0] = intValue5;
                                            i5 = intValue;
                                            i4 = intValue3;
                                            num = -1347122530;
                                            i6 = i5;
                                            if (((int[]) objArr3[1])[c] != i6) {
                                                return objArr3;
                                            }
                                            int[] iArr = new int[1];
                                            int[] iArr2 = new int[1];
                                            iArr[c] = i6;
                                            iArr2[c] = i6;
                                            java.lang.Object[] objArr52 = {iArr, iArr2, null, null, new int[1]};
                                            int currentTimeMillis23 = (int) java.lang.System.currentTimeMillis();
                                            int i30 = (~((-451252291) | currentTimeMillis23)) | 42012738;
                                            java.lang.Object[] objArr53 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((i30 * 992) + 1183815944 + ((i30 | (~((~currentTimeMillis23) | 988123206))) * (-496)) + ((currentTimeMillis23 | 578883654) * 496))};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                            java.lang.Object obj31 = obj30;
                                            if (obj30 == null) {
                                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) android.text.TextUtils.getTrimmedLength(""));
                                                byte b12 = $$a[41];
                                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                d(b12, (short) (b12 | 653), b12, objArr54);
                                                java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr54[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method15);
                                                obj31 = method15;
                                            }
                                            ((int[]) objArr52[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr53)).intValue();
                                            if (((int[]) objArr52[1])[0] != i6) {
                                                return objArr52;
                                            }
                                            if ((i2 & 1) == 0) {
                                                java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                b(android.view.View.combineMeasuredStates(0, 0) - 1167744063, android.text.TextUtils.getOffsetBefore("", 0) - 2005961523, android.view.View.resolveSize(0, 0) - 9, (byte) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (short) android.view.KeyEvent.normalizeMetaState(0), objArr55);
                                                try {
                                                    java.lang.Object[] objArr56 = {((java.lang.String) objArr55[0]).intern()};
                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                    c("縀闎ꦇ뵐턊\ue4cd\uf883ఈ\u200a㟇䮅彞猈蛂骛글숲\ud9df\ued9dņᔐ⣌㲃", 60352 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr57);
                                                    java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr57[0]).intern());
                                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                    b((-1167744061) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-2005961512) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 5, (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (short) android.view.KeyEvent.getDeadChar(0, 0), objArr58);
                                                    java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr58[0]).intern(), java.lang.String.class).invoke(context, objArr56);
                                                    if (invoke2 != null) {
                                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                        c("縀遆ꊗ듈윪\ud965\uebb3ﶰైẀニ䍬啬枰秲衏骟겖뼇텯\ue3a3\uf5f5фᚋ⣩㬯䵧徻燾聝銢ꓗ뜯쥩\udbb4\uedffﱗ", 61001 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr59);
                                                        java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr59[0]).intern());
                                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                        b((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1167744061, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 2005961497, (-8) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) android.graphics.Color.red(0), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr60);
                                                        java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr60[0]).intern(), null).invoke(invoke2, null);
                                                        if (list != null) {
                                                            java.util.Iterator it = list.iterator();
                                                            while (it.hasNext()) {
                                                                java.lang.Object next = it.next();
                                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                c("縀\uf228晋\uda66互싋㛯ꭞἺ鍑މ箸\uefd0援퐷䠆뱒゙꒲ᣴ贂ļ畞\ue98e嶽퇠䗶똑⩀", (android.os.Process.myTid() >> 22) + 35879, objArr61);
                                                                java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr61[0]).intern());
                                                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                                b((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1167744061, (-2005961597) - android.view.Gravity.getAbsoluteGravity(0, 0), (-7) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr62);
                                                                java.lang.String str7 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr62[0]).intern(), null).invoke(next, null);
                                                                java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                                c("縀遆ꊗ듈윪\ud965\uebb3ﶰైẀニ䍬啬枰秲衏骟겖뼇텯\ue3a3\uf5f5фᚋ⣩㬯䵧徻燾聝銢ꓗ뜯쥩\udbb4\uedffﱗ", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 61001, objArr63);
                                                                java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr63[0]).intern());
                                                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                c("縈특❧砒첢⅐爊욠᭜氭삸ᕖ昀몼ེ怔뒡", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44202, objArr64);
                                                                if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr64[0]).intern(), java.lang.String.class).invoke(invoke2, str7)).booleanValue()) {
                                                                    if (str7.length() >= 20) {
                                                                        int i31 = 0;
                                                                        for (int i32 = 20; i31 <= str7.length() - i32; i32 = 20) {
                                                                            java.lang.Object[] objArr65 = {str7.substring(i31, i31 + 20), 931995};
                                                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                            java.lang.Object obj33 = obj32;
                                                                            if (obj32 == null) {
                                                                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.indexOf("", ""), android.text.TextUtils.getOffsetAfter("", 0) + 2594, (char) (android.os.Process.myPid() >> 22));
                                                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                                d(34, r7[41], (byte) (-$$a[52]), objArr66);
                                                                                java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                                obj33 = method16;
                                                                            }
                                                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr65)).longValue();
                                                                            int currentTimeMillis24 = (int) java.lang.System.currentTimeMillis();
                                                                            long j16 = ~longValue6;
                                                                            long j17 = currentTimeMillis24;
                                                                            java.lang.Object obj34 = invoke2;
                                                                            java.util.Iterator it2 = it;
                                                                            long j18 = ~(j17 | 1000205815);
                                                                            long j19 = ~(longValue6 | (-1000205816));
                                                                            java.lang.String str8 = str7;
                                                                            int i33 = i31;
                                                                            java.lang.Integer num3 = num;
                                                                            long j20 = ((408 * longValue6) - 813167327595L) + (((~(j16 | 1000205815)) | j18) * (-814)) + ((j18 | (~((~j17) | j16)) | j19) * 407) + (((~((-1000205816) | j17)) | j19 | (~(j17 | longValue6))) * 407) + 256894709;
                                                                            int currentTimeMillis25 = (int) java.lang.System.currentTimeMillis();
                                                                            int currentTimeMillis26 = (int) java.lang.System.currentTimeMillis();
                                                                            int i34 = ~(316529042 | currentTimeMillis26);
                                                                            int i35 = ~currentTimeMillis26;
                                                                            if (((((int) j20) & ((((1073751045 | i34) * (-280)) - 522810607) + ((i34 | (~(1120697367 | currentTimeMillis26))) * 140) + (((~(currentTimeMillis26 | 1390280087)) | (~(i35 | (-1073751046))) | (~((-269582721) | i35))) * 140))) | (((int) (j20 >> 32)) & ((((~((~currentTimeMillis25) | (-828572405))) | 608654006) * (-235)) + 1182787018 + (((~((-828572405) | currentTimeMillis25)) | 608654006) * (-470)) + (((~(currentTimeMillis25 | (-287309889))) | 67391490) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)))) == 1245577864) {
                                                                                objArr7 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 70}, null, null, new int[1]};
                                                                                int currentTimeMillis27 = (int) java.lang.System.currentTimeMillis();
                                                                                java.lang.Object[] objArr67 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~(259328810 | currentTimeMillis27)) | (-770807135)) * (-668)) - 1338860528) + (((~((-770807135) | currentTimeMillis27)) | 259328810) * 1336) + ((currentTimeMillis27 | (-545297493)) * 668))};
                                                                                num2 = num3;
                                                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                                                java.lang.Object obj36 = obj35;
                                                                                if (obj35 == null) {
                                                                                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2713 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                                                    byte b13 = $$a[41];
                                                                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                                                    d(b13, (short) (b13 | 653), b13, objArr68);
                                                                                    java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr68[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method17);
                                                                                    obj36 = method17;
                                                                                }
                                                                                int intValue6 = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr67)).intValue();
                                                                                c3 = 0;
                                                                                ((int[]) objArr7[4])[0] = intValue6;
                                                                                if (((int[]) objArr7[1])[c3] == i6) {
                                                                                    return objArr7;
                                                                                }
                                                                                i7 = 0;
                                                                            } else {
                                                                                i31 = i33 + 1;
                                                                                num = num3;
                                                                                it = it2;
                                                                                str7 = str8;
                                                                                invoke2 = obj34;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        continue;
                                                                    }
                                                                }
                                                                num = num;
                                                                it = it;
                                                                invoke2 = invoke2;
                                                            }
                                                        }
                                                    }
                                                    num2 = num;
                                                    objArr7 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                                    int currentTimeMillis28 = (int) java.lang.System.currentTimeMillis();
                                                    int i36 = ~currentTimeMillis28;
                                                    java.lang.Object[] objArr69 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((((~((-199632621) | currentTimeMillis28)) | (-830503325)) * (-318)) - 2018252312) + (((~((-830503325) | currentTimeMillis28)) | (~(1004961788 | i36))) * 318) + (((~(currentTimeMillis28 | 1004961788)) | (~(i36 | (-805329169)))) * 318))};
                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                    java.lang.Object obj38 = obj37;
                                                    if (obj37 == null) {
                                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, 2712 - android.os.Process.getGidForName(""), (char) android.view.View.resolveSize(0, 0));
                                                        byte b14 = $$a[41];
                                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                        d(b14, (short) (b14 | 653), b14, objArr70);
                                                        java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method18);
                                                        obj38 = method18;
                                                    }
                                                    c3 = 0;
                                                    ((int[]) objArr7[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr69)).intValue();
                                                    if (((int[]) objArr7[1])[c3] == i6) {
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    java.lang.Throwable cause2 = th4.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th4;
                                                }
                                            } else {
                                                num2 = num;
                                                i7 = 0;
                                            }
                                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                                            b((-1167744116) - android.view.Gravity.getAbsoluteGravity(i7, i7), (-2005961684) - android.text.TextUtils.indexOf("", "", i7, i7), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 10, (byte) android.view.Gravity.getAbsoluteGravity(i7, i7), (short) android.view.KeyEvent.getDeadChar(i7, i7), objArr71);
                                            java.lang.Object[] objArr72 = {((java.lang.String) objArr71[0]).intern()};
                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                            java.lang.Object obj40 = obj39;
                                            if (obj39 == null) {
                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.MotionEvent.axisFromString(""), 3162 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (33099 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                d(34, (short) 618, $$a[41], objArr73);
                                                java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr73[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method19);
                                                obj40 = method19;
                                            }
                                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, objArr72)).longValue();
                                            int currentTimeMillis29 = (int) java.lang.System.currentTimeMillis();
                                            long j21 = ~longValue7;
                                            long j22 = currentTimeMillis29;
                                            long j23 = (((-103) * longValue7) - 52241735136L) + (((~(j21 | j22)) | (~((-507201313) | j21))) * 104) + ((~(longValue7 | (~j22) | 507201312)) * (-104)) + ((507201312 | j22) * 104) + 400269426;
                                            int currentTimeMillis30 = (int) java.lang.System.currentTimeMillis();
                                            int currentTimeMillis31 = (int) java.lang.System.currentTimeMillis();
                                            if (((((int) (j23 >> 32)) & ((((((~(1687219448 | currentTimeMillis30)) | (-1708457469)) * 576) - 1771464918) + (((~((~currentTimeMillis30) | (-21238021))) | 537936032) * 576)) - 523991360)) | ((((((~((-186649249) | currentTimeMillis31)) | (~(1811868395 | r8))) * 497) - 1824875536) + (((~(currentTimeMillis31 | 1811868395)) | (~((~currentTimeMillis31) | (-187992738))) | 1343489) * 497)) & ((int) j23))) != 0) {
                                                objArr4 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 50}, null, null, new int[1]};
                                                int currentTimeMillis32 = (int) java.lang.System.currentTimeMillis();
                                                int i37 = ~currentTimeMillis32;
                                                java.lang.Object[] objArr74 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((572875098 | currentTimeMillis32) * (-50)) - 1779086048) + (((~(currentTimeMillis32 | (-33628427))) | (~((-423632421) | i37))) * 50) + (((~(572875098 | i37)) | (~(i37 | (-457260847))) | 423632420) * 50))};
                                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                java.lang.Object obj42 = obj41;
                                                if (obj41 == null) {
                                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                    byte b15 = $$a[41];
                                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                    d(b15, (short) (b15 | 653), b15, objArr75);
                                                    java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method20);
                                                    obj42 = method20;
                                                }
                                                c2 = 0;
                                                ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr74)).intValue();
                                            } else {
                                                objArr4 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                                int currentTimeMillis33 = (int) java.lang.System.currentTimeMillis();
                                                int i38 = ~currentTimeMillis33;
                                                int i39 = ~(currentTimeMillis33 | 1029611511);
                                                java.lang.Object[] objArr76 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((~((-759734232) | i38)) | 524433 | i39) * (-502)) + 1293401310 + ((i39 | (~(i38 | (-759209799)))) * 502))};
                                                java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                java.lang.Object obj44 = obj43;
                                                if (obj43 == null) {
                                                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.text.TextUtils.getOffsetBefore("", 0));
                                                    byte b16 = $$a[41];
                                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                    d(b16, (short) (b16 | 653), b16, objArr77);
                                                    java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr77[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method21);
                                                    obj44 = method21;
                                                }
                                                c2 = 0;
                                                ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr76)).intValue();
                                            }
                                            if (((int[]) objArr4[1])[c2] != i6) {
                                                return objArr4;
                                            }
                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                            c("繎퓻⯊纩햱⢉罺툑⥟簠팓☍糣폑⚀綵킁❹穠텏", 43754 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr78);
                                            java.lang.Object[] objArr79 = {((java.lang.String) objArr78[c2]).intern()};
                                            java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                            java.lang.Object obj46 = obj45;
                                            if (obj45 == null) {
                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 36, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3162, (char) (33099 - android.view.View.MeasureSpec.getMode(0)));
                                                java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                d(34, (short) 618, $$a[41], objArr80);
                                                java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr80[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, method22);
                                                obj46 = method22;
                                            }
                                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr79)).longValue();
                                            long currentTimeMillis34 = (int) java.lang.System.currentTimeMillis();
                                            long j24 = ~longValue8;
                                            long j25 = ((-661) * longValue8) + 546174415406L + (((~currentTimeMillis34) | (~(826285045 | j24))) * 1324) + (((~(currentTimeMillis34 | longValue8)) | (~((-826285046) | currentTimeMillis34))) * (-1324)) + (((~(longValue8 | 826285045)) | (~((-826285046) | j24))) * 662) + 1733755784;
                                            int i40 = (int) (j25 >> 32);
                                            int currentTimeMillis35 = (int) java.lang.System.currentTimeMillis();
                                            int i41 = ~currentTimeMillis35;
                                            int i42 = (int) j25;
                                            int currentTimeMillis36 = (int) java.lang.System.currentTimeMillis();
                                            int i43 = ~currentTimeMillis36;
                                            if (((i40 & ((((~(i41 | (-728987860))) | 21045248 | (~(708238551 | i41))) * 464) + 399482090 + (((-707942612) | currentTimeMillis35) * (-464)) + (((~(currentTimeMillis35 | 708238551)) | 21045248) * 464))) | (((((~(32854004 | i43)) | 1375731713) * 98) + 1687694921 + (((~(1404372405 | i43)) | 32854004 | (~((-1404372406) | currentTimeMillis36))) * (-49)) + (((~(32854004 | currentTimeMillis36)) | 28640692) * 49)) & i42)) != 0) {
                                                objArr5 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 60}, null, null, new int[1]};
                                                int currentTimeMillis37 = (int) java.lang.System.currentTimeMillis();
                                                int i44 = ~currentTimeMillis37;
                                                java.lang.Object[] objArr81 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((1173689 | currentTimeMillis37) * (-859)) - 1371946570) + (((~(currentTimeMillis37 | (-1089674))) | (~(1173689 | i44))) * 859) + (((~((-1028962256) | i44)) | 1027872582) * 859))};
                                                java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                java.lang.Object obj48 = obj47;
                                                if (obj47 == null) {
                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2713 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.graphics.Color.alpha(0));
                                                    byte b17 = $$a[41];
                                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                    d(b17, (short) (b17 | 653), b17, objArr82);
                                                    java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr82[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method23);
                                                    obj48 = method23;
                                                }
                                                i8 = 0;
                                                ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr81)).intValue();
                                            } else {
                                                objArr5 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                                int currentTimeMillis38 = (int) java.lang.System.currentTimeMillis();
                                                int i45 = ~currentTimeMillis38;
                                                java.lang.Object[] objArr83 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((~(1001291465 | i45)) | 28844479) * (-328)) + 462620192 + ((28844479 | currentTimeMillis38) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(currentTimeMillis38 | (-1001291466))) | 27795593 | (~(i45 | 1002340351))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                                java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                java.lang.Object obj50 = obj49;
                                                if (obj49 == null) {
                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.view.View.MeasureSpec.getSize(0));
                                                    byte b18 = $$a[41];
                                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                    d(b18, (short) (b18 | 653), b18, objArr84);
                                                    java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr84[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method24);
                                                    obj50 = method24;
                                                }
                                                i8 = 0;
                                                ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr83)).intValue();
                                            }
                                            if (((int[]) objArr5[1])[i8] != i6) {
                                                return objArr5;
                                            }
                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                            b(android.view.View.resolveSizeAndState(i8, i8, i8) - 1167744116, (-2005961672) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") + 14, (byte) android.graphics.Color.red(i8), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i8, i8)), objArr85);
                                            java.lang.Object[] objArr86 = {((java.lang.String) objArr85[0]).intern()};
                                            java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                            java.lang.Object obj52 = obj51;
                                            if (obj51 == null) {
                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35, android.text.TextUtils.indexOf("", "", 0) + 3161, (char) (33100 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                byte[] bArr3 = $$a;
                                                byte b19 = bArr3[49];
                                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                d(b19, (short) (b19 | 580), (byte) (-bArr3[16]), objArr87);
                                                java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method25);
                                                obj52 = method25;
                                            }
                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, objArr86)).longValue();
                                            long j26 = ~((int) java.lang.System.currentTimeMillis());
                                            long j27 = (((-782) * longValue9) - 591535660464L) + ((~longValue9) * (-783)) + ((~(754509770 | j26 | longValue9)) * (-783)) + (((~(longValue9 | j26)) | 754509770) * 783) + 1749944674;
                                            int i46 = (int) (j27 >> 32);
                                            int currentTimeMillis39 = (int) java.lang.System.currentTimeMillis();
                                            int i47 = ~currentTimeMillis39;
                                            int i48 = (int) j27;
                                            int currentTimeMillis40 = (int) java.lang.System.currentTimeMillis();
                                            if (((i46 & (((((~(881495675 | i47)) | 1976245209) * (-865)) - 792199096) + ((~(currentTimeMillis39 | (-881495676))) * 865) + (((~(1976245209 | i47)) | (~(i47 | (-881495676)))) * 865))) | ((((((~((-1454248061) | r9)) | (~((-1403492826) | r9))) * (-867)) - 1972008908) + (((~((-1454248061) | currentTimeMillis40)) | 1386614872 | (~((-1403492826) | currentTimeMillis40))) * (-1734)) + (((~((-16877954) | currentTimeMillis40)) | (~(currentTimeMillis40 | (-67633189))) | (~((~currentTimeMillis40) | (-1386614873)))) * 867)) & i48)) != 0) {
                                                objArr6 = new java.lang.Object[]{new int[]{i6}, new int[]{i6 ^ 80}, null, null, new int[1]};
                                                int currentTimeMillis41 = (int) java.lang.System.currentTimeMillis();
                                                java.lang.Object[] objArr88 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~(66930441 | currentTimeMillis41)) | 963205503) * 56) - 295672120) + (((~((~currentTimeMillis41) | 963205503)) | 66930441) * 56))};
                                                java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                java.lang.Object obj54 = obj53;
                                                if (obj53 == null) {
                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                                    byte b20 = $$a[41];
                                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                    d(b20, (short) (b20 | 653), b20, objArr89);
                                                    java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method26);
                                                    obj54 = method26;
                                                }
                                                int intValue7 = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr88)).intValue();
                                                i9 = 0;
                                                ((int[]) objArr6[4])[0] = intValue7;
                                            } else {
                                                objArr6 = new java.lang.Object[]{new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                                java.lang.Object[] objArr90 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((((~((-371479263) | r1)) | (-658656683)) * (-983)) - 919732469) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-658656683))) | 557976864) * 983))};
                                                java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                java.lang.Object obj56 = obj55;
                                                if (obj55 == null) {
                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, android.text.TextUtils.getCapsMode("", 0, 0) + 2713, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                    byte b21 = $$a[41];
                                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                    d(b21, (short) (b21 | 653), b21, objArr91);
                                                    java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr91[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method27);
                                                    obj56 = method27;
                                                }
                                                int intValue8 = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr90)).intValue();
                                                i9 = 0;
                                                ((int[]) objArr6[4])[0] = intValue8;
                                            }
                                            if (((int[]) objArr6[1])[i9] != i6) {
                                                return objArr6;
                                            }
                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                            b(android.view.View.combineMeasuredStates(i9, i9) - 1167744116, (-2005961638) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 20 - android.view.View.MeasureSpec.makeMeasureSpec(i9, i9), (byte) android.view.View.getDefaultSize(i9, i9), (short) (android.os.Process.getGidForName("") + 1), objArr92);
                                            java.lang.Object[] objArr93 = {((java.lang.String) objArr92[0]).intern()};
                                            java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                            java.lang.Object obj58 = obj57;
                                            if (obj57 == null) {
                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 36, 3160 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (33099 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                byte[] bArr4 = $$a;
                                                byte b22 = bArr4[49];
                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                d(b22, (short) (b22 | 580), (byte) (-bArr4[16]), objArr94);
                                                java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr94[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, method28);
                                                obj58 = method28;
                                            }
                                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj58).invoke(null, objArr93)).longValue();
                                            int currentTimeMillis42 = (int) java.lang.System.currentTimeMillis();
                                            long j28 = ~longValue10;
                                            long j29 = ~currentTimeMillis42;
                                            long j30 = (((-932) * longValue10) - 255928480108L) + (((~(274013361 | j29)) | j28) * (-933)) + (((~(j29 | j28)) | (~(j28 | (-274013362)))) * 933) + ((~(longValue10 | (-274013362))) * 933) + 1269448265;
                                            int currentTimeMillis43 = (int) java.lang.System.currentTimeMillis();
                                            int currentTimeMillis44 = (int) java.lang.System.currentTimeMillis();
                                            int i49 = ~currentTimeMillis44;
                                            if (((((int) (j30 >> 32)) & (((((~((-1695225880) | currentTimeMillis43)) | 1611339795) * 1504) - 1320242614) + ((~(currentTimeMillis43 | (-83886085))) * (-1504)) + 1663972288)) | (((((~((-1176947963) | i49)) | (~(1680792923 | currentTimeMillis44))) * 959) + 713754995 + (((~(currentTimeMillis44 | (-1176947963))) | (~(i49 | 1680792923))) * 959)) & ((int) j30))) != 0) {
                                                java.lang.Object[] objArr95 = {new int[]{i6}, new int[]{i6 ^ 90}, null, null, new int[1]};
                                                int currentTimeMillis45 = (int) java.lang.System.currentTimeMillis();
                                                java.lang.Object[] objArr96 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~((-6750737) | currentTimeMillis45)) | (~((~currentTimeMillis45) | 1023385208))) * (-318)) - 876065992) + (((~(754423408 | currentTimeMillis45)) | 268961800) * (-318)) + (((~(currentTimeMillis45 | (-754423409))) | (-275712537)) * 318))};
                                                java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                java.lang.Object obj60 = obj59;
                                                if (obj59 == null) {
                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) android.view.View.combineMeasuredStates(0, 0));
                                                    byte b23 = $$a[41];
                                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                    d(b23, (short) (b23 | 653), b23, objArr97);
                                                    java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr97[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method29);
                                                    obj60 = method29;
                                                }
                                                ((int[]) objArr95[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr96)).intValue();
                                                return objArr95;
                                            }
                                            java.lang.Object[] objArr98 = {new int[]{i6}, new int[]{i6}, null, null, new int[1]};
                                            int currentTimeMillis46 = (int) java.lang.System.currentTimeMillis();
                                            java.lang.Object[] objArr99 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((((~((-243609285) | r3)) | 265728) * 98) - 1483636732) + (((~((~currentTimeMillis46) | (-786526661))) | (-243609285) | (~(786526660 | currentTimeMillis46))) * (-49)) + (((~(currentTimeMillis46 | (-243609285))) | (-786792389)) * 49))};
                                            java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                            java.lang.Object obj62 = obj61;
                                            if (obj61 == null) {
                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                byte b24 = $$a[41];
                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                d(b24, (short) (b24 | 653), b24, objArr100);
                                                java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr100[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, method30);
                                                obj62 = method30;
                                            }
                                            ((int[]) objArr98[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj62).invoke(null, objArr99)).intValue();
                                            return objArr98;
                                        }
                                        invoke = r35;
                                        i27++;
                                        str4 = str2;
                                        intValue2 = i2;
                                        context2 = context;
                                        intern4 = str5;
                                        i26 = 16;
                                        i25 = r35;
                                    }
                                }
                                context = context2;
                                i2 = intValue2;
                                java.lang.String str9 = intern4;
                                java.lang.String str10 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                if (str10.length() >= 6) {
                                    int i50 = 0;
                                    i24 = i24;
                                    maxKeyCode = maxKeyCode;
                                    while (i50 <= str10.length() - 6) {
                                        java.lang.Object[] objArr101 = {str10.substring(i50, i50 + 6), 931995};
                                        java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                        java.lang.Object obj64 = obj63;
                                        if (obj63 == null) {
                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 28, 2594 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                            d(34, r8[41], (byte) (-$$a[52]), objArr102);
                                            java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr102[0], java.lang.String.class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                            obj64 = method31;
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr101)).longValue();
                                        long currentTimeMillis47 = (int) java.lang.System.currentTimeMillis();
                                        int i51 = indexOf;
                                        java.lang.String str11 = str10;
                                        long j31 = longValue11 | currentTimeMillis47;
                                        maxKeyCode = -465;
                                        ?? r34 = ((-929) * longValue11) + 187472318416L + (((~j31) | 404035168) * (-465)) + ((longValue11 | (~(currentTimeMillis47 | 404035168))) * 930) + ((j31 | 404035168) * 465);
                                        long j32 = r34 + 1661135693;
                                        int currentTimeMillis48 = (int) java.lang.System.currentTimeMillis();
                                        int i52 = ~currentTimeMillis48;
                                        int currentTimeMillis49 = (int) java.lang.System.currentTimeMillis();
                                        if (((((int) j32) & (((~((-1073746338) | currentTimeMillis49)) * 623) + 699979518 + (((~currentTimeMillis49) | 139591688) * (-623)) + (((~(currentTimeMillis49 | 251535880)) | 1073746337 | (~((-1185690530) | currentTimeMillis49))) * 623))) | (((int) (j32 >> 32)) & (((currentTimeMillis48 | (-2054860374)) * 614) + 2112585990 + (((~((-1754432163) | i52)) | 8388770 | (~((-317205752) | i52))) * (-1228)) + (((~(i52 | (-1746043393))) | (~((-308816982) | i52))) * 614)))) == -2096167706) {
                                            objArr3 = new java.lang.Object[]{new int[1], new int[1], null, r1, new int[1]};
                                            java.lang.String str12 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                            ((int[]) objArr3[0])[0] = intValue;
                                            ((int[]) objArr3[1])[0] = intValue ^ 20;
                                            int currentTimeMillis50 = (int) java.lang.System.currentTimeMillis();
                                            java.lang.Object[] objArr103 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf(((~((-939851777) | currentTimeMillis50)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 69836936 + (((~((~currentTimeMillis50) | (-939851777))) | 42991616) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                            java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            java.lang.Object obj66 = obj65;
                                            if (obj65 == null) {
                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2713 - android.text.TextUtils.getTrimmedLength(""), (char) android.view.View.MeasureSpec.getMode(0));
                                                byte b25 = $$a[41];
                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                d(b25, (short) (b25 | 653), b25, objArr104);
                                                java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method32);
                                                obj66 = method32;
                                            }
                                            int intValue9 = ((java.lang.Integer) ((java.lang.reflect.Method) obj66).invoke(null, objArr103)).intValue();
                                            c = 0;
                                            ((int[]) objArr3[4])[0] = intValue9;
                                            i5 = intValue;
                                            i4 = intValue3;
                                            num = -1347122530;
                                            i6 = i5;
                                            if (((int[]) objArr3[1])[c] != i6) {
                                            }
                                        } else {
                                            i50++;
                                            indexOf = i51;
                                            str10 = str11;
                                            i24 = r34;
                                        }
                                    }
                                }
                                java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).substring(0, indexOf);
                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                c("繎", android.text.TextUtils.indexOf("", "") + 26393, objArr105);
                                java.lang.String[] split = substring.split(((java.lang.String) objArr105[0]).intern());
                                int length = split.length;
                                int i53 = 0;
                                ?? r9 = intValue3;
                                int i54 = i24;
                                int i55 = i25;
                                int i56 = maxKeyCode;
                                while (i53 < length) {
                                    java.lang.String str13 = split[i53];
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    java.lang.String[] strArr = null;
                                    ?? r15 = 51539 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    c("縺뜜\uec9a", r15, objArr106);
                                    if (str13.split(((java.lang.String) objArr106[0]).intern()).length > 1) {
                                        synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1581 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8)))) {
                                            try {
                                                try {
                                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                    c("縑乽ả\uef5e뿌谧岳ⵖﶙ췹驨櫑㭌\u0bbb\ud82aꢍ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12400, objArr107);
                                                    intern = ((java.lang.String) objArr107[0]).intern();
                                                    try {
                                                        runtime = java.lang.Runtime.getRuntime();
                                                        strArr = split;
                                                    } catch (java.lang.Exception unused) {
                                                    }
                                                } catch (java.io.IOException unused2) {
                                                }
                                            } catch (java.io.IOException unused3) {
                                                strArr = split;
                                            }
                                            try {
                                                try {
                                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                    c("縒⛚", android.text.TextUtils.getOffsetBefore("", 0) + 22739, objArr108);
                                                    exec = runtime.exec(((java.lang.String) objArr108[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                                } catch (java.lang.Exception unused4) {
                                                }
                                                try {
                                                    java.lang.Object[] objArr109 = {exec.getInputStream()};
                                                    java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                    if (obj67 == null) {
                                                        try {
                                                            i55 = length;
                                                            i56 = i53;
                                                            try {
                                                                java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.KeyEvent.normalizeMetaState(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 1507, (char) android.view.KeyEvent.getDeadChar(0, 0))).getDeclaredConstructor(java.io.InputStream.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                                obj = declaredConstructor;
                                                            } catch (java.lang.Throwable th5) {
                                                                th = th5;
                                                                th = th;
                                                                cause = th.getCause();
                                                                if (cause == null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } else {
                                                        i55 = length;
                                                        i56 = i53;
                                                        obj = obj67;
                                                    }
                                                    try {
                                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(objArr109);
                                                        try {
                                                            try {
                                                                java.lang.Object[] objArr110 = {exec.getErrorStream()};
                                                                java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                                java.lang.Object obj69 = obj68;
                                                                if (obj68 == null) {
                                                                    try {
                                                                        java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1507, (char) (android.os.Process.myTid() >> 22))).getDeclaredConstructor(java.io.InputStream.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                                        obj69 = declaredConstructor2;
                                                                    } catch (java.lang.Throwable th7) {
                                                                        th2 = th7;
                                                                        java.lang.Throwable cause3 = th2.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj69).newInstance(objArr110);
                                                                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                                try {
                                                                    java.lang.Class<?> cls39 = java.lang.Class.forName(str9);
                                                                    java.lang.Integer num4 = i14;
                                                                    try {
                                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                        java.lang.String str14 = -16761803;
                                                                        i4 = r9;
                                                                        try {
                                                                            c("縒䈠٪쪌軁", (-16761803) - android.graphics.Color.rgb(0, 0, 0), objArr111);
                                                                            cls39.getMethod(((java.lang.String) objArr111[0]).intern(), null).invoke(newInstance, null);
                                                                            try {
                                                                                java.lang.Class<?> cls40 = java.lang.Class.forName(str9);
                                                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                c("縒䈠٪쪌軁", 15413 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr112);
                                                                                cls40.getMethod(((java.lang.String) objArr112[0]).intern(), null).invoke(newInstance2, null);
                                                                                try {
                                                                                    try {
                                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                        sb.append(intern);
                                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                        c("繫", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 59722, objArr113);
                                                                                        sb.append(((java.lang.String) objArr113[0]).intern());
                                                                                        java.lang.String obj70 = sb.toString();
                                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                        c("縴夢〉ଉ\ue205", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10007, objArr114);
                                                                                        dataOutputStream.write(obj70.getBytes(((java.lang.String) objArr114[0]).intern()));
                                                                                        dataOutputStream.flush();
                                                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                        c("縄㇀\ue1ba醞䄏", 20441 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr115);
                                                                                        java.lang.String intern5 = ((java.lang.String) objArr115[0]).intern();
                                                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                        c("縴夢〉ଉ\ue205", 10006 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr116);
                                                                                        dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr116[0]).intern()));
                                                                                        dataOutputStream.flush();
                                                                                        try {
                                                                                            long nanoTime = java.lang.System.nanoTime();
                                                                                            java.lang.Object obj71 = invoke;
                                                                                            int i57 = intValue;
                                                                                            try {
                                                                                                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        exec.exitValue();
                                                                                                        str14 = intern3;
                                                                                                        i54 = i57;
                                                                                                        break;
                                                                                                    } catch (java.lang.IllegalThreadStateException unused5) {
                                                                                                        if (nanos > 0) {
                                                                                                            try {
                                                                                                                str14 = intern3;
                                                                                                            } catch (java.lang.InterruptedException e) {
                                                                                                                interruptedException = e;
                                                                                                                throw interruptedException;
                                                                                                            } catch (java.lang.Throwable th8) {
                                                                                                                th3 = th8;
                                                                                                                try {
                                                                                                                    exec.destroy();
                                                                                                                    throw th3;
                                                                                                                } catch (java.lang.Exception unused6) {
                                                                                                                    throw th3;
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    java.lang.Object[] objArr117 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                    java.lang.Class<?> cls41 = java.lang.Class.forName(str9);
                                                                                                                    i10 = i57;
                                                                                                                    try {
                                                                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                                                        b((-1167744049) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 2005961535, (-17) - android.view.View.combineMeasuredStates(0, 0), (byte) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (short) android.graphics.Color.red(0), objArr118);
                                                                                                                        cls41.getMethod(((java.lang.String) objArr118[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr117);
                                                                                                                        str = str14;
                                                                                                                    } catch (java.lang.Throwable th9) {
                                                                                                                        th = th9;
                                                                                                                        java.lang.Throwable th10 = th;
                                                                                                                        java.lang.Throwable cause4 = th10.getCause();
                                                                                                                        if (cause4 != null) {
                                                                                                                            throw cause4;
                                                                                                                        }
                                                                                                                        throw th10;
                                                                                                                    }
                                                                                                                } catch (java.lang.Throwable th11) {
                                                                                                                    th = th11;
                                                                                                                }
                                                                                                            } catch (java.lang.InterruptedException e2) {
                                                                                                                e = e2;
                                                                                                                throw e;
                                                                                                            } catch (java.lang.Throwable th12) {
                                                                                                                th = th12;
                                                                                                                th3 = th;
                                                                                                                exec.destroy();
                                                                                                                throw th3;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str = intern3;
                                                                                                            i10 = i57;
                                                                                                        }
                                                                                                        try {
                                                                                                            nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                                            i54 = i10;
                                                                                                            str14 = str;
                                                                                                            if (nanos > 0) {
                                                                                                                i57 = i10 == true ? 1 : 0;
                                                                                                                intern3 = str;
                                                                                                                str14 = str;
                                                                                                            }
                                                                                                        } catch (java.lang.InterruptedException e3) {
                                                                                                            e = e3;
                                                                                                            throw e;
                                                                                                        } catch (java.lang.Throwable th13) {
                                                                                                            th = th13;
                                                                                                            th3 = th;
                                                                                                            exec.destroy();
                                                                                                            throw th3;
                                                                                                        }
                                                                                                    } catch (java.lang.InterruptedException e4) {
                                                                                                        interruptedException = e4;
                                                                                                        throw interruptedException;
                                                                                                    } catch (java.lang.Throwable th14) {
                                                                                                        th3 = th14;
                                                                                                        exec.destroy();
                                                                                                        throw th3;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        dataOutputStream.close();
                                                                                                    } catch (java.io.IOException unused7) {
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            java.lang.Class<?> cls42 = java.lang.Class.forName(str9);
                                                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                                                            c("縋킁⌖疢", android.text.TextUtils.getOffsetBefore("", 0) + 44687, objArr119);
                                                                                                            cls42.getMethod(((java.lang.String) objArr119[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                                                            try {
                                                                                                                java.lang.Class<?> cls43 = java.lang.Class.forName(str9);
                                                                                                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                                                                c("縋킁⌖疢", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44686, objArr120);
                                                                                                                cls43.getMethod(((java.lang.String) objArr120[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        exec.destroy();
                                                                                                                    } catch (java.io.IOException unused8) {
                                                                                                                    }
                                                                                                                } catch (java.lang.Exception unused9) {
                                                                                                                }
                                                                                                                try {
                                                                                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 45, 1507 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                                                                                    byte[] bArr5 = $$a;
                                                                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                                                    d(bArr5[7], (short) 650, (byte) (-bArr5[52]), objArr121);
                                                                                                                    sb2.append(cls44.getField((java.lang.String) objArr121[0]).get(newInstance).toString());
                                                                                                                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 44, 1507 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                                                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                                                    d(bArr5[7], (short) 650, (byte) (-bArr5[52]), objArr122);
                                                                                                                    sb2.append(cls45.getField((java.lang.String) objArr122[0]).get(newInstance2).toString());
                                                                                                                    java.lang.String obj72 = sb2.toString();
                                                                                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                                                    c("繫", android.view.View.combineMeasuredStates(0, 0) + 59723, objArr123);
                                                                                                                    java.lang.String[] split2 = obj72.split(((java.lang.String) objArr123[0]).intern());
                                                                                                                    int length2 = split2.length;
                                                                                                                    int i58 = 0;
                                                                                                                    str14 = str14;
                                                                                                                    while (i58 < length2) {
                                                                                                                        java.lang.String str15 = split2[i58];
                                                                                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                                                        c("縑歽哸㹽⯴ᕷﻪ\ue830헪뽫꣮鈐翚楗勘㱕⧝ፉﲅ", android.graphics.Color.argb(0, 0, 0, 0) + 5501, objArr124);
                                                                                                                        if (!str15.startsWith(((java.lang.String) objArr124[0]).intern())) {
                                                                                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                                                            c("縑泽寸䛽㗴\u20f7\u0fea練\ue9ea퓫쏮꺐鷜裖矓拀凞㳅⯏ᚈ", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4861, objArr125);
                                                                                                                            if (str15.startsWith(((java.lang.String) objArr125[0]).intern())) {
                                                                                                                                continue;
                                                                                                                            } else {
                                                                                                                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                                                                b((-1167744051) - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 2005961530, (-14) - (android.os.Process.myTid() >> 22), (byte) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-1) - android.view.MotionEvent.axisFromString("")), objArr126);
                                                                                                                                if (str15.startsWith(((java.lang.String) objArr126[0]).intern())) {
                                                                                                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                                                                    b((-1167744104) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-2005961523) - android.view.View.combineMeasuredStates(0, 0), (-21) - (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) android.view.View.MeasureSpec.getMode(0), (short) android.text.TextUtils.indexOf("", ""), objArr127);
                                                                                                                                    java.lang.String[] split3 = str15.split(((java.lang.String) objArr127[0]).intern());
                                                                                                                                    if (split3.length > 1 && split3[1].equalsIgnoreCase(str13)) {
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i58++;
                                                                                                                        num4 = num4;
                                                                                                                        str14 = str14;
                                                                                                                        obj71 = obj71;
                                                                                                                    }
                                                                                                                    r9 = num4;
                                                                                                                    r15 = obj71;
                                                                                                                    intern3 = str14;
                                                                                                                } catch (java.lang.Exception unused10) {
                                                                                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                                                    c("縧뭷\uf4e6\u2e68毘ꕖ\ude8bᡔ営轮좤Ȏ㾐礋늗\ueffd⤱拧鰟\ud9c4፟䳍蘸쎵ﴺ㚍灙", android.text.TextUtils.getTrimmedLength("") + 50551, objArr128);
                                                                                                                    throw new java.io.IOException(((java.lang.String) objArr128[0]).intern());
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th15) {
                                                                                                                java.lang.Throwable cause5 = th15.getCause();
                                                                                                                if (cause5 != null) {
                                                                                                                    throw cause5;
                                                                                                                }
                                                                                                                throw th15;
                                                                                                            }
                                                                                                        } catch (java.lang.InterruptedException e5) {
                                                                                                            e = e5;
                                                                                                            throw e;
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th16) {
                                                                                                        java.lang.Throwable cause6 = th16.getCause();
                                                                                                        if (cause6 != null) {
                                                                                                            throw cause6;
                                                                                                        }
                                                                                                        throw th16;
                                                                                                    }
                                                                                                } catch (java.lang.InterruptedException e6) {
                                                                                                    e = e6;
                                                                                                    throw e;
                                                                                                } catch (java.lang.Throwable th17) {
                                                                                                    th = th17;
                                                                                                    th3 = th;
                                                                                                    exec.destroy();
                                                                                                    throw th3;
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e7) {
                                                                                                e = e7;
                                                                                            } catch (java.lang.Throwable th18) {
                                                                                                th = th18;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e8) {
                                                                                            e = e8;
                                                                                        } catch (java.lang.Throwable th19) {
                                                                                            th = th19;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th20) {
                                                                                        th = th20;
                                                                                    }
                                                                                } catch (java.io.IOException unused11) {
                                                                                    r15 = invoke;
                                                                                    i54 = intValue;
                                                                                    r9 = num4;
                                                                                } catch (java.lang.Exception unused12) {
                                                                                }
                                                                            } catch (java.lang.Throwable th21) {
                                                                                java.lang.Throwable cause7 = th21.getCause();
                                                                                if (cause7 != null) {
                                                                                    throw cause7;
                                                                                }
                                                                                throw th21;
                                                                            }
                                                                        } catch (java.lang.Throwable th22) {
                                                                            th = th22;
                                                                            java.lang.Throwable th23 = th;
                                                                            java.lang.Throwable cause8 = th23.getCause();
                                                                            if (cause8 != null) {
                                                                                throw cause8;
                                                                            }
                                                                            throw th23;
                                                                        }
                                                                    } catch (java.lang.Throwable th24) {
                                                                        th = th24;
                                                                    }
                                                                } catch (java.lang.Throwable th25) {
                                                                    th = th25;
                                                                }
                                                            } catch (java.lang.Throwable th26) {
                                                                th2 = th26;
                                                            }
                                                        } catch (java.io.IOException unused13) {
                                                            r15 = invoke;
                                                            i54 = intValue;
                                                            i55 = i55;
                                                            i56 = i56;
                                                            i4 = r9;
                                                            r9 = i14;
                                                            i53 = i56 + 1;
                                                            i14 = r9;
                                                            invoke = r15;
                                                            split = strArr;
                                                            intValue = i54 == true ? 1 : 0;
                                                            length = i55;
                                                            r9 = i4;
                                                            i54 = i54;
                                                            i55 = i55;
                                                            i56 = i56;
                                                        } catch (java.lang.Exception unused14) {
                                                            java.lang.Object[] objArr1282 = new java.lang.Object[1];
                                                            c("縧뭷\uf4e6\u2e68毘ꕖ\ude8bᡔ営轮좤Ȏ㾐礋늗\ueffd⤱拧鰟\ud9c4፟䳍蘸쎵ﴺ㚍灙", android.text.TextUtils.getTrimmedLength("") + 50551, objArr1282);
                                                            throw new java.io.IOException(((java.lang.String) objArr1282[0]).intern());
                                                        }
                                                    } catch (java.lang.Throwable th27) {
                                                        th = th27;
                                                        th = th;
                                                        cause = th.getCause();
                                                        if (cause == null) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th28) {
                                                    th = th28;
                                                }
                                            } catch (java.io.IOException unused15) {
                                                i55 = length;
                                                r15 = invoke;
                                                i54 = intValue;
                                                i56 = i53;
                                                i4 = r9;
                                                r9 = i14;
                                                i53 = i56 + 1;
                                                i14 = r9;
                                                invoke = r15;
                                                split = strArr;
                                                intValue = i54 == true ? 1 : 0;
                                                length = i55;
                                                r9 = i4;
                                                i54 = i54;
                                                i55 = i55;
                                                i56 = i56;
                                            } catch (java.lang.Exception unused16) {
                                                java.lang.Object[] objArr12822 = new java.lang.Object[1];
                                                c("縧뭷\uf4e6\u2e68毘ꕖ\ude8bᡔ営轮좤Ȏ㾐礋늗\ueffd⤱拧鰟\ud9c4፟䳍蘸쎵ﴺ㚍灙", android.text.TextUtils.getTrimmedLength("") + 50551, objArr12822);
                                                throw new java.io.IOException(((java.lang.String) objArr12822[0]).intern());
                                            }
                                        }
                                    } else {
                                        strArr = split;
                                        i55 = length;
                                        r15 = invoke;
                                        i54 = intValue;
                                        i56 = i53;
                                        i4 = r9;
                                        r9 = i14;
                                    }
                                    i53 = i56 + 1;
                                    i14 = r9;
                                    invoke = r15;
                                    split = strArr;
                                    intValue = i54 == true ? 1 : 0;
                                    length = i55;
                                    r9 = i4;
                                    i54 = i54;
                                    i55 = i55;
                                    i56 = i56;
                                }
                                i = intValue;
                                i3 = r9;
                            } else {
                                context = context2;
                                i = intValue;
                                i2 = intValue2;
                                i3 = intValue3;
                            }
                            i4 = i3;
                            num = i14;
                            objArr3 = new java.lang.Object[]{new int[]{i == true ? 1 : 0}, new int[]{i == true ? 1 : 0}, null, null, new int[1]};
                            int currentTimeMillis51 = (int) java.lang.System.currentTimeMillis();
                            int i59 = ~currentTimeMillis51;
                            java.lang.Object[] objArr129 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((~((-773953364) | i59)) | 256182581) * 226) + 588891264 + (((~(i59 | (-539006531))) | (~((-256182582) | currentTimeMillis51)) | 21235748) * (-113)) + ((~(currentTimeMillis51 | (-773953364))) * 113))};
                            java.lang.Object obj73 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                            java.lang.Object obj74 = obj73;
                            if (obj73 == null) {
                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                byte b26 = $$a[41];
                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                d(b26, (short) (b26 | 653), b26, objArr130);
                                java.lang.reflect.Method method33 = cls46.getMethod((java.lang.String) objArr130[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method33);
                                obj74 = method33;
                            }
                            c = 0;
                            ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj74).invoke(null, objArr129)).intValue();
                            i5 = i;
                            i6 = i5;
                            if (((int[]) objArr3[1])[c] != i6) {
                            }
                        } catch (java.lang.Throwable th29) {
                            java.lang.Throwable cause9 = th29.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th29;
                        }
                    } catch (java.lang.Throwable th30) {
                        java.lang.Throwable cause10 = th30.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th30;
                    }
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    getAid = 0;
                    SdkCoreAlternateContactlessPaymentDataImpl = 1;
                    DigitizedCardProfile = 1754577534;
                    valueOf = 520368572;
                    writeReplace = 1520332041;
                    AlternateContactlessPaymentDataJson = new byte[]{-93, 82, -113, 92, -82, 113, -85, -92, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -92, -110, 71, -71, 87, -81, 70, -89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -19, 97, 81, 80, 87, -92, 92, -89, com.visa.cbp.getEncExpo.registerForActivityResult, com.google.common.base.Ascii.FS, -93, -89, 81, -109, 107, 84, -90, -98, 100, 71, -71, 87, -97, 100, 71, -71, 87, -97, 93, -19, com.visa.cbp.getEncExpo.IResultReceiver2, -88, -88, 91, 87, -17, 104, -95, 70, -69, -100, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, com.visa.cbp.getEncExpo.registerForActivityResult, 99, 93, 85, -87, -93, -97, 107, 84, -90, -98, 100, 71, -71, 87, -97, 100, 71, -71, 87, -97, 82, -90, -71, 67, 84, -84, 92, -94, -88, -69, 118, -91, 84, -93, 82, -113, 113, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, 84, 80, 87, 86, -86, -123, 103, -91, 84, -93, 82, -113, 113, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, 84, 80, 87, 86, -86, -123, -71, 107, 87, -24, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, -95, -86, 83, 83, Byte.MAX_VALUE, 84, -84, 92, -94, -88, 91, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 80, 87, 87, 85, -69, 80, -88, 80, 89, -69, -85, -88, 80, 89, -82, -89, -72, 76, -94, 91, -85, 80, -116, 117, -91, 84, -81, -81, 86, -93, -119, 118, 69, -89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -69, -120, 103, -91, 84, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86};
                    IccPrivateKeyCrtComponentsJson = 3046549710021134569L;
                }

                static void init$1() {
                    $$d = new byte[]{com.google.common.base.Ascii.ETB, -2, 101, 6};
                    $$e = 255;
                }

                public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2, int i3) {
                    return (java.lang.Object[]) writeReplace(new java.lang.Object[]{context, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)}, -1834952346, 1834952346, i);
                }

                static void init$0() {
                    $$a = new byte[]{120, 91, -87, 14, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
                    $$b = 199;
                }
            };
            int i = getAid;
            int i2 = i ^ 65;
            int i3 = ((i & 65) | i2) << 1;
            int i4 = -i2;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
            if (i5 % 2 != 0) {
                return handlemdespushpayload;
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 23) % 128;
            byte[] issuerApplicationData = anonymousClass3.AlternateContactlessPaymentDataJson.getIssuerApplicationData();
            int i = getAid;
            int i2 = ((i | 17) << 1) - (i ^ 17);
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 != 0) {
                return issuerApplicationData;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object getApplicationLifeCycleData(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = i & 55;
            int i3 = (i ^ 55) | i2;
            int i4 = (i2 & i3) + (i3 | i2);
            getAid = i4 % 128;
            com.payair.hce.JsonResponse jsonResponse = anonymousClass3.AlternateContactlessPaymentDataJson;
            if (i4 % 2 == 0) {
                return jsonResponse.getPinIvCvc3Track2();
            }
            jsonResponse.getPinIvCvc3Track2();
            throw null;
        }

        private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int identityHashCode = java.lang.System.identityHashCode(anonymousClass3);
            int i = identityHashCode & (-1026348671);
            int i2 = (~i) & (identityHashCode | (-1026348671));
            int i3 = (i ^ i2) | (i & i2);
            int i4 = ~i3;
            int i5 = (i3 | i4) & i4;
            int i6 = (1073600382 & i5) | ((~i5) & (-1073600383));
            int i7 = i5 & (-1073600383);
            int i8 = (((i7 ^ i6) | (i7 & i6)) * (-502)) - 570730620;
            int i9 = ~identityHashCode;
            int i10 = (i9 & 1026348670) | ((~i9) & (-1026348671)) | (i9 & (-1026348671));
            int i11 = ((~i10) & 937284374) | (i10 & (-937284375)) | (i10 & 937284374);
            int i12 = ~i11;
            int i13 = -(-(((i11 | i12) & i12) * (-502)));
            int i14 = (((~i13) & i8) | ((~i8) & i13)) + ((i8 & i13) << 1);
            int i15 = identityHashCode ^ (-937284375);
            int i16 = identityHashCode & (-937284375);
            int i17 = (i16 ^ i15) | (i16 & i15);
            int i18 = ~i17;
            int i19 = (i17 | i18) & i18;
            int i20 = ((i19 ^ (-1026348671)) | (i19 & (-1026348671))) * 502;
            int i21 = i14 & i20;
            int i22 = (i20 | i14) & (~i21);
            int i23 = i21 << 1;
            int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass3);
            int i24 = ~identityHashCode2;
            int i25 = i24 & 2145245694;
            int i26 = (identityHashCode2 & (-2145245695)) | i25;
            int i27 = identityHashCode2 & 2145245694;
            int i28 = (i27 ^ i26) | (i27 & i26);
            int i29 = ~i28;
            int i30 = (i28 | i29) & i29;
            int i31 = -(~(((i30 ^ 1095500008) | (i30 & 1095500008)) * (-756)));
            int i32 = -(-(((i24 & (-2145245695)) | (2145245694 & (~i24)) | i25) * 756));
            com.payair.hce.JsonResponse jsonResponse = anonymousClass3.AlternateContactlessPaymentDataJson;
            if ((i22 & i23) + (i22 | i23) > (((-93010452) - (~i31)) - (~i32)) - 1) {
                return com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) jsonResponse.getCdol1RelatedDataLength()).valueOf();
            }
            com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) jsonResponse.getCdol1RelatedDataLength()).valueOf();
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = getAid;
            int i2 = (i ^ 13) + ((i & 13) << 1);
            int i3 = i2 % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i3;
            boolean z = anonymousClass3.values;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            getAid = (i3 + 37) % 128;
            return java.lang.Boolean.valueOf(z);
        }

        private static /* synthetic */ java.lang.Object getDualTapResetTimeout(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = getAid;
            int i2 = i & 85;
            int i3 = i2 + ((i ^ 85) | i2);
            SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
            if (i3 % 2 != 0) {
                if (com.payair.hce.getString.AlternateContactlessPaymentDataJson(anonymousClass3.AlternateContactlessPaymentDataJson.getAid())) {
                    int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 71;
                    getAid = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    return java.lang.Boolean.FALSE;
                }
                boolean isUsAipMaskingSupported = anonymousClass3.AlternateContactlessPaymentDataJson.isUsAipMaskingSupported();
                int i5 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i6 = i5 & 69;
                int i7 = ((i5 ^ 69) | i6) << 1;
                int i8 = -((i5 | 69) & (~i6));
                getAid = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
                return java.lang.Boolean.valueOf(isUsAipMaskingSupported);
            }
            com.payair.hce.getString.AlternateContactlessPaymentDataJson(anonymousClass3.AlternateContactlessPaymentDataJson.getAid());
            throw null;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            getAid = (((i | 59) << 1) - ((i & (-60)) | ((~i) & 59))) % 128;
            if (!anonymousClass3.writeReplace && anonymousClass3.AlternateContactlessPaymentDataJson.getPinIvCvc3Track2() != null) {
                int i2 = SdkCoreAlternateContactlessPaymentDataImpl;
                getAid = ((i2 ^ 79) + ((i2 & 79) << 1)) % 128;
                if (anonymousClass3.AlternateContactlessPaymentDataJson.getPinIvCvc3Track2().length == 2) {
                    int i3 = SdkCoreAlternateContactlessPaymentDataImpl;
                    int i4 = ((((i3 ^ 47) | (i3 & 47)) << 1) - ((i3 & (-48)) | ((~i3) & 47))) % 128;
                    getAid = i4;
                    int i5 = (i4 ^ 99) + ((i4 & 99) << 1);
                    SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
                    if (i5 % 2 != 0) {
                        return java.lang.Boolean.TRUE;
                    }
                    throw null;
                }
            }
            int i6 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i7 = i6 & 25;
            int i8 = -(-(i6 | 25));
            getAid = ((i7 & i8) + (i8 | i7)) % 128;
            return java.lang.Boolean.FALSE;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = getAid;
            int i2 = i & 33;
            int i3 = (i | 33) & (~i2);
            int i4 = i2 << 1;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
            boolean writeReplace = com.payair.hce.getString.writeReplace(anonymousClass3.AlternateContactlessPaymentDataJson);
            if (i5 % 2 != 0) {
                return java.lang.Boolean.valueOf(writeReplace);
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
            if (com.payair.hce.getString.writeReplace(anonymousClass3.AlternateContactlessPaymentDataJson)) {
                int i = SdkCoreAlternateContactlessPaymentDataImpl;
                int i2 = i ^ 109;
                int i3 = -(-((i & 109) << 1));
                getAid = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
                if (anonymousClass3.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData() != null) {
                    int i4 = getAid + 19;
                    SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                    if (i4 % 2 == 0) {
                        anonymousClass3.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getCvrMaskAnd();
                        throw new java.lang.ArithmeticException();
                    }
                    if (anonymousClass3.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getCvrMaskAnd() != null) {
                        int i5 = SdkCoreAlternateContactlessPaymentDataImpl;
                        int i6 = (i5 & (-46)) | ((~i5) & 45);
                        int i7 = (i5 & 45) << 1;
                        int i8 = (i6 & i7) + (i7 | i6);
                        getAid = i8 % 128;
                        if (i8 % 2 == 0 ? anonymousClass3.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getCvrMaskAnd().length == 6 : anonymousClass3.AlternateContactlessPaymentDataJson.getAlternateContactlessPaymentData().getCvrMaskAnd().length == 117) {
                            int i9 = getAid;
                            int i10 = (i9 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i9 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                            SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                            if (i10 % 2 != 0) {
                                return java.lang.Boolean.TRUE;
                            }
                            throw null;
                        }
                    }
                }
            }
            int i11 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i12 = ((i11 ^ 25) | (i11 & 25)) << 1;
            int i13 = -((i11 & (-26)) | ((~i11) & 25));
            int i14 = (i12 & i13) + (i13 | i12);
            getAid = i14 % 128;
            if (i14 % 2 == 0) {
                return java.lang.Boolean.FALSE;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
            int i = getAid;
            int i2 = (((i & (-112)) | ((~i) & 111)) - (~((i & 111) << 1))) - 1;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.getString.AnonymousClass3 anonymousClass3 = (com.payair.hce.getString.AnonymousClass3) objArr[0];
            int i = getAid;
            int i2 = i | 49;
            int i3 = i2 << 1;
            int i4 = -((~(i & 49)) & i2);
            int i5 = (i3 & i4) + (i4 | i3);
            SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
            int i6 = i5 % 2;
            com.payair.hce.suspendCardForToken suspendcardfortoken = anonymousClass3.valueOf;
            if (i6 != 0) {
                return suspendcardfortoken;
            }
            throw null;
        }

        @Override // com.payair.hce.stopTransaction
        public final com.payair.hce.suspendCardForToken getCardholderValidators() {
            return (com.payair.hce.suspendCardForToken) valueOf(new java.lang.Object[]{this}, 376303258, -376303254, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final com.payair.hce.getNumberOfTransactionLogEntries getSecurityWord() {
            return (com.payair.hce.getNumberOfTransactionLogEntries) valueOf(new java.lang.Object[]{this}, 534205437, -534205428, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final com.payair.hce.setHCEEventListener getCardLayoutDescription() {
            return (com.payair.hce.setHCEEventListener) valueOf(new java.lang.Object[]{this}, 754453927, -754453917, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final com.payair.hce.setHCEEventListener getDualTapResetTimeout() {
            return (com.payair.hce.setHCEEventListener) valueOf(new java.lang.Object[]{this}, -2145866570, 2145866571, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final boolean getCvmResetTimeout() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -958836961, 958836977, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // com.payair.hce.stopTransaction
        public final boolean getApplicationLifeCycleData() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 674850197, -674850195, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // com.payair.hce.stopTransaction
        public final boolean getGpoResponse() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -357572347, 357572352, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // com.payair.hce.stopTransaction
        public final boolean getCiacDecline() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -507163969, 507163986, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // com.payair.hce.stopTransaction
        public final boolean getCvrMaskAnd() {
            return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, -1112776839, 1112776854, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] SdkCoreBusinessLogicModuleImpl() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, -1984706722, 1984706735, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final java.util.List<com.payair.hce.updateUnlockKeys> getPaymentFci() {
            return (java.util.List) valueOf(new java.lang.Object[]{this}, 2072271388, -2072271370, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] RecordsJson() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, 1307515222, -1307515202, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] getAid() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, 274811418, -274811418, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final com.payair.hce.handleMDESPushPayload getProfileVersion() {
            return (com.payair.hce.handleMDESPushPayload) valueOf(new java.lang.Object[]{this}, 1218009733, -1218009721, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] IccPrivateKeyCrtComponentsJson() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, -1862448504, 1862448523, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, -702953246, 702953254, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] AlternateContactlessPaymentDataJson() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, -1064210345, 1064210352, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] values() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, 568590879, -568590865, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] DigitizedCardProfile() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, -778229129, 778229135, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] writeReplace() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, -1035999535, 1035999538, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.stopTransaction
        public final byte[] valueOf() {
            return (byte[]) valueOf(new java.lang.Object[]{this}, -440917693, 440917704, java.lang.System.identityHashCode(this));
        }
    }

    static void init$0() {
        $$a = new byte[]{62, -127, kotlin.io.encoding.Base64.padSymbol, 101};
        $$b = 185;
    }

    static void valueOf() {
        writeReplace = 1889207083;
    }
}
