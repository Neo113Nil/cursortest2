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
public final class c implements G.n, G.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f720a;

    public /* synthetic */ c(Object obj) {
        this.f720a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i2;
        h hVar;
        int i3;
        int i4;
        h hVar2;
        String str;
        float f2;
        float f3;
        Integer num;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        i iVar = (i) this.f720a;
        HashMap hashMap = iVar.f814g;
        io.flutter.plugin.platform.h hVar3 = iVar.f812e;
        ArrayList arrayList = iVar.f823p;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            i2 = 16;
            if (!byteBuffer.hasRemaining()) {
                break;
            }
            h b2 = iVar.b(byteBuffer.getInt());
            ArrayList arrayList3 = b2.f774X;
            i iVar2 = b2.f777a;
            b2.f760H = true;
            b2.N = b2.f799r;
            b2.f765O = b2.f797p;
            b2.f761I = b2.f781c;
            b2.f762J = b2.f783d;
            b2.f763K = b2.f788g;
            b2.L = b2.f789h;
            b2.f764M = b2.f793l;
            b2.f781c = byteBuffer.getLong();
            b2.f783d = byteBuffer.getInt();
            b2.f785e = byteBuffer.getInt();
            b2.f786f = byteBuffer.getInt();
            b2.f788g = byteBuffer.getInt();
            b2.f789h = byteBuffer.getInt();
            b2.f790i = byteBuffer.getInt();
            b2.f791j = byteBuffer.getInt();
            b2.f792k = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f793l = byteBuffer.getFloat();
            b2.f794m = byteBuffer.getFloat();
            b2.f795n = byteBuffer.getFloat();
            b2.f757E = byteBuffer.getInt();
            b2.f796o = i.c(byteBuffer, strArr);
            b2.f797p = i.c(byteBuffer, strArr);
            b2.f798q = h.f(byteBuffer, byteBufferArr);
            b2.f799r = i.c(byteBuffer, strArr);
            b2.f800s = h.f(byteBuffer, byteBufferArr);
            b2.f801t = i.c(byteBuffer, strArr);
            b2.f802u = h.f(byteBuffer, byteBufferArr);
            b2.v = i.c(byteBuffer, strArr);
            b2.f803w = h.f(byteBuffer, byteBufferArr);
            b2.f804x = i.c(byteBuffer, strArr);
            b2.f805y = h.f(byteBuffer, byteBufferArr);
            b2.f806z = i.c(byteBuffer, strArr);
            b2.f754A = i.c(byteBuffer, strArr);
            b2.B = i.c(byteBuffer, strArr);
            b2.f755C = i.c(byteBuffer, strArr);
            b2.f756D = i.c(byteBuffer, strArr);
            b2.f758F = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f766P = byteBuffer.getFloat();
            b2.f767Q = byteBuffer.getFloat();
            b2.f768R = byteBuffer.getFloat();
            b2.f769S = byteBuffer.getFloat();
            float[] fArr = b2.f770T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                fArr[i5] = byteBuffer.getFloat();
            }
            b2.f770T = fArr;
            float[] fArr2 = b2.f771U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i6 = 0; i6 < 16; i6++) {
                fArr2[i6] = byteBuffer.getFloat();
            }
            b2.f771U = fArr2;
            b2.f780b0 = true;
            b2.f784d0 = true;
            int i7 = byteBuffer.getInt();
            ArrayList arrayList4 = b2.f773W;
            arrayList4.clear();
            for (int i8 = 0; i8 < i7; i8++) {
                h b3 = iVar2.b(byteBuffer.getInt());
                b3.f772V = b2;
                arrayList4.add(b3);
            }
            int i9 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                h b4 = iVar2.b(byteBuffer.getInt());
                b4.f772V = b2;
                arrayList3.add(b4);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                b2.f775Y = null;
            } else {
                ArrayList arrayList5 = b2.f775Y;
                if (arrayList5 == null) {
                    b2.f775Y = new ArrayList(i11);
                } else {
                    arrayList5.clear();
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    g a2 = iVar2.a(byteBuffer.getInt());
                    int i13 = a2.f751c;
                    if (i13 == 1) {
                        b2.f776Z = a2;
                    } else if (i13 == 2) {
                        b2.f778a0 = a2;
                    } else {
                        b2.f775Y.add(a2);
                    }
                    b2.f775Y.add(a2);
                }
            }
            if (!b2.h(14)) {
                if (b2.h(6)) {
                    iVar.f820m = b2;
                }
                if (b2.f760H) {
                    arrayList2.add(b2);
                }
                int i14 = b2.f790i;
                if (i14 != -1 && !hVar3.j(i14)) {
                    hVar3.r(b2.f790i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        h hVar4 = (h) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (hVar4 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            hVar4.l(fArr3, hashSet, false);
            hVar4.c(arrayList6);
        }
        int size = arrayList6.size();
        h hVar5 = null;
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList6.get(i15);
            i15++;
            h hVar6 = (h) obj;
            if (!arrayList.contains(Integer.valueOf(hVar6.f779b))) {
                hVar5 = hVar6;
            }
        }
        if (hVar5 == null && !arrayList6.isEmpty()) {
            hVar5 = (h) arrayList6.get(arrayList6.size() - 1);
        }
        if (hVar5 != null && (hVar5.f779b != iVar.f824q || arrayList6.size() != arrayList.size())) {
            iVar.f824q = hVar5.f779b;
            String e2 = hVar5.e();
            if (e2 == null) {
                e2 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                iVar.f808a.setAccessibilityPaneTitle(e2);
            } else {
                AccessibilityEvent d2 = iVar.d(hVar5.f779b, 32);
                d2.getText().add(e2);
                iVar.h(d2);
            }
        }
        arrayList.clear();
        int size2 = arrayList6.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj2 = arrayList6.get(i16);
            i16++;
            arrayList.add(Integer.valueOf(((h) obj2).f779b));
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            h hVar7 = (h) ((Map.Entry) it.next()).getValue();
            if (!hashSet.contains(hVar7)) {
                hVar7.f772V = null;
                if (hVar7.f790i != -1 && (num = iVar.f817j) != null) {
                    View platformViewOfNode = iVar.f811d.platformViewOfNode(num.intValue());
                    hVar3.r(hVar7.f790i);
                    if (platformViewOfNode == null) {
                        iVar.g(iVar.f817j.intValue(), 65536);
                        iVar.f817j = null;
                    }
                }
                int i17 = hVar7.f790i;
                if (i17 != -1) {
                    hVar3.r(i17);
                }
                h hVar8 = iVar.f816i;
                if (hVar8 == hVar7) {
                    iVar.g(hVar8.f779b, 65536);
                    iVar.f816i = null;
                }
                if (iVar.f820m == hVar7) {
                    iVar.f820m = null;
                }
                if (iVar.f822o == hVar7) {
                    iVar.f822o = null;
                }
                it.remove();
            }
        }
        int i18 = 2048;
        int i19 = 0;
        AccessibilityEvent d3 = iVar.d(0, 2048);
        d3.setContentChangeTypes(1);
        iVar.h(d3);
        int size3 = arrayList2.size();
        int i20 = 0;
        while (i20 < size3) {
            Object obj3 = arrayList2.get(i20);
            i20++;
            h hVar9 = (h) obj3;
            if (!Float.isNaN(hVar9.f793l) && !Float.isNaN(hVar9.f764M) && hVar9.f764M != hVar9.f793l) {
                AccessibilityEvent d4 = iVar.d(hVar9.f779b, 4096);
                float f4 = hVar9.f793l;
                float f5 = hVar9.f794m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(hVar9.f795n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = hVar9.f795n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                int i21 = hVar9.f762J;
                if ((i21 & 16) != 0 || (i21 & 32) != 0) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if ((i21 & 4) != 0 || (i21 & 8) != 0) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i22 = hVar9.f791j;
                if (i22 > 0) {
                    d4.setItemCount(i22);
                    d4.setFromIndex(hVar9.f792k);
                    ArrayList arrayList7 = hVar9.f774X;
                    int size4 = arrayList7.size();
                    int i23 = i19;
                    int i24 = i23;
                    while (i24 < size4) {
                        Object obj4 = arrayList7.get(i24);
                        i24++;
                        if (!((h) obj4).h(14)) {
                            i23++;
                        }
                    }
                    d4.setToIndex((hVar9.f792k + i23) - 1);
                }
                iVar.h(d4);
            }
            if (hVar9.h(i2) && (((str = hVar9.f797p) != null || hVar9.f765O != null) && (str == null || !str.equals(hVar9.f765O)))) {
                AccessibilityEvent d5 = iVar.d(hVar9.f779b, i18);
                d5.setContentChangeTypes(1);
                iVar.h(d5);
            }
            if (Build.VERSION.SDK_INT >= 36 && hVar9.f760H) {
                if (hVar9.h(2) != hVar9.g(2) || hVar9.h(26) != hVar9.g(26) || hVar9.h(18) != hVar9.g(18)) {
                    AccessibilityEvent d6 = iVar.d(hVar9.f779b, i18);
                    d6.setContentChangeTypes(8192);
                    iVar.h(d6);
                }
            }
            h hVar10 = iVar.f816i;
            if (hVar10 != null && hVar10.f779b == hVar9.f779b && !hVar9.g(3) && hVar9.h(3)) {
                AccessibilityEvent d7 = iVar.d(hVar9.f779b, 4);
                d7.getText().add(hVar9.f797p);
                iVar.h(d7);
            }
            h hVar11 = iVar.f820m;
            if (hVar11 != null && (i3 = hVar11.f779b) == (i4 = hVar9.f779b) && ((hVar2 = iVar.f821n) == null || hVar2.f779b != i3)) {
                iVar.f821n = hVar11;
                iVar.h(iVar.d(i4, 8));
            } else if (hVar11 == null) {
                iVar.f821n = null;
            }
            h hVar12 = iVar.f820m;
            if (hVar12 != null && hVar12.f779b == hVar9.f779b && hVar9.g(5) && hVar9.h(5) && ((hVar = iVar.f816i) == null || hVar.f779b == iVar.f820m.f779b)) {
                String str2 = hVar9.N;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = hVar9.f799r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d8 = iVar.d(hVar9.f779b, i2);
                d8.setBeforeText(str2);
                d8.getText().add(str4);
                int i25 = 0;
                while (i25 < str2.length() && i25 < str4.length() && str2.charAt(i25) == str4.charAt(i25)) {
                    i25++;
                }
                if (i25 < str2.length() || i25 < str4.length()) {
                    d8.setFromIndex(i25);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i25 && length2 >= i25 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d8.setRemovedCount((length - i25) + 1);
                    d8.setAddedCount((length2 - i25) + 1);
                } else {
                    d8 = null;
                }
                if (d8 != null) {
                    iVar.h(d8);
                }
                if (hVar9.f763K != hVar9.f788g || hVar9.L != hVar9.f789h) {
                    AccessibilityEvent d9 = iVar.d(hVar9.f779b, 8192);
                    d9.getText().add(str4);
                    d9.setFromIndex(hVar9.f788g);
                    d9.setToIndex(hVar9.f789h);
                    d9.setItemCount(str4.length());
                    iVar.h(d9);
                }
            }
            i18 = 2048;
            i19 = 0;
            i2 = 16;
        }
    }
}
