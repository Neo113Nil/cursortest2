package com.chartboost.sdk.impl;

import android.net.Uri;
import com.tiktok.util.UrlConst;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class n0 {
    public static final String a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() <= 0) {
            return "";
        }
        if (!StringsKt.startsWith$default(url, UrlConst.HTTPS, false, 2, (Object) null) && !StringsKt.startsWith$default(url, "http://", false, 2, (Object) null)) {
            url = UrlConst.HTTPS + url;
        }
        Uri parse = Uri.parse(url);
        if (parse == null) {
            return "";
        }
        List<String> pathSegments = parse.getPathSegments();
        Intrinsics.checkNotNull(pathSegments);
        return CollectionsKt.joinToString$default(pathSegments, "_", null, null, 0, null, null, 62, null);
    }

    public static final bc a(int i) {
        Object obj;
        Iterator<E> it = bc.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((bc) obj).c() == i) {
                break;
            }
        }
        bc bcVar = (bc) obj;
        return bcVar == null ? bc.c : bcVar;
    }
}
