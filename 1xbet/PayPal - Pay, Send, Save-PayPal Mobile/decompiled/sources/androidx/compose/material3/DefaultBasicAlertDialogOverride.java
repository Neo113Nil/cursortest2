package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/DefaultBasicAlertDialogOverride;", "Landroidx/compose/material3/BasicAlertDialogOverride;", "<init>", "()V", "Landroidx/compose/material3/BasicAlertDialogOverrideScope;", "", "BasicAlertDialog", "(Landroidx/compose/material3/BasicAlertDialogOverrideScope;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultBasicAlertDialogOverride implements androidx.compose.material3.BasicAlertDialogOverride {
    public static final int $stable = 0;
    public static final androidx.compose.material3.DefaultBasicAlertDialogOverride INSTANCE = new androidx.compose.material3.DefaultBasicAlertDialogOverride();

    private DefaultBasicAlertDialogOverride() {
    }

    @Override // androidx.compose.material3.BasicAlertDialogOverride
    public final void BasicAlertDialog(final androidx.compose.material3.BasicAlertDialogOverrideScope basicAlertDialogOverrideScope, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1565826668);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(basicAlertDialogOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1565826668, i2, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog (AlertDialog.kt:163)");
            }
            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(basicAlertDialogOverrideScope.getOnDismissRequest(), basicAlertDialogOverrideScope.getProperties(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1163527043, true, new androidx.compose.material3.DefaultBasicAlertDialogOverride$BasicAlertDialog$1(basicAlertDialogOverrideScope), startRestartGroup, 54), startRestartGroup, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DefaultBasicAlertDialogOverride$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.DefaultBasicAlertDialogOverride.$r8$lambda$7UIe5l78CVMcOoap16lBBsIx1d8(androidx.compose.material3.DefaultBasicAlertDialogOverride.this, basicAlertDialogOverrideScope, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7UIe5l78CVMcOoap16lBBsIx1d8(androidx.compose.material3.DefaultBasicAlertDialogOverride defaultBasicAlertDialogOverride, androidx.compose.material3.BasicAlertDialogOverrideScope basicAlertDialogOverrideScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        defaultBasicAlertDialogOverride.BasicAlertDialog(basicAlertDialogOverrideScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
