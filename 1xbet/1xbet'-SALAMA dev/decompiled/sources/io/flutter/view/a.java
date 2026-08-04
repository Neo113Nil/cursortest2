package io.flutter.view;

import Y4.D;
import android.app.Activity;
import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p128r5.f, p128r5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14230a;

    public /* synthetic */ a(Object obj) {
        this.f14230a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        io.flutter.plugin.platform.l lVar;
        ArrayList arrayList;
        int i7;
        g gVar;
        int i8;
        int i9;
        g gVar2;
        String str;
        String str2;
        float f7;
        float f8;
        View viewB;
        Integer num;
        WindowInsets rootWindowInsets;
        boolean z4;
        Activity activityQ;
        int i10;
        k kVar;
        View viewB2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        k kVar2 = (k) this.f14230a;
        kVar2.getClass();
        ArrayList<g> arrayList2 = new ArrayList();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            lVar = kVar2.f14324e;
            if (!zHasRemaining) {
                break;
            }
            g gVarC = kVar2.c(byteBuffer.getInt());
            gVarC.f14266C = true;
            gVarC.f14272I = gVarC.f14306r;
            gVarC.f14273J = gVarC.f14304p;
            gVarC.f14267D = gVarC.f14292c;
            gVarC.f14268E = gVarC.f14293d;
            gVarC.f14269F = gVarC.f14296g;
            gVarC.f14270G = gVarC.f14297h;
            gVarC.f14271H = gVarC.f14300l;
            gVarC.f14292c = byteBuffer.getInt();
            gVarC.f14293d = byteBuffer.getInt();
            gVarC.f14294e = byteBuffer.getInt();
            gVarC.f14295f = byteBuffer.getInt();
            gVarC.f14296g = byteBuffer.getInt();
            gVarC.f14297h = byteBuffer.getInt();
            gVarC.f14298i = byteBuffer.getInt();
            gVarC.j = byteBuffer.getInt();
            gVarC.f14299k = byteBuffer.getInt();
            gVarC.f14300l = byteBuffer.getFloat();
            gVarC.f14301m = byteBuffer.getFloat();
            gVarC.f14302n = byteBuffer.getFloat();
            int i11 = byteBuffer.getInt();
            gVarC.f14303o = i11 == -1 ? null : strArr[i11];
            int i12 = byteBuffer.getInt();
            gVarC.f14304p = i12 == -1 ? null : strArr[i12];
            gVarC.f14305q = g.h(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            gVarC.f14306r = i13 == -1 ? null : strArr[i13];
            gVarC.f14307s = g.h(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            gVarC.f14308t = i14 == -1 ? null : strArr[i14];
            gVarC.f14309u = g.h(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            gVarC.f14310v = i15 == -1 ? null : strArr[i15];
            gVarC.f14311w = g.h(byteBuffer, byteBufferArr);
            int i16 = byteBuffer.getInt();
            gVarC.f14312x = i16 == -1 ? null : strArr[i16];
            gVarC.f14313y = g.h(byteBuffer, byteBufferArr);
            int i17 = byteBuffer.getInt();
            gVarC.f14314z = i17 == -1 ? null : strArr[i17];
            int i18 = byteBuffer.getInt();
            gVarC.f14264A = i18 == -1 ? null : strArr[i18];
            byteBuffer.getInt();
            gVarC.f14274K = byteBuffer.getFloat();
            gVarC.f14275L = byteBuffer.getFloat();
            gVarC.f14276M = byteBuffer.getFloat();
            gVarC.f14277N = byteBuffer.getFloat();
            if (gVarC.f14278O == null) {
                gVarC.f14278O = new float[16];
            }
            for (int i19 = 0; i19 < 16; i19++) {
                gVarC.f14278O[i19] = byteBuffer.getFloat();
            }
            gVarC.f14285V = true;
            gVarC.f14287X = true;
            int i20 = byteBuffer.getInt();
            ArrayList arrayList3 = gVarC.f14280Q;
            arrayList3.clear();
            ArrayList arrayList4 = gVarC.f14281R;
            arrayList4.clear();
            int i21 = 0;
            while (true) {
                kVar = gVarC.f14290a;
                if (i21 >= i20) {
                    break;
                }
                g gVarC2 = kVar.c(byteBuffer.getInt());
                gVarC2.f14279P = gVarC;
                arrayList3.add(gVarC2);
                i21++;
            }
            for (int i22 = 0; i22 < i20; i22++) {
                g gVarC3 = kVar.c(byteBuffer.getInt());
                gVarC3.f14279P = gVarC;
                arrayList4.add(gVarC3);
            }
            int i23 = byteBuffer.getInt();
            if (i23 == 0) {
                gVarC.f14282S = null;
            } else {
                ArrayList arrayList5 = gVarC.f14282S;
                if (arrayList5 == null) {
                    gVarC.f14282S = new ArrayList(i23);
                } else {
                    arrayList5.clear();
                }
                for (int i24 = 0; i24 < i23; i24++) {
                    e eVarB = kVar.b(byteBuffer.getInt());
                    int i25 = eVarB.f14260c;
                    if (i25 == 1) {
                        gVarC.f14283T = eVarB;
                    } else if (i25 == 2) {
                        gVarC.f14284U = eVarB;
                    } else {
                        gVarC.f14282S.add(eVarB);
                    }
                    gVarC.f14282S.add(eVarB);
                }
            }
            if (!gVarC.i(14)) {
                if (gVarC.i(6)) {
                    kVar2.f14331m = gVarC;
                }
                if (gVarC.f14266C) {
                    arrayList2.add(gVarC);
                }
                int i26 = gVarC.f14298i;
                if (i26 != -1 && !lVar.c(i26) && (viewB2 = lVar.b(gVarC.f14298i)) != null) {
                    viewB2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map = kVar2.f14326g;
        g gVar3 = (g) map.get(0);
        ArrayList arrayList6 = new ArrayList();
        View view = kVar2.f14320a;
        if (gVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT < 28 || !((activityQ = D.q(view.getContext())) == null || activityQ.getWindow() == null || !((i10 = activityQ.getWindow().getAttributes().layoutInDisplayCutoutMode) == 2 || i10 == 0))) && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                if (!kVar2.f14336r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    gVar3.f14287X = true;
                    gVar3.f14285V = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                kVar2.f14336r = Integer.valueOf(systemWindowInsetLeft);
                z4 = false;
                Matrix.translateM(fArr, 0, systemWindowInsetLeft, 0.0f, 0.0f);
            } else {
                z4 = false;
            }
            gVar3.m(fArr, hashSet, z4);
            gVar3.d(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        g gVar4 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = kVar2.f14334p;
            if (!zHasNext) {
                break;
            }
            g gVar5 = (g) it.next();
            if (!arrayList.contains(Integer.valueOf(gVar5.f14291b))) {
                gVar4 = gVar5;
            }
        }
        if (gVar4 == null && arrayList6.size() > 0) {
            gVar4 = (g) arrayList6.get(arrayList6.size() - 1);
        }
        if (gVar4 != null && (gVar4.f14291b != kVar2.f14335q || arrayList6.size() != arrayList.size())) {
            kVar2.f14335q = gVar4.f14291b;
            String strG = gVar4.g();
            if (strG == null) {
                strG = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                view.setAccessibilityPaneTitle(strG);
            } else {
                AccessibilityEvent accessibilityEventD = kVar2.d(gVar4.f14291b, 32);
                accessibilityEventD.getText().add(strG);
                kVar2.h(accessibilityEventD);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((g) it2.next()).f14291b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            i7 = 4;
            if (!it3.hasNext()) {
                break;
            }
            g gVar6 = (g) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(gVar6)) {
                gVar6.f14279P = null;
                if (gVar6.f14298i != -1 && (num = kVar2.j) != null && kVar2.f14323d.platformViewOfNode(num.intValue()) == lVar.b(gVar6.f14298i)) {
                    kVar2.g(kVar2.j.intValue(), 65536);
                    kVar2.j = null;
                }
                int i27 = gVar6.f14298i;
                if (i27 != -1 && (viewB = lVar.b(i27)) != null) {
                    viewB.setImportantForAccessibility(4);
                }
                g gVar7 = kVar2.f14328i;
                if (gVar7 == gVar6) {
                    kVar2.g(gVar7.f14291b, 65536);
                    kVar2.f14328i = null;
                }
                if (kVar2.f14331m == gVar6) {
                    kVar2.f14331m = null;
                }
                if (kVar2.f14333o == gVar6) {
                    kVar2.f14333o = null;
                }
                it3.remove();
            }
        }
        int i28 = 2048;
        int i29 = 0;
        AccessibilityEvent accessibilityEventD2 = kVar2.d(0, 2048);
        accessibilityEventD2.setContentChangeTypes(1);
        kVar2.h(accessibilityEventD2);
        for (g gVar8 : arrayList2) {
            if (!Float.isNaN(gVar8.f14300l) && !Float.isNaN(gVar8.f14271H) && gVar8.f14271H != gVar8.f14300l) {
                AccessibilityEvent accessibilityEventD3 = kVar2.d(gVar8.f14291b, 4096);
                float f9 = gVar8.f14300l;
                float f10 = gVar8.f14301m;
                if (Float.isInfinite(f10)) {
                    if (f9 > 70000.0f) {
                        f9 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(gVar8.f14302n)) {
                    f7 = f10 + 100000.0f;
                    if (f9 < -70000.0f) {
                        f9 = -70000.0f;
                    }
                    f8 = f9 + 100000.0f;
                } else {
                    float f11 = gVar8.f14302n;
                    f7 = f10 - f11;
                    f8 = f9 - f11;
                }
                if (g.c(gVar8, d.SCROLL_UP) || g.c(gVar8, d.SCROLL_DOWN)) {
                    accessibilityEventD3.setScrollY((int) f8);
                    accessibilityEventD3.setMaxScrollY((int) f7);
                } else if (g.c(gVar8, d.SCROLL_LEFT) || g.c(gVar8, d.SCROLL_RIGHT)) {
                    accessibilityEventD3.setScrollX((int) f8);
                    accessibilityEventD3.setMaxScrollX((int) f7);
                }
                int i30 = gVar8.j;
                if (i30 > 0) {
                    accessibilityEventD3.setItemCount(i30);
                    accessibilityEventD3.setFromIndex(gVar8.f14299k);
                    Iterator it4 = gVar8.f14281R.iterator();
                    int i31 = i29;
                    while (it4.hasNext()) {
                        if (!((g) it4.next()).i(14)) {
                            i31++;
                        }
                    }
                    accessibilityEventD3.setToIndex((gVar8.f14299k + i31) - 1);
                }
                kVar2.h(accessibilityEventD3);
            }
            if (gVar8.i(16) && (((str = gVar8.f14304p) != null || gVar8.f14273J != null) && (str == null || (str2 = gVar8.f14273J) == null || !str.equals(str2)))) {
                AccessibilityEvent accessibilityEventD4 = kVar2.d(gVar8.f14291b, i28);
                accessibilityEventD4.setContentChangeTypes(1);
                kVar2.h(accessibilityEventD4);
            }
            g gVar9 = kVar2.f14328i;
            if (gVar9 != null && gVar9.f14291b == gVar8.f14291b && (gVar8.f14267D & p031e1.k.b(3)) == 0 && gVar8.i(3)) {
                AccessibilityEvent accessibilityEventD5 = kVar2.d(gVar8.f14291b, i7);
                accessibilityEventD5.getText().add(gVar8.f14304p);
                kVar2.h(accessibilityEventD5);
            }
            g gVar10 = kVar2.f14331m;
            if (gVar10 != null && (i8 = gVar10.f14291b) == (i9 = gVar8.f14291b) && ((gVar2 = kVar2.f14332n) == null || gVar2.f14291b != i8)) {
                kVar2.f14332n = gVar10;
                kVar2.h(kVar2.d(i9, 8));
            } else if (gVar10 == null) {
                kVar2.f14332n = null;
            }
            g gVar11 = kVar2.f14331m;
            if (gVar11 != null && gVar11.f14291b == gVar8.f14291b && (gVar8.f14267D & p031e1.k.b(5)) != 0 && gVar8.i(5) && ((gVar = kVar2.f14328i) == null || gVar.f14291b == kVar2.f14331m.f14291b)) {
                String str3 = gVar8.f14272I;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = gVar8.f14306r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent accessibilityEventD6 = kVar2.d(gVar8.f14291b, 16);
                accessibilityEventD6.setBeforeText(str3);
                accessibilityEventD6.getText().add(str5);
                int i32 = i29;
                while (i32 < str3.length() && i32 < str5.length() && str3.charAt(i32) == str5.charAt(i32)) {
                    i32++;
                }
                if (i32 < str3.length() || i32 < str5.length()) {
                    accessibilityEventD6.setFromIndex(i32);
                    int length = str3.length() - 1;
                    int length2 = str5.length() - 1;
                    while (length >= i32 && length2 >= i32 && str3.charAt(length) == str5.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    accessibilityEventD6.setRemovedCount((length - i32) + 1);
                    accessibilityEventD6.setAddedCount((length2 - i32) + 1);
                } else {
                    accessibilityEventD6 = null;
                }
                if (accessibilityEventD6 != null) {
                    kVar2.h(accessibilityEventD6);
                }
                if (gVar8.f14269F != gVar8.f14296g || gVar8.f14270G != gVar8.f14297h) {
                    AccessibilityEvent accessibilityEventD7 = kVar2.d(gVar8.f14291b, 8192);
                    accessibilityEventD7.getText().add(str5);
                    accessibilityEventD7.setFromIndex(gVar8.f14296g);
                    accessibilityEventD7.setToIndex(gVar8.f14297h);
                    accessibilityEventD7.setItemCount(str5.length());
                    kVar2.h(accessibilityEventD7);
                }
            }
            i28 = 2048;
            i29 = 0;
            i7 = 4;
        }
    }
}
