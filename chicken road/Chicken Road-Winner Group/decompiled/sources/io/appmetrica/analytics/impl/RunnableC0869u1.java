package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0869u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8380a;

    public RunnableC0869u1(Context context) {
        this.f8380a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vj vj = AbstractC0861tj.f8372a;
        Context context = this.f8380a;
        synchronized (vj) {
            try {
                if (vj.f6762b == null) {
                    vj.f6762b = AbstractC0834si.f8312a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = vj.f6761a.iterator();
                    while (it.hasNext()) {
                        ((Xa) it.next()).a(vj.f6762b);
                    }
                    vj.f6761a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
