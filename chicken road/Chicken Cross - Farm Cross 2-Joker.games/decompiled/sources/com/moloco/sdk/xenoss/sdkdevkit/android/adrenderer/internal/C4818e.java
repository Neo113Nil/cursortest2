package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.webkit.WebView;
import com.ironsource.C4761z5;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4818e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10966a = "https://appassets.androidplatform.net";

    public static final void a(WebView webView, String data) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        webView.loadDataWithBaseURL(f10966a, data, "text/html", C4761z5.O, null);
    }
}
