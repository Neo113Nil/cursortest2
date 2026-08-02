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
import r5.InterfaceC1581f;
import r5.InterfaceC1582g;

/* loaded from: classes2.dex */
public final class a implements InterfaceC1581f, InterfaceC1582g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14224a;

    public /* synthetic */ a(Object obj) {
        this.f14224a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0233, code lost:
    
        r6 = r6.getWindow().getAttributes().layoutInDisplayCutoutMode;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        View b7;
        Integer num;
        WindowInsets rootWindowInsets;
        boolean z4;
        Activity q7;
        int i10;
        k kVar;
        View b8;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        k kVar2 = (k) this.f14224a;
        kVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            lVar = kVar2.f14318e;
            if (!hasRemaining) {
                break;
            }
            g c3 = kVar2.c(byteBuffer.getInt());
            c3.f14260C = true;
            c3.f14266I = c3.f14300r;
            c3.f14267J = c3.f14298p;
            c3.f14261D = c3.f14286c;
            c3.f14262E = c3.f14287d;
            c3.f14263F = c3.f14290g;
            c3.f14264G = c3.f14291h;
            c3.f14265H = c3.f14294l;
            c3.f14286c = byteBuffer.getInt();
            c3.f14287d = byteBuffer.getInt();
            c3.f14288e = byteBuffer.getInt();
            c3.f14289f = byteBuffer.getInt();
            c3.f14290g = byteBuffer.getInt();
            c3.f14291h = byteBuffer.getInt();
            c3.f14292i = byteBuffer.getInt();
            c3.j = byteBuffer.getInt();
            c3.f14293k = byteBuffer.getInt();
            c3.f14294l = byteBuffer.getFloat();
            c3.f14295m = byteBuffer.getFloat();
            c3.f14296n = byteBuffer.getFloat();
            int i11 = byteBuffer.getInt();
            c3.f14297o = i11 == -1 ? null : strArr[i11];
            int i12 = byteBuffer.getInt();
            c3.f14298p = i12 == -1 ? null : strArr[i12];
            c3.f14299q = g.h(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            c3.f14300r = i13 == -1 ? null : strArr[i13];
            c3.f14301s = g.h(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            c3.f14302t = i14 == -1 ? null : strArr[i14];
            c3.f14303u = g.h(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            c3.f14304v = i15 == -1 ? null : strArr[i15];
            c3.f14305w = g.h(byteBuffer, byteBufferArr);
            int i16 = byteBuffer.getInt();
            c3.f14306x = i16 == -1 ? null : strArr[i16];
            c3.f14307y = g.h(byteBuffer, byteBufferArr);
            int i17 = byteBuffer.getInt();
            c3.f14308z = i17 == -1 ? null : strArr[i17];
            int i18 = byteBuffer.getInt();
            c3.f14258A = i18 == -1 ? null : strArr[i18];
            byteBuffer.getInt();
            c3.f14268K = byteBuffer.getFloat();
            c3.f14269L = byteBuffer.getFloat();
            c3.f14270M = byteBuffer.getFloat();
            c3.f14271N = byteBuffer.getFloat();
            if (c3.f14272O == null) {
                c3.f14272O = new float[16];
            }
            for (int i19 = 0; i19 < 16; i19++) {
                c3.f14272O[i19] = byteBuffer.getFloat();
            }
            c3.f14279V = true;
            c3.f14281X = true;
            int i20 = byteBuffer.getInt();
            ArrayList arrayList3 = c3.f14274Q;
            arrayList3.clear();
            ArrayList arrayList4 = c3.f14275R;
            arrayList4.clear();
            int i21 = 0;
            while (true) {
                kVar = c3.f14284a;
                if (i21 >= i20) {
                    break;
                }
                g c4 = kVar.c(byteBuffer.getInt());
                c4.f14273P = c3;
                arrayList3.add(c4);
                i21++;
            }
            for (int i22 = 0; i22 < i20; i22++) {
                g c7 = kVar.c(byteBuffer.getInt());
                c7.f14273P = c3;
                arrayList4.add(c7);
            }
            int i23 = byteBuffer.getInt();
            if (i23 == 0) {
                c3.f14276S = null;
            } else {
                ArrayList arrayList5 = c3.f14276S;
                if (arrayList5 == null) {
                    c3.f14276S = new ArrayList(i23);
                } else {
                    arrayList5.clear();
                }
                for (int i24 = 0; i24 < i23; i24++) {
                    e b9 = kVar.b(byteBuffer.getInt());
                    int i25 = b9.f14254c;
                    if (i25 == 1) {
                        c3.f14277T = b9;
                    } else if (i25 == 2) {
                        c3.f14278U = b9;
                    } else {
                        c3.f14276S.add(b9);
                    }
                    c3.f14276S.add(b9);
                }
            }
            if (!c3.i(14)) {
                if (c3.i(6)) {
                    kVar2.f14325m = c3;
                }
                if (c3.f14260C) {
                    arrayList2.add(c3);
                }
                int i26 = c3.f14292i;
                if (i26 != -1 && !lVar.c(i26) && (b8 = lVar.b(c3.f14292i)) != null) {
                    b8.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = kVar2.f14320g;
        g gVar3 = (g) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        View view = kVar2.f14314a;
        if (gVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT < 28 || !((q7 = D.q(view.getContext())) == null || q7.getWindow() == null || !(i10 == 2 || i10 == 0))) && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                if (!kVar2.f14330r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    gVar3.f14281X = true;
                    gVar3.f14279V = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                kVar2.f14330r = Integer.valueOf(systemWindowInsetLeft);
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
            boolean hasNext = it.hasNext();
            arrayList = kVar2.f14328p;
            if (!hasNext) {
                break;
            }
            g gVar5 = (g) it.next();
            if (!arrayList.contains(Integer.valueOf(gVar5.f14285b))) {
                gVar4 = gVar5;
            }
        }
        if (gVar4 == null && arrayList6.size() > 0) {
            gVar4 = (g) arrayList6.get(arrayList6.size() - 1);
        }
        if (gVar4 != null && (gVar4.f14285b != kVar2.f14329q || arrayList6.size() != arrayList.size())) {
            kVar2.f14329q = gVar4.f14285b;
            String g3 = gVar4.g();
            if (g3 == null) {
                g3 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                view.setAccessibilityPaneTitle(g3);
            } else {
                AccessibilityEvent d7 = kVar2.d(gVar4.f14285b, 32);
                d7.getText().add(g3);
                kVar2.h(d7);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((g) it2.next()).f14285b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            i7 = 4;
            if (!it3.hasNext()) {
                break;
            }
            g gVar6 = (g) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(gVar6)) {
                gVar6.f14273P = null;
                if (gVar6.f14292i != -1 && (num = kVar2.j) != null && kVar2.f14317d.platformViewOfNode(num.intValue()) == lVar.b(gVar6.f14292i)) {
                    kVar2.g(kVar2.j.intValue(), 65536);
                    kVar2.j = null;
                }
                int i27 = gVar6.f14292i;
                if (i27 != -1 && (b7 = lVar.b(i27)) != null) {
                    b7.setImportantForAccessibility(4);
                }
                g gVar7 = kVar2.f14322i;
                if (gVar7 == gVar6) {
                    kVar2.g(gVar7.f14285b, 65536);
                    kVar2.f14322i = null;
                }
                if (kVar2.f14325m == gVar6) {
                    kVar2.f14325m = null;
                }
                if (kVar2.f14327o == gVar6) {
                    kVar2.f14327o = null;
                }
                it3.remove();
            }
        }
        int i28 = 2048;
        int i29 = 0;
        AccessibilityEvent d8 = kVar2.d(0, 2048);
        d8.setContentChangeTypes(1);
        kVar2.h(d8);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            g gVar8 = (g) it4.next();
            if (!Float.isNaN(gVar8.f14294l) && !Float.isNaN(gVar8.f14265H) && gVar8.f14265H != gVar8.f14294l) {
                AccessibilityEvent d9 = kVar2.d(gVar8.f14285b, 4096);
                float f9 = gVar8.f14294l;
                float f10 = gVar8.f14295m;
                if (Float.isInfinite(f10)) {
                    if (f9 > 70000.0f) {
                        f9 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(gVar8.f14296n)) {
                    f7 = f10 + 100000.0f;
                    if (f9 < -70000.0f) {
                        f9 = -70000.0f;
                    }
                    f8 = f9 + 100000.0f;
                } else {
                    float f11 = gVar8.f14296n;
                    f7 = f10 - f11;
                    f8 = f9 - f11;
                }
                if (g.c(gVar8, d.SCROLL_UP) || g.c(gVar8, d.SCROLL_DOWN)) {
                    d9.setScrollY((int) f8);
                    d9.setMaxScrollY((int) f7);
                } else if (g.c(gVar8, d.SCROLL_LEFT) || g.c(gVar8, d.SCROLL_RIGHT)) {
                    d9.setScrollX((int) f8);
                    d9.setMaxScrollX((int) f7);
                }
                int i30 = gVar8.j;
                if (i30 > 0) {
                    d9.setItemCount(i30);
                    d9.setFromIndex(gVar8.f14293k);
                    Iterator it5 = gVar8.f14275R.iterator();
                    int i31 = i29;
                    while (it5.hasNext()) {
                        if (!((g) it5.next()).i(14)) {
                            i31++;
                        }
                    }
                    d9.setToIndex((gVar8.f14293k + i31) - 1);
                }
                kVar2.h(d9);
            }
            if (gVar8.i(16) && (((str = gVar8.f14298p) != null || gVar8.f14267J != null) && (str == null || (str2 = gVar8.f14267J) == null || !str.equals(str2)))) {
                AccessibilityEvent d10 = kVar2.d(gVar8.f14285b, i28);
                d10.setContentChangeTypes(1);
                kVar2.h(d10);
            }
            g gVar9 = kVar2.f14322i;
            if (gVar9 != null && gVar9.f14285b == gVar8.f14285b && (gVar8.f14261D & e1.k.b(3)) == 0 && gVar8.i(3)) {
                AccessibilityEvent d11 = kVar2.d(gVar8.f14285b, i7);
                d11.getText().add(gVar8.f14298p);
                kVar2.h(d11);
            }
            g gVar10 = kVar2.f14325m;
            if (gVar10 != null && (i8 = gVar10.f14285b) == (i9 = gVar8.f14285b) && ((gVar2 = kVar2.f14326n) == null || gVar2.f14285b != i8)) {
                kVar2.f14326n = gVar10;
                kVar2.h(kVar2.d(i9, 8));
            } else if (gVar10 == null) {
                kVar2.f14326n = null;
            }
            g gVar11 = kVar2.f14325m;
            if (gVar11 != null && gVar11.f14285b == gVar8.f14285b && (gVar8.f14261D & e1.k.b(5)) != 0 && gVar8.i(5) && ((gVar = kVar2.f14322i) == null || gVar.f14285b == kVar2.f14325m.f14285b)) {
                String str3 = gVar8.f14266I;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = gVar8.f14300r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent d12 = kVar2.d(gVar8.f14285b, 16);
                d12.setBeforeText(str3);
                d12.getText().add(str5);
                int i32 = i29;
                while (i32 < str3.length() && i32 < str5.length() && str3.charAt(i32) == str5.charAt(i32)) {
                    i32++;
                }
                if (i32 < str3.length() || i32 < str5.length()) {
                    d12.setFromIndex(i32);
                    int length = str3.length() - 1;
                    int length2 = str5.length() - 1;
                    while (length >= i32 && length2 >= i32 && str3.charAt(length) == str5.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d12.setRemovedCount((length - i32) + 1);
                    d12.setAddedCount((length2 - i32) + 1);
                } else {
                    d12 = null;
                }
                if (d12 != null) {
                    kVar2.h(d12);
                }
                if (gVar8.f14263F != gVar8.f14290g || gVar8.f14264G != gVar8.f14291h) {
                    AccessibilityEvent d13 = kVar2.d(gVar8.f14285b, 8192);
                    d13.getText().add(str5);
                    d13.setFromIndex(gVar8.f14290g);
                    d13.setToIndex(gVar8.f14291h);
                    d13.setItemCount(str5.length());
                    kVar2.h(d13);
                }
            }
            i28 = 2048;
            i29 = 0;
            i7 = 4;
        }
    }
}
