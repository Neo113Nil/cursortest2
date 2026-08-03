package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1968mZ implements com.facebook.ads.redexgen.core.InterfaceC0762Hw {
    public static java.lang.String[] A00 = {"S2ZlE7yw63A48uwr9dQcAEYhUnBJ4Yn0", "jzjCSZ", "gN1GhDNq1ONaTY", "QUbV6eP7CXYOE5n4wRXfJJIvrecH4qk8", "luywBeNRakBazgpsmb", "EdZTTUAmlRsHtXkkAmykmZcXBm9Gnzxa", "aBS20hcvH8Cg0VDZoQaxMtYiCLoGsxgc", "2I8VYTEH9eD6qwDjwvQqiLyn0yln2Tpt"};

    public abstract com.facebook.ads.androidx.media3.common.Metadata A0R(com.facebook.ads.redexgen.core.C05509e c05509e, java.nio.ByteBuffer byteBuffer);

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0762Hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.androidx.media3.common.Metadata A5o(com.facebook.ads.redexgen.core.C05509e c05509e) {
        boolean z;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c05509e.A02);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            java.lang.String[] strArr = A00;
            if (strArr[7].charAt(18) == strArr[3].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            A00[1] = "EqsX6PhC";
            if (arrayOffset == 0) {
                z = true;
                com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
                if (c05509e.A04()) {
                    return A0R(c05509e, byteBuffer);
                }
                return null;
            }
        }
        z = false;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        if (c05509e.A04()) {
        }
    }
}
