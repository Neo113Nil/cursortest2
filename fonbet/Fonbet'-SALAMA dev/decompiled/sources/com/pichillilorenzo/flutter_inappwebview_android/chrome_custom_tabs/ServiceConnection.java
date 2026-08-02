package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p.AbstractC1520g;
import p.AbstractServiceConnectionC1527n;

/* loaded from: classes2.dex */
public class ServiceConnection extends AbstractServiceConnectionC1527n {
    private WeakReference<ServiceConnectionCallback> mConnectionCallback;

    public ServiceConnection(ServiceConnectionCallback serviceConnectionCallback) {
        this.mConnectionCallback = new WeakReference<>(serviceConnectionCallback);
    }

    @Override // p.AbstractServiceConnectionC1527n
    public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC1520g abstractC1520g) {
        ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceConnected(abstractC1520g);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ServiceConnectionCallback serviceConnectionCallback = this.mConnectionCallback.get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceDisconnected();
        }
    }
}
