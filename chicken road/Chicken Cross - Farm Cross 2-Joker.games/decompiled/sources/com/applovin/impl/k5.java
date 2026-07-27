package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class k5 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f4271a = new HashSet(32);
    private final Object b = new Object();

    public boolean a(String str) {
        synchronized (this.b) {
            Iterator it = this.f4271a.iterator();
            while (it.hasNext()) {
                if (str.equals(((l5) it.next()).b())) {
                    return true;
                }
            }
            return false;
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        l5 a2;
        if (StringUtils.isValidString(str)) {
            synchronized (this.b) {
                a2 = a(str, appLovinCommunicatorSubscriber);
            }
            if (a2 != null) {
                a2.a(false);
                AppLovinBroadcastManager.unregisterReceiver(a2);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.b) {
                l5 a2 = a(str, appLovinCommunicatorSubscriber);
                if (a2 != null) {
                    com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!a2.c()) {
                        a2.a(true);
                        AppLovinBroadcastManager.registerReceiver(a2, new IntentFilter(str));
                    }
                    return true;
                }
                l5 l5Var = new l5(str, appLovinCommunicatorSubscriber);
                this.f4271a.add(l5Var);
                AppLovinBroadcastManager.registerReceiver(l5Var, new IntentFilter(str));
                return true;
            }
        }
        com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private l5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (l5 l5Var : this.f4271a) {
            if (str.equals(l5Var.b()) && appLovinCommunicatorSubscriber.equals(l5Var.a())) {
                return l5Var;
            }
        }
        return null;
    }
}
