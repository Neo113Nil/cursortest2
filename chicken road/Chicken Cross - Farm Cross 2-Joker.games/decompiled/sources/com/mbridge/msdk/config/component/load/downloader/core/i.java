package com.mbridge.msdk.config.component.load.downloader.core;

/* compiled from: ExecutorManager.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private j f9002a;

    /* compiled from: ExecutorManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final i f9003a = new i();
    }

    public static i b() {
        return b.f9003a;
    }

    public void a(int i) {
        this.f9002a = new com.mbridge.msdk.config.component.load.downloader.core.a(i);
    }

    private i() {
    }

    public j a() {
        if (this.f9002a == null) {
            this.f9002a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.f9002a;
    }
}
