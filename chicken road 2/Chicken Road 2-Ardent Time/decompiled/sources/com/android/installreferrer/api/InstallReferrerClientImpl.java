package com.android.installreferrer.api;

/* loaded from: classes.dex */
class InstallReferrerClientImpl extends com.android.installreferrer.api.InstallReferrerClient {
    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final java.lang.String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final java.lang.String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final java.lang.String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final java.lang.String TAG = "InstallReferrerClient";
    private int clientState = 0;
    private final android.content.Context mApplicationContext;
    private i0.c service;
    private android.content.ServiceConnection serviceConnection;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class InstallReferrerServiceConnection implements android.content.ServiceConnection {
        private final com.android.installreferrer.api.InstallReferrerStateListener mListener;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            i0.c c0180a;
            u0.AbstractC0995a.r("Install Referrer service connected.");
            com.android.installreferrer.api.InstallReferrerClientImpl installReferrerClientImpl = com.android.installreferrer.api.InstallReferrerClientImpl.this;
            int i2 = i0.AbstractBinderC0181b.f3307a;
            if (iBinder == null) {
                c0180a = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0180a = queryLocalInterface instanceof i0.c ? (i0.c) queryLocalInterface : new i0.C0180a(iBinder);
            }
            installReferrerClientImpl.service = c0180a;
            com.android.installreferrer.api.InstallReferrerClientImpl.this.clientState = 2;
            this.mListener.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            u0.AbstractC0995a.s("Install Referrer service disconnected.");
            com.android.installreferrer.api.InstallReferrerClientImpl.this.service = null;
            com.android.installreferrer.api.InstallReferrerClientImpl.this.clientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }

        private InstallReferrerServiceConnection(com.android.installreferrer.api.InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new java.lang.RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.mListener = installReferrerStateListener;
        }
    }

    public InstallReferrerClientImpl(android.content.Context context) {
        this.mApplicationContext = context.getApplicationContext();
    }

    private boolean isPlayStoreCompatible() {
        return this.mApplicationContext.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, 128).versionCode >= PLAY_STORE_MIN_APP_VER;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            u0.AbstractC0995a.r("Unbinding from service.");
            this.mApplicationContext.unbindService(this.serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public com.android.installreferrer.api.ReferrerDetails getInstallReferrer() {
        if (!isReady()) {
            throw new java.lang.IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package_name", this.mApplicationContext.getPackageName());
        try {
            return new com.android.installreferrer.api.ReferrerDetails(((i0.C0180a) this.service).a(bundle));
        } catch (android.os.RemoteException e2) {
            u0.AbstractC0995a.s("RemoteException getting install referrer information");
            this.clientState = 0;
            throw e2;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(com.android.installreferrer.api.InstallReferrerStateListener installReferrerStateListener) {
        android.content.pm.ServiceInfo serviceInfo;
        if (isReady()) {
            u0.AbstractC0995a.r("Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i2 = this.clientState;
        if (i2 == 1) {
            u0.AbstractC0995a.s("Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i2 == 3) {
            u0.AbstractC0995a.s("Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        u0.AbstractC0995a.r("Starting install referrer service setup.");
        android.content.Intent intent = new android.content.Intent(SERVICE_ACTION_NAME);
        intent.setComponent(new android.content.ComponentName(SERVICE_PACKAGE_NAME, SERVICE_NAME));
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.clientState = 0;
            u0.AbstractC0995a.r("Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        java.lang.String str = serviceInfo.packageName;
        java.lang.String str2 = serviceInfo.name;
        if (!SERVICE_PACKAGE_NAME.equals(str) || str2 == null || !isPlayStoreCompatible()) {
            u0.AbstractC0995a.s("Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(intent);
        com.android.installreferrer.api.InstallReferrerClientImpl.InstallReferrerServiceConnection installReferrerServiceConnection = new com.android.installreferrer.api.InstallReferrerClientImpl.InstallReferrerServiceConnection(installReferrerStateListener);
        this.serviceConnection = installReferrerServiceConnection;
        try {
            if (this.mApplicationContext.bindService(intent2, installReferrerServiceConnection, 1)) {
                u0.AbstractC0995a.r("Service was bonded successfully.");
                return;
            }
            u0.AbstractC0995a.s("Connection to service is blocked.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        } catch (java.lang.SecurityException unused) {
            u0.AbstractC0995a.s("No permission to connect to service.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(4);
        }
    }
}
