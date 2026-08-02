package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xb2 implements Iterator {

    /* JADX INFO: renamed from: j */
    public final db2 f8878j;

    /* JADX INFO: renamed from: k */
    public int f8879k;

    /* JADX INFO: renamed from: l */
    public int f8880l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ yb2 f8881m;

    public /* synthetic */ xb2(yb2 yb2Var, db2 db2Var, int i) {
        this.f8881m = yb2Var;
        this.f8878j = db2Var;
        int i2 = i & 31;
        this.f8879k = i2;
        this.f8880l = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8879k >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8879k;
        yb2 yb2Var = this.f8881m;
        d71 d71Var = yb2Var.f9265b;
        int iMo1126s = d71Var.mo1126s();
        Object objCast = this.f8878j.f1614b.cast(i >= iMo1126s ? yb2Var.f9266c.mo1128v(i - iMo1126s) : d71Var.mo1128v(i));
        int i2 = this.f8880l;
        if (i2 == 0) {
            this.f8879k = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.f8880l >>>= iNumberOfTrailingZeros;
        this.f8879k += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
