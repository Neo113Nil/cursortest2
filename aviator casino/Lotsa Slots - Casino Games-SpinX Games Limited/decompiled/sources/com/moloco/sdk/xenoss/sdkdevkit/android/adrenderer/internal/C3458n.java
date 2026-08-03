package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3458n implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i f7531a;
    public final com.moloco.sdk.internal.error.b b;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.DECLoaderImpl", f = "DECLoader.kt", i = {0, 0, 0, 0}, l = {31}, m = "load", n = {"this", "decToLoad", "mtid", "appIconUri"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n$a */
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7532a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public /* synthetic */ java.lang.Object e;
        public int g;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n.this.a(null, null, this);
        }
    }

    public C3458n(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, com.moloco.sdk.internal.error.b errorReportingService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        this.f7531a = mediaCacheRepository;
        this.b = errorReportingService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n.a aVar;
        int i;
        java.lang.String d;
        java.lang.Object a2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n c3458n;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a aVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i3 = c3453i;
        java.lang.String str2 = str;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n.a) {
            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n.a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j n = c3453i.n();
                    if (n == null || (d = n.d()) == null) {
                        this.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3459o.b, str2 != null ? new com.moloco.sdk.internal.error.a(str2) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3459o.b("can't precache DEC: appIconUri is null");
                        return c3453i3;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar = this.f7531a;
                    aVar.f7532a = this;
                    aVar.b = c3453i3;
                    aVar.c = str2;
                    aVar.d = d;
                    aVar.g = 1;
                    a2 = iVar.a(d, aVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c3458n = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str3 = (java.lang.String) aVar.d;
                    str2 = (java.lang.String) aVar.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) aVar.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n c3458n2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n) aVar.f7532a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    d = str3;
                    c3453i3 = c3453i4;
                    c3458n = c3458n2;
                    a2 = obj;
                }
                aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) a2;
                if (aVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b) {
                    c3458n.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3459o.f7533a, str2 != null ? new com.moloco.sdk.internal.error.a(str2) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3459o.b("dec loading error: " + aVar2 + ": `Not found` for " + d);
                    c3453i2 = null;
                } else {
                    c3453i2 = r8.a((r20 & 1) != 0 ? r8.f7459a : null, (r20 & 2) != 0 ? r8.b : null, (r20 & 4) != 0 ? r8.c : null, (r20 & 8) != 0 ? r8.d : null, (r20 & 16) != 0 ? r8.e : null, (r20 & 32) != 0 ? r8.f : null, (r20 & 64) != 0 ? r8.g : null, (r20 & 128) != 0 ? r8.h : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j(c3453i3.n().f(), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b) aVar2).a().getAbsolutePath(), c3453i3.n().e()), (r20 & 256) != 0 ? c3453i3.i : null);
                }
                return c3453i2 != null ? c3453i3 : c3453i2;
            }
        }
        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n.a(continuation);
        java.lang.Object obj2 = aVar.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.g;
        if (i != 0) {
        }
        aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a) a2;
        if (aVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.a.b) {
        }
        if (c3453i2 != null) {
        }
    }
}
