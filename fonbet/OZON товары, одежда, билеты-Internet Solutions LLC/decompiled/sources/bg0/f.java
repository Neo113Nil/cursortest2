package bg0;

import Nf0.k;
import Sc.InterfaceC4008j;
import Sc.k;
import We.E;
import bg0.i;
import java.util.List;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56002a = k.b(c.f56008b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56003b = k.b(new b());

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56004c = k.b(new d());

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56005d = k.b(new a());

    static final class a extends AbstractC7737t implements Function0<C5661a> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C5661a invoke() {
            return new C5661a(f.a(f.this));
        }
    }

    static final class b extends AbstractC7737t implements Function0<C5662b> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C5662b invoke() {
            return new C5662b(f.a(f.this));
        }
    }

    static final class c extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f56008b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            return new h();
        }
    }

    static final class d extends AbstractC7737t implements Function0<e> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            return new e(f.a(f.this));
        }
    }

    public static final h a(f fVar) {
        return (h) fVar.f56002a.getValue();
    }

    @NotNull
    public final List b(@NotNull E client, @NotNull k.a configuration) {
        i iVar;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        InterfaceC4008j interfaceC4008j = this.f56002a;
        ((h) interfaceC4008j.getValue()).g();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        i a11 = ((C5662b) this.f56003b.getValue()).a(client, configuration);
        InterfaceC4008j interfaceC4008j2 = this.f56004c;
        i a12 = ((e) interfaceC4008j2.getValue()).a(client);
        i a13 = ((C5661a) this.f56005d.getValue()).a(client);
        Intrinsics.checkNotNullParameter(client, "client");
        C7665d it = new IntRange(0, 30, 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                iVar = i.b.f56014a;
                break;
            }
            it.b();
            Intrinsics.checkNotNullParameter(client, "client");
            if (((e) interfaceC4008j2.getValue()).b(client) instanceof i.a) {
                iVar = new i.a("Stress test is failure");
                break;
            }
        }
        List b02 = C7714v.b0(a11, a12, a13, iVar);
        ((h) interfaceC4008j.getValue()).f();
        return b02;
    }
}
