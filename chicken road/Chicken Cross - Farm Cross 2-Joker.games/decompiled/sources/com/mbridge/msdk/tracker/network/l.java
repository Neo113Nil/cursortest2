package com.mbridge.msdk.tracker.network;

/* compiled from: MBridgeVolleyManager.java */
/* loaded from: classes6.dex */
public class l {
    private static volatile l b;

    /* renamed from: a, reason: collision with root package name */
    private u f10006a;

    private l() {
    }

    public static l a() {
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    b = new l();
                }
            }
        }
        return b;
    }

    public u b() {
        if (this.f10006a == null) {
            u a2 = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f10006a = a2;
            a2.b();
        }
        return this.f10006a;
    }
}
