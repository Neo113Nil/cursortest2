package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 implements Iterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4041j;

    /* JADX INFO: renamed from: k */
    public int f4042k = 0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AbstractSet f4043l;

    public /* synthetic */ jn1(AbstractSet abstractSet, int i) {
        this.f4041j = i;
        this.f4043l = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4041j;
        AbstractSet abstractSet = this.f4043l;
        switch (i) {
            case 0:
                kn1 kn1Var = (kn1) abstractSet;
                return this.f4042k < kn1Var.m3058c() - kn1Var.m3057b();
            default:
                return this.f4042k < ((yb2) ((C0867x7) abstractSet).f8839k).f9268e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4041j;
        AbstractSet abstractSet = this.f4043l;
        switch (i) {
            case 0:
                int i2 = this.f4042k;
                kn1 kn1Var = (kn1) abstractSet;
                if (i2 >= kn1Var.m3058c() - kn1Var.m3057b()) {
                    throw new NoSuchElementException();
                }
                ln1 ln1Var = kn1Var.f4465k;
                Object obj = ln1Var.f4858j[kn1Var.m3057b() + i2];
                this.f4042k = i2 + 1;
                return obj;
            default:
                int i3 = this.f4042k;
                this.f4042k = i3 + 1;
                yb2 yb2Var = (yb2) ((C0867x7) abstractSet).f8839k;
                return yb2Var.m5753d(yb2Var.f9267d[i3] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4041j) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
