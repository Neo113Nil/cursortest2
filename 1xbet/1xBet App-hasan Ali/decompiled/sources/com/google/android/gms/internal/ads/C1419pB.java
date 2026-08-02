package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419pB {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14973a;

    public C1419pB(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f14973a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C1419pB a(byte[] bArr) {
        if (bArr != null) {
            return new C1419pB(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] b() {
        byte[] bArr = this.f14973a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1419pB) {
            return Arrays.equals(((C1419pB) obj).f14973a, this.f14973a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14973a);
    }

    public final String toString() {
        byte[] bArr = this.f14973a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b3 : bArr) {
            sb.append("0123456789abcdef".charAt((b3 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b3 & 15));
        }
        return L1.a.n("Bytes(", sb.toString(), ")");
    }
}
