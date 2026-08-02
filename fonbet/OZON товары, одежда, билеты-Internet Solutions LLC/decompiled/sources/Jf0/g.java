package Jf0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements InterfaceC2395h<Collection<? extends Lf0.c>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x0 f14735a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f14736a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityRepository$dataFlow$2$invoke$$inlined$map$1$2", f = "DomainReachabilityRepository.kt", l = {223}, m = "emit")
        /* renamed from: Jf0.g$a$a, reason: collision with other inner class name */
        public static final class C0278a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f14737d;

            /* renamed from: e, reason: collision with root package name */
            int f14738e;

            public C0278a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f14737d = obj;
                this.f14738e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f14736a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0278a c0278a;
            int i11;
            if (dVar instanceof C0278a) {
                c0278a = (C0278a) dVar;
                int i12 = c0278a.f14738e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0278a.f14738e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0278a.f14737d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0278a.f14738e;
                    if (i11 != 0) {
                        s.b(obj2);
                        Collection values = ((Map) obj).values();
                        c0278a.f14738e = 1;
                        if (this.f14736a.emit(values, c0278a) == aVar) {
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
            c0278a = new C0278a(dVar);
            Object obj22 = c0278a.f14737d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0278a.f14738e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public g(x0 x0Var) {
        this.f14735a = x0Var;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Collection<? extends Lf0.c>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f14735a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
