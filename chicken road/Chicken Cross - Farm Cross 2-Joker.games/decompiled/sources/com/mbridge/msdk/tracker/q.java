package com.mbridge.msdk.tracker;

import android.util.Log;

/* compiled from: ProcessorWrapper.java */
/* loaded from: classes6.dex */
class q implements l {

    /* renamed from: a, reason: collision with root package name */
    private final g f10031a;

    public q(g gVar) {
        this.f10031a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f10031a)) {
            return;
        }
        this.f10031a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f10031a)) {
            return;
        }
        try {
            h j = eVar.j();
            if (y.a(j)) {
                eVar.a(j.a(eVar));
            }
            this.f10031a.b(eVar);
        } catch (Exception e) {
            if (a.f9983a) {
                Log.e("TrackManager", "process event error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.f10031a)) {
            return new long[]{0, 0};
        }
        return this.f10031a.a();
    }
}
