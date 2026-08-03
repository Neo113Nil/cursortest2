package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class s implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.r> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.s.a d = new com.moloco.sdk.internal.services.bidtoken.providers.s.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "MemorySignalProvider";
    public final android.app.ActivityManager b;
    public com.moloco.sdk.internal.services.bidtoken.providers.r c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public s(android.app.ActivityManager activityManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        this.b = activityManager;
        this.c = e();
    }

    public final boolean a(com.moloco.sdk.internal.services.bidtoken.providers.r rVar, com.moloco.sdk.internal.services.bidtoken.providers.r rVar2) {
        return (kotlin.jvm.internal.Intrinsics.areEqual(rVar.d(), rVar2.d()) && kotlin.jvm.internal.Intrinsics.areEqual(rVar.e(), rVar2.e()) && kotlin.jvm.internal.Intrinsics.areEqual(rVar.f(), rVar2.f())) ? false : true;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.r e2 = e();
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(molocoLogger, f, "[CBT] cached lm: " + this.c.d() + ", t: " + this.c.e() + ", tm: " + this.c.f(), false, 4, null);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(molocoLogger, f, "[CBT] current lm: " + e2.d() + ", t: " + e2.e() + ", tm: " + e2.f(), false, 4, null);
        boolean a2 = a(e2, this.c);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[CBT] m needsRefresh: ");
        sb.append(a2);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(molocoLogger, f, sb.toString(), false, 4, null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.r e() {
        try {
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            this.b.getMemoryInfo(memoryInfo);
            return new com.moloco.sdk.internal.services.bidtoken.providers.r(java.lang.Boolean.valueOf(memoryInfo.lowMemory), java.lang.Long.valueOf(memoryInfo.threshold), java.lang.Long.valueOf(memoryInfo.totalMem));
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] MI Error", e2, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.r(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.r d() {
        com.moloco.sdk.internal.services.bidtoken.providers.r rVar = this.c;
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] lm: " + rVar.d() + ", t: " + rVar.e() + ", tm: " + rVar.f(), false, 4, null);
        return rVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] Updating m state", false, 4, null);
        this.c = e();
    }
}
