package androidx.core.net;

/* loaded from: classes7.dex */
public final class MailTo {
    public static final java.lang.String MAILTO_SCHEME = "mailto:";
    private java.util.HashMap<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = new java.util.HashMap<>();

    private MailTo() {
    }

    public static boolean isMailTo(java.lang.String str) {
        return str != null && str.startsWith(MAILTO_SCHEME);
    }

    public static boolean isMailTo(android.net.Uri uri) {
        return uri != null && "mailto".equals(uri.getScheme());
    }

    public static androidx.core.net.MailTo parse(java.lang.String str) throws androidx.core.net.ParseException {
        java.lang.String decode;
        java.lang.String substring;
        androidx.core.util.Preconditions.checkNotNull(str);
        if (!isMailTo(str)) {
            throw new androidx.core.net.ParseException("Not a mailto scheme");
        }
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1) {
            decode = android.net.Uri.decode(str.substring(7));
            substring = null;
        } else {
            decode = android.net.Uri.decode(str.substring(7, indexOf2));
            substring = str.substring(indexOf2 + 1);
        }
        androidx.core.net.MailTo mailTo = new androidx.core.net.MailTo();
        if (substring != null) {
            for (java.lang.String str2 : substring.split("&")) {
                java.lang.String[] split = str2.split("=", 2);
                if (split.length != 0) {
                    mailTo.Camera2StreamConfigurationMap.put(android.net.Uri.decode(split[0]).toLowerCase(java.util.Locale.ROOT), split.length > 1 ? android.net.Uri.decode(split[1]) : null);
                }
            }
        }
        java.lang.String to = mailTo.getTo();
        if (to != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(decode);
            sb.append(", ");
            sb.append(to);
            decode = sb.toString();
        }
        mailTo.Camera2StreamConfigurationMap.put(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, decode);
        return mailTo;
    }

    public static androidx.core.net.MailTo parse(android.net.Uri uri) throws androidx.core.net.ParseException {
        return parse(uri.toString());
    }

    public final java.lang.String getTo() {
        return this.Camera2StreamConfigurationMap.get(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO);
    }

    public final java.lang.String getCc() {
        return this.Camera2StreamConfigurationMap.get("cc");
    }

    public final java.lang.String getBcc() {
        return this.Camera2StreamConfigurationMap.get("bcc");
    }

    public final java.lang.String getSubject() {
        return this.Camera2StreamConfigurationMap.get("subject");
    }

    public final java.lang.String getBody() {
        return this.Camera2StreamConfigurationMap.get(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mailto:?");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.Camera2StreamConfigurationMap.entrySet()) {
            sb.append(android.net.Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(android.net.Uri.encode(entry.getValue()));
            sb.append(kotlin.text.Typography.amp);
        }
        return sb.toString();
    }
}
