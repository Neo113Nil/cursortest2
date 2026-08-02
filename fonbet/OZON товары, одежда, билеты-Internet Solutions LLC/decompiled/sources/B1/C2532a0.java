package B1;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2532a0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1.a0$a */
    static final class a implements U {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final D1.V f2092a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final c f2093b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final d f2094c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull InterfaceC2552v interfaceC2552v, @NotNull c cVar, @NotNull d dVar) {
            this.f2092a = (D1.V) interfaceC2552v;
            this.f2093b = cVar;
            this.f2094c = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [B1.v, D1.V] */
        @Override // B1.InterfaceC2552v
        public final int D(int i11) {
            return this.f2092a.D(i11);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [B1.v, D1.V] */
        @Override // B1.InterfaceC2552v
        public final int O(int i11) {
            return this.f2092a.O(i11);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [B1.v, D1.V] */
        @Override // B1.InterfaceC2552v
        public final int T(int i11) {
            return this.f2092a.T(i11);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [B1.v, D1.V] */
        @Override // B1.InterfaceC2552v
        public final int Y(int i11) {
            return this.f2092a.Y(i11);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [B1.v, D1.V] */
        @Override // B1.U
        @NotNull
        public final m0 a0(long j11) {
            d dVar = d.Width;
            ?? r12 = this.f2092a;
            d dVar2 = this.f2094c;
            c cVar = this.f2093b;
            if (dVar2 == dVar) {
                return new b(cVar == c.Max ? r12.Y(Z1.b.j(j11)) : r12.T(Z1.b.j(j11)), Z1.b.f(j11) ? Z1.b.j(j11) : 32767);
            }
            return new b(Z1.b.g(j11) ? Z1.b.k(j11) : 32767, cVar == c.Max ? r12.D(Z1.b.k(j11)) : r12.O(Z1.b.k(j11)));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [B1.v, D1.V] */
        @Override // B1.InterfaceC2552v
        public final Object m() {
            return this.f2092a.m();
        }
    }

    /* renamed from: B1.a0$b */
    private static final class b extends m0 {
        public b(int i11, int i12) {
            E0(Z1.r.a(i11, i12));
        }

        @Override // B1.Z
        public final int E(@NotNull AbstractC2531a abstractC2531a) {
            return LinearLayoutManager.INVALID_OFFSET;
        }

        @Override // B1.m0
        protected final void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: B1.a0$c */
    static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c Max;
        public static final c Min;

        static {
            c cVar = new c("Min", 0);
            Min = cVar;
            c cVar2 = new c("Max", 1);
            Max = cVar2;
            $VALUES = new c[]{cVar, cVar2};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: B1.a0$d */
    static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d Height;
        public static final d Width;

        static {
            d dVar = new d("Width", 0);
            Width = dVar;
            d dVar2 = new d("Height", 1);
            Height = dVar2;
            $VALUES = new d[]{dVar, dVar2};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public static int a(@NotNull J j11, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return j11.D(new A(v11, v11.getLayoutDirection()), new a(interfaceC2552v, c.Max, d.Height), Z1.c.b(i11, 0, 13)).getHeight();
    }

    public static int b(@NotNull J j11, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return j11.D(new A(v11, v11.getLayoutDirection()), new a(interfaceC2552v, c.Max, d.Width), Z1.c.b(0, i11, 7)).getWidth();
    }

    public static int c(@NotNull J j11, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return j11.D(new A(v11, v11.getLayoutDirection()), new a(interfaceC2552v, c.Min, d.Height), Z1.c.b(i11, 0, 13)).getHeight();
    }

    public static int d(@NotNull J j11, @NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return j11.D(new A(v11, v11.getLayoutDirection()), new a(interfaceC2552v, c.Min, d.Width), Z1.c.b(0, i11, 7)).getWidth();
    }
}
