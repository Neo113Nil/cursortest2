package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import h2.C0482c;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;
import x2.C1545h;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public C1545h f10221a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f10222b;

    /* renamed from: c, reason: collision with root package name */
    public w2.m f10223c;

    /* renamed from: e, reason: collision with root package name */
    public C0482c f10225e;

    /* renamed from: d, reason: collision with root package name */
    public FlutterJNI f10224d = null;

    /* renamed from: k, reason: collision with root package name */
    public Surface f10231k = null;

    /* renamed from: l, reason: collision with root package name */
    public SurfaceControl f10232l = null;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f10233m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final V0.j f10234n = new V0.j(14, this);

    /* renamed from: f, reason: collision with root package name */
    public final a f10226f = new a();

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f10227g = new SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f10228h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10229i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10230j = new ArrayList();

    public l() {
        if (B0.e.f144d == null) {
            B0.e.f144d = new B0.e();
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void b(io.flutter.view.g gVar) {
        this.f10226f.f10209a = gVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean c(int i2) {
        return false;
    }

    @Override // io.flutter.plugin.platform.i
    public final void d(int i2) {
        if (this.f10227g.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void e() {
        this.f10226f.f10209a = null;
    }
}
