package y4;

import L4.C0226i;
import L4.C0229l;
import L4.InterfaceC0227j;
import java.util.List;
import java.util.regex.Pattern;
import v.AbstractC2528x;

/* loaded from: classes.dex */
public final class s extends x {

    /* renamed from: e, reason: collision with root package name */
    public static final q f21377e;
    public static final q f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f21378g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f21379h;
    public static final byte[] i;

    /* renamed from: a, reason: collision with root package name */
    public final C0229l f21380a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21381b;

    /* renamed from: c, reason: collision with root package name */
    public final q f21382c;

    /* renamed from: d, reason: collision with root package name */
    public long f21383d;

    static {
        Pattern pattern = q.f21370d;
        f21377e = AbstractC2528x.d("multipart/mixed");
        AbstractC2528x.d("multipart/alternative");
        AbstractC2528x.d("multipart/digest");
        AbstractC2528x.d("multipart/parallel");
        f = AbstractC2528x.d("multipart/form-data");
        f21378g = new byte[]{58, 32};
        f21379h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public s(C0229l c0229l, q qVar, List list) {
        kotlin.jvm.internal.l.f("boundaryByteString", c0229l);
        kotlin.jvm.internal.l.f("type", qVar);
        this.f21380a = c0229l;
        this.f21381b = list;
        Pattern pattern = q.f21370d;
        this.f21382c = AbstractC2528x.d(qVar + "; boundary=" + c0229l.p());
        this.f21383d = -1L;
    }

    @Override // y4.x
    public final long a() {
        long j5 = this.f21383d;
        if (j5 != -1) {
            return j5;
        }
        long d5 = d(null, true);
        this.f21383d = d5;
        return d5;
    }

    @Override // y4.x
    public final q b() {
        return this.f21382c;
    }

    @Override // y4.x
    public final void c(InterfaceC0227j interfaceC0227j) {
        d(interfaceC0227j, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(InterfaceC0227j interfaceC0227j, boolean z3) {
        C0226i c0226i;
        InterfaceC0227j interfaceC0227j2;
        if (z3) {
            interfaceC0227j2 = new C0226i();
            c0226i = interfaceC0227j2;
        } else {
            c0226i = 0;
            interfaceC0227j2 = interfaceC0227j;
        }
        List list = this.f21381b;
        int size = list.size();
        long j5 = 0;
        int i5 = 0;
        while (true) {
            C0229l c0229l = this.f21380a;
            byte[] bArr = i;
            byte[] bArr2 = f21379h;
            if (i5 >= size) {
                kotlin.jvm.internal.l.c(interfaceC0227j2);
                interfaceC0227j2.q(bArr);
                interfaceC0227j2.g(c0229l);
                interfaceC0227j2.q(bArr);
                interfaceC0227j2.q(bArr2);
                if (!z3) {
                    return j5;
                }
                kotlin.jvm.internal.l.c(c0226i);
                long j6 = j5 + c0226i.f3091l;
                c0226i.b();
                return j6;
            }
            r rVar = (r) list.get(i5);
            m mVar = rVar.f21375a;
            kotlin.jvm.internal.l.c(interfaceC0227j2);
            interfaceC0227j2.q(bArr);
            interfaceC0227j2.g(c0229l);
            interfaceC0227j2.q(bArr2);
            int size2 = mVar.size();
            for (int i6 = 0; i6 < size2; i6++) {
                interfaceC0227j2.x(mVar.e(i6)).q(f21378g).x(mVar.g(i6)).q(bArr2);
            }
            x xVar = rVar.f21376b;
            q b3 = xVar.b();
            if (b3 != null) {
                interfaceC0227j2.x("Content-Type: ").x(b3.f21372a).q(bArr2);
            }
            long a5 = xVar.a();
            if (a5 != -1) {
                interfaceC0227j2.x("Content-Length: ").y(a5).q(bArr2);
            } else if (z3) {
                kotlin.jvm.internal.l.c(c0226i);
                c0226i.b();
                return -1L;
            }
            interfaceC0227j2.q(bArr2);
            if (z3) {
                j5 += a5;
            } else {
                xVar.c(interfaceC0227j2);
            }
            interfaceC0227j2.q(bArr2);
            i5++;
        }
    }
}
