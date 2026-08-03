package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ek extends java.util.TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fk f4689a;
    public final /* synthetic */ byte b;

    public Ek(com.inmobi.media.Fk fk, byte b) {
        this.f4689a = fk;
        this.b = b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f4689a.b(this.b);
    }
}
