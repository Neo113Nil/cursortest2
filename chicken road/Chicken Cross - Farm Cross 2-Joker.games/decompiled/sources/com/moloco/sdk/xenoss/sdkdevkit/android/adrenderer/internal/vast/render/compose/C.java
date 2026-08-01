package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class C extends FrameLayout {
    public static final a o = new a(null);
    public static final int p = 8;
    public static final CoroutineContext q = com.moloco.sdk.internal.scheduling.b.a().getMain();

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f11379a;
    public final boolean b;
    public final Q c;
    public final b d;
    public Function1<? super Boolean, Unit> e;
    public Function1<? super Boolean, Unit> f;
    public Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit> g;
    public Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> h;
    public String i;
    public long j;
    public boolean k;
    public boolean l;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f m;
    public CoroutineScope n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            return C.q;
        }

        public a() {
        }
    }

    public interface b {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f a(Lifecycle lifecycle);
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$2", f = "VastVideoPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11380a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f b;
        public final /* synthetic */ C c;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C f11381a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f b;

            public a(C c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar) {
                this.f11381a = c;
                this.b = fVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar, Continuation<? super Unit> continuation) {
                Function1<Boolean, Unit> onIsPlaying = this.f11381a.getOnIsPlaying();
                if (onIsPlaying != null) {
                    onIsPlaying.invoke(Boxing.boxBoolean(bVar.e()));
                }
                Function1<Boolean, Unit> onIsVisible = this.f11381a.getOnIsVisible();
                if (onIsVisible != null) {
                    onIsVisible.invoke(Boxing.boxBoolean(bVar.f()));
                }
                View R = this.b.R();
                if (R != null) {
                    R.setKeepScreenOn(bVar.d());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar, C c, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = fVar;
            this.c = c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11380a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> isPlaying = this.b.isPlaying();
                a aVar = new a(this.c, this.b);
                this.f11380a = 1;
                if (isPlaying.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$3", f = "VastVideoPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11382a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f b;
        public final /* synthetic */ C c;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C f11383a;

            public a(C c) {
                this.f11383a = c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation<? super Unit> continuation) {
                Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit> onProgressChanged = this.f11383a.getOnProgressChanged();
                if (onProgressChanged != null) {
                    onProgressChanged.invoke(iVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar, C c, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = fVar;
            this.c = c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11382a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> p = this.b.p();
                a aVar = new a(this.c);
                this.f11382a = 1;
                if (p.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$4", f = "VastVideoPlayer.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11384a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f b;
        public final /* synthetic */ C c;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C f11385a;

            public a(C c) {
                this.f11385a = c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, Continuation<? super Unit> continuation) {
                Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> onError = this.f11385a.getOnError();
                if (onError != null) {
                    onError.invoke(lVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar, C c, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = fVar;
            this.c = c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11384a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow filterNotNull = FlowKt.filterNotNull(this.b.f());
                a aVar = new a(this.c);
                this.f11384a = 1;
                if (filterNotNull.collect(aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerView$onAttachedToWindow$6", f = "VastVideoPlayer.kt", i = {0, 1}, l = {339, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS}, m = "invokeSuspend", n = {"view", "view"}, s = {"L$0", "L$0"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f11386a;
        public int b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            View R;
            View view;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                R = this.c.R();
                if (R == null) {
                    return Unit.INSTANCE;
                }
                R.setVisibility(4);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = this.c;
                this.f11386a = R;
                this.b = 1;
                if (fVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    view = (View) this.f11386a;
                    ResultKt.throwOnFailure(obj);
                    view.setVisibility(4);
                    view.setVisibility(0);
                    return Unit.INSTANCE;
                }
                View view2 = (View) this.f11386a;
                ResultKt.throwOnFailure(obj);
                R = view2;
            }
            R.setVisibility(0);
            this.f11386a = R;
            this.b = 2;
            if (DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            view = R;
            view.setVisibility(4);
            view.setVisibility(0);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C(Context context, Lifecycle lifecycle, boolean z, Q q2, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, lifecycle, z, q2, (i & 16) != 0 ? new i(context, z, q2) : bVar);
    }

    public static /* synthetic */ void getVideoPlayer$moloco_sdk_release$annotations() {
    }

    public final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> getOnError() {
        return this.h;
    }

    public final Function1<Boolean, Unit> getOnIsPlaying() {
        return this.e;
    }

    public final Function1<Boolean, Unit> getOnIsVisible() {
        return this.f;
    }

    public final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit> getOnProgressChanged() {
        return this.g;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f getVideoPlayer$moloco_sdk_release() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f a2 = this.d.a(this.f11379a);
        this.m = a2;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(q));
        this.n = CoroutineScope;
        View R = a2.R();
        if (R != null) {
            addView(R, new ViewGroup.LayoutParams(-1, -1));
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(a2, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new d(a2, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new e(a2, this, null), 3, null);
        String str = this.i;
        if (str != null) {
            a2.a(str);
        }
        a2.seekTo(this.j);
        if (this.k) {
            a2.play();
        } else {
            a2.pause();
        }
        a2.b(this.l);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new f(a2, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.n;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.n = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = this.m;
        if (fVar != null) {
            fVar.destroy();
        }
        this.m = null;
        removeAllViews();
        Function1<? super Boolean, Unit> function1 = this.e;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    public final void setMute(boolean z) {
        this.l = z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = this.m;
        if (fVar != null) {
            fVar.b(z);
        }
    }

    public final void setOnError(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> function1) {
        this.h = function1;
    }

    public final void setOnIsPlaying(Function1<? super Boolean, Unit> function1) {
        this.e = function1;
    }

    public final void setOnIsVisible(Function1<? super Boolean, Unit> function1) {
        this.f = function1;
    }

    public final void setOnProgressChanged(Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Unit> function1) {
        this.g = function1;
    }

    public final void setPlay(boolean z) {
        this.k = z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = this.m;
        if (fVar != null) {
            if (z) {
                fVar.play();
            } else {
                fVar.pause();
            }
        }
    }

    public final void setUri(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.i = uri;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = this.m;
        if (fVar != null) {
            fVar.a(uri);
            fVar.seekTo(this.j);
            if (this.k) {
                fVar.play();
            } else {
                fVar.pause();
            }
            fVar.b(this.l);
        }
    }

    public final void a(long j) {
        this.j = j;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = this.m;
        if (fVar != null) {
            fVar.seekTo(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Context context, Lifecycle lifecycle, boolean z, Q viewVisibilityTracker, b videoPlayerFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(videoPlayerFactory, "videoPlayerFactory");
        this.f11379a = lifecycle;
        this.b = z;
        this.c = viewVisibilityTracker;
        this.d = videoPlayerFactory;
        this.k = true;
    }
}
