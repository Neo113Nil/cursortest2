package com.payair.hce;

/* loaded from: classes4.dex */
public class getForegroundServiceType {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 113 - i;
        byte[] bArr = $$a;
        int i4 = (s * 3) + 1;
        int i5 = 3 - (s2 * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3 = i4;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            i5++;
            i2++;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i3 += i6;
            bArr2[i2] = (byte) i3;
            i5++;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i5++;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        DigitizedCardProfile = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("䵺\ue6e4ᩰ侒\ue371ᒤ", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43912, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getForegroundServiceType.class.getName());
        com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        int i = DigitizedCardProfile + 31;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static com.payair.hce.unsuspendTokens values(com.payair.hce.getStatusCode getstatuscode) {
        if (getstatuscode == null) {
            return null;
        }
        com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.writeReplace;
        int i = com.payair.hce.getForegroundServiceType.AnonymousClass3.AlternateContactlessPaymentDataJson[getstatuscode.getUmdGeneration().ordinal()];
        if (i == 1) {
            getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.AlternateContactlessPaymentDataJson;
        } else if (i == 2) {
            getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.values;
        } else if (i == 3) {
            getnumberoftransactionlogentries = com.payair.hce.getNumberOfTransactionLogEntries.writeReplace;
        }
        com.payair.hce.suspendCardForToken suspendcardfortoken = com.payair.hce.suspendCardForToken.DigitizedCardProfile;
        int i2 = com.payair.hce.getForegroundServiceType.AnonymousClass3.valueOf[getstatuscode.getCvmModel().ordinal()];
        if (i2 == 1) {
            suspendcardfortoken = com.payair.hce.suspendCardForToken.DigitizedCardProfile;
        } else if (i2 == 2) {
            suspendcardfortoken = com.payair.hce.suspendCardForToken.writeReplace;
        } else if (i2 == 3) {
            suspendcardfortoken = com.payair.hce.suspendCardForToken.valueOf;
        }
        com.payair.hce.getSelectedCard getselectedcard = com.payair.hce.getSelectedCard.valueOf;
        int i3 = com.payair.hce.getForegroundServiceType.AnonymousClass3.values[getstatuscode.getUcafVersion().ordinal()];
        if (i3 == 1) {
            getselectedcard = com.payair.hce.getSelectedCard.AlternateContactlessPaymentDataJson;
            values = (DigitizedCardProfile + 107) % 128;
        } else if (i3 == 2) {
            getselectedcard = com.payair.hce.getSelectedCard.valueOf;
        }
        if (getstatuscode == null) {
            return null;
        }
        com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = new com.payair.hce.getForegroundServiceType.AnonymousClass1(getstatuscode, getnumberoftransactionlogentries, getselectedcard, suspendcardfortoken);
        int i4 = DigitizedCardProfile + 73;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return anonymousClass1;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: com.payair.hce.getForegroundServiceType$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        private static int DigitizedCardProfile = 1;
        static final /* synthetic */ int[] valueOf;
        static final /* synthetic */ int[] values;
        private static int writeReplace;

        static {
            int[] iArr = new int[com.payair.hce.gotPutData.values().length];
            values = iArr;
            try {
                iArr[com.payair.hce.gotPutData.valueOf.ordinal()] = 1;
                int i = writeReplace + 13;
                DigitizedCardProfile = i % 128;
                int i2 = i % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                values[com.payair.hce.gotPutData.AlternateContactlessPaymentDataJson.ordinal()] = 2;
                int i3 = writeReplace;
                DigitizedCardProfile = ((i3 ^ 111) + ((i3 & 111) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.payair.hce.gotDeleteData.values().length];
            valueOf = iArr2;
            try {
                iArr2[com.payair.hce.gotDeleteData.valueOf.ordinal()] = 1;
                writeReplace = (DigitizedCardProfile + 103) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                valueOf[com.payair.hce.gotDeleteData.DigitizedCardProfile.ordinal()] = 2;
                int i4 = DigitizedCardProfile;
                int i5 = (i4 | 29) << 1;
                int i6 = -(i4 ^ 29);
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                writeReplace = i7 % 128;
                int i8 = i7 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                valueOf[com.payair.hce.gotDeleteData.AlternateContactlessPaymentDataJson.ordinal()] = 3;
                int i9 = DigitizedCardProfile;
                int i10 = i9 & 87;
                writeReplace = (((i9 | 87) & (~i10)) + (i10 << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.payair.hce.setSendAuthenticationHeader.values().length];
            AlternateContactlessPaymentDataJson = iArr3;
            try {
                iArr3[com.payair.hce.setSendAuthenticationHeader.DigitizedCardProfile.ordinal()] = 1;
                int i11 = writeReplace + 58;
                int i12 = (~i11) + (i11 << 1);
                DigitizedCardProfile = i12 % 128;
                int i13 = i12 % 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.setSendAuthenticationHeader.writeReplace.ordinal()] = 2;
                int i14 = DigitizedCardProfile;
                writeReplace = (((i14 | 99) << 1) - ((i14 & (-100)) | ((~i14) & 99))) % 128;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.setSendAuthenticationHeader.values.ordinal()] = 3;
                int i15 = DigitizedCardProfile;
                writeReplace = ((i15 ^ 107) + ((i15 & 107) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 31) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        $10 = ($11 + 47) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            $11 = ($10 + 103) % 128;
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1890 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.MotionEvent.axisFromString("") + 3601));
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (AlternateContactlessPaymentDataJson ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 65, 1443 - android.view.View.resolveSize(0, 0), (char) (android.view.View.getDefaultSize(0, 0) + 29682));
                    byte b3 = $$a[0];
                    byte b4 = (byte) (b3 - 1);
                    byte b5 = b3;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b4, b5, (byte) (b5 - 1), objArr5);
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
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 77) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf("", "") + 1443, (char) (29682 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)));
                byte b6 = $$a[0];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(b7, b8, (byte) (b8 - 1), objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr);
        $11 = ($10 + 89) % 128;
        objArr[0] = str2;
    }

    public static com.payair.hce.unsuspendTokens DigitizedCardProfile(com.payair.hce.getStatusCode getstatuscode, com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries, com.payair.hce.suspendCardForToken suspendcardfortoken, com.payair.hce.getSelectedCard getselectedcard) {
        int i = (DigitizedCardProfile + 11) % 128;
        values = i;
        if (getstatuscode != null) {
            return new com.payair.hce.getForegroundServiceType.AnonymousClass1(getstatuscode, getnumberoftransactionlogentries, getselectedcard, suspendcardfortoken);
        }
        int i2 = i + 51;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: com.payair.hce.getForegroundServiceType$1, reason: invalid class name */
    static final class AnonymousClass1 implements com.payair.hce.unsuspendTokens {
        private static int getAid = 1;
        private static int writeReplace;
        private /* synthetic */ com.payair.hce.suspendCardForToken AlternateContactlessPaymentDataJson;
        private /* synthetic */ com.payair.hce.getStatusCode DigitizedCardProfile;
        private /* synthetic */ com.payair.hce.getSelectedCard valueOf;
        private /* synthetic */ com.payair.hce.getNumberOfTransactionLogEntries values;

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = ~(i | i3);
            int i6 = ~i;
            int i7 = ~(i6 | i2);
            switch ((i * (-813)) + (i2 * 408) + (((~(i | i4)) | i5) * (-814)) + (((~((~i3) | i4)) | i7 | i5) * 407) + (((~(i6 | i3)) | i7 | (~(i2 | i3))) * 407)) {
                case 1:
                    com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
                    int i8 = getAid;
                    writeReplace = (((i8 | 47) << 1) - (i8 ^ 47)) % 128;
                    byte[] aip = anonymousClass1.DigitizedCardProfile.getAip();
                    int i9 = writeReplace;
                    int i10 = i9 & 63;
                    int i11 = -(-((i9 ^ 63) | i10));
                    getAid = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                    return aip;
                case 2:
                    return DigitizedCardProfile(objArr);
                case 3:
                    com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass12 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
                    int i12 = writeReplace;
                    int i13 = (((i12 | 55) << 1) - (i12 ^ 55)) % 128;
                    getAid = i13;
                    com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = anonymousClass12.values;
                    writeReplace = (i13 + 97) % 128;
                    return getnumberoftransactionlogentries;
                case 4:
                    com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass13 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
                    int i14 = getAid;
                    int i15 = i14 | 93;
                    writeReplace = ((i15 << 1) - ((~(i14 & 93)) & i15)) % 128;
                    byte[] cvrMaskAnd = anonymousClass13.DigitizedCardProfile.getCvrMaskAnd();
                    int i16 = getAid;
                    int i17 = i16 & 103;
                    int i18 = (i16 ^ 103) | i17;
                    writeReplace = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                    return cvrMaskAnd;
                case 5:
                    return values(objArr);
                case 6:
                    return valueOf(objArr);
                case 7:
                    return AlternateContactlessPaymentDataJson(objArr);
                case 8:
                    return writeReplace(objArr);
                case 9:
                    return IccPrivateKeyCrtComponentsJson(objArr);
                case 10:
                    return getProfileVersion(objArr);
                default:
                    com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass14 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
                    writeReplace = (getAid + 105) % 128;
                    byte[] ciacDecline = anonymousClass14.DigitizedCardProfile.getCiacDecline();
                    int i19 = writeReplace;
                    int i20 = (i19 & (-16)) | ((~i19) & 15);
                    int i21 = (i19 & 15) << 1;
                    getAid = (((i20 | i21) << 1) - (i21 ^ i20)) % 128;
                    return ciacDecline;
            }
        }

        AnonymousClass1(com.payair.hce.getStatusCode getstatuscode, com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries, com.payair.hce.getSelectedCard getselectedcard, com.payair.hce.suspendCardForToken suspendcardfortoken) {
            this.DigitizedCardProfile = getstatuscode;
            this.values = getnumberoftransactionlogentries;
            this.valueOf = getselectedcard;
            this.AlternateContactlessPaymentDataJson = suspendcardfortoken;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
            int i = writeReplace;
            int i2 = ((((i ^ 69) | (i & 69)) << 1) - (~(-((i & (-70)) | ((~i) & 69))))) - 1;
            getAid = i2 % 128;
            byte[] issuerApplicationData = anonymousClass1.DigitizedCardProfile.getIssuerApplicationData();
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i3 = getAid;
            int i4 = i3 ^ 67;
            int i5 = -(-((i3 & 67) << 1));
            writeReplace = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
            return issuerApplicationData;
        }

        private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
            com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
            int i = writeReplace;
            int i2 = ((i & 90) + (i | 90)) - 1;
            getAid = i2 % 128;
            com.payair.hce.getStatusCode getstatuscode = anonymousClass1.DigitizedCardProfile;
            if (i2 % 2 == 0) {
                getstatuscode.getExpiryDate();
                throw null;
            }
            byte[] expiryDate = getstatuscode.getExpiryDate();
            int i3 = writeReplace;
            int i4 = ((((i3 ^ 69) | (i3 & 69)) << 1) - (~(-((i3 & (-70)) | ((~i3) & 69))))) - 1;
            getAid = i4 % 128;
            if (i4 % 2 != 0) {
                return expiryDate;
            }
            throw new java.lang.ArithmeticException();
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
            int i = writeReplace;
            int i2 = i & 121;
            int i3 = i | 121;
            int i4 = (i2 & i3) + (i3 | i2);
            getAid = i4 % 128;
            com.payair.hce.getStatusCode getstatuscode = anonymousClass1.DigitizedCardProfile;
            if (i4 % 2 != 0) {
                return getstatuscode.getTrack2EquivalentData();
            }
            getstatuscode.getTrack2EquivalentData();
            throw null;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
            int i = writeReplace;
            int i2 = i & 15;
            int i3 = (i | 15) & (~i2);
            int i4 = i2 << 1;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            getAid = i5 % 128;
            com.payair.hce.getStatusCode getstatuscode = anonymousClass1.DigitizedCardProfile;
            if (i5 % 2 == 0) {
                getstatuscode.getPanSequenceNumber();
                throw null;
            }
            byte[] panSequenceNumber = getstatuscode.getPanSequenceNumber();
            int i6 = writeReplace;
            int i7 = i6 & 21;
            getAid = (i7 + ((i6 ^ 21) | i7)) % 128;
            return panSequenceNumber;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
            int i = getAid;
            int i2 = ((i ^ 37) - (~(-(-((i & 37) << 1))))) - 1;
            writeReplace = i2 % 128;
            com.payair.hce.getSelectedCard getselectedcard = anonymousClass1.valueOf;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            int i3 = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) << 1;
            int i4 = -((i & (-124)) | ((~i) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
            int i5 = (i3 & i4) + (i4 | i3);
            writeReplace = i5 % 128;
            if (i5 % 2 == 0) {
                return getselectedcard;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
            com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
            int i = writeReplace;
            int i2 = (i & 95) + (i | 95);
            getAid = i2 % 128;
            com.payair.hce.suspendCardForToken suspendcardfortoken = anonymousClass1.AlternateContactlessPaymentDataJson;
            if (i2 % 2 != 0) {
                return suspendcardfortoken;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.getForegroundServiceType.AnonymousClass1 anonymousClass1 = (com.payair.hce.getForegroundServiceType.AnonymousClass1) objArr[0];
            int i = writeReplace;
            int i2 = (i ^ 61) + ((i & 61) << 1);
            getAid = i2 % 128;
            com.payair.hce.getStatusCode getstatuscode = anonymousClass1.DigitizedCardProfile;
            if (i2 % 2 != 0) {
                return getstatuscode.getPar();
            }
            getstatuscode.getPar();
            throw null;
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] getCvrMaskAnd() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, 300303128, -300303120, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final com.payair.hce.suspendCardForToken SdkCoreAlternateContactlessPaymentDataImpl() {
            return (com.payair.hce.suspendCardForToken) writeReplace(new java.lang.Object[]{this}, -143867874, 143867883, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final com.payair.hce.getSelectedCard RecordsJson() {
            return (com.payair.hce.getSelectedCard) writeReplace(new java.lang.Object[]{this}, 56523079, -56523073, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final com.payair.hce.getNumberOfTransactionLogEntries getProfileVersion() {
            return (com.payair.hce.getNumberOfTransactionLogEntries) writeReplace(new java.lang.Object[]{this}, -1381501745, 1381501748, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] getAid() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, 661457978, -661457978, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] IccPrivateKeyCrtComponentsJson() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, -1726753534, 1726753536, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] AlternateContactlessPaymentDataJson() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, 353044609, -353044608, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] valueOf() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, 1052168462, -1052168455, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] writeReplace() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, -1270291210, 1270291220, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] values() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, -1229127056, 1229127060, java.lang.System.identityHashCode(this));
        }

        @Override // com.payair.hce.unsuspendTokens
        public final byte[] DigitizedCardProfile() {
            return (byte[]) writeReplace(new java.lang.Object[]{this}, 502433960, -502433955, java.lang.System.identityHashCode(this));
        }
    }

    static void init$0() {
        $$a = new byte[]{1, 58, com.google.common.base.Ascii.FF, Byte.MIN_VALUE};
        $$b = 183;
    }

    static void writeReplace() {
        AlternateContactlessPaymentDataJson = 2671975091641531297L;
    }
}
