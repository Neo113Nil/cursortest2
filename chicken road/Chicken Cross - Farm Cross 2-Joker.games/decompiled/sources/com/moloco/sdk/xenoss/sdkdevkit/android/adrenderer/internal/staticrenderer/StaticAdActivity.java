package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "e", "a", "(Ljava/lang/Throwable;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes7.dex */
public final class StaticAdActivity extends ComponentActivity {
    public static final int b = 0;
    public static Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> c;
    public static a d;
    public static StaticAdActivity e;
    public static Function0<Unit> f;
    public static Function0<Unit> g;
    public static z i;
    public static MetricsRecorder j;
    public static Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final MutableStateFlow<Boolean> h = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$Companion", f = "StaticAdActivity.kt", i = {0}, l = {130}, m = "show", n = {"this"}, s = {"L$0"})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$a, reason: collision with other inner class name */
        public static final class C1539a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f11064a;
            public /* synthetic */ Object b;
            public int d;

            public C1539a(Continuation<? super C1539a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return Companion.this.a(null, null, null, null, null, null, null, null, this);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$Companion$show$3", f = "StaticAdActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$a$b */
        public static final class b extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11065a;
            public /* synthetic */ boolean b;

            public b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            public final Object a(boolean z, Continuation<? super Boolean> continuation) {
                return ((b) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(continuation);
                bVar.b = ((Boolean) obj).booleanValue();
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11065a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.b);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void a() {
            StaticAdActivity.h.setValue(Boolean.TRUE);
        }

        public final void a(a.AbstractC1622a.c cVar) {
            a aVar = StaticAdActivity.d;
            if (aVar != null) {
                aVar.a(cVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(Context context, a aVar, Function0<Unit> function0, Function0<Unit> function02, f fVar, z zVar, MetricsRecorder metricsRecorder, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function1, Continuation<? super Unit> continuation) {
            C1539a c1539a;
            int i;
            try {
                if (continuation instanceof C1539a) {
                    c1539a = (C1539a) continuation;
                    int i2 = c1539a.d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1539a.d = i2 - Integer.MIN_VALUE;
                        Object obj = c1539a.b;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1539a.d;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            StaticAdActivity.i = zVar;
                            StaticAdActivity.j = metricsRecorder;
                            StaticAdActivity.k = function1;
                            Companion companion = StaticAdActivity.INSTANCE;
                            StaticAdActivity.d = aVar;
                            StaticAdActivity.c = fVar.a();
                            StaticAdActivity.f = function0;
                            StaticAdActivity.g = function02;
                            Intent intent = new Intent(context, (Class<?>) StaticAdActivity.class);
                            x.a(intent, fVar.d());
                            intent.setFlags(268435456);
                            context.startActivity(intent);
                            MutableStateFlow mutableStateFlow = StaticAdActivity.h;
                            b bVar = new b(null);
                            c1539a.f11064a = this;
                            c1539a.d = 1;
                            obj = FlowKt.first(mutableStateFlow, bVar, c1539a);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        ((Boolean) obj).booleanValue();
                        return Unit.INSTANCE;
                    }
                }
                if (i != 0) {
                }
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            } finally {
                StaticAdActivity.h.setValue(Boxing.boxBoolean(false));
                Companion companion2 = StaticAdActivity.INSTANCE;
                StaticAdActivity.f = null;
                StaticAdActivity.g = null;
                StaticAdActivity.d = null;
                StaticAdActivity.c = null;
                StaticAdActivity.j = null;
                StaticAdActivity.k = null;
                StaticAdActivity staticAdActivity = StaticAdActivity.e;
                if (staticAdActivity != null) {
                    staticAdActivity.finish();
                }
            }
            c1539a = new C1539a(continuation);
            Object obj2 = c1539a.b;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c1539a.d;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        e = this;
        Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> function10 = c;
        a aVar = d;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: WebView is missing", null, false, 12, null);
            INSTANCE.a();
            return;
        }
        if (function10 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: StaticRenderer is missing", null, false, 12, null);
            INSTANCE.a();
            return;
        }
        try {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1596214, true, new b(aVar, function10)), 1, null);
        } catch (ClassNotFoundException e2) {
            a(e2);
        } catch (NoClassDefFoundError e3) {
            a(e3);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Function0<Unit> function0 = f;
        if (function0 != null) {
            function0.invoke();
        }
        e = null;
    }

    public final void a(Throwable e2) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticAdActivity", "Compose dependency not available, cannot show fullscreen static ad", e2, false, 8, null);
        MetricsRecorder metricsRecorder = j;
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.f0.c()));
        }
        Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function1 = k;
        if (function1 != null) {
            function1.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.b);
        }
        INSTANCE.a();
    }

    public static final class b implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a b;
        public final /* synthetic */ Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> c;

        public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<a.AbstractC1622a.c, Unit> {
            public a(Object obj) {
                super(1, obj, Companion.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.AbstractC1622a.c p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((Companion) this.receiver).a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(a.AbstractC1622a.c cVar) {
                a(cVar);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C1540b extends FunctionReferenceImpl implements Function0<Unit> {
            public C1540b(Object obj) {
                super(0, obj, Companion.class, "dismiss", "dismiss()V", 0);
            }

            public final void a() {
                ((Companion) this.receiver).a();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super z, ? super Dp, ? super Boolean, ? extends View> function10) {
            this.b = aVar;
            this.c = function10;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596214, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.onCreate.<anonymous> (StaticAdActivity.kt:44)");
            }
            StaticAdActivity staticAdActivity = StaticAdActivity.this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = this.b;
            Intent intent = staticAdActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            int k = x.k(intent);
            Companion companion = StaticAdActivity.INSTANCE;
            composer.startReplaceableGroup(-1212645219);
            boolean changed = composer.changed(companion);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new a(companion);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Function1 function1 = (Function1) ((KFunction) rememberedValue);
            composer.startReplaceableGroup(-1212643532);
            boolean changed2 = composer.changed(companion);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new C1540b(companion);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Function0 function0 = (Function0) ((KFunction) rememberedValue2);
            Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Function0<Unit>, z, Dp, Boolean, View> function10 = this.c;
            z zVar = StaticAdActivity.i;
            composer.startReplaceableGroup(-1212638456);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StaticAdActivity.b.a();
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(staticAdActivity, aVar, k, function1, function0, function10, zVar, (Function0) rememberedValue3, composer, 12582912);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final Unit a() {
            Function0 function0 = StaticAdActivity.g;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }
}
