package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5125a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.BANNER_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5125a = iArr;
        }
    }

    public static final String a(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "<this>");
        return a.f5125a[endPoint.ordinal()] == 1 ? EndpointRepository.a.d.b() : EndpointRepository.a.c.b();
    }

    public static final URL b(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "<this>");
        return new URL("https", a(endPoint), endPoint.getDefaultValue());
    }

    public static final String a(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return url.getProtocol() + "://" + url.getHost();
    }
}
