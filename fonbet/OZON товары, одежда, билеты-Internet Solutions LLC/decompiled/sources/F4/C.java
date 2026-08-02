package F4;

import F4.AbstractC3028h;
import Sc.InterfaceC3999a;
import Sc.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

@InterfaceC3999a
/* loaded from: classes8.dex */
public abstract class C<Key, Value> extends AbstractC3028h<Key, Value> {

    public static abstract class a<Key, Value> {
    }

    public static abstract class b<Key, Value> {
    }

    public static class c<Key> {
    }

    public static class d<Key> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Key f8776a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull Object key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f8776a = key;
        }
    }

    @Override // F4.AbstractC3028h
    @NotNull
    public final Key b(@NotNull Value item) {
        Intrinsics.checkNotNullParameter(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // F4.AbstractC3028h
    public final Object f(@NotNull AbstractC3028h.e<Key> eVar, @NotNull kotlin.coroutines.d<? super AbstractC3028h.a<Value>> frame) {
        if (eVar.e() == y.REFRESH) {
            c params = new c();
            C10737n c10737n = new C10737n(1, Wc.b.b(frame));
            c10737n.o();
            E callback = new E();
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            kotlin.collections.K data = kotlin.collections.K.f71697a;
            Intrinsics.checkNotNullParameter(data, "data");
            data.getClass();
            AbstractC3028h.a aVar = new AbstractC3028h.a(data, null, null, 0, 0);
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(aVar);
            Object n11 = c10737n.n();
            if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return n11;
        }
        if (eVar.b() == null) {
            return new AbstractC3028h.a(kotlin.collections.K.f71697a, null, null, 0, 0);
        }
        if (eVar.e() == y.PREPEND) {
            d params2 = new d(eVar.b());
            C10737n c10737n2 = new C10737n(1, Wc.b.b(frame));
            c10737n2.o();
            D callback2 = new D(c10737n2, false);
            Intrinsics.checkNotNullParameter(params2, "params");
            Intrinsics.checkNotNullParameter(callback2, "callback");
            callback2.a(kotlin.collections.K.f71697a);
            Object n12 = c10737n2.n();
            if (n12 == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return n12;
        }
        if (eVar.e() != y.APPEND) {
            throw new IllegalArgumentException(Intrinsics.l(eVar.e(), "Unsupported type "));
        }
        d params3 = new d(eVar.b());
        C10737n c10737n3 = new C10737n(1, Wc.b.b(frame));
        c10737n3.o();
        D callback3 = new D(c10737n3, true);
        Intrinsics.checkNotNullParameter(params3, "params");
        Intrinsics.checkNotNullParameter(callback3, "callback");
        callback3.a(kotlin.collections.K.f71697a);
        Object n13 = c10737n3.n();
        if (n13 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n13;
    }
}
