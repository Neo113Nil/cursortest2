package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1194Yy implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"F6joGwlDI8iHbOzAisWUuE", "maTihVjplMt3yFJVJjmC0KmpbmehhX2e", "XpTxCcWpZPP2y4C0a9j2n0d0MxBWLTpI", "sgfvA1KSqWI8KtEvB6m8ZyDvc5DWsN6n", "pzMBgxyxqMiPYS0J7CYt5msvRsH6xIdq", "11mnBsf4lSYjVT8AEBIdPT", "UMn24MW5IHqIwX55a9EJeoGY4QyDeK8V", "me7LrSnqK6vn3rCyE1y3nY3eC8Lw1mdr"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04806g A00;

    public ViewOnClickListenerC1194Yy(com.facebook.ads.redexgen.core.C04806g c04806g) {
        this.A00 = c04806g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg viewOnClickListenerC0643Dg;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0643Dg = this.A00.A0A;
            viewOnClickListenerC0643Dg.onClick(view);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            if (A01[3].charAt(5) != '1') {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "W3cGemgA1Z9oaIj4IYerUOiD4w2U2gjw";
        }
    }
}
