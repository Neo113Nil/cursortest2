package org.bouncycastle.i18n;

/* loaded from: classes17.dex */
public class LocaleString extends org.bouncycastle.i18n.LocalizedMessage {
    public java.lang.String getLocaleString(java.util.Locale locale) {
        return getEntry(null, locale, null);
    }

    public LocaleString(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public LocaleString(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public LocaleString(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }
}
