package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class Ea {

    /* renamed from: a, reason: collision with root package name */
    public static Db f6532a;

    public static final Db a() {
        Db db;
        if (f6532a == null) {
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                db = Cb.a(context, "CrashSession-store");
            } else {
                db = null;
            }
            f6532a = db;
        }
        return f6532a;
    }
}
