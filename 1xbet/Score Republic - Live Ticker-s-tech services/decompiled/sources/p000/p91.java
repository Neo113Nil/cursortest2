package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p91 implements Iterator {

    /* JADX INFO: renamed from: k */
    public String f6030k;

    /* JADX INFO: renamed from: l */
    public final String f6031l;

    /* JADX INFO: renamed from: m */
    public final af0 f6032m;

    /* JADX INFO: renamed from: n */
    public final boolean f6033n;

    /* JADX INFO: renamed from: p */
    public int f6035p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ jg0 f6036q;

    /* JADX INFO: renamed from: j */
    public int f6029j = 2;

    /* JADX INFO: renamed from: o */
    public int f6034o = 0;

    public p91(jg0 jg0Var, r91 r91Var, String str) {
        this.f6036q = jg0Var;
        this.f6032m = r91Var.f6754a;
        this.f6033n = r91Var.f6755b;
        this.f6035p = r91Var.f6757d;
        this.f6031l = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        af0 af0Var;
        a90.m133q(this.f6029j != 4);
        int iM292o = AbstractC0024an.m292o(this.f6029j);
        if (iM292o == 0) {
            return true;
        }
        if (iM292o != 2) {
            this.f6029j = 4;
            int i = this.f6034o;
            while (true) {
                int length = this.f6034o;
                if (length == -1) {
                    this.f6029j = 3;
                    string = null;
                    break;
                }
                C0173eg c0173eg = (C0173eg) this.f6036q.f3922k;
                String str = this.f6031l;
                int length2 = str.length();
                a90.m129m(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (c0173eg.mo200e(str.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f6034o = -1;
                } else {
                    this.f6034o = length + 1;
                }
                int i2 = this.f6034o;
                if (i2 == i) {
                    int i3 = i2 + 1;
                    this.f6034o = i3;
                    if (i3 > str.length()) {
                        this.f6034o = -1;
                    }
                } else {
                    while (true) {
                        af0Var = this.f6032m;
                        if (i >= length || !af0Var.mo200e(str.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && af0Var.mo200e(str.charAt(length - 1))) {
                        length--;
                    }
                    if (!this.f6033n || i != length) {
                        int i4 = this.f6035p;
                        if (i4 == 1) {
                            length = str.length();
                            this.f6034o = -1;
                            while (length > i && af0Var.mo200e(str.charAt(length - 1))) {
                                length--;
                            }
                        } else {
                            this.f6035p = i4 - 1;
                        }
                        string = str.subSequence(i, length).toString();
                        break;
                    }
                    i = this.f6034o;
                }
            }
            this.f6030k = string;
            if (this.f6029j != 3) {
                this.f6029j = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6029j = 2;
        String str = this.f6030k;
        this.f6030k = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
