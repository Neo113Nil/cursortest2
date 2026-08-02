package J00;

import A00.a;
import Ae.InterfaceC2397i;
import H00.b;
import Sc.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l20.C7854a;
import x00.C10622a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$onFirstLoad$1", f = "Middleware.kt", l = {156, 165, 181}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super A00.a>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    ArrayList f13655d;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f13656e;

    /* renamed from: f, reason: collision with root package name */
    int f13657f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f13658g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ a.u.C0013a f13659h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13660i;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$onFirstLoad$1$1", f = "Middleware.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<T00.j> f13661d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b<C7854a> f13662e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f13663f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f13664g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, b bVar, ArrayList arrayList, ArrayList arrayList2, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f13661d = list;
            this.f13662e = bVar;
            this.f13663f = arrayList;
            this.f13664g = arrayList2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f13661d, this.f13662e, this.f13663f, this.f13664g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            I00.a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            try {
                List<T00.j> list = this.f13661d;
                b<C7854a> bVar = this.f13662e;
                ArrayList arrayList = this.f13663f;
                ArrayList arrayList2 = this.f13664g;
                for (T00.j jVar : list) {
                    aVar = ((b) bVar).f13561k;
                    C7854a b11 = aVar.b(jVar);
                    if (b11.k() == ru.ozon.composer.ui.widget.c.f94864a) {
                        arrayList.add(b11);
                    } else {
                        arrayList2.add(b11);
                    }
                }
            } catch (Exception e11) {
                if (H00.b.a() != b.a.C0214a.a()) {
                    H00.b.a().logError(e11);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(a.u.C0013a c0013a, b<C7854a> bVar, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f13659h = c0013a;
        this.f13660i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        o oVar = new o(this.f13659h, this.f13660i, dVar);
        oVar.f13658g = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super A00.a> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        if (r3.emit(r15, r14) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        if (r15.emit(r3, r14) == r1) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        C00.a aVar;
        C10622a c10622a;
        InterfaceC2397i interfaceC2397i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        b<C7854a> bVar = this.f13660i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13657f;
        a.u.C0013a c0013a = this.f13659h;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            if (H00.b.a() != b.a.C0214a.a()) {
                H00.b.a().logError(e12);
            }
        }
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.f13658g;
            this.f13658g = interfaceC2397i;
            this.f13657f = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                arrayList = this.f13656e;
                arrayList2 = this.f13655d;
                interfaceC2397i2 = (InterfaceC2397i) this.f13658g;
                s.b(obj);
                if (arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    a.H h11 = new a.H(arrayList2, arrayList);
                    this.f13658g = null;
                    this.f13655d = null;
                    this.f13656e = null;
                    this.f13657f = 3;
                }
                return Unit.f71690a;
            }
            InterfaceC2397i interfaceC2397i3 = (InterfaceC2397i) this.f13658g;
            s.b(obj);
            interfaceC2397i = interfaceC2397i3;
        }
        aVar = ((b) bVar).f13560j;
        List<T00.j> widgets = aVar != null ? aVar.getWidgets(c0013a) : null;
        List<T00.j> list = widgets;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            c10622a = ((b) bVar).f13557g;
            c10622a.getClass();
            He.c a11 = C10720e0.a();
            a aVar3 = new a(widgets, this.f13660i, arrayList4, arrayList3, null);
            this.f13658g = interfaceC2397i;
            this.f13655d = arrayList3;
            this.f13656e = arrayList4;
            this.f13657f = 2;
            if (C10727i.f(a11, aVar3, this) == aVar2) {
                return aVar2;
            }
            interfaceC2397i2 = interfaceC2397i;
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            if (arrayList2.isEmpty()) {
            }
            a.H h112 = new a.H(arrayList2, arrayList);
            this.f13658g = null;
            this.f13655d = null;
            this.f13656e = null;
            this.f13657f = 3;
        }
        return Unit.f71690a;
    }
}
