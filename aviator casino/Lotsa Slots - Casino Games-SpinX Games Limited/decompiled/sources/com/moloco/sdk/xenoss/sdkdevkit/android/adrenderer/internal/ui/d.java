package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class d {
    public static final kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.layout.PaddingValues padding, long j, long j2, long j3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q afterCountdownButtonPart, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.moloco.sdk.internal.ortb.model.k kVar, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "alignment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "padding");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterCountdownButtonPart, "afterCountdownButtonPart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        composer.startReplaceableGroup(-398768076);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-398768076, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton (AdCountdownButton.kt:54)");
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -201776905, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d.a(alignment, padding, buttonType, afterCountdownButtonPart, function0, j, j2, j3, kVar));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final class a implements kotlin.jvm.functions.Function11<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, java.lang.Boolean, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, java.lang.Boolean, kotlin.UInt, kotlin.UInt, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.Alignment f7612a;
        public final /* synthetic */ androidx.compose.foundation.layout.PaddingValues b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q d;
        public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k i;

        public a(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.layout.PaddingValues paddingValues, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a enumC0327a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, kotlin.jvm.functions.Function0<kotlin.Unit> function0, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.f7612a = alignment;
            this.b = paddingValues;
            this.c = enumC0327a;
            this.d = qVar;
            this.e = function0;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = kVar;
        }

        public final void a(androidx.compose.foundation.layout.BoxScope boxScope, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> onButtonRendered, boolean z3, int i, int i2, kotlin.jvm.functions.Function0<kotlin.Unit> onTimerFinish, androidx.compose.runtime.Composer composer, int i3) {
            int i4;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
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
                i4 |= composer.changedInstance(onClick) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i4 |= composer.changedInstance(onButtonRendered) ? 16384 : 8192;
            }
            if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= composer.changed(z3) ? 131072 : 65536;
            }
            if ((1572864 & i3) == 0) {
                i4 |= composer.changed(i) ? 1048576 : 524288;
            }
            if ((12582912 & i3) == 0) {
                i4 |= composer.changed(i2) ? 8388608 : 4194304;
            }
            if ((i3 & 100663296) == 0) {
                i4 |= composer.changedInstance(onTimerFinish) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((306783379 & i4) == 306783378 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-201776905, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous> (AdCountdownButton.kt:56)");
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z2, androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(androidx.compose.ui.Modifier.INSTANCE, this.f7612a)), this.b), (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 762064671, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d.a.C0266a(this.c, onButtonRendered, z, this.d, z3, i, i2, onClick, this.e, this.f, this.g, this.h, this.i, onTimerFinish)), composer, ((i4 >> 6) & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function11
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit> function1, java.lang.Boolean bool3, kotlin.UInt uInt, kotlin.UInt uInt2, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function02, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, bool.booleanValue(), bool2.booleanValue(), function0, function1, bool3.booleanValue(), uInt.getData(), uInt2.getData(), function02, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d$a$a, reason: collision with other inner class name */
        public static final class C0266a implements kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a f7613a;
            public final /* synthetic */ kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> h;
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> i;
            public final /* synthetic */ long j;
            public final /* synthetic */ long k;
            public final /* synthetic */ long l;
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k m;
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> n;

            /* JADX WARN: Multi-variable type inference failed */
            public C0266a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a enumC0327a, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> function1, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, boolean z2, int i, int i2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
                this.f7613a = enumC0327a;
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

            public final void a(androidx.compose.animation.AnimatedVisibilityScope AnimatedVisibility, androidx.compose.runtime.Composer composer, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(762064671, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous> (AdCountdownButton.kt:63)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(androidx.compose.ui.Modifier.INSTANCE, this.f7613a, this.b, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 936111551, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d.a.C0266a.C0267a(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n)), composer, 3078, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d$a$a$a, reason: collision with other inner class name */
            public static final class C0267a implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f7614a;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> f;
                public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k k;
                public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> l;

                public C0267a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar, boolean z2, int i, int i2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
                    this.f7614a = z;
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

                public final void a(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
                    int i2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "modifier");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(modifier) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(936111551, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCountdownButton.<anonymous>.<anonymous>.<anonymous> (AdCountdownButton.kt:68)");
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q aVar = this.f7614a ? this.b : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q.a(this.c, this.d, this.e, null);
                    composer.startReplaceableGroup(1166287030);
                    boolean changed = composer.changed(this.f) | composer.changed(this.g);
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.f;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.g;
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d$a$a$a$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d.a.C0266a.C0267a.a(kotlin.jvm.functions.Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p.a(aVar, modifier, (kotlin.jvm.functions.Function0) rememberedValue, this.f7614a, this.h, this.i, this.j, this.k, this.l, composer, (i2 << 3) & 112, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    a(modifier, composer, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public static final kotlin.Unit a(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }
}
