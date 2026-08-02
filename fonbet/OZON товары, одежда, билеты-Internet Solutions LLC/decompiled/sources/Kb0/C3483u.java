package Kb0;

import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;

/* renamed from: Kb0.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3483u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f15733a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC3917k<W2.f>> f15734b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15735c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<SharedPreferences> f15736d;

    /* renamed from: Kb0.u$a */
    static final class a extends AbstractC7737t implements Function0<InterfaceC3917k<W2.f>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC3917k<W2.f> invoke() {
            C3483u c3483u = C3483u.this;
            C3476q c3476q = new C3476q(c3483u);
            String[] elements = {"OZON_ID_ENTRY_PAGE_FEATURE_FLAGS", "UNIQUE_APPLICATION_ID"};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List b02 = C7714v.b0(V2.l.b(c3476q, C7705l.j0(elements)), V2.l.b(new r(c3483u), kotlin.collections.e0.h("first_launch_passed_prefs_key")));
            S2.b bVar = new S2.b(C3479s.f15729b);
            C3481t c3481t = new C3481t(c3483u);
            C10720e0 c10720e0 = C10720e0.f105451a;
            return W2.e.a(bVar, b02, xe.N.a(He.b.f10879b.plus(xe.X0.b())), c3481t);
        }
    }

    /* renamed from: Kb0.u$b */
    static final class b extends AbstractC7737t implements Function0<SharedPreferences> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return C3483u.b(C3483u.this).a();
        }
    }

    /* renamed from: Kb0.u$c */
    static final class c extends AbstractC7737t implements Function0<Bc0.j> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bc0.j invoke() {
            return new Bc0.j(C3483u.this.f15733a);
        }
    }

    public C3483u(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f15733a = di;
        this.f15734b = Sc.k.b(new a());
        this.f15735c = Sc.k.b(new c());
        this.f15736d = Sc.k.b(new b());
    }

    public static final Bc0.j b(C3483u c3483u) {
        return (Bc0.j) c3483u.f15735c.getValue();
    }

    @NotNull
    public final InterfaceC4008j<InterfaceC3917k<W2.f>> c() {
        return this.f15734b;
    }

    @NotNull
    public final InterfaceC4008j<SharedPreferences> d() {
        return this.f15736d;
    }
}
