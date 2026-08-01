package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rh {

    /* renamed from: a, reason: collision with root package name */
    public final Db f6829a;

    public Rh(Context context, String sharePrefFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Db.b;
        this.f6829a = Cb.a(context, sharePrefFile);
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Db db = this.f6829a;
        db.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return db.f6510a.getString(key, null);
    }
}
