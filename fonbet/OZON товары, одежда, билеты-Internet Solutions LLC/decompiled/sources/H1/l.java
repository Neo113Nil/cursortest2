package H1;

import B0.A0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f10491a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Float, kotlin.coroutines.d<? super Float>, Object> f10492b;

    /* renamed from: c, reason: collision with root package name */
    private float f10493c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(int i11, @NotNull Function2<? super Float, ? super kotlin.coroutines.d<? super Float>, ? extends Object> function2) {
        this.f10491a = i11;
        this.f10492b = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(float f7, kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        l lVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f10490g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f10490g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kVar.f10488e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f10490g;
                if (i11 != 0) {
                    s.b(obj);
                    Float f11 = new Float(f7);
                    kVar.f10487d = this;
                    kVar.f10490g = 1;
                    obj = ((g) this.f10492b).invoke(f11, kVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    lVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (l) kVar.f10487d;
                    s.b(obj);
                }
                lVar.f10493c += ((Number) obj).floatValue();
                return Unit.f71690a;
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f10488e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f10490g;
        if (i11 != 0) {
        }
        lVar.f10493c += ((Number) obj2).floatValue();
        return Unit.f71690a;
    }

    public final float b() {
        return this.f10493c;
    }

    public final int c(int i11) {
        return kotlin.ranges.h.e(i11 - C6915b.c(this.f10493c), 0, this.f10491a);
    }

    public final void d() {
        this.f10493c = 0.0f;
    }

    public final Object f(int i11, int i12, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (i11 > i12) {
            throw new IllegalArgumentException(A0.a(i11, i12, "Expected min=", " ≤ max=").toString());
        }
        int i13 = i12 - i11;
        int i14 = this.f10491a;
        if (i13 > i14) {
            throw new IllegalArgumentException(A0.a(i13, i14, "Expected range (", ") to be ≤ viewportSize=").toString());
        }
        float f7 = i11;
        float f11 = this.f10493c;
        if (f7 >= f11 && i12 <= i14 + f11) {
            return Unit.f71690a;
        }
        if (f7 >= f11) {
            i11 = i12 - i14;
        }
        Object g10 = g(i11, (kotlin.coroutines.jvm.internal.c) dVar);
        return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
    }

    public final Object g(float f7, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object e11 = e(f7 - this.f10493c, cVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }
}
