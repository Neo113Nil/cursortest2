package com.goldenboot.saga.zone;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.goldenboot.saga.zone.EmbeddedBeacon;
import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class ElevationSteward extends RestoreCheckpoint {
    public ServiceConnection detachStream;
    public int evictLayout = 0;
    public final Context growPayload;
    public EmbeddedBeacon injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class BounceHandler implements ServiceConnection {
        public final RemotePropagator evictLayout;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            FragmentStack.evictLayout("InstallReferrerClient", "Install Referrer service connected.");
            ElevationSteward.this.injectMetric = EmbeddedBeacon.ActivityMutator.growPayload(iBinder);
            ElevationSteward.this.evictLayout = 2;
            this.evictLayout.evictLayout(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            FragmentStack.growPayload("InstallReferrerClient", "Install Referrer service disconnected.");
            ElevationSteward.this.injectMetric = null;
            ElevationSteward.this.evictLayout = 0;
            this.evictLayout.growPayload();
        }

        public BounceHandler(RemotePropagator remotePropagator) {
            if (remotePropagator == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.evictLayout = remotePropagator;
        }
    }

    public ElevationSteward(Context context) {
        this.growPayload = context.getApplicationContext();
    }

    @Override // com.goldenboot.saga.zone.RestoreCheckpoint
    public void detachStream(RemotePropagator remotePropagator) {
        ServiceInfo serviceInfo;
        if (updateTimer()) {
            FragmentStack.evictLayout("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            remotePropagator.evictLayout(0);
            return;
        }
        int i = this.evictLayout;
        if (i == 1) {
            FragmentStack.growPayload("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            remotePropagator.evictLayout(3);
            return;
        }
        if (i == 3) {
            FragmentStack.growPayload("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            remotePropagator.evictLayout(3);
            return;
        }
        FragmentStack.evictLayout("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.growPayload.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.evictLayout = 0;
            FragmentStack.evictLayout("InstallReferrerClient", "Install Referrer service unavailable on device.");
            remotePropagator.evictLayout(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !flushSample()) {
            FragmentStack.growPayload("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.evictLayout = 0;
            remotePropagator.evictLayout(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        BounceHandler bounceHandler = new BounceHandler(remotePropagator);
        this.detachStream = bounceHandler;
        try {
            if (this.growPayload.bindService(intent2, bounceHandler, 1)) {
                FragmentStack.evictLayout("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            FragmentStack.growPayload("InstallReferrerClient", "Connection to service is blocked.");
            this.evictLayout = 0;
            remotePropagator.evictLayout(1);
        } catch (SecurityException unused) {
            FragmentStack.growPayload("InstallReferrerClient", "No permission to connect to service.");
            this.evictLayout = 0;
            remotePropagator.evictLayout(4);
        }
    }

    @Override // com.goldenboot.saga.zone.RestoreCheckpoint
    public void evictLayout() {
        this.evictLayout = 3;
        if (this.detachStream != null) {
            FragmentStack.evictLayout("InstallReferrerClient", "Unbinding from service.");
            this.growPayload.unbindService(this.detachStream);
            this.detachStream = null;
        }
        this.injectMetric = null;
    }

    public final boolean flushSample() {
        return this.growPayload.getPackageManager().getPackageInfo("com.android.vending", ContentOperation.SpotShadowColor).versionCode >= 80837300;
    }

    @Override // com.goldenboot.saga.zone.RestoreCheckpoint
    public InitFlag growPayload() {
        if (!updateTimer()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.growPayload.getPackageName());
        try {
            return new InitFlag(this.injectMetric.evictLayout(bundle));
        } catch (RemoteException e) {
            FragmentStack.growPayload("InstallReferrerClient", "RemoteException getting install referrer information");
            this.evictLayout = 0;
            throw e;
        }
    }

    public boolean updateTimer() {
        return (this.evictLayout != 2 || this.injectMetric == null || this.detachStream == null) ? false : true;
    }
}
