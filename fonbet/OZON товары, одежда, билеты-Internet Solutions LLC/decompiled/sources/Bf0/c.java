package Bf0;

import Ae.x0;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import qf0.EnumC9053a;
import ve.EnumC10311b;
import vf0.C10315a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$collectPingResults$1", f = "WhitelistingStatusProviderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class c extends kotlin.coroutines.jvm.internal.j implements Function2<qf0.e, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f3712d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10315a f3713e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f3714f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(C10315a c10315a, o oVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f3713e = c10315a;
        this.f3714f = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        c cVar = new c(this.f3713e, this.f3714f, dVar);
        cVar.f3712d = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qf0.e eVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(eVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        b s11;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        b s12;
        wf0.a aVar;
        b s13;
        x0 x0Var5;
        b s14;
        x0 x0Var6;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        qf0.e eVar = (qf0.e) this.f3712d;
        String a11 = eVar.a();
        C10315a c10315a = this.f3713e;
        boolean d11 = Intrinsics.d(a11, c10315a.f());
        o oVar = this.f3714f;
        if (d11) {
            if (eVar.c() == EnumC9053a.NotAvailable) {
                o.l(oVar, eVar);
            }
            EnumC9053a c11 = eVar.c();
            x0Var5 = oVar.f3768k;
            if (c11 == x0Var5.getValue()) {
                return Unit.f71690a;
            }
            s14 = oVar.s();
            s14.c("Белый домен обновлен " + eVar.c());
            x0Var6 = oVar.f3768k;
            x0Var6.setValue(eVar.c());
        } else if (Intrinsics.d(a11, c10315a.b())) {
            EnumC9053a c12 = eVar.c();
            EnumC9053a enumC9053a = EnumC9053a.NotAvailable;
            if (c12 == enumC9053a) {
                o.a(oVar, c10315a);
            }
            o.k(oVar, eVar);
            EnumC9053a c13 = eVar.c();
            x0Var = oVar.f3770m;
            if (c13 == x0Var.getValue()) {
                return Unit.f71690a;
            }
            s11 = oVar.s();
            s11.c("Серый домен обновлен " + eVar.c());
            if (eVar.c() == enumC9053a) {
                x0Var3 = oVar.f3768k;
                if (x0Var3.getValue() == EnumC9053a.Available) {
                    x0Var4 = oVar.f3768k;
                    x0Var4.setValue(EnumC9053a.Unknown);
                    s12 = oVar.s();
                    s12.c("Белый домен сброшен в Unknown");
                    if (c10315a.i()) {
                        aVar = oVar.f3759b;
                        String b11 = c10315a.b();
                        b.Companion companion = kotlin.time.b.INSTANCE;
                        aVar.a(kotlin.time.c.g(3, EnumC10311b.SECONDS), b11);
                        s13 = oVar.s();
                        s13.c("Принудительно запрашиваем статус серого домена");
                    }
                }
            }
            x0Var2 = oVar.f3770m;
            x0Var2.setValue(eVar.c());
        }
        return Unit.f71690a;
    }
}
