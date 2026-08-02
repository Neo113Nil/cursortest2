package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class I2 {
    public static final byte[] f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f9516a;

    /* renamed from: b, reason: collision with root package name */
    public int f9517b;

    /* renamed from: c, reason: collision with root package name */
    public int f9518c;

    /* renamed from: d, reason: collision with root package name */
    public int f9519d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f9520e;

    public final void a(byte[] bArr, int i, int i5) {
        if (this.f9516a) {
            int i6 = i5 - i;
            byte[] bArr2 = this.f9520e;
            int length = bArr2.length;
            int i7 = this.f9518c + i6;
            if (length < i7) {
                this.f9520e = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i, this.f9520e, this.f9518c, i6);
            this.f9518c += i6;
        }
    }
}
