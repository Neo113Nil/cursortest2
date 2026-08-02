package androidx.appcompat.app;

/* loaded from: classes3.dex */
class LayoutIncludeDetector {
    final java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> getHighSpeedVideoSizes = new java.util.ArrayDeque();

    LayoutIncludeDetector() {
    }

    static boolean getHighSpeedVideoFpsRangesFor(org.xmlpull.v1.XmlPullParser xmlPullParser, org.xmlpull.v1.XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (org.xmlpull.v1.XmlPullParserException unused) {
            return false;
        }
    }

    static org.xmlpull.v1.XmlPullParser getHighSpeedVideoFpsRangesFor(java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            org.xmlpull.v1.XmlPullParser xmlPullParser = deque.peek().get();
            if (!getHighSpeedVideoFpsRangesFor(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3) {
                    if (xmlPullParser.getEventType() != 1) {
                        return false;
                    }
                }
            } catch (org.xmlpull.v1.XmlPullParserException unused) {
            }
        }
        return true;
    }
}
