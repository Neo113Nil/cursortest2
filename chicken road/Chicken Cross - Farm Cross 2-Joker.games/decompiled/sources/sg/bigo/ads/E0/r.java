package sg.bigo.ads.E0;

import android.graphics.Bitmap;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f12273a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;

    public r(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = 16;
        this.d = 12544;
        this.e = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(t.f);
        this.f12273a = bitmap;
        arrayList.add(u.d);
    }

    public final t a() {
        int max;
        int i;
        double d;
        q[] qVarArr;
        int i2;
        boolean z;
        float f;
        Bitmap bitmap = this.f12273a;
        if (bitmap == null) {
            throw new AssertionError();
        }
        if (this.d > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            int i3 = this.d;
            if (height > i3) {
                d = Math.sqrt(i3 / height);
            }
            d = -1.0d;
        } else {
            if (this.e > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.e)) {
                d = i / max;
            }
            d = -1.0d;
        }
        int i4 = 0;
        if (d > 0.0d) {
            try {
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
            } catch (Throwable th) {
                AbstractC5496a.a("BitmapUtils", Log.getStackTraceString(th));
                bitmap = null;
            }
        }
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        int i5 = this.c;
        if (this.f.isEmpty()) {
            qVarArr = null;
        } else {
            ArrayList arrayList = this.f;
            qVarArr = (q[]) arrayList.toArray(new q[arrayList.size()]);
        }
        c cVar = new c(iArr, i5, qVarArr);
        if (bitmap != this.f12273a) {
            bitmap.recycle();
        }
        ArrayList arrayList2 = cVar.c;
        ArrayList arrayList3 = this.b;
        t tVar = new t(arrayList2, arrayList3);
        int size = arrayList3.size();
        int i6 = 0;
        while (i6 < size) {
            u uVar = (u) tVar.b.get(i6);
            int length = uVar.c.length;
            float f2 = 0.0f;
            for (int i7 = i4; i7 < length; i7++) {
                float f3 = uVar.c[i7];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                int length2 = uVar.c.length;
                for (int i8 = i4; i8 < length2; i8++) {
                    float[] fArr = uVar.c;
                    float f4 = fArr[i8];
                    if (f4 > 0.0f) {
                        fArr[i8] = f4 / f2;
                    }
                }
            }
            Map map = tVar.c;
            int size2 = tVar.f12275a.size();
            int i9 = i4;
            float f5 = 0.0f;
            s sVar = null;
            while (i9 < size2) {
                s sVar2 = (s) tVar.f12275a.get(i9);
                if (sVar2.f == null) {
                    sVar2.f = new float[3];
                }
                p.a(sVar2.f12274a, sVar2.b, sVar2.c, sVar2.f);
                float[] fArr2 = sVar2.f;
                float f6 = fArr2[1];
                float[] fArr3 = uVar.f12276a;
                if (f6 >= fArr3[0] && f6 <= fArr3[2]) {
                    float f7 = fArr2[2];
                    float[] fArr4 = uVar.b;
                    if (f7 >= fArr4[0] && f7 <= fArr4[2] && !tVar.d.get(sVar2.d)) {
                        if (sVar2.f == null) {
                            sVar2.f = new float[3];
                        }
                        p.a(sVar2.f12274a, sVar2.b, sVar2.c, sVar2.f);
                        float[] fArr5 = sVar2.f;
                        s sVar3 = tVar.e;
                        int i10 = sVar3 != null ? sVar3.e : 1;
                        float f8 = uVar.c[0];
                        float abs = f8 > 0.0f ? f8 * (1.0f - Math.abs(fArr5[1] - uVar.f12276a[1])) : 0.0f;
                        float f9 = uVar.c[1];
                        if (f9 > 0.0f) {
                            i2 = size;
                            f = (1.0f - Math.abs(fArr5[2] - uVar.b[1])) * f9;
                        } else {
                            i2 = size;
                            f = 0.0f;
                        }
                        float f10 = uVar.c[2];
                        z = false;
                        float f11 = abs + f + (f10 > 0.0f ? f10 * (sVar2.e / i10) : 0.0f);
                        if (sVar == null || f11 > f5) {
                            f5 = f11;
                            sVar = sVar2;
                        }
                        i9++;
                        size = i2;
                    }
                }
                i2 = size;
                z = false;
                i9++;
                size = i2;
            }
            int i11 = size;
            if (sVar != null) {
                tVar.d.append(sVar.d, true);
            }
            ((ArrayMap) map).put(uVar, sVar);
            i6++;
            size = i11;
            i4 = 0;
        }
        tVar.d.clear();
        return tVar;
    }
}
