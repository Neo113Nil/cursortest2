package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5I, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C5I {
    public static java.lang.String[] A00 = {"qfPqVubsqiDC6Vd32xxY81weI46FC8i6", "ifUD3UE6KzNkI7FGHB4BSxXnx5udEg1v", "HApreVkXUmhHvk7HCV6N8bmHn3x6D71x", "KwNQHauJnUfBiEnC2ayFRvrFwy8Kb5WT", "B3seXQDThZm5axyUWAGkIYmR8N5go", "E5OkJ7IfnjnuDV", "RJSotr9XNdK0NrHWRK8cXeAUCHsVK", "bPrL9Bc32BKI4n2EpyGIBLpCsrR14et0"};

    public static java.lang.String A00(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
                java.lang.String[] strArr = A00;
                java.lang.String str2 = strArr[4];
                java.lang.String str3 = strArr[6];
                int i2 = str2.length();
                int attributeCount2 = str3.length();
                if (i2 != attributeCount2) {
                    throw new java.lang.RuntimeException();
                }
                A00[3] = "CnKCr3L2gFKHIgDNDJx3U1eLsZv8S9Vf";
                return attributeValue;
            }
        }
        return null;
    }

    public static boolean A01(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean A02(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean A03(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException {
        return A01(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean A04(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException {
        return A02(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
