package io.ktor.sse;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0086T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0086T¢\u0006\f\n\u0004\b\r\u0010\n\u0012\u0004\b\u000e\u0010\f\"\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\f\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0010\u0010\f\"\u001d\u0010\u0012\u001a\u00020\u00118\u0007¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"T", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "", "p0", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "COLON", "Ljava/lang/String;", "getCOLON$annotations", "()V", "SPACE", "getSPACE$annotations", "END_OF_LINE", "getEND_OF_LINE$annotations", "Lkotlin/text/Regex;", "END_OF_LINE_VARIANTS", "Lkotlin/text/Regex;", "getEND_OF_LINE_VARIANTS", "()Lkotlin/text/Regex;", "getEND_OF_LINE_VARIANTS$annotations"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
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

    private static final <T> void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, java.lang.String str, T t) {
        if (t != null) {
            for (java.lang.String str2 : END_OF_LINE_VARIANTS.split(t.toString(), 0)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sb2.append(END_OF_LINE);
                sb.append(sb2.toString());
            }
        }
    }

    public static final kotlin.text.Regex getEND_OF_LINE_VARIANTS() {
        return END_OF_LINE_VARIANTS;
    }

    public static final /* synthetic */ java.lang.String access$eventToString(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.lang.String str4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        getHighResolutionOutputSizeshNQ4ISI(sb, "event", str2);
        getHighResolutionOutputSizeshNQ4ISI(sb, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
        getHighResolutionOutputSizeshNQ4ISI(sb, "id", str3);
        getHighResolutionOutputSizeshNQ4ISI(sb, "retry", l);
        getHighResolutionOutputSizeshNQ4ISI(sb, "", str4);
        return sb.toString();
    }
}
