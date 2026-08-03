package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "a", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "ac", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/m;", "c", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/m;", "storeInstallerImpl", "d", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final class VastActivity extends androidx.activity.ComponentActivity {
    public static final java.lang.String f = "VastActivity";
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a i;
    public static kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> j;
    public static kotlin.jvm.functions.Function0<kotlin.Unit> k;
    public static kotlinx.coroutines.Job l;
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y m;
    public static com.moloco.sdk.acm.recorder.MetricsRecorder n;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a ac;

    /* renamed from: b, reason: from kotlin metadata */
    public final kotlinx.coroutines.CoroutineScope scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());

    /* renamed from: c, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m storeInstallerImpl;

    /* renamed from: d, reason: from kotlin metadata */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion INSTANCE = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion(null);
    public static final int e = 8;
    public static final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> g = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public static java.lang.ref.WeakReference<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity> h = new java.lang.ref.WeakReference<>(null);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2", f = "VastActivity.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a, reason: collision with other inner class name */
        public static final class C0278a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7677a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x c;
            public final /* synthetic */ kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> d;
            public final /* synthetic */ android.content.Context e;
            public final /* synthetic */ java.lang.String f;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a, reason: collision with other inner class name */
            public static final class C0279a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7678a;
                public /* synthetic */ java.lang.Object b;
                public final /* synthetic */ kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> c;
                public final /* synthetic */ android.content.Context d;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x e;
                public final /* synthetic */ java.lang.String f;

                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1", f = "VastActivity.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C0280a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f7679a;
                    public final /* synthetic */ kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> b;

                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$1", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C0281a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                        /* renamed from: a, reason: collision with root package name */
                        public int f7680a;
                        public /* synthetic */ java.lang.Object b;
                        public final /* synthetic */ kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0281a(kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.C0281a> continuation) {
                            super(2, continuation);
                            this.c = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.C0281a) create(bVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.C0281a c0281a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.C0281a(this.c, continuation);
                            c0281a.b = obj;
                            return c0281a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f7680a != 0) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.c.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b);
                            return kotlin.Unit.INSTANCE;
                        }
                    }

                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$2", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$b */
                    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

                        /* renamed from: a, reason: collision with root package name */
                        public int f7681a;
                        public /* synthetic */ java.lang.Object b;

                        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.b> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.b) create(bVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.b(continuation);
                            bVar.b = obj;
                            return bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f7681a != 0) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.INSTANCE.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0280a(kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a> continuation) {
                        super(2, continuation);
                        this.b = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a(this.b, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f7679a;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.g, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.C0281a(this.b, null));
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a.b(null);
                            this.f7679a = 1;
                            if (kotlinx.coroutines.flow.FlowKt.firstOrNull(onEach, bVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }

                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$2", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$b */
                public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f7682a;
                    public final /* synthetic */ android.content.Context b;
                    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x c;
                    public final /* synthetic */ java.lang.String d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.b> continuation) {
                        super(2, continuation);
                        this.b = context;
                        this.c = xVar;
                        this.d = str;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.b(this.b, this.c, this.d, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Boolean forceFullScreen;
                        java.lang.String clickthroughUrl;
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f7682a != 0) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        android.content.Context context = this.b;
                        android.content.Intent intent = new android.content.Intent(this.b, (java.lang.Class<?>) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.class);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar = this.c;
                        java.lang.String str = this.d;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.g(intent, xVar.i());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, xVar.e());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, xVar.f());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, xVar.g());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, xVar.h());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent, xVar.d());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent, xVar.c());
                        com.moloco.sdk.internal.ortb.model.C3411a a2 = xVar.a();
                        if (a2 != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent, a2.getEnabled());
                        }
                        com.moloco.sdk.internal.ortb.model.C3411a a3 = xVar.a();
                        if (a3 != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, a3.getUrl());
                        }
                        if (xVar.b() != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, true);
                        }
                        com.moloco.sdk.internal.ortb.model.C3412b b = xVar.b();
                        if (b != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, b.getOnSkip());
                        }
                        com.moloco.sdk.internal.ortb.model.C3412b b2 = xVar.b();
                        if (b2 != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, b2.getEventLink());
                        }
                        com.moloco.sdk.internal.ortb.model.C3412b b3 = xVar.b();
                        if (b3 != null && (clickthroughUrl = b3.getClickthroughUrl()) != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, clickthroughUrl);
                        }
                        com.moloco.sdk.internal.ortb.model.C3412b b4 = xVar.b();
                        if (b4 != null && (forceFullScreen = b4.getForceFullScreen()) != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, forceFullScreen.booleanValue());
                        }
                        if (str != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent, str);
                        }
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                        return kotlin.Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0279a(kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> function1, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a> continuation) {
                    super(2, continuation);
                    this.c = function1;
                    this.d = context;
                    this.e = xVar;
                    this.f = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a c0279a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a(this.c, this.d, this.e, this.f, continuation);
                    c0279a.b = obj;
                    return c0279a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.Job launch$default;
                    kotlinx.coroutines.Job launch$default2;
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7678a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion companion = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.INSTANCE;
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.C0280a(this.c, null), 3, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.l = launch$default;
                    launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a.b(this.d, this.e, this.f, null), 3, null);
                    return launch$default2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0278a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> function1, android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = xVar;
                this.d = function1;
                this.e = context;
                this.f = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7677a;
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion companion = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.INSTANCE;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.i = this.b;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.j = this.c.j();
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a c0279a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a.C0279a(this.d, this.e, this.c, this.f, null);
                        this.f7677a = 1;
                        obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(c0279a, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (kotlinx.coroutines.Job) obj;
                } finally {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion companion2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.INSTANCE;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity b = companion2.b();
                    if (b != null) {
                        b.finish();
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.k = null;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.i = null;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.n = null;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.j = null;
                    companion2.a();
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity b() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.h.get();
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity vastActivity) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.h = new java.lang.ref.WeakReference(vastActivity);
            if (vastActivity == null) {
                a();
            }
        }

        public final java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x xVar, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, java.lang.String str, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.m = yVar;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.k = function0;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.n = metricsRecorder;
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.Companion.C0278a(aVar, xVar, function1, context, str, null), continuation);
            return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
        }

        public final void a() {
            kotlinx.coroutines.Job job = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.l;
            if (job == null || !job.isActive()) {
                return;
            }
            kotlinx.coroutines.Job job2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.l;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.l = null;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return (bVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f) || kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.e.b);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$onCreate$1", f = "VastActivity.kt", i = {0}, l = {170}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7683a;
        public /* synthetic */ java.lang.Object b;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.b) create(bVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7683a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.f, "VastActivity received event: " + bVar2, null, false, 12, null);
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.g;
                this.b = bVar2;
                this.f7683a = 1;
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
            if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.INSTANCE.a(bVar)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.this.finish();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class c implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b;
        public final /* synthetic */ kotlin.jvm.functions.Function2<android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, android.view.View> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> function2) {
            this.b = aVar;
            this.c = function2;
        }

        public final void a(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1009520481, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.onCreate.<anonymous> (VastActivity.kt:177)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.this, this.b, this.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.m, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g.f7628a;
        gVar.a();
        androidx.activity.result.ActivityResultLauncher registerForActivityResult = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.this, (androidx.activity.result.ActivityResult) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f2 = com.moloco.sdk.service_locator.a.h.f7349a.f();
        this.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n(this, registerForActivityResult, androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(this), gVar.b(), 0L, null, null, 112, null);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean f3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent);
        android.content.Intent intent2 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        boolean b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent2);
        android.content.Intent intent3 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        boolean e2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent3);
        android.content.Intent intent4 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        boolean d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent4);
        android.content.Intent intent5 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
        java.lang.String a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent5);
        android.content.Intent intent6 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j jVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j(f3, b2, e2, d, a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent6), n);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar2 = this.storeInstallerImpl;
        if (mVar2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        } else {
            mVar = mVar2;
        }
        android.content.Intent intent7 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
        java.lang.String j2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.j(intent7);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d();
        android.content.Intent intent8 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
        boolean f4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent8);
        android.content.Intent intent9 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(f4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.g(intent9));
        android.content.Intent intent10 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
        boolean b3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent10);
        android.content.Intent intent11 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
        boolean e3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent11);
        android.content.Intent intent12 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
        java.lang.String c2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent12);
        android.content.Intent intent13 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
        java.lang.String a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent13);
        android.content.Intent intent14 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l a4 = jVar.a(f2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(mVar, j2, dVar, bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(b3, e3, c2, a3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent14)), n));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = i;
        if (aVar == null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> function2 = j;
        if (function2 == null) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b4 = com.moloco.sdk.service_locator.a.k.f7352a.b();
        android.content.Intent intent15 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
        boolean o = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.o(intent15);
        android.content.Intent intent16 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
        java.lang.Boolean m2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.m(intent16);
        android.content.Intent intent17 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
        int n2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.n(intent17);
        android.content.Intent intent18 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent18, "getIntent(...)");
        int k2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.k(intent18);
        android.content.Intent intent19 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent19, "getIntent(...)");
        int l2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.l(intent19);
        android.content.Intent intent20 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent20, "getIntent(...)");
        boolean i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.i(intent20);
        android.content.Intent intent21 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent21, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, f2, this, b4, o, m2, n2, k2, l2, i2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.h(intent21), a4);
        this.ac = a5;
        INSTANCE.a(this);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(a5.a(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.b(null)), this.scope);
        androidx.activity.compose.ComponentActivityKt.setContent$default(this, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1009520481, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.c(a5, function2)), 1, null);
        a5.d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = k;
        if (function0 != null) {
            function0.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.ac;
        if (aVar != null) {
            aVar.destroy();
        }
        this.ac = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar = this.storeInstallerImpl;
        if (mVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        }
        mVar.cancel();
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        INSTANCE.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity) null);
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity vastActivity, androidx.activity.result.ActivityResult activityResult) {
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultCode=" + activityResult.getResultCode(), null, false, 12, null);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultData=" + activityResult.getData(), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m mVar = vastActivity.storeInstallerImpl;
        if (mVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            mVar = null;
        }
        mVar.a(activityResult.getResultCode());
    }
}
