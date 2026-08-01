package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b6 implements il {
    @Override // com.chartboost.sdk.impl.il
    public WebView a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new WebView(context);
    }

    @Override // com.chartboost.sdk.impl.il
    public vc a(Context context, WebView webView, rc placementType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        return new ic(context, webView, placementType, null, null, null, 56, null);
    }
}
