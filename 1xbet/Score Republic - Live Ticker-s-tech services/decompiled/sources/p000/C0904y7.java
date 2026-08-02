package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: y7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0904y7 implements Iterator, sg0 {

    /* JADX INFO: renamed from: j */
    public int f9199j;

    /* JADX INFO: renamed from: k */
    public int f9200k;

    /* JADX INFO: renamed from: l */
    public boolean f9201l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f9202m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f9203n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0904y7(C0089c8 c0089c8, int i) {
        this(c0089c8.f8453l);
        this.f9202m = i;
        switch (i) {
            case 1:
                this.f9203n = c0089c8;
                this(c0089c8.f8453l);
                break;
            default:
                this.f9203n = c0089c8;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9200k < this.f9199j;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM5299f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f9200k;
        int i2 = this.f9202m;
        Object obj = this.f9203n;
        switch (i2) {
            case 0:
                objM5299f = ((C0089c8) obj).m5299f(i);
                break;
            case 1:
                objM5299f = ((C0089c8) obj).m5303j(i);
                break;
            default:
                objM5299f = ((C0165e8) obj).f1995k[i];
                break;
        }
        this.f9200k++;
        this.f9201l = true;
        return objM5299f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9201l) {
            C0270h1.m2191g("Call next() before removing an element.");
            return;
        }
        int i = this.f9200k - 1;
        this.f9200k = i;
        int i2 = this.f9202m;
        Object obj = this.f9203n;
        switch (i2) {
            case 0:
                ((C0089c8) obj).mo5301h(i);
                break;
            case 1:
                ((C0089c8) obj).mo5301h(i);
                break;
            default:
                ((C0165e8) obj).m1385b(i);
                break;
        }
        this.f9199j--;
        this.f9201l = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0904y7(C0165e8 c0165e8) {
        this(c0165e8.f1996l);
        this.f9202m = 2;
        this.f9203n = c0165e8;
    }

    public C0904y7(int i) {
        this.f9199j = i;
    }
}
