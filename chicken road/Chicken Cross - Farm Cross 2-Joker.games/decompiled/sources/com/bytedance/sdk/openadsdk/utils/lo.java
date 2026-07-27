package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public class lo {
    public static void pcc(Uri uri, com.bytedance.sdk.openadsdk.core.mu muVar) {
        if (muVar == null || !muVar.pcc(uri)) {
            return;
        }
        try {
            muVar.sf(uri);
        } catch (Exception e) {
            new StringBuilder("TTAndroidObj handleUri exception: ").append(e);
        }
    }

    public static String pcc(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(userAgentString);
        sb.append(" open_news open_news_u_s/").append(i);
        return sb.toString();
    }
}
