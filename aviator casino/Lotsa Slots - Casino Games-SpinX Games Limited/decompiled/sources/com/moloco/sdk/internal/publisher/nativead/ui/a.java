package com.moloco.sdk.internal.publisher.nativead.ui;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.publisher.nativead.ui.a f7154a = new com.moloco.sdk.internal.publisher.nativead.ui.a();
    public static kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> b = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1019496058, false, com.moloco.sdk.internal.publisher.nativead.ui.a.C0200a.f7155a);

    public final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a() {
        return b;
    }

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.ui.a$a, reason: collision with other inner class name */
    public static final class C0200a implements kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.publisher.nativead.ui.a.C0200a f7155a = new com.moloco.sdk.internal.publisher.nativead.ui.a.C0200a();

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.ui.a$a$a, reason: collision with other inner class name */
        public static final class C0201a implements kotlin.jvm.functions.Function3<java.lang.Boolean, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> f7156a;

            public C0201a(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                this.f7156a = function0;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1756616327, i2, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous>.<anonymous> (NativeVideoPlaybackControlUI.kt:30)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(androidx.compose.ui.res.PainterResources_androidKt.painterResource(z ? com.moloco.sdk.R.drawable.moloco_twotone_pause_24 : com.moloco.sdk.R.drawable.moloco_twotone_play_arrow_24, composer, 0), this.f7156a, null, false, "play/pause", androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), 0L, 0L, null, 0L, composer, 221184, 972);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1019496058, i2, -1, "com.moloco.sdk.internal.publisher.nativead.ui.ComposableSingletons$NativeVideoPlaybackControlUIKt.lambda-1.<anonymous> (NativeVideoPlaybackControlUI.kt:17)");
            }
            androidx.compose.ui.Modifier m568padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m568padding3ABfNKs(boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), androidx.compose.ui.unit.Dp.m4478constructorimpl(4));
            composer.startReplaceableGroup(277443603);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final java.lang.String str = "playback_control_button";
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.a$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.internal.publisher.nativead.ui.a.C0200a.a(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Boolean.valueOf(z), androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m568padding3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), (androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float>) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -1756616327, true, new com.moloco.sdk.internal.publisher.nativead.ui.a.C0200a.C0201a(onClick)), composer, ((i2 >> 3) & 14) | 24576, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, java.lang.Boolean bool, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, bool.booleanValue(), function0, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semantics, str);
            return kotlin.Unit.INSTANCE;
        }
    }
}
