package com.paypal.oslo.feature.packagetracking.ui.oauth;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J)\u00101\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b3\u00104J!\u00105\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020$2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b5\u0010'R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0004068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010>\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010;"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthActivityHelper;", "", "<init>", "()V", "", "authUrl", "", "isValidAuthUrl", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "Larrow/core/Either;", "", "launchOAuthBrowser", "(Landroid/content/Context;Ljava/lang/String;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "code", "state", "Landroid/content/Intent;", "createSuccessIntent", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "errorMessage", "createErrorIntent", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;)Landroid/content/Intent;", "createCancellationIntent", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Landroid/content/Intent;", "Landroid/os/Bundle;", "savedInstanceState", "restoreProvider", "(Landroid/os/Bundle;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "intent", "extractProviderFromIntent", "(Landroid/content/Intent;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "extractAuthUrlFromIntent", "(Landroid/content/Intent;)Ljava/lang/String;", "Landroid/net/Uri;", "uri", "createCallbackResultIntent", "(Landroid/net/Uri;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Landroid/content/Intent;", "isValidCallbackUri", "(Landroid/net/Uri;)Z", "p0", "p1", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;)Z", "intentAction", "callingPackageName", "ownPackageName", "shouldRejectLaunch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "extractProviderFromUri", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "processCallbackUri", "", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "STATE_HAS_LAUNCHED", "Ljava/lang/String;", "STATE_HAS_HANDLED_CALLBACK", "STATE_HAS_PAUSED", "STATE_PROVIDER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OAuthActivityHelper {
    public static final java.lang.String STATE_HAS_HANDLED_CALLBACK = "state_has_handled_callback";
    public static final java.lang.String STATE_HAS_LAUNCHED = "state_has_launched_browser";
    public static final java.lang.String STATE_HAS_PAUSED = "state_has_paused_after_launch";
    public static final java.lang.String STATE_PROVIDER = "state_provider";
    public static final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"accounts.google.com", "login.microsoftonline.com", "login.live.com"});
    public static final int $stable = 8;

    private OAuthActivityHelper() {
    }

    public final arrow.core.Either<java.lang.String, kotlin.Unit> launchOAuthBrowser(android.content.Context context, java.lang.String authUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authUrl, "");
        if (!isValidAuthUrl(authUrl)) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.UNTRUSTED_AUTH_URL);
        }
        try {
            androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder().setShowTitle(true).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            build.intent.addFlags(1073741824);
            build.launchUrl(context, android.net.Uri.parse(authUrl));
            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
        } catch (android.content.ActivityNotFoundException unused) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.NO_BROWSER_FOUND);
        } catch (java.lang.IllegalArgumentException unused2) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.INVALID_AUTH_URL);
        }
    }

    public final android.content.Intent createSuccessIntent(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider, java.lang.String code, java.lang.String state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_PROVIDER, provider != null ? provider.name() : null);
        intent.putExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_AUTH_CODE, code);
        intent.putExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_STATE, state);
        return intent;
    }

    public final android.content.Intent createErrorIntent(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_PROVIDER, provider != null ? provider.name() : null);
        intent.putExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_ERROR, errorMessage);
        return intent;
    }

    public final android.content.Intent createCancellationIntent(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_PROVIDER, provider != null ? provider.name() : null);
        return intent;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider restoreProvider(android.os.Bundle savedInstanceState) {
        java.lang.String string;
        java.lang.Object m23436constructorimpl;
        if (savedInstanceState == null || (string = savedInstanceState.getString(STATE_PROVIDER)) == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.valueOf(string));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider extractProviderFromIntent(android.content.Intent intent) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        java.lang.String stringExtra = intent.getStringExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_PROVIDER);
        if (stringExtra == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.valueOf(stringExtra));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public final java.lang.String extractAuthUrlFromIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return intent.getStringExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_AUTH_URL);
    }

    public final android.content.Intent createCallbackResultIntent(android.net.Uri uri, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult parseCallback = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.INSTANCE.parseCallback(uri);
        if (parseCallback instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success) {
            com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success success = (com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Success) parseCallback;
            return createSuccessIntent(provider, success.getAuthorizationCode(), success.getState());
        }
        if (parseCallback instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error) {
            return createErrorIntent(provider, ((com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.Error) parseCallback).getErrorCode());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(parseCallback, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthCallbackHandler.OAuthCallbackResult.MissingParameters.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return createErrorIntent(provider, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.MISSING_PARAMETERS);
    }

    public final boolean isValidCallbackUri(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        java.lang.String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != -995205389) {
                return hashCode == 99617003 && scheme.equals("https") && kotlin.jvm.internal.Intrinsics.areEqual(uri.getHost(), "www.paypal.com") && (getHighSpeedVideoSizes(uri.getPath(), "/package_list") || getHighSpeedVideoSizes(uri.getPath(), "/package_tracking_email_auth"));
            }
            if (scheme.equals("paypal")) {
                return kotlin.jvm.internal.Intrinsics.areEqual(uri.getHost(), "package_tracking_email_auth") || kotlin.jvm.internal.Intrinsics.areEqual(uri.getHost(), "package_list");
            }
        }
        return false;
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1) {
        if (p0 == null) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, p1)) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p1);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        return kotlin.text.StringsKt.startsWith$default(p0, sb.toString(), false, 2, (java.lang.Object) null);
    }

    public final boolean shouldRejectLaunch(java.lang.String intentAction, java.lang.String callingPackageName, java.lang.String ownPackageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ownPackageName, "");
        if (intentAction != null) {
            return true;
        }
        return (callingPackageName == null || kotlin.jvm.internal.Intrinsics.areEqual(callingPackageName, ownPackageName)) ? false : true;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider extractProviderFromUri(android.net.Uri uri) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        java.lang.String queryParameter = uri.getQueryParameter("provider");
        if (queryParameter == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.valueOf(queryParameter));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public final android.content.Intent processCallbackUri(android.net.Uri uri, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        if (isValidCallbackUri(uri)) {
            return createCallbackResultIntent(uri, provider);
        }
        return null;
    }

    public final boolean isValidAuthUrl(java.lang.String authUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authUrl, "");
        try {
            android.net.Uri parse = android.net.Uri.parse(authUrl);
            java.lang.String host = parse.getHost();
            if (host != null && kotlin.jvm.internal.Intrinsics.areEqual(parse.getScheme(), "https")) {
                java.util.Set<java.lang.String> set = getHighResolutionOutputSizeshNQ4ISI;
                if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                    for (java.lang.String str : set) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(host, str)) {
                            return true;
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(".");
                        sb.append(str);
                        if (kotlin.text.StringsKt.endsWith$default(host, sb.toString(), false, 2, (java.lang.Object) null)) {
                            return true;
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }
}
