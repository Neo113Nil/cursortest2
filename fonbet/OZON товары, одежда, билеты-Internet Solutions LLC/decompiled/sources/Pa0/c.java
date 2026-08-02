package Pa0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements InterfaceC2395h<List<? extends Ma0.a>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f22118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Na0.a f22119b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f22120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Na0.a f22121b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.domain.env.usecase.impl.GetHostAppEnvironmentsUseCaseImpl$invoke$$inlined$mapNotNull$1$2", f = "GetHostAppEnvironmentsUseCaseImpl.kt", l = {225, 242}, m = "emit")
        /* renamed from: Pa0.c$a$a, reason: collision with other inner class name */
        public static final class C0437a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f22122d;

            /* renamed from: e, reason: collision with root package name */
            int f22123e;

            /* renamed from: f, reason: collision with root package name */
            InterfaceC2397i f22124f;

            public C0437a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f22122d = obj;
                this.f22123e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, Na0.a aVar) {
            this.f22120a = interfaceC2397i;
            this.f22121b = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
        
            if (r4.emit(r9, r2) == r3) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        
            if (r16.f22121b.e(r2) == r3) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0437a c0437a;
            int i11;
            InterfaceC2397i interfaceC2397i;
            ArrayList arrayList;
            if (dVar instanceof C0437a) {
                c0437a = (C0437a) dVar;
                int i12 = c0437a.f22123e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0437a.f22123e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0437a.f22122d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0437a.f22123e;
                    if (i11 != 0) {
                        s.b(obj2);
                        List list = (List) obj;
                        interfaceC2397i = this.f22120a;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(C7714v.z(list2, 10));
                            int i13 = 0;
                            for (T t2 : list2) {
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    C7714v.O0();
                                    throw null;
                                }
                                Da0.a aVar2 = (Da0.a) t2;
                                arrayList.add(new Ma0.a(aVar2.a(), aVar2.b(), aVar2.c(), i13 == C7714v.P(list)));
                                i13 = i14;
                            }
                            if (arrayList != null) {
                                c0437a.f22124f = null;
                                c0437a.f22123e = 2;
                            }
                            return Unit.f71690a;
                        }
                        c0437a.f22124f = interfaceC2397i;
                        c0437a.f22123e = 1;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                            return Unit.f71690a;
                        }
                        interfaceC2397i = c0437a.f22124f;
                        s.b(obj2);
                    }
                    arrayList = null;
                    if (arrayList != null) {
                    }
                    return Unit.f71690a;
                }
            }
            c0437a = new C0437a(dVar);
            Object obj22 = c0437a.f22122d;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0437a.f22123e;
            if (i11 != 0) {
            }
            arrayList = null;
            if (arrayList != null) {
            }
            return Unit.f71690a;
        }
    }

    public c(InterfaceC2395h interfaceC2395h, Na0.a aVar) {
        this.f22118a = interfaceC2395h;
        this.f22119b = aVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super List<? extends Ma0.a>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f22118a.collect(new a(interfaceC2397i, this.f22119b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
