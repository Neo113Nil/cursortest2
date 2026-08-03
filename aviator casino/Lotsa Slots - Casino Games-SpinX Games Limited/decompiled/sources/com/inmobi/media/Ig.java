package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ig {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.La f4765a;

    public Ig(android.content.Context context, java.lang.String sharePrefFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharePrefFile, "sharePrefFile");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        this.f4765a = com.inmobi.media.Ka.a(context, sharePrefFile);
    }

    public final java.lang.String a(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.inmobi.media.La la = this.f4765a;
        la.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return la.f4815a.getString(key, null);
    }
}
