package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.m;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public w0 f5379a;
    public b b;

    public a(w0 w0Var) {
        this.f5379a = w0Var;
    }

    public final void a(c cVar) {
        Iterator it = this.f5379a.w.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("%sHitting URL: %s", IAlog.a(this), str);
                z0.b(str);
            }
        }
        b bVar = new b(this.f5379a.x, cVar);
        this.b = bVar;
        if (bVar.d == null || bVar.c == null) {
            IAlog.b("%sWas destroyed, create a new instance", b.e);
        } else {
            bVar.a();
        }
    }

    public final void a() {
        b bVar = this.b;
        if (bVar != null) {
            IAlog.a("%sDestroy called", b.e);
            Handler handler = bVar.d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                bVar.d = null;
            }
            m mVar = bVar.c;
            if (mVar != null) {
                v.a(mVar);
                mVar.destroy();
                bVar.c = null;
            }
            bVar.b = null;
            this.b = null;
        }
        this.f5379a = null;
    }
}
