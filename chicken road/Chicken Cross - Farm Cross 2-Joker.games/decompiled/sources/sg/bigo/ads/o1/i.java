package sg.bigo.ads.o1;

import com.google.common.net.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public HttpURLConnection f13232a;
    public BufferedInputStream b;
    public final String c;

    public i(String str) {
        this.c = str;
    }

    public final void a() {
        StringBuilder sb;
        HttpURLConnection httpURLConnection = this.f13232a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                sb = new StringBuilder("Error closing connection correctly, the error message is : ");
                AbstractC5496a.a("ProxyCache", sb.append(e.toString()).toString());
            } catch (IllegalArgumentException e2) {
                e = e2;
                sb = new StringBuilder("connection disconnect error..., the error message is : ");
                AbstractC5496a.a("ProxyCache", sb.append(e.toString()).toString());
            } catch (NullPointerException e3) {
                e = e3;
                sb = new StringBuilder("connection disconnect error..., the error message is : ");
                AbstractC5496a.a("ProxyCache", sb.append(e.toString()).toString());
            }
        }
    }

    public final void b() {
        try {
            HttpURLConnection c = c();
            this.f13232a = c;
            if (c != null) {
                this.b = new BufferedInputStream(this.f13232a.getInputStream(), 8192);
            }
        } catch (IOException e) {
            AbstractC5496a.a("ProxyCache", "Error opening connection for " + this.c + " with offset 0, error message is : " + e.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: IOException -> 0x0054, TryCatch #1 {IOException -> 0x0054, blocks: (B:6:0x0015, B:15:0x002b, B:18:0x0039), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[Catch: IOException -> 0x0054, TRY_LEAVE, TryCatch #1 {IOException -> 0x0054, blocks: (B:6:0x0015, B:15:0x002b, B:18:0x0039), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:2:0x0007->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection c() {
        boolean z;
        String str = this.c;
        HttpURLConnection httpURLConnection = null;
        int i = 0;
        while (true) {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                if (httpURLConnection2 == null) {
                    return httpURLConnection2;
                }
                try {
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode != 301 && responseCode != 302 && responseCode != 303) {
                        z = false;
                        if (z) {
                            str = httpURLConnection2.getHeaderField(HttpHeaders.LOCATION);
                            i++;
                            httpURLConnection2.disconnect();
                        }
                        if (i > 5) {
                            AbstractC5496a.a("ProxyCache", "Too many redirects: " + i);
                        }
                        if (z) {
                            return httpURLConnection2;
                        }
                        httpURLConnection = httpURLConnection2;
                    }
                    z = true;
                    if (z) {
                    }
                    if (i > 5) {
                    }
                    if (z) {
                    }
                } catch (IOException e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    AbstractC5496a.a("ProxyCache", "PingHttpUrlSource#openConnection, error message is : " + e.toString());
                    return httpURLConnection;
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
    }

    public final void a(byte[] bArr) {
        StringBuilder append;
        String str;
        BufferedInputStream bufferedInputStream = this.b;
        if (bufferedInputStream == null) {
            AbstractC5496a.a("ProxyCache", "Error reading data from " + this.c + ": connection is absent!");
            return;
        }
        try {
            bufferedInputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            e = e;
            append = new StringBuilder("Reading source ").append(this.c);
            str = " is interrupted, error message is : ";
            AbstractC5496a.a("ProxyCache", append.append(str).append(e.toString()).toString());
        } catch (IOException e2) {
            e = e2;
            append = new StringBuilder("Error reading data from ").append(this.c);
            str = ", error message is : ";
            AbstractC5496a.a("ProxyCache", append.append(str).append(e.toString()).toString());
        }
    }
}
