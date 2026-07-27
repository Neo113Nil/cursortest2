package W4;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3420a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3421b;

    /* renamed from: c, reason: collision with root package name */
    public c f3422c;

    /* renamed from: d, reason: collision with root package name */
    public long f3423d;

    public a(String name, boolean z) {
        i.e(name, "name");
        this.f3420a = name;
        this.f3421b = z;
        this.f3423d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3420a;
    }
}
