package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d f7843a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d();
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> b = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1374838940, false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d.a.f7844a);

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a() {
        return b;
    }

    public static final class a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d.a f7844a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d.a();

        public final void a(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1374838940, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$VastCTAKt.lambda-1.<anonymous> (VastCTA.kt:61)");
            }
            composer.startReplaceableGroup(-1163729772);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d.a.a();
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.a(null, "https://play-lh.googleusercontent.com/l_C7yZC4etIdr5tUY7-7LdKzi_-FWmVhwqMU_OncT9MMntcK-wWBEIvuVrfT1Yoe6Q=s96", "Learn More", 0L, (kotlin.jvm.functions.Function0) rememberedValue, composer, 25008, 9);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a() {
            return kotlin.Unit.INSTANCE;
        }
    }
}
