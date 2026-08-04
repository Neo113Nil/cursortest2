package p046g0;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p052h0.a;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13046a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f13047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f13048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f13049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13051f;

    public o(r rVar) {
        this.f13047b = rVar;
        this.f13048c = rVar;
    }

    public final int a(int i7) {
        SparseArray sparseArray = this.f13048c.f13061a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(i7);
        int i8 = 1;
        int i9 = 2;
        if (this.f13046a == 2) {
            if (rVar != null) {
                this.f13048c = rVar;
                this.f13051f++;
            } else if (i7 == 65038) {
                b();
            } else if (i7 != 65039) {
                r rVar2 = this.f13048c;
                if (rVar2.f13062b != null) {
                    i9 = 3;
                    if (this.f13051f != 1) {
                        this.f13049d = rVar2;
                        b();
                    } else if (c()) {
                        this.f13049d = this.f13048c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i8 = i9;
        } else if (rVar == null) {
            b();
        } else {
            this.f13046a = 2;
            this.f13048c = rVar;
            this.f13051f = 1;
            i8 = i9;
        }
        this.f13050e = i7;
        return i8;
    }

    public final void b() {
        this.f13046a = 1;
        this.f13048c = this.f13047b;
        this.f13051f = 0;
    }

    public final boolean c() {
        a aVarC = this.f13048c.f13062b.c();
        int iA = aVarC.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarC.f5028d).get(iA + aVarC.f5025a) == 0) || this.f13050e == 65039;
    }
}
