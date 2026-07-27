package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: EventProcessor.java */
/* loaded from: classes6.dex */
class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f9987a;
    private final s b;
    private final AtomicLong c = new AtomicLong(0);
    private final long[] d = new long[2];

    public g(c cVar, s sVar) {
        this.f9987a = cVar;
        this.b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long incrementAndGet = this.c.incrementAndGet();
            this.d[0] = System.currentTimeMillis();
            this.d[1] = incrementAndGet;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f9987a.a(iVar);
            this.b.l();
            this.b.e();
            this.b.a(eVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
