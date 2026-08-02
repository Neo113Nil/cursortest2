package com.odehbros.flutter_file_downloader.downloader;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class e {
    public final Activity a;
    public final String b;
    public final String c;
    public final com.odehbros.flutter_file_downloader.core.b d;
    public final com.odehbros.flutter_file_downloader.downloadDestination.b e;
    public final com.odehbros.flutter_file_downloader.d f;
    public final Map<String, String> g;
    public final com.odehbros.flutter_file_downloader.f h;

    public e(Activity activity, String str, String str2, com.odehbros.flutter_file_downloader.core.b bVar, com.odehbros.flutter_file_downloader.downloadDestination.b bVar2, com.odehbros.flutter_file_downloader.d dVar, Map map, com.odehbros.flutter_file_downloader.f fVar) {
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = bVar;
        this.e = bVar2;
        this.f = dVar;
        this.g = map;
        this.h = fVar;
    }

    public static String d(String str) {
        return str.split("\\.")[0].replace("#", "").replace("%", "").replace(ProxyConfig.MATCH_ALL_SCHEMES, "").replace(".", "").replace("\\", "").replace("|", "").replace("\"", "").replace(":", "").replace(DomExceptionUtils.SEPARATOR, "").replace("<", "").replace(">", "").replace("?", "").replace("&", "");
    }

    public abstract void a();

    public abstract boolean b(long j);

    public abstract void c();

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e() {
        String str;
        String str2 = (String) androidx.appcompat.view.menu.a.a(1, Uri.parse(this.b).getPathSegments());
        String str3 = this.c;
        String str4 = null;
        String d = !TextUtils.isEmpty(str3) ? d(str3) : null;
        if (TextUtils.isEmpty(d)) {
            d = d(str2);
        }
        if (str2 != null) {
            String[] split = str2.split("\\.");
            if (split.length != 1) {
                str = split[split.length - 1];
                if (str == null) {
                    if (str3 != null) {
                        String[] split2 = str3.split("\\.");
                        if (split2.length != 1) {
                            str4 = split2[split2.length - 1];
                        }
                    }
                    str = str4;
                }
                return str != null ? d : android.support.v4.media.session.f.b(d, ".", str);
            }
        }
        str = null;
        if (str == null) {
        }
        if (str != null) {
        }
    }

    public abstract void f();
}
