package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public interface CronetRequestCompletionListener<T> {
    void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo);

    void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException);

    void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo, T t);
}
