package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class XmlPullParserUtil {
    private XmlPullParserUtil() {
    }

    public static boolean isEndTag(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException {
        return isEndTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isEndTag(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean isStartTag(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException {
        return isStartTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTag(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean isStartTagIgnorePrefix(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException {
        if (!isStartTag(xmlPullParser)) {
            return false;
        }
        java.lang.String name2 = xmlPullParser.getName();
        int indexOf = name2.indexOf(58);
        if (indexOf != -1) {
            name2 = name2.substring(indexOf + 1);
        }
        return name2.equals(str);
    }

    public static java.lang.String getAttributeValue(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static java.lang.String getAttributeValueIgnorePrefix(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            int indexOf = attributeName.indexOf(58);
            if (indexOf != -1) {
                attributeName = attributeName.substring(indexOf + 1);
            }
            if (attributeName.equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
