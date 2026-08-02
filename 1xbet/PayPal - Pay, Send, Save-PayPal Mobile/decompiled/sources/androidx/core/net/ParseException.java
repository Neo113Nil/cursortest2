package androidx.core.net;

/* loaded from: classes7.dex */
public class ParseException extends java.lang.RuntimeException {
    public final java.lang.String response;

    ParseException(java.lang.String str) {
        super(str);
        this.response = str;
    }
}
