package t6;

import D6.D;

/* loaded from: classes2.dex */
public class l extends m implements A6.c {
    public l(Class cls, String str, String str2, int i7) {
        super(a.f16454a, cls, str, str2, i7);
    }

    @Override // A6.c
    public final void a() {
        if (this.f16469x) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        A6.a d7 = d();
        if (d7 == this) {
            throw new D("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((A6.c) ((A6.d) d7)).a();
    }

    @Override // t6.b
    public final A6.a b() {
        q.f16473a.getClass();
        return this;
    }

    public Object get(Object obj) {
        a();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
