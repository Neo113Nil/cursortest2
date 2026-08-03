package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7607a = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$a, reason: collision with other inner class name */
    public static final class C0265a implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.Modifier f7608a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0265a(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
            this.f7608a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(androidx.compose.ui.Modifier trackableModifier, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackableModifier, "trackableModifier");
            if ((i & 6) == 0) {
                i |= composer.changed(trackableModifier) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1810395910, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableAdBadgeButton.<anonymous> (AdBadge.kt:153)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(this.f7608a.then(trackableModifier), this.b, this.c, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(modifier, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class c implements kotlin.jvm.functions.Function4<androidx.compose.foundation.layout.BoxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.Modifier f7610a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
            this.f7610a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(androidx.compose.foundation.layout.BoxScope boxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> onButtonRendered, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if ((i & 48) == 0) {
                i |= composer.changedInstance(onButtonRendered) ? 32 : 16;
            }
            if ((i & 145) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-652534615, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous> (AdBadge.kt:124)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(onButtonRendered, this.f7610a, this.b, this.c, composer, (i >> 3) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit> function1, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, function1, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final kotlin.Unit a(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(modifier, str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.jvm.functions.Function4<androidx.compose.foundation.layout.BoxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> c(androidx.compose.ui.Modifier modifier, final java.lang.String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1806921710);
        if ((i2 & 1) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = f7607a;
        }
        if ((i2 & 4) != 0) {
            rVar = com.moloco.sdk.service_locator.a.h.f7349a.f();
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-763795258);
            boolean z = ((((i & 896) ^ 384) > 256 && composer.changedInstance(rVar)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && composer.changed(str)) || (i & 48) == 32);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            composer.endReplaceableGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1806921710, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge (AdBadge.kt:123)");
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -652534615, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.c(modifier, str, function1));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final kotlin.Unit a(int i, androidx.compose.runtime.Composer composer, int i2) {
        a(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> b(androidx.compose.ui.Modifier modifier, final java.lang.String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1665380566);
        if ((i2 & 1) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            str = f7607a;
        }
        if ((i2 & 4) != 0) {
            rVar = com.moloco.sdk.service_locator.a.h.f7349a.f();
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-819746537);
            boolean z = ((((i & 896) ^ 384) > 256 && composer.changedInstance(rVar)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && composer.changed(str)) || (i & 48) == 32);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            composer.endReplaceableGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1665380566, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge (AdBadge.kt:80)");
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 781429248, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.b(modifier, str, function1));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final kotlin.Unit a(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
        a((kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>) function1, modifier, str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(androidx.compose.ui.Modifier modifier, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(modifier, str, rVar, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(androidx.compose.ui.Modifier modifier, final java.lang.String clickUrl, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClick, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1037954372);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(clickUrl) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1037954372, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadge (AdBadge.kt:43)");
            }
            startRestartGroup.startReplaceableGroup(-363689698);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            androidx.compose.runtime.Composer.Companion companion = androidx.compose.runtime.Composer.INSTANCE;
            final java.lang.String str = "Ad Badge";
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier m609requiredSize3ABfNKs = androidx.compose.foundation.layout.SizeKt.m609requiredSize3ABfNKs(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier3, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), androidx.compose.ui.unit.Dp.m4478constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-363682862);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(kotlin.jvm.functions.Function1.this, clickUrl);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.IconKt.m1412Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.moloco.sdk.R.drawable.info_badge, startRestartGroup, 0), "Ad Badge", androidx.compose.foundation.ClickableKt.m246clickableXHw0xAI$default(m609requiredSize3ABfNKs, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, 7, null), androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU(), startRestartGroup, 3120, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier4 = modifier3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(androidx.compose.ui.Modifier.this, clickUrl, onClick, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final class b implements kotlin.jvm.functions.Function5<androidx.compose.foundation.layout.BoxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.Modifier f7609a;
        public final /* synthetic */ java.lang.String b;
        public final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
            this.f7609a = modifier;
            this.b = str;
            this.c = function1;
        }

        public final void a(androidx.compose.foundation.layout.BoxScope boxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> onButtonRendered, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> stateFlow, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(781429248, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous> (AdBadge.kt:81)");
            }
            if (stateFlow != null) {
                androidx.compose.ui.Modifier modifier = this.f7609a;
                java.lang.String str = this.b;
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a a2 = a(androidx.compose.runtime.SnapshotStateKt.collectAsState(stateFlow, null, composer, 0, 1));
                if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c) {
                    composer.startReplaceableGroup(-784874969);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(onButtonRendered, modifier, str, function1, composer, (i >> 3) & 14);
                    composer.endReplaceableGroup();
                } else if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a) {
                    composer.startReplaceableGroup(-784629945);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(onButtonRendered, modifier, str, function1, composer, (i >> 3) & 14);
                    composer.endReplaceableGroup();
                } else if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b) {
                    composer.startReplaceableGroup(-784396608);
                    composer.endReplaceableGroup();
                } else if (a2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d) {
                    composer.startReplaceableGroup(-784339072);
                    composer.endReplaceableGroup();
                } else {
                    if (a2 != null) {
                        composer.startReplaceableGroup(-1687888204);
                        composer.endReplaceableGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-784304352);
                    composer.endReplaceableGroup();
                }
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit> function1, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> stateFlow, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, function1, stateFlow, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a a(androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> state) {
            return state.getValue();
        }
    }

    public static final kotlin.Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, java.lang.String str, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, java.lang.String str, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semantics, str);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> function1, final androidx.compose.ui.Modifier modifier, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-459026854);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-459026854, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TrackableAdBadgeButton (AdBadge.kt:148)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.i, function1, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1810395910, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.C0265a(modifier, str, function12)), startRestartGroup, ((i2 << 6) & 896) | 3120, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(kotlin.jvm.functions.Function1.this, modifier, str, function12, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, java.lang.String str, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        rVar.a(str);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(androidx.compose.ui.Modifier modifier, final java.lang.String str, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1950835232);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                if ((i & 512) == 0 ? startRestartGroup.changed(rVar) : startRestartGroup.changedInstance(rVar)) {
                    i4 = 256;
                    i3 |= i4;
                }
            }
            i4 = 128;
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changedInstance(function1)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (i6 != 0) {
                    str = f7607a;
                }
                if ((i2 & 4) != 0) {
                    rVar = com.moloco.sdk.service_locator.a.h.f7349a.f();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    startRestartGroup.startReplaceableGroup(1664253345);
                    boolean z = ((((i3 & 896) ^ 384) > 256 && startRestartGroup.changedInstance(rVar)) || (i3 & 384) == 256) | ((i3 & 112) == 32);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r.this, str, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    i3 &= -7169;
                    function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1950835232, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultNativeAdImageBadge (AdBadge.kt:172)");
            }
            a(modifier, str, function1, startRestartGroup, (i3 & 126) | ((i3 >> 3) & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final java.lang.String str2 = str;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2 = rVar;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12 = function1;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(androidx.compose.ui.Modifier.this, str2, rVar2, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1309369895);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1309369895, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadgePreview (AdBadge.kt:182)");
            }
            androidx.compose.material.MaterialThemeKt.MaterialTheme(null, null, null, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l.f7638a.a(), startRestartGroup, 3072, 7);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.a(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
