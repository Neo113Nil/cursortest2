package com.fyber.inneractive.sdk.config.cellular;

/* loaded from: classes3.dex */
public abstract class d implements com.fyber.inneractive.sdk.config.cellular.h {

    /* renamed from: a, reason: collision with root package name */
    public final android.telephony.TelephonyManager f3590a;
    public final android.net.ConnectivityManager b;
    public java.util.concurrent.CopyOnWriteArrayList c = new java.util.concurrent.CopyOnWriteArrayList();

    public d(android.content.Context context) {
        this.f3590a = (android.telephony.TelephonyManager) context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        this.b = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    public abstract void a();

    public abstract void a(com.fyber.inneractive.sdk.config.cellular.a aVar);

    public abstract void a(com.fyber.inneractive.sdk.config.cellular.h hVar);

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(com.fyber.inneractive.sdk.util.a1 a1Var) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("NetworkDetector: onNetworkUpdated: no update listeners", new java.lang.Object[0]);
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.config.cellular.h hVar = (com.fyber.inneractive.sdk.config.cellular.h) it.next();
            if (hVar != null) {
                hVar.a(a1Var);
            }
        }
    }
}
