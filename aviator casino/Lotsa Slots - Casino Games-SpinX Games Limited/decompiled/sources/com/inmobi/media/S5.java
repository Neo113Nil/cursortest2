package com.inmobi.media;

/* loaded from: classes5.dex */
public final class S5 extends com.inmobi.media.De {
    public final java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5(java.lang.String url, java.lang.String offset) {
        super(url, androidx.core.app.NotificationCompat.CATEGORY_PROGRESS);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "offset");
        this.c = offset;
    }
}
