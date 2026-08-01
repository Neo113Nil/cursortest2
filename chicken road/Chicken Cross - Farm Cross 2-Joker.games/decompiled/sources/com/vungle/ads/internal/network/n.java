package com.vungle.ads.internal.network;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* loaded from: classes7.dex */
public abstract class n {
    public static o a(Object obj, Response rawResponse) {
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        if (rawResponse.isSuccessful()) {
            return new o(rawResponse, obj, 0);
        }
        throw new IllegalArgumentException("rawResponse must be successful response".toString());
    }

    public static o a(Response rawResponse) {
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        if (!rawResponse.isSuccessful()) {
            return new o(rawResponse, null, 0);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response".toString());
    }
}
