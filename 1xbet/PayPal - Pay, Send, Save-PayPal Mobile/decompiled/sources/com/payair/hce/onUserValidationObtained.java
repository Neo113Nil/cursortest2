package com.payair.hce;

/* loaded from: classes4.dex */
public final class onUserValidationObtained {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int values;
    private static long writeReplace;
    private boolean DigitizedCardProfile;
    private com.payair.hce.setPinIvCvc3Track2 valueOf = com.payair.hce.setMaximumPinTry.valueOf();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = b * 4;
        byte[] bArr = $$a;
        int i4 = 119 - (i * 2);
        int i5 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i2++;
            i4 += -i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public onUserValidationObtained(boolean z) {
        this.DigitizedCardProfile = z;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 57) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(writeReplace ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 71) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, 1920 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                    byte b = (byte) $$b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b, (byte) (b + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 27, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 429, (char) (31610 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    byte b2 = (byte) $$b;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b2, b2, b2, objArr5);
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

    public final com.payair.hce.transactionCanBeResumed DigitizedCardProfile(com.payair.hce.getCodeCacheDir getcodecachedir, com.payair.hce.onSdkUnregistered onsdkunregistered, com.payair.hce.getCacheDir getcachedir, com.payair.hce.getCacheDir getcachedir2, com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.transactionCanBeResumed transactioncanberesumed3, boolean z) {
        if (this.DigitizedCardProfile) {
            try {
                java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> values2 = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir))).valueOf((byte) 1, (byte) 1).values();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\udc82\ud821绔\udcb7⋰옺", 1 - android.graphics.Color.blue(0), objArr);
                com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson2 = values2.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern())).AlternateContactlessPaymentDataJson();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("\uaada뭲毈ꫣ䇓ｃ鸰ྴ", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                try {
                    com.payair.hce.onCardProvisionCompleted oncardprovisioncompleted = new com.payair.hce.onCardProvisionCompleted(AlternateContactlessPaymentDataJson2, getcachedir, values2.get(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern())).AlternateContactlessPaymentDataJson(), getcachedir2, transactioncanberesumed, transactioncanberesumed2, transactioncanberesumed3, z);
                    byte[] valueOf = oncardprovisioncompleted.DigitizedCardProfile().valueOf();
                    byte[] valueOf2 = ((com.payair.hce.transactionCanBeResumed) com.payair.hce.onCardProvisionCompleted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{oncardprovisioncompleted}, -1521228294, 1521228295, java.lang.System.identityHashCode(oncardprovisioncompleted))).valueOf();
                    byte[] DigitizedCardProfile = onsdkunregistered.DigitizedCardProfile(valueOf);
                    byte[] DigitizedCardProfile2 = onsdkunregistered.DigitizedCardProfile(valueOf2);
                    byte[] bArr = new byte[32];
                    java.lang.System.arraycopy(DigitizedCardProfile, DigitizedCardProfile.length - 16, bArr, 0, 16);
                    java.lang.System.arraycopy(DigitizedCardProfile2, DigitizedCardProfile2.length - 16, bArr, 16, 16);
                    com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson3 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr);
                    values = (AlternateContactlessPaymentDataJson + 33) % 128;
                    return AlternateContactlessPaymentDataJson3;
                } catch (java.lang.RuntimeException unused) {
                    android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                    return com.payair.hce.transactionCanBeResumed.writeReplace(0);
                }
            } catch (com.payair.hce.getCurrentRequestId unused2) {
                android.view.ViewConfiguration.getTapTimeout();
                return com.payair.hce.transactionCanBeResumed.writeReplace(0);
            }
        }
        int i = values + 73;
        AlternateContactlessPaymentDataJson = i % 128;
        return i % 2 == 0 ? com.payair.hce.transactionCanBeResumed.writeReplace(0) : com.payair.hce.transactionCanBeResumed.writeReplace(0);
    }

    public final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson(com.payair.hce.onSdkUnregistered onsdkunregistered, com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.transactionCanBeResumed transactioncanberesumed3) {
        int i = AlternateContactlessPaymentDataJson + 61;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (!this.DigitizedCardProfile) {
            com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.transactionCanBeResumed.writeReplace(0);
            AlternateContactlessPaymentDataJson = (values + 103) % 128;
            return writeReplace2;
        }
        try {
            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson2 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(onsdkunregistered.DigitizedCardProfile(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(DigitizedCardProfile(transactioncanberesumed)).writeReplace(transactioncanberesumed2).writeReplace(transactioncanberesumed3).valueOf()));
            AlternateContactlessPaymentDataJson = (values + 57) % 128;
            return AlternateContactlessPaymentDataJson2;
        } catch (java.lang.RuntimeException unused) {
            android.os.Process.getElapsedCpuTime();
            return com.payair.hce.transactionCanBeResumed.writeReplace(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if ((r7.length() % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if ((r7.length() >> 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(r7);
        r1 = new java.lang.Object[1];
        a("ꂩ\ueba0셇ꃯ띂", 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), r1);
        r0.append(((java.lang.String) r1[0]).intern());
        r7 = r0.toString();
        com.payair.hce.onUserValidationObtained.AlternateContactlessPaymentDataJson = (com.payair.hce.onUserValidationObtained.values + 93) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] DigitizedCardProfile(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        java.lang.String replaceAll;
        int i = values + 7;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            java.lang.String writeReplace2 = transactioncanberesumed.writeReplace();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("ꂩ\ueba0셇ꃯ띂", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
            replaceAll = writeReplace2.replaceAll(((java.lang.String) objArr[0]).intern(), "");
        } else {
            java.lang.String writeReplace3 = transactioncanberesumed.writeReplace();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("ꂩ\ueba0셇ꃯ띂", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
            replaceAll = writeReplace3.replaceAll(((java.lang.String) objArr2[0]).intern(), "");
        }
        return com.payair.hce.transactionCanBeResumed.values(replaceAll).valueOf();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = -1327895200984756700L;
    }

    static void init$0() {
        $$a = new byte[]{98, -72, 105, -100};
        $$b = 0;
    }
}
