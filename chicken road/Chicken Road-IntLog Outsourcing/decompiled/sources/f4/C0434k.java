package f4;

import java.io.Serializable;
import t4.InterfaceC1430a;

/* renamed from: f4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434k implements InterfaceC0428e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1430a f5674a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5675b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5676c;

    public C0434k(InterfaceC1430a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f5674a = initializer;
        this.f5675b = C0442s.f5686a;
        this.f5676c = this;
    }

    @Override // f4.InterfaceC0428e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f5675b;
        C0442s c0442s = C0442s.f5686a;
        if (obj2 != c0442s) {
            return obj2;
        }
        synchronized (this.f5676c) {
            obj = this.f5675b;
            if (obj == c0442s) {
                InterfaceC1430a interfaceC1430a = this.f5674a;
                kotlin.jvm.internal.i.b(interfaceC1430a);
                obj = interfaceC1430a.invoke();
                this.f5675b = obj;
                this.f5674a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f5675b != C0442s.f5686a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
