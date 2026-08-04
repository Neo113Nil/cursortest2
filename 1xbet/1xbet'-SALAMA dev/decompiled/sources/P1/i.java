package P1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f5210e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f5214d;

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f5211a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f5214d;
            int length = bArr2.length;
            int i10 = this.f5212b + i9;
            if (length < i10) {
                this.f5214d = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i7, this.f5214d, this.f5212b, i9);
            this.f5212b += i9;
        }
    }
}
