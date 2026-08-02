package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066hG implements OG {

    /* renamed from: k, reason: collision with root package name */
    public final C1761wv f13739k;

    /* renamed from: l, reason: collision with root package name */
    public long f13740l;

    public C1066hG(List list, List list2) {
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i = 0;
        AbstractC1668us.S(list.size() == list2.size());
        int i5 = 0;
        while (i < list.size()) {
            C1021gG c1021gG = new C1021gG((OG) list.get(i), (List) list2.get(i));
            int length = objArr.length;
            int i6 = i5 + 1;
            int d5 = AbstractC0776av.d(length, i6);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i5] = c1021gG;
            i++;
            i5 = i6;
        }
        this.f13739k = AbstractC1044gv.k(i5, objArr);
        this.f13740l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void a(long j5) {
        int i = 0;
        while (true) {
            C1761wv c1761wv = this.f13739k;
            if (i >= c1761wv.f16186n) {
                return;
            }
            ((C1021gG) c1761wv.get(i)).a(j5);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long d() {
        int i = 0;
        long j5 = Long.MAX_VALUE;
        long j6 = Long.MAX_VALUE;
        while (true) {
            C1761wv c1761wv = this.f13739k;
            if (i >= c1761wv.f16186n) {
                break;
            }
            C1021gG c1021gG = (C1021gG) c1761wv.get(i);
            long d5 = c1021gG.f13581k.d();
            AbstractC1044gv abstractC1044gv = c1021gG.f13582l;
            if ((abstractC1044gv.contains(1) || abstractC1044gv.contains(2) || abstractC1044gv.contains(4)) && d5 != Long.MIN_VALUE) {
                j5 = Math.min(j5, d5);
            }
            if (d5 != Long.MIN_VALUE) {
                j6 = Math.min(j6, d5);
            }
            i++;
        }
        if (j5 != Long.MAX_VALUE) {
            this.f13740l = j5;
            return j5;
        }
        if (j6 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j7 = this.f13740l;
        return j7 != -9223372036854775807L ? j7 : j6;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long i() {
        int i = 0;
        long j5 = Long.MAX_VALUE;
        while (true) {
            C1761wv c1761wv = this.f13739k;
            if (i >= c1761wv.f16186n) {
                break;
            }
            long i5 = ((C1021gG) c1761wv.get(i)).f13581k.i();
            if (i5 != Long.MIN_VALUE) {
                j5 = Math.min(j5, i5);
            }
            i++;
        }
        if (j5 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean m(C1511rE c1511rE) {
        boolean z3;
        boolean z5 = false;
        do {
            long i = i();
            if (i == Long.MIN_VALUE) {
                break;
            }
            int i5 = 0;
            z3 = false;
            while (true) {
                C1761wv c1761wv = this.f13739k;
                if (i5 >= c1761wv.f16186n) {
                    break;
                }
                long i6 = ((C1021gG) c1761wv.get(i5)).f13581k.i();
                boolean z6 = i6 != Long.MIN_VALUE && i6 <= c1511rE.f15283a;
                if (i6 == i || z6) {
                    z3 |= ((C1021gG) c1761wv.get(i5)).f13581k.m(c1511rE);
                }
                i5++;
            }
            z5 |= z3;
        } while (z3);
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean r() {
        int i = 0;
        while (true) {
            C1761wv c1761wv = this.f13739k;
            if (i >= c1761wv.f16186n) {
                return false;
            }
            if (((C1021gG) c1761wv.get(i)).f13581k.r()) {
                return true;
            }
            i++;
        }
    }
}
