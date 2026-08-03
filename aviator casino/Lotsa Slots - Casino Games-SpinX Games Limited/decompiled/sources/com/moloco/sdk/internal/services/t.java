package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class t implements com.moloco.sdk.internal.services.s {
    public static final com.moloco.sdk.internal.services.t.a c = new com.moloco.sdk.internal.services.t.a(null);
    public static final int d = 0;
    public static final java.lang.String e = "ClickthroughService";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f7311a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.ClickthroughServiceImpl", f = "ClickthroughService.kt", i = {0, 0}, l = {73, 77}, m = "runClickThrough", n = {"this", "clickthroughEvent"}, s = {"L$0", "L$1"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7312a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.t.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.t.this.a(null, null, null, null, this);
        }
    }

    public t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        this.f7311a = externalLinkHandler;
        this.b = customUserEventBuilderService;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.moloco.sdk.internal.services.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.services.t.b bVar;
        int i;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object a2;
        com.moloco.sdk.internal.services.t tVar;
        java.lang.String str2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar;
        if (continuation instanceof com.moloco.sdk.internal.services.t.b) {
            bVar = (com.moloco.sdk.internal.services.t.b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f7665a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.d(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f(cVar.a(aVar.g()), cVar.a(aVar.h())), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f(cVar.a(aVar.i()), cVar.a(aVar.j())), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g(cVar.a(aVar.l()), cVar.a(aVar.k())), hVar.p());
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2 = this.b;
                    bVar.f7312a = this;
                    mutableSharedFlow2 = mutableSharedFlow;
                    bVar.b = mutableSharedFlow2;
                    bVar.e = 1;
                    a2 = aVar2.a(currentTimeMillis, dVar, str, bVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3 = (kotlinx.coroutines.flow.MutableSharedFlow) bVar.b;
                    tVar = (com.moloco.sdk.internal.services.t) bVar.f7312a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    a2 = obj;
                    mutableSharedFlow2 = mutableSharedFlow3;
                }
                str2 = (java.lang.String) a2;
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Launching url: " + str2, false, 4, null);
                rVar = tVar.f7311a;
                if (str2 == null) {
                    str2 = "";
                }
                if (rVar.a(str2) || mutableSharedFlow2 == null) {
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                bVar.f7312a = null;
                bVar.b = null;
                bVar.e = 2;
                if (mutableSharedFlow2.emit(unit, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        bVar = new com.moloco.sdk.internal.services.t.b(continuation);
        java.lang.Object obj2 = bVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        str2 = (java.lang.String) a2;
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Launching url: " + str2, false, 4, null);
        rVar = tVar.f7311a;
        if (str2 == null) {
        }
        if (rVar.a(str2)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.s
    public java.lang.Object a(java.lang.String str, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> mutableSharedFlow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar = this.f7311a;
        if (str == null) {
            str = "";
        }
        if (rVar.a(str) && mutableSharedFlow != null) {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Object emit = mutableSharedFlow.emit(unit, continuation);
            return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : unit;
        }
        return kotlin.Unit.INSTANCE;
    }
}
