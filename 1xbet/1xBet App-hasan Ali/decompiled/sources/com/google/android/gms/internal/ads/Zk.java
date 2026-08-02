package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Zk {

    /* renamed from: a, reason: collision with root package name */
    public int f12512a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f12513b;

    public Zk(int i) {
        this.f12513b = new long[i];
    }

    public void a(long j5) {
        if (b(j5)) {
            return;
        }
        int i = this.f12512a;
        long[] jArr = this.f12513b;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            kotlin.jvm.internal.l.e("copyOf(...)", jArr);
            this.f12513b = jArr;
        }
        jArr[i] = j5;
        if (i >= this.f12512a) {
            this.f12512a = i + 1;
        }
    }

    public boolean b(long j5) {
        int i = this.f12512a;
        for (int i5 = 0; i5 < i; i5++) {
            if (this.f12513b[i5] == j5) {
                return true;
            }
        }
        return false;
    }

    public void c(long j5) {
        int i = this.f12512a;
        int i5 = 0;
        while (i5 < i) {
            if (j5 == this.f12513b[i5]) {
                int i6 = this.f12512a - 1;
                while (i5 < i6) {
                    long[] jArr = this.f12513b;
                    int i7 = i5 + 1;
                    jArr[i5] = jArr[i7];
                    i5 = i7;
                }
                this.f12512a--;
                return;
            }
            i5++;
        }
    }

    public long d(int i) {
        if (i < 0 || i >= this.f12512a) {
            throw new IndexOutOfBoundsException(L1.a.k(i, this.f12512a, "Invalid index ", ", size is "));
        }
        return this.f12513b[i];
    }

    public void e(long j5) {
        int i = this.f12512a;
        long[] jArr = this.f12513b;
        if (i == jArr.length) {
            this.f12513b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f12513b;
        int i5 = this.f12512a;
        this.f12512a = i5 + 1;
        jArr2[i5] = j5;
    }

    public void f(long[] jArr) {
        int i = this.f12512a;
        int length = jArr.length;
        int i5 = i + length;
        long[] jArr2 = this.f12513b;
        int length2 = jArr2.length;
        if (i5 > length2) {
            this.f12513b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i5));
        }
        System.arraycopy(jArr, 0, this.f12513b, this.f12512a, length);
        this.f12512a = i5;
    }
}
