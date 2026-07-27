package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
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
public final class q extends FrameLayout {
    public static final a l = new a(null);
    public static final int m = 8;
    public static final CoroutineContext n = com.moloco.sdk.internal.scheduling.b.a().getMain();

    /* renamed from: a, reason: collision with root package name */
    public final Flow<Boolean> f11436a;
    public final Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> b;
    public final int c;
    public Function1<? super Boolean, Unit> d;
    public Function0<Unit> e;
    public final View f;
    public final View g;
    public final long h;
    public boolean i;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i j;
    public CoroutineScope k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            return q.n;
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        public b(Object obj) {
            super(0, obj, q.class, "handleTap", "handleTap()V", 0);
        }

        public final void a() {
            ((q) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.PlaybackControlView$onAttachedToWindow$1", f = "PlaybackControl.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11437a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f11438a;

            public a(q qVar) {
                this.f11438a = qVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                this.f11438a.i = z;
                this.f11438a.a(z);
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
            return q.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11437a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = q.this.f11436a;
                a aVar = new a(q.this);
                this.f11437a = 1;
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.PlaybackControlView$onAttachedToWindow$2", f = "PlaybackControl.kt", i = {}, l = {ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11439a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f11440a;

            public a(q qVar) {
                this.f11440a = qVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation<? super Unit> continuation) {
                this.f11440a.j = iVar;
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
            return q.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11439a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = q.this.b;
                a aVar = new a(q.this);
                this.f11439a = 1;
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

    public /* synthetic */ q(Context context, Flow flow, Flow flow2, int i, int i2, Integer num, Integer num2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, flow, flow2, (i3 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a(context) : i, (i3 & 16) != 0 ? 81 : i2, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : num2, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? null : str2);
    }

    public final Function1<Boolean, Unit> getOnShouldPlay() {
        return this.d;
    }

    public final Function0<Unit> getOnShouldReplay() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(n));
        this.k = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new d(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.k;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.k = null;
    }

    public final void setOnShouldPlay(Function1<? super Boolean, Unit> function1) {
        this.d = function1;
    }

    public final void setOnShouldReplay(Function0<Unit> function0) {
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Context context, Flow<Boolean> isPlaying, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> progress, int i, int i2, Integer num, Integer num2, String str, String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f11436a = isPlaying;
        this.b = progress;
        this.c = i2;
        this.h = getResources().getInteger(R.integer.moloco_playback_control_fade_duration_ms);
        this.j = i.b.b;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, i2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_playback_control_padding);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.moloco_playback_control_horizontal_padding);
        boolean z = (num == null || num2 == null) ? false : true;
        if (z) {
            Intrinsics.checkNotNull(num);
            this.f = a(num.intValue(), i, str);
            Intrinsics.checkNotNull(num2);
            this.g = a(num2.intValue(), i, str);
        } else {
            this.f = a(R.string.moloco_playback_control_play, i, dimensionPixelSize2, dimensionPixelSize);
            this.g = a(R.string.moloco_playback_control_pause, i, dimensionPixelSize2, dimensionPixelSize);
        }
        this.g.setAlpha(0.0f);
        addView(this.f, a(z, this, dimensionPixelSize));
        addView(this.g, a(z, this, dimensionPixelSize));
        if (str2 != null) {
            setContentDescription(str2);
            setTag(str2);
        }
    }

    public final void b() {
        if (this.j instanceof i.a) {
            Function0<Unit> function0 = this.e;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Function1<? super Boolean, Unit> function1 = this.d;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(!this.i));
        }
    }

    public static final FrameLayout.LayoutParams a(boolean z, q qVar, int i) {
        if (z) {
            int dimensionPixelSize = qVar.getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 81);
            layoutParams.setMargins(i, i, i, i);
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams2.setMargins(i, i, i, i);
        return layoutParams2;
    }

    public final TextView a(int i, int i2, int i3, int i4) {
        TextView textView = new TextView(getContext());
        textView.setText(textView.getContext().getString(i));
        textView.setAllCaps(true);
        textView.setTextColor(i2);
        textView.setPadding(i3, i4, i3, i4);
        a(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.a(q.this, view);
            }
        });
        return textView;
    }

    public static final void a(q qVar, View view) {
        qVar.b();
    }

    public final ImageView a(int i, int i2, String str) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.a(context, i, i2, dimensionPixelSize, dimensionPixelSize, false, str, null, new b(this), 32, null);
    }

    public final void a(View view) {
        view.setClickable(true);
        view.setFocusable(true);
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        view.setBackground(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
    }

    public final void a(boolean z) {
        View view = z ? this.g : this.f;
        View view2 = z ? this.f : this.g;
        view.bringToFront();
        view.animate().alpha(1.0f).setDuration(this.h).start();
        view2.animate().alpha(0.0f).setDuration(this.h).start();
    }
}
