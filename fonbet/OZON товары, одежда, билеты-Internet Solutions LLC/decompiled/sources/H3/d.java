package H3;

import B90.C2616s;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.T;
import java.util.ArrayList;
import l3.C7855a;

/* loaded from: classes8.dex */
final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    private static final T<k4.c> f10525b = T.d().e(new C2616s()).a(T.d().f().e(new c()));

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f10526a = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final AbstractC5880y<C7855a> a(long j11) {
        ArrayList arrayList = this.f10526a;
        if (!arrayList.isEmpty()) {
            if (j11 >= ((k4.c) arrayList.get(0)).f70452b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k4.c cVar = (k4.c) arrayList.get(i11);
                    if (j11 >= cVar.f70452b && j11 < cVar.f70454d) {
                        arrayList2.add(cVar);
                    }
                    if (j11 < cVar.f70452b) {
                        break;
                    }
                }
                AbstractC5880y F11 = AbstractC5880y.F(f10525b, arrayList2);
                AbstractC5880y.a aVar = new AbstractC5880y.a();
                for (int i12 = 0; i12 < F11.size(); i12++) {
                    aVar.h(((k4.c) F11.get(i12)).f70451a);
                }
                return aVar.j();
            }
        }
        return AbstractC5880y.v();
    }

    @Override // H3.a
    public final long b(long j11) {
        int i11 = 0;
        long j12 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f10526a;
            if (i11 >= arrayList.size()) {
                break;
            }
            long j13 = ((k4.c) arrayList.get(i11)).f70452b;
            long j14 = ((k4.c) arrayList.get(i11)).f70454d;
            if (j11 < j13) {
                j12 = j12 == -9223372036854775807L ? j13 : Math.min(j12, j13);
            } else {
                if (j11 < j14) {
                    j12 = j12 == -9223372036854775807L ? j14 : Math.min(j12, j14);
                }
                i11++;
            }
        }
        if (j12 != -9223372036854775807L) {
            return j12;
        }
        return Long.MIN_VALUE;
    }

    @Override // H3.a
    public final void c(long j11) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f10526a;
            if (i11 >= arrayList.size()) {
                return;
            }
            long j12 = ((k4.c) arrayList.get(i11)).f70452b;
            if (j11 > j12 && j11 > ((k4.c) arrayList.get(i11)).f70454d) {
                arrayList.remove(i11);
                i11--;
            } else if (j11 < j12) {
                return;
            }
            i11++;
        }
    }

    @Override // H3.a
    public final void clear() {
        this.f10526a.clear();
    }

    @Override // H3.a
    public final boolean d(k4.c cVar, long j11) {
        long j12 = cVar.f70452b;
        G10.a.c(j12 != -9223372036854775807L);
        G10.a.c(cVar.f70453c != -9223372036854775807L);
        boolean z11 = j12 <= j11 && j11 < cVar.f70454d;
        ArrayList arrayList = this.f10526a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j12 >= ((k4.c) arrayList.get(size)).f70452b) {
                arrayList.add(size + 1, cVar);
                return z11;
            }
        }
        arrayList.add(0, cVar);
        return z11;
    }

    @Override // H3.a
    public final long e(long j11) {
        ArrayList arrayList = this.f10526a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j11 < ((k4.c) arrayList.get(0)).f70452b) {
            return -9223372036854775807L;
        }
        long j12 = ((k4.c) arrayList.get(0)).f70452b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long j13 = ((k4.c) arrayList.get(i11)).f70452b;
            long j14 = ((k4.c) arrayList.get(i11)).f70454d;
            if (j14 > j11) {
                if (j13 > j11) {
                    break;
                }
                j12 = Math.max(j12, j13);
            } else {
                j12 = Math.max(j12, j14);
            }
        }
        return j12;
    }
}
