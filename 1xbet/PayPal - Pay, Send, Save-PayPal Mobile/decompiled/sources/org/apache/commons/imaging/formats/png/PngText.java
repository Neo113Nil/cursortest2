package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
public abstract class PngText {
    public final java.lang.String keyword;
    public final java.lang.String text;

    public PngText(java.lang.String str, java.lang.String str2) {
        this.keyword = str;
        this.text = str2;
    }

    public static class Text extends org.apache.commons.imaging.formats.png.PngText {
        public Text(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class Ztxt extends org.apache.commons.imaging.formats.png.PngText {
        public Ztxt(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class Itxt extends org.apache.commons.imaging.formats.png.PngText {
        public final java.lang.String languageTag;
        public final java.lang.String translatedKeyword;

        public Itxt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(str, str2);
            this.languageTag = str3;
            this.translatedKeyword = str4;
        }
    }
}
