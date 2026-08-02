package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'writeReplace' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class resetAuthenticationReferences {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.resetAuthenticationReferences AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.resetAuthenticationReferences DigitizedCardProfile;
    private static final /* synthetic */ com.payair.hce.resetAuthenticationReferences[] IccPrivateKeyCrtComponentsJson;
    public static final com.payair.hce.resetAuthenticationReferences RecordsJson;
    public static final com.payair.hce.resetAuthenticationReferences SdkCoreAlternateContactlessPaymentDataImpl;
    public static final com.payair.hce.resetAuthenticationReferences getAid;
    private static int getCiacDecline;
    private static int[] getGpoResponse;
    private static int getPaymentFci;
    public static final com.payair.hce.resetAuthenticationReferences getProfileVersion;
    public static final com.payair.hce.resetAuthenticationReferences valueOf;
    public static final com.payair.hce.resetAuthenticationReferences values;
    public static final com.payair.hce.resetAuthenticationReferences writeReplace;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 5 - (s * 3);
        int i4 = s2 * 4;
        ?? r8 = 66 - (s3 * 3);
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            byte b = r8;
            i = 0;
            i2 = i3;
            i3 += b;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            b = bArr[i2];
            i3 += b;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == 0 - i4) {
            }
        } else {
            i = 0;
            i2 = i3;
            i3 = r8;
            bArr2[i] = (byte) i3;
            if (i == 0 - i4) {
            }
        }
    }

    private resetAuthenticationReferences(java.lang.String str, int i) {
    }

    public static com.payair.hce.resetAuthenticationReferences valueOf(java.lang.String str) {
        getPaymentFci = (getCiacDecline + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences = (com.payair.hce.resetAuthenticationReferences) java.lang.Enum.valueOf(com.payair.hce.resetAuthenticationReferences.class, str);
        getCiacDecline = (getPaymentFci + 107) % 128;
        return resetauthenticationreferences;
    }

    public static com.payair.hce.resetAuthenticationReferences[] values() {
        int i = getPaymentFci + 97;
        getCiacDecline = i % 128;
        com.payair.hce.resetAuthenticationReferences[] resetauthenticationreferencesArr = IccPrivateKeyCrtComponentsJson;
        if (i % 2 != 0) {
            return (com.payair.hce.resetAuthenticationReferences[]) resetauthenticationreferencesArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        getCiacDecline = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{1888511467, -1930042716, -1614042116, 670698981, -1004014557, 1524534218, -1112988503, 1503743003, 350339797, 1859442550}, 20 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = resetauthenticationreferences;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{-1263774775, -1295967310, 1228217562, 61028184, 1960916713, -73729621, -1004014557, 1524534218, 658823770, 157243630, -1176652451, 1386634382, -476262868, 1701565216, 564101392, 454059683, 1206572495, 737957207, 984485952, -603041982}, 40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences2 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = resetauthenticationreferences2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{-1263774775, -1295967310, 1228217562, 61028184, 1960916713, -73729621, -1004014557, 1524534218, 1344866887, -1897380038, 1550618379, 651285295, -1400437488, 1454921888}, 25 - android.text.TextUtils.getOffsetBefore("", 0), objArr3);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences3 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr3[0]).intern(), 2);
        DigitizedCardProfile = resetauthenticationreferences3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{1673847133, 680337086, -1480939671, -1365755784, 1151206672, 1912127332, -864320672, 825117318, 1726998983, 1402179057}, 18 - android.graphics.Color.alpha(0), objArr4);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences4 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr4[0]).intern(), 3);
        values = resetauthenticationreferences4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{1673847133, 680337086, -1480939671, -1365755784, 1151206672, 1912127332, 1672532757, -1890643475, -209939077, 599333006, 568846799, -1519682297, 1654444227, -1729149799, 1157969693, 371086731}, 31 - android.view.KeyEvent.keyCodeFromString(""), objArr5);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences5 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr5[0]).intern(), 4);
        AlternateContactlessPaymentDataJson = resetauthenticationreferences5;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(new int[]{-510869715, 1957269812, 426011532, 933015509, 1502383638, -1004448656, 186499077, -145482792}, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, objArr6);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences6 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr6[0]).intern(), 5);
        getAid = resetauthenticationreferences6;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(new int[]{-510869715, 1957269812, 426011532, 933015509, -1303701327, 1112216438, -1279254918, -1381275262}, (android.os.Process.myPid() >> 22) + 15, objArr7);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences7 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr7[0]).intern(), 6);
        SdkCoreAlternateContactlessPaymentDataImpl = resetauthenticationreferences7;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{151017211, 1121926660, -1782261938, 301029474, -287287976, 540312347, 324328781, -1150436942, 1165859182, 1407300438, 747805544, 813332307, 1796037787, 373004425, -1294818504, -201752010, -1264690370, 1471438008}, 34 - android.view.KeyEvent.getDeadChar(0, 0), objArr8);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences8 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr8[0]).intern(), 7);
        RecordsJson = resetauthenticationreferences8;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a(new int[]{1610912365, -1895296455, 574516336, -1458280744, 671179864, 1850745142, 151017211, 1121926660, -414388933, 609321022}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 19, objArr9);
        com.payair.hce.resetAuthenticationReferences resetauthenticationreferences9 = new com.payair.hce.resetAuthenticationReferences(((java.lang.String) objArr9[0]).intern(), 8);
        getProfileVersion = resetauthenticationreferences9;
        IccPrivateKeyCrtComponentsJson = new com.payair.hce.resetAuthenticationReferences[]{resetauthenticationreferences, resetauthenticationreferences2, resetauthenticationreferences3, resetauthenticationreferences4, resetauthenticationreferences5, resetauthenticationreferences6, resetauthenticationreferences7, resetauthenticationreferences8, resetauthenticationreferences9};
        getCiacDecline = (getPaymentFci + 31) % 128;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getGpoResponse;
        int i3 = 16;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getFadingEdgeLength() >> i3), 28 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 121;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 16;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getGpoResponse;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i4];
                objArr3[i5] = java.lang.Integer.valueOf(iArr5[i9]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(i5) + 20) >> 6) + 27, android.graphics.Color.blue(i5) + 29, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                }
                iArr6[i9] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i9++;
                $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                i4 = 1;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr5, i2, iArr4, i2, length2);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr4[i10];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5088, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i10++;
            }
            int i12 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i12;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i13 = istransitsupported.DigitizedCardProfile;
            int i14 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2923, (char) (3037 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                byte b = $$a[0];
                byte b2 = b;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(b, b2, b2, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{0, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
        $$b = 2;
    }

    static void writeReplace() {
        getGpoResponse = new int[]{1670850524, 1373500265, -1426056288, -1187766022, -1405101092, -1251290276, 2062183563, -995415536, 314341334, 992452654, 719517730, -1440487848, 1650159983, 2134670413, -348458782, -2083845164, -1833704221, 1905769789};
    }
}
