package J00;

import A00.a;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements InterfaceC2395h<A00.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2408n0 f13600a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f13601b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A00.a f13602c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L00.i f13603d;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f13604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f13605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A00.a f13606c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L00.i f13607d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$jsonFlow$$inlined$map$1$2", f = "Middleware.kt", l = {223}, m = "emit")
        /* renamed from: J00.g$a$a, reason: collision with other inner class name */
        public static final class C0256a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f13608d;

            /* renamed from: e, reason: collision with root package name */
            int f13609e;

            public C0256a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f13608d = obj;
                this.f13609e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, b bVar, A00.a aVar, L00.i iVar) {
            this.f13604a = interfaceC2397i;
            this.f13605b = bVar;
            this.f13606c = aVar;
            this.f13607d = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0256a c0256a;
            int i11;
            if (dVar instanceof C0256a) {
                c0256a = (C0256a) dVar;
                int i12 = c0256a.f13609e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0256a.f13609e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0256a.f13608d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0256a.f13609e;
                    if (i11 != 0) {
                        s.b(obj2);
                        a.o oVar = new a.o(this.f13606c, null, (P00.k) obj);
                        b.g(this.f13605b, oVar, this.f13607d);
                        c0256a.f13609e = 1;
                        if (this.f13604a.emit(oVar, c0256a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c0256a = new C0256a(dVar);
            Object obj22 = c0256a.f13608d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0256a.f13609e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public g(C2408n0 c2408n0, b bVar, A00.a aVar, L00.i iVar) {
        this.f13600a = c2408n0;
        this.f13601b = bVar;
        this.f13602c = aVar;
        this.f13603d = iVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super A00.a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f13600a.collect(new a(interfaceC2397i, this.f13601b, this.f13602c, this.f13603d), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
