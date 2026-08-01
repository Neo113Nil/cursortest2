package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a implements EndpointRepository {

    /* renamed from: a, reason: collision with root package name */
    public final com.chartboost.sdk.internal.Model.a f5123a;

    /* renamed from: com.chartboost.sdk.internal.Networking.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0227a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5124a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.INTERSTITIAL_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndpointRepository.EndPoint.REWARDED_GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EndpointRepository.EndPoint.PREFETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5124a = iArr;
        }
    }

    public a(com.chartboost.sdk.internal.Model.a sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f5123a = sdkConfiguration;
    }

    public final URL a(EndpointRepository.EndPoint endPoint) {
        int i = C0227a.f5124a[endPoint.ordinal()];
        if (i == 1) {
            String format = String.format("webview/%s/interstitial/get", Arrays.copyOf(new Object[]{this.f5123a.y}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return a(endPoint, format);
        }
        if (i == 2) {
            String format2 = String.format("webview/%s/reward/get", Arrays.copyOf(new Object[]{this.f5123a.y}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return a(endPoint, format2);
        }
        if (i != 3) {
            return null;
        }
        String webviewPrefetchEndpoint = this.f5123a.z;
        Intrinsics.checkNotNullExpressionValue(webviewPrefetchEndpoint, "webviewPrefetchEndpoint");
        return a(endPoint, webviewPrefetchEndpoint);
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public URL getEndPointUrl(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        URL a2 = a(endPoint);
        return a2 == null ? b.b(endPoint) : a2;
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void restoreDefaults() {
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void setEndpoint(EndpointRepository.EndPoint endPoint, String host, String path) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IllegalStateException("Cannot set endpoint");
    }

    public final URL a(EndpointRepository.EndPoint endPoint, String str) {
        return new URL("https", b.a(endPoint), "/" + str);
    }
}
