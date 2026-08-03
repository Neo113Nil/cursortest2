package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Z9 {

    /* renamed from: a, reason: collision with root package name */
    public static com.inmobi.media.La f5081a;

    public static final com.inmobi.media.La a() {
        com.inmobi.media.La la;
        if (f5081a == null) {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                la = com.inmobi.media.Ka.a(context, "CrashSession-store");
            } else {
                la = null;
            }
            f5081a = la;
        }
        return f5081a;
    }
}
