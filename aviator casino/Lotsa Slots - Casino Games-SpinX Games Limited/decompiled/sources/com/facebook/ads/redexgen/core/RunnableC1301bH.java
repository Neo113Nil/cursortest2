package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1301bH implements java.lang.Runnable {
    public static java.lang.String[] A01 = {"wQeUkUFktfM2l", "7XaAWiHxEbalq5gcAes6NrqtmXxPT4Y3", "2fv7kArIDvQtbqE5fFFu3pq8qRlQU6Cv", "0xhN0xjEaMXvjGar1KVcE", "ki2D6rKULGHthGJNrJcFjvO3aJEOf9d", "JHuN8xfhz8lLzrwSWaENIG05O1ASDFA", "9Zp5ZsxK45djlTC7gbsQv9P1cFfLGY7l", "GKuX8TC50ZMrYys0rib1"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.LK A00;

    public RunnableC1301bH(com.facebook.ads.redexgen.core.LK lk) {
        this.A00 = lk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int A0I;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01 = this.A00.A0T.A04();
            com.facebook.ads.redexgen.core.LK lk = this.A00;
            A0I = com.facebook.ads.redexgen.core.LK.A0I(this.A00.A0T.A04());
            lk.A03 = A0I;
            this.A00.A0p();
        } catch (java.lang.Throwable th) {
            if (A01[7].length() == 26) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "KsmznMcBbJjrBrEeTGYdkeMkvFpYNuvy";
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
