package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class oq {
    final int[] b = new int[10];
    int e;

    final com.facetec.sdk.oq a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.e = (1 << i) | this.e;
                iArr[i] = i2;
            }
        }
        return this;
    }

    final boolean a(int i) {
        return ((1 << i) & this.e) != 0;
    }

    final int b(int i) {
        return this.b[i];
    }

    final int d() {
        if ((this.e & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.e & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }
}
