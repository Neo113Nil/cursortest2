package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4778a;
import com.moloco.sdk.internal.ortb.model.C4779b;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.ForegroundMonitor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "e", "a", "(Ljava/lang/Throwable;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;", "c", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;", "storeInstallerImpl", "d", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes7.dex */
public final class VastActivity extends ComponentActivity {
    public static final String f = "VastActivity";
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a i;
    public static Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> j;
    public static Function0<Unit> k;
    public static Job l;
    public static z m;
    public static MetricsRecorder n;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a ac;

    /* renamed from: b, reason: from kotlin metadata */
    public final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());

    /* renamed from: c, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l storeInstallerImpl;

    /* renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;
    public static final MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public static WeakReference<VastActivity> h = new WeakReference<>(null);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2", f = "VastActivity.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a, reason: collision with other inner class name */
        public static final class C1574a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11212a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a b;
            public final /* synthetic */ y c;
            public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> d;
            public final /* synthetic */ Context e;
            public final /* synthetic */ String f;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a, reason: collision with other inner class name */
            public static final class C1575a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11213a;
                public /* synthetic */ Object b;
                public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> c;
                public final /* synthetic */ Context d;
                public final /* synthetic */ y e;
                public final /* synthetic */ String f;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1", f = "VastActivity.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C1576a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f11214a;
                    public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> b;

                    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$1", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C1577a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        public int f11215a;
                        public /* synthetic */ Object b;
                        public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C1577a(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Continuation<? super C1577a> continuation) {
                            super(2, continuation);
                            this.c = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation<? super Unit> continuation) {
                            return ((C1577a) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1577a c1577a = new C1577a(this.c, continuation);
                            c1577a.b = obj;
                            return c1577a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f11215a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.c.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b);
                            return Unit.INSTANCE;
                        }
                    }

                    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$2", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$b */
                    public static final class b extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Boolean>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        public int f11216a;
                        public /* synthetic */ Object b;

                        public b(Continuation<? super b> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation<? super Boolean> continuation) {
                            return ((b) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            b bVar = new b(continuation);
                            bVar.b = obj;
                            return bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.f11216a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(VastActivity.INSTANCE.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C1576a(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Continuation<? super C1576a> continuation) {
                        super(2, continuation);
                        this.b = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C1576a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1576a(this.b, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f11214a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Flow onEach = FlowKt.onEach(VastActivity.g, new C1577a(this.b, null));
                            b bVar = new b(null);
                            this.f11214a = 1;
                            if (FlowKt.firstOrNull(onEach, bVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$2", f = "VastActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$b */
                public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f11217a;
                    public final /* synthetic */ Context b;
                    public final /* synthetic */ y c;
                    public final /* synthetic */ String d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Context context, y yVar, String str, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.b = context;
                        this.c = yVar;
                        this.d = str;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new b(this.b, this.c, this.d, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Boolean forceFullScreen;
                        String clickthroughUrl;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.f11217a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Context context = this.b;
                        Intent intent = new Intent(this.b, (Class<?>) VastActivity.class);
                        y yVar = this.c;
                        String str = this.d;
                        x.g(intent, yVar.j());
                        x.a(intent, yVar.f());
                        x.b(intent, yVar.g());
                        x.a(intent, yVar.h());
                        x.c(intent, yVar.i());
                        x.f(intent, yVar.e());
                        x.e(intent, yVar.d());
                        C4778a b = yVar.b();
                        if (b != null) {
                            x.d(intent, b.getEnabled());
                        }
                        C4778a b2 = yVar.b();
                        if (b2 != null) {
                            x.c(intent, b2.getUrl());
                        }
                        if (yVar.c() != null) {
                            x.a(intent, true);
                        }
                        C4779b c = yVar.c();
                        if (c != null) {
                            x.c(intent, c.getOnSkip());
                        }
                        C4779b c2 = yVar.c();
                        if (c2 != null) {
                            x.b(intent, c2.getEventLink());
                        }
                        C4779b c3 = yVar.c();
                        if (c3 != null && (clickthroughUrl = c3.getClickthroughUrl()) != null) {
                            x.a(intent, clickthroughUrl);
                        }
                        C4779b c4 = yVar.c();
                        if (c4 != null && (forceFullScreen = c4.getForceFullScreen()) != null) {
                            x.b(intent, forceFullScreen.booleanValue());
                        }
                        if (str != null) {
                            x.d(intent, str);
                        }
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1575a(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Context context, y yVar, String str, Continuation<? super C1575a> continuation) {
                    super(2, continuation);
                    this.c = function1;
                    this.d = context;
                    this.e = yVar;
                    this.f = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
                    return ((C1575a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1575a c1575a = new C1575a(this.c, this.d, this.e, this.f, continuation);
                    c1575a.b = obj;
                    return c1575a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Job launch$default;
                    Job launch$default2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11213a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    Companion companion = VastActivity.INSTANCE;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1576a(this.c, null), 3, null);
                    VastActivity.l = launch$default;
                    launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(this.d, this.e, this.f, null), 3, null);
                    return launch$default2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1574a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, y yVar, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Context context, String str, Continuation<? super C1574a> continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = yVar;
                this.d = function1;
                this.e = context;
                this.f = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
                return ((C1574a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1574a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f11212a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Companion companion = VastActivity.INSTANCE;
                        VastActivity.i = this.b;
                        VastActivity.j = this.c.k();
                        C1575a c1575a = new C1575a(this.d, this.e, this.c, this.f, null);
                        this.f11212a = 1;
                        obj = CoroutineScopeKt.coroutineScope(c1575a, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (Job) obj;
                } finally {
                    Companion companion2 = VastActivity.INSTANCE;
                    VastActivity b = companion2.b();
                    if (b != null) {
                        b.finish();
                    }
                    VastActivity.k = null;
                    VastActivity.i = null;
                    VastActivity.n = null;
                    VastActivity.j = null;
                    companion2.a();
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final VastActivity b() {
            return (VastActivity) VastActivity.h.get();
        }

        public final void a(VastActivity vastActivity) {
            VastActivity.h = new WeakReference(vastActivity);
            if (vastActivity == null) {
                a();
            }
        }

        public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Context context, y yVar, Function0<Unit> function0, z zVar, String str, MetricsRecorder metricsRecorder, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Unit> function1, Continuation<? super Unit> continuation) {
            VastActivity.m = zVar;
            VastActivity.k = function0;
            VastActivity.n = metricsRecorder;
            Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new C1574a(aVar, yVar, function1, context, str, null), continuation);
            return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
        }

        public final void a() {
            Job job = VastActivity.l;
            if (job == null || !job.isActive()) {
                return;
            }
            Job job2 = VastActivity.l;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            VastActivity.l = null;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return (bVar instanceof b.f) || Intrinsics.areEqual(bVar, b.e.b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$onComposeDependencyMissing$1", f = "VastActivity.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11218a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11218a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = VastActivity.g;
                b.f fVar = new b.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.b);
                this.f11218a = 1;
                if (mutableSharedFlow.emit(fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$onCreate$1", f = "VastActivity.kt", i = {0}, l = {TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11219a;
        public /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation<? super Unit> continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = VastActivity.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11219a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, VastActivity.f, "VastActivity received event: " + bVar2, null, false, 12, null);
                MutableSharedFlow mutableSharedFlow = VastActivity.g;
                this.b = bVar2;
                this.f11219a = 1;
                if (mutableSharedFlow.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                ResultKt.throwOnFailure(obj);
            }
            if (VastActivity.INSTANCE.a(bVar)) {
                VastActivity.this.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b;
        public final /* synthetic */ Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> function2) {
            this.b = aVar;
            this.c = function2;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-369589045, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.onCreate.<anonymous> (VastActivity.kt:181)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(VastActivity.this, this.b, this.c, VastActivity.m, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a2;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        ForegroundMonitor foregroundMonitor = ForegroundMonitor.f11157a;
        foregroundMonitor.a();
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                VastActivity.a(VastActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        r f2 = a.h.f10873a.f();
        this.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m(this, registerForActivityResult, LifecycleOwnerKt.getLifecycleScope(this), foregroundMonitor.b(), 0L, null, null, 112, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean f3 = x.f(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        boolean b2 = x.b(intent2);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        boolean e2 = x.e(intent3);
        Intent intent4 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        boolean d2 = x.d(intent4);
        Intent intent5 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
        String a3 = x.a(intent5);
        Intent intent6 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(f3, b2, e2, d2, a3, x.c(intent6), n);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar2 = this.storeInstallerImpl;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        } else {
            lVar = lVar2;
        }
        Intent intent7 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
        String j2 = x.j(intent7);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d();
        Intent intent8 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
        boolean f4 = x.f(intent8);
        Intent intent9 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(f4, x.g(intent9));
        Intent intent10 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
        boolean b3 = x.b(intent10);
        Intent intent11 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
        boolean e3 = x.e(intent11);
        Intent intent12 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
        String c2 = x.c(intent12);
        Intent intent13 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
        String a4 = x.a(intent13);
        Intent intent14 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k a5 = iVar.a(f2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h(lVar, j2, dVar, bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(b3, e3, c2, a4, x.d(intent14)), n));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = i;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> function2 = j;
        if (function2 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b4 = a.k.f10876a.b();
        Intent intent15 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
        boolean o = x.o(intent15);
        Intent intent16 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
        Boolean m2 = x.m(intent16);
        Intent intent17 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
        int n2 = x.n(intent17);
        Intent intent18 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent18, "getIntent(...)");
        int k2 = x.k(intent18);
        Intent intent19 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent19, "getIntent(...)");
        int l2 = x.l(intent19);
        Intent intent20 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent20, "getIntent(...)");
        boolean i2 = x.i(intent20);
        Intent intent21 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent21, "getIntent(...)");
        a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, f2, this, b4, (r28 & 16) != 0 ? true : o, m2, n2, k2, l2, i2, x.h(intent21), (r28 & 2048) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null) : null, a5);
        this.ac = a2;
        INSTANCE.a(this);
        FlowKt.launchIn(FlowKt.onEach(a2.a(), new c(null)), this.scope);
        try {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-369589045, true, new d(a2, function2)), 1, null);
            a2.d();
        } catch (ClassNotFoundException e4) {
            a(e4);
        } catch (NoClassDefFoundError e5) {
            a(e5);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Function0<Unit> function0 = k;
        if (function0 != null) {
            function0.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.ac;
        if (aVar != null) {
            aVar.destroy();
        }
        this.ac = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = this.storeInstallerImpl;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        }
        lVar.cancel();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        INSTANCE.a((VastActivity) null);
    }

    public static final void a(VastActivity vastActivity, ActivityResult activityResult) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultCode=" + activityResult.getResultCode(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultData=" + activityResult.getData(), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = vastActivity.storeInstallerImpl;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        }
        lVar.a(activityResult.getResultCode());
    }

    public final void a(Throwable e2) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f, "Compose dependency not available, cannot show fullscreen VAST ad", e2, false, 8, null);
        MetricsRecorder metricsRecorder = n;
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.f0.c()));
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(null), 3, null);
        finish();
    }
}
