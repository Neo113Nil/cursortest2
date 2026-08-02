package io.objectbox.flatbuffers;

import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class a {
    public byte[] a;
    public int b;

    public a(int i) {
        this.a = new byte[i];
        this.b = 0;
    }

    public final int a(int i) {
        byte[] bArr = this.a;
        return (bArr[i] & UByte.MAX_VALUE) | (bArr[i + 3] << 24) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8);
    }

    public final long b(int i) {
        byte[] bArr = this.a;
        int i2 = i + 6;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i2] & 255) << 48) | (bArr[i + 7] << 56);
    }

    public final void c(byte b) {
        int i = this.b;
        e(i + 1);
        this.a[i] = b;
        this.b++;
    }

    public final void d(byte[] bArr, int i) {
        int i2 = this.b;
        e(i + i2);
        System.arraycopy(bArr, 0, this.a, i2, i);
        this.b += i;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Capacity may not be negative (likely a previous int overflow)");
        }
        byte[] bArr = this.a;
        if (bArr.length >= i) {
            return;
        }
        int length = bArr.length;
        int i2 = length + (length >> 1);
        if (i2 >= i) {
            i = i2;
        }
        this.a = Arrays.copyOf(bArr, i);
    }

    public a(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }
}
