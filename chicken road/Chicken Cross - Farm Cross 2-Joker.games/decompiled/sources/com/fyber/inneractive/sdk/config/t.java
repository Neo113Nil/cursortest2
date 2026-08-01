package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5288a;

    public t(v vVar) {
        this.f5288a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f5288a;
        Iterator it = vVar.c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).onGlobalConfigChanged(vVar, vVar.b);
        }
    }
}
