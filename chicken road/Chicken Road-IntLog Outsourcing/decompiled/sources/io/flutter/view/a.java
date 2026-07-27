package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import x2.InterfaceC1546i;
import x2.InterfaceC1547j;

/* loaded from: classes.dex */
public final class a implements InterfaceC1546i, InterfaceC1547j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10266a;

    public /* synthetic */ a(Object obj) {
        this.f10266a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i2;
        io.flutter.plugin.platform.i iVar;
        ArrayList arrayList;
        f fVar;
        int i3;
        int i6;
        f fVar2;
        String str;
        float f3;
        float f6;
        Integer num;
        g gVar;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        g gVar2 = (g) this.f10266a;
        gVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            i2 = 16;
            iVar = gVar2.f10361e;
            if (!hasRemaining) {
                break;
            }
            f b6 = gVar2.b(byteBuffer.getInt());
            b6.f10307H = true;
            b6.N = b6.f10348r;
            b6.f10313O = b6.f10346p;
            b6.f10308I = b6.f10329c;
            b6.f10309J = b6.f10331d;
            b6.f10310K = b6.f10337g;
            b6.f10311L = b6.f10338h;
            b6.f10312M = b6.f10342l;
            b6.f10329c = byteBuffer.getLong();
            b6.f10331d = byteBuffer.getInt();
            b6.f10333e = byteBuffer.getInt();
            b6.f10335f = byteBuffer.getInt();
            b6.f10337g = byteBuffer.getInt();
            b6.f10338h = byteBuffer.getInt();
            b6.f10339i = byteBuffer.getInt();
            b6.f10340j = byteBuffer.getInt();
            b6.f10341k = byteBuffer.getInt();
            byteBuffer.getInt();
            b6.f10342l = byteBuffer.getFloat();
            b6.f10343m = byteBuffer.getFloat();
            b6.f10344n = byteBuffer.getFloat();
            b6.f10304E = byteBuffer.getInt();
            b6.f10345o = g.c(byteBuffer, strArr);
            b6.f10346p = g.c(byteBuffer, strArr);
            b6.f10347q = f.G(byteBuffer, byteBufferArr);
            b6.f10348r = g.c(byteBuffer, strArr);
            b6.f10349s = f.G(byteBuffer, byteBufferArr);
            b6.f10350t = g.c(byteBuffer, strArr);
            b6.f10351u = f.G(byteBuffer, byteBufferArr);
            b6.f10352v = g.c(byteBuffer, strArr);
            b6.f10353w = f.G(byteBuffer, byteBufferArr);
            b6.f10354x = g.c(byteBuffer, strArr);
            b6.f10355y = f.G(byteBuffer, byteBufferArr);
            b6.z = g.c(byteBuffer, strArr);
            b6.f10300A = g.c(byteBuffer, strArr);
            b6.f10301B = g.c(byteBuffer, strArr);
            b6.f10302C = g.c(byteBuffer, strArr);
            b6.f10303D = g.c(byteBuffer, strArr);
            b6.f10305F = byteBuffer.getInt();
            byteBuffer.getInt();
            b6.f10314P = byteBuffer.getFloat();
            b6.f10315Q = byteBuffer.getFloat();
            b6.f10316R = byteBuffer.getFloat();
            b6.f10317S = byteBuffer.getFloat();
            float[] fArr = b6.f10318T;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                fArr[i7] = byteBuffer.getFloat();
            }
            b6.f10318T = fArr;
            float[] fArr2 = b6.f10319U;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                fArr2[i8] = byteBuffer.getFloat();
            }
            b6.f10319U = fArr2;
            b6.f10328b0 = true;
            b6.f10332d0 = true;
            int i9 = byteBuffer.getInt();
            ArrayList arrayList3 = b6.f10321W;
            arrayList3.clear();
            int i10 = 0;
            while (true) {
                gVar = b6.f10325a;
                if (i10 >= i9) {
                    break;
                }
                f b7 = gVar.b(byteBuffer.getInt());
                b7.f10320V = b6;
                arrayList3.add(b7);
                i10++;
            }
            int i11 = byteBuffer.getInt();
            ArrayList arrayList4 = b6.f10322X;
            arrayList4.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                f b8 = gVar.b(byteBuffer.getInt());
                b8.f10320V = b6;
                arrayList4.add(b8);
            }
            int i13 = byteBuffer.getInt();
            if (i13 == 0) {
                b6.f10323Y = null;
            } else {
                ArrayList arrayList5 = b6.f10323Y;
                if (arrayList5 == null) {
                    b6.f10323Y = new ArrayList(i13);
                } else {
                    arrayList5.clear();
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    e a6 = gVar.a(byteBuffer.getInt());
                    int i15 = a6.f10297c;
                    if (i15 == 1) {
                        b6.f10324Z = a6;
                    } else if (i15 == 2) {
                        b6.f10326a0 = a6;
                    } else {
                        b6.f10323Y.add(a6);
                    }
                    b6.f10323Y.add(a6);
                }
            }
            if (!b6.I(14)) {
                if (b6.I(6)) {
                    gVar2.f10369m = b6;
                }
                if (b6.f10307H) {
                    arrayList2.add(b6);
                }
                int i16 = b6.f10339i;
                if (i16 != -1 && !iVar.c(i16)) {
                    iVar.d(b6.f10339i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = gVar2.f10363g;
        f fVar3 = (f) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (fVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            fVar3.M(fArr3, hashSet, false);
            fVar3.D(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        f fVar4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = gVar2.f10372p;
            if (!hasNext) {
                break;
            }
            f fVar5 = (f) it.next();
            if (!arrayList.contains(Integer.valueOf(fVar5.f10327b))) {
                fVar4 = fVar5;
            }
        }
        if (fVar4 == null && !arrayList6.isEmpty()) {
            fVar4 = (f) arrayList6.get(arrayList6.size() - 1);
        }
        if (fVar4 != null && (fVar4.f10327b != gVar2.f10373q || arrayList6.size() != arrayList.size())) {
            gVar2.f10373q = fVar4.f10327b;
            String F2 = fVar4.F();
            if (F2 == null) {
                F2 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                gVar2.f10357a.setAccessibilityPaneTitle(F2);
            } else {
                AccessibilityEvent d6 = gVar2.d(fVar4.f10327b, 32);
                d6.getText().add(F2);
                gVar2.h(d6);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((f) it2.next()).f10327b));
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (it3.hasNext()) {
            f fVar6 = (f) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(fVar6)) {
                fVar6.f10320V = null;
                if (fVar6.f10339i != -1 && (num = gVar2.f10366j) != null) {
                    View platformViewOfNode = gVar2.f10360d.platformViewOfNode(num.intValue());
                    iVar.d(fVar6.f10339i);
                    if (platformViewOfNode == null) {
                        gVar2.g(gVar2.f10366j.intValue(), 65536);
                        gVar2.f10366j = null;
                    }
                }
                int i17 = fVar6.f10339i;
                if (i17 != -1) {
                    iVar.d(i17);
                }
                f fVar7 = gVar2.f10365i;
                if (fVar7 == fVar6) {
                    gVar2.g(fVar7.f10327b, 65536);
                    gVar2.f10365i = null;
                }
                if (gVar2.f10369m == fVar6) {
                    gVar2.f10369m = null;
                }
                if (gVar2.f10371o == fVar6) {
                    gVar2.f10371o = null;
                }
                it3.remove();
            }
        }
        int i18 = 2048;
        int i19 = 0;
        AccessibilityEvent d7 = gVar2.d(0, 2048);
        d7.setContentChangeTypes(1);
        gVar2.h(d7);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            f fVar8 = (f) it4.next();
            if (!Float.isNaN(fVar8.f10342l) && !Float.isNaN(fVar8.f10312M) && fVar8.f10312M != fVar8.f10342l) {
                AccessibilityEvent d8 = gVar2.d(fVar8.f10327b, Base64Utils.IO_BUFFER_SIZE);
                float f7 = fVar8.f10342l;
                float f8 = fVar8.f10343m;
                if (Float.isInfinite(f8)) {
                    if (f7 > 70000.0f) {
                        f7 = 70000.0f;
                    }
                    f8 = 100000.0f;
                }
                if (Float.isInfinite(fVar8.f10344n)) {
                    f3 = f8 + 100000.0f;
                    if (f7 < -70000.0f) {
                        f7 = -70000.0f;
                    }
                    f6 = f7 + 100000.0f;
                } else {
                    float f9 = fVar8.f10344n;
                    f3 = f8 - f9;
                    f6 = f7 - f9;
                }
                if (f.C(fVar8, d.SCROLL_UP) || f.C(fVar8, d.SCROLL_DOWN)) {
                    d8.setScrollY((int) f6);
                    d8.setMaxScrollY((int) f3);
                } else if (f.C(fVar8, d.SCROLL_LEFT) || f.C(fVar8, d.SCROLL_RIGHT)) {
                    d8.setScrollX((int) f6);
                    d8.setMaxScrollX((int) f3);
                }
                int i20 = fVar8.f10340j;
                if (i20 > 0) {
                    d8.setItemCount(i20);
                    d8.setFromIndex(fVar8.f10341k);
                    Iterator it5 = fVar8.f10322X.iterator();
                    int i21 = i19;
                    while (it5.hasNext()) {
                        if (!((f) it5.next()).I(14)) {
                            i21++;
                        }
                    }
                    d8.setToIndex((fVar8.f10341k + i21) - 1);
                }
                gVar2.h(d8);
            }
            if (fVar8.I(i2) && (((str = fVar8.f10346p) != null || fVar8.f10313O != null) && (str == null || !str.equals(fVar8.f10313O)))) {
                AccessibilityEvent d9 = gVar2.d(fVar8.f10327b, i18);
                d9.setContentChangeTypes(1);
                gVar2.h(d9);
            }
            if (Build.VERSION.SDK_INT >= 36 && fVar8.f10307H) {
                if (fVar8.I(2) != fVar8.H(2) || fVar8.I(26) != fVar8.H(26) || fVar8.I(18) != fVar8.H(18)) {
                    AccessibilityEvent d10 = gVar2.d(fVar8.f10327b, i18);
                    d10.setContentChangeTypes(8192);
                    gVar2.h(d10);
                }
            }
            f fVar9 = gVar2.f10365i;
            if (fVar9 != null && fVar9.f10327b == fVar8.f10327b && !fVar8.H(3) && fVar8.I(3)) {
                AccessibilityEvent d11 = gVar2.d(fVar8.f10327b, 4);
                d11.getText().add(fVar8.f10346p);
                gVar2.h(d11);
            }
            f fVar10 = gVar2.f10369m;
            if (fVar10 != null && (i3 = fVar10.f10327b) == (i6 = fVar8.f10327b) && ((fVar2 = gVar2.f10370n) == null || fVar2.f10327b != i3)) {
                gVar2.f10370n = fVar10;
                gVar2.h(gVar2.d(i6, 8));
            } else if (fVar10 == null) {
                gVar2.f10370n = null;
            }
            f fVar11 = gVar2.f10369m;
            if (fVar11 != null && fVar11.f10327b == fVar8.f10327b && fVar8.H(5) && fVar8.I(5) && ((fVar = gVar2.f10365i) == null || fVar.f10327b == gVar2.f10369m.f10327b)) {
                String str2 = fVar8.N;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = fVar8.f10348r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d12 = gVar2.d(fVar8.f10327b, i2);
                d12.setBeforeText(str2);
                d12.getText().add(str4);
                int i22 = i19;
                while (i22 < str2.length() && i22 < str4.length() && str2.charAt(i22) == str4.charAt(i22)) {
                    i22++;
                }
                if (i22 < str2.length() || i22 < str4.length()) {
                    d12.setFromIndex(i22);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i22 && length2 >= i22 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d12.setRemovedCount((length - i22) + 1);
                    d12.setAddedCount((length2 - i22) + 1);
                } else {
                    d12 = null;
                }
                if (d12 != null) {
                    gVar2.h(d12);
                }
                if (fVar8.f10310K != fVar8.f10337g || fVar8.f10311L != fVar8.f10338h) {
                    AccessibilityEvent d13 = gVar2.d(fVar8.f10327b, 8192);
                    d13.getText().add(str4);
                    d13.setFromIndex(fVar8.f10337g);
                    d13.setToIndex(fVar8.f10338h);
                    d13.setItemCount(str4.length());
                    gVar2.h(d13);
                }
            }
            i18 = 2048;
            i19 = 0;
            i2 = 16;
        }
    }
}
