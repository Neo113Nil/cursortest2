package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1602gA {
    boolean ADs(com.facebook.ads.redexgen.core.C1600g8 c1600g8);

    java.net.HttpURLConnection AGl(java.lang.String str, java.net.Proxy proxy) throws java.io.IOException;

    java.io.InputStream AGm(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException;

    java.io.OutputStream AGn(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException;

    void AH6(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.EnumC1598g6 enumC1598g6, java.lang.String str) throws java.io.IOException;

    byte[] AHT(java.io.InputStream inputStream) throws java.io.IOException;

    void AL8(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException;
}
