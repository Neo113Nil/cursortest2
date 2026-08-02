package com.paypal.oslo.feature.pushnotification.api.optin;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a\f\u0010\n\u001a\u00020\t*\u00020\u000bH\u0001¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"rememberPushOptInState", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "source", "Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;", "(Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "computePermissionStatus", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionManager;", "activity", "Landroid/app/Activity;", "findActivity", "Landroid/content/Context;", "push-notification-api_prodRelease", "permissionStatus"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RememberPushOptInStateKt {
    public static final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState rememberPushOptInState(com.paypal.oslo.feature.pushnotification.api.optin.OptInSource optInSource, androidx.compose.runtime.Composer composer, int i, int i2) {
        com.paypal.oslo.feature.pushnotification.api.optin.OptInSource optInSource2 = (i2 & 1) != 0 ? com.paypal.oslo.feature.pushnotification.api.optin.UnknownOptInSource.INSTANCE : optInSource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-992393636, i, -1, "com.paypal.oslo.feature.pushnotification.api.optin.rememberPushOptInState (RememberPushOptInState.kt:82)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        boolean changed = composer.changed(context);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = findActivity(context);
            composer.updateRememberedValue(rememberedValue);
        }
        final android.app.Activity activity = (android.app.Activity) rememberedValue;
        final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        boolean changed2 = composer.changed(context);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            rememberedValue2 = ((com.paypal.oslo.feature.pushnotification.api.optin.PushOptInEntryPoint) dagger.hilt.android.EntryPointAccessors.fromApplication(applicationContext, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInEntryPoint.class)).permissionManager();
            composer.updateRememberedValue(rememberedValue2);
        }
        final com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager = (com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager) rememberedValue2;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        final kotlinx.coroutines.channels.Channel channel = (kotlinx.coroutines.channels.Channel) rememberedValue3;
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(computePermissionStatus(pushNotificationPermissionManager, activity), null, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue4;
        androidx.activity.result.contract.ActivityResultContracts.RequestPermission requestPermission = new androidx.activity.result.contract.ActivityResultContracts.RequestPermission();
        boolean changedInstance = composer.changedInstance(pushNotificationPermissionManager);
        boolean changedInstance2 = composer.changedInstance(activity);
        boolean changedInstance3 = composer.changedInstance(channel);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changedInstance | changedInstance2 | changedInstance3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.$r8$lambda$hwLRRNh7lCtZaIawZKb45LRl50E(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager.this, activity, channel, mutableState, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (kotlin.jvm.functions.Function1) rememberedValue5, composer, 0);
        boolean changedInstance4 = composer.changedInstance(pushNotificationPermissionManager);
        boolean changedInstance5 = composer.changedInstance(activity);
        boolean changedInstance6 = composer.changedInstance(lifecycleOwner);
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if ((changedInstance4 | changedInstance5 | changedInstance6) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.$r8$lambda$NRmI_Wl5lk2jLsIfoEEMThm3Aog(androidx.view.LifecycleOwner.this, pushNotificationPermissionManager, activity, mutableState, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue6, composer, 0);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(optInSource2)) || (i & 6) == 4;
        boolean changed3 = composer.changed(pushNotificationPermissionManager);
        boolean changed4 = composer.changed(activity);
        java.lang.Object rememberedValue7 = composer.rememberedValue();
        if ((changed3 | z | changed4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            java.lang.Object pushOptInStateImpl = new com.paypal.oslo.feature.pushnotification.api.optin.PushOptInStateImpl(optInSource2, pushNotificationPermissionManager, activity, context, channel, new com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatusHolder(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.$r8$lambda$Xo2M5LiL0UNfF3XzP7A_Ej6OCnU(androidx.compose.runtime.MutableState.this);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.$r8$lambda$GpiVvQsUFM46VWvrHev9WiFCaIw(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus) obj);
                }
            }), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.m17740$r8$lambda$baAtbDEysttRJsqZT4LNr2vfU(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager.this, rememberLauncherForActivityResult);
                }
            });
            composer.updateRememberedValue(pushOptInStateImpl);
            rememberedValue7 = pushOptInStateImpl;
        }
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInStateImpl pushOptInStateImpl2 = (com.paypal.oslo.feature.pushnotification.api.optin.PushOptInStateImpl) rememberedValue7;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pushOptInStateImpl2;
    }

    public static final com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus computePermissionStatus(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager, android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPermissionManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return pushNotificationPermissionManager.hasNotificationPermission() ? com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Granted.INSTANCE : !pushNotificationPermissionManager.isRuntimePermissionRequired() ? com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.NotRequired.INSTANCE : !pushNotificationPermissionManager.canRequestPermission(activity) ? com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.PermanentlyDenied.INSTANCE : com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Denied.INSTANCE;
    }

    public static final android.app.Activity findActivity(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        }
        throw new java.lang.IllegalStateException("rememberPushOptInState must be called from an Activity context".toString());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GpiVvQsUFM46VWvrHev9WiFCaIw(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus permissionStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionStatus, "");
        mutableState.setValue(permissionStatus);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$NRmI_Wl5lk2jLsIfoEEMThm3Aog(final androidx.view.LifecycleOwner lifecycleOwner, final com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager, final android.app.Activity activity, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt$$ExternalSyntheticLambda5
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.m17741$r8$lambda$tyDoN4uPHDr7aCZewcXAJNwOZc(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager.this, activity, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt$rememberPushOptInState$lambda$7$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus $r8$lambda$Xo2M5LiL0UNfF3XzP7A_Ej6OCnU(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus) mutableState.getValue();
    }

    /* renamed from: $r8$lambda$baAtbDEys-t-tRJsqZT4LNr2vfU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17740$r8$lambda$baAtbDEysttRJsqZT4LNr2vfU(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager, androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            pushNotificationPermissionManager.markPermissionRequested();
            managedActivityResultLauncher.launch("android.permission.POST_NOTIFICATIONS");
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hwLRRNh7lCtZaIawZKb45LRl50E(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager, android.app.Activity activity, kotlinx.coroutines.channels.Channel channel, androidx.compose.runtime.MutableState mutableState, boolean z) {
        pushNotificationPermissionManager.notifyPermissionStateChanged();
        mutableState.setValue(computePermissionStatus(pushNotificationPermissionManager, activity));
        channel.mo9266trySendJP2dKIU(z ? com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Granted.INSTANCE : com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Denied.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tyDoN4uPHDr7aCZewcXAJ-NwOZc, reason: not valid java name */
    public static /* synthetic */ void m17741$r8$lambda$tyDoN4uPHDr7aCZewcXAJNwOZc(com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager pushNotificationPermissionManager, android.app.Activity activity, androidx.compose.runtime.MutableState mutableState, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
            pushNotificationPermissionManager.notifyPermissionStateChanged();
            mutableState.setValue(computePermissionStatus(pushNotificationPermissionManager, activity));
        }
    }
}
