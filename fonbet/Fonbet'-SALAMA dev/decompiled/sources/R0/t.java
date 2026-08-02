package R0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5869a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5870b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5871c;

    /* renamed from: d, reason: collision with root package name */
    public final s f5872d;

    public t(String str, String str2, boolean z4, s sVar) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f5870b = str;
        this.f5871c = str2;
        this.f5869a = z4;
        this.f5872d = sVar;
    }
}
