package Bc0;

import Ae.C0;
import Ae.E0;
import Bc0.a;
import Kb0.K;
import Sc.InterfaceC4008j;
import android.app.Application;
import androidx.lifecycle.C5418g0;
import gc0.C6709b;
import hc0.C6910a;
import id0.C7050a;
import jc0.C7339b;
import jc0.C7340c;
import jc0.C7344g;
import kc0.C7629C;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.core.FeatureFlagConf;
import wc0.C10503d;
import xc0.C10702a;
import xe.J;
import xe.M;
import zc0.C11087b;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f3514a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bc0.a f3515b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C11087b f3516c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<cc0.e> f3517d;

    static final class a extends AbstractC7737t implements Function0<cc0.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3518b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final cc0.e invoke() {
            return new cc0.e();
        }
    }

    static final class b extends AbstractC7737t implements Function1<C7629C, C6709b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3520c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0 f3521d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f3522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C0 c02, e eVar) {
            super(1);
            this.f3520c = str;
            this.f3521d = c02;
            this.f3522e = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final C6709b invoke(C7629C c7629c) {
            C7629C it = c7629c;
            Intrinsics.checkNotNullParameter(it, "it");
            return d.c(d.this, this.f3520c, it, this.f3521d, this.f3522e);
        }
    }

    static final class c extends AbstractC7737t implements Function1<FeatureFlagConf, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FeatureFlagConf featureFlagConf) {
            FeatureFlagConf featureFlagConf2 = featureFlagConf;
            Intrinsics.checkNotNullParameter(featureFlagConf2, "featureFlagConf");
            d dVar = d.this;
            dVar.f3515b.m().h(featureFlagConf2.getForceMobileIdOverCellular());
            int i11 = C7339b.f69678e;
            C7339b.e(featureFlagConf2.getAllowedWebViewDomains());
            dVar.f3514a.W().j().getValue().e(featureFlagConf2);
            return Unit.f71690a;
        }
    }

    /* renamed from: Bc0.d$d, reason: collision with other inner class name */
    static final class C0086d extends AbstractC7737t implements Function1<M, C7340c> {
        C0086d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C7340c invoke(M m11) {
            M scope = m11;
            Intrinsics.checkNotNullParameter(scope, "scope");
            return d.this.f3515b.q("EntryCredentials", scope);
        }
    }

    public d(@NotNull K di, @NotNull Bc0.a authDiModule) {
        Intrinsics.checkNotNullParameter(di, "di");
        Intrinsics.checkNotNullParameter(authDiModule, "authDiModule");
        this.f3514a = di;
        this.f3515b = authDiModule;
        this.f3516c = new C11087b();
        this.f3517d = Sc.k.b(a.f3518b);
    }

    public static final C6709b c(d dVar, String str, C7629C c7629c, C0 c02, e eVar) {
        K k11 = dVar.f3514a;
        InterfaceC4008j<C6910a> g10 = k11.W().g();
        Bc0.a aVar = dVar.f3515b;
        return new C6709b(str, c7629c, k11.F(), g10, aVar.h(), aVar.l(), c02, eVar);
    }

    @NotNull
    public final C7629C d(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        C0 b11 = E0.b(0, 0, null, 7);
        Bc0.a aVar = this.f3515b;
        e eVar = new e(J.f105405n0, aVar.l());
        K k11 = this.f3514a;
        InterfaceC4008j<C10702a> h11 = k11.W().h();
        InterfaceC4008j<Pc0.c> h12 = aVar.h();
        InterfaceC4008j<Nc0.f> l11 = aVar.l();
        InterfaceC4008j<C7344g> o11 = aVar.o();
        InterfaceC4008j<cc0.e> interfaceC4008j = this.f3517d;
        InterfaceC4008j<C7050a> a02 = k11.a0();
        Fb0.f N11 = k11.N();
        Application m11 = k11.m();
        InterfaceC4008j<C10503d> e11 = k11.W().e();
        a.n k12 = aVar.k();
        qc0.c value = k11.v().j().getValue();
        qc0.d value2 = k11.v().k().getValue();
        qc0.b value3 = k11.v().i().getValue();
        return new C7629C(screenId, h11, h12, l11, savedStateHandle, this.f3516c, interfaceC4008j, new b(screenId, b11, eVar), eVar, b11, new c(), m11, o11, a02, N11, new C0086d(), e11, k12, value, value2, value3);
    }
}
