package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f7856a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c.f7839a.a();

    public static final kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(kotlin.jvm.functions.Function5<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(718660168);
        if ((i2 & 1) != 0) {
            function5 = f7856a;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(718660168, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl (PlaybackControl.kt:30)");
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 1901828083, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(function5));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a() {
        return f7856a;
    }

    public static final class a implements kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends kotlin.Unit>, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f7857a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.jvm.functions.Function5<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
            this.f7857a = function5;
        }

        public final void a(androidx.compose.foundation.layout.BoxScope boxScope, final boolean z, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onShouldPlay, final kotlin.jvm.functions.Function0<kotlin.Unit> onShouldReplay, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onShouldPlay, "onShouldPlay");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
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
            if ((i & 3072) == 0) {
                i2 |= composer.changedInstance(onShouldPlay) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= composer.changedInstance(onShouldReplay) ? 16384 : 8192;
            }
            if ((74899 & i2) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1901828083, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl.<anonymous> (PlaybackControl.kt:32)");
            }
            composer.startReplaceableGroup(263769922);
            boolean z2 = ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.this, onShouldReplay, onShouldPlay, z);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            this.f7857a.invoke(boxScope, java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function0) rememberedValue, composer, java.lang.Integer.valueOf(i2 & 126));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, java.lang.Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends kotlin.Unit> function1, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, bool.booleanValue(), iVar, function1, function0, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, boolean z) {
            if (iVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a) {
                function0.invoke();
            } else {
                function1.invoke(java.lang.Boolean.valueOf(!z));
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
