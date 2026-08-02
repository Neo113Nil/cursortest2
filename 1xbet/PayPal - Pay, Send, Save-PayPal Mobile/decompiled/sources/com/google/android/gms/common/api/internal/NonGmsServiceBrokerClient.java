package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public final class NonGmsServiceBrokerClient implements com.google.android.gms.common.api.Api.Client, android.content.ServiceConnection {
    private static final java.lang.String zaa = "NonGmsServiceBrokerClient";
    private final java.lang.String zab;
    private final java.lang.String zac;
    private final android.content.ComponentName zad;
    private final android.content.Context zae;
    private final com.google.android.gms.common.api.internal.ConnectionCallbacks zaf;
    private final android.os.Handler zag;
    private final com.google.android.gms.common.api.internal.OnConnectionFailedListener zah;
    private android.os.IBinder zai;
    private boolean zaj;
    private java.lang.String zak;
    private java.lang.String zal;

    public NonGmsServiceBrokerClient(android.content.Context context, android.os.Looper looper, android.content.ComponentName componentName, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, null, null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    private final void zad() {
        if (java.lang.Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new java.lang.IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        zad();
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (java.lang.Exception unused) {
            }
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            android.content.ComponentName componentName = this.zad;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            boolean bindService = this.zae.bindService(intent, this, com.google.android.gms.common.internal.GmsClientSupervisor.getDefaultBindFlags());
            this.zaj = bindService;
            if (bindService) {
                return;
            }
            this.zai = null;
            this.zah.onConnectionFailed(new com.google.android.gms.common.ConnectionResult(16));
        } catch (java.lang.SecurityException e) {
            this.zaj = false;
            this.zai = null;
            throw e;
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        zad();
        try {
            this.zae.unbindService(this);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        this.zaj = false;
        this.zai = null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public final android.os.IBinder getBinder() {
        zad();
        return this.zai;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final java.lang.String getEndpointPackageName() {
        java.lang.String str = this.zab;
        if (str != null) {
            return str;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
        return java.util.Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final android.os.IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final android.content.Intent getSignInIntent() {
        return new android.content.Intent();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnected() {
        zad();
        return this.zai != null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnecting() {
        zad();
        return this.zaj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
        this.zag.post(new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zacg
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.this.zaa(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zag.post(new java.lang.Runnable() { // from class: com.google.android.gms.common.api.internal.zacf
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.this.zab();
            }
        });
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return false;
    }

    final /* synthetic */ void zaa(android.os.IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        this.zaf.onConnected(new android.os.Bundle());
    }

    final /* synthetic */ void zab() {
        this.zaj = false;
        this.zai = null;
        this.zaf.onConnectionSuspended(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private NonGmsServiceBrokerClient(android.content.Context context, android.os.Looper looper, java.lang.String str, java.lang.String str2, android.content.ComponentName componentName, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        this.zaj = false;
        this.zak = null;
        this.zae = context;
        this.zag = new com.google.android.gms.internal.base.zau(looper);
        this.zaf = connectionCallbacks;
        this.zah = onConnectionFailedListener;
        if (str != null && str2 != null) {
            if (componentName == null) {
                componentName = null;
                this.zab = str;
                this.zac = str2;
                this.zad = componentName;
                return;
            }
            throw new java.lang.AssertionError("Must specify either package or component, but not both");
        }
    }

    public NonGmsServiceBrokerClient(android.content.Context context, android.os.Looper looper, java.lang.String str, java.lang.String str2, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, null, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect(java.lang.String str) {
        zad();
        this.zak = str;
        disconnect();
    }

    public final void zac(java.lang.String str) {
        this.zal = str;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final com.google.android.gms.common.Feature[] getRequiredFeatures() {
        return new com.google.android.gms.common.Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final java.lang.String getLastDisconnectMessage() {
        return this.zak;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
        return new com.google.android.gms.common.Feature[0];
    }
}
