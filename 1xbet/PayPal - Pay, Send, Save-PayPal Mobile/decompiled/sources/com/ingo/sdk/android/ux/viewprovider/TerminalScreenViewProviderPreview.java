package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/TerminalScreenViewProviderPreview;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "<init>", "()V", "", "preview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TerminalScreenViewProviderPreview extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable;

    public TerminalScreenViewProviderPreview() {
        super(null, null, null, 7, null);
    }

    public final void preview(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-468078894);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProviderPreview$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            new com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider("$95.00 has been added to your balance", "Some Details", (kotlin.jvm.functions.Function0) rememberedValue, "Cash Another Check", null, "Done", null, "Customer Support", null, com.ingo.sdk.android.ux.R.drawable.ic_success_status_icon, android.graphics.Color.parseColor(currentTheme(startRestartGroup, (i2 & 14) | com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable).getSecondaryColor()), null, 2384, null).View(startRestartGroup, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProviderPreview$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProviderPreview.$r8$lambda$eOXnvkKlITG5evN_Z99saGbn9Ww(com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProviderPreview.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eOXnvkKlITG5evN_Z99saGbn9Ww(com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProviderPreview terminalScreenViewProviderPreview, int i, androidx.compose.runtime.Composer composer, int i2) {
        terminalScreenViewProviderPreview.preview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
