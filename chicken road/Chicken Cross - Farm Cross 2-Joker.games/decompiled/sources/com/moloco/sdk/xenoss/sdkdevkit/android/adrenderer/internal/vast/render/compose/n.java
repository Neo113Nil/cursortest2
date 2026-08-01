package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.vungle.ads.internal.protos.Sdk;
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
public final class n extends FrameLayout {
    public static final b u = new b(null);
    public static final int v = 8;
    public static final CoroutineContext w = com.moloco.sdk.internal.scheduling.b.a().getMain();

    /* renamed from: a, reason: collision with root package name */
    public final Flow<Boolean> f11428a;
    public final Flow<Boolean> b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final DecelerateInterpolator l;
    public Function1<? super Boolean, Unit> m;
    public Function0<Unit> n;
    public Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit> o;
    public boolean p;
    public a.AbstractC1622a.f q;
    public a.AbstractC1622a.g r;
    public CoroutineScope s;
    public final ImageView t;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        public a(Object obj) {
            super(0, obj, n.class, "onIconClick", "onIconClick()V", 0);
        }

        public final void a() {
            ((n) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            return n.w;
        }

        public b() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.MuteButtonView$onAttachedToWindow$1", f = "MuteButton.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11429a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f11430a;

            public a(n nVar) {
                this.f11430a = nVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                n nVar = this.f11430a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(nVar, z, nVar.k, this.f11430a.l, null, 8, null);
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
            return n.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11429a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = n.this.f11428a;
                a aVar = new a(n.this);
                this.f11429a = 1;
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.MuteButtonView$onAttachedToWindow$2", f = "MuteButton.kt", i = {}, l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11431a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f11432a;

            public a(n nVar) {
                this.f11432a = nVar;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                this.f11432a.p = z;
                this.f11432a.t.setImageResource(z ? this.f11432a.d : this.f11432a.e);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
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
            return n.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11431a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = n.this.b;
                a aVar = new a(n.this);
                this.f11431a = 1;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ n(Context context, Flow flow, Flow flow2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, flow, flow2, r6, r7, r8, r9, (i9 & 128) != 0 ? r9 : i5, (i9 & 256) != 0 ? 8388659 : i6, (i9 & 512) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding) : i7, (i9 & 1024) != 0 ? ContextCompat.getColor(context, R.color.moloco_button_background) : i8);
        int a2 = (i9 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.b.a(context) : i;
        int i10 = (i9 & 16) != 0 ? R.drawable.ic_round_volume_off_24 : i2;
        int i11 = (i9 & 32) != 0 ? R.drawable.ic_round_volume_up_24 : i3;
        int dimensionPixelSize = (i9 & 64) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.moloco_mute_button_size) : i4;
    }

    public final Function0<Unit> getExtraOnClick() {
        return this.n;
    }

    public final Function2<a.AbstractC1622a.c, a.AbstractC1622a.c.EnumC1624a, Unit> getOnButtonReplaced() {
        return this.o;
    }

    public final Function1<Boolean, Unit> getOnMuteChange() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CompletableJob Job$default;
        super.onAttachedToWindow();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(w));
        this.s = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new d(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScope coroutineScope = this.s;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.s = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f11199a;
            this.q = new a.AbstractC1622a.f(cVar.a(iArr[0]), cVar.a(iArr[1]));
            this.r = new a.AbstractC1622a.g(cVar.a(i3 - i), cVar.a(i4 - i2));
            a.AbstractC1622a.c.EnumC1624a enumC1624a = this.p ? a.AbstractC1622a.c.EnumC1624a.f : a.AbstractC1622a.c.EnumC1624a.e;
            Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit> function2 = this.o;
            if (function2 != null) {
                function2.invoke(new a.AbstractC1622a.c(enumC1624a, this.q, this.r), enumC1624a);
            }
        }
    }

    public final void setExtraOnClick(Function0<Unit> function0) {
        this.n = function0;
    }

    public final void setOnButtonReplaced(Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit> function2) {
        this.o = function2;
    }

    public final void setOnMuteChange(Function1<? super Boolean, Unit> function1) {
        this.m = function1;
    }

    public final void b() {
        boolean z = this.p;
        boolean z2 = !z;
        Function1<? super Boolean, Unit> function1 = this.m;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        a.AbstractC1622a.c.EnumC1624a enumC1624a = !z ? a.AbstractC1622a.c.EnumC1624a.f : a.AbstractC1622a.c.EnumC1624a.e;
        a.AbstractC1622a.c.EnumC1624a enumC1624a2 = this.p ? a.AbstractC1622a.c.EnumC1624a.f : a.AbstractC1622a.c.EnumC1624a.e;
        Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit> function2 = this.o;
        if (function2 != null) {
            function2.invoke(new a.AbstractC1622a.c(enumC1624a, this.q, this.r), enumC1624a2);
        }
        Function0<Unit> function0 = this.n;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final WindowInsetsCompat a(View v2, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v2, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        v2.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
        return insets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, Flow<Boolean> isPlayerPlaying, Flow<Boolean> mute, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlayerPlaying, "isPlayerPlaying");
        Intrinsics.checkNotNullParameter(mute, "mute");
        this.f11428a = isPlayerPlaying;
        this.b = mute;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = getResources().getInteger(R.integer.moloco_animated_visibility_fade_duration_ms);
        this.l = new DecelerateInterpolator();
        this.q = new a.AbstractC1622a.f(0.0f, 0.0f);
        this.r = new a.AbstractC1622a.g(0.0f, 0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4, i6);
        layoutParams.setMargins(i7, i7, i7, i7);
        setLayoutParams(layoutParams);
        setVisibility(8);
        setAlpha(0.0f);
        CharSequence string = context.getString(R.string.moloco_mute_button_content_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        setContentDescription(string);
        setTag(string);
        ImageView a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.a(context, i3, i, i4, i5, false, context.getString(R.string.moloco_mute_button_icon_content_description), Integer.valueOf(i8), new a(this), 32, null);
        this.t = a2;
        addView(a2);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return n.a(view, windowInsetsCompat);
            }
        });
    }
}
