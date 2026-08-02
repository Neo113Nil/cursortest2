package com.payair.hce;

/* loaded from: classes10.dex */
public final class getPaymentAppProviderId implements com.payair.hce.setIccKek {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getProfileVersion;
    private static char[] valueOf;
    private static int writeReplace;
    private com.payair.hce.setStatus values = null;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getPaymentAppProviderId getpaymentappproviderid = (com.payair.hce.getPaymentAppProviderId) objArr[0];
        com.payair.hce.getContactlessUmdSingleUseKey getcontactlessumdsingleusekey = new com.payair.hce.getContactlessUmdSingleUseKey();
        com.payair.hce.setStatus setstatus = getpaymentappproviderid.values;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted}, 1109463870, -1109463869, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted));
        if (notifyProvisionResponseEncrypted == null) {
            getcontactlessumdsingleusekey.getAid = "";
            getcontactlessumdsingleusekey.writeReplace = "";
            getcontactlessumdsingleusekey.RecordsJson = "";
            getcontactlessumdsingleusekey.values = "";
            getcontactlessumdsingleusekey.valueOf = "";
            getcontactlessumdsingleusekey.AlternateContactlessPaymentDataJson = "";
            getcontactlessumdsingleusekey.SdkCoreAlternateContactlessPaymentDataImpl = "";
            getcontactlessumdsingleusekey.DigitizedCardProfile = "";
            return getcontactlessumdsingleusekey;
        }
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 121) % 128;
        getcontactlessumdsingleusekey.getAid = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -278058035, 278058049, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        getcontactlessumdsingleusekey.writeReplace = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -1761789453, 1761789453, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        getcontactlessumdsingleusekey.RecordsJson = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, 1428191881, -1428191872, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        getcontactlessumdsingleusekey.values = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -1279486589, 1279486596, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        getcontactlessumdsingleusekey.valueOf = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -931277398, 931277413, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        getcontactlessumdsingleusekey.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -312516605, 312516618, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        getcontactlessumdsingleusekey.SdkCoreAlternateContactlessPaymentDataImpl = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -212957071, 212957082, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        getcontactlessumdsingleusekey.DigitizedCardProfile = (java.lang.String) com.payair.hce.NotifyProvisionResponseEncrypted.DigitizedCardProfile(new java.lang.Object[]{notifyProvisionResponseEncrypted}, -1696219132, 1696219144, java.lang.System.identityHashCode(notifyProvisionResponseEncrypted));
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 117) % 128;
        return getcontactlessumdsingleusekey;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 2;
        int i4 = s2 + 4;
        int i5 = (i * 2) + 99;
        byte[] bArr2 = new byte[34 - i3];
        int i6 = 33 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i6;
            i5 = (-i5) + i9;
            i4 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i4 + 1;
            int i11 = bArr[i10];
            i9 = i5;
            i5 = i11;
            i7 = i10;
            i5 = (-i5) + i9;
            i4 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 118 - (i * 4);
        int i4 = b * 3;
        int i5 = b2 + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 += i5;
            i5 = i6;
            i2 = i7;
            int i8 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i8;
            i5 = bArr[i8];
            i3 += i5;
            i5 = i6;
            i2 = i7;
            int i82 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == 0 - i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == 0 - i4) {
            }
        }
    }

    @Override // com.payair.hce.setIccKek
    public final java.lang.String valueOf(com.payair.hce.setStatus setstatus) {
        this.values = setstatus;
        com.payair.hce.SetMobilePinRequestEncrypted setMobilePinRequestEncrypted = new com.payair.hce.SetMobilePinRequestEncrypted();
        setMobilePinRequestEncrypted.SdkCoreAlternateContactlessPaymentDataImpl = AlternateContactlessPaymentDataJson();
        com.payair.hce.setStatus setstatus2 = this.values;
        setMobilePinRequestEncrypted.DigitizedCardProfile = ((java.lang.Boolean) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus2}, -1056070073, 1056070077, java.lang.System.identityHashCode(setstatus2))).booleanValue();
        com.payair.hce.setStatus setstatus3 = this.values;
        setMobilePinRequestEncrypted.writeReplace = ((java.lang.Boolean) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus3}, 138618745, -138618743, java.lang.System.identityHashCode(setstatus3))).booleanValue();
        com.payair.hce.setStatus setstatus4 = this.values;
        setMobilePinRequestEncrypted.getProfileVersion = (java.lang.String) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus4}, -230306547, 230306558, java.lang.System.identityHashCode(setstatus4));
        setMobilePinRequestEncrypted.valueOf = "";
        setMobilePinRequestEncrypted.values = "";
        setMobilePinRequestEncrypted.AlternateContactlessPaymentDataJson = writeReplace();
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127 - android.text.TextUtils.indexOf("", "", 0), null, null, "\u0086\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(setMobilePinRequestEncrypted);
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 105) % 128;
        return DigitizedCardProfile2;
    }

    private com.payair.hce.TransactionCredential AlternateContactlessPaymentDataJson() {
        java.lang.String upperCase;
        com.payair.hce.TransactionCredential transactionCredential = new com.payair.hce.TransactionCredential();
        com.payair.hce.setPaymentAppInstanceId setpaymentappinstanceid = new com.payair.hce.setPaymentAppInstanceId();
        com.payair.hce.setStatus setstatus = this.values;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted}, -1773827389, 1773827397, java.lang.System.identityHashCode(deleteCardRequestEncrypted));
        setpaymentappinstanceid.values = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, -994099733, 994099733, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setpaymentappinstanceid.writeReplace = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 944639813, -944639800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setpaymentappinstanceid.IccPrivateKeyCrtComponentsJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, -823562565, 823562575, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setpaymentappinstanceid.DigitizedCardProfile = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, -1220726242, 1220726250, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setpaymentappinstanceid.valueOf = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 528678814, -528678800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setpaymentappinstanceid.RecordsJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 233240415, -233240409, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setpaymentappinstanceid.getProfileVersion = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 1418409609, -1418409605, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        setpaymentappinstanceid.AlternateContactlessPaymentDataJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted}, 95577821, -95577816, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted))).booleanValue();
        transactionCredential.getAid = setpaymentappinstanceid;
        com.payair.hce.setPaymentAppInstanceId setpaymentappinstanceid2 = new com.payair.hce.setPaymentAppInstanceId();
        com.payair.hce.setStatus setstatus2 = this.values;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted2 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus2}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus2));
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted2 = (com.payair.hce.NotifyProvisionRequestEncrypted) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted2}, -1773827389, 1773827397, java.lang.System.identityHashCode(deleteCardRequestEncrypted2));
        setpaymentappinstanceid2.values = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, -994099733, 994099733, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setpaymentappinstanceid2.writeReplace = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 944639813, -944639800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setpaymentappinstanceid2.IccPrivateKeyCrtComponentsJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, -823562565, 823562575, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setpaymentappinstanceid2.DigitizedCardProfile = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, -1220726242, 1220726250, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setpaymentappinstanceid2.valueOf = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 528678814, -528678800, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setpaymentappinstanceid2.RecordsJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 233240415, -233240409, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setpaymentappinstanceid2.getProfileVersion = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 1418409609, -1418409605, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        setpaymentappinstanceid2.AlternateContactlessPaymentDataJson = ((java.lang.Boolean) com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2}, 95577821, -95577816, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2))).booleanValue();
        transactionCredential.AlternateContactlessPaymentDataJson = setpaymentappinstanceid2;
        com.payair.hce.setStatus setstatus3 = this.values;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted3 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus3}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus3));
        java.lang.String str = (java.lang.String) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted3}, -608653999, 608654006, java.lang.System.identityHashCode(deleteCardRequestEncrypted3));
        if (str != null) {
            upperCase = str.toUpperCase();
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 25) % 128;
        } else {
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 23) % 128;
            upperCase = "";
        }
        transactionCredential.valueOf = upperCase;
        com.payair.hce.setStatus setstatus4 = this.values;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted4 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus4}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus4));
        transactionCredential.getProfileVersion = ((java.lang.Integer) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted4}, 1807702463, -1807702461, java.lang.System.identityHashCode(deleteCardRequestEncrypted4))).intValue();
        com.payair.hce.setStatus setstatus5 = this.values;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted5 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus5}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus5));
        transactionCredential.DigitizedCardProfile = ((java.lang.Integer) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted5}, 2038443170, -2038443170, java.lang.System.identityHashCode(deleteCardRequestEncrypted5))).intValue();
        com.payair.hce.setStatus setstatus6 = this.values;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted6 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus6}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus6));
        transactionCredential.values = (java.lang.String) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted6}, -222679591, 222679592, java.lang.System.identityHashCode(deleteCardRequestEncrypted6));
        com.payair.hce.SetMobilePinResponseEncrypted setMobilePinResponseEncrypted = new com.payair.hce.SetMobilePinResponseEncrypted();
        com.payair.hce.setStatus setstatus7 = this.values;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted7 = (com.payair.hce.DeleteCardRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus7}, -141514679, 141514689, java.lang.System.identityHashCode(setstatus7));
        setMobilePinResponseEncrypted.AlternateContactlessPaymentDataJson = ((com.payair.hce.setIsRedigitization) com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted7}, -1278248481, 1278248484, java.lang.System.identityHashCode(deleteCardRequestEncrypted7))).AlternateContactlessPaymentDataJson();
        transactionCredential.writeReplace = setMobilePinResponseEncrypted;
        return transactionCredential;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        int length;
        char[] cArr2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = valueOf;
        long j = 0;
        if (cArr3 != null) {
            int i2 = $10 + 9;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 46, android.widget.ExpandableListView.getPackedPositionChild(j) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (46338 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 46, 286 - android.text.TextUtils.getOffsetAfter("", 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46336))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (AlternateContactlessPaymentDataJson) {
            int i4 = $10 + 57;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                getumdgeneration.values = bArr2.length;
                cArr = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 1;
            } else {
                getumdgeneration.values = bArr2.length;
                cArr = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
            }
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 111) % 128;
                cArr[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 43, 1629 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((byte) 0, 0, (byte) -1, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr);
            return;
        }
        if (!DigitizedCardProfile) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr3[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 43, 1629 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((byte) 0, 0, (byte) -1, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private com.payair.hce.setContactlessMdSessionKey writeReplace() {
        com.payair.hce.setContactlessMdSessionKey setcontactlessmdsessionkey = new com.payair.hce.setContactlessMdSessionKey();
        setcontactlessmdsessionkey.valueOf = values();
        setcontactlessmdsessionkey.AlternateContactlessPaymentDataJson = DigitizedCardProfile();
        setcontactlessmdsessionkey.DigitizedCardProfile = (com.payair.hce.getContactlessUmdSingleUseKey) DigitizedCardProfile(new java.lang.Object[]{this}, -1032188241, 1032188241, java.lang.System.identityHashCode(this));
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 77) % 128;
        return setcontactlessmdsessionkey;
    }

    private com.payair.hce.setTransactionCredentials values() {
        com.payair.hce.setTransactionCredentials settransactioncredentials = new com.payair.hce.setTransactionCredentials();
        com.payair.hce.setStatus setstatus = this.values;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus));
        settransactioncredentials.values = ((com.payair.hce.getTransactionCredentialsStatus) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted}, 1973004519, -1973004516, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted))).AlternateContactlessPaymentDataJson();
        com.payair.hce.setStatus setstatus2 = this.values;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted2 = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus2}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus2));
        settransactioncredentials.DigitizedCardProfile = ((com.payair.hce.getTransactionCredentialsStatus) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted2}, 1973004519, -1973004516, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted2))).values();
        int i = IccPrivateKeyCrtComponentsJson + 43;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return settransactioncredentials;
        }
        throw null;
    }

    private com.payair.hce.getContactlessMdSessionKey DigitizedCardProfile() {
        com.payair.hce.getContactlessMdSessionKey getcontactlessmdsessionkey = new com.payair.hce.getContactlessMdSessionKey();
        com.payair.hce.setStatus setstatus = this.values;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus}, -282851225, 282851230, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setTransactionCredentialsStatus settransactioncredentialsstatus = (com.payair.hce.setTransactionCredentialsStatus) com.payair.hce.GetTaskStatusRequestEncrypted.writeReplace(new java.lang.Object[]{getTaskStatusRequestEncrypted}, 1726673286, -1726673281, java.lang.System.identityHashCode(getTaskStatusRequestEncrypted));
        getcontactlessmdsessionkey.getCvrMaskAnd = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 714263624, -714263622, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.valueOf = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -2141780035, 2141780053, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.RecordsJson = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1897930046, 1897930056, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.IccPrivateKeyCrtComponentsJson = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 251374181, -251374176, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.DigitizedCardProfile = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 2040522844, -2040522823, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.AlternateContactlessPaymentDataJson = ((java.lang.Integer) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 743878840, -743878815, java.lang.System.identityHashCode(settransactioncredentialsstatus))).intValue();
        getcontactlessmdsessionkey.writeReplace = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1646687107, 1646687120, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.getPaymentFci = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1158959258, 1158959270, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.values = (java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted}, -1712050221, 1712050222, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted2 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.getGpoResponse = (java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted2}, -1469688320, 1469688326, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted2));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted3 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.getAid = (java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted3}, 1058599604, -1058599595, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted3));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted4 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.getDualTapResetTimeout = (java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted4}, 1784820981, -1784820979, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted4));
        com.payair.hce.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted5 = (com.payair.hce.GetTaskStatusResponseEncrypted) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 944687884, -944687860, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.SdkCoreBusinessLogicModuleImpl = (java.lang.String) com.payair.hce.GetTaskStatusResponseEncrypted.values(new java.lang.Object[]{getTaskStatusResponseEncrypted5}, -1126059056, 1126059056, java.lang.System.identityHashCode(getTaskStatusResponseEncrypted5));
        getcontactlessmdsessionkey.getProfileVersion = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1437442796, 1437442805, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        getcontactlessmdsessionkey.getCiacDecline = (java.lang.String) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 1178558104, -1178558101, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        int i = -1609363548;
        int i2 = 1609363555;
        int length = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1609363548, 1609363555, java.lang.System.identityHashCode(settransactioncredentialsstatus))).length;
        byte[] bArr = $$a;
        byte b = bArr[30];
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(b, b, (byte) (-bArr[23]), objArr);
        com.payair.hce.setDsrpMdSessionKey[] setdsrpmdsessionkeyArr = (com.payair.hce.setDsrpMdSessionKey[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr[0]), length);
        int i3 = 0;
        while (i3 < length) {
            setdsrpmdsessionkeyArr[i3] = new com.payair.hce.setDsrpMdSessionKey();
            com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, i, i2, java.lang.System.identityHashCode(settransactioncredentialsstatus)))[i3];
            java.lang.String upperCase = java.lang.Integer.toHexString((((java.lang.Byte) com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted}, -5385263, 5385266, java.lang.System.identityHashCode(provisionRequestEncrypted))).byteValue() << 3) + 4).toUpperCase();
            com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted2 = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, i, i2, java.lang.System.identityHashCode(settransactioncredentialsstatus)))[i3];
            java.lang.String upperCase2 = java.lang.Integer.toHexString(((java.lang.Byte) com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted2}, -2006065438, 2006065439, java.lang.System.identityHashCode(provisionRequestEncrypted2))).byteValue()).toUpperCase();
            com.payair.hce.setDsrpMdSessionKey setdsrpmdsessionkey = setdsrpmdsessionkeyArr[i3];
            if (upperCase2.length() % 2 == 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(126 - android.graphics.ImageFormat.getBitsPerPixel(0), null, null, "\u0087", objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(upperCase2);
                upperCase2 = sb.toString();
            }
            setdsrpmdsessionkey.AlternateContactlessPaymentDataJson = upperCase2;
            com.payair.hce.setDsrpMdSessionKey setdsrpmdsessionkey2 = setdsrpmdsessionkeyArr[i3];
            if (upperCase.length() % 2 == 1) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, null, null, "\u0087", objArr3);
                sb2.append(((java.lang.String) objArr3[0]).intern());
                sb2.append(upperCase);
                upperCase = sb2.toString();
            }
            setdsrpmdsessionkey2.writeReplace = upperCase;
            com.payair.hce.setDsrpMdSessionKey setdsrpmdsessionkey3 = setdsrpmdsessionkeyArr[i3];
            com.payair.hce.ProvisionRequestEncrypted provisionRequestEncrypted3 = ((com.payair.hce.ProvisionRequestEncrypted[]) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, -1609363548, 1609363555, java.lang.System.identityHashCode(settransactioncredentialsstatus)))[i3];
            setdsrpmdsessionkey3.DigitizedCardProfile = (java.lang.String) com.payair.hce.ProvisionRequestEncrypted.values(new java.lang.Object[]{provisionRequestEncrypted3}, 1093327563, -1093327559, java.lang.System.identityHashCode(provisionRequestEncrypted3));
            i3++;
            i = -1609363548;
            i2 = 1609363555;
        }
        getcontactlessmdsessionkey.getCardLayoutDescription = setdsrpmdsessionkeyArr;
        com.payair.hce.RequestSessionRequest requestSessionRequest = new com.payair.hce.RequestSessionRequest();
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) com.payair.hce.setTransactionCredentialsStatus.values(new java.lang.Object[]{settransactioncredentialsstatus}, 481095094, -481095075, java.lang.System.identityHashCode(settransactioncredentialsstatus));
        if (getvalidforseconds == null) {
            getcontactlessmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = null;
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 71) % 128;
        } else {
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 43) % 128;
            requestSessionRequest.AlternateContactlessPaymentDataJson = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, -1194271620, 1194271620, java.lang.System.identityHashCode(getvalidforseconds));
            requestSessionRequest.values = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, 785315415, -785315409, java.lang.System.identityHashCode(getvalidforseconds));
            requestSessionRequest.DigitizedCardProfile = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, -1924062730, 1924062731, java.lang.System.identityHashCode(getvalidforseconds));
            requestSessionRequest.writeReplace = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, 1762342771, -1762342769, java.lang.System.identityHashCode(getvalidforseconds));
            requestSessionRequest.valueOf = (java.lang.String) com.payair.hce.getValidForSeconds.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getvalidforseconds}, -1523518471, 1523518476, java.lang.System.identityHashCode(getvalidforseconds));
            getcontactlessmdsessionkey.SdkCoreAlternateContactlessPaymentDataImpl = requestSessionRequest;
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 99) % 128;
        }
        return getcontactlessmdsessionkey;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        valueOf = new char[]{10904, 10908, 11075, 11098, 11073, 11091, 10910};
        writeReplace = -143185234;
        DigitizedCardProfile = true;
        AlternateContactlessPaymentDataJson = true;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$e = 37;
    }

    static void init$0() {
        $$a = new byte[]{92, 89, -124, 123, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, 48, -47, 1, 2, 35, -23, 17, -18, -14, 0, 10, -6, 1, 35, -26, -20};
        $$b = 227;
    }

    private com.payair.hce.getContactlessUmdSingleUseKey valueOf() {
        return (com.payair.hce.getContactlessUmdSingleUseKey) DigitizedCardProfile(new java.lang.Object[]{this}, -1032188241, 1032188241, java.lang.System.identityHashCode(this));
    }
}
