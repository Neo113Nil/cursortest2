package D1;

import B1.AbstractC2531a;
import B1.C2536e;
import B1.InterfaceC2534c;
import B1.InterfaceC2552v;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q0 {

    /* loaded from: classes8.dex */
    public interface a {
        @NotNull
        B1.W a(@NotNull C2536e c2536e, @NotNull B1.U u11, long j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements B1.U {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC2552v f5549a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final d f5550b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final e f5551c;

        public b(@NotNull InterfaceC2552v interfaceC2552v, @NotNull d dVar, @NotNull e eVar) {
            this.f5549a = interfaceC2552v;
            this.f5550b = dVar;
            this.f5551c = eVar;
        }

        @Override // B1.InterfaceC2552v
        public final int D(int i11) {
            return this.f5549a.D(i11);
        }

        @Override // B1.InterfaceC2552v
        public final int O(int i11) {
            return this.f5549a.O(i11);
        }

        @Override // B1.InterfaceC2552v
        public final int T(int i11) {
            return this.f5549a.T(i11);
        }

        @Override // B1.InterfaceC2552v
        public final int Y(int i11) {
            return this.f5549a.Y(i11);
        }

        @Override // B1.U
        @NotNull
        public final B1.m0 a0(long j11) {
            e eVar = e.Width;
            e eVar2 = this.f5551c;
            d dVar = this.f5550b;
            InterfaceC2552v interfaceC2552v = this.f5549a;
            if (eVar2 == eVar) {
                return new c(dVar == d.Max ? interfaceC2552v.Y(Z1.b.j(j11)) : interfaceC2552v.T(Z1.b.j(j11)), Z1.b.f(j11) ? Z1.b.j(j11) : 32767);
            }
            return new c(Z1.b.g(j11) ? Z1.b.k(j11) : 32767, dVar == d.Max ? interfaceC2552v.D(Z1.b.k(j11)) : interfaceC2552v.O(Z1.b.k(j11)));
        }

        @Override // B1.InterfaceC2552v
        public final Object m() {
            return this.f5549a.m();
        }
    }

    private static final class c extends B1.m0 {
        public c(int i11, int i12) {
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
    static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d Max;
        public static final d Min;

        static {
            d dVar = new d("Min", 0);
            Min = dVar;
            d dVar2 = new d("Max", 1);
            Max = dVar2;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e Height;
        public static final e Width;

        static {
            e eVar = new e("Width", 0);
            Width = eVar;
            e eVar2 = new e("Height", 1);
            Height = eVar2;
            $VALUES = new e[]{eVar, eVar2};
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public static int a(@NotNull a aVar, @NotNull InterfaceC2534c interfaceC2534c, @NotNull AbstractC2810k0 abstractC2810k0, int i11) {
        return aVar.a(new C2536e(interfaceC2534c, interfaceC2534c.getLayoutDirection()), new b(abstractC2810k0, d.Max, e.Height), Z1.c.b(i11, 0, 13)).getHeight();
    }

    public static int b(@NotNull a aVar, @NotNull InterfaceC2534c interfaceC2534c, @NotNull AbstractC2810k0 abstractC2810k0, int i11) {
        return aVar.a(new C2536e(interfaceC2534c, interfaceC2534c.getLayoutDirection()), new b(abstractC2810k0, d.Max, e.Width), Z1.c.b(0, i11, 7)).getWidth();
    }

    public static int c(@NotNull a aVar, @NotNull InterfaceC2534c interfaceC2534c, @NotNull AbstractC2810k0 abstractC2810k0, int i11) {
        return aVar.a(new C2536e(interfaceC2534c, interfaceC2534c.getLayoutDirection()), new b(abstractC2810k0, d.Min, e.Height), Z1.c.b(i11, 0, 13)).getHeight();
    }

    public static int d(@NotNull a aVar, @NotNull InterfaceC2534c interfaceC2534c, @NotNull AbstractC2810k0 abstractC2810k0, int i11) {
        return aVar.a(new C2536e(interfaceC2534c, interfaceC2534c.getLayoutDirection()), new b(abstractC2810k0, d.Min, e.Width), Z1.c.b(0, i11, 7)).getWidth();
    }
}
