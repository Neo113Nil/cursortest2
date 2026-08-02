package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public enum SchemaType {
    UNKNOWN(0),
    HTML_CONTENT(1),
    JSON_CONTENT(2),
    RULESET(3),
    INAPP(4),
    FEED(5),
    NATIVE_ALERT(6),
    DEFAULT_CONTENT(7),
    CONTENT_CARD(8),
    EVENT_HISTORY_OPERATION(9);

    private final int Camera2StreamConfigurationMap;

    SchemaType(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final int getValue() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: com.adobe.marketing.mobile.messaging.SchemaType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.messaging.SchemaType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.adobe.marketing.mobile.messaging.SchemaType.HTML_CONTENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.JSON_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.RULESET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.INAPP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.FEED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.NATIVE_ALERT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.DEFAULT_CONTENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.CONTENT_CARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoSizes[com.adobe.marketing.mobile.messaging.SchemaType.EVENT_HISTORY_OPERATION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        switch (com.adobe.marketing.mobile.messaging.SchemaType.AnonymousClass1.getHighSpeedVideoSizes[ordinal()]) {
            case 1:
                return "https://ns.adobe.com/personalization/html-content-item";
            case 2:
                return "https://ns.adobe.com/personalization/json-content-item";
            case 3:
                return "https://ns.adobe.com/personalization/ruleset-item";
            case 4:
                return "https://ns.adobe.com/personalization/message/in-app";
            case 5:
                return "https://ns.adobe.com/personalization/message/feed-item";
            case 6:
                return "https://ns.adobe.com/personalization/message/native-alert";
            case 7:
                return "https://ns.adobe.com/personalization/default-content-item";
            case 8:
                return "https://ns.adobe.com/personalization/message/content-card";
            case 9:
                return "https://ns.adobe.com/personalization/eventHistoryOperation";
            default:
                return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.adobe.marketing.mobile.messaging.SchemaType getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        char c;
        if (str == null) {
            return UNKNOWN;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -2129832997:
                if (str.equals("https://ns.adobe.com/personalization/eventHistoryOperation")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1431733179:
                if (str.equals("https://ns.adobe.com/personalization/default-content-item")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1224085186:
                if (str.equals("https://ns.adobe.com/personalization/message/content-card")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -712579712:
                if (str.equals("https://ns.adobe.com/personalization/message/native-alert")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -32917577:
                if (str.equals("https://ns.adobe.com/personalization/html-content-item")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 346296915:
                if (str.equals("https://ns.adobe.com/personalization/message/in-app")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 485985004:
                if (str.equals("https://ns.adobe.com/personalization/ruleset-item")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 826438344:
                if (str.equals("https://ns.adobe.com/personalization/message/feed-item")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 893255066:
                if (str.equals("https://ns.adobe.com/personalization/json-content-item")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return UNKNOWN;
    }
}
