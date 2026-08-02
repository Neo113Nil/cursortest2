package com.payair.hce;

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
/* loaded from: classes10.dex */
public final class DeleteCardResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.DeleteCardResponseEncrypted[] AlternateContactlessPaymentDataJson;
    private static com.payair.hce.DeleteCardResponseEncrypted DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    public static final com.payair.hce.DeleteCardResponseEncrypted valueOf;
    private static com.payair.hce.DeleteCardResponseEncrypted values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = 1 - (b * 3);
        byte[] bArr = $$a;
        int i3 = 4 - (s * 3);
        int i4 = 110 - (b2 * 4);
        byte[] bArr2 = new byte[i2];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i4 = i2;
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i++;
            if (i == i2) {
            }
        }
    }

    private DeleteCardResponseEncrypted(java.lang.String str, int i) {
    }

    public static com.payair.hce.DeleteCardResponseEncrypted valueOf(java.lang.String str) {
        int i = getProfileVersion + 87;
        getAid = i % 128;
        com.payair.hce.DeleteCardResponseEncrypted deleteCardResponseEncrypted = (com.payair.hce.DeleteCardResponseEncrypted) java.lang.Enum.valueOf(com.payair.hce.DeleteCardResponseEncrypted.class, str);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getProfileVersion = (getAid + 5) % 128;
        return deleteCardResponseEncrypted;
    }

    public static com.payair.hce.DeleteCardResponseEncrypted[] values() {
        int i = getAid + 81;
        getProfileVersion = i % 128;
        com.payair.hce.DeleteCardResponseEncrypted[] deleteCardResponseEncryptedArr = AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return (com.payair.hce.DeleteCardResponseEncrypted[]) deleteCardResponseEncryptedArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        getAid = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue454贈\ue322\uf04d\uf30b洡Ŝ떑\ue3b2l웉ꏑ", android.view.KeyEvent.normalizeMetaState(0) + 12, objArr);
        com.payair.hce.DeleteCardResponseEncrypted deleteCardResponseEncrypted = new com.payair.hce.DeleteCardResponseEncrypted(((java.lang.String) objArr[0]).intern(), 0);
        valueOf = deleteCardResponseEncrypted;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\ud97e䋄퓙죝镟į疖玔\ueaf9뚽뛔솥䴝螈", 14 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        values = new com.payair.hce.DeleteCardResponseEncrypted(((java.lang.String) objArr2[0]).intern(), 1);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("욽퐘ṷ쮃얞⍾螓\udf22\u09d9⭜", 8 - android.view.MotionEvent.axisFromString(""), objArr3);
        com.payair.hce.DeleteCardResponseEncrypted deleteCardResponseEncrypted2 = new com.payair.hce.DeleteCardResponseEncrypted(((java.lang.String) objArr3[0]).intern(), 2);
        DigitizedCardProfile = deleteCardResponseEncrypted2;
        AlternateContactlessPaymentDataJson = new com.payair.hce.DeleteCardResponseEncrypted[]{deleteCardResponseEncrypted, values, deleteCardResponseEncrypted2};
        int i = getAid + 83;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 13) % 128;
            cArr = str.toCharArray();
            $11 = ($10 + 97) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 1335, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 61, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1335, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3543, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $10 = ($11 + 117) % 128;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117};
        $$b = 206;
    }

    static void valueOf() {
        writeReplace = (char) 54326;
        IccPrivateKeyCrtComponentsJson = (char) 1334;
        RecordsJson = (char) 10946;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 9270;
    }
}
