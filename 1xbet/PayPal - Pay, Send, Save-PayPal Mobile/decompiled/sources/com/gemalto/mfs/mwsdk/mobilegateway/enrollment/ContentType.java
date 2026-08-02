package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public enum ContentType {
    PlainText,
    Html,
    Pdf,
    Png,
    Svg,
    Other;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ContentType fromValue(java.lang.String str) throws java.lang.IllegalArgumentException {
        char c;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Terms and Conditions content type cannot be null");
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1082243251:
                if (str.equals("text/html")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79058:
                if (str.equals("PDF")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 79369:
                if (str.equals("PNG")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82500:
                if (str.equals("SVG")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 817335912:
                if (str.equals("text/plain")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return Html;
        }
        if (c == 1) {
            return Pdf;
        }
        if (c == 2) {
            return Png;
        }
        if (c == 3) {
            return Svg;
        }
        if (c == 4) {
            return PlainText;
        }
        return Other;
    }
}
