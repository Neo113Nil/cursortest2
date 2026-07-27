package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Jl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ll f7021a;

    public Jl(Ll ll) {
        this.f7021a = ll;
    }

    public final void a(String str, Nl nl, C0754jm c0754jm) {
        ArrayList arrayList;
        synchronized (this.f7021a.f7108b) {
            try {
                Collection collection = (Collection) this.f7021a.f7107a.f9514a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ul) it.next()).a(nl, c0754jm);
        }
    }
}
