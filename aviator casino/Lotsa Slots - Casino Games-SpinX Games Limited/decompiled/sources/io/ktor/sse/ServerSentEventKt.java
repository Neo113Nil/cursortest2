package io.ktor.sse;

/* compiled from: ServerSentEvent.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\u0007\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\t*\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u0012\u0004\b\u0016\u0010\u0014\"\u001a\u0010\u0017\u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u0012\u0004\b\u0018\u0010\u0014\" \u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "data", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "id", "", "retry", "comments", "eventToString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "T", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "name", "value", "", "appendField", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "COLON", "Ljava/lang/String;", "getCOLON$annotations", "()V", "SPACE", "getSPACE$annotations", "END_OF_LINE", "getEND_OF_LINE$annotations", "Lkotlin/text/Regex;", "END_OF_LINE_VARIANTS", "Lkotlin/text/Regex;", "getEND_OF_LINE_VARIANTS", "()Lkotlin/text/Regex;", "getEND_OF_LINE_VARIANTS$annotations", "ktor-sse"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServerSentEventKt {
    public static final java.lang.String COLON = ":";
    public static final java.lang.String END_OF_LINE = "\r\n";
    private static final kotlin.text.Regex END_OF_LINE_VARIANTS = new kotlin.text.Regex("\r\n|\r|\n");
    public static final java.lang.String SPACE = " ";

    public static /* synthetic */ void getCOLON$annotations() {
    }

    public static /* synthetic */ void getEND_OF_LINE$annotations() {
    }

    public static /* synthetic */ void getEND_OF_LINE_VARIANTS$annotations() {
    }

    public static /* synthetic */ void getSPACE$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String eventToString(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.lang.String str4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendField(sb, androidx.core.app.NotificationCompat.CATEGORY_EVENT, str2);
        appendField(sb, "data", str);
        appendField(sb, "id", str3);
        appendField(sb, "retry", l);
        appendField(sb, "", str4);
        return sb.toString();
    }

    private static final <T> void appendField(java.lang.StringBuilder sb, java.lang.String str, T t) {
        if (t != null) {
            java.util.Iterator<T> it = END_OF_LINE_VARIANTS.split(t.toString(), 0).iterator();
            while (it.hasNext()) {
                sb.append(str + ": " + ((java.lang.String) it.next()) + END_OF_LINE);
            }
        }
    }

    public static final kotlin.text.Regex getEND_OF_LINE_VARIANTS() {
        return END_OF_LINE_VARIANTS;
    }
}
