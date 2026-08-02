package bj;

import F4.O;
import F4.Q;
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

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.pagination.v2.GalleryPaging2Source$loadRange$1", f = "GalleryPaging2Source.kt", l = {78, 84}, m = "invokeSuspend")
/* renamed from: bj.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C5676d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56059d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5677e f56060e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Q f56061f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ O.d f56062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5676d(C5677e c5677e, Q q11, O.d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f56060e = c5677e;
        this.f56061f = q11;
        this.f56062g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C5676d(this.f56060e, this.f56061f, this.f56062g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5676d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r12 == r1) goto L30;
     */
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
        Object obj2;
        O.d dVar3 = this.f56062g;
        Object obj3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56059d;
        Q q11 = this.f56061f;
        C5677e c5677e = this.f56060e;
        Object obj4 = null;
        try {
        } catch (Exception e11) {
            interfaceC3877a = c5677e.f56065f;
            str = c5677e.f56067h;
            interfaceC3877a.b(e11, str, "loadRange onResult exception", U.c());
            q11.a(K.f71697a);
        }
        if (i11 == 0) {
            s.b(obj);
            dVar = c5677e.f56068i;
            this.f56059d = 1;
            j11 = C5677e.j(c5677e, dVar, this);
            if (j11 == obj3) {
                return obj3;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                obj2 = ((r) obj).getF26106a();
                r.Companion companion = r.INSTANCE;
                if (!(obj2 instanceof r.b)) {
                    obj4 = obj2;
                }
                List<Object> list = (List) obj4;
                if (list == null) {
                    q11.a(K.f71697a);
                    return Unit.f71690a;
                }
                q11.a(list);
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
            q11.a(K.f71697a);
            return Unit.f71690a;
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        int i12 = dVar3.f8842a;
        int i13 = dVar3.f8843b;
        c5677e.getClass();
        if (i12 >= intValue2) {
            i12 = Math.max(0, intValue2 - i13);
        }
        int i14 = dVar3.f8843b;
        dVar2 = c5677e.f56068i;
        this.f56059d = 2;
        Object k11 = C5677e.k(c5677e, dVar2, i12, i14, intValue, this);
        obj2 = k11;
    }
}
