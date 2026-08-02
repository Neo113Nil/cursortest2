package org.chromium.net.apihelpers;

import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public interface CronetRequestCompletionListener<T> {
    void onCanceled(UrlResponseInfo info);

    void onFailed(UrlResponseInfo info, CronetException exception);

    void onSucceeded(UrlResponseInfo info, T body);
}
