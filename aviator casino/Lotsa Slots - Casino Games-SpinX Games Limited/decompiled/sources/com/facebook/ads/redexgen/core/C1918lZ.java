package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1918lZ implements com.facebook.ads.redexgen.core.InterfaceC0800Jj {
    public static java.lang.String[] A03 = {"LK8mEMUSnifSCT0YT0fQtLG", "zQWICugnqrmXEq8sMdeIuA9JBPwrta0k", "lKxJonOWK2Axk83UnpUnbJJcLxj", "3DYuz", "CNQNHGpRGAv1E31EB6wcq1FAARNpDgXE", "DpJK", "NUJ585yfBdIWgF7XcRLbZeMVqrhzmgk", "1sPINCYISeoO6PXpnzvAKZkikus6bvvY"};
    public final java.util.List<com.facebook.ads.redexgen.core.C0822Kf> A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Incorrect condition in loop: B:3:0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1918lZ(java.util.List<com.facebook.ads.redexgen.core.C0822Kf> list) {
        this.A00 = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.A01 = new long[list.size() * 2];
        for (int i = 0; i < cueIndex; i++) {
            com.facebook.ads.redexgen.core.C0822Kf c0822Kf = list.get(i);
            int i2 = i * 2;
            this.A01[i2] = c0822Kf.A01;
            int arrayIndex = i2 + 1;
            this.A01[arrayIndex] = c0822Kf.A00;
        }
        this.A02 = java.util.Arrays.copyOf(this.A01, this.A01.length);
        java.util.Arrays.sort(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A7X(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < this.A00.size(); i++) {
            if (this.A01[i * 2] <= j) {
                long j2 = this.A01[(i * 2) + 1];
                if (A03[2].length() == 27) {
                    A03[5] = "FOcCQTOovqYXamkXPEg";
                    if (j < j2) {
                        com.facebook.ads.redexgen.core.C0822Kf c0822Kf = this.A00.get(i);
                        if (c0822Kf.A02.A01 == -3.4028235E38f) {
                            arrayList2.add(c0822Kf);
                        } else {
                            com.facebook.ads.redexgen.core.C2146pT c2146pT = c0822Kf.A02;
                            java.lang.String[] strArr = A03;
                            if (strArr[6].length() != strArr[0].length()) {
                                java.lang.String[] strArr2 = A03;
                                strArr2[4] = "KriihMM2RWcrEfyoWolOk5PIi1Nv3YmO";
                                strArr2[1] = "gocQSZMmm3PjEWFg0RBonPYHqyNHFxQo";
                                arrayList.add(c2146pT);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                throw new java.lang.RuntimeException();
            }
        }
        java.util.Collections.sort(arrayList2, new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Kp
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compare;
                compare = java.lang.Long.compare(((com.facebook.ads.redexgen.core.C0822Kf) obj).A01, ((com.facebook.ads.redexgen.core.C0822Kf) obj2).A01);
                return compare;
            }
        });
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            arrayList.add(((com.facebook.ads.redexgen.core.C0822Kf) arrayList2.get(i2)).A02.A02().A07((-1) - i2, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final long A83(int i) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i >= 0);
        if (i >= this.A02.length) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        return this.A02[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A84() {
        return this.A02.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A8a(long j) {
        int A0K = com.facebook.ads.redexgen.core.C5C.A0K(this.A02, j, false, false);
        int index = this.A02.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
