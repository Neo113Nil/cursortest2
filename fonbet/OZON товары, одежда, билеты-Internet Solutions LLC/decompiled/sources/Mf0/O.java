package Mf0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.InterfaceC4008j;
import androidx.lifecycle.w0;
import h3.C6788a;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8918a;
import retrofit2.Retrofit;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class O extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pf0.m f17980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f17981b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f17982c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f17983d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<N> f17984e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<N> f17985f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.main.ONDebugMenuViewModel$1", f = "ONDebugMenuViewModel.kt", l = {76}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        N f17986d;

        /* renamed from: e, reason: collision with root package name */
        String f17987e;

        /* renamed from: f, reason: collision with root package name */
        int f17988f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return O.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            N n11;
            String str;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f17988f;
            O o11 = O.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                n11 = (N) o11.f17984e.getValue();
                String url = O.g0(o11, false, false).baseUrl().x().toString();
                Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                InterfaceC8918a e02 = O.e0(o11);
                this.f17986d = n11;
                this.f17987e = url;
                this.f17988f = 1;
                Serializable a11 = e02.a(this);
                if (a11 == aVar) {
                    return aVar;
                }
                str = url;
                obj = a11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = this.f17987e;
                n11 = this.f17986d;
                Sc.s.b(obj);
                str = str2;
            }
            N n12 = n11;
            Map map = (Map) obj;
            Cf0.J j11 = pf0.m.f80514a;
            if (j11 == null) {
                throw new RuntimeException("NetworkDi must be initialized.");
            }
            o11.f17984e.setValue(N.a(n12, null, str, map, j11.l().b(), 1));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<InterfaceC8918a> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC8918a invoke() {
            return O.this.f17980a.x();
        }
    }

    public O(@NotNull pf0.m ozonNetworkPlugin) {
        Intrinsics.checkNotNullParameter(ozonNetworkPlugin, "ozonNetworkPlugin");
        this.f17980a = ozonNetworkPlugin;
        this.f17981b = new LinkedHashMap();
        this.f17982c = new LinkedHashMap();
        this.f17983d = Sc.k.b(new b());
        x0<N> a11 = O0.a(new N(15));
        this.f17984e = a11;
        this.f17985f = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    public static final We.E d0(O o11, boolean z11, boolean z12) {
        o11.getClass();
        C3624f c3624f = new C3624f(z11, z12);
        LinkedHashMap linkedHashMap = o11.f17981b;
        Object obj = linkedHashMap.get(c3624f);
        if (obj == null) {
            obj = o11.f17980a.y(new S(z11, z12));
            linkedHashMap.put(c3624f, obj);
        }
        return (We.E) obj;
    }

    public static final InterfaceC8918a e0(O o11) {
        return (InterfaceC8918a) o11.f17983d.getValue();
    }

    public static final Retrofit g0(O o11, boolean z11, boolean z12) {
        o11.getClass();
        C3624f c3624f = new C3624f(z11, z12);
        LinkedHashMap linkedHashMap = o11.f17982c;
        Object obj = linkedHashMap.get(c3624f);
        if (obj == null) {
            obj = o11.f17980a.j(new S(z11, z12));
            linkedHashMap.put(c3624f, obj);
        }
        return (Retrofit) obj;
    }

    @NotNull
    public final M0<N> getUiState() {
        return this.f17985f;
    }

    @NotNull
    public final void i0(@NotNull String headerKey) {
        Intrinsics.checkNotNullParameter(headerKey, "headerKey");
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new P(this, headerKey, null), 2);
    }

    @NotNull
    public final void j0(@NotNull String headerKey, @NotNull String headerValue) {
        Intrinsics.checkNotNullParameter(headerKey, "headerKey");
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new T(this, headerKey, headerValue, null), 2);
    }
}
