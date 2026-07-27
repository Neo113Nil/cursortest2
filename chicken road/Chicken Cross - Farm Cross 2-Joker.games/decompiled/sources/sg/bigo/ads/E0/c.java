package sg.bigo.ads.E0;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class c {
    public static final a f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f12265a;
    public final int[] b;
    public final ArrayList c;
    public final q[] d;
    public final float[] e = new float[3];

    public c(int[] iArr, int i, q[] qVarArr) {
        s sVar;
        b bVar;
        int i2;
        this.d = qVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int a2 = a(Color.blue(i4), 8, 5) | (a(Color.red(i4), 8, 5) << 10) | (a(Color.green(i4), 8, 5) << 5);
            iArr[i3] = a2;
            iArr2[a2] = iArr2[a2] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                int rgb = Color.rgb(a((i6 >> 10) & 31, 5, 8), a((i6 >> 5) & 31, 5, 8), a(i6 & 31, 5, 8));
                p.a(Color.red(rgb), Color.green(rgb), Color.blue(rgb), this.e);
                if (a(this.e)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.f12265a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 <= i) {
            this.c = new ArrayList();
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = iArr3[i9];
                this.c.add(new s(Color.rgb(a((i10 >> 10) & 31, 5, 8), a((i10 >> 5) & 31, 5, 8), a(i10 & 31, 5, 8)), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f);
        priorityQueue.offer(new b(this, 0, this.f12265a.length - 1));
        while (priorityQueue.size() < i && (bVar = (b) priorityQueue.poll()) != null) {
            int i11 = bVar.b;
            int i12 = bVar.f12264a;
            int i13 = (i11 + 1) - i12;
            if (i13 <= 1) {
                break;
            }
            if (i13 <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i14 = bVar.e - bVar.d;
            int i15 = bVar.g - bVar.f;
            int i16 = bVar.i - bVar.h;
            int i17 = (i14 < i15 || i14 < i16) ? (i15 < i14 || i15 < i16) ? -1 : -2 : -3;
            c cVar = bVar.j;
            int[] iArr4 = cVar.f12265a;
            int[] iArr5 = cVar.b;
            a(iArr4, i17, i12, i11);
            Arrays.sort(iArr4, bVar.f12264a, bVar.b + 1);
            a(iArr4, i17, bVar.f12264a, bVar.b);
            int i18 = bVar.c / 2;
            int i19 = bVar.f12264a;
            int i20 = 0;
            while (true) {
                int i21 = bVar.b;
                if (i19 > i21) {
                    i2 = bVar.f12264a;
                    break;
                }
                i20 += iArr5[iArr4[i19]];
                if (i20 >= i18) {
                    i2 = Math.min(i21 - 1, i19);
                    break;
                }
                i19++;
            }
            b bVar2 = new b(bVar.j, i2 + 1, bVar.b);
            bVar.b = i2;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            c cVar2 = bVar3.j;
            int[] iArr6 = cVar2.f12265a;
            int[] iArr7 = cVar2.b;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = bVar3.f12264a; i26 <= bVar3.b; i26++) {
                int i27 = iArr6[i26];
                int i28 = iArr7[i27];
                i22 += i28;
                i23 = (((i27 >> 10) & 31) * i28) + i23;
                i24 = (((i27 >> 5) & 31) * i28) + i24;
                i25 = (i28 * (i27 & 31)) + i25;
            }
            if (i22 != 0) {
                float f2 = i22;
                sVar = new s(Color.rgb(a(Math.round(i23 / f2), 5, 8), a(Math.round(i24 / f2), 5, 8), a(Math.round(i25 / f2), 5, 8)), i22);
            } else {
                sVar = new s(Color.rgb(a(0, 5, 8), a(0, 5, 8), a(0, 5, 8)), i22);
            }
            if (sVar.f == null) {
                sVar.f = new float[3];
            }
            p.a(sVar.f12274a, sVar.b, sVar.c, sVar.f);
            if (!a(sVar.f)) {
                arrayList.add(sVar);
            }
        }
        this.c = arrayList;
    }

    public static int a(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static void a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public final boolean a(float[] fArr) {
        q[] qVarArr = this.d;
        if (qVarArr != null && qVarArr.length > 0) {
            int length = qVarArr.length;
            for (int i = 0; i < length; i++) {
                this.d[i].getClass();
                float f2 = fArr[2];
                if (f2 < 0.95f && f2 > 0.05f) {
                    float f3 = fArr[1];
                    if ((f3 > 0.1f || f2 < 0.55f) && ((f3 > 0.5f || f2 < 0.75f) && (f3 > 0.2f || f2 < 0.7f))) {
                        float f4 = fArr[0];
                        if (f4 < 10.0f || f4 > 37.0f || f3 > 0.82f) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
