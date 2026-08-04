package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import p017c.b;
import p109p.a;
import p109p.g;
import p109p.l;
import p109p.n;
import p109p.q;
import p116q.c;

/* JADX INFO: loaded from: classes2.dex */
public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private g mClient;
    private n mConnection;
    private ConnectionCallback mConnectionCallback;
    private a mCustomTabsCallback;
    private q mCustomTabsSession;

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

    public static void openTrustedWebActivity(Activity activity, c cVar, Uri uri, Map<String, String> map, Uri uri2, int i7) {
        openCustomTab(activity, cVar.f15722a, uri, map, uri2, i7);
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
        return g.a(activity, packageNameToUse, serviceConnection);
    }

    public q getSession() {
        g gVar = this.mClient;
        if (gVar == null) {
            this.mCustomTabsSession = null;
        } else if (this.mCustomTabsSession == null) {
            this.mCustomTabsSession = gVar.c(this.mCustomTabsCallback);
        }
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        q session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        try {
            return ((b) session.f15665b).t0(session.f15666c, uri, session.a(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceConnected(g gVar) {
        this.mClient = gVar;
        gVar.getClass();
        try {
            ((b) gVar.f15647a).B0();
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

    public void setCustomTabsCallback(a aVar) {
        this.mCustomTabsCallback = aVar;
    }

    public void unbindCustomTabsService(Activity activity) {
        n nVar = this.mConnection;
        if (nVar == null) {
            return;
        }
        activity.unbindService(nVar);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }

    public static void openCustomTab(Activity activity, l lVar, Uri uri, Map<String, String> map, Uri uri2, int i7) {
        openCustomTab(activity, lVar.f15656a, uri, map, uri2, i7);
    }
}
