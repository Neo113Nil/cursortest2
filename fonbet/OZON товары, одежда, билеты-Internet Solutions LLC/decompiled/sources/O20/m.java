package O20;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import C.D;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.lifecycle.w0;
import h3.C6788a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;

/* loaded from: classes3.dex */
public final class m extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f19900a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C20.f f19901b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f19902c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<k> f19903d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final M0<k> f19904e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f19905f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f19906g;

    /* synthetic */ class a extends C7735q implements Function0<J> {
        @Override // kotlin.jvm.functions.Function0
        public final J invoke() {
            m mVar = (m) this.receiver;
            mVar.getClass();
            return new l(J.f105405n0, mVar);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.presentation.localization.resourceList.ResourceListViewModel$loadResources$1", f = "ResourceListViewModel.kt", l = {47, 49}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f19907d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f19908e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f19909f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f19910g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, m mVar, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f19908e = j11;
            this.f19909f = mVar;
            this.f19910g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f19908e, this.f19909f, this.f19910g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x003e, code lost:
        
            if (r2 == r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0040, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x002d, code lost:
        
            if (xe.Y.b(r18.f19908e, r18) == r1) goto L15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.K] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object value;
            ?? r82;
            k kVar;
            boolean z11;
            List<D20.d> b11;
            Object obj2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f19907d;
            m mVar = this.f19909f;
            if (i11 == 0) {
                s.b(obj);
                this.f19907d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    d11 = obj;
                    D20.e source = (D20.e) d11;
                    x0 x0Var = mVar.f19903d;
                    do {
                        value = x0Var.getValue();
                        mVar.f19900a.getClass();
                        Intrinsics.checkNotNullParameter(source, "source");
                        D20.b a11 = M20.a.a(source.b());
                        if (a11 == null || (b11 = a11.b()) == null) {
                            r82 = K.f71697a;
                        } else {
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : b11) {
                                if (hashSet.add(((D20.d) obj3).a())) {
                                    arrayList.add(obj3);
                                }
                            }
                            int i12 = 10;
                            r82 = new ArrayList(C7714v.z(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                D20.d dVar = (D20.d) it.next();
                                List<D20.b> b12 = source.b();
                                int h11 = U.h(C7714v.z(b12, i12));
                                if (h11 < 16) {
                                    h11 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                                for (D20.b bVar : b12) {
                                    String a12 = bVar.a();
                                    Iterator it2 = bVar.b().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it2.next();
                                        if (Intrinsics.d(((D20.d) obj2).a(), dVar.a())) {
                                            break;
                                        }
                                    }
                                    D20.d dVar2 = (D20.d) obj2;
                                    String d12 = dVar2 != null ? dVar2.d() : null;
                                    if (d12 == null) {
                                        d12 = "";
                                    }
                                    Pair pair = new Pair(a12, d12);
                                    linkedHashMap.put(pair.e(), pair.f());
                                }
                                String str = (String) linkedHashMap.get(a11.a());
                                if (str == null) {
                                    throw new IllegalStateException(("Недопустимое состояние: не смогли найти перевод для локали " + a11.a()).toString());
                                }
                                r82.add(new O20.b(dVar.a(), str, dVar.c()));
                                i12 = 10;
                            }
                        }
                        kVar = new k(source.a(), (List) r82, (Q20.a) null, 12);
                        String str2 = this.f19910g;
                        if (str2.length() == 0) {
                            z11 = true;
                        } else {
                            List<O20.b> b13 = kVar.b();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : b13) {
                                O20.b bVar2 = (O20.b) obj4;
                                if (kotlin.text.h.t(bVar2.c(), str2, true) || kotlin.text.h.t(bVar2.a(), str2, true)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            z11 = true;
                            kVar = k.a(kVar, arrayList2, str2, null, 9);
                        }
                    } while (!x0Var.b(value, kVar));
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            C20.f fVar = mVar.f19901b;
            String str3 = mVar.f19902c;
            this.f19907d = 2;
            d11 = fVar.d(str3, this);
        }
    }

    public m(@NotNull D converter, @NotNull C20.f repository, @NotNull String sourceName) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        this.f19900a = converter;
        this.f19901b = repository;
        this.f19902c = sourceName;
        x0<k> a11 = O0.a(new k(sourceName, (List) null, (Q20.a) null, 14));
        this.f19903d = a11;
        this.f19904e = C2399j.b(a11);
        this.f19906g = Sc.k.b(new a(0, this, m.class, "createErrorHandler", "createErrorHandler()Lkotlinx/coroutines/CoroutineExceptionHandler;", 0));
        h0(0L, "");
    }

    private final void h0(long j11, String str) {
        B0 b02 = this.f19905f;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f19905f = C10727i.c(a11, He.b.f10879b.plus((J) this.f19906g.getValue()), null, new b(j11, this, str, null), 2);
    }

    @NotNull
    public final M0<k> getState() {
        return this.f19904e;
    }

    public final void onSearchQueryChanged(@NotNull String query) {
        k value;
        Intrinsics.checkNotNullParameter(query, "query");
        x0<k> x0Var = this.f19903d;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, k.a(value, null, query, null, 11)));
        h0(600L, query);
    }
}
