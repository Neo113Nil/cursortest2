package W5;

import e6.C1054c;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: W5.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0492c1 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7153a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public X5.t f7154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0498e1 f7155c;

    public C0492c1(C0498e1 c0498e1) {
        this.f7155c = c0498e1;
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        X5.t tVar = this.f7154b;
        if (tVar == null || tVar.f7625b <= 0) {
            write(new byte[]{(byte) i7}, 0, 1);
            return;
        }
        tVar.f7624a.n((byte) i7);
        tVar.f7625b--;
        tVar.f7626c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        X5.t tVar = this.f7154b;
        ArrayList arrayList = this.f7153a;
        C0498e1 c0498e1 = this.f7155c;
        if (tVar == null) {
            c0498e1.f7199x.getClass();
            X5.t k7 = C1054c.k(i8);
            this.f7154b = k7;
            arrayList.add(k7);
        }
        while (i8 > 0) {
            int min = Math.min(i8, this.f7154b.f7625b);
            if (min == 0) {
                int max = Math.max(i8, this.f7154b.f7626c * 2);
                c0498e1.f7199x.getClass();
                X5.t k8 = C1054c.k(max);
                this.f7154b = k8;
                arrayList.add(k8);
            } else {
                this.f7154b.a(bArr, i7, min);
                i7 += min;
                i8 -= min;
            }
        }
    }
}
