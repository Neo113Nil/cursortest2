package androidx.appcompat.resources;

/* loaded from: classes5.dex */
public final class Compatibility {
    private Compatibility() {
    }

    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void inflate(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static int getChangingConfigurations(android.content.res.TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        public static android.graphics.drawable.Drawable createFromXmlInner(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            return android.graphics.drawable.Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
