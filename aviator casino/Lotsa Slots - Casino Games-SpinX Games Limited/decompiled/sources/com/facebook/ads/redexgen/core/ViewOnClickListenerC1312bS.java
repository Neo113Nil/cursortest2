package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1312bS implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"vbhQ772KrwwyBQLqSF0Uu1FphjZjOARV", "IBW1fWQIdJqQUPoAbqLmLzYGzWB3AFkH", "HmN3zdDh8QwXEewFzD7cRbgjZyFP74AB", "Oi9kNPYT1HPYswCV1WaLs9ucCNZpJU", "sMEUezQpAx8L6vs1CqhHVpU4S2CWDUzq", "l1dCE", "7cDzGVZ60", "I6JIiCAB6gfHFMUig9c3ijD4Ynx17v"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1313bT A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 54);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -71, -74, -66, -70, -84, -71, -90, -73, -84, -84, -78};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1312bS(com.facebook.ads.redexgen.core.C1313bT c1313bT) {
        this.A00 = c1313bT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0834Kr = this.A00.A0D;
            viewOnClickListenerC0834Kr.A0E(A00(0, 12, 17));
            this.A00.A0B();
        } catch (java.lang.Throwable th) {
            if (A02[6].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            A02[6] = "D5vzh5bnP";
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
