package com.inmobi.media;

import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4114tn {
    public static final C3560a6 a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() != 2 ? new C3560a6(0, 0) : new C3560a6(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
    }

    public static final String a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Build.VERSION.SDK_INT >= 33) {
            return URLEncoder.encode(url, Charset.defaultCharset());
        }
        return URLEncoder.encode(url);
    }
}
