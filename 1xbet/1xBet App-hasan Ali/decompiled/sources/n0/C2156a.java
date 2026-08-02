package n0;

import W0.j;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.graphics.Bitmap;
import i0.C2001f;
import i0.C2006k;
import kotlin.jvm.internal.l;
import z0.C2733I;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2156a extends AbstractC2157b {

    /* renamed from: o, reason: collision with root package name */
    public final C2001f f18346o;

    /* renamed from: p, reason: collision with root package name */
    public final long f18347p;

    /* renamed from: q, reason: collision with root package name */
    public int f18348q = 1;

    /* renamed from: r, reason: collision with root package name */
    public final long f18349r;

    /* renamed from: s, reason: collision with root package name */
    public float f18350s;

    /* renamed from: t, reason: collision with root package name */
    public C2006k f18351t;

    public C2156a(C2001f c2001f, long j5) {
        int i;
        int i5;
        this.f18346o = c2001f;
        this.f18347p = j5;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i = (int) (j5 >> 32)) >= 0 && (i5 = (int) (4294967295L & j5)) >= 0) {
            Bitmap bitmap = c2001f.f17276a;
            if (i <= bitmap.getWidth() && i5 <= bitmap.getHeight()) {
                this.f18349r = j5;
                this.f18350s = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // n0.AbstractC2157b
    public final void b(float f) {
        this.f18350s = f;
    }

    @Override // n0.AbstractC2157b
    public final void d(C2006k c2006k) {
        this.f18351t = c2006k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2156a)) {
            return false;
        }
        C2156a c2156a = (C2156a) obj;
        return l.a(this.f18346o, c2156a.f18346o) && j.a(0L, 0L) && W0.l.a(this.f18347p, c2156a.f18347p) && this.f18348q == c2156a.f18348q;
    }

    @Override // n0.AbstractC2157b
    public final long h() {
        return AbstractC0444a.d0(this.f18349r);
    }

    public final int hashCode() {
        int hashCode = (((int) 0) + (this.f18346o.hashCode() * 31)) * 31;
        long j5 = this.f18347p;
        return ((((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31) + this.f18348q;
    }

    @Override // n0.AbstractC2157b
    public final void i(C2733I c2733i) {
        int round = Math.round(Float.intBitsToFloat((int) (c2733i.d() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (c2733i.d() & 4294967295L)));
        AbstractC0467k.i(c2733i, this.f18346o, this.f18347p, (round << 32) | (round2 & 4294967295L), this.f18350s, this.f18351t, this.f18348q, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f18346o);
        sb.append(", srcOffset=");
        sb.append((Object) j.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) W0.l.b(this.f18347p));
        sb.append(", filterQuality=");
        int i = this.f18348q;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
