package H6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;

/* loaded from: classes8.dex */
public final class c extends J6.a<I6.a, I6.b> {

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f10662n = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f10663o = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* renamed from: p, reason: collision with root package name */
    private static final ThreadLocal<CRC32> f10664p = new ThreadLocal<>();

    /* renamed from: i, reason: collision with root package name */
    public final byte f10665i;

    /* renamed from: j, reason: collision with root package name */
    public final byte f10666j;

    /* renamed from: k, reason: collision with root package name */
    byte[] f10667k;

    /* renamed from: l, reason: collision with root package name */
    ArrayList f10668l;

    /* renamed from: m, reason: collision with root package name */
    ArrayList f10669m;

    public c(I6.a aVar, f fVar) {
        super(aVar);
        this.f10668l = new ArrayList();
        this.f10669m = new ArrayList();
        this.f10665i = fVar.f10680j;
        this.f10666j = fVar.f10679i;
        int i11 = fVar.f10677g * 1000;
        short s11 = fVar.f10678h;
        int i12 = i11 / (s11 == 0 ? (short) 100 : s11);
        this.f14125f = i12;
        if (i12 < 10) {
            this.f14125f = 100;
        }
        this.f14121b = fVar.f10673c;
        this.f14122c = fVar.f10674d;
        this.f14123d = fVar.f10675e;
        this.f14124e = fVar.f10676f;
    }

    private int b(I6.b bVar) throws IOException {
        R r11;
        int i11;
        Iterator it = this.f10669m.iterator();
        int i12 = 33;
        while (it.hasNext()) {
            i12 += ((e) it.next()).f10670a + 12;
        }
        ArrayList arrayList = this.f10668l;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            if (eVar instanceof h) {
                i11 = eVar.f10670a + 12;
            } else if (eVar instanceof g) {
                i11 = eVar.f10670a + 8;
            }
            i12 = i11 + i12;
        }
        int i13 = i12 + 12;
        bVar.d(i13);
        bVar.c(f10662n);
        bVar.h(13);
        int a11 = bVar.a();
        bVar.g(j.f10684f);
        bVar.h(this.f14121b);
        bVar.h(this.f14122c);
        bVar.c(this.f10667k);
        ThreadLocal<CRC32> threadLocal = f10664p;
        CRC32 crc32 = threadLocal.get();
        if (crc32 == null) {
            crc32 = new CRC32();
            threadLocal.set(crc32);
        }
        crc32.reset();
        crc32.update(bVar.f(), a11, 17);
        bVar.h((int) crc32.getValue());
        Iterator it3 = this.f10669m.iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            r11 = this.f14120a;
            if (!hasNext) {
                break;
            }
            e eVar2 = (e) it3.next();
            if (!(eVar2 instanceof i)) {
                I6.a aVar = (I6.a) r11;
                aVar.reset();
                aVar.skip(eVar2.f10671b);
                aVar.read(bVar.f(), bVar.a(), eVar2.f10670a + 12);
                bVar.e(eVar2.f10670a + 12);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            e eVar3 = (e) it4.next();
            if (eVar3 instanceof h) {
                I6.a aVar2 = (I6.a) r11;
                aVar2.reset();
                aVar2.skip(eVar3.f10671b);
                aVar2.read(bVar.f(), bVar.a(), eVar3.f10670a + 12);
                bVar.e(eVar3.f10670a + 12);
            } else if (eVar3 instanceof g) {
                bVar.h(eVar3.f10670a - 4);
                int a12 = bVar.a();
                bVar.g(h.f10682c);
                I6.a aVar3 = (I6.a) r11;
                aVar3.reset();
                aVar3.skip(eVar3.f10671b + 12);
                aVar3.read(bVar.f(), bVar.a(), eVar3.f10670a - 4);
                bVar.e(eVar3.f10670a - 4);
                crc32.reset();
                crc32.update(bVar.f(), a12, eVar3.f10670a);
                bVar.h((int) crc32.getValue());
            }
        }
        bVar.c(f10663o);
        return i13;
    }

    @Override // J6.a
    public final Bitmap a(Canvas canvas, Paint paint, int i11, Bitmap bitmap, I6.b bVar) {
        Bitmap decodeByteArray;
        Rect rect = this.f14127h;
        Rect rect2 = this.f14126g;
        try {
            int b11 = b(bVar);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i11;
            options.inMutable = true;
            options.inBitmap = bitmap;
            byte[] f7 = bVar.f();
            try {
                decodeByteArray = BitmapFactory.decodeByteArray(f7, 0, b11, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i11;
                options2.inMutable = true;
                decodeByteArray = BitmapFactory.decodeByteArray(f7, 0, b11, options2);
            }
            rect2.left = 0;
            rect2.top = 0;
            rect2.right = decodeByteArray.getWidth();
            rect2.bottom = decodeByteArray.getHeight();
            float f11 = i11;
            float f12 = this.f14123d / f11;
            rect.left = (int) f12;
            rect.top = (int) (this.f14124e / f11);
            rect.right = (int) (f12 + decodeByteArray.getWidth());
            rect.bottom = (int) ((this.f14124e / f11) + decodeByteArray.getHeight());
            canvas.drawBitmap(decodeByteArray, rect2, rect, paint);
            return decodeByteArray;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
