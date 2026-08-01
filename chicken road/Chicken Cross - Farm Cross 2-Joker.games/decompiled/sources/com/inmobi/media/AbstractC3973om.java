package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3973om {

    /* renamed from: a, reason: collision with root package name */
    public static final Db f7292a;
    public static int b;
    public static Integer c;

    static {
        Db db;
        Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            db = Cb.a(context, "imtelemetrydboverflow");
        } else {
            db = null;
        }
        f7292a = db;
        b = -1;
    }

    public static int a() {
        if (b == -1) {
            Db db = f7292a;
            int i = 0;
            if (db != null) {
                Intrinsics.checkNotNullParameter("count", "key");
                i = db.f6510a.getInt("count", 0);
            }
            b = i;
        }
        return b;
    }
}
