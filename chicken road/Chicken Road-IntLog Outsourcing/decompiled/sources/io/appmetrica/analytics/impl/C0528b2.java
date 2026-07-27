package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528b2 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7907a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile G7 f7908b = null;

    public final void a(G7 g7) {
        ArrayList a6;
        synchronized (this) {
            this.f7908b = g7;
            a6 = a();
        }
        Iterator it = a6.iterator();
        while (it.hasNext()) {
            ((InterfaceC0695he) it.next()).consume(g7);
        }
    }

    public final void b() {
        C0736j4.l().f8486e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C0736j4.l().f8486e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new Z1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        C0502a2 c0502a2 = new C0502a2(dataString);
        synchronized (this) {
            try {
                G7 g7 = this.f7908b;
                if (g7 == null) {
                    this.f7907a.add(c0502a2);
                } else {
                    ((G9) C0736j4.l().f8484c.a()).f6828b.post(new Y1(c0502a2, g7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f7907a);
        this.f7907a.clear();
        return arrayList;
    }
}
