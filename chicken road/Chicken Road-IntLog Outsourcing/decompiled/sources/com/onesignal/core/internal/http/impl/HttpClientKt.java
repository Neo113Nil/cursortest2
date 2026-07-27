package com.onesignal.core.internal.http.impl;

import com.onesignal.common.OneSignalUtils;

/* loaded from: classes.dex */
public final class HttpClientKt {
    public static final String HTTP_SDK_VERSION_HEADER_KEY = "SDK-Version";
    private static final String HTTP_SDK_VERSION_HEADER_VALUE = "onesignal/android/" + OneSignalUtils.INSTANCE.getSdkVersion();

    public static final String getHTTP_SDK_VERSION_HEADER_VALUE() {
        return HTTP_SDK_VERSION_HEADER_VALUE;
    }
}
