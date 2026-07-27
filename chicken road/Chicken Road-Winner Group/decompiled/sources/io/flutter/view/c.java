package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements J1.j, J1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9340a;

    public /* synthetic */ c(Object obj) {
        this.f9340a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i3;
        io.flutter.plugin.platform.k kVar;
        ArrayList arrayList;
        int i4;
        h hVar;
        int i5;
        int i6;
        h hVar2;
        String str;
        float f;
        float f3;
        View h3;
        Integer num;
        i iVar;
        View h4;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        i iVar2 = (i) this.f9340a;
        iVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i3 = 16;
            kVar = iVar2.f9431e;
            if (!hasRemaining) {
                break;
            }
            h c3 = iVar2.c(byteBuffer.getInt());
            c3.f9380H = true;
            c3.f9385N = c3.f9419r;
            c3.f9386O = c3.f9417p;
            c3.f9381I = c3.f9402c;
            c3.f9382J = c3.f9404d;
            c3.f9383K = c3.f9408g;
            c3.L = c3.f9409h;
            c3.f9384M = c3.f9413l;
            c3.f9402c = byteBuffer.getLong();
            c3.f9404d = byteBuffer.getInt();
            c3.f9406e = byteBuffer.getInt();
            c3.f = byteBuffer.getInt();
            c3.f9408g = byteBuffer.getInt();
            c3.f9409h = byteBuffer.getInt();
            c3.f9410i = byteBuffer.getInt();
            c3.f9411j = byteBuffer.getInt();
            c3.f9412k = byteBuffer.getInt();
            byteBuffer.getInt();
            c3.f9413l = byteBuffer.getFloat();
            c3.f9414m = byteBuffer.getFloat();
            c3.f9415n = byteBuffer.getFloat();
            c3.f9377E = byteBuffer.getInt();
            c3.f9416o = i.d(byteBuffer, strArr);
            c3.f9417p = i.d(byteBuffer, strArr);
            c3.f9418q = h.f(byteBuffer, byteBufferArr);
            c3.f9419r = i.d(byteBuffer, strArr);
            c3.f9420s = h.f(byteBuffer, byteBufferArr);
            c3.f9421t = i.d(byteBuffer, strArr);
            c3.f9422u = h.f(byteBuffer, byteBufferArr);
            c3.f9423v = i.d(byteBuffer, strArr);
            c3.f9424w = h.f(byteBuffer, byteBufferArr);
            c3.f9425x = i.d(byteBuffer, strArr);
            c3.y = h.f(byteBuffer, byteBufferArr);
            c3.f9426z = i.d(byteBuffer, strArr);
            c3.f9373A = i.d(byteBuffer, strArr);
            c3.f9374B = i.d(byteBuffer, strArr);
            c3.f9375C = i.d(byteBuffer, strArr);
            c3.f9376D = i.d(byteBuffer, strArr);
            c3.f9378F = byteBuffer.getInt();
            byteBuffer.getInt();
            c3.f9387P = byteBuffer.getFloat();
            c3.f9388Q = byteBuffer.getFloat();
            c3.f9389R = byteBuffer.getFloat();
            c3.f9390S = byteBuffer.getFloat();
            float[] fArr = c3.f9391T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                fArr[i7] = byteBuffer.getFloat();
            }
            c3.f9391T = fArr;
            float[] fArr2 = c3.f9392U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                fArr2[i8] = byteBuffer.getFloat();
            }
            c3.f9392U = fArr2;
            c3.f9401b0 = true;
            c3.f9405d0 = true;
            int i9 = byteBuffer.getInt();
            ArrayList arrayList3 = c3.f9394W;
            arrayList3.clear();
            int i10 = 0;
            while (true) {
                iVar = c3.f9398a;
                if (i10 >= i9) {
                    break;
                }
                h c4 = iVar.c(byteBuffer.getInt());
                c4.f9393V = c3;
                arrayList3.add(c4);
                i10++;
            }
            int i11 = byteBuffer.getInt();
            ArrayList arrayList4 = c3.f9395X;
            arrayList4.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                h c5 = iVar.c(byteBuffer.getInt());
                c5.f9393V = c3;
                arrayList4.add(c5);
            }
            int i13 = byteBuffer.getInt();
            if (i13 == 0) {
                c3.f9396Y = null;
            } else {
                ArrayList arrayList5 = c3.f9396Y;
                if (arrayList5 == null) {
                    c3.f9396Y = new ArrayList(i13);
                } else {
                    arrayList5.clear();
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    g b3 = iVar.b(byteBuffer.getInt());
                    int i15 = b3.f9370c;
                    if (i15 == 1) {
                        c3.f9397Z = b3;
                    } else if (i15 == 2) {
                        c3.f9399a0 = b3;
                    } else {
                        c3.f9396Y.add(b3);
                    }
                    c3.f9396Y.add(b3);
                }
            }
            if (!c3.h(14)) {
                if (c3.h(6)) {
                    iVar2.f9439n = c3;
                }
                if (c3.f9380H) {
                    arrayList2.add(c3);
                }
                int i16 = c3.f9410i;
                if (i16 != -1 && !kVar.f(i16) && (h4 = kVar.h(c3.f9410i)) != null) {
                    h4.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = iVar2.f9432g;
        h hVar3 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (hVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            hVar3.l(fArr3, hashSet, false);
            hVar3.c(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        h hVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = iVar2.f9442q;
            if (!hasNext) {
                break;
            }
            h hVar5 = (h) it.next();
            if (!arrayList.contains(Integer.valueOf(hVar5.f9400b))) {
                hVar4 = hVar5;
            }
        }
        if (hVar4 == null && !arrayList6.isEmpty()) {
            hVar4 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar4 != null && (hVar4.f9400b != iVar2.f9443r || arrayList6.size() != arrayList.size())) {
            iVar2.f9443r = hVar4.f9400b;
            String e3 = hVar4.e();
            if (e3 == null) {
                e3 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar2.f9427a.setAccessibilityPaneTitle(e3);
            } else {
                AccessibilityEvent e4 = iVar2.e(hVar4.f9400b, 32);
                e4.getText().add(e3);
                iVar2.i(e4);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((h) it2.next()).f9400b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            i4 = 4;
            if (!it3.hasNext()) {
                break;
            }
            h hVar6 = (h) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(hVar6)) {
                hVar6.f9393V = null;
                if (hVar6.f9410i != -1 && (num = iVar2.f9435j) != null && iVar2.f9430d.platformViewOfNode(num.intValue()) == kVar.h(hVar6.f9410i)) {
                    iVar2.h(iVar2.f9435j.intValue(), 65536);
                    iVar2.f9435j = null;
                }
                int i17 = hVar6.f9410i;
                if (i17 != -1 && (h3 = kVar.h(i17)) != null) {
                    h3.setImportantForAccessibility(4);
                }
                h hVar7 = iVar2.f9434i;
                if (hVar7 == hVar6) {
                    iVar2.h(hVar7.f9400b, 65536);
                    iVar2.f9434i = null;
                }
                if (iVar2.f9439n == hVar6) {
                    iVar2.f9439n = null;
                }
                if (iVar2.f9441p == hVar6) {
                    iVar2.f9441p = null;
                }
                it3.remove();
            }
        }
        int i18 = 2048;
        int i19 = 0;
        AccessibilityEvent e5 = iVar2.e(0, 2048);
        e5.setContentChangeTypes(1);
        iVar2.i(e5);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            h hVar8 = (h) it4.next();
            if (!Float.isNaN(hVar8.f9413l) && !Float.isNaN(hVar8.f9384M) && hVar8.f9384M != hVar8.f9413l) {
                AccessibilityEvent e6 = iVar2.e(hVar8.f9400b, 4096);
                float f4 = hVar8.f9413l;
                float f5 = hVar8.f9414m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(hVar8.f9415n)) {
                    f = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = hVar8.f9415n;
                    f = f5 - f6;
                    f3 = f4 - f6;
                }
                int i20 = hVar8.f9382J;
                if ((i20 & 16) != 0 || (i20 & 32) != 0) {
                    e6.setScrollY((int) f3);
                    e6.setMaxScrollY((int) f);
                } else if ((i20 & 4) != 0 || (i20 & 8) != 0) {
                    e6.setScrollX((int) f3);
                    e6.setMaxScrollX((int) f);
                }
                int i21 = hVar8.f9411j;
                if (i21 > 0) {
                    e6.setItemCount(i21);
                    e6.setFromIndex(hVar8.f9412k);
                    Iterator it5 = hVar8.f9395X.iterator();
                    int i22 = i19;
                    while (it5.hasNext()) {
                        if (!((h) it5.next()).h(14)) {
                            i22++;
                        }
                    }
                    e6.setToIndex((hVar8.f9412k + i22) - 1);
                }
                iVar2.i(e6);
            }
            if (hVar8.h(i3) && (((str = hVar8.f9417p) != null || hVar8.f9386O != null) && (str == null || !str.equals(hVar8.f9386O)))) {
                AccessibilityEvent e7 = iVar2.e(hVar8.f9400b, i18);
                e7.setContentChangeTypes(1);
                iVar2.i(e7);
            }
            if (Build.VERSION.SDK_INT >= 36 && hVar8.f9380H) {
                if (hVar8.h(2) != hVar8.g(2) || hVar8.h(26) != hVar8.g(26) || hVar8.h(18) != hVar8.g(18)) {
                    AccessibilityEvent e8 = iVar2.e(hVar8.f9400b, i18);
                    e8.setContentChangeTypes(8192);
                    iVar2.i(e8);
                }
            }
            h hVar9 = iVar2.f9434i;
            if (hVar9 != null && hVar9.f9400b == hVar8.f9400b && !hVar8.g(3) && hVar8.h(3)) {
                AccessibilityEvent e9 = iVar2.e(hVar8.f9400b, i4);
                e9.getText().add(hVar8.f9417p);
                iVar2.i(e9);
            }
            h hVar10 = iVar2.f9439n;
            if (hVar10 != null && (i5 = hVar10.f9400b) == (i6 = hVar8.f9400b) && ((hVar2 = iVar2.f9440o) == null || hVar2.f9400b != i5)) {
                iVar2.f9440o = hVar10;
                iVar2.i(iVar2.e(i6, 8));
            } else if (hVar10 == null) {
                iVar2.f9440o = null;
            }
            h hVar11 = iVar2.f9439n;
            if (hVar11 != null && hVar11.f9400b == hVar8.f9400b && hVar8.g(5) && hVar8.h(5) && ((hVar = iVar2.f9434i) == null || hVar.f9400b == iVar2.f9439n.f9400b)) {
                String str2 = hVar8.f9385N;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = hVar8.f9419r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent e10 = iVar2.e(hVar8.f9400b, i3);
                e10.setBeforeText(str2);
                e10.getText().add(str4);
                int i23 = i19;
                while (i23 < str2.length() && i23 < str4.length() && str2.charAt(i23) == str4.charAt(i23)) {
                    i23++;
                }
                if (i23 < str2.length() || i23 < str4.length()) {
                    e10.setFromIndex(i23);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i23 && length2 >= i23 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    e10.setRemovedCount((length - i23) + 1);
                    e10.setAddedCount((length2 - i23) + 1);
                } else {
                    e10 = null;
                }
                if (e10 != null) {
                    iVar2.i(e10);
                }
                if (hVar8.f9383K != hVar8.f9408g || hVar8.L != hVar8.f9409h) {
                    AccessibilityEvent e11 = iVar2.e(hVar8.f9400b, 8192);
                    e11.getText().add(str4);
                    e11.setFromIndex(hVar8.f9408g);
                    e11.setToIndex(hVar8.f9409h);
                    e11.setItemCount(str4.length());
                    iVar2.i(e11);
                }
            }
            i18 = 2048;
            i19 = 0;
            i4 = 4;
            i3 = 16;
        }
    }
}
