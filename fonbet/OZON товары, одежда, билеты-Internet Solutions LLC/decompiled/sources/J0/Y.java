package J0;

import d2.InterfaceC6040Q;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Y implements InterfaceC6040Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z1.d f13083a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Z1.o, Z1.o, Unit> f13084b;

    private Y() {
        throw null;
    }

    public Y(Z1.d dVar, Function2 function2) {
        this.f13083a = dVar;
        this.f13084b = function2;
    }

    @Override // d2.InterfaceC6040Q
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo6calculatePositionllwVHH4(@NotNull Z1.o oVar, long j11, @NotNull Z1.s sVar, long j12) {
        Sequence g10;
        Object obj;
        Object obj2;
        float e11 = C3314l1.e();
        Z1.d dVar = this.f13083a;
        int Y02 = dVar.Y0(e11);
        int Y03 = dVar.Y0(Float.intBitsToFloat((int) 0));
        Z1.s sVar2 = Z1.s.Ltr;
        int i11 = Y03 * (sVar == sVar2 ? 1 : -1);
        int Y04 = dVar.Y0(Float.intBitsToFloat((int) 0));
        int e12 = oVar.e() + i11;
        int i12 = (int) (j12 >> 32);
        int f7 = (oVar.f() - i12) + i11;
        int i13 = (int) (j11 >> 32);
        int i14 = i13 - i12;
        if (sVar == sVar2) {
            Integer valueOf = Integer.valueOf(e12);
            Integer valueOf2 = Integer.valueOf(f7);
            if (oVar.e() < 0) {
                i14 = 0;
            }
            Integer[] elements = {valueOf, valueOf2, Integer.valueOf(i14)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            g10 = C7705l.g(elements);
        } else {
            Integer valueOf3 = Integer.valueOf(f7);
            Integer valueOf4 = Integer.valueOf(e12);
            if (oVar.f() <= i13) {
                i14 = 0;
            }
            Integer[] elements2 = {valueOf3, valueOf4, Integer.valueOf(i14)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            g10 = C7705l.g(elements2);
        }
        Iterator it = g10.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + i12 <= i13) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            f7 = num.intValue();
        }
        int max = Math.max(oVar.c() + Y04, Y02);
        int i15 = (int) (j12 & 4294967295L);
        int g11 = (oVar.g() - i15) + Y04;
        int g12 = (oVar.g() - (i15 / 2)) + Y04;
        int i16 = (int) (j11 & 4294967295L);
        Integer[] elements3 = {Integer.valueOf(max), Integer.valueOf(g11), Integer.valueOf(g12), Integer.valueOf((i16 - i15) - Y02)};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Iterator it2 = C7705l.g(elements3).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= Y02 && intValue2 + i15 <= i16 - Y02) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            g11 = num2.intValue();
        }
        this.f13084b.invoke(oVar, new Z1.o(f7, g11, i12 + f7, i15 + g11));
        return Z1.n.a(f7, g11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y11 = (Y) obj;
        y11.getClass();
        return Intrinsics.d(this.f13083a, y11.f13083a) && Intrinsics.d(this.f13084b, y11.f13084b);
    }

    public final int hashCode() {
        return this.f13084b.hashCode() + ((this.f13083a.hashCode() + (Long.hashCode(0L) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) Z1.i.b(0L)) + ", density=" + this.f13083a + ", onPositionCalculated=" + this.f13084b + ')';
    }
}
