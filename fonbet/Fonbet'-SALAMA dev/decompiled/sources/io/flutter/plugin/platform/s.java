package io.flutter.plugin.platform;

import W5.AbstractC0486a1;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import d6.C0977k;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import q5.C1557a;
import q5.C1563g;
import r5.C1577b;
import z5.C1825g;
import z5.C1827i;

/* loaded from: classes2.dex */
public final class s implements l {

    /* renamed from: w, reason: collision with root package name */
    public static final Class[] f14185w = {SurfaceView.class};

    /* renamed from: b, reason: collision with root package name */
    public C1557a f14187b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f14188c;

    /* renamed from: d, reason: collision with root package name */
    public q5.m f14189d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f14190e;

    /* renamed from: f, reason: collision with root package name */
    public TextInputPlugin f14191f;

    /* renamed from: g, reason: collision with root package name */
    public C0977k f14192g;

    /* renamed from: t, reason: collision with root package name */
    public final C0977k f14204t;

    /* renamed from: o, reason: collision with root package name */
    public int f14199o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14200p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14201q = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14205u = false;

    /* renamed from: v, reason: collision with root package name */
    public final p f14206v = new p(this, 0);

    /* renamed from: a, reason: collision with root package name */
    public final p f14186a = new p(2);

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f14194i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final C1294a f14193h = new C1294a();
    public final HashMap j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f14197m = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f14202r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f14203s = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f14198n = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f14195k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f14196l = new SparseArray();

    public s() {
        if (C0977k.f12439d == null) {
            C0977k.f12439d = new C0977k(14);
        }
        this.f14204t = C0977k.f12439d;
    }

    public static void e(s sVar, C1825g c1825g) {
        sVar.getClass();
        int i7 = c1825g.f18473g;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalStateException(e1.k.g(AbstractC0486a1.j(i7, "Trying to create a view with unknown direction value: ", "(view id: "), c1825g.f18467a, ")"));
        }
    }

    public static void h(int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < i7) {
            throw new IllegalStateException(AbstractC0486a1.e(i8, i7, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    public static i l(io.flutter.embedding.engine.renderer.k kVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            TextureRegistry$SurfaceProducer c3 = kVar.c(i7 <= 34 ? 2 : 1);
            p pVar = new p(4);
            pVar.f14169b = c3;
            return pVar;
        }
        if (i7 >= 29) {
            return new C1296c(kVar.b());
        }
        io.flutter.embedding.engine.renderer.i d7 = kVar.d();
        K4.u uVar = new K4.u();
        uVar.f4064a = 0;
        uVar.f4065b = 0;
        uVar.f4066c = false;
        y yVar = new y(uVar);
        uVar.f4067d = d7;
        uVar.f4068e = d7.f14085b.surfaceTexture();
        d7.f14087d = yVar;
        return uVar;
    }

    @Override // io.flutter.plugin.platform.l
    public final void a(io.flutter.view.k kVar) {
        this.f14193h.f14137a = kVar;
    }

    @Override // io.flutter.plugin.platform.l
    public final View b(int i7) {
        if (c(i7)) {
            return ((C) this.f14194i.get(Integer.valueOf(i7))).a();
        }
        f fVar = (f) this.f14195k.get(i7);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    @Override // io.flutter.plugin.platform.l
    public final boolean c(int i7) {
        return this.f14194i.containsKey(Integer.valueOf(i7));
    }

    @Override // io.flutter.plugin.platform.l
    public final void d() {
        this.f14193h.f14137a = null;
    }

    public final f f(C1825g c1825g, boolean z4) {
        HashMap hashMap = (HashMap) this.f14186a.f14169b;
        String str = c1825g.f18468b;
        g gVar = (g) hashMap.get(str);
        if (gVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = c1825g.f18475i;
        Object b7 = byteBuffer != null ? gVar.getCreateArgsCodec().b(byteBuffer) : null;
        Context mutableContextWrapper = z4 ? new MutableContextWrapper(this.f14188c) : this.f14188c;
        int i7 = c1825g.f18467a;
        f create = gVar.create(mutableContextWrapper, i7, b7);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(c1825g.f18473g);
        this.f14195k.put(i7, create);
        q5.m mVar = this.f14189d;
        if (mVar != null) {
            create.onFlutterViewAttached(mVar);
        }
        return create;
    }

    public final void g() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f14197m;
            if (i7 >= sparseArray.size()) {
                return;
            }
            C1297d c1297d = (C1297d) sparseArray.valueAt(i7);
            c1297d.b();
            c1297d.f15894a.close();
            i7++;
        }
    }

    public final void i(boolean z4) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f14197m;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i7);
            C1297d c1297d = (C1297d) sparseArray.valueAt(i7);
            if (this.f14202r.contains(Integer.valueOf(keyAt))) {
                C1577b c1577b = this.f14189d.f15935y;
                if (c1577b != null) {
                    c1297d.a(c1577b.f16032b);
                }
                z4 &= c1297d.c();
            } else {
                if (!this.f14200p) {
                    c1297d.b();
                }
                c1297d.setVisibility(8);
                this.f14189d.removeView(c1297d);
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f14196l;
            if (i8 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i8);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f14203s.contains(Integer.valueOf(keyAt2)) || (!z4 && this.f14201q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i8++;
        }
    }

    public final float j() {
        return this.f14188c.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void k() {
        if (!this.f14201q || this.f14200p) {
            return;
        }
        q5.m mVar = this.f14189d;
        mVar.f15931d.pause();
        C1563g c1563g = mVar.f15930c;
        if (c1563g == null) {
            C1563g c1563g2 = new C1563g(mVar.getContext(), mVar.getWidth(), mVar.getHeight(), 1);
            mVar.f15930c = c1563g2;
            mVar.addView(c1563g2);
        } else {
            c1563g.e(mVar.getWidth(), mVar.getHeight());
        }
        mVar.f15932e = mVar.f15931d;
        C1563g c1563g3 = mVar.f15930c;
        mVar.f15931d = c1563g3;
        C1577b c1577b = mVar.f15935y;
        if (c1577b != null) {
            c1563g3.a(c1577b.f16032b);
        }
        this.f14200p = true;
    }

    public final void m() {
        for (C c3 : this.f14194i.values()) {
            int width = c3.f14132f.getWidth();
            i iVar = c3.f14132f;
            int height = iVar.getHeight();
            boolean isFocused = c3.a().isFocused();
            x detachState = c3.f14127a.detachState();
            c3.f14134h.setSurface(null);
            c3.f14134h.release();
            c3.f14134h = ((DisplayManager) c3.f14128b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + c3.f14131e, width, height, c3.f14130d, iVar.getSurface(), 0, C.f14126i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(c3.f14128b, c3.f14134h.getDisplay(), c3.f14129c, detachState, c3.f14133g, isFocused);
            singleViewPresentation.show();
            c3.f14127a.cancel();
            c3.f14127a = singleViewPresentation;
        }
    }

    public final MotionEvent n(float f7, C1827i c1827i, boolean z4) {
        MotionEvent r7 = this.f14204t.r(new q5.y(c1827i.f18493p));
        List<List> list = (List) c1827i.f18485g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d7 = f7;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d7);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d7);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d7);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d7);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d7);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d7);
            arrayList.add(pointerCoords);
        }
        int i7 = c1827i.f18483e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i7]);
        if (!z4 && r7 != null) {
            if (pointerCoordsArr.length >= 1) {
                r7.offsetLocation(pointerCoordsArr[0].x - r7.getX(), pointerCoordsArr[0].y - r7.getY());
            }
            return r7;
        }
        List<List> list3 = (List) c1827i.f18484f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(c1827i.f18480b.longValue(), c1827i.f18481c.longValue(), c1827i.f18482d, c1827i.f18483e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i7]), pointerCoordsArr, c1827i.f18486h, c1827i.f18487i, c1827i.j, c1827i.f18488k, c1827i.f18489l, c1827i.f18490m, c1827i.f18491n, c1827i.f18492o);
    }

    public final int o(double d7) {
        return (int) Math.round(d7 * j());
    }
}
