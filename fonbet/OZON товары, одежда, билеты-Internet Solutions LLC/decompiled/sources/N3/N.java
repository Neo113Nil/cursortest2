package N3;

import N3.M;
import java.io.IOException;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18520a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f18521b;

    /* renamed from: c, reason: collision with root package name */
    private int f18522c;

    /* renamed from: d, reason: collision with root package name */
    private long f18523d;

    /* renamed from: e, reason: collision with root package name */
    private int f18524e;

    /* renamed from: f, reason: collision with root package name */
    private int f18525f;

    /* renamed from: g, reason: collision with root package name */
    private int f18526g;

    public final void a(M m11, M.a aVar) {
        if (this.f18522c > 0) {
            m11.b(this.f18523d, this.f18524e, this.f18525f, this.f18526g, aVar);
            this.f18522c = 0;
        }
    }

    public final void b() {
        this.f18521b = false;
        this.f18522c = 0;
    }

    public final void c(M m11, long j11, int i11, int i12, int i13, M.a aVar) {
        G10.a.g("TrueHD chunk samples must be contiguous in the sample queue.", this.f18526g <= i12 + i13);
        if (this.f18521b) {
            int i14 = this.f18522c;
            int i15 = i14 + 1;
            this.f18522c = i15;
            if (i14 == 0) {
                this.f18523d = j11;
                this.f18524e = i11;
                this.f18525f = 0;
            }
            this.f18525f += i12;
            this.f18526g = i13;
            if (i15 >= 16) {
                a(m11, aVar);
            }
        }
    }

    public final void d(q qVar) throws IOException {
        if (this.f18521b) {
            return;
        }
        byte[] bArr = this.f18520a;
        int i11 = 0;
        qVar.a(0, 10, bArr);
        qVar.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b11 = bArr[7];
            if ((b11 & 254) == 186) {
                i11 = 40 << ((bArr[(b11 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i11 == 0) {
            return;
        }
        this.f18521b = true;
    }
}
