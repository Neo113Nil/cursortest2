package p054h2;

import A1.X;
import C1.C0095a;
import F1.u;
import F1.v;
import U1.a;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.EOFException;
import java.util.Arrays;
import p031e1.k;
import p146u2.InterfaceC0951j;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class p implements v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final X f13466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final X f13467g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f13468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f13469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X f13470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f13471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13472e;

    static {
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "application/id3";
        f13466f = new X(format$Builder);
        Format$Builder format$Builder2 = new Format$Builder();
        format$Builder2.f10537k = "application/x-emsg";
        f13467g = new X(format$Builder2);
    }

    public p(v vVar, int i7) {
        this.f13468a = vVar;
        if (i7 == 1) {
            this.f13469b = f13466f;
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException(k.d(i7, "Unknown metadataType: "));
            }
            this.f13469b = f13467g;
        }
        this.f13471d = new byte[0];
        this.f13472e = 0;
    }

    @Override // F1.v
    public final void a(X x4) {
        this.f13470c = x4;
        this.f13468a.a(this.f13469b);
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        int i8 = this.f13472e + i7;
        byte[] bArr = this.f13471d;
        if (bArr.length < i8) {
            this.f13471d = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        c0095a.f(this.f13471d, this.f13472e, i7);
        this.f13472e += i7;
    }

    @Override // F1.v
    public final int d(InterfaceC0951j interfaceC0951j, int i7, boolean z4) throws EOFException {
        int i8 = this.f13472e + i7;
        byte[] bArr = this.f13471d;
        if (bArr.length < i8) {
            this.f13471d = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        int i9 = interfaceC0951j.read(this.f13471d, this.f13472e, i7);
        if (i9 != -1) {
            this.f13472e += i9;
            return i9;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F1.v
    public final void e(long j, int i7, int i8, int i9, u uVar) {
        this.f13470c.getClass();
        int i10 = this.f13472e - i9;
        C0095a c0095a = new C0095a(Arrays.copyOfRange(this.f13471d, i10 - i8, i10));
        byte[] bArr = this.f13471d;
        System.arraycopy(bArr, i10, bArr, 0, i9);
        this.f13472e = i9;
        String str = this.f13470c.f283C;
        X x4 = this.f13469b;
        if (!t.a(str, x4.f283C)) {
            if (!"application/x-emsg".equals(this.f13470c.f283C)) {
                Log.w("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f13470c.f283C);
                return;
            }
            EventMessage eventMessageH0 = a.h0(c0095a);
            X xF = eventMessageH0.f();
            String str2 = x4.f283C;
            if (xF == null || !t.a(str2, xF.f283C)) {
                Log.w("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + eventMessageH0.f());
                return;
            }
            byte[] bArrL = eventMessageH0.l();
            bArrL.getClass();
            c0095a = new C0095a(bArrL);
        }
        int iD = c0095a.d();
        v vVar = this.f13468a;
        vVar.c(iD, c0095a);
        vVar.e(j, i7, iD, i9, uVar);
    }
}
