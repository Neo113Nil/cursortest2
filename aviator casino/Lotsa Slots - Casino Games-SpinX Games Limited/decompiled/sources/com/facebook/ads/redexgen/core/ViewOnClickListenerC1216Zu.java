package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1216Zu implements android.view.View.OnClickListener {
    public static java.lang.String[] A03 = {"qTn7FHoQ", "BapBypyKyXgi02nUaikHNoU7eY2sLlHG", "hAbogJy7", "1kKCdLvWKNxoPSiH", "Xjk6qTkQoY8vuVUP", "RHy2P55wnjv0LaFNgRpD8dXF", "4s2GzZI6q8xqZAbl0Skgz3P6Lr2GKXBU", "B9Ul8cdGX1dUct8fF9ORVNarLvr0UfHM"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0930Ok A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1203Zh A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1217Zv A02;

    public ViewOnClickListenerC1216Zu(com.facebook.ads.redexgen.core.C1217Zv c1217Zv, com.facebook.ads.redexgen.core.C1203Zh c1203Zh, com.facebook.ads.redexgen.core.C0930Ok c0930Ok) {
        this.A02 = c1217Zv;
        this.A01 = c1203Zh;
        this.A00 = c0930Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC1201Zf = this.A02.A02;
            interfaceC1201Zf.AF4(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            java.lang.String[] strArr = A03;
            if (strArr[3].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[3] = "Wxfvm9MNAlg6MGh9";
            strArr2[4] = "9MWDJcBk5PnwUytH";
        }
    }
}
