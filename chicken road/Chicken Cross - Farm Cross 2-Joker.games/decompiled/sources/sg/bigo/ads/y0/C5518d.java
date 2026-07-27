package sg.bigo.ads.y0;

import android.text.TextUtils;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.y0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5518d {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f13417a = new ConcurrentHashMap();

    public final void a(URL url, URL url2) {
        if (url == null) {
            AbstractC5496a.a("HostCache", "originURL is null.");
            return;
        }
        if (url2 == null) {
            AbstractC5496a.a("HostCache", "newURL is null.");
            return;
        }
        String protocol = url.getProtocol();
        if (TextUtils.isEmpty(protocol)) {
            AbstractC5496a.a("HostCache", "originURL protocol is empty.");
            return;
        }
        if (!protocol.equalsIgnoreCase(url2.getProtocol())) {
            AbstractC5496a.a("HostCache", "protocol is not equal.");
            return;
        }
        String host = url.getHost();
        String host2 = url2.getHost();
        if (host.equalsIgnoreCase("www." + host2) || host2.equalsIgnoreCase("www.".concat(host))) {
            AbstractC5496a.a("HostCache", "cache host, originHost=" + host + ", newHost=" + host2);
            this.f13417a.put(host, host2);
        }
    }
}
