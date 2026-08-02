package If0;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$onPrintDomainStatusesClicked$1", f = "DomainReachabilityViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class T extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f12408d;

    static final class a extends AbstractC7737t implements Function1<Map.Entry<? extends String, ? extends EnumC9053a>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12409b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<? extends String, ? extends EnumC9053a> entry) {
            Map.Entry<? extends String, ? extends EnumC9053a> entry2 = entry;
            Intrinsics.checkNotNullParameter(entry2, "<destruct>");
            return Rf0.a.a(entry2.getKey(), entry2.getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(K k11, kotlin.coroutines.d<? super T> dVar) {
        super(2, dVar);
        this.f12408d = k11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new T(this.f12408d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((T) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Jf0.b bVar;
        Af0.a aVar;
        boolean d11;
        ru.ozon.android.ozonLogger.core.h a11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        K k11 = this.f12408d;
        bVar = k11.f12376a;
        bVar.getClass();
        wf0.a b11 = wf0.c.b();
        Map h11 = b11 != null ? b11.b().g().h() : null;
        if (h11 == null) {
            h11 = kotlin.collections.U.c();
        }
        aVar = k11.f12377b;
        d11 = aVar.d();
        if (d11 && (a11 = Af0.a.a(aVar)) != null) {
            a11.b("OZON_NETWORK_PING_STATUS " + ((Object) C7714v.V(h11.entrySet(), ", ", null, null, a.f12409b, 30)), null, null);
        }
        return Unit.f71690a;
    }
}
