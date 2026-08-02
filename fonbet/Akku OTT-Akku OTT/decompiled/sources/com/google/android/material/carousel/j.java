package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.material.carousel.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class j {
    public final i a;
    public final List<i> b;
    public final List<i> c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public j(@NonNull i iVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = iVar;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        float f = ((i) androidx.constraintlayout.motion.widget.a.a(1, arrayList)).b().a - iVar.b().a;
        this.f = f;
        float f2 = iVar.d().a - ((i) androidx.constraintlayout.motion.widget.a.a(1, arrayList2)).d().a;
        this.g = f2;
        this.d = d(f, arrayList, true);
        this.e = d(f2, arrayList2, false);
    }

    public static float[] d(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            i iVar = (i) arrayList.get(i2);
            i iVar2 = (i) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? iVar2.b().a - iVar.b().a : iVar.d().a - iVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static i e(i iVar, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(iVar.b);
        arrayList.add(i2, (i.b) arrayList.remove(i));
        i.a aVar = new i.a(iVar.a, f2);
        float f3 = f;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            i.b bVar = (i.b) arrayList.get(i5);
            float f4 = bVar.d;
            aVar.b((f4 / 2.0f) + f3, bVar.c, f4, i5 >= i3 && i5 <= i4, bVar.e, bVar.f, 0.0f, 0.0f);
            f3 += bVar.d;
            i5++;
        }
        return aVar.d();
    }

    public static i f(i iVar, float f, float f2, boolean z, float f3) {
        int i;
        List<i.b> list = iVar.b;
        ArrayList arrayList = new ArrayList(list);
        float f4 = iVar.a;
        i.a aVar = new i.a(f4, f2);
        Iterator<i.b> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().e) {
                i2++;
            }
        }
        float size = f / (list.size() - i2);
        float f5 = z ? f : 0.0f;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            i.b bVar = (i.b) arrayList.get(i3);
            if (bVar.e) {
                i = i3;
                aVar.b(bVar.b, bVar.c, bVar.d, false, true, bVar.f, 0.0f, 0.0f);
            } else {
                i = i3;
                boolean z2 = i >= iVar.c && i <= iVar.d;
                float f6 = bVar.d - size;
                float a = g.a(f6, f4, f3);
                float f7 = (f6 / 2.0f) + f5;
                float f8 = f7 - bVar.b;
                float f9 = bVar.f;
                float f10 = f8;
                if (!z) {
                    f8 = 0.0f;
                }
                if (z) {
                    f10 = 0.0f;
                }
                aVar.b(f7, a, f6, z2, false, f9, f8, f10);
                f5 += f6;
            }
            i3 = i + 1;
        }
        return aVar.d();
    }

    public final i a() {
        return (i) androidx.appcompat.view.menu.a.a(1, this.c);
    }

    public final i b(float f, float f2, float f3) {
        float b;
        List<i> list;
        float[] fArr;
        float[] fArr2;
        float f4 = this.f;
        float f5 = f2 + f4;
        float f6 = this.g;
        float f7 = f3 - f6;
        float f8 = c().a().g;
        float f9 = a().c().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            b = com.google.android.material.animation.a.b(1.0f, 0.0f, f2, f5, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f7) {
                return this.a;
            }
            b = com.google.android.material.animation.a.b(0.0f, 1.0f, f7, f3, f);
            list = this.c;
            fArr = this.e;
        }
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (true) {
            if (i >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f11 = fArr[i];
            if (b <= f11) {
                fArr2 = new float[]{com.google.android.material.animation.a.b(0.0f, 1.0f, f10, f11, b), i - 1, i};
                break;
            }
            i++;
            f10 = f11;
        }
        i iVar = list.get((int) fArr2[1]);
        i iVar2 = list.get((int) fArr2[2]);
        float f12 = fArr2[0];
        float f13 = iVar.a;
        List<i.b> list2 = iVar.b;
        if (f13 != iVar2.a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<i.b> list3 = iVar2.b;
        if (list2.size() != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            i.b bVar = list2.get(i2);
            i.b bVar2 = list3.get(i2);
            arrayList.add(new i.b(com.google.android.material.animation.a.a(bVar.a, bVar2.a, f12), com.google.android.material.animation.a.a(bVar.b, bVar2.b, f12), com.google.android.material.animation.a.a(bVar.c, bVar2.c, f12), com.google.android.material.animation.a.a(bVar.d, bVar2.d, f12), false, 0.0f, 0.0f, 0.0f));
        }
        return new i(iVar.a, arrayList, com.google.android.material.animation.a.c(iVar.c, iVar2.c, f12), com.google.android.material.animation.a.c(iVar.d, iVar2.d, f12));
    }

    public final i c() {
        return (i) androidx.appcompat.view.menu.a.a(1, this.b);
    }
}
