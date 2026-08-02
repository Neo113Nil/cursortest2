package b1;

import S0.V0;
import S0.n1;
import b1.InterfaceC5512o;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5504g<T> implements InterfaceC5518u, V0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC5515r<T, Object> f55430a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5512o f55431b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f55432c;

    /* renamed from: d, reason: collision with root package name */
    private T f55433d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Object[] f55434e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC5512o.a f55435f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function0<Object> f55436g = new a(this);

    /* renamed from: b1.g$a */
    static final class a extends AbstractC7737t implements Function0<Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5504g<T> f55437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5504g<T> c5504g) {
            super(0);
            this.f55437b = c5504g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C5504g<T> c5504g = this.f55437b;
            InterfaceC5515r interfaceC5515r = ((C5504g) c5504g).f55430a;
            Object obj = ((C5504g) c5504g).f55433d;
            if (obj != null) {
                return interfaceC5515r.b(c5504g, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public C5504g(@NotNull InterfaceC5515r<T, Object> interfaceC5515r, InterfaceC5512o interfaceC5512o, @NotNull String str, T t2, @NotNull Object[] objArr) {
        this.f55430a = interfaceC5515r;
        this.f55431b = interfaceC5512o;
        this.f55432c = str;
        this.f55433d = t2;
        this.f55434e = objArr;
    }

    private final void h() {
        String a11;
        InterfaceC5512o interfaceC5512o = this.f55431b;
        if (this.f55435f != null) {
            throw new IllegalArgumentException(("entry(" + this.f55435f + ") is not null").toString());
        }
        if (interfaceC5512o != null) {
            Function0<? extends Object> function0 = this.f55436g;
            Object invoke = ((a) function0).invoke();
            if (invoke == null || interfaceC5512o.a(invoke)) {
                this.f55435f = interfaceC5512o.b(this.f55432c, function0);
                return;
            }
            if (invoke instanceof c1.t) {
                c1.t tVar = (c1.t) invoke;
                if (tVar.a() == n1.h() || tVar.a() == n1.n() || tVar.a() == n1.k()) {
                    a11 = "MutableState containing " + tVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a11 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a11 = C5503f.a(invoke);
            }
            throw new IllegalArgumentException(a11);
        }
    }

    @Override // b1.InterfaceC5518u
    public final boolean a(@NotNull Object obj) {
        InterfaceC5512o interfaceC5512o = this.f55431b;
        return interfaceC5512o == null || interfaceC5512o.a(obj);
    }

    @Override // S0.V0
    public final void b() {
        h();
    }

    @Override // S0.V0
    public final void d() {
        InterfaceC5512o.a aVar = this.f55435f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // S0.V0
    public final void e() {
        InterfaceC5512o.a aVar = this.f55435f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final T g(@NotNull Object[] objArr) {
        if (Arrays.equals(objArr, this.f55434e)) {
            return this.f55433d;
        }
        return null;
    }

    public final void i(@NotNull InterfaceC5515r<T, Object> interfaceC5515r, InterfaceC5512o interfaceC5512o, @NotNull String str, T t2, @NotNull Object[] objArr) {
        boolean z11;
        boolean z12 = true;
        if (this.f55431b != interfaceC5512o) {
            this.f55431b = interfaceC5512o;
            z11 = true;
        } else {
            z11 = false;
        }
        if (Intrinsics.d(this.f55432c, str)) {
            z12 = z11;
        } else {
            this.f55432c = str;
        }
        this.f55430a = interfaceC5515r;
        this.f55433d = t2;
        this.f55434e = objArr;
        InterfaceC5512o.a aVar = this.f55435f;
        if (aVar == null || !z12) {
            return;
        }
        aVar.a();
        this.f55435f = null;
        h();
    }
}
