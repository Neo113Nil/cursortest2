package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: pd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0577pd implements Iterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6089j = 2;

    /* JADX INFO: renamed from: k */
    public int f6090k = 0;

    /* JADX INFO: renamed from: l */
    public final int f6091l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f6092m;

    public C0577pd(ko1 ko1Var) {
        this.f6092m = ko1Var;
        this.f6091l = ko1Var.mo2330c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6089j) {
            case 0:
                return this.f6090k < this.f6091l;
            case 1:
                return this.f6090k < this.f6091l;
            default:
                return this.f6090k < this.f6091l;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6089j;
        Object obj = this.f6092m;
        int i2 = this.f6091l;
        switch (i) {
            case 0:
                int i3 = this.f6090k;
                if (i3 >= i2) {
                    throw new NoSuchElementException();
                }
                this.f6090k = i3 + 1;
                return Byte.valueOf(((C0762ud) obj).mo4066f(i3));
            case 1:
                int i4 = this.f6090k;
                if (i4 >= i2) {
                    throw new NoSuchElementException();
                }
                this.f6090k = i4 + 1;
                return Byte.valueOf(((C0799vd) obj).mo4341g(i4));
            default:
                int i5 = this.f6090k;
                if (i5 >= i2) {
                    throw new NoSuchElementException();
                }
                this.f6090k = i5 + 1;
                return Byte.valueOf(((ko1) obj).mo2329b(i5));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6089j) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0577pd(C0762ud c0762ud) {
        this.f6092m = c0762ud;
        this.f6091l = c0762ud.size();
    }

    public C0577pd(C0799vd c0799vd) {
        this.f6092m = c0799vd;
        this.f6091l = c0799vd.size();
    }
}
