package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
public final class Q4 {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f11165c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    public final String[] f11166a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: b, reason: collision with root package name */
    public final N4 f11167b;

    public Q4(N4 n42) {
        this.f11167b = n42;
    }

    public static Uri d(Uri uri, String str) {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new R4("Parameter already exists: dc_ms");
                        }
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new R4("Query parameter already exists: ms");
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i5 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i5) + "ms=" + str + "&" + uri3.substring(i5));
        } catch (UnsupportedOperationException unused2) {
            throw new R4("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return d(uri, this.f11167b.h(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new R4("Provided Uri is not in a valid state");
        }
    }

    public final boolean b(Uri uri) {
        if (c(uri)) {
            String[] strArr = f11165c;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f11166a;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
