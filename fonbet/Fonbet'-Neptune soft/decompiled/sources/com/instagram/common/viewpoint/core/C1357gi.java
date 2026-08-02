package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.gi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1357gi {
    public static byte[] A03;
    public final O1 A00;
    public final InterfaceC1167dZ A01;
    public final List<C1356gh> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C1357gi(List<AbstractC0642Nz> list, Bundle bundle, InterfaceC1167dZ interfaceC1167dZ) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1167dZ;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C1356gh(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (O1) X2.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C1357gi(List<AbstractC0642Nz> list, InterfaceC1167dZ interfaceC1167dZ) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1167dZ;
        Iterator<AbstractC0642Nz> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C1356gh(it.next()));
        }
        this.A00 = new O1();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), X2.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C1356gh> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final O1 A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C1356gh> it = this.A02.iterator();
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
        double A9N = this.A01.A9N();
        this.A00.A04(d, A9N);
        Iterator<C1356gh> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d, A9N);
        }
    }
}
