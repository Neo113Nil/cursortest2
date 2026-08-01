package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public abstract class C<T extends e> extends FrameLayout implements k, InterfaceC4812b, InterfaceC4811a, l {
    public static final a g = new a(null);
    public static final int h = 8;
    public static final String i = "XenossBannerView";

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f10879a;
    public T b;
    public View c;
    public final Lazy d;
    public final MutableStateFlow<Boolean> e;
    public final Lazy f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$isAdDisplaying$2$1", f = "XenossBannerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10880a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            b bVar = new b(continuation);
            bVar.b = z;
            bVar.c = z2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10880a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1", f = "XenossBannerView.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10881a;
        public final /* synthetic */ C<T> b;
        public final /* synthetic */ long c;
        public final /* synthetic */ InterfaceC4812b.a d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1$1", f = "XenossBannerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10882a;
            public /* synthetic */ boolean b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation<? super Boolean> continuation) {
                return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10882a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C<T> c, long j, InterfaceC4812b.a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = c;
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10881a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.getAdLoader().a(this.c, this.d);
                StateFlow<Boolean> isLoaded = this.b.isLoaded();
                a aVar = new a(null);
                this.f10881a = 1;
                if (FlowKt.first(isLoaded, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.b.k();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Context context, CoroutineScope scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f10879a = scope;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.b(C.this);
            }
        });
        this.e = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.a(C.this);
            }
        });
    }

    public static final StateFlow b(C c2) {
        return c2.getAdLoader().isLoaded();
    }

    public static /* synthetic */ void getAdView$annotations() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public void a(long j, InterfaceC4812b.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f10879a, null, null, new c(this, j, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f10879a, null, 1, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public abstract InterfaceC4812b getAdLoader();

    public T getAdShowListener() {
        return this.b;
    }

    public final View getAdView() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b
    public StateFlow<Boolean> isLoaded() {
        return (StateFlow) this.d.getValue();
    }

    public abstract void k();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4811a
    public StateFlow<Boolean> l() {
        return (StateFlow) this.f.getValue();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i2) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i2);
        this.e.setValue(Boolean.valueOf(i2 == 0));
    }

    public void setAdShowListener(T t) {
        this.b = t;
    }

    public final void setAdView(View view) {
        View view2 = this.c;
        this.c = view;
        removeAllViews();
        try {
            ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
            if (composeView != null) {
                composeView.disposeComposition();
            }
        } catch (ClassNotFoundException e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, i, "Compose not available, skipping ComposeView disposeComposition", e, false, 8, null);
        } catch (NoClassDefFoundError e2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, i, "Compose not available, skipping ComposeView disposeComposition", e2, false, 8, null);
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public static final StateFlow a(C c2) {
        return FlowKt.stateIn(FlowKt.flowCombine(c2.isLoaded(), c2.e, new b(null)), c2.f10879a, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
    }
}
