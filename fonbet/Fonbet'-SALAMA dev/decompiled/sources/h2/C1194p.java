package h2;

import A1.X;
import C1.C0095a;
import F1.u;
import F1.v;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.EOFException;
import java.util.Arrays;
import u2.InterfaceC1633j;
import v2.t;

/* renamed from: h2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194p implements v {

    /* renamed from: f, reason: collision with root package name */
    public static final X f13460f;

    /* renamed from: g, reason: collision with root package name */
    public static final X f13461g;

    /* renamed from: a, reason: collision with root package name */
    public final v f13462a;

    /* renamed from: b, reason: collision with root package name */
    public final X f13463b;

    /* renamed from: c, reason: collision with root package name */
    public X f13464c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f13465d;

    /* renamed from: e, reason: collision with root package name */
    public int f13466e;

    static {
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "application/id3";
        f13460f = new X(format$Builder);
        Format$Builder format$Builder2 = new Format$Builder();
        format$Builder2.f10537k = "application/x-emsg";
        f13461g = new X(format$Builder2);
    }

    public C1194p(v vVar, int i7) {
        this.f13462a = vVar;
        if (i7 == 1) {
            this.f13463b = f13460f;
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException(e1.k.d(i7, "Unknown metadataType: "));
            }
            this.f13463b = f13461g;
        }
        this.f13465d = new byte[0];
        this.f13466e = 0;
    }

    @Override // F1.v
    public final void a(X x4) {
        this.f13464c = x4;
        this.f13462a.a(this.f13463b);
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        int i8 = this.f13466e + i7;
        byte[] bArr = this.f13465d;
        if (bArr.length < i8) {
            this.f13465d = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        c0095a.f(this.f13465d, this.f13466e, i7);
        this.f13466e += i7;
    }

    @Override // F1.v
    public final int d(InterfaceC1633j interfaceC1633j, int i7, boolean z4) {
        int i8 = this.f13466e + i7;
        byte[] bArr = this.f13465d;
        if (bArr.length < i8) {
            this.f13465d = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        int read = interfaceC1633j.read(this.f13465d, this.f13466e, i7);
        if (read != -1) {
            this.f13466e += read;
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F1.v
    public final void e(long j, int i7, int i8, int i9, u uVar) {
        this.f13464c.getClass();
        int i10 = this.f13466e - i9;
        C0095a c0095a = new C0095a(Arrays.copyOfRange(this.f13465d, i10 - i8, i10));
        byte[] bArr = this.f13465d;
        System.arraycopy(bArr, i10, bArr, 0, i9);
        this.f13466e = i9;
        String str = this.f13464c.f283C;
        X x4 = this.f13463b;
        if (!t.a(str, x4.f283C)) {
            if (!"application/x-emsg".equals(this.f13464c.f283C)) {
                Log.w("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f13464c.f283C);
                return;
            }
            EventMessage h02 = U1.a.h0(c0095a);
            X f7 = h02.f();
            String str2 = x4.f283C;
            if (f7 == null || !t.a(str2, f7.f283C)) {
                Log.w("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + h02.f());
                return;
            }
            byte[] l7 = h02.l();
            l7.getClass();
            c0095a = new C0095a(l7);
        }
        int d7 = c0095a.d();
        v vVar = this.f13462a;
        vVar.c(d7, c0095a);
        vVar.e(j, i7, d7, i9, uVar);
    }
}
