package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import c.b;
import java.util.List;
import java.util.Map;
import p.AbstractC1514a;
import p.AbstractC1520g;
import p.AbstractServiceConnectionC1527n;
import p.C1525l;
import p.C1530q;
import q.C1543c;

/* loaded from: classes2.dex */
public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private AbstractC1520g mClient;
    private AbstractServiceConnectionC1527n mConnection;
    private ConnectionCallback mConnectionCallback;
    private AbstractC1514a mCustomTabsCallback;
    private C1530q mCustomTabsSession;

    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, Intent intent, Uri uri, Map<String, String> map, Uri uri2, int i7) {
        intent.setData(uri);
        if (map != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
        if (uri2 != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri2);
        }
        activity.startActivityForResult(intent, i7);
    }

    public static void openTrustedWebActivity(Activity activity, C1543c c1543c, Uri uri, Map<String, String> map, Uri uri2, int i7) {
        openCustomTab(activity, c1543c.f15716a, uri, map, uri2, i7);
    }

    public boolean bindCustomTabsService(Activity activity) {
        if (this.mClient != null) {
            return true;
        }
        String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
        if (packageNameToUse == null) {
            return false;
        }
        ServiceConnection serviceConnection = new ServiceConnection(this);
        this.mConnection = serviceConnection;
        return AbstractC1520g.a(activity, packageNameToUse, serviceConnection);
    }

    public C1530q getSession() {
        AbstractC1520g abstractC1520g = this.mClient;
        if (abstractC1520g == null) {
            this.mCustomTabsSession = null;
        } else if (this.mCustomTabsSession == null) {
            this.mCustomTabsSession = abstractC1520g.c(this.mCustomTabsCallback);
        }
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        C1530q session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        try {
            return ((b) session.f15659b).t0(session.f15660c, uri, session.a(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceConnected(AbstractC1520g abstractC1520g) {
        this.mClient = abstractC1520g;
        abstractC1520g.getClass();
        try {
            ((b) abstractC1520g.f15641a).B0();
        } catch (RemoteException unused) {
        }
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(AbstractC1514a abstractC1514a) {
        this.mCustomTabsCallback = abstractC1514a;
    }

    public void unbindCustomTabsService(Activity activity) {
        AbstractServiceConnectionC1527n abstractServiceConnectionC1527n = this.mConnection;
        if (abstractServiceConnectionC1527n == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC1527n);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }

    public static void openCustomTab(Activity activity, C1525l c1525l, Uri uri, Map<String, String> map, Uri uri2, int i7) {
        openCustomTab(activity, c1525l.f15650a, uri, map, uri2, i7);
    }
}
