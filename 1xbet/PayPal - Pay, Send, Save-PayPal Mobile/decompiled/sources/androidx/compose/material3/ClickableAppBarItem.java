package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B8\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/material3/ClickableAppBarItem;", "Landroidx/compose/material3/AppBarItem;", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/runtime/Composable;", "icon", "", "enabled", "", "label", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;)V", "AppbarContent", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/AppBarMenuState;", "state", "MenuContent", "(Landroidx/compose/material3/AppBarMenuState;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickableAppBarItem implements androidx.compose.material3.AppBarItem {
    public static final int $stable = 0;
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableAppBarItem(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // androidx.compose.material3.AppBarItem
    public final void AppbarContent(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1170649368);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1170649368, i2, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent (AppBarDsl.kt:158)");
            }
            androidx.compose.material3.TooltipKt.TooltipBox(androidx.compose.material3.TooltipDefaults.INSTANCE.m4167rememberTooltipPositionProviderHu5FAss(androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4154getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-816691117, true, new kotlin.jvm.functions.Function3<androidx.compose.material3.TooltipScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ClickableAppBarItem$AppbarContent$1
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
                            androidx.compose.runtime.ComposerKt.traceEventStart(-816691117, intValue, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:163)");
                        }
                        final androidx.compose.material3.ClickableAppBarItem clickableAppBarItem = androidx.compose.material3.ClickableAppBarItem.this;
                        androidx.compose.material3.TooltipKt.m4175PlainTooltipgv3ox5I(tooltipScope2, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(837175745, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ClickableAppBarItem$AppbarContent$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                java.lang.String str;
                                androidx.compose.runtime.Composer composer5 = composer4;
                                int intValue2 = num2.intValue();
                                if (composer5.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(837175745, intValue2, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous>.<anonymous> (AppBarDsl.kt:163)");
                                    }
                                    str = androidx.compose.material3.ClickableAppBarItem.this.Camera2StreamConfigurationMap;
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
            }, startRestartGroup, 54), androidx.compose.material3.TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-592360853, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ClickableAppBarItem$AppbarContent$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    kotlin.jvm.functions.Function0 function0;
                    boolean z;
                    kotlin.jvm.functions.Function2 function2;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    if (composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-592360853, intValue, -1, "androidx.compose.material3.ClickableAppBarItem.AppbarContent.<anonymous> (AppBarDsl.kt:166)");
                        }
                        function0 = androidx.compose.material3.ClickableAppBarItem.this.getHighResolutionOutputSizeshNQ4ISI;
                        z = androidx.compose.material3.ClickableAppBarItem.this.getHighSpeedVideoFpsRangesFor;
                        function2 = androidx.compose.material3.ClickableAppBarItem.this.getHighSpeedVideoFpsRanges;
                        androidx.compose.material3.IconButtonKt.IconButton(function0, null, z, null, null, null, function2, composer3, 0, 58);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ClickableAppBarItem.$r8$lambda$9cakd2MHaX1l0mBh91SAMmeqly8(androidx.compose.material3.ClickableAppBarItem.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.AppBarItem
    public final void MenuContent(final androidx.compose.material3.AppBarMenuState appBarMenuState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-791598787);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-791598787, i2, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent (AppBarDsl.kt:171)");
            }
            boolean z = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(900574477, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ClickableAppBarItem$MenuContent$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    java.lang.String str;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    if (composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(900574477, intValue, -1, "androidx.compose.material3.ClickableAppBarItem.MenuContent.<anonymous> (AppBarDsl.kt:174)");
                        }
                        str = androidx.compose.material3.ClickableAppBarItem.this.Camera2StreamConfigurationMap;
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
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.ClickableAppBarItem.$r8$lambda$xm4WQSL7wmMTrqpP9AjzScE55Zk(androidx.compose.material3.ClickableAppBarItem.this, appBarMenuState);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ClickableAppBarItem$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ClickableAppBarItem.$r8$lambda$lmtDEX27XzgREU3UZTl6SPvskTs(androidx.compose.material3.ClickableAppBarItem.this, appBarMenuState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9cakd2MHaX1l0mBh91SAMmeqly8(androidx.compose.material3.ClickableAppBarItem clickableAppBarItem, int i, androidx.compose.runtime.Composer composer, int i2) {
        clickableAppBarItem.AppbarContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lmtDEX27XzgREU3UZTl6SPvskTs(androidx.compose.material3.ClickableAppBarItem clickableAppBarItem, androidx.compose.material3.AppBarMenuState appBarMenuState, int i, androidx.compose.runtime.Composer composer, int i2) {
        clickableAppBarItem.MenuContent(appBarMenuState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xm4WQSL7wmMTrqpP9AjzScE55Zk(androidx.compose.material3.ClickableAppBarItem clickableAppBarItem, androidx.compose.material3.AppBarMenuState appBarMenuState) {
        clickableAppBarItem.getHighResolutionOutputSizeshNQ4ISI.invoke();
        appBarMenuState.dismiss();
        return kotlin.Unit.INSTANCE;
    }
}
