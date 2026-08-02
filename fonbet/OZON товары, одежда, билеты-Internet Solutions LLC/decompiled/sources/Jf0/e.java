package Jf0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jf0.a;
import Jf0.b;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e implements InterfaceC2395h<Lf0.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.d f14727a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wf0.b f14728b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f14729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ wf0.b f14730b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityRepository$configParamsFlow$2$invoke$$inlined$map$1$2", f = "DomainReachabilityRepository.kt", l = {223}, m = "emit")
        /* renamed from: Jf0.e$a$a, reason: collision with other inner class name */
        public static final class C0277a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f14731d;

            /* renamed from: e, reason: collision with root package name */
            int f14732e;

            public C0277a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f14731d = obj;
                this.f14732e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, wf0.b bVar) {
            this.f14729a = interfaceC2397i;
            this.f14730b = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0277a c0277a;
            int i11;
            b.a aVar;
            if (dVar instanceof C0277a) {
                c0277a = (C0277a) dVar;
                int i12 = c0277a.f14732e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0277a.f14732e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0277a.f14731d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0277a.f14732e;
                    if (i11 != 0) {
                        s.b(obj2);
                        aVar = b.f14715g;
                        Lf0.b a11 = b.a.a(aVar, (Lf0.f) obj, this.f14730b);
                        c0277a.f14732e = 1;
                        if (this.f14729a.emit(a11, c0277a) == aVar2) {
                            return aVar2;
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
            c0277a = new C0277a(dVar);
            Object obj22 = c0277a.f14731d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0277a.f14732e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public e(a.d dVar, wf0.b bVar) {
        this.f14727a = dVar;
        this.f14728b = bVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Lf0.b> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f14727a.collect(new a(interfaceC2397i, this.f14728b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
