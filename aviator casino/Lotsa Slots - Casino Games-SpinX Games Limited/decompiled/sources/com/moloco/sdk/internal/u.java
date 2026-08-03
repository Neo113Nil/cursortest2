package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7324a = androidx.compose.ui.graphics.ColorKt.Color(4278354171L);

    public static final class a implements kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit>, kotlin.jvm.functions.Function0<? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.Alignment f7325a;
        public final /* synthetic */ androidx.compose.foundation.layout.PaddingValues b;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ java.lang.String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        /* renamed from: com.moloco.sdk.internal.u$a$a, reason: collision with other inner class name */
        public static final class C0207a implements kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> f7326a;
            public final /* synthetic */ androidx.compose.runtime.State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> b;
            public final /* synthetic */ java.lang.String c;
            public final /* synthetic */ java.lang.String d;
            public final /* synthetic */ long e;
            public final /* synthetic */ long f;
            public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> g;

            /* renamed from: com.moloco.sdk.internal.u$a$a$a, reason: collision with other inner class name */
            public static final class C0208a implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f7327a;
                public final /* synthetic */ java.lang.String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> e;

                public C0208a(java.lang.String str, java.lang.String str2, long j, long j2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                    this.f7327a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                public final void a(androidx.compose.ui.Modifier it, androidx.compose.runtime.Composer composer, int i) {
                    int i2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(it) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1938502477, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:73)");
                    }
                    com.moloco.sdk.internal.u.a(it, this.f7327a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
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

            /* renamed from: com.moloco.sdk.internal.u$a$a$b */
            public static final class b implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f7328a;
                public final /* synthetic */ java.lang.String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> e;

                public b(java.lang.String str, java.lang.String str2, long j, long j2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                    this.f7328a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                public final void a(androidx.compose.ui.Modifier it, androidx.compose.runtime.Composer composer, int i) {
                    int i2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(it) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-868048676, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:88)");
                    }
                    com.moloco.sdk.internal.u.a(it, this.f7328a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
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

            /* JADX WARN: Multi-variable type inference failed */
            public C0207a(kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> function1, androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> state, java.lang.String str, java.lang.String str2, long j, long j2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
                this.f7326a = function1;
                this.b = state;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = j2;
                this.g = function0;
            }

            public final void a(androidx.compose.animation.AnimatedVisibilityScope AnimatedVisibility, androidx.compose.runtime.Composer composer, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-657845797, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous> (MolocoVastCTA.kt:67)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a b2 = com.moloco.sdk.internal.u.a.b(this.b);
                if (b2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.C0294a) {
                    composer.startReplaceableGroup(-388729961);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.g, this.f7326a, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -1938502477, true, new com.moloco.sdk.internal.u.a.C0207a.C0208a(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.c) {
                    composer.startReplaceableGroup(-388168489);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(null, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a.g, this.f7326a, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -868048676, true, new com.moloco.sdk.internal.u.a.C0207a.b(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.b) {
                    composer.startReplaceableGroup(-387625710);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a.d) {
                    composer.startReplaceableGroup(-387568174);
                    composer.endReplaceableGroup();
                } else {
                    if (b2 != null) {
                        composer.startReplaceableGroup(-843825115);
                        composer.endReplaceableGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-387533485);
                    composer.endReplaceableGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }
        }

        public a(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.layout.PaddingValues paddingValues, java.lang.String str, java.lang.String str2, long j, long j2) {
            this.f7325a = alignment;
            this.b = paddingValues;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = j2;
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a b(androidx.compose.runtime.State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> state) {
            return state.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, java.lang.Boolean bool, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> stateFlow, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, ? extends kotlin.Unit> function1, kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(boxScope, bool.booleanValue(), stateFlow, function1, function0, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void a(androidx.compose.foundation.layout.BoxScope boxScope, boolean z, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a> currentAdPartFlow, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit> onButtonRendered, kotlin.jvm.functions.Function0<kotlin.Unit> onCTA, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCTA, "onCTA");
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-927135997, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous> (MolocoVastCTA.kt:49)");
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(androidx.compose.ui.Modifier.INSTANCE, this.f7325a)), this.b), (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -657845797, true, new com.moloco.sdk.internal.u.a.C0207a(onButtonRendered, androidx.compose.runtime.SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i >> 6) & 14, 1), this.c, this.d, this.e, this.f, onCTA)), composer, ((i >> 3) & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
    }

    public static final kotlin.Unit a(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, long j, long j2, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(modifier, str, str2, j, j2, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.jvm.functions.Function7<androidx.compose.foundation.layout.BoxScope, java.lang.Boolean, kotlinx.coroutines.flow.StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a>, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> a(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.layout.PaddingValues paddingValues, java.lang.String str, long j, long j2, java.lang.String str2, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(959702933);
        androidx.compose.ui.Alignment bottomEnd = (i2 & 1) != 0 ? androidx.compose.ui.Alignment.INSTANCE.getBottomEnd() : alignment;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = (i2 & 2) != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        java.lang.String stringResource = (i2 & 4) != 0 ? androidx.compose.ui.res.StringResources_androidKt.stringResource(com.moloco.sdk.R.string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        long m2150getWhite0d7_KjU = (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : j;
        long j3 = (i2 & 16) != 0 ? f7324a : j2;
        java.lang.String str3 = (i2 & 32) != 0 ? null : str2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(959702933, i, -1, "com.moloco.sdk.internal.molocoCTAButton (MolocoVastCTA.kt:48)");
        }
        androidx.compose.runtime.internal.ComposableLambda composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -927135997, true, new com.moloco.sdk.internal.u.a(bottomEnd, m561PaddingValues0680j_4, str3, stringResource, m2150getWhite0d7_KjU, j3));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.Modifier modifier, java.lang.String str, final java.lang.String str2, final long j, final long j2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.String str3;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2035340272);
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
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                    }
                    if ((74899 & i3) != 74898 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i4 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            str3 = null;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2035340272, i3, -1, "com.moloco.sdk.internal.MolocoVastCTA (MolocoVastCTA.kt:114)");
                        }
                        float f = 4;
                        androidx.compose.foundation.shape.RoundedCornerShape m846RoundedCornerShape0680j_4 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(f));
                        androidx.compose.ui.Modifier m246clickableXHw0xAI$default = androidx.compose.foundation.ClickableKt.m246clickableXHw0xAI$default(androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m624widthInVpY3zN4$default(modifier3, 0.0f, androidx.compose.ui.unit.Dp.m4478constructorimpl(164), 1, null), m846RoundedCornerShape0680j_4), j2, null, 2, null), null, null, 3, null), false, com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), function0, 1, null);
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m246clickableXHw0xAI$default);
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-118884691);
                        if (str3 != null) {
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m4478constructorimpl(f)), startRestartGroup, 6);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(str3, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m4478constructorimpl(36)), m846RoundedCornerShape0680j_4), startRestartGroup, ((i3 >> 3) & 14) | 48);
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.material.TextKt.m1582TextfLXpl1I(str2, androidx.compose.foundation.layout.PaddingKt.m569paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(15), androidx.compose.ui.unit.Dp.m4478constructorimpl(12)), j, 0L, null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), androidx.compose.ui.text.font.FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    }
                    final java.lang.String str4 = str3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier5 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.internal.u$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.moloco.sdk.internal.u.a(androidx.compose.ui.Modifier.this, str4, str2, j, j2, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) != 74898) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                float f2 = 4;
                androidx.compose.foundation.shape.RoundedCornerShape m846RoundedCornerShape0680j_42 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(f2));
                androidx.compose.ui.Modifier m246clickableXHw0xAI$default2 = androidx.compose.foundation.ClickableKt.m246clickableXHw0xAI$default(androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m624widthInVpY3zN4$default(modifier3, 0.0f, androidx.compose.ui.unit.Dp.m4478constructorimpl(164), 1, null), m846RoundedCornerShape0680j_42), j2, null, 2, null), null, null, 3, null), false, com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), function0, 1, null);
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
                androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion3.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m246clickableXHw0xAI$default2);
                androidx.compose.ui.Modifier modifier42 = modifier3;
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-118884691);
                if (str3 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.material.TextKt.m1582TextfLXpl1I(str2, androidx.compose.foundation.layout.PaddingKt.m569paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(15), androidx.compose.ui.unit.Dp.m4478constructorimpl(12)), j, 0L, null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), androidx.compose.ui.text.font.FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                final java.lang.String str42 = str3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) != 74898) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            float f22 = 4;
            androidx.compose.foundation.shape.RoundedCornerShape m846RoundedCornerShape0680j_422 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(f22));
            androidx.compose.ui.Modifier m246clickableXHw0xAI$default22 = androidx.compose.foundation.ClickableKt.m246clickableXHw0xAI$default(androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m624widthInVpY3zN4$default(modifier3, 0.0f, androidx.compose.ui.unit.Dp.m4478constructorimpl(164), 1, null), m846RoundedCornerShape0680j_422), j2, null, 2, null), null, null, 3, null), false, com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), function0, 1, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center22 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Alignment.Vertical centerVertically22 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy22 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = companion32.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m246clickableXHw0xAI$default22);
            androidx.compose.ui.Modifier modifier422 = modifier3;
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy22, companion32.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = companion32.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance22 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-118884691);
            if (str3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.TextKt.m1582TextfLXpl1I(str2, androidx.compose.foundation.layout.PaddingKt.m569paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(15), androidx.compose.ui.unit.Dp.m4478constructorimpl(12)), j, 0L, null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), androidx.compose.ui.text.font.FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier422;
            final java.lang.String str422 = str3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str3 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        float f222 = 4;
        androidx.compose.foundation.shape.RoundedCornerShape m846RoundedCornerShape0680j_4222 = androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(f222));
        androidx.compose.ui.Modifier m246clickableXHw0xAI$default222 = androidx.compose.foundation.ClickableKt.m246clickableXHw0xAI$default(androidx.compose.animation.AnimationModifierKt.animateContentSize$default(androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m624widthInVpY3zN4$default(modifier3, 0.0f, androidx.compose.ui.unit.Dp.m4478constructorimpl(164), 1, null), m846RoundedCornerShape0680j_4222), j2, null, 2, null), null, null, 3, null), false, com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.CTA, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), function0, 1, null);
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center222 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
        androidx.compose.ui.Alignment.Vertical centerVertically222 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy222 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion322 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = companion322.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m246clickableXHw0xAI$default222);
        androidx.compose.ui.Modifier modifier4222 = modifier3;
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy222, companion322.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, companion322.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = companion322.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance222 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-118884691);
        if (str3 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.material.TextKt.m1582TextfLXpl1I(str2, androidx.compose.foundation.layout.PaddingKt.m569paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(15), androidx.compose.ui.unit.Dp.m4478constructorimpl(12)), j, 0L, null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), androidx.compose.ui.text.font.FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier4222;
        final java.lang.String str4222 = str3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long a() {
        return f7324a;
    }
}
