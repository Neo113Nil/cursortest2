package com.google.android.gms.internal.ads;

import java.util.Arrays;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class A implements U {

    /* renamed from: a, reason: collision with root package name */
    public final int f7487a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7488b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7489c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7490d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f7491e;
    public final long f;

    public A(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7488b = iArr;
        this.f7489c = jArr;
        this.f7490d = jArr2;
        this.f7491e = jArr3;
        int length = iArr.length;
        this.f7487a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.U
    public final long a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.U
    public final T c(long j5) {
        long[] jArr = this.f7491e;
        int j6 = AbstractC1260lo.j(jArr, j5, true);
        long j7 = jArr[j6];
        long[] jArr2 = this.f7489c;
        V v4 = new V(j7, jArr2[j6]);
        if (j7 >= j5 || j6 == this.f7487a - 1) {
            return new T(v4, v4);
        }
        int i = j6 + 1;
        return new T(v4, new V(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.U
    public final boolean g() {
        return true;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f7488b);
        String arrays2 = Arrays.toString(this.f7489c);
        String arrays3 = Arrays.toString(this.f7491e);
        String arrays4 = Arrays.toString(this.f7490d);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.f7487a);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        return AbstractC2107A.u(sb, arrays4, ")");
    }
}
