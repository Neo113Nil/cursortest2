package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class m extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    public static final int s = 0;
    public final kotlin.jvm.functions.Function0<kotlin.Unit> o;
    public final kotlin.jvm.functions.Function0<kotlin.Unit> p;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l q;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h r;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidInline", f = "MraidInline.kt", i = {0}, l = {53}, m = "load", n = {"this"}, s = {"L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7515a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.this.c(this);
        }
    }

    public /* synthetic */ m(android.content.Context context, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, function0, function02, function03, function1, z, rVar, fVar, (i & 512) != 0 ? null : lVar, (i & 1024) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar);
    }

    public static final kotlin.Unit a(kotlin.jvm.functions.Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        function0.invoke();
        if (lVar != null) {
            lVar.a(url);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
    public void V() {
        super.V();
        this.o.invoke();
    }

    public final android.webkit.WebView c() {
        return I().c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
    public void s() {
        super.s();
        this.p.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super android.webkit.WebView> continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a aVar;
        java.lang.Object obj;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar;
        if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a) {
            aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                obj = aVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    aVar.f7515a = this;
                    aVar.d = 1;
                    obj = b(aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mVar = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m) aVar.f7515a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj instanceof com.moloco.sdk.internal.v.b) {
                    return null;
                }
                return mVar.I().c();
            }
        }
        aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a(continuation);
        obj = aVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        if (obj instanceof com.moloco.sdk.internal.v.b) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, java.lang.String adm, kotlin.jvm.functions.Function0<kotlin.Unit> onNeedToDetachAdViewBeforeExpand, kotlin.jvm.functions.Function0<kotlin.Unit> onExpandAdViewClosed, final kotlin.jvm.functions.Function0<kotlin.Unit> onShowListenerClick, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d, kotlin.Unit> onError, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f mraidBridge, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        super(context, adm, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.b, onShowListenerClick, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m.a(kotlin.jvm.functions.Function0.this, lVar, (java.lang.String) obj);
            }
        }, onError, externalLinkHandler, z, mraidBridge);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNeedToDetachAdViewBeforeExpand, "onNeedToDetachAdViewBeforeExpand");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onExpandAdViewClosed, "onExpandAdViewClosed");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidBridge, "mraidBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.o = onNeedToDetachAdViewBeforeExpand;
        this.p = onExpandAdViewClosed;
        this.q = lVar;
        this.r = buttonTracker;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.r.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.r.a(buttonType);
    }
}
