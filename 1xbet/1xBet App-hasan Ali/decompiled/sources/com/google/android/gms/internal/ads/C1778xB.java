package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1778xB extends OutputStream {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f16266p = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    public int f16269m;

    /* renamed from: o, reason: collision with root package name */
    public int f16271o;

    /* renamed from: k, reason: collision with root package name */
    public final int f16267k = 128;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16268l = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public byte[] f16270n = new byte[128];

    public final synchronized AbstractC1823yB b() {
        try {
            int i = this.f16271o;
            byte[] bArr = this.f16270n;
            if (i >= bArr.length) {
                this.f16268l.add(new C1733wB(this.f16270n));
                this.f16270n = f16266p;
            } else if (i > 0) {
                this.f16268l.add(new C1733wB(Arrays.copyOf(bArr, i)));
            }
            this.f16269m += this.f16271o;
            this.f16271o = 0;
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC1823yB.q(this.f16268l);
    }

    public final void d(int i) {
        this.f16268l.add(new C1733wB(this.f16270n));
        int length = this.f16269m + this.f16270n.length;
        this.f16269m = length;
        this.f16270n = new byte[Math.max(this.f16267k, Math.max(i, length >>> 1))];
        this.f16271o = 0;
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f16269m + this.f16271o;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f16271o == this.f16270n.length) {
                d(1);
            }
            byte[] bArr = this.f16270n;
            int i5 = this.f16271o;
            this.f16271o = i5 + 1;
            bArr[i5] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i5) {
        byte[] bArr2 = this.f16270n;
        int length = bArr2.length;
        int i6 = this.f16271o;
        int i7 = length - i6;
        if (i5 <= i7) {
            System.arraycopy(bArr, i, bArr2, i6, i5);
            this.f16271o += i5;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i7);
        int i8 = i5 - i7;
        d(i8);
        System.arraycopy(bArr, i + i7, this.f16270n, 0, i8);
        this.f16271o = i8;
    }
}
