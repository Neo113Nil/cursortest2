package androidx.activity.compose;

/* compiled from: ActivityResultRegistry.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberLauncherForActivityResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "onResult", "Lkotlin/Function1;", "", "(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultRegistryKt {
    public static final <I, O> androidx.activity.compose.ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(final androidx.activity.result.contract.ActivityResultContract<I, O> contract, kotlin.jvm.functions.Function1<? super O, kotlin.Unit> onResult, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contract, "contract");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "onResult");
        composer.startReplaceableGroup(-1408504823);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberLauncherForActivityResult)86@3568L30,87@3625L30,91@3794L49,*93@3924L7,96@4078L46,97@4152L85,103@4364L260:ActivityResultRegistry.kt#q1dkbc");
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(contract, composer, 8);
        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onResult, composer, (i >> 3) & 14);
        java.lang.Object m1729rememberSaveable = androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[0], (androidx.compose.runtime.saveable.Saver<java.lang.Object, ? extends java.lang.Object>) null, (java.lang.String) null, (kotlin.jvm.functions.Function0<? extends java.lang.Object>) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                return java.util.UUID.randomUUID().toString();
            }
        }, composer, 3080, 6);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(m1729rememberSaveable, "rememberSaveable { UUID.randomUUID().toString() }");
        final java.lang.String str = (java.lang.String) m1729rememberSaveable;
        androidx.activity.result.ActivityResultRegistryOwner current = androidx.activity.compose.LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        final androidx.activity.result.ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
        composer.startReplaceableGroup(-3687241);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.activity.compose.ActivityResultLauncherHolder();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.activity.compose.ActivityResultLauncherHolder activityResultLauncherHolder = (androidx.activity.compose.ActivityResultLauncherHolder) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.activity.compose.ManagedActivityResultLauncher(activityResultLauncherHolder, rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        androidx.activity.compose.ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (androidx.activity.compose.ManagedActivityResultLauncher) rememberedValue2;
        androidx.compose.runtime.EffectsKt.DisposableEffect(activityResultRegistry, str, contract, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope DisposableEffect) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                androidx.activity.compose.ActivityResultLauncherHolder<I> activityResultLauncherHolder2 = activityResultLauncherHolder;
                androidx.activity.result.ActivityResultRegistry activityResultRegistry2 = activityResultRegistry;
                java.lang.String str2 = str;
                java.lang.Object obj = contract;
                final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<O, kotlin.Unit>> state = rememberUpdatedState2;
                activityResultLauncherHolder2.setLauncher(activityResultRegistry2.register(str2, obj, new androidx.activity.result.ActivityResultCallback<O>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1.1
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(O o) {
                        state.getValue().invoke(o);
                    }
                }));
                final androidx.activity.compose.ActivityResultLauncherHolder<I> activityResultLauncherHolder3 = activityResultLauncherHolder;
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        androidx.activity.compose.ActivityResultLauncherHolder.this.unregister();
                    }
                };
            }
        }, composer, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION);
        composer.endReplaceableGroup();
        return managedActivityResultLauncher;
    }
}
