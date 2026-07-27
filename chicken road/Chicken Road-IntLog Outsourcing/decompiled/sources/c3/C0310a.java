package c3;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0310a f4919b = new C0310a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0310a f4920c = new C0310a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4921a;

    public /* synthetic */ C0310a(int i2) {
        this.f4921a = i2;
    }

    public final String toString() {
        switch (this.f4921a) {
            case 0:
                return "DefaultContextPropagators{textMapPropagator=" + f4920c + "}";
            default:
                return "NoopTextMapPropagator";
        }
    }
}
