package io.flutter.plugin.platform;

import I1.C0024a;
import I1.C0031h;
import I1.F;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: x, reason: collision with root package name */
    public static final Class[] f9300x = {SurfaceView.class};

    /* renamed from: b, reason: collision with root package name */
    public C0024a f9302b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f9303c;

    /* renamed from: d, reason: collision with root package name */
    public I1.q f9304d;
    public io.flutter.embedding.engine.renderer.j f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.l f9306g;

    /* renamed from: h, reason: collision with root package name */
    public a1.e f9307h;

    /* renamed from: u, reason: collision with root package name */
    public final a1.e f9320u;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f9305e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f9315p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9316q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9317r = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9321v = false;

    /* renamed from: w, reason: collision with root package name */
    public final o f9322w = new o(0, this);

    /* renamed from: a, reason: collision with root package name */
    public final o f9301a = new o(2);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f9309j = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final C1045a f9308i = new C1045a();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f9310k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f9313n = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f9318s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f9319t = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f9314o = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f9311l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f9312m = new SparseArray();

    public r() {
        if (a1.e.f1786e == null) {
            a1.e.f1786e = new a1.e(10);
        }
        this.f9320u = a1.e.f1786e;
    }

    public static void a(r rVar, S1.e eVar) {
        rVar.getClass();
        int i3 = eVar.f1404g;
        if (i3 == 0 || i3 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i3 + "(view id: " + eVar.f1399a + ")");
    }

    public static i j(io.flutter.embedding.engine.renderer.j jVar) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29) {
            return i3 >= 29 ? new U.A(jVar.c()) : new y(jVar.e());
        }
        TextureRegistry$SurfaceProducer d3 = jVar.d(i3 <= 34 ? 2 : 1);
        o oVar = new o(4);
        oVar.f9278b = d3;
        return oVar;
    }

    public final g b(S1.e eVar, boolean z3) {
        HashMap hashMap = (HashMap) this.f9301a.f9278b;
        String str = eVar.f1400b;
        h hVar = (h) hashMap.get(str);
        if (hVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = eVar.f1406i;
        Object decodeMessage = byteBuffer != null ? hVar.getCreateArgsCodec().decodeMessage(byteBuffer) : null;
        Context mutableContextWrapper = z3 ? new MutableContextWrapper(this.f9303c) : this.f9303c;
        int i3 = eVar.f1399a;
        g create = hVar.create(mutableContextWrapper, i3, decodeMessage);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(eVar.f1404g);
        this.f9311l.put(i3, create);
        I1.q qVar = this.f9304d;
        if (qVar == null) {
            return create;
        }
        create.onFlutterViewAttached(qVar);
        return create;
    }

    @Override // io.flutter.plugin.platform.k
    public final void c(io.flutter.view.i iVar) {
        this.f9308i.f9249a = iVar;
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f9313n;
            if (i3 >= sparseArray.size()) {
                return;
            }
            C1047c c1047c = (C1047c) sparseArray.valueAt(i3);
            c1047c.b();
            c1047c.f616a.close();
            i3++;
        }
    }

    public final void e(boolean z3) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f9313n;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            C1047c c1047c = (C1047c) sparseArray.valueAt(i3);
            if (this.f9318s.contains(Integer.valueOf(keyAt))) {
                FlutterEngine flutterEngine = this.f9304d.f649i;
                if (flutterEngine != null) {
                    c1047c.d(flutterEngine.f9099b);
                }
                z3 &= c1047c.e();
            } else {
                if (!this.f9316q) {
                    c1047c.b();
                }
                c1047c.setVisibility(8);
                this.f9304d.removeView(c1047c);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f9312m;
            if (i4 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i4);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f9319t.contains(Integer.valueOf(keyAt2)) || (!z3 && this.f9317r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i4++;
        }
    }

    @Override // io.flutter.plugin.platform.k
    public final boolean f(int i3) {
        return this.f9309j.containsKey(Integer.valueOf(i3));
    }

    public final float g() {
        return this.f9303c.getResources().getDisplayMetrics().density;
    }

    @Override // io.flutter.plugin.platform.k
    public final View h(int i3) {
        if (f(i3)) {
            return ((D) this.f9309j.get(Integer.valueOf(i3))).a();
        }
        g gVar = (g) this.f9311l.get(i3);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void i() {
        if (!this.f9317r || this.f9316q) {
            return;
        }
        I1.q qVar = this.f9304d;
        qVar.f646e.a();
        C0031h c0031h = qVar.f645d;
        if (c0031h == null) {
            C0031h c0031h2 = new C0031h(qVar.getContext(), qVar.getWidth(), qVar.getHeight(), 1);
            qVar.f645d = c0031h2;
            qVar.addView(c0031h2);
        } else {
            c0031h.g(qVar.getWidth(), qVar.getHeight());
        }
        qVar.f = qVar.f646e;
        C0031h c0031h3 = qVar.f645d;
        qVar.f646e = c0031h3;
        FlutterEngine flutterEngine = qVar.f649i;
        if (flutterEngine != null) {
            c0031h3.d(flutterEngine.f9099b);
        }
        this.f9316q = true;
    }

    @Override // io.flutter.plugin.platform.k
    public final void k() {
        this.f9308i.f9249a = null;
    }

    public final void l() {
        for (D d3 : this.f9309j.values()) {
            int width = d3.f.getWidth();
            i iVar = d3.f;
            int height = iVar.getHeight();
            boolean isFocused = d3.a().isFocused();
            w detachState = d3.f9240a.detachState();
            d3.f9246h.setSurface(null);
            d3.f9246h.release();
            d3.f9246h = ((DisplayManager) d3.f9241b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + d3.f9244e, width, height, d3.f9243d, iVar.getSurface(), 0, D.f9239i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(d3.f9241b, d3.f9246h.getDisplay(), d3.f9242c, detachState, d3.f9245g, isFocused);
            singleViewPresentation.show();
            d3.f9240a.cancel();
            d3.f9240a = singleViewPresentation;
        }
    }

    public final MotionEvent m(float f, S1.f fVar, boolean z3) {
        MotionEvent D3 = this.f9320u.D(new F(fVar.f1421p));
        List<List> list = (List) fVar.f1412g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d3 = f;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d3);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d3);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d3);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d3);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d3);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d3);
            arrayList.add(pointerCoords);
        }
        int i3 = fVar.f1411e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) fVar.f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]);
        if (z3 || D3 == null) {
            return MotionEvent.obtain(fVar.f1408b.longValue(), fVar.f1409c.longValue(), fVar.f1410d, fVar.f1411e, pointerPropertiesArr, pointerCoordsArr, fVar.f1413h, fVar.f1414i, fVar.f1415j, fVar.f1416k, fVar.f1417l, fVar.f1418m, fVar.f1419n, fVar.f1420o);
        }
        if (D3.getPointerCount() == i3 && D3.getAction() == fVar.f1410d) {
            if (pointerCoordsArr.length < 1) {
                return D3;
            }
            D3.offsetLocation(pointerCoordsArr[0].x - D3.getX(), pointerCoordsArr[0].y - D3.getY());
            return D3;
        }
        return MotionEvent.obtain(D3.getDownTime(), D3.getEventTime(), fVar.f1410d, fVar.f1411e, pointerPropertiesArr, pointerCoordsArr, D3.getMetaState(), D3.getButtonState(), D3.getXPrecision(), D3.getYPrecision(), D3.getDeviceId(), D3.getEdgeFlags(), D3.getSource(), D3.getFlags());
    }

    public final int n(double d3) {
        return (int) Math.round(d3 * g());
    }
}
