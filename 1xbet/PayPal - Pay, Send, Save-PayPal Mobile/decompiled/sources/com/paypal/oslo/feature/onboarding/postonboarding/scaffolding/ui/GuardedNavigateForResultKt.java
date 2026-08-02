package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a4\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Lkotlin/ParameterName;", "", "onNavigate", "rememberGuardedNavigateForResult", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GuardedNavigateForResultKt {
    public static final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> rememberGuardedNavigateForResult(final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-222919494, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.rememberGuardedNavigateForResult (GuardedNavigateForResult.kt:39)");
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(885786132, 0, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.rememberNavigationGuardState (GuardedNavigateForResult.kt:69)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.GuardedNavigateForResultKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.runtime.MutableState mutableStateOf$default;
                    mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    return mutableStateOf$default;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, composer, 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.GuardedNavigateForResultKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.GuardedNavigateForResultKt.$r8$lambda$YPddqUOMdhcN_Jb4nevIK6oq3pY(androidx.compose.runtime.MutableState.this, function1, (androidx.navigation3.runtime.NavKey) obj);
            }
        };
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function12;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YPddqUOMdhcN_Jb4nevIK6oq3pY(androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            mutableState.setValue(java.lang.Boolean.TRUE);
            function1.invoke(navKey);
        }
        return kotlin.Unit.INSTANCE;
    }
}
