package G;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f188b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f189c;

    public f(int i2, String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public f(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public f(String str, String str2, String str3, boolean z2) {
        this.f187a = str;
        this.f188b = str3.concat(str2);
        this.f189c = z2;
    }
}
