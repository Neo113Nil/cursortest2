package androidx.media3.exoplayer;

import F3.AbstractC3012q;
import j3.AbstractC7252H;
import j3.C7259a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t3.AbstractC9735a;

/* loaded from: classes.dex */
final class i0 extends AbstractC9735a {

    /* renamed from: d, reason: collision with root package name */
    private final int f44067d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44068e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f44069f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f44070g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC7252H[] f44071h;

    /* renamed from: i, reason: collision with root package name */
    private final Object[] f44072i;

    /* renamed from: j, reason: collision with root package name */
    private final HashMap<Object, Integer> f44073j;

    final class a extends AbstractC3012q {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC7252H.c f44074a;

        a(AbstractC7252H abstractC7252H) {
            super(abstractC7252H);
            this.f44074a = new AbstractC7252H.c();
        }

        @Override // F3.AbstractC3012q, j3.AbstractC7252H
        public final AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
            AbstractC7252H.b period = super.getPeriod(i11, bVar, z11);
            if (getWindow(period.f68939c, this.f44074a).a()) {
                period.h(bVar.f68937a, bVar.f68938b, bVar.f68939c, bVar.f68940d, bVar.f68941e, C7259a.f69046c, true);
                return period;
            }
            period.f68942f = true;
            return period;
        }
    }

    private i0(AbstractC7252H[] abstractC7252HArr, Object[] objArr, F3.W w11) {
        super(w11);
        int length = abstractC7252HArr.length;
        this.f44071h = abstractC7252HArr;
        this.f44069f = new int[length];
        this.f44070g = new int[length];
        this.f44072i = objArr;
        this.f44073j = new HashMap<>();
        int length2 = abstractC7252HArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length2) {
            AbstractC7252H abstractC7252H = abstractC7252HArr[i11];
            this.f44071h[i14] = abstractC7252H;
            this.f44070g[i14] = i12;
            this.f44069f[i14] = i13;
            i12 += abstractC7252H.getWindowCount();
            i13 += this.f44071h[i14].getPeriodCount();
            this.f44073j.put(objArr[i14], Integer.valueOf(i14));
            i11++;
            i14++;
        }
        this.f44067d = i12;
        this.f44068e = i13;
    }

    @Override // t3.AbstractC9735a
    protected final int a(Object obj) {
        Integer num = this.f44073j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // t3.AbstractC9735a
    protected final int b(int i11) {
        return m3.N.d(this.f44069f, i11 + 1, false, false);
    }

    @Override // t3.AbstractC9735a
    protected final int c(int i11) {
        return m3.N.d(this.f44070g, i11 + 1, false, false);
    }

    @Override // t3.AbstractC9735a
    protected final Object d(int i11) {
        return this.f44072i[i11];
    }

    @Override // t3.AbstractC9735a
    protected final int e(int i11) {
        return this.f44069f[i11];
    }

    @Override // t3.AbstractC9735a
    protected final int f(int i11) {
        return this.f44070g[i11];
    }

    @Override // j3.AbstractC7252H
    public final int getPeriodCount() {
        return this.f44068e;
    }

    @Override // j3.AbstractC7252H
    public final int getWindowCount() {
        return this.f44067d;
    }

    @Override // t3.AbstractC9735a
    protected final AbstractC7252H h(int i11) {
        return this.f44071h[i11];
    }

    public final i0 i(F3.W w11) {
        AbstractC7252H[] abstractC7252HArr = this.f44071h;
        AbstractC7252H[] abstractC7252HArr2 = new AbstractC7252H[abstractC7252HArr.length];
        for (int i11 = 0; i11 < abstractC7252HArr.length; i11++) {
            abstractC7252HArr2[i11] = new a(abstractC7252HArr[i11]);
        }
        return new i0(abstractC7252HArr2, this.f44072i, w11);
    }

    final List<AbstractC7252H> j() {
        return Arrays.asList(this.f44071h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(List list, F3.W w11) {
        this(r0, r1, w11);
        AbstractC7252H[] abstractC7252HArr = new AbstractC7252H[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            abstractC7252HArr[i12] = ((S) it.next()).a();
            i12++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i11] = ((S) it2.next()).getUid();
            i11++;
        }
    }
}
