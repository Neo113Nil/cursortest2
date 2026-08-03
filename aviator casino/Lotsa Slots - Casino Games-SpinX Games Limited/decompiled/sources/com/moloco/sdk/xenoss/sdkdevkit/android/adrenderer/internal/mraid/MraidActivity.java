package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/n$f;", "expectedOrientation", "a", "(Lkotlinx/coroutines/flow/StateFlow;)V", "orientationCommand", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/n$f;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;", "", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;)Ljava/lang/Integer;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/a;", "b", "Lkotlin/Lazy;", "c", "()Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/a;", "customUserEventBuilderService", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "_adPlaylistController", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/j;", "d", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/j;", "_mraidContentController", "", "e", "Z", "isClosedByUser", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/m;", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/m;", "storeInstallerImpl", "g", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class MraidActivity extends androidx.activity.ComponentActivity {
    public static final java.lang.String i = "MraidActivity";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.CoroutineScope scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());

    /* renamed from: b, reason: from kotlin metadata */
    public final kotlin.Lazy customUserEventBuilderService = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.b();
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a _adPlaylistController;

    /* renamed from: d, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j _mraidContentController;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean isClosedByUser;

    /* renamed from: f, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m storeInstallerImpl;

    /* renamed from: g, reason: from kotlin metadata */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.Companion INSTANCE = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.Companion(null);
    public static final int h = 8;
    public static final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> j = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return bVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c adData, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j controller, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> onShowListenerClick, kotlin.jvm.functions.Function0<kotlin.Unit> onCloseOrSkipButtonShown, java.lang.String str, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "controller");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
            if (!a(controller)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a;
            bVar.a(adData);
            bVar.a(yVar);
            bVar.a(options.a());
            bVar.a(options.e());
            bVar.a(function0);
            bVar.a(controller);
            bVar.c(function02);
            bVar.d(onShowListenerClick);
            bVar.b(onCloseOrSkipButtonShown);
            com.moloco.sdk.internal.ortb.model.C3411a b = options.b();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = null;
            bVar.a(b != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(b.getEnabled(), b.getUrl()) : null);
            com.moloco.sdk.internal.ortb.model.C3412b c = options.c();
            if (c != null) {
                boolean onSkip = c.getOnSkip();
                java.lang.String eventLink = c.getEventLink();
                java.lang.String clickthroughUrl = c.getClickthroughUrl();
                java.lang.Boolean forceFullScreen = c.getForceFullScreen();
                aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(true, onSkip, eventLink, clickthroughUrl, forceFullScreen != null ? forceFullScreen.booleanValue() : true);
            }
            bVar.a(aVar);
            bVar.a(metricsRecorder);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.class);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, options.d());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, options.f());
            if (str != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent, str);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.e.b);
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j jVar) {
            android.webkit.WebView c;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j m = bVar.m();
            if (m != null && !kotlin.jvm.internal.Intrinsics.areEqual(m, jVar)) {
                return false;
            }
            bVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j) null);
            android.view.ViewParent parent = (m == null || (c = m.c()) == null) ? null : c.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(m.c());
            }
            bVar.a((kotlin.jvm.functions.Function10<? super android.content.Context, ? super android.webkit.WebView, ? super java.lang.Integer, ? super kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, ? super androidx.compose.ui.unit.Dp, ? super java.lang.Boolean, ? extends android.view.View>) null);
            bVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) null);
            bVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y) null);
            android.app.Activity l = bVar.l();
            if (l != null) {
                l.finish();
            }
            bVar.a((android.app.Activity) null);
            return true;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7491a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.b.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.c.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p.d.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f7491a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$onCreate$1", f = "MraidActivity.kt", i = {0}, l = {160}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7492a;
        public /* synthetic */ java.lang.Object b;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.c) create(bVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7492a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.j;
                this.b = bVar2;
                this.f7492a = 1;
                if (mutableSharedFlow.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (bVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.a) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a.j().invoke();
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.Companion companion = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.INSTANCE;
                if (companion.b(bVar)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.this.finish();
                } else if (companion.a(bVar)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.this.isClosedByUser = true;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.this.finish();
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        public e(java.lang.Object obj) {
            super(2, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidJsCommand$SetOrientationProperties;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f fVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity) this.receiver, fVar, continuation);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b() {
        return com.moloco.sdk.service_locator.a.k.f7352a.b();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) this.customUserEventBuilderService.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g.f7628a;
        gVar.a();
        androidx.activity.result.ActivityResultLauncher registerForActivityResult = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.this, (androidx.activity.result.ActivityResult) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n(this, registerForActivityResult, androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(this), gVar.b(), 0L, null, null, 112, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f = com.moloco.sdk.service_locator.a.h.f7349a.f();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b c2 = bVar.c();
        boolean c3 = c2 != null ? c2.c() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b2 = bVar.b();
        boolean g = b2 != null ? b2.g() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b3 = bVar.b();
        boolean j2 = b3 != null ? b3.j() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b4 = bVar.b();
        boolean i2 = b4 != null ? b4.i() : true;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b5 = bVar.b();
        java.lang.String f2 = b5 != null ? b5.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b6 = bVar.b();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j(c3, g, j2, i2, f2, b6 != null ? b6.h() : null, bVar.e());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar2 = this.storeInstallerImpl;
        if (mVar2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        } else {
            mVar = mVar2;
        }
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l a2 = jVar.a(f, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.j(intent), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(), bVar.c(), bVar.b(), bVar.e()));
        bVar.a(this);
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> d2 = bVar.d();
        kotlin.jvm.functions.Function10<android.content.Context, android.webkit.WebView, java.lang.Integer, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, androidx.compose.ui.unit.Dp, java.lang.Boolean, android.view.View> f3 = bVar.f();
        if (f3 == null) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "can't display ad: MraidRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j m = bVar.m();
        if (m == null) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "can't display ad: mraid controller is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c a3 = bVar.a();
        if (a3 != null) {
            android.content.Intent intent2 = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(a3, f, this, m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.l(intent2), c(), a2);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "can't display ad: mraid ad data is missing", null, false, 12, null);
            finish();
            return;
        }
        m.a(a2);
        a(m.e());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(aVar.a(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.c(null)), this.scope);
        androidx.activity.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1048815572, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.d(aVar, m, f3, d2)), 1, null);
        aVar.d();
        this._adPlaylistController = aVar;
        this._mraidContentController = m;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        kotlin.jvm.functions.Function0<kotlin.Unit> i2;
        super.onDestroy();
        if (!this.isClosedByUser && (i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a.i()) != null) {
            i2.invoke();
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> g = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a.g();
        if (g != null) {
            g.invoke();
        }
        INSTANCE.a(this._mraidContentController);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this._adPlaylistController;
        if (aVar != null) {
            aVar.destroy();
        }
        this._adPlaylistController = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar = this.storeInstallerImpl;
        if (mVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        }
        mVar.cancel();
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }

    public static final /* synthetic */ java.lang.Object b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity mraidActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f fVar, kotlin.coroutines.Continuation continuation) {
        mraidActivity.a(fVar);
        return kotlin.Unit.INSTANCE;
    }

    public final void a(kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f> expectedOrientation) {
        a(expectedOrientation.getValue());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(expectedOrientation, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.e(this)), this.scope);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f orientationCommand) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p c2;
        java.lang.Integer a2;
        if (orientationCommand == null || (c2 = orientationCommand.c()) == null || (a2 = a(c2)) == null) {
            return;
        }
        setRequestedOrientation(a2.intValue());
    }

    public final java.lang.Integer a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p pVar) {
        int i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.b.f7491a[pVar.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity mraidActivity, androidx.activity.result.ActivityResult activityResult) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar = mraidActivity.storeInstallerImpl;
        if (mVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        }
        mVar.a(activityResult.getResultCode());
    }

    public static final class d implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j c;
        public final /* synthetic */ kotlin.jvm.functions.Function10<android.content.Context, android.webkit.WebView, java.lang.Integer, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, androidx.compose.ui.unit.Dp, java.lang.Boolean, android.view.View> d;
        public final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> e;

        public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
            public a(java.lang.Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j.class, "onSkipOrClose", "onSkipOrClose()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j) this.receiver).B();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                a();
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j jVar, kotlin.jvm.functions.Function10<? super android.content.Context, ? super android.webkit.WebView, ? super java.lang.Integer, ? super kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, ? super androidx.compose.ui.unit.Dp, ? super java.lang.Boolean, ? extends android.view.View> function10, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.jvm.functions.Function11<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, ? super java.lang.Boolean, ? super kotlin.UInt, ? super kotlin.UInt, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> function2) {
            this.b = aVar;
            this.c = jVar;
            this.d = function10;
            this.e = function2;
        }

        public final void a(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1048815572, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.onCreate.<anonymous> (MraidActivity.kt:173)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity mraidActivity = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.b;
            android.webkit.WebView c = this.c.c();
            android.content.Intent intent = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.this.getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            int k = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.k(intent);
            composer.startReplaceableGroup(-674019340);
            java.lang.Object rememberedValue = composer.rememberedValue();
            androidx.compose.runtime.Composer.Companion companion = androidx.compose.runtime.Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$d$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.d.a((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j jVar = this.c;
            composer.startReplaceableGroup(-674017291);
            boolean changedInstance = composer.changedInstance(jVar);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.d.a(jVar);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2);
            kotlin.jvm.functions.Function10<android.content.Context, android.webkit.WebView, java.lang.Integer, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, androidx.compose.ui.unit.Dp, java.lang.Boolean, android.view.View> function10 = this.d;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y k2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a.k();
            kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> invoke = this.e.invoke(composer, 0);
            kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            composer.startReplaceableGroup(-674006789);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$d$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.d.a();
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(mraidActivity, aVar, c, k, function1, function0, function10, k2, invoke, a2, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 24576, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a() {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, "Skip button shown in MraidActivity", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f7495a.h().invoke();
            return kotlin.Unit.INSTANCE;
        }
    }
}
