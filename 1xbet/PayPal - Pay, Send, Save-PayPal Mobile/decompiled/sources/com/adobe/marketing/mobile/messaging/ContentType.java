package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public enum ContentType {
    APPLICATION_JSON(0),
    TEXT_HTML(1),
    TEXT_XML(2),
    TEXT_PLAIN(3),
    UNKNOWN(4);

    private final int getHighSpeedVideoFpsRangesFor;

    ContentType(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final int getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: com.adobe.marketing.mobile.messaging.ContentType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.messaging.ContentType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.adobe.marketing.mobile.messaging.ContentType.APPLICATION_JSON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.messaging.ContentType.TEXT_HTML.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.messaging.ContentType.TEXT_XML.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.messaging.ContentType.TEXT_PLAIN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = com.adobe.marketing.mobile.messaging.ContentType.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[ordinal()];
        if (i == 1) {
            return "application/json";
        }
        if (i == 2) {
            return "text/html";
        }
        if (i == 3) {
            return coil3.content.UtilsKt.MIME_TYPE_XML;
        }
        if (i == 4) {
            return "text/plain";
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.adobe.marketing.mobile.messaging.ContentType getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        char c;
        if (str == null) {
            return UNKNOWN;
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
            case -1004727243:
                if (str.equals(coil3.content.UtilsKt.MIME_TYPE_XML)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -43840953:
                if (str.equals("application/json")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 817335912:
                if (str.equals("text/plain")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return TEXT_HTML;
        }
        if (c == 1) {
            return TEXT_XML;
        }
        if (c == 2) {
            return APPLICATION_JSON;
        }
        if (c == 3) {
            return TEXT_PLAIN;
        }
        return UNKNOWN;
    }
}
