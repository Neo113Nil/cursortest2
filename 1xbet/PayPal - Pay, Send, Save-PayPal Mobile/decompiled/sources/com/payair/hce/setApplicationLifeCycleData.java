package com.payair.hce;

/* loaded from: classes10.dex */
public class setApplicationLifeCycleData implements com.payair.hce.setIccKek {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getProfileVersion;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private com.payair.hce.setStatus DigitizedCardProfile;
    private java.lang.String valueOf;
    private java.lang.String values;
    private com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile writeReplace;

    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2 = i * 4;
        int i3 = (s * 3) + 4;
        int i4 = 99 - (b * 4);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += -i3;
            i3++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i4 += -bArr[i3];
            i3 = i7 + 1;
            i5 = i6;
        }
    }

    private static void c(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = i + 65;
        char[] cArr = new char[35 - i2];
        int i5 = 34 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i3)) - 2;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3 + 1;
            int i8 = i6 + 1;
            cArr[i8] = (char) i4;
            if (i8 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            } else {
                i4 = (i4 + (-bArr[i7])) - 2;
                i3 = i7;
                i6 = i8;
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5 = ~i3;
        int i6 = ~(i5 | i);
        int i7 = ~((~i) | i2);
        if ((i * 765) + (i2 * (-1527)) + ((i2 | i6) * 764) + (((~(i5 | i2)) | i7) * (-1528)) + (((~(i | (~i2))) | i7 | i6) * 764) == 1) {
            return writeReplace(objArr);
        }
        com.payair.hce.setApplicationLifeCycleData setapplicationlifecycledata = (com.payair.hce.setApplicationLifeCycleData) objArr[0];
        com.payair.hce.setDsrpUmdSingleUseKey setdsrpumdsingleusekey = new com.payair.hce.setDsrpUmdSingleUseKey();
        com.payair.hce.setStatus setstatus = setapplicationlifecycledata.DigitizedCardProfile;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted}, 1726673286, -1726673281, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted));
        setdsrpumdsingleusekey.valueOf = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 714263624, -714263622, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setdsrpumdsingleusekey.DigitizedCardProfile = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -2141780035, 2141780053, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setdsrpumdsingleusekey.writeReplace = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1897930046, 1897930056, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setdsrpumdsingleusekey.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 251374181, -251374176, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setdsrpumdsingleusekey.getProfileVersion = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 2040522844, -2040522823, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setdsrpumdsingleusekey.getAid = null;
        setdsrpumdsingleusekey.values = java.lang.Integer.toHexString(((java.lang.Integer) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 743878840, -743878815, java.lang.System.identityHashCode(settransactioncredentialsstatus))).intValue()).toUpperCase();
        setdsrpumdsingleusekey.IccPrivateKeyCrtComponentsJson = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1646687107, 1646687120, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setdsrpumdsingleusekey.RecordsJson = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1158959258, 1158959270, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.setPaymentFci setpaymentfci = new com.payair.hce.setPaymentFci();
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setpaymentfci.valueOf = setapplicationlifecycledata.writeReplace((java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted}, -1712050221, 1712050222, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted)));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted2 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setpaymentfci.values = setapplicationlifecycledata.writeReplace((java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted2}, -1469688320, 1469688326, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted2)));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted3 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setpaymentfci.DigitizedCardProfile = setapplicationlifecycledata.writeReplace((java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted3}, 1058599604, -1058599595, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted3)));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted4 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setpaymentfci.AlternateContactlessPaymentDataJson = setapplicationlifecycledata.writeReplace((java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted4}, 1784820981, -1784820979, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted4)));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted5 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setpaymentfci.writeReplace = setapplicationlifecycledata.writeReplace((java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted5}, -1126059056, 1126059056, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted5)));
        setdsrpumdsingleusekey.SdkCoreAlternateContactlessPaymentDataImpl = setpaymentfci;
        setdsrpumdsingleusekey.getCvrMaskAnd = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1437442796, 1437442805, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        setdsrpumdsingleusekey.SdkCoreBusinessLogicModuleImpl = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 1178558104, -1178558101, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        int i8 = -1609363548;
        int i9 = 1609363555;
        int length = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1609363548, 1609363555, java.lang.System.identityHashCode(settransactioncredentialsstatus))).length;
        com.payair.hce.setGpoResponse[] setgporesponseArr = new com.payair.hce.setGpoResponse[length];
        int i10 = 0;
        while (i10 < length) {
            setgporesponseArr[i10] = new com.payair.hce.setGpoResponse();
            com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, i8, i9, java.lang.System.identityHashCode(settransactioncredentialsstatus)))[i10];
            java.lang.String upperCase = java.lang.Integer.toHexString((((java.lang.Byte) com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted}, -5385263, 5385266, java.lang.System.identityHashCode(provisionRequestEncrypted))).byteValue() << 3) + 4).toUpperCase();
            com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted2 = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, i8, i9, java.lang.System.identityHashCode(settransactioncredentialsstatus)))[i10];
            java.lang.String upperCase2 = java.lang.Integer.toHexString(((java.lang.Byte) com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted2}, -2006065438, 2006065439, java.lang.System.identityHashCode(provisionRequestEncrypted2))).byteValue()).toUpperCase();
            com.payair.hce.setGpoResponse setgporesponse = setgporesponseArr[i10];
            if (upperCase2.length() % 2 == 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1024, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.view.View.MeasureSpec.getMode(0) + 1, objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(upperCase2);
                upperCase2 = sb.toString();
            }
            setgporesponse.valueOf = java.lang.Integer.parseInt(upperCase2);
            com.payair.hce.setGpoResponse setgporesponse2 = setgporesponseArr[i10];
            if (upperCase.length() % 2 == 1) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1025, (char) android.graphics.Color.green(0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr3);
                sb2.append(((java.lang.String) objArr3[0]).intern());
                sb2.append(upperCase);
                upperCase = sb2.toString();
                i4 = SdkCoreAlternateContactlessPaymentDataImpl + 101;
            } else {
                i4 = SdkCoreAlternateContactlessPaymentDataImpl + 85;
            }
            RecordsJson = i4 % 128;
            setgporesponse2.values = upperCase;
            com.payair.hce.setGpoResponse setgporesponse3 = setgporesponseArr[i10];
            com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted3 = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1609363548, 1609363555, java.lang.System.identityHashCode(settransactioncredentialsstatus)))[i10];
            setgporesponse3.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted3}, 1093327563, -1093327559, java.lang.System.identityHashCode(provisionRequestEncrypted3));
            i10++;
            i9 = 1609363555;
            i8 = -1609363548;
        }
        setdsrpumdsingleusekey.getPaymentFci = setgporesponseArr;
        com.payair.hce.getDsrpUmdSessionKey getdsrpumdsessionkey = new com.payair.hce.getDsrpUmdSessionKey();
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 481095094, -481095075, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        if (getvalidforseconds == null) {
            setdsrpumdsingleusekey.getGpoResponse = null;
            return setdsrpumdsingleusekey;
        }
        getdsrpumdsessionkey.DigitizedCardProfile = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, -1194271620, 1194271620, java.lang.System.identityHashCode(getvalidforseconds));
        getdsrpumdsessionkey.values = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, 785315415, -785315409, java.lang.System.identityHashCode(getvalidforseconds));
        getdsrpumdsessionkey.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, -1924062730, 1924062731, java.lang.System.identityHashCode(getvalidforseconds));
        getdsrpumdsessionkey.writeReplace = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, 1762342771, -1762342769, java.lang.System.identityHashCode(getvalidforseconds));
        getdsrpumdsessionkey.valueOf = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, -1523518471, 1523518476, java.lang.System.identityHashCode(getvalidforseconds));
        setdsrpumdsingleusekey.getGpoResponse = getdsrpumdsessionkey;
        return setdsrpumdsingleusekey;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class DigitizedCardProfile {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static long AlternateContactlessPaymentDataJson;
        private static final /* synthetic */ com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile[] DigitizedCardProfile;
        private static int getProfileVersion;
        public static final com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile valueOf;
        private static com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile values;
        private static int writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
            int i;
            int i2;
            int i3 = b2 * 4;
            int i4 = (b * 2) + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                i2 = i4;
                int i5 = i3;
                i = 0;
                i4 += i5;
                i2++;
                bArr2[i] = (byte) i4;
                if (i == i3) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i++;
                i5 = bArr[i2];
                i4 += i5;
                i2++;
                bArr2[i] = (byte) i4;
                if (i == i3) {
                }
            } else {
                int i6 = 119 - (s * 2);
                i = 0;
                i2 = i4;
                i4 = i6;
                bArr2[i] = (byte) i4;
                if (i == i3) {
                }
            }
        }

        private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr = str;
            if (str != null) {
                $10 = ($11 + 47) % 128;
                cArr = str.toCharArray();
            }
            com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
            char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(AlternateContactlessPaymentDataJson ^ (-3824242241614154557L), cArr, i);
            getcardholdervalidator.valueOf = 4;
            $10 = ($11 + 65) % 128;
            while (getcardholdervalidator.valueOf < writeReplace2.length) {
                getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
                int i2 = getcardholdervalidator.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, 1921 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                    }
                    writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27, android.view.View.MeasureSpec.getSize(0) + 429, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31610));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 0, objArr5);
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

        private DigitizedCardProfile(java.lang.String str, int i) {
        }

        public static com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile valueOf(java.lang.String str) {
            int i = getProfileVersion + 71;
            writeReplace = i % 128;
            com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile) java.lang.Enum.valueOf(com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile.class, str);
            if (i % 2 != 0) {
                throw null;
            }
            int i2 = writeReplace + 19;
            getProfileVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return digitizedCardProfile;
            }
            throw null;
        }

        public static com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile[] values() {
            int i = getProfileVersion + 79;
            writeReplace = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile[] digitizedCardProfileArr = (com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile[]) DigitizedCardProfile.clone();
            int i2 = getProfileVersion + 11;
            writeReplace = i2 % 128;
            if (i2 % 2 == 0) {
                return digitizedCardProfileArr;
            }
            throw new java.lang.ArithmeticException();
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            writeReplace = 0;
            getProfileVersion = 1;
            DigitizedCardProfile();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("蹲눟踱ϗ⁹ዠ⟒ꐾ욚", 1 - android.text.TextUtils.indexOf("", ""), objArr);
            com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile digitizedCardProfile = new com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile(((java.lang.String) objArr[0]).intern(), 0);
            valueOf = digitizedCardProfile;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("攽땎敾ํ✨卜⩈\ue582ⷒ", android.text.TextUtils.getCapsMode("", 0, 0) + 1, objArr2);
            com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile digitizedCardProfile2 = new com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile(((java.lang.String) objArr2[0]).intern(), 1);
            values = digitizedCardProfile2;
            DigitizedCardProfile = new com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile[]{digitizedCardProfile, digitizedCardProfile2};
            getProfileVersion = (writeReplace + 77) % 128;
        }

        static void DigitizedCardProfile() {
            AlternateContactlessPaymentDataJson = -5022438252204529944L;
        }

        static void init$0() {
            $$a = new byte[]{16, 76, 17, 34};
            $$b = 203;
        }
    }

    private setApplicationLifeCycleData() {
        this.DigitizedCardProfile = null;
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 87;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i - getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47, 381 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (62388 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3967, (char) (40223 - (android.os.Process.myPid() >> 22)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 34, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 211, (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 380, (char) (62388 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(0, (byte) 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 3966 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.graphics.Color.rgb(0, 0, 0) + 16817439))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 211 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 35, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 211, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
            $11 = ($10 + 67) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private setApplicationLifeCycleData(java.lang.String str) {
        this.DigitizedCardProfile = null;
        this.writeReplace = com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile.valueOf;
        this.valueOf = str;
    }

    public static com.payair.hce.setApplicationLifeCycleData AlternateContactlessPaymentDataJson(java.lang.String str) {
        com.payair.hce.setApplicationLifeCycleData setapplicationlifecycledata = new com.payair.hce.setApplicationLifeCycleData(str);
        int i = RecordsJson + 125;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return setapplicationlifecycledata;
        }
        throw null;
    }

    @Override // com.payair.hce.setIccKek
    public final java.lang.String valueOf(com.payair.hce.setStatus setstatus) {
        this.DigitizedCardProfile = setstatus;
        com.payair.hce.BusinessLogicModule businessLogicModule = new com.payair.hce.BusinessLogicModule();
        businessLogicModule.valueOf = (java.lang.String) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -1488605262, 1488605263, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setStatus setstatus2 = this.DigitizedCardProfile;
        businessLogicModule.DigitizedCardProfile = (java.lang.String) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus2}, -230306547, 230306558, java.lang.System.identityHashCode(setstatus2));
        com.payair.hce.setStatus setstatus3 = this.DigitizedCardProfile;
        businessLogicModule.AlternateContactlessPaymentDataJson = ((java.lang.Integer) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus3}, -316702788, 316702796, java.lang.System.identityHashCode(setstatus3))).intValue();
        businessLogicModule.writeReplace = values();
        businessLogicModule.values = valueOf();
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 42038), 6 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        if (this.writeReplace != com.payair.hce.setApplicationLifeCycleData.DigitizedCardProfile.valueOf) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 467, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 58593), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 73, objArr2);
            setchilddivider.valueOf(((java.lang.String) objArr2[0]).intern());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(android.graphics.Color.rgb(0, 0, 0) + 16777757, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 57 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            setchilddivider.valueOf(((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(597 - android.os.Process.getGidForName(""), (char) android.graphics.Color.blue(0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 66, objArr4);
            setchilddivider.valueOf(((java.lang.String) objArr4[0]).intern());
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(665 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.graphics.Color.red(0) + 64591), 72 - android.view.View.combineMeasuredStates(0, 0), objArr5);
            setchilddivider.valueOf(((java.lang.String) objArr5[0]).intern());
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(738 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(""), 62 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
            setchilddivider.valueOf(((java.lang.String) objArr6[0]).intern());
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 798, (char) android.text.TextUtils.indexOf("", ""), 71 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
            setchilddivider.valueOf(((java.lang.String) objArr7[0]).intern());
            int argb = android.graphics.Color.argb(0, 0, 0, 0);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(870 - argb, (char) (48512 - android.view.KeyEvent.normalizeMetaState(0)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 70, objArr8);
            setchilddivider.valueOf(((java.lang.String) objArr8[0]).intern());
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a(942 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (20890 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 84 - android.view.KeyEvent.keyCodeFromString(""), objArr9);
            setchilddivider.valueOf(((java.lang.String) objArr9[0]).intern());
            com.payair.hce.AlternateContactlessPaymentData alternateContactlessPaymentData = new com.payair.hce.AlternateContactlessPaymentData();
            alternateContactlessPaymentData.writeReplace = businessLogicModule;
            alternateContactlessPaymentData.AlternateContactlessPaymentDataJson = values(this.valueOf);
            alternateContactlessPaymentData.DigitizedCardProfile = this.values;
            java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(alternateContactlessPaymentData);
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 37) % 128;
            return DigitizedCardProfile2;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 67) % 128;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(7 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.argb(0, 0, 0, 0) + 61, objArr10);
        setchilddivider.valueOf(((java.lang.String) objArr10[0]).intern());
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(67 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (41034 - android.view.View.getDefaultSize(0, 0)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45, objArr11);
        setchilddivider.valueOf(((java.lang.String) objArr11[0]).intern());
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(114 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (24730 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), 55 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr12);
        setchilddivider.valueOf(((java.lang.String) objArr12[0]).intern());
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(168 - android.view.KeyEvent.keyCodeFromString(""), (char) (46239 - android.view.KeyEvent.getDeadChar(0, 0)), 61 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr13);
        setchilddivider.valueOf(((java.lang.String) objArr13[0]).intern());
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(229 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (2479 - android.widget.ExpandableListView.getPackedPositionType(0L)), 49 - android.os.Process.getGidForName(""), objArr14);
        setchilddivider.valueOf(((java.lang.String) objArr14[0]).intern());
        int gidForName = android.os.Process.getGidForName("");
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a(gidForName + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32835), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 59, objArr15);
        setchilddivider.valueOf(((java.lang.String) objArr15[0]).intern());
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        a(337 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (36951 - android.graphics.Color.red(0)), 59 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
        setchilddivider.valueOf(((java.lang.String) objArr16[0]).intern());
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        a(android.text.TextUtils.getOffsetAfter("", 0) + 396, (char) (17850 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 71, objArr17);
        setchilddivider.valueOf(((java.lang.String) objArr17[0]).intern());
        return setchilddivider.DigitizedCardProfile(businessLogicModule);
    }

    private com.payair.hce.C0102 values() {
        java.lang.String upperCase;
        com.payair.hce.C0102 c0102 = new com.payair.hce.C0102();
        com.payair.hce.setCvrMaskAnd setcvrmaskand = new com.payair.hce.setCvrMaskAnd();
        com.payair.hce.setStatus setstatus = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted}, -1773827389, 1773827397, java.lang.System.identityHashCode(deleteCardRequestEncrypted));
        setcvrmaskand.values = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, -994099733, 994099733, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setcvrmaskand.DigitizedCardProfile = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 944639813, -944639800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setcvrmaskand.valueOf = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, -823562565, 823562575, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setcvrmaskand.AlternateContactlessPaymentDataJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, -1220726242, 1220726250, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setcvrmaskand.writeReplace = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 528678814, -528678800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setcvrmaskand.RecordsJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 233240415, -233240409, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setcvrmaskand.getAid = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 1418409609, -1418409605, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setcvrmaskand.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 95577821, -95577816, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        c0102.getProfileVersion = setcvrmaskand;
        com.payair.hce.setSecurityWord setsecurityword = new com.payair.hce.setSecurityWord();
        com.payair.hce.setStatus setstatus2 = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted2 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus2}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus2));
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted2 = (com.payair.hce.NotifyProvisionRequestEncrypted) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted2}, -1773827389, 1773827397, java.lang.System.identityHashCode(deleteCardRequestEncrypted2));
        setsecurityword.valueOf = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, -994099733, 994099733, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setsecurityword.values = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 944639813, -944639800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setsecurityword.AlternateContactlessPaymentDataJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, -823562565, 823562575, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setsecurityword.DigitizedCardProfile = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, -1220726242, 1220726250, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setsecurityword.writeReplace = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 528678814, -528678800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setsecurityword.SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 233240415, -233240409, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setsecurityword.RecordsJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 1418409609, -1418409605, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setsecurityword.IccPrivateKeyCrtComponentsJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 95577821, -95577816, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        c0102.RecordsJson = setsecurityword;
        com.payair.hce.setStatus setstatus3 = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted3 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus3}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus3));
        java.lang.String str = (java.lang.String) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted3}, -608653999, 608654006, java.lang.System.identityHashCode(deleteCardRequestEncrypted3));
        if (str != null) {
            upperCase = str.toUpperCase();
        } else {
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 29) % 128;
            upperCase = null;
        }
        c0102.writeReplace = upperCase;
        com.payair.hce.setStatus setstatus4 = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted4 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus4}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus4));
        c0102.valueOf = ((java.lang.Integer) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted4}, 1807702463, -1807702461, java.lang.System.identityHashCode(deleteCardRequestEncrypted4))).intValue();
        com.payair.hce.setStatus setstatus5 = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted5 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus5}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus5));
        c0102.DigitizedCardProfile = ((java.lang.Integer) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted5}, 2038443170, -2038443170, java.lang.System.identityHashCode(deleteCardRequestEncrypted5))).intValue();
        com.payair.hce.setStatus setstatus6 = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted6 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus6}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus6));
        c0102.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted6}, -222679591, 222679592, java.lang.System.identityHashCode(deleteCardRequestEncrypted6));
        c0102.values = new java.lang.String[1];
        java.lang.String[] strArr = c0102.values;
        com.payair.hce.setStatus setstatus7 = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted7 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus7}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus7));
        strArr[0] = ((com.payair.hce.setIsRedigitization) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted7}, -1278248481, 1278248484, java.lang.System.identityHashCode(deleteCardRequestEncrypted7))).AlternateContactlessPaymentDataJson();
        int i = RecordsJson + 83;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return c0102;
        }
        throw null;
    }

    private com.payair.hce.setCiacDecline valueOf() {
        com.payair.hce.setCiacDecline setciacdecline = new com.payair.hce.setCiacDecline();
        setciacdecline.values = writeReplace();
        setciacdecline.valueOf = (com.payair.hce.setDsrpUmdSingleUseKey) valueOf(new java.lang.Object[]{this}, 2057177312, -2057177312, java.lang.System.identityHashCode(this));
        setciacdecline.DigitizedCardProfile = AlternateContactlessPaymentDataJson();
        int i = RecordsJson + 25;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return setciacdecline;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.String values(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 45) % 128;
        try {
            java.lang.String AlternateContactlessPaymentDataJson = com.payair.hce.getPendingAction.writeReplace().AlternateContactlessPaymentDataJson(str, this.AlternateContactlessPaymentDataJson);
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 35;
            RecordsJson = i % 128;
            if (i % 2 != 0) {
                return AlternateContactlessPaymentDataJson;
            }
            throw new java.lang.ArithmeticException();
        } catch (com.payair.hce.setVersion e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.getMessage()));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private com.payair.hce.setDsrpUmdSessionKey writeReplace() {
        com.payair.hce.setDsrpUmdSessionKey setdsrpumdsessionkey = new com.payair.hce.setDsrpUmdSessionKey();
        com.payair.hce.setStatus setstatus = this.DigitizedCardProfile;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus));
        setdsrpumdsessionkey.valueOf = ((com.payair.hce.getTransactionCredentialsStatus) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted}, 1973004519, -1973004516, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted))).AlternateContactlessPaymentDataJson();
        com.payair.hce.setStatus setstatus2 = this.DigitizedCardProfile;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted2 = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus2}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus2));
        setdsrpumdsessionkey.DigitizedCardProfile = ((com.payair.hce.getTransactionCredentialsStatus) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted2}, 1973004519, -1973004516, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted2))).values();
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
        return setdsrpumdsessionkey;
    }

    private com.payair.hce.setAid AlternateContactlessPaymentDataJson() {
        int i = RecordsJson + 119;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        com.payair.hce.setAid setaid = null;
        if (i % 2 == 0) {
            com.payair.hce.setStatus setstatus = this.DigitizedCardProfile;
            com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus));
            com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted}, 1109463870, -1109463869, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted));
            if (notifyProvisionResponseEncrypted != null) {
                setaid = new com.payair.hce.setAid();
                setaid.values = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -278058035, 278058049, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
                setaid.DigitizedCardProfile = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -1761789453, 1761789453, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
                setaid.getAid = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, 1428191881, -1428191872, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
                setaid.SdkCoreAlternateContactlessPaymentDataImpl = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -1279486589, 1279486596, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
                setaid.IccPrivateKeyCrtComponentsJson = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -931277398, 931277413, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
                setaid.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -312516605, 312516618, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
                setaid.valueOf = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -212957071, 212957082, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
                setaid.writeReplace = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -1696219132, 1696219144, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
            }
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 11) % 128;
            return setaid;
        }
        com.payair.hce.setStatus setstatus2 = this.DigitizedCardProfile;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted2 = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus2}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus2));
        throw null;
    }

    private java.lang.String writeReplace(java.lang.String str) {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 99) % 128;
        try {
            java.lang.String AlternateContactlessPaymentDataJson = com.payair.hce.getPendingAction.writeReplace().AlternateContactlessPaymentDataJson(str, this.valueOf);
            int i = RecordsJson + 113;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                return AlternateContactlessPaymentDataJson;
            }
            throw null;
        } catch (com.payair.hce.setVersion e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.getMessage()));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x03d3, code lost:
    
        if (r0.contains(r5.getField((java.lang.String) r13[0]).get(null)) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0692, code lost:
    
        if (r0.equals(((java.lang.String) r6[0]).intern()) != false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        ?? r15;
        int i;
        int i2;
        android.content.Context context = (android.content.Context) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int intValue2 = ((java.lang.Number) objArr[2]).intValue();
        try {
            if (context == null) {
                java.lang.Object[] objArr3 = {new int[]{intValue}, new int[]{intValue}, null, new int[1]};
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(intValue2), 0, java.lang.Integer.valueOf(((((-58823553) | r4) * 494) - 2005330836) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-63673298))) | 1014628475) * 494))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                java.lang.Object obj2 = obj;
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                    byte b = $$a[14];
                    short s = (short) (b + 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(s, (byte) s, b, objArr5);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                    obj2 = method;
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 83) % 128;
            try {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(1026 - android.view.View.MeasureSpec.getSize(0), (char) android.graphics.Color.alpha(0), 23 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr6);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr6[0]).intern());
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GLOBAL_ALTITUDE, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 18 - android.graphics.Color.alpha(0), objArr7);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr7[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a(1066 - android.view.MotionEvent.axisFromString(""), (char) (45793 - android.view.View.getDefaultSize(0, 0)), android.os.Process.getGidForName("") + 35, objArr8);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern());
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(android.text.TextUtils.indexOf("", "", 0) + 1101, (char) android.widget.ExpandableListView.getPackedPositionType(0L), 5 - android.text.TextUtils.indexOf("", ""), objArr9);
                if ((cls3.getField(((java.lang.String) objArr9[0]).intern()).getInt(invoke) & 2) != 0) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 97) % 128;
                    objArr2 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue ^ 1}, null, new int[1]};
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i3 = ~currentTimeMillis;
                    java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(intValue2), 16, java.lang.Integer.valueOf((((~(271921926 | currentTimeMillis)) | (~((-733007059) | i3))) * com.visa.cbp.getCertUsage.getODAData) + 2082403017 + (((~(currentTimeMillis | (-733007059))) | (~(i3 | 271921926))) * com.visa.cbp.getCertUsage.getODAData))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj4 = obj3;
                    if (obj3 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) ((-1) - android.os.Process.getGidForName("")));
                        byte b2 = $$a[14];
                        short s2 = (short) (b2 + 1);
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        c(s2, (byte) s2, b2, objArr11);
                        java.lang.reflect.Method method2 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                        obj4 = method2;
                    }
                    ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).intValue();
                } else {
                    objArr2 = new java.lang.Object[]{new int[]{intValue}, new int[]{intValue}, null, new int[1]};
                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                    java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(intValue2), 0, java.lang.Integer.valueOf((((~((-2621443) | (~currentTimeMillis2))) | (~(1002307542 | currentTimeMillis2))) * (-272)) + 1884684056 + (((~((-590928455) | currentTimeMillis2)) | 588307012) * (-272)) + (((~(currentTimeMillis2 | 590928454)) | 414000530) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj6 = obj5;
                    if (obj5 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.view.View.MeasureSpec.getSize(0) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        byte b3 = $$a[14];
                        short s3 = (short) (b3 + 1);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        c(s3, (byte) s3, b3, objArr13);
                        java.lang.reflect.Method method3 = cls5.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                        obj6 = method3;
                    }
                    ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr12)).intValue();
                }
                if (((int[]) objArr2[1])[0] != intValue) {
                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
                    return objArr2;
                }
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                java.lang.Object obj8 = obj7;
                if (obj7 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 1738, (char) (5874 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    byte b4 = $$a[14];
                    short s4 = (short) (b4 + 1);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    c(s4, (byte) s4, b4, objArr14);
                    java.lang.reflect.Method method4 = cls6.getMethod((java.lang.String) objArr14[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, method4);
                    obj8 = method4;
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj8).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", ""), 1738 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.indexOf("", "", 0) + 5826));
                byte[] bArr = $$a;
                byte b5 = bArr[14];
                short s5 = (short) (b5 + 1);
                byte b6 = (byte) s5;
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                c(s5, b6, b5, objArr15);
                byte b7 = b6;
                if (!set.contains(cls7.getField((java.lang.String) objArr15[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.os.Process.myPid() >> 22), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1738, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5826));
                    byte b8 = bArr[23];
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    b7 = com.google.common.base.Ascii.GS;
                    r15 = 29;
                    c(53, 29, b8, objArr16);
                }
                r15 = b7;
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 71) % 128;
                    java.lang.Object[] objArr17 = {new int[]{intValue}, new int[]{intValue}, null, new int[1]};
                    int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                    int i4 = ~currentTimeMillis3;
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(intValue2), 0, java.lang.Integer.valueOf((((~(19758638 | i4)) | (~((-2883625) | currentTimeMillis3))) * (-831)) + 653479054 + ((~(1027571247 | currentTimeMillis3)) * (-1662)) + (((~(currentTimeMillis3 | 1024687623)) | (~(i4 | (-1024687624))) | (~((-19758639) | currentTimeMillis3))) * 831))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj10 = obj9;
                    if (obj9 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 2713, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b9 = bArr[14];
                        short s6 = (short) (b9 + 1);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        c(s6, (byte) s6, b9, objArr19);
                        java.lang.reflect.Method method5 = cls9.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                        obj10 = method5;
                    }
                    ((int[]) objArr17[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr18)).intValue();
                    return objArr17;
                }
                try {
                } catch (java.lang.Exception unused) {
                    r15 = 0;
                    i = intValue;
                    i2 = intValue2;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    a(1106 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.graphics.Color.green(0) + 35280), 28 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr20);
                    try {
                        java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        java.lang.Object obj12 = obj11;
                        if (obj11 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 36, 3161 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 33099));
                            byte b10 = (byte) ($$b & 62);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c(653, b10, (byte) (b10 + 4), objArr22);
                            java.lang.reflect.Method method6 = cls10.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, method6);
                            obj12 = method6;
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr21)).longValue();
                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                        long j = ~longValue;
                        r15 = 0;
                        long j2 = currentTimeMillis4;
                        i2 = intValue2;
                        long j3 = longValue | (-607449540);
                        i = intValue;
                        long j4 = (((((longValue * (-751)) - 456194603789L) + (((~(j | (-607449540))) | (~(j2 | (-607449540)))) * 1504)) + ((~(j2 | j3)) * (-1504))) + (((~j3) | (~(j | 607449539))) * 752)) - 1945117647;
                        int i5 = (int) (j4 >> 32);
                        int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                        int i6 = ~currentTimeMillis5;
                        int i7 = ~(currentTimeMillis5 | (-262531));
                        int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                        int i8 = ~currentTimeMillis6;
                        if (((i5 & ((((~((-1055085609) | i6)) | 673207336 | i7) * (-713)) + 210535936 + (i7 * 1426) + ((~((-382140803) | i6)) * 713))) | (((int) j4) & ((((~(849871889 | i8)) | (~(587354520 | currentTimeMillis6)) | (~((-587354521) | i8))) * 959) + 896293370 + (((~(currentTimeMillis6 | 849871889)) | (~(i8 | 587354520)) | (~((-587354521) | currentTimeMillis6))) * 959)))) == 1) {
                            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
                            java.lang.Object[] objArr23 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                            int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                            int i9 = ~currentTimeMillis7;
                            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-872145794) | i9)) | (~((-132783192) | currentTimeMillis7))) | (~(132783191 | i9))) * 959) - 1840250920) + (((~(currentTimeMillis7 | (-872145794))) | (~(i9 | (-132783192))) | (~(132783191 | currentTimeMillis7))) * 959))};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj14 = obj13;
                            if (obj13 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                byte b11 = bArr[14];
                                short s7 = (short) (b11 + 1);
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                c(s7, (byte) s7, b11, objArr25);
                                java.lang.reflect.Method method7 = cls11.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method7);
                                obj14 = method7;
                            }
                            ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr24)).intValue();
                            return objArr23;
                        }
                        java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                        int i10 = ~currentTimeMillis8;
                        ?? r4 = {java.lang.Integer.valueOf(i2), r15, java.lang.Integer.valueOf((((998244287 | i10) * (-369)) - 1838430672) + (((~((-678940830) | i10)) | 325988155) * (-369)) + (((~(currentTimeMillis8 | 678940829)) | 319303458 | (~(i10 | (-672256133)))) * 369))};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj16 = obj15;
                        if (obj15 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), 2713 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            byte b12 = $$a[14];
                            short s8 = (short) (b12 + 1);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            c(s8, (byte) s8, b12, objArr27);
                            java.lang.reflect.Method method8 = cls12.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                            obj16 = method8;
                        }
                        ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, r4)).intValue();
                        return objArr26;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                r15 = 0;
                i = intValue;
                i2 = intValue2;
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                a(1134 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (3856 - android.text.TextUtils.getTrimmedLength("")), android.text.TextUtils.indexOf("", "", 0) + 13, objArr28);
                try {
                    java.lang.Object[] objArr29 = {((java.lang.String) objArr28[0]).intern()};
                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    java.lang.Object obj18 = obj17;
                    if (obj17 == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myPid() >> 22), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1922, (char) (android.os.Process.myPid() >> 22));
                        byte b13 = (byte) ($$b & 62);
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        c(653, b13, (byte) (b13 + 4), objArr30);
                        java.lang.reflect.Method method9 = cls13.getMethod((java.lang.String) objArr30[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, method9);
                        obj18 = method9;
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj18).invoke(null, objArr29);
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    a(1147 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (27731 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr31);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
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
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        char[] cArr = new char[1148];
        java.nio.ByteBuffer.wrap("ú³Ü·¶ú\u0088õbøDê\u001eê^Âxß\u0012ß,ãÆÆàÛºÊTânÀ\bË\"ÚüÃ\u0096Ê°\u0081JÌdÀ>ÁØÛòÎ\u008cÌ¦Û@Ã\u001aÊ4ÜÎÜèÿ\u0082Î\\ÖvÂ\u0010Ê*ÁÄÛ\u009eë¸ÎRÛlÎ\u0006\u0081 ÌúË\u0094À®ÃH\u009ebý<ÊÖÃðÎ\u008aÛ¤Ê~Ë\u0018ë2ÎÌÛæÎ\u0080ãZÊtÁ\u000eÈ(ÛÂÇ\u009cù¶\u009dþ\u0088Ø\u0095²\u0095\u008c©f\u008c@\u0091\u001a\u0080ô¨Î\u008a¨\u0081\u0082\u0090\\\u00896\u0080\u0010Ëê\u0086Ä\u008a\u009e\u008bx\u0091R\u0084,\u0086\u0006\u0091à\u0089º\u0080\u0094\u0096n\u0096Hµ\"\u0084ü\u009cÖ\u0088°\u0080\u008a\u008bd\u0091>¡\u0018\u0084ò\u0091Ì\u0084¦Ë\u0080\u0086Z\u00934\u0088\u000e¨è\u008aÂ\u0081\u009c\u0080v\u0089>X\u0018ErELy¦\\\u0080AÚP4x\u000eZhQB@\u009cYöPÐ\u001b*V\u0004Z^[¸A\u0092TìVÆA YzPTF®F\u0088eâT<L\u0016XpPJ[¤AþqØT2A\fTf\u001b@\\\u009aFôaÎG(T\u0002[\\F¶\\\u0090AêfÄ@\u001eExERZ¬G\u0086AàP:Qê]Ì@¦@\u0098|rYTD\u000eUà}Ú_¼T\u0096EH\\\"U\u0004\u001eþSÐ_\u008a^lDFQ8S\u0012Dô\\®U\u0080CzC\\`6QèIÂ]¤U\u009e^pD*t\fQæDØQ²\u001e\u0094YNC e\u001aCüqÖY\u0088@b}DQ>C\u0010[ÊY¬^\u0086WxcRE4@î@À_ºB\u009cDvU(TWmqp\u001bp%LÏiét³e]Mgo\u0001d+uõl\u009fe¹.Ccmo7nÑtûa\u0085c¯tIl\u0013e=sÇsáP\u008baUy\u007fm\u0019e#nÍt\u0097D±a[tea\u000f.)uóm\u009dd§GAekn5eßrùa\u0083t\u00adiwo\u0011nÞ\u0081ø\u009c\u0092\u009c¬ F\u0085`\u0098:\u0089Ô¡î\u0083\u0088\u0088¢\u0099|\u0080\u0016\u00890ÂÊ\u008fä\u0083¾\u0082X\u0098r\u008d\f\u008f&\u0098À\u0080\u009a\u0089´\u009fN\u009fh¼\u0002\u008dÜ\u0095ö\u0081\u0090\u0089ª\u0082D\u0098\u001e¨8\u008dÒ\u0098ì\u008d\u0086Â \u0098z\u009e\u0014\u008d.\u008fÈ\u0087âÝ¼¯V\u0083p\u0082\n\u009f$\u0098þ\u009e\u0098\u0099²\u008fL\u0098f\u0085\u0000\u0083Ú\u0082ô¨\u008e\u008d¨\u0098B\u008dÎ\u0095è\u0088\u0082\u0088¼´V\u0091p\u008c*\u009dÄµþ\u0097\u0098\u009c²\u008dl\u0094\u0006\u009d ÖÚ\u009bô\u0097®\u0096H\u008cb\u0099\u001c\u009b6\u008cÐ\u0094\u008a\u009d¤\u008b^\u008bx¨\u0012\u0099Ì\u0081æ\u0095\u0080\u009dº\u0096T\u008c\u000e¼(\u0099Â\u008cü\u0099\u0096Ö°\u008cj\u008a\u0004\u0099>\u009bØ\u0093òÊ¬»F\u0097`\u0096\u001a\u008b4\u008cî\u008a\u0088\u008d¢\u009b\\\u008cv\u0091\u0010\u0097Ê\u0096ä¼\u009e\u0099¸\u008cR\u0099\u001bx=eWeiY\u0083|¥aÿp\u0011X+zMqg`¹yÓpõ;\u000fv!z{{\u009da·tÉvãa\u0005y_pqf\u008bf\u00adEÇt\u0019l3xUpo{\u0081aÛQýt\u0017a)tC;ee¿gÑzëa\rp'vya\u0093pµqÏ\\áv;v]Ewg\u0089|£cÅt\u001fa1pK^mp\u0087lÙVóg\u0015a/VAz\u009bx½e×zé{\u0003p%{\u007fa\u0091fº-\u009c/ö<È*\"\u001e\u0004<^!°(\u008a'ì\"Æ+\u0018`r#T>®>\u0080\u0002Ú'<:\u0016+h\u0003B!¤*þ;Ð\"*+\f`f-¸!\u0092 ô:Î/ -z:\\\"¶+\u0088=â=Ä\u001e\u001e/p7J#¬+\u0086 Ø:2\n\u0014/n:@/\u009a`ü-Ö*(!\u0002\"d\u007f¾\u001c\u0090+ê\"Ì/&:x+R*´\n\u008e/à::/\u001c\u0002v+H ¢)\u0084:Þ&0\u0018\n|^ÌxÎ\u0012Ý,ËÆÿàÝºÀTÉnÆ\bÃ\"Êü\u0081\u0096Â°ßJßdã>ÆØÛòÊ\u008câ¦À@Ë\u001aÚ4ÃÎÊè\u0081\u0082Ì\\ÀvÁ\u0010Û*ÎÄÌ\u009eÛ¸ÃRÊlÜ\u0006Ü ÿúÎ\u0094Ö®ÂHÊbÁ<ÛÖëðÎ\u008aÛ¤Î~\u0081\u0018Ì2ÙÌÂæâ\u0080ÀZËtÊ\u000eÃ^ÌxÎ\u0012Ý,ËÆÿàÝºÀTÉnÆ\bÃ\"Êü\u0081\u0096Â°ßJßdã>ÆØÛòÊ\u008câ¦À@Ë\u001aÚ4ÃÎÊè\u0081\u0082Ì\\ÀvÁ\u0010Û*ÎÄÌ\u009eÛ¸ÃRÊlÜ\u0006Ü ÿúÎ\u0094Ö®ÂHÊbÁ<ÛÖëðÎ\u008aÛ¤Î~\u0081\u0018Æ2ÜÌûæÝ\u0080ÎZÁtÜ\u000eÆ(ÛÂü\u009cÚ¶ßPßjÀ\u0004ÝÞÛøÊ\u0092Ë¢\u0083\u0084\u0081î\u0092Ð\u0084:°\u001c\u0092F\u008f¨\u0086\u0092\u0089ô\u008cÞ\u0085\u0000Îj\u008dL\u0090¶\u0090\u0098¬Â\u0089$\u0094\u000e\u0085p\u00adZ\u008f¼\u0084æ\u0095È\u008c2\u0085\u0014Î~\u0083 \u008f\u008a\u008eì\u0094Ö\u00818\u0083b\u0094D\u008c®\u0085\u0090\u0093ú\u0093Ü°\u0006\u0081h\u0099R\u008d´\u0085\u009e\u008eÀ\u0094*¤\f\u0081v\u0094X\u0081\u0082Îä\u0089Î\u00930µ\u001a\u0093|¡¦\u0089\u0088\u0090ò\u00adÔ\u0081>\u0093`\u008bJ\u0089¬\u008e\u0096\u0087ø³\"\u0095\u0004\u0090n\u0090P\u008fº\u0092\u009c\u0094Æ\u0085(\u0084^ÌxÎ\u0012Ý,ËÆÿàÝºÀTÉnÆ\bÃ\"Êü\u0081\u0096Â°ßJßdã>ÆØÛòÊ\u008câ¦À@Ë\u001aÚ4ÃÎÊè\u0081\u0082Ì\\ÀvÁ\u0010Û*ÎÄÌ\u009eÛ¸ÃRÊlÜ\u0006Ü ÿúÎ\u0094Ö®ÂHÊbÁ<ÛÖëðÎ\u008aÛ¤Î~\u0081\u0018Ú2ÂÌËæè\u0080ÊZÁtÊ\u000eÝ(ÎÂÛ\u009cÆ¶ÀPÁ^ÌxÎ\u0012Ý,ËÆÿàÝºÀTÉnÆ\bÃ\"Êü\u0081\u0096Â°ßJßdã>ÆØÛòÊ\u008câ¦À@Ë\u001aÚ4ÃÎÊè\u0081\u0082Ì\\ÀvÁ\u0010Û*ÎÄÌ\u009eÛ¸ÃRÊlÜ\u0006Ü ÿúÎ\u0094Ö®ÂHÊbÁ<ÛÖëðÎ\u008aÛ¤Î~\u0081\u0018Û2ÝÌÎæÌ\u0080ÄZ\u009etì\u000eÀ(ÁÂÜ\u009cÛ¶ÝPÚjÌ\u0004ÛÞÆøÀ\u0092Á¬ëFÎ`Û:ÎãLÅN¯]\u0091K{\u007f]]\u0007@éIÓFµC\u009fJA\u0001+B\r_÷_Ùc\u0083Fe[OJ1b\u001b@ýK§Z\u0089CsJU\u0001?Lá@ËA\u00ad[\u0097NyL#[\u0005CïJÑ\\»\\\u009d\u007fGN)V\u0013BõJßA\u0081[kkMN7[\u0019NÃ\u0001¥[\u008f]qN[L=Dç\u001dÉl³@\u0095A\u007f\\![\u000b]íZ×L¹[cFE@/A\u0011kûNÝ[\u0087N\u000fU)WCD}R\u0097f±DëY\u0005P?_YZsS\u00ad\u0018Ç[áF\u001bF5zo_\u0089B£SÝ{÷Y\u0011RKCeZ\u009fS¹\u0018ÓU\rY'XAB{W\u0095UÏBéZ\u0003S=EWEqf«WÅOÿ[\u0019S3XmB\u0087r¡WÛBõW/\u0018IFcD\u009dY·BÑS\u000bU%B_SyR\u0093\u007fÍUçU\u0001f;DU_\u008f@©WÃBýS\u0017}1SkO\u0085u¿DÙBóu-YG[aF\u009bYµXïS\tX#B]E^\u009f^ÎxÁ\u0012Ë,ÝÆÀàÆºËT\u0081nÌ\bÀ\"ÁüÛ\u0096Ê°ÁJÛd\u0081>ìØÀòÁ\u008cÛ¦Ê@×\u001aÛ^ÈxÊ\u0012Û,îÆßàßºÃTÆnÌ\bÎ\"ÛüÆ\u0096À°ÁJædÁ>ÉØÀì/Ê  *\u009e<t!R'\b*æ`Ü-º!\u0090 N:$+\u0002 ø:Ö`\u008c>j#@`>\u000f\u0014>ò>¨\"\u0086'|-Z/0:î'Ä!¢ \u0098\u0007v ,(\n!^ÉxÃ\u0012Î,ÈÆÜ×Pñ\u001a\u009b\u000b¥\u001cOPi\u00163\u0011Ý\u0016ç\u000b\u0081P«\u0013u\u0013\u001f\u00149\u001bÃRí\u001b·\u001aQ\u001d{\n\u0005\u0018/\u0018É\u001e\u0093\u001d½\u0013G\u001aaQ\u000b\rÕ\u001cQÍwÐ\u001d\u0091#ÛÉÚïÝµÊ[ØaØ\u0007Þ-ÝóÓ\u0099Ú2Í".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1148);
        IccPrivateKeyCrtComponentsJson = cArr;
        getProfileVersion = 4694328985004832943L;
    }

    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
        return (java.lang.Object[]) valueOf(new java.lang.Object[]{context, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, 1703325907, -1703325906, i);
    }

    static void init$1() {
        $$d = new byte[]{75, -78, -116, -102};
        $$e = 43;
    }

    private com.payair.hce.setDsrpUmdSingleUseKey DigitizedCardProfile() {
        return (com.payair.hce.setDsrpUmdSingleUseKey) valueOf(new java.lang.Object[]{this}, 2057177312, -2057177312, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{18, 126, 13, 102, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = 227;
    }
}
