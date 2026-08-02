package J00;

import A00.a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k implements InterfaceC2395h<A00.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f13627a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f13628b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.u.b f13629c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L00.i f13630d;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f13631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f13632b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.u.b f13633c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L00.i f13634d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$multiFetchFlow$$inlined$map$1$2", f = "Middleware.kt", l = {223}, m = "emit")
        /* renamed from: J00.k$a$a, reason: collision with other inner class name */
        public static final class C0257a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f13635d;

            /* renamed from: e, reason: collision with root package name */
            int f13636e;

            public C0257a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f13635d = obj;
                this.f13636e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, b bVar, a.u.b bVar2, L00.i iVar) {
            this.f13631a = interfaceC2397i;
            this.f13632b = bVar;
            this.f13633c = bVar2;
            this.f13634d = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0257a c0257a;
            int i11;
            if (dVar instanceof C0257a) {
                c0257a = (C0257a) dVar;
                int i12 = c0257a.f13636e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0257a.f13636e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0257a.f13635d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0257a.f13636e;
                    if (i11 != 0) {
                        s.b(obj2);
                        P00.k kVar = (P00.k) obj;
                        a.o oVar = new a.o(this.f13633c, kVar.g().i(), kVar);
                        b.g(this.f13632b, oVar, this.f13634d);
                        c0257a.f13636e = 1;
                        if (this.f13631a.emit(oVar, c0257a) == aVar) {
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
            c0257a = new C0257a(dVar);
            Object obj22 = c0257a.f13635d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0257a.f13636e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public k(InterfaceC2395h interfaceC2395h, b bVar, a.u.b bVar2, L00.i iVar) {
        this.f13627a = interfaceC2395h;
        this.f13628b = bVar;
        this.f13629c = bVar2;
        this.f13630d = iVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super A00.a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f13627a.collect(new a(interfaceC2397i, this.f13628b, this.f13629c, this.f13630d), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
