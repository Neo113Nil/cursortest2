package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0379w {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5272a;

    /* renamed from: b, reason: collision with root package name */
    public int f5273b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5274c;

    public AbstractC0379w() {
        AbstractC0325d1.j(4, "initialCapacity");
        this.f5272a = new Object[4];
        this.f5273b = 0;
    }

    public static int b(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i3 <= i2) {
            return i2;
        }
        int i6 = i2 + (i2 >> 1) + 1;
        if (i6 < i3) {
            int highestOneBit = Integer.highestOneBit(i3 - 1);
            i6 = highestOneBit + highestOneBit;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    public final void a(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f5272a;
        int i2 = this.f5273b;
        this.f5273b = i2 + 1;
        objArr[i2] = obj;
    }

    public final void c(int i2) {
        int length = this.f5272a.length;
        int b6 = b(length, this.f5273b + i2);
        if (b6 > length || this.f5274c) {
            this.f5272a = Arrays.copyOf(this.f5272a, b6);
            this.f5274c = false;
        }
    }
}
