package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4713wb {

    /* renamed from: a, reason: collision with root package name */
    private final a f8746a;
    protected long b;

    /* renamed from: com.ironsource.wb$a */
    private class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f8747a;

        private a() {
        }

        public Handler a() {
            return this.f8747a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f8747a = new Handler();
            Looper.loop();
        }
    }

    public C4713wb() {
        a aVar = new a();
        this.f8746a = aVar;
        aVar.start();
        this.b = new Date().getTime();
    }

    protected boolean a(Object obj) {
        return (obj == null || this.f8746a == null) ? false : true;
    }

    protected void a(Runnable runnable) {
        Handler a2;
        a aVar = this.f8746a;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return;
        }
        a2.post(runnable);
    }
}
