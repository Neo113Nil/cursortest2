package U5;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLong f6417d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final String f6418a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6419b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6420c;

    public F(String str, String str2, long j) {
        p3.f.k(str, "typeName");
        p3.f.d("empty type", !str.isEmpty());
        this.f6418a = str;
        this.f6419b = str2;
        this.f6420c = j;
    }

    public static F a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new F(simpleName, str, f6417d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6418a + "<" + this.f6420c + ">");
        String str = this.f6419b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
