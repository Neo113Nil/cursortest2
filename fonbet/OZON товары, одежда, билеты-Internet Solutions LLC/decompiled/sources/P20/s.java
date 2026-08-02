package P20;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import P20.d;
import Sc.InterfaceC4008j;
import androidx.lifecycle.w0;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w20.C10420b;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;

/* loaded from: classes3.dex */
public final class s extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10420b f21727a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f21728b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f21729c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<e> f21730d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final M0<e> f21731e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f21732f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.presentation.localization.sources.SourcesListViewModel$1", f = "SourcesListViewModel.kt", l = {34}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f21733d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C20.f f21734e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f21735f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C20.f fVar, s sVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21734e = fVar;
            this.f21735f = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f21734e, this.f21735f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            e a11;
            List<D20.d> b11;
            List<D20.d> b12;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21733d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f21733d = 1;
                obj = this.f21734e.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            D20.c report = (D20.c) obj;
            String actualVersion = report.d();
            s sVar = this.f21735f;
            sVar.f21729c.getClass();
            Intrinsics.checkNotNullParameter(actualVersion, "actualVersion");
            List l11 = kotlin.text.h.l(actualVersion, new char[]{'.'}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
            Iterator it = l11.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            int intValue = ((Number) arrayList.get(0)).intValue();
            d dVar = intValue > 1 ? d.b.f21702a : intValue < 1 ? d.c.f21703a : d.a.f21701a;
            x0 x0Var = sVar.f21730d;
            do {
                value = x0Var.getValue();
                e eVar = (e) value;
                if (dVar instanceof d.a) {
                    sVar.f21728b.getClass();
                    Intrinsics.checkNotNullParameter(report, "report");
                    ArrayList p02 = C7714v.p0(report.c(), report.a());
                    ArrayList arrayList2 = new ArrayList(C7714v.z(p02, 10));
                    Iterator it2 = p02.iterator();
                    while (it2.hasNext()) {
                        D20.e eVar2 = (D20.e) it2.next();
                        D20.b a12 = M20.a.a(eVar2.b());
                        arrayList2.add(new P20.b(eVar2.a(), (a12 == null || (b12 = a12.b()) == null) ? 0 : b12.size()));
                    }
                    List<D20.e> b13 = report.b();
                    ArrayList arrayList3 = new ArrayList(C7714v.z(b13, 10));
                    for (D20.e eVar3 : b13) {
                        D20.b a13 = M20.a.a(eVar3.b());
                        arrayList3.add(new P20.b(eVar3.a(), (a13 == null || (b11 = a13.b()) == null) ? 0 : b11.size()));
                    }
                    a11 = new e(arrayList2, arrayList3, null, 4);
                } else if (dVar instanceof d.b) {
                    a11 = e.a(eVar, new Q20.a("🐞 Не удалось прочитать отчет о строках", "Текущая версия библиотеки DebugMenu(v2.4.1) устарела и не поддерживает отображение отчета версии ".concat(actualVersion)));
                } else {
                    if (!(dVar instanceof d.c)) {
                        throw new Sc.o();
                    }
                    a11 = e.a(eVar, new Q20.a("🐞 Не удалось прочитать отчет о строках", "Текущая версия gradle-плагина Localz устарела и не поддерживается данной версией DebugMenu(v2.4.1).\n\nВерсия отчета: ".concat(actualVersion)));
                }
            } while (!x0Var.b(value, a11));
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function0<J> {
        @Override // kotlin.jvm.functions.Function0
        public final J invoke() {
            s sVar = (s) this.receiver;
            sVar.getClass();
            return new t(J.f105405n0, sVar);
        }
    }

    public s(@NotNull C10420b debugMenuRouter, @NotNull f converter, @NotNull c versionComparator, @NotNull C20.f repository) {
        Intrinsics.checkNotNullParameter(debugMenuRouter, "debugMenuRouter");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(versionComparator, "versionComparator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f21727a = debugMenuRouter;
        this.f21728b = converter;
        this.f21729c = versionComparator;
        x0<e> a11 = O0.a(new e(null, null, null, 7));
        this.f21730d = a11;
        this.f21731e = C2399j.b(a11);
        InterfaceC4008j b11 = Sc.k.b(new b(0, this, s.class, "createErrorHandler", "createErrorHandler()Lkotlinx/coroutines/CoroutineExceptionHandler;", 0));
        this.f21732f = b11;
        C6788a a12 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a12, He.b.f10879b.plus((J) b11.getValue()), null, new a(repository, this, null), 2);
    }

    public final void g0() {
        this.f21727a.d();
    }

    @NotNull
    public final M0<e> getState() {
        return this.f21731e;
    }
}
