package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0630Ct implements com.facebook.ads.redexgen.core.InterfaceC1602gA {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1603gB A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, 88, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, 90, 101};
    }

    public AbstractC0630Ct(com.facebook.ads.redexgen.core.InterfaceC1603gB interfaceC1603gB) {
        this.A00 = interfaceC1603gB;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1602gA
    public final boolean ADs(com.facebook.ads.redexgen.core.C1600g8 c1600g8) {
        com.facebook.ads.redexgen.core.InterfaceC1586fu A00 = c1600g8.A00();
        if (this.A00.AAZ()) {
            android.util.Log.e(com.facebook.ads.redexgen.core.AbstractC0630Ct.class.getSimpleName(), A00(14, 27, 123), c1600g8);
        }
        if (A00 != null && A00.A9C() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1602gA
    public final java.net.HttpURLConnection AGl(java.lang.String str, java.net.Proxy proxy) throws java.io.IOException {
        java.net.URL url = new java.net.URL(str);
        if (proxy == null) {
            return (java.net.HttpURLConnection) url.openConnection();
        }
        return (java.net.HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1602gA
    public final java.io.InputStream AGm(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1602gA
    public final java.io.OutputStream AGn(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1602gA
    public final void AH6(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.EnumC1598g6 enumC1598g6, java.lang.String str) throws java.io.IOException {
        httpURLConnection.setRequestMethod(enumC1598g6.A03());
        httpURLConnection.setDoOutput(enumC1598g6.A05());
        httpURLConnection.setDoInput(enumC1598g6.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1602gA
    public final byte[] AHT(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[16384];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1602gA
    public final void AL8(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        outputStream.write(bArr);
    }
}
