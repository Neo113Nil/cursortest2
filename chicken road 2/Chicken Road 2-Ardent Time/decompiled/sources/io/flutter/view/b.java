package io.flutter.view;

/* loaded from: classes.dex */
public final class b implements Q0.j, Q0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7796a;

    public /* synthetic */ b(java.lang.Object obj) {
        this.f7796a = obj;
    }

    public void a(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        int i2;
        io.flutter.plugin.platform.h hVar;
        java.util.ArrayList arrayList;
        io.flutter.view.g gVar;
        int i3;
        int i4;
        io.flutter.view.g gVar2;
        java.lang.String str;
        float f2;
        float f3;
        java.lang.Integer num;
        io.flutter.view.h hVar2;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        for (java.nio.ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        io.flutter.view.h hVar3 = (io.flutter.view.h) this.f7796a;
        hVar3.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i2 = 16;
            hVar = hVar3.f7888e;
            if (!hasRemaining) {
                break;
            }
            io.flutter.view.g b2 = hVar3.b(byteBuffer.getInt());
            b2.f7836H = true;
            b2.f7842N = b2.f7875r;
            b2.f7843O = b2.f7873p;
            b2.f7837I = b2.f7858c;
            b2.f7838J = b2.f7860d;
            b2.f7839K = b2.f7864g;
            b2.f7840L = b2.f7865h;
            b2.f7841M = b2.f7869l;
            b2.f7858c = byteBuffer.getLong();
            b2.f7860d = byteBuffer.getInt();
            b2.f7862e = byteBuffer.getInt();
            b2.f7863f = byteBuffer.getInt();
            b2.f7864g = byteBuffer.getInt();
            b2.f7865h = byteBuffer.getInt();
            b2.f7866i = byteBuffer.getInt();
            b2.f7867j = byteBuffer.getInt();
            b2.f7868k = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f7869l = byteBuffer.getFloat();
            b2.f7870m = byteBuffer.getFloat();
            b2.f7871n = byteBuffer.getFloat();
            b2.f7834E = byteBuffer.getInt();
            b2.f7872o = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7873p = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7874q = io.flutter.view.g.G(byteBuffer, byteBufferArr);
            b2.f7875r = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7876s = io.flutter.view.g.G(byteBuffer, byteBufferArr);
            b2.t = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7877u = io.flutter.view.g.G(byteBuffer, byteBufferArr);
            b2.f7878v = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7879w = io.flutter.view.g.G(byteBuffer, byteBufferArr);
            b2.f7880x = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7881y = io.flutter.view.g.G(byteBuffer, byteBufferArr);
            b2.f7882z = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7830A = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7831B = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7832C = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7833D = io.flutter.view.h.c(byteBuffer, strArr);
            b2.f7835F = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f7844P = byteBuffer.getFloat();
            b2.f7845Q = byteBuffer.getFloat();
            b2.f7846R = byteBuffer.getFloat();
            b2.f7847S = byteBuffer.getFloat();
            float[] fArr = b2.f7848T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                fArr[i5] = byteBuffer.getFloat();
            }
            b2.f7848T = fArr;
            float[] fArr2 = b2.f7849U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                fArr2[i6] = byteBuffer.getFloat();
            }
            b2.f7849U = fArr2;
            b2.f7857b0 = true;
            b2.f7861d0 = true;
            int i7 = byteBuffer.getInt();
            java.util.ArrayList arrayList3 = b2.f7851W;
            arrayList3.clear();
            int i8 = 0;
            while (true) {
                hVar2 = b2.f7854a;
                if (i8 >= i7) {
                    break;
                }
                io.flutter.view.g b3 = hVar2.b(byteBuffer.getInt());
                b3.f7850V = b2;
                arrayList3.add(b3);
                i8++;
            }
            int i9 = byteBuffer.getInt();
            java.util.ArrayList arrayList4 = b2.f7852X;
            arrayList4.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                io.flutter.view.g b4 = hVar2.b(byteBuffer.getInt());
                b4.f7850V = b2;
                arrayList4.add(b4);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                b2.Y = null;
            } else {
                java.util.ArrayList arrayList5 = b2.Y;
                if (arrayList5 == null) {
                    b2.Y = new java.util.ArrayList(i11);
                } else {
                    arrayList5.clear();
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    io.flutter.view.f a2 = hVar2.a(byteBuffer.getInt());
                    int i13 = a2.f7827c;
                    if (i13 == 1) {
                        b2.f7853Z = a2;
                    } else if (i13 == 2) {
                        b2.f7855a0 = a2;
                    } else {
                        b2.Y.add(a2);
                    }
                    b2.Y.add(a2);
                }
            }
            if (!b2.I(14)) {
                if (b2.I(6)) {
                    hVar3.f7896m = b2;
                }
                if (b2.f7836H) {
                    arrayList2.add(b2);
                }
                int i14 = b2.f7866i;
                if (i14 != -1 && !hVar.d(i14)) {
                    hVar.g(b2.f7866i);
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = hVar3.f7890g;
        io.flutter.view.g gVar3 = (io.flutter.view.g) hashMap.get(0);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        if (gVar3 != null) {
            float[] fArr3 = new float[16];
            android.opengl.Matrix.setIdentityM(fArr3, 0);
            gVar3.M(fArr3, hashSet, false);
            gVar3.D(arrayList6);
        }
        java.util.Iterator it = arrayList6.iterator();
        io.flutter.view.g gVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = hVar3.f7899p;
            if (!hasNext) {
                break;
            }
            io.flutter.view.g gVar5 = (io.flutter.view.g) it.next();
            if (!arrayList.contains(java.lang.Integer.valueOf(gVar5.f7856b))) {
                gVar4 = gVar5;
            }
        }
        if (gVar4 == null && !arrayList6.isEmpty()) {
            gVar4 = (io.flutter.view.g) arrayList6.get(arrayList6.size() - 1);
        }
        if (gVar4 != null && (gVar4.f7856b != hVar3.f7900q || arrayList6.size() != arrayList.size())) {
            hVar3.f7900q = gVar4.f7856b;
            java.lang.String F2 = gVar4.F();
            if (F2 == null) {
                F2 = " ";
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                hVar3.f7884a.setAccessibilityPaneTitle(F2);
            } else {
                android.view.accessibility.AccessibilityEvent d2 = hVar3.d(gVar4.f7856b, 32);
                d2.getText().add(F2);
                hVar3.h(d2);
            }
        }
        arrayList.clear();
        java.util.Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((io.flutter.view.g) it2.next()).f7856b));
        }
        java.util.Iterator it3 = hashMap.entrySet().iterator();
        while (it3.hasNext()) {
            io.flutter.view.g gVar6 = (io.flutter.view.g) ((java.util.Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(gVar6)) {
                gVar6.f7850V = null;
                if (gVar6.f7866i != -1 && (num = hVar3.f7893j) != null) {
                    android.view.View platformViewOfNode = hVar3.f7887d.platformViewOfNode(num.intValue());
                    hVar.g(gVar6.f7866i);
                    if (platformViewOfNode == null) {
                        hVar3.g(hVar3.f7893j.intValue(), 65536);
                        hVar3.f7893j = null;
                    }
                }
                int i15 = gVar6.f7866i;
                if (i15 != -1) {
                    hVar.g(i15);
                }
                io.flutter.view.g gVar7 = hVar3.f7892i;
                if (gVar7 == gVar6) {
                    hVar3.g(gVar7.f7856b, 65536);
                    hVar3.f7892i = null;
                }
                if (hVar3.f7896m == gVar6) {
                    hVar3.f7896m = null;
                }
                if (hVar3.f7898o == gVar6) {
                    hVar3.f7898o = null;
                }
                it3.remove();
            }
        }
        int i16 = 2048;
        int i17 = 0;
        android.view.accessibility.AccessibilityEvent d3 = hVar3.d(0, 2048);
        d3.setContentChangeTypes(1);
        hVar3.h(d3);
        java.util.Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            io.flutter.view.g gVar8 = (io.flutter.view.g) it4.next();
            if (!java.lang.Float.isNaN(gVar8.f7869l) && !java.lang.Float.isNaN(gVar8.f7841M) && gVar8.f7841M != gVar8.f7869l) {
                android.view.accessibility.AccessibilityEvent d4 = hVar3.d(gVar8.f7856b, io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
                float f4 = gVar8.f7869l;
                float f5 = gVar8.f7870m;
                if (java.lang.Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (java.lang.Float.isInfinite(gVar8.f7871n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = gVar8.f7871n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                if (io.flutter.view.g.C(gVar8, io.flutter.view.e.SCROLL_UP) || io.flutter.view.g.C(gVar8, io.flutter.view.e.SCROLL_DOWN)) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if (io.flutter.view.g.C(gVar8, io.flutter.view.e.SCROLL_LEFT) || io.flutter.view.g.C(gVar8, io.flutter.view.e.SCROLL_RIGHT)) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i18 = gVar8.f7867j;
                if (i18 > 0) {
                    d4.setItemCount(i18);
                    d4.setFromIndex(gVar8.f7868k);
                    java.util.Iterator it5 = gVar8.f7852X.iterator();
                    int i19 = i17;
                    while (it5.hasNext()) {
                        if (!((io.flutter.view.g) it5.next()).I(14)) {
                            i19++;
                        }
                    }
                    d4.setToIndex((gVar8.f7868k + i19) - 1);
                }
                hVar3.h(d4);
            }
            if (gVar8.I(i2) && (((str = gVar8.f7873p) != null || gVar8.f7843O != null) && (str == null || !str.equals(gVar8.f7843O)))) {
                android.view.accessibility.AccessibilityEvent d5 = hVar3.d(gVar8.f7856b, i16);
                d5.setContentChangeTypes(1);
                hVar3.h(d5);
            }
            if (android.os.Build.VERSION.SDK_INT >= 36 && gVar8.f7836H) {
                if (gVar8.I(2) != gVar8.H(2) || gVar8.I(26) != gVar8.H(26) || gVar8.I(18) != gVar8.H(18)) {
                    android.view.accessibility.AccessibilityEvent d6 = hVar3.d(gVar8.f7856b, i16);
                    d6.setContentChangeTypes(8192);
                    hVar3.h(d6);
                }
            }
            io.flutter.view.g gVar9 = hVar3.f7892i;
            if (gVar9 != null && gVar9.f7856b == gVar8.f7856b && !gVar8.H(3) && gVar8.I(3)) {
                android.view.accessibility.AccessibilityEvent d7 = hVar3.d(gVar8.f7856b, 4);
                d7.getText().add(gVar8.f7873p);
                hVar3.h(d7);
            }
            io.flutter.view.g gVar10 = hVar3.f7896m;
            if (gVar10 != null && (i3 = gVar10.f7856b) == (i4 = gVar8.f7856b) && ((gVar2 = hVar3.f7897n) == null || gVar2.f7856b != i3)) {
                hVar3.f7897n = gVar10;
                hVar3.h(hVar3.d(i4, 8));
            } else if (gVar10 == null) {
                hVar3.f7897n = null;
            }
            io.flutter.view.g gVar11 = hVar3.f7896m;
            if (gVar11 != null && gVar11.f7856b == gVar8.f7856b && gVar8.H(5) && gVar8.I(5) && ((gVar = hVar3.f7892i) == null || gVar.f7856b == hVar3.f7896m.f7856b)) {
                java.lang.String str2 = gVar8.f7842N;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = gVar8.f7875r;
                java.lang.String str4 = str3 != null ? str3 : "";
                android.view.accessibility.AccessibilityEvent d8 = hVar3.d(gVar8.f7856b, i2);
                d8.setBeforeText(str2);
                d8.getText().add(str4);
                int i20 = i17;
                while (i20 < str2.length() && i20 < str4.length() && str2.charAt(i20) == str4.charAt(i20)) {
                    i20++;
                }
                if (i20 < str2.length() || i20 < str4.length()) {
                    d8.setFromIndex(i20);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i20 && length2 >= i20 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d8.setRemovedCount((length - i20) + 1);
                    d8.setAddedCount((length2 - i20) + 1);
                } else {
                    d8 = null;
                }
                if (d8 != null) {
                    hVar3.h(d8);
                }
                if (gVar8.f7839K != gVar8.f7864g || gVar8.f7840L != gVar8.f7865h) {
                    android.view.accessibility.AccessibilityEvent d9 = hVar3.d(gVar8.f7856b, 8192);
                    d9.getText().add(str4);
                    d9.setFromIndex(gVar8.f7864g);
                    d9.setToIndex(gVar8.f7865h);
                    d9.setItemCount(str4.length());
                    hVar3.h(d9);
                }
            }
            i16 = 2048;
            i17 = 0;
            i2 = 16;
        }
    }
}
