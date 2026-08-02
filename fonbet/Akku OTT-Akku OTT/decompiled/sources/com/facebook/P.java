package com.facebook;

import android.os.Handler;
import com.facebook.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P {
    public final Handler a;
    public final z b;
    public final long c;
    public long d;
    public long e;
    public long f;

    public P(Handler handler, z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = handler;
        this.b = request;
        w wVar = w.a;
        com.facebook.internal.F.f();
        this.c = w.i.get();
    }

    public final void a() {
        long j = this.d;
        if (j > this.e) {
            z.b bVar = this.b.g;
            long j2 = this.f;
            if (j2 <= 0 || !(bVar instanceof z.e)) {
                return;
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new O(bVar, j, j2));
            } else {
                ((z.e) bVar).b();
            }
            this.e = this.d;
        }
    }
}
