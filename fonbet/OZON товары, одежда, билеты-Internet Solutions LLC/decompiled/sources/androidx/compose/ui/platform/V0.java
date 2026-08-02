package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import k1.C7459e;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Parcel f40746a = Parcel.obtain();

    public final void a(byte b11) {
        this.f40746a.writeByte(b11);
    }

    public final void b(float f7) {
        this.f40746a.writeFloat(f7);
    }

    public final void c(@NotNull K1.D d11) {
        long j11;
        long j12;
        long j13;
        long j14;
        long f7 = d11.f();
        j11 = C7807Z.f72259m;
        byte b11 = 1;
        if (!C7807Z.p(f7, j11)) {
            a((byte) 1);
            this.f40746a.writeLong(d11.f());
        }
        long j15 = d11.j();
        j12 = Z1.u.f35334c;
        if (!Z1.u.c(j15, j12)) {
            a((byte) 2);
            d(d11.j());
        }
        P1.F m11 = d11.m();
        if (m11 != null) {
            a((byte) 3);
            this.f40746a.writeInt(m11.l());
        }
        P1.A k11 = d11.k();
        if (k11 != null) {
            int b12 = k11.b();
            a((byte) 4);
            a((b12 != 0 && b12 == 1) ? (byte) 1 : (byte) 0);
        }
        P1.B l11 = d11.l();
        if (l11 != null) {
            int b13 = l11.b();
            a((byte) 5);
            if (b13 != 0) {
                if (b13 != 1) {
                    if (b13 == 2) {
                        b11 = 2;
                    } else if (b13 == 3) {
                        b11 = 3;
                    }
                }
                a(b11);
            }
            b11 = 0;
            a(b11);
        }
        String i11 = d11.i();
        if (i11 != null) {
            a((byte) 6);
            this.f40746a.writeString(i11);
        }
        long n11 = d11.n();
        j13 = Z1.u.f35334c;
        if (!Z1.u.c(n11, j13)) {
            a((byte) 7);
            d(d11.n());
        }
        V1.a d12 = d11.d();
        if (d12 != null) {
            float b14 = d12.b();
            a((byte) 8);
            b(b14);
        }
        V1.m t2 = d11.t();
        if (t2 != null) {
            a((byte) 9);
            b(t2.b());
            b(t2.c());
        }
        long c11 = d11.c();
        j14 = C7807Z.f72259m;
        if (!C7807Z.p(c11, j14)) {
            a((byte) 10);
            this.f40746a.writeLong(d11.c());
        }
        V1.i r11 = d11.r();
        if (r11 != null) {
            a((byte) 11);
            this.f40746a.writeInt(r11.e());
        }
        l1.H0 q11 = d11.q();
        if (q11 != null) {
            a((byte) 12);
            this.f40746a.writeLong(q11.c());
            b(C7459e.g(q11.d()));
            b(C7459e.h(q11.d()));
            b(q11.b());
        }
    }

    public final void d(long j11) {
        long d11 = Z1.u.d(j11);
        byte b11 = 0;
        if (!Z1.v.b(d11, 0L)) {
            if (Z1.v.b(d11, 4294967296L)) {
                b11 = 1;
            } else if (Z1.v.b(d11, 8589934592L)) {
                b11 = 2;
            }
        }
        a(b11);
        if (Z1.v.b(Z1.u.d(j11), 0L)) {
            return;
        }
        b(Z1.u.e(j11));
    }

    @NotNull
    public final String e() {
        return Base64.encodeToString(this.f40746a.marshall(), 0);
    }

    public final void f() {
        this.f40746a.recycle();
        this.f40746a = Parcel.obtain();
    }
}
