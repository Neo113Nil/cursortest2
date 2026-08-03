package com.fyber.inneractive.sdk.flow.nativead.trackers;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.w0 f3726a;
    public com.fyber.inneractive.sdk.flow.nativead.trackers.b b;

    public a(com.fyber.inneractive.sdk.flow.w0 w0Var) {
        this.f3726a = w0Var;
    }

    public final void a(com.fyber.inneractive.sdk.flow.nativead.trackers.c cVar) {
        java.util.Iterator it = this.f3726a.w.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sHitting URL: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), str);
                com.fyber.inneractive.sdk.network.z0.b(str);
            }
        }
        com.fyber.inneractive.sdk.flow.nativead.trackers.b bVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.b(this.f3726a.x, cVar);
        this.b = bVar;
        if (bVar.d == null || bVar.c == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("%sWas destroyed, create a new instance", com.fyber.inneractive.sdk.flow.nativead.trackers.b.e);
        } else {
            bVar.a();
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.b bVar = this.b;
        if (bVar != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sDestroy called", com.fyber.inneractive.sdk.flow.nativead.trackers.b.e);
            android.os.Handler handler = bVar.d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                bVar.d = null;
            }
            com.fyber.inneractive.sdk.web.m mVar = bVar.c;
            if (mVar != null) {
                com.fyber.inneractive.sdk.util.v.a(mVar);
                mVar.destroy();
                bVar.c = null;
            }
            bVar.b = null;
            this.b = null;
        }
        this.f3726a = null;
    }
}
