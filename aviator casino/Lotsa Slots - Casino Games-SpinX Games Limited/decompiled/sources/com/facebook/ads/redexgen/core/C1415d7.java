package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.d7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1415d7 extends android.webkit.WebChromeClient {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"hD342XNQVEXChvJ41FuJYkzzL30E7V8C", "VFqqxEswv4BXF4BUDT4NnG4IAUyY785", "G3ZSvK9EmqC1e5u7Ivg7hdOkIQzdfa68", "vFWJ81dDNXk", "PGv8G8TosU31EXJAVb0WhvumqcSTUHDE", "JPUBUdUfGKDjW9Qe8mrAO5frWlzvQ1oz", "qcwfoFOZSGXVTY97XWLRaEh5jd9GG5ia", "FIykCHI4yyfel4YrSgGCK0Zn6vKmeZ"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1420dC A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 66, 73, 98, 89, 65, 78, 73, 94, 39, 47, 57, 57, 43, 45, 47, 118, 106, 112, 119, 102, 96, 76, 97};
    }

    static {
        A01();
    }

    public C1415d7(com.facebook.ads.redexgen.core.C1420dC c1420dC) {
        this.A00 = c1420dC;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.C1407cz c1407cz;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        if (consoleMessage.messageLevel() == android.webkit.ConsoleMessage.MessageLevel.ERROR) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(A00(10, 7, 124), consoleMessage.message());
                jSONObject.put(A00(0, 10, 26), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 51), consoleMessage.sourceId());
            } catch (org.json.JSONException unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            vi = this.A00.A0D;
            vi.A04(com.facebook.ads.redexgen.core.VH.A0N, null);
            c1407cz = this.A00.A0E;
            c1407cz.A04(com.facebook.ads.redexgen.core.AbstractC1048Td.A14, jSONObject2);
            c1636gi = this.A00.A0B;
            c1636gi.A0F().A69(jSONObject2);
        }
        boolean onConsoleMessage = super.onConsoleMessage(consoleMessage);
        if (A02[5].charAt(17) == '8') {
            throw new java.lang.RuntimeException();
        }
        A02[3] = "bhT1kVUsfNz";
        return onConsoleMessage;
    }
}
