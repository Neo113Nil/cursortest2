package androidx.compose.material;

/* compiled from: SnackbarHost.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001a:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*b\b\u0002\u0010%\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f¨\u0006("}, d2 = {"SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "FadeInFadeOutWithScale", "", "current", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SnackbarHost", "hostState", "Landroidx/compose/material/SnackbarHostState;", "snackbar", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", com.helpshift.HelpshiftEvent.DATA_SDK_VISIBLE, "", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "toMillis", "", "Landroidx/compose/material/SnackbarDuration;", "hasAction", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutTransition", "Lkotlin/ParameterName;", "name", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* compiled from: SnackbarHost.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material.SnackbarDuration.values().length];
            iArr[androidx.compose.material.SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[androidx.compose.material.SnackbarDuration.Long.ordinal()] = 2;
            iArr[androidx.compose.material.SnackbarDuration.Short.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SnackbarHost(final androidx.compose.material.SnackbarHostState hostState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostState, "hostState");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(431012348);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SnackbarHost)156@6461L7,157@6473L340,167@6818L134:SnackbarHost.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(hostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function32 = function3;
                i3 |= startRestartGroup.changed(function3) ? 256 : 128;
                if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1345getLambda1$material_release = i4 != 0 ? androidx.compose.material.ComposableSingletons$SnackbarHostKt.INSTANCE.m1345getLambda1$material_release() : function32;
                    androidx.compose.material.SnackbarData currentSnackbarData = hostState.getCurrentSnackbarData();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.AccessibilityManager> localAccessibilityManager = androidx.compose.ui.platform.CompositionLocalsKt.getLocalAccessibilityManager();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = startRestartGroup.consume(localAccessibilityManager);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(currentSnackbarData, new androidx.compose.material.SnackbarHostKt$SnackbarHost$1(currentSnackbarData, (androidx.compose.ui.platform.AccessibilityManager) consume, null), startRestartGroup, 0);
                    FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), companion, m1345getLambda1$material_release, startRestartGroup, (i3 & 112) | (i3 & 896), 0);
                    modifier3 = companion;
                    function33 = m1345getLambda1$material_release;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function33 = function32;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                        androidx.compose.material.SnackbarHostKt.SnackbarHost(androidx.compose.material.SnackbarHostState.this, modifier3, function33, composer2, i | 1, i2);
                    }
                });
                return;
            }
            function32 = function3;
            if ((i3 & 731) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            androidx.compose.material.SnackbarData currentSnackbarData2 = hostState.getCurrentSnackbarData();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.AccessibilityManager> localAccessibilityManager2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalAccessibilityManager();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localAccessibilityManager2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(currentSnackbarData2, new androidx.compose.material.SnackbarHostKt$SnackbarHost$1(currentSnackbarData2, (androidx.compose.ui.platform.AccessibilityManager) consume2, null), startRestartGroup, 0);
            FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), companion, m1345getLambda1$material_release, startRestartGroup, (i3 & 112) | (i3 & 896), 0);
            modifier3 = companion;
            function33 = m1345getLambda1$material_release;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function32 = function3;
        if ((i3 & 731) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        androidx.compose.material.SnackbarData currentSnackbarData22 = hostState.getCurrentSnackbarData();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.AccessibilityManager> localAccessibilityManager22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalAccessibilityManager();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22 = startRestartGroup.consume(localAccessibilityManager22);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.runtime.EffectsKt.LaunchedEffect(currentSnackbarData22, new androidx.compose.material.SnackbarHostKt$SnackbarHost$1(currentSnackbarData22, (androidx.compose.ui.platform.AccessibilityManager) consume22, null), startRestartGroup, 0);
        FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), companion, m1345getLambda1$material_release, startRestartGroup, (i3 & 112) | (i3 & 896), 0);
        modifier3 = companion;
        function33 = m1345getLambda1$material_release;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long toMillis(androidx.compose.material.SnackbarDuration snackbarDuration, boolean z, androidx.compose.ui.platform.AccessibilityManager accessibilityManager) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i = androidx.compose.material.SnackbarHostKt.WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            j = 4000;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0215 A[LOOP:2: B:49:0x0213->B:50:0x0215, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FadeInFadeOutWithScale(final androidx.compose.material.SnackbarData snackbarData, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final int i3;
        androidx.compose.ui.Modifier modifier2;
        java.lang.Object rememberedValue;
        final androidx.compose.material.FadeInFadeOutState fadeInFadeOutState;
        int i4;
        int size;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2036134589);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(FadeInFadeOutWithScale)P(1,2)261@9210L48,315@11457L246:SnackbarHost.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(function3) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                androidx.compose.ui.Modifier.Companion companion = i5 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.material.FadeInFadeOutState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                fadeInFadeOutState = (androidx.compose.material.FadeInFadeOutState) rememberedValue;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                    fadeInFadeOutState.setCurrent(snackbarData);
                    java.util.List items = fadeInFadeOutState.getItems();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
                    java.util.Iterator it = items.iterator();
                    while (it.hasNext()) {
                        arrayList.add((androidx.compose.material.SnackbarData) ((androidx.compose.material.FadeInFadeOutAnimationItem) it.next()).getKey());
                    }
                    final java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList);
                    if (!mutableList.contains(snackbarData)) {
                        mutableList.add(snackbarData);
                    }
                    fadeInFadeOutState.getItems().clear();
                    java.util.List<androidx.compose.material.SnackbarData> filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(mutableList);
                    java.util.List items2 = fadeInFadeOutState.getItems();
                    for (final androidx.compose.material.SnackbarData snackbarData2 : filterNotNull) {
                        items2.add(new androidx.compose.material.FadeInFadeOutAnimationItem(snackbarData2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -94104314, true, new kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends kotlin.Unit> function2, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> children, androidx.compose.runtime.Composer composer2, int i6) {
                                int i7;
                                androidx.compose.runtime.State animatedOpacity;
                                androidx.compose.runtime.State animatedScale;
                                androidx.compose.ui.Modifier m2276graphicsLayerpANQ8Wg;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(children, "children");
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C275@9962L618,290@10609L292,298@10918L504:SnackbarHost.kt#jmzs0o");
                                if ((i6 & 14) == 0) {
                                    i7 = i6 | (composer2.changed(children) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 91) != 18 || !composer2.getSkipping()) {
                                    boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.SnackbarData.this, snackbarData);
                                    int i8 = areEqual ? androidx.compose.material.TextFieldImplKt.AnimationDuration : 75;
                                    int i9 = (!areEqual || kotlin.collections.CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                                    androidx.compose.animation.core.TweenSpec tween = androidx.compose.animation.core.AnimationSpecKt.tween(i8, i9, androidx.compose.animation.core.EasingKt.getLinearEasing());
                                    final androidx.compose.material.SnackbarData snackbarData3 = androidx.compose.material.SnackbarData.this;
                                    final androidx.compose.material.FadeInFadeOutState<androidx.compose.material.SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                                    animatedOpacity = androidx.compose.material.SnackbarHostKt.animatedOpacity(tween, areEqual, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                            invoke2();
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material.SnackbarData.this, fadeInFadeOutState2.getCurrent())) {
                                                return;
                                            }
                                            java.util.List<androidx.compose.material.FadeInFadeOutAnimationItem<androidx.compose.material.SnackbarData>> items3 = fadeInFadeOutState2.getItems();
                                            final androidx.compose.material.SnackbarData snackbarData4 = androidx.compose.material.SnackbarData.this;
                                            kotlin.collections.CollectionsKt.removeAll((java.util.List) items3, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.material.FadeInFadeOutAnimationItem<androidx.compose.material.SnackbarData>, java.lang.Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Boolean invoke(androidx.compose.material.FadeInFadeOutAnimationItem<androidx.compose.material.SnackbarData> it2) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it2, "it");
                                                    return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(it2.getKey(), androidx.compose.material.SnackbarData.this));
                                                }
                                            });
                                            androidx.compose.runtime.RecomposeScope scope = fadeInFadeOutState2.getScope();
                                            if (scope != null) {
                                                scope.invalidate();
                                            }
                                        }
                                    }, composer2, 0, 0);
                                    animatedScale = androidx.compose.material.SnackbarHostKt.animatedScale(androidx.compose.animation.core.AnimationSpecKt.tween(i8, i9, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing()), areEqual, composer2, 0);
                                    m2276graphicsLayerpANQ8Wg = androidx.compose.ui.graphics.GraphicsLayerModifierKt.m2276graphicsLayerpANQ8Wg(androidx.compose.ui.Modifier.INSTANCE, (r39 & 1) != 0 ? 1.0f : ((java.lang.Number) animatedScale.getValue()).floatValue(), (r39 & 2) != 0 ? 1.0f : ((java.lang.Number) animatedScale.getValue()).floatValue(), (r39 & 4) == 0 ? ((java.lang.Number) animatedOpacity.getValue()).floatValue() : 1.0f, (r39 & 8) != 0 ? 0.0f : 0.0f, (r39 & 16) != 0 ? 0.0f : 0.0f, (r39 & 32) != 0 ? 0.0f : 0.0f, (r39 & 64) != 0 ? 0.0f : 0.0f, (r39 & 128) != 0 ? 0.0f : 0.0f, (r39 & 256) == 0 ? 0.0f : 0.0f, (r39 & 512) != 0 ? 8.0f : 0.0f, (r39 & 1024) != 0 ? androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ() : 0L, (r39 & 2048) != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : null, (r39 & 4096) != 0 ? false : false, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r39 & 32768) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : 0L);
                                    final androidx.compose.material.SnackbarData snackbarData4 = androidx.compose.material.SnackbarData.this;
                                    androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m2276graphicsLayerpANQ8Wg, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.m3807setLiveRegionhR3wRGc(semantics, androidx.compose.ui.semantics.LiveRegionMode.INSTANCE.m3784getPolite0phEisY());
                                            final androidx.compose.material.SnackbarData snackbarData5 = androidx.compose.material.SnackbarData.this;
                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Boolean invoke() {
                                                    androidx.compose.material.SnackbarData.this.dismiss();
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    }, 1, null);
                                    composer2.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = composer2.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume2 = composer2.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = composer2.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(semantics$default);
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-2137368960);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-421978688);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C310@11394L10:SnackbarHost.kt#jmzs0o");
                                    children.invoke(composer2, java.lang.Integer.valueOf(i7 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        })));
                    }
                }
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = startRestartGroup.consume(localDensity);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume3 = startRestartGroup.consume(localViewConfiguration);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1788016521);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C316@11495L21:SnackbarHost.kt#jmzs0o");
                fadeInFadeOutState.setScope(androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0));
                java.util.List items3 = fadeInFadeOutState.getItems();
                size = items3.size();
                for (i4 = 0; i4 < size; i4++) {
                    androidx.compose.material.FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (androidx.compose.material.FadeInFadeOutAnimationItem) items3.get(i4);
                    final androidx.compose.material.SnackbarData snackbarData3 = (androidx.compose.material.SnackbarData) fadeInFadeOutAnimationItem.component1();
                    kotlin.jvm.functions.Function3<kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component2 = fadeInFadeOutAnimationItem.component2();
                    startRestartGroup.startMovableGroup(-208579897, snackbarData3);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "319@11610L63");
                    component2.invoke(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 2041982076, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C320@11640L15:SnackbarHost.kt#jmzs0o");
                            if ((i6 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                            androidx.compose.material.SnackbarData snackbarData4 = snackbarData3;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(snackbarData4);
                            function32.invoke(snackbarData4, composer2, java.lang.Integer.valueOf((i3 >> 3) & 112));
                        }
                    }), startRestartGroup, 6);
                    startRestartGroup.endMovableGroup();
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                    androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material.SnackbarData.this, modifier3, function3, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) == 146) {
        }
        if (i5 == 0) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        fadeInFadeOutState = (androidx.compose.material.FadeInFadeOutState) rememberedValue;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
        }
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume4 = startRestartGroup.consume(localDensity2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22 = startRestartGroup.consume(localLayoutDirection2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume22;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32 = startRestartGroup.consume(localViewConfiguration2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume32;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(companion);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1788016521);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C316@11495L21:SnackbarHost.kt#jmzs0o");
        fadeInFadeOutState.setScope(androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0));
        java.util.List items32 = fadeInFadeOutState.getItems();
        size = items32.size();
        while (i4 < size) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.State<java.lang.Float> animatedOpacity(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1016418159);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animatedOpacity)P(!1,2)347@12351L49,348@12405L169:SnackbarHost.kt#jmzs0o");
        if ((i2 & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.SnackbarHostKt$animatedOpacity$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.animation.core.AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue;
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), new androidx.compose.material.SnackbarHostKt$animatedOpacity$2(animatable, z, animationSpec, function02, null), composer, (i >> 3) & 14);
        androidx.compose.runtime.State<java.lang.Float> asState = animatable.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.State<java.lang.Float> animatedScale(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(2003504988);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(animatedScale)360@12726L51,361@12782L143:SnackbarHost.kt#jmzs0o");
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.animation.core.AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue;
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), new androidx.compose.material.SnackbarHostKt$animatedScale$1(animatable, z, animationSpec, null), composer, (i >> 3) & 14);
        androidx.compose.runtime.State<java.lang.Float> asState = animatable.asState();
        composer.endReplaceableGroup();
        return asState;
    }
}
