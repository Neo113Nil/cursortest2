package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class X6 {
    public static final void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.inmobi.media.Ka.a("carb_store"), com.inmobi.media.Ka.a("aes_key_store"), com.inmobi.media.Ka.a("mraid_js_store"), com.inmobi.media.Ka.a("omid_js_store"), com.inmobi.media.Ka.a("user_info_store"), com.inmobi.media.Ka.a("coppa_store"), com.inmobi.media.Ka.a("gesture_info_store"), com.inmobi.media.Ka.a("display_info_store"), com.inmobi.media.Ka.a("unified_id_info_store"), com.inmobi.media.Ka.a("app_bundle_store"), com.inmobi.media.Ka.a("pub_signals_store"), com.inmobi.media.Ka.a("CrashSession-store")});
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                context.deleteSharedPreferences((java.lang.String) it.next());
            }
            return;
        }
        for (java.lang.String str : listOf) {
            java.io.File file = new java.io.File("/data/data/" + context.getPackageName() + "/shared_prefs/" + str + ".xml");
            if (file.exists() && file.delete()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("X6", "TAG");
                file.getName();
            }
        }
    }

    public static final void a(java.io.File path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        try {
            if (path.exists()) {
                java.io.File[] listFiles = path.listFiles();
                if (listFiles != null) {
                    java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(listFiles);
                    while (it.hasNext()) {
                        java.io.File file = (java.io.File) it.next();
                        if (file.isDirectory()) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(file);
                            a(file);
                        } else if (file.delete()) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("X6", "TAG");
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("X6", "TAG");
                    path.getName();
                }
            }
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("X6", "TAG");
            e.getMessage();
        }
    }
}
