package org.bouncycastle.i18n;

/* loaded from: classes17.dex */
public class TextBundle extends org.bouncycastle.i18n.LocalizedMessage {
    public static final java.lang.String TEXT_ENTRY = "text";

    public java.lang.String getText(java.util.Locale locale, java.util.TimeZone timeZone) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry("text", locale, timeZone);
    }

    public java.lang.String getText(java.util.Locale locale) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry("text", locale, java.util.TimeZone.getDefault());
    }

    public TextBundle(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) throws java.lang.NullPointerException {
        super(str, str2, objArr);
    }

    public TextBundle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public TextBundle(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public TextBundle(java.lang.String str, java.lang.String str2) throws java.lang.NullPointerException {
        super(str, str2);
    }
}
