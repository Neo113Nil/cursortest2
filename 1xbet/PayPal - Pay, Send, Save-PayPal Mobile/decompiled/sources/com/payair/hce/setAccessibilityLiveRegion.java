package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAccessibilityLiveRegion {
    private static com.payair.hce.getDrawable AlternateContactlessPaymentDataJson = new com.payair.hce.openContextMenu() { // from class: com.payair.hce.setAccessibilityLiveRegion.5
        private static int DigitizedCardProfile = 1;
        private static int values;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ~i2;
            int i6 = (~i3) | i4;
            int i7 = (i * 483) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) + (((~(i4 | i5)) | (~i6)) * (-241)) + ((i | i2) * (-482)) + (((~(i | i5)) | (~(i2 | i6))) * 241);
            if (i7 != 1) {
                return i7 != 2 ? writeReplace(objArr) : valueOf(objArr);
            }
            java.lang.String str = (java.lang.String) objArr[1];
            int i8 = DigitizedCardProfile;
            int i9 = i8 & 35;
            values = ((i9 - (~((i8 ^ 35) | i9))) - 1) % 128;
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, 1437210083, -1437210055, (int) java.lang.System.currentTimeMillis());
            int i10 = DigitizedCardProfile;
            int i11 = i10 & 51;
            values = (((i10 | 51) & (~i11)) + (i11 << 1)) % 128;
            return java.lang.Boolean.TRUE;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            java.lang.String str = (java.lang.String) objArr[1];
            int i = values;
            int i2 = i & 7;
            DigitizedCardProfile = (i2 + ((i ^ 7) | i2)) % 128;
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2112431470, -2112431463, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{str}, 1437210083, -1437210055, (int) java.lang.System.currentTimeMillis());
            int i3 = values;
            int i4 = i3 ^ 117;
            int i5 = -(-((i3 & 117) << 1));
            int i6 = (i4 & i5) + (i5 | i4);
            DigitizedCardProfile = i6 % 128;
            if (i6 % 2 != 0) {
                return java.lang.Boolean.TRUE;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            int i = DigitizedCardProfile;
            values = ((i & 47) + (i | 47)) % 128;
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1457317077, 1457317091, (int) java.lang.System.currentTimeMillis());
            int i2 = values;
            int i3 = ((i2 & (-76)) | ((~i2) & 75)) + ((i2 & 75) << 1);
            DigitizedCardProfile = i3 % 128;
            if (i3 % 2 != 0) {
                return java.lang.Boolean.TRUE;
            }
            throw null;
        }

        @Override // com.payair.hce.openContextMenu, com.payair.hce.getDrawable
        public final boolean writeReplace() {
            return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 2102116741, -2102116739, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // com.payair.hce.openContextMenu, com.payair.hce.getDrawable
        public final boolean SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
            return ((java.lang.Boolean) values(new java.lang.Object[]{this, str}, -2033458410, 2033458411, java.lang.System.identityHashCode(this))).booleanValue();
        }

        @Override // com.payair.hce.openContextMenu, com.payair.hce.getDrawable
        public final boolean valueOf(java.lang.String str) {
            return ((java.lang.Boolean) values(new java.lang.Object[]{this, str}, 1520186640, -1520186640, java.lang.System.identityHashCode(this))).booleanValue();
        }
    };
    private static int DigitizedCardProfile = 0;
    private static int getProfileVersion = 1;
    private static java.util.ArrayList<java.lang.String> valueOf = null;
    private static int values = 0;
    private static long writeReplace = -1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        if ((i * 367) + (i2 * 367) + ((i | i2) * (-366)) + (((~(i4 | i3)) | i) * (-366)) + (((~((~i) | i2)) | (~(i3 | i4 | i))) * 366) != 1) {
            return valueOf(objArr);
        }
        valueOf = new java.util.ArrayList<>();
        values = 0;
        DigitizedCardProfile = (getProfileVersion + 45) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        boolean z;
        int i;
        java.lang.String str = (java.lang.String) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        int i2 = DigitizedCardProfile;
        int i3 = (((i2 | 82) << 1) - (i2 ^ 82)) - 1;
        int i4 = i3 % 128;
        getProfileVersion = i4;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str == null) {
            DigitizedCardProfile = (i4 + 53) % 128;
            return null;
        }
        if (((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())) != null) {
            DigitizedCardProfile = (getProfileVersion + 19) % 128;
            if (((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())).getProfileVersion() == 0) {
                int i5 = DigitizedCardProfile;
                int i6 = i5 & 121;
                int i7 = i5 | 121;
                int i8 = (i6 & i7) + (i7 | i6);
                getProfileVersion = i8 % 128;
                if (i8 % 2 != 0) {
                    writeReplace = ((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())).AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
                    z = true;
                    if (valueOf == null) {
                        valueOf = new java.util.ArrayList<>();
                        int i9 = DigitizedCardProfile;
                        int i10 = i9 & 89;
                        int i11 = (i9 | 89) & (~i10);
                        int i12 = -(-(i10 << 1));
                        getProfileVersion = ((i11 ^ i12) + ((i11 & i12) << 1)) % 128;
                    }
                    int i13 = values;
                    values = (i13 ^ 1) + ((i13 & 1) << 1);
                    if (!str.isEmpty()) {
                        new com.payair.hce.setAccessibilityLiveRegion.DigitizedCardProfile(str, context).execute("");
                        int i14 = DigitizedCardProfile;
                        int i15 = i14 & 79;
                        int i16 = (i14 | 79) & (~i15);
                        int i17 = i15 << 1;
                        getProfileVersion = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
                    }
                    if (z) {
                        int i18 = DigitizedCardProfile;
                        getProfileVersion = ((((i18 | 84) << 1) - (i18 ^ 84)) - 1) % 128;
                        ((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())).writeReplace(writeReplace);
                        int i19 = DigitizedCardProfile;
                        int i20 = (i19 | 27) << 1;
                        int i21 = -(i19 ^ 27);
                        getProfileVersion = ((i20 & i21) + (i21 | i20)) % 128;
                    }
                    int i22 = DigitizedCardProfile;
                    i = (((i22 | 62) << 1) - (i22 ^ 62)) - 1;
                    getProfileVersion = i % 128;
                    if (i % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                writeReplace = ((com.payair.hce.setHovered) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2032457647, -2032457626, (int) java.lang.System.currentTimeMillis())).AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
            }
        }
        z = false;
        if (valueOf == null) {
        }
        int i132 = values;
        values = (i132 ^ 1) + ((i132 & 1) << 1);
        if (!str.isEmpty()) {
        }
        if (z) {
        }
        int i222 = DigitizedCardProfile;
        i = (((i222 | 62) << 1) - (i222 ^ 62)) - 1;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
        }
    }

    static {
        int i = DigitizedCardProfile;
        int i2 = i & 11;
        int i3 = (i | 11) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getProfileVersion = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class DigitizedCardProfile extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        private static int values = 1;
        private static int writeReplace;
        private final java.lang.String AlternateContactlessPaymentDataJson;
        private final android.content.Context DigitizedCardProfile;

        public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = (i * 530) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO + (i2 * 530) + (((~((~i3) | i)) | (~(i | i2))) * 529) + (((~(i | i3)) | (~i2)) * 529);
            return i4 != 1 ? i4 != 2 ? AlternateContactlessPaymentDataJson(objArr) : writeReplace(objArr) : values(objArr);
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.setAccessibilityLiveRegion.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setAccessibilityLiveRegion.DigitizedCardProfile) objArr[0];
            java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
            int i = values;
            int i2 = ((i ^ 59) | (i & 59)) << 1;
            int i3 = -((i & (-60)) | ((~i) & 59));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            writeReplace = i4 % 128;
            int i5 = i4 % 2;
            java.lang.String str = (java.lang.String) valueOf(new java.lang.Object[]{digitizedCardProfile}, -526825534, 526825536, java.lang.System.identityHashCode(digitizedCardProfile));
            if (i5 == 0) {
                return str;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            java.lang.Object obj = objArr[1];
            int i = values;
            int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
            writeReplace = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public DigitizedCardProfile(java.lang.String str, android.content.Context context) {
            this.AlternateContactlessPaymentDataJson = str;
            this.DigitizedCardProfile = context;
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.setAccessibilityLiveRegion.DigitizedCardProfile digitizedCardProfile = (com.payair.hce.setAccessibilityLiveRegion.DigitizedCardProfile) objArr[0];
            int i = values;
            int i2 = (-2) - (~(((i | 56) << 1) - (i ^ 56)));
            writeReplace = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            if (((java.lang.Boolean) com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[]{digitizedCardProfile.DigitizedCardProfile}, -71797868, 71797870, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i3 = writeReplace;
                int i4 = ((((i3 ^ 21) | (i3 & 21)) << 1) - ((i3 & (-22)) | ((~i3) & 21))) % 128;
                values = i4;
                writeReplace = ((((i4 ^ 67) | (i4 & 67)) << 1) - ((i4 & (-68)) | ((~i4) & 67))) % 128;
                return null;
            }
            ((com.payair.hce.setTheme) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1016779127, 1016779151, (int) java.lang.System.currentTimeMillis())).valueOf().processNotificationData(new java.lang.String(android.util.Base64.decode(digitizedCardProfile.AlternateContactlessPaymentDataJson, 0)));
            int i5 = writeReplace;
            int i6 = i5 & 87;
            int i7 = (i5 ^ 87) | i6;
            values = ((i6 & i7) + (i7 | i6)) % 128;
            int i8 = writeReplace;
            int i9 = i8 & 23;
            values = (i9 + ((i8 ^ 23) | i9)) % 128;
            return null;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.String] */
        @Override // android.os.AsyncTask
        protected final /* synthetic */ java.lang.String doInBackground(java.lang.String[] strArr) {
            ?? valueOf = valueOf(new java.lang.Object[]{this, strArr}, 915274925, -915274925, java.lang.System.identityHashCode(this));
            return valueOf;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(java.lang.String str) {
            valueOf(new java.lang.Object[]{this, str}, 1364850422, -1364850421, java.lang.System.identityHashCode(this));
        }

        private java.lang.String DigitizedCardProfile() {
            return (java.lang.String) valueOf(new java.lang.Object[]{this}, -526825534, 526825536, java.lang.System.identityHashCode(this));
        }
    }

    static void writeReplace() {
        writeReplace(new java.lang.Object[0], 741099874, -741099873, (int) java.lang.System.currentTimeMillis());
    }

    static void DigitizedCardProfile(java.lang.String str, android.content.Context context) {
        writeReplace(new java.lang.Object[]{str, context}, -1332113624, 1332113624, (int) java.lang.System.currentTimeMillis());
    }
}
