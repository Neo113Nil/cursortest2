package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162 \u0010\u001d\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJN\u0010!\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102 \u0010 \u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JF\u0010$\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u000e2 \u0010\u001d\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%JP\u0010$\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u00102 \u0010\u001d\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010'J<\u0010$\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00102 \u0010\u001d\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010)J<\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001a2 \u0010\u001d\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010!\u001a\u00020\u000e*\u00020\fH\u0002¢\u0006\u0004\b!\u0010-R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100R\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/DefaultProviderAuthenticatorTrigger;", "Lcom/zettle/sdk/core/auth/User;", "Lcom/zettle/sdk/core/auth/AuthenticatorTrigger;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/auth/AuthProvider;", "authProvider", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "loop", "Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;", "reporter", "<init>", "(Lcom/zettle/sdk/core/auth/AuthProvider;Lcom/zettle/sdk/commons/thread/EventsLoop;Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;)V", "Landroid/app/Activity;", "p0", "", "p1", "", "p2", "Lcom/izettle/android/auth/OAuthBrowserLoginSpec;", "getHighSpeedVideoFpsRangesFor", "(Landroid/app/Activity;ILjava/lang/String;)Lcom/izettle/android/auth/OAuthBrowserLoginSpec;", "activity", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "Lcom/zettle/sdk/core/auth/OnResult;", "onResult", "elevate", "(Landroid/app/Activity;Lcom/zettle/sdk/commons/network/Scope;Lkotlin/jvm/functions/Function1;)V", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/app/Activity;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "toolbarColor", "login", "(Landroid/app/Activity;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "enforcedUserAccount", "(Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "refreshToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "invalidate", "logout", "(ZLkotlin/jvm/functions/Function1;)V", "(Landroid/app/Activity;)I", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/auth/AuthProvider;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DefaultProviderAuthenticatorTrigger implements com.zettle.sdk.core.auth.User, com.zettle.sdk.core.auth.AuthenticatorTrigger, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.AuthProvider getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.commons.thread.EventsLoop getHighSpeedVideoFpsRangesFor;
    private final com.zettle.sdk.core.auth.AuthAnalyticsReporter getHighSpeedVideoSizes;

    public DefaultProviderAuthenticatorTrigger(com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, com.zettle.sdk.core.auth.AuthAnalyticsReporter authAnalyticsReporter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authAnalyticsReporter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = authProvider;
        this.getHighSpeedVideoFpsRangesFor = eventsLoop;
        this.getHighSpeedVideoSizes = authAnalyticsReporter;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void logout(boolean invalidate, final kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        this.getHighSpeedVideoFpsRangesFor.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$logout$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes() {
                com.zettle.sdk.core.auth.AuthProvider authProvider;
                authProvider = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.this.getHighResolutionOutputSizeshNQ4ISI;
                com.izettle.android.core.data.result.Success logout = authProvider.logout();
                if (logout instanceof com.izettle.android.core.data.result.Success) {
                    logout = new com.izettle.android.core.data.result.Success(java.lang.Boolean.TRUE);
                } else if (!(logout instanceof com.izettle.android.core.data.result.Failure)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.Object kotlinResult = com.zettle.sdk.extensions.ZettleExtKt.toKotlinResult(com.izettle.android.core.data.result.ResultKt.onErrorResume(logout, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$logout$1$result$2
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Boolean invoke(java.lang.Throwable th) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                        return java.lang.Boolean.FALSE;
                    }
                }));
                kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1 = onResult;
                if (function1 != null) {
                    function1.invoke(kotlin.Result.m23435boximpl(kotlinResult));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void login(final android.app.Activity activity, final java.lang.Integer toolbarColor, final kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.getHighSpeedVideoFpsRangesFor.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$login$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes() {
                int highResolutionOutputSizeshNQ4ISI;
                java.lang.Integer num = toolbarColor;
                if (num != null) {
                    highResolutionOutputSizeshNQ4ISI = num.intValue();
                } else {
                    com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger = this;
                    highResolutionOutputSizeshNQ4ISI = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.getHighResolutionOutputSizeshNQ4ISI(activity);
                }
                this.getHighResolutionOutputSizeshNQ4ISI(activity, highResolutionOutputSizeshNQ4ISI, null, onResult);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void login(android.app.Activity activity, java.lang.Integer toolbarColor, java.lang.String enforcedUserAccount, kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        getHighResolutionOutputSizeshNQ4ISI(activity, toolbarColor != null ? toolbarColor.intValue() : getHighResolutionOutputSizeshNQ4ISI(activity), enforcedUserAccount, onResult);
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void elevate(final android.app.Activity activity, final com.zettle.sdk.commons.network.Scope scope, final kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        this.getHighSpeedVideoFpsRangesFor.post(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$elevate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap() {
                final int highResolutionOutputSizeshNQ4ISI;
                com.zettle.sdk.core.auth.AuthProvider authProvider;
                com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.this;
                highResolutionOutputSizeshNQ4ISI = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.getHighResolutionOutputSizeshNQ4ISI(activity);
                authProvider = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.this.getHighResolutionOutputSizeshNQ4ISI;
                if (authProvider.isLoggedIn()) {
                    com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.access$elevate(com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.this, activity, scope, highResolutionOutputSizeshNQ4ISI, onResult);
                    return;
                }
                com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger2 = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.this;
                android.app.Activity activity2 = activity;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI);
                final com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger3 = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.this;
                final android.app.Activity activity3 = activity;
                final com.zettle.sdk.commons.network.Scope scope2 = scope;
                final kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1 = onResult;
                defaultProviderAuthenticatorTrigger2.login(activity2, valueOf, new kotlin.jvm.functions.Function1<kotlin.Result<? extends java.lang.Boolean>, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$elevate$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends java.lang.Boolean> result) {
                        getHighResolutionOutputSizeshNQ4ISI(result.getCamera2StreamConfigurationMap());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
                        com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger4 = com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.this;
                        android.app.Activity activity4 = activity3;
                        com.zettle.sdk.commons.network.Scope scope3 = scope2;
                        int i = highResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function12 = function1;
                        if (kotlin.Result.m23442isSuccessimpl(obj)) {
                            com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger.access$elevate(defaultProviderAuthenticatorTrigger4, activity4, scope3, i, function12);
                        }
                        kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function13 = function1;
                        if (kotlin.Result.m23439exceptionOrNullimpl(obj) == null || function13 == null) {
                            return;
                        }
                        function13.invoke(kotlin.Result.m23435boximpl(obj));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                });
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(android.app.Activity p0, int p1, java.lang.String p2, final kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> p3) {
        this.getHighSpeedVideoSizes.reportAuthStarted();
        this.getHighResolutionOutputSizeshNQ4ISI.login(getHighSpeedVideoFpsRangesFor(p0, p1, p2), new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$login$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoFpsRangesFor(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                com.zettle.sdk.core.auth.AuthAnalyticsReporter authAnalyticsReporter;
                com.izettle.android.core.data.result.Success success;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1 = p3;
                if (function1 != null) {
                    if (result instanceof com.izettle.android.core.data.result.Success) {
                        success = new com.izettle.android.core.data.result.Success(java.lang.Boolean.TRUE);
                    } else {
                        if (!(result instanceof com.izettle.android.core.data.result.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        success = result;
                    }
                    function1.invoke(kotlin.Result.m23435boximpl(com.zettle.sdk.extensions.ZettleExtKt.toKotlinResult(success)));
                }
                com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger = this;
                if (result instanceof com.izettle.android.core.data.result.Failure) {
                    com.zettle.sdk.core.log.LogKt.warn(defaultProviderAuthenticatorTrigger, "login error", (java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) result).getError());
                }
                com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger2 = this;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    authAnalyticsReporter = defaultProviderAuthenticatorTrigger2.getHighSpeedVideoSizes;
                    authAnalyticsReporter.reportAuthSuccess();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getHighResolutionOutputSizeshNQ4ISI(android.app.Activity activity) {
        android.content.res.Resources.Theme theme = activity.getTheme();
        java.lang.Integer num = null;
        android.content.res.TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(new int[]{android.R.attr.colorBackground}) : null;
        if (obtainStyledAttributes != null) {
            try {
                num = java.lang.Integer.valueOf(obtainStyledAttributes.getColor(0, -1));
            } finally {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final com.izettle.android.auth.OAuthBrowserLoginSpec getHighSpeedVideoFpsRangesFor(android.app.Activity p0, int p1, java.lang.String p2) {
        com.izettle.android.auth.OAuthBrowserLoginSpec.Builder username = com.izettle.android.auth.OAuthBrowserLoginSpec.INSTANCE.builder().setActivity(p0).setToolbarColor(java.lang.Integer.valueOf(p1)).setUsername(p2);
        java.lang.String[] resolveScopes = this.getHighResolutionOutputSizeshNQ4ISI.resolveScopes(com.zettle.sdk.commons.network.Scope.Payment);
        return username.addScopes((java.lang.String[]) java.util.Arrays.copyOf(resolveScopes, resolveScopes.length)).build();
    }

    public static final /* synthetic */ void access$elevate(final com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger, android.app.Activity activity, com.zettle.sdk.commons.network.Scope scope, int i, final kotlin.jvm.functions.Function1 function1) {
        defaultProviderAuthenticatorTrigger.getHighSpeedVideoSizes.reportVerifyStarted();
        com.izettle.android.auth.VerifySpec.Builder toolbarColor = com.izettle.android.auth.VerifySpec.INSTANCE.builder().setActivity(activity).setToolbarColor(java.lang.Integer.valueOf(i));
        java.lang.String[] resolveScopes = defaultProviderAuthenticatorTrigger.getHighResolutionOutputSizeshNQ4ISI.resolveScopes(scope);
        defaultProviderAuthenticatorTrigger.getHighResolutionOutputSizeshNQ4ISI.verify(toolbarColor.addScopes((java.lang.String[]) java.util.Arrays.copyOf(resolveScopes, resolveScopes.length)).build(), new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$elevate$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoSizes(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                com.zettle.sdk.core.auth.AuthAnalyticsReporter authAnalyticsReporter;
                com.izettle.android.core.data.result.Success success;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function12 = function1;
                if (function12 != null) {
                    if (result instanceof com.izettle.android.core.data.result.Success) {
                        success = new com.izettle.android.core.data.result.Success(java.lang.Boolean.TRUE);
                    } else {
                        if (!(result instanceof com.izettle.android.core.data.result.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        success = result;
                    }
                    function12.invoke(kotlin.Result.m23435boximpl(com.zettle.sdk.extensions.ZettleExtKt.toKotlinResult(success)));
                }
                com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger2 = defaultProviderAuthenticatorTrigger;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    authAnalyticsReporter = defaultProviderAuthenticatorTrigger2.getHighSpeedVideoSizes;
                    authAnalyticsReporter.reportVerifySuccess();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    @Override // com.zettle.sdk.core.auth.AuthenticatorTrigger
    public final void login(java.lang.String refreshToken, final kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "");
        this.getHighSpeedVideoSizes.reportAuthStarted();
        this.getHighResolutionOutputSizeshNQ4ISI.login(com.izettle.android.auth.TokenLoginSpec.INSTANCE.builder().setRefreshToken(refreshToken).build(), new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$loginToken$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoFpsRangesFor(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result) {
                com.zettle.sdk.core.auth.AuthAnalyticsReporter authAnalyticsReporter;
                com.izettle.android.core.data.result.Success success;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<kotlin.Result<java.lang.Boolean>, kotlin.Unit> function1 = onResult;
                if (function1 != null) {
                    if (result instanceof com.izettle.android.core.data.result.Success) {
                        success = new com.izettle.android.core.data.result.Success(java.lang.Boolean.TRUE);
                    } else {
                        if (!(result instanceof com.izettle.android.core.data.result.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        success = result;
                    }
                    function1.invoke(kotlin.Result.m23435boximpl(com.zettle.sdk.extensions.ZettleExtKt.toKotlinResult(com.izettle.android.core.data.result.ResultKt.onErrorResume(success, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean>() { // from class: com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger$loginToken$1.2
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Boolean invoke(java.lang.Throwable th) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                            return java.lang.Boolean.FALSE;
                        }
                    }))));
                }
                com.zettle.sdk.core.auth.DefaultProviderAuthenticatorTrigger defaultProviderAuthenticatorTrigger = this;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    authAnalyticsReporter = defaultProviderAuthenticatorTrigger.getHighSpeedVideoSizes;
                    authAnalyticsReporter.reportAuthSuccess();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }
}
