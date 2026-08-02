package com.paypal.oslo.feature.userprofile.ui.components.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, d2 = {"rememberCommonToastHostState", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/CommonToastHostState;", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/userprofile/ui/components/common/CommonToastHostState;", "ToastHost", "", "hostState", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/userprofile/ui/components/common/CommonToastHostState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "user-profile_prodRelease", "currentMessage", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonToastHostKt {
    public static final com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState rememberCommonToastHostState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1415163655, i, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.rememberCommonToastHostState (CommonToastHost.kt:29)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState = (com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return commonToastHostState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ToastHost(final com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonToastHostState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-186001391);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(commonToastHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-186001391, i3, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ToastHost (CommonToastHost.kt:59)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt$ToastHost$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt$ToastHost$1$1(commonToastHostState, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(commonToastHostState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i5);
            java.lang.String str = (java.lang.String) mutableState.getValue();
            if (str == null) {
                startRestartGroup.startReplaceGroup(-659225339);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-659225338);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.$r8$lambda$yzOAhIDxHJkaKVzz_79isCTy7z8(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.ToastKt.Toast(str, modifier, null, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, (i3 & 112) | 3072, 4);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.$r8$lambda$MaHlYqV1ydwJTaCNwgBv3iTtC8k(com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MaHlYqV1ydwJTaCNwgBv3iTtC8k(com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ToastHost(commonToastHostState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yzOAhIDxHJkaKVzz_79isCTy7z8(androidx.compose.runtime.MutableState mutableState, boolean z) {
        if (!z) {
            mutableState.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
