package N3;

import Bl0.k0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: N3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3657h {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f18608a = new LinkedHashMap();

    public final void a(C3656g c3656g) {
        long[] jArr = c3656g.f18606e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = this.f18608a;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(c3656g.f18606e[0]), c3656g);
        }
    }

    public final C3656g b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C3656g c3656g : this.f18608a.values()) {
            arrayList.add(c3656g.f18603b);
            arrayList2.add(c3656g.f18604c);
            arrayList3.add(c3656g.f18605d);
            arrayList4.add(c3656g.f18606e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j11 = 0;
        for (int[] iArr2 : iArr) {
            j11 += iArr2.length;
        }
        int i11 = (int) j11;
        k0.c(j11, "the total number of elements (%s) in the arrays must fit in an int", j11 == ((long) i11));
        int[] iArr3 = new int[i11];
        int i12 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i12, iArr4.length);
            i12 += iArr4.length;
        }
        return new C3656g(iArr3, com.google.common.primitives.d.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), com.google.common.primitives.d.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), com.google.common.primitives.d.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public final int c() {
        return this.f18608a.size();
    }
}
