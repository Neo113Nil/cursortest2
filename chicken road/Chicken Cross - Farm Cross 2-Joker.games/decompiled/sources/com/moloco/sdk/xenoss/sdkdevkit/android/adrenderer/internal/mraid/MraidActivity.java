package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwnerKt;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C4778a;
import com.moloco.sdk.internal.ortb.model.C4779b;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.ForegroundMonitor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\r\u0010\u0013J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\r\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/n$f;", "expectedOrientation", "a", "(Lkotlinx/coroutines/flow/StateFlow;)V", "orientationCommand", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/n$f;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;", "", "(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;)Ljava/lang/Integer;", "", "e", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/a;", "b", "Lkotlin/Lazy;", "c", "()Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/a;", "customUserEventBuilderService", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "_adPlaylistController", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/j;", "d", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/j;", "_mraidContentController", "", "Z", "isClosedByUser", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;", "f", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;", "storeInstallerImpl", "g", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes7.dex */
public final class MraidActivity extends ComponentActivity {
    public static final String i = "MraidActivity";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy customUserEventBuilderService = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MraidActivity.b();
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a _adPlaylistController;

    /* renamed from: d, reason: from kotlin metadata */
    public j _mraidContentController;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean isClosedByUser;

    /* renamed from: f, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l storeInstallerImpl;

    /* renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 8;
    public static final MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> j = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return bVar instanceof b.f;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c adData, j controller, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f options, z zVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> onShowListenerClick, Function0<Unit> onCloseOrSkipButtonShown, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function1, String str, MetricsRecorder metricsRecorder) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
            Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
            Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
            if (!a(controller)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a;
            bVar.a(adData);
            bVar.a(zVar);
            bVar.a(options.a());
            bVar.a(options.e());
            bVar.a(function0);
            bVar.a(controller);
            bVar.c(function02);
            bVar.d(onShowListenerClick);
            bVar.b(onCloseOrSkipButtonShown);
            bVar.a(function1);
            C4778a b = options.b();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = null;
            bVar.a(b != null ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(b.getEnabled(), b.getUrl()) : null);
            C4779b c = options.c();
            if (c != null) {
                boolean onSkip = c.getOnSkip();
                String eventLink = c.getEventLink();
                String clickthroughUrl = c.getClickthroughUrl();
                Boolean forceFullScreen = c.getForceFullScreen();
                aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(true, onSkip, eventLink, clickthroughUrl, forceFullScreen != null ? forceFullScreen.booleanValue() : true);
            }
            bVar.a(aVar);
            bVar.a(metricsRecorder);
            Intent intent = new Intent(context, (Class<?>) MraidActivity.class);
            x.a(intent, options.d());
            x.b(intent, options.f());
            if (str != null) {
                x.d(intent, str);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return Intrinsics.areEqual(bVar, b.e.b);
        }

        public final boolean a(j jVar) {
            WebView c;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a;
            j n = bVar.n();
            if (n != null && !Intrinsics.areEqual(n, jVar)) {
                return false;
            }
            bVar.a((j) null);
            ViewParent parent = (n == null || (c = n.c()) == null) ? null : c.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(n.c());
            }
            bVar.a((Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View>) null);
            bVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c) null);
            bVar.a((z) null);
            bVar.a((Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit>) null);
            Activity m = bVar.m();
            if (m != null) {
                m.finish();
            }
            bVar.a((Activity) null);
            return true;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11017a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11017a = iArr;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$onCreate$1", f = "MraidActivity.kt", i = {0}, l = {165}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11018a;
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
            c cVar = MraidActivity.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11018a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                MutableSharedFlow mutableSharedFlow = MraidActivity.j;
                this.b = bVar2;
                this.f11018a = 1;
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
            if (bVar instanceof b.a) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a.k().invoke();
            } else {
                Companion companion = MraidActivity.INSTANCE;
                if (companion.b(bVar)) {
                    MraidActivity.this.finish();
                } else if (companion.a(bVar)) {
                    MraidActivity.this.isClosedByUser = true;
                    MraidActivity.this.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends AdaptedFunctionReference implements Function2<n.f, Continuation<? super Unit>, Object>, SuspendFunction {
        public e(Object obj) {
            super(2, obj, MraidActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidJsCommand$SetOrientationProperties;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n.f fVar, Continuation<? super Unit> continuation) {
            return MraidActivity.b((MraidActivity) this.receiver, fVar, continuation);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b() {
        return a.k.f10876a.b();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) this.customUserEventBuilderService.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        ForegroundMonitor foregroundMonitor = ForegroundMonitor.f11157a;
        foregroundMonitor.a();
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MraidActivity.a(MraidActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m(this, registerForActivityResult, LifecycleOwnerKt.getLifecycleScope(this), foregroundMonitor.b(), 0L, null, null, 112, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f = a.h.f10873a.f();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b c2 = bVar.c();
        boolean c3 = c2 != null ? c2.c() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b2 = bVar.b();
        boolean g = b2 != null ? b2.g() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b3 = bVar.b();
        boolean j2 = b3 != null ? b3.j() : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b4 = bVar.b();
        boolean i2 = b4 != null ? b4.i() : true;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b5 = bVar.b();
        String f2 = b5 != null ? b5.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b6 = bVar.b();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(c3, g, j2, i2, f2, b6 != null ? b6.h() : null, bVar.e());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar2 = this.storeInstallerImpl;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        } else {
            lVar = lVar2;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k a2 = iVar.a(f, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h(lVar, x.j(intent), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(), bVar.c(), bVar.b(), bVar.e()));
        bVar.a(this);
        Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> d2 = bVar.d();
        Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> f3 = bVar.f();
        if (f3 == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "can't display ad: MraidRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        j n = bVar.n();
        if (n == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "can't display ad: mraid controller is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c a3 = bVar.a();
        if (a3 != null) {
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(a3, f, this, n, x.l(intent2), c(), a2);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "can't display ad: mraid ad data is missing", null, false, 12, null);
            finish();
            return;
        }
        n.a(a2);
        a(n.e());
        FlowKt.launchIn(FlowKt.onEach(aVar.a(), new c(null)), this.scope);
        try {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2083734656, true, new d(aVar, n, f3, d2)), 1, null);
            aVar.d();
            this._adPlaylistController = aVar;
            this._mraidContentController = n;
        } catch (ClassNotFoundException e2) {
            a(e2);
        } catch (NoClassDefFoundError e3) {
            a(e3);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Function0<Unit> i2;
        super.onDestroy();
        if (!this.isClosedByUser && (i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a.i()) != null) {
            i2.invoke();
        }
        Function0<Unit> g = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a.g();
        if (g != null) {
            g.invoke();
        }
        INSTANCE.a(this._mraidContentController);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this._adPlaylistController;
        if (aVar != null) {
            aVar.destroy();
        }
        this._adPlaylistController = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = this.storeInstallerImpl;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        }
        lVar.cancel();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }

    public static final /* synthetic */ Object b(MraidActivity mraidActivity, n.f fVar, Continuation continuation) {
        mraidActivity.a(fVar);
        return Unit.INSTANCE;
    }

    public final void a(StateFlow<n.f> expectedOrientation) {
        a(expectedOrientation.getValue());
        FlowKt.launchIn(FlowKt.onEach(expectedOrientation, new e(this)), this.scope);
    }

    public final void a(n.f orientationCommand) {
        p c2;
        Integer a2;
        if (orientationCommand == null || (c2 = orientationCommand.c()) == null || (a2 = a(c2)) == null) {
            return;
        }
        setRequestedOrientation(a2.intValue());
    }

    public final Integer a(p pVar) {
        int i2 = b.f11017a[pVar.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void a(MraidActivity mraidActivity, ActivityResult activityResult) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = mraidActivity.storeInstallerImpl;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        }
        lVar.a(activityResult.getResultCode());
    }

    public final void a(Throwable e2) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Compose dependency not available, cannot show fullscreen MRAID ad", e2, false, 8, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a;
        MetricsRecorder e3 = bVar.e();
        if (e3 != null) {
            e3.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.f0.c()));
        }
        Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> j2 = bVar.j();
        if (j2 != null) {
            j2.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.b);
        }
        finish();
    }

    public static final class d implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b;
        public final /* synthetic */ j c;
        public final /* synthetic */ Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> d;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> e;

        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
            public a(Object obj) {
                super(0, obj, j.class, "onSkipOrClose", "onSkipOrClose()V", 0);
            }

            public final void a() {
                ((j) this.receiver).F();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, j jVar, Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> function10, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function2) {
            this.b = aVar;
            this.c = jVar;
            this.d = function10;
            this.e = function2;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2083734656, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.onCreate.<anonymous> (MraidActivity.kt:179)");
            }
            MraidActivity mraidActivity = MraidActivity.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.b;
            WebView c = this.c.c();
            Intent intent = MraidActivity.this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            int k = x.k(intent);
            composer.startReplaceableGroup(-674007660);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$d$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MraidActivity.d.a((a.AbstractC1622a.c) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            composer.endReplaceableGroup();
            j jVar = this.c;
            composer.startReplaceableGroup(-674005483);
            boolean changed = composer.changed(jVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new a(jVar);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Function0 function0 = (Function0) ((KFunction) rememberedValue2);
            Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> function10 = this.d;
            z l = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a.l();
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> invoke = this.e.invoke(composer, 0);
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            composer.startReplaceableGroup(-673994329);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity$d$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MraidActivity.d.a();
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(mraidActivity, aVar, c, k, function1, function0, function10, l, invoke, a2, (Function0) rememberedValue3, composer, 24576, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final Unit a(a.AbstractC1622a.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public static final Unit a() {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, MraidActivity.i, "Skip button shown in MraidActivity", null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b.f11021a.h().invoke();
            return Unit.INSTANCE;
        }
    }
}
