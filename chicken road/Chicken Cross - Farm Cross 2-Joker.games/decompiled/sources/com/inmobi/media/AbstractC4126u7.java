package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4126u7 {
    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = Db.b;
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{Cb.a("carb_store"), Cb.a("aes_key_store"), Cb.a("mraid_js_store"), Cb.a("omid_js_store"), Cb.a("user_info_store"), Cb.a("coppa_store"), Cb.a("gesture_info_store"), Cb.a("display_info_store"), Cb.a("unified_id_info_store"), Cb.a("app_bundle_store"), Cb.a("pub_signals_store"), Cb.a("synapse_signal_store"), Cb.a("CrashSession-store"), Cb.a("app_activity_counts")}).iterator();
        while (it.hasNext()) {
            context.deleteSharedPreferences((String) it.next());
        }
    }

    public static final void a(File path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            if (path.exists()) {
                File[] listFiles = path.listFiles();
                if (listFiles != null) {
                    Iterator it = ArrayIteratorKt.iterator(listFiles);
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        if (file.isDirectory()) {
                            Intrinsics.checkNotNull(file);
                            a(file);
                        } else if (file.delete()) {
                            Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                            String str = "directory " + file.getName() + " deleted";
                        }
                    }
                }
                if (path.delete()) {
                    Intrinsics.checkNotNullExpressionValue("u7", "TAG");
                    String str2 = "directory " + path.getName() + " deleted";
                }
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("u7", "TAG");
            String str3 = "SDK encountered unexpected error in deleting directory; " + e.getMessage();
        }
    }
}
