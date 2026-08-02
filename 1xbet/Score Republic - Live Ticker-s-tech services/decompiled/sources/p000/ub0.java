package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements InterfaceC0551oo {

    /* JADX INFO: renamed from: j */
    public final z80 f7751j;

    /* JADX INFO: renamed from: k */
    public final int f7752k;

    /* JADX INFO: renamed from: l */
    public HttpURLConnection f7753l;

    /* JADX INFO: renamed from: m */
    public InputStream f7754m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f7755n;

    public ub0(z80 z80Var, int i) {
        this.f7751j = z80Var;
        this.f7752k = i;
    }

    /* JADX INFO: renamed from: b */
    public static int m4900b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        return InputStream.class;
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m4901c(URL url, int i, URL url2, Map map) throws C0287hi {
        if (i >= 5) {
            throw new C0287hi("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C0287hi("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f7752k;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f7753l = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f7754m = this.f7753l.getInputStream();
                if (this.f7755n) {
                    return null;
                }
                int iM4900b = m4900b(this.f7753l);
                int i3 = iM4900b / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f7753l;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f7754m = new C0586pm(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f7754m = httpURLConnection2.getInputStream();
                        }
                        return this.f7754m;
                    } catch (IOException e) {
                        throw new C0287hi("Failed to obtain InputStream", m4900b(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM4900b == -1) {
                        throw new C0287hi("Http request failed", iM4900b, null);
                    }
                    try {
                        throw new C0287hi(this.f7753l.getResponseMessage(), iM4900b, null);
                    } catch (IOException e2) {
                        throw new C0287hi("Failed to get a response message", iM4900b, e2);
                    }
                }
                String headerField = this.f7753l.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C0287hi("Received empty or null redirect url", iM4900b, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo1072d();
                    return m4901c(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C0287hi(AbstractC0024an.m283f("Bad redirect url: ", headerField), iM4900b, e3);
                }
            } catch (IOException e4) {
                throw new C0287hi("Failed to connect or obtain data", m4900b(this.f7753l), e4);
            }
        } catch (IOException e5) {
            throw new C0287hi("URL.openConnection threw", 0, e5);
        }
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
        this.f7755n = true;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        InputStream inputStream = this.f7754m;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f7753l;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f7753l = null;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) {
        z80 z80Var = this.f7751j;
        int i = hk0.f3252b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            interfaceC0514no.mo84h(m4901c(z80Var.m5867d(), 0, null, z80Var.f9675b.mo2054a()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            interfaceC0514no.mo82f(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + hk0.m2289a(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        return 2;
    }
}
