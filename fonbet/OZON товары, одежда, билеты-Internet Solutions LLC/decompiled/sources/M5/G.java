package M5;

import N5.c;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class G implements M<J5.o> {

    /* renamed from: a, reason: collision with root package name */
    public static final G f17398a = new G();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f17399b = c.a.a("c", "v", "i", "o");

    @Override // M5.M
    public final J5.o a(N5.c cVar, float f7) throws IOException {
        if (cVar.m() == c.b.BEGIN_ARRAY) {
            cVar.beginArray();
        }
        cVar.beginObject();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            int p11 = cVar.p(f17399b);
            if (p11 == 0) {
                z11 = cVar.j();
            } else if (p11 == 1) {
                arrayList = s.c(cVar, f7);
            } else if (p11 == 2) {
                arrayList2 = s.c(cVar, f7);
            } else if (p11 != 3) {
                cVar.q();
                cVar.skipValue();
            } else {
                arrayList3 = s.c(cVar, f7);
            }
        }
        cVar.endObject();
        if (cVar.m() == c.b.END_ARRAY) {
            cVar.endArray();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new J5.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i11 = 1; i11 < size; i11++) {
            PointF pointF2 = (PointF) arrayList.get(i11);
            int i12 = i11 - 1;
            arrayList4.add(new H5.a(O5.f.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), O5.f.a(pointF2, (PointF) arrayList2.get(i11)), pointF2));
        }
        if (z11) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i13 = size - 1;
            arrayList4.add(new H5.a(O5.f.a((PointF) arrayList.get(i13), (PointF) arrayList3.get(i13)), O5.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new J5.o(pointF, z11, arrayList4);
    }
}
