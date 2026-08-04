package p054h2;

import java.util.Arrays;
import q6.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p032e2.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public byte[] f13370A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile boolean f13371B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public byte[] f13372C;

    @Override // p146u2.H
    public final void l() {
        this.f13371B = true;
    }

    @Override // p146u2.H
    public final void load() {
        try {
            this.f12607z.o(this.f12600b);
            int i7 = 0;
            int i8 = 0;
            while (i7 != -1 && !this.f13371B) {
                byte[] bArr = this.f13370A;
                if (bArr.length < i8 + 16384) {
                    this.f13370A = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f12607z.read(this.f13370A, i8, 16384);
                if (i7 != -1) {
                    i8 += i7;
                }
            }
            if (!this.f13371B) {
                this.f13372C = Arrays.copyOf(this.f13370A, i8);
            }
        } finally {
            a.b(this.f12607z);
        }
    }
}
