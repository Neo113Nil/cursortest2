package com.inmobi.media;

import android.net.Uri;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3755h4 {
    public static final boolean a(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        return !(scheme == null || scheme.length() == 0);
    }
}
