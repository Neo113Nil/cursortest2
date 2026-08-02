package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\f\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\r2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u000e\u001aD\u0010\u0018\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ContextMenuArea", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "", "enabled", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Landroidx/compose/foundation/text/TextContextMenuItems;", "item", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "Lkotlin/ExtensionFunctionType;", "onClick", "textItem", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Landroid/content/res/Resources;Landroidx/compose/foundation/text/TextContextMenuItems;ZLkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {
    public static final void ContextMenuArea(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2080741862);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(2080741862, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:33)");
            }
            androidx.compose.foundation.text.CommonContextMenuAreaKt.CommonContextMenuArea(textFieldSelectionManager, function2, startRestartGroup, i2 & 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    ((java.lang.Integer) obj2).intValue();
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.ContextMenu_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, function2, i, (androidx.compose.runtime.Composer) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
    }

    public static final void ContextMenuArea(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, final boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-579239002);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-579239002, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            androidx.compose.foundation.text.CommonContextMenuAreaKt.CommonContextMenuArea(textFieldSelectionState, z, function2, startRestartGroup, i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.foundation.text.ContextMenu_androidKt.Camera2StreamConfigurationMap(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, z, function2, i, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    public static final void ContextMenuArea(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-954926513);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-954926513, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:49)");
            }
            androidx.compose.foundation.text.CommonContextMenuAreaKt.CommonContextMenuArea(selectionManager, function2, startRestartGroup, i2 & 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.foundation.text.ContextMenu_androidKt.Camera2StreamConfigurationMap(androidx.compose.foundation.text.selection.SelectionManager.this, function2, i, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    public static final void textItem(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, android.content.res.Resources resources, androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, kotlin.Unit> function1) {
        if (z) {
            androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt.item(textContextMenuBuilderScope, textContextMenuItems.getKey(), resources.getString(textContextMenuItems.getStringId()), textContextMenuItems.getDrawableId(), function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.text.selection.SelectionManager selectionManager, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        ContextMenuArea(selectionManager, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        ContextMenuArea(textFieldSelectionState, z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        ContextMenuArea(textFieldSelectionManager, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
