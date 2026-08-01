package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4137uh {
    public static final boolean a(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        C4262z6 c4262z6 = B6.b;
        int code = response.code();
        c4262z6.getClass();
        return C4262z6.a(code) != B6.d;
    }
}
