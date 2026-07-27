package com.chartboost.sdk.internal.Networking;

import java.net.URL;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/chartboost/sdk/internal/Networking/EndpointRepository;", "", "Lcom/chartboost/sdk/internal/Networking/EndpointRepository$EndPoint;", "endPoint", "", "host", "path", "", "setEndpoint", "(Lcom/chartboost/sdk/internal/Networking/EndpointRepository$EndPoint;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "getEndPointUrl", "(Lcom/chartboost/sdk/internal/Networking/EndpointRepository$EndPoint;)Ljava/net/URL;", "restoreDefaults", "()V", "EndPoint", "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EndpointRepository {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/chartboost/sdk/internal/Networking/EndpointRepository$EndPoint;", "", "", "defaultValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "Ljava/lang/String;", "getDefaultValue", "()Ljava/lang/String;", "CONFIG", "INSTALL", "PREFETCH", "INTERSTITIAL_GET", "INTERSTITIAL_SHOW", "REWARDED_GET", "REWARDED_SHOW", "BANNER_GET", "BANNER_SHOW", "CLICK", "VIDEO_COMPLETE", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EndPoint {
        public static final /* synthetic */ EndPoint[] c;
        public static final /* synthetic */ EnumEntries d;

        /* renamed from: b, reason: from kotlin metadata */
        public final String defaultValue;
        public static final EndPoint CONFIG = new EndPoint("CONFIG", 0, "/api/config");
        public static final EndPoint INSTALL = new EndPoint("INSTALL", 1, "/api/install");
        public static final EndPoint PREFETCH = new EndPoint("PREFETCH", 2, "/webview/v2/prefetch");
        public static final EndPoint INTERSTITIAL_GET = new EndPoint("INTERSTITIAL_GET", 3, "/webview/v2/interstitial/get");
        public static final EndPoint INTERSTITIAL_SHOW = new EndPoint("INTERSTITIAL_SHOW", 4, "/interstitial/show");
        public static final EndPoint REWARDED_GET = new EndPoint("REWARDED_GET", 5, "/webview/v2/reward/get");
        public static final EndPoint REWARDED_SHOW = new EndPoint("REWARDED_SHOW", 6, "/reward/show");
        public static final EndPoint BANNER_GET = new EndPoint("BANNER_GET", 7, "/auction/sdk/banner");
        public static final EndPoint BANNER_SHOW = new EndPoint("BANNER_SHOW", 8, "/banner/show");
        public static final EndPoint CLICK = new EndPoint("CLICK", 9, "/api/click");
        public static final EndPoint VIDEO_COMPLETE = new EndPoint("VIDEO_COMPLETE", 10, "/api/video-complete");

        static {
            EndPoint[] a2 = a();
            c = a2;
            d = EnumEntriesKt.enumEntries(a2);
        }

        public EndPoint(String str, int i, String str2) {
            this.defaultValue = str2;
        }

        public static final /* synthetic */ EndPoint[] a() {
            return new EndPoint[]{CONFIG, INSTALL, PREFETCH, INTERSTITIAL_GET, INTERSTITIAL_SHOW, REWARDED_GET, REWARDED_SHOW, BANNER_GET, BANNER_SHOW, CLICK, VIDEO_COMPLETE};
        }

        public static EnumEntries<EndPoint> getEntries() {
            return d;
        }

        public static EndPoint valueOf(String str) {
            return (EndPoint) Enum.valueOf(EndPoint.class, str);
        }

        public static EndPoint[] values() {
            return (EndPoint[]) c.clone();
        }

        public final String getDefaultValue() {
            return this.defaultValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c = new a("AD_GET", 0, "live.chartboost.com");
        public static final a d = new a("DA", 1, "da.chartboost.com");
        public static final /* synthetic */ a[] e;
        public static final /* synthetic */ EnumEntries f;
        public final String b;

        static {
            a[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public a(String str, int i, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        public final String b() {
            return this.b;
        }
    }

    URL getEndPointUrl(EndPoint endPoint);

    void restoreDefaults();

    void setEndpoint(EndPoint endPoint, String host, String path);
}
