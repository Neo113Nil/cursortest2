package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c f7839a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c();
    public static kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> b = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1970835476, false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c.a.f7840a);

    public static final class a implements kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c.a f7840a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c.a();

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c$a$a, reason: collision with other inner class name */
        public static final class C0300a implements kotlin.jvm.functions.Function3<java.lang.Boolean, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> f7841a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c$a$a$a, reason: collision with other inner class name */
            public static final class C0301a implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f7842a;

                public C0301a(boolean z) {
                    this.f7842a = z;
                }

                public final void a(androidx.compose.foundation.layout.RowScope TextButton, androidx.compose.runtime.Composer composer, int i) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1487526992, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (PlaybackControl.kt:55)");
                    }
                    androidx.compose.material.TextKt.m1582TextfLXpl1I(this.f7842a ? "Pause" : "Play", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65534);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    a(rowScope, composer, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }
            }

            public C0300a(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                this.f7841a = function0;
            }

            public final void a(boolean z, androidx.compose.runtime.Composer composer, int i) {
                int i2;
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(z) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-397036979, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous> (PlaybackControl.kt:54)");
                }
                androidx.compose.material.ButtonKt.TextButton(this.f7841a, null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -1487526992, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c.a.C0300a.C0301a(z)), composer, 805306368, 510);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(bool.booleanValue(), composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        }

        public final void a(androidx.compose.foundation.layout.BoxScope boxScope, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changedInstance(onClick) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1970835476, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous> (PlaybackControl.kt:48)");
            }
            androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Boolean.valueOf(z), androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), androidx.compose.ui.unit.Dp.m4478constructorimpl(4)), (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -397036979, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c.a.C0300a(onClick)), composer, ((i2 >> 3) & 14) | 24576, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, java.lang.Boolean bool, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, bool.booleanValue(), function0, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a() {
        return b;
    }
}
