package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3985p6 extends C4189wf {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3985p6(String url, String offset) {
        super(url, NotificationCompat.CATEGORY_PROGRESS);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.c = offset;
    }
}
