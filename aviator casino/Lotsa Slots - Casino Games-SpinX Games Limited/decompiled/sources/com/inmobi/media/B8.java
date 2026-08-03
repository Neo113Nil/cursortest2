package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class B8 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f4617a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String a() {
        boolean booleanValue;
        com.inmobi.media.C2580m4 c2580m4;
        java.lang.Boolean bool = com.inmobi.media.AbstractC2332ch.b;
        if (bool == null) {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                com.inmobi.media.AbstractC2332ch.b = java.lang.Boolean.valueOf(a2.f4815a.getBoolean("user_age_restricted", false));
            }
            java.lang.Boolean bool2 = com.inmobi.media.AbstractC2332ch.b;
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            }
            com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            if (!kotlin.collections.CollectionsKt.contains(((com.inmobi.media.core.config.models.RootConfig) c2580m4.a(com.inmobi.media.core.config.models.RootConfig.class)).getIPAddrTPSupport(), com.inmobi.media.Yi.b)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B8", "TAG");
                return f4617a;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B8", "TAG");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            java.util.List<java.lang.String> iPAddrTPSupport = ((com.inmobi.media.core.config.models.RootConfig) c2580m4.a(com.inmobi.media.core.config.models.RootConfig.class)).getIPAddrTPSupport();
            java.lang.String str = com.inmobi.media.Yi.b;
            java.util.Objects.toString(iPAddrTPSupport);
            return null;
        }
        booleanValue = bool.booleanValue();
        if (booleanValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B8", "TAG");
            return null;
        }
        com.inmobi.media.C2580m4 c2580m422 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
        c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        if (!kotlin.collections.CollectionsKt.contains(((com.inmobi.media.core.config.models.RootConfig) c2580m4.a(com.inmobi.media.core.config.models.RootConfig.class)).getIPAddrTPSupport(), com.inmobi.media.Yi.b)) {
        }
    }

    static {
        a(com.inmobi.media.C9.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("B8", "TAG");
        com.inmobi.media.C9.a();
    }

    public static void a(java.lang.String str) {
        boolean booleanValue;
        java.lang.Boolean bool = com.inmobi.media.AbstractC2332ch.b;
        if (bool == null) {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                com.inmobi.media.AbstractC2332ch.b = java.lang.Boolean.valueOf(a2.f4815a.getBoolean("user_age_restricted", false));
            }
            java.lang.Boolean bool2 = com.inmobi.media.AbstractC2332ch.b;
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            }
            f4617a = str;
            com.inmobi.media.C9.a(str);
        }
        booleanValue = bool.booleanValue();
        if (booleanValue) {
            f4617a = null;
            com.inmobi.media.C9.a(null);
            return;
        }
        f4617a = str;
        com.inmobi.media.C9.a(str);
    }
}
