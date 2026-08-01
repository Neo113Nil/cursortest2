package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d {
    public static final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC1622a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues padding, long j, long j2, long j3, q afterCountdownButtonPart, a.AbstractC1622a.c.EnumC1624a buttonType, Function0<Unit> function0, com.moloco.sdk.internal.ortb.model.k kVar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(afterCountdownButtonPart, "afterCountdownButtonPart");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        composer.startReplaceableGroup(-398768076);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-398768076, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton (AdCountdownButton.kt:54)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -201776905, true, new a(alignment, padding, buttonType, afterCountdownButtonPart, function0, j, j2, j3, kVar));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final class a implements Function11<BoxScope, Boolean, Boolean, Function0<? extends Unit>, Function1<? super a.AbstractC1622a.c, ? extends Unit>, Boolean, UInt, UInt, Function0<? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Alignment f11146a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ a.AbstractC1622a.c.EnumC1624a c;
        public final /* synthetic */ q d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k i;

        public a(Alignment alignment, PaddingValues paddingValues, a.AbstractC1622a.c.EnumC1624a enumC1624a, q qVar, Function0<Unit> function0, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f11146a = alignment;
            this.b = paddingValues;
            this.c = enumC1624a;
            this.d = qVar;
            this.e = function0;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = kVar;
        }

        public final void a(BoxScope boxScope, boolean z, boolean z2, Function0<Unit> onClick, Function1<? super a.AbstractC1622a.c, Unit> onButtonRendered, boolean z3, int i, int i2, Function0<Unit> onTimerFinish, Composer composer, int i3) {
            int i4;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
            if ((i3 & 6) == 0) {
                i4 = (composer.changed(boxScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= composer.changed(z) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i4 |= composer.changed(z2) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i4 |= composer.changed(onClick) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i4 |= composer.changed(onButtonRendered) ? 16384 : 8192;
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= composer.changed(z3) ? 131072 : 65536;
            }
            if ((1572864 & i3) == 0) {
                i4 |= composer.changed(i) ? 1048576 : 524288;
            }
            if ((12582912 & i3) == 0) {
                i4 |= composer.changed(i2) ? 8388608 : 4194304;
            }
            if ((i3 & 100663296) == 0) {
                i4 |= composer.changed(onTimerFinish) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((306783379 & i4) == 306783378 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-201776905, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous> (AdCountdownButton.kt:56)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z2, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.f11146a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 762064671, true, new C1562a(this.c, onButtonRendered, z, this.d, z3, i, i2, onClick, this.e, this.f, this.g, this.h, this.i, onTimerFinish)), composer, ((i4 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function11
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, Boolean bool2, Function0<? extends Unit> function0, Function1<? super a.AbstractC1622a.c, ? extends Unit> function1, Boolean bool3, UInt uInt, UInt uInt2, Function0<? extends Unit> function02, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), bool2.booleanValue(), function0, function1, bool3.booleanValue(), uInt.getData(), uInt2.getData(), function02, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d$a$a, reason: collision with other inner class name */
        public static final class C1562a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.AbstractC1622a.c.EnumC1624a f11147a;
            public final /* synthetic */ Function1<a.AbstractC1622a.c, Unit> b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ q d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;
            public final /* synthetic */ Function0<Unit> h;
            public final /* synthetic */ Function0<Unit> i;
            public final /* synthetic */ long j;
            public final /* synthetic */ long k;
            public final /* synthetic */ long l;
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k m;
            public final /* synthetic */ Function0<Unit> n;

            /* JADX WARN: Multi-variable type inference failed */
            public C1562a(a.AbstractC1622a.c.EnumC1624a enumC1624a, Function1<? super a.AbstractC1622a.c, Unit> function1, boolean z, q qVar, boolean z2, int i, int i2, Function0<Unit> function0, Function0<Unit> function02, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, Function0<Unit> function03) {
                this.f11147a = enumC1624a;
                this.b = function1;
                this.c = z;
                this.d = qVar;
                this.e = z2;
                this.f = i;
                this.g = i2;
                this.h = function0;
                this.i = function02;
                this.j = j;
                this.k = j2;
                this.l = j3;
                this.m = kVar;
                this.n = function03;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(762064671, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous> (AdCountdownButton.kt:63)");
                }
                B.a(Modifier.INSTANCE, this.f11147a, this.b, ComposableLambdaKt.composableLambda(composer, 936111551, true, new C1563a(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n)), composer, 3078, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d$a$a$a, reason: collision with other inner class name */
            public static final class C1563a implements Function3<Modifier, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f11148a;
                public final /* synthetic */ q b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ Function0<Unit> f;
                public final /* synthetic */ Function0<Unit> g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k k;
                public final /* synthetic */ Function0<Unit> l;

                public C1563a(boolean z, q qVar, boolean z2, int i, int i2, Function0<Unit> function0, Function0<Unit> function02, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, Function0<Unit> function03) {
                    this.f11148a = z;
                    this.b = qVar;
                    this.c = z2;
                    this.d = i;
                    this.e = i2;
                    this.f = function0;
                    this.g = function02;
                    this.h = j;
                    this.i = j2;
                    this.j = j3;
                    this.k = kVar;
                    this.l = function03;
                }

                public final void a(Modifier modifier, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(modifier) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(936111551, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous>.<anonymous> (AdCountdownButton.kt:68)");
                    }
                    q aVar = this.f11148a ? this.b : new q.a(this.c, this.d, this.e, null);
                    composer.startReplaceableGroup(1166287030);
                    boolean changed = composer.changed(this.f) | composer.changed(this.g);
                    final Function0<Unit> function0 = this.f;
                    final Function0<Unit> function02 = this.g;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d$a$a$a$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return d.a.C1562a.C1563a.a(Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    p.a(aVar, modifier, (Function0) rememberedValue, this.f11148a, this.h, this.i, this.j, this.k, this.l, composer, (i2 << 3) & 112, 0);
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
}
