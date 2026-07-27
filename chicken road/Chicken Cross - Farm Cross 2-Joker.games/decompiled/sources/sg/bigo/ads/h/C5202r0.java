package sg.bigo.ads.h;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.k.InterfaceC5258c;
import sg.bigo.ads.l.InterfaceC5288d;

/* renamed from: sg.bigo.ads.h.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5202r0 implements InterfaceC5258c {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.C.l f12920a;
    public final F1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean i;
    public volatile boolean j;
    public View k;
    public ProgressBar l;
    public C5241m o;
    public InterfaceC5288d p;
    public sg.bigo.ads.K0.E q;
    public int m = 5;
    public boolean n = false;
    public boolean h = false;

    public C5202r0(sg.bigo.ads.C.l lVar, F1 f1) {
        this.f12920a = lVar;
        this.b = f1;
    }

    public final void a() {
        if (this.k == null || !this.j) {
            return;
        }
        this.j = false;
        this.k.setVisibility(8);
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void a(sg.bigo.ads.P.c cVar) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void a(sg.bigo.ads.P.c cVar, long j) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void b(sg.bigo.ads.P.c cVar) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void b(sg.bigo.ads.P.c cVar, long j) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void c(sg.bigo.ads.P.c cVar) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void c(sg.bigo.ads.P.c cVar, long j) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void d(sg.bigo.ads.P.c cVar) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void d(sg.bigo.ads.P.c cVar, long j) {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final boolean d() {
        return false;
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void e() {
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void e(sg.bigo.ads.P.c cVar) {
    }

    public final boolean b() {
        return this.h && this.g == 3;
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void c() {
        this.n = true;
        a();
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void a(WebView webView, int i) {
        if (i < 80 || this.d != 0) {
            ProgressBar progressBar = this.l;
            if (progressBar != null && i > this.m) {
                progressBar.setProgress(i <= 95 ? i : 95);
            }
        } else {
            a();
        }
        this.m = i;
    }
}
