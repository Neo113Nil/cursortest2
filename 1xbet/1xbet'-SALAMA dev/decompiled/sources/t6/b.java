package t6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements A6.a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient A6.a f16461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f16463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16466f;

    public b(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f16462b = obj;
        this.f16463c = cls;
        this.f16464d = str;
        this.f16465e = str2;
        this.f16466f = z4;
    }

    public abstract A6.a b();

    public final c c() {
        Class cls = this.f16463c;
        if (!this.f16466f) {
            return q.a(cls);
        }
        q.f16479a.getClass();
        return new k(cls);
    }
}
