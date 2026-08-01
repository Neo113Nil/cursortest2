package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.mb;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.C4761z5;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/chartboost/sdk/internal/Networking/NetworkHelper;", "", "<init>", "()V", "", "a", "()Z", "", C4761z5.r, ShareConstants.MEDIA_URI, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "urlString", "(Ljava/lang/String;)Ljava/lang/String;", "b", "Ljava/net/URL;", "c", "(Ljava/lang/String;)Ljava/net/URL;", "debugEndpoint", "Ljava/lang/String;", "isForceSDKToAcceptAllSSLCertsEnabled", "Z", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final NetworkHelper f5122a = new NetworkHelper();
    private static String debugEndpoint;
    private static boolean isForceSDKToAcceptAllSSLCertsEnabled;

    public final String a(String endpoint, String uri) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        String str = debugEndpoint;
        if (str != null && str.length() != 0) {
            mb.e("normalizedUrl: " + endpoint + " to: " + debugEndpoint, null);
            endpoint = debugEndpoint;
            Intrinsics.checkNotNull(endpoint);
        }
        if (uri == null || uri.length() == 0) {
            uri = "";
        } else if (!StringsKt.startsWith$default(uri, "/", false, 2, (Object) null)) {
            uri = "/" + uri;
        }
        return endpoint + uri;
    }

    public final String b(String urlString) {
        String str;
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL c = c(urlString);
        if (c == null) {
            return "";
        }
        try {
            str = c.getPath();
        } catch (Exception e) {
            mb.a("getPathFromUrl: " + urlString + " : " + e, null);
            str = "";
        }
        return str == null ? "" : str;
    }

    public final URL c(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (urlString.length() <= 0) {
            return null;
        }
        try {
            return new URL(urlString);
        } catch (Exception e) {
            mb.a("stringToURL: " + urlString + " : " + e, null);
            return null;
        }
    }

    public final String a(String urlString) {
        String str;
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL c = c(urlString);
        if (c == null) {
            return "";
        }
        try {
            str = c.getProtocol() + "://" + c.getHost();
        } catch (Exception e) {
            mb.a("getEndpointFromUrl: " + urlString + " : " + e, null);
            str = "";
        }
        return str == null ? "" : str;
    }

    public static final boolean a() {
        return isForceSDKToAcceptAllSSLCertsEnabled;
    }
}
