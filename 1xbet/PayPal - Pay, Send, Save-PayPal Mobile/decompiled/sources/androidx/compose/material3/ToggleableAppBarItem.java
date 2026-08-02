package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BF\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/material3/ToggleableAppBarItem;", "Landroidx/compose/material3/AppBarItem;", "", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "icon", "enabled", "", "label", "<init>", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;)V", "AppbarContent", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/AppBarMenuState;", "state", "MenuContent", "(Landroidx/compose/material3/AppBarMenuState;Landroidx/compose/runtime/Composer;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ToggleableAppBarItem implements androidx.compose.material3.AppBarItem {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableAppBarItem(boolean z, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z2, java.lang.String str) {
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRanges = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // androidx.compose.material3.AppBarItem
    public final void AppbarContent(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-53051696);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-53051696, i2, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent (AppBarDsl.kt:193)");
            }
            androidx.compose.material3.TooltipKt.TooltipBox(androidx.compose.material3.TooltipDefaults.INSTANCE.m4167rememberTooltipPositionProviderHu5FAss(androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4154getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1965247803, true, new kotlin.jvm.functions.Function3<androidx.compose.material3.TooltipScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ToggleableAppBarItem$AppbarContent$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.material3.TooltipScope tooltipScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.material3.TooltipScope tooltipScope2 = tooltipScope;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? composer3.changed(tooltipScope2) : composer3.changedInstance(tooltipScope2) ? 4 : 2;
                    }
                    if (composer3.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1965247803, intValue, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:198)");
                        }
                        final androidx.compose.material3.ToggleableAppBarItem toggleableAppBarItem = androidx.compose.material3.ToggleableAppBarItem.this;
                        androidx.compose.material3.TooltipKt.m4175PlainTooltipgv3ox5I(tooltipScope2, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2059984663, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ToggleableAppBarItem$AppbarContent$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                java.lang.String str;
                                androidx.compose.runtime.Composer composer5 = composer4;
                                int intValue2 = num2.intValue();
                                if (composer5.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(2059984663, intValue2, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:198)");
                                    }
                                    str = androidx.compose.material3.ToggleableAppBarItem.this.getHighResolutionOutputSizeshNQ4ISI;
                                    androidx.compose.material3.TextKt.m3985TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 0, 0, 262142);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, (intValue & 14) | 805306368, 255);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), androidx.compose.material3.TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(694023085, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ToggleableAppBarItem$AppbarContent$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    boolean z;
                    kotlin.jvm.functions.Function1 function1;
                    boolean z2;
                    kotlin.jvm.functions.Function2 function2;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    if (composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(694023085, intValue, -1, "androidx.compose.material3.ToggleableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:201)");
                        }
                        z = androidx.compose.material3.ToggleableAppBarItem.this.getHighSpeedVideoSizes;
                        function1 = androidx.compose.material3.ToggleableAppBarItem.this.getHighSpeedVideoFpsRangesFor;
                        z2 = androidx.compose.material3.ToggleableAppBarItem.this.getHighSpeedVideoFpsRanges;
                        function2 = androidx.compose.material3.ToggleableAppBarItem.this.Camera2StreamConfigurationMap;
                        androidx.compose.material3.IconButtonKt.IconToggleButton(z, function1, null, z2, null, null, null, function2, composer3, 0, 116);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), startRestartGroup, 100663344, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ToggleableAppBarItem$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ToggleableAppBarItem.$r8$lambda$BekebhsjplHU06YVGhcfQFs5ZvU(androidx.compose.material3.ToggleableAppBarItem.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.AppBarItem
    public final void MenuContent(final androidx.compose.material3.AppBarMenuState appBarMenuState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1187385573);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appBarMenuState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1187385573, i2, -1, "androidx.compose.material3.ToggleableAppBarItem.MenuContent (AppBarDsl.kt:211)");
            }
            boolean z = this.getHighSpeedVideoFpsRanges;
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-269621941, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ToggleableAppBarItem$MenuContent$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    java.lang.String str;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    if (composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-269621941, intValue, -1, "androidx.compose.material3.ToggleableAppBarItem.MenuContent.<anonymous> (AppBarDsl.kt:214)");
                        }
                        str = androidx.compose.material3.ToggleableAppBarItem.this.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.compose.material3.TextKt.m3985TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 262142);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54);
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ToggleableAppBarItem$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.ToggleableAppBarItem.$r8$lambda$k3ocgOw1F6X6fJ3MP6_hcBOINJY(androidx.compose.material3.ToggleableAppBarItem.this, appBarMenuState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, z, null, null, null, startRestartGroup, 6, 476);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ToggleableAppBarItem$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ToggleableAppBarItem.$r8$lambda$3s6S7ICSa6X1N9dOgo_uUr_zJyk(androidx.compose.material3.ToggleableAppBarItem.this, appBarMenuState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3s6S7ICSa6X1N9dOgo_uUr_zJyk(androidx.compose.material3.ToggleableAppBarItem toggleableAppBarItem, androidx.compose.material3.AppBarMenuState appBarMenuState, int i, androidx.compose.runtime.Composer composer, int i2) {
        toggleableAppBarItem.MenuContent(appBarMenuState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BekebhsjplHU06YVGhcfQFs5ZvU(androidx.compose.material3.ToggleableAppBarItem toggleableAppBarItem, int i, androidx.compose.runtime.Composer composer, int i2) {
        toggleableAppBarItem.AppbarContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k3ocgOw1F6X6fJ3MP6_hcBOINJY(androidx.compose.material3.ToggleableAppBarItem toggleableAppBarItem, androidx.compose.material3.AppBarMenuState appBarMenuState) {
        toggleableAppBarItem.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Boolean.valueOf(!toggleableAppBarItem.getHighSpeedVideoSizes));
        appBarMenuState.dismiss();
        return kotlin.Unit.INSTANCE;
    }
}
