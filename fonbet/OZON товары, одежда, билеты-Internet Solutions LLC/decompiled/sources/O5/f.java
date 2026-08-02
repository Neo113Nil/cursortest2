package O5;

import D5.k;
import Hj.C3143a;
import J5.o;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f19984a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19985b = 0;

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f7, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f7));
    }

    static int c(float f7, float f11) {
        int i11 = (int) f7;
        int i12 = (int) f11;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (!((i11 ^ i12) >= 0) && i14 != 0) {
            i13--;
        }
        return i11 - (i12 * i13);
    }

    public static void d(o oVar, Path path) {
        Path path2;
        path.reset();
        PointF b11 = oVar.b();
        path.moveTo(b11.x, b11.y);
        PointF pointF = f19984a;
        pointF.set(b11.x, b11.y);
        int i11 = 0;
        while (i11 < ((ArrayList) oVar.a()).size()) {
            H5.a aVar = (H5.a) ((ArrayList) oVar.a()).get(i11);
            PointF a11 = aVar.a();
            PointF b12 = aVar.b();
            PointF c11 = aVar.c();
            if (a11.equals(pointF) && b12.equals(c11)) {
                path.lineTo(c11.x, c11.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(a11.x, a11.y, b12.x, b12.y, c11.x, c11.y);
            }
            pointF.set(c11.x, c11.y);
            i11++;
            path = path2;
        }
        Path path3 = path;
        if (oVar.d()) {
            path3.close();
        }
    }

    public static float e(float f7, float f11, float f12) {
        return C3143a.d(f11, f7, f12, f7);
    }

    public static void f(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2, k kVar) {
        if (eVar.b(i11, kVar.getName())) {
            arrayList.add(eVar2.a(kVar.getName()).g(kVar));
        }
    }
}
