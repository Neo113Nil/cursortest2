package S0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class E<T> extends G0<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F<T> f25196b;

    static final class a extends AbstractC7737t implements Function0<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25197b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            r.k("Unexpected call to default provider");
            throw null;
        }
    }

    public E(@NotNull Function1<? super InterfaceC3994y, ? extends T> function1) {
        super(a.f25197b);
        this.f25196b = new F<>(function1);
    }

    @Override // S0.AbstractC3992x
    public final G1 a() {
        return this.f25196b;
    }

    @Override // S0.G0
    @NotNull
    public final H0<T> c(T t2) {
        return new H0<>(this, t2, t2 == null, null, null, true);
    }
}
