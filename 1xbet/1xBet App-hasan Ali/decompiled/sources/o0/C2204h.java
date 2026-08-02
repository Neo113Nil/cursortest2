package o0;

import a3.AbstractC0467k;
import android.graphics.Path;
import i0.AbstractC2005j;
import i0.C2003h;
import i0.C2004i;
import i0.M;
import k0.InterfaceC2025e;
import t3.AbstractC2425d;

/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204h extends v {

    /* renamed from: b, reason: collision with root package name */
    public M f18552b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18553c;

    /* renamed from: d, reason: collision with root package name */
    public float f18554d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18555e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final C2003h f18556g;

    /* renamed from: h, reason: collision with root package name */
    public C2003h f18557h;
    public final Object i;

    public C2204h() {
        int i = z.f18603a;
        this.f18553c = X3.v.f6090k;
        this.f18554d = 1.0f;
        this.f18555e = true;
        C2003h a5 = AbstractC2005j.a();
        this.f18556g = a5;
        this.f18557h = a5;
        this.i = G4.d.D(W3.f.f6034k, C2203g.f18549m);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // o0.v
    public final void a(InterfaceC2025e interfaceC2025e) {
        if (this.f18555e) {
            AbstractC2425d.K(this.f18553c, this.f18556g);
            e();
        } else if (this.f) {
            e();
        }
        this.f18555e = false;
        this.f = false;
        M m5 = this.f18552b;
        if (m5 != null) {
            AbstractC0467k.k(interfaceC2025e, this.f18557h, m5, 1.0f, null, 56);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [W3.e, java.lang.Object] */
    public final void e() {
        Path path;
        float f = this.f18554d;
        C2003h c2003h = this.f18556g;
        if (f == 1.0f) {
            this.f18557h = c2003h;
            return;
        }
        if (kotlin.jvm.internal.l.a(this.f18557h, c2003h)) {
            this.f18557h = AbstractC2005j.a();
        } else {
            Path.FillType fillType = this.f18557h.f17279a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z3 = fillType == fillType2;
            this.f18557h.f17279a.rewind();
            C2003h c2003h2 = this.f18557h;
            c2003h2.getClass();
            if (!z3) {
                fillType2 = Path.FillType.WINDING;
            }
            c2003h2.f17279a.setFillType(fillType2);
        }
        ?? r02 = this.i;
        C2004i c2004i = (C2004i) r02.getValue();
        if (c2003h != null) {
            c2004i.getClass();
            path = c2003h.f17279a;
        } else {
            path = null;
        }
        c2004i.f17282a.setPath(path, false);
        float length = ((C2004i) r02.getValue()).f17282a.getLength();
        float f5 = 0.0f * length;
        float f6 = ((this.f18554d + 0.0f) % 1.0f) * length;
        if (f5 <= f6) {
            ((C2004i) r02.getValue()).a(f5, f6, this.f18557h);
        } else {
            ((C2004i) r02.getValue()).a(f5, length, this.f18557h);
            ((C2004i) r02.getValue()).a(0.0f, f6, this.f18557h);
        }
    }

    public final String toString() {
        return this.f18556g.toString();
    }
}
