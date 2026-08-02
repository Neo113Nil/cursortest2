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
/* loaded from: classes4.dex */
public final class getMDESCardsUniqueTokenReferences {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.getMDESCardsUniqueTokenReferences AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.getMDESCardsUniqueTokenReferences DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static final /* synthetic */ com.payair.hce.getMDESCardsUniqueTokenReferences[] RecordsJson;
    private static int getAid;
    private static int getProfileVersion;
    public static final com.payair.hce.getMDESCardsUniqueTokenReferences valueOf;
    public static final com.payair.hce.getMDESCardsUniqueTokenReferences values;
    public static final com.payair.hce.getMDESCardsUniqueTokenReferences writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = s * 3;
        int i5 = 115 - (i * 4);
        byte[] bArr = $$a;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5 += i6;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            int i9 = i6 + 1;
            if (i3 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b = bArr[i9];
            i6 = i5;
            i5 = b;
            i8 = i3 + 1;
            i7 = i9;
            i5 += i6;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            int i92 = i6 + 1;
            if (i3 == 0 - i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            int i922 = i6 + 1;
            if (i3 == 0 - i4) {
            }
        }
    }

    private getMDESCardsUniqueTokenReferences(java.lang.String str, int i) {
    }

    public static com.payair.hce.getMDESCardsUniqueTokenReferences valueOf(java.lang.String str) {
        int i = getAid + 35;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences = (com.payair.hce.getMDESCardsUniqueTokenReferences) java.lang.Enum.valueOf(com.payair.hce.getMDESCardsUniqueTokenReferences.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getAid + 35;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return getmdescardsuniquetokenreferences;
        }
        throw null;
    }

    public static com.payair.hce.getMDESCardsUniqueTokenReferences[] values() {
        IccPrivateKeyCrtComponentsJson = (getAid + 95) % 128;
        com.payair.hce.getMDESCardsUniqueTokenReferences[] getmdescardsuniquetokenreferencesArr = (com.payair.hce.getMDESCardsUniqueTokenReferences[]) RecordsJson.clone();
        getAid = (IccPrivateKeyCrtComponentsJson + 105) % 128;
        return getmdescardsuniquetokenreferencesArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(16 - android.graphics.Color.argb(0, 0, 0, 0), false, "\u0002\u0001\uffff￼\u0001\ufff8\ufff4\b\u0007\ufffb\u0002\u0005￼\r\ufff8\u0012", 203 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 6 - android.graphics.Color.argb(0, 0, 0, 0), objArr);
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences = new com.payair.hce.getMDESCardsUniqueTokenReferences(((java.lang.String) objArr[0]).intern(), 0);
        valueOf = getmdescardsuniquetokenreferences;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.view.View.combineMeasuredStates(0, 0) + 20, false, "\u0001\ufffe\u0003\ufffa\ufff6\n\t�\ufffa\u0003\t\ufffe\ufff8\ufff6\t\ufffa\u0014\u0004\ufffb\ufffb", 201 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences2 = new com.payair.hce.getMDESCardsUniqueTokenReferences(((java.lang.String) objArr2[0]).intern(), 1);
        AlternateContactlessPaymentDataJson = getmdescardsuniquetokenreferences2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.os.Process.myTid() >> 22) + 19, false, "\b\ufff9\u0006\u0001�\u0002\ufff5\u0000\ufff8\ufff9\ufff7\u0000�\u0002\ufff9\u0013\ufff6\r\u0013", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 202, 7 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr3);
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences3 = new com.payair.hce.getMDESCardsUniqueTokenReferences(((java.lang.String) objArr3[0]).intern(), 2);
        DigitizedCardProfile = getmdescardsuniquetokenreferences3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, true, "\ufff6\ufff8\u0014\u000e\ufff7\u0014\ufffa\u0003\ufffe\u0001\ufff8\ufffa\ufff9\ufff9\u0007", android.graphics.Color.alpha(0) + 201, 13 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr4);
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences4 = new com.payair.hce.getMDESCardsUniqueTokenReferences(((java.lang.String) objArr4[0]).intern(), 3);
        writeReplace = getmdescardsuniquetokenreferences4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.getSize(0) + 22, false, "\ufff8\u0004\b￼\u0005\ufff8\ufff7\n\ufff4\uffff\uffff\ufff8\u0007\u0012\ufff4\ufff6\u0007￼\u0002\u0001\u0012\u0005", android.graphics.Color.blue(0) + 203, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7, objArr5);
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences5 = new com.payair.hce.getMDESCardsUniqueTokenReferences(((java.lang.String) objArr5[0]).intern(), 4);
        values = getmdescardsuniquetokenreferences5;
        RecordsJson = new com.payair.hce.getMDESCardsUniqueTokenReferences[]{getmdescardsuniquetokenreferences, getmdescardsuniquetokenreferences2, getmdescardsuniquetokenreferences3, getmdescardsuniquetokenreferences4, getmdescardsuniquetokenreferences5};
        IccPrivateKeyCrtComponentsJson = (getAid + 75) % 128;
    }

    private static void a(int i, boolean z, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 7) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i) {
            $11 = ($10 + 7) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i2 + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(getProfileVersion)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 44, 2074 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (60036 - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, 0, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 3543 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
        if (i3 > 0) {
            $11 = ($10 + 101) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr4 = new char[i];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i) {
                $11 = ($10 + 89) % 128;
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3543 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void AlternateContactlessPaymentDataJson() {
        getProfileVersion = 1889207071;
    }

    static void init$0() {
        $$a = new byte[]{114, 106, 82, com.google.common.base.Ascii.SYN};
        $$b = 103;
    }
}
