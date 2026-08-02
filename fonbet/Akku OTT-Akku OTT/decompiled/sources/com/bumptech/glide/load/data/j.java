package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.GlideUrl;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j implements d<InputStream> {
    public final GlideUrl a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public static class a {
    }

    public j(GlideUrl glideUrl, int i) {
        this.a = glideUrl;
        this.b = i;
    }

    public final InputStream a(URL url, int i, URL url2, Map<String, String> map) throws com.bumptech.glide.load.e {
        int i2;
        int i3 = -1;
        if (i >= 5) {
            throw new com.bumptech.glide.load.e("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new com.bumptech.glide.load.e("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i4 = this.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i4);
            httpURLConnection.setReadTimeout(i4);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                try {
                    i2 = this.c.getResponseCode();
                } catch (IOException unused2) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                    i2 = -1;
                }
                int i5 = i2 / 100;
                if (i5 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new com.bumptech.glide.util.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        try {
                            i3 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                            Log.isLoggable("HttpUrlFetcher", 3);
                        }
                        throw new com.bumptech.glide.load.e("Failed to obtain InputStream", i3, e);
                    }
                }
                if (i5 != 3) {
                    if (i2 == -1) {
                        throw new com.bumptech.glide.load.e("Http request failed", i2, null);
                    }
                    try {
                        throw new com.bumptech.glide.load.e(this.c.getResponseMessage(), i2, null);
                    } catch (IOException e2) {
                        throw new com.bumptech.glide.load.e("Failed to get a response message", i2, e2);
                    }
                }
                String headerField = this.c.getHeaderField(RtspHeaders.LOCATION);
                if (TextUtils.isEmpty(headerField)) {
                    throw new com.bumptech.glide.load.e("Received empty or null redirect url", i2, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return a(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new com.bumptech.glide.load.e(defpackage.g.a("Bad redirect url: ", headerField), i2, e3);
                }
            } catch (IOException e4) {
                try {
                    i3 = this.c.getResponseCode();
                } catch (IOException unused4) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                }
                throw new com.bumptech.glide.load.e("Failed to connect or obtain data", i3, e4);
            }
        } catch (IOException e5) {
            throw new com.bumptech.glide.load.e("URL.openConnection threw", 0, e5);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.e = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.b;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super InputStream> aVar) {
        GlideUrl glideUrl = this.a;
        int i = com.bumptech.glide.util.h.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.onDataReady(a(glideUrl.toURL(), 0, null, glideUrl.getHeaders()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.onLoadFailed(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }
}
