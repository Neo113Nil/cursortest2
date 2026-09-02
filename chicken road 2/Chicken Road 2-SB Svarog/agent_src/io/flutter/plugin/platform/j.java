package io.flutter.plugin.platform;

import F.AbstractActivityC0005f;
import F.t;
import F.x;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    public G.k f676b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0005f f677c;

    /* renamed from: d, reason: collision with root package name */
    public x f678d;

    /* renamed from: f, reason: collision with root package name */
    public t f680f;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f679e = null;

    /* renamed from: l, reason: collision with root package name */
    public Surface f686l = null;

    /* renamed from: m, reason: collision with root package name */
    public SurfaceControl f687m = null;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f688n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final i f689o = new i(0, this);

    /* renamed from: g, reason: collision with root package name */
    public final a f681g = new a();

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f682h = new SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f683i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f684j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f685k = new ArrayList();

    public j() {
        if (C.a.f1e == null) {
            C.a.f1e = new C.a(2);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void c() {
        this.f681g.f662a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void e(io.flutter.view.i iVar) {
        this.f681g.f662a = iVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean j(int i2) {
        return false;
    }

    @Override // io.flutter.plugin.platform.h
    public final void r(int i2) {
        if (this.f682h.get(i2) != null) {
            throw new ClassCastException();
        }
    }
}
