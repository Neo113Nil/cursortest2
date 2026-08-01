package com.tiktok.appevents;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.JSON;
import com.tiktok.util.TTUtil;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class DeeplinkCallbackWrapper implements TikTokBusinessSdk.FetchDeferredDeeplinkCompletion {
    private final TikTokBusinessSdk.FetchDeferredDeeplinkCompletion callback;
    private long initTime = 0;
    private long threadTime = 0;
    private long requestTime = 0;
    private long endTime = 0;

    public DeeplinkCallbackWrapper(TikTokBusinessSdk.FetchDeferredDeeplinkCompletion callback) {
        this.callback = callback;
    }

    @Override // com.tiktok.TikTokBusinessSdk.FetchDeferredDeeplinkCompletion
    public void completion(String deepLinkUrl, ErrorData errorData) {
        sendResultLog(deepLinkUrl, errorData);
        TikTokBusinessSdk.FetchDeferredDeeplinkCompletion fetchDeferredDeeplinkCompletion = this.callback;
        if (fetchDeferredDeeplinkCompletion != null) {
            fetchDeferredDeeplinkCompletion.completion(deepLinkUrl, errorData);
        }
    }

    private void sendResultLog(String deepLinkUrl, ErrorData errorData) {
        String str;
        int i;
        try {
            JSONObject metaWithTS = TTUtil.getMetaWithTS(null);
            JSON.putLong(metaWithTS, IronSourceConstants.EVENTS_DURATION, this.endTime - this.initTime);
            JSON.putLong(metaWithTS, "thread_duration", this.threadTime - this.initTime);
            JSON.putLong(metaWithTS, "req_duration", this.requestTime - this.threadTime);
            int i2 = (TextUtils.isEmpty(deepLinkUrl) || errorData != null) ? 1 : 0;
            JSON.putInt(metaWithTS, "result", i2);
            if (i2 != 0) {
                if (errorData == null) {
                    str = "unknown";
                    i = -1;
                } else {
                    i = errorData.getCode();
                    str = errorData.getMsg();
                }
                JSON.putInt(metaWithTS, "err_code", i);
                JSON.putObject(metaWithTS, "err_msg", str);
            }
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("dplink_req", metaWithTS, null);
        } catch (Throwable unused) {
        }
    }

    public void markInit() {
        this.initTime = SystemClock.elapsedRealtime();
    }

    public void markThread() {
        this.threadTime = SystemClock.elapsedRealtime();
    }

    public void markRequest() {
        this.requestTime = SystemClock.elapsedRealtime();
    }

    public void markEnd() {
        this.endTime = SystemClock.elapsedRealtime();
    }
}
