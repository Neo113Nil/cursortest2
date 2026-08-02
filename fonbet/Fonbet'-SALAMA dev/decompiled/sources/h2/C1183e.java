package h2;

import e2.AbstractC1008e;
import java.util.Arrays;

/* renamed from: h2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1183e extends AbstractC1008e {

    /* renamed from: A, reason: collision with root package name */
    public byte[] f13364A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f13365B;

    /* renamed from: C, reason: collision with root package name */
    public byte[] f13366C;

    @Override // u2.H
    public final void l() {
        this.f13365B = true;
    }

    @Override // u2.H
    public final void load() {
        try {
            this.f12601z.o(this.f12594b);
            int i7 = 0;
            int i8 = 0;
            while (i7 != -1 && !this.f13365B) {
                byte[] bArr = this.f13364A;
                if (bArr.length < i8 + 16384) {
                    this.f13364A = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f12601z.read(this.f13364A, i8, 16384);
                if (i7 != -1) {
                    i8 += i7;
                }
            }
            if (!this.f13365B) {
                this.f13366C = Arrays.copyOf(this.f13364A, i8);
            }
            q6.a.b(this.f12601z);
        } catch (Throwable th) {
            q6.a.b(this.f12601z);
            throw th;
        }
    }
}
