package sg.bigo.ads.api;

import android.webkit.WebView;
import sg.bigo.ads.L0.C;

/* loaded from: classes3.dex */
public interface InnerBannerAd extends BannerAd {
    void destroyInMainThread();

    sg.bigo.ads.P.c getInnerBannerAdData();

    C getWatermarkView();

    WebView getWebView();

    void handleInnerBannerAdResponse(sg.bigo.ads.Q.c cVar);

    boolean isInnerBannerAdFromAutoRefresh();

    void markFromAutoFresh(sg.bigo.ads.P.c cVar);

    int updateFormOpenTimes();
}
