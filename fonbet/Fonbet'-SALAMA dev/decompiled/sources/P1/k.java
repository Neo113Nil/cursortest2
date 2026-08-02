package P1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f5231f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f5232a;

    /* renamed from: b, reason: collision with root package name */
    public int f5233b;

    /* renamed from: c, reason: collision with root package name */
    public int f5234c;

    /* renamed from: d, reason: collision with root package name */
    public int f5235d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f5236e;

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f5232a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f5236e;
            int length = bArr2.length;
            int i10 = this.f5234c + i9;
            if (length < i10) {
                this.f5236e = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i7, this.f5236e, this.f5234c, i9);
            this.f5234c += i9;
        }
    }
}
