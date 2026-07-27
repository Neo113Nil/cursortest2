package m1;

import java.io.OutputStream;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f10097a;

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f10097a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f10097a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        int i5;
        if (i3 >= 0 && i3 <= bArr.length && i4 >= 0 && (i5 = i3 + i4) <= bArr.length && i5 >= 0) {
            this.f10097a += i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
