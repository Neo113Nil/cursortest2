package io.flutter.plugin.platform;

import K4.C0321h;
import R5.F;
import a1.ViewOnAttachStateChangeListenerC0613i;
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
import d6.C0977k;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q5.AbstractActivityC1559c;
import t1.C1604a;
import v5.C1667a;
import w1.L;
import z5.C1825g;
import z5.C1826h;
import z5.C1827i;
import z5.EnumC1823e;
import z5.EnumC1824f;

/* loaded from: classes2.dex */
public final class p implements h, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14168a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14169b;

    public /* synthetic */ p(Object obj, int i7) {
        this.f14168a = i7;
        this.f14169b = obj;
    }

    @Override // io.flutter.plugin.platform.i
    public long a() {
        return ((TextureRegistry$SurfaceProducer) this.f14169b).id();
    }

    @Override // io.flutter.plugin.platform.i
    public void b(int i7, int i8) {
        ((TextureRegistry$SurfaceProducer) this.f14169b).setSize(i7, i8);
    }

    public void c(int i7) {
        View view;
        switch (this.f14168a) {
            case 0:
                s sVar = (s) this.f14169b;
                if (sVar.c(i7)) {
                    view = ((C) sVar.f14194i.get(Integer.valueOf(i7))).a();
                } else {
                    f fVar = (f) sVar.f14195k.get(i7);
                    if (fVar == null) {
                        L.k(i7, "Clearing focus on an unknown view with id: ", "PlatformViewsController");
                        break;
                    } else {
                        view = fVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                    break;
                } else {
                    L.k(i7, "Clearing focus on a null view with id: ", "PlatformViewsController");
                    break;
                }
            default:
                f fVar2 = (f) ((r) this.f14169b).f14178i.get(i7);
                if (fVar2 != null) {
                    View view2 = fVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                        break;
                    } else {
                        L.k(i7, "Clearing focus on a null view with id: ", "PlatformViewsController2");
                        break;
                    }
                } else {
                    L.k(i7, "Clearing focus on an unknown view with id: ", "PlatformViewsController2");
                    break;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [io.flutter.plugin.platform.n] */
    public long d(final C1825g c1825g) {
        k kVar;
        long j;
        final int i7 = 0;
        final int i8 = 1;
        final s sVar = (s) this.f14169b;
        s.e(sVar, c1825g);
        SparseArray sparseArray = sVar.f14198n;
        int i9 = c1825g.f18467a;
        if (sparseArray.get(i9) != null) {
            throw new IllegalStateException(e1.k.d(i9, "Trying to create an already created platform view, view id: "));
        }
        if (sVar.f14190e == null) {
            throw new IllegalStateException(e1.k.d(i9, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (sVar.f14189d == null) {
            throw new IllegalStateException(e1.k.d(i9, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        f f7 = sVar.f(c1825g, true);
        View view = f7.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean c0 = Y4.D.c0(view, new F(s.f14185w, 3));
        double d7 = c1825g.f18470d;
        double d8 = c1825g.f18469c;
        if (c0) {
            if (c1825g.f18474h == 2) {
                s.h(19);
                return -2L;
            }
            if (!sVar.f14205u) {
                s.h(20);
                i l7 = s.l(sVar.f14190e);
                int o7 = sVar.o(d8);
                int o8 = sVar.o(d7);
                Activity activity = sVar.f14188c;
                ?? r12 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.n
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z4) {
                        switch (i8) {
                            case 0:
                                C1825g c1825g2 = c1825g;
                                s sVar2 = sVar;
                                int i10 = c1825g2.f18467a;
                                if (!z4) {
                                    TextInputPlugin textInputPlugin = sVar2.f14191f;
                                    if (textInputPlugin != null) {
                                        textInputPlugin.clearPlatformViewClient(i10);
                                        break;
                                    }
                                } else {
                                    A5.s sVar3 = (A5.s) sVar2.f14192g.f12441b;
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
                                    C0977k c0977k = sVar4.f14192g;
                                    C1825g c1825g3 = c1825g;
                                    A5.s sVar5 = (A5.s) c0977k.f12441b;
                                    if (sVar5 != null) {
                                        sVar5.a("viewFocused", Integer.valueOf(c1825g3.f18467a), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                z zVar = C.f14126i;
                C c3 = null;
                if (o7 != 0 && o8 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    l7.b(o7, o8);
                    StringBuilder sb = new StringBuilder("flutter-vd#");
                    int i10 = c1825g.f18467a;
                    sb.append(i10);
                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), o7, o8, displayMetrics.densityDpi, l7.getSurface(), 0, C.f14126i, null);
                    if (createVirtualDisplay != null) {
                        c3 = new C(activity, sVar.f14193h, createVirtualDisplay, f7, l7, r12, i10);
                    }
                }
                if (c3 != null) {
                    sVar.f14194i.put(Integer.valueOf(i9), c3);
                    View view2 = f7.getView();
                    sVar.j.put(view2.getContext(), view2);
                    return l7.a();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + c1825g.f18468b + " with id: " + i9);
            }
        }
        s.h(23);
        int o9 = sVar.o(d8);
        int o10 = sVar.o(d7);
        if (sVar.f14205u) {
            kVar = new k(sVar.f14188c);
            j = -1;
        } else {
            i l8 = s.l(sVar.f14190e);
            k kVar2 = new k(sVar.f14188c);
            kVar2.f14156f = l8;
            Surface surface = l8.getSurface();
            if (surface != null) {
                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            long a2 = l8.a();
            kVar = kVar2;
            j = a2;
        }
        kVar.setTouchProcessor(sVar.f14187b);
        i iVar = kVar.f14156f;
        if (iVar != null) {
            iVar.b(o9, o10);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o9, o10);
        int o11 = sVar.o(c1825g.f18471e);
        int o12 = sVar.o(c1825g.f18472f);
        layoutParams.topMargin = o11;
        layoutParams.leftMargin = o12;
        kVar.setLayoutParams(layoutParams);
        View view3 = f7.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(o9, o10));
        view3.setImportantForAccessibility(4);
        kVar.addView(view3);
        kVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z4) {
                switch (i7) {
                    case 0:
                        C1825g c1825g2 = c1825g;
                        s sVar2 = sVar;
                        int i102 = c1825g2.f18467a;
                        if (!z4) {
                            TextInputPlugin textInputPlugin = sVar2.f14191f;
                            if (textInputPlugin != null) {
                                textInputPlugin.clearPlatformViewClient(i102);
                                break;
                            }
                        } else {
                            A5.s sVar3 = (A5.s) sVar2.f14192g.f12441b;
                            if (sVar3 != null) {
                                sVar3.a("viewFocused", Integer.valueOf(i102), null);
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
                            C0977k c0977k = sVar4.f14192g;
                            C1825g c1825g3 = c1825g;
                            A5.s sVar5 = (A5.s) c0977k.f12441b;
                            if (sVar5 != null) {
                                sVar5.a("viewFocused", Integer.valueOf(c1825g3.f18467a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        sVar.f14189d.addView(kVar);
        sparseArray.append(i9, kVar);
        q5.m mVar = sVar.f14189d;
        if (mVar != null) {
            f7.onFlutterViewAttached(mVar);
        }
        return j;
    }

    public void e(C0321h c0321h) {
        r rVar = (r) this.f14169b;
        HashMap hashMap = (HashMap) rVar.f14170a.f14169b;
        String str = (String) c0321h.f4018d;
        g gVar = (g) hashMap.get(str);
        if (gVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = (ByteBuffer) c0321h.f4019e;
        Object b7 = byteBuffer != null ? gVar.getCreateArgsCodec().b(byteBuffer) : null;
        Activity activity = rVar.f14172c;
        int i7 = c0321h.f4016b;
        f create = gVar.create(activity, i7, b7);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(c0321h.f4017c);
        rVar.f14178i.put(i7, create);
        q5.m mVar = rVar.f14173d;
        if (mVar == null) {
            return;
        }
        create.onFlutterViewAttached(mVar);
    }

    public void f(int i7) {
        j jVar;
        switch (this.f14168a) {
            case 0:
                s sVar = (s) this.f14169b;
                f fVar = (f) sVar.f14195k.get(i7);
                if (fVar != null) {
                    if (fVar.getView() != null) {
                        View view = fVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    sVar.f14195k.remove(i7);
                    try {
                        fVar.dispose();
                    } catch (RuntimeException e7) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e7);
                    }
                    if (!sVar.c(i7)) {
                        SparseArray sparseArray = sVar.f14198n;
                        k kVar = (k) sparseArray.get(i7);
                        if (kVar == null) {
                            SparseArray sparseArray2 = sVar.f14196l;
                            C1667a c1667a = (C1667a) sparseArray2.get(i7);
                            if (c1667a != null) {
                                c1667a.removeAllViews();
                                c1667a.a();
                                ViewGroup viewGroup2 = (ViewGroup) c1667a.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(c1667a);
                                }
                                sparseArray2.remove(i7);
                                break;
                            }
                        } else {
                            kVar.removeAllViews();
                            i iVar = kVar.f14156f;
                            if (iVar != null) {
                                iVar.release();
                                kVar.f14156f = null;
                            }
                            ViewTreeObserver viewTreeObserver = kVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (jVar = kVar.f14157x) != null) {
                                kVar.f14157x = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(jVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) kVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(kVar);
                            }
                            sparseArray.remove(i7);
                            break;
                        }
                    } else {
                        HashMap hashMap = sVar.f14194i;
                        C c3 = (C) hashMap.get(Integer.valueOf(i7));
                        View a2 = c3.a();
                        if (a2 != null) {
                            sVar.j.remove(a2.getContext());
                        }
                        c3.f14127a.cancel();
                        c3.f14127a.detachState();
                        c3.f14134h.release();
                        c3.f14132f.release();
                        hashMap.remove(Integer.valueOf(i7));
                        break;
                    }
                } else {
                    L.k(i7, "Disposing unknown platform view with id: ", "PlatformViewsController");
                    break;
                }
                break;
            default:
                r rVar = (r) this.f14169b;
                f fVar2 = (f) rVar.f14178i.get(i7);
                if (fVar2 != null) {
                    if (fVar2.getView() != null) {
                        View view2 = fVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    rVar.f14178i.remove(i7);
                    try {
                        fVar2.dispose();
                    } catch (RuntimeException e8) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e8);
                    }
                    SparseArray sparseArray3 = rVar.j;
                    C1667a c1667a2 = (C1667a) sparseArray3.get(i7);
                    if (c1667a2 != null) {
                        c1667a2.removeAllViews();
                        c1667a2.a();
                        ViewGroup viewGroup5 = (ViewGroup) c1667a2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(c1667a2);
                        }
                        sparseArray3.remove(i7);
                        break;
                    }
                } else {
                    L.k(i7, "Disposing unknown platform view with id: ", "PlatformViewsController2");
                    break;
                }
                break;
        }
    }

    public CharSequence g(EnumC1823e enumC1823e) {
        AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((O1.k) this.f14169b).f4971b;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC1559c.getSystemService("clipboard");
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
                if (enumC1823e != null && enumC1823e != EnumC1823e.f18461a) {
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
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC1559c.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC1559c);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e7) {
                                    charSequence = coerceToText;
                                    e = e7;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
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
    }

    @Override // io.flutter.plugin.platform.i
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f14169b).getHeight();
    }

    @Override // io.flutter.plugin.platform.i
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f14169b).getSurface();
    }

    @Override // io.flutter.plugin.platform.i
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f14169b).getWidth();
    }

    public void h(int i7, double d7, double d8) {
        s sVar = (s) this.f14169b;
        if (sVar.c(i7)) {
            return;
        }
        k kVar = (k) sVar.f14198n.get(i7);
        if (kVar == null) {
            L.k(i7, "Setting offset for unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        int o7 = sVar.o(d7);
        int o8 = sVar.o(d8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
        layoutParams.topMargin = o7;
        layoutParams.leftMargin = o8;
        kVar.setLayoutParams(layoutParams);
    }

    public void i(C1827i c1827i) {
        s sVar = (s) this.f14169b;
        float f7 = sVar.f14188c.getResources().getDisplayMetrics().density;
        int i7 = c1827i.f18479a;
        if (sVar.c(i7)) {
            C c3 = (C) sVar.f14194i.get(Integer.valueOf(i7));
            MotionEvent n2 = sVar.n(f7, c1827i, true);
            SingleViewPresentation singleViewPresentation = c3.f14127a;
            if (singleViewPresentation == null) {
                return;
            }
            singleViewPresentation.dispatchTouchEvent(n2);
            return;
        }
        f fVar = (f) sVar.f14195k.get(i7);
        if (fVar == null) {
            L.k(i7, "Sending touch to an unknown view with id: ", "PlatformViewsController");
            return;
        }
        View view = fVar.getView();
        if (view == null) {
            L.k(i7, "Sending touch to a null view with id: ", "PlatformViewsController");
        } else {
            view.dispatchTouchEvent(sVar.n(f7, c1827i, false));
        }
    }

    public void j(C1827i c1827i) {
        r rVar = (r) this.f14169b;
        float f7 = rVar.f14172c.getResources().getDisplayMetrics().density;
        SparseArray sparseArray = rVar.f14178i;
        int i7 = c1827i.f18479a;
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
        MotionEvent r7 = rVar.f14179k.r(new q5.y(c1827i.f18493p));
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
        int i8 = c1827i.f18483e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i8]);
        if (r7 == null) {
            List<List> list3 = (List) c1827i.f18484f;
            ArrayList arrayList2 = new ArrayList();
            for (List list4 : list3) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            r7 = MotionEvent.obtain(c1827i.f18480b.longValue(), c1827i.f18481c.longValue(), c1827i.f18482d, c1827i.f18483e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i8]), pointerCoordsArr, c1827i.f18486h, c1827i.f18487i, c1827i.j, c1827i.f18488k, c1827i.f18489l, c1827i.f18490m, c1827i.f18491n, c1827i.f18492o);
        } else if (pointerCoordsArr.length >= 1) {
            r7.offsetLocation(pointerCoordsArr[0].x - r7.getX(), pointerCoordsArr[0].y - r7.getY());
        }
        view.dispatchTouchEvent(r7);
    }

    public boolean k(String str, g gVar) {
        HashMap hashMap = (HashMap) this.f14169b;
        if (hashMap.containsKey(str)) {
            return false;
        }
        hashMap.put(str, gVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.o, java.lang.Runnable] */
    public void l(C1826h c1826h, final C1604a c1604a) {
        i iVar;
        s sVar = (s) this.f14169b;
        int o7 = sVar.o(c1826h.f18477b);
        int o8 = sVar.o(c1826h.f18478c);
        int i7 = c1826h.f18476a;
        if (!sVar.c(i7)) {
            f fVar = (f) sVar.f14195k.get(i7);
            k kVar = (k) sVar.f14198n.get(i7);
            if (fVar == null || kVar == null) {
                L.k(i7, "Resizing unknown platform view with id: ", "PlatformViewsController");
                return;
            }
            if ((o7 > kVar.getRenderTargetWidth() || o8 > kVar.getRenderTargetHeight()) && (iVar = kVar.f14156f) != null) {
                iVar.b(o7, o8);
            }
            ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
            layoutParams.width = o7;
            layoutParams.height = o8;
            kVar.setLayoutParams(layoutParams);
            View view = fVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = o7;
                layoutParams2.height = o8;
                view.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(kVar.getRenderTargetWidth() / sVar.j());
            int round2 = (int) Math.round(kVar.getRenderTargetHeight() / sVar.j());
            A5.p pVar = c1604a.f16271a;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            pVar.success(hashMap);
            return;
        }
        final float j = sVar.j();
        final C c3 = (C) sVar.f14194i.get(Integer.valueOf(i7));
        TextInputPlugin textInputPlugin = sVar.f14191f;
        if (textInputPlugin != null) {
            textInputPlugin.lockPlatformViewInputConnection();
            SingleViewPresentation singleViewPresentation = c3.f14127a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                c3.f14127a.getView().onInputConnectionLocked();
            }
        }
        ?? r32 = new Runnable() { // from class: io.flutter.plugin.platform.o
            @Override // java.lang.Runnable
            public final void run() {
                s sVar2 = (s) p.this.f14169b;
                TextInputPlugin textInputPlugin2 = sVar2.f14191f;
                C c4 = c3;
                if (textInputPlugin2 != null) {
                    textInputPlugin2.unlockPlatformViewInputConnection();
                    SingleViewPresentation singleViewPresentation2 = c4.f14127a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        c4.f14127a.getView().onInputConnectionUnlocked();
                    }
                }
                double j3 = sVar2.f14188c == null ? j : sVar2.j();
                int round3 = (int) Math.round(c4.f14132f.getWidth() / j3);
                int round4 = (int) Math.round(c4.f14132f.getHeight() / j3);
                A5.p pVar2 = c1604a.f16271a;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("width", Double.valueOf(round3));
                hashMap2.put("height", Double.valueOf(round4));
                pVar2.success(hashMap2);
            }
        };
        int width = c3.f14132f.getWidth();
        i iVar2 = c3.f14132f;
        if (o7 == width && o8 == iVar2.getHeight()) {
            c3.a().postDelayed(r32, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View a2 = c3.a();
            iVar2.b(o7, o8);
            c3.f14134h.resize(o7, o8, c3.f14130d);
            c3.f14134h.setSurface(iVar2.getSurface());
            a2.postDelayed(r32, 0L);
            return;
        }
        boolean isFocused = c3.a().isFocused();
        x detachState = c3.f14127a.detachState();
        c3.f14134h.setSurface(null);
        c3.f14134h.release();
        DisplayManager displayManager = (DisplayManager) c3.f14128b.getSystemService("display");
        iVar2.b(o7, o8);
        c3.f14134h = displayManager.createVirtualDisplay("flutter-vd#" + c3.f14131e, o7, o8, c3.f14130d, iVar2.getSurface(), 0, C.f14126i, null);
        View a4 = c3.a();
        a4.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0613i(a4, (o) r32));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(c3.f14128b, c3.f14134h.getDisplay(), c3.f14129c, detachState, c3.f14133g, isFocused);
        singleViewPresentation2.show();
        c3.f14127a.cancel();
        c3.f14127a = singleViewPresentation2;
    }

    public void m(int i7, int i8) {
        View view;
        switch (this.f14168a) {
            case 0:
                if (i8 != 0 && i8 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i8 + "(view id: " + i7 + ")");
                }
                s sVar = (s) this.f14169b;
                if (sVar.c(i7)) {
                    view = ((C) sVar.f14194i.get(Integer.valueOf(i7))).a();
                } else {
                    f fVar = (f) sVar.f14195k.get(i7);
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
                f fVar2 = (f) ((r) this.f14169b).f14178i.get(i7);
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
        O1.k kVar = (O1.k) this.f14169b;
        kVar.getClass();
        int i7 = arrayList.size() == 0 ? 5894 : 1798;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            int ordinal = ((EnumC1824f) arrayList.get(i8)).ordinal();
            if (ordinal == 0) {
                i7 &= -5;
            } else if (ordinal == 1) {
                i7 &= -515;
            }
        }
        kVar.f4970a = i7;
        kVar.m();
    }

    public void o(int i7) {
        View decorView = ((AbstractActivityC1559c) ((O1.k) this.f14169b).f4971b).getWindow().getDecorView();
        int e7 = t.e.e(i7);
        if (e7 == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (e7 == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (e7 == 2) {
            decorView.performHapticFeedback(3);
        } else if (e7 == 3) {
            decorView.performHapticFeedback(6);
        } else {
            if (e7 != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f14169b).release();
        this.f14169b = null;
    }

    @Override // io.flutter.plugin.platform.i
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f14169b).scheduleFrame();
    }

    public p(int i7) {
        this.f14168a = i7;
        switch (i7) {
            case 4:
                break;
            default:
                this.f14169b = new HashMap();
                break;
        }
    }
}
