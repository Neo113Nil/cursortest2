package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* loaded from: classes.dex */
public final class It implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1805xu f9640k;

    /* renamed from: l, reason: collision with root package name */
    public Ix f9641l;

    /* renamed from: m, reason: collision with root package name */
    public HttpURLConnection f9642m;

    public final HttpURLConnection b(Ix ix) {
        this.f9640k = new Aq(4, (byte) 0);
        this.f9641l = ix;
        ((Integer) this.f9640k.mo12a()).getClass();
        Ix ix2 = this.f9641l;
        ix2.getClass();
        Set set = C1789xe.f16309p;
        V9 v9 = P2.o.f4767B.f4782p;
        int intValue = ((Integer) Q2.r.f5053d.f5056c.a(F7.f8671D)).intValue();
        URL url = new URL(ix2.f9653l);
        int i = 0;
        while (true) {
            i++;
            if (i > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(intValue);
            openConnection.setReadTimeout(intValue);
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            U2.g gVar = new U2.g();
            gVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            gVar.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f9642m = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            U2.j.d("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f9642m;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
