package com.bbflight.background_downloader;

import android.annotation.SuppressLint;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"CustomX509TrustManager"})
/* renamed from: com.bbflight.background_downloader.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0636b0 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    @SuppressLint({"TrustAllX509TrustManager"})
    public final void checkClientTrusted(X509Certificate[] chain, String authType) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
    }

    @Override // javax.net.ssl.X509TrustManager
    @SuppressLint({"TrustAllX509TrustManager"})
    public final void checkServerTrusted(X509Certificate[] chain, String authType) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
