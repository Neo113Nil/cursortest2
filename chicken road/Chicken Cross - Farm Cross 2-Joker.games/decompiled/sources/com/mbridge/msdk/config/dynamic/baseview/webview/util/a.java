package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: MBHybridUtil.java */
/* loaded from: classes6.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        Object[] array = parse.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + parse.getQueryParameter(String.valueOf(array[0]));
        }
        if (TextUtils.isEmpty(scheme) || !scheme.equals("mv")) {
            return str;
        }
        return "javascript:window.WindVane." + parse.getHost() + "(" + parse.getQueryParameter(String.valueOf(array[0])) + "," + (array.length > 1 ? parse.getQueryParameter(String.valueOf(array[1])) : "") + ");";
    }
}
