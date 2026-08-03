package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public abstract class GoogleApi<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.HasApiKey<O> {
    protected final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final android.content.Context zab;
    private final java.lang.String zac;
    private final com.google.android.gms.common.api.Api zad;
    private final com.google.android.gms.common.api.Api.ApiOptions zae;
    private final com.google.android.gms.common.api.internal.ApiKey zaf;
    private final android.os.Looper zag;
    private final int zah;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.GoogleApiClient zai;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class Settings {
        public static final com.google.android.gms.common.api.GoogleApi.Settings DEFAULT_SETTINGS = new com.google.android.gms.common.api.GoogleApi.Settings.Builder().build();
        public final com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
        public final android.os.Looper zab;

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public static class Builder {
            private com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
            private android.os.Looper zab;

            /* JADX WARN: Multi-variable type inference failed */
            public com.google.android.gms.common.api.GoogleApi.Settings build() {
                if (this.zaa == null) {
                    this.zaa = new com.google.android.gms.common.api.internal.ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = android.os.Looper.getMainLooper();
                }
                return new com.google.android.gms.common.api.GoogleApi.Settings(this.zaa, this.zab);
            }

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setLooper(android.os.Looper looper) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setMapper(com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        private Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper, android.accounts.Account account, android.os.Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }
    }

    public GoogleApi(android.app.Activity activity, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        this(activity, activity, api, o, settings);
    }

    private final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zad(int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zau(this, i, apiMethodImpl);
        return apiMethodImpl;
    }

    private final com.google.android.gms.tasks.Task zae(int i, com.google.android.gms.common.api.internal.TaskApiCall taskApiCall) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zaa.zav(this, i, taskApiCall, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    protected com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
        android.accounts.Account account;
        java.util.Set<com.google.android.gms.common.api.Scope> emptySet;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount;
        com.google.android.gms.common.internal.ClientSettings.Builder builder = new com.google.android.gms.common.internal.ClientSettings.Builder();
        com.google.android.gms.common.api.Api.ApiOptions apiOptions = this.zae;
        if (!(apiOptions instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) {
            com.google.android.gms.common.api.Api.ApiOptions apiOptions2 = this.zae;
            account = apiOptions2 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions ? ((com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions) apiOptions2).getAccount() : null;
        } else {
            account = googleSignInAccount.getAccount();
        }
        builder.zab(account);
        com.google.android.gms.common.api.Api.ApiOptions apiOptions3 = this.zae;
        if (apiOptions3 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount2 = ((com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions3).getGoogleSignInAccount();
            emptySet = googleSignInAccount2 == null ? java.util.Collections.emptySet() : googleSignInAccount2.getRequestedScopes();
        } else {
            emptySet = java.util.Collections.emptySet();
        }
        builder.zaa(emptySet);
        builder.zac(this.zab.getClass().getName());
        builder.setRealClientPackageName(this.zab.getPackageName());
        return builder;
    }

    protected com.google.android.gms.tasks.Task<java.lang.Boolean> disconnectService() {
        return this.zaa.zan(this);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doBestEffortWrite(T t) {
        zad(2, t);
        return t;
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doRead(T t) {
        zad(0, t);
        return t;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.RegisterListenerMethod<A, ?>, U extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, ?>> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(T t, U u) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(u);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.common.internal.Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zao(this, t, u, new java.lang.Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doWrite(T t) {
        zad(1, t);
        return t;
    }

    protected java.lang.String getApiFallbackAttributionTag(android.content.Context context) {
        return null;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final com.google.android.gms.common.api.internal.ApiKey<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public android.content.Context getApplicationContext() {
        return this.zab;
    }

    protected java.lang.String getContextAttributionTag() {
        return this.zac;
    }

    @java.lang.Deprecated
    protected java.lang.String getContextFeatureId() {
        return this.zac;
    }

    public android.os.Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L l, java.lang.String str) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(l, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.google.android.gms.common.api.Api.Client zab(android.os.Looper looper, com.google.android.gms.common.api.internal.zabq zabqVar) {
        com.google.android.gms.common.internal.ClientSettings build = createClientSettingsBuilder().build();
        com.google.android.gms.common.api.Api.Client buildClient = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper, build, (com.google.android.gms.common.internal.ClientSettings) this.zae, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zabqVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zabqVar);
        java.lang.String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
            ((com.google.android.gms.common.internal.BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient)) {
            ((com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient) buildClient).zac(contextAttributionTag);
        }
        return buildClient;
    }

    public final com.google.android.gms.common.api.internal.zact zac(android.content.Context context, android.os.Handler handler) {
        return new com.google.android.gms.common.api.internal.zact(context, handler, createClientSettingsBuilder().build());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoogleApi(android.app.Activity activity, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        this(activity, (com.google.android.gms.common.api.Api) api, (com.google.android.gms.common.api.Api.ApiOptions) o, r0.build());
        com.google.android.gms.common.api.GoogleApi.Settings.Builder builder = new com.google.android.gms.common.api.GoogleApi.Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        builder.setLooper(activity.getMainLooper());
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doRead(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zap(this, listenerKey, i);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doWrite(com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(android.content.Context context, android.app.Activity activity, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.Api.ApiOptions apiOptions, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        java.lang.String apiFallbackAttributionTag;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(api, "Api must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context context2 = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (android.os.Build.VERSION.SDK_INT < 30 || context == null) {
            apiFallbackAttributionTag = context != null ? getApiFallbackAttributionTag(context) : null;
        } else {
            apiFallbackAttributionTag = context.getAttributionTag();
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = api;
        this.zae = apiOptions;
        this.zag = settings.zab;
        com.google.android.gms.common.api.internal.ApiKey sharedApiKey = com.google.android.gms.common.api.internal.ApiKey.getSharedApiKey(api, apiOptions, apiFallbackAttributionTag);
        this.zaf = sharedApiKey;
        this.zai = new com.google.android.gms.common.api.internal.zabv(this);
        com.google.android.gms.common.api.internal.GoogleApiManager zak = com.google.android.gms.common.api.internal.GoogleApiManager.zak(context2);
        this.zaa = zak;
        this.zah = zak.zaa();
        this.zaj = settings.zaa;
        if (activity != null && !(activity instanceof com.google.android.gms.common.api.GoogleApiActivity) && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.zaae.zad(activity, zak, sharedApiKey);
        }
        zak.zaz(this);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public <A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods<A, ?> registrationMethods) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zao(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, O o, android.os.Looper looper, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, r0.build());
        com.google.android.gms.common.api.GoogleApi.Settings.Builder builder = new com.google.android.gms.common.api.GoogleApi.Settings.Builder();
        builder.setLooper(looper);
        builder.setMapper(statusExceptionMapper);
    }

    public GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        this(context, (android.app.Activity) null, api, o, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoogleApi(android.content.Context context, com.google.android.gms.common.api.Api<O> api, O o, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, r0.build());
        com.google.android.gms.common.api.GoogleApi.Settings.Builder builder = new com.google.android.gms.common.api.GoogleApi.Settings.Builder();
        builder.setMapper(statusExceptionMapper);
    }
}
