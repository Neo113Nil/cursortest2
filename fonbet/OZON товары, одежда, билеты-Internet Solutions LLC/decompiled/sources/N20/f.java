package N20;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import N20.d;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import androidx.lifecycle.w0;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;

/* loaded from: classes3.dex */
public final class f extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final N20.a f18455a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18456b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f18457c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<e> f18458d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final M0<e> f18459e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f18460f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.presentation.localization.resourceDetail.ResourceDetailsViewModel$1", f = "ResourceDetailsViewModel.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f18461d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C20.f f18462e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f18463f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C20.f fVar, f fVar2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f18462e = fVar;
            this.f18463f = fVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f18462e, this.f18463f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object value;
            String resourceKey;
            d dVar;
            String str;
            LinkedHashMap linkedHashMap;
            d bVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f18461d;
            f fVar = this.f18463f;
            if (i11 == 0) {
                s.b(obj);
                String str2 = fVar.f18456b;
                this.f18461d = 1;
                d11 = this.f18462e.d(str2, this);
                if (d11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                d11 = obj;
            }
            D20.e source = (D20.e) d11;
            x0 x0Var = fVar.f18458d;
            do {
                value = x0Var.getValue();
                N20.a aVar2 = fVar.f18455a;
                resourceKey = fVar.f18457c;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
                Locale locale = Locale.getDefault();
                Locale locale2 = new Locale("ru");
                List<D20.b> b11 = source.b();
                int h11 = U.h(C7714v.z(b11, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
                for (D20.b bVar2 : b11) {
                    List<D20.d> b12 = bVar2.b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : b12) {
                        if (Intrinsics.d(((D20.d) obj2).a(), resourceKey)) {
                            arrayList.add(obj2);
                        }
                    }
                    String a11 = bVar2.a();
                    if (arrayList.isEmpty()) {
                        bVar = null;
                    } else if (arrayList.size() == 1 && ((D20.d) C7714v.K(arrayList)).b() == null) {
                        bVar = new d.a(((D20.d) C7714v.K(arrayList)).d());
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            D20.d dVar2 = (D20.d) it.next();
                            String b13 = dVar2.b();
                            Pair pair = b13 != null ? new Pair(b13, dVar2.d()) : null;
                            if (pair != null) {
                                arrayList2.add(pair);
                            }
                        }
                        bVar = new d.b(U.s(arrayList2));
                    }
                    Pair pair2 = new Pair(a11, bVar);
                    linkedHashMap2.put(pair2.e(), pair2.f());
                }
                d dVar3 = (d) linkedHashMap2.get("default");
                if (dVar3 != null && (!linkedHashMap2.keySet().contains("ru") || !linkedHashMap2.keySet().contains("en"))) {
                    LinkedHashMap u11 = U.u(linkedHashMap2);
                    if (!u11.containsKey("ru")) {
                        u11.put("ru", dVar3);
                    } else if (!u11.containsKey("en")) {
                        u11.put("en", dVar3);
                    }
                    u11.remove("default");
                    linkedHashMap2 = u11;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    String str3 = (String) entry.getKey();
                    d dVar4 = (d) entry.getValue();
                    Pair pair3 = dVar4 != null ? new Pair(str3, dVar4) : null;
                    if (pair3 != null) {
                        arrayList3.add(pair3);
                    }
                }
                Map s11 = U.s(arrayList3);
                String language = locale.getLanguage();
                d dVar5 = (d) s11.get(language);
                if (dVar5 == null) {
                    dVar5 = new d.a("-");
                }
                dVar = dVar5;
                str = language + " - " + locale.getDisplayLanguage(locale2);
                Intrinsics.f(language);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : s11.entrySet()) {
                    if (!Intrinsics.d((String) entry2.getKey(), language)) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                linkedHashMap = new LinkedHashMap(U.h(linkedHashMap3.size()));
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    String str4 = (String) entry3.getKey();
                    linkedHashMap.put(G.g.c(str4, " - ", new Locale(str4).getDisplayLanguage(locale2)), entry3.getValue());
                }
            } while (!x0Var.b(value, new e(resourceKey, str, dVar, linkedHashMap, 16)));
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function0<J> {
        @Override // kotlin.jvm.functions.Function0
        public final J invoke() {
            f fVar = (f) this.receiver;
            fVar.getClass();
            return new g(J.f105405n0, fVar);
        }
    }

    public f(@NotNull N20.a converter, @NotNull String sourceName, @NotNull String resourceKey, @NotNull C20.f repository) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f18455a = converter;
        this.f18456b = sourceName;
        this.f18457c = resourceKey;
        x0<e> a11 = O0.a(new e(resourceKey, (String) null, (d) null, (LinkedHashMap) null, 30));
        this.f18458d = a11;
        this.f18459e = C2399j.b(a11);
        InterfaceC4008j b11 = k.b(new b(0, this, f.class, "createErrorHandler", "createErrorHandler()Lkotlinx/coroutines/CoroutineExceptionHandler;", 0));
        this.f18460f = b11;
        C6788a a12 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a12, He.b.f10879b.plus((J) b11.getValue()), null, new a(repository, this, null), 2);
    }

    @NotNull
    public final M0<e> getState() {
        return this.f18459e;
    }
}
