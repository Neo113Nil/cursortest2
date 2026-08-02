package Ci0;

import I1.w;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import ei0.InterfaceC6369b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import lj0.C7967a;
import org.jetbrains.annotations.NotNull;
import ri0.C9283b;
import ri0.InterfaceC9285d;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f5126b = {w.c(g.class, "application", "getApplication()Landroid/app/Application;", 0), w.c(g.class, "tracker", "getTracker()Lru/ozon/tracker/OzonTracker;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f5125a = new g();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final id.f f5127c = Fj0.b.a(a.f5131b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f5128d = k.b(b.f5132b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final id.f f5129e = Fj0.b.a(d.f5134b);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f5130f = k.b(c.f5133b);

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5131b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Application is null. Need before call init method";
        }
    }

    static final class b extends AbstractC7737t implements Function0<InterfaceC9285d> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5132b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC9285d invoke() {
            return C9283b.a().create(g.a(g.f5125a));
        }
    }

    static final class c extends AbstractC7737t implements Function0<f> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5133b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final f invoke() {
            return new f(g.a(g.f5125a));
        }
    }

    static final class d extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5134b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Tracker is null. Need before set tracker";
        }
    }

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Application a(g gVar) {
        gVar.getClass();
        return (Application) f5127c.getValue(gVar, f5126b[0]);
    }

    @NotNull
    public static C7967a b() {
        return ((InterfaceC9285d) f5128d.getValue()).b();
    }

    @NotNull
    public static Object c() {
        return f5130f.getValue();
    }

    @NotNull
    public static pi0.g e() {
        return ((InterfaceC9285d) f5128d.getValue()).a();
    }

    @NotNull
    public final InterfaceC6369b d() {
        return (InterfaceC6369b) f5129e.getValue(this, f5126b[1]);
    }

    public final void f(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        f5127c.setValue(this, f5126b[0], application);
    }

    public final void g(@NotNull InterfaceC6369b interfaceC6369b) {
        Intrinsics.checkNotNullParameter(interfaceC6369b, "<set-?>");
        f5129e.setValue(this, f5126b[1], interfaceC6369b);
    }
}
