package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public interface RedirectHandler {
    boolean shouldFollowRedirect(UrlResponseInfo info, String newLocationUrl) throws Exception;
}
