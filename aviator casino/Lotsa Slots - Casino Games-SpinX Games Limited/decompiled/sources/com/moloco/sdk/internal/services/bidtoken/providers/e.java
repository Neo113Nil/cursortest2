package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.d> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.e.a d = new com.moloco.sdk.internal.services.bidtoken.providers.e.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "ADISignalProvider";
    public final android.content.Context b;
    public com.moloco.sdk.internal.services.bidtoken.providers.d c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.b = context;
        this.c = new com.moloco.sdk.internal.services.bidtoken.providers.d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = new com.moloco.sdk.internal.services.bidtoken.providers.d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.d dVar = new com.moloco.sdk.internal.services.bidtoken.providers.d(e());
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(dVar, this.c);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] ADI needsRefresh: " + z + ", with adi: " + dVar.b(), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final java.lang.Long e() {
        try {
            return java.lang.Long.valueOf(this.b.getFilesDir().getTotalSpace());
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "ADI Error", e2, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.d d() {
        com.moloco.sdk.internal.services.bidtoken.providers.d dVar = this.c;
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] ADI providing " + dVar.b(), false, 4, null);
        return dVar;
    }
}
