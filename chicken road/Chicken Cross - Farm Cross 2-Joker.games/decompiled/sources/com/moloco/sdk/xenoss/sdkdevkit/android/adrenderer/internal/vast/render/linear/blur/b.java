package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class b extends FrameLayout {
    public static final a r = new a(null);
    public static final int s = 8;

    @Deprecated
    public static final String t = "BlurredVideoBg";

    @Deprecated
    public static final float u = 40.0f;

    /* renamed from: a, reason: collision with root package name */
    public final String f11512a;
    public final int b;
    public final int c;
    public final float d;
    public final Function0<f> e;
    public final Function0<Long> f;
    public final StateFlow<Boolean> g;
    public final float h;
    public final CoroutineContext i;
    public TextureView j;
    public f k;
    public CoroutineScope l;
    public Runnable m;
    public boolean n;
    public long o;
    public Boolean p;
    public boolean q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.BlurredVideoBackgroundView$launchForegroundFollow$1", f = "BlurredVideoBackgroundView.kt", i = {}, l = {295, 299}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b$b, reason: collision with other inner class name */
    public static final class C1609b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11513a;
        public final /* synthetic */ f b;
        public final /* synthetic */ b c;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b$b$a */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f11514a;
            public final /* synthetic */ f b;

            public a(b bVar, f fVar) {
                this.f11514a = bVar;
                this.b = fVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                this.f11514a.p = Boxing.boxBoolean(z);
                if (z) {
                    this.f11514a.a(this.b);
                }
                this.f11514a.a();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1609b(f fVar, b bVar, Continuation<? super C1609b> continuation) {
            super(2, continuation);
            this.b = fVar;
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1609b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1609b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11513a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = this.b;
                this.f11513a = 1;
                if (fVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            }
            this.c.q = true;
            StateFlow stateFlow = this.c.g;
            if (stateFlow == null) {
                this.c.a();
                return Unit.INSTANCE;
            }
            a aVar = new a(this.c, this.b);
            this.f11513a = 2;
            if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        }
    }

    public /* synthetic */ b(Context context, String str, int i, int i2, float f, Function0 function0, Function0 function02, StateFlow stateFlow, float f2, CoroutineContext coroutineContext, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, i, i2, f, (i3 & 32) != 0 ? null : function0, (i3 & 64) != 0 ? null : function02, (i3 & 128) != 0 ? null : stateFlow, (i3 & 256) != 0 ? 40.0f : f2, (i3 & 512) != 0 ? com.moloco.sdk.internal.scheduling.b.a().getMainImmediate() : coroutineContext);
    }

    public static /* synthetic */ void getLiveVideoPlayer$moloco_sdk_release$annotations() {
    }

    public final boolean c() {
        return this.m != null;
    }

    public final boolean d() {
        return this.q;
    }

    public final void e() {
        this.n = false;
        a();
    }

    public final long f() {
        return this.o;
    }

    public final void g() {
        this.n = true;
        a();
    }

    public final f getLiveVideoPlayer$moloco_sdk_release() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.l = CoroutineScopeKt.CoroutineScope(Job$default.plus(this.i));
        a(this, 0, 0, 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.m;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.m = null;
        CoroutineScope coroutineScope = this.l;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.l = null;
        f fVar = this.k;
        if (fVar != null) {
            fVar.destroy();
        }
        this.k = null;
        TextureView textureView = this.j;
        if (textureView != null) {
            removeView(textureView);
        }
        this.j = null;
        this.q = false;
        this.p = null;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
    }

    public static final void c(b bVar) {
        bVar.m = null;
        bVar.b();
    }

    public final void b() {
        if (isAttachedToWindow() && this.k == null) {
            Function0<f> function0 = this.e;
            f invoke = function0 != null ? function0.invoke() : null;
            if (invoke == null) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, t, "[blur] no live factory — gap stays black (API < 31?)", null, false, 12, null);
                return;
            }
            this.k = invoke;
            TextureView b = b(invoke);
            if (b == null) {
                return;
            }
            this.j = b;
            invoke.a(this.f11512a);
            invoke.seekTo(this.o);
            a();
            c(invoke);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, String liveVideoUri, int i, int i2, float f, Function0<? extends f> function0, Function0<Long> function02, StateFlow<Boolean> stateFlow, float f2, CoroutineContext dispatcher) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(liveVideoUri, "liveVideoUri");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f11512a = liveVideoUri;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = function0;
        this.f = function02;
        this.g = stateFlow;
        this.h = f2;
        this.i = dispatcher;
        this.n = true;
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
        setVisibility(4);
    }

    public final void c(f fVar) {
        CoroutineScope coroutineScope = this.l;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1609b(fVar, this, null), 3, null);
        }
    }

    public final void a() {
        f fVar = this.k;
        if (fVar == null) {
            return;
        }
        Boolean bool = this.p;
        if ((bool != null ? bool.booleanValue() : this.n) && this.q) {
            fVar.play();
        } else {
            fVar.pause();
        }
    }

    public final void a(long j) {
        this.o = j;
        f fVar = this.k;
        if (fVar != null) {
            fVar.seekTo(j);
        }
    }

    public static /* synthetic */ void a(b bVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bVar.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = bVar.getHeight();
        }
        bVar.a(i, i2);
    }

    public final void a(int i, int i2) {
        int i3;
        int i4;
        if (i != 0 && i2 != 0 && (i3 = this.b) != 0 && (i4 = this.c) != 0) {
            float a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a.f11511a.a(i3, i4, i, i2);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, t, "[blur] gate: view=" + i + 'x' + i2 + " creative=" + this.b + 'x' + this.c + " gap=" + a2 + " threshold=" + this.d + " show=" + (a2 > this.d), null, false, 12, null);
            if (a2 > this.d) {
                setVisibility(0);
                if (this.k == null) {
                    if (this.m == null) {
                        Runnable runnable = new Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.b$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.c(b.this);
                            }
                        };
                        this.m = runnable;
                        post(runnable);
                        return;
                    }
                    return;
                }
                TextureView textureView = this.j;
                if (textureView != null) {
                    a(textureView, this.b, this.c);
                    a(textureView);
                    return;
                }
                return;
            }
            setVisibility(4);
            Runnable runnable2 = this.m;
            if (runnable2 != null) {
                removeCallbacks(runnable2);
                this.m = null;
                return;
            }
            return;
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, t, "[blur] gate skipped — dimensions not ready (view=" + i + 'x' + i2 + " creative=" + this.b + 'x' + this.c + ')', null, false, 12, null);
    }

    public final TextureView b(f fVar) {
        View R = fVar.R();
        TextureView textureView = R instanceof TextureView ? (TextureView) R : null;
        if (textureView == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, t, "[blur] live player has no TextureView — gap stays black", null, false, 12, null);
            return null;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("[blur] bringing up live layer (api=");
        int i = Build.VERSION.SDK_INT;
        MolocoLogger.info$default(molocoLogger, t, sb.append(i).append(')').toString(), null, false, 12, null);
        if (i >= 31) {
            float f = this.h;
            textureView.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
        }
        textureView.setAlpha(1.0f);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        a(textureView, this.b, this.c);
        a(textureView);
        return textureView;
    }

    public final void a(View view) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        view.layout(0, 0, width, height);
    }

    public final void a(f fVar) {
        Function0<Long> function0 = this.f;
        if (function0 != null) {
            fVar.seekTo(function0.invoke().longValue());
        }
    }

    public final void a(TextureView textureView, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || i <= 0 || i2 <= 0) {
            return;
        }
        float f = width;
        float f2 = i;
        float f3 = height;
        float f4 = i2;
        float max = Math.max(f / f2, f3 / f4);
        Matrix matrix = new Matrix();
        matrix.setScale((f2 * max) / f, (f4 * max) / f3, f / 2.0f, f3 / 2.0f);
        textureView.setTransform(matrix);
    }
}
