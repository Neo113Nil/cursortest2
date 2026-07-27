package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4801a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SSLSocketFactory a() {
            SSLContext sSLContext = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
            if (NetworkHelper.a()) {
                sSLContext.init(null, new X509TrustManager[]{jg.c()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }

        public a() {
        }
    }

    public static final SSLSocketFactory a() {
        return f4801a.a();
    }
}
