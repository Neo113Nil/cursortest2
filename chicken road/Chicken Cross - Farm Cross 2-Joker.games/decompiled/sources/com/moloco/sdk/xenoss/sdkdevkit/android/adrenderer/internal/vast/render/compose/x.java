package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.profileinstaller.ProfileVerifier;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.R;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C4835a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class x {

    public static final class a implements Function3<i.a, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o f11464a;
        public final /* synthetic */ Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> b;
        public final /* synthetic */ Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> c;
        public final /* synthetic */ Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> d;
        public final /* synthetic */ Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit> e;
        public final /* synthetic */ Q f;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i g;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1606a extends FunctionReferenceImpl implements Function0<Unit> {
            public C1606a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onReplay", "onReplay()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).C();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function7, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function72, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar) {
            this.f11464a = oVar;
            this.b = function7;
            this.c = function5;
            this.d = function6;
            this.e = function72;
            this.f = q;
            this.g = iVar;
        }

        public final void a(i.a aVar, Composer composer, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1218472412, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer.<anonymous>.<anonymous> (VastRenderer.kt:110)");
            }
            if (aVar instanceof i.a.C1590a) {
                composer.startReplaceableGroup(1864303375);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d = ((i.a.C1590a) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar = this.f11464a;
                C4866a.a(d, oVar != null ? oVar.a() : null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1864311092);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d2 = ((i.a.c) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar2 = this.f11464a;
                Function0<Unit> c = oVar2 != null ? oVar2.c() : null;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> function7 = this.b;
                Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> function5 = this.c;
                Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> function6 = this.d;
                Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit> function72 = this.e;
                Q q = this.f;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.g;
                composer.startReplaceableGroup(1864322699);
                boolean changed = composer.changed(iVar);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new C1606a(iVar);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(d2, c, fillMaxSize$default, function7, function5, function6, function72, q, (Function0) ((KFunction) rememberedValue), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(1864325634);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e d3 = ((i.a.b) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar3 = this.f11464a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(d3, oVar3 != null ? oVar3.b() : null, this.d, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 3072, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(1959794654);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(1864302146);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1959832970);
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
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<a.AbstractC1622a.c, Unit> {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1622a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a.AbstractC1622a.c cVar) {
            a(cVar);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).E();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<a.AbstractC1622a.c, Unit> {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1622a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a.AbstractC1622a.c cVar) {
            a(cVar);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, ? extends Unit>, Function0<? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Alignment f11465a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Function0<Unit> f;

        public e(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j, Function0<Unit> function0) {
            this.f11465a = alignment;
            this.b = paddingValues;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = function0;
        }

        public static final i.a b(State<? extends i.a> state) {
            return state.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, StateFlow<? extends i.a> stateFlow, Function1<? super a.AbstractC1622a.c, ? extends Unit> function1, Function0<? extends Unit> function0, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), stateFlow, function1, function0, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void a(BoxScope boxScope, boolean z, StateFlow<? extends i.a> currentAdPartFlow, Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, Function0<Unit> onCTA, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            Intrinsics.checkNotNullParameter(onCTA, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432764356, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous> (VastRenderer.kt:324)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f11465a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1004334236, true, new a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i >> 6) & 14, 1), this.c, this.d, this.e, onCTA, this.f)), composer, ((i >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function1<a.AbstractC1622a.c, Unit> f11466a;
            public final /* synthetic */ State<i.a> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ long e;
            public final /* synthetic */ Function0<Unit> f;
            public final /* synthetic */ Function0<Unit> g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super a.AbstractC1622a.c, Unit> function1, State<? extends i.a> state, String str, String str2, long j, Function0<Unit> function0, Function0<Unit> function02) {
                this.f11466a = function1;
                this.b = state;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = function0;
                this.g = function02;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1004334236, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous> (VastRenderer.kt:343)");
                }
                i.a b2 = e.b(this.b);
                if (b2 instanceof i.a.C1590a) {
                    composer.startReplaceableGroup(1205021971);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1622a.c.EnumC1624a.g, this.f11466a, ComposableLambdaKt.composableLambda(composer, -832302220, true, new C1607a(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.c) {
                    composer.startReplaceableGroup(1205613203);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1622a.c.EnumC1624a.g, this.f11466a, ComposableLambdaKt.composableLambda(composer, 1517460509, true, new b(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.b) {
                    composer.startReplaceableGroup(1206186703);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.d) {
                    composer.startReplaceableGroup(1206272108);
                    composer.endReplaceableGroup();
                } else {
                    if (b2 != null) {
                        composer.startReplaceableGroup(-1485150361);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(1206306859);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public static final class b implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f11468a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function0<Unit> d;
                public final /* synthetic */ Function0<Unit> e;

                public b(String str, String str2, long j, Function0<Unit> function0, Function0<Unit> function02) {
                    this.f11468a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = function0;
                    this.e = function02;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1517460509, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:366)");
                    }
                    String str = this.f11468a;
                    String str2 = this.b;
                    long j = this.c;
                    composer.startReplaceableGroup(-1483932583);
                    boolean changed = composer.changed(this.d) | composer.changed(this.e);
                    final Function0<Unit> function0 = this.d;
                    final Function0<Unit> function02 = this.e;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$e$a$b$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return x.e.a.b.a(Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r.a(it, str, str2, j, (Function0) rememberedValue, composer, i & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$e$a$a, reason: collision with other inner class name */
            public static final class C1607a implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f11467a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function0<Unit> d;
                public final /* synthetic */ Function0<Unit> e;

                public C1607a(String str, String str2, long j, Function0<Unit> function0, Function0<Unit> function02) {
                    this.f11467a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = function0;
                    this.e = function02;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-832302220, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:349)");
                    }
                    String str = this.f11467a;
                    String str2 = this.b;
                    long j = this.c;
                    composer.startReplaceableGroup(-1483951655);
                    boolean changed = composer.changed(this.d) | composer.changed(this.e);
                    final Function0<Unit> function0 = this.d;
                    final Function0<Unit> function02 = this.e;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$e$a$a$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return x.e.a.C1607a.a(Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r.a(it, str, str2, j, (Function0) rememberedValue, composer, i & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static final class f implements Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, ? extends Unit>, Function1<? super Boolean, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Alignment f11469a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ Painter c;
        public final /* synthetic */ Painter d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ Shape i;
        public final /* synthetic */ long j;

        public f(Alignment alignment, PaddingValues paddingValues, Painter painter, Painter painter2, Function0<Unit> function0, long j, long j2, long j3, Shape shape, long j4) {
            this.f11469a = alignment;
            this.b = paddingValues;
            this.c = painter;
            this.d = painter2;
            this.e = function0;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = shape;
            this.j = j4;
        }

        public static final /* synthetic */ a.AbstractC1622a.c a(MutableState mutableState) {
            return b(mutableState);
        }

        public static final a.AbstractC1622a.c b(MutableState<a.AbstractC1622a.c> mutableState) {
            return mutableState.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, Boolean bool2, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, ? extends Unit> function2, Function1<? super Boolean, ? extends Unit> function1, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), bool2.booleanValue(), function2, function1, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final void b(MutableState<a.AbstractC1622a.c> mutableState, a.AbstractC1622a.c cVar) {
            mutableState.setValue(cVar);
        }

        public final void a(BoxScope boxScope, boolean z, boolean z2, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit> onButtonReplaced, Function1<? super Boolean, Unit> onMuteChange, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonReplaced, "onButtonReplaced");
            Intrinsics.checkNotNullParameter(onMuteChange, "onMuteChange");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changed(onButtonReplaced) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= composer.changed(onMuteChange) ? 16384 : 8192;
            }
            if ((74899 & i2) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-545982054, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous> (VastRenderer.kt:260)");
            }
            composer.startReplaceableGroup(-1304207447);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(a.AbstractC1622a.c.EnumC1624a.e), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f11469a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -2071462974, true, new a(z2, this.c, this.d, (MutableState) rememberedValue, onButtonReplaced, onMuteChange, this.e, z, this.f, this.g, this.h, this.i, this.j)), composer, ((i2 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f11470a;
            public final /* synthetic */ Painter b;
            public final /* synthetic */ Painter c;
            public final /* synthetic */ MutableState<a.AbstractC1622a.c> d;
            public final /* synthetic */ Function2<a.AbstractC1622a.c, a.AbstractC1622a.c.EnumC1624a, Unit> e;
            public final /* synthetic */ Function1<Boolean, Unit> f;
            public final /* synthetic */ Function0<Unit> g;
            public final /* synthetic */ boolean h;
            public final /* synthetic */ long i;
            public final /* synthetic */ long j;
            public final /* synthetic */ long k;
            public final /* synthetic */ Shape l;
            public final /* synthetic */ long m;

            /* JADX WARN: Multi-variable type inference failed */
            public a(boolean z, Painter painter, Painter painter2, MutableState<a.AbstractC1622a.c> mutableState, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit> function2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, boolean z2, long j, long j2, long j3, Shape shape, long j4) {
                this.f11470a = z;
                this.b = painter;
                this.c = painter2;
                this.d = mutableState;
                this.e = function2;
                this.f = function1;
                this.g = function0;
                this.h = z2;
                this.i = j;
                this.j = j2;
                this.k = j3;
                this.l = shape;
                this.m = j4;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
                  (r2v10 ?? I:java.lang.Object) from 0x00e0: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r2v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:3217)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            public final void a(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
                  (r2v10 ?? I:java.lang.Object) from 0x00e0: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r2v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:3217)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public static final Unit a(Function2 function2, boolean z, MutableState mutableState, a.AbstractC1622a.c it) {
                Intrinsics.checkNotNullParameter(it, "it");
                f.b(mutableState, it);
                function2.invoke(f.b(mutableState), z ? a.AbstractC1622a.c.EnumC1624a.e : a.AbstractC1622a.c.EnumC1624a.f);
                return Unit.INSTANCE;
            }

            public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                SemanticsPropertiesKt.setTestTag(semantics, str);
                return Unit.INSTANCE;
            }

            public static final Unit a(Function1 function1, boolean z, Function2 function2, Function0 function0, MutableState mutableState) {
                function1.invoke(Boolean.valueOf(!z));
                f.b(mutableState, new a.AbstractC1622a.c(z ? a.AbstractC1622a.c.EnumC1624a.e : a.AbstractC1622a.c.EnumC1624a.f, f.b(mutableState).e(), f.b(mutableState).f()));
                function2.invoke(f.b(mutableState), z ? a.AbstractC1622a.c.EnumC1624a.f : a.AbstractC1622a.c.EnumC1624a.e);
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final class g implements Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Alignment f11471a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ long c;

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f11472a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i b;
            public final /* synthetic */ long c;

            public a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, long j) {
                this.f11472a = z;
                this.b = iVar;
                this.c = j;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1435522410, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous>.<anonymous> (VastRenderer.kt:407)");
                }
                v.a(this.f11472a, this.b, null, this.c, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public g(Alignment alignment, PaddingValues paddingValues, long j) {
            this.f11471a = alignment;
            this.b = paddingValues;
            this.c = j;
        }

        public final void a(BoxScope boxScope, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(progress, "progress");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(progress) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967084142, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous> (VastRenderer.kt:399)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z || ((progress instanceof i.c) && ((i.c) progress).c() > 0), PaddingKt.padding(boxScope.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.f11471a), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -1435522410, true, new a(z, progress, this.c)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), iVar, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class h implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f11473a = new h();

        public final Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-1165352185);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165352185, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:199)");
            }
            Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a2 = x.a(0L, 0L, null, 0L, null, null, 0L, null, null, null, composer, 0, 1023);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class i implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f11474a = new i();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(1971947846);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1971947846, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:200)");
            }
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
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

    public static final class j implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f11475a = new j();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(489092871);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489092871, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:201)");
            }
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
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

    public static final class k implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f11476a = new k();

        public final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-462412988);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462412988, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:203)");
            }
            Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a2 = x.a((Alignment) null, (PaddingValues) null, 0L, (String) null, (String) null, (Function0<Unit>) null, composer, 0, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class l implements Function2<Composer, Integer, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f11477a = new l();

        public final Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-185458362);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-185458362, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:205)");
            }
            Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a2 = x.a((Alignment) null, (PaddingValues) null, 0L, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class m implements Function2<Composer, Integer, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f11478a = new m();

        public final Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(1409102370);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409102370, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:206)");
            }
            Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class n implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f11479a = new n();

        public final Void a(Composer composer, int i) {
            composer.startReplaceableGroup(-1364519647);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364519647, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:207)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class o implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f11480a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit>> c;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> d;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> e;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> f;
        public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit>> g;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o h;
        public final /* synthetic */ Function2<Composer, Integer, Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit>> i;
        public final /* synthetic */ Function2<Composer, Integer, Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit>> j;
        public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit>> k;
        public final /* synthetic */ Q l;
        public final /* synthetic */ boolean m;

        public static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i f11481a;
            public final /* synthetic */ long b;
            public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit>> c;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> d;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> e;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> f;
            public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit>> g;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o h;
            public final /* synthetic */ Function2<Composer, Integer, Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit>> i;
            public final /* synthetic */ Function2<Composer, Integer, Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit>> j;
            public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit>> k;
            public final /* synthetic */ Q l;
            public final /* synthetic */ boolean m;

            /* JADX WARN: Multi-variable type inference failed */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit>> function2, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function22, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function23, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function24, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2<? super Composer, ? super Integer, ? extends Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit>> function26, Function2<? super Composer, ? super Integer, ? extends Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function27, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function28, Q q, boolean z) {
                this.f11481a = iVar;
                this.b = j;
                this.c = function2;
                this.d = function22;
                this.e = function23;
                this.f = function24;
                this.g = function25;
                this.h = oVar;
                this.i = function26;
                this.j = function27;
                this.k = function28;
                this.l = q;
                this.m = z;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2103457343, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:216)");
                }
                x.a(this.f11481a, null, this.b, this.c.invoke(composer, 0), this.d.invoke(composer, 0), this.e.invoke(composer, 0), this.f.invoke(composer, 0), this.g.invoke(composer, 0), this.h, this.i.invoke(composer, 0), this.j.invoke(composer, 0), this.k.invoke(composer, 0), this.l, this.m, composer, 0, 0, 2);
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
        public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit>> function2, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function22, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function23, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function24, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2<? super Composer, ? super Integer, ? extends Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit>> function26, Function2<? super Composer, ? super Integer, ? extends Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function27, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function28, Q q, boolean z) {
            this.f11480a = iVar;
            this.b = j;
            this.c = function2;
            this.d = function22;
            this.e = function23;
            this.f = function24;
            this.g = function25;
            this.h = oVar;
            this.i = function26;
            this.j = function27;
            this.k = function28;
            this.l = q;
            this.m = z;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482604196, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:215)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, ComposableLambdaKt.composableLambda(composer, 2103457343, true, new a(this.f11480a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m)), composer, 48, 1);
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

    public /* synthetic */ class p extends FunctionReferenceImpl implements Function3<Context, Flow<? extends Boolean>, Flow<? extends Boolean>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f11482a = new p();

        public p() {
            super(3, x.class, "defaultMuteButtonView", "defaultMuteButtonView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/MuteButtonView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n invoke(Context p0, Flow<Boolean> p1, Flow<Boolean> p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.a(p0, p1, p2);
        }
    }

    public /* synthetic */ class q extends FunctionReferenceImpl implements Function3<Context, Flow<? extends Boolean>, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, w> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f11483a = new q();

        public q() {
            super(3, x.class, "defaultProgressBarView", "defaultProgressBarView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/VastProgressBarView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Context p0, Flow<Boolean> p1, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.c(p0, p1, p2);
        }
    }

    public /* synthetic */ class r extends FunctionReferenceImpl implements Function2<Context, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f11484a = new r();

        public r() {
            super(2, x.class, "defaultVastIconView", "defaultVastIconView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/LinearVastIconView;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k invoke(Context p0, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return x.a(p0, p1);
        }
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Modifier modifier, long j2, Function7 function7, Function11 function11, Function11 function112, Function11 function113, Function7 function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function5 function5, Function6 function6, Function7 function73, Q q2, boolean z, int i2, int i3, int i4, Composer composer, int i5) {
        a(iVar, modifier, j2, function7, function11, function112, function113, function72, oVar, function5, function6, function73, q2, z, composer, i2 | 1, i3, i4);
        return Unit.INSTANCE;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q b(Context context, Flow<Boolean> isPlaying, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> progress) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q(context, isPlaying, progress, 0, 0, null, null, null, null, PglCryptUtils.BASE64_FAILED, null);
    }

    public static final w c(Context context, Flow<Boolean> isPlaying, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> progress) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new w(context, isPlaying, progress, 0, 0, 0, 56, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, Modifier modifier, long j2, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function7, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function113, Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function73, final Q viewVisibilityTracker, boolean z, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        long j3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function74;
        int i12;
        int i13;
        int i14;
        long m1654getBlack0d7_KjU;
        Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function75;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function114;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function115;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function116;
        int i15;
        int i16;
        Composer composer2;
        int i17;
        int i18;
        Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function76;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar2;
        Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function52;
        Composer composer3;
        Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function77;
        Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function62;
        Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function78;
        boolean z2;
        int i19;
        int i20;
        Modifier modifier3;
        final Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function63;
        final Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function79;
        final boolean z3;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function117;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function118;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function119;
        final Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function710;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar3;
        final Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function53;
        final Modifier modifier4;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Composer startRestartGroup = composer.startRestartGroup(1488753766);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(adViewModel) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
                j3 = j2;
            } else {
                j3 = j2;
                if ((i2 & 384) == 0) {
                    i5 |= startRestartGroup.changed(j3) ? 256 : 128;
                }
            }
            if ((i2 & 3072) == 0) {
                if ((i4 & 8) == 0 && startRestartGroup.changed(function7)) {
                    i25 = 2048;
                    i5 |= i25;
                }
                i25 = 1024;
                i5 |= i25;
            }
            if ((i2 & 24576) == 0) {
                if ((i4 & 16) == 0 && startRestartGroup.changed(function11)) {
                    i24 = 16384;
                    i5 |= i24;
                }
                i24 = 8192;
                i5 |= i24;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(function112)) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(function113)) ? 1048576 : 524288;
            }
            if ((i2 & 12582912) == 0) {
                if ((i4 & 128) == 0 && startRestartGroup.changed(function72)) {
                    i23 = 8388608;
                    i5 |= i23;
                }
                i23 = 4194304;
                i5 |= i23;
            }
            i7 = i4 & 256;
            if (i7 == 0) {
                i5 |= 100663296;
                i8 = i7;
            } else {
                i8 = i7;
                if ((i2 & 100663296) == 0) {
                    i5 |= startRestartGroup.changed(oVar) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                if ((i4 & 512) == 0 && startRestartGroup.changed(function5)) {
                    i22 = 536870912;
                    i5 |= i22;
                }
                i22 = 268435456;
                i5 |= i22;
            }
            if ((i3 & 6) != 0) {
                if ((i4 & 1024) == 0 && startRestartGroup.changed(function6)) {
                    i21 = 4;
                    i9 = i3 | i21;
                }
                i21 = 2;
                i9 = i3 | i21;
            } else {
                i9 = i3;
            }
            i10 = i4 & 2048;
            if (i10 == 0) {
                i11 = i10;
                i12 = i9 | 48;
                function74 = function73;
            } else {
                i11 = i10;
                function74 = function73;
                if ((i3 & 48) == 0) {
                    i9 |= startRestartGroup.changed(function74) ? 32 : 16;
                }
                i12 = i9;
            }
            if ((i4 & 4096) == 0) {
                i12 |= 384;
            } else if ((i3 & 384) == 0) {
                i12 |= startRestartGroup.changed(viewVisibilityTracker) ? 256 : 128;
            }
            i13 = i4 & 8192;
            if (i13 == 0) {
                i12 |= 3072;
                i14 = i13;
            } else {
                i14 = i13;
                if ((i3 & 3072) == 0) {
                    i12 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    if ((i5 & 306783379) != 306783378 && (i12 & 1171) == 1170 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        function75 = function7;
                        function710 = function72;
                        function63 = function6;
                        z3 = z;
                        j4 = j3;
                        modifier4 = modifier2;
                        function79 = function74;
                        composer3 = startRestartGroup;
                        function119 = function11;
                        function117 = function112;
                        function118 = function113;
                        oVar3 = oVar;
                        function53 = function5;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i26 != 0 ? Modifier.INSTANCE : modifier2;
                            m1654getBlack0d7_KjU = i6 != 0 ? Color.INSTANCE.m1654getBlack0d7_KjU() : j3;
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                                function75 = a(0L, 0L, null, 0L, null, null, 0L, null, null, null, startRestartGroup, 0, 1023);
                            } else {
                                function75 = function7;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                                function114 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, startRestartGroup, 0, 255);
                            } else {
                                function114 = function11;
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                function115 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, 0L, 0L, 0L, null, null, null, startRestartGroup, 0, 255);
                            } else {
                                function115 = function112;
                            }
                            if ((i4 & 64) != 0) {
                                i15 = i5 & (-3670017);
                                function116 = function115;
                            } else {
                                function116 = function113;
                                i15 = i5;
                            }
                            if ((i4 & 128) != 0) {
                                i18 = i14;
                                i16 = i11;
                                i17 = i8;
                                composer2 = startRestartGroup;
                                function76 = a((Alignment) null, (PaddingValues) null, 0L, (String) null, (String) null, (Function0<Unit>) null, startRestartGroup, 0, 63);
                                i15 &= -29360129;
                            } else {
                                i16 = i11;
                                composer2 = startRestartGroup;
                                i17 = i8;
                                i18 = i14;
                                function76 = function72;
                            }
                            oVar2 = i17 != 0 ? null : oVar;
                            if ((i4 & 512) != 0) {
                                function52 = a((Alignment) null, (PaddingValues) null, 0L, composer2, 0, 7);
                                i15 &= -1879048193;
                            } else {
                                function52 = function5;
                            }
                            if ((i4 & 1024) != 0) {
                                composer3 = composer2;
                                function77 = null;
                                function62 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(null, null, composer3, 0, 3);
                                i12 &= -15;
                            } else {
                                composer3 = composer2;
                                function77 = null;
                                function62 = function6;
                            }
                            function78 = i16 != 0 ? function77 : function73;
                            if (i18 != 0) {
                                i19 = i12;
                                i20 = i15;
                                modifier3 = modifier5;
                                z2 = true;
                            } else {
                                z2 = z;
                                i19 = i12;
                                i20 = i15;
                                modifier3 = modifier5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i4 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i4 & 512) != 0) {
                                i5 &= -1879048193;
                            }
                            if ((i4 & 1024) != 0) {
                                i12 &= -15;
                            }
                            function75 = function7;
                            function114 = function11;
                            function115 = function112;
                            function116 = function113;
                            oVar2 = oVar;
                            function52 = function5;
                            function62 = function6;
                            function78 = function73;
                            m1654getBlack0d7_KjU = j3;
                            composer3 = startRestartGroup;
                            z2 = z;
                            i19 = i12;
                            i20 = i5;
                            modifier3 = modifier2;
                            function76 = function72;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1488753766, i20, i19, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer (VastRenderer.kt:101)");
                        }
                        Modifier m173backgroundbw27NRU$default = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Modifier modifier6 = modifier3;
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m173backgroundbw27NRU$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1283constructorimpl = Updater.m1283constructorimpl(composer3);
                        Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl, density, companion2.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        State collectAsState = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer3, 0, 1);
                        CrossfadeKt.Crossfade(a((State<? extends i.a>) collectAsState), null, null, ComposableLambdaKt.composableLambda(composer3, 1218472412, true, new a(oVar2, function75, function52, function62, function78, viewVisibilityTracker, adViewModel)), composer3, 3072, 6);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance, adViewModel, a((State<? extends i.a>) collectAsState), function115, function114, function116, composer3, ((i20 >> 3) & 458752) | ((i20 << 3) & 112) | 6 | ((i20 >> 6) & 7168) | (57344 & i20), 0);
                        composer3.startReplaceableGroup(-1443689911);
                        if (function76 != null) {
                            Boolean valueOf = Boolean.valueOf(b(SnapshotStateKt.collectAsState(adViewModel.o(), null, composer3, 0, 1)));
                            StateFlow<i.a> k2 = adViewModel.k();
                            composer3.startReplaceableGroup(1864349683);
                            boolean changed = composer3.changed(adViewModel);
                            Object rememberedValue = composer3.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new b(adViewModel);
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            KFunction kFunction = (KFunction) rememberedValue;
                            composer3.endReplaceableGroup();
                            composer3.startReplaceableGroup(1864351176);
                            boolean changed2 = composer3.changed(adViewModel);
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new c(adViewModel);
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            function76.invoke(boxScopeInstance, valueOf, k2, kFunction, (KFunction) rememberedValue2, composer3, 6);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-1443680835);
                        if (z2) {
                            Function5<BoxScope, Function1<? super a.AbstractC1622a.c, Unit>, StateFlow<? extends i.a>, Composer, Integer, Unit> b2 = C4835a.b(PaddingKt.m420padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getBottomStart()), Dp.m3840constructorimpl(12)), null, null, null, composer3, 0, 14);
                            composer3.startReplaceableGroup(-1443674828);
                            boolean changed3 = composer3.changed(adViewModel);
                            Object rememberedValue3 = composer3.rememberedValue();
                            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new d(adViewModel);
                                composer3.updateRememberedValue(rememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            b2.invoke(boxScopeInstance, (KFunction) rememberedValue3, adViewModel.k(), composer3, 6);
                        }
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function63 = function62;
                        function79 = function78;
                        z3 = z2;
                        function117 = function115;
                        function118 = function116;
                        function119 = function114;
                        function710 = function76;
                        oVar3 = oVar2;
                        function53 = function52;
                        modifier4 = modifier6;
                        j4 = m1654getBlack0d7_KjU;
                    }
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function711 = function75;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.this, modifier4, j4, function711, function119, function117, function118, function710, oVar3, function53, function63, function79, viewVisibilityTracker, z3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            if ((i5 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i4 & 8) != 0) {
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i17 != 0) {
            }
            if ((i4 & 512) != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m173backgroundbw27NRU$default2 = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
            composer3.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Modifier modifier62 = modifier3;
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m173backgroundbw27NRU$default2);
            if (!(composer3.getApplier() instanceof Applier)) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            composer3.disableReusing();
            Composer m1283constructorimpl2 = Updater.m1283constructorimpl(composer3);
            Updater.m1290setimpl(m1283constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl2, density2, companion22.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
            composer3.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            composer3.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            State collectAsState2 = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer3, 0, 1);
            CrossfadeKt.Crossfade(a((State<? extends i.a>) collectAsState2), null, null, ComposableLambdaKt.composableLambda(composer3, 1218472412, true, new a(oVar2, function75, function52, function62, function78, viewVisibilityTracker, adViewModel)), composer3, 3072, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance2, adViewModel, a((State<? extends i.a>) collectAsState2), function115, function114, function116, composer3, ((i20 >> 3) & 458752) | ((i20 << 3) & 112) | 6 | ((i20 >> 6) & 7168) | (57344 & i20), 0);
            composer3.startReplaceableGroup(-1443689911);
            if (function76 != null) {
            }
            composer3.endReplaceableGroup();
            composer3.startReplaceableGroup(-1443680835);
            if (z2) {
            }
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function63 = function62;
            function79 = function78;
            z3 = z2;
            function117 = function115;
            function118 = function116;
            function119 = function114;
            function710 = function76;
            oVar3 = oVar2;
            function53 = function52;
            modifier4 = modifier62;
            j4 = m1654getBlack0d7_KjU;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i7 = i4 & 256;
        if (i7 == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        i10 = i4 & 2048;
        if (i10 == 0) {
        }
        if ((i4 & 4096) == 0) {
        }
        i13 = i4 & 8192;
        if (i13 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i4 & 8) != 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i17 != 0) {
        }
        if ((i4 & 512) != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        composer3.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m173backgroundbw27NRU$default22 = BackgroundKt.m173backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), m1654getBlack0d7_KjU, null, 2, null);
        composer3.startReplaceableGroup(733328855);
        Alignment.Companion companion32 = Alignment.INSTANCE;
        Modifier modifier622 = modifier3;
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composer3, 0);
        composer3.startReplaceableGroup(-1323940314);
        Density density22 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(m173backgroundbw27NRU$default22);
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
        }
        composer3.disableReusing();
        Composer m1283constructorimpl22 = Updater.m1283constructorimpl(composer3);
        Updater.m1290setimpl(m1283constructorimpl22, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl22, density22, companion222.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl22, layoutDirection22, companion222.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, companion222.getSetViewConfiguration());
        composer3.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer3)), composer3, 0);
        composer3.startReplaceableGroup(2058660585);
        composer3.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        State collectAsState22 = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer3, 0, 1);
        CrossfadeKt.Crossfade(a((State<? extends i.a>) collectAsState22), null, null, ComposableLambdaKt.composableLambda(composer3, 1218472412, true, new a(oVar2, function75, function52, function62, function78, viewVisibilityTracker, adViewModel)), composer3, 3072, 6);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance22, adViewModel, a((State<? extends i.a>) collectAsState22), function115, function114, function116, composer3, ((i20 >> 3) & 458752) | ((i20 << 3) & 112) | 6 | ((i20 >> 6) & 7168) | (57344 & i20), 0);
        composer3.startReplaceableGroup(-1443689911);
        if (function76 != null) {
        }
        composer3.endReplaceableGroup();
        composer3.startReplaceableGroup(-1443680835);
        if (z2) {
        }
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function63 = function62;
        function79 = function78;
        z3 = z2;
        function117 = function115;
        function118 = function116;
        function119 = function114;
        function710 = function76;
        oVar3 = oVar2;
        function53 = function52;
        modifier4 = modifier622;
        j4 = m1654getBlack0d7_KjU;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final boolean b(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static /* synthetic */ Function2 a(long j2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2 function26, Function2 function27, Function2 function28, Q q2, boolean z, int i2, Object obj) {
        long m1654getBlack0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m1654getBlack0d7_KjU() : j2;
        Function2 function29 = (i2 & 2) != 0 ? h.f11473a : function2;
        Function2 function210 = (i2 & 4) != 0 ? i.f11474a : function22;
        Function2 function211 = (i2 & 8) != 0 ? j.f11475a : function23;
        return a(m1654getBlack0d7_KjU, (Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit>>) function29, (Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) function210, (Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) function211, (Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) ((i2 & 16) != 0 ? function211 : function24), (Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) ((i2 & 32) != 0 ? k.f11476a : function25), (i2 & 64) != 0 ? null : oVar, (Function2<? super Composer, ? super Integer, ? extends Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit>>) ((i2 & 128) != 0 ? l.f11477a : function26), (Function2<? super Composer, ? super Integer, ? extends Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) ((i2 & 256) != 0 ? m.f11478a : function27), (Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) ((i2 & 512) != 0 ? n.f11479a : function28), (i2 & 1024) != 0 ? a.h.f10873a.k() : q2, (i2 & 2048) != 0 ? true : z);
    }

    public static final Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> a(final long j2, final Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit>> muteButton, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adCloseCountdownButton, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adSkipCountdownButton, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adSkipCountdownButtonForEndcards, final Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> ctaButton, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, final Function2<? super Composer, ? super Integer, ? extends Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit>> progressBar, final Function2<? super Composer, ? super Integer, ? extends Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> vastIcon, final Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> playbackControl, final Q viewVisibilityTracker, final boolean z) {
        Intrinsics.checkNotNullParameter(muteButton, "muteButton");
        Intrinsics.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        Intrinsics.checkNotNullParameter(adSkipCountdownButton, "adSkipCountdownButton");
        Intrinsics.checkNotNullParameter(adSkipCountdownButtonForEndcards, "adSkipCountdownButtonForEndcards");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(vastIcon, "vastIcon");
        Intrinsics.checkNotNullParameter(playbackControl, "playbackControl");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        return new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x.a(j2, muteButton, adCloseCountdownButton, adSkipCountdownButton, adSkipCountdownButtonForEndcards, ctaButton, oVar, progressBar, vastIcon, playbackControl, viewVisibilityTracker, z, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        };
    }

    public static final ComposeView a(long j2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2 function26, Function2 function27, Function2 function28, Q q2, boolean z, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.moloco_fullscreen_ad_view_id);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1482604196, true, new o(adViewModel, j2, function2, function22, function23, function24, function25, oVar, function26, function27, function28, q2, z)));
        return composeView;
    }

    public static final Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC1622a.c, ? super a.AbstractC1622a.c.EnumC1624a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a(long j2, long j3, Shape shape, long j4, Alignment alignment, PaddingValues paddingValues, long j5, Painter painter, Painter painter2, Function0<Unit> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(447650301);
        long b2 = (i3 & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
        long j6 = (i3 & 2) != 0 ? b2 : j3;
        Shape f2 = (i3 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
        long e2 = (i3 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j4;
        Alignment topStart = (i3 & 16) != 0 ? Alignment.INSTANCE.getTopStart() : alignment;
        PaddingValues m413PaddingValues0680j_4 = (i3 & 32) != 0 ? PaddingKt.m413PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m976getPrimary0d7_KjU = (i3 & 64) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m976getPrimary0d7_KjU() : j5;
        Painter painterResource = (i3 & 128) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_volume_off_24, composer, 0) : painter;
        Painter painterResource2 = (i3 & 256) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_volume_up_24, composer, 0) : painter2;
        Function0<Unit> function02 = (i3 & 512) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(447650301, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton (VastRenderer.kt:255)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -545982054, true, new f(topStart, m413PaddingValues0680j_4, painterResource, painterResource2, function02, m976getPrimary0d7_KjU, b2, j6, f2, e2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, long j2, String str, String str2, Function0<Unit> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-926425258);
        Alignment bottomEnd = (i3 & 1) != 0 ? Alignment.INSTANCE.getBottomEnd() : alignment;
        PaddingValues m413PaddingValues0680j_4 = (i3 & 2) != 0 ? PaddingKt.m413PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m976getPrimary0d7_KjU = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m976getPrimary0d7_KjU() : j2;
        String stringResource = (i3 & 8) != 0 ? StringResources_androidKt.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        String str3 = (i3 & 16) != 0 ? null : str2;
        Function0<Unit> function02 = (i3 & 32) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-926425258, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton (VastRenderer.kt:323)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 432764356, true, new e(bottomEnd, m413PaddingValues0680j_4, str3, stringResource, m976getPrimary0d7_KjU, function02));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, long j2, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(716005120);
        if ((i3 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomCenter();
        }
        if ((i3 & 2) != 0) {
            paddingValues = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0));
        }
        if ((i3 & 4) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m976getPrimary0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(716005120, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar (VastRenderer.kt:398)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1967084142, true, new g(alignment, paddingValues, j2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static /* synthetic */ Function5 a(String str, String str2, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        return a(str, str2, num, num2);
    }

    public static final Function5<Context, Flow<Boolean>, StateFlow<? extends i.a>, Function1<? super a.AbstractC1622a.c, Unit>, Function0<Unit>, com.moloco.sdk.internal.s> a(final String str, final String str2, final Integer num, final Integer num2) {
        return new Function5() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return x.a(str, num, num2, str2, (Context) obj, (Flow) obj2, (StateFlow) obj3, (Function1) obj4, (Function0) obj5);
            }
        };
    }

    public static final com.moloco.sdk.internal.s a(String str, Integer num, Integer num2, String str2, Context context, Flow ctaAvailable, StateFlow currentAdPart, Function1 onButtonRendered, Function0 onCTA) {
        Function1 a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ctaAvailable, "ctaAvailable");
        Intrinsics.checkNotNullParameter(currentAdPart, "currentAdPart");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onCTA, "onCTA");
        a2 = com.moloco.sdk.internal.v.a((Flow<Boolean>) ctaAvailable, (StateFlow<? extends i.a>) currentAdPart, (Function1<? super a.AbstractC1622a.c, Unit>) onButtonRendered, (Function0<Unit>) onCTA, (r22 & 16) != 0 ? 8388693 : 0, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : str, (r22 & 128) != 0 ? null : num, (r22 & 256) != 0 ? null : num2, (r22 & 512) != 0 ? null : str2);
        return (com.moloco.sdk.internal.s) a2.invoke(context);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n a(Context context, Flow<Boolean> isPlayerPlaying, Flow<Boolean> mute) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlayerPlaying, "isPlayerPlaying");
        Intrinsics.checkNotNullParameter(mute, "mute");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n(context, isPlayerPlaying, mute, 0, 0, 0, 0, 0, 0, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED, null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k a(Context context, Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> vastPrivacyIcon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastPrivacyIcon, "vastPrivacyIcon");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k(context, vastPrivacyIcon, 0, 0, 12, null);
    }

    public static final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setClickable(false);
        view.setFocusable(false);
        view.setImportantForAccessibility(2);
        return view;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> a(final Lifecycle lifecycle, final int i2, final Function3<? super Context, ? super Flow<Boolean>, ? super Flow<Boolean>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n> function3, final Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, w> function32, final Function3<? super Context, ? super Flow<Boolean>, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q> function33, final Function2<? super Context, ? super Flow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k> function2, final Function5<? super Context, ? super Flow<Boolean>, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC1622a.c, Unit>, ? super Function0<Unit>, com.moloco.sdk.internal.s> function5, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, final Q viewVisibilityTracker, final boolean z, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, final Function0<Unit> onShouldReplay) {
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        return new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x.a(Lifecycle.this, i2, function3, function32, function33, function2, function5, oVar, viewVisibilityTracker, z, externalLinkHandler, onShouldReplay, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        };
    }

    public static final y a(Lifecycle lifecycle, int i2, Function3 function3, Function3 function32, Function3 function33, Function2 function2, Function5 function5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Q q2, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function0 function0, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        return new y(context, adViewModel, lifecycle, i2, function3, function32, function33, function2, function5, oVar, q2, z, rVar, function0);
    }

    public static final i.a a(State<? extends i.a> state) {
        return state.getValue();
    }
}
