package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class w extends View {
    public static final a p = new a(null);
    public static final int q = 8;
    public static final CoroutineContext r = com.moloco.sdk.internal.scheduling.b.a().getMain();

    /* renamed from: a, reason: collision with root package name */
    public final Flow<Boolean> f11458a;
    public final Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> b;
    public final int c;
    public final int d;
    public final Paint e;
    public final float f;
    public final long g;
    public final DecelerateInterpolator h;
    public float i;
    public float j;
    public ValueAnimator k;
    public CoroutineScope l;
    public boolean m;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i n;
    public Boolean o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            return w.r;
        }

        public a() {
        }
    }

    public static final class b extends View.BaseSavedState {

        /* renamed from: a, reason: collision with root package name */
        public float f11459a;
        public static final C1605b b = new C1605b(null);
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w$b$b, reason: collision with other inner class name */
        public static final class C1605b {
            public /* synthetic */ C1605b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C1605b() {
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final float a() {
            return this.f11459a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, i);
            out.writeFloat(this.f11459a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Parcel parcel) {
            super(parcel);
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f11459a = parcel.readFloat();
        }

        public final void a(float f) {
            this.f11459a = f;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastProgressBarView$onAttachedToWindow$1", f = "VastProgressBar.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11460a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w f11461a;

            public a(w wVar) {
                this.f11461a = wVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                this.f11461a.m = z;
                this.f11461a.b();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11460a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = w.this.f11458a;
                a aVar = new a(w.this);
                this.f11460a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastProgressBarView$onAttachedToWindow$2", f = "VastProgressBar.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11462a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w f11463a;

            public a(w wVar) {
                this.f11463a = wVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation<? super Unit> continuation) {
                this.f11463a.n = iVar;
                this.f11463a.b();
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11462a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = w.this.b;
                a aVar = new a(w.this);
                this.f11462a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    public /* synthetic */ w(Context context, Flow flow, Flow flow2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, flow, flow2, (i4 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a(context) : i, (i4 & 16) != 0 ? 81 : i2, (i4 & 32) != 0 ? 0 : i3);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(r));
        this.l = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new d(null), 3, null);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.k = null;
        CoroutineScope coroutineScope = this.l;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.l = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = this.i * getWidth();
        float height = getHeight();
        float f = this.f;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.e);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.j = bVar.a();
        this.i = bVar.a();
        invalidate();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.a(this.j);
        return bVar;
    }

    public final void setBarColor(int i) {
        this.e.setColor(i);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) r0).c() > 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        float c2;
        ValueAnimator valueAnimator;
        if (!this.m) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = this.n;
            if (iVar instanceof i.c) {
                Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PlaybackProgress.Position");
            }
            z = false;
            if (!Intrinsics.areEqual(Boolean.valueOf(z), this.o)) {
                this.o = Boolean.valueOf(z);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(this, z, this.g, this.h, null, 8, null);
            }
            c2 = v.c(this.n);
            float max = Math.max(c2, this.j);
            valueAnimator = this.k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.i = max;
            this.j = max;
            invalidate();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar2 = this.n;
            if (this.m || !(iVar2 instanceof i.c)) {
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 1.0f);
            ofFloat.setDuration(v.d(iVar2));
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    w.a(w.this, valueAnimator2);
                }
            });
            ofFloat.start();
            this.k = ofFloat;
            return;
        }
        z = true;
        if (!Intrinsics.areEqual(Boolean.valueOf(z), this.o)) {
        }
        c2 = v.c(this.n);
        float max2 = Math.max(c2, this.j);
        valueAnimator = this.k;
        if (valueAnimator != null) {
        }
        this.i = max2;
        this.j = max2;
        invalidate();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar22 = this.n;
        if (this.m) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(Context context, Flow<Boolean> isPlaying, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> progress, int i, int i2, int i3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f11458a = isPlaying;
        this.b = progress;
        this.c = i2;
        this.d = i3;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.e = paint;
        this.f = getResources().getDimension(R.dimen.moloco_vast_progress_bar_corner_radius);
        this.g = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.h = new DecelerateInterpolator();
        setId(R.id.moloco_vast_progress_bar_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.moloco_vast_progress_bar_height), i2);
        layoutParams.setMargins(i3, i3, i3, i3);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(0.0f);
        this.n = i.b.b;
    }

    public static final void a(w wVar, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        wVar.i = floatValue;
        wVar.j = floatValue;
        wVar.invalidate();
    }
}
