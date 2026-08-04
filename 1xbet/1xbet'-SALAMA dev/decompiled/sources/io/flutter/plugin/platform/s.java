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
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Class[] f14191w = {SurfaceView.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p121q5.a f14193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f14194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p121q5.m f14195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f14196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextInputPlugin f14197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p028d6.k f14198g;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p028d6.k f14210t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14205o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14206p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14207q = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14211u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p f14212v = new p(this, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f14192a = new p(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f14200i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0913a f14199h = new C0913a();
    public final HashMap j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseArray f14203m = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashSet f14208r = new HashSet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f14209s = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f14204n = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray f14201k = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray f14202l = new SparseArray();

    public s() {
        if (p028d6.k.f12445d == null) {
            p028d6.k.f12445d = new p028d6.k(14);
        }
        this.f14210t = p028d6.k.f12445d;
    }

    public static void e(s sVar, p174z5.g gVar) {
        sVar.getClass();
        int i7 = gVar.f18479g;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalStateException(p031e1.k.g(AbstractC0486a1.j(i7, "Trying to create a view with unknown direction value: ", "(view id: "), gVar.f18473a, ")"));
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
            TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerC = kVar.c(i7 <= 34 ? 2 : 1);
            p pVar = new p(4);
            pVar.f14175b = textureRegistry$SurfaceProducerC;
            return pVar;
        }
        if (i7 >= 29) {
            return new C0915c(kVar.b());
        }
        io.flutter.embedding.engine.renderer.i iVarD = kVar.d();
        K4.u uVar = new K4.u();
        uVar.f4064a = 0;
        uVar.f4065b = 0;
        uVar.f4066c = false;
        y yVar = new y(uVar);
        uVar.f4067d = iVarD;
        uVar.f4068e = iVarD.f14091b.surfaceTexture();
        iVarD.f14093d = yVar;
        return uVar;
    }

    @Override // io.flutter.plugin.platform.l
    public final void a(io.flutter.view.k kVar) {
        this.f14199h.f14143a = kVar;
    }

    @Override // io.flutter.plugin.platform.l
    public final View b(int i7) {
        if (c(i7)) {
            return ((C) this.f14200i.get(Integer.valueOf(i7))).a();
        }
        f fVar = (f) this.f14201k.get(i7);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    @Override // io.flutter.plugin.platform.l
    public final boolean c(int i7) {
        return this.f14200i.containsKey(Integer.valueOf(i7));
    }

    @Override // io.flutter.plugin.platform.l
    public final void d() {
        this.f14199h.f14143a = null;
    }

    public final f f(p174z5.g gVar, boolean z4) {
        HashMap map = (HashMap) this.f14192a.f14175b;
        String str = gVar.f18474b;
        g gVar2 = (g) map.get(str);
        if (gVar2 == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = gVar.f18481i;
        Object objB = byteBuffer != null ? gVar2.getCreateArgsCodec().b(byteBuffer) : null;
        Context mutableContextWrapper = z4 ? new MutableContextWrapper(this.f14194c) : this.f14194c;
        int i7 = gVar.f18473a;
        f fVarCreate = gVar2.create(mutableContextWrapper, i7, objB);
        View view = fVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(gVar.f18479g);
        this.f14201k.put(i7, fVarCreate);
        p121q5.m mVar = this.f14195d;
        if (mVar != null) {
            fVarCreate.onFlutterViewAttached(mVar);
        }
        return fVarCreate;
    }

    public final void g() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f14203m;
            if (i7 >= sparseArray.size()) {
                return;
            }
            C0916d c0916d = (C0916d) sparseArray.valueAt(i7);
            c0916d.b();
            c0916d.f15900a.close();
            i7++;
        }
    }

    public final void i(boolean z4) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f14203m;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i7);
            C0916d c0916d = (C0916d) sparseArray.valueAt(i7);
            if (this.f14208r.contains(Integer.valueOf(iKeyAt))) {
                p128r5.b bVar = this.f14195d.f15941y;
                if (bVar != null) {
                    c0916d.a(bVar.f16038b);
                }
                z4 &= c0916d.c();
            } else {
                if (!this.f14206p) {
                    c0916d.b();
                }
                c0916d.setVisibility(8);
                this.f14195d.removeView(c0916d);
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f14202l;
            if (i8 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i8);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f14209s.contains(Integer.valueOf(iKeyAt2)) || (!z4 && this.f14207q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i8++;
        }
    }

    public final float j() {
        return this.f14194c.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void k() {
        if (!this.f14207q || this.f14206p) {
            return;
        }
        p121q5.m mVar = this.f14195d;
        mVar.f15937d.pause();
        p121q5.g gVar = mVar.f15936c;
        if (gVar == null) {
            p121q5.g gVar2 = new p121q5.g(mVar.getContext(), mVar.getWidth(), mVar.getHeight(), 1);
            mVar.f15936c = gVar2;
            mVar.addView(gVar2);
        } else {
            gVar.e(mVar.getWidth(), mVar.getHeight());
        }
        mVar.f15938e = mVar.f15937d;
        p121q5.g gVar3 = mVar.f15936c;
        mVar.f15937d = gVar3;
        p128r5.b bVar = mVar.f15941y;
        if (bVar != null) {
            gVar3.a(bVar.f16038b);
        }
        this.f14206p = true;
    }

    public final void m() {
        for (C c3 : this.f14200i.values()) {
            int width = c3.f14138f.getWidth();
            i iVar = c3.f14138f;
            int height = iVar.getHeight();
            boolean zIsFocused = c3.a().isFocused();
            x xVarDetachState = c3.f14133a.detachState();
            c3.f14140h.setSurface(null);
            c3.f14140h.release();
            c3.f14140h = ((DisplayManager) c3.f14134b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + c3.f14137e, width, height, c3.f14136d, iVar.getSurface(), 0, C.f14132i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(c3.f14134b, c3.f14140h.getDisplay(), c3.f14135c, xVarDetachState, c3.f14139g, zIsFocused);
            singleViewPresentation.show();
            c3.f14133a.cancel();
            c3.f14133a = singleViewPresentation;
        }
    }

    public final MotionEvent n(float f7, p174z5.i iVar, boolean z4) {
        MotionEvent motionEventR = this.f14210t.r(new p121q5.y(iVar.f18499p));
        List<List> list = (List) iVar.f18491g;
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
        int i7 = iVar.f18489e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i7]);
        if (!z4 && motionEventR != null) {
            if (pointerCoordsArr.length >= 1) {
                motionEventR.offsetLocation(pointerCoordsArr[0].x - motionEventR.getX(), pointerCoordsArr[0].y - motionEventR.getY());
            }
            return motionEventR;
        }
        List<List> list3 = (List) iVar.f18490f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(iVar.f18486b.longValue(), iVar.f18487c.longValue(), iVar.f18488d, iVar.f18489e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i7]), pointerCoordsArr, iVar.f18492h, iVar.f18493i, iVar.j, iVar.f18494k, iVar.f18495l, iVar.f18496m, iVar.f18497n, iVar.f18498o);
    }

    public final int o(double d7) {
        return (int) Math.round(d7 * ((double) j()));
    }
}
