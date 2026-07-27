package com.bytedance.sdk.component.adexpress.vj;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class gm {
    private WeakReference<sf> pcc;

    public gm(sf sfVar) {
        this.pcc = new WeakReference<>(sfVar);
    }

    public void pcc(sf sfVar) {
        this.pcc = new WeakReference<>(sfVar);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference != null && weakReference.get() != null) {
            return this.pcc.get().adInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference != null && weakReference.get() != null) {
            return this.pcc.get().appInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference != null && weakReference.get() != null) {
            return this.pcc.get().getTemplateInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().muteVideo(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().clickEvent(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().skipVideo();
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference != null && weakReference.get() != null) {
            return this.pcc.get().getCurrentVideoState();
        }
        return "";
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().initRenderFinish();
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().pcc(str);
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference != null && weakReference.get() != null) {
            return this.pcc.get().getData(str);
        }
        return "";
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().videoFrameChanged(str);
    }
}
