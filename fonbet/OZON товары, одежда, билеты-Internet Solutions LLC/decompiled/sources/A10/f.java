package A10;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Function1<? super String, Unit> f287a;

    /* renamed from: b, reason: collision with root package name */
    private Function1<? super String, Unit> f288b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f289c = a.f293b;

    /* renamed from: d, reason: collision with root package name */
    private Function0<Unit> f290d;

    /* renamed from: e, reason: collision with root package name */
    private Function0<Unit> f291e;

    /* renamed from: f, reason: collision with root package name */
    private Function0<Unit> f292f;

    static final class a extends AbstractC7737t implements Function2<String, Exception, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f293b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Exception exc) {
            Exception e11 = exc;
            Intrinsics.checkNotNullParameter(e11, "e");
            H00.c.c(e11);
            return Unit.f71690a;
        }
    }

    public final Function0<Unit> a() {
        return this.f292f;
    }

    public final Function1<String, Unit> b() {
        return this.f288b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<java.lang.String, java.lang.Exception, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function2<String, Exception, Unit> c() {
        return this.f289c;
    }

    public final Function1<String, Unit> d() {
        return this.f287a;
    }

    public final Function0<Unit> e() {
        return this.f291e;
    }

    public final Function0<Unit> f() {
        return this.f290d;
    }

    public final void g(Function0<Unit> function0) {
        this.f292f = function0;
    }

    public final void h(Function1<? super String, Unit> function1) {
        this.f288b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(@NotNull Function2<? super String, ? super Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f289c = (AbstractC7737t) function2;
    }

    public final void j(Function1<? super String, Unit> function1) {
        this.f287a = function1;
    }

    public final void k(Function0<Unit> function0) {
        this.f291e = function0;
    }

    public final void l(Function0<Unit> function0) {
        this.f290d = function0;
    }
}
