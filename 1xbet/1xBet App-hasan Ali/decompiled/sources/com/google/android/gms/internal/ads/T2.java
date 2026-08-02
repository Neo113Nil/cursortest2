package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class T2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11615a;

    /* renamed from: b, reason: collision with root package name */
    public int f11616b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11617c;

    /* renamed from: d, reason: collision with root package name */
    public int f11618d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11619e;

    public T2(EE ee) {
        this.f11619e = ee;
    }

    public void a(int i) {
        this.f11615a = 1 == ((this.f11615a ? 1 : 0) | i);
        this.f11616b += i;
    }

    public void b(byte[] bArr, int i, int i5) {
        if (this.f11615a) {
            int i6 = i5 - i;
            byte[] bArr2 = (byte[]) this.f11619e;
            int length = bArr2.length;
            int i7 = this.f11618d + i6;
            if (length < i7) {
                this.f11619e = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i, (byte[]) this.f11619e, this.f11618d, i6);
            this.f11618d += i6;
        }
    }

    public void c() {
        this.f11615a = false;
        this.f11617c = false;
    }

    public void d(int i) {
        AbstractC1668us.a0(!this.f11615a);
        boolean z3 = i == this.f11616b;
        this.f11615a = z3;
        if (z3) {
            this.f11618d = 3;
            this.f11617c = false;
        }
    }

    public boolean e(int i) {
        if (!this.f11615a) {
            return false;
        }
        this.f11618d -= i;
        this.f11615a = false;
        this.f11617c = true;
        return true;
    }

    public T2(int i) {
        this.f11616b = i;
        byte[] bArr = new byte[131];
        this.f11619e = bArr;
        bArr[2] = 1;
    }
}
