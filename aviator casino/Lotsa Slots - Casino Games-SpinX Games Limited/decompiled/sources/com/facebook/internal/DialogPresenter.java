package com.facebook.internal;

/* compiled from: DialogPresenter.kt */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u00016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J$\u0010#\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J \u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010-\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010)H\u0007J$\u0010/\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\"\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J*\u00101\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0007¨\u00067"}, d2 = {"Lcom/facebook/internal/DialogPresenter;", "", "()V", "canPresentNativeDialogWithFeature", "", "feature", "Lcom/facebook/internal/DialogFeature;", "canPresentWebFallbackDialogWithFeature", "getDialogWebFallbackUri", "Landroid/net/Uri;", "getProtocolVersionForNativeDialog", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "getVersionSpecForFeature", "", "applicationId", "", com.ironsource.X3.i.v0, "logDialogActivity", "", "context", "Landroid/content/Context;", com.ironsource.X3.i.j0, "outcome", "present", "appCall", "Lcom/facebook/internal/AppCall;", "activity", "Landroid/app/Activity;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "callbackManager", "Lcom/facebook/CallbackManager;", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "setupAppCallForCannotShowError", "setupAppCallForCustomTabDialog", "action", "parameters", "Landroid/os/Bundle;", "setupAppCallForErrorResult", "exception", "Lcom/facebook/FacebookException;", "setupAppCallForNativeDialog", "parameterProvider", "Lcom/facebook/internal/DialogPresenter$ParameterProvider;", "setupAppCallForValidationError", "validationError", "setupAppCallForWebDialog", "setupAppCallForWebFallbackDialog", "startActivityForResultWithAndroidX", "intent", "Landroid/content/Intent;", "requestCode", "", "ParameterProvider", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DialogPresenter {
    public static final com.facebook.internal.DialogPresenter INSTANCE = new com.facebook.internal.DialogPresenter();

    /* compiled from: DialogPresenter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/facebook/internal/DialogPresenter$ParameterProvider;", "", "legacyParameters", "Landroid/os/Bundle;", "getLegacyParameters", "()Landroid/os/Bundle;", "parameters", "getParameters", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface ParameterProvider {
        android.os.Bundle getLegacyParameters();

        android.os.Bundle getParameters();
    }

    private DialogPresenter() {
    }

    @kotlin.jvm.JvmStatic
    public static final void setupAppCallForCannotShowError(com.facebook.internal.AppCall appCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForValidationError(appCall, new com.facebook.FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    @kotlin.jvm.JvmStatic
    public static final void setupAppCallForValidationError(com.facebook.internal.AppCall appCall, com.facebook.FacebookException validationError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForErrorResult(appCall, validationError);
    }

    @kotlin.jvm.JvmStatic
    public static final void present(com.facebook.internal.AppCall appCall, android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    @kotlin.jvm.JvmStatic
    public static final void present(com.facebook.internal.AppCall appCall, com.facebook.internal.FragmentWrapper fragmentWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        fragmentWrapper.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    @kotlin.jvm.JvmStatic
    public static final void present(com.facebook.internal.AppCall appCall, androidx.activity.result.ActivityResultRegistry registry, com.facebook.CallbackManager callbackManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
        android.content.Intent requestIntent = appCall.getRequestIntent();
        if (requestIntent == null) {
            return;
        }
        startActivityForResultWithAndroidX(registry, callbackManager, requestIntent, appCall.getRequestCode());
        appCall.setPending();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.activity.result.ActivityResultLauncher] */
    @kotlin.jvm.JvmStatic
    public static final void startActivityForResultWithAndroidX(androidx.activity.result.ActivityResultRegistry registry, final com.facebook.CallbackManager callbackManager, android.content.Intent intent, final int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "registry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = registry.register(kotlin.jvm.internal.Intrinsics.stringPlus("facebook-dialog-request-", java.lang.Integer.valueOf(requestCode)), new androidx.activity.result.contract.ActivityResultContract<android.content.Intent, android.util.Pair<java.lang.Integer, android.content.Intent>>() { // from class: com.facebook.internal.DialogPresenter$startActivityForResultWithAndroidX$1
            @Override // androidx.activity.result.contract.ActivityResultContract
            public android.content.Intent createIntent(android.content.Context context, android.content.Intent input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
                return input;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public android.util.Pair<java.lang.Integer, android.content.Intent> parseResult(int resultCode, android.content.Intent intent2) {
                android.util.Pair<java.lang.Integer, android.content.Intent> create = android.util.Pair.create(java.lang.Integer.valueOf(resultCode), intent2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create(resultCode, intent)");
                return create;
            }
        }, new androidx.activity.result.ActivityResultCallback() { // from class: com.facebook.internal.DialogPresenter$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.facebook.internal.DialogPresenter.m5172startActivityForResultWithAndroidX$lambda2(com.facebook.CallbackManager.this, requestCode, objectRef, (android.util.Pair) obj);
            }
        });
        androidx.activity.result.ActivityResultLauncher activityResultLauncher = (androidx.activity.result.ActivityResultLauncher) objectRef.element;
        if (activityResultLauncher == null) {
            return;
        }
        activityResultLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: startActivityForResultWithAndroidX$lambda-2, reason: not valid java name */
    public static final void m5172startActivityForResultWithAndroidX$lambda2(com.facebook.CallbackManager callbackManager, int i, kotlin.jvm.internal.Ref.ObjectRef launcher, android.util.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launcher, "$launcher");
        if (callbackManager == null) {
            callbackManager = new com.facebook.internal.CallbackManagerImpl();
        }
        java.lang.Object obj = pair.first;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "result.first");
        callbackManager.onActivityResult(i, ((java.lang.Number) obj).intValue(), (android.content.Intent) pair.second);
        androidx.activity.result.ActivityResultLauncher activityResultLauncher = (androidx.activity.result.ActivityResultLauncher) launcher.element;
        if (activityResultLauncher == null) {
            return;
        }
        synchronized (activityResultLauncher) {
            activityResultLauncher.unregister();
            launcher.element = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canPresentNativeDialogWithFeature(com.facebook.internal.DialogFeature feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        return getProtocolVersionForNativeDialog(feature).getProtocolVersion() != -1;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canPresentWebFallbackDialogWithFeature(com.facebook.internal.DialogFeature feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        return INSTANCE.getDialogWebFallbackUri(feature) != null;
    }

    @kotlin.jvm.JvmStatic
    public static final void setupAppCallForErrorResult(com.facebook.internal.AppCall appCall, com.facebook.FacebookException exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        if (exception == null) {
            return;
        }
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.Validate.hasFacebookActivity(com.facebook.FacebookSdk.getApplicationContext());
        android.content.Intent intent = new android.content.Intent();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        intent.setClass(com.facebook.FacebookSdk.getApplicationContext(), com.facebook.FacebookActivity.class);
        intent.setAction(com.facebook.FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        java.lang.String uuid = appCall.getCallId().toString();
        com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
        int latestKnownVersion = com.facebook.internal.NativeProtocol.getLatestKnownVersion();
        com.facebook.internal.NativeProtocol nativeProtocol3 = com.facebook.internal.NativeProtocol.INSTANCE;
        com.facebook.internal.NativeProtocol.setupProtocolRequestIntent(intent, uuid, null, latestKnownVersion, com.facebook.internal.NativeProtocol.createBundleForException(exception));
        appCall.setRequestIntent(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final void setupAppCallForWebDialog(com.facebook.internal.AppCall appCall, java.lang.String actionName, android.os.Bundle parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.Validate.hasFacebookActivity(com.facebook.FacebookSdk.getApplicationContext());
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.Validate.hasInternetPermissions(com.facebook.FacebookSdk.getApplicationContext());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("action", actionName);
        bundle.putBundle("params", parameters);
        android.content.Intent intent = new android.content.Intent();
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        java.lang.String uuid = appCall.getCallId().toString();
        com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
        com.facebook.internal.NativeProtocol.setupProtocolRequestIntent(intent, uuid, actionName, com.facebook.internal.NativeProtocol.getLatestKnownVersion(), bundle);
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        intent.setClass(com.facebook.FacebookSdk.getApplicationContext(), com.facebook.FacebookActivity.class);
        intent.setAction(com.facebook.internal.FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final void setupAppCallForWebFallbackDialog(com.facebook.internal.AppCall appCall, android.os.Bundle parameters, com.facebook.internal.DialogFeature feature) {
        android.net.Uri buildUri;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.Validate.hasFacebookActivity(com.facebook.FacebookSdk.getApplicationContext());
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.Validate.hasInternetPermissions(com.facebook.FacebookSdk.getApplicationContext());
        java.lang.String name = feature.name();
        android.net.Uri dialogWebFallbackUri = INSTANCE.getDialogWebFallbackUri(feature);
        if (dialogWebFallbackUri == null) {
            throw new com.facebook.FacebookException("Unable to fetch the Url for the DialogFeature : '" + name + '\'');
        }
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        int latestKnownVersion = com.facebook.internal.NativeProtocol.getLatestKnownVersion();
        com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
        java.lang.String uuid = appCall.getCallId().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "appCall.callId.toString()");
        android.os.Bundle queryParamsForPlatformActivityIntentWebFallback = com.facebook.internal.ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(uuid, latestKnownVersion, parameters);
        if (queryParamsForPlatformActivityIntentWebFallback == null) {
            throw new com.facebook.FacebookException("Unable to fetch the app's key-hash");
        }
        if (dialogWebFallbackUri.isRelative()) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.ServerProtocol serverProtocol2 = com.facebook.internal.ServerProtocol.INSTANCE;
            buildUri = com.facebook.internal.Utility.buildUri(com.facebook.internal.ServerProtocol.getDialogAuthority(), dialogWebFallbackUri.toString(), queryParamsForPlatformActivityIntentWebFallback);
        } else {
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            buildUri = com.facebook.internal.Utility.buildUri(dialogWebFallbackUri.getAuthority(), dialogWebFallbackUri.getPath(), queryParamsForPlatformActivityIntentWebFallback);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", buildUri.toString());
        bundle.putBoolean(com.facebook.internal.NativeProtocol.WEB_DIALOG_IS_FALLBACK, true);
        android.content.Intent intent = new android.content.Intent();
        com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
        java.lang.String uuid2 = appCall.getCallId().toString();
        java.lang.String action = feature.getAction();
        com.facebook.internal.NativeProtocol nativeProtocol3 = com.facebook.internal.NativeProtocol.INSTANCE;
        com.facebook.internal.NativeProtocol.setupProtocolRequestIntent(intent, uuid2, action, com.facebook.internal.NativeProtocol.getLatestKnownVersion(), bundle);
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        intent.setClass(com.facebook.FacebookSdk.getApplicationContext(), com.facebook.FacebookActivity.class);
        intent.setAction(com.facebook.internal.FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    @kotlin.jvm.JvmStatic
    public static final void setupAppCallForNativeDialog(com.facebook.internal.AppCall appCall, com.facebook.internal.DialogPresenter.ParameterProvider parameterProvider, com.facebook.internal.DialogFeature feature) {
        android.os.Bundle legacyParameters;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterProvider, "parameterProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        java.lang.String action = feature.getAction();
        com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult protocolVersionForNativeDialog = getProtocolVersionForNativeDialog(feature);
        int protocolVersion = protocolVersionForNativeDialog.getProtocolVersion();
        if (protocolVersion == -1) {
            throw new com.facebook.FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        if (com.facebook.internal.NativeProtocol.isVersionCompatibleWithBucketedIntent(protocolVersion)) {
            legacyParameters = parameterProvider.getParameters();
        } else {
            legacyParameters = parameterProvider.getLegacyParameters();
        }
        if (legacyParameters == null) {
            legacyParameters = new android.os.Bundle();
        }
        com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
        android.content.Intent createPlatformActivityIntent = com.facebook.internal.NativeProtocol.createPlatformActivityIntent(applicationContext, appCall.getCallId().toString(), action, protocolVersionForNativeDialog, legacyParameters);
        if (createPlatformActivityIntent == null) {
            throw new com.facebook.FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.setRequestIntent(createPlatformActivityIntent);
    }

    @kotlin.jvm.JvmStatic
    public static final void setupAppCallForCustomTabDialog(com.facebook.internal.AppCall appCall, java.lang.String action, android.os.Bundle parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCall, "appCall");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.internal.CustomTabUtils customTabUtils = com.facebook.internal.CustomTabUtils.INSTANCE;
        com.facebook.internal.Validate.hasCustomTabRedirectActivity(applicationContext, com.facebook.internal.CustomTabUtils.getDefaultRedirectURI());
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.Validate.hasInternetPermissions(com.facebook.FacebookSdk.getApplicationContext());
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        android.content.Intent intent = new android.content.Intent(com.facebook.FacebookSdk.getApplicationContext(), (java.lang.Class<?>) com.facebook.CustomTabMainActivity.class);
        intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_ACTION, action);
        intent.putExtra(com.facebook.CustomTabMainActivity.EXTRA_PARAMS, parameters);
        java.lang.String str = com.facebook.CustomTabMainActivity.EXTRA_CHROME_PACKAGE;
        com.facebook.internal.CustomTabUtils customTabUtils2 = com.facebook.internal.CustomTabUtils.INSTANCE;
        intent.putExtra(str, com.facebook.internal.CustomTabUtils.getChromePackage());
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        java.lang.String uuid = appCall.getCallId().toString();
        com.facebook.internal.NativeProtocol nativeProtocol2 = com.facebook.internal.NativeProtocol.INSTANCE;
        com.facebook.internal.NativeProtocol.setupProtocolRequestIntent(intent, uuid, action, com.facebook.internal.NativeProtocol.getLatestKnownVersion(), null);
        appCall.setRequestIntent(intent);
    }

    private final android.net.Uri getDialogWebFallbackUri(com.facebook.internal.DialogFeature feature) {
        java.lang.String name = feature.name();
        java.lang.String action = feature.getAction();
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.internal.FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = com.facebook.internal.FetchedAppSettings.INSTANCE.getDialogFeatureConfig(com.facebook.FacebookSdk.getApplicationId(), action, name);
        if (dialogFeatureConfig != null) {
            return dialogFeatureConfig.getFallbackUrl();
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(com.facebook.internal.DialogFeature feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        java.lang.String action = feature.getAction();
        int[] versionSpecForFeature = INSTANCE.getVersionSpecForFeature(applicationId, action, feature);
        com.facebook.internal.NativeProtocol nativeProtocol = com.facebook.internal.NativeProtocol.INSTANCE;
        return com.facebook.internal.NativeProtocol.getLatestAvailableProtocolVersionForAction(action, versionSpecForFeature);
    }

    private final int[] getVersionSpecForFeature(java.lang.String applicationId, java.lang.String actionName, com.facebook.internal.DialogFeature feature) {
        com.facebook.internal.FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = com.facebook.internal.FetchedAppSettings.INSTANCE.getDialogFeatureConfig(applicationId, actionName, feature.name());
        int[] versionSpec = dialogFeatureConfig == null ? null : dialogFeatureConfig.getVersionSpec();
        return versionSpec == null ? new int[]{feature.getMinVersion()} : versionSpec;
    }

    @kotlin.jvm.JvmStatic
    public static final void logDialogActivity(android.content.Context context, java.lang.String eventName, java.lang.String outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "outcome");
        com.facebook.appevents.InternalAppEventsLogger internalAppEventsLogger = new com.facebook.appevents.InternalAppEventsLogger(context);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME, outcome);
        internalAppEventsLogger.logEventImplicitly(eventName, bundle);
    }
}
