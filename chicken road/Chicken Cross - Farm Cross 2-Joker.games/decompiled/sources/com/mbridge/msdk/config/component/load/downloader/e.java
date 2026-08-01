package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.i;
import com.mbridge.msdk.config.component.load.downloader.core.l;

/* compiled from: MBDownloadManager.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9017a;

    /* compiled from: MBDownloadManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final e f9018a = new e();
    }

    public static e a() {
        return b.f9018a;
    }

    public synchronized String b(String str) {
        return com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(str);
    }

    private e() {
        this.f9017a = false;
    }

    public synchronized void a(String str) {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(str);
    }

    public boolean b() {
        return this.f9017a;
    }

    public synchronized com.mbridge.msdk.config.component.load.downloader.core.e a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        return new com.mbridge.msdk.config.component.load.downloader.core.e(bVar);
    }

    public void a(d dVar) {
        if (this.f9017a) {
            return;
        }
        l.c().a(dVar);
        i.b().a(dVar.e());
        com.mbridge.msdk.config.component.load.downloader.core.f.a().c();
        this.f9017a = true;
    }
}
