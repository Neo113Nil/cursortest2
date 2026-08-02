package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Lkotlin/Function1;", "", "onResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "rememberLauncherForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityResultRegistryKt {
    public static final <I, O> androidx.view.compose.ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(final androidx.view.result.contract.ActivityResultContract<I, O> activityResultContract, kotlin.jvm.functions.Function1<? super O, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1408504823, i, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, i & 14);
        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 3) & 14);
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.lang.String obj;
                    obj = java.util.UUID.randomUUID().toString();
                    return obj;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        final java.lang.String str = (java.lang.String) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, composer, 48);
        androidx.view.result.ActivityResultRegistryOwner current = androidx.view.compose.LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        final androidx.view.result.ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.view.compose.ActivityResultLauncherHolder();
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.view.compose.ActivityResultLauncherHolder activityResultLauncherHolder = (androidx.view.compose.ActivityResultLauncherHolder) rememberedValue2;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.view.compose.ManagedActivityResultLauncher(activityResultLauncherHolder, rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.view.compose.ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (androidx.view.compose.ManagedActivityResultLauncher) rememberedValue3;
        boolean changedInstance = composer.changedInstance(activityResultLauncherHolder);
        boolean changedInstance2 = composer.changedInstance(activityResultRegistry);
        boolean changed = composer.changed(str);
        boolean changedInstance3 = composer.changedInstance(activityResultContract);
        boolean changed2 = composer.changed(rememberUpdatedState2);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changedInstance | changedInstance2 | changed | changedInstance3 | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.compose.ActivityResultRegistryKt.$r8$lambda$YAfMonS2ROkWVWyfbsXWPpLpnb0(androidx.view.compose.ActivityResultLauncherHolder.this, activityResultRegistry, str, activityResultContract, rememberUpdatedState2, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(activityResultRegistry, str, activityResultContract, (kotlin.jvm.functions.Function1) rememberedValue4, composer, (i << 6) & 896);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return managedActivityResultLauncher;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$YAfMonS2ROkWVWyfbsXWPpLpnb0(final androidx.view.compose.ActivityResultLauncherHolder activityResultLauncherHolder, androidx.view.result.ActivityResultRegistry activityResultRegistry, java.lang.String str, androidx.view.result.contract.ActivityResultContract activityResultContract, final androidx.compose.runtime.State state, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        activityResultLauncherHolder.setLauncher(activityResultRegistry.register(str, activityResultContract, new androidx.view.result.ActivityResultCallback() { // from class: androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ((kotlin.jvm.functions.Function1) androidx.compose.runtime.State.this.getValue()).invoke(obj);
            }
        }));
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.compose.ActivityResultLauncherHolder.this.unregister();
            }
        };
    }
}
