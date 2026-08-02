package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126io implements InterfaceC1349nn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13991a;

    /* renamed from: b, reason: collision with root package name */
    public final C0900dl f13992b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13993c;

    public C1126io(C1664uo c1664uo, C0900dl c0900dl) {
        this.f13991a = 1;
        this.f13993c = c1664uo;
        this.f13992b = c0900dl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1349nn
    public final C1394on a(String str, JSONObject jSONObject) {
        C1394on c1394on;
        InterfaceC1427pb a5;
        switch (this.f13991a) {
            case 0:
                synchronized (this) {
                    try {
                        c1394on = (C1394on) ((HashMap) this.f13993c).get(str);
                        if (c1394on == null) {
                            c1394on = new C1394on(this.f13992b.b(str, jSONObject), new In(), str);
                            ((HashMap) this.f13993c).put(str, c1394on);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1394on;
            default:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8673D1)).booleanValue()) {
                    try {
                        a5 = this.f13992b.a(str);
                    } catch (RemoteException e3) {
                        U2.j.g("Coundn't create RTB adapter: ", e3);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((C1664uo) this.f13993c).f15908a;
                    if (concurrentHashMap.containsKey(str)) {
                        a5 = (InterfaceC1427pb) concurrentHashMap.get(str);
                    }
                    a5 = null;
                }
                if (a5 == null) {
                    return null;
                }
                return new C1394on(a5, new Hn(), str);
        }
    }

    public C1126io(C0900dl c0900dl) {
        this.f13991a = 0;
        this.f13993c = new HashMap();
        this.f13992b = c0900dl;
    }
}
