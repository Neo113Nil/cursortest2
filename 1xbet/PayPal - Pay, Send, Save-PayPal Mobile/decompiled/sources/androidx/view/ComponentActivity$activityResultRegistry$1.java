package androidx.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/activity/ComponentActivity$activityResultRegistry$1;", "Landroidx/activity/result/ActivityResultRegistry;", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentActivity$activityResultRegistry$1 extends androidx.view.result.ActivityResultRegistry {
    final /* synthetic */ androidx.view.ComponentActivity getHighResolutionOutputSizeshNQ4ISI;

    ComponentActivity$activityResultRegistry$1(androidx.view.ComponentActivity componentActivity) {
        this.getHighResolutionOutputSizeshNQ4ISI = componentActivity;
    }

    @Override // androidx.view.result.ActivityResultRegistry
    public final <I, O> void onLaunch(final int requestCode, androidx.view.result.contract.ActivityResultContract<I, O> contract, I input, androidx.core.app.ActivityOptionsCompat options) {
        android.os.Bundle bundle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contract, "");
        androidx.view.ComponentActivity componentActivity = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.view.ComponentActivity componentActivity2 = componentActivity;
        final androidx.activity.result.contract.ActivityResultContract.SynchronousResult<O> synchronousResult = contract.getSynchronousResult(componentActivity2, input);
        if (synchronousResult != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.ComponentActivity$activityResultRegistry$1.this.dispatchResult(requestCode, synchronousResult.getValue());
                }
            });
            return;
        }
        android.content.Intent createIntent = contract.createIntent(componentActivity2, input);
        if (createIntent.getExtras() != null) {
            android.os.Bundle extras = createIntent.getExtras();
            kotlin.jvm.internal.Intrinsics.checkNotNull(extras);
            if (extras.getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (createIntent.hasExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
            bundle = createIntent.getBundleExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
            createIntent.removeExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
        } else {
            bundle = options != null ? options.toBundle() : null;
        }
        android.os.Bundle bundle2 = bundle;
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS, createIntent.getAction())) {
            java.lang.String[] stringArrayExtra = createIntent.getStringArrayExtra(androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new java.lang.String[0];
            }
            androidx.core.app.ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, requestCode);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST, createIntent.getAction())) {
            androidx.view.result.IntentSenderRequest intentSenderRequest = (androidx.view.result.IntentSenderRequest) createIntent.getParcelableExtra(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(intentSenderRequest);
                androidx.core.app.ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), requestCode, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle2);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            } catch (android.content.IntentSender.SendIntentException e) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.activity.ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.view.ComponentActivity$activityResultRegistry$1.this.dispatchResult(requestCode, 0, new android.content.Intent().setAction(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, e));
                    }
                });
                return;
            }
        }
        androidx.core.app.ActivityCompat.startActivityForResult(componentActivity, createIntent, requestCode, bundle2);
    }
}
