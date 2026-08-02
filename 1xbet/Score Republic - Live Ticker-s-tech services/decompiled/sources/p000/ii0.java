package p000;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 implements ListIterator, sg0 {

    /* JADX INFO: renamed from: k */
    public int f3580k;

    /* JADX INFO: renamed from: m */
    public int f3582m;

    /* JADX INFO: renamed from: n */
    public final AbstractC0416l0 f3583n;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3579j = 0;

    /* JADX INFO: renamed from: l */
    public int f3581l = -1;

    public ii0(ki0 ki0Var, int i) {
        this.f3583n = ki0Var;
        this.f3580k = i;
        this.f3582m = ((AbstractList) ki0Var).modCount;
    }

    /* JADX INFO: renamed from: a */
    public void m2649a() {
        if (((AbstractList) ((ji0) this.f3583n).f3943n).modCount != this.f3582m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f3579j;
        AbstractC0416l0 abstractC0416l0 = this.f3583n;
        switch (i) {
            case 0:
                m2649a();
                ji0 ji0Var = (ji0) abstractC0416l0;
                int i2 = this.f3580k;
                this.f3580k = i2 + 1;
                ji0Var.add(i2, obj);
                this.f3581l = -1;
                this.f3582m = ((AbstractList) ji0Var).modCount;
                break;
            default:
                m2650b();
                ki0 ki0Var = (ki0) abstractC0416l0;
                int i3 = this.f3580k;
                this.f3580k = i3 + 1;
                ki0Var.add(i3, obj);
                this.f3581l = -1;
                this.f3582m = ((AbstractList) ki0Var).modCount;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2650b() {
        if (((AbstractList) ((ki0) this.f3583n)).modCount != this.f3582m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3579j;
        AbstractC0416l0 abstractC0416l0 = this.f3583n;
        switch (i) {
            case 0:
                return this.f3580k < ((ji0) abstractC0416l0).f3941l;
            default:
                return this.f3580k < ((ki0) abstractC0416l0).f4388k;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3579j) {
            case 0:
                return this.f3580k > 0;
            default:
                return this.f3580k > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f3579j;
        AbstractC0416l0 abstractC0416l0 = this.f3583n;
        switch (i) {
            case 0:
                m2649a();
                int i2 = this.f3580k;
                ji0 ji0Var = (ji0) abstractC0416l0;
                if (i2 >= ji0Var.f3941l) {
                    throw new NoSuchElementException();
                }
                this.f3580k = i2 + 1;
                this.f3581l = i2;
                return ji0Var.f3939j[ji0Var.f3940k + i2];
            default:
                m2650b();
                int i3 = this.f3580k;
                ki0 ki0Var = (ki0) abstractC0416l0;
                if (i3 >= ki0Var.f4388k) {
                    throw new NoSuchElementException();
                }
                this.f3580k = i3 + 1;
                this.f3581l = i3;
                return ki0Var.f4387j[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3579j) {
            case 0:
                break;
        }
        return this.f3580k;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f3579j;
        AbstractC0416l0 abstractC0416l0 = this.f3583n;
        switch (i) {
            case 0:
                m2649a();
                int i2 = this.f3580k;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f3580k = i3;
                this.f3581l = i3;
                ji0 ji0Var = (ji0) abstractC0416l0;
                return ji0Var.f3939j[ji0Var.f3940k + i3];
            default:
                m2650b();
                int i4 = this.f3580k;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.f3580k = i5;
                this.f3581l = i5;
                return ((ki0) abstractC0416l0).f4387j[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f3579j) {
            case 0:
                i = this.f3580k;
                break;
            default:
                i = this.f3580k;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f3579j;
        AbstractC0416l0 abstractC0416l0 = this.f3583n;
        switch (i) {
            case 0:
                ji0 ji0Var = (ji0) abstractC0416l0;
                m2649a();
                int i2 = this.f3581l;
                if (i2 == -1) {
                    C0270h1.m2191g("Call next() or previous() before removing element from the iterator.");
                } else {
                    ji0Var.mo2904c(i2);
                    this.f3580k = this.f3581l;
                    this.f3581l = -1;
                    this.f3582m = ((AbstractList) ji0Var).modCount;
                }
                break;
            default:
                ki0 ki0Var = (ki0) abstractC0416l0;
                m2650b();
                int i3 = this.f3581l;
                if (i3 == -1) {
                    C0270h1.m2191g("Call next() or previous() before removing element from the iterator.");
                } else {
                    ki0Var.mo2904c(i3);
                    this.f3580k = this.f3581l;
                    this.f3581l = -1;
                    this.f3582m = ((AbstractList) ki0Var).modCount;
                }
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f3579j;
        AbstractC0416l0 abstractC0416l0 = this.f3583n;
        switch (i) {
            case 0:
                m2649a();
                int i2 = this.f3581l;
                if (i2 == -1) {
                    C0270h1.m2191g("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((ji0) abstractC0416l0).set(i2, obj);
                }
                break;
            default:
                m2650b();
                int i3 = this.f3581l;
                if (i3 == -1) {
                    C0270h1.m2191g("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((ki0) abstractC0416l0).set(i3, obj);
                }
                break;
        }
    }

    public ii0(ji0 ji0Var, int i) {
        this.f3583n = ji0Var;
        this.f3580k = i;
        this.f3582m = ((AbstractList) ji0Var).modCount;
    }
}
