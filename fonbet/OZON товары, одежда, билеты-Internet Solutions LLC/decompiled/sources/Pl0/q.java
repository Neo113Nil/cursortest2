package Pl0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Za.d f22702a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22703b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4008j f22704c;

    public static final class a extends AbstractC7737t implements Function0<Yl0.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f22705b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Yl0.e invoke() {
            h.f22655a.getClass();
            return new Yl0.e((Nl0.j) h.f22672r.getValue());
        }
    }

    public static final class b extends AbstractC7737t implements Function0<Yl0.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f22706b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Yl0.e invoke() {
            h.f22655a.getClass();
            return new Yl0.e((Nl0.j) h.f22672r.getValue());
        }
    }

    static {
        El0.n nVar = e.f22651b;
        f22702a = nVar != null ? nVar.f8117c : new Za.b("VkpnsClientSdk");
        f22703b = Sc.k.b(a.f22705b);
        f22704c = Sc.k.b(b.f22706b);
    }

    @NotNull
    public static Yl0.e a() {
        if (e.f22651b != null) {
            return (Yl0.e) f22704c.getValue();
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }
}
