package N9;

import android.graphics.Bitmap;
import h9.EnumC6876a;
import h9.v;
import java.util.Map;
import o9.C8660b;

/* loaded from: classes9.dex */
public final class b {
    public static Bitmap a(String str, EnumC6876a enumC6876a, int i11, int i12, Map map) throws v {
        try {
            C8660b a11 = new h9.l().a(str, enumC6876a, i11, i12, map);
            int j11 = a11.j();
            int g10 = a11.g();
            int[] iArr = new int[j11 * g10];
            for (int i13 = 0; i13 < g10; i13++) {
                int i14 = i13 * j11;
                for (int i15 = 0; i15 < j11; i15++) {
                    iArr[i14 + i15] = a11.d(i15, i13) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(j11, g10, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, j11, 0, 0, j11, g10);
            return createBitmap;
        } catch (v e11) {
            throw e11;
        } catch (Exception e12) {
            throw new v(e12);
        }
    }
}
