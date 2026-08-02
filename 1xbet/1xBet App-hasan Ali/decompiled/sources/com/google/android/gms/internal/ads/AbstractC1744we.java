package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.we, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1744we {

    /* renamed from: k, reason: collision with root package name */
    public final Context f16123k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16124l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f16125m;

    public AbstractC1744we(InterfaceC0677Re interfaceC0677Re) {
        Context context = interfaceC0677Re.getContext();
        this.f16123k = context;
        this.f16124l = P2.o.f4767B.f4771c.x(context, interfaceC0677Re.m().f5852k);
        this.f16125m = new WeakReference(interfaceC0677Re);
    }

    public static /* bridge */ /* synthetic */ void j(AbstractC1744we abstractC1744we, HashMap hashMap) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) abstractC1744we.f16125m.get();
        if (interfaceC0677Re != null) {
            interfaceC0677Re.a("onPrecacheEvent", hashMap);
        }
    }

    public void i() {
    }

    public abstract void k();

    public final void l(String str, String str2, String str3, String str4) {
        U2.e.f5861b.post(new RunnableC1699ve(this, str, str2, str3, str4, 0));
    }

    public void m(int i) {
    }

    public void n(int i) {
    }

    public void o(int i) {
    }

    public void p(int i) {
    }

    public abstract boolean q(String str);

    public boolean r(String str, String[] strArr) {
        return q(str);
    }

    public boolean s(String str, String[] strArr, C1340ne c1340ne) {
        return q(str);
    }
}
