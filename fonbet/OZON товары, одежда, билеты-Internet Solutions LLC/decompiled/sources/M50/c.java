package M50;

import Ae.C0;
import Ae.E0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kd.C7665d;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.models.a;
import xe.C10727i;
import xe.M;
import xe.Y;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final R30.a f17466a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f17467b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f17468c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private ArrayList f17469d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f17470e;

    @e(c = "ru.ozon.fintech.features.demo.domain.DemoInteractor$plusIncome$1", f = "DemoInteractor.kt", l = {48, 49, 55}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f17471d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f17473f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f17474g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i11, d<? super a> dVar) {
            super(2, dVar);
            this.f17473f = str;
            this.f17474g = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return c.this.new a(this.f17473f, this.f17474g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        
            if (r11.emit(r1, r10) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        
            if (xe.Y.b(3000, r10) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
        
            if (r11.emit(r1, r10) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f17471d;
            int i12 = this.f17474g;
            String str = this.f17473f;
            c cVar = c.this;
            if (i11 == 0) {
                s.b(obj);
                List list = (List) cVar.f17470e.get(str);
                if (list != null) {
                }
                C0 g10 = cVar.g();
                Boolean bool = Boolean.TRUE;
                this.f17471d = 1;
            } else if (i11 == 1) {
                s.b(obj);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                List list2 = (List) cVar.f17468c.get(str);
                int intValue = list2 != null ? ((Number) list2.get(i12)).intValue() : 0;
                List list3 = (List) cVar.f17468c.get(str);
                if (list3 != null) {
                    list3.set(i12, new Integer(intValue + 1));
                }
                List list4 = (List) cVar.f17470e.get(str);
                if (list4 != null) {
                }
                C0 g11 = cVar.g();
                Boolean bool2 = Boolean.TRUE;
                this.f17471d = 3;
            }
            this.f17471d = 2;
        }
    }

    public c(@NotNull R30.a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f17466a = appCoroutineScopes;
        this.f17467b = E0.a(0, 1, EnumC11113a.DROP_OLDEST);
        this.f17468c = new LinkedHashMap();
        this.f17469d = new ArrayList();
        this.f17470e = new LinkedHashMap();
    }

    public final void c(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f17468c.remove(id2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        M50.a aVar;
        int i11;
        c cVar2;
        C7665d it;
        if (cVar instanceof M50.a) {
            aVar = (M50.a) cVar;
            int i12 = aVar.f17461g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f17461g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f17459e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f17461g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!this.f17468c.isEmpty() && !z11) {
                        cVar2 = this;
                        return cVar2.f17468c;
                    }
                    aVar.f17458d = this;
                    aVar.f17461g = 1;
                    if (Y.b(3000L, aVar) == aVar2) {
                        return aVar2;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = aVar.f17458d;
                    s.b(obj);
                }
                LinkedHashMap linkedHashMap = cVar2.f17468c;
                linkedHashMap.clear();
                it = new IntRange(0, 20, 1).iterator();
                while (it.hasNext()) {
                    int b11 = it.b();
                    LinkedHashMap linkedHashMap2 = cVar2.f17470e;
                    String a11 = Ej.b.a(b11, "acc_");
                    IntRange intRange = new IntRange(0, 100, 1);
                    ArrayList arrayList = new ArrayList(C7714v.z(intRange, 10));
                    C7665d it2 = intRange.iterator();
                    while (it2.hasNext()) {
                        it2.b();
                        arrayList.add(a.b.f96629a);
                    }
                    linkedHashMap2.put(a11, C7714v.W0(arrayList));
                    String str = "acc_" + b11;
                    IntRange intRange2 = new IntRange(0, 100, 1);
                    ArrayList arrayList2 = new ArrayList(C7714v.z(intRange2, 10));
                    C7665d it3 = intRange2.iterator();
                    while (it3.hasNext()) {
                        it3.b();
                        arrayList2.add(1);
                    }
                    linkedHashMap.put(str, C7714v.W0(arrayList2));
                }
                return cVar2.f17468c;
            }
        }
        aVar = new M50.a(this, cVar);
        Object obj2 = aVar.f17459e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f17461g;
        if (i11 != 0) {
        }
        LinkedHashMap linkedHashMap3 = cVar2.f17468c;
        linkedHashMap3.clear();
        it = new IntRange(0, 20, 1).iterator();
        while (it.hasNext()) {
        }
        return cVar2.f17468c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[LOOP:0: B:11:0x005e->B:13:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        c cVar2;
        C7665d it;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f17465g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f17465g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f17463e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f17465g;
                if (i11 != 0) {
                    s.b(obj);
                    if (!this.f17469d.isEmpty() && !z11) {
                        cVar2 = this;
                        return cVar2.f17469d;
                    }
                    bVar.f17462d = this;
                    bVar.f17465g = 1;
                    if (Y.b(2000L, bVar) == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = bVar.f17462d;
                    s.b(obj);
                }
                ArrayList arrayList = cVar2.f17469d;
                arrayList.clear();
                it = new IntRange(0, 1, 1).iterator();
                while (it.hasNext()) {
                    arrayList.add("Message " + it.b());
                }
                return cVar2.f17469d;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f17463e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f17465g;
        if (i11 != 0) {
        }
        ArrayList arrayList2 = cVar2.f17469d;
        arrayList2.clear();
        it = new IntRange(0, 1, 1).iterator();
        while (it.hasNext()) {
        }
        return cVar2.f17469d;
    }

    @NotNull
    public final ru.ozon.fintech.network.models.a f(int i11, @NotNull String accountId) {
        ru.ozon.fintech.network.models.a aVar;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        List list = (List) this.f17470e.get(accountId);
        return (list == null || (aVar = (ru.ozon.fintech.network.models.a) list.get(i11)) == null) ? a.b.f96629a : aVar;
    }

    @NotNull
    public final C0 g() {
        return this.f17467b;
    }

    public final void h(int i11, @NotNull String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        C10727i.c(this.f17466a.b(), null, null, new a(accountId, i11, null), 3);
    }
}
