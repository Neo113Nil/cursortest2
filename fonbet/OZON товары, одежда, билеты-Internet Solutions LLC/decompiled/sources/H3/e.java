package H3;

import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.B;
import java.util.ArrayList;
import l3.C7855a;

/* loaded from: classes8.dex */
final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<k4.c> f10527a = new ArrayList<>();

    private int f(long j11) {
        int i11 = 0;
        while (true) {
            ArrayList<k4.c> arrayList = this.f10527a;
            if (i11 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j11 < arrayList.get(i11).f70452b) {
                return i11;
            }
            i11++;
        }
    }

    @Override // H3.a
    public final AbstractC5880y<C7855a> a(long j11) {
        int f7 = f(j11);
        if (f7 == 0) {
            return AbstractC5880y.v();
        }
        k4.c cVar = this.f10527a.get(f7 - 1);
        long j12 = cVar.f70454d;
        return (j12 == -9223372036854775807L || j11 < j12) ? cVar.f70451a : AbstractC5880y.v();
    }

    @Override // H3.a
    public final long b(long j11) {
        ArrayList<k4.c> arrayList = this.f10527a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j11 < arrayList.get(0).f70452b) {
            return arrayList.get(0).f70452b;
        }
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            k4.c cVar = arrayList.get(i11);
            if (j11 < cVar.f70452b) {
                long j12 = arrayList.get(i11 - 1).f70454d;
                long j13 = cVar.f70452b;
                return (j12 == -9223372036854775807L || j12 <= j11 || j12 >= j13) ? j13 : j12;
            }
        }
        long j14 = ((k4.c) B.b(arrayList)).f70454d;
        if (j14 == -9223372036854775807L || j11 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // H3.a
    public final void c(long j11) {
        int f7 = f(j11);
        if (f7 == 0) {
            return;
        }
        ArrayList<k4.c> arrayList = this.f10527a;
        long j12 = arrayList.get(f7 - 1).f70454d;
        if (j12 == -9223372036854775807L || j12 >= j11) {
            f7--;
        }
        arrayList.subList(0, f7).clear();
    }

    @Override // H3.a
    public final void clear() {
        this.f10527a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // H3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(k4.c cVar, long j11) {
        boolean z11;
        int size;
        long j12 = cVar.f70452b;
        G10.a.c(j12 != -9223372036854775807L);
        if (j12 <= j11) {
            long j13 = cVar.f70454d;
            if (j13 == -9223372036854775807L || j11 < j13) {
                z11 = true;
                ArrayList<k4.c> arrayList = this.f10527a;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j12 >= arrayList.get(size).f70452b) {
                        arrayList.add(size + 1, cVar);
                        return z11;
                    }
                    if (arrayList.get(size).f70452b <= j11) {
                        z11 = false;
                    }
                }
                arrayList.add(0, cVar);
                return z11;
            }
        }
        z11 = false;
        ArrayList<k4.c> arrayList2 = this.f10527a;
        while (size >= 0) {
        }
        arrayList2.add(0, cVar);
        return z11;
    }

    @Override // H3.a
    public final long e(long j11) {
        ArrayList<k4.c> arrayList = this.f10527a;
        if (arrayList.isEmpty() || j11 < arrayList.get(0).f70452b) {
            return -9223372036854775807L;
        }
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            long j12 = arrayList.get(i11).f70452b;
            if (j11 == j12) {
                return j12;
            }
            if (j11 < j12) {
                k4.c cVar = arrayList.get(i11 - 1);
                long j13 = cVar.f70454d;
                return (j13 == -9223372036854775807L || j13 > j11) ? cVar.f70452b : j13;
            }
        }
        k4.c cVar2 = (k4.c) B.b(arrayList);
        long j14 = cVar2.f70454d;
        return (j14 == -9223372036854775807L || j11 < j14) ? cVar2.f70452b : j14;
    }
}
