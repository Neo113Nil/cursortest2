package com.payair.hce;

/* loaded from: classes4.dex */
public class attachBaseContext {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] valueOf;
    private static com.payair.hce.checkPermission values;
    private static int writeReplace;

    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i = 3 - (s * 3);
        byte[] bArr = $$a;
        int i2 = b * 4;
        int i3 = (s2 * 2) + 107;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i3 = i + i2;
            i = i;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            int i6 = i + 1;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4 = i5;
                i3 = bArr[i6] + i3;
                i = i6;
            }
        }
    }

    static /* synthetic */ com.payair.hce.checkPermission AlternateContactlessPaymentDataJson() {
        int i = (writeReplace + 63) % 128;
        AlternateContactlessPaymentDataJson = i;
        com.payair.hce.checkPermission checkpermission = values;
        int i2 = i + 31;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return checkpermission;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        writeReplace = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 6, 0, 3}, "\u0000\u0000\u0000\u0001\u0001\u0001", false, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.attachBaseContext.class.getName());
        values = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        int i = AlternateContactlessPaymentDataJson + 25;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static com.payair.hce.updatePushToken valueOf(final java.lang.String str, final com.payair.hce.JsonResponse jsonResponse, final com.payair.hce.getStatusCodeFromServer getstatuscodefromserver, final com.payair.hce.suspendCardForToken suspendcardfortoken) {
        if (jsonResponse != null) {
            java.util.List<com.payair.hce.setNetworkError> records = jsonResponse.getRecords();
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.payair.hce.setNetworkError> it = records.iterator();
            while (it.hasNext()) {
                writeReplace = (AlternateContactlessPaymentDataJson + 51) % 128;
                try {
                    arrayList.add(com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(com.payair.hce.getWalletIdentificationDataProvider.writeReplace(it.next().getRecordValue()).AlternateContactlessPaymentDataJson(), 0));
                } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
                    return null;
                }
            }
            return new com.payair.hce.updatePushToken() { // from class: com.payair.hce.attachBaseContext.4
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static int $10;
                private static int $11;
                private static char[] IccPrivateKeyCrtComponentsJson;
                private static boolean RecordsJson;
                private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
                private static int SdkCoreBusinessLogicModuleImpl;
                private static boolean getAid;
                private static int getCiacDecline;
                private static int getProfileVersion;

                public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                    java.lang.Object obj;
                    int i4 = ~i;
                    int i5 = ~i2;
                    int i6 = i4 | i5;
                    int i7 = ~i3;
                    int i8 = (i * (-496)) + (i2 * (-496)) + ((~i6) * 497) + (((~(i6 | i3)) | (~(i5 | i7 | i))) * 497) + (((~(i | i5 | i3)) | (~(i2 | i4)) | (~(i4 | i7))) * 497);
                    if (i8 == 1) {
                        return writeReplace(objArr);
                    }
                    if (i8 == 2) {
                        return valueOf(objArr);
                    }
                    com.payair.hce.attachBaseContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.attachBaseContext.AnonymousClass4) objArr[0];
                    int i9 = getCiacDecline + 91;
                    SdkCoreBusinessLogicModuleImpl = i9 % 128;
                    java.util.ArrayList arrayList2 = arrayList;
                    if (i9 % 2 == 0) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new int[]{24, 4, 0, 3}, "\u0000\u0000\u0001\u0001", true, objArr2);
                        obj = objArr2[0];
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(new int[]{24, 4, 0, 3}, "\u0000\u0000\u0001\u0001", true, objArr3);
                        obj = objArr3[0];
                    }
                    return com.payair.hce.attachBaseContext.DigitizedCardProfile(arrayList2, ((java.lang.String) obj).intern());
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void c(short s, short s2, short s3, java.lang.Object[] objArr) {
                    int i;
                    int i2;
                    byte[] bArr = $$a;
                    int i3 = (s * 3) + 35;
                    int i4 = (s3 * 2) + 4;
                    int i5 = (s2 * 2) + 65;
                    byte[] bArr2 = new byte[i3];
                    if (bArr == null) {
                        int i6 = i4;
                        i2 = 0;
                        i5 = (i5 + (-i4)) - 2;
                        i4 = i6 + 1;
                        i = i2;
                        i2 = i + 1;
                        bArr2[i] = (byte) i5;
                        if (i2 == i3) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        i6 = i4;
                        i4 = bArr[i4];
                        i5 = (i5 + (-i4)) - 2;
                        i4 = i6 + 1;
                        i = i2;
                        i2 = i + 1;
                        bArr2[i] = (byte) i5;
                        if (i2 == i3) {
                        }
                    } else {
                        i = 0;
                        i2 = i + 1;
                        bArr2[i] = (byte) i5;
                        if (i2 == i3) {
                        }
                    }
                }

                private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
                    int i2 = 3 - (b * 3);
                    byte[] bArr = $$d;
                    int i3 = b2 * 2;
                    int i4 = i + 107;
                    byte[] bArr2 = new byte[i3 + 1];
                    int i5 = -1;
                    if (bArr == null) {
                        i4 += i2;
                        i2 = i2;
                        i5 = -1;
                    }
                    while (true) {
                        int i6 = i2 + 1;
                        int i7 = i5 + 1;
                        bArr2[i7] = (byte) i4;
                        if (i7 == i3) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        } else {
                            i4 += bArr[i6];
                            i2 = i6;
                            i5 = i7;
                        }
                    }
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] AlternateContactlessPaymentDataJson() {
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 3) % 128;
                    byte[] aid = com.payair.hce.JsonResponse.this.getAid();
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 63) % 128;
                    return aid;
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] valueOf() {
                    byte[] gpoResponse = com.payair.hce.JsonResponse.this.getGpoResponse();
                    if (gpoResponse == null) {
                        return null;
                    }
                    int i = getCiacDecline;
                    int i2 = i + 109;
                    SdkCoreBusinessLogicModuleImpl = i2 % 128;
                    if (i2 % 2 == 0) {
                        if (gpoResponse.length <= 114) {
                            return null;
                        }
                    } else if (gpoResponse.length <= 6) {
                        return null;
                    }
                    int i3 = i + 117;
                    SdkCoreBusinessLogicModuleImpl = i3 % 128;
                    if (i3 % 2 != 0) {
                        return new byte[]{gpoResponse[4], gpoResponse[5]};
                    }
                    byte b = gpoResponse[2];
                    return new byte[]{b, b, 0, 0};
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] DigitizedCardProfile() {
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 43) % 128;
                    try {
                        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson2 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(com.payair.hce.getWalletIdentificationDataProvider.writeReplace(com.payair.hce.JsonResponse.this.getPaymentFci()).AlternateContactlessPaymentDataJson(), 0);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(new int[]{0, 2, 26, 0}, "\u0001\u0000", false, objArr);
                        com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = AlternateContactlessPaymentDataJson2.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern()));
                        if (getwalletidentificationdataprovider != null) {
                            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 27) % 128;
                            java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson3 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson(), 0);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            b(null, null, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0082\u0081", objArr2);
                            com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2 = AlternateContactlessPaymentDataJson3.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern()));
                            if (getwalletidentificationdataprovider2 != null) {
                                SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 31) % 128;
                                byte[] valueOf2 = getwalletidentificationdataprovider2.AlternateContactlessPaymentDataJson().valueOf();
                                int i = SdkCoreBusinessLogicModuleImpl + 7;
                                getCiacDecline = i % 128;
                                if (i % 2 == 0) {
                                    return valueOf2;
                                }
                                throw null;
                            }
                        }
                    } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused2) {
                        com.payair.hce.attachBaseContext.AlternateContactlessPaymentDataJson();
                    }
                    return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
                
                    if (r7 != null) goto L12;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                    com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider;
                    com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2;
                    try {
                        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson2 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(com.payair.hce.getWalletIdentificationDataProvider.writeReplace(com.payair.hce.JsonResponse.this.getPaymentFci()).AlternateContactlessPaymentDataJson(), 0);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new int[]{0, 2, 26, 0}, "\u0001\u0000", false, objArr2);
                        getwalletidentificationdataprovider = AlternateContactlessPaymentDataJson2.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern()));
                    } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused2) {
                        com.payair.hce.attachBaseContext.AlternateContactlessPaymentDataJson();
                        return null;
                    }
                    if (getwalletidentificationdataprovider != null) {
                        int i = SdkCoreBusinessLogicModuleImpl + 25;
                        getCiacDecline = i % 128;
                        if (i % 2 != 0) {
                            java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson3 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson(), 1);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(new int[]{2, 4, 103, 1}, "\u0000\u0001\u0000\u0000", true, objArr3);
                            getwalletidentificationdataprovider2 = AlternateContactlessPaymentDataJson3.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr3[0]).intern()));
                            if (getwalletidentificationdataprovider2 != null) {
                                java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson4 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(getwalletidentificationdataprovider2.AlternateContactlessPaymentDataJson(), 0);
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                a(new int[]{6, 4, 150, 0}, "\u0001\u0001\u0000\u0001", false, objArr4);
                                com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider3 = AlternateContactlessPaymentDataJson4.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr4[0]).intern()));
                                if (getwalletidentificationdataprovider3 != null) {
                                    byte[] valueOf2 = getwalletidentificationdataprovider3.AlternateContactlessPaymentDataJson().valueOf();
                                    getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 79) % 128;
                                    return valueOf2;
                                }
                            }
                        } else {
                            java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson5 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson(), 0);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            a(new int[]{2, 4, 103, 1}, "\u0000\u0001\u0000\u0000", false, objArr5);
                            getwalletidentificationdataprovider2 = AlternateContactlessPaymentDataJson5.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr5[0]).intern()));
                        }
                        com.payair.hce.attachBaseContext.AlternateContactlessPaymentDataJson();
                        return null;
                    }
                    getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 47) % 128;
                    return null;
                }

                private static void a(int[] iArr, java.lang.String str2, boolean z, java.lang.Object[] objArr) {
                    byte b;
                    char[] cArr;
                    char[] cArr2;
                    java.lang.String str3 = str2;
                    byte[] bArr = str3;
                    if (str3 != null) {
                        bArr = str3.getBytes("ISO-8859-1");
                    }
                    byte[] bArr2 = bArr;
                    com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
                    char c = 0;
                    int i = iArr[0];
                    int i2 = 1;
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr3 = IccPrivateKeyCrtComponentsJson;
                    long j = 0;
                    if (cArr3 != null) {
                        int length = cArr3.length;
                        char[] cArr4 = new char[length];
                        int i6 = 0;
                        while (i6 < length) {
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[i2];
                                objArr2[c] = java.lang.Integer.valueOf(cArr3[i6]);
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                                if (obj == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 29, 2806 - android.widget.ExpandableListView.getPackedPositionChild(j), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                    byte b2 = (byte) (-$$d[2]);
                                    byte b3 = (byte) (b2 - 2);
                                    cArr2 = cArr3;
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    d(b2, b3, b3, objArr3);
                                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                                } else {
                                    cArr2 = cArr3;
                                }
                                cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                                i6++;
                                cArr3 = cArr2;
                                c = 0;
                                i2 = 1;
                                j = 0;
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
                    char[] cArr5 = new char[i3];
                    java.lang.System.arraycopy(cArr3, i, cArr5, 0, i3);
                    if (bArr2 != null) {
                        int i7 = $11 + 23;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr = new char[i3];
                            b = 1;
                            getaccounttype.writeReplace = 1;
                        } else {
                            b = 1;
                            cArr = new char[i3];
                            getaccounttype.writeReplace = 0;
                        }
                        char c2 = 0;
                        while (getaccounttype.writeReplace < i3) {
                            if (bArr2[getaccounttype.writeReplace] == b) {
                                $10 = ($11 + 5) % 128;
                                int i8 = getaccounttype.writeReplace;
                                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                                if (obj2 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2836, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    d(0, (byte) 0, (byte) 0, objArr5);
                                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                                }
                                cArr[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                            } else {
                                int i9 = getaccounttype.writeReplace;
                                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                                if (obj3 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 44, 2880 - android.text.TextUtils.getTrimmedLength(""), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                    byte length2 = (byte) $$d.length;
                                    byte b4 = (byte) (length2 - 4);
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    d(length2, b4, b4, objArr7);
                                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                                }
                                cArr[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                            }
                            c2 = cArr[getaccounttype.writeReplace];
                            java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.os.Process.getGidForName(""), 212 - (android.os.Process.myTid() >> 22), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                            }
                            ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                            b = 1;
                        }
                        cArr5 = cArr;
                    }
                    if (i5 > 0) {
                        char[] cArr6 = new char[i3];
                        java.lang.System.arraycopy(cArr5, 0, cArr6, 0, i3);
                        int i10 = i3 - i5;
                        java.lang.System.arraycopy(cArr6, 0, cArr5, i10, i5);
                        java.lang.System.arraycopy(cArr6, i5, cArr5, 0, i10);
                    }
                    if (z) {
                        $10 = ($11 + 13) % 128;
                        char[] cArr7 = new char[i3];
                        int i11 = 0;
                        while (true) {
                            getaccounttype.writeReplace = i11;
                            if (getaccounttype.writeReplace >= i3) {
                                break;
                            }
                            cArr7[getaccounttype.writeReplace] = cArr5[(i3 - getaccounttype.writeReplace) - 1];
                            i11 = getaccounttype.writeReplace + 1;
                        }
                        cArr5 = cArr7;
                    }
                    if (i4 > 0) {
                        int i12 = $10 + 23;
                        $11 = i12 % 128;
                        int i13 = i12 % 2 == 0 ? 1 : 0;
                        while (true) {
                            getaccounttype.writeReplace = i13;
                            if (getaccounttype.writeReplace >= i3) {
                                break;
                            }
                            cArr5[getaccounttype.writeReplace] = (char) (cArr5[getaccounttype.writeReplace] - iArr[2]);
                            i13 = getaccounttype.writeReplace + 1;
                        }
                    }
                    objArr[0] = new java.lang.String(cArr5);
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] getPaymentFci() {
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 103) % 128;
                    byte[] valueOf2 = com.payair.hce.transactionCanBeResumed.values(com.payair.hce.stopService.values(str)).valueOf();
                    int i = getCiacDecline + 33;
                    SdkCoreBusinessLogicModuleImpl = i % 128;
                    if (i % 2 != 0) {
                        return valueOf2;
                    }
                    throw null;
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] writeReplace() {
                    java.lang.Object obj;
                    int i = getCiacDecline + 53;
                    SdkCoreBusinessLogicModuleImpl = i % 128;
                    if (i % 2 == 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(new int[]{10, 4, 31, 0}, "\u0001\u0000\u0001\u0001", true, objArr);
                        obj = objArr[0];
                    } else {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new int[]{10, 4, 31, 0}, "\u0001\u0000\u0001\u0001", false, objArr2);
                        obj = objArr2[0];
                    }
                    return com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern()).valueOf();
                }

                private static void b(int[] iArr, java.lang.String str2, int i, java.lang.String str3, java.lang.Object[] objArr) {
                    char[] cArr;
                    java.lang.String str4 = str3;
                    byte[] bArr = str4;
                    if (str4 != null) {
                        bArr = str4.getBytes("ISO-8859-1");
                    }
                    byte[] bArr2 = bArr;
                    if (str2 != null) {
                        cArr = str2.toCharArray();
                        $10 = ($11 + 63) % 128;
                    } else {
                        cArr = str2;
                    }
                    char[] cArr2 = cArr;
                    com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
                    char[] cArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                    long j = 0;
                    if (cArr3 != null) {
                        int length = cArr3.length;
                        char[] cArr4 = new char[length];
                        int i2 = 0;
                        while (i2 < length) {
                            try {
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i2])};
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                                if (obj == null) {
                                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.indexOf("", "", 0, 0), 286 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(j) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                                }
                                cArr4[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                                i2++;
                                j = 0;
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
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getProfileVersion)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46336))).getMethod("x", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    if (RecordsJson) {
                        getumdgeneration.values = bArr2.length;
                        char[] cArr5 = new char[getumdgeneration.values];
                        getumdgeneration.valueOf = 0;
                        while (getumdgeneration.valueOf < getumdgeneration.values) {
                            cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                            java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                            if (obj3 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1629, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                d(11, (byte) 0, (byte) 0, objArr5);
                                obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                            }
                            ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                        }
                        java.lang.String str5 = new java.lang.String(cArr5);
                        $11 = ($10 + 1) % 128;
                        objArr[0] = str5;
                        return;
                    }
                    if (!getAid) {
                        getumdgeneration.values = iArr.length;
                        char[] cArr6 = new char[getumdgeneration.values];
                        getumdgeneration.valueOf = 0;
                        while (getumdgeneration.valueOf < getumdgeneration.values) {
                            $10 = ($11 + 67) % 128;
                            cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                            getumdgeneration.valueOf++;
                        }
                        objArr[0] = new java.lang.String(cArr6);
                        return;
                    }
                    getumdgeneration.values = cArr2.length;
                    char[] cArr7 = new char[getumdgeneration.values];
                    getumdgeneration.valueOf = 0;
                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                        cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                        java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                        if (obj4 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 43, 1629 - android.view.View.MeasureSpec.getSize(0), (char) android.graphics.Color.alpha(0));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            d(11, (byte) 0, (byte) 0, objArr7);
                            obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                        }
                        ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                    }
                    objArr[0] = new java.lang.String(cArr7);
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] values() {
                    java.util.ArrayList arrayList2;
                    java.lang.Object obj;
                    int i = getCiacDecline + 61;
                    SdkCoreBusinessLogicModuleImpl = i % 128;
                    if (i % 2 == 0) {
                        arrayList2 = arrayList;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(new int[]{14, 4, 120, 2}, "\u0000\u0001\u0001\u0000", true, objArr);
                        obj = objArr[0];
                    } else {
                        arrayList2 = arrayList;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new int[]{14, 4, 120, 2}, "\u0000\u0001\u0001\u0000", true, objArr2);
                        obj = objArr2[0];
                    }
                    return com.payair.hce.attachBaseContext.DigitizedCardProfile(arrayList2, ((java.lang.String) obj).intern());
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] getProfileVersion() {
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 93) % 128;
                    java.util.ArrayList arrayList2 = arrayList;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    b(null, null, 127 - android.text.TextUtils.indexOf("", ""), "\u0081\u0084\u0083\u0081", objArr);
                    byte[] DigitizedCardProfile = com.payair.hce.attachBaseContext.DigitizedCardProfile(arrayList2, ((java.lang.String) objArr[0]).intern());
                    getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 117) % 128;
                    return DigitizedCardProfile;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
                
                    if (r1 != null) goto L12;
                 */
                @Override // com.payair.hce.updatePushToken
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final byte[] getGpoResponse() {
                    com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider;
                    try {
                        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson2 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(com.payair.hce.getWalletIdentificationDataProvider.writeReplace(com.payair.hce.JsonResponse.this.getPaymentFci()).AlternateContactlessPaymentDataJson(), 0);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(new int[]{0, 2, 26, 0}, "\u0001\u0000", false, objArr);
                        com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2 = AlternateContactlessPaymentDataJson2.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern()));
                        if (getwalletidentificationdataprovider2 != null) {
                            int i = SdkCoreBusinessLogicModuleImpl + 125;
                            getCiacDecline = i % 128;
                            if (i % 2 != 0) {
                                java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson3 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(getwalletidentificationdataprovider2.AlternateContactlessPaymentDataJson(), 1);
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a(new int[]{18, 4, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 2}, null, false, objArr2);
                                getwalletidentificationdataprovider = AlternateContactlessPaymentDataJson3.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern()));
                                if (getwalletidentificationdataprovider != null) {
                                }
                            } else {
                                java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson4 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(getwalletidentificationdataprovider2.AlternateContactlessPaymentDataJson(), 0);
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                a(new int[]{18, 4, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 2}, null, true, objArr3);
                                getwalletidentificationdataprovider = AlternateContactlessPaymentDataJson4.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr3[0]).intern()));
                            }
                            int i2 = SdkCoreBusinessLogicModuleImpl + 7;
                            getCiacDecline = i2 % 128;
                            if (i2 % 2 == 0) {
                                return getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson().valueOf();
                            }
                            getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson().valueOf();
                            throw null;
                        }
                    } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused2) {
                        com.payair.hce.attachBaseContext.AlternateContactlessPaymentDataJson();
                    }
                    return null;
                }

                @Override // com.payair.hce.updatePushToken
                public final com.payair.hce.suspendCardForToken getAid() {
                    int i = getCiacDecline + 73;
                    int i2 = i % 128;
                    SdkCoreBusinessLogicModuleImpl = i2;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    com.payair.hce.suspendCardForToken suspendcardfortoken2 = suspendcardfortoken;
                    int i3 = i2 + 107;
                    getCiacDecline = i3 % 128;
                    if (i3 % 2 == 0) {
                        return suspendcardfortoken2;
                    }
                    throw null;
                }

                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                    com.payair.hce.attachBaseContext.AnonymousClass4 anonymousClass4 = (com.payair.hce.attachBaseContext.AnonymousClass4) objArr[0];
                    if (getstatuscodefromserver != com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
                        int i = com.payair.hce.attachBaseContext.AnonymousClass5.values[com.payair.hce.JsonResponse.this.getUmdGeneration().ordinal()];
                        if (i == 1) {
                            return com.payair.hce.getNumberOfTransactionLogEntries.AlternateContactlessPaymentDataJson;
                        }
                        if (i != 2) {
                            if (i == 3) {
                                return com.payair.hce.getNumberOfTransactionLogEntries.writeReplace;
                            }
                            return com.payair.hce.getNumberOfTransactionLogEntries.writeReplace;
                        }
                        com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.values;
                        int i2 = SdkCoreBusinessLogicModuleImpl + 27;
                        getCiacDecline = i2 % 128;
                        if (i2 % 2 == 0) {
                            return getnumberoftransactionlogentries;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 19) % 128;
                    return com.payair.hce.getNumberOfTransactionLogEntries.values;
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] RecordsJson() {
                    int i = SdkCoreBusinessLogicModuleImpl + 23;
                    getCiacDecline = i % 128;
                    com.payair.hce.JsonResponse jsonResponse2 = com.payair.hce.JsonResponse.this;
                    if (i % 2 == 0) {
                        return jsonResponse2.getIssuerApplicationData();
                    }
                    jsonResponse2.getIssuerApplicationData();
                    throw null;
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] IccPrivateKeyCrtComponentsJson() {
                    getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 43) % 128;
                    java.util.ArrayList arrayList2 = arrayList;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(new int[]{22, 2, 66, 0}, "\u0001\u0000", true, objArr);
                    byte[] DigitizedCardProfile = com.payair.hce.attachBaseContext.DigitizedCardProfile(arrayList2, ((java.lang.String) objArr[0]).intern());
                    int i = getCiacDecline + 25;
                    SdkCoreBusinessLogicModuleImpl = i % 128;
                    if (i % 2 != 0) {
                        return DigitizedCardProfile;
                    }
                    throw null;
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] getCvrMaskAnd() {
                    java.util.ArrayList arrayList2;
                    java.lang.Object obj;
                    int i = SdkCoreBusinessLogicModuleImpl + 59;
                    getCiacDecline = i % 128;
                    if (i % 2 != 0) {
                        arrayList2 = arrayList;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        b(null, null, '0' >>> android.text.AndroidCharacter.getMirror('*'), "\u0086\u0085\u0083\u0081", objArr);
                        obj = objArr[0];
                    } else {
                        arrayList2 = arrayList;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        b(null, null, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u0086\u0085\u0083\u0081", objArr2);
                        obj = objArr2[0];
                    }
                    return com.payair.hce.attachBaseContext.DigitizedCardProfile(arrayList2, ((java.lang.String) obj).intern());
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    getCiacDecline = 0;
                    SdkCoreBusinessLogicModuleImpl = 1;
                    IccPrivateKeyCrtComponentsJson = new char[]{16867, 16795, 16795, 16743, 16741, 16748, 16809, 16667, 16666, 16669, 16873, 16769, 16769, 16769, 16785, 16763, 16738, 16741, 16682, 16669, 16684, 16670, 16882, 16822, 16855, 16882, 16881, 16888, 16774, 16736, 16671, 16665, 16640, 16740, 16760, 16663, 16671, 16670, 16664, 16641, 16649, 16641, 16765, 16760, 16641, 16640, 16640, 16646, 16640, 16647, 16645, 16641, 16647, 16645, 16640, 16670, 16650, 16749, 16733, 16731, 16743, 16744, 16732, 16733, 16731, 16759, 16880, 16816, 16824, 16826, 16823, 16824, 16815, 16782, 16791, 16823, 16831, 16826, 16823, 16824, 16831, 16798, 16799, 16800, 16826, 16822, 16829, 16831, 16801, 16825, 16674, 16672, 16673, 16676, 16686, 16676, 16698, 16672, 16698, 16701, 16672, 16674, 16673, 16673, 16657, 16687, 16734, 16597, 16597, 16578, 16582, 16601, 16603, 16601, 16598, 16605, 16583, 16605, 16595, 16601, 16893, 16808, 16793, 16789, 16804, 16804, 16806, 16809, 16807, 16805, 16830, 16802, 16808, 16775, 16774, 16807, 16800, 16831, 16802, 16807, 16831, 16799, 16769, 16800, 16771, 16881, 16790, 16812, 16809, 16808, 16850, 16890, 16892, 16895, 16781, 16712, 16592, 16637, 16632, 16611, 16612, 16613, 16617, 16615, 16615, 16609, 16776, 16719, 16819, 16712, 16803, 16809, 16718, 16708, 16831, 16802, 16715, 16882, 16828, 16789, 16789, 16829, 16831, 16830, 16828, 16830, 16830, 16803, 16803, 16829, 16831, 16807, 16803, 16800, 16800, 16827, 16892, 16802, 16804, 16812, 16808, 16809, 16809, 16800, 16829, 16805, 16794, 16880, 16890, 16892, 16776, 16781, 16799, 16829, 16805, 16810, 16774, 16797, 16824, 16800, 16803, 16829, 16802, 16810, 16802, 16798, 16777, 16805, 16805, 16811};
                    SdkCoreAlternateContactlessPaymentDataImpl = new char[]{11083, 11124, 11098, 11126, 11081, 11080, 11097, 11090, 11075, 11079, 11058, 11064, 11062, 11061, 11071, 11108, 11096, 11067, 11046, 11019, 11069, 11120, 11093, 11051, 11049, 11016, 11092, 11047, 11065, 11057, 11059, 11122, 11060, 11091, 11017, 11070, 11018, 11023, 11066, 11052, 11056};
                    getProfileVersion = -143185276;
                    getAid = true;
                    RecordsJson = true;
                }

                /* JADX WARN: Type inference failed for: r11v0 */
                /* JADX WARN: Type inference failed for: r11v1, types: [int[], java.lang.String] */
                /* JADX WARN: Type inference failed for: r11v21 */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v28 */
                public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
                    int i3 = 0;
                    ?? r11 = 0;
                    try {
                        if (context == null) {
                            java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i | (-103412543))) | 69730330) * 345) - 2098186816) + (((~((-103412543) | (~i))) | 831786112) * 345) + ((~(i | (-69730331))) * 345))};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                                byte b = (byte) ($$a[14] + 1);
                                byte b2 = b;
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                c(b, b2, b2, objArr3);
                                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                            return objArr;
                        }
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a(new int[]{28, 38, 99, 20}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", true, objArr4);
                            java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b(null, null, 127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u0099\u0098\u0089\u0087\u0096\u008c\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090\u008c\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087", objArr6);
                            try {
                                java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                a(new int[]{28, 38, 99, 20}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", true, objArr8);
                                objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(null, null, 127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0095\u0094\u0093\u0092\u0091\u0090\u008c\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0096\u008c\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0097\u0096\u0099\u0098\u0089\u0087", objArr9);
                                try {
                                    java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    a(new int[]{28, 38, 99, 20}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", true, objArr11);
                                    objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                                    int i4 = 8;
                                    try {
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        a(new int[]{66, 23, 8, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr12);
                                        java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        a(new int[]{89, 17, 136, 9}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", true, objArr13);
                                        java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                                        try {
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            a(new int[]{66, 23, 8, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, objArr14);
                                            java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            b(null, null, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u0092\u009f\u009c\u0088\u0092\u0095\u009c\u009e\u009d\u009c\u009b\u009a\u0092\u0095", objArr15);
                                            try {
                                                java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                b(null, null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u008d\u0092\u0095\u009c\u008b\u009c¢\u0092\u0095\u009c\u009e\u009d\u009c\u009b \u009f¡ \u009a\u008b\u0092\u009a\u008b\u008e\u009d \u008c\u008f\u008e\u008d\u008c\u008b\u009c", objArr17);
                                                java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(new int[]{106, 14, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", true, objArr18);
                                                java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                a(new int[]{120, 30, 0, 6}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000", false, objArr19);
                                                java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                b(null, null, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "£\u0092\u008d\u0094\u009a\u009c\u008b\u0095\u008f£", objArr20);
                                                java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                                int length = objArr21.length;
                                                int i5 = 0;
                                                while (i5 < length) {
                                                    java.lang.Object obj2 = objArr21[i5];
                                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                    a(new int[]{150, 5, i3, i3}, "\u0001\u0001\u0001\u0001\u0000", true, objArr22);
                                                    try {
                                                        java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i3]).intern()};
                                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                        b(r11, r11, android.view.View.MeasureSpec.getSize(i3) + 127, "¦\u008d\u008e\u009a\u009d\u009c\u0083\u0092\u009a\u009c\u009d\u008f§\u008f\u009a\u008d\u0092\u0087 \u009a\u008d\u0092\u009d ¦\u009a\u008f\u008d\u0094\u009d\u0092£ \u009c¥\u009c¤", objArr24);
                                                        java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i3]).intern());
                                                        int[] iArr = {155, 11, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, i4};
                                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                        a(iArr, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", i3, objArr25);
                                                        java.lang.String intern = ((java.lang.String) objArr25[i3]).intern();
                                                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                                        clsArr[i3] = java.lang.String.class;
                                                        java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                                        try {
                                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                            b(null, null, (android.widget.ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)) + 127, "\u0092\u008d\u0094\u009a\u009c\u008b\u0095\u008f\u0099 \u009f¡ \u009a\u008b\u0092\u009a\u008b\u008e\u009d \u008c\u008f\u008e\u008d\u008c\u008b\u009c", objArr26);
                                                            java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[i3]).intern());
                                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                            a(new int[]{166, 11, 20, i3}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", true, objArr27);
                                                            try {
                                                                java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(obj2, null))};
                                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                b(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "¦\u008d\u008e\u009a\u009d\u009c\u0083\u0092\u009a\u009c\u009d\u008f§\u008f\u009a\u008d\u0092\u0087 \u009a\u008d\u0092\u009d ¦\u009a\u008f\u008d\u0094\u009d\u0092£ \u009c¥\u009c¤", objArr29);
                                                                java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 19, 7, 11}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001", true, objArr30);
                                                                java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr30[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr28);
                                                                int length2 = objArr5.length;
                                                                for (int i6 = 0; i6 < 2; i6++) {
                                                                    java.lang.Object obj3 = objArr5[i6];
                                                                    try {
                                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                        a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 34, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", true, objArr31);
                                                                        java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                        b(null, null, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "©\u009c¡\u008f\u009d\u008b\u008f\u008d\u009b\u0082\u0082\u0081¨\u009a\u009d\u0092¤\u0093\u0094\u0099\u009a\u0092\u0095", objArr32);
                                                                        if (obj3.equals(cls9.getMethod(((java.lang.String) objArr32[0]).intern(), null).invoke(invoke4, null))) {
                                                                            java.lang.Object[] objArr33 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                            try {
                                                                                java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(900728886 | r2)) | 104200098) * (-328)) - 776773368) + ((104200098 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((~i) | 934674358)) | (~((-900728887) | i)) | 70254626) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                                                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                if (obj4 == null) {
                                                                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                    byte b3 = (byte) ($$a[14] + 1);
                                                                                    byte b4 = b3;
                                                                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                                    c(b3, b4, b4, objArr35);
                                                                                    obj4 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                                }
                                                                                ((int[]) objArr33[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr34)).intValue();
                                                                                return objArr33;
                                                                            } catch (java.lang.Throwable th) {
                                                                                java.lang.Throwable cause = th.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Throwable th2) {
                                                                        java.lang.Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                i5++;
                                                                i4 = 8;
                                                                i3 = 0;
                                                                r11 = 0;
                                                            } catch (java.lang.Throwable th3) {
                                                                java.lang.Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (java.lang.Throwable th4) {
                                                            java.lang.Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (java.lang.Throwable th5) {
                                                        java.lang.Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th6) {
                                                java.lang.Throwable cause6 = th6.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th6;
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            java.lang.Throwable cause7 = th7.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th7;
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        java.lang.Throwable cause8 = th8.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th8;
                                    }
                                } catch (java.lang.Throwable th9) {
                                    java.lang.Throwable cause9 = th9.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th9;
                                }
                            } catch (java.lang.Throwable th10) {
                                java.lang.Throwable cause10 = th10.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th10;
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        int i7 = ~i;
                        java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-502957682) | i7)) | (-501971304)) * (-865)) + 1858145954 + ((~(i | 502957681)) * 865) + (((~((-501971304) | i7)) | (~(i7 | 502957681))) * 865))};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj5 == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), 2713 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                            byte b5 = (byte) ($$a[14] + 1);
                            byte b6 = b5;
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            c(b5, b6, b6, objArr38);
                            obj5 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                        }
                        ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr37)).intValue();
                        return objArr36;
                    } catch (java.lang.Throwable th11) {
                        java.lang.Throwable cause11 = th11.getCause();
                        if (cause11 != null) {
                            throw cause11;
                        }
                        throw th11;
                    }
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] getCiacDecline() {
                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -661734850, 661734850, java.lang.System.identityHashCode(this));
                }

                static void init$1() {
                    $$d = new byte[]{39, 108, -2, 93};
                    $$e = 73;
                }

                @Override // com.payair.hce.updatePushToken
                public final com.payair.hce.getNumberOfTransactionLogEntries SdkCoreAlternateContactlessPaymentDataImpl() {
                    return (com.payair.hce.getNumberOfTransactionLogEntries) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 739538433, -739538431, java.lang.System.identityHashCode(this));
                }

                static void init$0() {
                    $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -26, -77, 102, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
                    $$b = 129;
                }

                @Override // com.payair.hce.updatePushToken
                public final byte[] SdkCoreBusinessLogicModuleImpl() {
                    return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 385558977, -385558976, java.lang.System.identityHashCode(this));
                }
            };
        }
        int i = writeReplace + 95;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: com.payair.hce.attachBaseContext$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        private static int DigitizedCardProfile = 0;
        static final /* synthetic */ int[] values;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[com.payair.hce.setSendAuthenticationHeader.values().length];
            values = iArr;
            try {
                iArr[com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile.ordinal()] = 1;
                int i = writeReplace;
                int i2 = ((i | 91) << 1) - (i ^ 91);
                DigitizedCardProfile = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                values[com.payair.hce.setSendAuthenticationHeader.writeReplace.ordinal()] = 2;
                int i4 = writeReplace;
                int i5 = i4 ^ 57;
                int i6 = (i4 & 57) << 1;
                DigitizedCardProfile = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                values[com.payair.hce.setSendAuthenticationHeader.values.ordinal()] = 3;
                int i7 = DigitizedCardProfile;
                int i8 = i7 & 119;
                int i9 = i7 | 119;
                writeReplace = ((i8 & i9) + (i9 | i8)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        int i = ($11 + 57) % 128;
        $10 = i;
        int i2 = 2;
        byte[] bArr = str2;
        if (str2 != null) {
            int i3 = i + 113;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = valueOf;
        float f = 0.0f;
        if (cArr != null) {
            $10 = ($11 + 41) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 45;
                $10 = i10 % 128;
                if (i10 % i2 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i5];
                        objArr2[0] = java.lang.Integer.valueOf(cArr[i9]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 2806, (char) android.view.View.MeasureSpec.getMode(0));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b((byte) 0, (short) 0, (short) 1, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i9])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 29, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2807, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (short) 1, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i9++;
                }
                i2 = 2;
                i5 = 1;
                f = 0.0f;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr2 != null) {
            $10 = ($11 + 57) % 128;
            char[] cArr4 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    $11 = ($10 + 23) % 128;
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2835 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 43, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2881, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (short) 2, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i13 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i13);
        }
        if (z) {
            $11 = ($10 + 5) % 128;
            char[] cArr6 = new char[i6];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i6) {
                $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                cArr6[getaccounttype.writeReplace] = cArr3[(i6 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i6) {
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static /* synthetic */ byte[] DigitizedCardProfile(java.util.ArrayList arrayList, java.lang.String str) {
        writeReplace = (AlternateContactlessPaymentDataJson + 3) % 128;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i = writeReplace + 1;
            AlternateContactlessPaymentDataJson = i % 128;
            if (i % 2 == 0) {
                java.util.Iterator it2 = ((java.util.LinkedHashMap) it.next()).entrySet().iterator();
                while (it2.hasNext()) {
                    int i2 = AlternateContactlessPaymentDataJson + 87;
                    writeReplace = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                        if (((com.payair.hce.transactionCanBeResumed) entry.getKey()).writeReplace().equals(str)) {
                            return ((com.payair.hce.getWalletIdentificationDataProvider) entry.getValue()).AlternateContactlessPaymentDataJson().valueOf();
                        }
                    } else {
                        ((com.payair.hce.transactionCanBeResumed) ((java.util.Map.Entry) it2.next()).getKey()).writeReplace().equals(str);
                        throw null;
                    }
                }
            } else {
                ((java.util.LinkedHashMap) it.next()).entrySet().iterator();
                throw new java.lang.ArithmeticException();
            }
        }
        return null;
    }

    static void init$0() {
        $$a = new byte[]{78, 115, -79, 115};
        $$b = 131;
    }

    static void writeReplace() {
        valueOf = new char[]{16862, 16768, 16768, 16887, 16773, 16777};
    }
}
