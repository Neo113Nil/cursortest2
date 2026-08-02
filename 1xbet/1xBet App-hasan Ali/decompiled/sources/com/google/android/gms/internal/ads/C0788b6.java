package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788b6 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0966f6 f12763a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC0877d6 f12764b = new BinderC0877d6("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public C0788b6(InterfaceC0966f6 interfaceC0966f6) {
        this.f12763a = interfaceC0966f6;
    }

    public static void a(Context context, String str, J2.h hVar, Wl wl) {
        m3.v.f("Context cannot be null.", context);
        m3.v.f("adUnitId cannot be null.", str);
        m3.v.c("#008 Must be called on the main UI thread.");
        F7.a(context);
        if (((Boolean) AbstractC0968f8.f13457d.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                U2.c.f5860b.execute(new K2.e(context, str, hVar, wl, 1));
                return;
            }
        }
        new C1234l6(context, str, hVar.f2711a, wl).d();
    }

    public final void b(Activity activity) {
        try {
            this.f12763a.R0(new BinderC2361b(activity), this.f12764b);
        } catch (RemoteException e3) {
            U2.j.k("#007 Could not call remote method.", e3);
        }
    }
}
