package com.tekartik.sqflite;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes4.dex */
public final class k implements h {
    public final int a;
    public HandlerThread b;
    public Handler c;

    public k(int i) {
        this.a = i;
    }

    @Override // com.tekartik.sqflite.h
    public final void a() {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.b = null;
            this.c = null;
        }
    }

    @Override // com.tekartik.sqflite.h
    public final void b(f fVar) {
        this.c.post(fVar.b);
    }

    @Override // com.tekartik.sqflite.h
    public final void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.a);
        this.b = handlerThread;
        handlerThread.start();
        this.c = new Handler(this.b.getLooper());
    }
}
