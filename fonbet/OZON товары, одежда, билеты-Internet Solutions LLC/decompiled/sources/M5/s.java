package M5;

import N5.c;
import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f17441a = c.a.a("x", "y");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17442a;

        static {
            int[] iArr = new int[c.b.values().length];
            f17442a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17442a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17442a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static int a(N5.c cVar) throws IOException {
        cVar.beginArray();
        int nextDouble = (int) (cVar.nextDouble() * 255.0d);
        int nextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int nextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    static PointF b(N5.c cVar, float f7) throws IOException {
        int i11 = a.f17442a[cVar.m().ordinal()];
        if (i11 == 1) {
            float nextDouble = (float) cVar.nextDouble();
            float nextDouble2 = (float) cVar.nextDouble();
            while (cVar.hasNext()) {
                cVar.skipValue();
            }
            return new PointF(nextDouble * f7, nextDouble2 * f7);
        }
        if (i11 == 2) {
            cVar.beginArray();
            float nextDouble3 = (float) cVar.nextDouble();
            float nextDouble4 = (float) cVar.nextDouble();
            while (cVar.m() != c.b.END_ARRAY) {
                cVar.skipValue();
            }
            cVar.endArray();
            return new PointF(nextDouble3 * f7, nextDouble4 * f7);
        }
        if (i11 != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + cVar.m());
        }
        cVar.beginObject();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17441a);
            if (p11 == 0) {
                f11 = d(cVar);
            } else if (p11 != 1) {
                cVar.q();
                cVar.skipValue();
            } else {
                f12 = d(cVar);
            }
        }
        cVar.endObject();
        return new PointF(f11 * f7, f12 * f7);
    }

    static ArrayList c(N5.c cVar, float f7) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.beginArray();
        while (cVar.m() == c.b.BEGIN_ARRAY) {
            cVar.beginArray();
            arrayList.add(b(cVar, f7));
            cVar.endArray();
        }
        cVar.endArray();
        return arrayList;
    }

    static float d(N5.c cVar) throws IOException {
        c.b m11 = cVar.m();
        int i11 = a.f17442a[m11.ordinal()];
        if (i11 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i11 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + m11);
        }
        cVar.beginArray();
        float nextDouble = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endArray();
        return nextDouble;
    }
}
