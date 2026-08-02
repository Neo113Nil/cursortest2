package org.bouncycastle.i18n;

/* loaded from: classes17.dex */
public class MessageBundle extends org.bouncycastle.i18n.TextBundle {
    public static final java.lang.String TITLE_ENTRY = "title";

    public java.lang.String getTitle(java.util.Locale locale, java.util.TimeZone timeZone) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry("title", locale, timeZone);
    }

    public java.lang.String getTitle(java.util.Locale locale) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry("title", locale, java.util.TimeZone.getDefault());
    }

    public MessageBundle(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) throws java.lang.NullPointerException {
        super(str, str2, objArr);
    }

    public MessageBundle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public MessageBundle(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public MessageBundle(java.lang.String str, java.lang.String str2) throws java.lang.NullPointerException {
        super(str, str2);
    }
}
