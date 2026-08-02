package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u0005\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a!\u0010\u001a\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"ProvideDefaultTextContextMenuDropdown", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "defaultTextContextMenuDropdown", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "DefaultPopupProperties", "Landroidx/compose/ui/window/PopupProperties;", "OpenContextMenu", "session", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "dataProvider", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "anchorLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DefaultTextContextMenuDropdown", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "(Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;Landroidx/compose/runtime/Composer;I)V", "IconBox", "resId", "", "tint", "Landroidx/compose/ui/graphics/Color;", "IconBox-RPmYEkk", "(IJLandroidx/compose/runtime/Composer;I)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultTextContextMenuDropdownProvider_androidKt {
    private static final androidx.compose.ui.window.PopupProperties getHighSpeedVideoFpsRanges = new androidx.compose.ui.window.PopupProperties(true, false, false, false, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    public static final void ProvideDefaultTextContextMenuDropdown(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(422095256);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(422095256, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:71)");
            }
            androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu(androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider(), androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.INSTANCE.getLambda$129995601$foundation(), function2, startRestartGroup, ((i2 << 6) & 896) | 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$ZKul9nDFo4jV7ybaaftiFtx2Uac(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ProvideDefaultTextContextMenuDropdown(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1392105195);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1392105195, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu(modifier, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider(), androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.INSTANCE.getLambda$636288403$foundation(), function2, startRestartGroup, (i2 & 14) | 432 | ((i2 << 6) & 7168));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.m2154$r8$lambda$jmLhKU1P6PhC4UlxkdKefyzA(androidx.compose.ui.Modifier.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider defaultTextContextMenuDropdown(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1197778906, i, -1, "androidx.compose.foundation.text.contextmenu.internal.defaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:98)");
        }
        androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider = androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.basicTextContextMenuProvider(androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.INSTANCE.m2151getLambda$1357803046$foundation(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return basicTextContextMenuProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(final androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, final androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, final kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(textContextMenuSession) : startRestartGroup.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(textContextMenuDataProvider) : startRestartGroup.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        boolean z = false;
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2040393164, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changed(textContextMenuDataProvider));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.text.contextmenu.internal.MaintainWindowPositionPopupPositionProvider(new androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.ui.unit.IntOffset m8720boximpl;
                        m8720boximpl = androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider.this.mo2160positiontuRUvjQ((androidx.compose.ui.layout.LayoutCoordinates) function0.invoke())));
                        return m8720boximpl;
                    }
                }, (kotlin.jvm.functions.Function2) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.text.contextmenu.internal.MaintainWindowPositionPopupPositionProvider maintainWindowPositionPopupPositionProvider = (androidx.compose.foundation.text.contextmenu.internal.MaintainWindowPositionPopupPositionProvider) rememberedValue;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(textContextMenuSession))) {
                z = true;
            }
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.m2153$r8$lambda$Y9RHtm8EFKhIlq3Tf3c6rLn6Dk(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup(maintainWindowPositionPopupPositionProvider, (kotlin.jvm.functions.Function0) rememberedValue2, getHighSpeedVideoFpsRanges, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1315155414, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$UhvivwHFQK3sL7H0S1EpgfQJlTs(androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider.this, textContextMenuSession, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3456, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$KboHzVubHrTRYPmdfsy43bP6j1k(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession.this, textContextMenuDataProvider, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, final androidx.compose.foundation.text.contextmenu.data.TextContextMenuData textContextMenuData, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        final android.content.Context context;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1904307118);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(textContextMenuSession) : startRestartGroup.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(textContextMenuData) ? 32 : 16;
        }
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1904307118, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                startRestartGroup.startReplaceGroup(-1009482584);
                context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1009433480);
                startRestartGroup.endReplaceGroup();
                context = null;
            }
            boolean changedInstance = startRestartGroup.changedInstance(textContextMenuData);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !startRestartGroup.changedInstance(textContextMenuSession))) {
                z = false;
            }
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance2 | changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.m2155$r8$lambda$ww830TBVrFKXVjb4uOeIOSMedo(androidx.compose.foundation.text.contextmenu.data.TextContextMenuData.this, context, textContextMenuSession, (androidx.compose.foundation.contextmenu.ContextMenuScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuColumnBuilder(null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.m2152$r8$lambda$JaIfPf2TmRh1eVInpCYtZSDQoA(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession.this, textContextMenuData, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(final int i, final long j, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1240244237, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean changed = startRestartGroup.changed(context);
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = java.lang.Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int intValue = ((java.lang.Number) rememberedValue).intValue();
            if (intValue == -1) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$zY98EoA9yvwPYbuqLeK17WqhSvQ(i, j, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
            androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(intValue, startRestartGroup, 0);
            boolean z2 = (i3 & 112) == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = j == 16 ? null : androidx.compose.ui.graphics.ColorFilter.Companion.m6037tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, j, 0, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.PainterModifierKt.paint$default(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.contextmenu.ContextMenuSpec.INSTANCE.m1394getIconSizeD9Ej5fM()), painterResource, false, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) rememberedValue2, 22, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$Av5vJGqEM3DeoWcCc5FuIUpPqKU(i, j, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Av5vJGqEM3DeoWcCc5FuIUpPqKU(int i, long j, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(i, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JaIfPf2TmR-h1eVInpCYtZSDQoA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2152$r8$lambda$JaIfPf2TmRh1eVInpCYtZSDQoA(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, androidx.compose.foundation.text.contextmenu.data.TextContextMenuData textContextMenuData, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(textContextMenuSession, textContextMenuData, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$JhNMmkcFebL4F8RFVyRITua8CsM(androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent textContextMenuComponent, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(666084174);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(666084174, i, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
        }
        java.lang.String label = ((androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem) textContextMenuComponent).getLabel();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return label;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KboHzVubHrTRYPmdfsy43bP6j1k(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(textContextMenuSession, textContextMenuDataProvider, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UhvivwHFQK3sL7H0S1EpgfQJlTs(androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1315155414, i, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
            }
            boolean changed = composer.changed(textContextMenuDataProvider);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(textContextMenuDataProvider));
                composer.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRanges(textContextMenuSession, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuData) ((androidx.compose.runtime.State) rememberedValue).getValue(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y9RHtm8EFKhIlq3Tf3-c6rLn6Dk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2153$r8$lambda$Y9RHtm8EFKhIlq3Tf3c6rLn6Dk(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession) {
        textContextMenuSession.close();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZKul9nDFo4jV7ybaaftiFtx2Uac(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvideDefaultTextContextMenuDropdown(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jm-LhKU1P6PhC4U-lxkdKefy-zA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2154$r8$lambda$jmLhKU1P6PhC4UlxkdKefyzA(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvideDefaultTextContextMenuDropdown(modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ww830TBVrFKXVjb-4uOeIOSMedo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2155$r8$lambda$ww830TBVrFKXVjb4uOeIOSMedo(androidx.compose.foundation.text.contextmenu.data.TextContextMenuData textContextMenuData, android.content.Context context, final androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope) {
        java.util.List<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent> components = textContextMenuData.getComponents();
        int size = components.size();
        for (int i = 0; i < size; i++) {
            final androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent textContextMenuComponent = components.get(i);
            if (textContextMenuComponent instanceof androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem) {
                androidx.compose.foundation.contextmenu.ContextMenuScope.item$default(contextMenuScope, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$JhNMmkcFebL4F8RFVyRITua8CsM(androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, null, false, ((androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem) textContextMenuComponent).getLeadingIcon() == 0 ? null : androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1930700965, true, new kotlin.jvm.functions.Function3<androidx.compose.ui.graphics.Color, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$DefaultTextContextMenuDropdown$1$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Color color, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        long m6006unboximpl = color.m6006unboximpl();
                        androidx.compose.runtime.Composer composer2 = composer;
                        int intValue = num.intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= composer2.changed(m6006unboximpl) ? 4 : 2;
                        }
                        if (composer2.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1930700965, intValue, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
                            }
                            androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.getHighSpeedVideoFpsRanges(((androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem) androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent.this).getLeadingIcon(), m6006unboximpl, composer2, (intValue << 3) & 112);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.m2156$r8$lambda$yTfaDh9hAXwJ9f2TWpXQAtFhW0(androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent.this, textContextMenuSession);
                    }
                }, 6, null);
            } else if (textContextMenuComponent instanceof androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(contextMenuScope, context, (androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem) textContextMenuComponent);
                }
            } else if (textContextMenuComponent instanceof androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator) {
                contextMenuScope.separator();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yTfaDh9hAXw-J9f2TWpXQAtFhW0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2156$r8$lambda$yTfaDh9hAXwJ9f2TWpXQAtFhW0(androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent textContextMenuComponent, androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession) {
        ((androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem) textContextMenuComponent).getOnClick().invoke(textContextMenuSession);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zY98EoA9yvwPYbuqLeK17WqhSvQ(int i, long j, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(i, j, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
