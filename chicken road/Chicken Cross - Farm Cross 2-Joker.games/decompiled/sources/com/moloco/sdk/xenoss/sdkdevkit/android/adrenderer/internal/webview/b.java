package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.ironsource.V2;
import com.moloco.sdk.R;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C4835a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C4836b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11558a = "AdWebViewRenderer";
    public static final float b = Dp.m3840constructorimpl(12);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$b, reason: collision with other inner class name */
    public static final class C1616b implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1616b f11560a = new C1616b();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-349315014);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349315014, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous> (AdWebViewRenderer.kt:158)");
            }
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f11561a;
        public final /* synthetic */ MutableStateFlow<Boolean> b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Function1<a.AbstractC1622a.c, Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ Function0<Unit> f;
        public final /* synthetic */ long g;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> h;
        public final /* synthetic */ z i;
        public final /* synthetic */ Dp j;
        public final /* synthetic */ boolean k;

        public static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WebView f11562a;
            public final /* synthetic */ MutableStateFlow<Boolean> b;
            public final /* synthetic */ int c;
            public final /* synthetic */ Function1<a.AbstractC1622a.c, Unit> d;
            public final /* synthetic */ Function0<Unit> e;
            public final /* synthetic */ Function0<Unit> f;
            public final /* synthetic */ long g;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> h;
            public final /* synthetic */ z i;
            public final /* synthetic */ Dp j;
            public final /* synthetic */ boolean k;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebViewRendererKt$defaultAdWebViewRenderer$2$1$1$1$1$1", f = "AdWebViewRenderer.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a, reason: collision with other inner class name */
            public static final class C1617a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f11563a;
                public final /* synthetic */ MutableState<Boolean> b;
                public final /* synthetic */ MutableStateFlow<Boolean> c;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a$a, reason: collision with other inner class name */
                public static final class C1618a<T> implements FlowCollector {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ MutableStateFlow<Boolean> f11564a;

                    public C1618a(MutableStateFlow<Boolean> mutableStateFlow) {
                        this.f11564a = mutableStateFlow;
                    }

                    public final Object a(boolean z, Continuation<? super Unit> continuation) {
                        this.f11564a.setValue(Boxing.boxBoolean(z));
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return a(((Boolean) obj).booleanValue(), continuation);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1617a(MutableState<Boolean> mutableState, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super C1617a> continuation) {
                    super(2, continuation);
                    this.b = mutableState;
                    this.c = mutableStateFlow;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C1617a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1617a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f11563a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final MutableState<Boolean> mutableState = this.b;
                        Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(b.c.a.C1617a.a(MutableState.this));
                            }
                        });
                        C1618a c1618a = new C1618a(this.c);
                        this.f11563a = 1;
                        if (snapshotFlow.collect(c1618a, this) == coroutine_suspended) {
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

                public static final boolean a(MutableState mutableState) {
                    return ((Boolean) mutableState.getValue()).booleanValue();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(WebView webView, MutableStateFlow<Boolean> mutableStateFlow, int i, Function1<? super a.AbstractC1622a.c, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, long j, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function2, z zVar, Dp dp, boolean z) {
                this.f11562a = webView;
                this.b = mutableStateFlow;
                this.c = i;
                this.d = function1;
                this.e = function0;
                this.f = function02;
                this.g = j;
                this.h = function2;
                this.i = zVar;
                this.j = dp;
                this.k = z;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-101529568, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:165)");
                }
                composer.startReplaceableGroup(1335704684);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = a.h.f10873a.k();
                    composer.updateRememberedValue(rememberedValue);
                }
                Q q = (Q) rememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335709510);
                boolean changed = composer.changed(this.f11562a);
                WebView webView = this.f11562a;
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = q.a(webView);
                    composer.updateRememberedValue(rememberedValue2);
                }
                Flow flow = (Flow) rememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335714159);
                MutableStateFlow<Boolean> mutableStateFlow = this.b;
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(mutableStateFlow.getValue(), null, 2, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState = (MutableState) rememberedValue3;
                composer.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
                composer.startReplaceableGroup(1335717996);
                boolean changed2 = composer.changed(mutableState) | composer.changed(this.b);
                MutableStateFlow<Boolean> mutableStateFlow2 = this.b;
                Object rememberedValue4 = composer.rememberedValue();
                if (changed2 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new C1617a(mutableState, mutableStateFlow2, null);
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer, 6);
                b.a(this.f11562a, this.c, mutableState, this.d, this.e, this.f, null, this.g, this.h.invoke(composer, 0), this.i, this.j.m3854unboximpl(), this.k, flow, composer, 384, 0, 64);
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

        /* JADX WARN: Multi-variable type inference failed */
        public c(WebView webView, MutableStateFlow<Boolean> mutableStateFlow, int i, Function1<? super a.AbstractC1622a.c, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, long j, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function2, z zVar, Dp dp, boolean z) {
            this.f11561a = webView;
            this.b = mutableStateFlow;
            this.c = i;
            this.d = function1;
            this.e = function0;
            this.f = function02;
            this.g = j;
            this.h = function2;
            this.i = zVar;
            this.j = dp;
            this.k = z;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(553564605, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:164)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, ComposableLambdaKt.composableLambda(composer, -101529568, true, new a(this.f11561a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k)), composer, 48, 1);
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

    public static final Unit a(WebView webView, int i, MutableState mutableState, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, long j, Function11 function11, z zVar, float f, boolean z, Flow flow, int i2, int i3, int i4, Composer composer, int i5) {
        a(webView, i, mutableState, function1, function0, function02, modifier, j, function11, zVar, f, z, flow, composer, i2 | 1, i3, i4);
        return Unit.INSTANCE;
    }

    public static final void c(MutableStateFlow<Boolean> mutableStateFlow, Function0<Unit> function0) {
        if (mutableStateFlow.getValue().booleanValue()) {
            function0.invoke();
        }
    }

    public static final Unit d(MutableStateFlow mutableStateFlow, Function0 function0) {
        c(mutableStateFlow, function0);
        return Unit.INSTANCE;
    }

    public static final Unit e(MutableStateFlow mutableStateFlow, Function0 function0) {
        c(mutableStateFlow, function0);
        return Unit.INSTANCE;
    }

    public static final Unit a(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, WebView webView, int i, Function1 function1, Function0 function0, Function10 function10, z zVar, Function11 function11, Function11 function112, Function0 function02, int i2, int i3, Composer composer, int i4) {
        a(activity, iVar, webView, i, function1, function0, function10, zVar, function11, function112, function02, composer, i2 | 1, i3);
        return Unit.INSTANCE;
    }

    public static final Unit b(MutableStateFlow mutableStateFlow, Function0 function0) {
        a((MutableStateFlow<Boolean>) mutableStateFlow, (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    public static final Unit a(Activity activity, WebView webView, int i, Function1 function1, Function0 function0, Function10 function10, z zVar, Function0 function02, int i2, Composer composer, int i3) {
        a(activity, webView, i, function1, function0, function10, zVar, function02, composer, i2 | 1);
        return Unit.INSTANCE;
    }

    public static final float a() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final WebView webView, final int i, final MutableState<Boolean> mutableState, final Function1<? super a.AbstractC1622a.c, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, long j, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, final z zVar, final float f, final boolean z, Flow<Boolean> flow, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long m1654getBlack0d7_KjU;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112;
        Flow<Boolean> flow2;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function113;
        Modifier modifier2;
        Composer composer2;
        Modifier.Companion companion;
        BoxScopeInstance boxScopeInstance;
        Composer composer3;
        final Modifier modifier3;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function114;
        final Flow<Boolean> flow3;
        final long j2;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1361070397);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(webView) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(function1) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(function0) ? 16384 : 8192;
            if ((i4 & 32) == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= startRestartGroup.changed(function02) ? 131072 : 65536;
            }
            i6 = i4 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
            }
            i7 = i4 & 128;
            if (i7 == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= startRestartGroup.changed(j) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i4 & 256) == 0 && startRestartGroup.changed(function11)) {
                    i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    i5 |= i10;
                }
                i10 = 33554432;
                i5 |= i10;
            }
            if ((i4 & 512) == 0) {
                i5 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
                i5 |= startRestartGroup.changed(zVar) ? 536870912 : 268435456;
                if ((i4 & 1024) != 0) {
                    i8 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i8 = i3 | (startRestartGroup.changed(f) ? 4 : 2);
                } else {
                    i8 = i3;
                }
                if ((i4 & 2048) != 0) {
                    i8 |= 48;
                } else if ((i3 & 48) == 0) {
                    i8 |= startRestartGroup.changed(z) ? 32 : 16;
                    i9 = i4 & 4096;
                    if (i9 == 0) {
                        i8 |= 384;
                    } else if ((i3 & 384) == 0) {
                        i8 |= startRestartGroup.changed(flow) ? 256 : 128;
                        if ((i5 & 306783379) != 306783378 && (i8 & 147) == 146 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j2 = j;
                            function114 = function11;
                            flow3 = flow;
                            composer3 = startRestartGroup;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 256) != 0) {
                                    i5 &= -234881025;
                                }
                                modifier2 = modifier;
                                m1654getBlack0d7_KjU = j;
                                function113 = function11;
                                flow2 = flow;
                            } else {
                                Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier;
                                m1654getBlack0d7_KjU = i7 != 0 ? Color.INSTANCE.m1654getBlack0d7_KjU() : j;
                                if ((i4 & 256) != 0) {
                                    function112 = s.a(null, null, 0L, 0L, 0L, null, null, null, startRestartGroup, 0, 255);
                                    i5 &= -234881025;
                                } else {
                                    function112 = function11;
                                }
                                if (i9 != 0) {
                                    function113 = function112;
                                    modifier2 = modifier4;
                                    flow2 = null;
                                } else {
                                    flow2 = flow;
                                    function113 = function112;
                                    modifier2 = modifier4;
                                }
                            }
                            int i11 = i5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1361070397, i11, i8, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebViewRenderDisplay (AdWebViewRenderer.kt:84)");
                            }
                            Modifier m173backgroundbw27NRU$default = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
                            startRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Modifier modifier5 = modifier2;
                            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m173backgroundbw27NRU$default);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            startRestartGroup.disableReusing();
                            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m1290setimpl(m1283constructorimpl, density, companion3.getSetDensity());
                            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                            startRestartGroup.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), zVar, startRestartGroup, ((i11 >> 21) & 896) | (i11 & 14) | 48, 0);
                            startRestartGroup.startReplaceableGroup(-1422935541);
                            if (function113 == null) {
                                composer2 = startRestartGroup;
                                companion = companion4;
                                boxScopeInstance = boxScopeInstance2;
                            } else {
                                startRestartGroup.startReplaceableGroup(1485624565);
                                boolean changed = startRestartGroup.changed(i);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new m(UInt.m8170boximpl(UInt.m8176constructorimpl(RangesKt.coerceAtLeast(i, 0))));
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                m mVar = (m) rememberedValue;
                                startRestartGroup.endReplaceableGroup();
                                boolean booleanValue = mutableState.getValue().booleanValue();
                                startRestartGroup.startReplaceableGroup(1485637484);
                                boolean changed2 = startRestartGroup.changed(mutableState) | startRestartGroup.changed(function02);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return b.a(MutableState.this, function02);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                int i12 = i8 << 21;
                                composer2 = startRestartGroup;
                                companion = companion4;
                                boxScopeInstance = boxScopeInstance2;
                                w.a(boxScopeInstance2, mVar, true, booleanValue, (Function0) rememberedValue2, function0, function1, function113, z, flow2, composer2, ((i11 << 3) & 458752) | 390 | ((i11 << 9) & 3670016) | (234881024 & i12) | (i12 & 1879048192), 0);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceableGroup();
                            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
                            composer3 = composer2;
                            C4835a.c(PaddingKt.m420padding3ABfNKs(boxScopeInstance3.align(companion, companion2.getBottomStart()), f), null, null, null, composer2, 0, 14).invoke(boxScopeInstance3, function1, composer3, Integer.valueOf(((i11 >> 6) & 112) | 6));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            function114 = function113;
                            flow3 = flow2;
                            j2 = m1654getBlack0d7_KjU;
                        }
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return b.a(webView, i, mutableState, function1, function0, function02, modifier3, j2, function114, zVar, f, z, flow3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i5 & 306783379) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i4 & 256) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    int i112 = i5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier m173backgroundbw27NRU$default2 = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
                    startRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier52 = modifier2;
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m173backgroundbw27NRU$default2);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                    Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl2, density2, companion32.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion32.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion32.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null), zVar, startRestartGroup, ((i112 >> 21) & 896) | (i112 & 14) | 48, 0);
                    startRestartGroup.startReplaceableGroup(-1422935541);
                    if (function113 == null) {
                    }
                    composer2.endReplaceableGroup();
                    BoxScopeInstance boxScopeInstance32 = boxScopeInstance;
                    composer3 = composer2;
                    C4835a.c(PaddingKt.m420padding3ABfNKs(boxScopeInstance32.align(companion, companion22.getBottomStart()), f), null, null, null, composer2, 0, 14).invoke(boxScopeInstance32, function1, composer3, Integer.valueOf(((i112 >> 6) & 112) | 6));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    function114 = function113;
                    flow3 = flow2;
                    j2 = m1654getBlack0d7_KjU;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i4 & 4096;
                if (i9 == 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i4 & 256) != 0) {
                }
                if (i9 != 0) {
                }
                int i1122 = i5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m173backgroundbw27NRU$default22 = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion222 = Alignment.INSTANCE;
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion222.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier522 = modifier2;
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion322.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m173backgroundbw27NRU$default22);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl22, rememberBoxMeasurePolicy22, companion322.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl22, density22, companion322.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion322.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion322.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion422 = Modifier.INSTANCE;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion422, 0.0f, 1, null), zVar, startRestartGroup, ((i1122 >> 21) & 896) | (i1122 & 14) | 48, 0);
                startRestartGroup.startReplaceableGroup(-1422935541);
                if (function113 == null) {
                }
                composer2.endReplaceableGroup();
                BoxScopeInstance boxScopeInstance322 = boxScopeInstance;
                composer3 = composer2;
                C4835a.c(PaddingKt.m420padding3ABfNKs(boxScopeInstance322.align(companion, companion222.getBottomStart()), f), null, null, null, composer2, 0, 14).invoke(boxScopeInstance322, function1, composer3, Integer.valueOf(((i1122 >> 6) & 112) | 6));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier522;
                function114 = function113;
                flow3 = flow2;
                j2 = m1654getBlack0d7_KjU;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i4 & 1024) != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            i9 = i4 & 4096;
            if (i9 == 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 256) != 0) {
            }
            if (i9 != 0) {
            }
            int i11222 = i5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m173backgroundbw27NRU$default222 = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2222 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(companion2222.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Modifier modifier5222 = modifier2;
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3222 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor222 = companion3222.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(m173backgroundbw27NRU$default222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl222 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl222, rememberBoxMeasurePolicy222, companion3222.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl222, density222, companion3222.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl222, layoutDirection222, companion3222.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, companion3222.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4222 = Modifier.INSTANCE;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion4222, 0.0f, 1, null), zVar, startRestartGroup, ((i11222 >> 21) & 896) | (i11222 & 14) | 48, 0);
            startRestartGroup.startReplaceableGroup(-1422935541);
            if (function113 == null) {
            }
            composer2.endReplaceableGroup();
            BoxScopeInstance boxScopeInstance3222 = boxScopeInstance;
            composer3 = composer2;
            C4835a.c(PaddingKt.m420padding3ABfNKs(boxScopeInstance3222.align(companion, companion2222.getBottomStart()), f), null, null, null, composer2, 0, 14).invoke(boxScopeInstance3222, function1, composer3, Integer.valueOf(((i11222 >> 6) & 112) | 6));
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier5222;
            function114 = function113;
            flow3 = flow2;
            j2 = m1654getBlack0d7_KjU;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i4 & 32) == 0) {
        }
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        i7 = i4 & 128;
        if (i7 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        i9 = i4 & 4096;
        if (i9 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 256) != 0) {
        }
        if (i9 != 0) {
        }
        int i112222 = i5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m173backgroundbw27NRU$default2222 = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion22222 = Alignment.INSTANCE;
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(companion22222.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Modifier modifier52222 = modifier2;
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion32222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2222 = companion32222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(m173backgroundbw27NRU$default2222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl2222 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl2222, rememberBoxMeasurePolicy2222, companion32222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl2222, density2222, companion32222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl2222, layoutDirection2222, companion32222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl2222, viewConfiguration2222, companion32222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion42222 = Modifier.INSTANCE;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion42222, 0.0f, 1, null), zVar, startRestartGroup, ((i112222 >> 21) & 896) | (i112222 & 14) | 48, 0);
        startRestartGroup.startReplaceableGroup(-1422935541);
        if (function113 == null) {
        }
        composer2.endReplaceableGroup();
        BoxScopeInstance boxScopeInstance32222 = boxScopeInstance;
        composer3 = composer2;
        C4835a.c(PaddingKt.m420padding3ABfNKs(boxScopeInstance32222.align(companion, companion22222.getBottomStart()), f), null, null, null, composer2, 0, 14).invoke(boxScopeInstance32222, function1, composer3, Integer.valueOf(((i112222 >> 6) & 112) | 6));
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52222;
        function114 = function113;
        flow3 = flow2;
        j2 = m1654getBlack0d7_KjU;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final class a implements Function3<i.a, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> f11559a;
        public final /* synthetic */ WebView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ MutableStateFlow<Boolean> d;
        public final /* synthetic */ Function1<a.AbstractC1622a.c, Unit> e;
        public final /* synthetic */ Function0<Unit> f;
        public final /* synthetic */ Function0<Unit> g;
        public final /* synthetic */ z h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> function10, WebView webView, int i, MutableStateFlow<Boolean> mutableStateFlow, Function1<? super a.AbstractC1622a.c, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, z zVar) {
            this.f11559a = function10;
            this.b = webView;
            this.c = i;
            this.d = mutableStateFlow;
            this.e = function1;
            this.f = function0;
            this.g = function02;
            this.h = zVar;
        }

        public final void a(i.a aVar, Composer composer, int i) {
            if ((i & 6) == 0) {
                i |= composer.changed(aVar) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-448887432, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen.<anonymous>.<anonymous> (AdWebViewRenderer.kt:271)");
            }
            if (aVar instanceof i.a.C1590a) {
                composer.startReplaceableGroup(1828522999);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1828585495);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(-1880673267);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(((i.a.b) aVar).d(), null, null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, V2.b.f, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(-1880663763);
                composer.startReplaceableGroup(-1880662328);
                boolean changed = composer.changed(this.f11559a) | composer.changed(this.b) | composer.changed(this.c) | composer.changed(this.d) | composer.changed(this.e) | composer.changed(this.f) | composer.changed(this.g) | composer.changed(this.h);
                final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> function10 = this.f11559a;
                final WebView webView = this.b;
                final int i2 = this.c;
                final MutableStateFlow<Boolean> mutableStateFlow = this.d;
                final Function1<a.AbstractC1622a.c, Unit> function1 = this.e;
                final z zVar = this.h;
                final Function0<Unit> function0 = this.f;
                final Function0<Unit> function02 = this.g;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$a$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b.a.a(Function10.this, webView, i2, mutableStateFlow, function1, zVar, function0, function02, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, composer, 0, 6);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(-1880678788);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1829836035);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(i.a aVar, Composer composer, Integer num) {
            a(aVar, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final View a(Function10 function10, WebView webView, int i, final MutableStateFlow mutableStateFlow, Function1 function1, z zVar, final Function0 function0, final Function0 function02, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (View) function10.invoke(context, webView, Integer.valueOf(i), mutableStateFlow, function1, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a.a(MutableStateFlow.this, function0);
                }
            }, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$a$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a.a(Function0.this);
                }
            }, zVar, Dp.m3838boximpl(b.a()), Boolean.TRUE);
        }

        public static final Unit a(MutableStateFlow mutableStateFlow, Function0 function0) {
            b.a((MutableStateFlow<Boolean>) mutableStateFlow, (Function0<Unit>) function0);
            return Unit.INSTANCE;
        }

        public static final Unit a(Function0 function0) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, b.f11558a, "Skip button shown callback triggered in MraidAdContainerScreen", null, false, 12, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(MutableState mutableState, Function0 function0) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f11558a, "Countdown finished - skip button is now available", null, false, 12, null);
        mutableState.setValue(Boolean.TRUE);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Function10 a(long j, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Color.INSTANCE.m1654getBlack0d7_KjU();
        }
        if ((i & 2) != 0) {
            function2 = C1616b.f11560a;
        }
        return a(j, (Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) function2);
    }

    public static final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> a(final long j, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adCloseCountdownButton) {
        Intrinsics.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        return new Function10() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function10
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                return b.a(j, adCloseCountdownButton, (Context) obj, (WebView) obj2, ((Integer) obj3).intValue(), (MutableStateFlow) obj4, (Function1) obj5, (Function0) obj6, (Function0) obj7, (z) obj8, (Dp) obj9, ((Boolean) obj10).booleanValue());
            }
        };
    }

    public static final ComposeView a(long j, Function2 function2, Context context, WebView webView, int i, MutableStateFlow canClose, Function1 onButtonRendered, Function0 onClose, Function0 onCloseOrSkipButtonShown, z zVar, Dp dp, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(canClose, "canClose");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.moloco_fullscreen_ad_view_id);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(553564605, true, new c(webView, canClose, i, onButtonRendered, onClose, onCloseOrSkipButtonShown, j, function2, zVar, dp, z)));
        return composeView;
    }

    public static /* synthetic */ Function10 a(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        return a(i);
    }

    public static final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> a(final int i) {
        return new Function10() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function10
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                return b.a(i, (Context) obj, (WebView) obj2, ((Integer) obj3).intValue(), (MutableStateFlow) obj4, (Function1) obj5, (Function0) obj6, (Function0) obj7, (z) obj8, (Dp) obj9, ((Boolean) obj10).booleanValue());
            }
        };
    }

    public static final FrameLayout a(int i, Context context, WebView webView, int i2, MutableStateFlow canClose, Function1 onButtonRendered, Function0 function0, Function0 function02, z zVar, Dp dp, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(canClose, "canClose");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(function0, "<unused var>");
        Intrinsics.checkNotNullParameter(function02, "<unused var>");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.moloco_fullscreen_ad_view_id);
        frameLayout.setBackgroundColor(i);
        frameLayout.addView(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(context, webView, zVar), new FrameLayout.LayoutParams(-1, -1));
        int m3854unboximpl = (int) (dp.m3854unboximpl() * context.getResources().getDisplayMetrics().density);
        C4836b a2 = C4835a.a(context, (String) null, (r) null, onButtonRendered, 6, (Object) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMarginStart(m3854unboximpl);
        layoutParams.bottomMargin = m3854unboximpl;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(a2, layoutParams);
        return frameLayout;
    }

    public static final void a(final Activity activity, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, final WebView webView, final int i, final Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, final Function0<Unit> onClose, final Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> adWebViewRenderer, final z zVar, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112, final Function0<Unit> onCloseOrSkipButtonShown, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        Composer startRestartGroup = composer.startRestartGroup(772404782);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(activity) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(adViewModel) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(webView) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(onButtonRendered) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changed(onClose) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= startRestartGroup.changed(adWebViewRenderer) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= startRestartGroup.changed(zVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= startRestartGroup.changed(function11) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
            i4 |= startRestartGroup.changed(function112) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(onCloseOrSkipButtonShown) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772404782, i4, i5, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen (AdWebViewRenderer.kt:253)");
            }
            Modifier testTag = TestTagKt.testTag(BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m1654getBlack0d7_KjU(), null, 2, null), "MraidAdContainerScreen");
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int i6 = i4;
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(testTag);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, companion.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1204620122);
            boolean changed = startRestartGroup.changed(i);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Boolean.valueOf(i == 0));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            State collectAsState = SnapshotStateKt.collectAsState(adViewModel.k(), null, startRestartGroup, 0, 1);
            composer2 = startRestartGroup;
            CrossfadeKt.Crossfade(a((State<? extends i.a>) collectAsState), null, null, ComposableLambdaKt.composableLambda(composer2, -448887432, true, new a(adWebViewRenderer, webView, i, mutableStateFlow, onButtonRendered, onClose, onCloseOrSkipButtonShown, zVar)), composer2, 3072, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance, adViewModel, a((State<? extends i.a>) collectAsState), function112, function11, (Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>) null, composer2, (i6 & 112) | 6 | ((i6 >> 18) & 7168) | ((i6 >> 12) & 57344), 16);
            composer2.startReplaceableGroup(1204685583);
            boolean changed2 = composer2.changed(mutableStateFlow) | composer2.changed(onClose);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.b(MutableStateFlow.this, onClose);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (Function0) rememberedValue2, composer2, 0, 1);
            v.a(activity, composer2, i6 & 14);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b.a(activity, adViewModel, webView, i, onButtonRendered, onClose, adWebViewRenderer, zVar, function11, function112, onCloseOrSkipButtonShown, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(MutableStateFlow<Boolean> mutableStateFlow, Function0<Unit> function0) {
        if (mutableStateFlow.getValue().booleanValue()) {
            function0.invoke();
        }
    }

    public static final void a(final Activity activity, final WebView webView, final int i, final Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, final Function0<Unit> onClose, final Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> adWebViewRenderer, final z zVar, final Function0<Unit> onCloseOrSkipButtonShown, Composer composer, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        final MutableStateFlow mutableStateFlow;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        Composer startRestartGroup = composer.startRestartGroup(-204806360);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(activity) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(webView) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(onButtonRendered) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(onClose) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(adWebViewRenderer) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(zVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= startRestartGroup.changed(onCloseOrSkipButtonShown) ? 8388608 : 4194304;
        }
        int i5 = i3;
        if ((4793491 & i5) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204806360, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.StaticAdWebViewScreen (AdWebViewRenderer.kt:328)");
            }
            Modifier m173backgroundbw27NRU$default = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m1654getBlack0d7_KjU(), null, 2, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m173backgroundbw27NRU$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, companion.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1609987203);
            boolean changed = startRestartGroup.changed(i);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Boolean.valueOf(i == 0));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableStateFlow mutableStateFlow2 = (MutableStateFlow) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1609994792);
            boolean changed2 = startRestartGroup.changed(adWebViewRenderer) | startRestartGroup.changed(webView) | startRestartGroup.changed(i) | startRestartGroup.changed(mutableStateFlow2) | startRestartGroup.changed(onButtonRendered) | startRestartGroup.changed(onClose) | startRestartGroup.changed(onCloseOrSkipButtonShown) | startRestartGroup.changed(zVar);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i4 = i5;
                composer2 = startRestartGroup;
                mutableStateFlow = mutableStateFlow2;
                Object obj = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b.a(Function10.this, webView, i, mutableStateFlow2, onButtonRendered, onCloseOrSkipButtonShown, zVar, onClose, (Context) obj2);
                    }
                };
                composer2.updateRememberedValue(obj);
                rememberedValue2 = obj;
            } else {
                composer2 = startRestartGroup;
                mutableStateFlow = mutableStateFlow2;
                i4 = i5;
            }
            composer2.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) rememberedValue2, null, null, composer2, 0, 6);
            composer2.startReplaceableGroup(1610008760);
            boolean changed3 = composer2.changed(mutableStateFlow) | composer2.changed(onClose);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.e(MutableStateFlow.this, onClose);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (Function0) rememberedValue3, composer2, 0, 1);
            v.a(activity, composer2, i4 & 14);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return b.a(activity, webView, i, onButtonRendered, onClose, adWebViewRenderer, zVar, onCloseOrSkipButtonShown, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final View a(Function10 function10, WebView webView, int i, final MutableStateFlow mutableStateFlow, Function1 function1, Function0 function0, z zVar, final Function0 function02, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (View) function10.invoke(it, webView, Integer.valueOf(i), mutableStateFlow, function1, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.d(MutableStateFlow.this, function02);
            }
        }, function0, zVar, Dp.m3838boximpl(b), Boolean.FALSE);
    }

    public static final i.a a(State<? extends i.a> state) {
        return state.getValue();
    }
}
