package com.facebook.ads.redexgen.core;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1727iE {
    public static byte[] A03;
    public final com.facebook.ads.redexgen.core.C0925Of A00;
    public final com.facebook.ads.redexgen.core.InterfaceC1521er A01;
    public final java.util.List<com.facebook.ads.redexgen.core.C1726iD> A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C1727iE(java.util.List<com.facebook.ads.redexgen.core.AbstractC0923Od> list, android.os.Bundle bundle, com.facebook.ads.redexgen.core.InterfaceC1521er interfaceC1521er) {
        this.A02 = new java.util.ArrayList(list.size());
        this.A01 = interfaceC1521er;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new com.facebook.ads.redexgen.core.C1726iD(list.get(i), (android.os.Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (com.facebook.ads.redexgen.core.C0925Of) com.facebook.ads.redexgen.core.AbstractC1158Xo.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C1727iE(java.util.List<com.facebook.ads.redexgen.core.AbstractC0923Od> list, com.facebook.ads.redexgen.core.InterfaceC1521er interfaceC1521er) {
        this.A02 = new java.util.ArrayList(list.size());
        this.A01 = interfaceC1521er;
        java.util.Iterator<com.facebook.ads.redexgen.core.AbstractC0923Od> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new com.facebook.ads.redexgen.core.C1726iD(it.next()));
        }
        this.A00 = new com.facebook.ads.redexgen.core.C0925Of();
    }

    public final android.os.Bundle A02() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray(A00(0, 10, 126), com.facebook.ads.redexgen.core.AbstractC1158Xo.A01(this.A00));
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.A02.size());
        java.util.Iterator<com.facebook.ads.redexgen.core.C1726iD> it = this.A02.iterator();
        while (it.hasNext()) {
            android.os.Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final com.facebook.ads.redexgen.core.C0925Of A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        java.util.Iterator<com.facebook.ads.redexgen.core.C1726iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double A9V = this.A01.A9V();
        this.A00.A04(d, A9V);
        java.util.Iterator<com.facebook.ads.redexgen.core.C1726iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d, A9V);
        }
    }
}
