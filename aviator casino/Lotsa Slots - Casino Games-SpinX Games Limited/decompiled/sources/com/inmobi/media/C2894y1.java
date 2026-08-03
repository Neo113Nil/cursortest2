package com.inmobi.media;

/* renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2894y1 extends com.inmobi.media.AbstractC2873x5 {
    public final android.content.Context b;
    public final long c;
    public final int d;
    public final java.lang.String e;
    public final android.app.ActivityManager f;
    public final com.inmobi.media.La g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2894y1(android.content.Context context, com.inmobi.media.C2898y5 listener, long j, int i) {
        super(listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = context;
        this.c = j;
        this.d = i;
        this.e = "y1";
        java.lang.Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f = (android.app.ActivityManager) systemService;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        this.g = com.inmobi.media.Ka.a(context, "appClose");
    }

    @Override // com.inmobi.media.AbstractC2873x5
    public final void a() {
        com.inmobi.media.AbstractC2939zl.a(new com.inmobi.media.C2869x1(this, null));
    }

    @Override // com.inmobi.media.AbstractC2873x5
    public final void b() {
    }
}
