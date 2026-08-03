package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes5.dex */
public final class c {

    public static final class a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.Unit f7687a;

        public a(kotlin.Unit unit) {
            this.f7687a = unit;
        }

        public final void a(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1040652088, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastView.<anonymous>.<anonymous> (VastActivity.kt:323)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public b(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.receiver).x();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.Unit a(android.app.Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, kotlin.jvm.functions.Function2 function2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(activity, aVar, function2, yVar, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if ((r34 & 2) != 0) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final android.app.Activity activity, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> function2, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> function22;
        final kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> function23;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1851234025);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activity) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(aVar) : startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 2) == 0) {
                function22 = function2;
                if (startRestartGroup.changedInstance(function22)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                function22 = function2;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            function22 = function2;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(yVar) : startRestartGroup.changedInstance(yVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function23 = function22;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    function22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(0L, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q) null, false, 4095, (java.lang.Object) null);
                    i3 &= -897;
                }
                int i5 = i3;
                function23 = function22;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1851234025, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastView (VastActivity.kt:319)");
                }
                startRestartGroup.startReplaceableGroup(1546066198);
                startRestartGroup.startReplaceableGroup(1546064924);
                int i6 = i5 & 112;
                boolean z = ((((i5 & 896) ^ 384) > 256 && startRestartGroup.changed(function23)) || (i5 & 384) == 256) | (i6 == 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(aVar)));
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(kotlin.jvm.functions.Function2.this, aVar, (android.content.Context) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView((kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 0, 6);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1546066963);
                if (yVar != null) {
                    yVar.a(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1040652088, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(unit)), startRestartGroup, ((i5 >> 6) & 112) | 6);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1546068887);
                boolean z2 = i6 == 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(aVar));
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.b(aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                androidx.activity.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0, 1);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u.a(activity, startRestartGroup, i5 & 14);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final kotlin.jvm.functions.Function2<? super android.content.Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends android.view.View> function24 = function23;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(activity, aVar, function24, yVar, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.view.View a(kotlin.jvm.functions.Function2 function2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, android.content.Context ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "ctx");
        return (android.view.View) function2.invoke(ctx, aVar);
    }
}
