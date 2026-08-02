package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381oa implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14802k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14803l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14804m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14805n;

    public C1381oa(C4.m mVar, C1068ha c1068ha, A0.J0 j02) {
        this.f14803l = c1068ha;
        this.f14804m = j02;
        this.f14805n = mVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        switch (this.f14802k) {
            case 0:
                T2.G.m("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                synchronized (((C4.m) this.f14805n).f) {
                    try {
                        T2.G.m("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        U2.j.h("JS Engine is requesting an update");
                        if (((C4.m) this.f14805n).f908a == 0) {
                            U2.j.h("Starting reload.");
                            C4.m mVar = (C4.m) this.f14805n;
                            mVar.f908a = 2;
                            mVar.n();
                        }
                        ((C1068ha) this.f14803l).i("/requestReload", (C1381oa) ((A0.J0) this.f14804m).f304k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                T2.G.m("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((Y8) this.f14803l).q3((U8) ((AD) this.f14805n).d(), str);
                    return;
                } catch (RemoteException e3) {
                    U2.j.j("Failed to call onCustomClick for asset " + str + ".", e3);
                    return;
                }
        }
    }

    public C1381oa(Kj kj, Gj gj, Kk kk, AD ad) {
        this.f14803l = (Y8) kj.f10216g.get(gj.a());
        this.f14804m = kk;
        this.f14805n = ad;
    }
}
