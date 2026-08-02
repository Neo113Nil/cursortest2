package com.tekartik.sqflite;

import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes4.dex */
public final class s implements Runnable {
    public final /* synthetic */ d a;
    public final /* synthetic */ MethodChannel.Result b;
    public final /* synthetic */ u c;

    public s(u uVar, d dVar, MethodChannel.Result result) {
        this.c = uVar;
        this.a = dVar;
        this.b = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (u.f) {
            u.a(this.c, this.a);
        }
        this.b.success(null);
    }
}
