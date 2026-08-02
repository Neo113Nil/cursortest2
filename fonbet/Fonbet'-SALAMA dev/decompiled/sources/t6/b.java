package t6;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class b implements A6.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient A6.a f16455a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16456b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f16457c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16458d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16459e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16460f;

    public b(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f16456b = obj;
        this.f16457c = cls;
        this.f16458d = str;
        this.f16459e = str2;
        this.f16460f = z4;
    }

    public abstract A6.a b();

    public final c c() {
        Class cls = this.f16457c;
        if (!this.f16460f) {
            return q.a(cls);
        }
        q.f16473a.getClass();
        return new k(cls);
    }
}
