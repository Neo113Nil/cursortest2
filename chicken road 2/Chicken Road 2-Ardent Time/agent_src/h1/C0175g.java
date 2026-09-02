package h1;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175g implements h1.InterfaceC0171c, java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public s1.InterfaceC0991a f3298a;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.Object f3299b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f3300c;

    public C0175g(s1.InterfaceC0991a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f3298a = initializer;
        this.f3299b = h1.C0176h.f3301a;
        this.f3300c = this;
    }

    public final java.lang.Object a() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.f3299b;
        h1.C0176h c0176h = h1.C0176h.f3301a;
        if (obj2 != c0176h) {
            return obj2;
        }
        synchronized (this.f3300c) {
            obj = this.f3299b;
            if (obj == c0176h) {
                s1.InterfaceC0991a interfaceC0991a = this.f3298a;
                kotlin.jvm.internal.i.b(interfaceC0991a);
                obj = interfaceC0991a.invoke();
                this.f3299b = obj;
                this.f3298a = null;
            }
        }
        return obj;
    }

    public final java.lang.String toString() {
        return this.f3299b != h1.C0176h.f3301a ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
