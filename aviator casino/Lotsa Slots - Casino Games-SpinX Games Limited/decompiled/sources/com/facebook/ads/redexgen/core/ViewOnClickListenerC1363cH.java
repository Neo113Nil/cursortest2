package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1363cH implements android.view.View.OnClickListener {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"524C9pC8aLVKflbvvv2K7MlVaT1Y4oXj", "lRM8H52A4hKqkKdkEH8S6", "pzMD8hEzrN8WJeuHzmUfipPCg7LRhl7h", "lnDY", "95wdtjn99T2hJygpaQjrD03HNRuLahXP", "M3Z", "WkizL2fPiwDBFcFyMDRmv7nfAM7GjuvS", "zFeU71BaV6LqmyzLw1trLotvqmYyyi91"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1365cJ A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{93, 86, 92, 91, 89, 74, 92, 75};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1363cH(com.facebook.ads.redexgen.core.C1365cJ c1365cJ, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        this.A01 = c1365cJ;
        this.A00 = viewOnClickListenerC0834Kr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.A0E(A00(0, 8, 50));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            if (A03[6].charAt(18) == 'Y') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[3] = "HSmZ";
            strArr[1] = "XRAr9C2gXTfshR7ejhjPx";
        }
    }
}
