package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ny {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.text.DateFormat> f3696a = new java.lang.ThreadLocal<java.text.DateFormat>() { // from class: com.facetec.sdk.ny.4
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ java.text.DateFormat initialValue() {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(com.facetec.sdk.nh.b);
            return simpleDateFormat;
        }
    };
    private static final java.lang.String[] c = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final java.text.DateFormat[] d = new java.text.DateFormat[15];

    public static java.util.Date c(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        java.util.Date parse = f3696a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        java.lang.String[] strArr = c;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                java.text.DateFormat[] dateFormatArr = d;
                java.text.DateFormat dateFormat = dateFormatArr[i];
                if (dateFormat == null) {
                    dateFormat = new java.text.SimpleDateFormat(c[i], java.util.Locale.US);
                    dateFormat.setTimeZone(com.facetec.sdk.nh.b);
                    dateFormatArr[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                java.util.Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }

    public static java.lang.String a(java.util.Date date) {
        return f3696a.get().format(date);
    }
}
