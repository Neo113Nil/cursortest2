package org.chromium.net.impl;

import android.util.Log;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes4.dex */
class AndroidRequestFinishedInfoWrapper extends RequestFinishedInfoImpl {
    private static final String TAG = RequestFinishedInfoImpl.class.getSimpleName();
    private static boolean sListenerSupportLimitedLogged;

    private AndroidRequestFinishedInfoWrapper(String url, Collection<Object> annotations, RequestFinishedInfo.Metrics metrics, int finishedReason, UrlResponseInfo responseInfo, CronetException exception) {
        super(url, annotations, metrics, finishedReason, responseInfo, exception);
    }

    @Override // org.chromium.net.impl.RequestFinishedInfoImpl, org.chromium.net.RequestFinishedInfo
    public RequestFinishedInfo.Metrics getMetrics() {
        if (!sListenerSupportLimitedLogged) {
            Log.i(TAG, "RequestFinishedInfo.getMetrics() is unsupported when HttpEngineNativeProvider is used. The Metrics object will return null values.");
            sListenerSupportLimitedLogged = true;
        }
        return super.getMetrics();
    }

    static void reportFinished(AndroidHttpEngineWrapper engine, String url, Collection<Object> annotations, VersionSafeCallbacks.RequestFinishedInfoListener listener, int finishedReason, UrlResponseInfo responseInfo, CronetException exception) {
        engine.reportRequestFinished(new AndroidRequestFinishedInfoWrapper(url, annotations, CronetMetrics.empty(), finishedReason, responseInfo, exception), listener);
    }
}
