package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class getStatusCodeFromServer {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.getStatusCodeFromServer AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.getStatusCodeFromServer DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static final /* synthetic */ com.payair.hce.getStatusCodeFromServer[] valueOf;
    private static long writeReplace;
    private java.lang.String values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 * 3;
        int i5 = 3 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3 = i5;
            int i8 = i6;
            i5 += i8;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i8 = bArr[i3];
            i5 += i8;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
            }
        } else {
            i5 = 119 - (b * 2);
            i3 = i5;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
            }
        }
    }

    public static com.payair.hce.getStatusCodeFromServer valueOf(java.lang.String str) {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 73) % 128;
        com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = (com.payair.hce.getStatusCodeFromServer) java.lang.Enum.valueOf(com.payair.hce.getStatusCodeFromServer.class, str);
        int i = RecordsJson + 107;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return getstatuscodefromserver;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.getStatusCodeFromServer[] values() {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 85) % 128;
        com.payair.hce.getStatusCodeFromServer[] getstatuscodefromserverArr = (com.payair.hce.getStatusCodeFromServer[]) valueOf.clone();
        IccPrivateKeyCrtComponentsJson = (RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return getstatuscodefromserverArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("辐哩迆箪ﲓ෨", android.widget.ExpandableListView.getPackedPositionType(0L) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("馩ⱛ馘ƣ萾儅誧", -((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
        com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = new com.payair.hce.getStatusCodeFromServer(intern, 0, ((java.lang.String) objArr2[0]).intern());
        AlternateContactlessPaymentDataJson = getstatuscodefromserver;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("⭫筤⬽蓆팝䯰", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("똱ꎧ똃㻸ூ湞\uab1d", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr4);
        com.payair.hce.getStatusCodeFromServer getstatuscodefromserver2 = new com.payair.hce.getStatusCodeFromServer(intern2, 1, ((java.lang.String) objArr4[0]).intern());
        DigitizedCardProfile = getstatuscodefromserver2;
        valueOf = new com.payair.hce.getStatusCodeFromServer[]{getstatuscodefromserver, getstatuscodefromserver2};
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 9) % 128;
    }

    private getStatusCodeFromServer(java.lang.String str, int i, java.lang.String str2) {
        this.values = str2;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = IccPrivateKeyCrtComponentsJson + 115;
        int i2 = i % 128;
        RecordsJson = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.values;
        IccPrivateKeyCrtComponentsJson = (i2 + 89) % 128;
        return str;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 111) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(writeReplace ^ (-3824242241614154557L), charArray, i);
        int i2 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i2;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % i2]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 41, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1920, (char) android.view.View.resolveSize(0, 0));
                    byte b = (byte) ($$b & 5);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 428 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i2 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str2 = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
        int i4 = $10 + 29;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE;
    }

    static void valueOf() {
        writeReplace = 5777373727101607048L;
    }
}
