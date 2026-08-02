package bj;

import F4.AbstractC3028h;
import F4.O;
import F4.P;
import F4.Q;
import Hi.h;
import Hi.k;
import Qi.InterfaceC3877a;
import Sc.o;
import Sc.r;
import Sc.s;
import Si.InterfaceC4010a;
import aj.InterfaceC5028a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.I;
import xe.N;

/* renamed from: bj.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5677e extends O<InterfaceC4010a> implements InterfaceC5028a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Oi.b f56063d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final I f56064e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC3877a f56065f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f56066g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f56067h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Hi.d f56068i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Set<String> f56069j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f56070k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f56071l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f56072m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f56073n;

    /* renamed from: o, reason: collision with root package name */
    private B0 f56074o;

    /* renamed from: p, reason: collision with root package name */
    private B0 f56075p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5677e(@NotNull Oi.b mediaFileManager, @NotNull I coroutineDispatcher, @NotNull InterfaceC3877a logger, @NotNull Hi.c contentProviderQuery, boolean z11, boolean z12, @NotNull Set<String> grantedPermissions, @NotNull h mediaFilter) {
        super(AbstractC3028h.d.POSITIONAL);
        Intrinsics.checkNotNullParameter(mediaFileManager, "mediaFileManager");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(contentProviderQuery, "contentProviderQuery");
        Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
        Intrinsics.checkNotNullParameter(mediaFilter, "mediaFilter");
        this.f56063d = mediaFileManager;
        this.f56064e = coroutineDispatcher;
        this.f56065f = logger;
        this.f56066g = z11;
        this.f56067h = C5677e.class.getSimpleName();
        this.f56068i = Hi.e.a(contentProviderQuery, mediaFilter);
        Set<String> j02 = C7705l.j0(Li.a.b());
        this.f56069j = j02;
        boolean containsAll = grantedPermissions.containsAll(j02);
        this.f56070k = containsAll;
        boolean contains = grantedPermissions.contains("android.permission.CAMERA");
        this.f56071l = contains;
        this.f56072m = z11 && (contains || z12);
        this.f56073n = (z11 && !contains) || !containsAll;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable j(C5677e c5677e, Hi.d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        C5673a c5673a;
        int i11;
        int intValue;
        int i12;
        c5677e.getClass();
        try {
            if (cVar instanceof C5673a) {
                c5673a = (C5673a) cVar;
                int i13 = c5673a.f56046g;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c5673a.f56046g = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c5673a.f56044e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c5673a.f56046g;
                    if (i11 != 0) {
                        s.b(obj);
                        Oi.b bVar = c5677e.f56063d;
                        c5673a.f56043d = c5677e;
                        c5673a.f56046g = 1;
                        obj = bVar.b(dVar, c5673a);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c5677e = c5673a.f56043d;
                        s.b(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    i12 = !c5677e.f56072m ? intValue + 1 : intValue;
                    if (intValue == 0 && c5677e.f56070k) {
                        i12++;
                    }
                    if (c5677e.f56073n) {
                        i12++;
                    }
                    r.Companion companion = r.INSTANCE;
                    return new Pair(new Integer(intValue), new Integer(i12));
                }
            }
            if (i11 != 0) {
            }
            intValue = ((Number) obj).intValue();
            if (!c5677e.f56072m) {
            }
            if (intValue == 0) {
                i12++;
            }
            if (c5677e.f56073n) {
            }
            r.Companion companion2 = r.INSTANCE;
            return new Pair(new Integer(intValue), new Integer(i12));
        } catch (Exception e11) {
            c5677e.f56065f.b(e11, c5677e.f56067h, "getCount exception", U.c());
            r.Companion companion3 = r.INSTANCE;
            return s.a(e11);
        }
        c5673a = new C5673a(c5677e, cVar);
        Object obj2 = c5673a.f56044e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5673a.f56046g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(C5677e c5677e, Hi.d dVar, int i11, int i12, int i13, kotlin.coroutines.jvm.internal.c cVar) {
        C5674b c5674b;
        int i14;
        C5677e c5677e2;
        Exception e11;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC4010a.e dVar2;
        c5677e.getClass();
        if (cVar instanceof C5674b) {
            c5674b = (C5674b) cVar;
            int i15 = c5674b.f56052i;
            if ((i15 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5674b.f56052i = i15 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5674b.f56050g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i14 = c5674b.f56052i;
                if (i14 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    ArrayList arrayList3 = new ArrayList();
                    boolean z11 = c5677e.f56073n;
                    int i16 = (z11 && arrayList3.size() + 1 <= i12 && i11 == 0 && arrayList3.add(InterfaceC5028a.b.c(c5677e, i11))) ? 1 : 0;
                    boolean z12 = i13 == 0 && c5677e.f56070k && arrayList3.size() + 1 <= i12 && (i11 == 0 || (i11 == 1 && z11));
                    if (z12 && arrayList3.add(InterfaceC5028a.b.b(i11))) {
                        i16++;
                    }
                    if (c5677e.f56072m && arrayList3.size() + 1 <= i12 && (i11 == 0 || ((i11 == 1 && (z11 || z12)) || (i11 == 2 && z11 && z12)))) {
                        if (arrayList3.add(InterfaceC5028a.b.a(c5677e, i11, i13 <= 0))) {
                            i16++;
                        }
                    }
                    try {
                        Oi.b bVar = c5677e.f56063d;
                        int max = i11 <= 0 ? i11 : Math.max(i11 - i16, 0);
                        if (i11 <= 0) {
                            i12 = Math.max(i12 - arrayList3.size(), 0);
                        }
                        c5674b.f56047d = c5677e;
                        c5674b.f56048e = arrayList3;
                        c5674b.f56049f = arrayList3;
                        c5674b.f56052i = 1;
                        Object d11 = bVar.d(dVar, max, i12, c5674b);
                        if (d11 == aVar) {
                            return aVar;
                        }
                        c5677e2 = c5677e;
                        arrayList = arrayList3;
                        obj = d11;
                        arrayList2 = arrayList;
                    } catch (Exception e12) {
                        c5677e2 = c5677e;
                        e11 = e12;
                        c5677e2.f56065f.b(e11, c5677e2.f56067h, "getData exception", U.c());
                        r.Companion companion2 = r.INSTANCE;
                        return s.a(e11);
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = c5674b.f56049f;
                    arrayList2 = c5674b.f56048e;
                    c5677e2 = c5674b.f56047d;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        c5677e2.f56065f.b(e11, c5677e2.f56067h, "getData exception", U.c());
                        r.Companion companion22 = r.INSTANCE;
                        return s.a(e11);
                    }
                }
                List<k> list = (List) obj;
                ArrayList arrayList4 = new ArrayList(C7714v.z(list, 10));
                for (k kVar : list) {
                    if (kVar instanceof k.a) {
                        dVar2 = new InterfaceC4010a.e.c((k.a) kVar, -1);
                    } else {
                        if (!(kVar instanceof k.b)) {
                            throw new o();
                        }
                        dVar2 = new InterfaceC4010a.e.d((k.b) kVar, -1);
                    }
                    arrayList4.add(dVar2);
                }
                arrayList.addAll(arrayList4);
                r.Companion companion3 = r.INSTANCE;
                return arrayList2;
            }
        }
        c5674b = new C5674b(c5677e, cVar);
        Object obj2 = c5674b.f56050g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i14 = c5674b.f56052i;
        if (i14 != 0) {
        }
        List<k> list2 = (List) obj2;
        ArrayList arrayList42 = new ArrayList(C7714v.z(list2, 10));
        while (r11.hasNext()) {
        }
        arrayList.addAll(arrayList42);
        r.Companion companion32 = r.INSTANCE;
        return arrayList2;
    }

    @Override // F4.O
    public final void h(@NotNull O.b params, @NotNull P callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B0 b02 = this.f56074o;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f56074o = C10727i.c(N.a(this.f56064e), null, null, new C5675c(this, callback, params, null), 3);
    }

    @Override // F4.O
    public final void i(@NotNull O.d params, @NotNull Q callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B0 b02 = this.f56075p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f56075p = C10727i.c(N.a(this.f56064e), null, null, new C5676d(this, callback, params, null), 3);
    }

    public final boolean o() {
        return this.f56066g;
    }

    public final boolean p() {
        return this.f56071l;
    }

    public final boolean q() {
        return this.f56070k;
    }
}
