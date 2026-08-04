package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.TextInputPlugin;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f14176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p121q5.a f14177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f14178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p121q5.m f14179d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextInputPlugin f14181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.common.internal.w f14182g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p028d6.k f14185k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f14180e = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Surface f14188n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceControl f14189o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f14190p = new p(this, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0913a f14183h = new C0913a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f14184i = new SparseArray();
    public final SparseArray j = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f14186l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f14187m = new ArrayList();

    public r() {
        if (p028d6.k.f12445d == null) {
            p028d6.k.f12445d = new p028d6.k(14);
        }
        this.f14185k = p028d6.k.f12445d;
    }

    @Override // io.flutter.plugin.platform.l
    public final void a(io.flutter.view.k kVar) {
        this.f14183h.f14143a = kVar;
    }

    @Override // io.flutter.plugin.platform.l
    public final View b(int i7) {
        f fVar = (f) this.f14184i.get(i7);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    @Override // io.flutter.plugin.platform.l
    public final boolean c(int i7) {
        return false;
    }

    @Override // io.flutter.plugin.platform.l
    public final void d() {
        this.f14183h.f14143a = null;
    }
}
