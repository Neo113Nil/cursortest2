package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7459e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.EnumC8372M;
import n0.W;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;
import r0.EnumC9142v;
import r0.InterfaceC9106G;
import r0.InterfaceC9108I;
import r0.InterfaceC9124d;
import r0.InterfaceC9138r;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<x1.x, Boolean> f39037a = a.f39041b;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final c f39038b = new c();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final b f39039c = new b();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d f39040d = new d();

    static final class a extends AbstractC7737t implements Function1<x1.x, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39041b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(x1.x xVar) {
            return Boolean.valueOf(!(xVar.l() == 2));
        }
    }

    public static final class b implements e1.g {
        @Override // kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(this, r11, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
            return (E) CoroutineContext.Element.a.b(this, aVar);
        }

        @Override // e1.g
        public final float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
            return CoroutineContext.Element.a.c(this, aVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(coroutineContext, this);
        }
    }

    public static final class c implements InterfaceC9106G {
        @Override // r0.InterfaceC9106G
        public final float a(float f7) {
            return f7;
        }
    }

    public static final class d implements Z1.d {
        @Override // Z1.d
        public final float g() {
            return 1.0f;
        }

        @Override // Z1.k
        public final float u1() {
            return 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C9113N c9113n, long j11, kotlin.coroutines.jvm.internal.c cVar) {
        K k11;
        int i11;
        kotlin.jvm.internal.J j12;
        C9113N c9113n2;
        if (cVar instanceof K) {
            k11 = (K) cVar;
            int i12 = k11.f39045g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                k11.f39045g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = k11.f39044f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = k11.f39045g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    j12 = new kotlin.jvm.internal.J();
                    EnumC8372M enumC8372M = EnumC8372M.Default;
                    L l11 = new L(c9113n, j11, j12, null);
                    k11.f39042d = c9113n;
                    k11.f39043e = j12;
                    k11.f39045g = 1;
                    if (c9113n.t(enumC8372M, l11, k11) == aVar) {
                        return aVar;
                    }
                    c9113n2 = c9113n;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.J j13 = k11.f39043e;
                    C9113N c9113n3 = k11.f39042d;
                    Sc.s.b(obj);
                    j12 = j13;
                    c9113n2 = c9113n3;
                }
                return C7459e.a(c9113n2.x(j12.f71784a));
            }
        }
        k11 = new K(cVar);
        Object obj2 = k11.f39044f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = k11.f39045g;
        if (i11 != 0) {
        }
        return C7459e.a(c9113n2.x(j12.f71784a));
    }

    @NotNull
    public static final b e() {
        return f39039c;
    }

    @NotNull
    public static final androidx.compose.ui.e f(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC9108I interfaceC9108I, @NotNull EnumC9142v enumC9142v, W w11, boolean z11, boolean z12, InterfaceC9138r interfaceC9138r, t0.q qVar, InterfaceC9124d interfaceC9124d) {
        return eVar.l0(new ScrollableElement(w11, interfaceC9124d, interfaceC9138r, enumC9142v, interfaceC9108I, qVar, z11, z12));
    }

    public static androidx.compose.ui.e g(androidx.compose.ui.e eVar, InterfaceC9108I interfaceC9108I, EnumC9142v enumC9142v, boolean z11, boolean z12, t0.q qVar) {
        return f(eVar, interfaceC9108I, enumC9142v, null, z11, z12, null, qVar, null);
    }
}
