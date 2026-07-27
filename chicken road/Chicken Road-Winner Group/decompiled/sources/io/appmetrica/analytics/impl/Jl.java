package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Jl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ll f6168a;

    public Jl(Ll ll) {
        this.f6168a = ll;
    }

    public final void a(String str, Nl nl, C0605jm c0605jm) {
        ArrayList arrayList;
        synchronized (this.f6168a.f6250b) {
            try {
                Collection collection = (Collection) this.f6168a.f6249a.f8557a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ul) it.next()).a(nl, c0605jm);
        }
    }
}
