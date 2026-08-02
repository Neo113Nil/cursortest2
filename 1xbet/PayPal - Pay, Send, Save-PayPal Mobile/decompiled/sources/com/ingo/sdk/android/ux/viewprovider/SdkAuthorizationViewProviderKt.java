package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "preview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SdkAuthorizationViewProviderKt {
    public static final void preview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1988904725);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            new com.ingo.sdk.android.ux.viewprovider.SdkAuthorizationViewProvider(mutableState, mutableState2, mutableState3, (androidx.compose.runtime.MutableState) rememberedValue4).View(startRestartGroup, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.SdkAuthorizationViewProviderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.SdkAuthorizationViewProviderKt.$r8$lambda$Ir0AIJVhBkxxdj7km1phS0NEEwQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ir0AIJVhBkxxdj7km1phS0NEEwQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        preview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
