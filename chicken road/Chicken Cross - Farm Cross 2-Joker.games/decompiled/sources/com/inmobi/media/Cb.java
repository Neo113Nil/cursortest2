package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Cb {
    public static String a(String fileKey) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        return "com.im.keyValueStore." + fileKey;
    }

    public static Db a(Context context, String fileKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        String a2 = a(fileKey);
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db db = (Db) concurrentHashMap.get(a2);
        if (db == null) {
            db = new Db(context, a2);
            Db db2 = (Db) concurrentHashMap.putIfAbsent(a2, db);
            if (db2 != null) {
                return db2;
            }
        }
        return db;
    }
}
