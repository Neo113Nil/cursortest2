package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import d6.C0977k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.TextInputPlugin;
import java.util.ArrayList;
import q5.C1557a;

/* loaded from: classes2.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    public p f14170a;

    /* renamed from: b, reason: collision with root package name */
    public C1557a f14171b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f14172c;

    /* renamed from: d, reason: collision with root package name */
    public q5.m f14173d;

    /* renamed from: f, reason: collision with root package name */
    public TextInputPlugin f14175f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.gms.common.internal.w f14176g;

    /* renamed from: k, reason: collision with root package name */
    public final C0977k f14179k;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f14174e = null;

    /* renamed from: n, reason: collision with root package name */
    public Surface f14182n = null;

    /* renamed from: o, reason: collision with root package name */
    public SurfaceControl f14183o = null;

    /* renamed from: p, reason: collision with root package name */
    public final p f14184p = new p(this, 3);

    /* renamed from: h, reason: collision with root package name */
    public final C1294a f14177h = new C1294a();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f14178i = new SparseArray();
    public final SparseArray j = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f14180l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f14181m = new ArrayList();

    public r() {
        if (C0977k.f12439d == null) {
            C0977k.f12439d = new C0977k(14);
        }
        this.f14179k = C0977k.f12439d;
    }

    @Override // io.flutter.plugin.platform.l
    public final void a(io.flutter.view.k kVar) {
        this.f14177h.f14137a = kVar;
    }

    @Override // io.flutter.plugin.platform.l
    public final View b(int i7) {
        f fVar = (f) this.f14178i.get(i7);
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
        this.f14177h.f14137a = null;
    }
}
