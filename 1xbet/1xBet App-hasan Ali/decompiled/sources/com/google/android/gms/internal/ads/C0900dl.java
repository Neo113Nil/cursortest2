package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900dl {

    /* renamed from: a, reason: collision with root package name */
    public final C0905dr f13161a;

    /* renamed from: b, reason: collision with root package name */
    public final C0855cl f13162b;

    public C0900dl(C0905dr c0905dr, C0855cl c0855cl) {
        this.f13161a = c0905dr;
        this.f13162b = c0855cl;
    }

    public final InterfaceC1427pb a(String str) {
        InterfaceC0624Ka interfaceC0624Ka = (InterfaceC0624Ka) ((AtomicReference) this.f13161a.f13188n).get();
        if (interfaceC0624Ka == null) {
            U2.j.i("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        InterfaceC1427pb C5 = interfaceC0624Ka.C(str);
        C0855cl c0855cl = this.f13162b;
        synchronized (c0855cl) {
            if (c0855cl.f13034a.containsKey(str)) {
                return C5;
            }
            try {
                c0855cl.f13034a.put(str, new C0811bl(str, C5.c(), C5.f(), true));
                return C5;
            } catch (Throwable unused) {
                return C5;
            }
        }
    }

    public final C0950er b(String str, JSONObject jSONObject) {
        InterfaceC0638Ma E5;
        C0855cl c0855cl = this.f13162b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                E5 = new BinderC0729Za(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                E5 = new BinderC0729Za(new zzbrw());
            } else {
                InterfaceC0624Ka interfaceC0624Ka = (InterfaceC0624Ka) ((AtomicReference) this.f13161a.f13188n).get();
                if (interfaceC0624Ka == null) {
                    U2.j.i("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        E5 = interfaceC0624Ka.W(string) ? interfaceC0624Ka.E("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC0624Ka.H(string) ? interfaceC0624Ka.E(string) : interfaceC0624Ka.E("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e3) {
                        U2.j.g("Invalid custom event.", e3);
                    }
                }
                E5 = interfaceC0624Ka.E(str);
            }
            C0950er c0950er = new C0950er(E5);
            c0855cl.b(str, c0950er);
            return c0950er;
        } catch (Throwable th) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.W8)).booleanValue()) {
                c0855cl.b(str, null);
            }
            throw new Yq(th);
        }
    }
}
