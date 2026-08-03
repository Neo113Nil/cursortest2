package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XK {
    public static int A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"u9Ssvniz27TlV85K0pYswnvngpWD7UTv", "yLtbvA2Xz23YXdIWqrcyb7jywu5SSFGZ", "scrB43nD9W", "wsEo4KD", "NKrjwyp9F68gvgrQJDNYzVT8tQP7WanP", "VznZXKKoMO4DiuN4LwEwkvbHVlMTJ38P", "0a9nN5zxgtKrFfFA5lDM9YM14l5DBDtv", "nZC8h8R09gEqYECwHp8yIoQ586Dae6j4"};
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> A03;
    public static volatile com.facebook.ads.redexgen.core.XJ A04;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{126, -85, -95, -81, -84, -90, -95, -118, -98, -85, -90, -93, -94, -80, -79, 107, -75, -86, -87, -29, -27, -10, -21, -8, -21, -10, -5, -96, -81, -81, -85, -88, -94, -96, -77, -88, -82, -83, -28, -30, -21, -30, -17, -26, -32, -90, -94, -89, -116, -99, -92, -113, -98, -85, -84, -94, -88, -89, -94, -107, -93, -103, -86, -107, -111, -110, -100, -107, 113, -109, -92, -103, -90, -103, -92, -87, -2, -4, -18, -4, -74, -4, -19, -12};
    }

    static {
        A07();
        A00 = -1;
        A04 = com.facebook.ads.redexgen.core.XJ.A04;
        A03 = new java.util.concurrent.atomic.AtomicReference<>(null);
    }

    public static int A01(android.content.Context context) {
        if (A04 == com.facebook.ads.redexgen.core.XJ.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(android.content.Context context) {
        try {
            android.content.res.XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 21));
            return A05(parser);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public static int A03(android.content.Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A05(org.xmlpull.v1.XmlPullParser xmlPullParser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(76, 8, 97))) {
                for (int i = 0; i < i; i++) {
                    if (xmlPullParser.getAttributeName(i).equals(A06(45, 13, 17))) {
                        java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
                        java.lang.String[] strArr = A02;
                        java.lang.String str = strArr[0];
                        java.lang.String str2 = strArr[1];
                        int charAt = str.charAt(20);
                        int i2 = str2.charAt(20);
                        if (charAt == i2) {
                            throw new java.lang.RuntimeException();
                        }
                        A02[2] = "E9WdjcV1cB";
                        int i3 = java.lang.Integer.parseInt(attributeValue);
                        return i3;
                    }
                }
            }
        }
        return 0;
    }

    public static void A08(android.content.Context context) {
        if (A0B()) {
            return;
        }
        A09(context);
    }

    public static void A09(android.content.Context context) {
        if (A04 != com.facebook.ads.redexgen.core.XJ.A04) {
            return;
        }
        A04 = com.facebook.ads.redexgen.core.XJ.A03;
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new com.facebook.ads.redexgen.core.C0988Qu(context));
    }

    public static void A0A(com.facebook.ads.redexgen.core.T8 t8, java.lang.Throwable th) {
        t8.A08().ABC(A06(38, 7, 85), com.facebook.ads.redexgen.core.AbstractC1048Td.A1c, new com.facebook.ads.redexgen.core.C1049Te(th));
    }

    public static boolean A0B() {
        return A04 == com.facebook.ads.redexgen.core.XJ.A02;
    }

    public static boolean A0C(com.facebook.ads.redexgen.core.T8 t8) {
        java.lang.Boolean cachedValue = A03.get();
        if (cachedValue != null) {
            boolean booleanValue = cachedValue.booleanValue();
            java.lang.String[] strArr = A02;
            if (strArr[0].charAt(20) != strArr[1].charAt(20)) {
                A02[2] = "MLFYzbWhDK";
                return booleanValue;
            }
        } else {
            android.content.res.XmlResourceParser xmlResourceParser = null;
            boolean z = true;
            try {
                xmlResourceParser = t8.getAssets().openXmlResourceParser(A06(0, 19, 21));
                loop0: while (true) {
                    if (xmlResourceParser.next() == 1) {
                        break;
                    }
                    if (xmlResourceParser.getEventType() == 2 && (xmlResourceParser.getName().equals(A06(27, 11, 23)) || xmlResourceParser.getName().equals(A06(19, 8, 90)))) {
                        for (int i = 0; i < xmlResourceParser.getAttributeCount(); i++) {
                            if (xmlResourceParser.getAttributeName(i).equals(A06(58, 18, 8)) && !java.lang.Boolean.parseBoolean(xmlResourceParser.getAttributeValue(i))) {
                                z = false;
                                break loop0;
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                java.lang.String[] strArr2 = A02;
                if (strArr2[0].charAt(20) != strArr2[1].charAt(20)) {
                    A02[5] = "KCUHy5Pusu5FHvSmqkTRk1L0JwcSe1Zm";
                    A0A(t8, th);
                    if (xmlResourceParser != null) {
                        try {
                            xmlResourceParser.close();
                        } catch (java.lang.Exception e) {
                            A0A(t8, e);
                        }
                    }
                }
            }
            A03.set(java.lang.Boolean.valueOf(z));
            return z;
        }
        throw new java.lang.RuntimeException();
    }
}
