package g0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements j0.a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient j0.a f533b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f534c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f535d;

    /* renamed from: e, reason: collision with root package name */
    public final String f536e;

    /* renamed from: f, reason: collision with root package name */
    public final String f537f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f538g;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f534c = obj;
        this.f535d = cls;
        this.f536e = str;
        this.f537f = str2;
        this.f538g = z2;
    }

    public final d b() {
        boolean z2 = this.f538g;
        Class cls = this.f535d;
        if (!z2) {
            return l.a(cls);
        }
        l.f547a.getClass();
        return new j(cls);
    }
}
