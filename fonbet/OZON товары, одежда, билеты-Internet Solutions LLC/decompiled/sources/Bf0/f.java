package Bf0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.K;
import xe.C10740o0;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$forcePingExtraDomains$1", f = "WhitelistingStatusProviderImpl.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3720d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f3721e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f3722f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ List<String> f3723g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f3724a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f3725b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f3726c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M f3727d;

        a(o oVar, K k11, List<String> list, M m11) {
            this.f3724a = oVar;
            this.f3725b = k11;
            this.f3726c = list;
            this.f3727d = m11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            qf0.e eVar = (qf0.e) obj;
            o oVar = this.f3724a;
            o.o(oVar, eVar);
            o.j(oVar, eVar);
            K k11 = this.f3725b;
            int i11 = k11.f71785a + 1;
            k11.f71785a = i11;
            if (i11 == this.f3726c.size()) {
                N.c(this.f3727d, C10740o0.a("Отменяем джобу, т.к. достигли лимита", null));
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(o oVar, List<String> list, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f3722f = oVar;
        this.f3723g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        f fVar = new f(this.f3722f, this.f3723g, dVar);
        fVar.f3721e = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        wf0.a aVar;
        J j11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3720d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f3721e;
            K k11 = new K();
            o oVar = this.f3722f;
            aVar = oVar.f3759b;
            List<String> list = this.f3723g;
            String[] strArr = (String[]) list.toArray(new String[0]);
            InterfaceC2395h<qf0.e> c11 = aVar.c((String[]) Arrays.copyOf(strArr, strArr.length));
            j11 = oVar.f3763f;
            InterfaceC2395h a11 = C5427n.a(c11, ((ProcessLifecycleOwner) j11).getLifecycle(), AbstractC5434v.b.STARTED);
            a aVar3 = new a(oVar, k11, list, m11);
            this.f3720d = 1;
            if (((AbstractC2635g) a11).collect(aVar3, this) == aVar2) {
                return aVar2;
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
