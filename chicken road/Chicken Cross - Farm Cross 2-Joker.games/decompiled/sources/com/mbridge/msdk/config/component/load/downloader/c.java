package com.mbridge.msdk.config.component.load.downloader;

/* compiled from: DownloadResponse.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private a f8987a;
    private boolean b;
    private boolean c;

    public a a() {
        return this.f8987a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public void a(a aVar) {
        this.f8987a = aVar;
        b(false);
    }

    public void b(boolean z) {
        this.c = z;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z) {
        this.b = z;
    }
}
