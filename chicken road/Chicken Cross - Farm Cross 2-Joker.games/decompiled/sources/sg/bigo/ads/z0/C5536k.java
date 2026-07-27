package sg.bigo.ads.z0;

import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.C4966x;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5505e;
import sg.bigo.ads.x0.C5508h;
import sg.bigo.ads.y0.C5518d;

/* renamed from: sg.bigo.ads.z0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5536k implements UrlRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C5534i f13436a;
    public final AbstractC5503c b;
    public final C5518d c;
    public final InterfaceC5535j d;
    public final ArrayList e = new ArrayList();
    public int f = 0;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public String h;

    public C5536k(C5534i c5534i, AbstractC5503c abstractC5503c, C5518d c5518d, InterfaceC5535j interfaceC5535j) {
        this.f13436a = c5534i;
        this.b = abstractC5503c;
        this.c = c5518d;
        this.d = interfaceC5535j;
    }

    public final void a(C5508h c5508h) {
        if (this.g.compareAndSet(false, true)) {
            this.f13436a.f13435a.g = this.h;
            if (c5508h.getClass() == C5508h.class) {
                this.f13436a.f13435a.b.d();
            } else if (c5508h.getClass() == C5505e.class) {
                this.f13436a.f13435a.b.f();
            }
            this.b.a(this.f13436a.f13435a, c5508h);
            InterfaceC5535j interfaceC5535j = this.d;
            if (interfaceC5535j != null) {
                interfaceC5535j.a();
            }
        }
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        String str;
        if (urlResponseInfo == null) {
            str = null;
        } else {
            try {
                str = urlResponseInfo.getNegotiatedProtocol();
            } catch (Throwable th) {
                th.getMessage();
                str = "unsupported";
            }
        }
        this.h = str;
        AbstractC5496a.a("HttpEngineNetClient", "onCanceled");
        a(new C5508h(700, "request cancelled"));
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        String str;
        if (urlResponseInfo == null) {
            str = null;
        } else {
            try {
                str = urlResponseInfo.getNegotiatedProtocol();
            } catch (Throwable th) {
                th.getMessage();
                str = "unsupported";
            }
        }
        this.h = str;
        AbstractC5496a.a("HttpEngineNetClient", " onFailed: " + httpException.getMessage());
        String message = httpException.getMessage() != null ? httpException.getMessage() : "";
        a(new C5508h((message.contains("TIMED_OUT") || message.contains("timeout") || message.contains("ERR_CONNECTION_TIMED_OUT")) ? IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD : 700, message));
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        this.e.add(bArr);
        this.f += remaining;
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        String str2;
        URL url = null;
        if (urlResponseInfo == null) {
            str2 = null;
        } else {
            try {
                str2 = urlResponseInfo.getNegotiatedProtocol();
            } catch (Throwable th) {
                th.getMessage();
                str2 = "unsupported";
            }
        }
        this.h = str2;
        try {
            url = new URL(urlResponseInfo.getUrl());
        } catch (Exception unused) {
        }
        sg.bigo.ads.A0.a a2 = sg.bigo.ads.A0.b.a(urlResponseInfo.getHttpStatusCode(), str, this.f13436a.f13435a.e(), url, this.f13436a.c);
        if (a2 != null) {
            this.b.a(this.f13436a.f13435a, urlResponseInfo.getHttpStatusCode());
        }
        if (a2 != null && a2.c != 0) {
            urlRequest.cancel();
            a(new C5508h(a2.c, a2.d));
            return;
        }
        try {
            URL url2 = this.f13436a.c;
            URL url3 = new URL(str);
            if (url2 != null) {
                this.c.a(url2, url3);
            }
        } catch (Exception unused2) {
        }
        C5534i c5534i = this.f13436a;
        if (c5534i.d) {
            c5534i.f13435a.a(HttpHeaders.ACCEPT_ENCODING).clear();
        }
        urlRequest.followRedirect();
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.read(ByteBuffer.allocateDirect(32768));
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        byte[] bArr;
        String str;
        if (this.g.compareAndSet(false, true)) {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            C4966x c4966x = new C4966x();
            for (Map.Entry<String, List<String>> entry : urlResponseInfo.getHeaders().getAsMap().entrySet()) {
                if (entry.getKey() != null) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    if (key != null && value != null) {
                        c4966x.f12365a.put(key.toLowerCase(), value);
                    }
                }
            }
            List<String> list = urlResponseInfo.getHeaders().getAsMap().get("content-encoding");
            String str2 = (list == null || list.isEmpty()) ? null : list.get(0);
            if (this.f13436a.d && "gzip".equalsIgnoreCase(str2)) {
                c4966x.f12365a.remove(HttpHeaders.CONTENT_ENCODING.toLowerCase());
                c4966x.f12365a.remove(HttpHeaders.CONTENT_LENGTH.toLowerCase());
            }
            int i = this.f;
            if (i == 0) {
                bArr = new byte[0];
            } else {
                byte[] bArr2 = new byte[i];
                Iterator it = this.e.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
                    i2 += bArr3.length;
                }
                bArr = bArr2;
            }
            try {
                str = urlResponseInfo.getNegotiatedProtocol();
            } catch (Throwable th) {
                th.getMessage();
                str = "unsupported";
            }
            this.h = str;
            sg.bigo.ads.B0.c cVar = this.f13436a.f13435a;
            cVar.g = str;
            if (this.b.b(cVar, httpStatusCode)) {
                Objects.toString(this.f13436a);
                int i3 = this.f13436a.f13435a.f12212a;
                sg.bigo.ads.C0.c a2 = this.b.a(new sg.bigo.ads.C0.a(httpStatusCode, new ByteArrayInputStream(bArr), c4966x));
                this.f13436a.f13435a.b.f();
                this.b.a(this.f13436a.f13435a, a2);
            } else {
                AbstractC5496a.a("HttpEngineNetClient", "responseCode=" + httpStatusCode + ", invalid.");
                String str3 = new String(bArr);
                String str4 = (!TextUtils.isEmpty(str3) ? str3.concat(", ") : "") + "responseCode is " + httpStatusCode + ", validate fail.";
                this.f13436a.f13435a.b.f();
                this.b.a(this.f13436a.f13435a, new C5505e(httpStatusCode, str4));
            }
            InterfaceC5535j interfaceC5535j = this.d;
            if (interfaceC5535j != null) {
                interfaceC5535j.a();
            }
        }
    }
}
