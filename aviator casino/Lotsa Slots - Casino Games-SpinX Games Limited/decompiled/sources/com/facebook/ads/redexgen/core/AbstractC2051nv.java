package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2051nv implements com.facebook.ads.redexgen.core.InterfaceC0634Cx {
    public static java.lang.String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public android.os.Looper A00;
    public com.facebook.ads.androidx.media3.common.Timeline A01;
    public com.facebook.ads.redexgen.core.C8O A02;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC0633Cw> A05 = new java.util.ArrayList<>(1);
    public final java.util.HashSet<com.facebook.ads.redexgen.core.InterfaceC0633Cw> A06 = new java.util.HashSet<>(1);
    public final com.facebook.ads.redexgen.core.D8 A04 = new com.facebook.ads.redexgen.core.D8();
    public final com.facebook.ads.redexgen.core.A1 A03 = new com.facebook.ads.redexgen.core.A1();

    public abstract void A09();

    public abstract void A0A(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t);

    public final com.facebook.ads.redexgen.core.C8O A00() {
        return (com.facebook.ads.redexgen.core.C8O) com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A02);
    }

    public final com.facebook.ads.redexgen.core.A1 A01(com.facebook.ads.redexgen.core.C2044no c2044no) {
        return this.A03.A00(0, c2044no);
    }

    public final com.facebook.ads.redexgen.core.D8 A02(com.facebook.ads.redexgen.core.C2044no c2044no) {
        return this.A04.A02(0, c2044no, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(com.facebook.ads.androidx.media3.common.Timeline timeline) {
        this.A01 = timeline;
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC0633Cw> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AG1(this, timeline);
        }
    }

    public final void A06(com.facebook.ads.redexgen.core.InterfaceC0633Cw interfaceC0633Cw) {
        boolean z = !this.A06.isEmpty();
        this.A06.remove(interfaceC0633Cw);
        if (z) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(com.facebook.ads.redexgen.core.InterfaceC0633Cw interfaceC0633Cw) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        boolean isEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC0633Cw);
        if (isEmpty) {
            A04();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A08(com.facebook.ads.redexgen.core.InterfaceC0633Cw interfaceC0633Cw, com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t, com.facebook.ads.redexgen.core.C8O c8o) {
        boolean z;
        android.os.Looper looper;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper looper2 = this.A00;
        if (looper2 != null) {
            android.os.Looper looper3 = this.A00;
            if (looper3 != myLooper) {
                z = false;
                com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
                this.A02 = c8o;
                com.facebook.ads.androidx.media3.common.Timeline timeline = this.A01;
                this.A05.add(interfaceC0633Cw);
                looper = this.A00;
                if (looper != null) {
                    this.A00 = myLooper;
                    this.A06.add(interfaceC0633Cw);
                    A0A(interfaceC04675t);
                    return;
                } else {
                    if (timeline == null) {
                        return;
                    }
                    A07(interfaceC0633Cw);
                    interfaceC0633Cw.AG1(this, timeline);
                    return;
                }
            }
        }
        z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        this.A02 = c8o;
        com.facebook.ads.androidx.media3.common.Timeline timeline2 = this.A01;
        this.A05.add(interfaceC0633Cw);
        looper = this.A00;
        if (looper != null) {
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0634Cx
    public final void A3z(android.os.Handler handler, com.facebook.ads.redexgen.core.D9 d9) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(handler);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(d9);
        this.A04.A04(handler, d9);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0634Cx
    public final void AH7(com.facebook.ads.redexgen.core.InterfaceC0633Cw interfaceC0633Cw, com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        A08(interfaceC0633Cw, interfaceC04675t, com.facebook.ads.redexgen.core.C8O.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0634Cx
    public final void AHl(com.facebook.ads.redexgen.core.InterfaceC0633Cw interfaceC0633Cw) {
        this.A05.remove(interfaceC0633Cw);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            java.lang.String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(interfaceC0633Cw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0634Cx
    public final void AIS(com.facebook.ads.redexgen.core.D9 d9) {
        this.A04.A0D(d9);
    }
}
