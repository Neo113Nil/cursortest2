package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class RunnableC4735xf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8764a;
    private final Z4 b;

    RunnableC4735xf(Z4 z4, Handler handler) {
        this.b = z4;
        this.f8764a = handler;
    }

    W5 a(Z4 z4, String str, long j) {
        return new W5(z4, str, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        C4710w8 c4710w8 = new C4710w8(this.b.b().getParent(), this.b.b().getName());
        Message a2 = a();
        a2.obj = c4710w8;
        String a3 = a(c4710w8.getParent());
        if (a3 == null) {
            a2.what = 1020;
            this.f8764a.sendMessage(a2);
        } else {
            C4288a5 call = a(new Z4(c4710w8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), a3, 3L).call();
            a2.what = call.b() == 200 ? 1016 : call.b();
            this.f8764a.sendMessage(a2);
        }
    }

    Message a() {
        return new Message();
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
