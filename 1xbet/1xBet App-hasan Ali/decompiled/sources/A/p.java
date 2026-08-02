package A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import x0.N;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final k f80a;

    /* renamed from: b, reason: collision with root package name */
    public final B.u f81b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B.u f83d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.f f85g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f87j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E f88k;

    public p(long j5, k kVar, B.u uVar, int i, int i5, b0.f fVar, int i6, int i7, long j6, E e3) {
        this.f83d = uVar;
        this.f84e = i;
        this.f = i5;
        this.f85g = fVar;
        this.f86h = i6;
        this.i = i7;
        this.f87j = j6;
        this.f88k = e3;
        this.f80a = kVar;
        this.f81b = uVar;
        this.f82c = W0.b.b(W0.a.h(j5), Integer.MAX_VALUE, 5);
    }

    public final u a(int i, long j5) {
        long j6;
        List list;
        k kVar = this.f80a;
        Object d5 = kVar.d(i);
        Object b3 = kVar.b(i);
        B.u uVar = this.f81b;
        HashMap hashMap = uVar.f715n;
        List list2 = (List) hashMap.get(Integer.valueOf(i));
        if (list2 != null) {
            j6 = j5;
            list = list2;
        } else {
            k kVar2 = uVar.f714m;
            Object d6 = kVar2.d(i);
            List C5 = uVar.f713l.C(uVar.f712k.a(i, d6, kVar2.b(i)), d6);
            int size = C5.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(((N) C5.get(i5)).e(j5));
            }
            j6 = j5;
            hashMap.put(Integer.valueOf(i), arrayList);
            list = arrayList;
        }
        return new u(i, list, this.f85g, this.f83d.f713l.getLayoutDirection(), this.f86h, this.i, i != this.f84e + (-1) ? this.f : 0, this.f87j, d5, b3, this.f88k.f19m, j6);
    }
}
