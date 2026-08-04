package io.flutter.plugin.platform;

import K4.C0321h;
import R5.F;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements h, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14175b;

    public /* synthetic */ p(Object obj, int i7) {
        this.f14174a = i7;
        this.f14175b = obj;
    }

    @Override // io.flutter.plugin.platform.i
    public long a() {
        return ((TextureRegistry$SurfaceProducer) this.f14175b).id();
    }

    @Override // io.flutter.plugin.platform.i
    public void b(int i7, int i8) {
        ((TextureRegistry$SurfaceProducer) this.f14175b).setSize(i7, i8);
    }

    public void c(int i7) {
        View view;
        switch (this.f14174a) {
            case 0:
                s sVar = (s) this.f14175b;
                if (sVar.c(i7)) {
                    view = ((C) sVar.f14200i.get(Integer.valueOf(i7))).a();
                } else {
                    f fVar = (f) sVar.f14201k.get(i7);
                    if (fVar == null) {
                        L.k(i7, "Clearing focus on an unknown view with id: ", "PlatformViewsController");
                    } else {
                        view = fVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                } else {
                    L.k(i7, "Clearing focus on a null view with id: ", "PlatformViewsController");
                }
                break;
            default:
                f fVar2 = (f) ((r) this.f14175b).f14184i.get(i7);
                if (fVar2 != null) {
                    View view2 = fVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                    } else {
                        L.k(i7, "Clearing focus on a null view with id: ", "PlatformViewsController2");
                    }
                } else {
                    L.k(i7, "Clearing focus on an unknown view with id: ", "PlatformViewsController2");
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [io.flutter.plugin.platform.n] */
    public long d(final p174z5.g gVar) {
        k kVar;
        long j;
        final int i7 = 0;
        final int i8 = 1;
        final s sVar = (s) this.f14175b;
        s.e(sVar, gVar);
        SparseArray sparseArray = sVar.f14204n;
        int i9 = gVar.f18473a;
        if (sparseArray.get(i9) != null) {
            throw new IllegalStateException(p031e1.k.d(i9, "Trying to create an already created platform view, view id: "));
        }
        if (sVar.f14196e == null) {
            throw new IllegalStateException(p031e1.k.d(i9, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (sVar.f14195d == null) {
            throw new IllegalStateException(p031e1.k.d(i9, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        f fVarF = sVar.f(gVar, true);
        View view = fVarF.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean zC0 = Y4.D.c0(view, new F(s.f14191w, 3));
        double d7 = gVar.f18476d;
        double d8 = gVar.f18475c;
        if (zC0) {
            if (gVar.f18480h == 2) {
                s.h(19);
                return -2L;
            }
            if (!sVar.f14211u) {
                s.h(20);
                i iVarL = s.l(sVar.f14196e);
                int iO = sVar.o(d8);
                int iO2 = sVar.o(d7);
                Activity activity = sVar.f14194c;
                ?? r12 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.n
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z4) {
                        switch (i8) {
                            case 0:
                                p174z5.g gVar2 = gVar;
                                s sVar2 = sVar;
                                int i10 = gVar2.f18473a;
                                if (!z4) {
                                    TextInputPlugin textInputPlugin = sVar2.f14197f;
                                    if (textInputPlugin != null) {
                                        textInputPlugin.clearPlatformViewClient(i10);
                                    }
                                    break;
                                } else {
                                    A5.s sVar3 = (A5.s) sVar2.f14198g.f12447b;
                                    if (sVar3 != null) {
                                        sVar3.a("viewFocused", Integer.valueOf(i10), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                s sVar4 = sVar;
                                if (!z4) {
                                    sVar4.getClass();
                                    break;
                                } else {
                                    p028d6.k kVar2 = sVar4.f14198g;
                                    p174z5.g gVar3 = gVar;
                                    A5.s sVar5 = (A5.s) kVar2.f12447b;
                                    if (sVar5 != null) {
                                        sVar5.a("viewFocused", Integer.valueOf(gVar3.f18473a), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                z zVar = C.f14132i;
                C c3 = null;
                if (iO != 0 && iO2 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    iVarL.b(iO, iO2);
                    StringBuilder sb = new StringBuilder("flutter-vd#");
                    int i10 = gVar.f18473a;
                    sb.append(i10);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), iO, iO2, displayMetrics.densityDpi, iVarL.getSurface(), 0, C.f14132i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        c3 = new C(activity, sVar.f14199h, virtualDisplayCreateVirtualDisplay, fVarF, iVarL, r12, i10);
                    }
                }
                if (c3 != null) {
                    sVar.f14200i.put(Integer.valueOf(i9), c3);
                    View view2 = fVarF.getView();
                    sVar.j.put(view2.getContext(), view2);
                    return iVarL.a();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + gVar.f18474b + " with id: " + i9);
            }
        }
        s.h(23);
        int iO3 = sVar.o(d8);
        int iO4 = sVar.o(d7);
        if (sVar.f14211u) {
            kVar = new k(sVar.f14194c);
            j = -1;
        } else {
            i iVarL2 = s.l(sVar.f14196e);
            k kVar2 = new k(sVar.f14194c);
            kVar2.f14162f = iVarL2;
            Surface surface = iVarL2.getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            }
            long jA = iVarL2.a();
            kVar = kVar2;
            j = jA;
        }
        kVar.setTouchProcessor(sVar.f14193b);
        i iVar = kVar.f14162f;
        if (iVar != null) {
            iVar.b(iO3, iO4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iO3, iO4);
        int iO5 = sVar.o(gVar.f18477e);
        int iO6 = sVar.o(gVar.f18478f);
        layoutParams.topMargin = iO5;
        layoutParams.leftMargin = iO6;
        kVar.setLayoutParams(layoutParams);
        View view3 = fVarF.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iO3, iO4));
        view3.setImportantForAccessibility(4);
        kVar.addView(view3);
        kVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view4, boolean z4) {
                switch (i7) {
                    case 0:
                        p174z5.g gVar2 = gVar;
                        s sVar2 = sVar;
                        int i11 = gVar2.f18473a;
                        if (!z4) {
                            TextInputPlugin textInputPlugin = sVar2.f14197f;
                            if (textInputPlugin != null) {
                                textInputPlugin.clearPlatformViewClient(i11);
                            }
                            break;
                        } else {
                            A5.s sVar3 = (A5.s) sVar2.f14198g.f12447b;
                            if (sVar3 != null) {
                                sVar3.a("viewFocused", Integer.valueOf(i11), null);
                                break;
                            }
                        }
                        break;
                    default:
                        s sVar4 = sVar;
                        if (!z4) {
                            sVar4.getClass();
                            break;
                        } else {
                            p028d6.k kVar3 = sVar4.f14198g;
                            p174z5.g gVar3 = gVar;
                            A5.s sVar5 = (A5.s) kVar3.f12447b;
                            if (sVar5 != null) {
                                sVar5.a("viewFocused", Integer.valueOf(gVar3.f18473a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        sVar.f14195d.addView(kVar);
        sparseArray.append(i9, kVar);
        p121q5.m mVar = sVar.f14195d;
        if (mVar != null) {
            fVarF.onFlutterViewAttached(mVar);
        }
        return j;
    }

    public void e(C0321h c0321h) {
        r rVar = (r) this.f14175b;
        HashMap map = (HashMap) rVar.f14176a.f14175b;
        String str = (String) c0321h.f4018d;
        g gVar = (g) map.get(str);
        if (gVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0321h.f4019e;
        Object objB = byteBuffer != null ? gVar.getCreateArgsCodec().b(byteBuffer) : null;
        Activity activity = rVar.f14178c;
        int i7 = c0321h.f4016b;
        f fVarCreate = gVar.create(activity, i7, objB);
        View view = fVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(c0321h.f4017c);
        rVar.f14184i.put(i7, fVarCreate);
        p121q5.m mVar = rVar.f14179d;
        if (mVar == null) {
            return;
        }
        fVarCreate.onFlutterViewAttached(mVar);
    }

    public void f(int i7) {
        j jVar;
        switch (this.f14174a) {
            case 0:
                s sVar = (s) this.f14175b;
                f fVar = (f) sVar.f14201k.get(i7);
                if (fVar != null) {
                    if (fVar.getView() != null) {
                        View view = fVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    sVar.f14201k.remove(i7);
                    try {
                        fVar.dispose();
                    } catch (RuntimeException e7) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e7);
                    }
                    if (!sVar.c(i7)) {
                        SparseArray sparseArray = sVar.f14204n;
                        k kVar = (k) sparseArray.get(i7);
                        if (kVar == null) {
                            SparseArray sparseArray2 = sVar.f14202l;
                            p153v5.a aVar = (p153v5.a) sparseArray2.get(i7);
                            if (aVar != null) {
                                aVar.removeAllViews();
                                aVar.a();
                                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(aVar);
                                }
                                sparseArray2.remove(i7);
                            }
                        } else {
                            kVar.removeAllViews();
                            i iVar = kVar.f14162f;
                            if (iVar != null) {
                                iVar.release();
                                kVar.f14162f = null;
                            }
                            ViewTreeObserver viewTreeObserver = kVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (jVar = kVar.f14163x) != null) {
                                kVar.f14163x = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(jVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) kVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(kVar);
                            }
                            sparseArray.remove(i7);
                        }
                    } else {
                        HashMap map = sVar.f14200i;
                        C c3 = (C) map.get(Integer.valueOf(i7));
                        View viewA = c3.a();
                        if (viewA != null) {
                            sVar.j.remove(viewA.getContext());
                        }
                        c3.f14133a.cancel();
                        c3.f14133a.detachState();
                        c3.f14140h.release();
                        c3.f14138f.release();
                        map.remove(Integer.valueOf(i7));
                    }
                } else {
                    L.k(i7, "Disposing unknown platform view with id: ", "PlatformViewsController");
                }
                break;
            default:
                r rVar = (r) this.f14175b;
                f fVar2 = (f) rVar.f14184i.get(i7);
                if (fVar2 != null) {
                    if (fVar2.getView() != null) {
                        View view2 = fVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    rVar.f14184i.remove(i7);
                    try {
                        fVar2.dispose();
                    } catch (RuntimeException e8) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e8);
                    }
                    SparseArray sparseArray3 = rVar.j;
                    p153v5.a aVar2 = (p153v5.a) sparseArray3.get(i7);
                    if (aVar2 != null) {
                        aVar2.removeAllViews();
                        aVar2.a();
                        ViewGroup viewGroup5 = (ViewGroup) aVar2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(aVar2);
                        }
                        sparseArray3.remove(i7);
                    }
                } else {
                    L.k(i7, "Disposing unknown platform view with id: ", "PlatformViewsController2");
                }
                break;
        }
    }

    public CharSequence g(p174z5.e eVar) {
        p121q5.c cVar = (p121q5.c) ((O1.k) this.f14175b).f4971b;
        ClipboardManager clipboardManager = (ClipboardManager) cVar.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != p174z5.e.f18467a) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = cVar.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(cVar);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                                try {
                                    assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                } catch (IOException e7) {
                                    charSequence = charSequenceCoerceToText;
                                    e = e7;
                                }
                            }
                            charSequence = charSequenceCoerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e8) {
                    e = e8;
                    charSequence = text;
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e10) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
            return null;
        }
        Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
        return charSequence;
    }

    @Override // io.flutter.plugin.platform.i
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f14175b).getHeight();
    }

    @Override // io.flutter.plugin.platform.i
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f14175b).getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f14175b).getWidth();
    }

    public void h(int i7, double d7, double d8) {
        s sVar = (s) this.f14175b;
        if (sVar.c(i7)) {
            return;
        }
        k kVar = (k) sVar.f14204n.get(i7);
        if (kVar == null) {
            L.k(i7, "Setting offset for unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        int iO = sVar.o(d7);
        int iO2 = sVar.o(d8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
        layoutParams.topMargin = iO;
        layoutParams.leftMargin = iO2;
        kVar.setLayoutParams(layoutParams);
    }

    public void i(p174z5.i iVar) {
        s sVar = (s) this.f14175b;
        float f7 = sVar.f14194c.getResources().getDisplayMetrics().density;
        int i7 = iVar.f18485a;
        if (sVar.c(i7)) {
            C c3 = (C) sVar.f14200i.get(Integer.valueOf(i7));
            MotionEvent motionEventN = sVar.n(f7, iVar, true);
            SingleViewPresentation singleViewPresentation = c3.f14133a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(motionEventN);
            return;
        }
        f fVar = (f) sVar.f14201k.get(i7);
        if (fVar == null) {
            L.k(i7, "Sending touch to an unknown view with id: ", "PlatformViewsController");
            return;
        }
        View view = fVar.getView();
        if (view == null) {
            L.k(i7, "Sending touch to a null view with id: ", "PlatformViewsController");
        } else {
            view.dispatchTouchEvent(sVar.n(f7, iVar, false));
        }
    }

    public void j(p174z5.i iVar) {
        r rVar = (r) this.f14175b;
        float f7 = rVar.f14178c.getResources().getDisplayMetrics().density;
        SparseArray sparseArray = rVar.f14184i;
        int i7 = iVar.f18485a;
        f fVar = (f) sparseArray.get(i7);
        if (fVar == null) {
            L.k(i7, "Sending touch to an unknown view with id: ", "PlatformViewsController2");
            return;
        }
        View view = fVar.getView();
        if (view == null) {
            L.k(i7, "Sending touch to a null view with id: ", "PlatformViewsController2");
            return;
        }
        MotionEvent motionEventR = rVar.f14185k.r(new p121q5.y(iVar.f18499p));
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
        int i8 = iVar.f18489e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i8]);
        if (motionEventR == null) {
            List<List> list3 = (List) iVar.f18490f;
            ArrayList arrayList2 = new ArrayList();
            for (List list4 : list3) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            motionEventR = MotionEvent.obtain(iVar.f18486b.longValue(), iVar.f18487c.longValue(), iVar.f18488d, iVar.f18489e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i8]), pointerCoordsArr, iVar.f18492h, iVar.f18493i, iVar.j, iVar.f18494k, iVar.f18495l, iVar.f18496m, iVar.f18497n, iVar.f18498o);
        } else if (pointerCoordsArr.length >= 1) {
            motionEventR.offsetLocation(pointerCoordsArr[0].x - motionEventR.getX(), pointerCoordsArr[0].y - motionEventR.getY());
        }
        view.dispatchTouchEvent(motionEventR);
    }

    public boolean k(String str, g gVar) {
        HashMap map = (HashMap) this.f14175b;
        if (map.containsKey(str)) {
            return false;
        }
        map.put(str, gVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.o, java.lang.Runnable] */
    public void l(p174z5.h hVar, final p138t1.a aVar) {
        i iVar;
        s sVar = (s) this.f14175b;
        int iO = sVar.o(hVar.f18483b);
        int iO2 = sVar.o(hVar.f18484c);
        int i7 = hVar.f18482a;
        if (!sVar.c(i7)) {
            f fVar = (f) sVar.f14201k.get(i7);
            k kVar = (k) sVar.f14204n.get(i7);
            if (fVar == null || kVar == null) {
                L.k(i7, "Resizing unknown platform view with id: ", "PlatformViewsController");
                return;
            }
            if ((iO > kVar.getRenderTargetWidth() || iO2 > kVar.getRenderTargetHeight()) && (iVar = kVar.f14162f) != null) {
                iVar.b(iO, iO2);
            }
            ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
            layoutParams.width = iO;
            layoutParams.height = iO2;
            kVar.setLayoutParams(layoutParams);
            View view = fVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iO;
                layoutParams2.height = iO2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(((double) kVar.getRenderTargetWidth()) / ((double) sVar.j()));
            int iRound2 = (int) Math.round(((double) kVar.getRenderTargetHeight()) / ((double) sVar.j()));
            A5.p pVar = aVar.f16277a;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            pVar.success(map);
            return;
        }
        final float fJ = sVar.j();
        final C c3 = (C) sVar.f14200i.get(Integer.valueOf(i7));
        TextInputPlugin textInputPlugin = sVar.f14197f;
        if (textInputPlugin != null) {
            textInputPlugin.lockPlatformViewInputConnection();
            SingleViewPresentation singleViewPresentation = c3.f14133a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                c3.f14133a.getView().onInputConnectionLocked();
            }
        }
        ?? r7 = new Runnable() { // from class: io.flutter.plugin.platform.o
            @Override // java.lang.Runnable
            public final void run() {
                s sVar2 = (s) this.f14170a.f14175b;
                TextInputPlugin textInputPlugin2 = sVar2.f14197f;
                C c4 = c3;
                if (textInputPlugin2 != null) {
                    textInputPlugin2.unlockPlatformViewInputConnection();
                    SingleViewPresentation singleViewPresentation2 = c4.f14133a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        c4.f14133a.getView().onInputConnectionUnlocked();
                    }
                }
                double dJ = sVar2.f14194c == null ? fJ : sVar2.j();
                int iRound3 = (int) Math.round(((double) c4.f14138f.getWidth()) / dJ);
                int iRound4 = (int) Math.round(((double) c4.f14138f.getHeight()) / dJ);
                A5.p pVar2 = aVar.f16277a;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                pVar2.success(map2);
            }
        };
        int width = c3.f14138f.getWidth();
        i iVar2 = c3.f14138f;
        if (iO == width && iO2 == iVar2.getHeight()) {
            c3.a().postDelayed(r7, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = c3.a();
            iVar2.b(iO, iO2);
            c3.f14140h.resize(iO, iO2, c3.f14136d);
            c3.f14140h.setSurface(iVar2.getSurface());
            viewA.postDelayed(r7, 0L);
            return;
        }
        boolean zIsFocused = c3.a().isFocused();
        x xVarDetachState = c3.f14133a.detachState();
        c3.f14140h.setSurface(null);
        c3.f14140h.release();
        DisplayManager displayManager = (DisplayManager) c3.f14134b.getSystemService("display");
        iVar2.b(iO, iO2);
        c3.f14140h = displayManager.createVirtualDisplay("flutter-vd#" + c3.f14137e, iO, iO2, c3.f14136d, iVar2.getSurface(), 0, C.f14132i, null);
        View viewA2 = c3.a();
        viewA2.addOnAttachStateChangeListener(new p005a1.i(viewA2, (o) r7));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(c3.f14134b, c3.f14140h.getDisplay(), c3.f14135c, xVarDetachState, c3.f14139g, zIsFocused);
        singleViewPresentation2.show();
        c3.f14133a.cancel();
        c3.f14133a = singleViewPresentation2;
    }

    public void m(int i7, int i8) {
        View view;
        switch (this.f14174a) {
            case 0:
                if (i8 != 0 && i8 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i8 + "(view id: " + i7 + ")");
                }
                s sVar = (s) this.f14175b;
                if (sVar.c(i7)) {
                    view = ((C) sVar.f14200i.get(Integer.valueOf(i7))).a();
                } else {
                    f fVar = (f) sVar.f14201k.get(i7);
                    if (fVar == null) {
                        L.k(i7, "Setting direction to an unknown view with id: ", "PlatformViewsController");
                        return;
                    }
                    view = fVar.getView();
                }
                if (view == null) {
                    L.k(i7, "Setting direction to a null view with id: ", "PlatformViewsController");
                    return;
                } else {
                    view.setLayoutDirection(i8);
                    return;
                }
            default:
                f fVar2 = (f) ((r) this.f14175b).f14184i.get(i7);
                if (fVar2 == null) {
                    L.k(i7, "Setting direction to an unknown view with id: ", "PlatformViewsController2");
                    return;
                }
                View view2 = fVar2.getView();
                if (view2 == null) {
                    L.k(i7, "Setting direction to a null view with id: ", "PlatformViewsController2");
                    return;
                } else {
                    view2.setLayoutDirection(i8);
                    return;
                }
        }
    }

    public void n(ArrayList arrayList) {
        O1.k kVar = (O1.k) this.f14175b;
        kVar.getClass();
        int i7 = arrayList.size() == 0 ? 5894 : 1798;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            int iOrdinal = ((p174z5.f) arrayList.get(i8)).ordinal();
            if (iOrdinal == 0) {
                i7 &= -5;
            } else if (iOrdinal == 1) {
                i7 &= -515;
            }
        }
        kVar.f4970a = i7;
        kVar.m();
    }

    public void o(int i7) {
        View decorView = ((p121q5.c) ((O1.k) this.f14175b).f4971b).getWindow().getDecorView();
        int iE = p136t.e.e(i7);
        if (iE == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (iE == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (iE == 2) {
            decorView.performHapticFeedback(3);
        } else if (iE == 3) {
            decorView.performHapticFeedback(6);
        } else {
            if (iE != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f14175b).release();
        this.f14175b = null;
    }

    @Override // io.flutter.plugin.platform.i
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f14175b).scheduleFrame();
    }

    public p(int i7) {
        this.f14174a = i7;
        switch (i7) {
            case 4:
                break;
            default:
                this.f14175b = new HashMap();
                break;
        }
    }
}
