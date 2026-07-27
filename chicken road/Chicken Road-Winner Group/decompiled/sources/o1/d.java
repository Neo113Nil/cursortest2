package o1;

/* loaded from: classes.dex */
public enum d {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("audio");


    /* renamed from: a, reason: collision with root package name */
    public final String f10153a;

    d(String str) {
        this.f10153a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10153a;
    }
}
