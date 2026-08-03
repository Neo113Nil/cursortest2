package com.inmobi.media;

/* renamed from: com.inmobi.media.sk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2757sk {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.La f5450a;
    public static int b;
    public static java.lang.Integer c;

    static {
        com.inmobi.media.La la;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            la = com.inmobi.media.Ka.a(context, "imtelemetrydboverflow");
        } else {
            la = null;
        }
        f5450a = la;
        b = -1;
    }

    public static int a() {
        if (b == -1) {
            com.inmobi.media.La la = f5450a;
            int i = 0;
            if (la != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, com.ironsource.X3.i.W);
                i = la.f4815a.getInt(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, 0);
            }
            b = i;
        }
        return b;
    }
}
