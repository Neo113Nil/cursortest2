package F4;

import B0.C2454a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class M<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3033m<Function0<Unit>> f8821a = new C3033m<>(c.f8833b, null);

    public static abstract class a<Key> {

        /* renamed from: a, reason: collision with root package name */
        private final int f8822a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8823b;

        /* renamed from: F4.M$a$a, reason: collision with other inner class name */
        public static final class C0186a<Key> extends a<Key> {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final Key f8824c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0186a(boolean z11, int i11, @NotNull Object key) {
                super(i11, z11);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f8824c = key;
            }

            @Override // F4.M.a
            @NotNull
            public final Key a() {
                return this.f8824c;
            }
        }

        public static final class b<Key> extends a<Key> {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final Key f8825c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(boolean z11, int i11, @NotNull Object key) {
                super(i11, z11);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f8825c = key;
            }

            @Override // F4.M.a
            @NotNull
            public final Key a() {
                return this.f8825c;
            }
        }

        public static final class c<Key> extends a<Key> {

            /* renamed from: c, reason: collision with root package name */
            private final Key f8826c;

            /* JADX WARN: Multi-variable type inference failed */
            public c(boolean z11, int i11, Object obj) {
                super(i11, z11);
                this.f8826c = obj;
            }

            @Override // F4.M.a
            public final Key a() {
                return this.f8826c;
            }
        }

        public a(int i11, boolean z11) {
            this.f8822a = i11;
            this.f8823b = z11;
        }

        public abstract Key a();

        public final int b() {
            return this.f8822a;
        }

        public final boolean c() {
            return this.f8823b;
        }
    }

    public static abstract class b<Key, Value> {

        public static final class a<Key, Value> extends b<Key, Value> {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "Error(throwable=null)";
            }
        }

        /* renamed from: F4.M$b$b, reason: collision with other inner class name */
        public static final class C0187b<Key, Value> extends b<Key, Value> {

            /* renamed from: f, reason: collision with root package name */
            @NotNull
            private static final C0187b f8827f = new C0187b(kotlin.collections.K.f71697a, null, null, 0, 0);

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final List<Value> f8828a;

            /* renamed from: b, reason: collision with root package name */
            private final Key f8829b;

            /* renamed from: c, reason: collision with root package name */
            private final Key f8830c;

            /* renamed from: d, reason: collision with root package name */
            private final int f8831d;

            /* renamed from: e, reason: collision with root package name */
            private final int f8832e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0187b(@NotNull List<? extends Value> data, Key key, Key key2, int i11, int i12) {
                super(0);
                Intrinsics.checkNotNullParameter(data, "data");
                this.f8828a = data;
                this.f8829b = key;
                this.f8830c = key2;
                this.f8831d = i11;
                this.f8832e = i12;
                if (i11 != Integer.MIN_VALUE && i11 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i12 != Integer.MIN_VALUE && i12 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            @NotNull
            public final List<Value> b() {
                return this.f8828a;
            }

            public final int c() {
                return this.f8832e;
            }

            public final int d() {
                return this.f8831d;
            }

            public final Key e() {
                return this.f8830c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0187b)) {
                    return false;
                }
                C0187b c0187b = (C0187b) obj;
                return Intrinsics.d(this.f8828a, c0187b.f8828a) && Intrinsics.d(this.f8829b, c0187b.f8829b) && Intrinsics.d(this.f8830c, c0187b.f8830c) && this.f8831d == c0187b.f8831d && this.f8832e == c0187b.f8832e;
            }

            public final Key f() {
                return this.f8829b;
            }

            public final int hashCode() {
                int hashCode = this.f8828a.hashCode() * 31;
                Key key = this.f8829b;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f8830c;
                return Integer.hashCode(this.f8832e) + C2454a.a(this.f8831d, (hashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31, 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Page(data=");
                sb2.append(this.f8828a);
                sb2.append(", prevKey=");
                sb2.append(this.f8829b);
                sb2.append(", nextKey=");
                sb2.append(this.f8830c);
                sb2.append(", itemsBefore=");
                sb2.append(this.f8831d);
                sb2.append(", itemsAfter=");
                return Ek.a.d(sb2, this.f8832e, ')');
            }
        }

        public /* synthetic */ b(int i11) {
            this();
        }

        private b() {
        }
    }

    static final class c extends AbstractC7737t implements Function1<Function0<? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f8833b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> it = function0;
            Intrinsics.checkNotNullParameter(it, "it");
            it.invoke();
            return Unit.f71690a;
        }
    }

    public final boolean a() {
        return this.f8821a.a();
    }

    public abstract Key b(@NotNull N<Key, Value> n11);

    public final void c() {
        this.f8821a.b();
    }

    public abstract Object d(@NotNull a aVar, @NotNull kotlin.coroutines.jvm.internal.j jVar);

    public final void e(@NotNull Function0<Unit> onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f8821a.c(onInvalidatedCallback);
    }

    public final void f(@NotNull Function0<Unit> onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f8821a.d(onInvalidatedCallback);
    }
}
