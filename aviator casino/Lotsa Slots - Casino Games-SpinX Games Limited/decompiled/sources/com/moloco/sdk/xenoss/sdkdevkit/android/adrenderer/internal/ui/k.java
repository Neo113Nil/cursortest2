package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f7637a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static final kotlin.Unit a(java.lang.String str, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        a(str, contentScale, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(final java.lang.String str, final androidx.compose.ui.layout.ContentScale contentScale, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "modifier");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(481470006);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(contentScale) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(481470006, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CoilAsyncImage (CoilAsyncImage.kt:31)");
            }
            final boolean isHardwareAccelerated = ((android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView())).isHardwareAccelerated();
            startRestartGroup.startReplaceableGroup(313990270);
            boolean changed = startRestartGroup.changed(isHardwareAccelerated);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(isHardwareAccelerated);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
            composer2 = startRestartGroup;
            coil.compose.SingletonAsyncImageKt.m4975AsyncImagegl8XCv8(new coil.request.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str).allowHardware(isHardwareAccelerated).build(), null, modifier, null, null, null, contentScale, 0.0f, null, 0, false, null, composer2, (i2 & 896) | 48 | ((i2 << 15) & 3670016), 0, 4024);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(str, contentScale, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.Unit a(boolean z) {
        if (!z) {
            a();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void a() {
        if (f7637a.compareAndSet(false, true)) {
            com.moloco.sdk.internal.services.x b = com.moloco.sdk.service_locator.a.e.f7346a.l().b();
            com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation().recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.b0.c()).withTag("manufacturer", b.t()).withTag("model", b.v()).withTag("os_version", b.x()).withTag("api_level", java.lang.String.valueOf(b.n())));
        }
    }
}
