package L1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f985a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f986b;

    /* renamed from: c, reason: collision with root package name */
    public L1.c f987c;

    /* renamed from: d, reason: collision with root package name */
    public long f988d;

    public a(java.lang.String name, boolean z2) {
        kotlin.jvm.internal.i.e(name, "name");
        this.f985a = name;
        this.f986b = z2;
        this.f988d = -1L;
    }

    public abstract long a();

    public final java.lang.String toString() {
        return this.f985a;
    }
}
