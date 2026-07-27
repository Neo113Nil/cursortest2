package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class k extends FrameLayout {
    public static final a j = new a(null);
    public static final int k = 8;
    public static final CoroutineContext l = com.moloco.sdk.internal.scheduling.b.a().getMainImmediate();

    /* renamed from: a, reason: collision with root package name */
    public final Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> f11417a;
    public final int b;
    public final int c;
    public Function0<Unit> d;
    public Function0<Unit> e;
    public CoroutineScope f;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j g;
    public final long h;
    public final DecelerateInterpolator i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            return k.l;
        }

        public a() {
        }
    }

    public /* synthetic */ k(Context context, Flow flow, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, flow, (i3 & 4) != 0 ? 8388691 : i, (i3 & 8) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding) : i2);
    }

    public final Function0<Unit> getOnClick() {
        return this.e;
    }

    public final Function0<Unit> getOnDisplayed() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(l));
        this.f = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new b(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.f;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f = null;
    }

    public final void setOnClick(Function0<Unit> function0) {
        this.e = function0;
    }

    public final void setOnDisplayed(Function0<Unit> function0) {
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> vastPrivacyIcon, int i, int i2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastPrivacyIcon, "vastPrivacyIcon");
        this.f11417a = vastPrivacyIcon;
        this.b = i;
        this.c = i2;
        this.h = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.i = new DecelerateInterpolator();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, i);
        layoutParams.setMargins(i2, i2, i2, i2);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(0.0f);
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearVastIconView$onAttachedToWindow$1", f = "Linear.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11418a;

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
            return k.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11418a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = k.this.f11417a;
                a aVar = new a(k.this);
                this.f11418a = 1;
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

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f11419a;

            public a(k kVar) {
                this.f11419a = kVar;
            }

            public static final Unit b(k kVar) {
                Function0<Unit> onClick = kVar.getOnClick();
                if (onClick != null) {
                    onClick.invoke();
                }
                return Unit.INSTANCE;
            }

            public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation<? super Unit> continuation) {
                if (Intrinsics.areEqual(jVar, this.f11419a.g)) {
                    return Unit.INSTANCE;
                }
                this.f11419a.g = jVar;
                if (jVar == null) {
                    final View childAt = this.f11419a.getChildCount() > 0 ? this.f11419a.getChildAt(0) : null;
                    k kVar = this.f11419a;
                    long j = kVar.h;
                    DecelerateInterpolator decelerateInterpolator = this.f11419a.i;
                    final k kVar2 = this.f11419a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(kVar, false, j, decelerateInterpolator, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$b$a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return k.b.a.a(childAt, kVar2);
                        }
                    });
                } else {
                    this.f11419a.removeAllViews();
                    k kVar3 = this.f11419a;
                    Context context = this.f11419a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    final k kVar4 = this.f11419a;
                    Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$b$a$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return k.b.a.a(k.this);
                        }
                    };
                    final k kVar5 = this.f11419a;
                    kVar3.addView(new u(context, jVar, function0, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k$b$a$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return k.b.a.b(k.this);
                        }
                    }));
                    k kVar6 = this.f11419a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(kVar6, true, kVar6.h, this.f11419a.i, null, 8, null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) obj, (Continuation<? super Unit>) continuation);
            }

            public static final Unit a(View view, k kVar) {
                if (view != null && view.getParent() == kVar) {
                    kVar.removeView(view);
                }
                return Unit.INSTANCE;
            }

            public static final Unit a(k kVar) {
                Function0<Unit> onDisplayed = kVar.getOnDisplayed();
                if (onDisplayed != null) {
                    onDisplayed.invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }
}
