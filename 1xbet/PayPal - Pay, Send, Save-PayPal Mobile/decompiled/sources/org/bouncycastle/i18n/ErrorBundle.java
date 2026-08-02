package org.bouncycastle.i18n;

/* loaded from: classes17.dex */
public class ErrorBundle extends org.bouncycastle.i18n.MessageBundle {
    public static final java.lang.String DETAIL_ENTRY = "details";
    public static final java.lang.String SUMMARY_ENTRY = "summary";

    public java.lang.String getSummary(java.util.Locale locale, java.util.TimeZone timeZone) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry(SUMMARY_ENTRY, locale, timeZone);
    }

    public java.lang.String getSummary(java.util.Locale locale) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry(SUMMARY_ENTRY, locale, java.util.TimeZone.getDefault());
    }

    public java.lang.String getDetail(java.util.Locale locale, java.util.TimeZone timeZone) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry("details", locale, timeZone);
    }

    public java.lang.String getDetail(java.util.Locale locale) throws org.bouncycastle.i18n.MissingEntryException {
        return getEntry("details", locale, java.util.TimeZone.getDefault());
    }

    public ErrorBundle(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) throws java.lang.NullPointerException {
        super(str, str2, objArr);
    }

    public ErrorBundle(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public ErrorBundle(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public ErrorBundle(java.lang.String str, java.lang.String str2) throws java.lang.NullPointerException {
        super(str, str2);
    }
}
