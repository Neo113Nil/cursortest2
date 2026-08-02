package Pe0;

import Oe0.d;
import Pe0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import org.maplibre.android.log.Logger;
import we0.u;
import xe.B0;
import xe.C10727i;
import xe.I;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$onInitAction$1", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {78, 79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f22378d;

    /* renamed from: e, reason: collision with root package name */
    int f22379e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f22380f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f22381g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$onInitAction$1$1", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {87, 95, Logger.NONE, 114}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f22382d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d.a f22383e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f22384f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.a aVar, d dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f22383e = aVar;
            this.f22384f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f22383e, this.f22384f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            if (Pe0.d.V(r15.f22384f, r1, r2, r9, r15, 8) == r8) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00d6, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        
            if (Pe0.d.P(r7, r1, r4, r15) == r8) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (Pe0.d.V(r15.f22384f, r1, r3, 10, r15, 8) == r8) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
        
            if (Pe0.d.V(r15.f22384f, r0, 0, 0, r15, 4) == r8) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f22382d;
            if (i11 == 0) {
                Sc.s.b(obj);
                d.a aVar2 = this.f22383e;
                boolean z11 = aVar2 instanceof d.a.b;
                d dVar = this.f22384f;
                if (z11) {
                    d.a.b bVar = (d.a.b) aVar2;
                    ArrayList h11 = dVar.i().h(bVar.c());
                    long a11 = bVar.a();
                    Long b11 = bVar.b();
                    long longValue = b11 != null ? b11.longValue() : 10L;
                    this.f22382d = 1;
                } else if (aVar2 instanceof d.a.C0444d) {
                    d.a.C0444d c0444d = (d.a.C0444d) aVar2;
                    List<String> b12 = c0444d.b();
                    long a12 = c0444d.a();
                    this.f22382d = 2;
                } else if (aVar2 instanceof d.a.c) {
                    d.a.c cVar = (d.a.c) aVar2;
                    List<Pair<u, d.C0411d>> b13 = cVar.b();
                    long a13 = cVar.a();
                    cVar.getClass();
                    this.f22382d = 3;
                } else {
                    if (!(aVar2 instanceof d.a.C0443a)) {
                        throw new Sc.o();
                    }
                    d.a.C0443a c0443a = (d.a.C0443a) aVar2;
                    u uVar = dVar.S().get(c0443a.b());
                    if (uVar == null) {
                        return Unit.f71690a;
                    }
                    ArrayList h12 = dVar.i().h(C7714v.a0(u.a(uVar, null, c0443a.a(), null, null, 1021)));
                    this.f22382d = 4;
                }
            } else {
                if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(d dVar, kotlin.coroutines.d<? super i> dVar2) {
        super(2, dVar2);
        this.f22381g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        i iVar = new i(this.f22381g, dVar);
        iVar.f22380f = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0053 -> B:7:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:6:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        B0 b02;
        M m12;
        d.a aVar;
        we0.o oVar;
        M q11;
        I i11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f22379e;
        d dVar = this.f22381g;
        if (i12 == 0) {
            Sc.s.b(obj);
            m11 = (M) this.f22380f;
            b02 = null;
            if (!N.f(m11)) {
            }
        } else if (i12 == 1) {
            b02 = (B0) this.f22378d;
            m12 = (M) this.f22380f;
            Sc.s.b(obj);
            aVar = (d.a) obj;
            if (b02 != null) {
            }
            q11 = dVar.q();
            i11 = dVar.f22333p;
            b02 = C10727i.c(q11, i11, null, new a(aVar, dVar, null), 2);
            m11 = m12;
            if (!N.f(m11)) {
            }
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.a aVar3 = (d.a) this.f22378d;
            m12 = (M) this.f22380f;
            Sc.s.b(obj);
            aVar = aVar3;
            q11 = dVar.q();
            i11 = dVar.f22333p;
            b02 = C10727i.c(q11, i11, null, new a(aVar, dVar, null), 2);
            m11 = m12;
            if (!N.f(m11)) {
                oVar = dVar.f22336s;
                this.f22380f = m11;
                this.f22378d = b02;
                this.f22379e = 1;
                Object g10 = oVar.g(this);
                if (g10 != aVar2) {
                    m12 = m11;
                    obj = g10;
                    aVar = (d.a) obj;
                    if (b02 != null) {
                        this.f22380f = m12;
                        this.f22378d = aVar;
                        this.f22379e = 2;
                        if (b02.r0(this) != aVar2) {
                            aVar3 = aVar;
                            aVar = aVar3;
                        }
                    }
                    q11 = dVar.q();
                    i11 = dVar.f22333p;
                    b02 = C10727i.c(q11, i11, null, new a(aVar, dVar, null), 2);
                    m11 = m12;
                    if (!N.f(m11)) {
                        return Unit.f71690a;
                    }
                }
                return aVar2;
            }
        }
    }
}
