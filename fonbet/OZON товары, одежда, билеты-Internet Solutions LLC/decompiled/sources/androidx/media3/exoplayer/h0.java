package androidx.media3.exoplayer;

import android.os.Looper;
import j3.AbstractC7252H;
import m3.C8053F;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f43865a;

    /* renamed from: b, reason: collision with root package name */
    private final a f43866b;

    /* renamed from: c, reason: collision with root package name */
    private int f43867c;

    /* renamed from: d, reason: collision with root package name */
    private Object f43868d;

    /* renamed from: e, reason: collision with root package name */
    private Looper f43869e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43870f;

    public interface a {
    }

    public interface b {
        void j(int i11, Object obj) throws C5449k;
    }

    public h0(a aVar, b bVar, AbstractC7252H abstractC7252H, int i11, C8053F c8053f, Looper looper) {
        this.f43866b = aVar;
        this.f43865a = bVar;
        this.f43869e = looper;
    }

    public final Looper a() {
        return this.f43869e;
    }

    public final Object b() {
        return this.f43868d;
    }

    public final b c() {
        return this.f43865a;
    }

    public final int d() {
        return this.f43867c;
    }

    public final synchronized void e(boolean z11) {
        notifyAll();
    }

    public final void f() {
        G10.a.h(!this.f43870f);
        this.f43870f = true;
        ((K) this.f43866b).m0(this);
    }

    public final void g(Object obj) {
        G10.a.h(!this.f43870f);
        this.f43868d = obj;
    }

    public final void h(int i11) {
        G10.a.h(!this.f43870f);
        this.f43867c = i11;
    }
}
