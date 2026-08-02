package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class G2 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f9158e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f9159a;

    /* renamed from: b, reason: collision with root package name */
    public int f9160b;

    /* renamed from: c, reason: collision with root package name */
    public int f9161c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9162d;

    public final void a(byte[] bArr, int i, int i5) {
        if (this.f9159a) {
            int i6 = i5 - i;
            byte[] bArr2 = this.f9162d;
            int length = bArr2.length;
            int i7 = this.f9160b + i6;
            if (length < i7) {
                this.f9162d = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i, this.f9162d, this.f9160b, i6);
            this.f9160b += i6;
        }
    }
}
