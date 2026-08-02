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
public final class clearInternalStorage {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.clearInternalStorage AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static final /* synthetic */ com.payair.hce.clearInternalStorage[] valueOf;
    public static final com.payair.hce.clearInternalStorage values;
    public static final com.payair.hce.clearInternalStorage writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = b * 2;
        int i3 = 119 - (s * 2);
        int i4 = (b2 * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i3;
            i3 = i2;
            i = 0;
            i3 += i5;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i4];
            i3 += i5;
            i4++;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i2) {
            }
        }
    }

    private clearInternalStorage(java.lang.String str, int i) {
    }

    public static com.payair.hce.clearInternalStorage valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 75) % 128;
        com.payair.hce.clearInternalStorage clearinternalstorage = (com.payair.hce.clearInternalStorage) java.lang.Enum.valueOf(com.payair.hce.clearInternalStorage.class, str);
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 93) % 128;
        return clearinternalstorage;
    }

    public static com.payair.hce.clearInternalStorage[] values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 15;
        getAid = i % 128;
        com.payair.hce.clearInternalStorage[] clearinternalstorageArr = valueOf;
        if (i % 2 != 0) {
            return (com.payair.hce.clearInternalStorage[]) clearinternalstorageArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("˜ʎ膡覥效쟻疌⎇ꢵ\udf70", android.text.TextUtils.indexOf("", "", 0) + 1, objArr);
        com.payair.hce.clearInternalStorage clearinternalstorage = new com.payair.hce.clearInternalStorage(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = clearinternalstorage;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("믉뮜櫔拜\ue5c1\uf50f䭞", 1 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
        com.payair.hce.clearInternalStorage clearinternalstorage2 = new com.payair.hce.clearInternalStorage(((java.lang.String) objArr2[0]).intern(), 1);
        values = clearinternalstorage2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("鬸魵쫿싾楮쵑", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr3);
        com.payair.hce.clearInternalStorage clearinternalstorage3 = new com.payair.hce.clearInternalStorage(((java.lang.String) objArr3[0]).intern(), 2);
        writeReplace = clearinternalstorage3;
        valueOf = new com.payair.hce.clearInternalStorage[]{clearinternalstorage, clearinternalstorage2, clearinternalstorage3};
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 109) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 109) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        $11 = ($10 + 3) % 128;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 75) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1920, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    byte b = (byte) ($$b & 5);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 429 - android.view.View.MeasureSpec.getMode(0), (char) (31611 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (byte) 0, objArr5);
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

    static void init$0() {
        $$a = new byte[]{70, -35, 111, 66};
        $$b = 19;
    }

    static void writeReplace() {
        DigitizedCardProfile = 840327197241146502L;
    }
}
