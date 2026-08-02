package androidx.browser.customtabs;

/* loaded from: classes6.dex */
public abstract class PostMessageServiceConnection implements androidx.browser.customtabs.PostMessageBackend, android.content.ServiceConnection {
    private android.support.customtabs.IPostMessageService Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private final android.support.customtabs.ICustomTabsCallback getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    public void onPostMessageServiceDisconnected() {
    }

    public PostMessageServiceConnection(androidx.browser.customtabs.CustomTabsSessionToken customTabsSessionToken) {
        android.support.customtabs.ICustomTabsCallback iCustomTabsCallback = customTabsSessionToken.getHighSpeedVideoFpsRangesFor;
        android.os.IBinder asBinder = iCustomTabsCallback == null ? null : iCustomTabsCallback.asBinder();
        if (asBinder == null) {
            throw new java.lang.IllegalArgumentException("Provided session must have binder.");
        }
        this.getHighSpeedVideoFpsRanges = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(asBinder);
    }

    public void setPackageName(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public boolean bindSessionToPostMessageService(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(str, androidx.browser.customtabs.PostMessageService.class.getName());
        return context.bindService(intent, this, 1);
    }

    public boolean bindSessionToPostMessageService(android.content.Context context) {
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null) {
            throw new java.lang.IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
        }
        return bindSessionToPostMessageService(context, str);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.Camera2StreamConfigurationMap = android.support.customtabs.IPostMessageService.Stub.asInterface(iBinder);
        onPostMessageServiceConnected();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.Camera2StreamConfigurationMap = null;
        onPostMessageServiceDisconnected();
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public final boolean onNotifyMessageChannelReady(android.os.Bundle bundle) {
        return notifyMessageChannelReady(bundle);
    }

    public final boolean notifyMessageChannelReady(android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRangesFor = true;
        return Camera2StreamConfigurationMap(bundle);
    }

    private boolean Camera2StreamConfigurationMap(android.os.Bundle bundle) {
        if (this.Camera2StreamConfigurationMap == null) {
            return false;
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            try {
                this.Camera2StreamConfigurationMap.onMessageChannelReady(this.getHighSpeedVideoFpsRanges, bundle);
            } catch (android.os.RemoteException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public final boolean onPostMessage(java.lang.String str, android.os.Bundle bundle) {
        return postMessage(str, bundle);
    }

    public final boolean postMessage(java.lang.String str, android.os.Bundle bundle) {
        if (this.Camera2StreamConfigurationMap == null) {
            return false;
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            try {
                this.Camera2StreamConfigurationMap.onPostMessage(this.getHighSpeedVideoFpsRanges, str, bundle);
            } catch (android.os.RemoteException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    public void onDisconnectChannel(android.content.Context context) {
        unbindFromContext(context);
    }

    public void onPostMessageServiceConnected() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            Camera2StreamConfigurationMap(null);
        }
    }

    public void cleanup(android.content.Context context) {
        if (this.Camera2StreamConfigurationMap != null) {
            unbindFromContext(context);
        }
    }

    public void unbindFromContext(android.content.Context context) {
        if (this.Camera2StreamConfigurationMap != null) {
            context.unbindService(this);
            this.Camera2StreamConfigurationMap = null;
        }
    }
}
