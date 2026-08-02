package androidx.core.content.res;

/* loaded from: classes3.dex */
public class FontResourcesParserCompat {
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;

    public interface FamilyResourceEntry {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class ProviderResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<androidx.core.provider.FontRequest> getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final java.lang.String getHighSpeedVideoSizes;

        public ProviderResourceEntry(java.util.List<androidx.core.provider.FontRequest> list, int i, int i2, java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = list;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoSizes = str;
        }

        public ProviderResourceEntry(androidx.core.provider.FontRequest fontRequest, int i, int i2) {
            this(java.util.Collections.singletonList(fontRequest), i, i2, null);
        }

        public final java.util.List<androidx.core.provider.FontRequest> getRequests() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final androidx.core.provider.FontRequest getRequest() {
            return this.getHighSpeedVideoFpsRanges.get(0);
        }

        public final androidx.core.provider.FontRequest getFallbackRequest() {
            if (this.getHighSpeedVideoFpsRanges.size() < 2) {
                return null;
            }
            return this.getHighSpeedVideoFpsRanges.get(1);
        }

        public final int getFetchStrategy() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getTimeout() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String getSystemFontFamilyName() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public static final class FontFileResourceEntry {
        private final int Camera2StreamConfigurationMap;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;
        private final int getOutputFormats;

        public FontFileResourceEntry(java.lang.String str, int i, boolean z, java.lang.String str2, int i2, int i3) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getOutputFormats = i;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoFpsRanges = str2;
            this.Camera2StreamConfigurationMap = i2;
            this.getHighSpeedVideoSizes = i3;
        }

        public final java.lang.String getFileName() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getWeight() {
            return this.getOutputFormats;
        }

        public final boolean isItalic() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.String getVariationSettings() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int getTtcIndex() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int getResourceId() {
            return this.getHighSpeedVideoSizes;
        }
    }

    public static final class FontFamilyFilesResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] getHighResolutionOutputSizeshNQ4ISI;

        public FontFamilyFilesResourceEntry(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = fontFileResourceEntryArr;
        }

        public final androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] getEntries() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        return getHighSpeedVideoSizes(xmlPullParser, resources);
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry getHighSpeedVideoSizes(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return getHighSpeedVideoFpsRanges(xmlPullParser, resources);
        }
        getHighSpeedVideoFpsRanges(xmlPullParser);
        return null;
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry getHighSpeedVideoFpsRanges(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamily);
        java.lang.String string = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderAuthority);
        java.lang.String string2 = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderPackage);
        java.lang.String string3 = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderQuery);
        java.lang.String string4 = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderFallbackQuery);
        int resourceId = obtainAttributes.getResourceId(androidx.core.R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        java.lang.String string5 = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null) {
            java.util.List<java.util.List<byte[]>> readCerts = readCerts(resources, resourceId);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("fallback")) {
                        arrayList.add(getHighSpeedVideoFpsRangesFor(xmlPullParser, resources, string, string2, readCerts));
                    } else {
                        getHighSpeedVideoFpsRanges(xmlPullParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry(arrayList, integer, integer2, string5);
            }
            if (string3 != null) {
                arrayList.add(new androidx.core.provider.FontRequest(string, string2, string3, readCerts, null, null));
                if (string4 != null) {
                    arrayList.add(new androidx.core.provider.FontRequest(string, string2, string4, readCerts, null, null));
                }
                return new androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry(arrayList, integer, integer2, string5);
            }
            throw new java.lang.IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(io.ktor.http.ContentType.Font.TYPE)) {
                    arrayList2.add(getHighSpeedVideoFpsRangesFor(xmlPullParser, resources));
                } else {
                    getHighSpeedVideoFpsRanges(xmlPullParser);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry((androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[]) arrayList2.toArray(new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[0]));
    }

    private static int getHighSpeedVideoFpsRangesFor(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getType(i);
    }

    public static java.util.List<java.util.List<byte[]>> readCerts(android.content.res.Resources resources, int i) {
        if (i == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (getHighSpeedVideoFpsRangesFor(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(getHighSpeedVideoSizes(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(getHighSpeedVideoSizes(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static java.util.List<byte[]> getHighSpeedVideoSizes(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(android.util.Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static androidx.core.provider.FontRequest getHighSpeedVideoFpsRangesFor(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources, java.lang.String str, java.lang.String str2, java.util.List<java.util.List<byte[]>> list) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamilyProviderFallback);
        try {
            java.lang.String string = obtainAttributes.getString(androidx.core.R.styleable.FontFamilyProviderFallback_fontProviderQuery);
            java.lang.String string2 = obtainAttributes.getString(androidx.core.R.styleable.FontFamilyProviderFallback_fontProviderSystemFontFamily);
            java.lang.String string3 = obtainAttributes.getString(androidx.core.R.styleable.FontFamilyProviderFallback_fontVariationSettings);
            if (string == null) {
                throw new org.xmlpull.v1.XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                getHighSpeedVideoFpsRanges(xmlPullParser);
            }
            androidx.core.provider.FontRequest fontRequest = new androidx.core.provider.FontRequest(str, str2, string, list, string2, string3);
            if (obtainAttributes != null) {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) obtainAttributes);
            }
            return fontRequest;
        } catch (java.lang.Throwable th) {
            if (obtainAttributes != null) {
                try {
                    androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) obtainAttributes);
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry getHighSpeedVideoFpsRangesFor(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        android.content.res.TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamilyFont);
        if (obtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontWeight)) {
            i = androidx.core.R.styleable.FontFamilyFont_fontWeight;
        } else {
            i = androidx.core.R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i6 = obtainAttributes.getInt(i, 400);
        if (obtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontStyle)) {
            i2 = androidx.core.R.styleable.FontFamilyFont_fontStyle;
        } else {
            i2 = androidx.core.R.styleable.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i2, 0);
        if (obtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_ttcIndex)) {
            i3 = androidx.core.R.styleable.FontFamilyFont_ttcIndex;
        } else {
            i3 = androidx.core.R.styleable.FontFamilyFont_android_ttcIndex;
        }
        if (obtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontVariationSettings)) {
            i4 = androidx.core.R.styleable.FontFamilyFont_fontVariationSettings;
        } else {
            i4 = androidx.core.R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        java.lang.String string = obtainAttributes.getString(i4);
        int i7 = obtainAttributes.getInt(i3, 0);
        if (obtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_font)) {
            i5 = androidx.core.R.styleable.FontFamilyFont_font;
        } else {
            i5 = androidx.core.R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        java.lang.String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            getHighSpeedVideoFpsRanges(xmlPullParser);
        }
        return new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry(string2, i6, z, string, i7, resourceId);
    }

    private static void getHighSpeedVideoFpsRanges(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private FontResourcesParserCompat() {
    }
}
