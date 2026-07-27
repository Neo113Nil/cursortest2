package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S1 extends U5 {
    public final Context b;
    public final long c;
    public final int d;
    public final String e;
    public final ActivityManager f;
    public final Db g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(Context context, V5 listener, long j, int i) {
        super(listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = context;
        this.c = j;
        this.d = i;
        this.e = "S1";
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = Db.b;
        this.g = Cb.a(context, "appClose");
    }

    @Override // com.inmobi.media.U5
    public final void a() {
        AbstractC4143un.a(new R1(this, null));
    }

    @Override // com.inmobi.media.U5
    public final void b() {
    }
}
