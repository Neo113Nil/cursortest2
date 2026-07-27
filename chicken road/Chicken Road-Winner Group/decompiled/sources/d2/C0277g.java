package d2;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: d2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277g implements InterfaceC0273c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public o2.a f4848a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4849b = C0278h.f4851a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4850c = this;

    public C0277g(o2.a aVar) {
        this.f4848a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f4849b;
        C0278h c0278h = C0278h.f4851a;
        if (obj2 != c0278h) {
            return obj2;
        }
        synchronized (this.f4850c) {
            obj = this.f4849b;
            if (obj == c0278h) {
                o2.a aVar = this.f4848a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f4849b = obj;
                this.f4848a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f4849b != C0278h.f4851a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
