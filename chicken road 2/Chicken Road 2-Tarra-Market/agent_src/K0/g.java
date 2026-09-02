package K0;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class g implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public k f202a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f203b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f204c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(U0.a initializer) {
        j.e(initializer, "initializer");
        this.f202a = (k) initializer;
        this.f203b = h.f205a;
        this.f204c = this;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [U0.a, java.lang.Object, kotlin.jvm.internal.k] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f203b;
        h hVar = h.f205a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f204c) {
            obj = this.f203b;
            if (obj == hVar) {
                ?? r12 = this.f202a;
                j.b(r12);
                obj = r12.invoke();
                this.f203b = obj;
                this.f202a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f203b != h.f205a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
