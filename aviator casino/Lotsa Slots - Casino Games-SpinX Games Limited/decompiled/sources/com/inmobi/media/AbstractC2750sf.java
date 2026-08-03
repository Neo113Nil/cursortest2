package com.inmobi.media;

/* renamed from: com.inmobi.media.sf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2750sf {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5448a = 0;

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_STREAMING_FORMAT, "getSimpleName(...)");
    }

    public static boolean a(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        try {
            if (!com.iab.omid.library.inmobi.Omid.isActive()) {
                com.iab.omid.library.inmobi.Omid.activate(applicationContext);
            }
            return com.iab.omid.library.inmobi.Omid.isActive();
        } catch (java.lang.Throwable th) {
            java.util.Objects.toString(th.getStackTrace());
            return false;
        }
    }
}
