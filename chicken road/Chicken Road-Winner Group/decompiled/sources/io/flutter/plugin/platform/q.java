package io.flutter.plugin.platform;

import I1.C0024a;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: a, reason: collision with root package name */
    public o f9284a;

    /* renamed from: b, reason: collision with root package name */
    public C0024a f9285b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f9286c;

    /* renamed from: d, reason: collision with root package name */
    public I1.q f9287d;
    public io.flutter.plugin.editing.l f;

    /* renamed from: g, reason: collision with root package name */
    public a1.e f9289g;

    /* renamed from: k, reason: collision with root package name */
    public final a1.e f9293k;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f9288e = null;

    /* renamed from: n, reason: collision with root package name */
    public Surface f9296n = null;

    /* renamed from: o, reason: collision with root package name */
    public SurfaceControl f9297o = null;

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f9298p = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final o f9299q = new o(3, this);

    /* renamed from: h, reason: collision with root package name */
    public final C1045a f9290h = new C1045a();

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f9291i = new SparseArray();

    /* renamed from: j, reason: collision with root package name */
    public final SparseArray f9292j = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9294l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f9295m = new ArrayList();

    public q() {
        if (a1.e.f1786e == null) {
            a1.e.f1786e = new a1.e(10);
        }
        this.f9293k = a1.e.f1786e;
    }

    public final boolean a(int i3) {
        g gVar = (g) this.f9291i.get(i3);
        if (gVar == null) {
            return false;
        }
        SparseArray sparseArray = this.f9292j;
        if (sparseArray.get(i3) != null) {
            return true;
        }
        View view = gVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Activity activity = this.f9286c;
        O1.b bVar = new O1.b(activity, activity.getResources().getDisplayMetrics().density, this.f9285b);
        bVar.setOnDescendantFocusChangeListener(new l(this, i3, 1));
        sparseArray.put(i3, bVar);
        view.setImportantForAccessibility(4);
        bVar.addView(view);
        this.f9287d.addView(bVar);
        return true;
    }

    @Override // io.flutter.plugin.platform.k
    public final void c(io.flutter.view.i iVar) {
        this.f9290h.f9249a = iVar;
    }

    @Override // io.flutter.plugin.platform.k
    public final boolean f(int i3) {
        return false;
    }

    @Override // io.flutter.plugin.platform.k
    public final View h(int i3) {
        g gVar = (g) this.f9291i.get(i3);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    @Override // io.flutter.plugin.platform.k
    public final void k() {
        this.f9290h.f9249a = null;
    }
}
