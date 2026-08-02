package com.tekartik.sqflite;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes4.dex */
public final class g {
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;
    public i e;
    public f f;

    public g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final synchronized void a(i iVar) {
        HandlerThread handlerThread = new HandlerThread(this.a, this.b);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
        this.e = iVar;
    }
}
