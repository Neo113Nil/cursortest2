package o0;

import i0.AbstractC2005j;
import i0.C2003h;
import i0.M;
import java.util.ArrayList;
import java.util.List;
import k0.C2023c;
import k0.InterfaceC2025e;
import t3.AbstractC2425d;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2198b extends v {

    /* renamed from: b, reason: collision with root package name */
    public float[] f18516b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18517c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f18518d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f18519e = i0.p.f17293g;
    public List f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18520g;

    /* renamed from: h, reason: collision with root package name */
    public C2003h f18521h;
    public kotlin.jvm.internal.m i;

    /* renamed from: j, reason: collision with root package name */
    public final A.B f18522j;

    /* renamed from: k, reason: collision with root package name */
    public String f18523k;

    /* renamed from: l, reason: collision with root package name */
    public float f18524l;

    /* renamed from: m, reason: collision with root package name */
    public float f18525m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18526n;

    public C2198b() {
        int i = z.f18603a;
        this.f = X3.v.f6090k;
        this.f18520g = true;
        this.f18522j = new A.B(26, this);
        this.f18523k = "";
        this.f18524l = 1.0f;
        this.f18525m = 1.0f;
        this.f18526n = true;
    }

    @Override // o0.v
    public final void a(InterfaceC2025e interfaceC2025e) {
        if (this.f18526n) {
            float[] fArr = this.f18516b;
            if (fArr == null) {
                fArr = i0.z.a();
                this.f18516b = fArr;
            } else {
                i0.z.d(fArr);
            }
            i0.z.f(fArr, 0.0f, 0.0f);
            if (fArr.length >= 16) {
                double d5 = 0.0f * 0.017453292519943295d;
                float sin = (float) Math.sin(d5);
                float cos = (float) Math.cos(d5);
                float f = fArr[0];
                float f5 = fArr[4];
                float f6 = (sin * f5) + (cos * f);
                float f7 = -sin;
                float f8 = (f5 * cos) + (f * f7);
                float f9 = fArr[1];
                float f10 = fArr[5];
                float f11 = (sin * f10) + (cos * f9);
                float f12 = (f10 * cos) + (f9 * f7);
                float f13 = fArr[2];
                float f14 = fArr[6];
                float f15 = (sin * f14) + (cos * f13);
                float f16 = (f14 * cos) + (f13 * f7);
                float f17 = fArr[3];
                float f18 = fArr[7];
                fArr[0] = f6;
                fArr[1] = f11;
                fArr[2] = f15;
                fArr[3] = (sin * f18) + (cos * f17);
                fArr[4] = f8;
                fArr[5] = f12;
                fArr[6] = f16;
                fArr[7] = (cos * f18) + (f7 * f17);
            }
            float f19 = this.f18524l;
            float f20 = this.f18525m;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f19;
                fArr[1] = fArr[1] * f19;
                fArr[2] = fArr[2] * f19;
                fArr[3] = fArr[3] * f19;
                fArr[4] = fArr[4] * f20;
                fArr[5] = fArr[5] * f20;
                fArr[6] = fArr[6] * f20;
                fArr[7] = fArr[7] * f20;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            i0.z.f(fArr, -0.0f, -0.0f);
            this.f18526n = false;
        }
        if (this.f18520g) {
            if (!this.f.isEmpty()) {
                C2003h c2003h = this.f18521h;
                if (c2003h == null) {
                    c2003h = AbstractC2005j.a();
                    this.f18521h = c2003h;
                }
                AbstractC2425d.K(this.f, c2003h);
            }
            this.f18520g = false;
        }
        v3.e B5 = interfaceC2025e.B();
        long A3 = B5.A();
        B5.v().k();
        try {
            C2023c c2023c = (C2023c) B5.f20432l;
            float[] fArr2 = this.f18516b;
            v3.e eVar = (v3.e) c2023c.f17544l;
            if (fArr2 != null) {
                eVar.v().q(fArr2);
            }
            C2003h c2003h2 = this.f18521h;
            if (!this.f.isEmpty() && c2003h2 != null) {
                eVar.v().d(c2003h2);
            }
            ArrayList arrayList = this.f18517c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((v) arrayList.get(i)).a(interfaceC2025e);
            }
        } finally {
            B5.v().j();
            B5.P(A3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // o0.v
    public final i4.c b() {
        return this.i;
    }

    @Override // o0.v
    public final void d(A.B b3) {
        this.i = b3;
    }

    public final void e(int i, v vVar) {
        ArrayList arrayList = this.f18517c;
        if (i < arrayList.size()) {
            arrayList.set(i, vVar);
        } else {
            arrayList.add(vVar);
        }
        g(vVar);
        vVar.d(this.f18522j);
        c();
    }

    public final void f(long j5) {
        if (this.f18518d && j5 != 16) {
            long j6 = this.f18519e;
            if (j6 == 16) {
                this.f18519e = j5;
                return;
            }
            int i = z.f18603a;
            if (i0.p.h(j6) == i0.p.h(j5) && i0.p.g(j6) == i0.p.g(j5) && i0.p.e(j6) == i0.p.e(j5)) {
                return;
            }
            this.f18518d = false;
            this.f18519e = i0.p.f17293g;
        }
    }

    public final void g(v vVar) {
        if (vVar instanceof C2204h) {
            M m5 = ((C2204h) vVar).f18552b;
            if (this.f18518d && m5 != null) {
                f(m5.f17262e);
                return;
            }
            return;
        }
        if (vVar instanceof C2198b) {
            C2198b c2198b = (C2198b) vVar;
            if (c2198b.f18518d && this.f18518d) {
                f(c2198b.f18519e);
            } else {
                this.f18518d = false;
                this.f18519e = i0.p.f17293g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f18523k);
        ArrayList arrayList = this.f18517c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v vVar = (v) arrayList.get(i);
            sb.append("\t");
            sb.append(vVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
