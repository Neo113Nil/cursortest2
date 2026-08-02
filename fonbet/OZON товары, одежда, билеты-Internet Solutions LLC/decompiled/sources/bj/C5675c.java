package bj;

import F4.O;
import F4.P;
import Qi.InterfaceC3877a;
import Sc.r;
import Sc.s;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.pagination.v2.GalleryPaging2Source$loadInitial$1", f = "GalleryPaging2Source.kt", l = {54, 60}, m = "invokeSuspend")
/* renamed from: bj.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C5675c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56053d;

    /* renamed from: e, reason: collision with root package name */
    int f56054e;

    /* renamed from: f, reason: collision with root package name */
    int f56055f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C5677e f56056g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ P f56057h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ O.b f56058i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5675c(C5677e c5677e, P p11, O.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f56056g = c5677e;
        this.f56057h = p11;
        this.f56058i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5675c(this.f56056g, this.f56057h, this.f56058i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5675c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0018, B:8:0x0098, B:11:0x00a0, B:13:0x00a4, B:16:0x00ac, B:22:0x002f, B:23:0x0049, B:26:0x0050, B:28:0x0054, B:30:0x005c, B:32:0x0079, B:33:0x007f, B:38:0x003c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0018, B:8:0x0098, B:11:0x00a0, B:13:0x00a4, B:16:0x00ac, B:22:0x002f, B:23:0x0049, B:26:0x0050, B:28:0x0054, B:30:0x005c, B:32:0x0079, B:33:0x007f, B:38:0x003c), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3877a interfaceC3877a;
        String str;
        Hi.d dVar;
        Object j11;
        Hi.d dVar2;
        int i11;
        Object obj2;
        int i12;
        List list;
        O.b bVar = this.f56058i;
        Object obj3 = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f56055f;
        P p11 = this.f56057h;
        C5677e c5677e = this.f56056g;
        Object obj4 = null;
        try {
        } catch (Exception e11) {
            interfaceC3877a = c5677e.f56065f;
            str = c5677e.f56067h;
            interfaceC3877a.b(e11, str, "loadInitial onResult exception", U.c());
            p11.a(0, 0, K.f71697a);
        }
        if (i13 == 0) {
            s.b(obj);
            dVar = c5677e.f56068i;
            this.f56055f = 1;
            j11 = C5677e.j(c5677e, dVar, this);
            if (j11 == obj3) {
                return obj3;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = this.f56054e;
                i11 = this.f56053d;
                s.b(obj);
                obj2 = ((r) obj).getF26106a();
                r.Companion companion = r.INSTANCE;
                if (obj2 instanceof r.b) {
                    obj4 = obj2;
                }
                list = (List) obj4;
                if (list != null) {
                    p11.a(0, 0, K.f71697a);
                    return Unit.f71690a;
                }
                p11.a(i12, i11, list);
                return Unit.f71690a;
            }
            s.b(obj);
            j11 = ((r) obj).getF26106a();
        }
        r.Companion companion2 = r.INSTANCE;
        if (j11 instanceof r.b) {
            j11 = null;
        }
        Pair pair = (Pair) j11;
        if (pair == null) {
            p11.a(0, 0, K.f71697a);
            return Unit.f71690a;
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        int i14 = bVar.f8838a;
        int i15 = bVar.f8839b;
        c5677e.getClass();
        if (i14 >= intValue2) {
            i14 = Math.max(0, intValue2 - i15);
        }
        int i16 = i14;
        int i17 = bVar.f8839b;
        dVar2 = c5677e.f56068i;
        this.f56053d = intValue2;
        this.f56054e = i16;
        this.f56055f = 2;
        Object k11 = C5677e.k(c5677e, dVar2, i16, i17, intValue, this);
        if (k11 != obj3) {
            i11 = intValue2;
            obj2 = k11;
            i12 = i16;
            r.Companion companion3 = r.INSTANCE;
            if (obj2 instanceof r.b) {
            }
            list = (List) obj4;
            if (list != null) {
            }
        }
        return obj3;
    }
}
