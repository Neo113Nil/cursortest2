package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660m implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7829a = new HashSet();

    public C0660m(C0712o c0712o) {
        c0712o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC0634l interfaceC0634l) {
        this.f7829a.add(interfaceC0634l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C0587j4.l().f7572c.a().execute(new RunnableC0608k(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f7829a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0525gj) ((InterfaceC0634l) it.next())).a(activity);
        }
    }
}
