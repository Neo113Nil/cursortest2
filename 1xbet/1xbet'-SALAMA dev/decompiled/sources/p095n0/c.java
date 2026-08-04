package p095n0;

import B3.g;
import androidx.lifecycle.S;
import p122r.m;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public class c extends S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1009l0 f15296f = new C1009l0(19);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f15297d = new m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15298e = false;

    @Override // androidx.lifecycle.S
    public final void b() {
        m mVar = this.f15297d;
        int i7 = mVar.f16017c;
        for (int i8 = 0; i8 < i7; i8++) {
            b bVar = (b) mVar.f16016b[i8];
            p033e3.c cVar = bVar.f15293l;
            cVar.a();
            cVar.f12660c = true;
            g gVar = bVar.f15295n;
            if (gVar != null) {
                bVar.h(gVar);
            }
            b bVar2 = cVar.f12658a;
            if (bVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (bVar2 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            cVar.f12658a = null;
            if (gVar != null) {
                boolean z4 = gVar.f1063b;
            }
            cVar.f12661d = true;
            cVar.f12659b = false;
            cVar.f12660c = false;
            cVar.f12662e = false;
        }
        int i9 = mVar.f16017c;
        Object[] objArr = mVar.f16016b;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        mVar.f16017c = 0;
    }
}
