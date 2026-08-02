package Y80;

import Sc.s;
import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.E;
import androidx.lifecycle.I0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10720e0;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.navjet.JetNav$navigate$1", f = "JetNav.kt", l = {431}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f34792d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f34793e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f34794f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f34795g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f34796h;

    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f34797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34798c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f34799d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f34800e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, int i11, Bundle bundle, boolean z11) {
            super(0);
            this.f34797b = gVar;
            this.f34798c = i11;
            this.f34799d = bundle;
            this.f34800e = z11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " JetNav navigate withStarted");
            this.f34797b.h1(this.f34798c, this.f34800e, this.f34799d);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, int i11, Bundle bundle, boolean z11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f34793e = gVar;
        this.f34794f = i11;
        this.f34795g = bundle;
        this.f34796h = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f34793e, this.f34794f, this.f34795g, this.f34796h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34792d;
        if (i11 == 0) {
            s.b(obj);
            g gVar = this.f34793e;
            AbstractC5434v m11 = gVar.Y0().m();
            if (m11 != null) {
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 x11 = De.s.f6650a.x();
                boolean t2 = x11.t(getContext());
                int i12 = this.f34794f;
                Bundle bundle = this.f34795g;
                boolean z11 = this.f34796h;
                if (!t2) {
                    if (m11.b() == AbstractC5434v.b.DESTROYED) {
                        throw new E(null);
                    }
                    if (m11.b().compareTo(bVar) >= 0) {
                        L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " JetNav navigate withStarted");
                        gVar.h1(i12, z11, bundle);
                        Unit unit = Unit.f71690a;
                    }
                }
                a aVar2 = new a(gVar, i12, bundle, z11);
                this.f34792d = 1;
                if (I0.a(m11, bVar, t2, x11, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
