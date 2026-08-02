package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJD\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2 \u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rj\u0004\u0018\u0001`\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0017\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152 \u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rj\u0004\u0018\u0001`\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JP\u0010\u0017\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192 \u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rj\u0004\u0018\u0001`\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001bJ<\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00192 \u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rj\u0004\u0018\u0001`\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001dJ<\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000f2 \u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rj\u0004\u0018\u0001`\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/TokenProviderAuthenticatorTrigger;", "Lcom/zettle/sdk/core/auth/AuthenticatorTrigger;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/auth/AuthModule;", "authModule", "Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;", "authAnalyticsReporter", "<init>", "(Lcom/zettle/sdk/core/auth/AuthModule;Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;)V", "Landroid/app/Activity;", "activity", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "Lcom/zettle/sdk/core/auth/OnResult;", "onResult", "elevate", "(Landroid/app/Activity;Lcom/zettle/sdk/commons/network/Scope;Lkotlin/jvm/functions/Function1;)V", "", "toolbarColor", "login", "(Landroid/app/Activity;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "", "enforcedUserAccount", "(Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "refreshToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "invalidate", "logout", "(ZLkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/auth/AuthModule;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TokenProviderAuthenticatorTrigger implements com.zettle.sdk.core.auth.AuthenticatorTrigger, com.zettle.sdk.core.log.Loggable {
    private final com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.AuthAnalyticsReporter getHighResolutionOutputSizeshNQ4ISI;

    public TokenProviderAuthenticatorTrigger(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.core.auth.AuthAnalyticsReporter authAnalyticsReporter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authAnalyticsReporter, "");
        this.getHighSpeedVideoFpsRanges = authModule;
        this.getHighResolutionOutputSizeshNQ4ISI = authAnalyticsReporter;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void logout(boolean invalidate, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.zettle.sdk.core.auth.AuthModule.INSTANCE.getScope$core_publicRelease(), null, null, new com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$logout$1(this, invalidate, onResult, null), 3, null);
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void login(java.lang.String refreshToken, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.zettle.sdk.core.auth.AuthModule.INSTANCE.getScope$core_publicRelease(), null, null, new com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$login$1(this, onResult, null), 3, null);
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void login(android.app.Activity activity, java.lang.Integer toolbarColor, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        login("", onResult);
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void login(android.app.Activity activity, java.lang.Integer toolbarColor, java.lang.String enforcedUserAccount, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        login("", onResult);
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void elevate(android.app.Activity activity, com.zettle.sdk.commons.network.Scope scope, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.zettle.sdk.core.auth.AuthModule.INSTANCE.getScope$core_publicRelease(), null, null, new com.zettle.sdk.core.auth.TokenProviderAuthenticatorTrigger$elevate$1(this, scope, onResult, null), 3, null);
    }
}
