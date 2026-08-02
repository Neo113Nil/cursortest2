package Ra;

import S5.k;
import T5.i;
import T5.l;
import V5.v;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import p6.C8861a;

/* loaded from: classes.dex */
public final class h implements l {
    public static final long c(float f7, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final long d(float f7, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final String e(String str, Map map) {
        String V11;
        List list = (List) map.get(str);
        if (list != null && (V11 = C7714v.V(list, null, null, null, null, 63)) != null) {
            return V11;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        List list2 = (List) map.get(lowerCase);
        if (list2 != null) {
            return C7714v.V(list2, null, null, null, null, 63);
        }
        return null;
    }

    @Override // T5.d
    public boolean a(Object obj, File file, i iVar) {
        try {
            C8861a.e(((k) ((v) obj).get()).b(), file);
            return true;
        } catch (IOException e11) {
            if (!Log.isLoggable("WebpEncoder", 5)) {
                return false;
            }
            Log.w("WebpEncoder", "Failed to encode WebP drawable data", e11);
            return false;
        }
    }

    @Override // T5.l
    public T5.c b(i iVar) {
        return T5.c.SOURCE;
    }
}
