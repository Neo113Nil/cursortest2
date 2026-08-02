package P1;

import java.util.Arrays;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f5358a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5359b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5360c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5361d;

    /* renamed from: e, reason: collision with root package name */
    public int f5362e;

    public u(int i7) {
        this.f5358a = i7;
        byte[] bArr = new byte[131];
        this.f5361d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f5359b) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f5361d;
            int length = bArr2.length;
            int i10 = this.f5362e;
            if (length < i10 + i9) {
                this.f5361d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
            }
            System.arraycopy(bArr, i7, this.f5361d, this.f5362e, i9);
            this.f5362e += i9;
        }
    }

    public final boolean b(int i7) {
        if (!this.f5359b) {
            return false;
        }
        this.f5362e -= i7;
        this.f5359b = false;
        this.f5360c = true;
        return true;
    }

    public final void c() {
        this.f5359b = false;
        this.f5360c = false;
    }

    public final void d(int i7) {
        AbstractC1664a.h(!this.f5359b);
        boolean z4 = i7 == this.f5358a;
        this.f5359b = z4;
        if (z4) {
            this.f5362e = 3;
            this.f5360c = false;
        }
    }
}
