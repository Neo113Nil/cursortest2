package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Ka {
    public static java.lang.String a(java.lang.String fileKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        return "com.im.keyValueStore." + fileKey;
    }

    public static com.inmobi.media.La a(android.content.Context context, java.lang.String fileKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        java.lang.String a2 = a(fileKey);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La la = (com.inmobi.media.La) concurrentHashMap.get(a2);
        if (la == null) {
            la = new com.inmobi.media.La(context, a2);
            com.inmobi.media.La la2 = (com.inmobi.media.La) concurrentHashMap.putIfAbsent(a2, la);
            if (la2 != null) {
                return la2;
            }
        }
        return la;
    }
}
